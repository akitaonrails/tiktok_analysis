package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LivePhotoStruct implements Serializable {

    @C09CT("is_live_photo")
    public boolean isLivePhoto;

    @C09CT("live_photo_type")
    public int livePhotoType;

    @C09CT("live_photo_vid")
    public String livePhotoVid;

    @C09CT("live_photo")
    public Video videoModel;

    public LivePhotoStruct() {
        this(false, null, null, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePhotoStruct)) {
            return false;
        }
        LivePhotoStruct livePhotoStruct = (LivePhotoStruct) obj;
        return this.isLivePhoto == livePhotoStruct.isLivePhoto && Intrinsics.LJFF(this.livePhotoVid, livePhotoStruct.livePhotoVid) && Intrinsics.LJFF(this.videoModel, livePhotoStruct.videoModel) && this.livePhotoType == livePhotoStruct.livePhotoType;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePhotoStruct(isLivePhoto=");
        sbLIZ.append(this.isLivePhoto);
        sbLIZ.append(", livePhotoVid=");
        sbLIZ.append(this.livePhotoVid);
        sbLIZ.append(", videoModel=");
        sbLIZ.append(this.videoModel);
        sbLIZ.append(", livePhotoType=");
        sbLIZ.append(this.livePhotoType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isLivePhoto() {
        return this.isLivePhoto;
    }

    public LivePhotoStruct(boolean z, String str, Video video, int i) {
        this.isLivePhoto = z;
        this.livePhotoVid = str;
        this.videoModel = video;
        this.livePhotoType = i;
    }
}
