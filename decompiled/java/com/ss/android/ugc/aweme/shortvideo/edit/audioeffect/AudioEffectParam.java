package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import X.C09CT;
import X.C1439090nYJ;
import X.C19719512Dh;
import X.InterfaceC1294060jmO;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioEffectParam implements IAudioEffectParam, Serializable, Parcelable {
    public static final C1439090nYJ CREATOR = new Parcelable.Creator<AudioEffectParam>() { // from class: X.0nYJ
        @Override // android.os.Parcelable.Creator
        public final AudioEffectParam createFromParcel(Parcel parcel) {
            return new AudioEffectParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioEffectParam[] newArray(int i) {
            return new AudioEffectParam[i];
        }
    };

    @C09CT("challenge")
    public AVChallenge challenge;

    @C09CT("challenges")
    public List<AVChallenge> challenges;

    @C09CT("effectPath")
    public String effectPath;

    @C09CT("effectTag")
    public String effectTag;
    public String panel;

    @C09CT("preprocessResult")
    public byte[] preprocessResult;
    public String resId;

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

    public AudioEffectParam() {
        this("", 0, 0, "", "", 0, 0, null, null, new ArrayList());
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getChallenge$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final AVChallenge getChallenge() {
        return this.challenge;
    }

    public final List<AVChallenge> getChallenges() {
        return this.challenges;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public String getEffectPath() {
        return this.effectPath;
    }

    public String getEffectTag() {
        return this.effectTag;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public String getPanel() {
        return this.panel;
    }

    public byte[] getPreprocessResult() {
        return this.preprocessResult;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public String getResId() {
        return this.resId;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public int getSeqIn() {
        return this.seqIn;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public int getSeqOut() {
        return this.seqOut;
    }

    public boolean getShowErrorToast() {
        return this.showErrorToast;
    }

    public int getTrackIndex() {
        return this.trackIndex;
    }

    public int getTrackType() {
        return this.trackType;
    }

    public String getUploadId() {
        return this.uploadId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioEffectParam(Parcel parcel) {
        String string = parcel.readString();
        string = string == null ? "" : string;
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        String string2 = parcel.readString();
        string2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        this(string, i, i2, string2, string3 != null ? string3 : "", parcel.readInt(), parcel.readInt(), parcel.createByteArray(), (AVChallenge) parcel.readParcelable(AVChallenge.class.getClassLoader()), C19719512Dh.LIZIZ(parcel.readArrayList(AVChallenge.class.getClassLoader())));
    }

    public final void setChallenge(AVChallenge aVChallenge) {
        this.challenge = aVChallenge;
    }

    public final void setChallenges(List<AVChallenge> list) {
        this.challenges = list;
    }

    public void setEffectPath(String str) {
        this.effectPath = str;
    }

    public void setEffectTag(String str) {
        this.effectTag = str;
    }

    public void setPanel(String str) {
        this.panel = str;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public void setPreprocessResult(byte[] bArr) {
        this.preprocessResult = bArr;
    }

    public void setResId(String str) {
        this.resId = str;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public void setSeqIn(int i) {
        this.seqIn = i;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public void setSeqOut(int i) {
        this.seqOut = i;
    }

    public void setShowErrorToast(boolean z) {
        this.showErrorToast = z;
    }

    public void setTrackIndex(int i) {
        this.trackIndex = i;
    }

    public void setTrackType(int i) {
        this.trackType = i;
    }

    public void setUploadId(String str) {
        this.uploadId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getUploadId());
        parcel.writeInt(getTrackType());
        parcel.writeInt(getTrackIndex());
        parcel.writeString(getEffectPath());
        parcel.writeString(getEffectTag());
        parcel.writeInt(getSeqIn());
        parcel.writeInt(getSeqOut());
        parcel.writeByteArray(getPreprocessResult());
        parcel.writeParcelable(this.challenge, i);
        parcel.writeList(this.challenges);
    }

    public AudioEffectParam(String str, int i, int i2, String str2, String str3, int i3, int i4, byte[] bArr, AVChallenge aVChallenge, List<AVChallenge> list) {
        this.uploadId = str;
        this.trackType = i;
        this.trackIndex = i2;
        this.effectPath = str2;
        this.effectTag = str3;
        this.seqIn = i3;
        this.seqOut = i4;
        this.preprocessResult = bArr;
        this.challenge = aVChallenge;
        this.challenges = list;
    }
}
