package com.ss.android.ugc.aweme.story.widget.guide;

import X.C1601110rld;
import X.C288820BTs;
import X.EnumC1487630oob;
import X.EnumC19356010o2;
import com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicLottieConfig;

/* JADX INFO: loaded from: classes30.dex */
public final class StoryWidgetGuideLottieConfig implements IDynamicLottieConfig {
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicLottieConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final /* bridge */ /* synthetic */ String fallback() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicLottieConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    /* JADX INFO: renamed from: fallback, reason: avoid collision after fix types in other method */
    public final String fallback2() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicLottieConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final String key() {
        return "story_widget_guide";
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicLottieConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final boolean enable() {
        return C1601110rld.LIZ() && C288820BTs.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicLottieConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final EnumC1487630oob priority() {
        return EnumC1487630oob.HIGH;
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicLottieConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final EnumC19356010o2 type() {
        return EnumC19356010o2.LOTTIE;
    }
}
