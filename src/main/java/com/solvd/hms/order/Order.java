package com.solvd.hms.order;

import com.solvd.hms.base.Address;
import com.solvd.hms.resources.Equipment;
import com.solvd.hms.resources.Worker;
import com.solvd.hms.service.Service;
import com.solvd.hms.service.Service.Type;

import java.util.Objects;
import java.util.List;

public class Order<E extends Equipment> {

    private Integer id;
    private Type serviceName;
    private Address address;
    private Service service;
    private Worker worker;

    private List<E> equipments;

    public Order(Integer id, Type serviceName, Address address) {
        this.id = id;
        this.serviceName = serviceName;
        this.address = address;
        List<E> equipments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Type getServiceName() {
        return serviceName;
    }

    public void setServiceName(Type serviceName) {
        this.serviceName = serviceName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getStreet() {
        return address.getStreet();
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public List<E> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<E> equipments) {
        this.equipments = equipments;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", serviceName='" + serviceName + '\'' + ", address=" + address + ", service=" + service + ", worker=" + worker + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order<?> order = (Order<?>) o;
        return Objects.equals(getId(), order.getId()) && getServiceName() == order.getServiceName() && Objects.equals(getAddress(), order.getAddress()) && Objects.equals(getService(), order.getService()) && Objects.equals(getWorker(), order.getWorker()) && Objects.equals(getEquipments(), order.getEquipments());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getServiceName(), getAddress(), getService(), getWorker(), getEquipments());
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Order)) return false;
//        Order<?> order = (Order<?>) o;
//        return Objects.equals(getId(), order.getId());
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
}