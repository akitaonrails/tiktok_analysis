package kotlin.jvm.internal;

import X.C09AY;
import X.C1389890mGx;
import X.C13MA;
import X.C13NY;
import X.C13OY;
import X.C14C1;
import X.C14CR;
import X.C14CW;
import X.C197039127h;
import X.C23250099c;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductDetailData;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductVariant;
import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ui.sheet.ShopifySkuCheckoutBottomSheet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS81S0210000_30 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS81S0210000_30 awS81S0210000_30, Object obj) {
        Boolean available;
        C197039127h c197039127h;
        ShopifySkuCheckoutProductVariant shopifySkuCheckoutProductVariant;
        ShopifySkuCheckoutProductVariant shopifySkuCheckoutProductVariant2;
        ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData = (ShopifySkuCheckoutProductDetailData) obj;
        if (shopifySkuCheckoutProductDetailData != null) {
            ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet = (ShopifySkuCheckoutBottomSheet) awS81S0210000_30.l0;
            shopifySkuCheckoutBottomSheet.LJIIL = shopifySkuCheckoutProductDetailData.rawResponse;
            Map map = (Map) awS81S0210000_30.l1;
            boolean z = awS81S0210000_30.z2;
            shopifySkuCheckoutBottomSheet.LIZIZ(map, shopifySkuCheckoutProductDetailData);
            if (!z) {
                shopifySkuCheckoutBottomSheet.LJFF = false;
                shopifySkuCheckoutBottomSheet.LJII();
            }
            ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData2 = shopifySkuCheckoutBottomSheet.LIZLLL;
            if (shopifySkuCheckoutProductDetailData2 != null && (shopifySkuCheckoutProductVariant2 = shopifySkuCheckoutProductDetailData2.selectedOrFirstAvailableVariant) != null) {
                shopifySkuCheckoutProductVariant2.getVariantId();
            }
            ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData3 = shopifySkuCheckoutBottomSheet.LIZLLL;
            if (shopifySkuCheckoutProductDetailData3 != null && (shopifySkuCheckoutProductVariant = shopifySkuCheckoutProductDetailData3.selectedOrFirstAvailableVariant) != null) {
                available = shopifySkuCheckoutProductVariant.getAvailable();
            } else {
                available = null;
            }
            if (Intrinsics.LJFF(available, Boolean.TRUE)) {
                C14CW c14cw = shopifySkuCheckoutBottomSheet.LIZJ;
                if (c14cw != null) {
                    c14cw.LIZ(true);
                }
            } else {
                C14CW c14cw2 = shopifySkuCheckoutBottomSheet.LIZJ;
                if (c14cw2 != null && (c197039127h = c14cw2.LJIIL) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c197039127h);
                    c1389890mGx.LJIIIZ(2131850927);
                    c1389890mGx.LJIIJJI();
                }
            }
            if (shopifySkuCheckoutBottomSheet.LJII) {
                IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
                if (iAdWebUtils != null) {
                    iAdWebUtils.hv(shopifySkuCheckoutBottomSheet.LIZIZ.awemeRawAd);
                }
                shopifySkuCheckoutBottomSheet.LJII = false;
            }
            C23250099c.LIZLLL(shopifySkuCheckoutBottomSheet.LJIIIZ, null, null, new C14C1(shopifySkuCheckoutBottomSheet, null), 3);
            ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet2 = (ShopifySkuCheckoutBottomSheet) awS81S0210000_30.l0;
            C14CR.LJ(shopifySkuCheckoutBottomSheet2.LIZIZ.cacheKey, shopifySkuCheckoutBottomSheet2.LIZLLL);
        } else {
            C14CW c14cw3 = ((ShopifySkuCheckoutBottomSheet) awS81S0210000_30.l0).LIZJ;
            if (c14cw3 != null) {
                c14cw3.LJIIL.setLoading(false);
            }
            ((ShopifySkuCheckoutBottomSheet) awS81S0210000_30.l0).LJFF(2);
            ((ShopifySkuCheckoutBottomSheet) awS81S0210000_30.l0).LIZLLL(new IllegalStateException("product parse failed"), awS81S0210000_30.z2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS81S0210000_30 awS81S0210000_30, Object obj) {
        Effect effect = (Effect) obj;
        final C13MA c13ma = (C13MA) awS81S0210000_30.l1;
        C13NY c13ny = new C13NY() { // from class: X.13M1
            @Override // X.C13NY
            public final void onProgress(Effect effect2, int i, long j) {
            }

            @Override // X.C13NY
            public final void onStart(Effect effect2) {
            }

            @Override // X.C13MA
            public final void onSuccess(Effect effect2) {
                C13MA<Effect> c13ma2;
                if (effect2 != null && (c13ma2 = c13ma) != null) {
                    c13ma2.onSuccess(effect2);
                }
            }

            @Override // X.C13MA
            public final /* bridge */ /* synthetic */ void preProcess(Effect effect2) {
            }

            @Override // X.C13MA
            public final void onFail(Effect effect2, C1662010tLr c1662010tLr) {
                C13MA<Effect> c13ma2 = c13ma;
                if (c13ma2 != null) {
                    c13ma2.onFail(effect2, c1662010tLr);
                }
            }
        };
        if (awS81S0210000_30.z2) {
            ((C13OY) awS81S0210000_30.l0).LJIILLIIL().LIZLLL(effect, false, false, false, false, c13ny, true);
        } else {
            ((C13OY) awS81S0210000_30.l0).LJ(effect, c13ny);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS81S0210000_30(C13OY c13oy, C13MA c13ma, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = c13oy;
        this.l1 = c13ma;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS81S0210000_30(ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet, ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet2, Map<String, String> map, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = shopifySkuCheckoutBottomSheet;
        this.l1 = shopifySkuCheckoutBottomSheet2;
        this.z2 = map;
    }
}
