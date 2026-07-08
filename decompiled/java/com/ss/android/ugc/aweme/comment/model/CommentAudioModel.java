package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentAudioModel implements Serializable {

    @C09CT("enable_ssl")
    public final Boolean enableSsl;

    @C09CT("media_type")
    public final String mediaType;

    @C09CT("message")
    public final String message;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("url_expire")
    public final Long urlExpire;

    @C09CT("version")
    public final Integer version;

    @C09CT("video_duration")
    public final Double videoDuration;

    @C09CT("video_id")
    public final String videoId;

    @C09CT("video_list")
    public final List<VideoItem> videoList;

    @C09CT("volume")
    public final Volume volume;

    public CommentAudioModel() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentAudioModel)) {
            return false;
        }
        CommentAudioModel commentAudioModel = (CommentAudioModel) obj;
        return Intrinsics.LJFF(this.status, commentAudioModel.status) && Intrinsics.LJFF(this.message, commentAudioModel.message) && Intrinsics.LJFF(this.version, commentAudioModel.version) && Intrinsics.LJFF(this.videoId, commentAudioModel.videoId) && Intrinsics.LJFF(this.enableSsl, commentAudioModel.enableSsl) && Intrinsics.LJFF(this.videoDuration, commentAudioModel.videoDuration) && Intrinsics.LJFF(this.mediaType, commentAudioModel.mediaType) && Intrinsics.LJFF(this.urlExpire, commentAudioModel.urlExpire) && Intrinsics.LJFF(this.videoList, commentAudioModel.videoList) && Intrinsics.LJFF(this.volume, commentAudioModel.volume);
    }

    public int hashCode() {
        Integer num = this.status;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.version;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.videoId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.enableSsl;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.videoDuration;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.mediaType;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.urlExpire;
        int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        List<VideoItem> list = this.videoList;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Volume volume = this.volume;
        return iHashCode9 + (volume != null ? volume.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentAudioModel(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", videoId=");
        sbLIZ.append(this.videoId);
        sbLIZ.append(", enableSsl=");
        sbLIZ.append(this.enableSsl);
        sbLIZ.append(", videoDuration=");
        sbLIZ.append(this.videoDuration);
        sbLIZ.append(", mediaType=");
        sbLIZ.append(this.mediaType);
        sbLIZ.append(", urlExpire=");
        sbLIZ.append(this.urlExpire);
        sbLIZ.append(", videoList=");
        sbLIZ.append(this.videoList);
        sbLIZ.append(", volume=");
        sbLIZ.append(this.volume);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommentAudioModel(Integer num, String str, Integer num2, String str2, Boolean bool, Double d, String str3, Long l, List<VideoItem> list, Volume volume) {
        this.status = num;
        this.message = str;
        this.version = num2;
        this.videoId = str2;
        this.enableSsl = bool;
        this.videoDuration = d;
        this.mediaType = str3;
        this.urlExpire = l;
        this.videoList = list;
        this.volume = volume;
    }
}
