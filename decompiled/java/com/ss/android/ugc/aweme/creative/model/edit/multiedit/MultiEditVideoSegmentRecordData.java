package com.ss.android.ugc.aweme.creative.model.edit.multiedit;

import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import X.C391580FWy;
import X.InterfaceC2270808v4;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class MultiEditVideoSegmentRecordData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditVideoSegmentRecordData> CREATOR = new C391580FWy(1);

    @C09CT("aigc_info")
    public AIGCInfo aigcInfo;

    @C09CT("audio_length")
    public long audioLength;

    @InterfaceC2270908v5
    @InterfaceC2270808v4
    @C09CT("audio_path")
    @C0MY0
    public String audioPath;

    @C09CT("audio_speed")
    public float audioSpeed;

    @C09CT("createTime")
    public long createTime;

    @C09CT("draft_audio_path")
    public String draftAudioPath;

    @C09CT("draft_video_path")
    public String draftVideoPath;

    @C09CT("enable")
    public boolean enable;

    @C09CT("endTime")
    public long endTime;

    @C09CT("fast_import_origin_video_path")
    public String fastImportOriginVideoPath;

    @C09CT("frameLeakProbability")
    public int frameLeakProbability;

    @C09CT("height")
    public int height;

    @C09CT("is_mute")
    public boolean isMute;

    @C09CT("edit_trim_state")
    public MultiEditTrimState multiEditTrimState;

    @C09CT("music_sync_data")
    public MusicSyncData musicSyncData;

    @C09CT("rotate")
    public int rotate;

    @C09CT("scale")
    public float scale;

    @C09CT("startTime")
    public long startTime;

    @C09CT("video_key")
    public int videoKey;

    @C09CT("video_length")
    public long videoLength;

    @InterfaceC2270908v5
    @InterfaceC2270808v4
    @C09CT("video_path")
    @C0MY0
    public String videoPath;

    @C09CT("speed")
    public float videoSpeed;

    @C09CT("width")
    public int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MultiEditVideoSegmentRecordData cloneData() {
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
        multiEditVideoSegmentRecordData.videoPath = this.videoPath;
        multiEditVideoSegmentRecordData.videoLength = this.videoLength;
        multiEditVideoSegmentRecordData.draftVideoPath = this.draftVideoPath;
        multiEditVideoSegmentRecordData.draftAudioPath = this.draftAudioPath;
        multiEditVideoSegmentRecordData.audioPath = this.audioPath;
        multiEditVideoSegmentRecordData.audioLength = this.audioLength;
        multiEditVideoSegmentRecordData.videoSpeed = this.videoSpeed;
        multiEditVideoSegmentRecordData.audioSpeed = this.audioSpeed;
        multiEditVideoSegmentRecordData.startTime = this.startTime;
        multiEditVideoSegmentRecordData.endTime = this.endTime;
        multiEditVideoSegmentRecordData.createTime = this.createTime;
        multiEditVideoSegmentRecordData.rotate = this.rotate;
        multiEditVideoSegmentRecordData.frameLeakProbability = this.frameLeakProbability;
        multiEditVideoSegmentRecordData.videoKey = this.videoKey;
        multiEditVideoSegmentRecordData.enable = this.enable;
        multiEditVideoSegmentRecordData.width = this.width;
        multiEditVideoSegmentRecordData.height = this.height;
        multiEditVideoSegmentRecordData.scale = this.scale;
        multiEditVideoSegmentRecordData.isMute = this.isMute;
        multiEditVideoSegmentRecordData.musicSyncData = this.musicSyncData;
        multiEditVideoSegmentRecordData.multiEditTrimState = this.multiEditTrimState;
        multiEditVideoSegmentRecordData.fastImportOriginVideoPath = this.fastImportOriginVideoPath;
        multiEditVideoSegmentRecordData.aigcInfo = this.aigcInfo;
        return multiEditVideoSegmentRecordData;
    }

    public MediaModel convertModel() {
        MediaModel mediaModel = new MediaModel(-1L);
        mediaModel.LJIILL(this.videoPath);
        mediaModel.duration = this.videoLength / 1000;
        mediaModel.width = this.width;
        mediaModel.height = this.height;
        mediaModel.startTime = (int) this.startTime;
        mediaModel.endTime = (int) this.endTime;
        mediaModel.speed = this.videoSpeed;
        mediaModel.aigcInfo = this.aigcInfo;
        return mediaModel;
    }

    public long getEndTime() {
        MusicSyncData musicSyncData = this.musicSyncData;
        return musicSyncData != null ? musicSyncData.getVideoEnd() : this.endTime;
    }

    public long getStartTime() {
        MusicSyncData musicSyncData = this.musicSyncData;
        return musicSyncData != null ? musicSyncData.getVideoStart() : this.startTime;
    }

    public float getVideoSpeed() {
        if (this.musicSyncData != null) {
            return 1.0f;
        }
        return this.videoSpeed;
    }

    public void resetTime() {
        this.startTime = 0L;
        this.endTime = this.videoLength / 1000;
        this.frameLeakProbability = 0;
    }

    public MultiEditVideoSegmentRecordData() {
        this.videoSpeed = 1.0f;
        this.audioSpeed = 1.0f;
        this.width = 720;
        this.height = 1280;
        this.enable = true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiEditVideoSegmentRecordData{videoPath=");
        sbLIZ.append(this.videoPath);
        sbLIZ.append(", videoLength=");
        sbLIZ.append(this.videoLength);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getOriginEndTime() {
        return this.endTime;
    }

    public long getOriginStartTime() {
        return this.startTime;
    }

    public float getOriginVideoSpeed() {
        return this.videoSpeed;
    }

    public MultiEditVideoSegmentRecordData(Parcel parcel) {
        boolean z;
        this.videoSpeed = 1.0f;
        this.audioSpeed = 1.0f;
        this.width = 720;
        this.height = 1280;
        this.enable = true;
        this.videoPath = parcel.readString();
        this.draftVideoPath = parcel.readString();
        this.audioPath = parcel.readString();
        this.draftAudioPath = parcel.readString();
        this.videoLength = parcel.readLong();
        this.audioLength = parcel.readLong();
        this.videoSpeed = parcel.readFloat();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.createTime = parcel.readLong();
        this.rotate = parcel.readInt();
        this.audioSpeed = parcel.readFloat();
        this.frameLeakProbability = parcel.readInt();
        this.videoKey = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.enable = z;
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.scale = parcel.readFloat();
        this.musicSyncData = (MusicSyncData) parcel.readParcelable(MusicSyncData.class.getClassLoader());
        this.multiEditTrimState = (MultiEditTrimState) parcel.readParcelable(MultiEditTrimState.class.getClassLoader());
        this.isMute = parcel.readByte() != 0;
        this.fastImportOriginVideoPath = parcel.readString();
        this.aigcInfo = (AIGCInfo) parcel.readParcelable(AIGCInfo.class.getClassLoader());
    }

    public void copyData(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        if (multiEditVideoSegmentRecordData == null) {
            return;
        }
        this.videoPath = multiEditVideoSegmentRecordData.videoPath;
        this.audioPath = multiEditVideoSegmentRecordData.audioPath;
        this.videoLength = multiEditVideoSegmentRecordData.videoLength;
        this.audioLength = multiEditVideoSegmentRecordData.audioLength;
        this.startTime = multiEditVideoSegmentRecordData.startTime;
        this.endTime = multiEditVideoSegmentRecordData.endTime;
        this.createTime = multiEditVideoSegmentRecordData.createTime;
        this.videoSpeed = multiEditVideoSegmentRecordData.videoSpeed;
        this.audioSpeed = multiEditVideoSegmentRecordData.audioSpeed;
        this.rotate = multiEditVideoSegmentRecordData.rotate;
        this.frameLeakProbability = multiEditVideoSegmentRecordData.frameLeakProbability;
        this.videoKey = multiEditVideoSegmentRecordData.videoKey;
        this.enable = multiEditVideoSegmentRecordData.enable;
        this.width = multiEditVideoSegmentRecordData.width;
        this.height = multiEditVideoSegmentRecordData.height;
        this.scale = multiEditVideoSegmentRecordData.scale;
        this.musicSyncData = multiEditVideoSegmentRecordData.musicSyncData;
        this.multiEditTrimState = multiEditVideoSegmentRecordData.multiEditTrimState;
        this.isMute = multiEditVideoSegmentRecordData.isMute;
        this.fastImportOriginVideoPath = multiEditVideoSegmentRecordData.fastImportOriginVideoPath;
        this.aigcInfo = multiEditVideoSegmentRecordData.aigcInfo;
    }

    public boolean isEqual(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        if (multiEditVideoSegmentRecordData == null || !TextUtils.equals(this.videoPath, multiEditVideoSegmentRecordData.videoPath) || this.videoLength != multiEditVideoSegmentRecordData.videoLength || !TextUtils.equals(this.audioPath, multiEditVideoSegmentRecordData.audioPath) || this.audioLength != multiEditVideoSegmentRecordData.audioLength || this.videoSpeed != multiEditVideoSegmentRecordData.videoSpeed || this.audioSpeed != multiEditVideoSegmentRecordData.audioSpeed || this.startTime != multiEditVideoSegmentRecordData.startTime || this.endTime != multiEditVideoSegmentRecordData.endTime || this.rotate != multiEditVideoSegmentRecordData.rotate || this.musicSyncData != multiEditVideoSegmentRecordData.musicSyncData) {
            return false;
        }
        return true;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setEndTime(long j) {
        MusicSyncData musicSyncData = this.musicSyncData;
        if (musicSyncData != null) {
            this.musicSyncData = musicSyncData.copy(musicSyncData.getVideoStart(), j, this.musicSyncData.getVideoDuration());
        } else {
            this.endTime = j;
        }
    }

    public void setStartTime(long j) {
        MusicSyncData musicSyncData = this.musicSyncData;
        if (musicSyncData != null) {
            this.musicSyncData = musicSyncData.copy(j, musicSyncData.getVideoEnd(), this.musicSyncData.getVideoDuration());
        } else {
            this.startTime = j;
        }
    }

    public void setVideoSpeed(float f) {
        if (this.musicSyncData == null) {
            this.videoSpeed = f;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.draftVideoPath);
        parcel.writeString(this.audioPath);
        parcel.writeString(this.draftAudioPath);
        parcel.writeLong(this.videoLength);
        parcel.writeLong(this.audioLength);
        parcel.writeFloat(this.videoSpeed);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeLong(this.createTime);
        parcel.writeInt(this.rotate);
        parcel.writeFloat(this.audioSpeed);
        parcel.writeInt(this.frameLeakProbability);
        parcel.writeInt(this.videoKey);
        parcel.writeByte(this.enable ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.scale);
        parcel.writeParcelable(this.musicSyncData, i);
        parcel.writeParcelable(this.multiEditTrimState, i);
        parcel.writeByte(this.isMute ? (byte) 1 : (byte) 0);
        parcel.writeString(this.fastImportOriginVideoPath);
        parcel.writeParcelable(this.aigcInfo, i);
    }
}
