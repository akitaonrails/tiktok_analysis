package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class AdAIGCLabel implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("jump_url")
    public final String jumpUrl;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final Integer type;

    public static final class Companion {
    }

    public AdAIGCLabel() {
        this(null, null, null);
    }

    public final Integer mobEventType() {
        Integer num = this.type;
        if (num == null) {
            return null;
        }
        if (num.intValue() == 2) {
            return 0;
        }
        return num.intValue() == 3 ? 1 : null;
    }

    public AdAIGCLabel(String str, Integer num, String str2) {
        this.text = str;
        this.type = num;
        this.jumpUrl = str2;
    }
}
