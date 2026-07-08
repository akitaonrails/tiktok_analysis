package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CmtAudioStruct implements Serializable, Cloneable {

    @C09CT("asr_lang")
    public String asrLang;

    @C09CT("asr_status")
    public Integer asrStatus;

    @C09CT("asr_text")
    public String asrText;
    public CommentAudioModel audioModel;

    @C09CT("content")
    public String content;

    @C09CT("duration")
    public Long durationMillis;
    public boolean isEverPlayed;
    public String localPath;

    @C09CT("vid")
    public String vid;
    public Float volumeWhenPlay;

    @C09CT("wave")
    public String wave;

    public CmtAudioStruct() {
        this(null, null, null, 0L, 0, null, null, null, false, null, null);
    }

    public final CmtAudioStruct copy(String str, String str2, String str3, Long l, Integer num, String str4, String str5, String str6, boolean z, Float f, CommentAudioModel commentAudioModel) {
        return new CmtAudioStruct(str, str2, str3, l, num, str4, str5, str6, z, f, commentAudioModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CmtAudioStruct)) {
            return false;
        }
        CmtAudioStruct cmtAudioStruct = (CmtAudioStruct) obj;
        return Intrinsics.LJFF(this.vid, cmtAudioStruct.vid) && Intrinsics.LJFF(this.content, cmtAudioStruct.content) && Intrinsics.LJFF(this.wave, cmtAudioStruct.wave) && Intrinsics.LJFF(this.durationMillis, cmtAudioStruct.durationMillis) && Intrinsics.LJFF(this.asrStatus, cmtAudioStruct.asrStatus) && Intrinsics.LJFF(this.asrText, cmtAudioStruct.asrText) && Intrinsics.LJFF(this.asrLang, cmtAudioStruct.asrLang) && Intrinsics.LJFF(this.localPath, cmtAudioStruct.localPath) && this.isEverPlayed == cmtAudioStruct.isEverPlayed && Intrinsics.LJFF(this.volumeWhenPlay, cmtAudioStruct.volumeWhenPlay) && Intrinsics.LJFF(this.audioModel, cmtAudioStruct.audioModel);
    }

    public int hashCode() {
        String str = this.vid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.wave;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.durationMillis;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.asrStatus;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.asrText;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.asrLang;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.localPath;
        int iHashCode8 = (((iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.Z2(this.isEverPlayed)) * 31;
        Float f = this.volumeWhenPlay;
        int iHashCode9 = (iHashCode8 + (f == null ? 0 : f.hashCode())) * 31;
        CommentAudioModel commentAudioModel = this.audioModel;
        return iHashCode9 + (commentAudioModel != null ? commentAudioModel.hashCode() : 0);
    }

    public String toString() {
        return "CmtAudioStruct(vid=" + this.vid + ", content=" + this.content + ", wave=" + this.wave + ", durationMillis=" + this.durationMillis + ", asrStatus=" + this.asrStatus + ", asrText=" + this.asrText + ", asrLang=" + this.asrLang + ", localPath=" + this.localPath + ", isEverPlayed=" + this.isEverPlayed + ", volumeWhenPlay=" + this.volumeWhenPlay + ", audioModel=" + this.audioModel + ')';
    }

    public Object clone() {
        return new CmtAudioStruct(this.vid, this.content, this.wave, this.durationMillis, this.asrStatus, this.asrText, this.asrLang, this.localPath, false, null, null);
    }

    public final String getAsrLang() {
        return this.asrLang;
    }

    public final Integer getAsrStatus() {
        return this.asrStatus;
    }

    public final String getAsrText() {
        return this.asrText;
    }

    public final CommentAudioModel getAudioModel() {
        return this.audioModel;
    }

    public final String getContent() {
        return this.content;
    }

    public final Long getDurationMillis() {
        return this.durationMillis;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getVid() {
        return this.vid;
    }

    public final Float getVolumeWhenPlay() {
        return this.volumeWhenPlay;
    }

    public final String getWave() {
        return this.wave;
    }

    public final boolean isEverPlayed() {
        return this.isEverPlayed;
    }

    public final void setAsrLang(String str) {
        this.asrLang = str;
    }

    public final void setAsrStatus(Integer num) {
        this.asrStatus = num;
    }

    public final void setAsrText(String str) {
        this.asrText = str;
    }

    public final void setAudioModel(CommentAudioModel commentAudioModel) {
        this.audioModel = commentAudioModel;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setDurationMillis(Long l) {
        this.durationMillis = l;
    }

    public final void setEverPlayed(boolean z) {
        this.isEverPlayed = z;
    }

    public final void setLocalPath(String str) {
        this.localPath = str;
    }

    public final void setVid(String str) {
        this.vid = str;
    }

    public final void setVolumeWhenPlay(Float f) {
        this.volumeWhenPlay = f;
    }

    public final void setWave(String str) {
        this.wave = str;
    }

    public CmtAudioStruct(String str, String str2, String str3, Long l, Integer num, String str4, String str5, String str6, boolean z, Float f, CommentAudioModel commentAudioModel) {
        this.vid = str;
        this.content = str2;
        this.wave = str3;
        this.durationMillis = l;
        this.asrStatus = num;
        this.asrText = str4;
        this.asrLang = str5;
        this.localPath = str6;
        this.isEverPlayed = z;
        this.volumeWhenPlay = f;
        this.audioModel = commentAudioModel;
    }
}
