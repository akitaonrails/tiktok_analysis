package wh6;

import X.AbstractC1069740dwa;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C0XPD;
import X.C1008580cLw;
import X.C1066850drv;
import X.C1066860drw;
import X.C1073690e2x;
import X.C1077490e95;
import X.C1388190mED;
import X.C1589640rT8;
import X.C19EG;
import X.C1D2P;
import X.C2018307vR;
import X.InterfaceC1017820caq;
import X.InterfaceC1066840dru;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedEmptyPageCell;
import com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public class AbS506S0200000_16 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS506S0200000_16 abS506S0200000_16, View view) {
        if (view != null) {
            ((RecFriendsTopBaseCell) abS506S0200000_16.l0).R5((AbstractC1069740dwa) abS506S0200000_16.l1);
        }
    }

    public static final void LIZ$1(AbS506S0200000_16 abS506S0200000_16, View view) {
        C1066860drw c1066860drw;
        InterfaceC1066840dru interfaceC1066840dru;
        if (view != null && (interfaceC1066840dru = (c1066860drw = (C1066860drw) abS506S0200000_16.l0).LL) != null) {
            ((C1066850drv) abS506S0200000_16.l1).getClass();
            interfaceC1066840dru.LIZJ(C1066850drv.LIZ(c1066860drw));
        }
    }

    public static final void LIZ$2(AbS506S0200000_16 abS506S0200000_16, View view) {
        C1D2P c1d2pLJIIIIZZ;
        if (view != null) {
            InterfaceC1017820caq interfaceC1017820caq = (InterfaceC1017820caq) ((C1008580cLw) abS506S0200000_16.l0).LLJLIL.getValue();
            if (interfaceC1017820caq != null) {
                interfaceC1017820caq.LJ(((ViewGroup) abS506S0200000_16.l1).getContext(), ((C1008580cLw) abS506S0200000_16.l0).LLILLJJLI.LIZLLL);
            }
            InterfaceC1017820caq interfaceC1017820caq2 = (InterfaceC1017820caq) ((C1008580cLw) abS506S0200000_16.l0).LLJLIL.getValue();
            if (interfaceC1017820caq2 != null && (c1d2pLJIIIIZZ = interfaceC1017820caq2.LJIIIIZZ(((C1008580cLw) abS506S0200000_16.l0).LLILLJJLI.LIZLLL)) != null) {
                String tag = ((C1008580cLw) abS506S0200000_16.l0).LL.getTag();
                String refer = ((C1008580cLw) abS506S0200000_16.l0).LL.getRefer();
                AnoleComponentModel anoleComponentModel = ((C1008580cLw) abS506S0200000_16.l0).LL;
                c1d2pLJIIIIZZ.LJJIJIIJIL(Long.valueOf(anoleComponentModel.getID()), tag, refer, anoleComponentModel.type);
            }
        }
    }

    public static final void LIZ$3(AbS506S0200000_16 abS506S0200000_16, View view) {
        C19EG c19egLIZIZ;
        if (view != null) {
            Context context = ((FriendsFeedEmptyPageCell) abS506S0200000_16.l0).itemView.getContext();
            if (C1589640rT8.LIZIZ.V1()) {
                if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                    C0XPD.LIZIZ(c19egLIZIZ, "homepage_hot", "click_friends_tab", null, new C1077490e95(c19egLIZIZ, 5));
                    C2018307vR.LIZ.getClass();
                    C2018307vR.LIZ("homepage_friends", "click_friends_tab");
                    return;
                }
                return;
            }
            Function2<Context, View, Unit> function2 = ((C1073690e2x) abS506S0200000_16.l1).LIZJ;
            if (function2 == null) {
                return;
            }
            function2.invoke(((FriendsFeedEmptyPageCell) abS506S0200000_16.l0).itemView.getContext(), ((FriendsFeedEmptyPageCell) abS506S0200000_16.l0).itemView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS506S0200000_16(RecFriendsTopBaseCell recFriendsTopBaseCell, AbstractC1069740dwa abstractC1069740dwa, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = recFriendsTopBaseCell;
        this.l1 = abstractC1069740dwa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS506S0200000_16(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
