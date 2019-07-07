package se.website.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * Created 2019-07-07 by patrikingverud
 */
@ApiModel
@RequiredArgsConstructor
@Getter
public class Product {

    @ApiModelProperty(value = "The product ID")
    private final int id;
    @ApiModelProperty(value = "The product description")
    private final String description;

}
