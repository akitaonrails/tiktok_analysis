package com.ss.android.ugc.aweme.component.playablecomponent;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnolePlayableData implements Serializable {
    public static final int $stable = 0;

    @C09CT("enable_clean_mode")
    public final Integer enableCleanMode;

    @C09CT("playable_url")
    public final String playableUrl;

    public AnolePlayableData() {
        this(null, null);
    }

    public AnolePlayableData(String str, Integer num) {
        this.playableUrl = str;
        this.enableCleanMode = num;
    }
}
