package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentLivePhotoInfoModel implements Serializable {
    public transient String localVideoPath;

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("vid")
    public final String videoId;

    public CommentLivePhotoInfoModel() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentLivePhotoInfoModel)) {
            return false;
        }
        CommentLivePhotoInfoModel commentLivePhotoInfoModel = (CommentLivePhotoInfoModel) obj;
        return Intrinsics.LJFF(this.videoId, commentLivePhotoInfoModel.videoId) && Intrinsics.LJFF(this.urlList, commentLivePhotoInfoModel.urlList) && Intrinsics.LJFF(this.localVideoPath, commentLivePhotoInfoModel.localVideoPath);
    }

    public int hashCode() {
        String str = this.videoId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.localVideoPath;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentLivePhotoInfoModel(videoId=");
        sbLIZ.append(this.videoId);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", localVideoPath=");
        sbLIZ.append(this.localVideoPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setLocalVideoPath(String str) {
        this.localVideoPath = str;
    }

    public final void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public CommentLivePhotoInfoModel(String str, List<String> list, String str2) {
        this.videoId = str;
        this.urlList = list;
        this.localVideoPath = str2;
    }
}
