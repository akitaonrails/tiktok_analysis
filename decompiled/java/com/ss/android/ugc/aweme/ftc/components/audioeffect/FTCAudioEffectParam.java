package com.ss.android.ugc.aweme.ftc.components.audioeffect;

import X.C09CT;
import X.C1439100nYK;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCAudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class FTCAudioEffectParam implements Serializable, Parcelable {

    @C09CT("challenge")
    public AVChallenge challenge;

    @C09CT("effectPath")
    public String effectPath;

    @C09CT("effectTag")
    public String effectTag;

    @C09CT("preprocessResult")
    public byte[] preprocessResult;

    @C09CT("seqIn")
    public int seqIn;

    @C09CT("seqOut")
    public int seqOut;
    public boolean showErrorToast;

    @C09CT("trackIndex")
    public int trackIndex;

    @C09CT("trackType")
    public int trackType;

    @C09CT("uploadId")
    public String uploadId;
    public static final C1439100nYK CREATOR = new Parcelable.Creator<FTCAudioEffectParam>() { // from class: X.0nYK
        @Override // android.os.Parcelable.Creator
        public final FTCAudioEffectParam createFromParcel(Parcel parcel) {
            return new FTCAudioEffectParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FTCAudioEffectParam[] newArray(int i) {
            return new FTCAudioEffectParam[i];
        }
    };
    public static final int $stable = 8;

    public FTCAudioEffectParam() {
        this("", 0, 0, "", "", 0, 0, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final AVChallenge getChallenge() {
        return this.challenge;
    }

    public final String getEffectPath() {
        return this.effectPath;
    }

    public final String getEffectTag() {
        return this.effectTag;
    }

    public final byte[] getPreprocessResult() {
        return this.preprocessResult;
    }

    public final int getSeqIn() {
        return this.seqIn;
    }

    public final int getSeqOut() {
        return this.seqOut;
    }

    public final boolean getShowErrorToast() {
        return this.showErrorToast;
    }

    public final int getTrackIndex() {
        return this.trackIndex;
    }

    public final int getTrackType() {
        return this.trackType;
    }

    public final String getUploadId() {
        return this.uploadId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FTCAudioEffectParam(Parcel parcel) {
        String string = parcel.readString();
        string = string == null ? "" : string;
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        String string2 = parcel.readString();
        string2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        this(string, i, i2, string2, string3 != null ? string3 : "", parcel.readInt(), parcel.readInt(), parcel.createByteArray(), (AVChallenge) parcel.readParcelable(AVChallenge.class.getClassLoader()));
    }

    public final void setChallenge(AVChallenge aVChallenge) {
        this.challenge = aVChallenge;
    }

    public final void setEffectPath(String str) {
        this.effectPath = str;
    }

    public final void setEffectTag(String str) {
        this.effectTag = str;
    }

    public final void setPreprocessResult(byte[] bArr) {
        this.preprocessResult = bArr;
    }

    public final void setSeqIn(int i) {
        this.seqIn = i;
    }

    public final void setSeqOut(int i) {
        this.seqOut = i;
    }

    public final void setShowErrorToast(boolean z) {
        this.showErrorToast = z;
    }

    public final void setTrackIndex(int i) {
        this.trackIndex = i;
    }

    public final void setTrackType(int i) {
        this.trackType = i;
    }

    public final void setUploadId(String str) {
        this.uploadId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uploadId);
        parcel.writeInt(this.trackType);
        parcel.writeInt(this.trackIndex);
        parcel.writeString(this.effectPath);
        parcel.writeString(this.effectTag);
        parcel.writeInt(this.seqIn);
        parcel.writeInt(this.seqOut);
        parcel.writeByteArray(this.preprocessResult);
        parcel.writeParcelable(this.challenge, i);
    }

    public FTCAudioEffectParam(String str, int i, int i2, String str2, String str3, int i3, int i4, byte[] bArr, AVChallenge aVChallenge) {
        this.uploadId = str;
        this.trackType = i;
        this.trackIndex = i2;
        this.effectPath = str2;
        this.effectTag = str3;
        this.seqIn = i3;
        this.seqOut = i4;
        this.preprocessResult = bArr;
        this.challenge = aVChallenge;
    }
}
