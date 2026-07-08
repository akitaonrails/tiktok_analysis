package com.ss.android.ugc.aweme.ecommerce.service;

import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class HostAddressSnapshot {
    public final String city;
    public final String countryCode;
    public final String deliveryInstructions;
    public final String email;
    public final String extendedAddress;
    public final String firstName;
    public final String id;
    public final boolean isDefault;
    public final boolean isReachable;
    public final boolean isSelected;
    public final String lastName;
    public final String phoneCountryCallingCode;
    public final String phoneNumber;
    public final String state;
    public final String streetAddress;
    public final String zipCode;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAddressSnapshot)) {
            return false;
        }
        HostAddressSnapshot hostAddressSnapshot = (HostAddressSnapshot) obj;
        return Intrinsics.LJFF(this.id, hostAddressSnapshot.id) && Intrinsics.LJFF(this.firstName, hostAddressSnapshot.firstName) && Intrinsics.LJFF(this.lastName, hostAddressSnapshot.lastName) && Intrinsics.LJFF(this.streetAddress, hostAddressSnapshot.streetAddress) && Intrinsics.LJFF(this.extendedAddress, hostAddressSnapshot.extendedAddress) && Intrinsics.LJFF(this.city, hostAddressSnapshot.city) && Intrinsics.LJFF(this.state, hostAddressSnapshot.state) && Intrinsics.LJFF(this.zipCode, hostAddressSnapshot.zipCode) && Intrinsics.LJFF(this.countryCode, hostAddressSnapshot.countryCode) && Intrinsics.LJFF(this.phoneCountryCallingCode, hostAddressSnapshot.phoneCountryCallingCode) && Intrinsics.LJFF(this.phoneNumber, hostAddressSnapshot.phoneNumber) && Intrinsics.LJFF(this.email, hostAddressSnapshot.email) && this.isDefault == hostAddressSnapshot.isDefault && Intrinsics.LJFF(this.deliveryInstructions, hostAddressSnapshot.deliveryInstructions) && this.isReachable == hostAddressSnapshot.isReachable && this.isSelected == hostAddressSnapshot.isSelected;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((this.id.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.streetAddress.hashCode()) * 31) + this.extendedAddress.hashCode()) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zipCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.phoneCountryCallingCode.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.email.hashCode()) * 31) + C786410Ut5.Z2(this.isDefault)) * 31;
        String str = this.deliveryInstructions;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.isReachable)) * 31) + C786410Ut5.Z2(this.isSelected);
    }

    public String toString() {
        return "HostAddressSnapshot(id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", streetAddress=" + this.streetAddress + ", extendedAddress=" + this.extendedAddress + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", countryCode=" + this.countryCode + ", phoneCountryCallingCode=" + this.phoneCountryCallingCode + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ", isDefault=" + this.isDefault + ", deliveryInstructions=" + this.deliveryInstructions + ", isReachable=" + this.isReachable + ", isSelected=" + this.isSelected + ')';
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final boolean isReachable() {
        return this.isReachable;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public HostAddressSnapshot(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, boolean z2, boolean z3) {
        this.id = str;
        this.firstName = str2;
        this.lastName = str3;
        this.streetAddress = str4;
        this.extendedAddress = str5;
        this.city = str6;
        this.state = str7;
        this.zipCode = str8;
        this.countryCode = str9;
        this.phoneCountryCallingCode = str10;
        this.phoneNumber = str11;
        this.email = str12;
        this.isDefault = z;
        this.deliveryInstructions = str13;
        this.isReachable = z2;
        this.isSelected = z3;
    }
}
