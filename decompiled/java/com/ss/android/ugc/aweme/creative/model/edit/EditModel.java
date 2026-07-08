package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.EditModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import dmt.av.video.SingleImageCoverBitmapData;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class EditModel implements Parcelable {
    public static final Parcelable.Creator<EditModel> CREATOR = new Parcelable.Creator<EditModel>() { // from class: X.0L1o
        @Override // android.os.Parcelable.Creator
        public final EditModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            SingleImageCoverBitmapData singleImageCoverBitmapDataCreateFromParcel;
            boolean z5;
            boolean z6;
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = (MultiEditVideoStatusRecordData) parcel.readParcelable(EditModel.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            EditPreviewInfo editPreviewInfo = (EditPreviewInfo) parcel.readParcelable(EditModel.class.getClassLoader());
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                singleImageCoverBitmapDataCreateFromParcel = null;
            } else {
                singleImageCoverBitmapDataCreateFromParcel = SingleImageCoverBitmapData.CREATOR.createFromParcel(parcel);
            }
            SingleImageCoverBitmapData singleImageCoverBitmapData = singleImageCoverBitmapDataCreateFromParcel;
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashSet.add(parcel.readString());
            }
            return new EditModel(multiEditVideoStatusRecordData, string, z, editPreviewInfo, j, j2, z2, z3, z4, i, singleImageCoverBitmapData, z5, z6, linkedHashSet, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditModel[] newArray(int i) {
            return new EditModel[i];
        }
    };

    @C040H
    public long clickGoNextBtnTime;

    @C040H
    public long clickGoNextBtnTimeInEditorPro;

    @C09CT("edit_music_sync_mode")
    public boolean editMusicSyncMode;

    @C040H
    public EditPreviewInfo editPreviewInfo;

    @C040H
    public boolean enableSkipStickPointRes;

    @C040H
    public String frameUploadPathForAIMusic;

    @C040H
    public boolean fromCut;

    @C040H
    public boolean fromMultiCut;

    @C040H
    public boolean hasClickNext;

    @C040H
    public boolean hasJumpToPublish;

    @C040H
    public boolean isFromEditAutoCut;

    @C040H
    public boolean isSdkShareClickSaveDraft;

    @C040H
    public MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;

    @C040H
    public Set<String> originalNLEResourceInfo;

    @C040H
    public VideoFileInfo originalVideoInfo;

    @C09CT("sdk_source_app")
    public String sdkSourceApp;

    @C040H
    public boolean showFirstTimeAnim;

    @C040H
    public SingleImageCoverBitmapData singleImageCoverBitmapData;

    @C09CT("story_canvas_bg_color_from_album_end")
    public Integer storyCanvasBgColorFromAlbumEnd;

    @C09CT("story_canvas_bg_color_from_album_start")
    public Integer storyCanvasBgColorFromAlbumStart;

    @C040H
    public boolean supportRetake;

    @C040H
    public int videoDurationFromVideoCutPage;

    public EditModel() {
        this(null, null, false, null, -1L, -1L, false, false, true, -1, null, false, true, new LinkedHashSet(), "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.multiEditVideoStatusRecordData, i);
        parcel.writeString(this.frameUploadPathForAIMusic);
        parcel.writeInt(this.editMusicSyncMode ? 1 : 0);
        parcel.writeParcelable(this.editPreviewInfo, i);
        parcel.writeLong(this.clickGoNextBtnTimeInEditorPro);
        parcel.writeLong(this.clickGoNextBtnTime);
        parcel.writeInt(this.fromCut ? 1 : 0);
        parcel.writeInt(this.fromMultiCut ? 1 : 0);
        parcel.writeInt(this.supportRetake ? 1 : 0);
        parcel.writeInt(this.videoDurationFromVideoCutPage);
        SingleImageCoverBitmapData singleImageCoverBitmapData = this.singleImageCoverBitmapData;
        if (singleImageCoverBitmapData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            singleImageCoverBitmapData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isFromEditAutoCut ? 1 : 0);
        parcel.writeInt(this.showFirstTimeAnim ? 1 : 0);
        Set<String> set = this.originalNLEResourceInfo;
        parcel.writeInt(set.size());
        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next());
        }
        parcel.writeString(this.sdkSourceApp);
    }

    public EditModel(MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, String str, boolean z, EditPreviewInfo editPreviewInfo, long j, long j2, boolean z2, boolean z3, boolean z4, int i, SingleImageCoverBitmapData singleImageCoverBitmapData, boolean z5, boolean z6, Set<String> set, String str2) {
        this.multiEditVideoStatusRecordData = multiEditVideoStatusRecordData;
        this.frameUploadPathForAIMusic = str;
        this.editMusicSyncMode = z;
        this.editPreviewInfo = editPreviewInfo;
        this.clickGoNextBtnTimeInEditorPro = j;
        this.clickGoNextBtnTime = j2;
        this.fromCut = z2;
        this.fromMultiCut = z3;
        this.supportRetake = z4;
        this.videoDurationFromVideoCutPage = i;
        this.singleImageCoverBitmapData = singleImageCoverBitmapData;
        this.isFromEditAutoCut = z5;
        this.showFirstTimeAnim = z6;
        this.originalNLEResourceInfo = set;
        this.sdkSourceApp = str2;
    }
}
