package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku;

import X.C041G;
import X.C04AU;
import X.C04AV;
import X.C04AW;
import X.C04AX;
import X.C09R3;
import X.C0NJ1;
import X.C0QSJ;
import X.C1010603xI;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C1AF0;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C23271099x;
import X.C259800zU;
import X.C687700QyG;
import X.C717610SCx;
import X.C717620SCy;
import X.C770702zh;
import X.C948503nH;
import X.C968903qZ;
import X.EnumC1012703xd;
import X.InterfaceC1053504Ab;
import X.InterfaceC1053604Ac;
import X.InterfaceC1053704Ad;
import X.InterfaceC1065004Em;
import X.InterfaceC1146704e9;
import X.InterfaceC1761670vwb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC706902pP;
import X.InterfaceC737790Swr;
import Y.AObjectS404S0100000_30;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DefaultSelection;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PageProductInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpPageDataModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.assem.LogicAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.QuantityNoticeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.AwS16S1210000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuManager extends LogicAssem implements ISkuManagerAbility, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final SkuManager LL = this;
    public SkuPanelState LLILLJJLI;
    public ProductPackStruct LLILLL;
    public boolean LLILZ;
    public PreOrderInfo LLILZIL;
    public volatile C0NJ1 LLILZLL;
    public volatile InterfaceC1761670vwb LLIZ;
    public volatile InterfaceC1065004Em LLIZLLLIL;
    public volatile InterfaceC1053704Ad LLJ;
    public InterfaceC665370Q7z LLJI;
    public C0QSJ LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SkuManager.class, "pageStateAbility", "getPageStateAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/state/ability/IPDPUnifiedStateAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SkuManager.class, "pdpViewModelAbility", "getPdpViewModelAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SkuManager.class, "carouselManager", "getCarouselManager()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/IPdpCarouselMgrAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(SkuManager.class, "godaManager", "getGodaManager()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/goda/IGodaManager;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final void Ig2() {
        String[] strArr;
        List<String> list;
        if (Fi1()) {
            DefaultSelection defaultSelectionU82 = U82();
            if (defaultSelectionU82 == null || (list = defaultSelectionU82.selectedProps) == null || (strArr = (String[]) list.toArray(new String[0])) == null) {
                SkuPanelState skuPanelState = this.LLILLJJLI;
                strArr = skuPanelState != null ? skuPanelState.checkedSkuIds : null;
            }
            SkuPanelState skuPanelState2 = this.LLILLJJLI;
            if (skuPanelState2 != null) {
                skuPanelState2.checkedSkuIds = strArr;
                String[] strArr2 = skuPanelState2.checkedSkuIds;
                if (strArr2 != null) {
                    ProductPackStruct productPackStruct = this.LLILLL;
                    SkuItem skuItemLJIIIZ = productPackStruct != null ? C041G.LJIIIZ(productPackStruct, strArr2) : null;
                    SkuPanelState skuPanelState3 = this.LLILLJJLI;
                    if (skuPanelState3 != null) {
                        skuPanelState3.skuId = skuItemLJIIIZ != null ? skuItemLJIIIZ.skuId : null;
                        skuPanelState3.warehouseId = skuItemLJIIIZ != null ? skuItemLJIIIZ.warehouseId : null;
                        skuPanelState3.voucherInfo = skuItemLJIIIZ != null ? skuItemLJIIIZ.voucherInfo : null;
                        skuPanelState3.link = skuItemLJIIIZ != null ? skuItemLJIIIZ.link : null;
                        skuPanelState3.productQuantity = Integer.valueOf(C041G.LJIIJ(skuPanelState3, skuItemLJIIIZ));
                    }
                }
            }
            int iVZ1 = vZ1(strArr);
            String strWp0 = Wp0(strArr);
            InterfaceC1065004Em interfaceC1065004Em = this.LLIZLLLIL;
            if (interfaceC1065004Em == null) {
                synchronized (this) {
                    interfaceC1065004Em = this.LLIZLLLIL;
                    if (interfaceC1065004Em == null) {
                        C0QSJ c0qsjBo = bo();
                        InterfaceC1065004Em interfaceC1065004Em2 = c0qsjBo != null ? (InterfaceC1065004Em) c0qsjBo.getAbility(InterfaceC1065004Em.class) : null;
                        this.LLIZLLLIL = interfaceC1065004Em2;
                        interfaceC1065004Em = interfaceC1065004Em2;
                        if (interfaceC1065004Em2 != null) {
                        }
                    }
                }
                interfaceC1065004Em.C6(true);
            } else {
                interfaceC1065004Em.C6(true);
            }
            C948503nH.LJ(this, C23271099x.INSTANCE, new C04AV(this, strWp0, strArr, iVZ1, null));
        }
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final boolean FK2() {
        Iterable iterableLJJLL;
        String[] strArr;
        SkuPanelState skuPanelState = this.LLILLJJLI;
        if (skuPanelState == null || (strArr = skuPanelState.checkedSkuIds) == null || (iterableLJJLL = C13LQ.LJJLL(strArr)) == null) {
            iterableLJJLL = C13BV.INSTANCE;
        }
        List<InterfaceC1053604Ac> listKo = ko();
        if (listKo == null) {
            return false;
        }
        Iterator<InterfaceC1053604Ac> it2 = listKo.iterator();
        while (it2.hasNext()) {
            List<SalePropValue> listLIZJ = it2.next().LIZJ();
            if (listLIZJ != null && listLIZJ.size() > 1) {
                Iterator<SalePropValue> it3 = listLIZJ.iterator();
                while (it3.hasNext()) {
                    if (C13LP.LJJJJ(it3.next().propValueId, iterableLJJLL)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final boolean Jl0() {
        List<SkuItem> list;
        SkuPanelState skuPanelState = this.LLILLJJLI;
        T tLJ = 0;
        tLJ = 0;
        String[] strArr = skuPanelState != null ? skuPanelState.checkedSkuIds : null;
        ProductPackStruct productPackStruct = this.LLILLL;
        C259800zU c259800zU = new C259800zU();
        if (strArr != null) {
            String strLIZ = C968903qZ.LIZ(strArr);
            if (productPackStruct != null && (list = productPackStruct.skus) != null) {
                tLJ = C04AW.LJ(strLIZ, list);
            }
            c259800zU.element = tLJ;
        }
        return c259800zU.element != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Mt2() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r0 = r5.LLILLJJLI
            r3 = 0
            if (r0 == 0) goto L38
            java.lang.String r4 = r0.skuId
            if (r4 == 0) goto L38
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r5.LLILLL
            if (r0 == 0) goto L38
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem> r0 = r0.skus
            if (r0 == 0) goto L38
            java.util.Iterator r2 = r0.iterator()
        L15:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem) r0
            java.lang.String r0 = r0.skuId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L15
        L2a:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem r1 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem) r1
            if (r1 == 0) goto L38
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo r0 = r1.preOrderInfo
            if (r0 == 0) goto L38
            r3 = r0
        L33:
            r5.LLILZIL = r3
            return
        L36:
            r1 = r3
            goto L2a
        L38:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r5.LLILLL
            if (r0 == 0) goto L33
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase r0 = r0.baseInfo
            if (r0 == 0) goto L33
            java.lang.Integer r0 = r0.preOrderType
            if (r0 == 0) goto L33
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L33
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r5.LLILLL
            if (r0 == 0) goto L33
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo r3 = r0.preOrderInfo
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.SkuManager.Mt2():void");
    }

    public final C0QSJ bo() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJIJIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJI;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJI = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLJIJIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final PdpPageDataModel m181do() {
        InterfaceC1053704Ad interfaceC1053704Ad = this.LLJ;
        if (interfaceC1053704Ad == null) {
            synchronized (this) {
                interfaceC1053704Ad = this.LLJ;
                if (interfaceC1053704Ad == null) {
                    C0QSJ c0qsjBo = bo();
                    if (c0qsjBo != null) {
                        interfaceC1053704Ad = (InterfaceC1053704Ad) c0qsjBo.getAbility(InterfaceC1053704Ad.class);
                        C687700QyG.LJ(interfaceC1053704Ad, InterfaceC1053704Ad.class);
                    } else {
                        interfaceC1053704Ad = null;
                    }
                    this.LLJ = interfaceC1053704Ad;
                }
            }
        }
        return interfaceC1053704Ad.LIZLLL();
    }

    public final C0NJ1 fo() {
        C0NJ1 c0nj1;
        C0NJ1 c0nj12 = this.LLILZLL;
        if (c0nj12 == null) {
            synchronized (this) {
                c0nj12 = this.LLILZLL;
                if (c0nj12 == null) {
                    C0QSJ c0qsjBo = bo();
                    if (c0qsjBo != null) {
                        c0nj1 = (C0NJ1) c0qsjBo.getAbility(C0NJ1.class);
                        C687700QyG.LJ(c0nj1, C0NJ1.class);
                    } else {
                        c0nj1 = null;
                    }
                    this.LLILZLL = c0nj1;
                    return c0nj1;
                }
            }
        }
        return c0nj12;
    }

    public final InterfaceC1761670vwb ho() {
        InterfaceC1761670vwb interfaceC1761670vwb;
        InterfaceC1761670vwb interfaceC1761670vwb2 = this.LLIZ;
        if (interfaceC1761670vwb2 == null) {
            synchronized (this) {
                interfaceC1761670vwb2 = this.LLIZ;
                if (interfaceC1761670vwb2 == null) {
                    C0QSJ c0qsjBo = bo();
                    if (c0qsjBo != null) {
                        interfaceC1761670vwb = (InterfaceC1761670vwb) c0qsjBo.getAbility(InterfaceC1761670vwb.class);
                        C687700QyG.LJ(interfaceC1761670vwb, InterfaceC1761670vwb.class);
                    } else {
                        interfaceC1761670vwb = null;
                    }
                    this.LLIZ = interfaceC1761670vwb;
                    return interfaceC1761670vwb;
                }
            }
        }
        return interfaceC1761670vwb2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final boolean F11() {
        SkuPanelState skuPanelState;
        SkuPanelState skuPanelState2;
        String[] strArr;
        SaleProp saleProp;
        List<SalePropValue> list;
        DefaultSelection defaultSelectionU82 = U82();
        if (defaultSelectionU82 == null || !Intrinsics.LJFF(defaultSelectionU82.skuPanel, Boolean.TRUE) || (skuPanelState = this.LLILLJJLI) == null || !Intrinsics.LJFF(skuPanelState.isSkuManuallySelected, Boolean.FALSE) || (skuPanelState2 = this.LLILLJJLI) == null || (strArr = skuPanelState2.checkedSkuIds) == null) {
            return false;
        }
        ProductPackStruct productPackStruct = this.LLILLL;
        List<SaleProp> list2 = productPackStruct != null ? productPackStruct.saleProps : null;
        Iterable c717620SCy = new C717620SCy(new AObjectS404S0100000_30(strArr, 4));
        if (!(c717620SCy instanceof Collection) || !((Collection) c717620SCy).isEmpty()) {
            Iterator it2 = c717620SCy.iterator();
            while (true) {
                C717610SCx c717610SCx = (C717610SCx) it2;
                if (!c717610SCx.hasNext()) {
                    break;
                }
                IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                int i = indexedValue.LIZ;
                T t = indexedValue.LIZIZ;
                if (list2 != null && (saleProp = (SaleProp) C13LP.LJJJLZIJ(i, list2)) != null && (list = saleProp.salePropValueList) != null && list.size() > 1 && !Intrinsics.LJFF(t, "")) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final int FC1() {
        List<InterfaceC1053604Ac> listKo = ko();
        if (listKo != null) {
            Iterator<InterfaceC1053604Ac> it2 = listKo.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Integer numLIZ = it2.next().LIZ();
                int value = EnumC1012703xd.COLOR.getValue();
                if (numLIZ != null && numLIZ.intValue() == value) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final boolean Fi1() {
        DefaultSelection defaultSelectionU82 = U82();
        if (defaultSelectionU82 != null) {
            return Intrinsics.LJFF(defaultSelectionU82.pdpPanel, Boolean.TRUE);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final List<InterfaceC1053504Ab> G42() {
        if (so()) {
            PdpPageDataModel pdpPageDataModelM181do = m181do();
            if (pdpPageDataModelM181do != null) {
                return pdpPageDataModelM181do.skus;
            }
            return null;
        }
        ProductPackStruct productPackStruct = this.LLILLL;
        if (productPackStruct != null) {
            return productPackStruct.skus;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final int M01() {
        String[] strArr = (String[]) fo().LJ().LIZ("checked_sku_ids");
        if (strArr != null) {
            return (C04AW.LIZJ(G42(), strArr) > 0 || (strArr != null && C041G.LJIILL(strArr))) ? 1 : 2;
        }
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final DefaultSelection U82() {
        PageProductInfo pageProductInfo;
        if (!so()) {
            ProductPackStruct productPackStruct = this.LLILLL;
            if (productPackStruct != null) {
                return productPackStruct.defaultSelection;
            }
            return null;
        }
        PdpPageDataModel pdpPageDataModelM181do = m181do();
        if (pdpPageDataModelM181do == null || (pageProductInfo = pdpPageDataModelM181do.productInfo) == null) {
            return null;
        }
        return pageProductInfo.defaultSelection;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C04AZ Ww2() {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.SkuManager.Ww2():X.04AZ");
    }

    public final List<InterfaceC1053604Ac> ko() {
        if (so()) {
            PdpPageDataModel pdpPageDataModelM181do = m181do();
            if (pdpPageDataModelM181do != null) {
                return pdpPageDataModelM181do.saleProps;
            }
            return null;
        }
        ProductPackStruct productPackStruct = this.LLILLL;
        if (productPackStruct != null) {
            return productPackStruct.saleProps;
        }
        return null;
    }

    public final SkcInfo lo() {
        if (so()) {
            PdpPageDataModel pdpPageDataModelM181do = m181do();
            if (pdpPageDataModelM181do != null) {
                return pdpPageDataModelM181do.skcInfo;
            }
            return null;
        }
        ProductPackStruct productPackStruct = this.LLILLL;
        if (productPackStruct != null) {
            return productPackStruct.skcInfo;
        }
        return null;
    }

    public final boolean so() {
        PageProductInfo pageProductInfo;
        PdpPageDataModel pdpPageDataModelM181do = m181do();
        if (pdpPageDataModelM181do == null || (pageProductInfo = pdpPageDataModelM181do.productInfo) == null) {
            return false;
        }
        Map<String, String> map = pageProductInfo.experiment;
        return u.LJIJI(map != null ? map.get("enable_sku_selection_page_data") : null, "true", true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final SkuPanelState Pv0() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final PreOrderInfo jw0() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final boolean w52() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final boolean Gw1(String str) {
        String str2;
        SkcInfo skcInfoLo = lo();
        if (skcInfoLo != null) {
            str2 = skcInfoLo.skcPropertyId;
        } else {
            str2 = null;
        }
        return Intrinsics.LJFF(str2, str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final void RE2(SkuPanelState skuPanelState) {
        this.LLILLJJLI = skuPanelState;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final void UE(boolean z) {
        this.LLILZ = z;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final String Wp0(String[] strArr) {
        InterfaceC1053504Ab interfaceC1053504AbOo = oo(strArr);
        if (interfaceC1053504AbOo != null) {
            return interfaceC1053504AbOo.getSkuId();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.05Vn, X.099V, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final void Wu2(IPdpStarter.PdpEnterParam pdpEnterParam) {
        String str;
        SkuPanelState skuPanelState;
        ?? r3;
        char c;
        Map mapLIZJ;
        List<String> list = pdpEnterParam.checkedSkuIds;
        if (list != null && !list.isEmpty()) {
            String[] strArr = (String[]) list.toArray(new String[0]);
            SkuPanelState skuPanelState2 = this.LLILLJJLI;
            if (skuPanelState2 != null) {
                r3 = 0;
                skuPanelState = SkuPanelState.LIZIZ(skuPanelState2, null, null, null, null, strArr, null, null, null, false, 0, null, null, null, null, null, null, 67108847);
                c = 0;
            } else {
                ProductPackStruct productPackStruct = this.LLILLL;
                if (productPackStruct == null || (str = productPackStruct.productId) == null) {
                    str = "";
                }
                r3 = 0;
                c = 0;
                skuPanelState = new SkuPanelState(str, null, null, null, strArr, 1, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, 0, "", null, Boolean.FALSE, null, null);
            }
            this.LLILLJJLI = skuPanelState;
            if (fo().LJ().LIZ("quantity") == null) {
                Pair[] pairArr = new Pair[2];
                pairArr[c] = new Pair("checked_sku_ids", strArr);
                pairArr[1] = new Pair("quantity", 1);
                mapLIZJ = C2097608Jq.LJIIIIZZ(pairArr);
            } else {
                mapLIZJ = C2097908Jt.LIZJ(new Pair("checked_sku_ids", strArr));
            }
            PdpViewModel pdpViewModelLX = ho().lX();
            pdpViewModelLX.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pdpViewModelLX), r3, r3, new C04AX(this, mapLIZJ, r3), 3);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).unbindAbility(this.LL, ISkuManagerAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final Map<String, Object> eG1(String[] strArr) {
        SkuPrice skuPrice;
        String str;
        QuantityNoticeInfo quantityNoticeInfo;
        String daInfo = null;
        if (so()) {
            InterfaceC1053504Ab interfaceC1053504AbOo = oo(strArr);
            if (interfaceC1053504AbOo != null) {
                daInfo = interfaceC1053504AbOo.getDaInfo();
            }
            return C1010603xI.LIZ(daInfo);
        }
        SkuItem skuItemMo = mo(strArr);
        if (skuItemMo != null && (quantityNoticeInfo = skuItemMo.quantityPromotionNoticeInfo) != null) {
            daInfo = quantityNoticeInfo.daInfo;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C1010603xI.LIZ(daInfo));
        if (skuItemMo == null || (skuPrice = skuItemMo.price) == null || (str = skuPrice.discount) == null) {
            return linkedHashMap;
        }
        linkedHashMap.put("discount_percentage", str);
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final void m1(ProductPackStruct productPackStruct) {
        this.LLILLL = productPackStruct;
    }

    public final SkuItem mo(String[] strArr) {
        List<SkuItem> list;
        if (strArr == null) {
            return null;
        }
        String strLIZ = C968903qZ.LIZ(strArr);
        ProductPackStruct productPackStruct = this.LLILLL;
        if (productPackStruct == null || (list = productPackStruct.skus) == null) {
            return null;
        }
        return (SkuItem) C04AW.LJ(strLIZ, list);
    }

    public final InterfaceC1053504Ab oo(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        String strLIZ = C968903qZ.LIZ(strArr);
        List<InterfaceC1053504Ab> listG42 = G42();
        if (listG42 == null) {
            return null;
        }
        return C04AW.LJ(strLIZ, listG42);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).bindAbility(this.LL, ISkuManagerAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final int vZ1(String[] strArr) {
        int iIntValue;
        int iIntValue2;
        InterfaceC706902pP interfaceC706902pP;
        Integer numLIZ;
        Integer numLIZLLL;
        if (strArr == null) {
            strArr = (String[]) fo().LJ().LIZ("checked_sku_ids");
        }
        Integer num = (Integer) fo().LJ().LIZ("quantity");
        int iIntValue3 = 1;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        InterfaceC1053504Ab interfaceC1053504AbOo = oo(strArr);
        if (interfaceC1053504AbOo != null && (numLIZLLL = interfaceC1053504AbOo.LIZLLL()) != null) {
            iIntValue2 = numLIZLLL.intValue();
        } else {
            iIntValue2 = 1;
        }
        if (so()) {
            PdpPageDataModel pdpPageDataModelM181do = m181do();
            if (pdpPageDataModelM181do != null) {
                interfaceC706902pP = pdpPageDataModelM181do.skuCommonConfig;
                if (interfaceC706902pP != null && (numLIZ = interfaceC706902pP.LIZ()) != null) {
                    iIntValue3 = numLIZ.intValue();
                }
            }
        } else {
            ProductPackStruct productPackStruct = this.LLILLL;
            if (productPackStruct != null) {
                interfaceC706902pP = productPackStruct.skuCommonConfig;
                if (interfaceC706902pP != null) {
                    iIntValue3 = numLIZ.intValue();
                }
            }
        }
        return Math.max(iIntValue, Math.max(iIntValue3, iIntValue2));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final boolean EO2(String str, String str2, String[] strArr) {
        String str3;
        String str4;
        List<Skc> list;
        SkcInfo skcInfoLo = lo();
        Skc skc = null;
        if (skcInfoLo != null) {
            str3 = skcInfoLo.skcPropertyId;
        } else {
            str3 = null;
        }
        if (C770702zh.LIZIZ(str3)) {
            SkcInfo skcInfoLo2 = lo();
            if (skcInfoLo2 != null) {
                str4 = skcInfoLo2.skcPropertyId;
            } else {
                str4 = null;
            }
            if (Intrinsics.LJFF(str4, str)) {
                SkcInfo skcInfoLo3 = lo();
                if (skcInfoLo3 != null && (list = skcInfoLo3.skcList) != null) {
                    Iterator<Skc> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Skc next = it2.next();
                        if (Intrinsics.LJFF(next.skcId, str2)) {
                            skc = next;
                            break;
                        }
                    }
                    Skc skc2 = skc;
                    if (skc2 != null && skc2.skcStock > 0) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        }
        if (C04AW.LIZJ(G42(), strArr) > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uo(java.lang.String[] r38, java.lang.Boolean r39, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem, kotlin.Unit> r40, X.InterfaceC1364105Vn<? super kotlin.Unit> r41) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.SkuManager.uo(java.lang.String[], java.lang.Boolean, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility
    public final void ev2(int i, String str, ImageSelectData imageSelectData, View view, AwS16S1210000_26 awS16S1210000_26) {
        int size;
        Object obj;
        String[] strArr;
        Object objLJJIIZ;
        List<InterfaceC1053604Ac> listKo = ko();
        int i2 = 0;
        if (listKo != null) {
            size = listKo.size();
        } else {
            size = 0;
        }
        if (i >= 0 && i < size) {
            String[] strArr2 = new String[size];
            while (true) {
                obj = "";
                if (i2 >= size) {
                    break;
                }
                SkuPanelState skuPanelState = this.LLILLJJLI;
                if (skuPanelState != null && (strArr = skuPanelState.checkedSkuIds) != null && (objLJJIIZ = C13LQ.LJJIIZ(i2, strArr)) != null) {
                    obj = objLJJIIZ;
                }
                strArr2[i2] = obj;
                i2++;
            }
            if (!Intrinsics.LJFF(strArr2[i], str)) {
                obj = str;
            }
            strArr2[i] = obj;
            PdpViewModel pdpViewModelLX = ho().lX();
            pdpViewModelLX.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pdpViewModelLX), null, null, new C04AU(this, strArr2, awS16S1210000_26, i, imageSelectData, str, view, null), 3);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("the sku group id is error : ");
        sbLIZ.append(i);
        sbLIZ.append("  : ");
        sbLIZ.append(size);
        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        awS16S1210000_26.invoke(null);
    }
}
