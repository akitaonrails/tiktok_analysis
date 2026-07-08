package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.insurance;

import X.C01GW;
import X.C03C8;
import X.C03CX;
import X.C04JL;
import X.C0HZQ;
import X.C10515049h;
import X.C12ES;
import X.C1748720vbi;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.C954703oH;
import Y.ACListenerS105S0200000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS471S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class InsuranceDisplayVH extends AbsFullSpanVH<InsuranceDisplay> {
    public final C01GW LLJJIJIL;
    public CardView LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public C0HZQ LLJJJJLIIL;
    public final C04JL LLJJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel c6() {
        return (PdpViewModel) this.LLJJIJIL.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        String str;
        InsuranceDisplay insuranceDisplay = (InsuranceDisplay) obj;
        InsuranceInfo insuranceInfo = insuranceDisplay.LL;
        boolean z = false;
        if (insuranceInfo != null) {
            View viewFindViewById = this.LLJJJIL;
            if (viewFindViewById == null) {
                View view = this.itemView;
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.kuj);
                } else {
                    viewFindViewById = null;
                }
                this.LLJJJIL = (TuxTextView) viewFindViewById;
            }
            TextView textView = (TextView) viewFindViewById;
            if (textView != null) {
                C12ES.LJIILL(0, textView);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(insuranceInfo.insuranceProtectionType);
                sbLIZ.append(' ');
                sbLIZ.append(insuranceInfo.insuranceProductNameLocale);
                sbLIZ.append(" (");
                InsuranceInfo insuranceInfo2 = insuranceDisplay.LL;
                if (insuranceInfo2 != null) {
                    str = insuranceInfo2.insurancePrice;
                } else {
                    str = null;
                }
                sbLIZ.append(str);
                sbLIZ.append(')');
                textView.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        ECRichText eCRichText = insuranceDisplay.popupText;
        if (eCRichText != null) {
            View viewFindViewById2 = this.LLJJJJ;
            if (viewFindViewById2 == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById2 = viewLJJIJL.findViewById(R.id.kug);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJJJJ = (TuxTextView) viewFindViewById2;
            }
            TextView textView2 = (TextView) viewFindViewById2;
            if (textView2 != null) {
                C12ES.LJIILL(0, textView2);
                C03C8.LIZJ(textView2, eCRichText, "pdp_insurance_more_plan", new AwS471S0200000_1(insuranceDisplay, this, 16));
            }
            View viewFindViewById3 = this.LLJJJJ;
            if (viewFindViewById3 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById3 = viewLJJIJL2.findViewById(R.id.kug);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJJJJ = (TuxTextView) viewFindViewById3;
            }
            TuxTextView tuxTextView = (TuxTextView) viewFindViewById3;
            if (tuxTextView != null) {
                C786410Ut5.h9(tuxTextView, new ACListenerS105S0200000_1(insuranceDisplay, this, 11));
            }
        }
        ECRichText eCRichText2 = insuranceDisplay.providerInfo;
        if (eCRichText2 != null) {
            View viewFindViewById4 = this.LLJJJJJIL;
            if (viewFindViewById4 == null) {
                View view2 = this.itemView;
                if (view2 != null) {
                    viewFindViewById4 = view2.findViewById(R.id.kui);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJJJJJIL = (TuxTextView) viewFindViewById4;
            }
            TextView textView3 = (TextView) viewFindViewById4;
            if (textView3 != null) {
                C12ES.LJIILL(0, textView3);
                C03C8.LIZJ(textView3, eCRichText2, "pdp_insurance_provider", null);
            }
        }
        View viewFindViewById5 = this.LLJJJJLIIL;
        if (viewFindViewById5 == null) {
            View view3 = this.itemView;
            if (view3 != null) {
                viewFindViewById5 = view3.findViewById(R.id.kuh);
            } else {
                viewFindViewById5 = null;
            }
            this.LLJJJJLIIL = (C0HZQ) viewFindViewById5;
        }
        C0HZQ c0hzq = (C0HZQ) viewFindViewById5;
        if (c0hzq != null) {
            String skuId = c6().getSkuId();
            if (skuId != null) {
                C786410Ut5.D7(c0hzq, null);
                InsuranceInfo insuranceInfoLIZ = c6().LLLLZ.LIZ(skuId);
                if (insuranceInfoLIZ != null) {
                    Integer num = insuranceInfoLIZ.insuranceSelected;
                    int value = C03CX.USER_SELECTED.getValue();
                    if (num != null && num.intValue() == value) {
                        z = true;
                    }
                }
                c0hzq.setChecked(z);
                C786410Ut5.D7(c0hzq, this.LLJJL);
            } else {
                return;
            }
        }
        C1748720vbi.LJFF(this.itemView, new C10515049h(), AFwS185S0000000_1.get$arr$(321), AFwS228S0000000_1.get$arr$(584));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InsuranceDisplayVH(ViewGroup viewGroup, View view) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.b36, viewGroup, false);
        }
        super(view);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1581));
        this.LLJJL = new C04JL(this, 0);
    }
}
