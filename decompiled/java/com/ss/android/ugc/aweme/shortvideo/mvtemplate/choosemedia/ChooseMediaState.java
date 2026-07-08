package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C004I;
import X.C0LCS;
import X.C13BV;
import X.C527250Km3;
import X.C528640KoI;
import X.C528730KoR;
import X.C528740KoS;
import X.C529110Kp3;
import X.C529130Kp5;
import X.C529140Kp6;
import X.C529150Kp7;
import X.C786410Ut5;
import X.EnumC538220L8y;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.HideShowChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ChooseMediaState implements C004I {
    public static final int $stable = 8;
    public final C528640KoI aiContentMediaList;
    public final C528740KoS albumAssetCount;
    public final AlbumToEditPageState albumToEditPageState;
    public final boolean albumViewFullShow;
    public final C528640KoI allMediaList;
    public final AutoPickSelectedListState autoPickSelectedMedias;
    public final ClosingChooseMediaPageState closingChooseMediaPageState;
    public final MediaListState defaultSelectMediaList;
    public final C529150Kp7 dockerHasShown;
    public final C528640KoI glanceMediaList;
    public final MediaListState goNextMediaState;
    public final HideShowChooseMediaPageState hideShowChooseMediaPageState;
    public final boolean isChangeMusicDownloadSuccess;
    public final boolean isClickUseEffectBtn;
    public final PreMusicState lastPreMusicState;
    public final C528640KoI livePhotoMediaList;
    public final C529130Kp5 liveRecordingsCardShownInFirstScreen;
    public final C528640KoI liveRecordingsMediaList;
    public final MediaListState mediaListState;
    public final C0LCS<Unit> mobReEnterUploadPage;
    public final C0LCS<MediaModel> mobUnselectMediaFromCheckBox;
    public final MediaState nextBtnWithDirectUseState;
    public final C0LCS<MediaModel> notifyMobUnselectMediaFromX;
    public final C529110Kp3 notifyRefreshCoverWhenExitPreviewPage;
    public final MediaState notifyRefreshLivePhotoState;
    public final MediaListState onLoadAiContentMediaList;
    public final MediaListState onLoadLiveRecordingsMediaList;
    public final OpeningChooseMediaPageState openingChooseMediaPageState;
    public final C528640KoI photoMediaList;
    public final PreMusicState preChangeMusicState;
    public final PreMusicState preMusicState;
    public final TikTokMediaModel previewAutoCutBtnClickState;
    public final PreviewNextBtnState previewAutoCutBtnState;
    public final MediaState previewDockerAddMediaState;
    public final MediaState previewDockerDelMediaState;
    public final MediaListState previewDockerInitMediaList;
    public final PreviewDockerState previewDockerState;
    public final PreviewNextBtnState previewEditProBtnState;
    public final MediaState previewMediaState;
    public final C529150Kp7 previewNextBtnClickState;
    public final MediaState previewNextBtnMediaState;
    public final PreviewNextBtnState previewNextBtnState;
    public final PreviewSwapState previewSwapState;
    public final C529130Kp5 recordPageExitState;
    public final RecordPresetResourceState recordPresetResourceState;
    public final MediaState selectMediaState;
    public final C529130Kp5 showAiContentGuideView;
    public final C529130Kp5 showLiveRecordingsFloatingGuide;
    public final C529140Kp6 tabCurrentItemType;
    public final MediaState unSelectMediaState;
    public final TikTokMediaModel updateSelectedMediaClipRange;
    public final C528640KoI videoMediaList;

    public ChooseMediaState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1048575, null);
    }

    public final ChooseMediaState copy(MediaListState mediaListState, MediaState mediaState, MediaState mediaState2, TikTokMediaModel tikTokMediaModel, MediaState mediaState3, PreMusicState preMusicState, PreMusicState preMusicState2, PreMusicState preMusicState3, OpeningChooseMediaPageState openingChooseMediaPageState, ClosingChooseMediaPageState closingChooseMediaPageState, HideShowChooseMediaPageState hideShowChooseMediaPageState, C528740KoS c528740KoS, C528640KoI c528640KoI, C528640KoI c528640KoI2, C528640KoI c528640KoI3, C528640KoI c528640KoI4, C528640KoI c528640KoI5, C528640KoI c528640KoI6, C528640KoI c528640KoI7, boolean z, PreviewDockerState previewDockerState, MediaListState mediaListState2, PreviewSwapState previewSwapState, MediaState mediaState4, MediaState mediaState5, MediaState mediaState6, MediaState mediaState7, C529150Kp7 c529150Kp7, PreviewNextBtnState previewNextBtnState, TikTokMediaModel tikTokMediaModel2, boolean z2, C529150Kp7 c529150Kp72, boolean z3, RecordPresetResourceState recordPresetResourceState, AlbumToEditPageState albumToEditPageState, C529110Kp3 c529110Kp3, AutoPickSelectedListState autoPickSelectedListState, MediaState mediaState8, MediaListState mediaListState3, C529130Kp5 c529130Kp5, PreviewNextBtnState previewNextBtnState2, PreviewNextBtnState previewNextBtnState3, C529140Kp6 c529140Kp6, C529130Kp5 c529130Kp52, C529130Kp5 c529130Kp53, C529130Kp5 c529130Kp54, MediaListState mediaListState4, MediaListState mediaListState5, MediaListState mediaListState6, C0LCS<? extends MediaModel> c0lcs, C0LCS<? extends MediaModel> c0lcs2, C0LCS<Unit> c0lcs3) {
        return new ChooseMediaState(mediaListState, mediaState, mediaState2, tikTokMediaModel, mediaState3, preMusicState, preMusicState2, preMusicState3, openingChooseMediaPageState, closingChooseMediaPageState, hideShowChooseMediaPageState, c528740KoS, c528640KoI, c528640KoI2, c528640KoI3, c528640KoI4, c528640KoI5, c528640KoI6, c528640KoI7, z, previewDockerState, mediaListState2, previewSwapState, mediaState4, mediaState5, mediaState6, mediaState7, c529150Kp7, previewNextBtnState, tikTokMediaModel2, z2, c529150Kp72, z3, recordPresetResourceState, albumToEditPageState, c529110Kp3, autoPickSelectedListState, mediaState8, mediaListState3, c529130Kp5, previewNextBtnState2, previewNextBtnState3, c529140Kp6, c529130Kp52, c529130Kp53, c529130Kp54, mediaListState4, mediaListState5, mediaListState6, c0lcs, c0lcs2, c0lcs3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChooseMediaState)) {
            return false;
        }
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return Intrinsics.LJFF(this.mediaListState, chooseMediaState.mediaListState) && Intrinsics.LJFF(this.selectMediaState, chooseMediaState.selectMediaState) && Intrinsics.LJFF(this.unSelectMediaState, chooseMediaState.unSelectMediaState) && Intrinsics.LJFF(this.updateSelectedMediaClipRange, chooseMediaState.updateSelectedMediaClipRange) && Intrinsics.LJFF(this.previewMediaState, chooseMediaState.previewMediaState) && Intrinsics.LJFF(this.preMusicState, chooseMediaState.preMusicState) && Intrinsics.LJFF(this.preChangeMusicState, chooseMediaState.preChangeMusicState) && Intrinsics.LJFF(this.lastPreMusicState, chooseMediaState.lastPreMusicState) && Intrinsics.LJFF(this.openingChooseMediaPageState, chooseMediaState.openingChooseMediaPageState) && Intrinsics.LJFF(this.closingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState) && Intrinsics.LJFF(this.hideShowChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState) && Intrinsics.LJFF(this.albumAssetCount, chooseMediaState.albumAssetCount) && Intrinsics.LJFF(this.allMediaList, chooseMediaState.allMediaList) && Intrinsics.LJFF(this.photoMediaList, chooseMediaState.photoMediaList) && Intrinsics.LJFF(this.videoMediaList, chooseMediaState.videoMediaList) && Intrinsics.LJFF(this.glanceMediaList, chooseMediaState.glanceMediaList) && Intrinsics.LJFF(this.livePhotoMediaList, chooseMediaState.livePhotoMediaList) && Intrinsics.LJFF(this.aiContentMediaList, chooseMediaState.aiContentMediaList) && Intrinsics.LJFF(this.liveRecordingsMediaList, chooseMediaState.liveRecordingsMediaList) && this.isChangeMusicDownloadSuccess == chooseMediaState.isChangeMusicDownloadSuccess && Intrinsics.LJFF(this.previewDockerState, chooseMediaState.previewDockerState) && Intrinsics.LJFF(this.previewDockerInitMediaList, chooseMediaState.previewDockerInitMediaList) && Intrinsics.LJFF(this.previewSwapState, chooseMediaState.previewSwapState) && Intrinsics.LJFF(this.previewDockerDelMediaState, chooseMediaState.previewDockerDelMediaState) && Intrinsics.LJFF(this.previewDockerAddMediaState, chooseMediaState.previewDockerAddMediaState) && Intrinsics.LJFF(this.previewNextBtnMediaState, chooseMediaState.previewNextBtnMediaState) && Intrinsics.LJFF(this.nextBtnWithDirectUseState, chooseMediaState.nextBtnWithDirectUseState) && Intrinsics.LJFF(this.previewNextBtnClickState, chooseMediaState.previewNextBtnClickState) && Intrinsics.LJFF(this.previewNextBtnState, chooseMediaState.previewNextBtnState) && Intrinsics.LJFF(this.previewAutoCutBtnClickState, chooseMediaState.previewAutoCutBtnClickState) && this.isClickUseEffectBtn == chooseMediaState.isClickUseEffectBtn && Intrinsics.LJFF(this.dockerHasShown, chooseMediaState.dockerHasShown) && this.albumViewFullShow == chooseMediaState.albumViewFullShow && Intrinsics.LJFF(this.recordPresetResourceState, chooseMediaState.recordPresetResourceState) && Intrinsics.LJFF(this.albumToEditPageState, chooseMediaState.albumToEditPageState) && Intrinsics.LJFF(this.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage) && Intrinsics.LJFF(this.autoPickSelectedMedias, chooseMediaState.autoPickSelectedMedias) && Intrinsics.LJFF(this.notifyRefreshLivePhotoState, chooseMediaState.notifyRefreshLivePhotoState) && Intrinsics.LJFF(this.goNextMediaState, chooseMediaState.goNextMediaState) && Intrinsics.LJFF(this.recordPageExitState, chooseMediaState.recordPageExitState) && Intrinsics.LJFF(this.previewAutoCutBtnState, chooseMediaState.previewAutoCutBtnState) && Intrinsics.LJFF(this.previewEditProBtnState, chooseMediaState.previewEditProBtnState) && Intrinsics.LJFF(this.tabCurrentItemType, chooseMediaState.tabCurrentItemType) && Intrinsics.LJFF(this.showAiContentGuideView, chooseMediaState.showAiContentGuideView) && Intrinsics.LJFF(this.showLiveRecordingsFloatingGuide, chooseMediaState.showLiveRecordingsFloatingGuide) && Intrinsics.LJFF(this.liveRecordingsCardShownInFirstScreen, chooseMediaState.liveRecordingsCardShownInFirstScreen) && Intrinsics.LJFF(this.onLoadAiContentMediaList, chooseMediaState.onLoadAiContentMediaList) && Intrinsics.LJFF(this.defaultSelectMediaList, chooseMediaState.defaultSelectMediaList) && Intrinsics.LJFF(this.onLoadLiveRecordingsMediaList, chooseMediaState.onLoadLiveRecordingsMediaList) && Intrinsics.LJFF(this.mobUnselectMediaFromCheckBox, chooseMediaState.mobUnselectMediaFromCheckBox) && Intrinsics.LJFF(this.notifyMobUnselectMediaFromX, chooseMediaState.notifyMobUnselectMediaFromX) && Intrinsics.LJFF(this.mobReEnterUploadPage, chooseMediaState.mobReEnterUploadPage);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.mediaListState.hashCode() * 31) + this.selectMediaState.hashCode()) * 31) + this.unSelectMediaState.hashCode()) * 31) + this.updateSelectedMediaClipRange.hashCode()) * 31) + this.previewMediaState.hashCode()) * 31) + this.preMusicState.hashCode()) * 31) + this.preChangeMusicState.hashCode()) * 31) + this.lastPreMusicState.hashCode()) * 31) + this.openingChooseMediaPageState.hashCode()) * 31;
        ClosingChooseMediaPageState closingChooseMediaPageState = this.closingChooseMediaPageState;
        int iHashCode2 = (iHashCode + (closingChooseMediaPageState == null ? 0 : closingChooseMediaPageState.hashCode())) * 31;
        HideShowChooseMediaPageState hideShowChooseMediaPageState = this.hideShowChooseMediaPageState;
        int iHashCode3 = (iHashCode2 + (hideShowChooseMediaPageState == null ? 0 : hideShowChooseMediaPageState.hashCode())) * 31;
        C528740KoS c528740KoS = this.albumAssetCount;
        int iHashCode4 = (((((((((((((((((((((((((((((((iHashCode3 + (c528740KoS == null ? 0 : c528740KoS.hashCode())) * 31) + this.allMediaList.hashCode()) * 31) + this.photoMediaList.hashCode()) * 31) + this.videoMediaList.hashCode()) * 31) + this.glanceMediaList.hashCode()) * 31) + this.livePhotoMediaList.hashCode()) * 31) + this.aiContentMediaList.hashCode()) * 31) + this.liveRecordingsMediaList.hashCode()) * 31) + C786410Ut5.Z2(this.isChangeMusicDownloadSuccess)) * 31) + this.previewDockerState.hashCode()) * 31) + this.previewDockerInitMediaList.hashCode()) * 31) + this.previewSwapState.hashCode()) * 31) + this.previewDockerDelMediaState.hashCode()) * 31) + this.previewDockerAddMediaState.hashCode()) * 31) + this.previewNextBtnMediaState.hashCode()) * 31) + this.nextBtnWithDirectUseState.hashCode()) * 31;
        C529150Kp7 c529150Kp7 = this.previewNextBtnClickState;
        int iHashCode5 = (((iHashCode4 + (c529150Kp7 == null ? 0 : c529150Kp7.hashCode())) * 31) + this.previewNextBtnState.hashCode()) * 31;
        TikTokMediaModel tikTokMediaModel = this.previewAutoCutBtnClickState;
        int iHashCode6 = (((iHashCode5 + (tikTokMediaModel == null ? 0 : tikTokMediaModel.hashCode())) * 31) + C786410Ut5.Z2(this.isClickUseEffectBtn)) * 31;
        C529150Kp7 c529150Kp72 = this.dockerHasShown;
        int iHashCode7 = (((((((((((((((((((((((iHashCode6 + (c529150Kp72 == null ? 0 : c529150Kp72.hashCode())) * 31) + C786410Ut5.Z2(this.albumViewFullShow)) * 31) + this.recordPresetResourceState.hashCode()) * 31) + this.albumToEditPageState.hashCode()) * 31) + this.notifyRefreshCoverWhenExitPreviewPage.hashCode()) * 31) + this.autoPickSelectedMedias.hashCode()) * 31) + this.notifyRefreshLivePhotoState.hashCode()) * 31) + this.goNextMediaState.hashCode()) * 31) + this.recordPageExitState.hashCode()) * 31) + this.previewAutoCutBtnState.hashCode()) * 31) + this.previewEditProBtnState.hashCode()) * 31) + this.tabCurrentItemType.hashCode()) * 31;
        C529130Kp5 c529130Kp5 = this.showAiContentGuideView;
        int iHashCode8 = (iHashCode7 + (c529130Kp5 == null ? 0 : c529130Kp5.hashCode())) * 31;
        C529130Kp5 c529130Kp52 = this.showLiveRecordingsFloatingGuide;
        int iHashCode9 = (iHashCode8 + (c529130Kp52 == null ? 0 : c529130Kp52.hashCode())) * 31;
        C529130Kp5 c529130Kp53 = this.liveRecordingsCardShownInFirstScreen;
        int iHashCode10 = (iHashCode9 + (c529130Kp53 == null ? 0 : c529130Kp53.hashCode())) * 31;
        MediaListState mediaListState = this.onLoadAiContentMediaList;
        int iHashCode11 = (iHashCode10 + (mediaListState == null ? 0 : mediaListState.hashCode())) * 31;
        MediaListState mediaListState2 = this.defaultSelectMediaList;
        int iHashCode12 = (iHashCode11 + (mediaListState2 == null ? 0 : mediaListState2.hashCode())) * 31;
        MediaListState mediaListState3 = this.onLoadLiveRecordingsMediaList;
        int iHashCode13 = (iHashCode12 + (mediaListState3 == null ? 0 : mediaListState3.hashCode())) * 31;
        C0LCS<MediaModel> c0lcs = this.mobUnselectMediaFromCheckBox;
        int iHashCode14 = (iHashCode13 + (c0lcs == null ? 0 : c0lcs.hashCode())) * 31;
        C0LCS<MediaModel> c0lcs2 = this.notifyMobUnselectMediaFromX;
        int iHashCode15 = (iHashCode14 + (c0lcs2 == null ? 0 : c0lcs2.hashCode())) * 31;
        C0LCS<Unit> c0lcs3 = this.mobReEnterUploadPage;
        return iHashCode15 + (c0lcs3 != null ? c0lcs3.hashCode() : 0);
    }

    public String toString() {
        return "ChooseMediaState(mediaListState=" + this.mediaListState + ", selectMediaState=" + this.selectMediaState + ", unSelectMediaState=" + this.unSelectMediaState + ", updateSelectedMediaClipRange=" + this.updateSelectedMediaClipRange + ", previewMediaState=" + this.previewMediaState + ", preMusicState=" + this.preMusicState + ", preChangeMusicState=" + this.preChangeMusicState + ", lastPreMusicState=" + this.lastPreMusicState + ", openingChooseMediaPageState=" + this.openingChooseMediaPageState + ", closingChooseMediaPageState=" + this.closingChooseMediaPageState + ", hideShowChooseMediaPageState=" + this.hideShowChooseMediaPageState + ", albumAssetCount=" + this.albumAssetCount + ", allMediaList=" + this.allMediaList + ", photoMediaList=" + this.photoMediaList + ", videoMediaList=" + this.videoMediaList + ", glanceMediaList=" + this.glanceMediaList + ", livePhotoMediaList=" + this.livePhotoMediaList + ", aiContentMediaList=" + this.aiContentMediaList + ", liveRecordingsMediaList=" + this.liveRecordingsMediaList + ", isChangeMusicDownloadSuccess=" + this.isChangeMusicDownloadSuccess + ", previewDockerState=" + this.previewDockerState + ", previewDockerInitMediaList=" + this.previewDockerInitMediaList + ", previewSwapState=" + this.previewSwapState + ", previewDockerDelMediaState=" + this.previewDockerDelMediaState + ", previewDockerAddMediaState=" + this.previewDockerAddMediaState + ", previewNextBtnMediaState=" + this.previewNextBtnMediaState + ", nextBtnWithDirectUseState=" + this.nextBtnWithDirectUseState + ", previewNextBtnClickState=" + this.previewNextBtnClickState + ", previewNextBtnState=" + this.previewNextBtnState + ", previewAutoCutBtnClickState=" + this.previewAutoCutBtnClickState + ", isClickUseEffectBtn=" + this.isClickUseEffectBtn + ", dockerHasShown=" + this.dockerHasShown + ", albumViewFullShow=" + this.albumViewFullShow + ", recordPresetResourceState=" + this.recordPresetResourceState + ", albumToEditPageState=" + this.albumToEditPageState + ", notifyRefreshCoverWhenExitPreviewPage=" + this.notifyRefreshCoverWhenExitPreviewPage + ", autoPickSelectedMedias=" + this.autoPickSelectedMedias + ", notifyRefreshLivePhotoState=" + this.notifyRefreshLivePhotoState + ", goNextMediaState=" + this.goNextMediaState + ", recordPageExitState=" + this.recordPageExitState + ", previewAutoCutBtnState=" + this.previewAutoCutBtnState + ", previewEditProBtnState=" + this.previewEditProBtnState + ", tabCurrentItemType=" + this.tabCurrentItemType + ", showAiContentGuideView=" + this.showAiContentGuideView + ", showLiveRecordingsFloatingGuide=" + this.showLiveRecordingsFloatingGuide + ", liveRecordingsCardShownInFirstScreen=" + this.liveRecordingsCardShownInFirstScreen + ", onLoadAiContentMediaList=" + this.onLoadAiContentMediaList + ", defaultSelectMediaList=" + this.defaultSelectMediaList + ", onLoadLiveRecordingsMediaList=" + this.onLoadLiveRecordingsMediaList + ", mobUnselectMediaFromCheckBox=" + this.mobUnselectMediaFromCheckBox + ", notifyMobUnselectMediaFromX=" + this.notifyMobUnselectMediaFromX + ", mobReEnterUploadPage=" + this.mobReEnterUploadPage + ')';
    }

    public final C528640KoI getAiContentMediaList() {
        return this.aiContentMediaList;
    }

    public final C528740KoS getAlbumAssetCount() {
        return this.albumAssetCount;
    }

    public final AlbumToEditPageState getAlbumToEditPageState() {
        return this.albumToEditPageState;
    }

    public final boolean getAlbumViewFullShow() {
        return this.albumViewFullShow;
    }

    public final C528640KoI getAllMediaList() {
        return this.allMediaList;
    }

    public final AutoPickSelectedListState getAutoPickSelectedMedias() {
        return this.autoPickSelectedMedias;
    }

    public final ClosingChooseMediaPageState getClosingChooseMediaPageState() {
        return this.closingChooseMediaPageState;
    }

    public final MediaListState getDefaultSelectMediaList() {
        return this.defaultSelectMediaList;
    }

    public final C529150Kp7 getDockerHasShown() {
        return this.dockerHasShown;
    }

    public final C528640KoI getGlanceMediaList() {
        return this.glanceMediaList;
    }

    public final MediaListState getGoNextMediaState() {
        return this.goNextMediaState;
    }

    public final HideShowChooseMediaPageState getHideShowChooseMediaPageState() {
        return this.hideShowChooseMediaPageState;
    }

    public final PreMusicState getLastPreMusicState() {
        return this.lastPreMusicState;
    }

    public final C528640KoI getLivePhotoMediaList() {
        return this.livePhotoMediaList;
    }

    public final C529130Kp5 getLiveRecordingsCardShownInFirstScreen() {
        return this.liveRecordingsCardShownInFirstScreen;
    }

    public final C528640KoI getLiveRecordingsMediaList() {
        return this.liveRecordingsMediaList;
    }

    public final MediaListState getMediaListState() {
        return this.mediaListState;
    }

    public final C0LCS<Unit> getMobReEnterUploadPage() {
        return this.mobReEnterUploadPage;
    }

    public final C0LCS<MediaModel> getMobUnselectMediaFromCheckBox() {
        return this.mobUnselectMediaFromCheckBox;
    }

    public final MediaState getNextBtnWithDirectUseState() {
        return this.nextBtnWithDirectUseState;
    }

    public final C0LCS<MediaModel> getNotifyMobUnselectMediaFromX() {
        return this.notifyMobUnselectMediaFromX;
    }

    public final C529110Kp3 getNotifyRefreshCoverWhenExitPreviewPage() {
        return this.notifyRefreshCoverWhenExitPreviewPage;
    }

    public final MediaState getNotifyRefreshLivePhotoState() {
        return this.notifyRefreshLivePhotoState;
    }

    public final MediaListState getOnLoadAiContentMediaList() {
        return this.onLoadAiContentMediaList;
    }

    public final MediaListState getOnLoadLiveRecordingsMediaList() {
        return this.onLoadLiveRecordingsMediaList;
    }

    public final OpeningChooseMediaPageState getOpeningChooseMediaPageState() {
        return this.openingChooseMediaPageState;
    }

    public final C528640KoI getPhotoMediaList() {
        return this.photoMediaList;
    }

    public final PreMusicState getPreChangeMusicState() {
        return this.preChangeMusicState;
    }

    public final PreMusicState getPreMusicState() {
        return this.preMusicState;
    }

    public final TikTokMediaModel getPreviewAutoCutBtnClickState() {
        return this.previewAutoCutBtnClickState;
    }

    public final PreviewNextBtnState getPreviewAutoCutBtnState() {
        return this.previewAutoCutBtnState;
    }

    public final MediaState getPreviewDockerAddMediaState() {
        return this.previewDockerAddMediaState;
    }

    public final MediaState getPreviewDockerDelMediaState() {
        return this.previewDockerDelMediaState;
    }

    public final MediaListState getPreviewDockerInitMediaList() {
        return this.previewDockerInitMediaList;
    }

    public final PreviewDockerState getPreviewDockerState() {
        return this.previewDockerState;
    }

    public final PreviewNextBtnState getPreviewEditProBtnState() {
        return this.previewEditProBtnState;
    }

    public final MediaState getPreviewMediaState() {
        return this.previewMediaState;
    }

    public final C529150Kp7 getPreviewNextBtnClickState() {
        return this.previewNextBtnClickState;
    }

    public final MediaState getPreviewNextBtnMediaState() {
        return this.previewNextBtnMediaState;
    }

    public final PreviewNextBtnState getPreviewNextBtnState() {
        return this.previewNextBtnState;
    }

    public final PreviewSwapState getPreviewSwapState() {
        return this.previewSwapState;
    }

    public final C529130Kp5 getRecordPageExitState() {
        return this.recordPageExitState;
    }

    public final RecordPresetResourceState getRecordPresetResourceState() {
        return this.recordPresetResourceState;
    }

    public final MediaState getSelectMediaState() {
        return this.selectMediaState;
    }

    public final C529130Kp5 getShowAiContentGuideView() {
        return this.showAiContentGuideView;
    }

    public final C529130Kp5 getShowLiveRecordingsFloatingGuide() {
        return this.showLiveRecordingsFloatingGuide;
    }

    public final C529140Kp6 getTabCurrentItemType() {
        return this.tabCurrentItemType;
    }

    public final MediaState getUnSelectMediaState() {
        return this.unSelectMediaState;
    }

    public final TikTokMediaModel getUpdateSelectedMediaClipRange() {
        return this.updateSelectedMediaClipRange;
    }

    public final C528640KoI getVideoMediaList() {
        return this.videoMediaList;
    }

    public final boolean isChangeMusicDownloadSuccess() {
        return this.isChangeMusicDownloadSuccess;
    }

    public final boolean isClickUseEffectBtn() {
        return this.isClickUseEffectBtn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChooseMediaState(MediaListState mediaListState, MediaState mediaState, MediaState mediaState2, TikTokMediaModel tikTokMediaModel, MediaState mediaState3, PreMusicState preMusicState, PreMusicState preMusicState2, PreMusicState preMusicState3, OpeningChooseMediaPageState openingChooseMediaPageState, ClosingChooseMediaPageState closingChooseMediaPageState, HideShowChooseMediaPageState hideShowChooseMediaPageState, C528740KoS c528740KoS, C528640KoI c528640KoI, C528640KoI c528640KoI2, C528640KoI c528640KoI3, C528640KoI c528640KoI4, C528640KoI c528640KoI5, C528640KoI c528640KoI6, C528640KoI c528640KoI7, boolean z, PreviewDockerState previewDockerState, MediaListState mediaListState2, PreviewSwapState previewSwapState, MediaState mediaState4, MediaState mediaState5, MediaState mediaState6, MediaState mediaState7, C529150Kp7 c529150Kp7, PreviewNextBtnState previewNextBtnState, TikTokMediaModel tikTokMediaModel2, boolean z2, C529150Kp7 c529150Kp72, boolean z3, RecordPresetResourceState recordPresetResourceState, AlbumToEditPageState albumToEditPageState, C529110Kp3 c529110Kp3, AutoPickSelectedListState autoPickSelectedListState, MediaState mediaState8, MediaListState mediaListState3, C529130Kp5 c529130Kp5, PreviewNextBtnState previewNextBtnState2, PreviewNextBtnState previewNextBtnState3, C529140Kp6 c529140Kp6, C529130Kp5 c529130Kp52, C529130Kp5 c529130Kp53, C529130Kp5 c529130Kp54, MediaListState mediaListState4, MediaListState mediaListState5, MediaListState mediaListState6, C0LCS<? extends MediaModel> c0lcs, C0LCS<? extends MediaModel> c0lcs2, C0LCS<Unit> c0lcs3) {
        this.mediaListState = mediaListState;
        this.selectMediaState = mediaState;
        this.unSelectMediaState = mediaState2;
        this.updateSelectedMediaClipRange = tikTokMediaModel;
        this.previewMediaState = mediaState3;
        this.preMusicState = preMusicState;
        this.preChangeMusicState = preMusicState2;
        this.lastPreMusicState = preMusicState3;
        this.openingChooseMediaPageState = openingChooseMediaPageState;
        this.closingChooseMediaPageState = closingChooseMediaPageState;
        this.hideShowChooseMediaPageState = hideShowChooseMediaPageState;
        this.albumAssetCount = c528740KoS;
        this.allMediaList = c528640KoI;
        this.photoMediaList = c528640KoI2;
        this.videoMediaList = c528640KoI3;
        this.glanceMediaList = c528640KoI4;
        this.livePhotoMediaList = c528640KoI5;
        this.aiContentMediaList = c528640KoI6;
        this.liveRecordingsMediaList = c528640KoI7;
        this.isChangeMusicDownloadSuccess = z;
        this.previewDockerState = previewDockerState;
        this.previewDockerInitMediaList = mediaListState2;
        this.previewSwapState = previewSwapState;
        this.previewDockerDelMediaState = mediaState4;
        this.previewDockerAddMediaState = mediaState5;
        this.previewNextBtnMediaState = mediaState6;
        this.nextBtnWithDirectUseState = mediaState7;
        this.previewNextBtnClickState = c529150Kp7;
        this.previewNextBtnState = previewNextBtnState;
        this.previewAutoCutBtnClickState = tikTokMediaModel2;
        this.isClickUseEffectBtn = z2;
        this.dockerHasShown = c529150Kp72;
        this.albumViewFullShow = z3;
        this.recordPresetResourceState = recordPresetResourceState;
        this.albumToEditPageState = albumToEditPageState;
        this.notifyRefreshCoverWhenExitPreviewPage = c529110Kp3;
        this.autoPickSelectedMedias = autoPickSelectedListState;
        this.notifyRefreshLivePhotoState = mediaState8;
        this.goNextMediaState = mediaListState3;
        this.recordPageExitState = c529130Kp5;
        this.previewAutoCutBtnState = previewNextBtnState2;
        this.previewEditProBtnState = previewNextBtnState3;
        this.tabCurrentItemType = c529140Kp6;
        this.showAiContentGuideView = c529130Kp52;
        this.showLiveRecordingsFloatingGuide = c529130Kp53;
        this.liveRecordingsCardShownInFirstScreen = c529130Kp54;
        this.onLoadAiContentMediaList = mediaListState4;
        this.defaultSelectMediaList = mediaListState5;
        this.onLoadLiveRecordingsMediaList = mediaListState6;
        this.mobUnselectMediaFromCheckBox = c0lcs;
        this.notifyMobUnselectMediaFromX = c0lcs2;
        this.mobReEnterUploadPage = c0lcs3;
    }

    public ChooseMediaState(MediaListState mediaListState, MediaState mediaState, MediaState mediaState2, TikTokMediaModel tikTokMediaModel, MediaState mediaState3, PreMusicState preMusicState, PreMusicState preMusicState2, PreMusicState preMusicState3, OpeningChooseMediaPageState openingChooseMediaPageState, ClosingChooseMediaPageState closingChooseMediaPageState, HideShowChooseMediaPageState hideShowChooseMediaPageState, C528740KoS c528740KoS, C528640KoI c528640KoI, C528640KoI c528640KoI2, C528640KoI c528640KoI3, C528640KoI c528640KoI4, C528640KoI c528640KoI5, C528640KoI c528640KoI6, C528640KoI c528640KoI7, boolean z, PreviewDockerState previewDockerState, MediaListState mediaListState2, PreviewSwapState previewSwapState, MediaState mediaState4, MediaState mediaState5, MediaState mediaState6, MediaState mediaState7, C529150Kp7 c529150Kp7, PreviewNextBtnState previewNextBtnState, TikTokMediaModel tikTokMediaModel2, boolean z2, C529150Kp7 c529150Kp72, boolean z3, RecordPresetResourceState recordPresetResourceState, AlbumToEditPageState albumToEditPageState, C529110Kp3 c529110Kp3, AutoPickSelectedListState autoPickSelectedListState, MediaState mediaState8, MediaListState mediaListState3, C529130Kp5 c529130Kp5, PreviewNextBtnState previewNextBtnState2, PreviewNextBtnState previewNextBtnState3, C529140Kp6 c529140Kp6, C529130Kp5 c529130Kp52, C529130Kp5 c529130Kp53, C529130Kp5 c529130Kp54, MediaListState mediaListState4, MediaListState mediaListState5, MediaListState mediaListState6, C0LCS c0lcs, C0LCS c0lcs2, C0LCS c0lcs3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str;
        C0LCS c0lcs4 = c0lcs3;
        C0LCS c0lcs5 = c0lcs2;
        C0LCS c0lcs6 = c0lcs;
        MediaListState mediaListState7 = mediaListState6;
        MediaListState mediaListState8 = mediaListState5;
        C529130Kp5 c529130Kp55 = c529130Kp54;
        MediaListState mediaListState9 = mediaListState4;
        C529130Kp5 c529130Kp56 = c529130Kp52;
        C529140Kp6 c529140Kp62 = c529140Kp6;
        PreviewNextBtnState previewNextBtnState4 = previewNextBtnState3;
        MediaState mediaState9 = mediaState4;
        C529130Kp5 c529130Kp57 = c529130Kp5;
        AutoPickSelectedListState autoPickSelectedListState2 = autoPickSelectedListState;
        C529110Kp3 c529110Kp32 = c529110Kp3;
        AlbumToEditPageState albumToEditPageState2 = albumToEditPageState;
        RecordPresetResourceState recordPresetResourceState2 = recordPresetResourceState;
        boolean z4 = z3;
        C529150Kp7 c529150Kp73 = c529150Kp72;
        boolean z5 = z2;
        C529150Kp7 c529150Kp74 = c529150Kp7;
        PreviewNextBtnState previewNextBtnState5 = previewNextBtnState2;
        TikTokMediaModel tikTokMediaModel3 = tikTokMediaModel2;
        MediaState mediaState10 = mediaState7;
        MediaState mediaState11 = mediaState6;
        MediaState mediaState12 = mediaState5;
        PreviewSwapState previewSwapState2 = previewSwapState;
        MediaListState mediaListState10 = mediaListState2;
        PreviewDockerState previewDockerState2 = previewDockerState;
        boolean z6 = z;
        MediaState mediaState13 = mediaState8;
        C528640KoI c528640KoI8 = c528640KoI7;
        MediaListState mediaListState11 = mediaListState3;
        C528640KoI c528640KoI9 = c528640KoI6;
        C528640KoI c528640KoI10 = c528640KoI5;
        C528640KoI c528640KoI11 = c528640KoI4;
        C528640KoI c528640KoI12 = c528640KoI3;
        PreMusicState preMusicState4 = preMusicState2;
        C528640KoI c528640KoI13 = c528640KoI2;
        OpeningChooseMediaPageState openingChooseMediaPageState2 = openingChooseMediaPageState;
        PreMusicState preMusicState5 = preMusicState3;
        C529130Kp5 c529130Kp58 = c529130Kp53;
        MediaState mediaState14 = mediaState2;
        HideShowChooseMediaPageState hideShowChooseMediaPageState2 = hideShowChooseMediaPageState;
        MediaState mediaState15 = mediaState3;
        MediaState mediaState16 = mediaState;
        C528640KoI c528640KoI14 = c528640KoI;
        PreviewNextBtnState previewNextBtnState6 = previewNextBtnState;
        TikTokMediaModel tikTokMediaModelLIZ = tikTokMediaModel;
        PreMusicState preMusicState6 = preMusicState;
        ClosingChooseMediaPageState closingChooseMediaPageState2 = closingChooseMediaPageState;
        MediaListState mediaListState12 = (i & 1) != 0 ? new MediaListState(new ArrayList(), 0L, null) : mediaListState;
        mediaState16 = (i & 2) != 0 ? new MediaState(null, 0L) : mediaState16;
        mediaState14 = (i & 4) != 0 ? new MediaState(null, 0L) : mediaState14;
        tikTokMediaModelLIZ = (i & 8) != 0 ? C527250Km3.LIZ().LIZ("", EnumC538220L8y.MEDIA_STORE) : tikTokMediaModelLIZ;
        mediaState15 = (i & 16) != 0 ? new MediaState(null, 0L) : mediaState15;
        preMusicState6 = (i & 32) != 0 ? new PreMusicState(null, null) : preMusicState6;
        preMusicState4 = (i & 64) != 0 ? new PreMusicState(null, null) : preMusicState4;
        preMusicState5 = (i & 128) != 0 ? new PreMusicState(null, null) : preMusicState5;
        openingChooseMediaPageState2 = (i & 256) != 0 ? OpeningChooseMediaPageState.NoSceneAnimation.INSTANCE : openingChooseMediaPageState2;
        closingChooseMediaPageState2 = (i & 512) != 0 ? ClosingChooseMediaPageState.Ready.INSTANCE : closingChooseMediaPageState2;
        hideShowChooseMediaPageState2 = (i & 1024) != 0 ? HideShowChooseMediaPageState.Init.INSTANCE : hideShowChooseMediaPageState2;
        C528740KoS c528740KoS2 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? c528740KoS : null;
        c528640KoI14 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C528730KoR.LIZ : c528640KoI14;
        c528640KoI13 = (i & 8192) != 0 ? C528730KoR.LIZ : c528640KoI13;
        c528640KoI12 = (i & 16384) != 0 ? C528730KoR.LIZ : c528640KoI12;
        c528640KoI11 = (i & 32768) != 0 ? C528730KoR.LIZ : c528640KoI11;
        c528640KoI10 = (i & 65536) != 0 ? C528730KoR.LIZ : c528640KoI10;
        c528640KoI9 = (i & 131072) != 0 ? C528730KoR.LIZ : c528640KoI9;
        c528640KoI8 = (i & 262144) != 0 ? C528730KoR.LIZ : c528640KoI8;
        z6 = (i & 524288) != 0 ? false : z6;
        previewDockerState2 = (1048576 & i) != 0 ? new PreviewDockerState(1, null, false, false, false, false, false, false, false) : previewDockerState2;
        mediaListState10 = (2097152 & i) != 0 ? new MediaListState(new ArrayList(), 0L, null) : mediaListState10;
        previewSwapState2 = (4194304 & i) != 0 ? new PreviewSwapState(null, null, 0L) : previewSwapState2;
        mediaState9 = (8388608 & i) != 0 ? new MediaState(null, 0L) : mediaState9;
        mediaState12 = (16777216 & i) != 0 ? new MediaState(null, 0L) : mediaState12;
        mediaState11 = (33554432 & i) != 0 ? new MediaState(null, 0L) : mediaState11;
        mediaState10 = (67108864 & i) != 0 ? new MediaState(null, 0L) : mediaState10;
        c529150Kp74 = (134217728 & i) != 0 ? null : c529150Kp74;
        previewNextBtnState6 = (268435456 & i) != 0 ? new PreviewNextBtnState(null, false) : previewNextBtnState6;
        tikTokMediaModel3 = (536870912 & i) != 0 ? null : tikTokMediaModel3;
        z5 = (1073741824 & i) != 0 ? false : z5;
        c529150Kp73 = (i & Integer.MIN_VALUE) != 0 ? null : c529150Kp73;
        z4 = (i2 & 1) != 0 ? false : z4;
        recordPresetResourceState2 = (i2 & 2) != 0 ? new RecordPresetResourceState(null, null) : recordPresetResourceState2;
        albumToEditPageState2 = (i2 & 4) != 0 ? new AlbumToEditPageState(false) : albumToEditPageState2;
        c529110Kp32 = (i2 & 8) != 0 ? new C529110Kp3(C13BV.INSTANCE, 0L) : c529110Kp32;
        autoPickSelectedListState2 = (i2 & 16) != 0 ? new AutoPickSelectedListState(new ArrayList(), 0L) : autoPickSelectedListState2;
        mediaState13 = (i2 & 32) != 0 ? new MediaState(null, 0L) : mediaState13;
        mediaListState11 = (i2 & 64) != 0 ? new MediaListState(new ArrayList(), 0L, null) : mediaListState11;
        c529130Kp57 = (i2 & 128) != 0 ? new C529130Kp5(false) : c529130Kp57;
        if ((i2 & 256) != 0) {
            str = null;
            previewNextBtnState5 = new PreviewNextBtnState(null, true);
        } else {
            str = null;
        }
        this(mediaListState12, mediaState16, mediaState14, tikTokMediaModelLIZ, mediaState15, preMusicState6, preMusicState4, preMusicState5, openingChooseMediaPageState2, closingChooseMediaPageState2, hideShowChooseMediaPageState2, c528740KoS2, c528640KoI14, c528640KoI13, c528640KoI12, c528640KoI11, c528640KoI10, c528640KoI9, c528640KoI8, z6, previewDockerState2, mediaListState10, previewSwapState2, mediaState9, mediaState12, mediaState11, mediaState10, c529150Kp74, previewNextBtnState6, tikTokMediaModel3, z5, c529150Kp73, z4, recordPresetResourceState2, albumToEditPageState2, c529110Kp32, autoPickSelectedListState2, mediaState13, mediaListState11, c529130Kp57, previewNextBtnState5, (i2 & 512) != 0 ? new PreviewNextBtnState(str, true) : previewNextBtnState4, (i2 & 1024) != 0 ? new C529140Kp6(-1) : c529140Kp62, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : c529130Kp56, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : c529130Kp58, (i2 & 8192) != 0 ? null : c529130Kp55, (i2 & 16384) != 0 ? null : mediaListState9, (i2 & 32768) != 0 ? null : mediaListState8, (i2 & 65536) != 0 ? null : mediaListState7, (i2 & 131072) != 0 ? null : c0lcs6, (i2 & 262144) != 0 ? null : c0lcs5, (i2 & 524288) != 0 ? null : c0lcs4);
    }
}
