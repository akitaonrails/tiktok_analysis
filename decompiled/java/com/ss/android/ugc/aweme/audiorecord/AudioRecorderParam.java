package com.ss.android.ugc.aweme.audiorecord;

import X.C09CT;
import X.C0EZD;
import X.C0MY0;
import X.C13BV;
import X.C13LP;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioRecorderParam implements Serializable, Parcelable {
    public static final C0EZD CREATOR = new Parcelable.Creator<AudioRecorderParam>() { // from class: X.0EZD
        @Override // android.os.Parcelable.Creator
        public final AudioRecorderParam createFromParcel(Parcel parcel) {
            return new AudioRecorderParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioRecorderParam[] newArray(int i) {
            return new AudioRecorderParam[i];
        }
    };
    public int audioRecordIndex;

    @C09CT("audiourl")
    @C0MY0
    public String audioUrl;

    @C09CT("extraurl")
    public String extraUrl;
    public boolean hasDubVoiceConversion;
    public boolean hasOriginVoiceConversion;

    @C09CT("hasoriginalsound")
    public boolean hasOriginalSound;

    @C09CT("mstack")
    public Stack<Point> mStack;

    @C09CT("multiTrackAudio")
    @C0MY0
    public List<String> multiTrackAudio;

    @C09CT("mute_by_audio_copyright")
    public boolean muteByAudioCopyright;
    public boolean needDel;

    @C09CT("needoriginalsound")
    public boolean needOriginalSound;

    @C09CT("recordvolume")
    public float recordVolume;

    @C09CT("voicevolume")
    public float voiceVolume;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean hasRecord() {
        return (TextUtils.isEmpty(this.audioUrl) || this.mStack.empty()) ? false : true;
    }

    public AudioRecorderParam() {
        this.mStack = new Stack<>();
        this.needOriginalSound = true;
        this.hasOriginalSound = true;
        this.audioUrl = "";
        this.recordVolume = 1.0f;
        this.extraUrl = "";
        this.audioRecordIndex = -1;
        this.multiTrackAudio = C13BV.INSTANCE;
    }

    public final int getAudioRecordIndex() {
        return this.audioRecordIndex;
    }

    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final String getExtraUrl() {
        return this.extraUrl;
    }

    public final boolean getHasDubVoiceConversion() {
        return this.hasDubVoiceConversion;
    }

    public final boolean getHasOriginVoiceConversion() {
        return this.hasOriginVoiceConversion;
    }

    public final boolean getHasOriginalSound() {
        return this.hasOriginalSound;
    }

    public final Stack<Point> getMStack() {
        return this.mStack;
    }

    public final List<String> getMultiTrackAudio() {
        return this.multiTrackAudio;
    }

    public final boolean getMuteByAudioCopyright() {
        return this.muteByAudioCopyright;
    }

    public final boolean getNeedDel() {
        return this.needDel;
    }

    public final boolean getNeedOriginalSound() {
        return this.needOriginalSound;
    }

    public final float getRecordVolume() {
        return this.recordVolume;
    }

    public final float getVoiceVolume() {
        return this.voiceVolume;
    }

    public AudioRecorderParam(Parcel parcel) {
        boolean z;
        boolean z2;
        List<String> listLLIIII;
        this();
        this.mStack = (Stack) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.needOriginalSound = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.hasOriginalSound = z2;
        this.muteByAudioCopyright = parcel.readByte() != 0;
        String string = parcel.readString();
        this.audioUrl = string == null ? "" : string;
        this.voiceVolume = parcel.readFloat();
        this.recordVolume = parcel.readFloat();
        String string2 = parcel.readString();
        this.extraUrl = string2 != null ? string2 : "";
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.multiTrackAudio = (arrayListCreateStringArrayList == null || (listLLIIII = C13LP.LLIIII(arrayListCreateStringArrayList)) == null) ? C13BV.INSTANCE : listLLIIII;
    }

    public final void copyFrom(AudioRecorderParam audioRecorderParam) {
        if (audioRecorderParam == null) {
            return;
        }
        this.voiceVolume = audioRecorderParam.voiceVolume;
        this.needOriginalSound = audioRecorderParam.needOriginalSound;
        this.hasOriginalSound = audioRecorderParam.hasOriginalSound;
        this.muteByAudioCopyright = audioRecorderParam.muteByAudioCopyright;
        this.needDel = audioRecorderParam.needDel;
        this.recordVolume = audioRecorderParam.recordVolume;
        this.audioRecordIndex = audioRecorderParam.audioRecordIndex;
        this.audioUrl = audioRecorderParam.audioUrl;
        this.extraUrl = audioRecorderParam.extraUrl;
        this.hasOriginVoiceConversion = audioRecorderParam.hasOriginVoiceConversion;
        this.hasDubVoiceConversion = audioRecorderParam.hasDubVoiceConversion;
        this.mStack.clear();
        this.mStack.addAll(audioRecorderParam.mStack);
        this.multiTrackAudio = audioRecorderParam.multiTrackAudio;
    }

    public final void setAudioRecordIndex(int i) {
        this.audioRecordIndex = i;
    }

    public final void setAudioUrl(String str) {
        this.audioUrl = str;
    }

    public final void setExtraUrl(String str) {
        this.extraUrl = str;
    }

    public final void setHasDubVoiceConversion(boolean z) {
        this.hasDubVoiceConversion = z;
    }

    public final void setHasOriginVoiceConversion(boolean z) {
        this.hasOriginVoiceConversion = z;
    }

    public final void setHasOriginalSound(boolean z) {
        this.hasOriginalSound = z;
    }

    public final void setMStack(Stack<Point> stack) {
        this.mStack = stack;
    }

    public final void setMultiTrackAudio(List<String> list) {
        this.multiTrackAudio = list;
    }

    public final void setMuteByAudioCopyright(boolean z) {
        this.muteByAudioCopyright = z;
    }

    public final void setNeedDel(boolean z) {
        this.needDel = z;
    }

    public final void setNeedOriginalSound(boolean z) {
        this.needOriginalSound = z;
    }

    public final void setRecordVolume(float f) {
        this.recordVolume = f;
    }

    public final void setVoiceVolume(float f) {
        this.voiceVolume = f;
    }

    public final boolean hasChange(AudioRecorderParam audioRecorderParam, boolean z) {
        if (audioRecorderParam == null) {
            if (this.mStack.empty() && this.needOriginalSound == z) {
                return false;
            }
            return true;
        }
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        stack.addAll(this.mStack);
        stack2.addAll(audioRecorderParam.mStack);
        if (stack.size() != stack2.size()) {
            return true;
        }
        while (!stack.isEmpty() && !stack2.empty()) {
            if (!((Point) stack.pop()).isEqual((Point) stack2.pop())) {
                return true;
            }
        }
        if (this.needOriginalSound == audioRecorderParam.needOriginalSound) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.mStack);
        parcel.writeByte(this.needOriginalSound ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hasOriginalSound ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.muteByAudioCopyright ? (byte) 1 : (byte) 0);
        parcel.writeString(this.audioUrl);
        parcel.writeFloat(this.voiceVolume);
        parcel.writeFloat(this.recordVolume);
        parcel.writeString(this.extraUrl);
        parcel.writeStringList(this.multiTrackAudio);
    }
}
