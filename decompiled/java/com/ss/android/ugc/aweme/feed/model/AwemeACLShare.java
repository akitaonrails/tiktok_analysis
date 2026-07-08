package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AwemeACLShare implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("download_general")
    public ACLCommonShare downloadGeneral;

    @C09CT("download_mask_panel")
    public ACLCommonShare downloadMaskPanel;

    @C09CT("download_share_panel")
    public ACLCommonShare downloadSharePanel;

    @C09CT("platform_list")
    public List<ACLCommonShare> platformList;

    @C09CT("press_action_list")
    public List<ACLCommonShare> pressActionList;

    @C09CT("share_action_list")
    public List<ACLCommonShare> shareActionList;

    @C09CT("share_general")
    public ACLCommonShare shareGeneral;

    @C09CT("share_list_status")
    public int shareListStatus;

    @C09CT("share_third_platform")
    public ACLCommonShare shareThirdPlatform;

    public static final class Companion {
    }

    public final ACLCommonShare getDownloadGeneral() {
        return this.downloadGeneral;
    }

    public final ACLCommonShare getDownloadMaskPanel() {
        return this.downloadMaskPanel;
    }

    public final ACLCommonShare getDownloadSharePanel() {
        return this.downloadSharePanel;
    }

    public final List<ACLCommonShare> getPlatformList() {
        return this.platformList;
    }

    public final List<ACLCommonShare> getPressActionList() {
        return this.pressActionList;
    }

    public final List<ACLCommonShare> getShareActionList() {
        return this.shareActionList;
    }

    public final ACLCommonShare getShareGeneral() {
        return this.shareGeneral;
    }

    public final int getShareListStat() {
        return this.shareListStatus;
    }

    public final int getShareListStatus() {
        return this.shareListStatus;
    }

    public final ACLCommonShare getShareThirdPlatform() {
        return this.shareThirdPlatform;
    }

    public final void setDownloadGeneral(ACLCommonShare aCLCommonShare) {
        this.downloadGeneral = aCLCommonShare;
    }

    public final void setDownloadMaskPanel(ACLCommonShare aCLCommonShare) {
        this.downloadMaskPanel = aCLCommonShare;
    }

    public final void setDownloadSharePanel(ACLCommonShare aCLCommonShare) {
        this.downloadSharePanel = aCLCommonShare;
    }

    public final void setPlatformList(List<ACLCommonShare> list) {
        this.platformList = list;
    }

    public final void setPressActionList(List<ACLCommonShare> list) {
        this.pressActionList = list;
    }

    public final void setShareActionList(List<ACLCommonShare> list) {
        this.shareActionList = list;
    }

    public final void setShareGeneral(ACLCommonShare aCLCommonShare) {
        this.shareGeneral = aCLCommonShare;
    }

    public final void setShareListStatus(int i) {
        this.shareListStatus = i;
    }

    public final void setShareThirdPlatform(ACLCommonShare aCLCommonShare) {
        this.shareThirdPlatform = aCLCommonShare;
    }
}
