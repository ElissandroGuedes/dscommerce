package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;

public class OrderItemDTO {

    private long productId;
    private String name;
    private Double price;
    private Integer quantity;
    private String imgUrl;
    public OrderItemDTO() {
    }

    public OrderItemDTO(long productId, String name, Double price, Integer quantity, String imgUrl) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.imgUrl = imgUrl;
    }

    public OrderItemDTO(OrderItem entity) {
       productId = entity.getProduct().getId();
       name = entity.getProduct().getName();
       price = entity.getPrice();
       quantity = entity.getQuantity();
       imgUrl = entity.getProduct().getImgUrl();
    }

    public long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Double getSubtotal() {
        return price * quantity;
    }
}
