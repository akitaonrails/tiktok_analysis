package com.ss.android.ugc.aweme.im.sticker.api.provider;

import X.C01S9;
import X.C05YD;
import X.C06SA;
import X.C098200Yq;
import X.C09IR;
import X.C189200o6;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C869590Y9l;
import X.C914160Zte;
import X.EnumC1778780wOC;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC904740ZeS;
import android.content.Context;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel;
import kotlin.Unit;

/* JADX INFO: loaded from: classes15.dex */
public final class StubPhoto2StickerViewModel extends Photo2StickerViewModel {
    public final C2252321DDq LL = C1BNE.LIZ(Boolean.FALSE);
    public final C2252321DDq LLILLJJLI = C1BNE.LIZ(null);
    public final C2252321DDq LLILLL = C1BNE.LIZ(null);
    public final C2252321DDq LLILZ = C1BNE.LIZ(null);
    public final C2252331DDr LLILZIL = C09IR.LIZIZ(0, 0, null, 7);

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel
    public final boolean forceRefreshOnStart() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel
    public final void markInlineShown(String str, EnumC1778780wOC enumC1778780wOC, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.viewmodel.Photo2StickerCreateEventAbility
    public final void setCanOpenStickerPanel(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel
    public final void updateTargetMessageForDMPhotoInline(String str, C06SA c06sa) {
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel
    public final void updateTargetMessageForLocalVideoInline(String str, C06SA c06sa) {
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel
    public final void updateTargetMessageForUGCInline(String str, InterfaceC904740ZeS interfaceC904740ZeS, Long l) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C914160Zte(20);
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel, com.ss.android.ugc.aweme.viewmodel.Photo2StickerCreateEventAbility
    public final C05YD<Boolean> getCanOpenStickerPanelUponCreationEvent() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel
    public final C01S9<Unit> getForceRefresh() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel
    public final C05YD<String> getMsgIdTriggerInlineUnderLocalVideo() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel
    public final C05YD<String> getMsgIdTriggerInlineUnderPhoto() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel
    public final C05YD<String> getMsgIdTriggerInlineUnderUGC() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel
    /* JADX INFO: renamed from: getMediaModelFromPhotoMessage-0E7RQCE, reason: not valid java name */
    public final Object mo242getMediaModelFromPhotoMessage0E7RQCE(Context context, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C189200o6<? extends Object>> interfaceC1364105Vn) {
        C098200Yq c098200Yq = new C098200Yq(new UnsupportedOperationException("Sticker DF module not installed"));
        C189200o6.m2constructorimpl(c098200Yq);
        return c098200Yq;
    }
}
