package com.ss.android.ugc.aweme.creative.model.edit.multiedit;

import X.C09CT;
import X.C0C64;
import X.C391580FWy;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class MultiEditVideoRecordData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditVideoRecordData> CREATOR = new C391580FWy(0);

    @C09CT("concat_audio")
    public String concatAudio;

    @C09CT("concat_video")
    public String concatVideo;

    @C09CT("cover_path")
    public String coverPath;

    @C09CT("curRecordingDir")
    public String curRecordingDir;

    @C09CT("end_time")
    public long endTime;

    @C09CT("from_advanced_edit")
    public boolean fromAdvancedEdit;

    @C09CT("from_cut")
    public boolean fromCut;

    @C09CT("has_retake")
    public boolean hasRetake;

    @C09CT("is_single_video")
    public boolean isSingleVideo;

    @C09CT("is_sound_loop")
    public boolean isSoundLoop;

    @C09CT("left_slide_x")
    public float leftSlideX;

    @C09CT("music_duration")
    public int musicDuration;

    @C09CT("music_path")
    public String musicPath;

    @C09CT("music_trimin")
    public int musicTrimIn;

    @C09CT("music_volume")
    public float musicVolume;

    @C09CT("origin_volume")
    public float originVolume;

    @C09CT("video_duration")
    public int preVideoDuration;

    @C09CT("right_slide_x")
    public float rightSlideX;

    @C09CT("segment_list")
    public List<MultiEditVideoSegmentRecordData> segmentDataList;

    @C09CT("start_time")
    public long startTime;

    @C09CT("use_music")
    public boolean useMusic;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MultiEditVideoRecordData cloneData() {
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        multiEditVideoRecordData.concatVideo = this.concatVideo;
        multiEditVideoRecordData.concatAudio = this.concatAudio;
        multiEditVideoRecordData.useMusic = this.useMusic;
        multiEditVideoRecordData.startTime = this.startTime;
        multiEditVideoRecordData.endTime = this.endTime;
        multiEditVideoRecordData.leftSlideX = this.leftSlideX;
        multiEditVideoRecordData.rightSlideX = this.rightSlideX;
        multiEditVideoRecordData.curRecordingDir = this.curRecordingDir;
        multiEditVideoRecordData.setThreadSafeSegmentDataList(new ArrayList());
        List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
        if (list != null) {
            Iterator<MultiEditVideoSegmentRecordData> it2 = list.iterator();
            while (it2.hasNext()) {
                multiEditVideoRecordData.segmentDataList.add(it2.next().cloneData());
            }
        }
        multiEditVideoRecordData.musicPath = this.musicPath;
        multiEditVideoRecordData.originVolume = this.originVolume;
        multiEditVideoRecordData.musicVolume = this.musicVolume;
        multiEditVideoRecordData.hasRetake = this.hasRetake;
        multiEditVideoRecordData.musicTrimIn = this.musicTrimIn;
        multiEditVideoRecordData.musicDuration = this.musicDuration;
        multiEditVideoRecordData.preVideoDuration = this.preVideoDuration;
        multiEditVideoRecordData.coverPath = this.coverPath;
        multiEditVideoRecordData.isSingleVideo = this.isSingleVideo;
        multiEditVideoRecordData.isSoundLoop = this.isSoundLoop;
        multiEditVideoRecordData.fromCut = this.fromCut;
        multiEditVideoRecordData.fromAdvancedEdit = this.fromAdvancedEdit;
        return multiEditVideoRecordData;
    }

    public MultiEditVideoRecordData cloneSegmentDataList() {
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
        if (list != null && !list.isEmpty()) {
            multiEditVideoRecordData.setThreadSafeSegmentDataList(new ArrayList());
            Iterator<MultiEditVideoSegmentRecordData> it2 = this.segmentDataList.iterator();
            while (it2.hasNext()) {
                multiEditVideoRecordData.segmentDataList.add(it2.next().cloneData());
            }
        }
        return multiEditVideoRecordData;
    }

    public List<MediaModel> convertMediaModelList() {
        List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MultiEditVideoSegmentRecordData> it2 = this.segmentDataList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().convertModel());
        }
        if (this.isSingleVideo) {
            MediaModel mediaModel = (MediaModel) ListProtector.get(arrayList, 0);
            long j = this.startTime;
            mediaModel.startTime = (int) j;
            long j2 = this.endTime;
            mediaModel.endTime = (int) j2;
            mediaModel.duration = j2 - j;
        }
        return arrayList;
    }

    public Pair<Integer, Integer> getPlayInOutTime() {
        int i;
        long endTime;
        long j = this.startTime;
        int i2 = (int) j;
        long j2 = this.endTime;
        if (((int) (j2 - j)) > 0) {
            endTime = j2 - j;
        } else {
            List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
            if (list == null || list.isEmpty()) {
                i = 0;
                return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i2 + i));
            }
            endTime = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
                endTime += multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime();
            }
        }
        i = (int) endTime;
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i2 + i));
    }

    public void resetTimeData() {
        List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.startTime = 0L;
        this.endTime = 0L;
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
            multiEditVideoSegmentRecordData.resetTime();
            this.endTime += multiEditVideoSegmentRecordData.videoLength / 1000;
        }
    }

    public MultiEditVideoRecordData() {
        this.originVolume = 0.5f;
        this.musicVolume = 0.5f;
    }

    public boolean isPlaySingleSegmentMusic() {
        return this.musicDuration + LSPassThroughRecordSizeConfig.DEFAULT >= ((Integer) getPlayInOutTime().second).intValue() - ((Integer) getPlayInOutTime().first).intValue();
    }

    public MultiEditVideoRecordData(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.originVolume = 0.5f;
        this.musicVolume = 0.5f;
        setThreadSafeSegmentDataList(parcel.createTypedArrayList(MultiEditVideoSegmentRecordData.CREATOR));
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useMusic = z;
        this.concatVideo = parcel.readString();
        this.concatAudio = parcel.readString();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.leftSlideX = parcel.readFloat();
        this.rightSlideX = parcel.readFloat();
        this.curRecordingDir = parcel.readString();
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.hasRetake = z2;
        this.musicPath = parcel.readString();
        this.originVolume = parcel.readFloat();
        this.musicVolume = parcel.readFloat();
        this.musicTrimIn = parcel.readInt();
        this.musicDuration = parcel.readInt();
        this.preVideoDuration = parcel.readInt();
        this.coverPath = parcel.readString();
        if (parcel.readByte() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isSingleVideo = z3;
        if (parcel.readByte() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isSoundLoop = z4;
        if (parcel.readByte() == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.fromCut = z5;
        this.fromAdvancedEdit = parcel.readByte() == 1;
    }

    public void copyData(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData == null) {
            return;
        }
        this.startTime = multiEditVideoRecordData.startTime;
        this.endTime = multiEditVideoRecordData.endTime;
        this.leftSlideX = multiEditVideoRecordData.leftSlideX;
        this.rightSlideX = multiEditVideoRecordData.rightSlideX;
        this.useMusic = multiEditVideoRecordData.useMusic;
        this.concatVideo = multiEditVideoRecordData.concatVideo;
        this.concatAudio = multiEditVideoRecordData.concatAudio;
        this.musicVolume = multiEditVideoRecordData.musicVolume;
        this.originVolume = multiEditVideoRecordData.originVolume;
        this.musicPath = multiEditVideoRecordData.musicPath;
        this.hasRetake = multiEditVideoRecordData.hasRetake;
        this.musicTrimIn = multiEditVideoRecordData.musicTrimIn;
        this.musicDuration = multiEditVideoRecordData.musicDuration;
        this.preVideoDuration = multiEditVideoRecordData.preVideoDuration;
        this.coverPath = multiEditVideoRecordData.coverPath;
        this.isSingleVideo = multiEditVideoRecordData.isSingleVideo;
        this.isSoundLoop = multiEditVideoRecordData.isSoundLoop;
        this.fromCut = multiEditVideoRecordData.fromCut;
        this.fromAdvancedEdit = multiEditVideoRecordData.fromAdvancedEdit;
    }

    public boolean isEqual(MultiEditVideoRecordData multiEditVideoRecordData) {
        List<MultiEditVideoSegmentRecordData> list;
        List<MultiEditVideoSegmentRecordData> list2;
        if (multiEditVideoRecordData == null || (list = multiEditVideoRecordData.segmentDataList) == null || list.isEmpty() || (list2 = this.segmentDataList) == null || list2.isEmpty() || this.segmentDataList.size() != multiEditVideoRecordData.segmentDataList.size()) {
            return false;
        }
        for (int i = 0; i < this.segmentDataList.size(); i++) {
            if (!((MultiEditVideoSegmentRecordData) ListProtector.get(this.segmentDataList, i)).isEqual((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoRecordData.segmentDataList, i))) {
                return false;
            }
        }
        return true;
    }

    public boolean isEqualWithDeleteStatus(MultiEditVideoRecordData multiEditVideoRecordData) {
        List<MultiEditVideoSegmentRecordData> list;
        List<MultiEditVideoSegmentRecordData> list2;
        if (multiEditVideoRecordData == null || (list = multiEditVideoRecordData.segmentDataList) == null || list.isEmpty() || (list2 = this.segmentDataList) == null || list2.isEmpty() || this.segmentDataList.size() != multiEditVideoRecordData.segmentDataList.size()) {
            return false;
        }
        for (int i = 0; i < this.segmentDataList.size(); i++) {
            if (!((MultiEditVideoSegmentRecordData) ListProtector.get(this.segmentDataList, i)).isEqual((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoRecordData.segmentDataList, i)) || ((MultiEditVideoSegmentRecordData) ListProtector.get(this.segmentDataList, i)).enable != ((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoRecordData.segmentDataList, i)).enable) {
                return false;
            }
        }
        return true;
    }

    public void setThreadSafeSegmentDataList(List<MultiEditVideoSegmentRecordData> list) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_segment_data_list_thread_save_op", true, false)) {
            this.segmentDataList = new CopyOnWriteArrayList();
            if (list != null && !list.isEmpty()) {
                this.segmentDataList.addAll(list);
                return;
            }
            return;
        }
        this.segmentDataList = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.segmentDataList);
        parcel.writeByte(this.useMusic ? (byte) 1 : (byte) 0);
        parcel.writeString(this.concatVideo);
        parcel.writeString(this.concatAudio);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeFloat(this.leftSlideX);
        parcel.writeFloat(this.rightSlideX);
        parcel.writeString(this.curRecordingDir);
        parcel.writeByte(this.hasRetake ? (byte) 1 : (byte) 0);
        parcel.writeString(this.musicPath);
        parcel.writeFloat(this.originVolume);
        parcel.writeFloat(this.musicVolume);
        parcel.writeInt(this.musicTrimIn);
        parcel.writeInt(this.musicDuration);
        parcel.writeInt(this.preVideoDuration);
        parcel.writeString(this.coverPath);
        parcel.writeByte(this.isSingleVideo ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSoundLoop ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.fromCut ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.fromAdvancedEdit ? (byte) 1 : (byte) 0);
    }
}
