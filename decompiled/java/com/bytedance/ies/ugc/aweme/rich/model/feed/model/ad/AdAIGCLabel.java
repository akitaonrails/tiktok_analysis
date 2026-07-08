package com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad;

import X.C09CT;
import X.C1055270dZF;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAIGCLabel implements Serializable {
    public static final C1055270dZF Companion = new Object() { // from class: X.0dZF
    };

    @C09CT("jump_url")
    public final String jumpUrl;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final Integer type;

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
