package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C039L;
import X.C039M;
import X.C039N;
import X.C039O;
import X.C039P;
import X.C039Q;
import X.C049Y;
import X.C1748720vbi;
import X.C714302qb;
import X.C7969039j;
import X.C7979039t;
import X.C808003Dq;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.summary.USOrderSummaryCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.summary.USHalfPageOrderSummaryFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS130S0400000_1;
import kotlin.jvm.internal.AwS245S0300000_1;
import kotlin.jvm.internal.AwS26S0310000_1;

/* JADX INFO: loaded from: classes2.dex */
public class AjS0S0600000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.AbstractViewOnClickListenerC420730Ged
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

    public static final void LIZ$0(AjS0S0600000_1 ajS0S0600000_1, View view) {
        int i;
        List<BillItem> list;
        if (view != null) {
            C7969039j c7969039j = C7969039j.LIZ;
            c7969039j.getClass();
            Map<Integer, Boolean> map = C7969039j.LIZIZ;
            Boolean bool = (Boolean) ((LinkedHashMap) map).get(((C714302qb) ajS0S0600000_1.l0).LJIIIIZZ);
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                C1748720vbi.LIZLLL(((C039O) ajS0S0600000_1.l1).LLJI, new C049Y(), new AwS26S0310000_1((Map) ajS0S0600000_1.l5, (Map<String, Object>) zBooleanValue, (boolean) ajS0S0600000_1.l4, (C039Q) ajS0S0600000_1.l0, (C714302qb) 0));
                if (!zBooleanValue) {
                    list = ((C714302qb) ajS0S0600000_1.l0).LJIIJ;
                    i = R.raw.icon_chevron_up;
                } else {
                    i = R.raw.icon_chevron_down;
                    list = null;
                }
                ((C039O) ajS0S0600000_1.l2).LLJ.setIconRes(i);
                C039O c039o = (C039O) ajS0S0600000_1.l1;
                LinearLayout linearLayout = c039o.LLIZ;
                View view2 = c039o.LLIZLLLIL;
                OrderSubmitAssemViewModel orderSubmitAssemViewModelN5 = ((USOrderSummaryCell) ajS0S0600000_1.l3).N5();
                Fragment fragment = ((USOrderSummaryCell) ajS0S0600000_1.l3).getFragment();
                String str = ((C039Q) ajS0S0600000_1.l4).LLILZIL;
                c7969039j.getClass();
                C7969039j.LIZIZ(linearLayout, view2, list, orderSubmitAssemViewModelN5, fragment, str, null);
                map.put(((C714302qb) ajS0S0600000_1.l0).LJIIIIZZ, Boolean.valueOf(!zBooleanValue));
            }
        }
    }

    public static final void LIZ$1(AjS0S0600000_1 ajS0S0600000_1, View view) {
        FragmentManager fragmentManager;
        if (view != null) {
            C1748720vbi.LIZLLL(((C039O) ajS0S0600000_1.l0).LL, new C049Y(), new C039L((Map) ajS0S0600000_1.l2, (C714302qb) ajS0S0600000_1.l3, (C039Q) ajS0S0600000_1.l4));
            Fragment fragment = ((USOrderSummaryCell) ajS0S0600000_1.l1).getFragment();
            if (fragment != null && (fragmentManager = fragment.getFragmentManager()) != null) {
                C808003Dq.LJFF(C808003Dq.LIZLLL(C808003Dq.LIZJ(((C039O) ajS0S0600000_1.l0).itemView.getContext(), (C7979039t) ajS0S0600000_1.l5), ((C714302qb) ajS0S0600000_1.l3).LIZ, false, null, 60), fragmentManager, null, new AwS245S0300000_1((C039O) ajS0S0600000_1.l0, (C714302qb) ajS0S0600000_1.l3, (C039Q) ajS0S0600000_1.l4, 11), 4);
            }
            List<String> list = ((USOrderSummaryCell) ajS0S0600000_1.l1).N5().LLLIIL;
            if (list != null) {
                ((ArrayList) list).add("click_price_icon");
            }
        }
    }

    public static final void LIZ$2(AjS0S0600000_1 ajS0S0600000_1, View view) {
        int i;
        List<BillItem> list;
        if (view != null) {
            C7969039j c7969039j = C7969039j.LIZ;
            c7969039j.getClass();
            Map<Integer, Boolean> map = C7969039j.LIZIZ;
            Boolean bool = (Boolean) ((LinkedHashMap) map).get(((C714302qb) ajS0S0600000_1.l0).LJIIIIZZ);
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                C1748720vbi.LIZLLL(((C039N) ajS0S0600000_1.l1).LLJ, new C049Y(), new AwS26S0310000_1((Map) ajS0S0600000_1.l5, (Map<String, Object>) zBooleanValue, (boolean) ajS0S0600000_1.l4, (C039P) ajS0S0600000_1.l0, (C714302qb) 1));
                if (!zBooleanValue) {
                    list = ((C714302qb) ajS0S0600000_1.l0).LJIIJ;
                    i = R.raw.icon_chevron_up;
                } else {
                    i = R.raw.icon_chevron_down;
                    list = null;
                }
                ((C039N) ajS0S0600000_1.l2).LLIZLLLIL.setIconRes(i);
                C039N c039n = (C039N) ajS0S0600000_1.l1;
                LinearLayout linearLayout = c039n.LLILZLL;
                View view2 = c039n.LLIZ;
                OrderSubmitAssemViewModel orderSubmitAssemViewModelGS = ((USHalfPageOrderSummaryFragment) ajS0S0600000_1.l3).gS();
                USHalfPageOrderSummaryFragment uSHalfPageOrderSummaryFragment = (USHalfPageOrderSummaryFragment) ajS0S0600000_1.l3;
                String str = ((C039P) ajS0S0600000_1.l4).LLILZIL;
                Map map2 = (Map) ajS0S0600000_1.l5;
                c7969039j.getClass();
                C7969039j.LIZIZ(linearLayout, view2, list, orderSubmitAssemViewModelGS, uSHalfPageOrderSummaryFragment, str, map2);
                map.put(((C714302qb) ajS0S0600000_1.l0).LJIIIIZZ, Boolean.valueOf(!zBooleanValue));
            }
        }
    }

    public static final void LIZ$3(AjS0S0600000_1 ajS0S0600000_1, View view) {
        if (view != null) {
            FragmentManager fragmentManager = ((USHalfPageOrderSummaryFragment) ajS0S0600000_1.l0).getFragmentManager();
            if (fragmentManager != null) {
                C808003Dq.LJFF(C808003Dq.LIZLLL(C808003Dq.LIZJ(((C039N) ajS0S0600000_1.l1).itemView.getContext(), (C7979039t) ajS0S0600000_1.l2), ((C714302qb) ajS0S0600000_1.l3).LIZ, false, null, 60), fragmentManager, null, new AwS130S0400000_1((C039N) ajS0S0600000_1.l1, (C039N) ajS0S0600000_1.l4, (Map<String, Object>) ajS0S0600000_1.l3, (C714302qb) ajS0S0600000_1.l5, (C039P) 8), 4);
            }
            View view2 = ((USHalfPageOrderSummaryFragment) ajS0S0600000_1.l0).getView();
            if (view2 != null) {
                C1748720vbi.LIZLLL(view2, new C049Y(), new C039M((Map) ajS0S0600000_1.l4, (C714302qb) ajS0S0600000_1.l3, (C039P) ajS0S0600000_1.l5));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS0S0600000_1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
        this.l5 = obj6;
    }
}
