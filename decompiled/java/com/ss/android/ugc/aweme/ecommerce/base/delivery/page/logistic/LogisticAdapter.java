package com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic;

import X.AbstractC1746380vXw;
import X.C01GW;
import X.C03C8;
import X.C03DZ;
import X.C03EF;
import X.C03FC;
import X.C03J8;
import X.C0H1U;
import X.C0H9H;
import X.C11EA;
import X.C13LE;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419890GdH;
import X.C426750GoL;
import X.C444920HcY;
import X.C452501pT;
import X.C756302xN;
import X.C770702zh;
import X.C786410Ut5;
import X.C806903Df;
import X.C814420VxA;
import X.C960203pA;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.FeeTag;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import g1c.AjS40S0200000_1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS312S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticAdapter extends AbstractC1746380vXw<Object> {
    public final Fragment LLILZIL;
    public boolean LLILZLL;

    public final class LogisticViewHolder extends ECJediViewHolder<C03FC> {
        public LinearLayout LLJILJIL;
        public C03EF LLJILJILJ;
        public C03EF LLJILLL;
        public final C01GW LLJJ;
        public final C01GW LLJJI;

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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final void rr(Object obj) {
            boolean z;
            String priceStr;
            int i;
            String str;
            String str2;
            String str3;
            List<FeeTag> feeTags;
            int i2;
            String str4;
            int i3;
            boolean z2;
            int i4;
            int i5;
            C03FC c03fc = (C03FC) obj;
            View view = this.itemView;
            LogisticAdapter logisticAdapter = LogisticAdapter.this;
            LogisticDTO logisticDTO = c03fc.LIZ;
            if (c03fc.LIZLLL != null) {
                if (c03fc.LIZIZ == c03fc.LIZJ - 1 && this.LLILLL != logisticAdapter.getItemCount() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C03J8.LIZ(this.itemView, z2);
                View view2 = this.itemView;
                LogisticExpressionArea logisticExpressionArea = c03fc.LIZLLL;
                Iterator it2 = C1697810uHb.LJIIJJI(view2.findViewById(R.id.xuk), view2.findViewById(R.id.fll), view2.findViewById(R.id.ut6), view2.findViewById(R.id.fwn), view2.findViewById(R.id.mia), view2.findViewById(R.id.fbb), view2.findViewById(R.id.pte), view2.findViewById(R.id.eyk)).iterator();
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
                ((C03EF) viewFindViewById2).setDefaultClickListener(new AwS402S0200000_1(this, logisticDTO, 9));
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
                ((C03EF) viewFindViewById4).setDefaultClickListener(new AwS402S0200000_1(this, logisticDTO, 10));
                LinearLayout linearLayoutW5 = W5();
                if (C756302xN.LIZ(logisticExpressionArea.logisticsDescriptions)) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                C786410Ut5.LJLLLLLL(i4, linearLayoutW5);
                C786410Ut5.LJJJJJL(W5());
                List<ECRichText> list = logisticExpressionArea.logisticsDescriptions;
                if (list != null) {
                    int i6 = 0;
                    for (ECRichText eCRichText : list) {
                        int i7 = i6 + 1;
                        if (i6 >= 0) {
                            ECRichText eCRichText2 = eCRichText;
                            LinearLayout linearLayoutW52 = W5();
                            C03EF c03ef = new C03EF(view2.getContext(), null, 6);
                            if (i6 == C1697810uHb.LJIIJ(logisticExpressionArea.logisticsDescriptions)) {
                                i5 = 8;
                            } else {
                                i5 = 0;
                            }
                            C426750GoL.LJIIL(c03ef, null, Integer.valueOf(C0H9H.LIZIZ(2)), null, Integer.valueOf(C0H9H.LIZIZ(i5)), 21);
                            C03C8.LJ(c03ef, eCRichText2, "logisticsDescriptions", new AwS312S0300000_1(this, c03fc, logisticExpressionArea, 0));
                            c03ef.setDefaultClickListener(new AwS402S0200000_1(this, logisticDTO, 11));
                            linearLayoutW52.addView(c03ef);
                            i6 = i7;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            } else {
                String str5 = null;
                if (this.LLILLL != logisticAdapter.getItemCount() - 1) {
                    z = true;
                } else {
                    z = false;
                }
                C03J8.LIZ(view, z);
                View view3 = this.itemView;
                C03DZ.LIZ(W5());
                C03DZ.LIZJ(view3.findViewById(R.id.fbb));
                TextView textView3 = (TextView) view3.findViewById(R.id.fbb);
                Price price = logisticDTO.shippingFee;
                if (price == null || (priceStr = price.getPriceStr()) == null) {
                    priceStr = "";
                }
                textView3.setText(priceStr);
                TextView textView4 = (TextView) view3.findViewById(R.id.fbb);
                Context context = view3.getContext();
                if (Intrinsics.LJFF(logisticDTO.freeShipping, Boolean.TRUE)) {
                    i = R.attr.a04;
                } else {
                    i = R.attr.a1h;
                }
                textView4.setTextColor(C960203pA.LIZ(i, context));
                ((TextView) view3.findViewById(R.id.pte)).getPaint().setFlags(((TextView) view3.findViewById(R.id.pte)).getPaint().getFlags() | 16);
                b6((TextView) view3.findViewById(R.id.pte), logisticDTO.originShippingFee);
                LogisticTextDTO logisticTextDTO = logisticDTO.logisticText;
                if (logisticTextDTO != null && (((str4 = logisticTextDTO.estimatedTransitTimeText) != null || (str4 = logisticTextDTO.estimatedArrivalText) != null) && str4.length() != 0)) {
                    b6((TextView) view3.findViewById(R.id.mia), str4);
                } else {
                    TextView textView5 = (TextView) view3.findViewById(R.id.mia);
                    LogisticTextDTO logisticTextDTO2 = logisticDTO.logisticText;
                    if (logisticTextDTO2 != null) {
                        str = logisticTextDTO2.leadTimeText;
                    } else {
                        str = null;
                    }
                    b6(textView5, str);
                }
                TextView textView6 = (TextView) view3.findViewById(R.id.fwn);
                LogisticTextDTO logisticTextDTO3 = logisticDTO.logisticText;
                if (logisticTextDTO3 != null) {
                    str2 = logisticTextDTO3.discountDescText;
                } else {
                    str2 = null;
                }
                b6(textView6, str2);
                TextView textView7 = (TextView) view3.findViewById(R.id.xuk);
                LogisticTextDTO logisticTextDTO4 = logisticDTO.logisticText;
                if (logisticTextDTO4 != null) {
                    str3 = logisticTextDTO4.thresholdText;
                } else {
                    str3 = null;
                }
                b6(textView7, str3);
                b6((TextView) view3.findViewById(R.id.fll), logisticDTO.deliveryName);
                TextView textView8 = (TextView) view3.findViewById(R.id.ut6);
                LogisticTextDTO logisticTextDTO5 = logisticDTO.logisticText;
                if (logisticTextDTO5 != null) {
                    str5 = logisticTextDTO5.serviceText;
                }
                b6(textView8, str5);
                Price price2 = logisticDTO.shippingFee;
                if (price2 != null && (feeTags = price2.getFeeTags()) != null && !feeTags.isEmpty()) {
                    FeeTag feeTag = (FeeTag) ListProtector.get(logisticDTO.shippingFee.getFeeTags(), 0);
                    View viewFindViewById5 = view3.findViewById(R.id.eyk);
                    if (C770702zh.LIZIZ(feeTag.tagName)) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i2, viewFindViewById5);
                    if (feeTag.tagName != null) {
                        ((TextView) view3.findViewById(R.id.eyk)).setText(feeTag.tagName);
                    }
                } else {
                    C786410Ut5.LJLLLLLL(8, view3.findViewById(R.id.eyk));
                }
            }
            if (c03fc.LJ) {
                C0H1U.LJIIJ(0, this.itemView.findViewById(R.id.dz9));
            }
            C786410Ut5.I7(new AjS40S0200000_1(this, logisticDTO, 96), this.itemView.findViewById(R.id.dz9));
            C11EA.LJII(this, X5(), new C2217381BqS() { // from class: X.03Gp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((DeliveryPanelState) obj2).getSelectedLogistic();
                }
            }, new AwS437S0200000_1(view, logisticDTO, 4));
            withState(X5(), new AwS210S0300000_1(this, view, logisticDTO, 10));
            View viewFindViewById6 = view.findViewById(R.id.nba);
            if (logisticDTO.spendMoreForFree != null) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, viewFindViewById6);
            if (view.findViewById(R.id.nba).getVisibility() == 0) {
                C426750GoL.LJIIL(view.findViewById(R.id.dz9), null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 23);
            } else {
                C426750GoL.LJIIL(view.findViewById(R.id.dz9), null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 23);
            }
            if (logisticDTO.spendMoreForFree != null) {
                withState(X5(), new AwS367S0200000_1(this, logisticDTO, 43));
                if (C770702zh.LIZIZ(logisticDTO.spendMoreForFree.contentText)) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    SpannableString spannableString = new SpannableString(" ");
                    TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(this.itemView.getContext(), R.raw.icon_truck_moving_ltr);
                    tuxIconDrawable.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    tuxIconDrawable.LJFF(C960203pA.LIZ(R.attr.a04, this.itemView.getContext()));
                    C786410Ut5.p2(spannableString, new C419890GdH(tuxIconDrawable, 2), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    String str6 = logisticDTO.spendMoreForFree.headText;
                    if (str6 == null) {
                        str6 = " ";
                    }
                    SpannableString spannableString2 = new SpannableString(str6);
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C960203pA.LIZ(R.attr.a04, this.itemView.getContext()));
                    C786410Ut5.p2(spannableString2, new C444920HcY(62, false), 0, spannableString2.length(), 33);
                    C786410Ut5.p2(spannableString2, foregroundColorSpan, 0, spannableString2.length(), 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) spannableString2);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) logisticDTO.spendMoreForFree.contentText);
                    ((TextView) this.itemView.findViewById(R.id.zbg)).setText(spannableStringBuilder);
                }
                if (C770702zh.LIZIZ(logisticDTO.spendMoreForFree.schema)) {
                    C786410Ut5.I7(new AjS20S0300000_1(this, logisticDTO, view, 51), this.itemView.findViewById(R.id.nba));
                }
            }
        }

        public LogisticViewHolder(ViewGroup viewGroup) {
            super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aly, viewGroup, false));
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryPanelViewModel.class);
            this.LLJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 33));
            this.LLJJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 92));
        }

        public static void b6(TextView textView, String str) {
            int i = 0;
            if (str == null || str.length() == 0) {
                i = 8;
            }
            C786410Ut5.LLIL(textView, i);
            textView.setText(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void a6(LogisticViewHolder logisticViewHolder, String str, DeliveryPanelState deliveryPanelState, String str2, Integer num, int i) {
            String str3 = str2;
            Integer num2 = null;
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) == 0) {
                num2 = num;
            }
            C806903Df.LIZ((C03FC) logisticViewHolder.LLILLJJLI, logisticViewHolder.X5(), str, deliveryPanelState, str3, num2);
        }
    }

    @Override // X.AbstractC1746380vXw
    public final IComponentStrategyService LLLIL() {
        return new DefaultLogisticStrategyService();
    }

    @Override // X.C11DY, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        return this.LLILZ.LIZIZ(i);
    }

    public LogisticAdapter(ECBaseFragment eCBaseFragment, Integer num) {
        super(eCBaseFragment, null, "logistics", num, null, 242);
        this.LLILZIL = eCBaseFragment;
    }
}
