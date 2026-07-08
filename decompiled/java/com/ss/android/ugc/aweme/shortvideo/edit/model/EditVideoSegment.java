package com.ss.android.ugc.aweme.shortvideo.edit.model;

import X.C0MY0;
import X.C19719512Dh;
import X.C570460MYy;
import X.C580950MqT;
import X.InterfaceC2270808v4;
import X.InterfaceC2270908v5;
import X.InterfaceC570470MYz;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public class EditVideoSegment implements Parcelable, Serializable {
    public AIGCInfo aigcInfo;

    @InterfaceC2270908v5
    @C0MY0
    @InterfaceC2270808v4
    public String audioPath;
    public Map<String, Object> extra;
    public transient boolean isImage;
    public transient String muxPath;

    @InterfaceC570470MYz
    public String originImportPath;
    public VideoCutInfo videoCutInfo;
    public final VideoFileInfo videoFileInfo;

    @InterfaceC2270908v5
    @C0MY0(blockCreative = true)
    @InterfaceC2270808v4
    public String videoPath;
    public static final C570460MYy Companion = new Object() { // from class: X.0MYy
    };
    public static final Parcelable.Creator<EditVideoSegment> CREATOR = new C580950MqT(4);

    public final EditVideoSegment copy() {
        return copy$default(this, null, null, null, null, 15, null);
    }

    public final EditVideoSegment copy(String str) {
        return copy$default(this, str, null, null, null, 14, null);
    }

    public final EditVideoSegment copy(String str, String str2) {
        return copy$default(this, str, str2, null, null, 12, null);
    }

    public final EditVideoSegment copy(String str, String str2, VideoFileInfo videoFileInfo) {
        return copy$default(this, str, str2, videoFileInfo, null, 8, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final AIGCInfo getAigcInfo() {
        return this.aigcInfo;
    }

    public final String getAudioPath() {
        return this.audioPath;
    }

    public final Map<String, Object> getExtra() {
        return this.extra;
    }

    public final String getMuxPath() {
        return this.muxPath;
    }

    public final String getOriginImportPath() {
        return this.originImportPath;
    }

    public final VideoCutInfo getVideoCutInfo() {
        return this.videoCutInfo;
    }

    public final VideoFileInfo getVideoFileInfo() {
        return this.videoFileInfo;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final boolean isImage() {
        return this.isImage;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EditVideoSegment(Parcel parcel) {
        String string = parcel.readString();
        if (string != null) {
            String string2 = parcel.readString();
            VideoFileInfo videoFileInfo = (VideoFileInfo) parcel.readParcelable(VideoFileInfo.class.getClassLoader());
            if (videoFileInfo != null) {
                this(string, string2, videoFileInfo);
                this.videoCutInfo = (VideoCutInfo) parcel.readParcelable(VideoCutInfo.class.getClassLoader());
                this.isImage = parcel.readInt() == 1;
                this.aigcInfo = (AIGCInfo) parcel.readParcelable(AIGCInfo.class.getClassLoader());
                HashMap hashMap = parcel.readHashMap(String.class.getClassLoader());
                this.extra = (!C19719512Dh.LJII(hashMap) || hashMap == null) ? new LinkedHashMap() : hashMap;
                return;
            }
            throw new IllegalArgumentException("create EditVideoSegment instance with invalid VideoFileInfo");
        }
        throw new IllegalArgumentException("create EditVideoSegment instance with invalid videoPath");
    }

    public final void setAigcInfo(AIGCInfo aIGCInfo) {
        this.aigcInfo = aIGCInfo;
    }

    public final void setAudioPath(String str) {
        this.audioPath = str;
    }

    public final void setExtra(Map<String, Object> map) {
        this.extra = map;
    }

    public final void setImage(boolean z) {
        this.isImage = z;
    }

    public final void setMuxPath(String str) {
        this.muxPath = str;
    }

    public final void setOriginImportPath(String str) {
        this.originImportPath = str;
    }

    public final void setVideoCutInfo(VideoCutInfo videoCutInfo) {
        this.videoCutInfo = videoCutInfo;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.audioPath);
        parcel.writeParcelable(this.videoFileInfo, i);
        parcel.writeParcelable(this.videoCutInfo, i);
        parcel.writeInt(this.isImage ? 1 : 0);
        parcel.writeParcelable(this.aigcInfo, i);
        parcel.writeMap(this.extra);
    }

    public EditVideoSegment(String str, String str2, VideoFileInfo videoFileInfo) {
        this.videoPath = str;
        this.audioPath = str2;
        this.videoFileInfo = videoFileInfo;
        this.extra = new LinkedHashMap();
    }

    public final EditVideoSegment copy(String str, String str2, VideoFileInfo videoFileInfo, VideoCutInfo videoCutInfo) {
        EditVideoSegment editVideoSegment = new EditVideoSegment(str, str2, videoFileInfo);
        editVideoSegment.videoCutInfo = videoCutInfo;
        editVideoSegment.aigcInfo = this.aigcInfo;
        editVideoSegment.extra = this.extra;
        return editVideoSegment;
    }

    public /* synthetic */ EditVideoSegment(String str, String str2, VideoFileInfo videoFileInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, videoFileInfo);
    }

    public static /* synthetic */ EditVideoSegment copy$default(EditVideoSegment editVideoSegment, String str, String str2, VideoFileInfo videoFileInfo, VideoCutInfo videoCutInfo, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = editVideoSegment.videoPath;
            }
            if ((i & 2) != 0) {
                str2 = editVideoSegment.audioPath;
            }
            if ((i & 4) != 0) {
                VideoFileInfo videoFileInfo2 = editVideoSegment.videoFileInfo;
                videoFileInfo = videoFileInfo2.copy(videoFileInfo2.width, videoFileInfo2.height, videoFileInfo2.duration, videoFileInfo2.fps, videoFileInfo2.bitrate, videoFileInfo2.codecType, videoFileInfo2.keyFrameCount, videoFileInfo2.gop, videoFileInfo2.fpsFloat);
            }
            if ((i & 8) != 0) {
                VideoCutInfo videoCutInfo2 = editVideoSegment.videoCutInfo;
                if (videoCutInfo2 != null) {
                    videoCutInfo = videoCutInfo2.copy(videoCutInfo2.start, videoCutInfo2.end, videoCutInfo2.speed, videoCutInfo2.rotate);
                } else {
                    videoCutInfo = null;
                }
            }
            return editVideoSegment.copy(str, str2, videoFileInfo, videoCutInfo);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }
}
