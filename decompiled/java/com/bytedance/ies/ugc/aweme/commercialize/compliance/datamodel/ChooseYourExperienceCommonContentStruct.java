package com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.ChooseYourExperienceCommonContentStruct;

/* JADX INFO: loaded from: classes13.dex */
public final class ChooseYourExperienceCommonContentStruct implements Parcelable {
    public static final Parcelable.Creator<ChooseYourExperienceCommonContentStruct> CREATOR = new Parcelable.Creator<ChooseYourExperienceCommonContentStruct>() { // from class: X.0TPR
        @Override // android.os.Parcelable.Creator
        public final ChooseYourExperienceCommonContentStruct createFromParcel(Parcel parcel) {
            return new ChooseYourExperienceCommonContentStruct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChooseYourExperienceCommonContentStruct[] newArray(int i) {
            return new ChooseYourExperienceCommonContentStruct[i];
        }
    };

    @C09CT("button_text")
    public final String button_text;

    @C09CT("desc")
    public final String desc;

    @C09CT("link")
    public final String link;

    @C09CT("link_text")
    public final String link_text;

    @C09CT("sub_title")
    public final String sub_title;

    @C09CT("title")
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.sub_title);
        parcel.writeString(this.desc);
        parcel.writeString(this.link_text);
        parcel.writeString(this.link);
        parcel.writeString(this.button_text);
    }

    public ChooseYourExperienceCommonContentStruct(String str, String str2, String str3, String str4, String str5, String str6) {
        this.title = str;
        this.sub_title = str2;
        this.desc = str3;
        this.link_text = str4;
        this.link = str5;
        this.button_text = str6;
    }
}
