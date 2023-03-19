# language: tr
Özellik: Paketleri ve Çantaları Teslim Etmek

  Senaryo taslağı: Görevli paketleri teslim etmek istedi
    Diyelim ki görevlinin elinde belli teslimatlar var

      | state       | barcode | delivery_point      | type    |
      | CREATED     | B0101   | BRANCH              | BAG     |
      | UNLOADED    | B0102   | DISTRIBUTION_CENTER | PACKAGE |
      | CREATED     | B0201   | TRANSFER_CENTER     | BAG     |
      | CREATED     | B0202   | TRANSFER_CENTER     | PACKAGE |

    Ve görevlinin elinde <beginning_state> durumunda ve <barcode> barkod numarasında paketler olduğu biliniyor

    Eğer ki görevli teslimatları teslim etmek isterse

    O zaman paketlerin durumu <result_state> olur

    Örnekler:

      | beginning_state   | barcode | result_state      |
      | "CREATED"         | "B0101" | "loaded_into_bag" |
      | "UNLOADED"        | "B0102" | "loaded_into_bag" |
      | "CREATED"         | "B0201" | "created"         |
      | "CREATED"         | "B0202" | "created"         |