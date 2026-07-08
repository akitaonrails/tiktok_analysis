package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0I0B;
import X.C0ZFW;
import X.C127K;
import X.C1416605ga;
import X.C1529305yl;
import X.C1650306dB;
import X.C1717506o1;
import X.C197039127h;
import X.C20684815ws;
import X.C2097608Jq;
import X.C23250099c;
import X.C913630Zsn;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment.JoinRequestAssem;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment.ManageAdminAssem;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import com.ss.android.ugc.aweme.detailpage.audit.fragment.AuditRequestFragment;
import com.ss.android.ugc.aweme.detailpage.manageadmin.fragment.ManageAdminFragment;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.CreatorCareModeNewDesignFragment;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class AbS496S0200000_2 extends AbstractViewOnClickListenerC1637610siV {
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

    public static final void LIZ$0(AbS496S0200000_2 abS496S0200000_2, View view) {
        if (view != null) {
            ManageGroupViewModel manageGroupViewModelGo = ((JoinRequestAssem) abS496S0200000_2.l0).Go();
            Context context = ((C127K) abS496S0200000_2.l1).getContext();
            int i = ((JoinRequestAssem) abS496S0200000_2.l0).Go().getState().LLIZ;
            String str = AuditRequestFragment._pnsPageId;
            String strXQ2 = manageGroupViewModelGo.xQ2();
            if (strXQ2 != null) {
                C1650306dB.LIZ(context, i, strXQ2, "group_management", "group_management_cell");
            }
        }
    }

    public static final void LIZ$1(AbS496S0200000_2 abS496S0200000_2, View view) {
        if (view != null) {
            C913630Zsn.LJIIJJI.LJJIII("click_set_group_admin", ((C1717506o1) ((ManageAdminAssem) abS496S0200000_2.l0).LLJ.getValue()).LL, new Pair[]{new Pair<>("enter_from", "group_management"), new Pair<>("enter_method", "group_management_cell"), new Pair<>("is_master", C1529305yl.LIZ(Boolean.valueOf(C0ZFW.LJIJ(((C1717506o1) ((ManageAdminAssem) abS496S0200000_2.l0).LLJ.getValue()).LL))))}, C0I0B.LJFF.LIZIZ());
            String str = ManageAdminFragment._pnsPageId;
            Context context = ((C127K) abS496S0200000_2.l1).getContext();
            String str2 = ((C1717506o1) ((ManageAdminAssem) abS496S0200000_2.l0).LLJ.getValue()).LL;
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/detail/manage_admin");
            smartRouteBuildRoute.withParam("conv_id", str2);
            smartRouteBuildRoute.open(10001);
        }
    }

    public static final void LIZ$2(AbS496S0200000_2 abS496S0200000_2, View view) {
        Object obj;
        if (view != null) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("action", "save");
            Boolean value = ((CreatorCareModeNewDesignFragment) abS496S0200000_2.l0).VR().LL.getValue();
            Boolean bool = Boolean.TRUE;
            String str = "on";
            if (Intrinsics.LJFF(value, bool)) {
                obj = "on";
            } else {
                obj = "off";
            }
            pairArr[1] = new Pair("care_mode_status", obj);
            if (!Intrinsics.LJFF(((CreatorCareModeNewDesignFragment) abS496S0200000_2.l0).VR().LLILLJJLI.getValue(), bool)) {
                str = "off";
            }
            pairArr[2] = new Pair("filter_all_status", str);
            C20684815ws.LJIILLIIL("cmt_care_mode_page_click", C2097608Jq.LJIIIIZZ(pairArr));
            ((C197039127h) abS496S0200000_2.l1).setLoading(true);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(((CreatorCareModeNewDesignFragment) abS496S0200000_2.l0).getViewLifecycleOwner()), null, null, new C1416605ga((CreatorCareModeNewDesignFragment) abS496S0200000_2.l0, (C197039127h) abS496S0200000_2.l1, null), 3);
        }
    }

    public static final void LIZ$3(AbS496S0200000_2 abS496S0200000_2, View view) {
        if (view != null) {
            ((Function0) abS496S0200000_2.l0).invoke();
            ((Function1) abS496S0200000_2.l1).invoke(Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS496S0200000_2(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
