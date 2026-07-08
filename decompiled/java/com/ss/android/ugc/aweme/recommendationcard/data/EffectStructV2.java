package com.ss.android.ugc.aweme.recommendationcard.data;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class EffectStructV2 {

    @C09CT("effect_id")
    public final String effectId;

    @C09CT("icon_url")
    public final UrlStructV2 iconUrl;

    @C09CT("name")
    public final String name;

    @C09CT("resource_id")
    public final String resourceId;

    public EffectStructV2(String str, UrlStructV2 urlStructV2, String str2, String str3) {
        this.name = str;
        this.iconUrl = urlStructV2;
        this.effectId = str2;
        this.resourceId = str3;
    }
}
