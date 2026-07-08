package com.ss.android.ugc.tiktok.tpsc.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class ContentReuseAccountExtra extends PopupExtra {

    @C09CT("no_pa_create_sticker")
    public final int noPaCreateSticker;

    @C09CT("no_pa_duet")
    public final int noPaDuet;

    @C09CT("no_pa_share_to_story")
    public final int noPaShareToStory;

    @C09CT("no_pa_stitch")
    public final int noPaStitch;

    public ContentReuseAccountExtra() {
        this(0, 0, 1, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentReuseAccountExtra)) {
            return false;
        }
        ContentReuseAccountExtra contentReuseAccountExtra = (ContentReuseAccountExtra) obj;
        return this.noPaDuet == contentReuseAccountExtra.noPaDuet && this.noPaStitch == contentReuseAccountExtra.noPaStitch && this.noPaCreateSticker == contentReuseAccountExtra.noPaCreateSticker && this.noPaShareToStory == contentReuseAccountExtra.noPaShareToStory;
    }

    public final int hashCode() {
        return (((((this.noPaDuet * 31) + this.noPaStitch) * 31) + this.noPaCreateSticker) * 31) + this.noPaShareToStory;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentReuseAccountExtra(noPaDuet=");
        sbLIZ.append(this.noPaDuet);
        sbLIZ.append(", noPaStitch=");
        sbLIZ.append(this.noPaStitch);
        sbLIZ.append(", noPaCreateSticker=");
        sbLIZ.append(this.noPaCreateSticker);
        sbLIZ.append(", noPaShareToStory=");
        sbLIZ.append(this.noPaShareToStory);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ContentReuseAccountExtra(int i, int i2, int i3, int i4) {
        super(0);
        this.noPaDuet = i;
        this.noPaStitch = i2;
        this.noPaCreateSticker = i3;
        this.noPaShareToStory = i4;
    }
}
