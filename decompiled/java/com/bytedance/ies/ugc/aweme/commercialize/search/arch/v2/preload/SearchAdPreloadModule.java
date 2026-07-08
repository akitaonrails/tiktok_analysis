package com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.preload;

import X.C098200Yq;
import X.C0PEM;
import X.C1007730cKZ;
import X.C1007760cKc;
import X.C1007770cKd;
import X.C1011530cQh;
import X.C15438062q;
import X.C189200o6;
import X.C21146717pB;
import X.C2296808zG;
import X.C23250099c;
import X.EnumC1007720cKY;
import X.EnumC1007780cKe;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ISearchAdPreloadModule;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.model.EnterContext;
import com.ss.android.ugc.aweme.ecommerce.model.GetAnchorMotionInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.ShopAnchorSellingPointData;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS617S0100000_3;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdPreloadModule implements ISearchAdPreloadModule {
    public final Set<EnumC1007780cKe> LIZ = new LinkedHashSet();

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ISearchAdPreloadModule
    public final void LIZ() {
        this.LIZ.clear();
    }

    public final void LJFF() {
        Set<EnumC1007780cKe> set = this.LIZ;
        EnumC1007780cKe enumC1007780cKe = EnumC1007780cKe.BOTTOM_LAYOUT;
        if (set.contains(enumC1007780cKe)) {
            return;
        }
        int i = C1011530cQh.LIZ().enableNewBottomLayout ? R.layout.esk : R.layout.etd;
        SAFHelper.LIZ.getClass();
        C21146717pB.LIZJ(SAFHelper.LJIIIIZZ(null), i);
        this.LIZ.add(enumC1007780cKe);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ISearchAdPreloadModule
    public final Set<EnumC1007780cKe> LIZIZ() {
        return this.LIZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ISearchAdPreloadModule
    public final void LIZJ(String str) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1007760cKc(null, str, this, null), 3);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ISearchAdPreloadModule
    public final void LJ(Aweme aweme) throws JSONException {
        AwemeRawAd awemeRawAd;
        ShopAnchorSellingPointData shopAnchorSellingPoints;
        Object c098200Yq;
        ArrayList arrayList;
        String advId;
        Integer numValueOf;
        ShopAnchorSellingPointData shopAnchorSellingPoints2;
        AwemeSearchAdModel searchAdInfo;
        List<Product> list;
        String string;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (shopAnchorSellingPoints = awemeRawAd.getShopAnchorSellingPoints()) != null && Integer.valueOf(shopAnchorSellingPoints.getPromotionSellingPointType()).intValue() > 0) {
            C1007730cKZ c1007730cKZ = new C1007730cKZ();
            EnumC1007720cKY enumC1007720cKY = EnumC1007720cKY.IDLE;
            c1007730cKZ.LIZIZ = enumC1007720cKY;
            if (aweme != null) {
                c1007730cKZ.LIZ = aweme;
                EnumC1007720cKY enumC1007720cKY2 = EnumC1007720cKY.LOADING;
                if (enumC1007720cKY != enumC1007720cKY2) {
                    c1007730cKZ.LIZIZ = enumC1007720cKY2;
                    try {
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        if (awemeRawAd2 != null && (searchAdInfo = awemeRawAd2.getSearchAdInfo()) != null && (list = searchAdInfo.productsInfo) != null) {
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                            for (Product product : list) {
                                Long l = product.productId;
                                if ((l == null || (string = l.toString()) == null) && (string = product.idStr) == null) {
                                    string = "";
                                }
                                arrayList2.add(string);
                            }
                            arrayList = new ArrayList(arrayList2);
                        } else {
                            arrayList = null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (arrayList != null) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                linkedHashMap.put((String) it2.next(), new EnterContext(2, aweme.getGroupId()));
                            }
                        }
                        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null);
                        if (iECommerceAnchorService != null) {
                            String authorUid = AwemeExtKt.getAuthorUid(aweme);
                            int[] iArr = {2};
                            String aid = aweme.getAid();
                            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                            if (awemeRawAd3 != null) {
                                advId = awemeRawAd3.getAdvId();
                            } else {
                                advId = null;
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                            if (awemeRawAd4 != null && (shopAnchorSellingPoints2 = awemeRawAd4.getShopAnchorSellingPoints()) != null) {
                                numValueOf = Integer.valueOf(shopAnchorSellingPoints2.getPromotionSellingPointType());
                            } else {
                                numValueOf = null;
                            }
                            try {
                                iECommerceAnchorService.LJLJLJ(new GetAnchorMotionInfoRequest(arrayList, authorUid, linkedHashMap, iArr, 1, Boolean.TRUE, aid, "", 1, advId, linkedHashMap2, numValueOf), new AwS595S0100000_16(c1007730cKZ, 317), new AwS617S0100000_3(c1007730cKZ, 33));
                                c098200Yq = Unit.LIZ;
                            } catch (Throwable th) {
                                th = th;
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                        } else {
                            c098200Yq = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        thM5exceptionOrNullimpl.getMessage();
                        c1007730cKZ.LIZ(null);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ISearchAdPreloadModule
    public final void LIZLLL(int i, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1007770cKd(aweme, i, aweme, this, null), 3);
    }
}
