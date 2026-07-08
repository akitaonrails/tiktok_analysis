package com.ss.android.ugc.aweme.creative.model.audio;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.ConsumptionSpeakerInfo;
import com.ss.android.ugc.aweme.creative.model.audio.InstantCloneConsumptionModel;

/* JADX INFO: loaded from: classes3.dex */
public final class InstantCloneConsumptionModel implements Parcelable {
    public static final Parcelable.Creator<InstantCloneConsumptionModel> CREATOR = new Parcelable.Creator<InstantCloneConsumptionModel>() { // from class: X.062R
        @Override // android.os.Parcelable.Creator
        public final InstantCloneConsumptionModel createFromParcel(Parcel parcel) {
            ConsumptionSpeakerInfo consumptionSpeakerInfoCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                consumptionSpeakerInfoCreateFromParcel = null;
            } else {
                consumptionSpeakerInfoCreateFromParcel = ConsumptionSpeakerInfo.CREATOR.createFromParcel(parcel);
            }
            return new InstantCloneConsumptionModel(string, consumptionSpeakerInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InstantCloneConsumptionModel[] newArray(int i) {
            return new InstantCloneConsumptionModel[i];
        }
    };

    @C09CT("instant_clone_speaker_info")
    public ConsumptionSpeakerInfo speakerInfo;

    @C09CT("instant_clone_text")
    public String text;

    public InstantCloneConsumptionModel() {
        this("", null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        ConsumptionSpeakerInfo consumptionSpeakerInfo = this.speakerInfo;
        if (consumptionSpeakerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            consumptionSpeakerInfo.writeToParcel(parcel, i);
        }
    }

    public InstantCloneConsumptionModel(String str, ConsumptionSpeakerInfo consumptionSpeakerInfo) {
        this.text = str;
        this.speakerInfo = consumptionSpeakerInfo;
    }
}
