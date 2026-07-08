package com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import X.C004I;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewMediaState implements C004I {
    public static final int $stable = 8;
    public final List<TikTokMediaModel> mediaPath;
    public final List<TikTokMediaModel> selectedMediaPath;

    public PreviewMediaState() {
        this(null, null, 3, null);
    }

    public final PreviewMediaState copy(List<? extends TikTokMediaModel> list, List<? extends TikTokMediaModel> list2) {
        return new PreviewMediaState(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewMediaState)) {
            return false;
        }
        PreviewMediaState previewMediaState = (PreviewMediaState) obj;
        return Intrinsics.LJFF(this.mediaPath, previewMediaState.mediaPath) && Intrinsics.LJFF(this.selectedMediaPath, previewMediaState.selectedMediaPath);
    }

    public int hashCode() {
        return (this.mediaPath.hashCode() * 31) + this.selectedMediaPath.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewMediaState(mediaPath=");
        sbLIZ.append(this.mediaPath);
        sbLIZ.append(", selectedMediaPath=");
        sbLIZ.append(this.selectedMediaPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<TikTokMediaModel> getMediaPath() {
        return this.mediaPath;
    }

    public final List<TikTokMediaModel> getSelectedMediaPath() {
        return this.selectedMediaPath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreviewMediaState(List<? extends TikTokMediaModel> list, List<? extends TikTokMediaModel> list2) {
        this.mediaPath = list;
        this.selectedMediaPath = list2;
    }

    public PreviewMediaState(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
