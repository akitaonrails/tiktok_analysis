package com.ss.android.ugc.aweme.creative.model.video2sticker;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.video2sticker.EditVideoInfo;
import com.ss.android.ugc.aweme.creative.model.video2sticker.OriginVideoInfo;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.ugc.aweme.creative.model.video2sticker.VideoCropData;
import com.ss.android.ugc.aweme.creative.model.video2sticker.VideoTimeTrimData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class Video2StickerModel implements Parcelable {
    public static final Parcelable.Creator<Video2StickerModel> CREATOR = new Parcelable.Creator<Video2StickerModel>() { // from class: X.0nXW
        @Override // android.os.Parcelable.Creator
        public final Video2StickerModel createFromParcel(Parcel parcel) {
            return new Video2StickerModel(OriginVideoInfo.CREATOR.createFromParcel(parcel), VideoCropData.CREATOR.createFromParcel(parcel), VideoTimeTrimData.CREATOR.createFromParcel(parcel), EditVideoInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Video2StickerModel[] newArray(int i) {
            return new Video2StickerModel[i];
        }
    };

    @C040H
    public EditVideoInfo editVideoInfo;

    @C040H
    public OriginVideoInfo originVideoInfo;

    @C040H
    public VideoCropData videoCropData;

    @C040H
    public VideoTimeTrimData videoTimeTrimData;

    public Video2StickerModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video2StickerModel)) {
            return false;
        }
        Video2StickerModel video2StickerModel = (Video2StickerModel) obj;
        return Intrinsics.LJFF(this.originVideoInfo, video2StickerModel.originVideoInfo) && Intrinsics.LJFF(this.videoCropData, video2StickerModel.videoCropData) && Intrinsics.LJFF(this.videoTimeTrimData, video2StickerModel.videoTimeTrimData) && Intrinsics.LJFF(this.editVideoInfo, video2StickerModel.editVideoInfo);
    }

    public final int hashCode() {
        return (((((this.originVideoInfo.hashCode() * 31) + this.videoCropData.hashCode()) * 31) + this.videoTimeTrimData.hashCode()) * 31) + this.editVideoInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Video2StickerModel(originVideoInfo=");
        sbLIZ.append(this.originVideoInfo);
        sbLIZ.append(", videoCropData=");
        sbLIZ.append(this.videoCropData);
        sbLIZ.append(", videoTimeTrimData=");
        sbLIZ.append(this.videoTimeTrimData);
        sbLIZ.append(", editVideoInfo=");
        sbLIZ.append(this.editVideoInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.originVideoInfo.writeToParcel(parcel, i);
        this.videoCropData.writeToParcel(parcel, i);
        this.videoTimeTrimData.writeToParcel(parcel, i);
        this.editVideoInfo.writeToParcel(parcel, i);
    }

    public /* synthetic */ Video2StickerModel(int i) {
        this(new OriginVideoInfo("", 0, 0L, 0, "", "", 0L, ""), new VideoCropData(null, 0.0f, 0.0f, 1), new VideoTimeTrimData(0L, 2500L, false), new EditVideoInfo(1.0f, 0.0f, 0.0f, 0.0f));
    }

    public Video2StickerModel(OriginVideoInfo originVideoInfo, VideoCropData videoCropData, VideoTimeTrimData videoTimeTrimData, EditVideoInfo editVideoInfo) {
        this.originVideoInfo = originVideoInfo;
        this.videoCropData = videoCropData;
        this.videoTimeTrimData = videoTimeTrimData;
        this.editVideoInfo = editVideoInfo;
    }
}
