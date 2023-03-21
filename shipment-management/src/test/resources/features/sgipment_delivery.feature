# language: tr
Özellik: Paketleri ve Çantaları Teslim Etmek

  Senaryo taslağı: Görevli paketleri teslim etmek istedi
    Diyelim ki görevlinin elinde belli teslimatlar var

      | state       | barcode | delivery_point        | type      |
      | CREATED     | B0101   | CARGO_CENTER          | BOX       |
      | UNLOADED    | B0102   | DEALERSHIP_CENTER     | CONTAINER |
      | CREATED     | B0201   | DISPENSING_CENTER     | BOX       |
      | CREATED     | B0202   | DISPENSING_CENTER     | CONTAINER |

    Ve görevlinin elinde <beginning_state> durumunda ve <barcode> barkod numarasında paketler olduğu biliniyor

    Eğer ki görevli teslimatları teslim etmek isterse

    O zaman paketlerin durumu <result_state> olur

    Örnekler:

      | beginning_state   | barcode | result_state      |
      | "CREATED"         | "B0101" | "loaded_into_bag" |
      | "UNLOADED"        | "B0102" | "loaded_into_bag" |
      | "CREATED"         | "B0201" | "created"         |
      | "CREATED"         | "B0202" | "created"         |