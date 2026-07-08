package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.ChallengeModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class ChallengeModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ChallengeModel> CREATOR = new Parcelable.Creator<ChallengeModel>() { // from class: X.0Mho
        @Override // android.os.Parcelable.Creator
        public final ChallengeModel createFromParcel(Parcel parcel) {
            return new ChallengeModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChallengeModel[] newArray(int i) {
            return new ChallengeModel[i];
        }
    };

    @C09CT("challenge_id")
    public String challengeId;

    @C09CT("challenge_name")
    public String challengeName;

    public ChallengeModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.challengeId);
        parcel.writeString(this.challengeName);
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getChallengeName() {
        return this.challengeName;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setChallengeName(String str) {
        this.challengeName = str;
    }

    public ChallengeModel(String str, String str2) {
        this.challengeId = str;
        this.challengeName = str2;
    }
}
