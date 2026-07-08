package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.Description;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class AdFreeTrialPageInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<AdFreeTrialPageInfo> CREATOR = new Parcelable.Creator<AdFreeTrialPageInfo>() { // from class: X.0TOF
        @Override // android.os.Parcelable.Creator
        public final AdFreeTrialPageInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            return new AdFreeTrialPageInfo(string, string2, string3, string4, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), (Description) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final AdFreeTrialPageInfo[] newArray(int i) {
            return new AdFreeTrialPageInfo[i];
        }
    };

    @C09CT("button_desc")
    public final String buttonDesc;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("descriptions")
    public final List<Description> description;

    @C09CT("lower_button_description")
    public final Description lowerButtonDescription;

    @C09CT("lower_button_text")
    public final String lowerButtonText;

    @C09CT("subtitle")
    public final String subtitle;

    @C09CT("title")
    public final String title;

    @C09CT("title_action")
    public final String titleAction;

    @C09CT("title_branding")
    public final String titleBranding;

    public AdFreeTrialPageInfo() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final AdFreeTrialPageInfo copy(String str, String str2, String str3, String str4, List<Description> list, String str5, String str6, String str7, Description description) {
        return new AdFreeTrialPageInfo(str, str2, str3, str4, list, str5, str6, str7, description);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdFreeTrialPageInfo)) {
            return false;
        }
        AdFreeTrialPageInfo adFreeTrialPageInfo = (AdFreeTrialPageInfo) obj;
        return Intrinsics.LJFF(this.title, adFreeTrialPageInfo.title) && Intrinsics.LJFF(this.titleAction, adFreeTrialPageInfo.titleAction) && Intrinsics.LJFF(this.titleBranding, adFreeTrialPageInfo.titleBranding) && Intrinsics.LJFF(this.subtitle, adFreeTrialPageInfo.subtitle) && Intrinsics.LJFF(this.description, adFreeTrialPageInfo.description) && Intrinsics.LJFF(this.buttonDesc, adFreeTrialPageInfo.buttonDesc) && Intrinsics.LJFF(this.buttonText, adFreeTrialPageInfo.buttonText) && Intrinsics.LJFF(this.lowerButtonText, adFreeTrialPageInfo.lowerButtonText) && Intrinsics.LJFF(this.lowerButtonDescription, adFreeTrialPageInfo.lowerButtonDescription);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.titleAction;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.titleBranding;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Description> list = this.description;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.buttonDesc;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.buttonText;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lowerButtonText;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Description description = this.lowerButtonDescription;
        return iHashCode8 + (description != null ? description.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdFreeTrialPageInfo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", titleAction=");
        sbLIZ.append(this.titleAction);
        sbLIZ.append(", titleBranding=");
        sbLIZ.append(this.titleBranding);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.subtitle);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", buttonDesc=");
        sbLIZ.append(this.buttonDesc);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(", lowerButtonText=");
        sbLIZ.append(this.lowerButtonText);
        sbLIZ.append(", lowerButtonDescription=");
        sbLIZ.append(this.lowerButtonDescription);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.titleAction);
        parcel.writeString(this.titleBranding);
        parcel.writeString(this.subtitle);
        List<Description> list = this.description;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Description> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }
        parcel.writeString(this.buttonDesc);
        parcel.writeString(this.buttonText);
        parcel.writeString(this.lowerButtonText);
        parcel.writeSerializable(this.lowerButtonDescription);
    }

    public final String getButtonDesc() {
        return this.buttonDesc;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final List<Description> getDescription() {
        return this.description;
    }

    public final Description getLowerButtonDescription() {
        return this.lowerButtonDescription;
    }

    public final String getLowerButtonText() {
        return this.lowerButtonText;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleAction() {
        return this.titleAction;
    }

    public final String getTitleBranding() {
        return this.titleBranding;
    }

    public AdFreeTrialPageInfo(String str, String str2, String str3, String str4, List<Description> list, String str5, String str6, String str7, Description description) {
        this.title = str;
        this.titleAction = str2;
        this.titleBranding = str3;
        this.subtitle = str4;
        this.description = list;
        this.buttonDesc = str5;
        this.buttonText = str6;
        this.lowerButtonText = str7;
        this.lowerButtonDescription = description;
    }
}
