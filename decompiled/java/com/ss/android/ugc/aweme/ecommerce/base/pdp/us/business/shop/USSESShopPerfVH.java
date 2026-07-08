package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop;

import X.C01GW;
import X.C03DZ;
import X.C046U;
import X.C1003903wD;
import X.C19719612Di;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.C703602os;
import X.C786410Ut5;
import X.C919503ib;
import X.C954703oH;
import X.EnumC1004003wE;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SESMetric;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.zhiliaoapp.musically.R;
import g1c.AjS2S1200000_1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class USSESShopPerfVH extends AbsFullSpanVH<C703602os> {
    public final C01GW LLJJIJIL;
    public final LinkedList<C1003903wD> LLJJJ;
    public final Map<Integer, Integer> LLJJJIL;
    public final C01GW LLJJJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        String str;
        String str2;
        int iIntValue;
        int iIntValue2;
        String str3;
        Object obj2;
        Map<String, Object> map;
        C703602os c703602os = (C703602os) obj;
        TextView textView = (TextView) this.itemView.findViewById(R.id.v7n);
        ShopPerformance shopPerformance = c703602os.LLILZIL;
        List<SESMetric> list = null;
        if (shopPerformance != null) {
            str = shopPerformance.title;
        } else {
            str = null;
        }
        textView.setText(str);
        List<StoreLabel> list2 = c703602os.LLILLL;
        boolean z = true;
        if (list2 != null) {
            Iterator<StoreLabel> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                StoreLabel next = it2.next();
                StoreOfficialLabel storeOfficialLabel = next.officialLabel;
                if (storeOfficialLabel != null) {
                    Integer num = storeOfficialLabel.labelType;
                    int value = C046U.STAR_SHOP.getValue();
                    if (num != null && num.intValue() == value) {
                        if (next != null) {
                            C03DZ.LIZJ(this.itemView.findViewById(R.id.v7m));
                        }
                    }
                }
            }
        }
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.v7f);
        ShopPerformance shopPerformance2 = c703602os.LLILZIL;
        if (shopPerformance2 != null) {
            str2 = shopPerformance2.content;
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        ShopPerformance shopPerformance3 = c703602os.LLILZIL;
        if (shopPerformance3 != null && (list = shopPerformance3.metricsList) != null && !list.isEmpty()) {
            z = false;
        }
        if (z) {
            C03DZ.LIZ(this.itemView.findViewById(R.id.v7i));
        } else {
            C03DZ.LIZJ(this.itemView.findViewById(R.id.v7i));
            if (((ViewGroup) this.itemView.findViewById(R.id.v7i)).getChildCount() > 0) {
                ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.v7i);
                LinkedList<C1003903wD> linkedList = this.LLJJJ;
                while (viewGroup.getChildCount() > 0) {
                    View childAt = viewGroup.getChildAt(0);
                    C786410Ut5.LJJJLZIJ(childAt, viewGroup);
                    if (childAt instanceof C1003903wD) {
                        linkedList.add((C1003903wD) childAt);
                    }
                }
            }
            for (SESMetric sESMetric : list) {
                C1003903wD c1003903wD = (C1003903wD) C19719612Di.LJJIIZI(this.LLJJJ);
                C1003903wD c1003903wD2 = c1003903wD;
                if (c1003903wD == null) {
                    final Context context = this.itemView.getContext();
                    c1003903wD2 = new LinearLayout(context) { // from class: X.03wD
                        public TuxIconView LL;
                        public TuxTextView LLILLJJLI;
                        public C0EOG LLILLL;
                        public TuxTextView LLILZ;

                        public final TuxTextView getSesMetricsItemDescriptionFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.uu_);
                                this.LLILLJJLI = (TuxTextView) callbackFindViewById;
                            }
                            return (TuxTextView) callbackFindViewById;
                        }

                        public final TuxIconView getSesMetricsItemIconFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LL;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.uua);
                                this.LL = (TuxIconView) callbackFindViewById;
                            }
                            return (TuxIconView) callbackFindViewById;
                        }

                        public final C0EOG getSesMetricsItemProgressFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LLILLL;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.uub);
                                this.LLILLL = (C0EOG) callbackFindViewById;
                            }
                            return (C0EOG) callbackFindViewById;
                        }

                        public final TuxTextView getSesMetricsItemRateFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LLILZ;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.uuc);
                                this.LLILZ = (TuxTextView) callbackFindViewById;
                            }
                            return (TuxTextView) callbackFindViewById;
                        }

                        {
                            super(context, null, 0);
                            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.atq, this, true);
                            int visibility = getVisibility();
                            setVisibility(0);
                            C1602160rnK.LIZIZ(visibility, 0, this);
                        }

                        public final void setSesMetricsItemDescriptionFromXml(TuxTextView tuxTextView) {
                            this.LLILLJJLI = tuxTextView;
                        }

                        public final void setSesMetricsItemIconFromXml(TuxIconView tuxIconView) {
                            this.LL = tuxIconView;
                        }

                        public final void setSesMetricsItemProgressFromXml(C0EOG c0eog) {
                            this.LLILLL = c0eog;
                        }

                        public final void setSesMetricsItemRateFromXml(TuxTextView tuxTextView) {
                            this.LLILZ = tuxTextView;
                        }
                    };
                }
                Integer num2 = this.LLJJJIL.get(sESMetric.detailedMetricType);
                String str4 = sESMetric.content;
                Integer num3 = sESMetric.rate;
                if (num3 != null) {
                    iIntValue = num3.intValue();
                } else {
                    iIntValue = 0;
                }
                TuxIconView sesMetricsItemIconFromXml = c1003903wD2.getSesMetricsItemIconFromXml();
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = R.raw.icon_star;
                }
                sesMetricsItemIconFromXml.setIconRes(iIntValue2);
                c1003903wD2.getSesMetricsItemDescriptionFromXml().setText(str4);
                c1003903wD2.getSesMetricsItemProgressFromXml().setProgress(iIntValue / 100.0f);
                TuxTextView sesMetricsItemRateFromXml = c1003903wD2.getSesMetricsItemRateFromXml();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(iIntValue);
                sbLIZ.append('%');
                sesMetricsItemRateFromXml.setText(C2188811AlT.LIZIZ(sbLIZ));
                ((ViewGroup) this.itemView.findViewById(R.id.v7i)).addView(c1003903wD2);
            }
        }
        ShopPerformance shopPerformance4 = c703602os.LLILZIL;
        if (shopPerformance4 != null && (str3 = shopPerformance4.learnMoreSchema) != null && !a0.LJJJIL(str3)) {
            String str5 = c703602os.LLILZIL.learnMoreText;
            if (str5 != null && !a0.LJJJIL(str5)) {
                C03DZ.LIZJ(this.itemView.findViewById(R.id.v7g));
                ((TextView) this.itemView.findViewById(R.id.v7h)).setText(str5);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            IPdpStarter.PdpEnterParam pdpEnterParam = ((PdpViewModel) this.LLJJIJIL.getValue()).LLJI;
            if (pdpEnterParam == null || (map = pdpEnterParam.trackParams) == null || (obj2 = map.get("source_page_type")) == null) {
                obj2 = "unknown";
            }
            linkedHashMap.put("source_page_type", obj2);
            linkedHashMap.put("enter_from", ((PdpViewModel) this.LLJJIJIL.getValue()).HR2());
            String strJR2 = ((PdpViewModel) this.LLJJIJIL.getValue()).JR2();
            if (strJR2 == null) {
                strJR2 = "";
            }
            linkedHashMap.put("entrance_info", strJR2);
            linkedHashMap.put("product_id", ((PdpViewModel) this.LLJJIJIL.getValue()).getProductId());
            linkedHashMap.put("previous_page", "product_detail");
            Object value2 = this.LLJJJJ.getValue();
            if (value2 != null) {
                linkedHashMap.put("entrance_selling_point", value2);
            }
            C786410Ut5.I7(new AjS2S1200000_1(this, c703602os, C919503ib.LIZJ(str3, linkedHashMap).build().toString(), 1), this.itemView.findViewById(R.id.v7g));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public USSESShopPerfVH(View view, ViewGroup viewGroup) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.atw, viewGroup, false);
        }
        super(view);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1705));
        this.LLJJJ = new LinkedList<>();
        this.LLJJJIL = C2097608Jq.LJIIIIZZ(new Pair(Integer.valueOf(EnumC1004003wE.FOUR_STAR_RATING.getValue()), Integer.valueOf(R.raw.icon_star)), new Pair(Integer.valueOf(EnumC1004003wE.SHIPS_WITHIN_2_DAYS.getValue()), Integer.valueOf(R.raw.icon_truck_moving_ltr)), new Pair(Integer.valueOf(EnumC1004003wE.RESPONDS_WITHIN_24_HOURS.getValue()), Integer.valueOf(R.raw.icon_paperplane)));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1704));
    }
}
