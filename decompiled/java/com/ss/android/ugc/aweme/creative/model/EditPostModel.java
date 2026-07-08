package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AltTextChangeStatus;
import com.ss.android.ugc.aweme.creative.model.EditCapCutReuseModel;
import com.ss.android.ugc.aweme.creative.model.EditPostCheckResult;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.poi.PoiPublishInfoModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiReTagInfo;
import com.ss.android.ugc.aweme.poi.UgcPoiTicketDetail;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class EditPostModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditPostModel> CREATOR = new Parcelable.Creator<EditPostModel>() { // from class: X.0nf0
        @Override // android.os.Parcelable.Creator
        public final EditPostModel createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            EditPostCheckResult editPostCheckResultCreateFromParcel;
            EditCapCutReuseModel.MusicInfo musicInfoCreateFromParcel;
            boolean z2;
            Integer numValueOf;
            ArrayList arrayList2;
            PoiPublishInfoModel poiPublishInfoModelCreateFromParcel;
            ArrayList arrayList3;
            ArrayList arrayList4;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            VideoUrlModel videoUrlModel = (VideoUrlModel) parcel.readSerializable();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) parcel.readSerializable();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AVTextExtraStruct.CREATOR.createFromParcel(parcel));
                }
            }
            String string3 = parcel.readString();
            UrlModel urlModel2 = (UrlModel) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                editPostCheckResultCreateFromParcel = null;
            } else {
                editPostCheckResultCreateFromParcel = EditPostCheckResult.CREATOR.createFromParcel(parcel);
            }
            EditPostCheckResult editPostCheckResult = editPostCheckResultCreateFromParcel;
            long j = parcel.readLong();
            if (parcel.readInt() == 0) {
                musicInfoCreateFromParcel = null;
            } else {
                musicInfoCreateFromParcel = EditCapCutReuseModel.MusicInfo.CREATOR.createFromParcel(parcel);
            }
            EditCapCutReuseModel.MusicInfo musicInfo = musicInfoCreateFromParcel;
            UrlModel urlModel3 = (UrlModel) parcel.readSerializable();
            int i3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            EditPostPermission editPostPermission = (EditPostPermission) parcel.readSerializable();
            PoiData poiData = (PoiData) parcel.readSerializable();
            PoiData poiData2 = (PoiData) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i6 = parcel.readInt();
                arrayList2 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList2.add(parcel.readSerializable());
                }
            }
            String string5 = parcel.readString();
            UrlModel urlModel4 = (UrlModel) parcel.readSerializable();
            AltTextChangeStatus altTextChangeStatusCreateFromParcel = AltTextChangeStatus.CREATOR.createFromParcel(parcel);
            PoiReTagInfo poiReTagInfo = (PoiReTagInfo) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                poiPublishInfoModelCreateFromParcel = null;
            } else {
                poiPublishInfoModelCreateFromParcel = PoiPublishInfoModel.CREATOR.createFromParcel(parcel);
            }
            PoiPublishInfoModel poiPublishInfoModel = poiPublishInfoModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i8 = parcel.readInt();
                arrayList3 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList3.add(parcel.readSerializable());
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i10 = parcel.readInt();
                arrayList4 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList4.add(parcel.readSerializable());
                }
            }
            return new EditPostModel(z, videoUrlModel, urlModel, simVideoUrlModel, string, string2, arrayList, string3, urlModel2, editPostCheckResult, j, musicInfo, urlModel3, i3, z2, i4, i5, editPostPermission, poiData, poiData2, numValueOf, string4, arrayList2, string5, urlModel4, altTextChangeStatusCreateFromParcel, poiReTagInfo, poiPublishInfoModel, arrayList3, arrayList4, (UgcPoiTicketDetail) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final EditPostModel[] newArray(int i) {
            return new EditPostModel[i];
        }
    };

    @C040H
    @C09CT("anchor_text")
    public String anchorText;

    @C040H
    @C09CT("anchor_url_model")
    public UrlModel anchorUrlModel;

    @C040H
    @C09CT("text_extra")
    public List<AVTextExtraStruct> avTextExtraForBackUp;

    @C040H
    @C09CT("aweme_create_time")
    public long awemeCreateTime;

    @C040H
    @C09CT("aweme_id")
    public String awemeId;

    @C040H
    @C09CT("aweme_type")
    public Integer awemeType;

    @C040H
    @C09CT("backup_markup_text")
    public String backupMarkUpText;

    @C040H
    @C09CT("edit_post_check_result")
    public EditPostCheckResult editPostCheckResult;

    @C040H
    @C09CT("edit_post_permission")
    public EditPostPermission editPostPermission;

    @C040H
    @C09CT("anchors")
    public List<AnchorTransData> editedAnchors;

    @C040H
    @C09CT("images")
    public List<PhotoModeImageUrlModel> imageList;

    @C040H
    @C09CT("is_change_alt_text")
    public AltTextChangeStatus isChangeAltText;

    @C040H
    @C09CT("is_changge_cover")
    public boolean isChangeCover;

    @C040H
    @C09CT("is_duet_video")
    public boolean isDuet;

    @C040H
    @C09CT("markup_text")
    public String markUpText;

    @C040H
    @C09CT("aweme_musci_info")
    public EditCapCutReuseModel.MusicInfo musicInfo;

    @C040H
    @C09CT("aweme_music_url_model")
    public UrlModel musicUrlModel;

    @C040H
    @C09CT("origin_poi_data")
    public PoiData originPoiData;

    @C040H
    @C09CT("original_anchors")
    public List<AnchorCommonStruct> originalAnchors;

    @C040H
    @C09CT("video_permission")
    public int permission;

    @C040H
    @C09CT("photo_mode_heading")
    public String photoModeHeading;

    @C040H
    @C09CT("poi_data")
    public PoiData poiData;

    @C040H
    @C09CT("poi_publish_info_model")
    public PoiPublishInfoModel poiPublishInfoModel;

    @C040H
    @C09CT("poi_retag_config")
    public PoiReTagInfo poiReTagInfo;

    @C040H
    @C09CT("ugc_poi_ticket_detail")
    public UgcPoiTicketDetail ugcPoiTicketDetail;

    @C040H
    @C09CT("video_cache_model")
    public SimVideoUrlModel videoCacheModel;

    @C040H
    @C09CT("compiled_video_canvasHeight")
    public int videoCanvasHeight;

    @C040H
    @C09CT("compiled_video_canvasWidth")
    public int videoCanvasWidth;

    @C040H
    @C09CT("video_cover_addr")
    public UrlModel videoCoverAddr;

    @C040H
    @C09CT("video_dynamicCover_addr")
    public UrlModel videoDynamicCover;

    @C040H
    @C09CT("video_play_addr")
    public VideoUrlModel videoPlayAddr;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public EditPostModel() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        this(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr, objArr2, objArr3, objArr4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, Integer.MAX_VALUE, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isDuet ? 1 : 0);
        parcel.writeSerializable(this.videoPlayAddr);
        parcel.writeSerializable(this.videoCoverAddr);
        parcel.writeSerializable(this.videoCacheModel);
        parcel.writeString(this.markUpText);
        parcel.writeString(this.backupMarkUpText);
        List<AVTextExtraStruct> list = this.avTextExtraForBackUp;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AVTextExtraStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.anchorText);
        parcel.writeSerializable(this.anchorUrlModel);
        EditPostCheckResult editPostCheckResult = this.editPostCheckResult;
        if (editPostCheckResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            editPostCheckResult.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.awemeCreateTime);
        EditCapCutReuseModel.MusicInfo musicInfo = this.musicInfo;
        if (musicInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicInfo.writeToParcel(parcel, i);
        }
        parcel.writeSerializable(this.musicUrlModel);
        parcel.writeInt(this.permission);
        parcel.writeInt(this.isChangeCover ? 1 : 0);
        parcel.writeInt(this.videoCanvasWidth);
        parcel.writeInt(this.videoCanvasHeight);
        parcel.writeSerializable(this.editPostPermission);
        parcel.writeSerializable(this.originPoiData);
        parcel.writeSerializable(this.poiData);
        Integer num = this.awemeType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.awemeId);
        List<PhotoModeImageUrlModel> list2 = this.imageList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<PhotoModeImageUrlModel> it3 = list2.iterator();
            while (it3.hasNext()) {
                parcel.writeSerializable(it3.next());
            }
        }
        parcel.writeString(this.photoModeHeading);
        parcel.writeSerializable(this.videoDynamicCover);
        this.isChangeAltText.writeToParcel(parcel, i);
        parcel.writeSerializable(this.poiReTagInfo);
        PoiPublishInfoModel poiPublishInfoModel = this.poiPublishInfoModel;
        if (poiPublishInfoModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            poiPublishInfoModel.writeToParcel(parcel, i);
        }
        List<AnchorCommonStruct> list3 = this.originalAnchors;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<AnchorCommonStruct> it4 = list3.iterator();
            while (it4.hasNext()) {
                parcel.writeSerializable(it4.next());
            }
        }
        List<AnchorTransData> list4 = this.editedAnchors;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<AnchorTransData> it5 = list4.iterator();
            while (it5.hasNext()) {
                parcel.writeSerializable(it5.next());
            }
        }
        parcel.writeSerializable(this.ugcPoiTicketDetail);
    }

    public final String getAnchorText() {
        return this.anchorText;
    }

    public final UrlModel getAnchorUrlModel() {
        return this.anchorUrlModel;
    }

    public final List<AVTextExtraStruct> getAvTextExtraForBackUp() {
        return this.avTextExtraForBackUp;
    }

    public final long getAwemeCreateTime() {
        return this.awemeCreateTime;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final Integer getAwemeType() {
        return this.awemeType;
    }

    public final String getBackupMarkUpText() {
        return this.backupMarkUpText;
    }

    public final EditPostCheckResult getEditPostCheckResult() {
        return this.editPostCheckResult;
    }

    public final EditPostPermission getEditPostPermission() {
        return this.editPostPermission;
    }

    public final List<AnchorTransData> getEditedAnchors() {
        return this.editedAnchors;
    }

    public final List<PhotoModeImageUrlModel> getImageList() {
        return this.imageList;
    }

    public final String getMarkUpText() {
        return this.markUpText;
    }

    public final EditCapCutReuseModel.MusicInfo getMusicInfo() {
        return this.musicInfo;
    }

    public final UrlModel getMusicUrlModel() {
        return this.musicUrlModel;
    }

    public final PoiData getOriginPoiData() {
        return this.originPoiData;
    }

    public final List<AnchorCommonStruct> getOriginalAnchors() {
        return this.originalAnchors;
    }

    public final int getPermission() {
        return this.permission;
    }

    public final String getPhotoModeHeading() {
        return this.photoModeHeading;
    }

    public final PoiData getPoiData() {
        return this.poiData;
    }

    public final PoiPublishInfoModel getPoiPublishInfoModel() {
        return this.poiPublishInfoModel;
    }

    public final PoiReTagInfo getPoiReTagInfo() {
        return this.poiReTagInfo;
    }

    public final UgcPoiTicketDetail getUgcPoiTicketDetail() {
        return this.ugcPoiTicketDetail;
    }

    public final SimVideoUrlModel getVideoCacheModel() {
        return this.videoCacheModel;
    }

    public final int getVideoCanvasHeight() {
        return this.videoCanvasHeight;
    }

    public final int getVideoCanvasWidth() {
        return this.videoCanvasWidth;
    }

    public final UrlModel getVideoCoverAddr() {
        return this.videoCoverAddr;
    }

    public final UrlModel getVideoDynamicCover() {
        return this.videoDynamicCover;
    }

    public final VideoUrlModel getVideoPlayAddr() {
        return this.videoPlayAddr;
    }

    public final AltTextChangeStatus isChangeAltText() {
        return this.isChangeAltText;
    }

    public final boolean isChangeCover() {
        return this.isChangeCover;
    }

    public final boolean isDuet() {
        return this.isDuet;
    }

    public final void setAnchorText(String str) {
        this.anchorText = str;
    }

    public final void setAnchorUrlModel(UrlModel urlModel) {
        this.anchorUrlModel = urlModel;
    }

    public final void setAvTextExtraForBackUp(List<AVTextExtraStruct> list) {
        this.avTextExtraForBackUp = list;
    }

    public final void setAwemeCreateTime(long j) {
        this.awemeCreateTime = j;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setAwemeType(Integer num) {
        this.awemeType = num;
    }

    public final void setBackupMarkUpText(String str) {
        this.backupMarkUpText = str;
    }

    public final void setChangeAltText(AltTextChangeStatus altTextChangeStatus) {
        this.isChangeAltText = altTextChangeStatus;
    }

    public final void setChangeCover(boolean z) {
        this.isChangeCover = z;
    }

    public final void setDuet(boolean z) {
        this.isDuet = z;
    }

    public final void setEditPostCheckResult(EditPostCheckResult editPostCheckResult) {
        this.editPostCheckResult = editPostCheckResult;
    }

    public final void setEditPostPermission(EditPostPermission editPostPermission) {
        this.editPostPermission = editPostPermission;
    }

    public final void setEditedAnchors(List<AnchorTransData> list) {
        this.editedAnchors = list;
    }

    public final void setImageList(List<PhotoModeImageUrlModel> list) {
        this.imageList = list;
    }

    public final void setMarkUpText(String str) {
        this.markUpText = str;
    }

    public final void setMusicInfo(EditCapCutReuseModel.MusicInfo musicInfo) {
        this.musicInfo = musicInfo;
    }

    public final void setMusicUrlModel(UrlModel urlModel) {
        this.musicUrlModel = urlModel;
    }

    public final void setOriginPoiData(PoiData poiData) {
        this.originPoiData = poiData;
    }

    public final void setOriginalAnchors(List<AnchorCommonStruct> list) {
        this.originalAnchors = list;
    }

    public final void setPermission(int i) {
        this.permission = i;
    }

    public final void setPhotoModeHeading(String str) {
        this.photoModeHeading = str;
    }

    public final void setPoiData(PoiData poiData) {
        this.poiData = poiData;
    }

    public final void setPoiPublishInfoModel(PoiPublishInfoModel poiPublishInfoModel) {
        this.poiPublishInfoModel = poiPublishInfoModel;
    }

    public final void setPoiReTagInfo(PoiReTagInfo poiReTagInfo) {
        this.poiReTagInfo = poiReTagInfo;
    }

    public final void setUgcPoiTicketDetail(UgcPoiTicketDetail ugcPoiTicketDetail) {
        this.ugcPoiTicketDetail = ugcPoiTicketDetail;
    }

    public final void setVideoCacheModel(SimVideoUrlModel simVideoUrlModel) {
        this.videoCacheModel = simVideoUrlModel;
    }

    public final void setVideoCanvasHeight(int i) {
        this.videoCanvasHeight = i;
    }

    public final void setVideoCanvasWidth(int i) {
        this.videoCanvasWidth = i;
    }

    public final void setVideoCoverAddr(UrlModel urlModel) {
        this.videoCoverAddr = urlModel;
    }

    public final void setVideoDynamicCover(UrlModel urlModel) {
        this.videoDynamicCover = urlModel;
    }

    public final void setVideoPlayAddr(VideoUrlModel videoUrlModel) {
        this.videoPlayAddr = videoUrlModel;
    }

    public EditPostModel(boolean z, VideoUrlModel videoUrlModel, UrlModel urlModel, SimVideoUrlModel simVideoUrlModel, String str, String str2, List<AVTextExtraStruct> list, String str3, UrlModel urlModel2, EditPostCheckResult editPostCheckResult, long j, EditCapCutReuseModel.MusicInfo musicInfo, UrlModel urlModel3, int i, boolean z2, int i2, int i3, EditPostPermission editPostPermission, PoiData poiData, PoiData poiData2, Integer num, String str4, List<PhotoModeImageUrlModel> list2, String str5, UrlModel urlModel4, AltTextChangeStatus altTextChangeStatus, PoiReTagInfo poiReTagInfo, PoiPublishInfoModel poiPublishInfoModel, List<AnchorCommonStruct> list3, List<AnchorTransData> list4, UgcPoiTicketDetail ugcPoiTicketDetail) {
        this.isDuet = z;
        this.videoPlayAddr = videoUrlModel;
        this.videoCoverAddr = urlModel;
        this.videoCacheModel = simVideoUrlModel;
        this.markUpText = str;
        this.backupMarkUpText = str2;
        this.avTextExtraForBackUp = list;
        this.anchorText = str3;
        this.anchorUrlModel = urlModel2;
        this.editPostCheckResult = editPostCheckResult;
        this.awemeCreateTime = j;
        this.musicInfo = musicInfo;
        this.musicUrlModel = urlModel3;
        this.permission = i;
        this.isChangeCover = z2;
        this.videoCanvasWidth = i2;
        this.videoCanvasHeight = i3;
        this.editPostPermission = editPostPermission;
        this.originPoiData = poiData;
        this.poiData = poiData2;
        this.awemeType = num;
        this.awemeId = str4;
        this.imageList = list2;
        this.photoModeHeading = str5;
        this.videoDynamicCover = urlModel4;
        this.isChangeAltText = altTextChangeStatus;
        this.poiReTagInfo = poiReTagInfo;
        this.poiPublishInfoModel = poiPublishInfoModel;
        this.originalAnchors = list3;
        this.editedAnchors = list4;
        this.ugcPoiTicketDetail = ugcPoiTicketDetail;
    }

    public /* synthetic */ EditPostModel(boolean z, VideoUrlModel videoUrlModel, UrlModel urlModel, SimVideoUrlModel simVideoUrlModel, String str, String str2, List list, String str3, UrlModel urlModel2, EditPostCheckResult editPostCheckResult, long j, EditCapCutReuseModel.MusicInfo musicInfo, UrlModel urlModel3, int i, boolean z2, int i2, int i3, EditPostPermission editPostPermission, PoiData poiData, PoiData poiData2, Integer num, String str4, List list2, String str5, UrlModel urlModel4, AltTextChangeStatus altTextChangeStatus, PoiReTagInfo poiReTagInfo, PoiPublishInfoModel poiPublishInfoModel, List list3, List list4, UgcPoiTicketDetail ugcPoiTicketDetail, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? null : videoUrlModel, (i4 & 4) != 0 ? null : urlModel, (i4 & 8) != 0 ? null : simVideoUrlModel, (i4 & 16) != 0 ? "" : str, (i4 & 32) == 0 ? str2 : "", (i4 & 64) != 0 ? null : list, (i4 & 128) != 0 ? null : str3, (i4 & 256) != 0 ? null : urlModel2, (i4 & 512) != 0 ? null : editPostCheckResult, (i4 & 1024) != 0 ? 0L : j, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : musicInfo, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : urlModel3, (i4 & 8192) != 0 ? 0 : i, (i4 & 16384) != 0 ? false : z2, (32768 & i4) != 0 ? -1 : i2, (65536 & i4) == 0 ? i3 : -1, (131072 & i4) != 0 ? null : editPostPermission, (262144 & i4) != 0 ? null : poiData, (524288 & i4) != 0 ? null : poiData2, (1048576 & i4) != 0 ? null : num, (2097152 & i4) != 0 ? null : str4, (4194304 & i4) != 0 ? null : list2, (8388608 & i4) != 0 ? null : str5, (16777216 & i4) != 0 ? null : urlModel4, (33554432 & i4) != 0 ? new AltTextChangeStatus(false, 0, 0, 0) : altTextChangeStatus, (67108864 & i4) != 0 ? null : poiReTagInfo, (134217728 & i4) != 0 ? null : poiPublishInfoModel, (268435456 & i4) != 0 ? null : list3, (536870912 & i4) != 0 ? null : list4, (i4 & 1073741824) != 0 ? null : ugcPoiTicketDetail);
    }
}
