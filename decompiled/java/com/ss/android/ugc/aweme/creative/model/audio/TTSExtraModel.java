package com.ss.android.ugc.aweme.creative.model.audio;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.TTSExtraModel;

/* JADX INFO: loaded from: classes6.dex */
public final class TTSExtraModel implements Parcelable {
    public static final Parcelable.Creator<TTSExtraModel> CREATOR = new Parcelable.Creator<TTSExtraModel>() { // from class: X.0FWZ
        @Override // android.os.Parcelable.Creator
        public final TTSExtraModel createFromParcel(Parcel parcel) {
            return new TTSExtraModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TTSExtraModel[] newArray(int i) {
            return new TTSExtraModel[i];
        }
    };

    @C09CT("effect_id")
    public String effectId;

    @C09CT("extra")
    public String extra;

    @C09CT("speaker_id")
    public String speakerId;

    public TTSExtraModel() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.speakerId);
        parcel.writeString(this.effectId);
        parcel.writeString(this.extra);
    }

    public TTSExtraModel(String str, String str2, String str3) {
        this.speakerId = str;
        this.effectId = str2;
        this.extra = str3;
    }
}
