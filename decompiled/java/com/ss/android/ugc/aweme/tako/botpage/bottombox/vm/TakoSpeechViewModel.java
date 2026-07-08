package com.ss.android.ugc.aweme.tako.botpage.bottombox.vm;

import X.C01GW;
import X.C1855030yNB;
import X.C1855260yNY;
import X.C452501pT;
import X.EnumC1801380wye;
import X.InterfaceC0148002o;
import X.InterfaceC1801320wyY;
import X.InterfaceC1855430yNp;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS13S0000001_27;
import kotlin.jvm.internal.AwS24S2000000_27;
import kotlin.jvm.internal.AwS41S0000100_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSpeechViewModel extends AssemViewModel<C1855260yNY> implements InterfaceC1801320wyY {
    public final C01GW LL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(174));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1855260yNY(0);
    }

    public final InterfaceC1855430yNp wQ2() {
        return (InterfaceC1855430yNp) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        InterfaceC1855430yNp interfaceC1855430yNpWQ2 = wQ2();
        if (interfaceC1855430yNpWQ2 != null) {
            interfaceC1855430yNpWQ2.onDestroy();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        InterfaceC1855430yNp interfaceC1855430yNpWQ2 = wQ2();
        if (interfaceC1855430yNpWQ2 != null) {
            interfaceC1855430yNpWQ2.LIZIZ(this);
        }
    }

    public final void xQ2() {
        InterfaceC1855430yNp interfaceC1855430yNpWQ2 = wQ2();
        if (interfaceC1855430yNpWQ2 != null) {
            interfaceC1855430yNpWQ2.LIZ();
        }
        setState(new AwS41S0000100_27(System.currentTimeMillis(), 1));
    }

    @Override // X.InterfaceC1801320wyY
    public final void Sz0(float f) {
        setState(new AwS13S0000001_27(f, 1));
    }

    @Override // X.InterfaceC1801320wyY
    public final void h8(float f) {
        setState(new AwS13S0000001_27(f, 0));
    }

    public final void yQ2(EnumC1801380wye enumC1801380wye) {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = getState().LLILZIL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jCurrentTimeMillis - jLongValue;
        setState(AFwS269S0000000_27.get$arr$(362));
        InterfaceC1855430yNp interfaceC1855430yNpWQ2 = wQ2();
        if (interfaceC1855430yNpWQ2 != null) {
            interfaceC1855430yNpWQ2.LIZLLL(enumC1801380wye, j);
        }
        setState(AFwS269S0000000_27.get$arr$(204));
    }

    public final void zQ2(Exception exc) {
        setState(new AwS606S0100000_27(exc, 205));
    }

    @Override // X.InterfaceC1801320wyY
    public final void DR1(String str, String str2) {
        setState(new AwS24S2000000_27(str, str2, 2));
    }

    @Override // X.InterfaceC1801320wyY
    public final void J(int i, Exception exc) {
        if (i == 1013) {
            exc = new C1855030yNB("no valid content");
        }
        zQ2(exc);
        setState(AFwS269S0000000_27.get$arr$(203));
    }

    @Override // X.InterfaceC1801320wyY
    public final void nu2(String str, String str2) {
        setState(new AwS24S2000000_27(str, str2, 3));
    }

    public static void vQ2(TakoSpeechViewModel takoSpeechViewModel, boolean z, EnumC1801380wye enumC1801380wye, int i) {
        long jLongValue;
        if ((i & 1) != 0) {
            z = false;
        }
        takoSpeechViewModel.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = takoSpeechViewModel.getState().LLILZIL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jCurrentTimeMillis - jLongValue;
        if (j < 1000) {
            final String str = "talk time < 1s";
            takoSpeechViewModel.zQ2(new Exception(str) { // from class: X.0yNq
                public static final int $stable = 8;
            });
            takoSpeechViewModel.yQ2(EnumC1801380wye.TOO_SHORT);
        } else {
            if (z) {
                takoSpeechViewModel.setState(AFwS269S0000000_27.get$arr$(361));
                InterfaceC1855430yNp interfaceC1855430yNpWQ2 = takoSpeechViewModel.wQ2();
                if (interfaceC1855430yNpWQ2 == null) {
                    return;
                }
                interfaceC1855430yNpWQ2.LIZLLL(enumC1801380wye, j);
                return;
            }
            InterfaceC1855430yNp interfaceC1855430yNpWQ22 = takoSpeechViewModel.wQ2();
            if (interfaceC1855430yNpWQ22 == null) {
                return;
            }
            interfaceC1855430yNpWQ22.LIZJ(enumC1801380wye, j);
        }
    }
}
