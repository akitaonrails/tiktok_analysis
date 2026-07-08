package com.ss.android.ugc.aweme.mvtheme;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class BirthdayEffectTemplate implements Serializable {

    @C09CT("effect_id")
    public final String effectId;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("name")
    public final String name;

    public BirthdayEffectTemplate(String str, String str2, String str3) {
        this.effectId = str;
        this.name = str2;
        this.iconUrl = str3;
    }
}
