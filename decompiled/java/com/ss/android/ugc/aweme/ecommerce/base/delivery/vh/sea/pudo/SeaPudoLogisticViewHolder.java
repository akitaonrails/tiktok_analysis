package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.sea.pudo;

import X.C01GW;
import X.C03C8;
import X.C03FA;
import X.C03J8;
import X.C0H9H;
import X.C13LE;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C426750GoL;
import X.C452501pT;
import X.C756302xN;
import X.C786410Ut5;
import X.C806703Dd;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPudoLogisticViewHolder extends ECJediViewHolder<C806703Dd> {
    public LinearLayout LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public final C01GW LLJJ;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LinearLayout W5() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.n_z) : null;
            this.LLJILJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public SeaPudoLogisticViewHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.am5, viewGroup, false));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryPanelViewModel.class);
        this.LLJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 36));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        String str;
        int iLIZIZ;
        int i;
        C806703Dd c806703Dd = (C806703Dd) obj;
        int i2 = 0;
        C03J8.LIZ(this.itemView, false);
        View view = this.itemView;
        LogisticExpressionArea logisticExpressionArea = c806703Dd.LIZ;
        if (logisticExpressionArea != null) {
            View viewFindViewById = this.LLJILJILJ;
            String str2 = null;
            if (viewFindViewById == null) {
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.v56);
                } else {
                    viewFindViewById = null;
                }
                this.LLJILJILJ = (TuxTextView) viewFindViewById;
            }
            TextView textView = (TextView) viewFindViewById;
            if (textView != null) {
                C03C8.LJ(textView, logisticExpressionArea.title, "delivery_ttv_logistic_ship_name", null);
            }
            View viewFindViewById2 = this.LLJILLL;
            if (viewFindViewById2 == null) {
                View view2 = this.itemView;
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.v57);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJILLL = (TuxTextView) viewFindViewById2;
            }
            TextView textView2 = (TextView) viewFindViewById2;
            if (textView2 != null) {
                C03C8.LJ(textView2, logisticExpressionArea.logisticPrice, "delivery_ttv_logistic_ship_price", null);
            }
            LinearLayout linearLayoutW5 = W5();
            if (linearLayoutW5 != null) {
                if (C756302xN.LIZ(logisticExpressionArea.logisticsDescriptions)) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, linearLayoutW5);
            }
            LinearLayout linearLayoutW52 = W5();
            if (linearLayoutW52 != null) {
                C786410Ut5.LJJJJJL(linearLayoutW52);
            }
            List<ECRichText> list = logisticExpressionArea.logisticsDescriptions;
            if (list != null) {
                int i3 = 0;
                for (ECRichText eCRichText : list) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        ECRichText eCRichText2 = eCRichText;
                        LinearLayout linearLayoutW53 = W5();
                        if (linearLayoutW53 != null) {
                            TuxTextView tuxTextView = new TuxTextView(view.getContext(), null, 6, i2);
                            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                            if (i3 == C1697810uHb.LJIIJ(logisticExpressionArea.logisticsDescriptions)) {
                                iLIZIZ = C0H9H.LIZIZ(8);
                            } else {
                                iLIZIZ = C0H9H.LIZIZ(i2);
                            }
                            C426750GoL.LJIIL(tuxTextView, null, Integer.valueOf(C0H9H.LIZIZ(2)), null, Integer.valueOf(iLIZIZ), 21);
                            C03C8.LJ(tuxTextView, eCRichText2, "logisticsDescriptions", null);
                            linearLayoutW53.addView(tuxTextView);
                        }
                        i3 = i4;
                        i2 = 0;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            Set<String> set = C03FA.LIZ;
            LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = c806703Dd.LIZ.extraInfo;
            if (logisticsExpressionAreaExtraInfo != null) {
                str = logisticsExpressionAreaExtraInfo.daInfo;
            } else {
                str = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("logistic_service_id");
            LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo2 = c806703Dd.LIZ.extraInfo;
            if (logisticsExpressionAreaExtraInfo2 != null) {
                str2 = logisticsExpressionAreaExtraInfo2.logisticsServiceId;
            }
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_method", ((DeliveryPanelViewModel) this.LLJJ.getValue()).sR2());
            C03FA.LJII("tiktokec_option_show", str, null, linkedHashMap, strLIZIZ, true, 4);
        }
    }
}
