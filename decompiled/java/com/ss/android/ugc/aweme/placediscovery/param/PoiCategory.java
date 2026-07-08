package com.ss.android.ugc.aweme.placediscovery.param;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCategory implements InterfaceC1891350zJl, Serializable {

    @C09CT("tab_code")
    public final String tabCode;

    @C09CT("tab_color")
    public final String tabColor;

    @C09CT("tab_img")
    public final String tabImg;

    @C09CT("tab_name")
    public final String tabName;

    @C09CT("tab_schema")
    public final String tabSchema;

    public PoiCategory() {
        this(null, null, null, null, null);
    }

    public final PoiCategory copy(String str, String str2, String str3, String str4, String str5) {
        return new PoiCategory(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiCategory)) {
            return false;
        }
        PoiCategory poiCategory = (PoiCategory) obj;
        return Intrinsics.LJFF(this.tabName, poiCategory.tabName) && Intrinsics.LJFF(this.tabImg, poiCategory.tabImg) && Intrinsics.LJFF(this.tabColor, poiCategory.tabColor) && Intrinsics.LJFF(this.tabSchema, poiCategory.tabSchema) && Intrinsics.LJFF(this.tabCode, poiCategory.tabCode);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        String str = this.tabName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tabImg;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tabColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tabSchema;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tabCode;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCategory(tabName=");
        sbLIZ.append(this.tabName);
        sbLIZ.append(", tabImg=");
        sbLIZ.append(this.tabImg);
        sbLIZ.append(", tabColor=");
        sbLIZ.append(this.tabColor);
        sbLIZ.append(", tabSchema=");
        sbLIZ.append(this.tabSchema);
        sbLIZ.append(", tabCode=");
        sbLIZ.append(this.tabCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getTabCode() {
        return this.tabCode;
    }

    public final String getTabColor() {
        return this.tabColor;
    }

    public final String getTabImg() {
        return this.tabImg;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public final String getTabSchema() {
        return this.tabSchema;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public PoiCategory(String str, String str2, String str3, String str4, String str5) {
        this.tabName = str;
        this.tabImg = str2;
        this.tabColor = str3;
        this.tabSchema = str4;
        this.tabCode = str5;
    }
}
