package com.ss.android.ugc.aweme.openshare.entity;

import X.C1B40;
import X.C1B41;

/* JADX INFO: loaded from: classes35.dex */
public final class DYMediaContent {
    public static final C1B41 Companion = new Object() { // from class: X.1B41
    };
    public C1B40 mMediaObject;

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

    public DYMediaContent() {
    }

    public final C1B40 getMMediaObject() {
        return this.mMediaObject;
    }

    public DYMediaContent(C1B40 c1b40) {
        this.mMediaObject = c1b40;
    }

    public final void setMMediaObject(C1B40 c1b40) {
        this.mMediaObject = c1b40;
    }
}
