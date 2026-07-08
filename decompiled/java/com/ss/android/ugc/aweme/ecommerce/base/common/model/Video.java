package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C09CT;
import X.C123100dR;
import X.C13LP;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.VideoInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class Video implements Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("duration")
    public Double duration;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("media_type")
    public String mediaType;

    @C09CT("post_url")
    public String postUrl;

    @C09CT("video_infos")
    public List<VideoInfo> urls;

    @C09CT("video_info_opt")
    public com.ss.android.ugc.aweme.feed.model.Video videoInfoOpt;
    public static final Parcelable.Creator<Video> CREATOR = new Parcelable.Creator<Video>() { // from class: X.02pc
        @Override // android.os.Parcelable.Creator
        public final Video createFromParcel(Parcel parcel) {
            Double dValueOf;
            String string = parcel.readString();
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(VideoInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new Video(string, dValueOf, string2, string3, arrayList, parcel.readString(), (com.ss.android.ugc.aweme.feed.model.Video) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Video[] newArray(int i) {
            return new Video[i];
        }
    };
    public static final int $stable = 8;

    public Video() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video)) {
            return false;
        }
        Video video = (Video) obj;
        return Intrinsics.LJFF(this.id, video.id) && Intrinsics.LJFF(this.duration, video.duration) && Intrinsics.LJFF(this.postUrl, video.postUrl) && Intrinsics.LJFF(this.mediaType, video.mediaType) && Intrinsics.LJFF(this.urls, video.urls) && Intrinsics.LJFF(this.daInfo, video.daInfo) && Intrinsics.LJFF(this.videoInfoOpt, video.videoInfoOpt);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.duration;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.postUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mediaType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<VideoInfo> list = this.urls;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.daInfo;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        com.ss.android.ugc.aweme.feed.model.Video video = this.videoInfoOpt;
        return iHashCode6 + (video != null ? video.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Video(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", postUrl=");
        sbLIZ.append(this.postUrl);
        sbLIZ.append(", mediaType=");
        sbLIZ.append(this.mediaType);
        sbLIZ.append(", urls=");
        sbLIZ.append(this.urls);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", videoInfoOpt=");
        sbLIZ.append(this.videoInfoOpt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        Double d = this.duration;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.postUrl);
        parcel.writeString(this.mediaType);
        List<VideoInfo> list = this.urls;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<VideoInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.daInfo);
        parcel.writeSerializable(this.videoInfoOpt);
    }

    public final Aweme LIZ() {
        VideoInfo videoInfo;
        Integer num;
        VideoInfo videoInfo2;
        Integer num2;
        VideoInfo videoInfo3;
        Aweme aweme = new Aweme();
        com.ss.android.ugc.aweme.feed.model.Video video = this.videoInfoOpt;
        if (video != null) {
            com.ss.android.ugc.aweme.feed.model.Video videoCopyFrom = video.copyFrom();
            videoCopyFrom.setVideoLength(videoCopyFrom.getVideoLength() / LSPassThroughRecordSizeConfig.DEFAULT);
            videoCopyFrom.setSourceId(this.id);
            try {
                Iterator<BitRate> it2 = videoCopyFrom.getBitRate().iterator();
                while (it2.hasNext()) {
                    it2.next().getPlayAddr().setUrlKey(this.id);
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (C123100dR.LIZ(this.postUrl)) {
                UrlModel urlModel = new UrlModel();
                urlModel.setUri(this.postUrl);
                urlModel.setUrlList(new ArrayList());
                urlModel.getUrlList().add(urlModel.getUri());
                videoCopyFrom.setCover(urlModel);
            }
            aweme.setVideo(videoCopyFrom);
        } else {
            com.ss.android.ugc.aweme.feed.model.Video video2 = new com.ss.android.ugc.aweme.feed.model.Video();
            VideoUrlModel videoUrlModel = new VideoUrlModel();
            videoUrlModel.setSourceId(this.id);
            List<VideoInfo> list = this.urls;
            videoUrlModel.setUri((list == null || (videoInfo3 = (VideoInfo) C13LP.LJJJLZIJ(0, list)) == null) ? null : videoInfo3.mainUrl);
            videoUrlModel.setUrlList(new ArrayList());
            videoUrlModel.getUrlList().add(videoUrlModel.getUri());
            videoUrlModel.setUrlKey(this.id);
            video2.setPlayAddr(videoUrlModel);
            UrlModel urlModel2 = new UrlModel();
            urlModel2.setUri(this.postUrl);
            urlModel2.setUrlList(new ArrayList());
            urlModel2.getUrlList().add(urlModel2.getUri());
            video2.setCover(urlModel2);
            List<VideoInfo> list2 = this.urls;
            video2.setWidth((list2 == null || (videoInfo2 = (VideoInfo) C13LP.LJJJLZIJ(0, list2)) == null || (num2 = videoInfo2.width) == null) ? 0 : num2.intValue());
            List<VideoInfo> list3 = this.urls;
            video2.setHeight((list3 == null || (videoInfo = (VideoInfo) C13LP.LJJJLZIJ(0, list3)) == null || (num = videoInfo.height) == null) ? 0 : num.intValue());
            Double d = this.duration;
            video2.setVideoLength(d != null ? (int) d.doubleValue() : 0);
            video2.setPlayAddrBytevc1(video2.getPlayAddr());
            aweme.setVideo(video2);
        }
        aweme.setAid(this.id);
        return aweme;
    }

    public final int LIZIZ() {
        VideoInfo videoInfo;
        Integer num;
        List<VideoInfo> list = this.urls;
        if (list == null || (videoInfo = (VideoInfo) C13LP.LJJJLZIJ(0, list)) == null || (num = videoInfo.bitrate) == null) {
            return 0;
        }
        return num.intValue();
    }

    public Video(String str, Double d, String str2, String str3, List<VideoInfo> list, String str4, com.ss.android.ugc.aweme.feed.model.Video video) {
        this.id = str;
        this.duration = d;
        this.postUrl = str2;
        this.mediaType = str3;
        this.urls = list;
        this.daInfo = str4;
        this.videoInfoOpt = video;
    }
}
