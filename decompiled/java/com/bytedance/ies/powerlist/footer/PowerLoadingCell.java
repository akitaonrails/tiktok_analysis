package com.bytedance.ies.powerlist.footer;

import X.AbstractC20607715kR;
import X.C20605115k1;
import X.C20607815kS;
import X.C20607915kT;
import X.C20608115kV;
import X.EnumC323450Cm7;
import X.InterfaceC1361890lXn;
import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: loaded from: classes19.dex */
public abstract class PowerLoadingCell extends PowerCell<C20605115k1> {
    public void L5() {
    }

    public void LIZJ() {
    }

    public void N5() {
    }

    public final void retry() {
        InterfaceC1361890lXn<?> interfaceC1361890lXn;
        C20605115k1 item = getItem();
        if (item == null || (interfaceC1361890lXn = item.LL) == null) {
            return;
        }
        interfaceC1361890lXn.LIZIZ(EnumC323450Cm7.Next);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: I5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(C20605115k1 c20605115k1) {
        AbstractC20607715kR abstractC20607715kR = c20605115k1.LLILLL.LIZIZ;
        if (abstractC20607715kR instanceof C20608115kV) {
            N5();
        } else if (abstractC20607715kR instanceof C20607815kS) {
            LIZJ();
        } else {
            if (!(abstractC20607715kR instanceof C20607915kT)) {
                return;
            }
            L5();
        }
    }
}
