package com.ss.android.ugc.aweme.ecommerce.us.logistic.module.shippingmethod;

import X.AnonymousClass0486;
import X.C01GW;
import X.C03B0;
import X.C03F6;
import X.C03F8;
import X.C0H1U;
import X.C0H9H;
import X.C123100dR;
import X.C12ES;
import X.C13LE;
import X.C13LP;
import X.C1697810uHb;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS312S0300000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS5S1001000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class USShippingMethodsVH extends ECJediViewHolder<C03F6> {
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public USShippingMethodsVH(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b1k, viewGroup, false));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryPanelViewModel.class);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 93));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1491));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.03F4, android.view.View] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.03F5, android.view.View] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        boolean z;
        int iLIZIZ;
        TuxTextView deliveryTtvLogisticShipPriceFromXml;
        String str;
        String str2;
        String str3;
        String priceStr;
        TuxTextView shipPriceFromXml;
        TuxTextView shipNameFromXml;
        C03F6 c03f6 = (C03F6) obj;
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.v5n);
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        List<LogisticDTO> list = c03f6.LIZ;
        final int i = 0;
        boolean z2 = true;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View viewFindViewById = this.itemView.findViewById(R.id.paj);
            if (viewFindViewById != null) {
                C12ES.LJIILL(0, viewFindViewById);
            }
            View viewFindViewById2 = this.itemView.findViewById(R.id.v5n);
            if (viewFindViewById2 != null) {
                C0H1U.LIZIZ(viewFindViewById2);
                return;
            }
            return;
        }
        View viewFindViewById3 = this.itemView.findViewById(R.id.paj);
        if (viewFindViewById3 != null) {
            C0H1U.LIZIZ(viewFindViewById3);
        }
        View viewFindViewById4 = this.itemView.findViewById(R.id.v5n);
        if (viewFindViewById4 != null) {
            C12ES.LJIILL(0, viewFindViewById4);
        }
        List<LogisticExpressionArea> list2 = c03f6.LIZJ;
        final AttributeSet attributeSet = null;
        if (list2 == null) {
            int i2 = 0;
            for (LogisticDTO logisticDTO : c03f6.LIZ) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    LogisticDTO logisticDTO2 = logisticDTO;
                    ((C03F8) this.LLJILJILJ.getValue()).LIZIZ(logisticDTO2, i2);
                    final Context context = this.itemView.getContext();
                    ?? r7 = new ConstraintLayout(context, attributeSet, i) { // from class: X.03F5
                        public TuxTextView LL;
                        public TuxTextView LLILLJJLI;
                        public TuxTextView LLILLL;
                        public TuxTextView LLILZ;

                        public final TuxTextView getShipNameFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LL;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.v5a);
                                this.LL = (TuxTextView) callbackFindViewById;
                            }
                            return (TuxTextView) callbackFindViewById;
                        }

                        public final TuxTextView getShipPriceFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.v5b);
                                this.LLILLJJLI = (TuxTextView) callbackFindViewById;
                            }
                            return (TuxTextView) callbackFindViewById;
                        }

                        public final TuxTextView getShipTimeFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LLILLL;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.v5c);
                                this.LLILLL = (TuxTextView) callbackFindViewById;
                            }
                            return (TuxTextView) callbackFindViewById;
                        }

                        public final TuxTextView getShippingThresholdFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LLILZ;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.v5x);
                                this.LLILZ = (TuxTextView) callbackFindViewById;
                            }
                            return (TuxTextView) callbackFindViewById;
                        }

                        public final void setShipNameFromXml(TuxTextView tuxTextView) {
                            this.LL = tuxTextView;
                        }

                        public final void setShipPriceFromXml(TuxTextView tuxTextView) {
                            this.LLILLJJLI = tuxTextView;
                        }

                        public final void setShipTimeFromXml(TuxTextView tuxTextView) {
                            this.LLILLL = tuxTextView;
                        }

                        public final void setShippingThresholdFromXml(TuxTextView tuxTextView) {
                            this.LLILZ = tuxTextView;
                        }

                        {
                            super(context, attributeSet, i);
                            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b1j, this, true);
                        }
                    };
                    String str4 = logisticDTO2.deliveryName;
                    if (str4 != null && (shipNameFromXml = r7.getShipNameFromXml()) != null) {
                        shipNameFromXml.setText(str4);
                    }
                    Price price = logisticDTO2.shippingFee;
                    if (price != null && (priceStr = price.getPriceStr()) != null && (shipPriceFromXml = r7.getShipPriceFromXml()) != null) {
                        shipPriceFromXml.setText(priceStr);
                    }
                    LogisticTextDTO logisticTextDTO = logisticDTO2.logisticText;
                    if (logisticTextDTO != null) {
                        str2 = logisticTextDTO.estimatedTransitTimeText;
                        if (str2 == null) {
                            str2 = logisticTextDTO.estimatedArrivalText;
                        }
                    } else {
                        str2 = null;
                    }
                    TuxTextView shipTimeFromXml = r7.getShipTimeFromXml();
                    if (shipTimeFromXml != null && str2 != null) {
                        shipTimeFromXml.setText(str2);
                        LogisticTextDTO logisticTextDTO2 = logisticDTO2.logisticText;
                        if (logisticTextDTO2 != null) {
                            str3 = logisticTextDTO2.estimatedTransitTimeText;
                        } else {
                            str3 = null;
                        }
                        if (C123100dR.LIZ(str3)) {
                            shipTimeFromXml.setTextColorRes(R.attr.a1h);
                            r7.getShipNameFromXml().setTuxFont(52);
                        }
                    }
                    LogisticLinkRichText logisticLinkRichText = logisticDTO2.shippingThresholdText;
                    if (logisticLinkRichText != null) {
                        TuxTextView shippingThresholdFromXml = r7.getShippingThresholdFromXml();
                        if (shippingThresholdFromXml != null) {
                            C12ES.LJIILL(0, shippingThresholdFromXml);
                        }
                        TuxTextView shippingThresholdFromXml2 = r7.getShippingThresholdFromXml();
                        if (shippingThresholdFromXml2 != null) {
                            RichTextUtil richTextUtil = RichTextUtil.LIZ;
                            View view = this.itemView;
                            AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(386);
                            richTextUtil.getClass();
                            shippingThresholdFromXml2.setText(RichTextUtil.LIZ(logisticLinkRichText, view, aFwS228S0000000_1));
                        }
                    }
                    C12ES.LJIILL(0, r7);
                    ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.v5n);
                    if (viewGroup != 0) {
                        viewGroup.addView(r7);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return;
        }
        int i4 = 0;
        for (LogisticExpressionArea logisticExpressionArea : list2) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                LogisticExpressionArea logisticExpressionArea2 = logisticExpressionArea;
                LogisticDTO logisticDTO3 = (LogisticDTO) C13LP.LJJJLZIJ(i4, c03f6.LIZ);
                final Context context2 = this.itemView.getContext();
                ?? r3 = new ConstraintLayout(context2, attributeSet, i) { // from class: X.03F4
                    public TuxTextView LL;
                    public TuxTextView LLILLJJLI;
                    public LinearLayout LLILLL;

                    public final LinearLayout getDeliveryLlLogisticsDescriptionListFromXml() {
                        KeyEvent.Callback callbackFindViewById = this.LLILLL;
                        if (callbackFindViewById == null) {
                            callbackFindViewById = findViewById(R.id.flk);
                            this.LLILLL = (LinearLayout) callbackFindViewById;
                        }
                        return (LinearLayout) callbackFindViewById;
                    }

                    public final TuxTextView getDeliveryTtvLogisticShipNameFromXml() {
                        KeyEvent.Callback callbackFindViewById = this.LL;
                        if (callbackFindViewById == null) {
                            callbackFindViewById = findViewById(R.id.flm);
                            this.LL = (TuxTextView) callbackFindViewById;
                        }
                        return (TuxTextView) callbackFindViewById;
                    }

                    public final TuxTextView getDeliveryTtvLogisticShipPriceFromXml() {
                        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                        if (callbackFindViewById == null) {
                            callbackFindViewById = findViewById(R.id.fln);
                            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
                        }
                        return (TuxTextView) callbackFindViewById;
                    }

                    public final void setDeliveryLlLogisticsDescriptionListFromXml(LinearLayout linearLayout2) {
                        this.LLILLL = linearLayout2;
                    }

                    public final void setDeliveryTtvLogisticShipNameFromXml(TuxTextView tuxTextView) {
                        this.LL = tuxTextView;
                    }

                    public final void setDeliveryTtvLogisticShipPriceFromXml(TuxTextView tuxTextView) {
                        this.LLILLJJLI = tuxTextView;
                    }

                    {
                        super(context2, attributeSet, i);
                        C786410Ut5.Td(C786410Ut5.ne(context2), R.layout.anr, this, true);
                    }
                };
                AwS312S0300000_1 awS312S0300000_1 = new AwS312S0300000_1(this, logisticExpressionArea2, logisticDTO3, 1);
                ECRichText eCRichText = logisticExpressionArea2.title;
                if (eCRichText != null) {
                    LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = logisticExpressionArea2.extraInfo;
                    if (logisticsExpressionAreaExtraInfo != null && (str = logisticsExpressionAreaExtraInfo.daInfo) != null) {
                        C03F8 c03f8 = (C03F8) this.LLJILJILJ.getValue();
                        if (!c03f8.LIZLLL.contains(Integer.valueOf(i4))) {
                            c03f8.LIZLLL.add(Integer.valueOf(i4));
                            View view2 = c03f8.LIZIZ;
                            if (view2 != null) {
                                C1748720vbi.LIZLLL(view2, new AnonymousClass0486(), new AwS5S1001000_1(i4, str, 1));
                            }
                        }
                    } else {
                        LogisticDTO logisticDTO4 = (LogisticDTO) C13LP.LJJJLZIJ(i4, c03f6.LIZ);
                        if (logisticDTO4 != null) {
                            ((C03F8) this.LLJILJILJ.getValue()).LIZIZ(logisticDTO4, i4);
                        }
                    }
                    TuxTextView deliveryTtvLogisticShipNameFromXml = r3.getDeliveryTtvLogisticShipNameFromXml();
                    if (deliveryTtvLogisticShipNameFromXml != null) {
                        C03B0 c03b0 = new C03B0(r3.getDeliveryTtvLogisticShipNameFromXml(), "delivery_ttv_logistic_ship_name");
                        C03B0.LIZ(c03b0, eCRichText, awS312S0300000_1, null, false, null, null, 124);
                        C0H1U.LJIIL(deliveryTtvLogisticShipNameFromXml, c03b0.LIZJ, z2);
                    }
                }
                ECRichText eCRichText2 = logisticExpressionArea2.logisticPrice;
                if (eCRichText2 != null && (deliveryTtvLogisticShipPriceFromXml = r3.getDeliveryTtvLogisticShipPriceFromXml()) != null) {
                    C03B0 c03b02 = new C03B0(r3.getDeliveryTtvLogisticShipPriceFromXml(), "delivery_ttv_logistic_ship_price");
                    C03B0.LIZ(c03b02, eCRichText2, awS312S0300000_1, null, false, null, null, 124);
                    C0H1U.LJIIL(deliveryTtvLogisticShipPriceFromXml, c03b02.LIZJ, z2);
                }
                if (logisticExpressionArea2.logisticsDescriptions != null) {
                    C12ES.LJIILL(0, r3.getDeliveryLlLogisticsDescriptionListFromXml());
                }
                List<ECRichText> list3 = logisticExpressionArea2.logisticsDescriptions;
                if (list3 != null) {
                    int i6 = 0;
                    for (ECRichText eCRichText3 : list3) {
                        int i7 = i6 + 1;
                        if (i6 >= 0) {
                            ECRichText eCRichText4 = eCRichText3;
                            LinearLayout deliveryLlLogisticsDescriptionListFromXml = r3.getDeliveryLlLogisticsDescriptionListFromXml();
                            if (deliveryLlLogisticsDescriptionListFromXml != null) {
                                TuxTextView tuxTextView = new TuxTextView(this.itemView.getContext(), null, 6, 0);
                                if (i6 == logisticExpressionArea2.logisticsDescriptions.size() - 1) {
                                    iLIZIZ = C0H9H.LIZIZ(8);
                                } else {
                                    iLIZIZ = C0H9H.LIZIZ(0);
                                }
                                C426750GoL.LJIIL(tuxTextView, null, Integer.valueOf(C0H9H.LIZIZ(6)), null, Integer.valueOf(iLIZIZ), 21);
                                C03B0 c03b03 = new C03B0(tuxTextView, "logisticsDescriptions");
                                C03B0.LIZ(c03b03, eCRichText4, awS312S0300000_1, null, false, null, null, 124);
                                tuxTextView.setText(c03b03.LIZJ);
                                deliveryLlLogisticsDescriptionListFromXml.addView(tuxTextView);
                            }
                            i6 = i7;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                C12ES.LJIILL(0, r3);
                ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.v5n);
                if (viewGroup2 != 0) {
                    viewGroup2.addView(r3);
                }
                i4 = i5;
                z2 = true;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
