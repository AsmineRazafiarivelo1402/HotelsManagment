package org.hei.hotelmanagment;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class ReservationModel {
    private String customer_name;
    private String customer_phone_number;
    private String customer_mail_adress;
    private int room_number;
    private String room_description;
    private LocalDateTime reservation_date;

    public ReservationModel(String customer_mail_adress, String customer_name, String customer_phone_number, LocalDateTime reservation_date, String room_description, int room_number) {
        this.customer_mail_adress = customer_mail_adress;
        this.customer_name = customer_name;
        this.customer_phone_number = customer_phone_number;
        this.reservation_date = reservation_date;
        this.room_description = room_description;
        this.room_number = room_number;
    }

    public String getCustomer_mail_adress() {
        return customer_mail_adress;
    }

    public void setCustomer_mail_adress(String customer_mail_adress) {
        this.customer_mail_adress = customer_mail_adress;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_phone_number() {
        return customer_phone_number;
    }

    public void setCustomer_phone_number(String customer_phone_number) {
        this.customer_phone_number = customer_phone_number;
    }

    public LocalDateTime getReservation_date() {
        return reservation_date;
    }

    public void setReservation_date(LocalDateTime reservation_date) {
        this.reservation_date = reservation_date;
    }

    public String getRoom_description() {
        return room_description;
    }

    public void setRoom_description(String room_description) {
        this.room_description = room_description;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ReservationModel that)) return false;
        return getRoom_number() == that.getRoom_number() && Objects.equals(getCustomer_name(), that.getCustomer_name()) && Objects.equals(getCustomer_phone_number(), that.getCustomer_phone_number()) && Objects.equals(getCustomer_mail_adress(), that.getCustomer_mail_adress()) && Objects.equals(getRoom_description(), that.getRoom_description()) && Objects.equals(getReservation_date(), that.getReservation_date());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomer_name(), getCustomer_phone_number(), getCustomer_mail_adress(), getRoom_number(), getRoom_description(), getReservation_date());
    }

    @Override
    public String toString() {
        return "ReservationModel{" +
                "customer_mail_adress='" + customer_mail_adress + '\'' +
                ", customer_name='" + customer_name + '\'' +
                ", customer_phone_number='" + customer_phone_number + '\'' +
                ", room_number=" + room_number +
                ", room_description='" + room_description + '\'' +
                ", reservation_date=" + reservation_date +
                '}';
    }
}
