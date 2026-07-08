package kotlin.jvm.internal;

import X.AbstractC1676640tjS;
import X.AbstractC1676650tjT;
import X.C05P0;
import X.C09AY;
import X.C0MAX;
import X.C1220680hs2;
import X.C12823050b;
import X.C13ES;
import X.C13FE;
import X.C13Z4;
import X.C1672120tcA;
import X.C1672390tcb;
import X.C1672700td6;
import X.C1676630tjR;
import X.C1676910tjt;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1685760tyA;
import X.C1686850tzv;
import X.C1690050u55;
import X.C19719212De;
import X.C5183020f;
import X.C636150OxJ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1671910tbp;
import X.InterfaceC1676580tjM;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC1692880u9e;
import X.InterfaceC636240OxS;
import android.view.View;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;
import com.ss.android.ugc.aweme.viewmodel.MentionVideoShareModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS44S0600000_25 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS44S0600000_25 awS44S0600000_25, Object obj, Object obj2) throws Throwable {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            Function1 function1 = (Function1) awS44S0600000_25.l2;
            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) awS44S0600000_25.l3;
            Object objLJJ = interfaceC1680500tpg.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = (C1672120tcA) function1.invoke(animatedContentTransitionScopeImpl);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ);
            }
            C1672120tcA c1672120tcA = (C1672120tcA) objLJJ;
            boolean zLJIIZILJ = interfaceC1680500tpg.LJIIZILJ(Intrinsics.LJFF(((C1676910tjt) awS44S0600000_25.l0).LJFF().LIZJ(), awS44S0600000_25.l1));
            C1676910tjt c1676910tjt = (C1676910tjt) awS44S0600000_25.l0;
            Object obj3 = awS44S0600000_25.l1;
            Function1 function12 = (Function1) awS44S0600000_25.l2;
            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) awS44S0600000_25.l3;
            Object objLJJ2 = interfaceC1680500tpg.LJJ();
            if (zLJIIZILJ || objLJJ2 == c1680520tpi) {
                if (Intrinsics.LJFF(c1676910tjt.LJFF().LIZJ(), obj3)) {
                    objLJJ2 = AbstractC1676650tjT.LIZ;
                } else {
                    objLJJ2 = ((C1672120tcA) function12.invoke(animatedContentTransitionScopeImpl2)).LIZIZ;
                }
                interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
            }
            AbstractC1676650tjT abstractC1676650tjT = (AbstractC1676650tjT) objLJJ2;
            Object obj4 = awS44S0600000_25.l1;
            C1676910tjt c1676910tjt2 = (C1676910tjt) awS44S0600000_25.l0;
            Object objLJJ3 = interfaceC1680500tpg.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = new C1672390tcb(Intrinsics.LJFF(obj4, c1676910tjt2.LJI()));
                interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
            }
            C1672390tcb c1672390tcb = (C1672390tcb) objLJJ3;
            AbstractC1676640tjS abstractC1676640tjS = c1672120tcA.LIZ;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            boolean zLJII = interfaceC1680500tpg.LJII(c1672120tcA);
            Object objLJJ4 = interfaceC1680500tpg.LJJ();
            if (zLJII || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS674S0100000_25(c1672120tcA, 0);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ4);
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1672700td6.LIZ(c1685760tyA, (InterfaceC1631620sYq) objLJJ4);
            boolean zLJFF = Intrinsics.LJFF(awS44S0600000_25.l1, ((C1676910tjt) awS44S0600000_25.l0).LJI());
            ((C13FE) c1672390tcb.LIZIZ).setValue(Boolean.valueOf(zLJFF));
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = interfaceC1685750ty9LIZ.LIZ(c1672390tcb);
            C1676910tjt c1676910tjt3 = (C1676910tjt) awS44S0600000_25.l0;
            boolean zLJII2 = interfaceC1680500tpg.LJII(awS44S0600000_25.l1);
            Object obj5 = awS44S0600000_25.l1;
            Object objLJJ5 = interfaceC1680500tpg.LJJ();
            if (zLJII2 || objLJJ5 == c1680520tpi) {
                objLJJ5 = new C5183020f(obj5, (Object) 5);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ5);
            }
            Function1 function13 = (Function1) objLJJ5;
            boolean zLJJIIJ = interfaceC1680500tpg.LJJIIJ(abstractC1676650tjT);
            Object objLJJ6 = interfaceC1680500tpg.LJJ();
            if (zLJJIIJ || objLJJ6 == c1680520tpi) {
                objLJJ6 = new AwS639S0100000_25(abstractC1676650tjT, 1);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ6);
            }
            C1676630tjR.LIZ(c1676910tjt3, function13, interfaceC1685750ty9LIZ2, abstractC1676640tjS, abstractC1676650tjT, (Function2) objLJJ6, C13Z4.LIZJ(-616195562, new AwS184S0400000_25((C13ES) awS44S0600000_25.l4, (C13ES<Object>) awS44S0600000_25.l1, (AnimatedContentTransitionScopeImpl) awS44S0600000_25.l3, (AnimatedContentTransitionScopeImpl<Object>) awS44S0600000_25.l5, (InterfaceC1631630sYr<? super InterfaceC1671910tbp, Object, ? super InterfaceC1680500tpg, ? super Integer, Unit>) 0), interfaceC1680500tpg), interfaceC1680500tpg, 12582912, 64);
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS44S0600000_25 r22, java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS44S0600000_25.invoke$1(kotlin.jvm.internal.AwS44S0600000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS44S0600000_25 awS44S0600000_25, Object obj, Object obj2) {
        C0MAX c0max = (C0MAX) obj;
        List listItemState = ((C636150OxJ) awS44S0600000_25.l0).getListItemState();
        c0max.LJ(listItemState.size(), new AwS581S0100000_2(listItemState, (List<ActionBarButtonConfBusiness>) 667), null, AFwS266S0000000_25.get$arr$(521), new C19719212De(-1768775976, new C1220680hs2(listItemState, (MentionFavoriteVideoVM) awS44S0600000_25.l1, (IAVPublishService) awS44S0600000_25.l2, (View) awS44S0600000_25.l3, (MentionVideoShareModel) awS44S0600000_25.l4), true));
        c0max.LIZ(null, AFwS266S0000000_25.get$arr$(565), null, new C19719212De(1884639409, new AwS319S0300000_25((InterfaceC636240OxS) obj2, (InterfaceC636240OxS<C12823050b>) awS44S0600000_25.l5, (C1690050u55) awS44S0600000_25.l1, (MentionFavoriteVideoVM) 8), true));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS44S0600000_25(C636150OxJ c636150OxJ, C636150OxJ<C12823050b> c636150OxJ2, MentionFavoriteVideoVM mentionFavoriteVideoVM, IAVPublishService iAVPublishService, View view, MentionVideoShareModel mentionVideoShareModel, C1690050u55 c1690050u55) {
        super(2);
        this.$t = c1690050u55;
        this.l0 = c636150OxJ;
        this.l1 = c636150OxJ2;
        this.l2 = mentionFavoriteVideoVM;
        this.l3 = iAVPublishService;
        this.l4 = view;
        this.l5 = mentionVideoShareModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS44S0600000_25(C1676910tjt c1676910tjt, C1676910tjt<S> c1676910tjt2, S s, Function1<? super InterfaceC1676580tjM<S>, C1672120tcA> function1, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, C13ES<S> c13es, InterfaceC1631630sYr<? super InterfaceC1671910tbp, ? super S, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr) {
        super(2);
        this.$t = interfaceC1631630sYr;
        this.l0 = c1676910tjt;
        this.l1 = c1676910tjt2;
        this.l2 = s;
        this.l3 = function1;
        this.l4 = animatedContentTransitionScopeImpl;
        this.l5 = c13es;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0600000_25(InterfaceC1692880u9e interfaceC1692880u9e, Function0 function0, Function0 function02, C1686850tzv c1686850tzv, C05P0 c05p0, C05P0 c05p02, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC1692880u9e;
        this.l1 = function0;
        this.l2 = function02;
        this.l3 = c1686850tzv;
        this.l4 = c05p0;
        this.l5 = c05p02;
    }
}
