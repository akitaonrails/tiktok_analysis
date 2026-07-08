package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.media;

import X.C231800uy;
import X.C291001Au;
import X.C869590Y9l;
import X.C896400ZEo;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class PhotoSwapInlineEntranceVM extends AssemViewModel<C231800uy> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C231800uy(new C291001Au(Boolean.FALSE));
    }

    public final void vQ2(List<? extends C869590Y9l> list) {
        for (C869590Y9l c869590Y9l : list) {
            if (C896400ZEo.LJI(c869590Y9l)) {
                if (c869590Y9l != null) {
                    setState(AFwS229S0000000_2.get$arr$(310));
                    return;
                }
                return;
            }
        }
    }
}
