package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class SecretReplyExtraData implements Parcelable, Serializable {
    public static final Parcelable.Creator<SecretReplyExtraData> CREATOR = new Creator();

    @C09CT("secret_reply_question")
    public String secretReplyQuestion;

    @C09CT("secret_reply_response")
    public String secretReplyResponse;

    public static final class Creator implements Parcelable.Creator<SecretReplyExtraData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SecretReplyExtraData createFromParcel(Parcel parcel) {
            return new SecretReplyExtraData(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SecretReplyExtraData[] newArray(int i) {
            return new SecretReplyExtraData[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.secretReplyQuestion);
        parcel.writeString(this.secretReplyResponse);
    }

    public SecretReplyExtraData() {
        this("", "");
    }

    public final String getSecretReplyQuestion() {
        return this.secretReplyQuestion;
    }

    public final String getSecretReplyResponse() {
        return this.secretReplyResponse;
    }

    public SecretReplyExtraData(String str) {
        this(str, "");
    }

    public final void setSecretReplyQuestion(String str) {
        this.secretReplyQuestion = str;
    }

    public final void setSecretReplyResponse(String str) {
        this.secretReplyResponse = str;
    }

    public SecretReplyExtraData(String str, String str2) {
        this.secretReplyQuestion = str;
        this.secretReplyResponse = str2;
    }
}
