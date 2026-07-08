package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C0MLH;
import X.C0MY0;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CelebrationMediaData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationData implements Parcelable, Serializable {

    @C09CT("template_anchor_name")
    public String anchorName;

    @C09CT("celebration_shoot_way")
    public String celebrationShootWay;

    @C09CT("celebration_type")
    public Integer celebrationType;

    @C09CT("content_cnt")
    public int contentCnt;

    @C09CT("entrance_type")
    public String entranceType;

    @C09CT("has_poster")
    public boolean hasPoster;

    @C09CT("local_cnt")
    public int localCnt;

    @C09CT("media_info_list")
    public List<CelebrationMediaData> mediaInfoList;

    @C09CT("mob_pre_replay_status")
    public Boolean mobPreReplayStatus;

    @C09CT("music")
    public AVMusic music;

    @C040H
    public String nleData;

    @C09CT("original_template_id")
    public String originalTemplateId;

    @C09CT("out_push")
    public boolean outPush;

    @C09CT("post_cnt")
    public int postCnt;

    @C09CT("preview_type")
    public int previewType;

    @C09CT("render_card_material_size")
    public Integer renderCardMaterialSize;

    @C09CT("search_extra")
    public String searchExtra;

    @C09CT("story_cnt")
    public int storyCnt;

    @C09CT("template_cover")
    public String templateCover;

    @C09CT("template_id")
    public String templateId;

    @C09CT("template_nle")
    public String templateNLE;

    @C09CT("template_name")
    public String templateName;

    @C09CT("template_summary")
    public String templateSummary;

    @C09CT("template_tags")
    public String templateTag;

    @C09CT("template_url")
    public String templateUrl;

    @C09CT("unique_id")
    public String uniqueId;

    @C09CT("material_path")
    @C0MY0
    public List<String> videoPath;
    public static final C0MLH Companion = new Object() { // from class: X.0MLH
    };
    public static final Parcelable.Creator<CelebrationData> CREATOR = new Parcelable.Creator<CelebrationData>() { // from class: X.0MLF
        @Override // android.os.Parcelable.Creator
        public final CelebrationData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            boolean z2;
            Boolean boolValueOf;
            boolean z3;
            String string = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf = Boolean.valueOf(z2);
            }
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList.add(CelebrationMediaData.CREATOR.createFromParcel(parcel));
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            AVMusic aVMusic = (AVMusic) parcel.readSerializable();
            int i7 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new CelebrationData(string, numValueOf, string2, i, i2, i3, i4, z, string3, string4, boolValueOf, string5, numValueOf2, arrayListCreateStringArrayList, arrayList, string6, string7, string8, string9, string10, string11, string12, string13, aVMusic, i7, z3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CelebrationData[] newArray(int i) {
            return new CelebrationData[i];
        }
    };

    public CelebrationData() {
        this(null, null, null, 0, 0, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, 134217727, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nleData);
        Integer num = this.celebrationType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.uniqueId);
        parcel.writeInt(this.contentCnt);
        parcel.writeInt(this.storyCnt);
        parcel.writeInt(this.postCnt);
        parcel.writeInt(this.localCnt);
        parcel.writeInt(this.hasPoster ? 1 : 0);
        parcel.writeString(this.entranceType);
        parcel.writeString(this.searchExtra);
        Boolean bool = this.mobPreReplayStatus;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.celebrationShootWay);
        Integer num2 = this.renderCardMaterialSize;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeStringList(this.videoPath);
        List<CelebrationMediaData> list = this.mediaInfoList;
        parcel.writeInt(list.size());
        Iterator<CelebrationMediaData> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.originalTemplateId);
        parcel.writeString(this.templateId);
        parcel.writeString(this.templateName);
        parcel.writeString(this.templateCover);
        parcel.writeString(this.templateUrl);
        parcel.writeString(this.templateSummary);
        parcel.writeString(this.templateTag);
        parcel.writeString(this.anchorName);
        parcel.writeSerializable(this.music);
        parcel.writeInt(this.previewType);
        parcel.writeInt(this.outPush ? 1 : 0);
        parcel.writeString(this.templateNLE);
    }

    public final String getAnchorName() {
        return this.anchorName;
    }

    public final String getCelebrationShootWay() {
        return this.celebrationShootWay;
    }

    public final Integer getCelebrationType() {
        return this.celebrationType;
    }

    public final int getContentCnt() {
        return this.contentCnt;
    }

    public final String getEntranceType() {
        return this.entranceType;
    }

    public final boolean getHasPoster() {
        return this.hasPoster;
    }

    public final int getLocalCnt() {
        return this.localCnt;
    }

    public final List<CelebrationMediaData> getMediaInfoList() {
        return this.mediaInfoList;
    }

    public final Boolean getMobPreReplayStatus() {
        return this.mobPreReplayStatus;
    }

    public final AVMusic getMusic() {
        return this.music;
    }

    public final String getNleData() {
        return this.nleData;
    }

    public final String getOriginalTemplateId() {
        return this.originalTemplateId;
    }

    public final boolean getOutPush() {
        return this.outPush;
    }

    public final int getPostCnt() {
        return this.postCnt;
    }

    public final int getPreviewType() {
        return this.previewType;
    }

    public final Integer getRenderCardMaterialSize() {
        return this.renderCardMaterialSize;
    }

    public final String getSearchExtra() {
        return this.searchExtra;
    }

    public final int getStoryCnt() {
        return this.storyCnt;
    }

    public final String getTemplateCover() {
        return this.templateCover;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTemplateNLE() {
        return this.templateNLE;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public final String getTemplateSummary() {
        return this.templateSummary;
    }

    public final String getTemplateTag() {
        return this.templateTag;
    }

    public final String getTemplateUrl() {
        return this.templateUrl;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final List<String> getVideoPath() {
        return this.videoPath;
    }

    public final void setAnchorName(String str) {
        this.anchorName = str;
    }

    public final void setCelebrationShootWay(String str) {
        this.celebrationShootWay = str;
    }

    public final void setCelebrationType(Integer num) {
        this.celebrationType = num;
    }

    public final void setContentCnt(int i) {
        this.contentCnt = i;
    }

    public final void setEntranceType(String str) {
        this.entranceType = str;
    }

    public final void setHasPoster(boolean z) {
        this.hasPoster = z;
    }

    public final void setLocalCnt(int i) {
        this.localCnt = i;
    }

    public final void setMediaInfoList(List<CelebrationMediaData> list) {
        this.mediaInfoList = list;
    }

    public final void setMobPreReplayStatus(Boolean bool) {
        this.mobPreReplayStatus = bool;
    }

    public final void setMusic(AVMusic aVMusic) {
        this.music = aVMusic;
    }

    public final void setNleData(String str) {
        this.nleData = str;
    }

    public final void setOriginalTemplateId(String str) {
        this.originalTemplateId = str;
    }

    public final void setOutPush(boolean z) {
        this.outPush = z;
    }

    public final void setPostCnt(int i) {
        this.postCnt = i;
    }

    public final void setPreviewType(int i) {
        this.previewType = i;
    }

    public final void setRenderCardMaterialSize(Integer num) {
        this.renderCardMaterialSize = num;
    }

    public final void setSearchExtra(String str) {
        this.searchExtra = str;
    }

    public final void setStoryCnt(int i) {
        this.storyCnt = i;
    }

    public final void setTemplateCover(String str) {
        this.templateCover = str;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public final void setTemplateNLE(String str) {
        this.templateNLE = str;
    }

    public final void setTemplateName(String str) {
        this.templateName = str;
    }

    public final void setTemplateSummary(String str) {
        this.templateSummary = str;
    }

    public final void setTemplateTag(String str) {
        this.templateTag = str;
    }

    public final void setTemplateUrl(String str) {
        this.templateUrl = str;
    }

    public final void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public final void setVideoPath(List<String> list) {
        this.videoPath = list;
    }

    public CelebrationData(String str, Integer num, String str2, int i, int i2, int i3, int i4, boolean z, String str3, String str4, Boolean bool, String str5, Integer num2, List<String> list, List<CelebrationMediaData> list2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, AVMusic aVMusic, int i5, boolean z2, String str14) {
        this.nleData = str;
        this.celebrationType = num;
        this.uniqueId = str2;
        this.contentCnt = i;
        this.storyCnt = i2;
        this.postCnt = i3;
        this.localCnt = i4;
        this.hasPoster = z;
        this.entranceType = str3;
        this.searchExtra = str4;
        this.mobPreReplayStatus = bool;
        this.celebrationShootWay = str5;
        this.renderCardMaterialSize = num2;
        this.videoPath = list;
        this.mediaInfoList = list2;
        this.originalTemplateId = str6;
        this.templateId = str7;
        this.templateName = str8;
        this.templateCover = str9;
        this.templateUrl = str10;
        this.templateSummary = str11;
        this.templateTag = str12;
        this.anchorName = str13;
        this.music = aVMusic;
        this.previewType = i5;
        this.outPush = z2;
        this.templateNLE = str14;
    }

    public CelebrationData(String str, Integer num, String str2, int i, int i2, int i3, int i4, boolean z, String str3, String str4, Boolean bool, String str5, Integer num2, List list, List list2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, AVMusic aVMusic, int i5, boolean z2, String str14, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? 0 : num, (i6 & 4) != 0 ? null : str2, (i6 & 8) != 0 ? 0 : i, (i6 & 16) != 0 ? 0 : i2, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? true : z, (i6 & 256) != 0 ? null : str3, (i6 & 512) != 0 ? null : str4, (i6 & 1024) != 0 ? null : bool, (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str5, (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : num2, (i6 & 8192) != 0 ? C13BV.INSTANCE : list, (i6 & 16384) != 0 ? C13BV.INSTANCE : list2, (32768 & i6) != 0 ? "" : str6, (65536 & i6) != 0 ? "" : str7, (131072 & i6) != 0 ? "" : str8, (262144 & i6) != 0 ? "" : str9, (524288 & i6) != 0 ? "" : str10, (1048576 & i6) != 0 ? "" : str11, (2097152 & i6) != 0 ? "" : str12, (4194304 & i6) == 0 ? str13 : "", (8388608 & i6) != 0 ? null : aVMusic, (16777216 & i6) != 0 ? 0 : i5, (33554432 & i6) != 0 ? false : z2, (i6 & 67108864) != 0 ? null : str14);
    }
}
