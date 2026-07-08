package com.ss.android.ugc.aweme.services.external.ui;

import X.C123100dR;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.MusicInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoCutAnchorConfig {
    public final AnchorCommonStruct anchor;
    public final MusicInfo awemeMusicInfo;
    public final CreativeInfo creativeInfo;
    public final List<Float> durationList;
    public final String enterFrom;
    public final String enterMethod;
    public final boolean isCommerceMusic;
    public final String mainAnchorType;
    public final int maxClips;
    public final int minClips;
    public final String musicId;
    public final String relationEnterMethod;
    public final String sceneType;
    public final ShootExtraData shootExtraData;
    public final String shootWay;
    public final ArrayList<TemplateSlot> slotList;
    public final String templateGroupId;
    public final String templateId;
    public final MusicInfo templateMusicInfo;
    public final Integer templateType;
    public final String ttTemplateType;

    public String toString() {
        return "AutoCutAnchorConfig(anchor=" + this.anchor + ", templateId=" + this.templateId + ", templateType=" + this.templateType + ", musicId=" + this.musicId + ", minClips=" + this.minClips + ", maxClips=" + this.maxClips + ", isCommerceMusic=" + this.isCommerceMusic + ", durationList=" + this.durationList + ", slotList=" + this.slotList + ", creativeInfo=" + this.creativeInfo + ", shootWay=" + this.shootWay + ", enterFrom=" + this.enterFrom + ", enterMethod=" + this.enterMethod + ", relationEnterMethod=" + this.relationEnterMethod + ", templateGroupId=" + this.templateGroupId + ", mainAnchorType=" + this.mainAnchorType + ", ttTemplateType=" + this.ttTemplateType + ", shootExtraData=" + this.shootExtraData + ", awemeMusicInfo=" + this.awemeMusicInfo + ", templateMusicInfo=" + this.templateMusicInfo + ", sceneType=" + this.sceneType + ')';
    }

    public final boolean isValid() {
        int i;
        return C123100dR.LIZ(this.templateId) && this.minClips >= 0 && (i = this.maxClips) > 0 && i == this.durationList.size();
    }

    public final boolean isCommerceMusic() {
        return this.isCommerceMusic;
    }

    public AutoCutAnchorConfig(AnchorCommonStruct anchorCommonStruct, String str, Integer num, String str2, int i, int i2, boolean z, List<Float> list, ArrayList<TemplateSlot> arrayList, CreativeInfo creativeInfo, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ShootExtraData shootExtraData, MusicInfo musicInfo, MusicInfo musicInfo2, String str10) {
        this.anchor = anchorCommonStruct;
        this.templateId = str;
        this.templateType = num;
        this.musicId = str2;
        this.minClips = i;
        this.maxClips = i2;
        this.isCommerceMusic = z;
        this.durationList = list;
        this.slotList = arrayList;
        this.creativeInfo = creativeInfo;
        this.shootWay = str3;
        this.enterFrom = str4;
        this.enterMethod = str5;
        this.relationEnterMethod = str6;
        this.templateGroupId = str7;
        this.mainAnchorType = str8;
        this.ttTemplateType = str9;
        this.shootExtraData = shootExtraData;
        this.awemeMusicInfo = musicInfo;
        this.templateMusicInfo = musicInfo2;
        this.sceneType = str10;
    }
}
