package com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.ChooseYourExperienceCommonContentStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.ChooseYourExperienceStruct;

/* JADX INFO: loaded from: classes13.dex */
public final class ChooseYourExperienceStruct implements Parcelable {
    public static final Parcelable.Creator<ChooseYourExperienceStruct> CREATOR = new Parcelable.Creator<ChooseYourExperienceStruct>() { // from class: X.0TPQ
        @Override // android.os.Parcelable.Creator
        public final ChooseYourExperienceStruct createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Parcelable.Creator<ChooseYourExperienceCommonContentStruct> creator = ChooseYourExperienceCommonContentStruct.CREATOR;
            return new ChooseYourExperienceStruct(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ChooseYourExperienceStruct[] newArray(int i) {
            return new ChooseYourExperienceStruct[i];
        }
    };

    @C09CT("gen_data")
    public final ChooseYourExperienceCommonContentStruct gen_data;

    @C09CT("header_title")
    public final String header_title;

    @C09CT("learn_more_data")
    public final ChooseYourExperienceCommonContentStruct learn_more_data;

    @C09CT("more_options_data")
    public final ChooseYourExperienceCommonContentStruct more_options_data;

    @C09CT("personalize_data")
    public final ChooseYourExperienceCommonContentStruct personalize_data;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.header_title);
        this.personalize_data.writeToParcel(parcel, i);
        this.gen_data.writeToParcel(parcel, i);
        this.more_options_data.writeToParcel(parcel, i);
        this.learn_more_data.writeToParcel(parcel, i);
    }

    public ChooseYourExperienceStruct(String str, ChooseYourExperienceCommonContentStruct chooseYourExperienceCommonContentStruct, ChooseYourExperienceCommonContentStruct chooseYourExperienceCommonContentStruct2, ChooseYourExperienceCommonContentStruct chooseYourExperienceCommonContentStruct3, ChooseYourExperienceCommonContentStruct chooseYourExperienceCommonContentStruct4) {
        this.header_title = str;
        this.personalize_data = chooseYourExperienceCommonContentStruct;
        this.gen_data = chooseYourExperienceCommonContentStruct2;
        this.more_options_data = chooseYourExperienceCommonContentStruct3;
        this.learn_more_data = chooseYourExperienceCommonContentStruct4;
    }
}
