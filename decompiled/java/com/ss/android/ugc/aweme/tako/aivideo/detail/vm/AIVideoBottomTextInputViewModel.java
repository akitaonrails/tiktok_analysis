package com.ss.android.ugc.aweme.tako.aivideo.detail.vm;

import X.C1475000oUE;
import X.C1679570toB;
import X.EnumC1301920jz4;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.ITakoRTCAbility;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class AIVideoBottomTextInputViewModel extends AssemViewModel<C1679570toB> {
    public final ITakoRTCAbility LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1679570toB(C1475000oUE.LIZ.getString(2131822459), 2);
    }

    public final void vQ2() {
        this.LL.stopAudioCapture();
        this.LL.LJIJJLI(EnumC1301920jz4.KEYBOARD);
        setState(AFwS266S0000000_25.get$arr$(255));
    }

    public final void wQ2() {
        this.LL.startAudioCapture();
        this.LL.LJIJJLI(EnumC1301920jz4.VOICE);
        setState(AFwS266S0000000_25.get$arr$(256));
    }

    public AIVideoBottomTextInputViewModel(ITakoRTCAbility iTakoRTCAbility) {
        this.LL = iTakoRTCAbility;
    }
}
