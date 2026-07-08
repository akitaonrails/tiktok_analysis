package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.virtual;

import X.C01GW;
import X.C09JN;
import X.C1145200fuI;
import X.C11KS;
import X.C11NJ;
import X.C1559260qg8;
import X.C449801p2;
import X.C449901p3;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC390601fU;
import X.InterfaceC395901gL;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes.dex */
public final class AudienceDecorationStateViewModel extends AssemViewModel<C449901p3> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1145200fuI.class, (Class<Object>) null, (String) 13), true);
    public final C11NJ LLILLJJLI = new C11NJ();
    public final C01GW LLILLL = C452501pT.LIZIZ(new C449801p2(this));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C449901p3(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        InterfaceC390601fU interfaceC390601fU = (InterfaceC390601fU) this.LLILLL.getValue();
        if (interfaceC390601fU != null) {
            interfaceC390601fU.release();
        }
        this.LLILLJJLI.LJ();
    }

    public final void vQ2(InterfaceC395901gL interfaceC395901gL, Context context) {
        C11KS c11ksLJIIJ;
        InterfaceC390601fU interfaceC390601fU = (InterfaceC390601fU) this.LLILLL.getValue();
        if (interfaceC390601fU != null && (c11ksLJIIJ = interfaceC390601fU.LJIIJ(context, interfaceC395901gL, null)) != null) {
            this.LLILLJJLI.LIZ(c11ksLJIIJ.LJJIIZ(new C09JN() { // from class: X.01p0
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("AudienceDecorationStateViewModel@aa07.addOrRefreshBoard$1");
                    if (((Boolean) obj).booleanValue()) {
                        C20441214yg.LIZIZ("AudienceDecorationStateViewModel", "addOrRefreshBoard suc");
                    } else {
                        C20441214yg.LJ("AudienceDecorationStateViewModel", "addOrRefreshBoard failed");
                    }
                    C1C7U.LIZIZ("AudienceDecorationStateViewModel@aa07.addOrRefreshBoard$1");
                }
            }, new C09JN() { // from class: X.01p1
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("AudienceDecorationStateViewModel@aa07.addOrRefreshBoard$2");
                    C20441214yg.LJI("AudienceDecorationStateViewModel", (Throwable) obj);
                    C1C7U.LIZIZ("AudienceDecorationStateViewModel@aa07.addOrRefreshBoard$2");
                }
            }));
        }
    }
}
