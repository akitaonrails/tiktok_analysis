package com.ss.android.ugc.aweme.im.sticker.api.provider;

import X.C0ZSY;
import X.C1ETI;
import X.InterfaceC1808360x9u;
import X.InterfaceC1808700xAS;
import X.InterfaceC1808750xAX;
import X.InterfaceC1808780xAa;
import X.InterfaceC1839980xyu;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes28.dex */
public final class StickerApiStubs {
    public static final StickerApiStubs INSTANCE = new StickerApiStubs();
    public static final C0ZSY photo2StickerService = new C0ZSY() { // from class: X.0xAN
        @Override // X.C0ZSY
        public final boolean isVESDKReady() {
            return false;
        }

        @Override // X.C0ZSY
        public final void openStickerCreationActivity(Context context, Integer num, String str, Integer num2, C0ZQT c0zqt, Bundle bundle) {
        }

        @Override // X.C0ZSY
        public final void photo2sticker(Activity activity, MediaModel mediaModel, C0ZQT c0zqt, EnumC902270ZaT enumC902270ZaT, IVideo2StickerService.Callback callback) {
        }

        @Override // X.C0ZSY
        public final void photo2sticker(Activity activity, String str, C0ZQT c0zqt, EnumC902270ZaT enumC902270ZaT, IVideo2StickerService.Callback callback) {
        }
    };
    public static final InterfaceC1808780xAa photo2StickerUploadService = new InterfaceC1808780xAa() { // from class: X.0xAZ
        @Override // X.InterfaceC1808780xAa
        public final void showMiscErrorToast(Activity activity) {
        }

        @Override // X.InterfaceC1808780xAa
        public final ViewGroup getBannedNoticeView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new FrameLayout(viewGroup.getContext());
        }

        @Override // X.InterfaceC1808780xAa
        /* JADX INFO: renamed from: uploadVideoSticker-eH_QyT8, reason: not valid java name */
        public final Object mo71uploadVideoStickereH_QyT8(boolean z, String str, int i, int i2, EnumC1778780wOC enumC1778780wOC, C00AE c00ae, String str2, InterfaceC1364105Vn<? super C189200o6<? extends InterfaceC447720Hh4>> interfaceC1364105Vn) {
            C098200Yq c098200Yq = new C098200Yq(new UnsupportedOperationException("Sticker DF module not installed"));
            C189200o6.m2constructorimpl(c098200Yq);
            return c098200Yq;
        }

