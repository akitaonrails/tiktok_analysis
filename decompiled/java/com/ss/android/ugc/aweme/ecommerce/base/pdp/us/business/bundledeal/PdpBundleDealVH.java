package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.bundledeal;

import X.C01GW;
import X.C03J8;
import X.C04A0;
import X.C04HR;
import X.C0H1U;
import X.C1019103yf;
import X.C128Y;
import X.C12ES;
import X.C1326490kch;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1753660vjg;
import X.C1753670vjh;
import X.C197039127h;
import X.C19719612Di;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C703302op;
import X.C786410Ut5;
import X.C814420VxA;
import X.C919503ib;
import X.C946803n0;
import X.C954703oH;
import X.EnumC1014603xw;
import X.InterfaceC1748810vbr;
import Y.ARunnableS15S0301000_26;
import Y.ARunnableS25S0210000_26;
import Y.ARunnableS95S0200000_26;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleAddButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundlePrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleTotalPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS1S0401000_26;
import g1c.AjS22S0300000_26;
import g1c.AjS8S0400000_26;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import p8b.c;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpBundleDealVH extends AbsFullSpanVH<C04A0> implements InterfaceC1748810vbr, c {
    public static final /* synthetic */ int LLJJL = 0;
    public final View LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final LinkedList<C1753670vjh> LLJJJJ;
    public final C01GW LLJJJJJIL;
    public int LLJJJJLIIL;

    @Override // p8b.c
    public final String getViewName() {
        return "PdpBundleDealVH";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C1753660vjg c6() {
        return (C1753660vjg) this.LLJJJIL.getValue();
    }

    public final fta.c d6() {
        return (fta.c) this.LLJJJJJIL.getValue();
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        C128Y c128yLIZ = C946803n0.LIZ(this.itemView);
        if (c128yLIZ instanceof InterfaceC1748810vbr) {
            return (InterfaceC1748810vbr) c128yLIZ;
        }
        return null;
    }

    public final PdpViewModel e6() {
        return (PdpViewModel) this.LLJJJ.getValue();
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", AFwS268S0000000_26.get$arr$(218));
    }

    public final void h6(String str) {
        EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR34;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpBundleDealVH ");
        sbLIZ.append(str);
        C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), null);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        List<BundleInfo> list;
        int i;
        String str;
        String str2;
        String str3;
        BundlePrice bundlePrice;
        String str4;
        BundlePrice bundlePrice2;
        BundlePrice bundlePrice3;
        BundlePrice bundlePrice4;
        String str5;
        BundlePrice bundlePrice5;
        String str6;
        String str7;
        C04A0 c04a0 = (C04A0) obj;
        C1326490kch.LIZ.getClass();
        C1326490kch.LJIIIIZZ("PdpBundleDealVH", "onBind", null);
        if (c04a0.LL == null) {
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.vev));
            C04HR c04hr = e6().LLLLLJIL;
            this.itemView.getContext();
            c04hr.LIZ();
        } else {
            C0H1U.LIZIZ(this.itemView.findViewById(R.id.vev));
        }
        BundleInfoResponseData bundleInfoResponseData = c04a0.LL;
        if (bundleInfoResponseData != null && (list = bundleInfoResponseData.bundleInfoList) != null && !list.isEmpty()) {
            BundleInfo bundleInfo = (BundleInfo) ListProtector.get(list, 0);
            c6().LIZJ = c04a0.LL.requestId;
            View view = this.itemView;
            e6().SR2().LL.getValue();
            int i2 = R.id.u2r;
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.u2r);
            LinkedList<C1753670vjh> linkedList = this.LLJJJJ;
            while (viewGroup.getChildCount() > 0) {
                C786410Ut5.LJJLIL(0, viewGroup);
                Object obj2 = Unit.LIZ;
                if (obj2 instanceof C1753670vjh) {
                    linkedList.add((C1753670vjh) obj2);
                }
            }
            View view2 = this.itemView;
            View viewFindViewById = view2.findViewById(R.id.tv_title);
            int i3 = 8;
            if (!d6().LLIIIL()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
            ((TuxTextView) view2.findViewById(R.id.tv_total_real_price)).setTuxFont(d6().LJJLIIIJLJLI());
            C426750GoL.LJIIL(view2.findViewById(R.id.af7), null, Integer.valueOf(d6().LLILZIL()), null, null, 29);
            TextView textView = (TextView) view.findViewById(R.id.tv_title);
            String str8 = bundleInfo.title;
            if (str8 == null) {
                str8 = "Bundle";
            }
            textView.setText(str8);
            String str9 = bundleInfo.subtitle;
            if (str9 != null) {
                TextView textView2 = (TextView) view.findViewById(R.id.tv_subtitle);
                textView2.setText(str9);
                C12ES.LJIILL(0, textView2);
            }
            List<BundleProduct> list2 = bundleInfo.productList;
            if (list2 != null) {
                int i4 = 0;
                for (BundleProduct bundleProduct : list2) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        BundleProduct bundleProduct2 = bundleProduct;
                        if (i4 > 0) {
                            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(i2);
                            View view3 = (View) C19719612Di.LJJIIZI(this.LLJJJJ);
                            View view4 = view3;
                            if (view3 == null) {
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                                layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(35.5d)));
                                layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3))));
                                TuxIconView tuxIconView = new TuxIconView(this.itemView.getContext(), null, 0, 6, null);
                                tuxIconView.setIconRes(R.raw.icon_plus);
                                tuxIconView.setIconWidth(d6().LJJJLIIL());
                                tuxIconView.setIconHeight(d6().LJJJLIIL());
                                C786410Ut5.M6(tuxIconView, layoutParams);
                                view4 = tuxIconView;
                            }
                            viewGroup2.addView(view4);
                        }
                        C1753670vjh c1753670vjh = (C1753670vjh) C19719612Di.LJJIIZI(this.LLJJJJ);
                        if (c1753670vjh != null) {
                            c1753670vjh.LIZ(bundleProduct2, d6());
                        } else {
                            Context context = view.getContext();
                            fta.c cVarD6 = d6();
                            c1753670vjh = new C1753670vjh(context);
                            c1753670vjh.LIZ(bundleProduct2, cVarD6);
                        }
                        ((ViewGroup) view.findViewById(i2)).addView(c1753670vjh);
                        C786410Ut5.I7(new AjS1S0401000_26(bundleProduct2, this, bundleInfo, i4, view, 0), c1753670vjh);
                        if (this.LLJJJJLIIL < bundleInfo.productList.size()) {
                            this.LLJJJJLIIL++;
                            e6();
                            view.findViewById(R.id.afo);
                            new ARunnableS15S0301000_26(i4, this, bundleInfo, bundleProduct2, 4).run();
                        }
                        i4 = i5;
                        i2 = R.id.u2r;
                        i3 = 8;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            BundleTotalPrice bundleTotalPrice = bundleInfo.totalPrice;
            if (bundleTotalPrice != null && (str7 = bundleTotalPrice.totalTitle) != null) {
                ((TextView) view.findViewById(R.id.tv_total_title)).setText(str7);
            }
            BundleTotalPrice bundleTotalPrice2 = bundleInfo.totalPrice;
            if (bundleTotalPrice2 != null) {
                str = bundleTotalPrice2.saveTitle;
            } else {
                str = null;
            }
            if (C703302op.LIZ(str)) {
                C12ES.LJIILL(0, view.findViewById(R.id.tv_total_save_title));
                ((TextView) view.findViewById(R.id.tv_total_save_title)).setText(str);
            }
            BundleTotalPrice bundleTotalPrice3 = bundleInfo.totalPrice;
            if (bundleTotalPrice3 != null && (bundlePrice5 = bundleTotalPrice3.price) != null && (str6 = bundlePrice5.realPrice) != null) {
                ((TextView) view.findViewById(R.id.tv_total_real_price)).setText(str6);
            }
            BundleTotalPrice bundleTotalPrice4 = bundleInfo.totalPrice;
            if (bundleTotalPrice4 != null && (bundlePrice4 = bundleTotalPrice4.price) != null && (str5 = bundlePrice4.originalPrice) != null) {
                ((TextView) view.findViewById(R.id.tv_total_original_price)).setText(str5);
                ((TextView) view.findViewById(R.id.tv_total_original_price)).getPaint().setFlags(16);
                ((TextView) view.findViewById(R.id.tv_total_original_price)).getPaint().setAntiAlias(true);
            }
            BundleTotalPrice bundleTotalPrice5 = bundleInfo.totalPrice;
            if (bundleTotalPrice5 != null && (bundlePrice3 = bundleTotalPrice5.price) != null) {
                str2 = bundlePrice3.discount;
            } else {
                str2 = null;
            }
            if (C703302op.LIZ(str2)) {
                C12ES.LJIILL(0, view.findViewById(R.id.tv_total_discount));
                TextView textView3 = (TextView) view.findViewById(R.id.tv_total_discount);
                BundleTotalPrice bundleTotalPrice6 = bundleInfo.totalPrice;
                if (bundleTotalPrice6 != null && (bundlePrice2 = bundleTotalPrice6.price) != null) {
                    str4 = bundlePrice2.discount;
                } else {
                    str4 = null;
                }
                textView3.setText(str4);
            }
            BundleTotalPrice bundleTotalPrice7 = bundleInfo.totalPrice;
            if (bundleTotalPrice7 != null && (bundlePrice = bundleTotalPrice7.price) != null) {
                str3 = bundlePrice.savePrice;
            } else {
                str3 = null;
            }
            if (C703302op.LIZ(str3)) {
                C12ES.LJIILL(0, view.findViewById(R.id.tv_total_save_price));
                ((TextView) view.findViewById(R.id.tv_total_save_price)).setText(str3);
            }
            BundleAddButton bundleAddButton = bundleInfo.bundleAddButton;
            if (bundleAddButton != null) {
                ((TextView) view.findViewById(R.id.afo)).setMaxLines(2);
                ((C197039127h) view.findViewById(R.id.afo)).LJJJJL(null);
                ((C197039127h) view.findViewById(R.id.afo)).LJJJJL(AFwS268S0000000_26.get$arr$(663));
                ((TextView) view.findViewById(R.id.afo)).setText(bundleAddButton.buttonText);
                C786410Ut5.I7(new AjS22S0300000_26(this, bundleInfo, bundleAddButton, 8), view.findViewById(R.id.afo));
                C786410Ut5.I7(new AjS8S0400000_26(this, view, bundleInfo, bundleAddButton, 3), view.findViewById(R.id.af7));
                boolean zIsClickable = view.findViewById(R.id.afo).isClickable();
                e6();
                view.findViewById(R.id.afo);
                new ARunnableS25S0210000_26(this, bundleInfo, zIsClickable, 1).run();
            }
            e6();
            new ARunnableS95S0200000_26(this, bundleInfo, 43).run();
            C03J8.LIZ(this.itemView, false);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PdpBundleDealVH(View view, ViewGroup viewGroup) {
        View viewLIZ;
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            viewLIZ = C954703oH.LIZ(viewGroup.getContext(), R.layout.ar8, viewGroup, false);
        } else {
            viewLIZ = view;
        }
        super(viewLIZ);
        this.LLJJIJIL = view;
        this.LLJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1496));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1494));
        this.LLJJJJ = new LinkedList<>();
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1495));
    }

    public final void f6(BundleAddButton bundleAddButton, BundleInfo bundleInfo) {
        Object obj;
        Object obj2;
        String str;
        Map<String, Object> map;
        Map<String, Object> map2;
        String str2 = bundleAddButton.schema;
        if (str2 != null && str2.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("previous_page", "product_detail");
            String strJR2 = e6().JR2();
            if (strJR2 != null) {
                linkedHashMap.put("entrance_info", strJR2);
            }
            linkedHashMap.put("entrance_form", "horizontal_goods_card");
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            List<BundleProduct> list = bundleInfo.productList;
            if (list != null) {
                for (BundleProduct bundleProduct : list) {
                    sb.append(bundleProduct.productSource);
                    sb.append(",");
                    sb2.append(bundleProduct.productId);
                    sb2.append(",");
                }
            }
            linkedHashMap.put("product_source", sb.toString());
            linkedHashMap.put("product_id", sb2.toString());
            IPdpStarter.PdpEnterParam pdpEnterParam = e6().LLJI;
            if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
                obj = map2.get("enter_from_info");
            } else {
                obj = null;
            }
            if (!(obj instanceof String)) {
                obj = null;
            }
            Object obj3 = "unknown";
            if (obj == null) {
                obj = "unknown";
            }
            linkedHashMap.put("enter_from_info", obj);
            linkedHashMap.put("source_page_type", "bundle_deal");
            IPdpStarter.PdpEnterParam pdpEnterParam2 = e6().LLJI;
            if (pdpEnterParam2 != null && (map = pdpEnterParam2.trackParams) != null) {
                obj2 = map.get("source_page_type");
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof String) && obj2 != null) {
                obj3 = obj2;
            }
            linkedHashMap.put("first_source_page", obj3);
            linkedHashMap.put("parent_product_id", e6().getProductId());
            IPdpStarter.PdpEnterParam pdpEnterParam3 = e6().LLJI;
            if (pdpEnterParam3 == null || (str = pdpEnterParam3.pipeParams) == null) {
                str = "";
            }
            linkedHashMap.put("pdp_pipe_params", str);
            Context context = this.itemView.getContext();
            String strLJII = e6().LLILZIL.LJII("c1720.d9604", bundleAddButton.schema, null);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("trackParams", C1741890vQh.LJIIIIZZ(linkedHashMap));
            C919503ib.LIZIZ(context, strLJII, linkedHashMap2, false).open();
            return;
        }
        h6("schema is null");
    }
}
