package com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem;

import X.C011J;
import X.C01GW;
import X.C03DZ;
import X.C042V;
import X.C042W;
import X.C042X;
import X.C042Y;
import X.C049X;
import X.C049Y;
import X.C04FA;
import X.C0H1U;
import X.C1019103yf;
import X.C1019703yl;
import X.C123100dR;
import X.C13LP;
import X.C16GA;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C19719612Di;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C704602p2;
import X.C756302xN;
import X.C7727030b;
import X.C786410Ut5;
import X.C814420VxA;
import X.C919503ib;
import X.EnumC1014603xw;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.ProductLinkProperty;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PropertyValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.core.view.skc.SkuExpandableFlowLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import o5b.a;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuProductLinkageReusedAssem extends SkuPanelBaseReusedAssem<SkuProductLinkageReusedAssem, C704602p2> implements C042V {
    public final String LLJLIL = "SkuProductLinkageSizeAssem init error";
    public final LinkedList<C04FA> LLJLILLLLZIIL = new LinkedList<>();
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1401));
    public List<PropertyValue> LLJLLIL;
    public LinearLayout LLJLLL;

    @Override // X.C04FD
    public final void LJLJLLL(SizeGuide sizeGuide) {
    }

    @Override // X.C04FD
    public final void LLLLZLL(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ast;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem
    public final void Ap() {
        if (getContentView() != null) {
            this.LLJLLL = (LinearLayout) op(R.id.dxz);
        } else {
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void Bp() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (getViewModel().PQ2()) {
            C04FA c04fa = (C04FA) C19719612Di.LJJIIZI(this.LLJLILLLLZIIL);
            if (c04fa == null) {
                c04fa = new C04FA(sp(), tp(), (a) this.LLJLL.getValue());
            }
            C16GA c16ga = new C16GA(-1, -2);
            ((LinearLayout.LayoutParams) c16ga).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(getViewModel().LLLIIIL != null ? 8 : 16)));
            c04fa.setTextLayoutMargin(((a) this.LLJLL.getValue()).LJFF);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c04fa);
            c04fa.setLayoutParams(c16ga);
            up();
            SkuExpandableFlowLayoutManager skuExpandableFlowLayoutManager = new SkuExpandableFlowLayoutManager();
            skuExpandableFlowLayoutManager.LL = ((a) this.LLJLL.getValue()).LJI;
            c04fa.setLayoutManager(skuExpandableFlowLayoutManager);
            Fp(c04fa);
            int i = ((a) this.LLJLL.getValue()).LJ;
            ViewGroup.LayoutParams layoutParams = c04fa.getSpecListFromXml().getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = i;
                }
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.p6(c04fa.getSpecListFromXml(), marginLayoutParams);
            LinearLayout linearLayout = this.LLJLLL;
            if (linearLayout != null) {
                linearLayout.addView(c04fa);
            }
            c04fa.setClickListener(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem
    public final void zp() {
        getViewModel().s60(new C2217381BqS() { // from class: X.042S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getKeyBoardVisibility();
            }
        }, new AwS580S0100000_1((C042V) this, 563));
        getViewModel().TQ2(new C2217381BqS() { // from class: X.042Q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuDataState();
            }
        }, new C2217381BqS() { // from class: X.042L
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getForceRefresh();
            }
        }, new AwS615S0100000_1(this, 162));
        getViewModel().s60(new C2217381BqS() { // from class: X.042T
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCheckedSkuArray();
            }
        }, new AwS580S0100000_1((C042V) this, 570));
    }

    public static String Ep(String str) {
        List list;
        Uri uri = UriProtector.parse(str);
        if (Intrinsics.LJFF(uri.getHost(), "ec") && Intrinsics.LJFF(uri.getPath(), "/pdp")) {
            try {
                HashMap<String, Object> mapLIZJ = C1741890vQh.LIZJ(uri, "requestParams");
                if (mapLIZJ == null) {
                    mapLIZJ = new HashMap<>();
                }
                Object obj = mapLIZJ.get("product_id");
                if (obj instanceof List) {
                    list = (List) obj;
                } else {
                    list = null;
                }
                if (list != null) {
                    String str2 = (String) C7727030b.LIZ(0, list);
                    if (str2 != null) {
                        return str2;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR10015, e, null);
            }
        }
        return null;
    }

    public final void Fp(C04FA c04fa) {
        List<SaleProp> list;
        String[] strArr;
        SkcInfo skcInfo;
        ArrayList arrayList;
        C042W c042w;
        List<PropertyValue> list2;
        String str;
        String strEp;
        ProductLinkProperty productLinkProperty;
        ProductLinkProperty productLinkProperty2;
        ProductPackStruct productPackStruct = getViewModel().LLJIJIL;
        List<PropertyValue> list3 = null;
        if (productPackStruct != null) {
            list = productPackStruct.saleProps;
        } else {
            list = null;
        }
        SkuPanelState skuPanelState = getViewModel().LLIZ;
        if (skuPanelState != null) {
            strArr = skuPanelState.checkedSkuIds;
        } else {
            strArr = null;
        }
        ProductPackStruct productPackStruct2 = getViewModel().LLJIJIL;
        if (productPackStruct2 != null) {
            skcInfo = productPackStruct2.skcInfo;
        } else {
            skcInfo = null;
        }
        Skc skcLIZJ = C042X.LIZJ(list, strArr, skcInfo);
        Boolean viewAllFromLayoutManager = c04fa.getViewAllFromLayoutManager();
        if (skcLIZJ == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            ProductLinkProperty productLinkProperty3 = skcLIZJ.productLinkProperties;
            if (productLinkProperty3 != null && (list2 = productLinkProperty3.propertyValues) != null) {
                for (PropertyValue propertyValue : list2) {
                    String str2 = propertyValue.valueName;
                    if (str2 != null) {
                        C042Y c042y = new C042Y(str2, str2, null, null, false, null);
                        c042y.LLJI = Intrinsics.LJFF(propertyValue.isCurrentSelection, Boolean.TRUE);
                        c042y.LLJJ = propertyValue.pdpJumpSchema;
                        c042y.LLJJI = propertyValue.daInfo;
                        arrayList.add(c042y);
                    }
                }
            }
            if (C756302xN.LIZ(arrayList) && viewAllFromLayoutManager != null) {
                boolean zBooleanValue = viewAllFromLayoutManager.booleanValue();
                C042Y c042y2 = new C042Y("sku_view_all", "", null, null, false, null);
                if (zBooleanValue) {
                    c042w = C042W.MORE;
                } else {
                    c042w = C042W.LESS;
                }
                c042y2.LLJIJIL = c042w;
                arrayList.add(c042y2);
            }
        }
        if (C756302xN.LIZ(arrayList)) {
            if (skcLIZJ != null && (productLinkProperty2 = skcLIZJ.productLinkProperties) != null) {
                str = productLinkProperty2.propertyName;
            } else {
                str = null;
            }
            c04fa.e0(str, arrayList, 0, null, "sku", false, null, null);
            C03DZ.LIZJ(c04fa);
            if (skcLIZJ != null && (productLinkProperty = skcLIZJ.productLinkProperties) != null) {
                list3 = productLinkProperty.propertyValues;
            }
            if (!Intrinsics.LJFF(this.LLJLLIL, list3)) {
                this.LLJLLIL = list3;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (list3 != null) {
                    Iterator<PropertyValue> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        String str3 = it2.next().pdpJumpSchema;
                        if (str3 != null && (strEp = Ep(str3)) != null) {
                            linkedHashSet.add(strEp);
                        }
                    }
                }
                IPdpPreviewService iPdpPreviewService = (IPdpPreviewService) ServiceManager.get().getService(IPdpPreviewService.class);
                List<String> listLLIIII = C13LP.LLIIII(linkedHashSet);
                boolean zLJI = MethodIDManager.LJI(137963);
                iPdpPreviewService.LIZ(listLLIIII, null, null, null, "sku");
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            return;
        }
        C0H1U.LIZIZ(c04fa);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
    }

    @Override // X.C04FD
    public final void Tk(int i, int i2, C042Y c042y) {
        boolean z;
        String str;
        Boolean bool;
        int childCount;
        View childAt;
        C04FA c04fa;
        SkuExpandableFlowLayoutManager skuExpandableFlowLayoutManager;
        boolean zBooleanValue = true;
        int i3 = 0;
        if (c042y != null) {
            if (c042y.LLJIJIL != C042W.NOT_EXPANDABLE) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LinearLayout linearLayout = this.LLJLLL;
                if (linearLayout == null || (childCount = linearLayout.getChildCount()) <= 0) {
                    return;
                }
                while (true) {
                    LinearLayout linearLayout2 = this.LLJLLL;
                    if (linearLayout2 != null) {
                        childAt = linearLayout2.getChildAt(i3);
                    } else {
                        childAt = null;
                    }
                    if ((childAt instanceof C04FA) && (c04fa = (C04FA) childAt) != null) {
                        RecyclerView.LayoutManager layoutManager = c04fa.getSpecListFromXml().getLayoutManager();
                        if ((layoutManager instanceof SkuExpandableFlowLayoutManager) && (skuExpandableFlowLayoutManager = (SkuExpandableFlowLayoutManager) layoutManager) != null) {
                            skuExpandableFlowLayoutManager.LLILLJJLI = !skuExpandableFlowLayoutManager.LLILLJJLI;
                        }
                        Fp(c04fa);
                    }
                    if (i3 == childCount) {
                        return;
                    } else {
                        i3++;
                    }
                }
            } else if (c042y != null && (str = c042y.LLJJ) != null) {
                Uri uri = UriProtector.parse(str);
                SkuPanelStarter.SkuEnterParams skuEnterParams = getViewModel().LLJI;
                if (skuEnterParams != null && (bool = skuEnterParams.pdpFullScreen) != null) {
                    zBooleanValue = bool.booleanValue();
                }
                String string = C011J.LIZ(uri, "fullScreen", String.valueOf(zBooleanValue)).toString();
                if (C123100dR.LIZ(string) && !c042y.LLJI) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    HashMap map = new HashMap();
                    map.put("previous_page", "sku");
                    map.put("entrance_form", "pdp_link");
                    map.put("source_page_type", "pdp_linkage_size");
                    map.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
                    String strEp = Ep(string);
                    if (strEp != null) {
                        map.put("product_id", strEp);
                    }
                    linkedHashMap.put("trackParams", map);
                    SkuPanelStarter.SkuEnterParams skuEnterParams2 = getViewModel().LLJI;
                    if (skuEnterParams2 != null) {
                        linkedHashMap.put("auto_open_sku_panel_click_from", Integer.valueOf(skuEnterParams2.clickFrom));
                    }
                    C1019703yl c1019703yl = getViewModel().LLL;
                    c1019703yl.getClass();
                    String strLJI = c1019703yl.LJI("c81199.d8922", null);
                    if (strLJI != null) {
                        linkedHashMap.put("source_btm_token", strLJI);
                    }
                    Context context = getContext();
                    if (context != null) {
                        C919503ib.LIZIZ(context, string, linkedHashMap, false).open();
                    }
                }
                C1748720vbi.LIZIZ(tp(), new C049Y(), new AwS367S0200000_1(c042y, this, 123));
            }
        }
    }

    @Override // X.C04FD
    public final void LLLLZLLLI(View view, int i, int i2, C042Y c042y) {
        if (view != null) {
            C1748720vbi.LJFF(view, new C049X(), new AwS545S0100000_1(c042y, 1583), new AwS367S0200000_1(c042y, (C042V) this, 227));
        }
    }
}
