package com.ss.android.ugc.aweme.services.external.ui.config;

import X.C123100dR;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class PhotoModeTemplateAnchorConfig {
    public final AnchorCommonStruct anchor;
    public final CreativeInfo creativeInfo;
    public final String enterFrom;
    public final String enterMethod;
    public final String mainAnchorType;
    public final int maxClips;
    public final int minClips;
    public MusicModel musicModel;
    public final String relationEnterMethod;
    public final String shootWay;
    public final ArrayList<TemplateSlot> slotList;
    public final String templateId;
    public final String ttTemplateType;

    public final boolean isValid() {
        int i;
        return C123100dR.LIZ(this.templateId) && this.minClips >= 0 && (i = this.maxClips) > 0 && i == this.slotList.size();
    }

    public final AnchorCommonStruct getAnchor() {
        return this.anchor;
    }

    public final CreativeInfo getCreativeInfo() {
        return this.creativeInfo;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getMainAnchorType() {
        return this.mainAnchorType;
    }

    public final int getMaxClips() {
        return this.maxClips;
    }

    public final int getMinClips() {
        return this.minClips;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final String getRelationEnterMethod() {
        return this.relationEnterMethod;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final ArrayList<TemplateSlot> getSlotList() {
        return this.slotList;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTtTemplateType() {
        return this.ttTemplateType;
    }

    public final void setMusicModel(MusicModel musicModel) {
        this.musicModel = musicModel;
    }

    public PhotoModeTemplateAnchorConfig(AnchorCommonStruct anchorCommonStruct, int i, int i2, String str, ArrayList<TemplateSlot> arrayList, CreativeInfo creativeInfo, String str2, String str3, String str4, String str5, String str6, String str7, MusicModel musicModel) {
        this.anchor = anchorCommonStruct;
        this.minClips = i;
        this.maxClips = i2;
        this.templateId = str;
        this.slotList = arrayList;
        this.creativeInfo = creativeInfo;
        this.shootWay = str2;
        this.enterFrom = str3;
        this.enterMethod = str4;
        this.relationEnterMethod = str5;
        this.mainAnchorType = str6;
        this.ttTemplateType = str7;
        this.musicModel = musicModel;
    }
}
