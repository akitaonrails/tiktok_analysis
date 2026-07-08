package com.ss.android.ugc.aweme.feed.model.ad;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdExternalGuideConfig implements Serializable {

    @C09CT("banner_guide_format")
    public final AdExternalGuideFormatConfig bannerGuideFormat;

    @C09CT("dialog_guide_format")
    public final AdExternalGuideFormatConfig dialogGuideFormat;

    @C09CT("direct_jump_guide_format")
    public final AdExternalGuideFormatConfig directJumpGuideFormat;

    @C09CT("front_end_params")
    public final String frontEndParams;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Format {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ Format[] $VALUES;
        public static final Format BANNER = new Format("BANNER", 0, "banner");
        public static final Format DIALOG = new Format("DIALOG", 1, "dialog");
        public static final Format DIRECT_JUMP = new Format("DIRECT_JUMP", 2, "direct_jump");

        public static final /* synthetic */ Format[] $values() {
            return new Format[]{BANNER, DIALOG, DIRECT_JUMP};
        }

        public static InterfaceC2044707zh<Format> getEntries() {
            return $ENTRIES;
        }

        static {
            Format[] formatArr$values = $values();
            $VALUES = formatArr$values;
            $ENTRIES = new C2254308sP(formatArr$values);
        }

        public static Format[] values() {
            return (Format[]) $VALUES.clone();
        }

        public static Format valueOf(String str) {
            return (Format) C08FF.LIZ(Format.class, str);
        }

        public Format(String str, int i, String str2) {
        }
    }

    public AdExternalGuideConfig() {
        this(null, null, null, null);
    }

    public final AdExternalGuideFormatConfig getBannerGuideFormat() {
        return this.bannerGuideFormat;
    }

    public final AdExternalGuideFormatConfig getDialogGuideFormat() {
        return this.dialogGuideFormat;
    }

    public final AdExternalGuideFormatConfig getDirectJumpGuideFormat() {
        return this.directJumpGuideFormat;
    }

    public final String getFrontEndParams() {
        return this.frontEndParams;
    }

    public AdExternalGuideConfig(String str, AdExternalGuideFormatConfig adExternalGuideFormatConfig, AdExternalGuideFormatConfig adExternalGuideFormatConfig2, AdExternalGuideFormatConfig adExternalGuideFormatConfig3) {
        this.frontEndParams = str;
        this.bannerGuideFormat = adExternalGuideFormatConfig;
        this.dialogGuideFormat = adExternalGuideFormatConfig2;
        this.directJumpGuideFormat = adExternalGuideFormatConfig3;
    }
}
