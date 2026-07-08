package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm;

import X.AnonymousClass0378;
import X.AnonymousClass0408;
import X.AnonymousClass0431;
import X.C004I;
import X.C01GW;
import X.C036I;
import X.C03KN;
import X.C03T3;
import X.C03T5;
import X.C041G;
import X.C044L;
import X.C044U;
import X.C044W;
import X.C044Z;
import X.C045N;
import X.C04J0;
import X.C04JS;
import X.C09IR;
import X.C0PEM;
import X.C1012603xc;
import X.C1025303zf;
import X.C10366043o;
import X.C10379044b;
import X.C10380044c;
import X.C10385044h;
import X.C10417045n;
import X.C10492048k;
import X.C10516049i;
import X.C1120604Zw;
import X.C1121904a9;
import X.C118300cf;
import X.C1389890mGx;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C1748800vbq;
import X.C1758310vrB;
import X.C1761780vwm;
import X.C1763810w03;
import X.C2097908Jt;
import X.C2252331DDr;
import X.C2371409Qy;
import X.C452501pT;
import X.C731902tR;
import X.C756302xN;
import X.C7735030j;
import X.C814703Gf;
import X.C919503ib;
import X.C948503nH;
import X.C955103oL;
import X.C960603pE;
import X.C969603qg;
import X.C987903td;
import X.DialogC1761330vw3;
import X.EnumC10382044e;
import X.EnumC10383044f;
import X.EnumC1756020vnU;
import X.EnumC2252401DDy;
import X.EnumC969503qf;
import X.InterfaceC1758450vrP;
import X.InterfaceC1761400vwA;
import X.InterfaceC1761410vwB;
import X.InterfaceC1761420vwC;
import X.InterfaceC1763870w09;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import Y.AfS53S0110000_1;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.CounterDescription;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.StandardSaleProps;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy.SeaSkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS16S0001000_1;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS43S1300000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS62S1300000_26;
import kotlin.jvm.internal.AwS86S1200000_1;
import kotlin.jvm.internal.AwS88S0201000_1;
import kotlin.jvm.internal.AwS89S0110000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaSkuPanelViewModel extends JediViewModel<SkuState> implements C044Z<SeaSkuPanelViewModel> {
    public Image LLIZ;
    public ProductPrice LLIZLLLIL;
    public AddToCartButton LLJ;
    public SkuPanelState LLJI;
    public SkuInfo LLJIJIL;
    public SkuPanelStarter.SkuEnterParams LLJILJIL;
    public ProductPackStruct LLJILJILJ;
    public Boolean LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public final C2252331DDr LLJJIJIL;
    public final C2252331DDr LLJJJ;
    public final C10385044h LLJJJIL;
    public SkuItem LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public Integer LLJJL;
    public Long LLJJLIIIJLLLLLLLZ;
    public String[] LLJL;
    public InterfaceC420801kM LLJLIL;
    public C987903td LLJLILLLLZIIL;
    public AnonymousClass0431 LLJLL;
    public C045N LLJLLIL;
    public final C1025303zf LLJLLL;
    public String[] LLJZ;
    public final Map<String, Integer> LLJZIJLIL;
    public final Map<String, String> LLL;
    public final List<String> LLLF;
    public int LLLFF;
    public int LLLFFI;
    public int LLLFZ;
    public boolean LLLI;
    public EnumC1756020vnU LLLII;
    public EnumC10382044e LLLIIII;
    public IPdpStarter.PdpEnterParam LLLIIIIL;
    public String LLLIIIL;
    public boolean LLLIIL;
    public final List<Image> LLILZIL = new ArrayList();
    public final List<String> LLILZLL = new ArrayList();
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1425));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(124));
    public int LLJJIJIIJIL = -1;

    @Override // X.C044Z
    public final String getPageName() {
        return "sku";
    }

    @Override // X.AnonymousClass0463
    public final boolean Nc() {
        Integer num;
        SkuItem skuItem = this.LLJJJJ;
        return (skuItem == null || (num = skuItem.promotionLimitQuantity) == null || num.intValue() <= 0) ? false : true;
    }

    @Override // X.AnonymousClass0463
    public final boolean ct() {
        Integer num;
        SkuItem skuItem = this.LLJJJJ;
        return (skuItem == null || (num = skuItem.minBuyQuantity) == null || num.intValue() <= 1) ? false : true;
    }

    @Override // X.C044Z
    public final void dispose() {
        InterfaceC420801kM interfaceC420801kM = this.LLJLIL;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLJLIL = null;
    }

    @Override // X.C044Z
    public final C10379044b er0() {
        return (C10379044b) this.LLJJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet, java.util.LinkedHashSet] */
    public final String hR2() {
        ?? LLIIJI;
        SkuPanelState skuPanelState = this.LLJI;
        String[] strArr = skuPanelState != null ? skuPanelState.checkedSkuIds : null;
        SkuInfo skuInfo = this.LLJIJIL;
        List<SaleProp> list = skuInfo != null ? skuInfo.salePropList : null;
        List listLJJLL = strArr != null ? C13LQ.LJJLL(strArr) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (listLJJLL == null || listLJJLL.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<SaleProp> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().propName;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            LLIIJI = C13LP.LLIIJI(arrayList);
            if (LLIIJI == 0) {
                return null;
            }
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LLIIJI = new LinkedHashSet();
            for (SaleProp saleProp : list) {
                String str2 = saleProp.propName;
                if (str2 != null) {
                    LLIIJI.add(str2);
                }
                List<SalePropValue> list2 = saleProp.salePropValueList;
                if (list2 != null) {
                    Iterator<SalePropValue> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        String str3 = it3.next().propValueId;
                        if (str3 != null) {
                            linkedHashMap.put(str3, saleProp.propName);
                        }
                    }
                }
            }
            Iterator it4 = listLJJLL.iterator();
            while (it4.hasNext()) {
                Object obj = linkedHashMap.get(it4.next());
                if (obj != null) {
                    LLIIJI.remove(obj);
                }
            }
        }
        return (String) C13LP.LJJJLIIL(LLIIJI);
    }

    @Override // X.C044Z
    public final int hf() {
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = 1;
        ml(new AwS580S0100000_1(c118300cf, 283));
        return c118300cf.element;
    }

    public final int jR1() {
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LLJILJIL;
        if (Intrinsics.LJFF(skuEnterParams != null ? skuEnterParams.enterFrom : null, "product_detail")) {
            return 25;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.LLJILJIL;
        if (Intrinsics.LJFF(skuEnterParams2 != null ? skuEnterParams2.enterFrom : null, "shop_review")) {
            return 25;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams3 = this.LLJILJIL;
        return !Intrinsics.LJFF(skuEnterParams3 != null ? skuEnterParams3.enterFrom : null, "product_review") ? 0 : 25;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new SkuState(null, null, null, null, null, null, null, null, null, null, null, "", new C7735030j(1, 200), new Pair(1, new C044L(false, 3)), 0, null, null, false, EnumC10383044f.INIT, null, null, false, new C10366043o(null, null), new Object(), null, null, true, null, null, null, null, null, null, null, null);
    }

    public SeaSkuPanelViewModel() {
        EnumC2252401DDy enumC2252401DDy = EnumC2252401DDy.DROP_LATEST;
        this.LLJJIJIL = C09IR.LIZIZ(0, 1, enumC2252401DDy, 1);
        this.LLJJJ = C09IR.LIZIZ(0, 1, enumC2252401DDy, 1);
        this.LLJJJIL = new C10385044h();
        this.LLJJJJJIL = 1;
        this.LLJJJJLIIL = 1;
        this.LLJLILLLLZIIL = new C987903td("tts", "SEA");
        this.LLJLLL = new C1025303zf();
        this.LLJZIJLIL = new LinkedHashMap();
        this.LLL = new LinkedHashMap();
        this.LLLF = new ArrayList();
        this.LLLII = EnumC1756020vnU.NOCACHE;
        this.LLLIIII = EnumC10382044e.INIT;
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LLJILJIL;
        Integer num = skuEnterParams != null ? skuEnterParams.bizType : null;
        String strLIZIZ = C955103oL.LIZIZ(num);
        int iLJIIJJI = AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(num), "sku", null, null, 12);
        EnumC969503qf.Companion.getClass();
        this.LLJLILLLLZIIL = C969603qg.LIZIZ(iLJIIJJI, "sku", strLIZIZ);
    }

    @Override // X.C044Z
    public final boolean Hc0() {
        ProductPackStruct productPackStructDh = Dh();
        if (productPackStructDh != null && productPackStructDh.LJII()) {
            return true;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ = LLIIIJ();
        if (skuEnterParamsLLIIIJ == null) {
            return false;
        }
        Integer num = skuEnterParamsLLIIIJ.skuType;
        return num != null && num.intValue() == C03T3.SKC.getValue();
    }

    @Override // X.C044Z
    public final Map<String, Object> Zt() {
        C10380044c c10380044cLIZLLL = C044U.LIZLLL(this);
        return C1741890vQh.LJIIJ(c10380044cLIZLLL != null ? c10380044cLIZLLL.LJI : null);
    }

    @Override // X.C044Z
    public final String getProductId() {
        String str;
        ProductPackStruct productPackStructDh = Dh();
        return (productPackStructDh == null || (str = productPackStructDh.productId) == null) ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.service.vo.Image kR2() {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel.kR2():com.ss.android.ugc.aweme.ecommerce.service.vo.Image");
    }

    public final boolean mR2() {
        List<SaleProp> list;
        ArrayList arrayList;
        ProductPackStruct productPackStructDh = Dh();
        if (productPackStructDh == null || (list = productPackStructDh.saleProps) == null) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<SaleProp> it2 = list.iterator();
        while (it2.hasNext()) {
            List<SalePropValue> list2 = it2.next().salePropValueList;
            if (list2 != null) {
                arrayList = new ArrayList();
                for (SalePropValue salePropValue : list2) {
                    if (salePropValue.salePropTag != null) {
                        arrayList.add(salePropValue);
                    }
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(Boolean.valueOf(C756302xN.LIZ(arrayList)));
        }
        return arrayList2.contains(Boolean.TRUE);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        dispose();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_send_sku_params", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZJ("ec_sku_panel_keyboard_show", this);
        }
        IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter3 != null) {
            iEventCenter3.LIZJ("ec_close_sku_panel_opt", this);
        }
        AnonymousClass0378.LIZ().LIZJ("ec_localized_size_changed", this);
        this.LLJJJIL.LIZ.clear();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_send_sku_params", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZLLL("ec_sku_panel_keyboard_show", this);
        }
        IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter3 != null) {
            iEventCenter3.LIZLLL("ec_close_sku_panel_opt", this);
        }
        AnonymousClass0378.LIZ().LIZLLL("ec_localized_size_changed", this);
    }

    @Override // X.C044Z
    public final String t9() {
        String str;
        C10380044c c10380044cLIZLLL = C044U.LIZLLL(this);
        if (c10380044cLIZLLL != null && (str = c10380044cLIZLLL.LJIIL) != null) {
            return str;
        }
        SkuItem skuItemLLZILL = LLZILL();
        if (skuItemLLZILL != null) {
            return skuItemLLZILL.daInfo;
        }
        return null;
    }

    @Override // X.C044Z
    public final int Bn() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C044Z
    public final C10385044h De0() {
        return this.LLJJJIL;
    }

    @Override // X.C044Z
    public final ProductPackStruct Dh() {
        return this.LLJILJILJ;
    }

    @Override // X.C044Z
    public final AnonymousClass0431 Jt() {
        return this.LLJLL;
    }

    @Override // X.C044Z, X.AnonymousClass0463
    public final SkuPanelStarter.SkuEnterParams LLIIIJ() {
        return this.LLJILJIL;
    }

    @Override // X.C044Z, X.AnonymousClass0463
    public final SkuInfo LLLLZ() {
        return this.LLJIJIL;
    }

    @Override // X.C044Z, X.AnonymousClass0463
    public final SkuItem LLZILL() {
        return this.LLJJJJ;
    }

    @Override // X.C044Z
    public final List<Image> P6() {
        return this.LLILZIL;
    }

    @Override // X.C044Z
    public final C2252331DDr Qv() {
        return this.LLJJJ;
    }

    @Override // X.C044Z
    public final Map<String, String> Te() {
        return this.LLL;
    }

    @Override // X.C044Z
    public final List<String> Tm() {
        return this.LLLF;
    }

    @Override // X.AnonymousClass0463
    public final int Wt() {
        return this.LLJJJJJIL;
    }

    @Override // X.C044Z
    public final Image bi() {
        return this.LLIZ;
    }

    @Override // X.AnonymousClass0463
    public final int c9() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C044Z
    public final Map<String, Integer> ci() {
        return this.LLJZIJLIL;
    }

    @Override // X.C044Z
    public final SkuPanelState dw() {
        return this.LLJI;
    }

    @Override // X.C044Z
    public final String fd() {
        return this.LLJJIJI;
    }

    @Override // X.C044Z
    public final C045N gp() {
        return this.LLJLLIL;
    }

    @Override // X.C044Z, X.AnonymousClass0463
    public final Integer hh() {
        return this.LLJJL;
    }

    @Override // X.C044Z
    public final List<String> jp() {
        return this.LLILZLL;
    }

    @Override // X.C044Z
    public final AddToCartButton nq() {
        return this.LLJ;
    }

    @Override // X.C044Z
    public final String[] st() {
        return this.LLJZ;
    }

    @Override // X.C044Z
    public final IPdpStarter.PdpEnterParam uA0() {
        return this.LLLIIIIL;
    }

    @Override // X.C044Z
    public final Boolean vp() {
        return this.LLJJI;
    }

    @Override // X.C044Z
    public final C987903td w0() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.C044Z
    public final C1025303zf ye() {
        return this.LLJLLL;
    }

    @Override // X.C044Z
    public final int yk() {
        return this.LLLFF;
    }

    public final void Cn(Function1<? super SkuState, Unit> function1) {
        withState(function1);
    }

    @Override // X.C044Z
    public final void Ee(String str) {
        this.LLJJIII = str;
    }

    @Override // X.C044Z
    public final void Fk(boolean z) {
        LJJJZ(new AwS16S0010000_1(z, 8));
    }

    @Override // X.C044Z
    public final void I30(String str) {
        this.LLLIIIL = str;
    }

    @Override // X.C044Z
    public final void Kp(ProductPrice productPrice) {
        this.LLIZLLLIL = productPrice;
    }

    @Override // X.C044Z
    public final void LJJJZ(Function1<? super SkuState, SkuState> function1) {
        setState(function1);
    }

    @Override // X.C044Z
    public final void Ld2(PdpPaymentModule pdpPaymentModule) {
        LJJJZ(new AwS580S0100000_1(pdpPaymentModule, 278));
    }

    @Override // X.C044Z
    public final void Lp(SkuInfo skuInfo) {
        this.LLJIJIL = skuInfo;
    }

    @Override // X.C044Z
    public final void Mm(SkuPanelState skuPanelState) {
        this.LLJI = skuPanelState;
    }

    @Override // X.C044Z
    public final void Pw1(Integer num) {
        this.LLJJL = num;
    }

    @Override // X.C044Z
    public final void Ql(String[] strArr) {
        this.LLJZ = strArr;
    }

    @Override // X.C044Z
    public final void RU0(PromotionLabelVO promotionLabelVO) {
        PromotionLabelVO promotionLabelVO2 = null;
        promotionLabelVO2 = null;
        ArrayList arrayList = null;
        if (promotionLabelVO != null) {
            List<PromotionLabel> list = promotionLabelVO.promotionLabels;
            if (list != null) {
                arrayList = new ArrayList();
                for (PromotionLabel promotionLabel : list) {
                    if (promotionLabel.type != 74) {
                        arrayList.add(promotionLabel);
                    }
                }
            } else if (promotionLabelVO != null) {
            }
            promotionLabelVO2 = new PromotionLabelVO(arrayList, promotionLabelVO.placementLabels, promotionLabelVO.uiStyle, promotionLabelVO.daInfo);
        }
        LJJJZ(new AwS580S0100000_1(promotionLabelVO2, 279));
    }

    @Override // X.C044Z
    public final void U9(String str) {
        this.LLJJIJI = str;
    }

    @Override // X.C044Z
    public final void Vj(AddToCartButton addToCartButton) {
        this.LLJ = addToCartButton;
    }

    public final ProductUnavailableInfo iR2(String[] strArr) {
        SkuCommonConfig skuCommonConfig;
        int iIntValue;
        List<SkuItem> list;
        SkuItem skuItemLIZJ;
        SkuCommonConfig skuCommonConfig2;
        String strLIZ = C036I.LIZ(strArr);
        ProductPackStruct productPackStruct = this.LLJILJILJ;
        if (productPackStruct != null && (list = productPackStruct.skus) != null && (skuItemLIZJ = C731902tR.LIZJ(strLIZ, list)) != null) {
            Integer num = skuItemLIZJ.unavailableInfoId;
            if (num == null) {
                return null;
            }
            int iIntValue2 = num.intValue();
            ProductPackStruct productPackStruct2 = this.LLJILJILJ;
            if (productPackStruct2 == null || (skuCommonConfig2 = productPackStruct2.skuCommonConfig) == null) {
                return null;
            }
            return skuCommonConfig2.LIZIZ(iIntValue2);
        }
        ProductPackStruct productPackStruct3 = this.LLJILJILJ;
        if (productPackStruct3 == null || (skuCommonConfig = productPackStruct3.skuCommonConfig) == null) {
            return null;
        }
        Integer num2 = skuCommonConfig.salePropUnavailableInfoId;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = -1;
        }
        return skuCommonConfig.LIZIZ(iIntValue);
    }

    public final void jR2(boolean z) {
        EnumC10382044e enumC10382044e;
        AddToCartButton addToCartButtonLIZ;
        if (z) {
            Pair pair = (Pair) this.LLJILLL.getValue();
            if (pair != null) {
                y8((EnumC1756020vnU) pair.getSecond());
                int i = C10417045n.LIZ[this.LLLII.ordinal()];
                if (i == 1 || i != 2) {
                    enumC10382044e = EnumC10382044e.CACHE;
                } else {
                    enumC10382044e = EnumC10382044e.BATCH_PRELOAD;
                }
                this.LLLIIII = enumC10382044e;
                ProductPackStruct productPackStruct = (ProductPackStruct) pair.getFirst();
                AddToCartButton addToCartButton = ((ProductPackStruct) pair.getFirst()).addToCartButton;
                if (addToCartButton != null) {
                    addToCartButtonLIZ = AddToCartButton.LIZ(addToCartButton, 2);
                } else {
                    addToCartButtonLIZ = null;
                }
                C044U.LJ(this, ProductPackStruct.LIZ(productPackStruct, null, null, null, null, null, addToCartButtonLIZ, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, -1, -1, 2097151), false, true);
            } else {
                this.LLLIIII = EnumC10382044e.LOADING;
                Fk(true);
            }
        }
        InterfaceC1758450vrP.LIZ.getClass();
        C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
        SkuPanelStarter skuPanelStarter = SkuPanelStarter.LIZ;
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LLJILJIL;
        skuPanelStarter.getClass();
        this.LLJLIL = C1758310vrB.LJJJIL(SkuPanelStarter.LIZIZ(skuEnterParams, null), Boolean.FALSE, null, 2, new C04J0()).LIZJ.LJJLL(new AfS53S0110000_1(this, z, 0), new AfS53S0110000_1(this, z, 1));
    }

    @Override // X.C044Z
    public final void m1(ProductPackStruct productPackStruct) {
        this.LLJILJILJ = productPackStruct;
    }

    @Override // X.C044Z
    public final void mg(Image image) {
        this.LLIZ = image;
    }

    @Override // X.C044Z
    public final void ml(Function1<? super SkuState, Unit> function1) {
        function1.invoke(FQ2());
    }

    public final void nR2(boolean z) {
        boolean z2;
        boolean zBooleanValue;
        Object objLJJJLL;
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LLJILJIL;
        if (skuEnterParams != null) {
            SkuPanelStarter.LIZ.getClass();
            Long l = SkuPanelStarter.LIZJ;
            if (l != null) {
                long jLongValue = l.longValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                HashMap map = new HashMap();
                Map<String, Object> map2 = skuEnterParams.orderRequestParams;
                if (map2 != null) {
                    map.putAll(map2);
                }
                Map<String, Object> map3 = skuEnterParams.visitReportParams;
                if (map3 != null) {
                    map.putAll(map3);
                }
                Map<String, Object> map4 = skuEnterParams.trackParams;
                if (map4 != null) {
                    map.putAll(map4);
                }
                String str = skuEnterParams.pipeParams;
                if (str != null) {
                    map.put("pdp_pipe_params", str);
                }
                int iIntValue = 0;
                if (this.LLJILLL.getValue() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!skuEnterParams.needRequest) {
                    map.put("hit_cache", 2);
                } else if (z2) {
                    map.put("hit_cache", 1);
                } else {
                    map.put("hit_cache", 0);
                }
                map.put("image_count", Integer.valueOf(((ArrayList) this.LLILZIL).size()));
                map.put("is_success", Integer.valueOf(z ? 1 : 0));
                List<Image> list = this.LLILZIL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    List<String> thumbUrls = ((Image) it2.next()).getThumbUrls();
                    if (thumbUrls != null) {
                        objLJJJLL = C13LP.LJJJLL(thumbUrls);
                    } else {
                        objLJJJLL = null;
                    }
                    arrayList.add(objLJJJLL);
                }
                map.put("image_urls", arrayList);
                Boolean bool = skuEnterParams.pdpFullScreen;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                long j = jCurrentTimeMillis - jLongValue;
                Integer num = skuEnterParams.productQuantity;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                new C10492048k(zBooleanValue, j, iIntValue).LIZJ(map);
            }
        }
    }

    public final void pR2(SeaSkuPanelFragment seaSkuPanelFragment) {
        ProductBase productBase;
        SizeGuide sizeGuide;
        ProductBase productBase2;
        Map<String, Object> map;
        ProductPackStruct productPackStruct = this.LLJILJILJ;
        SizeGuide sizeGuide2 = null;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (sizeGuide = productBase.sizeGuide) != null) {
            String str = sizeGuide.skuSizeGuideSchema;
            if (str != null && str.length() != 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                SkuPanelStarter.SkuEnterParams skuEnterParams = this.LLJILJIL;
                if (skuEnterParams != null && (map = skuEnterParams.trackParams) != null) {
                    linkedHashMap.putAll(map);
                }
                for (Map.Entry<String, Object> entry : C1748800vbq.LIZ(seaSkuPanelFragment).entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        linkedHashMap.put(entry.getKey(), value);
                    }
                }
                linkedHashMap.put("previous_page", "sku");
                Context context = seaSkuPanelFragment.getContext();
                if (context != null) {
                    C919503ib.LIZIZ(context, sizeGuide.skuSizeGuideSchema, C2097908Jt.LIZJ(new Pair("track_params", linkedHashMap)), false).open();
                }
            } else {
                String strLJ = C960603pE.LJ(seaSkuPanelFragment);
                FragmentManager fragmentManager = seaSkuPanelFragment.getFragmentManager();
                if (fragmentManager != null) {
                    ProductPackStruct productPackStruct2 = this.LLJILJILJ;
                    if (productPackStruct2 != null && (productBase2 = productPackStruct2.baseInfo) != null) {
                        sizeGuide2 = productBase2.sizeGuide;
                    }
                    C814703Gf.LIZ(fragmentManager, strLJ, sizeGuide2);
                }
            }
            C1748720vbi.LIZIZ(seaSkuPanelFragment, new C10516049i(), AFwS228S0000000_1.get$arr$(362));
        }
    }

    public final void qR2(boolean z) {
        if (this.LLLIIIIL == null) {
            SkuPanelStarter skuPanelStarter = SkuPanelStarter.LIZ;
            SkuPanelStarter.SkuEnterParams skuEnterParams = this.LLJILJIL;
            skuPanelStarter.getClass();
            this.LLLIIIIL = SkuPanelStarter.LIZIZ(skuEnterParams, null);
        }
        C948503nH.LJFF(this, C0PEM.LIZJ, new C044W(this, z, null));
    }

    @Override // X.C044Z
    public final void ua0(EnumC10382044e enumC10382044e) {
        this.LLLIIII = enumC10382044e;
    }

    @Override // X.C044Z
    public final void wc(Boolean bool) {
        this.LLJJI = bool;
    }

    @Override // X.C044Z
    public final void wn(int i) {
        this.LLLFF = i;
    }

    @Override // X.C044Z
    public final void y7(Image image) {
        LJJJZ(new AwS580S0100000_1(image, 287));
    }

    @Override // X.C044Z
    public final void y8(EnumC1756020vnU enumC1756020vnU) {
        if (this.LLLII == EnumC1756020vnU.NOCACHE) {
            this.LLLII = enumC1756020vnU;
        }
    }

    @Override // X.C044Z
    public final void A11(String str, PdpPaymentModule pdpPaymentModule) {
        SkuPanelState skuPanelStateLIZIZ;
        Map<String, PdpPaymentModule> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SkuPanelState skuPanelState = this.LLJI;
        if (skuPanelState != null && (map = skuPanelState.paymentModuleCache) != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put(str, pdpPaymentModule);
        SkuPanelState skuPanelState2 = this.LLJI;
        if (skuPanelState2 != null) {
            skuPanelStateLIZIZ = SkuPanelState.LIZIZ(skuPanelState2, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, linkedHashMap, null, 66584575);
        } else {
            skuPanelStateLIZIZ = null;
        }
        this.LLJI = skuPanelStateLIZIZ;
    }

    @Override // X.C044Z, X.AnonymousClass0463
    public final void Dv(Integer num, String str) {
        String[] strArr;
        SkuItem skuItemLIZJ;
        String str2;
        List<SkuItem> list;
        SkuPanelState skuPanelState = this.LLJI;
        CounterDescription counterDescription = null;
        if (skuPanelState != null && (strArr = skuPanelState.checkedSkuIds) != null) {
            String strLIZ = C036I.LIZ(strArr);
            ProductPackStruct productPackStruct = this.LLJILJILJ;
            if (productPackStruct != null && (list = productPackStruct.skus) != null) {
                skuItemLIZJ = C731902tR.LIZJ(strLIZ, list);
            } else {
                skuItemLIZJ = null;
            }
            if (skuItemLIZJ != null) {
                str2 = skuItemLIZJ.skuId;
            } else {
                str2 = null;
            }
            C10380044c c10380044cLIZ = this.LLJJJIL.LIZ(C03KN.LIZ(Integer.valueOf(hf()), str2, this.LLJJIJI));
            if (c10380044cLIZ != null) {
                counterDescription = c10380044cLIZ.LJIIJJI;
            }
        }
        setState(new AwS43S1300000_1((C044Z) this, (C044Z<ViewModel>) num, (Integer) str, (String) counterDescription, (CounterDescription) 7));
    }

    @Override // X.C044Z
    public final void Fl(int i, C044L c044l) {
        String[] strArr;
        List<SkuItem> list;
        IEventCenter iEventCenter;
        String strLJIIIIZZ;
        withState(new AwS88S0201000_1(i, (int) this, (C044Z<ViewModel>) c044l, (C044L) 5));
        qR2(false);
        SkuPanelState skuPanelState = this.LLJI;
        if (skuPanelState != null && (strArr = skuPanelState.checkedSkuIds) != null) {
            String strLIZ = C036I.LIZ(strArr);
            ProductPackStruct productPackStruct = this.LLJILJILJ;
            if (productPackStruct != null && (list = productPackStruct.skus) != null && C731902tR.LIZJ(strLIZ, list) != null && (iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null)) != null) {
                SkuPanelState skuPanelState2 = this.LLJI;
                if (skuPanelState2 == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(skuPanelState2)) == null) {
                    strLJIIIIZZ = "{}";
                }
                iEventCenter.LIZ("ec_trigger_osp_preload", strLJIIIIZZ);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0660 A[PHI: r2 r3
      0x0660: PHI (r2v17 java.lang.String) = (r2v15 java.lang.String), (r2v18 java.lang.String) binds: [B:442:0x0665, B:438:0x065e] A[DONT_GENERATE, DONT_INLINE]
      0x0660: PHI (r3v7 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton) = 
      (r3v5 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton)
      (r3v8 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton)
     binds: [B:442:0x0665, B:438:0x065e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0682  */
    /* JADX WARN: Type inference failed for: r0v103, types: [T, X.043i] */
    /* JADX WARN: Type inference failed for: r0v187, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v50, types: [T, X.043i] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton] */
    /* JADX WARN: Type inference failed for: r2v35, types: [T, java.lang.String] */
    @Override // X.C044Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dc(boolean r35, java.lang.String[] r36) {
        /*
            Method dump skipped, instruction units count: 1694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel.dc(boolean, java.lang.String[]):void");
    }

    public final void lR2(Integer num, String str) {
        setState(new AwS115S1100000_1(str, num, 17));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Type type;
        Type type2;
        String str3;
        StandardSaleProps standardSaleProps;
        SkuPanelStarter.SkuRenderParams skuRenderParams = null;
        SkuInfo skuInfo = null;
        switch (str.hashCode()) {
            case -1476462034:
                if (str.equals("ec_close_sku_panel_opt")) {
                    LJJJZ(AFwS228S0000000_1.get$arr$(358));
                }
                break;
            case -1196015749:
                if (str.equals("ec_localized_size_changed")) {
                    String str4 = this.LLLIIIL;
                    if (str4 == null || a0.LJJJIL(str4)) {
                        ProductPackStruct productPackStruct = this.LLJILJILJ;
                        if (productPackStruct != null && (standardSaleProps = productPackStruct.localSizeSaleProp) != null) {
                            str3 = standardSaleProps.defaultStandardSign;
                        } else {
                            str3 = null;
                        }
                        this.LLLIIIL = str3;
                    }
                    C03T5.LIZ.getClass();
                    String strLIZIZ = C03T5.LIZIZ();
                    if (!Intrinsics.LJFF(strLIZIZ, this.LLLIIIL)) {
                        this.LLLIIIL = strLIZIZ;
                        ProductPackStruct productPackStructLIZ = C03T5.LIZ(this.LLJILJILJ, false);
                        if (productPackStructLIZ != null) {
                            this.LLJILJILJ = productPackStructLIZ;
                            SkuInfo skuInfo2 = this.LLJIJIL;
                            if (skuInfo2 != null) {
                                skuInfo = new SkuInfo(skuInfo2.skuList, productPackStructLIZ.saleProps, skuInfo2.skuCommonConfig);
                            }
                            this.LLJIJIL = skuInfo;
                            setState(new AwS580S0100000_1(productPackStructLIZ, 285));
                        }
                    }
                }
                break;
            case -49893737:
                if (str.equals("ec_sku_panel_keyboard_show")) {
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type2 = C2371409Qy.LIZJ(C13LE.LJ(SkuPanelStarter.SkuKeyboardVisibilityParams.class));
                        } else {
                            type2 = new TypeToken<SkuPanelStarter.SkuKeyboardVisibilityParams>() { // from class: X.044m
                            }.getType();
                        }
                        Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type2);
                        if (!(objFromJson instanceof SkuPanelStarter.SkuKeyboardVisibilityParams)) {
                            objFromJson = null;
                        }
                        SkuPanelStarter.SkuKeyboardVisibilityParams skuKeyboardVisibilityParams = (SkuPanelStarter.SkuKeyboardVisibilityParams) objFromJson;
                        if (skuKeyboardVisibilityParams != null) {
                            Cn(new AwS89S0110000_1(this, skuKeyboardVisibilityParams.keyboardVisibility, 11));
                        }
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                break;
            case 1117656670:
                if (str.equals("ec_send_sku_params")) {
                    try {
                        Gson gsonLJFF2 = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                            type = C2371409Qy.LIZJ(C13LE.LJII(SkuPanelStarter.SkuRenderParams.class));
                        } else {
                            type = new TypeToken<SkuPanelStarter.SkuRenderParams>() { // from class: X.044l
                            }.getType();
                        }
                        Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, str2, type);
                        if (!(objFromJson2 instanceof SkuPanelStarter.SkuRenderParams)) {
                            objFromJson2 = null;
                        }
                        skuRenderParams = (SkuPanelStarter.SkuRenderParams) objFromJson2;
                    } catch (s e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    C044U.LJI(this, skuRenderParams);
                }
                break;
        }
    }

    public final void rR2(View view, String str) {
        if (str != null && view != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJFF(R.raw.icon_exclamation_mark_circle_fill);
            c1389890mGx.LJII(R.attr.ee);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LJIIJJI();
        }
        SkuPanelState skuPanelState = this.LLJI;
        if (skuPanelState != null && skuPanelState.skuId != null) {
            qR2(true);
        } else {
            jR2(false);
        }
    }

    public final <A> void s60(InterfaceC2217241BqE<SkuState, ? extends A> interfaceC2217241BqE, Function1<? super A, Unit> function1) {
        JediViewModel.bR2(this, interfaceC2217241BqE, null, function1, 2, null);
    }

    public final void sR2(List list, String[] strArr) {
        List<SalePropValue> list2;
        String str;
        Integer num;
        SkuInfo skuInfo;
        List<SkuItem> list3;
        Image imageLJ;
        SkuInfo skuInfo2 = this.LLJIJIL;
        Image image = null;
        if (skuInfo2 != null) {
            SkuPanelStarter.SkuEnterParams skuEnterParams = this.LLJILJIL;
            if (skuEnterParams != null) {
                num = skuEnterParams.bizType;
            } else {
                num = null;
            }
            if (skuInfo2.LIZ(num)) {
                Image image2 = this.LLIZ;
                SkuInfo skuInfo3 = this.LLJIJIL;
                if (skuInfo3 != null && (imageLJ = C041G.LJ(C13LQ.LJJLL(strArr), false, skuInfo3.salePropList, skuInfo3.skuList)) != null) {
                    image2 = imageLJ;
                } else {
                    if (image2 != null) {
                    }
                    skuInfo = this.LLJIJIL;
                    if (skuInfo == null && (list3 = skuInfo.skuList) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (SkuItem skuItem : list3) {
                            if (!Intrinsics.LJFF(skuItem.originalImage, image2)) {
                                arrayList.add(skuItem);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Image image3 = ((SkuItem) it2.next()).originalImage;
                            if (image3 != null) {
                                ((ArrayList) this.LLILZIL).add(image3);
                            }
                        }
                        return;
                    }
                    return;
                }
                y7(image2);
                ((ArrayList) this.LLILZIL).clear();
                ((ArrayList) this.LLILZIL).add(image2);
                skuInfo = this.LLJIJIL;
                if (skuInfo == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        if (Intrinsics.LJFF(strArr[0], "")) {
            if (!((ArrayList) this.LLILZIL).isEmpty()) {
                image = (Image) ListProtector.get(this.LLILZIL, 0);
            }
            LJJJZ(new AwS16S0001000_1(0, 11));
            y7(image);
            return;
        }
        SaleProp saleProp = (SaleProp) C13LP.LJJJLL(list);
        if (saleProp == null || !Intrinsics.LJFF(saleProp.hasImage, Boolean.TRUE) || (list2 = saleProp.salePropValueList) == null || list2.isEmpty()) {
            return;
        }
        List<SalePropValue> list4 = saleProp.salePropValueList;
        int size = list4.size();
        for (int i = 0; i < size; i++) {
            if (u.LJIJI(((SalePropValue) ListProtector.get(list4, i)).propValueId, strArr[0], false)) {
                y7(((SalePropValue) ListProtector.get(list4, i)).image);
                LJJJZ(new AwS16S0001000_1(i, 11));
                SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.LLJILJIL;
                if (skuEnterParams2 == null || (str = skuEnterParams2.productId) == null) {
                    str = "";
                }
                SkuPanelStarter.SkuOperationParams skuOperationParams = new SkuPanelStarter.SkuOperationParams(str, 0);
                IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
                if (iEventCenter != null) {
                    iEventCenter.LIZ("ec_sku_panel_operated", C1741890vQh.LJIIIIZZ(skuOperationParams));
                }
            }
        }
    }

    @Override // X.C044Z
    public final void IG(BuyButton buyButton, String str, Map<String, String> map) {
        LJJJZ(new AwS86S1200000_1(buyButton, (BuyButton) str, (String) map, (Map<String, String>) 10));
    }

    public final void oR2(int i, Context context, final String str, List list) {
        List<Image> list2;
        String str2;
        if (list == null) {
            list2 = this.LLILZIL;
        } else {
            list2 = list;
        }
        final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (final Image image : list2) {
            C1761780vwm c1761780vwm = C1761780vwm.LIZ;
            List<String> list3 = image.toImageUrlModel().LIZ;
            if (list3 == null || (str2 = (String) C13LP.LJJJLL(list3)) == null) {
                str2 = "";
            }
            arrayList.add(C1761780vwm.LIZIZ(c1761780vwm, str2, image.getUri(), new InterfaceC1763870w09() { // from class: X.0vzf
                @Override // X.InterfaceC1763870w09
                public final void LIZ(C21649619o6 c21649619o6, String str3, String str4) {
                    String str5;
                    if (str3 == null) {
                        return;
                    }
                    C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                    C1326840kdG c1326840kdG = C1326840kdG.LIZ;
                    String str6 = c1326840kdG.LIZLLL(str3, false).LIZ;
                    AwS62S1300000_26 awS62S1300000_26 = new AwS62S1300000_26(this.LIZ, c21649619o6, str4, image, 8);
                    c1326790kdB.getClass();
                    if (str6 != null) {
                        str5 = c1326840kdG.LIZLLL(str6, false).LIZ;
                    } else {
                        str5 = null;
                    }
                    C1325420kay.LIZJ(new C1763590vzh(awS62S1300000_26), str5);
                }
            }, 8));
        }
        DialogC1761330vw3 dialogC1761330vw3 = new DialogC1761330vw3(context, false);
        dialogC1761330vw3.LJJLJ(new C1763810w03(false));
        if (list == null) {
            dialogC1761330vw3.LJJLJ(new C1012603xc(this.LLILZLL));
        }
        dialogC1761330vw3.LJJLJLI(new InterfaceC1761400vwA() { // from class: X.03xb
            @Override // X.InterfaceC1761400vwA
            public final void LIZ() {
            }

            @Override // X.InterfaceC1761400vwA
            public final void onPageSelected(int i2) {
                String str3;
                C044V c044v = C044V.LIZ;
                String str4 = str;
                C1762980vyi c1762980vyi = (C1762980vyi) C13LP.LJJJLZIJ(i2, arrayList);
                if (c1762980vyi == null || (str3 = c1762980vyi.LIZIZ) == null) {
                    str3 = "";
                }
                c044v.getClass();
                C044V.LJIIIIZZ(str4, str3);
            }
        });
        dialogC1761330vw3.LLJIJIL = new InterfaceC1761420vwC() { // from class: X.044n
            @Override // X.InterfaceC1761420vwC
            public final void onShow() {
                this.LIZ.LLLI = true;
            }
        };
        dialogC1761330vw3.setOnDismissListener(new C04JS(this, 5));
        dialogC1761330vw3.LLJILJIL = new InterfaceC1761410vwB() { // from class: X.044d
            @Override // X.InterfaceC1761410vwB
            public final boolean LIZ(String str3) {
                return false;
            }

            @Override // X.InterfaceC1761410vwB
            public final void onScreenCaptured() {
                String str3;
                Map<String, Object> map;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                SkuPanelStarter.SkuEnterParams skuEnterParams = this.LIZ.LLJILJIL;
                if (skuEnterParams != null && (map = skuEnterParams.trackParams) != null) {
                    linkedHashMap.putAll(map);
                }
                linkedHashMap.put("page_name", "picture_detail");
                linkedHashMap.put("previous_page", "sku");
                SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.LIZ.LLJILJIL;
                if (skuEnterParams2 == null || (str3 = skuEnterParams2.enterFrom) == null) {
                    str3 = "";
                }
                linkedHashMap.put("enter_from", str3);
                C044V.LIZ.getClass();
                C1018703yb.LIZIZ("tiktokec_screenshot_product_detail", linkedHashMap);
            }
        };
        dialogC1761330vw3.LJJZZI(arrayList);
        dialogC1761330vw3.LJJZZIII(i, null);
    }
}
