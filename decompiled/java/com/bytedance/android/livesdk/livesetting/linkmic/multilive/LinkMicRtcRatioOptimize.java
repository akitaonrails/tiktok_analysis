package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

/* JADX INFO: loaded from: classes34.dex */
public final class LinkMicRtcRatioOptimize {
    public static final LinkMicRtcRatioOptimize INSTANCE = new LinkMicRtcRatioOptimize();
    public static String cacheAnchorLinkMicId = "";
    public static String cacheLayoutId = "";
    public static String cacheLayoutKey = "";
    public static int valueFromSEI;

    public static final boolean isAnchorEnable() {
        return INSTANCE.getValue() > 0;
    }

    public static final boolean isAudienceEnable() {
        return valueFromSEI > 0;
    }

    public final int getValue() {
        return LiveAbLabelSetting.INSTANCE.getBooleanValue("linkmic_rtc_ratio_optimize") ? 1 : 0;
    }

    public final String getCacheAnchorLinkMicId() {
        return cacheAnchorLinkMicId;
    }

    public final String getCacheLayoutId() {
        return cacheLayoutId;
    }

    public final String getCacheLayoutKey() {
        return cacheLayoutKey;
    }

    public final int getValueFromSEI() {
        return valueFromSEI;
    }

    public final void setCacheAnchorLinkMicId(String str) {
        cacheAnchorLinkMicId = str;
    }

    public final void setCacheLayoutId(String str) {
        cacheLayoutId = str;
    }

    public final void setCacheLayoutKey(String str) {
        cacheLayoutKey = str;
    }

    public final void setValueFromSEI(int i) {
        valueFromSEI = i;
    }
}
