package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C0MY0;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TextImageTaskInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<TextImageTaskInfo> CREATOR = new Parcelable.Creator<TextImageTaskInfo>() { // from class: X.0LIY
        @Override // android.os.Parcelable.Creator
        public final TextImageTaskInfo createFromParcel(Parcel parcel) {
            Long lValueOf;
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf;
            String string = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string8 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new TextImageTaskInfo(string, lValueOf, boolValueOf, string2, string3, string4, string5, string6, string7, numValueOf, string8, numValueOf2, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextImageTaskInfo[] newArray(int i) {
            return new TextImageTaskInfo[i];
        }
    };

    @C09CT("ai_name")
    public final String aiName;

    @C09CT("ai_server_task_id")
    public final String aiTaskId;

    @C09CT("ai_async_task_id")
    public String asyncTaskId;

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("fail_reason")
    public String failReason;

    @C09CT("ai_generate_count_same")
    public Integer genCount;

    @C09CT("has_comment_info")
    public final Boolean hasCommentInfo;

    @C09CT("title_of_preview")
    public final String hintByAi;

    @C09CT("placeholder_url")
    public final String placeholderUrl;

    @C09CT("progress")
    public Integer progress;

    @C09CT("text_refined_by_ai")
    public final String textByAi;

    @C09CT("text2image_track_list")
    public String trackList;

    @C09CT("type")
    public final String type;

    @C09CT("uri")
    @C0MY0
    public String uri;

    /* JADX WARN: Multi-variable type inference failed */
    public TextImageTaskInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 32767, 0 == true ? 1 : 0);
    }

    public final TextImageTaskInfo copy(String str, Long l, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Integer num2, String str9, String str10, String str11) {
        return new TextImageTaskInfo(str, l, bool, str2, str3, str4, str5, str6, str7, num, str8, num2, str9, str10, str11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextImageTaskInfo)) {
            return false;
        }
        TextImageTaskInfo textImageTaskInfo = (TextImageTaskInfo) obj;
        return Intrinsics.LJFF(this.type, textImageTaskInfo.type) && Intrinsics.LJFF(this.createTime, textImageTaskInfo.createTime) && Intrinsics.LJFF(this.hasCommentInfo, textImageTaskInfo.hasCommentInfo) && Intrinsics.LJFF(this.uri, textImageTaskInfo.uri) && Intrinsics.LJFF(this.placeholderUrl, textImageTaskInfo.placeholderUrl) && Intrinsics.LJFF(this.coverUrl, textImageTaskInfo.coverUrl) && Intrinsics.LJFF(this.aiTaskId, textImageTaskInfo.aiTaskId) && Intrinsics.LJFF(this.asyncTaskId, textImageTaskInfo.asyncTaskId) && Intrinsics.LJFF(this.aiName, textImageTaskInfo.aiName) && Intrinsics.LJFF(this.progress, textImageTaskInfo.progress) && Intrinsics.LJFF(this.failReason, textImageTaskInfo.failReason) && Intrinsics.LJFF(this.genCount, textImageTaskInfo.genCount) && Intrinsics.LJFF(this.trackList, textImageTaskInfo.trackList) && Intrinsics.LJFF(this.hintByAi, textImageTaskInfo.hintByAi) && Intrinsics.LJFF(this.textByAi, textImageTaskInfo.textByAi);
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.createTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.hasCommentInfo;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.uri;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeholderUrl;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.coverUrl;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.aiTaskId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.asyncTaskId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.aiName;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.progress;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.failReason;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this.genCount;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str9 = this.trackList;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.hintByAi;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.textByAi;
        return iHashCode14 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        return "TextImageTaskInfo(type=" + this.type + ", createTime=" + this.createTime + ", hasCommentInfo=" + this.hasCommentInfo + ", uri=" + this.uri + ", placeholderUrl=" + this.placeholderUrl + ", coverUrl=" + this.coverUrl + ", aiTaskId=" + this.aiTaskId + ", asyncTaskId=" + this.asyncTaskId + ", aiName=" + this.aiName + ", progress=" + this.progress + ", failReason=" + this.failReason + ", genCount=" + this.genCount + ", trackList=" + this.trackList + ", hintByAi=" + this.hintByAi + ", textByAi=" + this.textByAi + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        Long l = this.createTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.hasCommentInfo;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.uri);
        parcel.writeString(this.placeholderUrl);
        parcel.writeString(this.coverUrl);
        parcel.writeString(this.aiTaskId);
        parcel.writeString(this.asyncTaskId);
        parcel.writeString(this.aiName);
        Integer num = this.progress;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.failReason);
        Integer num2 = this.genCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.trackList);
        parcel.writeString(this.hintByAi);
        parcel.writeString(this.textByAi);
    }

    public final String getAiName() {
        return this.aiName;
    }

    public final String getAiTaskId() {
        return this.aiTaskId;
    }

    public final String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final String getFailReason() {
        return this.failReason;
    }

    public final Integer getGenCount() {
        return this.genCount;
    }

    public final Boolean getHasCommentInfo() {
        return this.hasCommentInfo;
    }

    public final String getHintByAi() {
        return this.hintByAi;
    }

    public final String getPlaceholderUrl() {
        return this.placeholderUrl;
    }

    public final Integer getProgress() {
        return this.progress;
    }

    public final String getTextByAi() {
        return this.textByAi;
    }

    public final String getTrackList() {
        return this.trackList;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUri() {
        return this.uri;
    }

    public final void setAsyncTaskId(String str) {
        this.asyncTaskId = str;
    }

    public final void setFailReason(String str) {
        this.failReason = str;
    }

    public final void setGenCount(Integer num) {
        this.genCount = num;
    }

    public final void setProgress(Integer num) {
        this.progress = num;
    }

    public final void setTrackList(String str) {
        this.trackList = str;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public TextImageTaskInfo(String str, Long l, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Integer num2, String str9, String str10, String str11) {
        this.type = str;
        this.createTime = l;
        this.hasCommentInfo = bool;
        this.uri = str2;
        this.placeholderUrl = str3;
        this.coverUrl = str4;
        this.aiTaskId = str5;
        this.asyncTaskId = str6;
        this.aiName = str7;
        this.progress = num;
        this.failReason = str8;
        this.genCount = num2;
        this.trackList = str9;
        this.hintByAi = str10;
        this.textByAi = str11;
    }

    public /* synthetic */ TextImageTaskInfo(String str, Long l, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Integer num2, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : str8, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num2, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) == 0 ? str11 : null);
    }
}
