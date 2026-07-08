package com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.viewmodel;

import X.C01GW;
import X.C0JMJ;
import X.C0JMP;
import X.C0JMR;
import X.C0JOM;
import X.C0KBP;
import X.C1554960qZC;
import X.C1826730xdX;
import X.C452501pT;
import X.C490770JMl;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC517590KRp;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseVideoPlayerVM extends AssemViewModel<C0JMP> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 404));
    public InterfaceC665370Q7z LLILLJJLI;
    public int LLILLL;
    public C0JMJ LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0JMP(0);
    }

    public final C0JMJ vQ2() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILZ == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
            C0JMJ c0jmj = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0JMJ.class, null)) != null) {
                c0jmj = (C0JMJ) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILZ = c0jmj;
        }
        return this.LLILZ;
    }

    public final void wQ2(Throwable th) {
        setState(AFwS237S0000000_7.get$arr$(173));
        int i = this.LLILLL;
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJI(new C0JOM(i, CardStruct.IStatusCode.DEFAULT, th, new LinkedHashMap(C490770JMl.LIZIZ())));
        }
    }

    public final void xQ2(List<C0JMR> list) {
        setState(new AwS373S0200000_7(this, list, 26));
        int i = this.LLILLL;
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJI(new C0KBP(i, new LinkedHashMap(C490770JMl.LIZIZ())));
        }
    }
}
