package lk.ijse.helloShoes.dto;

import lk.ijse.helloShoes.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryDTO {
    private String itemCode;
    private String itemDesc;
    private Object itemPic;
    private String category;
    private int size;
    private double unitPriceBuy;
    private double unitPriceSale;
    private Status status;
}
