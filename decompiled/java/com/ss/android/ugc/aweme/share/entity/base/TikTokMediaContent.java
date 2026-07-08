package com.ss.android.ugc.aweme.share.entity.base;

import X.C1B40;
import X.C1B42;

/* JADX INFO: loaded from: classes35.dex */
public final class TikTokMediaContent {
    public C1B40 mMediaObject;
    public static final C1B42 Companion = new Object() { // from class: X.1B42
    };
    public static final int $stable = 8;

    public final boolean checkArgs() {
        return this.mMediaObject.LIZIZ();
    }

    public final int getType() {
        C1B40 c1b40 = this.mMediaObject;
        if (c1b40 == null) {
            return 0;
        }
        return c1b40.type();
    }

    public TikTokMediaContent() {
    }

    public final C1B40 getMMediaObject() {
        return this.mMediaObject;
    }

    public TikTokMediaContent(C1B40 c1b40) {
        this.mMediaObject = c1b40;
    }

    public final void setMMediaObject(C1B40 c1b40) {
        this.mMediaObject = c1b40;
    }
}
