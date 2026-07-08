package com.ss.android.ugc.aweme.shortvideo.cut.model;

import X.C2188811AlT;
import X.C2281551ESb;
import X.C2471909mP;
import X.C574370Mfr;
import X.C580950MqT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import pyl.s;

/* JADX INFO: loaded from: classes9.dex */
public class VideoSegment implements Parcelable {
    public static final Parcelable.Creator<VideoSegment> CREATOR = new C580950MqT(2);
    public AIGCInfo aigcInfo;
    public int bitRate;
    public int codecId;
    public long date;
    public long duration;
    public long end;
    public boolean fastImportDependHW;
    public int fps;
    public int gop;
    public int height;
    public int imageTranslationType;
    public boolean isDeleted;
    public boolean isGetVideoFrame;
    public boolean isImageType;
    public boolean isStickPointMode;
    public String lvFunction;
    public String lvPrevious;
    public String mDescription;
    public String mMusicId;
    public String md5;
    public final String originPath;
    public String path;
    public int rotate;
    public float scaleH;
    public float scaleW;
    public String slotId;
    public float speed;
    public String srcImagePath;
    public long start;
    public C574370Mfr stickPointVideoSegment;
    public String thumbnail;
    public int videoIndex;
    public VEUtils.VEVideoFileInfo videoInfo;
    public int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void LIZ() {
        if (this.isImageType) {
            return;
        }
        if (C2471909mP.LJJII(this.path, true, null)) {
            this.isImageType = true;
            return;
        }
        if (this.videoInfo == null) {
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.path);
            if (videoFileInfo != null && videoFileInfo.rotation % 180 != 0) {
                int i = videoFileInfo.height;
                videoFileInfo.height = videoFileInfo.width;
                videoFileInfo.width = i;
                if (C2281551ESb.LIZIZ.LJJIJIIJIL()) {
                    videoFileInfo.rotation = 0;
                }
            }
            this.videoInfo = videoFileInfo;
        }
        VEUtils.VEVideoFileInfo vEVideoFileInfo = this.videoInfo;
        if (vEVideoFileInfo != null) {
            this.width = vEVideoFileInfo.width;
            this.height = vEVideoFileInfo.height;
            this.fps = vEVideoFileInfo.fps;
            this.codecId = vEVideoFileInfo.codec;
            this.bitRate = vEVideoFileInfo.bitrate;
            this.gop = vEVideoFileInfo.keyFrameCount;
        }
    }

    public final int LIZIZ() {
        if (this.bitRate == 0) {
            LIZ();
        }
        return this.bitRate;
    }

    public final int LIZJ() {
        if (this.codecId == 0) {
            LIZ();
        }
        return this.codecId;
    }

    public final int LJ() {
        if (this.fps == 0) {
            LIZ();
        }
        return this.fps;
    }

    public final boolean LJIIIIZZ() {
        return this.isStickPointMode && this.stickPointVideoSegment != null;
    }

    public final void LJIIIZ() {
        this.start = 0L;
        this.end = this.duration;
        this.speed = s.NORMAL.value();
        this.rotate = 0;
        this.isDeleted = false;
    }

    public final long LIZLLL() {
        return LJIIIIZZ() ? this.stickPointVideoSegment.getVideoEnd() : this.end;
    }

    public final float LJI() {
        return LJIIIIZZ() ? this.stickPointVideoSegment.getSpeed() : this.speed;
    }

    public final long LJII() {
        return LJIIIIZZ() ? this.stickPointVideoSegment.getVideoStart() : this.start;
    }

    public VideoSegment(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.scaleW = 1.0f;
        this.scaleH = 1.0f;
        this.imageTranslationType = VEClipAlgorithmParam.BINGO_EFFECT_NULL;
        this.videoIndex = parcel.readInt();
        this.path = parcel.readString();
        this.duration = parcel.readLong();
        this.start = parcel.readLong();
        this.end = parcel.readLong();
        this.speed = parcel.readFloat();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.thumbnail = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isDeleted = z;
        this.rotate = parcel.readInt();
        this.md5 = parcel.readString();
        this.scaleW = parcel.readFloat();
        this.scaleH = parcel.readFloat();
        this.stickPointVideoSegment = (C574370Mfr) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isStickPointMode = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isGetVideoFrame = z3;
        this.imageTranslationType = parcel.readInt();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isImageType = z4;
        this.originPath = parcel.readString();
        this.fastImportDependHW = parcel.readByte() != 0;
        this.slotId = parcel.readString();
        this.aigcInfo = (AIGCInfo) parcel.readSerializable();
        this.date = parcel.readLong();
    }

    public final String LJFF(boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.videoIndex);
            sbLIZ.append("");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return this.path;
    }

    public final void LJIIJ(long j) {
        if (LJIIIIZZ()) {
            this.stickPointVideoSegment.setVideoEnd(j);
        } else {
            this.end = j;
        }
    }

    public final void LJIIJJI(String str) {
        this.path = str;
        this.isImageType = C2471909mP.LJJII(str, false, null);
    }

    public final void LJIIL(float f) {
        if (LJIIIIZZ()) {
            this.stickPointVideoSegment.setSpeed(1.0f);
        } else {
            this.speed = f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSegment)) {
            return false;
        }
        VideoSegment videoSegment = (VideoSegment) obj;
        if (this.videoIndex == videoSegment.videoIndex && this.duration == videoSegment.duration && this.start == videoSegment.start && this.end == videoSegment.end && Float.compare(videoSegment.speed, this.speed) == 0 && this.width == videoSegment.width && this.height == videoSegment.height && this.isDeleted == videoSegment.isDeleted && this.date == videoSegment.date) {
            String str = this.path;
            String str2 = videoSegment.path;
            if (str == str2 || (str != null && str.equals(str2))) {
                String str3 = this.thumbnail;
                String str4 = videoSegment.thumbnail;
                if (str3 == str4 || (str3 != null && str3.equals(str4))) {
                    String str5 = this.md5;
                    String str6 = videoSegment.md5;
                    if (str5 == str6 || (str5 != null && str5.equals(str6))) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public VideoSegment(MediaModel mediaModel) {
        this.scaleW = 1.0f;
        this.scaleH = 1.0f;
        this.imageTranslationType = VEClipAlgorithmParam.BINGO_EFFECT_NULL;
        this.path = mediaModel.LJFF();
        this.width = mediaModel.width;
        this.height = mediaModel.height;
        this.thumbnail = mediaModel.thumbnail;
        long j = mediaModel.duration;
        this.duration = j;
        this.start = mediaModel.startTime;
        int i = mediaModel.endTime;
        if (i > 0) {
            this.end = i;
        } else {
            this.end = j;
        }
        this.speed = mediaModel.speed;
        this.isImageType = C2471909mP.LJJIIJZLJL(mediaModel);
        this.originPath = this.path;
        this.slotId = mediaModel.slotId;
        this.aigcInfo = mediaModel.aigcInfo;
        this.date = mediaModel.date;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.videoIndex);
        parcel.writeString(this.path);
        parcel.writeLong(this.duration);
        parcel.writeLong(this.start);
        parcel.writeLong(this.end);
        parcel.writeFloat(this.speed);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.thumbnail);
        parcel.writeByte(this.isDeleted ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.rotate);
        parcel.writeString(this.md5);
        parcel.writeFloat(this.scaleW);
        parcel.writeFloat(this.scaleH);
        parcel.writeSerializable(this.stickPointVideoSegment);
        parcel.writeInt(this.isStickPointMode ? 1 : 0);
        parcel.writeInt(this.isGetVideoFrame ? 1 : 0);
        parcel.writeInt(this.imageTranslationType);
        parcel.writeByte(this.isImageType ? (byte) 1 : (byte) 0);
        parcel.writeString(this.originPath);
        parcel.writeByte(this.fastImportDependHW ? (byte) 1 : (byte) 0);
        parcel.writeString(this.slotId);
        parcel.writeSerializable(this.aigcInfo);
        parcel.writeLong(this.date);
    }

    public VideoSegment(String str, String str2, int i, int i2, int i3) {
        this.scaleW = 1.0f;
        this.scaleH = 1.0f;
        this.imageTranslationType = VEClipAlgorithmParam.BINGO_EFFECT_NULL;
        this.path = str;
        this.width = i;
        this.height = i2;
        this.thumbnail = "";
        long j = i3;
        this.duration = j;
        this.end = j;
        this.speed = s.NORMAL.value();
        this.isImageType = C2471909mP.LJJII(str, false, null);
        this.originPath = str2;
    }
}
