package com.ss.android.ugc.aweme.status;

import X.C09CT;
import X.C0MZ3;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.status.StatusCreateVideoData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class StatusCreateVideoData implements Parcelable, Serializable {
    public static final C0MZ3 CREATOR = new Parcelable.Creator<StatusCreateVideoData>() { // from class: X.0MZ3
        @Override // android.os.Parcelable.Creator
        public final StatusCreateVideoData createFromParcel(Parcel parcel) {
            return new StatusCreateVideoData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StatusCreateVideoData[] newArray(int i) {
            return new StatusCreateVideoData[i];
        }
    };

    @C09CT("status_background_selected_from")
    public String bgFrom;

    @C09CT("status_background_height")
    public int bgHeight;

    @C09CT("bg_id")
    public String bgId;

    @C09CT("bg_path")
    public String bgPath;

    @C09CT("status_background_size")
    public int bgSize;

    @C09CT("status_background_src_image")
    public String bgSrcImage;

    @C09CT("status_background_width")
    public int bgWidth;

    @C09CT("effect_id")
    public String effectId;

    @C09CT("effect_path")
    public String effectPath;

    @C09CT("status_music_ids")
    public List<String> musicIds;

    @C09CT("music_path")
    public String musicPath;

    @C09CT("key_status_type")
    public int statusType;

    @C09CT("status_template_text")
    public String templateText;

    @C09CT("status_user_text")
    public String userText;

    @C09CT("status_video_cover")
    public String videoCoverImgPath;

    @C09CT("status_video_cover_starttime")
    public int videoCoverStartTime;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StatusCreateVideoData() {
        this.statusType = -1;
        this.bgPath = "";
        this.bgId = "";
        this.bgFrom = "template";
        this.bgSrcImage = "";
        this.musicPath = "";
        this.effectPath = "";
        this.effectId = "";
        this.musicIds = new ArrayList();
        this.templateText = "";
        this.userText = "";
    }

    public final String getBgFrom() {
        return this.bgFrom;
    }

    public final int getBgHeight() {
        return this.bgHeight;
    }

    public final String getBgId() {
        return this.bgId;
    }

    public final String getBgPath() {
        return this.bgPath;
    }

    public final int getBgSize() {
        return this.bgSize;
    }

    public final String getBgSrcImage() {
        return this.bgSrcImage;
    }

    public final int getBgWidth() {
        return this.bgWidth;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getEffectPath() {
        return this.effectPath;
    }

    public final List<String> getMusicIds() {
        return this.musicIds;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final int getStatusType() {
        return this.statusType;
    }

    public final String getTemplateText() {
        return this.templateText;
    }

    public final String getUserText() {
        return this.userText;
    }

    public final String getVideoCoverImgPath() {
        return this.videoCoverImgPath;
    }

    public final int getVideoCoverStartTime() {
        return this.videoCoverStartTime;
    }

    public StatusCreateVideoData(Parcel parcel) {
        this();
        this.statusType = parcel.readInt();
        String string = parcel.readString();
        this.bgPath = string == null ? "" : string;
        String string2 = parcel.readString();
        this.bgId = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        this.bgFrom = string3 == null ? "" : string3;
        this.bgSize = parcel.readInt();
        this.bgWidth = parcel.readInt();
        this.bgHeight = parcel.readInt();
        this.bgSrcImage = parcel.readString();
        String string4 = parcel.readString();
        this.musicPath = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        this.effectPath = string5 == null ? "" : string5;
        String string6 = parcel.readString();
        this.effectId = string6 == null ? "" : string6;
        parcel.readList(this.musicIds, String.class.getClassLoader());
        String string7 = parcel.readString();
        this.videoCoverImgPath = string7 == null ? "" : string7;
        this.videoCoverStartTime = parcel.readInt();
        String string8 = parcel.readString();
        this.templateText = string8 == null ? "" : string8;
        String string9 = parcel.readString();
        this.userText = string9 != null ? string9 : "";
    }

    public final void setBgFrom(String str) {
        this.bgFrom = str;
    }

    public final void setBgHeight(int i) {
        this.bgHeight = i;
    }

    public final void setBgId(String str) {
        this.bgId = str;
    }

    public final void setBgPath(String str) {
        this.bgPath = str;
    }

    public final void setBgSize(int i) {
        this.bgSize = i;
    }

    public final void setBgSrcImage(String str) {
        this.bgSrcImage = str;
    }

    public final void setBgWidth(int i) {
        this.bgWidth = i;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setEffectPath(String str) {
        this.effectPath = str;
    }

    public final void setMusicIds(List<String> list) {
        this.musicIds = list;
    }

    public final void setMusicPath(String str) {
        this.musicPath = str;
    }

    public final void setStatusType(int i) {
        this.statusType = i;
    }

    public final void setTemplateText(String str) {
        this.templateText = str;
    }

    public final void setUserText(String str) {
        this.userText = str;
    }

    public final void setVideoCoverImgPath(String str) {
        this.videoCoverImgPath = str;
    }

    public final void setVideoCoverStartTime(int i) {
        this.videoCoverStartTime = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.statusType);
        parcel.writeString(this.bgPath);
        parcel.writeString(this.bgId);
        parcel.writeString(this.bgFrom);
        parcel.writeInt(this.bgSize);
        parcel.writeInt(this.bgWidth);
        parcel.writeInt(this.bgHeight);
        parcel.writeString(this.bgSrcImage);
        parcel.writeString(this.musicPath);
        parcel.writeString(this.effectPath);
        parcel.writeString(this.effectId);
        parcel.writeList(this.musicIds);
        parcel.writeString(this.videoCoverImgPath);
        parcel.writeInt(this.videoCoverStartTime);
        parcel.writeString(this.templateText);
        parcel.writeString(this.userText);
    }
}
