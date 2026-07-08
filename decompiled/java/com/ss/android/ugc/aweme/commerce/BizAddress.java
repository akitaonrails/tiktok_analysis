package com.ss.android.ugc.aweme.commerce;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class BizAddress implements Serializable {

    @C09CT("formatted_address_text")
    public String formattedAddressText;

    @C09CT("latitude")
    public String latitude;

    @C09CT("longitude")
    public String longitude;

    @C09CT("simplified_address_text")
    public String simplifiedAddressText;

    public final String getFormattedAddressText() {
        return this.formattedAddressText;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getSimplifiedAddressText() {
        return this.simplifiedAddressText;
    }

    public final void setFormattedAddressText(String str) {
        this.formattedAddressText = str;
    }

    public final void setLatitude(String str) {
        this.latitude = str;
    }

    public final void setLongitude(String str) {
        this.longitude = str;
    }

    public final void setSimplifiedAddressText(String str) {
        this.simplifiedAddressText = str;
    }
}
