package com.ss.android.ugc.aweme.ecommerce.base.selector.viewmodel;

import X.C004I;
import X.C16CA;
import X.C16CB;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ChooseMediaState implements C004I {
    public static final int $stable = 8;
    public final MediaListState mediaListState;
    public final C16CA photoMediaList;
    public final MediaState previewDockerAddMediaState;
    public final MediaState previewDockerDelMediaState;
    public final MediaState previewMediaState;
    public final TikTokMediaModel selectPhotoMedia;

    public ChooseMediaState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final ChooseMediaState copy(MediaState mediaState, TikTokMediaModel tikTokMediaModel, MediaListState mediaListState, C16CA c16ca, MediaState mediaState2, MediaState mediaState3) {
        return new ChooseMediaState(mediaState, tikTokMediaModel, mediaListState, c16ca, mediaState2, mediaState3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChooseMediaState)) {
            return false;
        }
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return Intrinsics.LJFF(this.previewMediaState, chooseMediaState.previewMediaState) && Intrinsics.LJFF(this.selectPhotoMedia, chooseMediaState.selectPhotoMedia) && Intrinsics.LJFF(this.mediaListState, chooseMediaState.mediaListState) && Intrinsics.LJFF(this.photoMediaList, chooseMediaState.photoMediaList) && Intrinsics.LJFF(this.previewDockerDelMediaState, chooseMediaState.previewDockerDelMediaState) && Intrinsics.LJFF(this.previewDockerAddMediaState, chooseMediaState.previewDockerAddMediaState);
    }

    public int hashCode() {
        int iHashCode = this.previewMediaState.hashCode() * 31;
        TikTokMediaModel tikTokMediaModel = this.selectPhotoMedia;
        return ((((((((iHashCode + (tikTokMediaModel == null ? 0 : tikTokMediaModel.hashCode())) * 31) + this.mediaListState.hashCode()) * 31) + this.photoMediaList.hashCode()) * 31) + this.previewDockerDelMediaState.hashCode()) * 31) + this.previewDockerAddMediaState.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChooseMediaState(previewMediaState=");
        sbLIZ.append(this.previewMediaState);
        sbLIZ.append(", selectPhotoMedia=");
        sbLIZ.append(this.selectPhotoMedia);
        sbLIZ.append(", mediaListState=");
        sbLIZ.append(this.mediaListState);
        sbLIZ.append(", photoMediaList=");
        sbLIZ.append(this.photoMediaList);
        sbLIZ.append(", previewDockerDelMediaState=");
        sbLIZ.append(this.previewDockerDelMediaState);
        sbLIZ.append(", previewDockerAddMediaState=");
        sbLIZ.append(this.previewDockerAddMediaState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final MediaListState getMediaListState() {
        return this.mediaListState;
    }

    public final C16CA getPhotoMediaList() {
        return this.photoMediaList;
    }

    public final MediaState getPreviewDockerAddMediaState() {
        return this.previewDockerAddMediaState;
    }

    public final MediaState getPreviewDockerDelMediaState() {
        return this.previewDockerDelMediaState;
    }

    public final MediaState getPreviewMediaState() {
        return this.previewMediaState;
    }

    public final TikTokMediaModel getSelectPhotoMedia() {
        return this.selectPhotoMedia;
    }

    public ChooseMediaState(MediaState mediaState, TikTokMediaModel tikTokMediaModel, MediaListState mediaListState, C16CA c16ca, MediaState mediaState2, MediaState mediaState3) {
        this.previewMediaState = mediaState;
        this.selectPhotoMedia = tikTokMediaModel;
        this.mediaListState = mediaListState;
        this.photoMediaList = c16ca;
        this.previewDockerDelMediaState = mediaState2;
        this.previewDockerAddMediaState = mediaState3;
    }

    public ChooseMediaState(MediaState mediaState, TikTokMediaModel tikTokMediaModel, MediaListState mediaListState, C16CA c16ca, MediaState mediaState2, MediaState mediaState3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MediaState(null, 0L) : mediaState, (i & 2) != 0 ? null : tikTokMediaModel, (i & 4) != 0 ? new MediaListState(new ArrayList(), 0L, null) : mediaListState, (i & 8) != 0 ? C16CB.LIZ : c16ca, (i & 16) != 0 ? new MediaState(null, 0L) : mediaState2, (i & 32) != 0 ? new MediaState(null, 0L) : mediaState3);
    }
}
