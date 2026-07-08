package com.bytedance.android.livesdk.model;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class PreviewEffect {

    @C09CT("effect_name")
    public String effectName;

    @C09CT("resource_id")
    public String resourceId;

    public PreviewEffect() {
        this("7262038681995710978", "");
    }

    public PreviewEffect(String str, String str2) {
        this.resourceId = str;
        this.effectName = str2;
    }
}
