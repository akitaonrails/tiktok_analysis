package com.ss.android.ugc.aweme.poi.mapmode.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiLandmark implements InterfaceC1891350zJl, Serializable {

    @C09CT("display_text")
    public final String displayText;

    @C09CT("icon")
    public final String iconUrl;

    @C09CT("latitude")
    public final Double latitude;

    @C09CT("longitude")
    public final Double longitude;

    @C09CT("name")
    public final String name;

    @C09CT("poi_id")
    public final String poiId;

    public PoiLandmark() {
        this(null, null, null, null, null, null);
    }

    public final PoiLandmark copy(String str, String str2, String str3, Double d, Double d2, String str4) {
        return new PoiLandmark(str, str2, str3, d, d2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiLandmark)) {
            return false;
        }
        PoiLandmark poiLandmark = (PoiLandmark) obj;
        return Intrinsics.LJFF(this.poiId, poiLandmark.poiId) && Intrinsics.LJFF(this.name, poiLandmark.name) && Intrinsics.LJFF(this.iconUrl, poiLandmark.iconUrl) && Intrinsics.LJFF(this.latitude, poiLandmark.latitude) && Intrinsics.LJFF(this.longitude, poiLandmark.longitude) && Intrinsics.LJFF(this.displayText, poiLandmark.displayText);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        String str = this.poiId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.latitude;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.longitude;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str4 = this.displayText;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiLandmark(poiId=");
        sbLIZ.append(this.poiId);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", latitude=");
        sbLIZ.append(this.latitude);
        sbLIZ.append(", longitude=");
        sbLIZ.append(this.longitude);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPoiId() {
        return this.poiId;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public PoiLandmark(String str, String str2, String str3, Double d, Double d2, String str4) {
        this.poiId = str;
        this.name = str2;
        this.iconUrl = str3;
        this.latitude = d;
        this.longitude = d2;
        this.displayText = str4;
    }
}
