package com.ss.android.ugc.aweme.im.sdk.chat.viewmodel;

import X.AbstractC2252651DEx;
import X.AnonymousClass0950;
import X.C07XL;
import X.C09IC;
import X.C09IR;
import X.C0PEM;
import X.C1DFB;
import X.C2252331DDr;
import X.C2443309hn;
import X.C912070ZqH;
import X.InterfaceC0148002o;
import X.InterfaceC911530ZpP;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraEffectViewModel extends AssemViewModel<C2443309hn> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final InterfaceC911530ZpP LL;
    public final AbstractC2252651DEx LLILLJJLI;
    public final C2252331DDr LLILLL;
    public final AnonymousClass0950 LLILZ;
    public long LLILZIL;

    public CameraEffectViewModel() {
        InterfaceC911530ZpP interfaceC911530ZpPLJJIFFI = C912070ZqH.LIZIZ.LJJIFFI();
        C1DFB c1dfb = C0PEM.LIZJ;
        this.LL = interfaceC911530ZpPLJJIFFI;
        this.LLILLJJLI = c1dfb;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 0, null, 6);
        this.LLILLL = c2252331DDrLIZIZ;
        this.LLILZ = C09IC.LIZ(c2252331DDrLIZIZ);
        interfaceC911530ZpPLJJIFFI.LJII();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2443309hn(new C07XL(0), null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LL.LIZ();
        super.onCleared();
    }

    public static void vQ2(CameraEffectViewModel cameraEffectViewModel) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (cameraEffectViewModel.LLILZIL <= jCurrentTimeMillis) {
            cameraEffectViewModel.LLILZIL = jCurrentTimeMillis;
            if (!(cameraEffectViewModel.getState().LL instanceof C07XL)) {
                cameraEffectViewModel.setState(new AwS582S0100000_3(cameraEffectViewModel, 164));
            }
        }
    }
}
