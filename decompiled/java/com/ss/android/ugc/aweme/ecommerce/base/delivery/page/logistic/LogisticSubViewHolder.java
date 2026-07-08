package com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic;

import X.C01GW;
import X.C03C8;
import X.C03DZ;
import X.C03EF;
import X.C03FB;
import X.C03FC;
import X.C03J8;
import X.C0H1U;
import X.C0H9H;
import X.C11EA;
import X.C13LE;
import X.C1697810uHb;
import X.C1841350y17;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419890GdH;
import X.C426750GoL;
import X.C444920HcY;
import X.C452501pT;
import X.C756302xN;
import X.C770702zh;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC420801kM;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import g1c.AjS7S0400000_1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS100S0400000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS312S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticSubViewHolder extends ECJediViewHolder<C03FC> {
    public LinearLayout LLJILJIL;
    public C03EF LLJILJILJ;
    public C03EF LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public InterfaceC420801kM LLJJIII;

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

    public final DeliveryPanelViewModel X5() {
        return (DeliveryPanelViewModel) this.LLJJ.getValue();
    }

    public LogisticSubViewHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.am2, viewGroup, false));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryPanelViewModel.class);
        this.LLJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 34));
        this.LLJJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 96));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        int iLIZIZ;
        int iLIZIZ2;
        int i;
        int iLIZIZ3;
        C03FC c03fc = (C03FC) obj;
        View view = this.itemView;
        LogisticDTO logisticDTO = c03fc.LIZ;
        LogisticExpressionArea logisticExpressionArea = c03fc.LIZLLL;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        int i2 = 8;
        if (logisticExpressionArea != null) {
            Iterator it2 = C1697810uHb.LJIIJJI(view.findViewById(R.id.xuk), view.findViewById(R.id.fll), view.findViewById(R.id.ut6), view.findViewById(R.id.fwn), view.findViewById(R.id.mia), view.findViewById(R.id.fbb), view.findViewById(R.id.pte), view.findViewById(R.id.eyk)).iterator();
            while (it2.hasNext()) {
                C03DZ.LIZ((View) it2.next());
            }
            View viewFindViewById = this.LLJILJILJ;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.v56);
                } else {
                    viewFindViewById = null;
                }
                this.LLJILJILJ = (C03EF) viewFindViewById;
            }
            TextView textView = (TextView) viewFindViewById;
            if (textView != null) {
                C03C8.LJ(textView, logisticExpressionArea.title, "delivery_ttv_logistic_ship_name", null);
            }
            View viewFindViewById2 = this.LLJILJILJ;
            if (viewFindViewById2 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById2 = viewLJJIJL2.findViewById(R.id.v56);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJILJILJ = (C03EF) viewFindViewById2;
            }
            ((C03EF) viewFindViewById2).setDefaultClickListener(new AwS402S0200000_1(this, logisticDTO, 104));
            View viewFindViewById3 = this.LLJILLL;
            if (viewFindViewById3 == null) {
                View viewLJJIJL3 = LJJIJL();
                if (viewLJJIJL3 != null) {
                    viewFindViewById3 = viewLJJIJL3.findViewById(R.id.v57);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJILLL = (C03EF) viewFindViewById3;
            }
            TextView textView2 = (TextView) viewFindViewById3;
            if (textView2 != null) {
                C03C8.LJ(textView2, logisticExpressionArea.logisticPrice, "delivery_ttv_logistic_ship_price", null);
            }
            View viewFindViewById4 = this.LLJILLL;
            if (viewFindViewById4 == null) {
                View viewLJJIJL4 = LJJIJL();
                if (viewLJJIJL4 != null) {
                    viewFindViewById4 = viewLJJIJL4.findViewById(R.id.v57);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJILLL = (C03EF) viewFindViewById4;
            }
            ((C03EF) viewFindViewById4).setDefaultClickListener(new AwS402S0200000_1(this, logisticDTO, 105));
            LinearLayout linearLayoutW5 = W5();
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
                            iLIZIZ3 = C0H9H.LIZIZ(8);
                        } else {
                            iLIZIZ3 = C0H9H.LIZIZ(0);
                        }
                        C426750GoL.LJIIL(c03ef, null, Integer.valueOf(C0H9H.LIZIZ(2)), null, Integer.valueOf(iLIZIZ3), 21);
                        C03C8.LJ(c03ef, eCRichText2, "logisticsDescriptions", new AwS312S0300000_1(this, c03fc, logisticExpressionArea, 5));
                        c03ef.setDefaultClickListener(new AwS402S0200000_1(this, logisticDTO, 106));
                        linearLayoutW52.addView(c03ef);
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) this.itemView.findViewById(R.id.dz9);
        if (constraintLayout != null) {
            Resources resources = this.itemView.getContext().getResources();
            C03FB c03fb = c03fc.LJI;
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            }
            if (c03fb != null) {
                float dimension = resources.getDimension(R.dimen.b1);
                C384050F3z c384050F3z = new C384050F3z();
                if (c03fb.LIZ) {
                    c384050F3z.LJIIIIZZ = Float.valueOf(dimension);
                    c384050F3z.LJIIIZ = Float.valueOf(dimension);
                }
                if (c03fb.LIZIZ) {
                    c384050F3z.LJIIJ = Float.valueOf(dimension);
                    c384050F3z.LJIIJJI = Float.valueOf(dimension);
                }
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
                constraintLayout.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMarginStart(iLIZIZ4);
                    marginLayoutParams.setMarginEnd(iLIZIZ4);
                    C786410Ut5.m6(constraintLayout, marginLayoutParams);
                }
                if (c03fb.LIZ) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
                if (c03fb.LIZIZ) {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                } else {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                }
                C426750GoL.LJIIL(constraintLayout, null, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ2), 21);
                C03J8.LIZ(this.itemView, c03fb.LIZLLL);
            }
        }
        if (c03fc.LJ) {
            C0H1U.LJIIJ(0, this.itemView.findViewById(R.id.dz9));
        }
        C786410Ut5.I7(new AjS40S0200000_1(this, logisticDTO, 97), this.itemView.findViewById(R.id.dz9));
        C1841350y17 c1841350y17 = (C1841350y17) view.findViewById(R.id.sp_);
        withState(X5(), new AwS367S0200000_1(c1841350y17, logisticDTO, 359));
        InterfaceC420801kM interfaceC420801kM = this.LLJJIII;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLJJIII = C11EA.LJII(this, X5(), new C2217381BqS() { // from class: X.03Gq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((DeliveryPanelState) obj2).getSelectedLogistic();
            }
        }, new AwS437S0200000_1(c1841350y17, logisticDTO, 37));
        withState(X5(), new AwS100S0400000_1(this, view, logisticDTO, c03fc, 34));
        View viewFindViewById5 = view.findViewById(R.id.nba);
        if (logisticDTO.spendMoreForFree != null) {
            i2 = 0;
        }
        C786410Ut5.LJLLLLLL(i2, viewFindViewById5);
        if (logisticDTO.spendMoreForFree != null) {
            withState(X5(), new AwS210S0300000_1(this, logisticDTO, c03fc, 118));
            if (C770702zh.LIZIZ(logisticDTO.spendMoreForFree.contentText)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString(" ");
                TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(this.itemView.getContext(), R.raw.icon_truck_moving_ltr);
                tuxIconDrawable.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                tuxIconDrawable.LJFF(C960203pA.LIZ(R.attr.a04, this.itemView.getContext()));
                C786410Ut5.p2(spannableString, new C419890GdH(tuxIconDrawable, 2), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                String str = logisticDTO.spendMoreForFree.headText;
                if (str == null) {
                    str = " ";
                }
                SpannableString spannableString2 = new SpannableString(str);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C960203pA.LIZ(R.attr.a04, this.itemView.getContext()));
                C786410Ut5.p2(spannableString2, new C444920HcY(62, false), 0, spannableString2.length(), 33);
                C786410Ut5.p2(spannableString2, foregroundColorSpan, 0, spannableString2.length(), 33);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) spannableString2);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) logisticDTO.spendMoreForFree.contentText);
                ((TextView) this.itemView.findViewById(R.id.zbg)).setText(spannableStringBuilder);
            }
            if (C770702zh.LIZIZ(logisticDTO.spendMoreForFree.schema)) {
                C786410Ut5.I7(new AjS7S0400000_1(this, logisticDTO, c03fc, view, 17), this.itemView.findViewById(R.id.nba));
            }
        }
    }
}
