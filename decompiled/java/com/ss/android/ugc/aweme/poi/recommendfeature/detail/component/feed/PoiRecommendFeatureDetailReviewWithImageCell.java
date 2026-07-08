package com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed;

import X.C1182380gsG;
import X.C1183200gta;
import X.C1189060h32;
import X.C1189300h3Q;
import X.C1189320h3S;
import X.C1203330hQ3;
import X.C123100dR;
import X.C13LP;
import X.C1558360qeg;
import X.C2211631BhB;
import X.C427660Gpo;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewsGalleryActivity;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewsGalleryData;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewsGalleryMobData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureDetailReviewWithImageCell extends PowerCell<C1183200gta> {
    public SmartImageView LL;
    public C1203330hQ3 LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public C427660Gpo LLILZIL;
    public TuxTextView LLILZLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.r_7);
        this.LLILLJJLI = (C1203330hQ3) this.itemView.findViewById(R.id.r_d);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.r_f);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.r_g);
        this.LLILZIL = (C427660Gpo) this.itemView.findViewById(R.id.r_h);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.r_i);
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 439));
    }

    public final void I5(C1183200gta c1183200gta) {
        String uri;
        PoiReviewModel poiReviewModel;
        String str;
        int iIntValue;
        List<PoiReviewsApi.ImageDataModel> list;
        String str2;
        UrlModel urlModel;
        List<String> urlList;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        View view = this.itemView;
        PoiRecommendFeatureDetailFeedItemData poiRecommendFeatureDetailFeedItemData = c1183200gta.LL;
        UrlModel urlModel2 = poiRecommendFeatureDetailFeedItemData.cropAwemeCover;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (urlModel2 != null) {
            uri = urlModel2.getUri();
        } else {
            uri = null;
        }
        C1189300h3Q.LIZ(fragmentLJIIJ, view, poiRecommendFeatureDetailFeedItemData, "picture", String.valueOf(getBindingAdapterPosition()), uri);
        PoiRecommendFeatureDetailFeedItemData poiRecommendFeatureDetailFeedItemData2 = c1183200gta.LL;
        Context context = this.itemView.getContext();
        if (context != null && (poiReviewModel = poiRecommendFeatureDetailFeedItemData2.review) != null) {
            ArrayList arrayList = new ArrayList();
            PoiReviewsApi.PoiReviewContentModel poiReviewContentModel = poiReviewModel.content;
            if (poiReviewContentModel != null && (list = poiReviewContentModel.images) != null) {
                for (PoiReviewsApi.ImageDataModel imageDataModel : list) {
                    if (imageDataModel != null && (urlModel = imageDataModel.originImage) != null && (urlList = urlModel.getUrlList()) != null) {
                        str2 = (String) C13LP.LJJJLL(urlList);
                    } else {
                        str2 = null;
                    }
                    if (C123100dR.LIZ(str2)) {
                        arrayList.add(str2);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                View view2 = this.LL;
                if (view2 == null) {
                    view2 = this.itemView;
                }
                Integer num = poiRecommendFeatureDetailFeedItemData2.reviewImageIndex;
                int iIntValue2 = 0;
                if (num != null && (iIntValue = num.intValue()) >= 0 && iIntValue < arrayList.size()) {
                    iIntValue2 = num.intValue();
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://poi/reviews/preview");
                smartRouteBuildRoute.withParam("images", arrayList);
                smartRouteBuildRoute.withParam("index", iIntValue2);
                String str3 = PoiReviewsGalleryActivity._pnsPageId;
                smartRouteBuildRoute.withParam("origin_pos", C1189320h3S.LIZ(view2, arrayList));
                smartRouteBuildRoute.withParam("track_params", new PoiReviewsGalleryMobData("", "", null, null, null, null));
                PoiReviewsApi.PoiReviewUserModel poiReviewUserModel = poiReviewModel.author;
                PoiReviewsApi.PoiReviewContentModel poiReviewContentModel2 = poiReviewModel.content;
                String str4 = poiReviewModel.reviewId;
                String str5 = poiReviewModel.poiId;
                PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel = poiReviewModel.statistics;
                Integer num2 = poiReviewModel.source;
                boolean zIsAnonymous = poiReviewModel.isAnonymous();
                PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel = poiReviewModel.userStatus;
                String str6 = poiReviewModel.serverParam;
                PoiReviewsApi.PoiReviewContentModel poiReviewContentModel3 = poiReviewModel.content;
                if (poiReviewContentModel3 != null) {
                    str = poiReviewContentModel3.text;
                } else {
                    str = null;
                }
                smartRouteBuildRoute.withParam("reviews_info", new PoiReviewsGalleryData(poiReviewContentModel2, poiReviewUserModel, str4, str5, poiReviewStatisticsModel, num2, Boolean.valueOf(zIsAnonymous), poiReviewUserStatusModel, str6, str, Boolean.FALSE, null, null));
                Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ(this);
                if (fragmentLJIIJ2 != null) {
                    interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ2, null);
                }
                PoiCommonMobParams poiCommonMobParamsLJ = C1182380gsG.LJ(interfaceC665370Q7zLJFF);
                if (poiCommonMobParamsLJ != null) {
                    smartRouteBuildRoute.withParam("poi_common_mob_params", poiCommonMobParamsLJ);
                }
                smartRouteBuildRoute.open();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01d2  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r25) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed.PoiRecommendFeatureDetailReviewWithImageCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e6s, viewGroup, false);
    }
}
