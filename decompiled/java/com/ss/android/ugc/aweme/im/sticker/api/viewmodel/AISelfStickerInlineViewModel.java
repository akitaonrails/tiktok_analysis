package com.ss.android.ugc.aweme.im.sticker.api.viewmodel;

import X.C05YD;
import X.InterfaceC0148002o;
import X.InterfaceC904740ZeS;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes15.dex */
public abstract class AISelfStickerInlineViewModel extends AssemViewModel<InterfaceC0148002o> {
    public abstract C05YD<String> getMsgIdTriggerInline();

    public abstract void markInlineShown(String str, String str2);

    public abstract void updateTargetMessageForAISelfInline(String str, InterfaceC904740ZeS interfaceC904740ZeS, Long l);
}
