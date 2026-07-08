package com.ss.android.ugc.aweme.ecommerce.base.selector.viewmodel;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class MediaState implements C004I {
    public static final int $stable = 8;
    public final TikTokMediaModel media;
    public final long value;

    public final MediaState copy(TikTokMediaModel tikTokMediaModel, long j) {
        return new MediaState(tikTokMediaModel, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaState)) {
            return false;
        }
        MediaState mediaState = (MediaState) obj;
        return Intrinsics.LJFF(this.media, mediaState.media) && this.value == mediaState.value;
    }

    public int hashCode() {
        TikTokMediaModel tikTokMediaModel = this.media;
        return ((tikTokMediaModel == null ? 0 : tikTokMediaModel.hashCode()) * 31) + C786410Ut5.Y2(this.value);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaState(media=");
        sbLIZ.append(this.media);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final TikTokMediaModel getMedia() {
        return this.media;
    }

    public final long getValue() {
        return this.value;
    }

    public MediaState(TikTokMediaModel tikTokMediaModel, long j) {
        this.media = tikTokMediaModel;
        this.value = j;
    }
}
