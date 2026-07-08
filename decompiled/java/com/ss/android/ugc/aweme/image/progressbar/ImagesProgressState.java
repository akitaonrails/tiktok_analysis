package com.ss.android.ugc.aweme.image.progressbar;

import X.AbstractC194560119y;
import X.C0LCS;
import X.C11A0;
import X.C2188811AlT;
import X.C529130Kp5;
import X.C529140Kp6;
import X.C529150Kp7;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ImagesProgressState extends UiState {
    public static final int $stable = 8;
    public final C529130Kp5 animViewState;
    public final C529140Kp6 bottomMargin;
    public final C0LCS<LivePhotoPreviewMode> liveModeChanged;
    public final C529130Kp5 pause;
    public final Pair<Integer, Float> progress;
    public final C529150Kp7 resume;
    public final C529150Kp7 stopAutoPlay;
    public final AbstractC194560119y ui;
    public final C529150Kp7 updateCount;
    public final C529130Kp5 viewState;

    public ImagesProgressState() {
        this(new C11A0(), null, null, null, null, null, null, null, null, null);
    }

    public final ImagesProgressState copy(AbstractC194560119y abstractC194560119y, Pair<Integer, Float> pair, C529150Kp7 c529150Kp7, C529130Kp5 c529130Kp5, C529150Kp7 c529150Kp72, C0LCS<? extends LivePhotoPreviewMode> c0lcs, C529150Kp7 c529150Kp73, C529130Kp5 c529130Kp52, C529130Kp5 c529130Kp53, C529140Kp6 c529140Kp6) {
        return new ImagesProgressState(abstractC194560119y, pair, c529150Kp7, c529130Kp5, c529150Kp72, c0lcs, c529150Kp73, c529130Kp52, c529130Kp53, c529140Kp6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagesProgressState)) {
            return false;
        }
        ImagesProgressState imagesProgressState = (ImagesProgressState) obj;
        return Intrinsics.LJFF(this.ui, imagesProgressState.ui) && Intrinsics.LJFF(this.progress, imagesProgressState.progress) && Intrinsics.LJFF(this.updateCount, imagesProgressState.updateCount) && Intrinsics.LJFF(this.pause, imagesProgressState.pause) && Intrinsics.LJFF(this.stopAutoPlay, imagesProgressState.stopAutoPlay) && Intrinsics.LJFF(this.liveModeChanged, imagesProgressState.liveModeChanged) && Intrinsics.LJFF(this.resume, imagesProgressState.resume) && Intrinsics.LJFF(this.viewState, imagesProgressState.viewState) && Intrinsics.LJFF(this.animViewState, imagesProgressState.animViewState) && Intrinsics.LJFF(this.bottomMargin, imagesProgressState.bottomMargin);
    }

    public int hashCode() {
        int iHashCode = this.ui.hashCode() * 31;
        Pair<Integer, Float> pair = this.progress;
        int iHashCode2 = (iHashCode + (pair == null ? 0 : pair.hashCode())) * 31;
        C529150Kp7 c529150Kp7 = this.updateCount;
        int iHashCode3 = (iHashCode2 + (c529150Kp7 == null ? 0 : c529150Kp7.hashCode())) * 31;
        C529130Kp5 c529130Kp5 = this.pause;
        int iHashCode4 = (iHashCode3 + (c529130Kp5 == null ? 0 : c529130Kp5.hashCode())) * 31;
        C529150Kp7 c529150Kp72 = this.stopAutoPlay;
        int iHashCode5 = (iHashCode4 + (c529150Kp72 == null ? 0 : c529150Kp72.hashCode())) * 31;
        C0LCS<LivePhotoPreviewMode> c0lcs = this.liveModeChanged;
        int iHashCode6 = (iHashCode5 + (c0lcs == null ? 0 : c0lcs.hashCode())) * 31;
        C529150Kp7 c529150Kp73 = this.resume;
        int iHashCode7 = (iHashCode6 + (c529150Kp73 == null ? 0 : c529150Kp73.hashCode())) * 31;
        C529130Kp5 c529130Kp52 = this.viewState;
        int iHashCode8 = (iHashCode7 + (c529130Kp52 == null ? 0 : c529130Kp52.hashCode())) * 31;
        C529130Kp5 c529130Kp53 = this.animViewState;
        int iHashCode9 = (iHashCode8 + (c529130Kp53 == null ? 0 : c529130Kp53.hashCode())) * 31;
        C529140Kp6 c529140Kp6 = this.bottomMargin;
        return iHashCode9 + (c529140Kp6 != null ? c529140Kp6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImagesProgressState(ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.progress);
        sbLIZ.append(", updateCount=");
        sbLIZ.append(this.updateCount);
        sbLIZ.append(", pause=");
        sbLIZ.append(this.pause);
        sbLIZ.append(", stopAutoPlay=");
        sbLIZ.append(this.stopAutoPlay);
        sbLIZ.append(", liveModeChanged=");
        sbLIZ.append(this.liveModeChanged);
        sbLIZ.append(", resume=");
        sbLIZ.append(this.resume);
        sbLIZ.append(", viewState=");
        sbLIZ.append(this.viewState);
        sbLIZ.append(", animViewState=");
        sbLIZ.append(this.animViewState);
        sbLIZ.append(", bottomMargin=");
        sbLIZ.append(this.bottomMargin);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C529130Kp5 getAnimViewState() {
        return this.animViewState;
    }

    public final C529140Kp6 getBottomMargin() {
        return this.bottomMargin;
    }

    public final C0LCS<LivePhotoPreviewMode> getLiveModeChanged() {
        return this.liveModeChanged;
    }

    public final C529130Kp5 getPause() {
        return this.pause;
    }

    public final Pair<Integer, Float> getProgress() {
        return this.progress;
    }

    public final C529150Kp7 getResume() {
        return this.resume;
    }

    public final C529150Kp7 getStopAutoPlay() {
        return this.stopAutoPlay;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public final C529150Kp7 getUpdateCount() {
        return this.updateCount;
    }

    public final C529130Kp5 getViewState() {
        return this.viewState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImagesProgressState(AbstractC194560119y abstractC194560119y, Pair<Integer, Float> pair, C529150Kp7 c529150Kp7, C529130Kp5 c529130Kp5, C529150Kp7 c529150Kp72, C0LCS<? extends LivePhotoPreviewMode> c0lcs, C529150Kp7 c529150Kp73, C529130Kp5 c529130Kp52, C529130Kp5 c529130Kp53, C529140Kp6 c529140Kp6) {
        super(abstractC194560119y);
        this.ui = abstractC194560119y;
        this.progress = pair;
        this.updateCount = c529150Kp7;
        this.pause = c529130Kp5;
        this.stopAutoPlay = c529150Kp72;
        this.liveModeChanged = c0lcs;
        this.resume = c529150Kp73;
        this.viewState = c529130Kp52;
        this.animViewState = c529130Kp53;
        this.bottomMargin = c529140Kp6;
    }
}
