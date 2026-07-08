package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CutPriceSKUPanel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CutPriceSKUPanel implements Parcelable {

    @C09CT("background")
    public final Image background;

    @C09CT("button_schema")
    public final String buttonSchema;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("sub_title")
    public final String subtitle;

    @C09CT("title")
    public final String title;

    @C09CT("track_params_key_list")
    public final List<String> trackParamsKeyList;
    public static final Parcelable.Creator<CutPriceSKUPanel> CREATOR = new Parcelable.Creator<CutPriceSKUPanel>() { // from class: X.03za
        @Override // android.os.Parcelable.Creator
        public final CutPriceSKUPanel createFromParcel(Parcel parcel) {
            return new CutPriceSKUPanel(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(CutPriceSKUPanel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final CutPriceSKUPanel[] newArray(int i) {
            return new CutPriceSKUPanel[i];
        }
    };
    public static final int $stable = 8;

    public CutPriceSKUPanel() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutPriceSKUPanel)) {
            return false;
        }
        CutPriceSKUPanel cutPriceSKUPanel = (CutPriceSKUPanel) obj;
        return Intrinsics.LJFF(this.title, cutPriceSKUPanel.title) && Intrinsics.LJFF(this.subtitle, cutPriceSKUPanel.subtitle) && Intrinsics.LJFF(this.background, cutPriceSKUPanel.background) && Intrinsics.LJFF(this.buttonText, cutPriceSKUPanel.buttonText) && Intrinsics.LJFF(this.buttonSchema, cutPriceSKUPanel.buttonSchema) && Intrinsics.LJFF(this.trackParamsKeyList, cutPriceSKUPanel.trackParamsKeyList);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.background;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str3 = this.buttonText;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonSchema;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.trackParamsKeyList;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutPriceSKUPanel(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.subtitle);
        sbLIZ.append(", background=");
        sbLIZ.append(this.background);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(", buttonSchema=");
        sbLIZ.append(this.buttonSchema);
        sbLIZ.append(", trackParamsKeyList=");
        sbLIZ.append(this.trackParamsKeyList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.background, i);
        parcel.writeString(this.buttonText);
        parcel.writeString(this.buttonSchema);
        parcel.writeStringList(this.trackParamsKeyList);
    }

    public CutPriceSKUPanel(String str, String str2, Image image, String str3, String str4, List<String> list) {
        this.title = str;
        this.subtitle = str2;
        this.background = image;
        this.buttonText = str3;
        this.buttonSchema = str4;
        this.trackParamsKeyList = list;
    }
}
