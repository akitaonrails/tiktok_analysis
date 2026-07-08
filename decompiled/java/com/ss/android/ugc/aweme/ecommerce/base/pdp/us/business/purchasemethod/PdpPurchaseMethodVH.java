package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.purchasemethod;

import X.AbstractC10282040i;
import X.AnonymousClass0449;
import X.C01GW;
import X.C03C8;
import X.C042Y;
import X.C049X;
import X.C049Y;
import X.C04FA;
import X.C04FD;
import X.C0H1U;
import X.C1024103zT;
import X.C1024203zU;
import X.C10279040f;
import X.C1054004Ag;
import X.C12ES;
import X.C1697810uHb;
import X.C16GA;
import X.C1748720vbi;
import X.C1841350y17;
import X.C1954807lC;
import X.C19719612Di;
import X.C2097608Jq;
import X.C452501pT;
import X.C786410Ut5;
import X.C954703oH;
import X.EnumC10415045l;
import X.EnumC1841290y11;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS39S0201000_1;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RangePrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SubscribePeriodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.price.PriceType;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.ScrollTopLinearLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS30S2100000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS86S1000000_1;
import kotlin.jvm.internal.Intrinsics;
import r4b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpPurchaseMethodVH extends AbsFullSpanVH<C1024203zU> implements C04FD {
    public final ECBaseFragment LLJJIJIL;
    public TuxTextView LLJJJ;
    public LinearLayout LLJJJIL;
    public LinearLayout LLJJJJ;
    public final LinkedList<ConstraintLayout> LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    @Override // X.C04FD
    public final void LJLJLLL(SizeGuide sizeGuide) {
    }

    @Override // X.C04FD
    public final void LLLLZLL(View view) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LinearLayout d6() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.nid) : null;
            this.LLJJJJ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        View childAt;
        C04FA c04fa;
        PurchaseMethodItem next;
        SubscribePeriodInfo subscribePeriodInfo;
        List<SnsPeriodInfo> list;
        AbstractC10282040i abstractC10282040i;
        PriceType priceType;
        C1024203zU c1024203zU = (C1024203zU) obj;
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View view = this.itemView;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.yyl);
            } else {
                viewFindViewById = null;
            }
            this.LLJJJ = (TuxTextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        String str = c1024203zU.LL.title;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        View viewFindViewById2 = this.LLJJJIL;
        int i = R.id.ngv;
        if (viewFindViewById2 == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById2 = viewLJJIJL.findViewById(R.id.ngv);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJJJIL = (LinearLayout) viewFindViewById2;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        LinkedList<ConstraintLayout> linkedList = this.LLJJJJJIL;
        while (viewGroup.getChildCount() > 0) {
            View childAt2 = viewGroup.getChildAt(0);
            C786410Ut5.LJJJLZIJ(childAt2, viewGroup);
            if (childAt2 instanceof ConstraintLayout) {
                linkedList.add((ConstraintLayout) childAt2);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<PurchaseMethodItem> it2 = c1024203zU.LL.itemList.iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                break;
            }
            PurchaseMethodItem next2 = it2.next();
            ECRichText eCRichText = next2.title;
            ECRichText eCRichText2 = next2.expandSubtitle;
            ECRichText eCRichText3 = next2.collapseSubtitle;
            Map<Integer, PriceType> map = c1024203zU.LLILLL;
            if (map != null) {
                priceType = map.get(next2.purchaseMethodType);
            } else {
                priceType = null;
            }
            Integer num = next2.purchaseMethodType;
            int i2 = c1024203zU.LLILLJJLI;
            if (num == null || num.intValue() != i2) {
                z = false;
            }
            arrayList.add(new C10279040f(eCRichText, eCRichText2, eCRichText3, priceType, num, z));
        }
        int i3 = 0;
        for (Object obj2 : arrayList) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C10279040f c10279040f = (C10279040f) obj2;
                View viewFindViewById3 = this.LLJJJIL;
                if (viewFindViewById3 == null) {
                    View viewLJJIJL2 = LJJIJL();
                    if (viewLJJIJL2 != null) {
                        viewFindViewById3 = viewLJJIJL2.findViewById(i);
                    } else {
                        viewFindViewById3 = null;
                    }
                    this.LLJJJIL = (LinearLayout) viewFindViewById3;
                }
                ViewGroup viewGroup2 = (ViewGroup) viewFindViewById3;
                View viewLIZ = (View) C19719612Di.LJJIIZI(this.LLJJJJJIL);
                if (viewLIZ == null) {
                    C01GW c01gw = C954703oH.LIZ;
                    viewLIZ = C954703oH.LIZ(this.itemView.getContext(), R.layout.at1, null, false);
                }
                ECRichText eCRichText4 = c10279040f.LIZ;
                if (eCRichText4 != null) {
                    TextView textView2 = (TextView) viewLIZ.findViewById(R.id.yyk);
                    boolean z2 = c10279040f.LJFF;
                    if (textView2 != null) {
                        SpannableStringBuilder spannableStringBuilderLIZ = C03C8.LIZ(textView2, eCRichText4, "pdp_purchase_method_view", null, null, false, 24);
                        if (z2) {
                            if (spannableStringBuilderLIZ != null) {
                                C786410Ut5.q2(spannableStringBuilderLIZ, new StyleSpan(1), 0, spannableStringBuilderLIZ.length(), 33);
                            } else {
                                spannableStringBuilderLIZ = null;
                            }
                        }
                        textView2.setText(spannableStringBuilderLIZ);
                        C12ES.LJIILL(0, textView2);
                    }
                }
                TextView textView3 = (TextView) viewLIZ.findViewById(R.id.yyj);
                C0H1U.LIZIZ(textView3);
                if (c10279040f.LJFF) {
                    ECRichText eCRichText5 = c10279040f.LIZIZ;
                    if (eCRichText5 != null) {
                        textView3.setSingleLine(false);
                        textView3.setEllipsize(null);
                        C03C8.LIZJ(textView3, eCRichText5, "pdp_purchase_method_view", null);
                        C12ES.LJIILL(0, textView3);
                        textView3.requestLayout();
                    }
                } else {
                    ECRichText eCRichText6 = c10279040f.LIZJ;
                    if (eCRichText6 != null) {
                        textView3.setSingleLine(true);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        C03C8.LIZJ(textView3, eCRichText6, "pdp_purchase_method_view", null);
                        C12ES.LJIILL(0, textView3);
                        textView3.requestLayout();
                    }
                }
                if (c10279040f.LJFF) {
                    viewLIZ.setBackgroundResource(R.drawable.b72);
                } else {
                    viewLIZ.setBackgroundResource(R.drawable.b71);
                }
                PriceType priceType2 = c10279040f.LIZLLL;
                if (priceType2 != null) {
                    C786410Ut5.LJJJJIZL((FrameLayout) viewLIZ.findViewById(R.id.rtu));
                    final Context context = this.itemView.getContext();
                    if (priceType2 instanceof PriceType.Single) {
                        abstractC10282040i = new AbstractC10282040i(context) { // from class: X.03zR
                            @Override // X.AbstractC10282040i
                            public int getLayoutResId() {
                                return R.layout.atf;
                            }

                            @Override // X.InterfaceC10281040h
                            public final void LIZ(PriceType priceType3, int i5) {
                                PriceType.Single single;
                                SinglePriceItem singlePriceItem;
                                if ((priceType3 instanceof PriceType.Single) && (single = (PriceType.Single) priceType3) != null && (singlePriceItem = single.data) != null) {
                                    String str2 = singlePriceItem.pricePrefix;
                                    if (str2 != null && C703302op.LIZ(str2)) {
                                        TuxTextView prefixView = getPrefixView();
                                        C03DZ.LIZJ(prefixView);
                                        prefixView.setText(str2);
                                        prefixView.setTuxFont(71);
                                        prefixView.setTextColorRes(R.attr.a1h);
                                    }
                                    TuxTextView realPriceView = getRealPriceView();
                                    String str3 = singlePriceItem.salePriceFormat;
                                    String str4 = "";
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    String str5 = singlePriceItem.currencySymbol;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    realPriceView.setText(AbstractC10282040i.LIZIZ(this, str3, str5, singlePriceItem.symbolPosition, new Pair(72, Integer.valueOf(i5)), R.attr.a1h, false, 72));
                                    PriceType.Single single2 = (PriceType.Single) priceType3;
                                    if (single2.hideOriginPrice) {
                                        C0H1U.LIZIZ(getOriginPriceView());
                                    } else {
                                        TuxTextView originPriceView = getOriginPriceView();
                                        String str6 = singlePriceItem.originPriceFormat;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        String str7 = singlePriceItem.currencySymbol;
                                        if (str7 != null) {
                                            str4 = str7;
                                        }
                                        C0H1U.LJIIL(originPriceView, AbstractC10282040i.LIZIZ(this, str6, str4, singlePriceItem.symbolPosition, new Pair(71, 71), 0, true, 40), true);
                                    }
                                    if (single2.showDiscountInfo) {
                                        TuxTextView discountView = getDiscountView();
                                        String str8 = singlePriceItem.discountFormat;
                                        if (str8 != null && C703302op.LIZ(str8)) {
                                            discountView.setText(C786410Ut5.j4("(-%s)", Arrays.copyOf(new Object[]{str8}, 1)));
                                            discountView.setTuxFont(71);
                                            discountView.setTextColorRes(R.attr.ee);
                                        }
                                    }
                                }
                            }
                        };
                    } else if (priceType2 instanceof PriceType.Range) {
                        abstractC10282040i = new AbstractC10282040i(context) { // from class: X.03zQ
                            @Override // X.AbstractC10282040i
                            public int getLayoutResId() {
                                return R.layout.at2;
                            }

                            @Override // X.InterfaceC10281040h
                            public final void LIZ(PriceType priceType3, int i5) {
                                PriceType.Range range;
                                RangePrice rangePrice;
                                if ((priceType3 instanceof PriceType.Range) && (range = (PriceType.Range) priceType3) != null && (rangePrice = range.data) != null) {
                                    TuxTextView realPriceView = getRealPriceView();
                                    String str2 = rangePrice.rangePrice;
                                    String str3 = "";
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    String str4 = rangePrice.currencySymbol;
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    realPriceView.setText(AbstractC10282040i.LIZIZ(this, str2, str4, rangePrice.symbolPosition, new Pair(72, Integer.valueOf(i5)), R.attr.a1h, false, 72));
                                    if (((PriceType.Range) priceType3).hideOriginPrice) {
                                        C0H1U.LIZIZ(getOriginPriceView());
                                        return;
                                    }
                                    TuxTextView originPriceView = getOriginPriceView();
                                    String str5 = rangePrice.originRangePrice;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    String str6 = rangePrice.currencySymbol;
                                    if (str6 != null) {
                                        str3 = str6;
                                    }
                                    C0H1U.LJIIL(originPriceView, AbstractC10282040i.LIZIZ(this, str5, str3, rangePrice.symbolPosition, new Pair(71, 71), 0, true, 40), true);
                                }
                            }
                        };
                    } else {
                        throw new C1954807lC();
                    }
                    int i5 = 43;
                    abstractC10282040i.LIZ(priceType2, 43);
                    ((ViewGroup) viewLIZ.findViewById(R.id.rtu)).addView(abstractC10282040i, new FrameLayout.LayoutParams(-2, -2));
                    if (C1024103zT.LIZ()) {
                        if (c10279040f.LJFF) {
                            i5 = 42;
                        } else {
                            i5 = 41;
                        }
                    }
                    abstractC10282040i.LIZ(priceType2, i5);
                }
                Integer num2 = c10279040f.LJ;
                if (num2 != null) {
                    C786410Ut5.I7(new ACListenerS39S0201000_1(this, c1024203zU, num2.intValue(), 0), viewLIZ);
                }
                C1841350y17 c1841350y17 = (C1841350y17) viewLIZ.findViewById(R.id.ygx);
                if (C1024103zT.LIZ()) {
                    C12ES.LJIILL(0, c1841350y17);
                    c1841350y17.setSize(EnumC1841290y11.Small);
                    c1841350y17.setChecked(c10279040f.LJFF);
                } else {
                    C0H1U.LIZIZ(c1841350y17);
                }
                viewGroup2.addView(viewLIZ);
                i3 = i4;
                i = R.id.ngv;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (C1024103zT.LIZ() && c1024203zU.LLILLJJLI == EnumC10415045l.SUBSCRIBE.getValue()) {
            LinearLayout linearLayoutD6 = d6();
            if (linearLayoutD6 != null) {
                childAt = linearLayoutD6.getChildAt(0);
            } else {
                childAt = null;
            }
            if (!(childAt instanceof C04FA) || (c04fa = (C04FA) childAt) == null) {
                Context context2 = this.itemView.getContext();
                c04fa = new C04FA(this.itemView.getContext(), this.LLJJIJIL, new c());
                C16GA c16ga = new C16GA(-1, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c04fa);
                c04fa.setLayoutParams(c16ga);
                c04fa.j0();
                ScrollTopLinearLayoutManager scrollTopLinearLayoutManager = new ScrollTopLinearLayoutManager(context2);
                scrollTopLinearLayoutManager.setOrientation(0);
                c04fa.setLayoutManager(scrollTopLinearLayoutManager);
            }
            Iterator<PurchaseMethodItem> it3 = c1024203zU.LL.itemList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    Integer num3 = next.purchaseMethodType;
                    int value = EnumC10415045l.SUBSCRIBE.getValue();
                    if (num3 != null && num3.intValue() == value) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PurchaseMethodItem purchaseMethodItem = next;
            if (purchaseMethodItem != null && (subscribePeriodInfo = purchaseMethodItem.periodInfo) != null && (list = subscribePeriodInfo.periodInfoList) != null) {
                String str2 = c1024203zU.LLILZ;
                ArrayList arrayList2 = new ArrayList();
                Iterator<SnsPeriodInfo> it4 = list.iterator();
                while (it4.hasNext()) {
                    String str3 = it4.next().periodText;
                    if (str3 != null) {
                        C042Y c042y = new C042Y(str3, str3, null, null, false, null);
                        c042y.LLJI = Intrinsics.LJFF(str3, str2);
                        arrayList2.add(c042y);
                    }
                }
                c04fa.e0("Get it every", arrayList2, 0, null, "subscribe_frequency", true, null, null);
                LinearLayout linearLayoutD62 = d6();
                if (linearLayoutD62 != null && linearLayoutD62.getChildCount() == 0) {
                    LinearLayout linearLayoutD63 = d6();
                    if (linearLayoutD63 != null) {
                        linearLayoutD63.addView(c04fa);
                    }
                    c04fa.setClickListener(this);
                }
            }
            LinearLayout linearLayoutD64 = d6();
            if (linearLayoutD64 != null) {
                C12ES.LJIILL(0, linearLayoutD64);
            }
        } else {
            LinearLayout linearLayoutD65 = d6();
            if (linearLayoutD65 != null) {
                C0H1U.LIZIZ(linearLayoutD65);
            }
        }
        C1054004Ag c1054004Ag = ((PdpViewModel) this.LLJJJJLIIL.getValue()).LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            C1054004Ag.LJJI(c1054004Ag, "purchase_method", false, null, C2097608Jq.LJIIZILJ(c6(c1024203zU, c1024203zU.LLILLJJLI)), 6);
        }
    }

    public final Map<String, Object> c6(C1024203zU c1024203zU, int i) {
        Integer num;
        PurchaseMethodItem next;
        String str;
        Iterator<PurchaseMethodItem> it2 = c1024203zU.LL.itemList.iterator();
        while (true) {
            num = null;
            if (it2.hasNext()) {
                next = it2.next();
                Integer num2 = next.purchaseMethodType;
                int value = EnumC10415045l.SUBSCRIBE.getValue();
                if (num2 != null && num2.intValue() == value) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PurchaseMethodItem purchaseMethodItem = next;
        if (purchaseMethodItem != null) {
            num = purchaseMethodItem.discountPercentage;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf != null && numValueOf.intValue() != 0 && numValueOf.intValue() == 1) {
            str = "subscribe";
        } else {
            str = "one-time purchase";
        }
        linkedHashMap.put("purchase_method", str);
        if (num != null) {
            linkedHashMap.put("discount_percentage", Integer.valueOf(num.intValue()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PdpPurchaseMethodVH(ViewGroup viewGroup, ECBaseFragment eCBaseFragment, View view) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.at0, viewGroup, false);
        }
        super(view);
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJJJJIL = new LinkedList<>();
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1378));
    }

    @Override // X.C04FD
    public final void Tk(int i, int i2, C042Y c042y) {
        String str;
        String str2;
        String str3;
        SkuPanelState skuPanelStateLIZIZ = null;
        if (i == 0) {
            str = "subscribe_frequency";
        } else {
            str = null;
        }
        if (c042y != null) {
            str2 = c042y.LL;
        } else {
            str2 = null;
        }
        C1748720vbi.LIZIZ(this.LLJJIJIL, new C049Y(), new AwS30S2100000_1(str, String.valueOf(str2), c042y, 0));
        PdpViewModel pdpViewModel = (PdpViewModel) this.LLJJJJLIIL.getValue();
        if (c042y != null) {
            str3 = c042y.LL;
        } else {
            str3 = null;
        }
        SkuPanelState skuPanelStatePv0 = pdpViewModel.Pv0();
        if (skuPanelStatePv0 != null) {
            skuPanelStateLIZIZ = SkuPanelState.LIZIZ(skuPanelStatePv0, null, null, null, null, null, null, null, str3, false, 0, null, null, null, null, null, null, 67108735);
        }
        pdpViewModel.RE2(skuPanelStateLIZIZ);
        pdpViewModel.BS2(pdpViewModel.Pv0(), true, false, false, AnonymousClass0449.UNKNOWN, true);
    }

    @Override // X.C04FD
    public final void LLLLZLLLI(View view, int i, int i2, C042Y c042y) {
        String str;
        String str2 = null;
        if (i == 0) {
            str = "subscribe_frequency";
        } else {
            str = null;
        }
        if (c042y != null) {
            str2 = c042y.LL;
        }
        String strValueOf = String.valueOf(str2);
        if (view != null) {
            C1748720vbi.LJFF(view, new C049X(), new AwS86S1000000_1(strValueOf, 11), new AwS30S2100000_1(str, strValueOf, c042y, 1));
        }
    }
}
