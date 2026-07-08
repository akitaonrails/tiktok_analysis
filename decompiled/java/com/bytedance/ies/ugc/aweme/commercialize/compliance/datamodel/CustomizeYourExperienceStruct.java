package com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.ChooseYourExperienceCommonContentStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.CustomizeYourExperienceCommonContentStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.CustomizeYourExperienceStruct;

/* JADX INFO: loaded from: classes13.dex */
public final class CustomizeYourExperienceStruct implements Parcelable {
    public static final Parcelable.Creator<CustomizeYourExperienceStruct> CREATOR = new Parcelable.Creator<CustomizeYourExperienceStruct>() { // from class: X.0TPU
        @Override // android.os.Parcelable.Creator
        public final CustomizeYourExperienceStruct createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Parcelable.Creator<CustomizeYourExperienceCommonContentStruct> creator = CustomizeYourExperienceCommonContentStruct.CREATOR;
            return new CustomizeYourExperienceStruct(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel), ChooseYourExperienceCommonContentStruct.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CustomizeYourExperienceStruct[] newArray(int i) {
            return new CustomizeYourExperienceStruct[i];
        }
    };

    @C09CT("ads_experience_data")
    public final CustomizeYourExperienceCommonContentStruct ads_experience_data;

    @C09CT("header_title")
    public final String header_title;

    @C09CT("learn_more_data")
    public final ChooseYourExperienceCommonContentStruct learn_more_data;

    @C09CT("next_button_text")
    public final String next_button_text;

    @C09CT("video_experience_data")
    public final CustomizeYourExperienceCommonContentStruct video_experience_data;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.header_title);
        this.video_experience_data.writeToParcel(parcel, i);
        this.ads_experience_data.writeToParcel(parcel, i);
        this.learn_more_data.writeToParcel(parcel, i);
        parcel.writeString(this.next_button_text);
    }

    public CustomizeYourExperienceStruct(String str, CustomizeYourExperienceCommonContentStruct customizeYourExperienceCommonContentStruct, CustomizeYourExperienceCommonContentStruct customizeYourExperienceCommonContentStruct2, ChooseYourExperienceCommonContentStruct chooseYourExperienceCommonContentStruct, String str2) {
        this.header_title = str;
        this.video_experience_data = customizeYourExperienceCommonContentStruct;
        this.ads_experience_data = customizeYourExperienceCommonContentStruct2;
        this.learn_more_data = chooseYourExperienceCommonContentStruct;
        this.next_button_text = str2;
    }
}
