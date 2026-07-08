package com.ss.android.ugc.profile.platform.business.navbar.assemble.sub;

import X.AbstractC1250290idn;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0FX4;
import X.C0QSJ;
import X.C1248920iba;
import X.C1248950ibd;
import X.C1249120ibu;
import X.C1249430icP;
import X.C1249490icV;
import X.C1250230idh;
import X.C1250250idj;
import X.C1250280idm;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724240Sb0;
import X.EnumC1249130ibv;
import X.InterfaceC1146704e9;
import X.InterfaceC1249500icW;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileNavBarBaseComponent extends BaseContainerComponent implements INavbarBaseAbility, C0QSJ, InterfaceC1146704e9 {
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public TuxNavBar LLJJJJLIIL;
    public String LLJJJ = "";
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2530));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2531));
    public final SparseArray<C1249490icV> LLJJJJJIL = new SparseArray<>();
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2533));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2532));

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public void HU1(Integer num) {
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public C1249430icP Sr2() {
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public void UI1(boolean z, boolean z2) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{NavbarScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(NavbarScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(NavbarScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final boolean F01() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasUpdateActions=");
        sbLIZ.append(this.LLJJIJIL);
        C1720106oR.LJI("BaseContainerComponent", C2188811AlT.LIZIZ(sbLIZ));
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        C1248950ibd c1248950ibd = (C1248950ibd) this.LLJJJIL.getValue();
        C723850SaN.LIZLLL(this, new C1248920iba(c1248950ibd != null ? c1248950ibd.LLILLJJLI : null, this));
    }

    public final EnumC1249130ibv bp() {
        String str = this.assemTagInternal;
        if (str != null && a0.LJJIIZI(str, "nav_bar_start", false)) {
            return EnumC1249130ibv.START_AREA;
        }
        String str2 = this.assemTagInternal;
        if (str2 != null && a0.LJJIIZI(str2, "nav_bar_center", false)) {
            return EnumC1249130ibv.CENTER_AREA;
        }
        String str3 = this.assemTagInternal;
        return (str3 == null || !a0.LJJIIZI(str3, "nav_bar_end", false)) ? EnumC1249130ibv.NULL : EnumC1249130ibv.END_AREA;
    }

    public final TuxNavBar cp() {
        TuxNavBar tuxNavBar = this.LLJJJJLIIL;
        if (tuxNavBar != null) {
            return tuxNavBar;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final TuxNavBar Bp0() {
        return cp();
    }

    public final void cO1() {
        INavBarActionAbility iNavBarActionAbility = (INavBarActionAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), INavBarActionAbility.class, null);
        if (iNavBarActionAbility != null) {
            iNavBarActionAbility.cO1();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), INavbarBaseAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        boolean zLJI = MethodIDManager.LJI(71830);
        C723850SaN.LIZLLL(this, new C1248920iba(profileComponents, this));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final View Lx1(EnumC1249130ibv enumC1249130ibv) {
        int i = C1249120ibu.LIZ[enumC1249130ibv.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return cp().findViewById(R.id.p1k);
            }
            return cp().findViewById(R.id.p1u);
        }
        return cp().findViewById(R.id.p25);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final View Yp1(String str) {
        return cp().LJII(str);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void Zr0(String str) {
        cp().LJJ(AFwS257S0000000_19.get$arr$(495), str);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void bq1(String str) {
        cp().LJJ(AFwS257S0000000_19.get$arr$(496), str);
    }

    public final void dp(EnumC1249130ibv enumC1249130ibv) {
        AssemSupervisor assemSupervisorLJ;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        INavBarActionAbility iNavBarActionAbility;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("base updateActions, area=");
        sbLIZ.append(enumC1249130ibv);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJJIJI == this.LLJILJIL.size() && this.LLJJIJIIJIL) {
            C0FX4 c0fx4 = new C0FX4(this.LLJJJJJIL, 0);
            ArrayList arrayList = new ArrayList();
            while (c0fx4.hasNext()) {
                arrayList.add(((C1249490icV) c0fx4.next()).LIZ);
            }
            int i2 = C1249120ibu.LIZ[enumC1249130ibv.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 && (iNavBarActionAbility = (INavBarActionAbility) this.LLJJL.getValue()) != null) {
                    iNavBarActionAbility.He0(arrayList);
                }
            } else {
                INavBarActionAbility iNavBarActionAbility2 = (INavBarActionAbility) this.LLJJL.getValue();
                if (iNavBarActionAbility2 != null) {
                    iNavBarActionAbility2.XM0(arrayList);
                }
            }
            INavBarActionAbility iNavBarActionAbility3 = (INavBarActionAbility) this.LLJJL.getValue();
            if (iNavBarActionAbility3 != null) {
                iNavBarActionAbility3.aG1();
            }
            this.LLJJIJIL = true;
            if (enumC1249130ibv == EnumC1249130ibv.START_AREA && (assemSupervisorLJ = C724240Sb0.LJ(this)) != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
                for (InterfaceC665370Q7z interfaceC665370Q7z : copyOnWriteArrayList) {
                    if (interfaceC665370Q7z instanceof InterfaceC1249500icW) {
                        ((InterfaceC1249500icW) interfaceC665370Q7z).oa();
                    }
                }
            }
            cO1();
            this.LLJJIJIIJIL = false;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void f31(C1250250idj c1250250idj) {
        ap(c1250250idj, "nav_bar_center_nickname");
        INavBarActionAbility iNavBarActionAbility = (INavBarActionAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), INavBarActionAbility.class, null);
        if (iNavBarActionAbility != null) {
            iNavBarActionAbility.zm1(c1250250idj);
        }
        cO1();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void nl1(C1250230idh c1250230idh) {
        ap(c1250230idh, "nav_bar_center_avatar");
        INavBarActionAbility iNavBarActionAbility = (INavBarActionAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), INavBarActionAbility.class, null);
        if (iNavBarActionAbility != null) {
            iNavBarActionAbility.EH(c1250230idh);
        }
        cO1();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, INavbarBaseAbility.class, bp().getValue(), null);
        }
        if (!(view instanceof TuxNavBar)) {
            return;
        }
        this.LLJJJJLIIL = (TuxNavBar) view;
    }

    public static void ap(AbstractC1250290idn abstractC1250290idn, String str) {
        if (abstractC1250290idn instanceof C1251150ifB) {
            abstractC1250290idn.LIZIZ = str;
            return;
        }
        if (abstractC1250290idn instanceof C1250300ido) {
            abstractC1250290idn.LIZIZ = str;
        } else if (abstractC1250290idn instanceof C1250280idm) {
            abstractC1250290idn.LIZIZ = str;
        } else {
            if (!(abstractC1250290idn instanceof C1250250idj)) {
                return;
            }
            abstractC1250290idn.LIZIZ = str;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void Pf1(EnumC1249130ibv enumC1249130ibv, boolean z) {
        if (z) {
            this.LLJJIJI++;
        } else {
            this.LLJJIJI--;
        }
        dp(enumC1249130ibv);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void S21(int i, boolean z) {
        if (z) {
            if (i != 0) {
                cp().LJIILLIIL(1, i, bp());
                return;
            } else {
                cp().LJIILLIIL(0, 0, bp());
                return;
            }
        }
        cp().LJIIIZ(bp());
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void kL(String str, String str2) {
        View viewYp1 = Yp1(str);
        if (viewYp1 != null) {
            viewYp1.setContentDescription(str2);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void LL0(EnumC1249130ibv enumC1249130ibv, int i, String str) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeAction index: ");
        sbLIZ.append(i);
        sbLIZ.append(", uniqueId: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJJJJIL.remove(i);
        Zr0(str);
        Pf1(enumC1249130ibv, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void aP1(int i, AbstractC1250290idn abstractC1250290idn, String str) {
        AbstractC1250290idn abstractC1250290idn2;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AbstractC1250290idn abstractC1250290idn3;
        if (abstractC1250290idn == null) {
            return;
        }
        C1249490icV c1249490icV = this.LLJJJJJIL.get(i);
        C1249490icV c1249490icV2 = this.LLJJJJJIL.get(i);
        if (c1249490icV2 != null) {
            abstractC1250290idn2 = c1249490icV2.LIZ;
        } else {
            abstractC1250290idn2 = null;
        }
        if (Intrinsics.LJFF(abstractC1250290idn2, abstractC1250290idn)) {
            bq1(str);
            return;
        }
        ap(abstractC1250290idn, str);
        ArrayList arrayList = new ArrayList();
        SparseArray<C1249490icV> sparseArray = this.LLJJJJJIL;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            C1249490icV c1249490icVValueAt = sparseArray.valueAt(i2);
            if (c1249490icVValueAt != null) {
                abstractC1250290idn3 = c1249490icVValueAt.LIZ;
            } else {
                abstractC1250290idn3 = null;
            }
            if (Intrinsics.LJFF(abstractC1250290idn3, abstractC1250290idn)) {
                arrayList.add(Integer.valueOf(this.LLJJJJJIL.indexOfKey(iKeyAt)));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.LLJJJJJIL.removeAt(((Number) it2.next()).intValue());
        }
        if (c1249490icV == null) {
            this.LLJJJJJIL.put(i, new C1249490icV(abstractC1250290idn, str));
            return;
        }
        int size2 = this.LLJJJJJIL.size() - 1;
        if (i <= size2) {
            while (true) {
                int iKeyAt2 = this.LLJJJJJIL.keyAt(size2);
                if (iKeyAt2 <= i + 1) {
                    SparseArray<C1249490icV> sparseArray2 = this.LLJJJJJIL;
                    int i3 = iKeyAt2 + 1;
                    sparseArray2.put(i3, sparseArray2.valueAt(size2));
                    this.LLJJJJJIL.remove(iKeyAt2);
                    if (this.LLJJJJJIL.size() < size2) {
                        return;
                    }
                    String str2 = this.LLJJJJJIL.valueAt(size2).LIZIZ;
                    AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
                    if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
                        Iterator<AbstractC738140SxQ> it3 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            AbstractC738140SxQ next = it3.next();
                            if ((next instanceof InterfaceC1249500icW) && Intrinsics.LJFF(next.assemTagInternal, str2)) {
                                ((InterfaceC1249500icW) next).Zn(i3);
                                break;
                            }
                        }
                    }
                }
                if (size2 == i) {
                    break;
                } else {
                    size2--;
                }
            }
        }
        this.LLJJJJJIL.put(i, new C1249490icV(abstractC1250290idn, str));
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void rG1(int i, String str, boolean z) {
        if (z) {
            if (i != 0) {
                cp().LJIILLIIL(1, i, str);
                return;
            } else {
                cp().LJIILLIIL(0, 0, str);
                return;
            }
        }
        cp().LJIIIZ(str);
    }
}
