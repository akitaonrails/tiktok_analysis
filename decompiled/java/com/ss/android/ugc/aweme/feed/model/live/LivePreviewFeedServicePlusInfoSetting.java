package com.ss.android.ugc.aweme.feed.model.live;

import X.C0C64;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePreviewFeedServicePlusInfoSetting {
    public static final int DEFAULT = 0;
    public static final LivePreviewFeedServicePlusInfoSetting INSTANCE = new LivePreviewFeedServicePlusInfoSetting();
    public static final int AI_SUMMARY_1 = 1;
    public static final int AI_SUMMARY_2 = 2;
    public static final int HIGH_INTENT_COMMENT = 3;
    public static final int SKU_TITLE = 4;

    public final boolean enableAISummary() {
        return getValue() == AI_SUMMARY_2 || getValue() == AI_SUMMARY_1;
    }

    public final boolean enableBottomInfoStyle() {
        return getValue() == HIGH_INTENT_COMMENT || getValue() == SKU_TITLE;
    }

    public final int getValue() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "live_preview_smb_info_setting", true);
    }

    public final int getAI_SUMMARY_1() {
        return AI_SUMMARY_1;
    }

    public final int getAI_SUMMARY_2() {
        return AI_SUMMARY_2;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getHIGH_INTENT_COMMENT() {
        return HIGH_INTENT_COMMENT;
    }

    public final int getSKU_TITLE() {
        return SKU_TITLE;
    }

    public final boolean canLoadSMBAISummary(LiveRoomStruct liveRoomStruct) {
        SMBLivePreview sMBLivePreview;
        if (enableAISummary() && liveRoomStruct != null && (sMBLivePreview = liveRoomStruct.smbLivePreview) != null && sMBLivePreview.liveAiSummary != null) {
            return true;
        }
        return false;
    }
}
