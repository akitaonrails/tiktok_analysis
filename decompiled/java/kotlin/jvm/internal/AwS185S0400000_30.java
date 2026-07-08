package kotlin.jvm.internal;

import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C0PEM;
import X.C1390920mIc;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1680540tpk;
import X.C1682380tsi;
import X.C1683060tto;
import X.C19EG;
import X.C20037913aj;
import X.C20043513bd;
import X.C20043713bf;
import X.C20044113bj;
import X.C20045113bt;
import X.C23250099c;
import X.C299110Bnx;
import X.C324940CoW;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC20307514d7;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC1690350u5Z;
import X.InterfaceC1690470u5l;
import X.InterfaceC1690480u5m;
import X.InterfaceC19395910uT;
import X.InterfaceC19396010uU;
import X.InterfaceC20029813Yq;
import X.InterfaceC20043013bY;
import X.InterfaceC20044013bi;
import X.RunnableC20045313bv;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoIgnoreRecyclerAndPagerBottomSheetBehaviour;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSevenSheetFragment;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.TuxTakoIgnoreRecyclerAndPagerSheetBehaviour;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public class AwS185S0400000_30 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS185S0400000_30 awS185S0400000_30, Object obj, Object obj2, Object obj3) {
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ;
        InterfaceC20043013bY interfaceC20043013bY = (InterfaceC20043013bY) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        C05P1 c05p1 = (C05P1) awS185S0400000_30.l3;
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = new C20043513bd(interfaceC20043013bY, new AwS574S0100000_30(c05p1, (C05P1<? extends Function0<? extends InterfaceC1690480u5m>>) 1));
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        final C20043513bd c20043513bd = (C20043513bd) objLJJ;
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (objLJJ2 == c1680520tpi) {
            objLJJ2 = new C20037913aj(new InterfaceC20029813Yq(c20043513bd) { // from class: X.13Yg
                public final C20043513bd LIZ;
                public final C20028313Yb<Object> LIZIZ = C1691440u7K.LIZ();

                {
                    this.LIZ = c20043513bd;
                }

                @Override // X.InterfaceC20029813Yq
                public final void LIZIZ(C19993013Km c19993013Km) {
                    int i;
                    this.LIZIZ.LIZJ();
                    for (Object obj4 : c19993013Km) {
                        Object objLIZIZ = this.LIZ.LIZIZ(obj4);
                        C20028313Yb<Object> c20028313Yb = this.LIZIZ;
                        int iLIZ = c20028313Yb.LIZ(objLIZIZ);
                        if (iLIZ >= 0) {
                            i = c20028313Yb.LIZJ[iLIZ];
                            if (i == 7) {
                                c19993013Km.remove(obj4);
                            }
                        } else {
                            i = 0;
                        }
                        this.LIZIZ.LJII(i + 1, objLIZIZ);
                    }
                }

                @Override // X.InterfaceC20029813Yq
                public final boolean LIZ(Object obj4, Object obj5) {
                    return Intrinsics.LJFF(this.LIZ.LIZIZ(obj4), this.LIZ.LIZIZ(obj5));
                }
            });
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        C20037913aj c20037913aj = (C20037913aj) objLJJ2;
        if (((C20044113bj) awS185S0400000_30.l0) != null) {
            interfaceC1680500tpg.LJJIIJZLJL(204281539);
            InterfaceC20044013bi interfaceC20044013bi = ((C20044113bj) awS185S0400000_30.l0).LIZ;
            if (interfaceC20044013bi == null) {
                interfaceC1680500tpg.LJJIIJZLJL(6591363);
                interfaceC20044013bi = C20043713bf.LIZ;
                if (interfaceC20044013bi != null) {
                    interfaceC1680500tpg.LJJIIJZLJL(1213893039);
                    interfaceC1680500tpg.LJ();
                } else {
                    interfaceC1680500tpg.LJJIIJZLJL(1213931944);
                    View view = (View) interfaceC1680500tpg.LJJIL(AndroidCompositionLocals_androidKt.LJFF);
                    boolean zLJJIIJ = interfaceC1680500tpg.LJJIIJ(view);
                    Object objLJJ3 = interfaceC1680500tpg.LJJ();
                    if (zLJJIIJ || objLJJ3 == c1680520tpi) {
                        objLJJ3 = new RunnableC20045313bv(view);
                        interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
                    }
                    interfaceC20044013bi = (RunnableC20045313bv) objLJJ3;
                    interfaceC1680500tpg.LJ();
                }
            } else {
                interfaceC1680500tpg.LJJIIJZLJL(6590278);
            }
            interfaceC1680500tpg.LJ();
            C20044113bj c20044113bj = (C20044113bj) awS185S0400000_30.l0;
            Object[] objArr = {c20044113bj, c20043513bd, c20037913aj, interfaceC20044013bi};
            boolean zLJJIIJ2 = interfaceC1680500tpg.LJJIIJ(c20044113bj) | interfaceC1680500tpg.LJII(c20043513bd) | interfaceC1680500tpg.LJII(c20037913aj) | interfaceC1680500tpg.LJII(interfaceC20044013bi);
            C20044113bj c20044113bj2 = (C20044113bj) awS185S0400000_30.l0;
            Object objLJJ4 = interfaceC1680500tpg.LJJ();
            if (zLJJIIJ2 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS125S0400000_30(c20044113bj2, c20043513bd, c20037913aj, interfaceC20044013bi, 0);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ4);
            }
            C1680540tpk.LIZJ(objArr, (Function1) objLJJ4, interfaceC1680500tpg);
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LJJIIJZLJL(204710145);
            interfaceC1680500tpg.LJ();
        }
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS185S0400000_30.l1;
        C20044113bj c20044113bj3 = (C20044113bj) awS185S0400000_30.l0;
        int i = C20045113bt.LIZIZ;
        if (c20044113bj3 == null || (interfaceC1685750ty9LIZ = interfaceC1685750ty9.LIZ(new TraversablePrefetchStateModifierElement(c20044113bj3))) == null) {
            interfaceC1685750ty9LIZ = interfaceC1685750ty9;
        }
        boolean zLJJIIJ3 = interfaceC1680500tpg.LJJIIJ(c20043513bd) | interfaceC1680500tpg.LJJIIJ((Function2) awS185S0400000_30.l2);
        Function2 function2 = (Function2) awS185S0400000_30.l2;
        Object objLJJ5 = interfaceC1680500tpg.LJJ();
        if (zLJJIIJ3 || objLJJ5 == c1680520tpi) {
            objLJJ5 = new AwS460S0200000_25(c20043513bd, (C20043513bd) function2, (Function2<? super InterfaceC1690470u5l, ? super C1682380tsi, ? extends InterfaceC1690350u5Z>) 2);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ5);
        }
        C1683060tto.LIZIZ(c20037913aj, interfaceC1685750ty9LIZ, (Function2) objLJJ5, interfaceC1680500tpg, 8, 0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS185S0400000_30 awS185S0400000_30, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        long jLongValue = ((Number) obj2).longValue();
        String str = (String) obj3;
        String str2 = TakoSevenSheetFragment._pnsPageId;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS185S0400000_30.l0;
        TakoSevenSheetFragment takoSevenSheetFragment = new TakoSevenSheetFragment(0);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "tako_enter_param", takoEnterParams);
        takoSevenSheetFragment.setArguments(bundle);
        takoSevenSheetFragment.WO((InterfaceC19396010uU) awS185S0400000_30.l1, (InterfaceC19395910uT) awS185S0400000_30.l2);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = takoSevenSheetFragment;
        c1390920mIc.LJIIIIZZ(4);
        c1390920mIc.LJI(48);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLL = false;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJIIJIL = false;
        if (C299110Bnx.LIZ()) {
            c1390920mIc.LIZ.LLLIIIIL = new TuxTakoIgnoreRecyclerAndPagerSheetBehaviour();
        } else {
            c1390920mIc.LIZ.LLLIIII = new TakoIgnoreRecyclerAndPagerBottomSheetBehaviour();
        }
        DialogInterfaceOnDismissListenerC20307514d7 dialogInterfaceOnDismissListenerC20307514d7 = new DialogInterfaceOnDismissListenerC20307514d7(takoSevenSheetFragment, 1);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLILLJJLI = dialogInterfaceOnDismissListenerC20307514d7;
        takoSevenSheetFragment.w2(tuxSheet2);
        takoSevenSheetFragment.G2(3);
        tuxSheet2.show(((C19EG) awS185S0400000_30.l3).getSupportFragmentManager(), "TakoSevenSheetFragment");
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((C19EG) awS185S0400000_30.l3), C0PEM.LIZJ, null, new C324940CoW((TakoEnterParams) awS185S0400000_30.l0, jLongValue, zBooleanValue, str, null), 2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS185S0400000_30(C20044113bj c20044113bj, InterfaceC1685750ty9 interfaceC1685750ty9, Function2 function2, C05P0 c05p0, int i) {
        super(3);
        this.$t = i;
        this.l0 = c20044113bj;
        this.l1 = interfaceC1685750ty9;
        this.l2 = function2;
        this.l3 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS185S0400000_30(TakoEnterParams takoEnterParams, InterfaceC19396010uU interfaceC19396010uU, InterfaceC19395910uT interfaceC19395910uT, C19EG c19eg, int i) {
        super(3);
        this.$t = i;
        this.l0 = takoEnterParams;
        this.l1 = interfaceC19396010uU;
        this.l2 = interfaceC19395910uT;
        this.l3 = c19eg;
    }
}
