package com.ss.android.ugc.aweme.creative.model.edit.multiedit;

import X.C09CT;
import X.C0MY0;
import X.C1466660oGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes23.dex */
public class MultiEditVideoStatusRecordData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditVideoStatusRecordData> CREATOR = new C1466660oGm(6);

    @C09CT("edit_adjust_clips_state")
    public EditAdjustClipsState adjustClipsState;

    @C09CT("cover_img_path")
    @C0MY0
    public String coverImagePath;

    @C09CT("cover_img_path_temp")
    @C0MY0
    public String coverImageTempPath;

    @C09CT("cur_multi_edit_data")
    public MultiEditVideoRecordData curMultiEditVideoRecordData;

    @C09CT("cur_select_index")
    public int currentEditIndex;

    @C09CT("edit_cut_segments")
    public ArrayList<TimeSpeedModelExtension> editCutSegments;

    @C09CT("edit_segments")
    public ArrayList<TimeSpeedModelExtension> editSegments;

    @C09CT("is_multi_edit_retake")
    public boolean isMultiEditRetake;

    @C09CT("is_support_multi_edit")
    public boolean isSupportMultiEdit;

    @C09CT("is_use_multi_edit")
    public boolean isUseMultiEdit;

    @C09CT("origin_multi_edit_data")
    public MultiEditVideoRecordData originMultiEditRecordData;

    @C09CT("original_music_start")
    public int originalMusicStart;

    @C09CT("original_segments")
    public ArrayList<TimeSpeedModelExtension> originalSegments;

    @C09CT("record_music")
    public AVMusic recordMusic;

    @C09CT("restore_multi_edit_data")
    public MultiEditVideoRecordData restoreMultiEditVideoRecordData;

    @C09CT("restore_edit_segments")
    public ArrayList<TimeSpeedModelExtension> restoreSegments;

    @C09CT("segment_size_change")
    public boolean segmentSizeChange;

    @C09CT("single_restore_multi_edit_data")
    public MultiEditVideoRecordData singleRestoreMultiEditRecordData;

    @C09CT("single_restore_segments")
    public ArrayList<TimeSpeedModelExtension> singleRestoreSegments;

    @C09CT("video_meta_data")
    public String videoMetaData;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MultiEditVideoStatusRecordData() {
        this.currentEditIndex = -1;
    }

    public MultiEditVideoStatusRecordData(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.currentEditIndex = -1;
        this.curMultiEditVideoRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.restoreMultiEditVideoRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.singleRestoreMultiEditRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.originMultiEditRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.currentEditIndex = parcel.readInt();
        if (parcel.readByte() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.segmentSizeChange = z;
        Parcelable.Creator<TimeSpeedModelExtension> creator = TimeSpeedModelExtension.CREATOR;
        this.originalSegments = parcel.createTypedArrayList(creator);
        this.editSegments = parcel.createTypedArrayList(creator);
        this.restoreSegments = parcel.createTypedArrayList(creator);
        this.singleRestoreSegments = parcel.createTypedArrayList(creator);
        this.editCutSegments = parcel.createTypedArrayList(creator);
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isMultiEditRetake = z2;
        if (parcel.readByte() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isUseMultiEdit = z3;
        this.coverImagePath = parcel.readString();
        this.coverImageTempPath = parcel.readString();
        this.recordMusic = (AVMusic) parcel.readSerializable();
        this.originalMusicStart = parcel.readInt();
        this.videoMetaData = parcel.readString();
        this.isSupportMultiEdit = parcel.readByte() == 1;
        this.adjustClipsState = (EditAdjustClipsState) parcel.readParcelable(EditAdjustClipsState.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.curMultiEditVideoRecordData, i);
        parcel.writeParcelable(this.restoreMultiEditVideoRecordData, i);
        parcel.writeParcelable(this.singleRestoreMultiEditRecordData, i);
        parcel.writeParcelable(this.originMultiEditRecordData, i);
        parcel.writeInt(this.currentEditIndex);
        parcel.writeByte(this.segmentSizeChange ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.originalSegments);
        parcel.writeTypedList(this.editSegments);
        parcel.writeTypedList(this.restoreSegments);
        parcel.writeTypedList(this.singleRestoreSegments);
        parcel.writeTypedList(this.editCutSegments);
        parcel.writeByte(this.isMultiEditRetake ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isUseMultiEdit ? (byte) 1 : (byte) 0);
        parcel.writeString(this.coverImagePath);
        parcel.writeString(this.coverImageTempPath);
        parcel.writeSerializable(this.recordMusic);
        parcel.writeInt(this.originalMusicStart);
        parcel.writeString(this.videoMetaData);
        parcel.writeByte(this.isSupportMultiEdit ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.adjustClipsState, i);
    }
}
