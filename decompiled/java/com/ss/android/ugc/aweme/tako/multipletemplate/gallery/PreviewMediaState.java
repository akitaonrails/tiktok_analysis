package com.ss.android.ugc.aweme.tako.multipletemplate.gallery;

import X.C004I;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PreviewMediaState implements C004I {
    public static final int $stable = 8;
    public final TikTokMediaModel media;
    public final int position;

    public PreviewMediaState() {
        this(null, -1);
    }

    public final PreviewMediaState copy(TikTokMediaModel tikTokMediaModel, int i) {
        return new PreviewMediaState(tikTokMediaModel, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewMediaState)) {
            return false;
        }
        PreviewMediaState previewMediaState = (PreviewMediaState) obj;
        return Intrinsics.LJFF(this.media, previewMediaState.media) && this.position == previewMediaState.position;
    }

    public int hashCode() {
        TikTokMediaModel tikTokMediaModel = this.media;
        return ((tikTokMediaModel == null ? 0 : tikTokMediaModel.hashCode()) * 31) + this.position;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewMediaState(media=");
        sbLIZ.append(this.media);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final TikTokMediaModel getMedia() {
        return this.media;
    }

    public final int getPosition() {
        return this.position;
    }

    public PreviewMediaState(TikTokMediaModel tikTokMediaModel, int i) {
        this.media = tikTokMediaModel;
        this.position = i;
    }
}
