package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh;

import X.C01GW;
import X.C03F6;
import X.C03FA;
import X.C03FG;
import X.C12ES;
import X.C1388190mED;
import X.C13LE;
import X.C1697810uHb;
import X.C19719612Di;
import X.C19719912Dl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS69S0300000_1;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import i0b.b;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public class ExtraLogisticsInfoViewHolder extends ECJediViewHolder<C03F6> implements c {
    public ViewGroup LLJILJIL;
    public final LinkedList<C03FG> LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public TuxSheet LLJJI;

    @Override // p8b.c
    public final String getViewName() {
        return "ExtraLogisticsInfoViewHolder";
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public ExtraLogisticsInfoViewHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.alu, viewGroup, false));
        this.LLJILJILJ = new LinkedList<>();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryPanelViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 0));
        this.LLJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        boolean z;
        boolean z2;
        String str;
        String priceStr;
        Resources resources;
        DisplayMetrics displayMetrics;
        Integer numValueOf;
        C03F6 c03f6 = (C03F6) obj;
        this.LLJILJIL = (ViewGroup) this.itemView.findViewById(R.id.flj);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(((b) this.LLJJ.getValue()).LLILIL());
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.ng);
        ViewGroup viewGroup = this.LLJILJIL;
        if (viewGroup != null) {
            viewGroup.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
        ViewGroup viewGroup2 = this.LLJILJIL;
        if (viewGroup2 != null) {
            LinkedList<C03FG> linkedList = this.LLJILJILJ;
            while (viewGroup2.getChildCount() > 0) {
                C786410Ut5.LJJLIL(0, viewGroup2);
                Object obj2 = Unit.LIZ;
                if (obj2 instanceof C03FG) {
                    linkedList.add((C03FG) obj2);
                }
            }
        }
        int i = 0;
        for (LogisticDTO logisticDTO : c03f6.LIZ) {
            int i2 = i + 1;
            if (i >= 0) {
                LogisticDTO logisticDTO2 = logisticDTO;
                C03FG c03fg = (C03FG) C19719612Di.LJJIIZI(this.LLJILJILJ);
                C03FG c03fg2 = c03fg;
                if (c03fg == null) {
                    final Context context = this.itemView.getContext();
                    c03fg2 = new LinearLayout(context) { // from class: X.03FG
                        public TuxTextView LL;
                        public TuxTextView LLILLJJLI;
                        public TuxTextView LLILLL;
                        public TuxTextView LLILZ;
                        public TuxTextView LLILZIL;
                        public TuxTextView LLILZLL;
                        public TuxIconView LLIZ;
                        public LinearLayout LLIZLLLIL;

                        public final TuxIconView getBottomDividerFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LLIZ;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.ccv);
                                this.LLIZ = (TuxIconView) callbackFindViewById;
                            }
                            return (TuxIconView) callbackFindViewById;
                        }

                        public final LinearLayout getExtraLogisticMiddleLayoutFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.hir);
                                this.LLIZLLLIL = (LinearLayout) callbackFindViewById;
                            }
                            return (LinearLayout) callbackFindViewById;
                        }

                        public final TuxTextView getShippingArriveInfoFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LLILZIL;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.v5i);
                                this.LLILZIL = (TuxTextView) callbackFindViewById;
                            }
                            return (TuxTextView) callbackFindViewById;
                        }

                        public final TuxTextView getShippingCostsFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LLILZ;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.v5j);
                                this.LLILZ = (TuxTextView) callbackFindViewById;
                            }
                            return (TuxTextView) callbackFindViewById;
                        }

                        public final TuxTextView getShippingCostsThresholdFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.v5k);
                                this.LLILLJJLI = (TuxTextView) callbackFindViewById;
                            }
                            return (TuxTextView) callbackFindViewById;
                        }

                        public final TuxTextView getShippingCutOffTimeFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LLILZLL;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.v5l);
                                this.LLILZLL = (TuxTextView) callbackFindViewById;
                            }
                            return (TuxTextView) callbackFindViewById;
                        }

                        public final TuxTextView getShippingMethodFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LL;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.v5m);
                                this.LL = (TuxTextView) callbackFindViewById;
                            }
                            return (TuxTextView) callbackFindViewById;
                        }

                        public final TuxTextView getShippingTimeFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LLILLL;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.v5y);
                                this.LLILLL = (TuxTextView) callbackFindViewById;
                            }
                            return (TuxTextView) callbackFindViewById;
                        }

                        {
                            super(context, null, 0);
                            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.alt, this, true);
                        }

                        public final void setBottomDividerFromXml(TuxIconView tuxIconView) {
                            this.LLIZ = tuxIconView;
                        }

                        public final void setExtraLogisticMiddleLayoutFromXml(LinearLayout linearLayout) {
                            this.LLIZLLLIL = linearLayout;
                        }

                        public final void setShippingArriveInfoFromXml(TuxTextView tuxTextView) {
                            this.LLILZIL = tuxTextView;
                        }

                        public final void setShippingCostsFromXml(TuxTextView tuxTextView) {
                            this.LLILZ = tuxTextView;
                        }

                        public final void setShippingCostsThresholdFromXml(TuxTextView tuxTextView) {
                            this.LLILLJJLI = tuxTextView;
                        }

                        public final void setShippingCutOffTimeFromXml(TuxTextView tuxTextView) {
                            this.LLILZLL = tuxTextView;
                        }

                        public final void setShippingMethodFromXml(TuxTextView tuxTextView) {
                            this.LL = tuxTextView;
                        }

                        public final void setShippingTimeFromXml(TuxTextView tuxTextView) {
                            this.LLILLL = tuxTextView;
                        }

                        public final void setThirdPartyLogistics(boolean z3) {
                            int i3;
                            LinearLayout extraLogisticMiddleLayoutFromXml = getExtraLogisticMiddleLayoutFromXml();
                            if (!z3) {
                                i3 = 0;
                            } else {
                                i3 = 8;
                            }
                            C786410Ut5.LJLLLLLL(i3, extraLogisticMiddleLayoutFromXml);
                        }
                    };
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c03fg2);
                c03fg2.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = c03fg2.getShippingMethodFromXml().getLayoutParams();
                Activity activityLIZ = C1388190mED.LIZ(c03fg2.getContext());
                if (activityLIZ != null && (resources = activityLIZ.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null && (numValueOf = Integer.valueOf(displayMetrics.widthPixels)) != null) {
                    layoutParams2.width = numValueOf.intValue() / 5;
                }
                C786410Ut5.R6(c03fg2.getShippingMethodFromXml(), layoutParams2);
                LogisticLinkRichText logisticLinkRichText = logisticDTO2.shippingThresholdText;
                if (logisticLinkRichText != null) {
                    TuxTextView shippingCostsThresholdFromXml = c03fg2.getShippingCostsThresholdFromXml();
                    RichTextUtil richTextUtil = RichTextUtil.LIZ;
                    View view = this.itemView;
                    AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(1);
                    richTextUtil.getClass();
                    shippingCostsThresholdFromXml.setText(RichTextUtil.LIZ(logisticLinkRichText, view, aFwS228S0000000_1));
                }
                String str2 = logisticDTO2.leadTime;
                if (str2 != null) {
                    c03fg2.getShippingTimeFromXml().setText(str2);
                }
                Price price = logisticDTO2.shippingFee;
                if (price != null && (priceStr = price.getPriceStr()) != null) {
                    c03fg2.getShippingCostsFromXml().setText(priceStr);
                }
                a.LIZIZ(R.attr.f491bc, this.itemView.getContext());
                if (Intrinsics.LJFF(logisticDTO2.freeShipping, Boolean.TRUE)) {
                    c03fg2.getShippingCostsFromXml().setTextColor(a.LIZIZ(R.attr.uv, this.itemView.getContext()));
                } else {
                    c03fg2.getShippingCostsFromXml().setTextColor(a.LIZIZ(R.attr.a1h, this.itemView.getContext()));
                }
                String str3 = logisticDTO2.deliveryName;
                if (str3 != null) {
                    c03fg2.getShippingMethodFromXml().setText(str3);
                }
                View viewFindViewById = c03fg2.findViewById(R.id.mj1);
                int i3 = 8;
                if (logisticDTO2.logisticsDescription != null) {
                    C786410Ut5.LLLLZLL(c03fg2.getShippingArriveInfoFromXml(), 8);
                    LogisticLinkRichText logisticLinkRichText2 = logisticDTO2.orderCutOffNotice;
                    if (logisticLinkRichText2 != null) {
                        C12ES.LJIILL(0, c03fg2.getShippingCutOffTimeFromXml());
                        TuxTextView shippingCutOffTimeFromXml = c03fg2.getShippingCutOffTimeFromXml();
                        RichTextUtil richTextUtil2 = RichTextUtil.LIZ;
                        View view2 = this.itemView;
                        AFwS228S0000000_1 aFwS228S0000000_12 = AFwS228S0000000_1.get$arr$(2);
                        richTextUtil2.getClass();
                        shippingCutOffTimeFromXml.setText(RichTextUtil.LIZ(logisticLinkRichText2, view2, aFwS228S0000000_12));
                    }
                    c03fg2.findViewById(R.id.v5p).setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                    C786410Ut5.I7(new ACListenerS69S0300000_1(logisticDTO2, this, c03fg2, 0), viewFindViewById);
                    Set<String> set = C03FA.LIZ;
                    Map<String, String> map = logisticDTO2.eventTrackInfo;
                    if (map != null) {
                        str = map.get("is_next_day_delivery");
                    } else {
                        str = null;
                    }
                    C03FA.LJFF("next_day_delivery_info", null, str, 2);
                    if (logisticDTO2.orderCutOffNotice == null) {
                        C786410Ut5.LLLLZLL(c03fg2.getShippingArriveInfoFromXml(), 0);
                        String str4 = logisticDTO2.arrivalInfo;
                        if (str4 != null) {
                            c03fg2.getShippingArriveInfoFromXml().setText(str4);
                        }
                    } else {
                        C786410Ut5.LLLLZLL(c03fg2.getShippingArriveInfoFromXml(), 8);
                    }
                } else {
                    C786410Ut5.LLLLZLL(c03fg2.getShippingArriveInfoFromXml(), 0);
                    String str5 = logisticDTO2.arrivalInfo;
                    if (str5 != null) {
                        c03fg2.getShippingArriveInfoFromXml().setText(str5);
                    }
                    C786410Ut5.LJLLLLLL(8, viewFindViewById);
                }
                if (i != c03f6.LIZ.size() - 1) {
                    z = true;
                } else {
                    z = false;
                }
                TuxIconView bottomDividerFromXml = c03fg2.getBottomDividerFromXml();
                if (z) {
                    i3 = 0;
                }
                C786410Ut5.LJLLLLLL(i3, bottomDividerFromXml);
                c03fg2.getShippingMethodFromXml().setTextColorRes(a.LIZIZ(R.attr.a1k, this.itemView.getContext()));
                if (logisticDTO2.leadTime == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c03fg2.setThirdPartyLogistics(z2);
                ViewGroup viewGroup3 = this.LLJILJIL;
                if (viewGroup3 != null) {
                    viewGroup3.addView(c03fg2);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
