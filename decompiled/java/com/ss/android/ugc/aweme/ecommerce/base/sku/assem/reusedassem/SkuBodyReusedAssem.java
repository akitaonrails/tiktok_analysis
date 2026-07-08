package com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem;

import X.C01GW;
import X.C03C8;
import X.C03DZ;
import X.C041G;
import X.C042W;
import X.C042X;
import X.C042Y;
import X.C046T;
import X.C047J;
import X.C049X;
import X.C049Y;
import X.C04AS;
import X.C04AT;
import X.C04FA;
import X.C0DXR;
import X.C0H1U;
import X.C0H9H;
import X.C10296040w;
import X.C10468047m;
import X.C10469047n;
import X.C10515049h;
import X.C13LQ;
import X.C1697810uHb;
import X.C16GA;
import X.C1748720vbi;
import X.C19719612Di;
import X.C2217381BqS;
import X.C23271099x;
import X.C418440Gaw;
import X.C452501pT;
import X.C706202pI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C948503nH;
import X.InterfaceC10470047o;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObjectS208S0300000_1;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuImprovementConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuPromotionAndScreenEfficiencyConfig;
import com.ss.android.ugc.aweme.ecommerce.core.view.skc.SkuExpandableFlowLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.core.view.skc.SkuGridLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import g1c.AjS60S0100000_1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS23S0202000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS4S1202000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS86S1000000_1;
import kotlin.jvm.internal.Intrinsics;
import o5b.a;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuBodyReusedAssem extends SkuPanelBaseReusedAssem<SkuBodyReusedAssem, C706202pI> implements InterfaceC10470047o {
    public final LinkedList<C04FA> LLJLIL = new LinkedList<>();
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1400));
    public final String LLJLL = "SkuBodyAssem init error";
    public ConstraintLayout LLJLLIL;
    public ConstraintLayout LLJLLL;
    public LinearLayout LLJZ;
    public TuxTextView LLJZIJLIL;
    public TuxTextView LLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b3a;
    }

    public final a Bp() {
        return (a) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem
    public final void Ap() {
        LinearLayout linearLayout;
        this.LLJLLIL = (ConstraintLayout) op(R.id.dyr);
        this.LLJLLL = (ConstraintLayout) op(R.id.dyu);
        this.LLJZ = (LinearLayout) op(R.id.vw_);
        this.LLJZIJLIL = (TuxTextView) op(R.id.yyv);
        this.LLL = (TuxTextView) op(R.id.yyw);
        ConstraintLayout constraintLayout = this.LLJLLIL;
        if (constraintLayout != null) {
            C0H1U.LIZIZ(constraintLayout);
        }
        ConstraintLayout constraintLayout2 = this.LLJLLL;
        if (constraintLayout2 != null) {
            C0H1U.LIZIZ(constraintLayout2);
        }
        LinearLayout linearLayout2 = this.LLJZ;
        if (linearLayout2 == null || linearLayout2.getChildCount() <= 0 || (linearLayout = this.LLJZ) == null) {
            return;
        }
        C786410Ut5.LJJJJJL(linearLayout);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem
    public final void zp() {
        getViewModel().s60(new C2217381BqS() { // from class: X.046y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getKeyBoardVisibility();
            }
        }, new AwS580S0100000_1((InterfaceC10470047o) this, 1136));
        getViewModel().TQ2(new C2217381BqS() { // from class: X.042N
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuDataState();
            }
        }, new C2217381BqS() { // from class: X.042K
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getForceRefresh();
            }
        }, new AwS615S0100000_1(this, 354));
        C948503nH.LJI(getViewModel(), C23271099x.INSTANCE, new C10468047m(this, null));
    }

    public final void Ep(Map<Integer, SaleProp> map) {
        SizeGuide sizeGuide;
        int iLIZIZ;
        RecyclerView.LayoutManager layoutManager;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ProductBase productBase;
        ProductPackStruct productPackStruct = getViewModel().LLJIJIL;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
            sizeGuide = productBase.sizeGuide;
        } else {
            sizeGuide = null;
        }
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            SaleProp saleProp = (SaleProp) entry.getValue();
            C04FA c04fa = (C04FA) C19719612Di.LJJIIZI(this.LLJLIL);
            C04FA c04fa2 = c04fa;
            if (c04fa == null) {
                c04fa2 = new C04FA(sp(), tp(), Bp());
            }
            C16GA c16ga = new C16GA(-1, -2);
            if (!EcomSkuPromotionAndScreenEfficiencyConfig.LIZ()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            }
            ((LinearLayout.LayoutParams) c16ga).topMargin = iLIZIZ;
            c04fa2.setTextLayoutMargin(Bp().LJFF);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c04fa2);
            c04fa2.setLayoutParams(c16ga);
            if (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ()) {
                up();
                C0H1U.LJIIJ(C046T.LJIILIIL(), c04fa2);
                up();
                C0H1U.LJII(C046T.LJIIL(), c04fa2);
            }
            c04fa2.j0();
            if (EcomSkuImprovementConfig.LIZ() && Intrinsics.LJFF(saleProp.hasImage, Boolean.TRUE)) {
                SkuGridLayoutManager layoutManager2 = c04fa2.getLayoutManager();
                SkuGridLayoutManager skuGridLayoutManager = layoutManager2;
                if (layoutManager2 == null) {
                    skuGridLayoutManager = new SkuGridLayoutManager(sp());
                }
                skuGridLayoutManager.LLJIJIL = Bp().LJJI();
                C0DXR c10469047n = new C10469047n(Bp().LJJI());
                RecyclerView specListFromXml = c04fa2.getSpecListFromXml();
                layoutManager = skuGridLayoutManager;
                if (specListFromXml != null) {
                    specListFromXml.addItemDecoration(c10469047n);
                    layoutManager = skuGridLayoutManager;
                }
            } else {
                up();
                SkuExpandableFlowLayoutManager skuExpandableFlowLayoutManager = new SkuExpandableFlowLayoutManager();
                skuExpandableFlowLayoutManager.LL = Bp().LJI;
                skuExpandableFlowLayoutManager.LL = Bp().LJI;
                layoutManager = skuExpandableFlowLayoutManager;
            }
            c04fa2.setLayoutManager(layoutManager);
            Gp(c04fa2, iIntValue, saleProp, sizeGuide);
            int i = Bp().LJ;
            ViewGroup.LayoutParams layoutParams = c04fa2.getSpecListFromXml().getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = i;
                }
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.p6(c04fa2.getSpecListFromXml(), marginLayoutParams);
            C1748720vbi.LJFF(c04fa2, new C10515049h(), new AwS545S0100000_1(saleProp, 1398), new AwS367S0200000_1(this, saleProp, 122));
            LinearLayout linearLayout = this.LLJZ;
            if (linearLayout != null) {
                linearLayout.addView(c04fa2);
            }
            c04fa2.setClickListener(this);
        }
    }

    public final void Fp(List<SaleProp> list) {
        ProductBase productBase;
        SizeGuide sizeGuide;
        ConstraintLayout constraintLayout = this.LLJLLL;
        if (constraintLayout != null) {
            C03DZ.LIZJ(constraintLayout);
            C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), constraintLayout);
            if (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ()) {
                up();
                C0H1U.LJIIJ(C046T.LJIILIIL(), constraintLayout);
                up();
                C0H1U.LJII(C046T.LJIIL(), constraintLayout);
            } else {
                C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), constraintLayout);
            }
        }
        SpannableStringBuilder spannableStringBuilderLJFF = C041G.LJFF(sp(), list);
        TuxTextView tuxTextView = this.LLJZIJLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(spannableStringBuilderLJFF);
        }
        TuxTextView tuxTextView2 = this.LLJZIJLIL;
        if (tuxTextView2 != null) {
            C1748720vbi.LJFF(tuxTextView2, new C10515049h(), new AwS545S0100000_1(spannableStringBuilderLJFF, 1399), new AwS580S0100000_1(this, 262));
        }
        ProductPackStruct productPackStruct = getViewModel().LLJIJIL;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (sizeGuide = productBase.sizeGuide) != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(sizeGuide.showSalePropId, ((SaleProp) it2.next()).propId)) {
                    TuxTextView tuxTextView3 = this.LLL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setTuxFont(52);
                    }
                    TuxTextView tuxTextView4 = this.LLL;
                    if (tuxTextView4 != null) {
                        C03DZ.LIZJ(tuxTextView4);
                    }
                    TuxTextView tuxTextView5 = this.LLL;
                    if (tuxTextView5 != null) {
                        tuxTextView5.setText(sizeGuide.skuSizeGuideTitle);
                    }
                    TuxTextView tuxTextView6 = this.LLL;
                    if (tuxTextView6 != null) {
                        C786410Ut5.I7(new AjS60S0100000_1(this, 30), tuxTextView6);
                    }
                    TuxTextView tuxTextView7 = this.LLL;
                    if (tuxTextView7 != null) {
                        C1748720vbi.LJFF(tuxTextView7, new C049X(), AFwS185S0000000_1.get$arr$(119), new AwS580S0100000_1(this, 263));
                    }
                    TuxTextView tuxTextView8 = this.LLL;
                    if (tuxTextView8 != null) {
                        C1748720vbi.LJFF(tuxTextView8, new C10515049h(), AFwS185S0000000_1.get$arr$(120), new AwS580S0100000_1(this, 264));
                        return;
                    }
                    return;
                }
            }
        }
        TuxTextView tuxTextView9 = this.LLL;
        if (tuxTextView9 == null) {
            return;
        }
        C0H1U.LIZIZ(tuxTextView9);
    }

    @Override // X.C04FD
    public final void LJLJLLL(SizeGuide sizeGuide) {
        getViewModel().SQ2(tp());
    }

    @Override // X.C04FD
    public final void LLLLZLL(View view) {
        if (view != null) {
            C1748720vbi.LJFF(view, new C049X(), AFwS185S0000000_1.get$arr$(549), AFwS228S0000000_1.get$arr$(931));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
    }

    @Override // X.C04FD
    public final void Tk(int i, int i2, C042Y c042y) {
        boolean z;
        String str;
        int size;
        String[] strArr;
        String str2;
        SizeGuide sizeGuide;
        View childAt;
        C04FA c04fa;
        ViewGroup viewGroup;
        ProductBase productBase;
        List<SaleProp> list;
        List<SaleProp> list2;
        String[] strArr2;
        String str3;
        SkuInfo skuInfo;
        List<SaleProp> list3;
        SizeGuide sizeGuide2;
        C04FA c04fa2;
        SkuExpandableFlowLayoutManager skuExpandableFlowLayoutManager;
        ProductBase productBase2;
        int i3 = 0;
        if (c042y != null && c042y.LLJIJIL != C042W.NOT_EXPANDABLE) {
            z = true;
        } else {
            z = false;
        }
        View childAt2 = null;
        if (z && (skuInfo = getViewModel().LLJ) != null && (list3 = skuInfo.salePropList) != null) {
            int i4 = 0;
            int i5 = 0;
            for (SaleProp saleProp : list3) {
                int i6 = i4 + 1;
                if (i4 >= 0) {
                    SaleProp saleProp2 = saleProp;
                    if (i4 == i) {
                        ProductPackStruct productPackStruct = getViewModel().LLJIJIL;
                        if (productPackStruct != null && (productBase2 = productPackStruct.baseInfo) != null) {
                            sizeGuide2 = productBase2.sizeGuide;
                        } else {
                            sizeGuide2 = null;
                        }
                        LinearLayout linearLayout = this.LLJZ;
                        if (linearLayout != null) {
                            childAt2 = linearLayout.getChildAt(i5);
                        }
                        if ((childAt2 instanceof C04FA) && (c04fa2 = (C04FA) childAt2) != null) {
                            RecyclerView.LayoutManager layoutManager = c04fa2.getSpecListFromXml().getLayoutManager();
                            if ((layoutManager instanceof SkuExpandableFlowLayoutManager) && (skuExpandableFlowLayoutManager = (SkuExpandableFlowLayoutManager) layoutManager) != null) {
                                skuExpandableFlowLayoutManager.LLILLJJLI = !skuExpandableFlowLayoutManager.LLILLJJLI;
                            }
                            Gp(c04fa2, i, saleProp2, sizeGuide2);
                            return;
                        }
                        return;
                    }
                    List<SalePropValue> list4 = saleProp2.salePropValueList;
                    if (list4 != null && list4.size() > 1) {
                        i5++;
                    }
                    i4 = i6;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        SkuPanelState skuPanelState = getViewModel().LLIZ;
        if (skuPanelState != null && (strArr2 = skuPanelState.checkedSkuIds) != null) {
            Object objLJJIIZ = C13LQ.LJJIIZ(i, strArr2);
            if (c042y != null) {
                str3 = c042y.LL;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(objLJJIIZ, str3)) {
                str = "cancel";
            } else {
                str = "select";
            }
        } else {
            str = null;
        }
        if (c042y != null && c042y.LLILZIL && Intrinsics.LJFF(str, "cancel")) {
            return;
        }
        ProductPackStruct productPackStruct2 = getViewModel().LLJIJIL;
        if (productPackStruct2 != null && (list2 = productPackStruct2.saleProps) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        SkuPanelState skuPanelState2 = getViewModel().LLIZ;
        String str4 = "";
        if (skuPanelState2 == null || (strArr = skuPanelState2.checkedSkuIds) == null) {
            strArr = new String[size];
            for (int i7 = 0; i7 < size; i7++) {
                strArr[i7] = "";
            }
        }
        if (strArr.length < size) {
            strArr = new String[size];
            int i8 = 0;
            do {
                strArr[i8] = "";
                i8++;
            } while (i8 < size);
        }
        if (i < strArr.length) {
            if (Intrinsics.LJFF(str, "cancel")) {
                strArr[i] = "";
            } else {
                if (c042y != null && (str2 = c042y.LL) != null) {
                    str4 = str2;
                }
                strArr[i] = str4;
            }
            getViewModel().dc(true, strArr);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            SkuInfo skuInfo2 = getViewModel().LLJ;
            if (skuInfo2 != null && (list = skuInfo2.salePropList) != null) {
                int i9 = 0;
                for (SaleProp saleProp3 : list) {
                    int i10 = i9 + 1;
                    if (i9 >= 0) {
                        SaleProp saleProp4 = saleProp3;
                        List<SalePropValue> list5 = saleProp4.salePropValueList;
                        if (list5 != null && list5.size() > 1) {
                            linkedHashMap.put(Integer.valueOf(i9), saleProp4);
                        }
                        i9 = i10;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            if (true ^ linkedHashMap.isEmpty()) {
                ProductPackStruct productPackStruct3 = getViewModel().LLJIJIL;
                if (productPackStruct3 != null && (productBase = productPackStruct3.baseInfo) != null) {
                    sizeGuide = productBase.sizeGuide;
                } else {
                    sizeGuide = null;
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    SaleProp saleProp5 = (SaleProp) entry.getValue();
                    View contentView = getContentView();
                    if (contentView != null && (viewGroup = (ViewGroup) contentView.findViewById(R.id.vw_)) != null) {
                        childAt = viewGroup.getChildAt(i3);
                    } else {
                        childAt = null;
                    }
                    if ((childAt instanceof C04FA) && (c04fa = (C04FA) childAt) != null) {
                        Gp(c04fa, iIntValue, saleProp5, sizeGuide);
                    }
                    i3++;
                }
            }
        }
        C1748720vbi.LIZIZ(tp(), new C049Y(), new AwS4S1202000_1(this, str, i, i2, c042y, 0));
    }

    public final void Gp(C04FA c04fa, int i, SaleProp saleProp, SizeGuide sizeGuide) {
        String[] strArr;
        List<SkuItem> list;
        SkcInfo skcInfo;
        Integer num;
        String str;
        SizeGuide sizeGuide2;
        Object obj;
        String str2;
        TryOnData tryOnData;
        Map<String, Object> map;
        SkuPanelState skuPanelState = getViewModel().LLIZ;
        Map<String, ? extends Object> mapLIZIZ = null;
        if (skuPanelState != null) {
            strArr = skuPanelState.checkedSkuIds;
        } else {
            strArr = null;
        }
        ProductPackStruct productPackStruct = getViewModel().LLJIJIL;
        if (productPackStruct != null) {
            list = productPackStruct.skus;
        } else {
            list = null;
        }
        ProductPackStruct productPackStruct2 = getViewModel().LLJIJIL;
        if (productPackStruct2 != null) {
            skcInfo = productPackStruct2.skcInfo;
        } else {
            skcInfo = null;
        }
        Boolean viewAllFromLayoutManager = c04fa.getViewAllFromLayoutManager();
        SkuPanelStarter.SkuEnterParams skuEnterParams = getViewModel().LLJI;
        if (skuEnterParams != null) {
            num = skuEnterParams.bizType;
        } else {
            num = null;
        }
        List<C042Y> listLIZIZ = C042X.LIZIZ(i, saleProp, strArr, list, skcInfo, viewAllFromLayoutManager, num);
        if (sizeGuide != null) {
            str = sizeGuide.showSalePropId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, saleProp.propId)) {
            sizeGuide2 = sizeGuide;
        } else {
            sizeGuide2 = null;
        }
        String str3 = saleProp.propName;
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = getViewModel().LLJI;
        if (skuEnterParams2 != null && (map = skuEnterParams2.trackParams) != null) {
            obj = map.get("source_page_type");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        ProductPackStruct productPackStruct3 = getViewModel().LLJIJIL;
        if (productPackStruct3 != null) {
            tryOnData = productPackStruct3.tryOnData;
        } else {
            tryOnData = null;
        }
        C04AS c04as = new C04AS(tryOnData, getViewModel().LLJILJIL, null, null, getViewModel().LLL, "c62226.d49471", sp(), null, tp(), "try_on_clolors_sku", str2, getViewModel().LLJI, null, 4108);
        View viewLIZJ = c04as.LIZJ(saleProp, C047J.LIZ());
        if (viewLIZJ != null) {
            TryOnData tryOnData2 = c04as.LIZ;
            if (tryOnData2 != null) {
                mapLIZIZ = C04AT.LIZIZ(tryOnData2);
            }
            if (!getViewModel().LLLLII) {
                getViewModel().LLLLII = true;
                C10296040w.LIZ.getClass();
                c04as.LJFF(mapLIZIZ, C10296040w.LIZIZ);
            }
            C786410Ut5.I7(new AjS40S0200000_1(c04as, mapLIZIZ, 78), viewLIZJ);
        }
        c04fa.e0(str3, listLIZIZ, i, sizeGuide2, "sku", false, viewLIZJ, new AwS402S0200000_1(sizeGuide, c04fa, 38));
        ECRichText eCRichText = saleProp.salePropInfo;
        if (eCRichText != null) {
            BaseSkuFragment<?> baseSkuFragmentTp = tp();
            String str4 = saleProp.propId;
            TuxTextView salePropInfoFromXml = c04fa.getSalePropInfoFromXml();
            C03C8.LJ(salePropInfoFromXml, eCRichText, "SALE_PROP_INFO", new AObjectS208S0300000_1(c04fa, baseSkuFragmentTp, eCRichText, 2));
            C1748720vbi.LJFF(salePropInfoFromXml, new C10515049h(), new AwS86S1000000_1(str4, 22), new AwS580S0100000_1(eCRichText, 738));
        }
    }

    @Override // X.C04FD
    public final void LLLLZLLLI(View view, int i, int i2, C042Y c042y) {
        if (view != null) {
            C1748720vbi.LJFF(view, new C049X(), new AwS545S0100000_1(c042y, 1823), new AwS23S0202000_1(this, c042y, i, i2, 3));
        }
    }
}
