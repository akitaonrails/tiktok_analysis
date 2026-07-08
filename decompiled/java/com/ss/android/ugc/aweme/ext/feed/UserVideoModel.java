package com.ss.android.ugc.aweme.ext.feed;

import X.C197099129p;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ext.feed.UserVideoModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class UserVideoModel implements Parcelable {
    public final String localVideoPath;
    public final String msgId;
    public final int originalHeight;
    public final int originalWidth;
    public final String senderNickname;
    public final String senderRemarkName;
    public final List<String> thumbnails;
    public final String vid;
    public final VideoControl vidControl;
    public final Double vidDuration;
    public final String videoModel;
    public final List<String> videoUrlList;
    public static final C197099129p Companion = new Object() { // from class: X.129p
    };
    public static final Parcelable.Creator<UserVideoModel> CREATOR = new Parcelable.Creator<UserVideoModel>() { // from class: X.0Zp3
        @Override // android.os.Parcelable.Creator
        public final UserVideoModel createFromParcel(Parcel parcel) {
            Double dValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
            }
            return new UserVideoModel(string, string2, string3, i, i2, string4, string5, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, dValueOf, (VideoControl) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserVideoModel[] newArray(int i) {
            return new UserVideoModel[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserVideoModel)) {
            return false;
        }
        UserVideoModel userVideoModel = (UserVideoModel) obj;
        return Intrinsics.LJFF(this.senderNickname, userVideoModel.senderNickname) && Intrinsics.LJFF(this.senderRemarkName, userVideoModel.senderRemarkName) && Intrinsics.LJFF(this.vid, userVideoModel.vid) && this.originalWidth == userVideoModel.originalWidth && this.originalHeight == userVideoModel.originalHeight && Intrinsics.LJFF(this.localVideoPath, userVideoModel.localVideoPath) && Intrinsics.LJFF(this.videoModel, userVideoModel.videoModel) && Intrinsics.LJFF(this.thumbnails, userVideoModel.thumbnails) && Intrinsics.LJFF(this.videoUrlList, userVideoModel.videoUrlList) && Intrinsics.LJFF(this.vidDuration, userVideoModel.vidDuration) && Intrinsics.LJFF(this.vidControl, userVideoModel.vidControl) && Intrinsics.LJFF(this.msgId, userVideoModel.msgId);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.senderNickname.hashCode() * 31) + this.senderRemarkName.hashCode()) * 31) + this.vid.hashCode()) * 31) + this.originalWidth) * 31) + this.originalHeight) * 31;
        String str = this.localVideoPath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.videoModel;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.thumbnails.hashCode()) * 31) + this.videoUrlList.hashCode()) * 31;
        Double d = this.vidDuration;
        return ((((iHashCode3 + (d != null ? d.hashCode() : 0)) * 31) + this.vidControl.hashCode()) * 31) + this.msgId.hashCode();
    }

    public final String toString() {
        return "UserVideoModel(senderNickname=" + this.senderNickname + ", senderRemarkName=" + this.senderRemarkName + ", vid=" + this.vid + ", originalWidth=" + this.originalWidth + ", originalHeight=" + this.originalHeight + ", localVideoPath=" + this.localVideoPath + ", videoModel=" + this.videoModel + ", thumbnails=" + this.thumbnails + ", videoUrlList=" + this.videoUrlList + ", vidDuration=" + this.vidDuration + ", vidControl=" + this.vidControl + ", msgId=" + this.msgId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.senderNickname);
        parcel.writeString(this.senderRemarkName);
        parcel.writeString(this.vid);
        parcel.writeInt(this.originalWidth);
        parcel.writeInt(this.originalHeight);
        parcel.writeString(this.localVideoPath);
        parcel.writeString(this.videoModel);
        parcel.writeStringList(this.thumbnails);
        parcel.writeStringList(this.videoUrlList);
        Double d = this.vidDuration;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeSerializable(this.vidControl);
        parcel.writeString(this.msgId);
    }

    public final Aweme LIZ() {
        Video video = new Video();
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(this.thumbnails);
        video.setCover(urlModel);
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setSourceId(this.vid);
        videoUrlModel.setUri(this.vid);
        ArrayList arrayList = new ArrayList();
        String str = this.localVideoPath;
        if (str != null) {
            arrayList.add(str);
        }
        arrayList.addAll(this.videoUrlList);
        videoUrlModel.setUrlList(arrayList);
        videoUrlModel.setUrlKey(this.vid);
        video.setPlayAddr(videoUrlModel);
        video.setVideoModelStr(this.videoModel);
        video.setWidth(this.originalWidth);
        video.setHeight(this.originalHeight);
        video.setPlayAddrBytevc1(video.getPlayAddr());
        Double d = this.vidDuration;
        if (d != null) {
            video.setDuration(d.doubleValue());
        }
        User user = new User();
        user.setNickname(this.senderNickname);
        user.setRemarkName(this.senderRemarkName);
        Aweme aweme = new Aweme();
        aweme.setAuthor(user);
        aweme.setDesc("");
        AwemeExtKt.setEllipsizeDesc(aweme, "");
        aweme.setVideo(video);
        aweme.setAid(Intrinsics.LJFF(this.vid, "") ? this.msgId : this.vid);
        aweme.setVideoControl(this.vidControl);
        return aweme;
    }

    public UserVideoModel(String str, String str2, String str3, int i, int i2, String str4, String str5, List<String> list, List<String> list2, Double d, VideoControl videoControl, String str6) {
        this.senderNickname = str;
        this.senderRemarkName = str2;
        this.vid = str3;
        this.originalWidth = i;
        this.originalHeight = i2;
        this.localVideoPath = str4;
        this.videoModel = str5;
        this.thumbnails = list;
        this.videoUrlList = list2;
        this.vidDuration = d;
        this.vidControl = videoControl;
        this.msgId = str6;
    }
}
