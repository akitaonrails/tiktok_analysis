package com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.CustomizeYourExperienceCommonContentStruct;

/* JADX INFO: loaded from: classes13.dex */
public final class CustomizeYourExperienceCommonContentStruct implements Parcelable {
    public static final Parcelable.Creator<CustomizeYourExperienceCommonContentStruct> CREATOR = new Parcelable.Creator<CustomizeYourExperienceCommonContentStruct>() { // from class: X.0TPV
        @Override // android.os.Parcelable.Creator
        public final CustomizeYourExperienceCommonContentStruct createFromParcel(Parcel parcel) {
            return new CustomizeYourExperienceCommonContentStruct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CustomizeYourExperienceCommonContentStruct[] newArray(int i) {
            return new CustomizeYourExperienceCommonContentStruct[i];
        }
    };

    @C09CT("generic_desc")
    public final String generic_desc;

    @C09CT("generic_title")
    public final String generic_title;

    @C09CT("personalized_desc")
    public final String personalized_desc;

    @C09CT("personalized_link")
    public final String personalized_link;

    @C09CT("personalized_link_text")
    public final String personalized_link_text;

    @C09CT("personalized_off_tiktok_desc")
    public final String personalized_off_tiktok_desc;

    @C09CT("personalized_off_tiktok_title")
    public final String personalized_off_tiktok_title;

    @C09CT("personalized_title")
    public final String personalized_title;

    @C09CT("title")
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.personalized_title);
        parcel.writeString(this.personalized_desc);
        parcel.writeString(this.personalized_link);
        parcel.writeString(this.personalized_link_text);
        parcel.writeString(this.generic_title);
        parcel.writeString(this.generic_desc);
        parcel.writeString(this.personalized_off_tiktok_title);
        parcel.writeString(this.personalized_off_tiktok_desc);
    }

    public CustomizeYourExperienceCommonContentStruct(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.title = str;
        this.personalized_title = str2;
        this.personalized_desc = str3;
        this.personalized_link = str4;
        this.personalized_link_text = str5;
        this.generic_title = str6;
        this.generic_desc = str7;
        this.personalized_off_tiktok_title = str8;
        this.personalized_off_tiktok_desc = str9;
    }
}
