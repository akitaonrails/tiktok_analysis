package com.ss.android.ugc.tiktok.im.contact.selector.impl.vm;

import X.AbstractC1223800hx4;
import X.C01GW;
import X.C1223570hwh;
import X.C1223620hwm;
import X.C1224240hxm;
import X.C1224280hxq;
import X.C1224380hy0;
import X.C1224780hye;
import X.C1224790hyf;
import X.C1224840hyk;
import X.C13BV;
import X.C13LP;
import X.C2097608Jq;
import X.C291001Au;
import X.C897370ZIh;
import X.C897520ZIw;
import X.EnumC1223630hwn;
import X.EnumC1910450zoZ;
import X.InterfaceC0148002o;
import X.InterfaceC1076400e7K;
import X.InterfaceC1224160hxe;
import X.InterfaceC1224310hxt;
import X.InterfaceC1224320hxu;
import X.InterfaceC1224360hxy;
import X.InterfaceC1224370hxz;
import X.InterfaceC1224750hyb;
import X.InterfaceC1226510i1R;
import X.InterfaceC897330ZId;
import X.InterfaceC897380ZIi;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS71S0210000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorContainerVM extends AssemViewModel<C1223570hwh> implements InterfaceC1076400e7K, InterfaceC1224750hyb {
    public final InterfaceC1224320hxu LL;
    public final InterfaceC1224360hxy LLILLJJLI;
    public final InterfaceC1224370hxz LLILLL;
    public final InterfaceC1224310hxt LLILZ;
    public final InterfaceC1224160hxe LLILZIL;
    public C1224780hye LLILZLL;
    public final C01GW LLIZ;
    public C1224240hxm LLIZLLLIL;
    public boolean LLJ;
    public final C897520ZIw LLJI;
    public final Map<String, Lifecycle> LLJIJIL;

    public final void AQ2() {
        InterfaceC1224160hxe interfaceC1224160hxe = this.LLILZIL;
        Map<String, List<C1224840hyk>> mapTy2 = interfaceC1224160hxe != null ? interfaceC1224160hxe.Ty2() : null;
        List listLLIIII = C13LP.LLIIII(this.LL.Ft());
        List listLLIIII2 = C13LP.LLIIII(this.LL.hA1());
        this.LLILZLL = new C1224780hye(mapTy2, listLLIIII, listLLIIII2);
        C1224790hyf c1224790hyf = new C1224790hyf(mapTy2, listLLIIII, listLLIIII2);
        C1224240hxm c1224240hxm = this.LLIZLLLIL;
        if (c1224240hxm != null) {
            c1224240hxm.LJJJ(c1224790hyf);
        }
        if (this.LLJ) {
            return;
        }
        this.LLILZ.hf2();
        this.LLJ = true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1223570hwh(false, EnumC1223630hwn.CONTENT_PAGE, new C291001Au(Boolean.FALSE));
    }

    @Override // X.InterfaceC1224750hyb
    public final List<AbstractC1223800hx4> ie2() {
        return this.LLILZ.kX0();
    }

    public final C1224280hxq vQ2() {
        return (C1224280hxq) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1224750hyb
    public final boolean S12() {
        return getState().LL;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        this.LLIZLLLIL = new C1224240hxm(vQ2());
    }

    @Override // X.InterfaceC1076400e7K
    public final InterfaceC1226510i1R r91() {
        return vQ2().LJIIJ;
    }

    @Override // X.InterfaceC1224750hyb
    public final C1224280hxq ty() {
        return vQ2();
    }

    @Override // X.InterfaceC1224750hyb
    public final InterfaceC897330ZId IN2() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1224750hyb
    public final Lifecycle dd2(String str) {
        if (str != null && str.length() != 0) {
            return (Lifecycle) ((LinkedHashMap) this.LLJIJIL).get(str);
        }
        return null;
    }

    @Override // X.InterfaceC1224750hyb
    public final List<AbstractC1223800hx4> dy0(String str) {
        List<AbstractC1223800hx4> listJ30;
        InterfaceC1224160hxe interfaceC1224160hxe = this.LLILZIL;
        if (interfaceC1224160hxe == null || (listJ30 = interfaceC1224160hxe.j30(str)) == null) {
            return C13BV.INSTANCE;
        }
        return listJ30;
    }

    public final void xQ2(EnumC1223630hwn enumC1223630hwn) {
        boolean z;
        if (this.LLILZ.qp2()) {
            if (enumC1223630hwn == EnumC1223630hwn.CONTENT_PAGE) {
                z = true;
            } else {
                z = false;
            }
            this.LLILLJJLI.yg0(z, true);
            this.LL.ct2(z);
        }
        setState(new AwS598S0100000_19(enumC1223630hwn, 506));
    }

    @Override // X.InterfaceC1224750hyb
    public final void hy2(C1224840hyk c1224840hyk, boolean z) {
        vQ2().LJ().LJJJJ(c1224840hyk, z);
        int i = C1224380hy0.LIZ[vQ2().LJ().LJJIZ().LIZJ().ordinal()];
        if (i != 1) {
            if (i == 2) {
                withState(new AwS71S0210000_19(c1224840hyk, this, z, 5));
                return;
            }
            return;
        }
        withState(new AwS71S0210000_19(c1224840hyk, this, z, 4));
    }

    @Override // X.InterfaceC1224750hyb
    public final void lg2(Lifecycle lifecycle, String str) {
        if (((LinkedHashMap) this.LLJIJIL).get(str) == lifecycle) {
            this.LLJIJIL.remove(str);
        }
    }

    @Override // X.InterfaceC1224750hyb
    public final void uu1(Lifecycle lifecycle, String str) {
        this.LLJIJIL.put(str, lifecycle);
    }

    public final boolean wQ2(C1224840hyk c1224840hyk, boolean z) {
        if (!vQ2().LJ().LJJIZ().LIZ()) {
            return c1224840hyk.LLJ;
        }
        if (!z && !c1224840hyk.LLJJ) {
            return true;
        }
        return false;
    }

    public final void yQ2(List list, Map map, Set set) {
        InterfaceC1224160hxe interfaceC1224160hxe;
        if (map != null && (interfaceC1224160hxe = this.LLILZIL) != null) {
            interfaceC1224160hxe.hs0(null, map);
        }
        if (list != null) {
            this.LLILZ.Ki0(list);
        }
        if (set != null) {
            this.LL.oq1(true, set);
        }
        AQ2();
    }

    public final C1224840hyk zQ2(C1224840hyk c1224840hyk, C1224840hyk c1224840hyk2, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = z2;
        boolean z5 = true;
        if (Intrinsics.LJFF(c1224840hyk.LLILZ, c1224840hyk2.LLILZ)) {
            if (z) {
                z4 = false;
            } else {
                if (!z4) {
                }
                return C1224840hyk.LIZ(c1224840hyk, null, null, wQ2(c1224840hyk, z5), null, null, z, z4, false, false, false, 59135);
            }
            z5 = false;
            return C1224840hyk.LIZ(c1224840hyk, null, null, wQ2(c1224840hyk, z5), null, null, z, z4, false, false, false, 59135);
        }
        if (c1224840hyk.LLJILLL) {
            z3 = true;
        } else {
            if (c1224840hyk.LLJILJIL) {
                z3 = false;
            } else {
                z3 = z4;
            }
            if (c1224840hyk.LLJILJIL || !z4) {
            }
            return C1224840hyk.LIZ(c1224840hyk, null, null, wQ2(c1224840hyk, z5), null, null, false, z3, false, false, false, 61183);
        }
        z5 = false;
        return C1224840hyk.LIZ(c1224840hyk, null, null, wQ2(c1224840hyk, z5), null, null, false, z3, false, false, false, 61183);
    }

    public SelectorContainerVM(InterfaceC1224320hxu interfaceC1224320hxu, InterfaceC1224360hxy interfaceC1224360hxy, InterfaceC1224370hxz interfaceC1224370hxz, InterfaceC1224310hxt interfaceC1224310hxt, InterfaceC1224160hxe interfaceC1224160hxe) {
        this.LL = interfaceC1224320hxu;
        this.LLILLJJLI = interfaceC1224360hxy;
        this.LLILLL = interfaceC1224370hxz;
        this.LLILZ = interfaceC1224310hxt;
        this.LLILZIL = interfaceC1224160hxe;
        Map mapLJ = C2097608Jq.LJ();
        C13BV c13bv = C13BV.INSTANCE;
        this.LLILZLL = new C1224780hye(mapLJ, c13bv, c13bv);
        this.LLIZ = C1223620hwm.LJ(this);
        InterfaceC897380ZIi.LIZIZ.getClass();
        this.LLJI = C897370ZIh.LIZ().LJI(EnumC1910450zoZ.CONTACT_SELECTOR, false);
        this.LLJIJIL = new LinkedHashMap();
    }
}
