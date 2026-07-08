package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C01GW;
import X.C095G;
import X.C1396605dM;
import X.C1397905dZ;
import X.C1422405hW;
import X.C1537720q7O;
import X.C1540620qC4;
import X.C1DEK;
import X.C2334409Cs;
import X.C2334509Ct;
import X.C677830QiL;
import X.C678110Qin;
import X.C678270Qj3;
import X.C678470QjN;
import X.EnumC669690QOp;
import X.InterfaceC0148002o;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AwS376S0200000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class MixPageViewModel extends AssemViewModel<C678270Qj3> {
    public String LLILLJJLI;
    public C1396605dM LLILZ;
    public final NextLiveData<C678110Qin> LLJI;
    public final NextLiveData<C1422405hW> LLJIJIL;
    public final NextLiveData<Integer> LLJILJIL;
    public final NextLiveData<EnumC669690QOp> LLJILJILJ;
    public C1540620qC4 LLJILLL;
    public String LL = "";
    public final Map<String, Object> LLILLL = new LinkedHashMap();
    public final MutableLiveData<C1397905dZ> LLILZIL = new MutableLiveData<>();
    public final C1DEK LLILZLL = C095G.LIZ(Integer.MAX_VALUE, null, 6);
    public final NextLiveData<C678470QjN> LLIZ = new NextLiveData<>();
    public final NextLiveData<Boolean> LLIZLLLIL = new NextLiveData<>();
    public final NextLiveData<Integer> LLJ = new NextLiveData<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C678270Qj3(new C677830QiL() { // from class: X.0Qig
        });
    }

    public final C1540620qC4 vQ2() {
        C1540620qC4 c1540620qC4 = this.LLJILLL;
        if (c1540620qC4 != null) {
            return c1540620qC4;
        }
        return null;
    }

    public MixPageViewModel() {
        NextLiveData<C678110Qin> nextLiveData = new NextLiveData<>();
        nextLiveData.setValue(new C678110Qin(2));
        this.LLJI = nextLiveData;
        this.LLJIJIL = new NextLiveData<>();
        this.LLJILJIL = new NextLiveData<>();
        this.LLJILJILJ = new NextLiveData<>();
    }

    public final void xQ2(C677830QiL c677830QiL) {
        withState(new AwS376S0200000_10(this, c677830QiL, 2));
    }

    public final void wQ2(Object obj, String str) {
        C1540620qC4 c1540620qC4VQ2 = vQ2();
        ReentrantLock reentrantLock = C2334509Ct.LIZ;
        reentrantLock.lock();
        try {
            String strLJIILL = C2334409Cs.LIZ.LJIILL(obj);
            reentrantLock.unlock();
            TemplateData templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(strLJIILL);
            C01GW<C1537720q7O> c01gw = C1540620qC4.LJJJJIZL;
            c1540620qC4VQ2.LJIL(templateDataLJIIIIZZ, str, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2334509Ct.LIZ.unlock();
            throw th;
        }
    }
}
