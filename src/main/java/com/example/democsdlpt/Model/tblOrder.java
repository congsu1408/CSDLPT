package com.example.democsdlpt.Model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tblOrder")
public class tblOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_order")
    private Long id;

    @Column(name = "Order_code")
    private String orderCode;

    @Column(name = "Order_date")
    private Date orderDate;

    @Column(name = "Total_price")
    private Double totalPrice;

    @Column(name = "Id_customer")
    private Long customerId;

    @Column(name = "Id_branch")
    private Long branchId;

    @Column(name = "Id_employee")
    private Long employeeId;

    @Column(name = "rowguid")
    private String rowguid;

    public tblOrder() {
    }

// Getter và Setter

    public tblOrder(Long id, String orderCode, Date orderDate, Double totalPrice, Long customerId, Long branchId, Long employeeId, String rowguid) {
        this.id = id;
        this.orderCode = orderCode;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.customerId = customerId;
        this.branchId = branchId;
        this.employeeId = employeeId;
        this.rowguid = rowguid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }
}