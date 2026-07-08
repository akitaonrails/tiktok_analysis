package com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem;

import X.C03AJ;
import X.C03O0;
import X.C03QL;
import X.C2217381BqS;
import X.C714302qb;
import X.C722002rq;
import X.C722202rs;
import X.C723502s5;
import X.C756102xL;
import X.C786410Ut5;
import X.C7976039q;
import X.C987803tc;
import X.InterfaceC7980039u;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuOrderSummaryPanelReusedAssem extends SkuPanelBaseReusedAssem<SkuOrderSummaryPanelReusedAssem, C723502s5> implements InterfaceC7980039u {
    public C7976039q LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public LinkedList<C03AJ> LLJLL;
    public volatile boolean LLJLLIL;
    public RecyclerView LLJLLL;
    public TuxTextView LLJZ;
    public LinearLayout LLJZIJLIL;
    public View LLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b2g;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem
    public final void Ap() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        this.LLJZIJLIL = (LinearLayout) op(R.id.eqx);
        View contentView = getContentView();
        if (contentView != null) {
            C786410Ut5.LJLLLLLL(8, contentView);
            LinearLayout linearLayout = this.LLJZIJLIL;
            ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = 0;
                LinearLayout linearLayout2 = this.LLJZIJLIL;
                if (linearLayout2 != null) {
                    C786410Ut5.d6(linearLayout2, marginLayoutParams);
                }
            }
        }
        this.LLJLLL = (RecyclerView) op(R.id.us_order_submit_order_summary_items);
        this.LLJZ = (TuxTextView) op(R.id.us_order_submit_order_summary_module_name);
        this.LLL = op(R.id.us_order_submit_order_summary_skeleton);
        RecyclerView recyclerView = this.LLJLLL;
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(false);
        }
        TuxTextView tuxTextView = this.LLJZ;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        View view = this.LLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem
    public final void zp() {
        getViewModel().s60(new C2217381BqS() { // from class: X.03Gv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCouponEvent();
            }
        }, new AwS580S0100000_1(this, 270));
        C03QL c03ql = getViewModel().LLJJJJ;
        if (c03ql == null || !c03ql.LJIIL()) {
            return;
        }
        getViewModel().s60(new C2217381BqS() { // from class: X.03Gt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSummaryInfo();
            }
        }, new AwS580S0100000_1(this, 271));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0262  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bp(X.C755502xF r24) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuOrderSummaryPanelReusedAssem.Bp(X.02xF):void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        C714302qb next;
        BillInfoData billInfoData = ((C723502s5) obj).LL;
        if (billInfoData != null) {
            Bp(C756102xL.LIZ(billInfoData, null, false, null, null, null, false, 63));
            Iterator<C714302qb> it2 = C722002rq.LJFF(billInfoData, null, false, 0, null, null, null, 63).LLILZLL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    Integer num = next.LJIIIIZZ;
                    if (num != null && num.intValue() == 10) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C714302qb c714302qb = next;
            if (!this.LLJLLIL) {
                this.LLJLLIL = true;
                OrderSubmitAssemViewModel orderSubmitAssemViewModel = new OrderSubmitAssemViewModel();
                orderSubmitAssemViewModel.o = C987803tc.LIZ(null, "one_click_pay");
                orderSubmitAssemViewModel.LLJJI = billInfoData;
                C03O0 c03o0 = C03O0.LIZ;
                HashMap<String, Object> mapHi1 = orderSubmitAssemViewModel.hi1(false);
                if (c714302qb != null) {
                    mapHi1.put("small_order_fee", c714302qb.LIZIZ);
                }
                String strLIZ = C722202rs.LIZ(C756102xL.LIZ(billInfoData, null, false, null, null, null, false, 63).LLILZLL);
                if (strLIZ != null) {
                    mapHi1.put("summary_info", strLIZ);
                }
                C03O0.LJJJZ(c03o0, "order_summary", mapHi1, null, null, null, null, null, null, null, null, null, null, null, 1048572);
            }
            View contentView = getContentView();
            if (contentView != null) {
                C786410Ut5.LJLLLLLL(0, contentView);
            }
        }
    }
}
