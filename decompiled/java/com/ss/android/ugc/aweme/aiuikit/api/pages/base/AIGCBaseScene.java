package com.ss.android.ugc.aweme.aiuikit.api.pages.base;

import X.AbstractC214814194y;
import X.C01GW;
import X.C0F1T;
import X.C0MGE;
import X.C0MWU;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1DRF;
import X.C2188811AlT;
import X.C389550FPd;
import X.C452501pT;
import X.C539960LFq;
import X.C547160Ld4;
import X.C547180Ld6;
import X.C547220LdA;
import X.C547650Ldr;
import X.C547860LeC;
import X.C548010LeR;
import X.C549530Lgt;
import X.C554730LpH;
import X.InterfaceC484050IyZ;
import X.InterfaceC546090LbL;
import X.InterfaceC549570Lgx;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.aikit.api.common.AIConfigService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AIGCBaseScene<SLOT_HOLDER> extends AbstractC214814194y implements C0MGE {
    public final C547650Ldr LLJJIJIL = C547650Ldr.LIZ;
    public final String LLJJJ = C547160Ld4.LIZIZ();
    public final C547180Ld6 LLJJJIL = C548010LeR.LIZ;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8((AIGCBaseScene) this, 55));
    public final ArrayList<InterfaceC484050IyZ> LLJJJJJIL = new ArrayList<>();
    public final Map<String, C549530Lgt<?, ?>> LLJJJJLIIL = new LinkedHashMap();
    public final Map<String, InterfaceC549570Lgx<?>> LLJJL = new LinkedHashMap();

    public abstract void LLLLJI(C539960LFq c539960LFq);

    public abstract void LLLLL(C1DRF c1drf);

    public abstract int LLLLLILLIL();

    public abstract C0MWU LLLLLJLJLL();

    public abstract String LLLLLL();

    public abstract List<C549530Lgt<?, ?>> LLLLLLIL();

    public abstract void LLLLLLJ(ViewGroup viewGroup);

    @Override // X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public void onDestroyView() {
        super.onDestroyView();
        ((C547220LdA) this.LLJJJJ.getValue()).LIZ();
        C547220LdA c547220LdA = (C547220LdA) this.LLJJJJ.getValue();
        if (c547220LdA.LJ) {
            return;
        }
        c547220LdA.LJ = true;
        c547220LdA.LIZLLL.clear();
    }

    public InterfaceC546090LbL LLLLLIL() {
        return this.LLJJIJIL;
    }

    public final <API extends C0F1T> InterfaceC549570Lgx<API> LLLLLJIL(String str) {
        return (InterfaceC549570Lgx) ((LinkedHashMap) this.LLJJL).get(str);
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        String tag;
        super.onActivityCreated(bundle);
        C547860LeC.LIZ.getClass();
        AIConfigService aIConfigServiceLIZIZ = C547860LeC.LIZIZ();
        InterfaceC546090LbL interfaceC546090LbLLLLLLIL = LLLLLIL();
        if (interfaceC546090LbLLLLLLIL == null || (tag = interfaceC546090LbLLLLLLIL.getTag()) == null) {
            tag = "ct_aigc";
        }
        aIConfigServiceLIZIZ.LIZJ(tag, LLLLLL());
        for (final C549530Lgt<?, ?> c549530Lgt : LLLLLLIL()) {
            if (!this.LLJJJJLIIL.containsKey(c549530Lgt.LIZ)) {
                this.LLJJJJLIIL.put(c549530Lgt.LIZ, c549530Lgt);
                this.LLJJL.put(c549530Lgt.LIZ, new InterfaceC549570Lgx<C0F1T>() { // from class: X.0Lgs
                    @Override // X.InterfaceC549570Lgx
                    public final C0F1T getApi() {
                        C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(this);
                        if (c1drgLJIIIZ != null) {
                            return (C0F1T) c1drgLJIIIZ.LJII(c549530Lgt.LIZJ, null);
                        }
                        "Required value was null.".toString();
                        throw new IllegalStateException("Required value was null.");
                    }

                    @Override // X.InterfaceC549570Lgx
                    public final View getView() {
                        return this.requireViewById(c549530Lgt.LIZIZ);
                    }
                });
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SlotPlugin of type ");
                sbLIZ.append(c549530Lgt.LIZ);
                sbLIZ.append(" is already registered");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C1664590tQ1.LIZLLL(this, null, false, new AwS587S0100000_8((AIGCBaseScene) this, 33), 3);
        C1664600tQ2.LIZ(this, null, new C389550FPd(this));
    }

    @Override // X.AbstractC214814194y
    public void onActivityResult(int i, int i2, Intent intent) {
        Iterator<InterfaceC484050IyZ> it2 = this.LLJJJJJIL.iterator();
        while (it2.hasNext()) {
            it2.next().onActivityResult(i, i2, intent);
        }
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LLLLJ(new AwS587S0100000_8((AIGCBaseScene) this, 34));
        ViewGroup viewGroup2 = (ViewGroup) C554730LpH.LIZJ(layoutInflater, LLLLLILLIL(), viewGroup, false);
        LLLLLLJ(viewGroup2);
        return viewGroup2;
    }
}
