package com.ss.android.ugc.aweme.ecommerce.us.logistic.module;

import X.C01GW;
import X.C03C8;
import X.C03DZ;
import X.C03EF;
import X.C03FC;
import X.C0H9H;
import X.C11EA;
import X.C13LE;
import X.C13LP;
import X.C1697810uHb;
import X.C1841350y17;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C426750GoL;
import X.C452501pT;
import X.C756302xN;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS118S1200000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS30S2200000_1;
import kotlin.jvm.internal.AwS312S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USLogisticVH extends ECJediViewHolder<C03FC> {
    public final Fragment LLJILJIL;
    public C03EF LLJILJILJ;
    public ConstraintLayout LLJILLL;
    public C1841350y17 LLJJ;
    public LinearLayout LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LinearLayout W5() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.n_z) : null;
            this.LLJJI = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final C03EF X5() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.us_delivery_logistic_text) : null;
            this.LLJILJILJ = (C03EF) viewFindViewById;
        }
        return (C03EF) viewFindViewById;
    }

    public final DeliveryPanelViewModel a6() {
        return (DeliveryPanelViewModel) this.LLJJIJI.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        LogisticLinkRichText logisticLinkRichText;
        String str;
        String str2;
        int i;
        int iLIZIZ;
        C03FC c03fc = (C03FC) obj;
        C11EA.LJII(this, a6(), new C2217381BqS() { // from class: X.03Gr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((DeliveryPanelState) obj2).getSelectedLogistic();
            }
        }, new AwS615S0100000_1(this, 218));
        withState(a6(), new AwS367S0200000_1(this, c03fc.LIZ, 340));
        LogisticExpressionArea logisticExpressionArea = c03fc.LIZLLL;
        View viewFindViewById = null;
        if (logisticExpressionArea != null) {
            View view = this.itemView;
            LogisticDTO logisticDTO = c03fc.LIZ;
            C03DZ.LIZ(X5());
            LinearLayout linearLayoutW5 = W5();
            int i2 = 8;
            if (C756302xN.LIZ(logisticExpressionArea.logisticsDescriptions)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, linearLayoutW5);
            C786410Ut5.LJJJJJL(W5());
            List<ECRichText> list = logisticExpressionArea.logisticsDescriptions;
            if (list != null) {
                int i3 = 0;
                for (ECRichText eCRichText : list) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        ECRichText eCRichText2 = eCRichText;
                        LinearLayout linearLayoutW52 = W5();
                        C03EF c03ef = new C03EF(view.getContext(), null, 6);
                        if (i3 == C1697810uHb.LJIIJ(logisticExpressionArea.logisticsDescriptions)) {
                            iLIZIZ = C0H9H.LIZIZ(i2);
                        } else {
                            iLIZIZ = C0H9H.LIZIZ(0);
                        }
                        C426750GoL.LJIIL(c03ef, null, Integer.valueOf(C0H9H.LIZIZ(2)), null, Integer.valueOf(iLIZIZ), 21);
                        C03C8.LJ(c03ef, eCRichText2, "logisticsDescriptions", new AwS312S0300000_1(this, c03fc, logisticExpressionArea, 3));
                        c03ef.setDefaultClickListener(new AwS402S0200000_1(this, logisticDTO, 103));
                        linearLayoutW52.addView(c03ef);
                        i3 = i4;
                        i2 = 8;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        } else {
            LogisticDTO logisticDTO2 = c03fc.LIZ;
            C03DZ.LIZ(W5());
            C03DZ.LIZJ(X5());
            List<LogisticLinkRichText> list2 = logisticDTO2.logisticRichTextList;
            if (list2 != null && (logisticLinkRichText = (LogisticLinkRichText) C13LP.LJJJLL(list2)) != null) {
                Map<String, String> map = logisticDTO2.eventTrackInfo;
                String str3 = "next_day_delivery";
                if (map == null || (str = map.get("logistic_description_name")) == null) {
                    str = "next_day_delivery";
                }
                Map<String, String> map2 = logisticDTO2.eventTrackInfo;
                if (map2 != null && (str2 = map2.get("shipping_type")) != null) {
                    str3 = str2;
                }
                String string = "3_day_delivery";
                if (Intrinsics.LJFF(str3, "3_day_delivery")) {
                    String str4 = logisticDTO2.deliveryName;
                    if (str4 != null) {
                        string = str4;
                    }
                } else {
                    string = this.itemView.getContext().getString(2131832875);
                }
                C03EF c03efX5 = X5();
                C03EF.LJJJJJ(c03efX5, this.itemView.getContext(), logisticLinkRichText, 1, 4, new AwS118S1200000_1(this, logisticDTO2, str, 7), new AwS30S2200000_1(this, logisticDTO2, str, string, 0), 112);
                c03efX5.setDefaultClickListener(new AwS402S0200000_1(this, logisticDTO2, 102));
            }
            X5().setLineSpacing(C0H9H.LIZ(4), 1.0f);
        }
        View view2 = this.LLJILLL;
        if (view2 == null) {
            View view3 = this.itemView;
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.us_delivery_logistic_container);
            }
            this.LLJILLL = (ConstraintLayout) viewFindViewById;
            view2 = viewFindViewById;
        }
        C786410Ut5.I7(new AjS40S0200000_1(this, c03fc, 95), view2);
    }

    public USLogisticVH(ViewGroup viewGroup, Fragment fragment) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b0t, viewGroup, false));
        this.LLJILJIL = fragment;
        this.LLJJIII = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1487));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryPanelViewModel.class);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 85));
    }
}
