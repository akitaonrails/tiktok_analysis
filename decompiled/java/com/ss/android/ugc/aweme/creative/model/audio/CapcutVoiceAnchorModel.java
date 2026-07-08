package com.ss.android.ugc.aweme.creative.model.audio;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.CapcutVoiceAnchorModel;

/* JADX INFO: loaded from: classes23.dex */
public final class CapcutVoiceAnchorModel implements Parcelable {
    public static final Parcelable.Creator<CapcutVoiceAnchorModel> CREATOR = new Parcelable.Creator<CapcutVoiceAnchorModel>() { // from class: X.0nXG
        @Override // android.os.Parcelable.Creator
        public final CapcutVoiceAnchorModel createFromParcel(Parcel parcel) {
            return new CapcutVoiceAnchorModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CapcutVoiceAnchorModel[] newArray(int i) {
            return new CapcutVoiceAnchorModel[i];
        }
    };

    @C09CT("creator_user_id")
    public String creatorUid;

    @C09CT("effect_icon_url")
    public String effectIconUrl;

    @C09CT("effect_id")
    public String effectId;

    @C09CT("effect_name")
    public String effectName;

    @C09CT("resource_id")
    public String resourceId;

    @C09CT("speaker_id")
    public String speakerId;

    public CapcutVoiceAnchorModel() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.speakerId);
        parcel.writeString(this.effectId);
        parcel.writeString(this.effectName);
        parcel.writeString(this.effectIconUrl);
        parcel.writeString(this.resourceId);
        parcel.writeString(this.creatorUid);
    }

    public CapcutVoiceAnchorModel(String str, String str2, String str3, String str4, String str5, String str6) {
        this.speakerId = str;
        this.effectId = str2;
        this.effectName = str3;
        this.effectIconUrl = str4;
        this.resourceId = str5;
        this.creatorUid = str6;
    }
}
