package com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel;

import X.C115500cD;
import X.C15438062q;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionSticker;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceUiConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class EcCommentAnchorPanelViewModel extends ViewModel {
    public static final /* synthetic */ int LLILZIL = 0;
    public AwemePruningModel LLILLJJLI;
    public boolean LLILZ;
    public final MutableLiveData<GetItemProductInfoResponseData> LL = new MutableLiveData<>();
    public List<AnchorProductInfoModel> LLILLL = new ArrayList();

    public final void vQ2(GetItemProductInfoResponseData getItemProductInfoResponseData) {
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        PriceUiConfig priceUiConfig;
        List<PromotionLabel> list;
        if (getItemProductInfoResponseData != null) {
            List<AnchorProductInfo> list2 = getItemProductInfoResponseData.products;
            if (list2 != null) {
                for (AnchorProductInfo anchorProductInfo : list2) {
                    HashMap map = new HashMap();
                    PromotionInfo promotionInfo = anchorProductInfo.promotionInfo;
                    if (promotionInfo != null && (list = promotionInfo.promotionLabels) != null) {
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<PromotionLabel> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().daInfo);
                        }
                        C115500cD.LIZ(arrayList, map);
                    }
                    PromotionInfo promotionInfo2 = anchorProductInfo.promotionInfo;
                    List<PromotionSticker> list3 = null;
                    if (promotionInfo2 != null && (promotionProductPrice = promotionInfo2.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
                        PromotionStyleConfig promotionStyleConfig = getItemProductInfoResponseData.promotionStyleConfig;
                        if (promotionStyleConfig != null) {
                            priceUiConfig = promotionStyleConfig.priceUiConfig;
                        } else {
                            priceUiConfig = null;
                        }
                        singlePriceItem.setPriceUiConfig(priceUiConfig);
                    }
                    anchorProductInfo.fillStyleForPromotionTag(getItemProductInfoResponseData.promotionStyleConfig);
                    AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
                    PromotionInfo promotionInfo3 = anchorProductInfo.promotionInfo;
                    if (promotionInfo3 != null) {
                        list3 = promotionInfo3.promotionStickers;
                    }
                    anchorBizUtils.getClass();
                    anchorProductInfo.setPromotionLogExtraInfo(AnchorBizUtils.LJJLIIJ(list3, map));
                }
            }
            this.LL.setValue(getItemProductInfoResponseData);
        }
    }
}
