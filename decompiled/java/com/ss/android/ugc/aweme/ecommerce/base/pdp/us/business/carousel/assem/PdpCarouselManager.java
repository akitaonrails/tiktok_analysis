package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem;

import X.C01GW;
import X.C042Y;
import X.C054G;
import X.C09R3;
import X.C0HAU;
import X.C0NJ1;
import X.C0PEM;
import X.C0QSJ;
import X.C1066190dqr;
import X.C1334210kp9;
import X.C1338560kwA;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C1406840miI;
import X.C15438062q;
import X.C1697810uHb;
import X.C1762010vx9;
import X.C2217381BqS;
import X.C23250099c;
import X.C268690Afz;
import X.C268710Ag1;
import X.C268750Ag5;
import X.C432500Gxc;
import X.C452501pT;
import X.C687700QyG;
import X.C703302op;
import X.C7879035x;
import X.EnumC1769850w9n;
import X.EnumC311500CIy;
import X.InterfaceC1065004Em;
import X.InterfaceC1761670vwb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElementsExtension;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.ProductCarouselItemDataModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.transform.TransformDataProviderLogicAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.utils.IPdpImagePreloadService;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpCarouselManager extends TransformDataProviderLogicAssem<InterfaceC1065004Em> implements InterfaceC1065004Em, InterfaceC737790Swr {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final PdpCarouselManager LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public volatile ProductCarouselItemDataModel LLJILJIL;
    public volatile C1762010vx9 LLJILJILJ;
    public volatile InterfaceC1761670vwb LLJILLL;
    public volatile C0NJ1 LLJJ;
    public volatile ISkuManagerAbility LLJJI;
    public InterfaceC665370Q7z LLJJIII;
    public C0QSJ LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpCarouselManager.class, "pdpVMAbility", "getPdpVMAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PdpCarouselManager.class, "pageStateAbility", "getPageStateAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/state/ability/IPDPUnifiedStateAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PdpCarouselManager.class, "skuManager", "getSkuManager()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/sku/ISkuManagerAbility;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.transform.TransformDataProviderLogicAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class});
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.transform.TransformDataProviderLogicAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    public PdpCarouselManager() {
        super(InterfaceC1065004Em.class);
        this.LLILZLL = this;
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(130));
        this.LLJIJIL = true;
    }

    @Override // X.InterfaceC1065004Em
    public final void fh() {
        ProductCarouselItemDataModel productCarouselItemDataModel;
        Collection<List<CarouselElement>> collectionValues;
        Collection<List<CarouselElement>> collectionValues2;
        if (!((Boolean) C268690Afz.LIZ.getValue()).booleanValue() || this.LLJI || (productCarouselItemDataModel = this.LLJILJIL) == null) {
            return;
        }
        this.LLJI = true;
        try {
            CarouselElementsExtension carouselElementsExtension = productCarouselItemDataModel.carouselElementsExtension;
            if (carouselElementsExtension != null) {
                Map<String, List<CarouselElement>> map = carouselElementsExtension.salesPropExtendedImages;
                if (map == null || (collectionValues = map.values()) == null) {
                    collectionValues = C13BV.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    CarouselElement carouselElement = (CarouselElement) C13LP.LJJJLL((List) it2.next());
                    if (carouselElement != null) {
                        arrayList.add(carouselElement);
                    }
                }
                Map<String, List<CarouselElement>> map2 = carouselElementsExtension.skuOriginalImages;
                if (map2 == null || (collectionValues2 = map2.values()) == null) {
                    collectionValues2 = C13BV.INSTANCE;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it3 = collectionValues2.iterator();
                while (it3.hasNext()) {
                    CarouselElement carouselElement2 = (CarouselElement) C13LP.LJJJLL((List) it3.next());
                    if (carouselElement2 != null) {
                        arrayList2.add(carouselElement2);
                    }
                }
                List listLJLIL = C13LP.LJLIL(arrayList2, arrayList);
                ArrayList arrayList3 = (ArrayList) listLJLIL;
                arrayList3.size();
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLJLIL, 10));
                ArrayList arrayList5 = (ArrayList) listLJLIL;
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    Image image = ((CarouselElement) it4.next()).image;
                    arrayList4.add(image != null ? image.getUri() : null);
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    fo((CarouselElement) it5.next(), false, "net");
                }
                IPdpImagePreloadService iPdpImagePreloadService = (IPdpImagePreloadService) this.LLIZLLLIL.getValue();
                if (iPdpImagePreloadService != null) {
                    iPdpImagePreloadService.LIZ(lo().lX().LLLZL, new C1406840miI(listLJLIL));
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final C0QSJ ho() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJIJI;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIII;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJIII = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLJJIJI = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC1761670vwb lo() {
        InterfaceC1761670vwb interfaceC1761670vwb;
        InterfaceC1761670vwb interfaceC1761670vwb2 = this.LLJILLL;
        if (interfaceC1761670vwb2 == null) {
            synchronized (this) {
                interfaceC1761670vwb2 = this.LLJILLL;
                if (interfaceC1761670vwb2 == null) {
                    C0QSJ c0qsjHo = ho();
                    if (c0qsjHo != null) {
                        interfaceC1761670vwb = (InterfaceC1761670vwb) c0qsjHo.getAbility(InterfaceC1761670vwb.class);
                        C687700QyG.LJ(interfaceC1761670vwb, InterfaceC1761670vwb.class);
                    } else {
                        interfaceC1761670vwb = null;
                    }
                    this.LLJILLL = interfaceC1761670vwb;
                    return interfaceC1761670vwb;
                }
            }
        }
        return interfaceC1761670vwb2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.transform.TransformDataProviderLogicAssem
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final /* bridge */ /* synthetic */ InterfaceC1065004Em mo179do() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1065004Em
    public final void C6(boolean z) {
        List<String> listLJJLL;
        Map<String, String> map;
        Object next;
        String uri;
        List<String> thumbUrls;
        String[] strArr;
        if (this.LLJILJIL == null) {
            return;
        }
        ProductCarouselItemDataModel productCarouselItemDataModel = this.LLJILJIL;
        if (lo().lX().LLLI && productCarouselItemDataModel != null) {
            SkuPanelState skuPanelStatePv0 = lo().lX().Pv0();
            String str = null;
            if (skuPanelStatePv0 != null && (strArr = skuPanelStatePv0.checkedSkuIds) != null) {
                listLJJLL = C13LQ.LJJLL(strArr);
            } else {
                listLJJLL = null;
            }
            boolean z2 = false;
            List listUo = uo(so(productCarouselItemDataModel, listLJJLL), false);
            if (listUo != null && !listUo.isEmpty()) {
                if (productCarouselItemDataModel.skcCarouselElements != null) {
                    z2 = true;
                }
                CarouselElementsExtension carouselElementsExtension = productCarouselItemDataModel.carouselElementsExtension;
                if (carouselElementsExtension != null) {
                    map = carouselElementsExtension.salePropToSkuIdMap;
                } else {
                    map = null;
                }
                String strMo = mo(z2, listUo, listLJJLL, map);
                Iterator it2 = listUo.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((CarouselElement) next).elementId, strMo)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                CarouselElement carouselElement = (CarouselElement) next;
                if (carouselElement != null) {
                    Image image = carouselElement.image;
                    if (image != null) {
                        uri = image.getUri();
                    } else {
                        uri = null;
                    }
                    Image image2 = carouselElement.image;
                    if (image2 != null && (thumbUrls = image2.getThumbUrls()) != null) {
                        str = (String) C13LP.LJJJLL(thumbUrls);
                    }
                    String productId = lo().lX().getProductId();
                    if (z) {
                        fo(carouselElement, z2, "net");
                        oo(carouselElement, C13BV.INSTANCE);
                    }
                    if (C703302op.LIZ(uri) && C703302op.LIZ(str)) {
                        C01GW c01gw = C1066190dqr.LIZ;
                        if (!C1066190dqr.LIZLLL(productId, uri)) {
                            C1066190dqr.LJ(lo().lX().LLLZL, C7879035x.LIZ(), productId, str, uri, true, false, null, true);
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1065004Em
    public final void Rn(C042Y c042y) {
        eg(c042y.LLILZ, c042y.LLILZIL);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).unbindAbility(this.LLILZLL, InterfaceC1065004Em.class);
    }

    public final CarouselElement ko(String str) {
        ProductCarouselItemDataModel productCarouselItemDataModel;
        CarouselElementsExtension carouselElementsExtension;
        CarouselElement carouselElement;
        List<CarouselElement> list;
        String str2;
        Map<String, List<CarouselElement>> map;
        List<CarouselElement> list2;
        CarouselElement carouselElement2 = null;
        if (str == null || (productCarouselItemDataModel = this.LLJILJIL) == null || (carouselElementsExtension = productCarouselItemDataModel.carouselElementsExtension) == null) {
            return null;
        }
        Map<String, String> map2 = carouselElementsExtension.salePropToSkuIdMap;
        if (map2 != null && (str2 = map2.get(str)) != null && (map = carouselElementsExtension.skuOriginalImages) != null && (list2 = map.get(str2)) != null) {
            carouselElement = (CarouselElement) C13LP.LJJJLL(list2);
        } else {
            carouselElement = null;
        }
        Map<String, List<CarouselElement>> map3 = carouselElementsExtension.salesPropExtendedImages;
        if (map3 != null && (list = map3.get(str)) != null) {
            Iterator<CarouselElement> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                CarouselElement next = it2.next();
                if (Intrinsics.LJFF(next.salePropValueId, str)) {
                    carouselElement2 = next;
                    break;
                }
            }
            carouselElement2 = carouselElement2;
        }
        if (carouselElement == null) {
            return carouselElement2;
        }
        return carouselElement;
    }

    @Override // X.InterfaceC1065004Em
    public final void nj(C042Y c042y) {
        g4(c042y.LLILZ, c042y.LL, c042y.LLILZIL);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).bindAbility(this.LLILZLL, InterfaceC1065004Em.class);
    }

    public static List uo(List list, boolean z) {
        Integer num;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                CarouselElement carouselElement = (CarouselElement) obj;
                if (C703302op.LIZ(carouselElement.elementId) && (num = carouselElement.elementType) != null) {
                    if (num.intValue() != C0HAU.SALE_PROP_EXTENDED_PLACEHOLDER.getValue()) {
                        Integer num2 = carouselElement.elementType;
                        int value = C0HAU.SKU_ORIGINAL_PLACEHOLDER.getValue();
                        if (num2 == null || num2.intValue() != value) {
                            if (carouselElement.elementDisplayType != null) {
                                int value2 = EnumC311500CIy.PDP_ONLY.getValue();
                                Integer num3 = carouselElement.elementDisplayType;
                                if (num3 == null || value2 != num3.intValue()) {
                                    int value3 = EnumC311500CIy.PDP_AND_GALLERY.getValue();
                                    Integer num4 = carouselElement.elementDisplayType;
                                    if (num4 == null || value3 != num4.intValue()) {
                                    }
                                }
                            }
                            if (z) {
                                Integer num5 = carouselElement.elementType;
                                int value4 = C0HAU.SPARK_CONTAINER.getValue();
                                if (num5 == null || num5.intValue() != value4) {
                                }
                            }
                            arrayList.add(obj);
                        }
                    }
                }
            }
            return arrayList;
        }
        return list;
    }

    @Override // X.InterfaceC1065004Em
    public final void eg(Image image, boolean z) {
        String uri;
        List<CarouselElement> list;
        String uri2;
        if (((Boolean) C268750Ag5.LIZ.getValue()).booleanValue() && C1338560kwA.LIZ().enablePreloadWhenSkuTouch == 1 && image != null && (uri = image.getUri()) != null && this.LLJILJIL != null && !z) {
            try {
                C1762010vx9 c1762010vx9 = this.LLJILJILJ;
                if (c1762010vx9 != null && (list = c1762010vx9.LL) != null) {
                    Iterator<CarouselElement> it2 = list.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        Image image2 = it2.next().image;
                        if (image2 != null) {
                            uri2 = image2.getUri();
                        } else {
                            uri2 = null;
                        }
                        if (!Intrinsics.LJFF(uri2, uri)) {
                            i++;
                        } else {
                            if (i >= 0) {
                                CarouselElement carouselElement = list.get(i);
                                fo(carouselElement, false, "net");
                                IPdpImagePreloadService iPdpImagePreloadService = (IPdpImagePreloadService) this.LLIZLLLIL.getValue();
                                if (iPdpImagePreloadService != null) {
                                    iPdpImagePreloadService.LIZ(lo().lX().LLLZL, new C1406840miI(Collections.singletonList(carouselElement)));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void oo(CarouselElement carouselElement, List<CarouselElement> list) {
        IPdpImagePreloadService iPdpImagePreloadService;
        Image image;
        List<String> urls;
        C054G c054g = lo().lX().LLLZL;
        if (carouselElement != null) {
            Integer num = carouselElement.elementType;
            int value = C0HAU.IMAGE.getValue();
            if (num != null && num.intValue() == value && 1 != 0 && (image = carouselElement.image) != null && (urls = image.getUrls()) != null && C13LP.LJJJLL(urls) != null) {
                C23250099c.LIZLLL(c054g, C0PEM.LIZJ, null, new C432500Gxc(image, null), 2);
            }
        }
        if ((!list.isEmpty()) && (iPdpImagePreloadService = (IPdpImagePreloadService) this.LLIZLLLIL.getValue()) != null) {
            iPdpImagePreloadService.LIZ(c054g, new C1406840miI(list));
        }
    }

    public final List<CarouselElement> so(ProductCarouselItemDataModel productCarouselItemDataModel, List<String> list) {
        Map<String, List<CarouselElement>> map;
        Map<String, List<CarouselElement>> map2;
        List<CarouselElement> list2;
        List<CarouselElement> list3;
        Map<String, List<CarouselElement>> map3 = productCarouselItemDataModel.skcCarouselElements;
        Map<String, String> map4 = null;
        if (map3 != null && list != null && !list.isEmpty()) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                List<CarouselElement> list4 = map3.get(it2.next());
                if (list4 != null) {
                    return list4;
                }
            }
        }
        List<CarouselElement> list5 = productCarouselItemDataModel.carouselElements;
        if (list5 == null) {
            return null;
        }
        CarouselElementsExtension carouselElementsExtension = productCarouselItemDataModel.carouselElementsExtension;
        if (carouselElementsExtension != null) {
            map = carouselElementsExtension.salesPropExtendedImages;
            map2 = carouselElementsExtension.skuOriginalImages;
            map4 = carouselElementsExtension.salePropToSkuIdMap;
        } else {
            map = null;
            map2 = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list5);
        if (list != null) {
            String strVo = vo(list, map4);
            if (strVo != null && map2 != null && (list3 = map2.get(strVo)) != null) {
                arrayList.addAll(list3);
            }
            for (String str : list) {
                if (map != null && (list2 = map.get(str)) != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (CarouselElement carouselElement : list2) {
                        if (Intrinsics.LJFF(carouselElement.salePropValueId, str)) {
                            arrayList4.add(carouselElement);
                        }
                    }
                    arrayList2.addAll(arrayList4);
                }
            }
        }
        Iterator it3 = arrayList3.iterator();
        int i = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Integer num = ((CarouselElement) it3.next()).elementType;
            int value = C0HAU.SKU_ORIGINAL_PLACEHOLDER.getValue();
            if (num != null && num.intValue() == value) {
                if (i >= 0 && (!arrayList.isEmpty())) {
                    arrayList3.addAll(i + 1, arrayList);
                }
            } else {
                i++;
            }
        }
        Iterator it4 = arrayList3.iterator();
        int i2 = 0;
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Integer num2 = ((CarouselElement) it4.next()).elementType;
            int value2 = C0HAU.SALE_PROP_EXTENDED_PLACEHOLDER.getValue();
            if (num2 != null && num2.intValue() == value2) {
                if (i2 >= 0 && (!arrayList2.isEmpty())) {
                    arrayList3.addAll(i2 + 1, arrayList2);
                }
            } else {
                i2++;
            }
        }
        return arrayList3;
    }

    public final String vo(List<String> list, Map<String, String> map) {
        String str;
        boolean z;
        C0NJ1 c0nj1 = this.LLJJ;
        if (c0nj1 == null) {
            synchronized (this) {
                c0nj1 = this.LLJJ;
                if (c0nj1 == null) {
                    C0QSJ c0qsjHo = ho();
                    if (c0qsjHo != null) {
                        c0nj1 = (C0NJ1) c0qsjHo.getAbility(C0NJ1.class);
                        C687700QyG.LJ(c0nj1, C0NJ1.class);
                    } else {
                        c0nj1 = null;
                    }
                    this.LLJJ = c0nj1;
                }
            }
        }
        String str2 = (String) c0nj1.LJ().LIZ("sku_id");
        if (str2 != null) {
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return str2;
            }
        }
        if (list != null) {
            for (String str3 : list) {
                if (map != null && (str = map.get(str3)) != null) {
                    return str;
                }
            }
        }
        return null;
    }

    public final void fo(CarouselElement carouselElement, boolean z, String str) {
        EnumC1769850w9n enumC1769850w9n;
        ArrayList arrayList;
        Integer num = carouselElement.elementType;
        int value = C0HAU.IMAGE.getValue();
        if (num != null && num.intValue() == value) {
            if (z) {
                enumC1769850w9n = EnumC1769850w9n.PDP_SKC_HEADER;
            } else {
                enumC1769850w9n = EnumC1769850w9n.PDP_HEADER;
            }
            Image image = carouselElement.image;
            if (image != null) {
                List<String> urls = image.getUrls();
                if (urls != null) {
                    arrayList = new ArrayList();
                    for (String str2 : urls) {
                        C01GW c01gw = C1066190dqr.LIZ;
                        String strLIZIZ = C1066190dqr.LIZIZ(lo().lX().AR2(), str2);
                        if (strLIZIZ != null) {
                            arrayList.add(strLIZIZ);
                        }
                    }
                } else {
                    arrayList = null;
                }
                image.setUrls(arrayList);
                C1334210kp9.LIZ(image, enumC1769850w9n, null, str, null, null, 244);
            }
        }
    }

    @Override // X.InterfaceC1065004Em
    public final void g4(Image image, String str, boolean z) {
        String uri;
        List<CarouselElement> list;
        CarouselElement carouselElementKo;
        String uri2;
        ProductCarouselItemDataModel productCarouselItemDataModel;
        Map<String, List<CarouselElement>> map;
        List<CarouselElement> list2;
        if (!((Boolean) C268750Ag5.LIZ.getValue()).booleanValue() || C1338560kwA.LIZ().enablePreloadWhenSkuTouch != 1 || this.LLJILJIL == null) {
            return;
        }
        try {
            if (z) {
                if (str != null && (productCarouselItemDataModel = this.LLJILJIL) != null && (map = productCarouselItemDataModel.skcCarouselElements) != null && (list2 = map.get(str)) != null) {
                    List<CarouselElement> listSubList = list2.subList(0, Math.min(2, list2.size()));
                    Iterator<CarouselElement> it2 = listSubList.iterator();
                    while (it2.hasNext()) {
                        fo(it2.next(), true, "net");
                    }
                    CarouselElement carouselElement = (CarouselElement) C13LP.LJJJLL(list2);
                    if (carouselElement != null) {
                        fo(carouselElement, true, "net");
                    }
                    ArrayList arrayList = new ArrayList();
                    for (CarouselElement carouselElement2 : listSubList) {
                        if (carouselElement2 != carouselElement) {
                            arrayList.add(carouselElement2);
                        }
                    }
                    oo(carouselElement, arrayList);
                    return;
                }
                return;
            }
            if (image == null) {
                uri = null;
            } else {
                uri = image.getUri();
            }
            C1762010vx9 c1762010vx9 = this.LLJILJILJ;
            if (c1762010vx9 != null) {
                list = c1762010vx9.LL;
            } else {
                list = null;
            }
            if (uri != null && list != null) {
                Iterator<CarouselElement> it3 = list.iterator();
                int i = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Image image2 = it3.next().image;
                    if (image2 != null) {
                        uri2 = image2.getUri();
                    } else {
                        uri2 = null;
                    }
                    if (!Intrinsics.LJFF(uri2, uri)) {
                        i++;
                    } else if (i >= 0 && list != null) {
                        CarouselElement carouselElement3 = list.get(i);
                        List<CarouselElement> listSubList2 = list.subList(Math.max(i - 1, 0), Math.min(i + 2, list.size()));
                        Iterator<CarouselElement> it4 = listSubList2.iterator();
                        while (it4.hasNext()) {
                            fo(it4.next(), false, "net");
                        }
                        fo(carouselElement3, false, "net");
                        ArrayList arrayList2 = new ArrayList();
                        for (CarouselElement carouselElement4 : listSubList2) {
                            if (carouselElement4 != carouselElement3) {
                                arrayList2.add(carouselElement4);
                            }
                        }
                        oo(carouselElement3, arrayList2);
                        return;
                    }
                }
            }
            if (((Boolean) C268690Afz.LIZ.getValue()).booleanValue() && (carouselElementKo = ko(str)) != null) {
                fo(carouselElementKo, false, "net");
                oo(carouselElementKo, C13BV.INSTANCE);
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final String mo(boolean z, List list, List list2, Map map) {
        boolean z2;
        boolean z3;
        if (z) {
            CarouselElement carouselElement = (CarouselElement) C13LP.LJJJLZIJ(0, list);
            if (carouselElement == null) {
                return null;
            }
            return carouselElement.elementId;
        }
        String strVo = vo(list2, map);
        if (((Boolean) C268710Ag1.LIZ.getValue()).booleanValue() && strVo != null) {
            ISkuManagerAbility iSkuManagerAbility = this.LLJJI;
            if (iSkuManagerAbility == null) {
                synchronized (this) {
                    iSkuManagerAbility = this.LLJJI;
                    if (iSkuManagerAbility == null) {
                        C0QSJ c0qsjHo = ho();
                        if (c0qsjHo != null) {
                            iSkuManagerAbility = (ISkuManagerAbility) c0qsjHo.getAbility(ISkuManagerAbility.class);
                        } else {
                            iSkuManagerAbility = null;
                        }
                        this.LLJJI = iSkuManagerAbility;
                    }
                }
            }
            if (iSkuManagerAbility != null && !iSkuManagerAbility.FK2()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                return null;
            }
        }
        if (strVo != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    CarouselElement carouselElement2 = (CarouselElement) obj;
                    String str = carouselElement2.skuId;
                    if (str != null && Intrinsics.LJFF(str, strVo)) {
                        return carouselElement2.elementId;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        int i3 = 0;
        for (Object obj2 : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                CarouselElement carouselElement3 = (CarouselElement) obj2;
                String str2 = carouselElement3.salePropValueId;
                if (str2 != null) {
                    if (list2 != null && list2.contains(str2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return carouselElement3.elementId;
                    }
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0133  */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselManager] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [X.13BV] */
    @Override // X.InterfaceC1065004Em
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1762010vx9 kk(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.ProductCarouselItemDataModel r30, boolean r31, boolean r32, boolean r33, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist r34, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData r35) {
        /*
            Method dump skipped, instruction units count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselManager.kk(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.ProductCarouselItemDataModel, boolean, boolean, boolean, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData):X.0vx9");
    }
}
