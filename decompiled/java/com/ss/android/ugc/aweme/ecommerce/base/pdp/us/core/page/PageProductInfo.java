package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page;

import X.C09CT;
import X.C2188811AlT;
import X.C855603Vy;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DefaultSelection;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PageProductInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PageProductInfo implements Parcelable {

    @C09CT("default_address_id")
    public final String defaultAddressId;

    @C09CT("default_selection")
    public final DefaultSelection defaultSelection;

    @C09CT("experiment")
    public final Map<String, String> experiment;

    @C09CT("product_id")
    public final String productId;
    public static final C855603Vy Companion = new Object() { // from class: X.03Vy
    };
    public static final Parcelable.Creator<PageProductInfo> CREATOR = new Parcelable.Creator<PageProductInfo>() { // from class: X.03Vx
        @Override // android.os.Parcelable.Creator
        public final PageProductInfo createFromParcel(Parcel parcel) {
            DefaultSelection defaultSelectionCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                defaultSelectionCreateFromParcel = null;
            } else {
                defaultSelectionCreateFromParcel = DefaultSelection.CREATOR.createFromParcel(parcel);
            }
            DefaultSelection defaultSelection = defaultSelectionCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new PageProductInfo(string, string2, defaultSelection, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final PageProductInfo[] newArray(int i) {
            return new PageProductInfo[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageProductInfo)) {
            return false;
        }
        PageProductInfo pageProductInfo = (PageProductInfo) obj;
        return Intrinsics.LJFF(this.productId, pageProductInfo.productId) && Intrinsics.LJFF(this.defaultAddressId, pageProductInfo.defaultAddressId) && Intrinsics.LJFF(this.defaultSelection, pageProductInfo.defaultSelection) && Intrinsics.LJFF(this.experiment, pageProductInfo.experiment);
    }

    public final int hashCode() {
        String str = this.productId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.defaultAddressId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DefaultSelection defaultSelection = this.defaultSelection;
        int iHashCode3 = (iHashCode2 + (defaultSelection == null ? 0 : defaultSelection.hashCode())) * 31;
        Map<String, String> map = this.experiment;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageProductInfo(productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", defaultAddressId=");
        sbLIZ.append(this.defaultAddressId);
        sbLIZ.append(", defaultSelection=");
        sbLIZ.append(this.defaultSelection);
        sbLIZ.append(", experiment=");
        sbLIZ.append(this.experiment);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productId);
        parcel.writeString(this.defaultAddressId);
        DefaultSelection defaultSelection = this.defaultSelection;
        if (defaultSelection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            defaultSelection.writeToParcel(parcel, i);
        }
        Map<String, String> map = this.experiment;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public PageProductInfo(String str, String str2, DefaultSelection defaultSelection, Map<String, String> map) {
        this.productId = str;
        this.defaultAddressId = str2;
        this.defaultSelection = defaultSelection;
        this.experiment = map;
    }
}
