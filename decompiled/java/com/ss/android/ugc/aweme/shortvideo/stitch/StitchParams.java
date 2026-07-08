package com.ss.android.ugc.aweme.shortvideo.stitch;

import X.C09CT;
import X.C0MY0;
import X.C786410Ut5;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class StitchParams implements Parcelable, Serializable {
    public static final Parcelable.Creator<StitchParams> CREATOR = new Parcelable.Creator<StitchParams>() { // from class: X.0Mfv
        @Override // android.os.Parcelable.Creator
        public final StitchParams createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            EditVideoSegment editVideoSegment = (EditVideoSegment) parcel.readParcelable(StitchParams.class.getClassLoader());
            String string = parcel.readString();
            AVMusic aVMusic = (AVMusic) parcel.readSerializable();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string3 = parcel.readString();
            User user = (User) parcel.readSerializable();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            long j = parcel.readLong();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
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
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new StitchParams(editVideoSegment, string, aVMusic, string2, i, z, string3, user, string4, string5, j, string6, string7, z2, z3, j2, j3, i2, z4, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, z5, parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final StitchParams[] newArray(int i) {
            return new StitchParams[i];
        }
    };

    @C09CT(alternate = {"i"}, value = "aweme_id")
    public String awemeId;

    @C09CT(alternate = {"j"}, value = "chain")
    public String chain;

    @C09CT("click_stitch_time")
    public long clickStitchTime;

    @C09CT(alternate = {"m"}, value = "concat_audio_path")
    @C0MY0
    public String concatAudioPath;

    @C09CT(alternate = {"l"}, value = "concat_video_path")
    @C0MY0
    public String concatVideoPath;

    @C09CT(alternate = {"k"}, value = "duration")
    public long duration;

    @C09CT(alternate = {"n"}, value = "enable_mic")
    public boolean enableMic;

    @C09CT(alternate = {"q"}, value = "endTime")
    public long endTime;

    @C09CT(alternate = {"t"}, value = "enterRecordFromFeed")
    @C0MY0
    public boolean enterRecordFromFeed;

    @C09CT(alternate = {"h"}, value = "from_user")
    public User fromUser;

    @C09CT(alternate = {"o"}, value = "is_muted")
    public boolean isMuted;

    @C09CT(alternate = {"f"}, value = "is_pgc_music")
    public boolean isPGCMusic;

    @C09CT(alternate = {"s"}, value = "isThroughStitchChain")
    public boolean isThroughStitchChain;

    @C09CT(alternate = {"c"}, value = "music")
    public AVMusic music;

    @C09CT(alternate = {"g"}, value = "music_id")
    public String musicId;

    @InterfaceC2270908v5
    @C09CT(alternate = {"d"}, value = "music_path")
    public String musicPath;

    @C09CT(alternate = {"e"}, value = "music_start")
    public int musicStart;

    @C09CT("origin_video_aigc_label_type")
    public int originVideoAIGCLabelType;

    @C09CT("recordAudioPathLists")
    @C0MY0
    public List<String> recordAudioPathLists;

    @C09CT("recordVideoPathLists")
    @C0MY0
    public List<String> recordVideoPathLists;

    @C09CT(alternate = {"p"}, value = "startTime")
    public long startTime;

    @C09CT(alternate = {"r"}, value = "stitchVideoDuration")
    public int stitchVideoDuration;

    @InterfaceC2270908v5
    @C09CT(alternate = {"b"}, value = "video_path")
    public String videoPath;

    @C09CT(alternate = {"a"}, value = "video_segment")
    public EditVideoSegment videoSegment;

    public StitchParams() {
        this(null, null, null, null, 0, false, null, null, null, null, 0L, null, null, true, false, 0L, 0L, 0, false, new ArrayList(), new ArrayList(), false, 0, 0L);
    }

    public final StitchParams copy(EditVideoSegment editVideoSegment, String str, AVMusic aVMusic, String str2, int i, boolean z, String str3, User user, String str4, String str5, long j, String str6, String str7, boolean z2, boolean z3, long j2, long j3, int i2, boolean z4, List<String> list, List<String> list2, boolean z5, int i3, long j4) {
        return new StitchParams(editVideoSegment, str, aVMusic, str2, i, z, str3, user, str4, str5, j, str6, str7, z2, z3, j2, j3, i2, z4, list, list2, z5, i3, j4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StitchParams)) {
            return false;
        }
        StitchParams stitchParams = (StitchParams) obj;
        return Intrinsics.LJFF(this.videoSegment, stitchParams.videoSegment) && Intrinsics.LJFF(this.videoPath, stitchParams.videoPath) && Intrinsics.LJFF(this.music, stitchParams.music) && Intrinsics.LJFF(this.musicPath, stitchParams.musicPath) && this.musicStart == stitchParams.musicStart && this.isPGCMusic == stitchParams.isPGCMusic && Intrinsics.LJFF(this.musicId, stitchParams.musicId) && Intrinsics.LJFF(this.fromUser, stitchParams.fromUser) && Intrinsics.LJFF(this.awemeId, stitchParams.awemeId) && Intrinsics.LJFF(this.chain, stitchParams.chain) && this.duration == stitchParams.duration && Intrinsics.LJFF(this.concatVideoPath, stitchParams.concatVideoPath) && Intrinsics.LJFF(this.concatAudioPath, stitchParams.concatAudioPath) && this.enableMic == stitchParams.enableMic && this.isMuted == stitchParams.isMuted && this.startTime == stitchParams.startTime && this.endTime == stitchParams.endTime && this.stitchVideoDuration == stitchParams.stitchVideoDuration && this.isThroughStitchChain == stitchParams.isThroughStitchChain && Intrinsics.LJFF(this.recordVideoPathLists, stitchParams.recordVideoPathLists) && Intrinsics.LJFF(this.recordAudioPathLists, stitchParams.recordAudioPathLists) && this.enterRecordFromFeed == stitchParams.enterRecordFromFeed && this.originVideoAIGCLabelType == stitchParams.originVideoAIGCLabelType && this.clickStitchTime == stitchParams.clickStitchTime;
    }

    public int hashCode() {
        EditVideoSegment editVideoSegment = this.videoSegment;
        int iHashCode = (editVideoSegment == null ? 0 : editVideoSegment.hashCode()) * 31;
        String str = this.videoPath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AVMusic aVMusic = this.music;
        int iHashCode3 = (iHashCode2 + (aVMusic == null ? 0 : aVMusic.hashCode())) * 31;
        String str2 = this.musicPath;
        int iHashCode4 = (((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.musicStart) * 31) + C786410Ut5.Z2(this.isPGCMusic)) * 31;
        String str3 = this.musicId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        User user = this.fromUser;
        int iHashCode6 = (iHashCode5 + (user == null ? 0 : user.hashCode())) * 31;
        String str4 = this.awemeId;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.chain;
        int iHashCode8 = (((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Y2(this.duration)) * 31;
        String str6 = this.concatVideoPath;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.concatAudioPath;
        return ((((((((((((((((((((((iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.enableMic)) * 31) + C786410Ut5.Z2(this.isMuted)) * 31) + C786410Ut5.Y2(this.startTime)) * 31) + C786410Ut5.Y2(this.endTime)) * 31) + this.stitchVideoDuration) * 31) + C786410Ut5.Z2(this.isThroughStitchChain)) * 31) + this.recordVideoPathLists.hashCode()) * 31) + this.recordAudioPathLists.hashCode()) * 31) + C786410Ut5.Z2(this.enterRecordFromFeed)) * 31) + this.originVideoAIGCLabelType) * 31) + C786410Ut5.Y2(this.clickStitchTime);
    }

    public String toString() {
        return "StitchParams(videoSegment=" + this.videoSegment + ", videoPath=" + this.videoPath + ", music=" + this.music + ", musicPath=" + this.musicPath + ", musicStart=" + this.musicStart + ", isPGCMusic=" + this.isPGCMusic + ", musicId=" + this.musicId + ", fromUser=" + this.fromUser + ", awemeId=" + this.awemeId + ", chain=" + this.chain + ", duration=" + this.duration + ", concatVideoPath=" + this.concatVideoPath + ", concatAudioPath=" + this.concatAudioPath + ", enableMic=" + this.enableMic + ", isMuted=" + this.isMuted + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", stitchVideoDuration=" + this.stitchVideoDuration + ", isThroughStitchChain=" + this.isThroughStitchChain + ", recordVideoPathLists=" + this.recordVideoPathLists + ", recordAudioPathLists=" + this.recordAudioPathLists + ", enterRecordFromFeed=" + this.enterRecordFromFeed + ", originVideoAIGCLabelType=" + this.originVideoAIGCLabelType + ", clickStitchTime=" + this.clickStitchTime + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.videoSegment, i);
        parcel.writeString(this.videoPath);
        parcel.writeSerializable(this.music);
        parcel.writeString(this.musicPath);
        parcel.writeInt(this.musicStart);
        parcel.writeInt(this.isPGCMusic ? 1 : 0);
        parcel.writeString(this.musicId);
        parcel.writeSerializable(this.fromUser);
        parcel.writeString(this.awemeId);
        parcel.writeString(this.chain);
        parcel.writeLong(this.duration);
        parcel.writeString(this.concatVideoPath);
        parcel.writeString(this.concatAudioPath);
        parcel.writeInt(this.enableMic ? 1 : 0);
        parcel.writeInt(this.isMuted ? 1 : 0);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.stitchVideoDuration);
        parcel.writeInt(this.isThroughStitchChain ? 1 : 0);
        parcel.writeStringList(this.recordVideoPathLists);
        parcel.writeStringList(this.recordAudioPathLists);
        parcel.writeInt(this.enterRecordFromFeed ? 1 : 0);
        parcel.writeInt(this.originVideoAIGCLabelType);
        parcel.writeLong(this.clickStitchTime);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getChain() {
        return this.chain;
    }

    public final long getClickStitchTime() {
        return this.clickStitchTime;
    }

    public final String getConcatAudioPath() {
        return this.concatAudioPath;
    }

    public final String getConcatVideoPath() {
        return this.concatVideoPath;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final boolean getEnableMic() {
        return this.enableMic;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final boolean getEnterRecordFromFeed() {
        return this.enterRecordFromFeed;
    }

    public final User getFromUser() {
        return this.fromUser;
    }

    public final AVMusic getMusic() {
        return this.music;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final int getMusicStart() {
        return this.musicStart;
    }

    public final int getOriginVideoAIGCLabelType() {
        return this.originVideoAIGCLabelType;
    }

    public final List<String> getRecordAudioPathLists() {
        return this.recordAudioPathLists;
    }

    public final List<String> getRecordVideoPathLists() {
        return this.recordVideoPathLists;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStitchVideoDuration() {
        return this.stitchVideoDuration;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final EditVideoSegment getVideoSegment() {
        return this.videoSegment;
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final boolean isPGCMusic() {
        return this.isPGCMusic;
    }

    public final boolean isThroughStitchChain() {
        return this.isThroughStitchChain;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setChain(String str) {
        this.chain = str;
    }

    public final void setClickStitchTime(long j) {
        this.clickStitchTime = j;
    }

    public final void setConcatAudioPath(String str) {
        this.concatAudioPath = str;
    }

    public final void setConcatVideoPath(String str) {
        this.concatVideoPath = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEnableMic(boolean z) {
        this.enableMic = z;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setEnterRecordFromFeed(boolean z) {
        this.enterRecordFromFeed = z;
    }

    public final void setFromUser(User user) {
        this.fromUser = user;
    }

    public final void setMusic(AVMusic aVMusic) {
        this.music = aVMusic;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicPath(String str) {
        this.musicPath = str;
    }

    public final void setMusicStart(int i) {
        this.musicStart = i;
    }

    public final void setMuted(boolean z) {
        this.isMuted = z;
    }

    public final void setOriginVideoAIGCLabelType(int i) {
        this.originVideoAIGCLabelType = i;
    }

    public final void setPGCMusic(boolean z) {
        this.isPGCMusic = z;
    }

    public final void setRecordAudioPathLists(List<String> list) {
        this.recordAudioPathLists = list;
    }

    public final void setRecordVideoPathLists(List<String> list) {
        this.recordVideoPathLists = list;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setStitchVideoDuration(int i) {
        this.stitchVideoDuration = i;
    }

    public final void setThroughStitchChain(boolean z) {
        this.isThroughStitchChain = z;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }

    public final void setVideoSegment(EditVideoSegment editVideoSegment) {
        this.videoSegment = editVideoSegment;
    }

    public StitchParams(EditVideoSegment editVideoSegment, String str, AVMusic aVMusic, String str2, int i, boolean z, String str3, User user, String str4, String str5, long j, String str6, String str7, boolean z2, boolean z3, long j2, long j3, int i2, boolean z4, List<String> list, List<String> list2, boolean z5, int i3, long j4) {
        this.videoSegment = editVideoSegment;
        this.videoPath = str;
        this.music = aVMusic;
        this.musicPath = str2;
        this.musicStart = i;
        this.isPGCMusic = z;
        this.musicId = str3;
        this.fromUser = user;
        this.awemeId = str4;
        this.chain = str5;
        this.duration = j;
        this.concatVideoPath = str6;
        this.concatAudioPath = str7;
        this.enableMic = z2;
        this.isMuted = z3;
        this.startTime = j2;
        this.endTime = j3;
        this.stitchVideoDuration = i2;
        this.isThroughStitchChain = z4;
        this.recordVideoPathLists = list;
        this.recordAudioPathLists = list2;
        this.enterRecordFromFeed = z5;
        this.originVideoAIGCLabelType = i3;
        this.clickStitchTime = j4;
    }
}
