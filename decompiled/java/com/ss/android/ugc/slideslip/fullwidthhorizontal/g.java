package com.ss.android.ugc.slideslip.fullwidthhorizontal;

import X.AbstractC1628090sT9;
import X.AbstractC2238408pq;
import X.C01GW;
import X.C01S9;
import X.C01ZW;
import X.C01ZX;
import X.C05N3;
import X.C05YC;
import X.C095E;
import X.C0PEM;
import X.C11NZ;
import X.C122800dO;
import X.C1624010sMZ;
import X.C1627790sSf;
import X.C1627860sSm;
import X.C1627970sSx;
import X.C1628480sTm;
import X.C1628500sTo;
import X.C1629100sUm;
import X.C1632470saD;
import X.C1701940uOG;
import X.C19A3;
import X.C1BNE;
import X.C1DFH;
import X.C201955140j;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C23250099c;
import X.C259800zU;
import X.C452501pT;
import X.C461501qv;
import X.C461701qx;
import X.C461801qy;
import X.C461901qz;
import X.C515801zg;
import X.EnumC122700dN;
import X.InterfaceC1364105Vn;
import X.InterfaceC1626500sQa;
import X.InterfaceC1626510sQb;
import X.InterfaceC1627750sSb;
import X.InterfaceC1628970sUZ;
import X.InterfaceC332260D0u;
import X.InterfaceC332600D2c;
import X.InterfaceC346201Wa;
import X.InterfaceC461401qu;
import X.InterfaceC500500Jk0;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS37S0010000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS75S1000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class g extends AbstractC1628090sT9 implements InterfaceC1627750sSb {
    public static final C1627970sSx LLJLLL = new Object() { // from class: X.0sSx
    };
    public static final int LLJZ = 8;
    public final InterfaceC1627750sSb LLJJL;
    public C461501qv LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;

    @Override // X.InterfaceC1627750sSb
    public void A(C1627860sSm c1627860sSm) {
        this.LLJJL.A(c1627860sSm);
    }

    @Override // X.InterfaceC1627750sSb
    public C05YC<C05N3> J() {
        return this.LLJJL.J();
    }

    @Override // X.InterfaceC1627750sSb
    public C01S9<InterfaceC461401qu> LJLJL() {
        return this.LLJJL.LJLJL();
    }

    @Override // X.InterfaceC1627750sSb
    public InterfaceC346201Wa<C1627860sSm> LJLLILLLL() {
        return this.LLJJL.LJLLILLLL();
    }

    @Override // X.InterfaceC1627750sSb
    public C01S9<C05N3> LLD() {
        return this.LLJJL.LLD();
    }

    @Override // X.InterfaceC1627750sSb
    public C05YC<InterfaceC461401qu> LLJJJ() {
        return this.LLJJL.LLJJJ();
    }

    @Override // X.InterfaceC1627750sSb
    public InterfaceC346201Wa<List<C1628480sTm>> LLLIZZ() {
        return this.LLJJL.LLLIZZ();
    }

    @Override // X.InterfaceC1627750sSb
    public Object LLZZLLIL(List<C1628480sTm> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return this.LLJJL.LLZZLLIL(list, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1627750sSb
    public C095E<List<C1628500sTo>> l1() {
        return this.LLJJL.l1();
    }

    @Override // X.InterfaceC1627750sSb
    public Object p1(List<C1628500sTo> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return this.LLJJL.p1(list, interfaceC1364105Vn);
    }

    private final InterfaceC332260D0u<Boolean> u7() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        C11NZ.LJIIJ(S5().LJJIFFI(), this.LLJJIJIIJIL, new InterfaceC500500Jk0() { // from class: X.0sSw
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                boolean z;
                Boolean bool = (Boolean) obj2;
                if (((Boolean) obj).booleanValue() && !bool.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C515801zg(this, c2252321DDqLIZ, 22));
        return c2252321DDqLIZ;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.0sSf] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, X.0sSf] */
    @Override // X.AbstractC1628090sT9
    public void L6() {
        C259800zU c259800zU = new C259800zU();
        String str = "click_carousel";
        c259800zU.element = new C1627790sSf(C1624010sMZ.LIZIZ(yq()), "click_carousel", k5(), "click_carousel");
        C461501qv c461501qv = this.LLJJLIIIJLLLLLLLZ;
        if (c461501qv != null) {
            int i = C122800dO.LIZ[c461501qv.LIZIZ.ordinal()];
            if (i == 1 || i == 2) {
                str = "click_bar_fav";
            } else if (i == 3) {
                str = "click_bar_rec";
            }
            c259800zU.element = new C1627790sSf(c461501qv.LIZ, str, k5(), str);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01ZW(this, c259800zU, null), 3);
    }

    @Override // X.AbstractC1628090sT9
    public boolean M5() {
        EnumC122700dN enumC122700dN;
        C461501qv c461501qv = this.LLJJLIIIJLLLLLLLZ;
        if (c461501qv != null && (enumC122700dN = c461501qv.LIZIZ) != null) {
            int i = C122800dO.LIZ[enumC122700dN.ordinal()];
            if (i == 1 || i == 2) {
                return true;
            }
            if (i == 3) {
                return false;
            }
        }
        return super.M5();
    }

    @Override // X.AbstractC1628090sT9
    public void N6() {
        Effect effect = this.LLJJIJI;
        if (effect != null) {
            boolean zLJJII = n7().LJJII(effect.getEffectId());
            C1632470saD c1632470saD = C1632470saD.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("carouselEffectSelectFlow effectName = ");
            sbLIZ.append(effect.getName());
            sbLIZ.append(",isFavorite = ");
            sbLIZ.append(zLJJII);
            C201955140j.LJIILL(c1632470saD, "FullWidthCarouselBottomComponent", C2188811AlT.LIZIZ(sbLIZ));
            i3(new AwS37S0010000_25(zLJJII, 25));
        }
    }

    @Override // X.AbstractC1628090sT9
    public EnumC122700dN k5() {
        C461501qv c461501qv = this.LLJJLIIIJLLLLLLLZ;
        if (c461501qv != null) {
            return c461501qv.LIZIZ;
        }
        return null;
    }

    public final InterfaceC1628970sUZ n7() {
        return (InterfaceC1628970sUZ) this.LLJLLIL.getValue();
    }

    public final boolean o7() {
        return ((Boolean) this.LLJLIL.getValue()).booleanValue();
    }

    public final boolean s7() {
        return ((Boolean) this.LLJL.getValue()).booleanValue();
    }

    @Override // X.AbstractC1628090sT9
    public String t5() {
        return (String) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.AbstractC1628090sT9
    public String x5() {
        return (String) this.LLJLL.getValue();
    }

    @Override // X.AbstractC1628090sT9, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        y7(u7());
    }

    @Override // X.AbstractC1628090sT9, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJJIII.dispose();
    }

    @Override // X.AbstractC1628090sT9
    public void u6() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01ZX(this, null), 3);
    }

    private final void y7(InterfaceC332260D0u<Boolean> interfaceC332260D0u) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C23250099c.LIZLLL(lifecycleScope, abstractC2238408pq, null, new C461701qx(this, interfaceC332260D0u, null), 2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), abstractC2238408pq, null, new C461801qy(this, null), 2);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("favorite_sticker_update_switch", true)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C461901qz(this, null), 3);
        }
    }

    public final void I7(EnumC122700dN enumC122700dN) {
        Effect effect;
        String string;
        C461501qv c461501qv = this.LLJJLIIIJLLLLLLLZ;
        if (c461501qv != null) {
            effect = c461501qv.LIZ;
        } else {
            effect = null;
        }
        String strLIZJ = C1629100sUm.LIZJ(effect);
        if (enumC122700dN != EnumC122700dN.RECENTLY && enumC122700dN != EnumC122700dN.FAVORITE && !C1629100sUm.LJFF(effect) && !C1629100sUm.LIZLLL(effect) && !Intrinsics.LJFF(strLIZJ, "related") && !Intrinsics.LJFF(strLIZJ, "premium")) {
            string = this.LLJILJILJ.getString(2131826396);
        } else {
            string = this.LLJILJILJ.getString(2131834981);
        }
        i3(new AwS75S1000000_25(string, 11));
    }

    @Override // X.AbstractC1628090sT9
    public void P6(Effect effect, boolean z) {
        i3(new AwS604S0100000_25(effect, 452));
    }

    public g(C19A3 c19a3, InterfaceC1626500sQa interfaceC1626500sQa, InterfaceC1626510sQb interfaceC1626510sQb, InterfaceC1627750sSb interfaceC1627750sSb, InterfaceC332600D2c interfaceC332600D2c) {
        super(c19a3, interfaceC1626500sQa, interfaceC1626510sQb, interfaceC332600D2c);
        this.LLJJL = interfaceC1627750sSb;
        this.LLJL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(344));
        this.LLJLIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(345));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS426S0200000_25(this, c19a3, 108));
        this.LLJLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 705));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 704));
    }
}
