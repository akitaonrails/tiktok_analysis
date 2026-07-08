package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module;

import X.C04CS;
import X.C04DG;
import X.C04DV;
import X.C04FM;
import X.C04FN;
import X.C04FR;
import X.C0QSJ;
import X.C13LE;
import X.C1457905nF;
import X.C2217381BqS;
import X.C687700QyG;
import X.EnumC1066604Fc;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC1761600vwU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.view.KeyEvent;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.goda.v2.model.dto.GodaV2Style;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public abstract class PdpBodyListCardReusedAssem<T extends PdpBodyListCardReusedAssem<T, I>, I> extends ReusedUISlotAssem<T> implements InterfaceC712990Rxx<I>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public volatile C04DG LLJJLIIIJLLLLLLLZ;
    public InterfaceC665370Q7z LLJL;
    public C0QSJ LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpBodyListCardReusedAssem.class, "groupVMAbility", "getGroupVMAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/body/IPdpBodyGroupVMAbility;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class});
    }

    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    public abstract void tp(I i);

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(I i) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final void vr(I i) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    private C04DG sp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJLIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
            this.LLJLIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        C04DG c04dg = (C04DG) c0qsjLIZLLL.getAbility(C04DG.class);
        C687700QyG.LJ(c04dg, C04DG.class);
        return c04dg;
    }

    public void op(I i) {
        C04FN c04fnLJIIIIZZ;
        GodaV2Style godaV2Style;
        InterfaceC1761600vwU interfaceC1761600vwU;
        if ((i instanceof C04DV) && (c04fnLJIIIIZZ = ((C04DV) i).LJIIIIZZ()) != null && (godaV2Style = c04fnLJIIIIZZ.LJIILLIIL) != null) {
            KeyEvent.Callback contentView = getContentView();
            if ((contentView instanceof InterfaceC1761600vwU) && (interfaceC1761600vwU = (InterfaceC1761600vwU) contentView) != null) {
                interfaceC1761600vwU.LJJJJJL(godaV2Style);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(I i) {
        op(i);
        tp(i);
        up(i);
    }

    public void up(I i) {
        C04FR c04fr;
        C04CS c04cs;
        if (i instanceof C04DV) {
            C04FN c04fnLJIIIIZZ = ((C04DV) i).LJIIIIZZ();
            if (c04fnLJIIIIZZ != null) {
                c04fr = c04fnLJIIIIZZ.LJII;
            } else {
                c04fr = null;
            }
            if (c04fr instanceof C04FM) {
                C04DG c04dgSp = this.LLJJLIIIJLLLLLLLZ;
                if (c04dgSp == null) {
                    synchronized (this) {
                        c04dgSp = this.LLJJLIIIJLLLLLLLZ;
                        if (c04dgSp == null) {
                            c04dgSp = sp();
                            this.LLJJLIIIJLLLLLLLZ = c04dgSp;
                        }
                    }
                }
                C1457905nF c1457905nFI3 = c04dgSp.i3((C04FM) c04fr);
                if (c1457905nFI3.LIZJ.compareAndSet(false, true) && (c04cs = c1457905nFI3.LIZIZ) != null) {
                    c04cs.LJI(c1457905nFI3.LIZ, EnumC1066604Fc.MODULE_SHOW.getValue(), null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
