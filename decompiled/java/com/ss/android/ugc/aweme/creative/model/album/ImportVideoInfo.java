package com.ss.android.ugc.aweme.creative.model.album;

import X.C09CT;
import X.C1422000n6k;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.p;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class ImportVideoInfo implements Parcelable, Serializable {
    public static final C1422000n6k CREATOR = new Parcelable.Creator<ImportVideoInfo>() { // from class: X.0n6k
        @Override // android.os.Parcelable.Creator
        public final ImportVideoInfo createFromParcel(Parcel parcel) {
            return new ImportVideoInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ImportVideoInfo[] newArray(int i) {
            return new ImportVideoInfo[i];
        }
    };

    @C09CT(alternate = {"p"}, value = "aigc_info")
    public AIGCInfo aigcInfo;

    @C09CT(alternate = {"c"}, value = "bit_rate")
    public int bitRate;

    @C09CT(alternate = {"k"}, value = "cutSpeed")
    public float cutSpeed;

    @C09CT(alternate = {"q"}, value = "date")
    public long date;

    @C09CT(alternate = {"h"}, value = "description")
    public String description;

    @C09CT(alternate = {"g"}, value = "duration")
    public long duration;

    @C09CT(alternate = {"d"}, value = "encode_id")
    public int encodeId;

    @C09CT(alternate = {"n"}, value = "fast_import_depend_hw")
    public boolean fastImportDependHW;

    @C09CT(alternate = {"o"}, value = "hypic_description")
    public String hypicDescription;

    @C09CT(alternate = {"e"}, value = "importPath")
    public String importIndex;

    @C09CT(alternate = {"f"}, value = "import_file_duration")
    public long importfileDuration;

    @C09CT(alternate = {"i"}, value = "music_id")
    public String musicId;

    @C09CT(alternate = {"j"}, value = "origin_fps")
    public int originFps;

    @C09CT(alternate = {"m"}, value = "origin_import_path")
    public String originImportPath;

    @C09CT(alternate = {"l"}, value = "real_import_path")
    public String realImportPath;

    @C09CT(alternate = {"b"}, value = "video_height")
    public int videoHeight;

    @C09CT(alternate = {"a"}, value = "video_width")
    public int videoWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ImportVideoInfo() {
        long j = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        this(0, objArr, objArr2, objArr3, null, j, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr4, 0.0f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr5, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, 131071, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getRealMusicId() {
        k kVarLJJIIZ;
        String str = this.musicId;
        boolean z = true;
        if (str != null) {
            if (str.length() > 0) {
                return str;
            }
        }
        String str2 = this.description;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            new p();
            k kVarLJJIIZ2 = p.LIZJ(this.description).LJIILIIL().LJJIIZ("data");
            if (kVarLJJIIZ2 != null && (kVarLJJIIZ = kVarLJJIIZ2.LJIILIIL().LJJIIZ("musicId")) != null) {
                String strLJIL = kVarLJJIIZ.LJIL();
                if (strLJIL != null) {
                    return strLJIL;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return "";
    }

    public final AIGCInfo getAigcInfo() {
        return this.aigcInfo;
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final float getCutSpeed() {
        return this.cutSpeed;
    }

    public final long getDate() {
        return this.date;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getEncodeId() {
        return this.encodeId;
    }

    public final boolean getFastImportDependHW() {
        return this.fastImportDependHW;
    }

    public final String getHypicDescription() {
        return this.hypicDescription;
    }

    public final String getImportIndex() {
        return this.importIndex;
    }

    public final long getImportfileDuration() {
        return this.importfileDuration;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final int getOriginFps() {
        return this.originFps;
    }

    public final String getOriginImportPath() {
        return this.originImportPath;
    }

    public final String getRealImportPath() {
        return this.realImportPath;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ImportVideoInfo(Parcel parcel) {
        long j = 0;
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, j, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, 131071, 0 == true ? 1 : 0);
        this.videoWidth = parcel.readInt();
        this.videoHeight = parcel.readInt();
        this.bitRate = parcel.readInt();
        this.encodeId = parcel.readInt();
        this.importIndex = parcel.readString();
        this.importfileDuration = parcel.readLong();
        this.duration = parcel.readLong();
        this.description = parcel.readString();
        this.musicId = parcel.readString();
        this.originFps = parcel.readInt();
        this.cutSpeed = parcel.readFloat();
        this.realImportPath = parcel.readString();
        this.originImportPath = parcel.readString();
        this.fastImportDependHW = parcel.readInt() == 1;
        this.hypicDescription = parcel.readString();
        this.aigcInfo = (AIGCInfo) parcel.readParcelable(AIGCInfo.class.getClassLoader());
        this.date = parcel.readLong();
    }

    public final void setAigcInfo(AIGCInfo aIGCInfo) {
        this.aigcInfo = aIGCInfo;
    }

    public final void setBitRate(int i) {
        this.bitRate = i;
    }

    public final void setCutSpeed(float f) {
        this.cutSpeed = f;
    }

    public final void setDate(long j) {
        this.date = j;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEncodeId(int i) {
        this.encodeId = i;
    }

    public final void setFastImportDependHW(boolean z) {
        this.fastImportDependHW = z;
    }

    public final void setHypicDescription(String str) {
        this.hypicDescription = str;
    }

    public final void setImportIndex(String str) {
        this.importIndex = str;
    }

    public final void setImportfileDuration(long j) {
        this.importfileDuration = j;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setOriginFps(int i) {
        this.originFps = i;
    }

    public final void setOriginImportPath(String str) {
        this.originImportPath = str;
    }

    public final void setRealImportPath(String str) {
        this.realImportPath = str;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeInt(this.bitRate);
        parcel.writeInt(this.encodeId);
        parcel.writeString(this.importIndex);
        parcel.writeLong(this.importfileDuration);
        parcel.writeLong(this.duration);
        parcel.writeString(this.description);
        parcel.writeString(this.musicId);
        parcel.writeInt(this.originFps);
        parcel.writeFloat(this.cutSpeed);
        parcel.writeString(this.realImportPath);
        parcel.writeString(this.originImportPath);
        parcel.writeInt(this.fastImportDependHW ? 1 : 0);
        parcel.writeString(this.hypicDescription);
        parcel.writeParcelable(this.aigcInfo, i);
        parcel.writeLong(this.date);
    }

    public ImportVideoInfo(int i, int i2, int i3, int i4, String str, long j, long j2, String str2, String str3, int i5, float f, String str4, String str5, boolean z, String str6, AIGCInfo aIGCInfo, long j3) {
        this.videoWidth = i;
        this.videoHeight = i2;
        this.bitRate = i3;
        this.encodeId = i4;
        this.importIndex = str;
        this.importfileDuration = j;
        this.duration = j2;
        this.description = str2;
        this.musicId = str3;
        this.originFps = i5;
        this.cutSpeed = f;
        this.realImportPath = str4;
        this.originImportPath = str5;
        this.fastImportDependHW = z;
        this.hypicDescription = str6;
        this.aigcInfo = aIGCInfo;
        this.date = j3;
    }

    public /* synthetic */ ImportVideoInfo(int i, int i2, int i3, int i4, String str, long j, long j2, String str2, String str3, int i5, float f, String str4, String str5, boolean z, String str6, AIGCInfo aIGCInfo, long j3, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? null : str, (i6 & 32) != 0 ? 0L : j, (i6 & 64) != 0 ? 0L : j2, (i6 & 128) != 0 ? null : str2, (i6 & 256) != 0 ? null : str3, (i6 & 512) != 0 ? 0 : i5, (i6 & 1024) != 0 ? 1.0f : f, (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str4, (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str5, (i6 & 8192) != 0 ? false : z, (i6 & 16384) != 0 ? null : str6, (32768 & i6) != 0 ? null : aIGCInfo, (i6 & 65536) != 0 ? 0L : j3);
    }
}
