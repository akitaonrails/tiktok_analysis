package com.ss.android.ugc.aweme.im.sticker.api.provider;

import X.C05YD;
import X.C1BNE;
import X.C2252321DDq;
import X.C914160Zte;
import X.InterfaceC0148002o;
import X.InterfaceC904740ZeS;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.AISelfStickerInlineViewModel;

/* JADX INFO: loaded from: classes15.dex */
public final class StubAISelfStickerInlineViewModel extends AISelfStickerInlineViewModel {
    public final C2252321DDq LL = C1BNE.LIZ(null);

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.AISelfStickerInlineViewModel
    public final void markInlineShown(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.AISelfStickerInlineViewModel
    public final void updateTargetMessageForAISelfInline(String str, InterfaceC904740ZeS interfaceC904740ZeS, Long l) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C914160Zte(19);
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.viewmodel.AISelfStickerInlineViewModel
    public final C05YD<String> getMsgIdTriggerInline() {
        return this.LL;
    }
}
