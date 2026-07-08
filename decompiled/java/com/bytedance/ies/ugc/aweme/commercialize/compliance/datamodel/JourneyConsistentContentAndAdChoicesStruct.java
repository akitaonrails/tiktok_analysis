package com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.ChooseYourExperienceStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.CustomizeYourExperienceStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.JourneyConsistentContentAndAdChoicesStruct;

/* JADX INFO: loaded from: classes13.dex */
public final class JourneyConsistentContentAndAdChoicesStruct implements Parcelable {
    public static final Parcelable.Creator<JourneyConsistentContentAndAdChoicesStruct> CREATOR = new Parcelable.Creator<JourneyConsistentContentAndAdChoicesStruct>() { // from class: X.0TPS
        @Override // android.os.Parcelable.Creator
        public final JourneyConsistentContentAndAdChoicesStruct createFromParcel(Parcel parcel) {
            return new JourneyConsistentContentAndAdChoicesStruct(ChooseYourExperienceStruct.CREATOR.createFromParcel(parcel), CustomizeYourExperienceStruct.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final JourneyConsistentContentAndAdChoicesStruct[] newArray(int i) {
            return new JourneyConsistentContentAndAdChoicesStruct[i];
        }
    };

    @C09CT("choose_your_experience_data")
    public final ChooseYourExperienceStruct chooseYourExperienceData;

    @C09CT("customize_your_experience_data")
    public final CustomizeYourExperienceStruct customizeYourExperienceData;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.chooseYourExperienceData.writeToParcel(parcel, i);
        this.customizeYourExperienceData.writeToParcel(parcel, i);
    }

    public JourneyConsistentContentAndAdChoicesStruct(ChooseYourExperienceStruct chooseYourExperienceStruct, CustomizeYourExperienceStruct customizeYourExperienceStruct) {
        this.chooseYourExperienceData = chooseYourExperienceStruct;
        this.customizeYourExperienceData = customizeYourExperienceStruct;
    }
}