        @Override // X.InterfaceC1808780xAa
        /* JADX INFO: renamed from: uploadCreatedVideoSticker-5p_uFSQ, reason: not valid java name */
        public final Object mo70uploadCreatedVideoSticker5p_uFSQ(boolean z, String str, int i, int i2, long j, String str2, boolean z2, List<String> list, C00AE c00ae, String str3, InterfaceC1364105Vn<? super C189200o6<? extends InterfaceC447720Hh4>> interfaceC1364105Vn) {
            C098200Yq c098200Yq = new C098200Yq(new UnsupportedOperationException("Sticker DF module not installed"));
            C189200o6.m2constructorimpl(c098200Yq);
            return c098200Yq;
        }
    };
    public static final InterfaceC1808360x9u photoCommentStickerRepository = new InterfaceC1808360x9u() { // from class: X.0xAK
        @Override // X.InterfaceC1808360x9u
        public final Object getPhotoCommentStickerData(long j, InterfaceC1364105Vn<? super C0225005n> interfaceC1364105Vn) {
            return null;
        }
    };
    public static final InterfaceC1808750xAX photo2StickerInlineRepository = new InterfaceC1808750xAX() { // from class: X.0OlF
        public static final C2252331DDr LLILLJJLI = C09IR.LIZIZ(0, 0, null, 7);

        @Override // X.InterfaceC1808750xAX
        public final void onCreatePhotoSticker(EnumC1778780wOC enumC1778780wOC) {
        }

        @Override // X.InterfaceC1808750xAX
        public final void onInlineShow(EnumC1778780wOC enumC1778780wOC, String str, String str2) {
        }

        @Override // X.InterfaceC1808750xAX
        public final C01S9<Unit> getUpdateEvent() {
            return LLILLJJLI;
        }

        @Override // X.InterfaceC1808750xAX
        public final AbstractC604420NnE<String> getMessageUUIDToDisplay(EnumC1778780wOC enumC1778780wOC, String str) {
            return new C604430NnF(C00DG.NO_INLINE_MESSAGE);
        }

        @Override // X.InterfaceC1808750xAX
        public final AbstractC604420NnE canConversationDisplay(EnumC1778780wOC enumC1778780wOC, String str, String str2) {
            return new C604430NnF(C00DG.NO_INLINE_MESSAGE);
        }
    };
    public static final C1ETI photo2StickerKeva = new C1ETI() { // from class: X.0xAQ
        @Override // X.C1ETI
        public final long getFirstShownTs(EnumC1778780wOC enumC1778780wOC, String str) {
            return 0L;
        }

        @Override // X.C1ETI
        public final boolean getIsUserDismissed(EnumC1778780wOC enumC1778780wOC, String str) {
            return false;
        }

        @Override // X.C1ETI
        public final String getUUIDToDisplay(EnumC1778780wOC enumC1778780wOC, String str) {
            return null;
        }

        @Override // X.C1ETI
        public final boolean hasCreateLocalVideoSticker() {
            return false;
        }

        @Override // X.C1ETI
        public final boolean hasCreatePhotoSticker() {
            return false;
        }

        @Override // X.C1ETI
        public final boolean hasShowNewTagForCreationEntranceAndMarkShow() {
            return false;
        }

        @Override // X.C1ETI
        public final void markCommentNewTagClicked() {
        }

        @Override // X.C1ETI
        public final void markCreatedLocalVideoSticker() {
        }

        @Override // X.C1ETI
        public final void markCreatedPhotoSticker() {
        }

        @Override // X.C1ETI
        public final void resetForDebug() {
        }

        @Override // X.C1ETI
        public final void setFirstShownTs(EnumC1778780wOC enumC1778780wOC, String str, long j) {
        }

        @Override // X.C1ETI
        public final void setIsUserDismissed(EnumC1778780wOC enumC1778780wOC, String str, boolean z) {
        }

        @Override // X.C1ETI
        public final void setUUIDToDisplay(EnumC1778780wOC enumC1778780wOC, String str, String str2) {
        }

        @Override // X.C1ETI
        public final boolean shouldShowCommentNewTagAndMarkShown() {
            return false;
        }
    };
    public static final InterfaceC1808700xAS photo2StickerPerfTracker = new InterfaceC1808700xAS() { // from class: X.0xAP
        @Override // X.InterfaceC1808700xAS
        public final void trackCutoutPerf(int i, int i2, long j, Long l, boolean z, C00AE c00ae, InterfaceC1493105sv interfaceC1493105sv) {
        }

        @Override // X.InterfaceC1808700xAS
        public final void trackCutoutUserTime(long j, boolean z, C00AE c00ae, InterfaceC1493105sv interfaceC1493105sv) {
        }

        @Override // X.InterfaceC1808700xAS
        public final void trackFailure(boolean z, EnumC0295008f enumC0295008f, C00AE c00ae, InterfaceC1493105sv interfaceC1493105sv) {
        }

        @Override // X.InterfaceC1808700xAS
        public final void trackOutlinePerf(int i, int i2, long j, C00AE c00ae, InterfaceC1493105sv interfaceC1493105sv) {
        }

        @Override // X.InterfaceC1808700xAS
        public final void trackPhoto2StickerAuditPerf(long j, boolean z, boolean z2, C00AE c00ae, InterfaceC1493105sv interfaceC1493105sv) {
        }

        @Override // X.InterfaceC1808700xAS
        public final void trackPhoto2StickerCompilePerf(boolean z, int i, int i2, long j, C00AE c00ae, InterfaceC1493105sv interfaceC1493105sv) {
        }

        @Override // X.InterfaceC1808700xAS
        public final void trackPhoto2StickerCreationPerf(long j, boolean z, C00AE c00ae, EnumC0295008f enumC0295008f, InterfaceC1493105sv interfaceC1493105sv) {
        }

        @Override // X.InterfaceC1808700xAS
        public final void trackPhoto2StickerUploadPerf(boolean z, int i, int i2, long j, long j2, C00AE c00ae, InterfaceC1493105sv interfaceC1493105sv) {
        }
    };
    public static final InterfaceC1839980xyu photo2StickerEventTracker = new InterfaceC1839980xyu() { // from class: X.0xys
        @Override // X.InterfaceC1839980xyu
        public final void onClickInline(String str, String str2, String str3, C0N5D c0n5d, InterfaceC1493105sv interfaceC1493105sv) {
        }

        @Override // X.InterfaceC1839980xyu
        public final void onCreatePhotoSticker(String str, C0ZQT c0zqt, EnumC539250LCx enumC539250LCx, EnumC902270ZaT enumC902270ZaT, EnumC308770C8l enumC308770C8l, boolean z, List<String> list, long j, boolean z2, String str2, InterfaceC1493105sv interfaceC1493105sv) {
        }

        @Override // X.InterfaceC1839980xyu
        public final void onCreationAttempt(String str, C0ZQT c0zqt, EnumC539250LCx enumC539250LCx, EnumC902270ZaT enumC902270ZaT, InterfaceC1493105sv interfaceC1493105sv) {
        }

        @Override // X.InterfaceC1839980xyu
        public final void onEnterPhotoStickerCreation(String str, C0ZQT c0zqt, EnumC539250LCx enumC539250LCx, EnumC902270ZaT enumC902270ZaT, InterfaceC1493105sv interfaceC1493105sv) {
        }

        @Override // X.InterfaceC1839980xyu
        public final void onEnterStickerCreation(String str, C0ZQT c0zqt, InterfaceC1493105sv interfaceC1493105sv) {
        }

        @Override // X.InterfaceC1839980xyu
        public final void onShowInline(String str, String str2, String str3, C0N5D c0n5d, InterfaceC1493105sv interfaceC1493105sv) {
        }

        @Override // X.InterfaceC1839980xyu
        public final void setBizType(String str) {
        }
    };

    public final InterfaceC1839980xyu getPhoto2StickerEventTracker() {
        return photo2StickerEventTracker;
    }

    public final InterfaceC1808750xAX getPhoto2StickerInlineRepository() {
        return photo2StickerInlineRepository;
    }

    public final C1ETI getPhoto2StickerKeva() {
        return photo2StickerKeva;
    }

    public final InterfaceC1808700xAS getPhoto2StickerPerfTracker() {
        return photo2StickerPerfTracker;
    }

    public final C0ZSY getPhoto2StickerService() {
        return photo2StickerService;
    }

    public final InterfaceC1808780xAa getPhoto2StickerUploadService() {
        return photo2StickerUploadService;
    }

    public final InterfaceC1808360x9u getPhotoCommentStickerRepository() {
        return photoCommentStickerRepository;
    }
}
