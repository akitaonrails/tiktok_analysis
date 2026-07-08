package com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed;

import X.C1173300gdc;
import X.C1174830gg5;
import X.C1182380gsG;
import X.C1183120gtS;
import X.C1183190gtZ;
import X.C1189060h32;
import X.C1189300h3Q;
import X.C1203330hQ3;
import X.C1558360qeg;
import X.C1697810uHb;
import X.C2211631BhB;
import X.C339190DRl;
import X.C427660Gpo;
import X.C438710HIf;
import X.C786410Ut5;
import X.InterfaceC1181010gq3;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import Y.ACListenerS121S0200000_18;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureDetailReviewNoImageCell extends PowerCell<C1183190gtZ> {
    public C1203330hQ3 LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public C427660Gpo LLILZ;
    public TuxTextView LLILZIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C1203330hQ3) this.itemView.findViewById(R.id.r_9);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.r__);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.r_a);
        this.LLILZ = (C427660Gpo) this.itemView.findViewById(R.id.r_b);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.r_c);
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 438));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I5(C1183190gtZ c1183190gtZ) {
        PoiReviewModel poiReviewModel;
        String str;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        C1173300gdc c1173300gdcQr0;
        C1183120gtS c1183120gtS;
        String str2 = null;
        C1189300h3Q.LIZ(C1189060h32.LJIIJ(this), this.itemView, c1183190gtZ.LL, "word", String.valueOf(getBindingAdapterPosition()), null);
        PoiRecommendFeatureDetailFeedItemData poiRecommendFeatureDetailFeedItemData = c1183190gtZ.LL;
        Context context = this.itemView.getContext();
        if (context != null && (poiReviewModel = poiRecommendFeatureDetailFeedItemData.review) != null && (str = poiReviewModel.reviewId) != null) {
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
            if (fragmentLJIIJ != null && (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJIIJ)) != null && (c1173300gdcQr0 = interfaceC1181010gq3LIZ.qr0()) != null && (c1183120gtS = (C1183120gtS) c1173300gdcQr0.LIZ) != null) {
                str2 = c1183120gtS.LIZIZ;
            }
            if (str2 == null) {
                str2 = "";
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//poi/review_list");
            smartRouteBuildRoute.withParam("poi_id", str2);
            smartRouteBuildRoute.withParamStringList("pin_review_ids", C1697810uHb.LJ(str));
            smartRouteBuildRoute.withParamStringList("highlight_review_ids", C1697810uHb.LJ(str));
            smartRouteBuildRoute.withParam("enter_from", "");
            smartRouteBuildRoute.withParam("enter_method", "");
            if (fragmentLJIIJ != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            }
            PoiCommonMobParams poiCommonMobParamsLJ = C1182380gsG.LJ(interfaceC665370Q7zLJFF);
            if (poiCommonMobParamsLJ != null) {
                smartRouteBuildRoute.withParam("poi_common_mob_params", poiCommonMobParamsLJ);
            }
            smartRouteBuildRoute.open();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Double d;
        String str;
        PoiReviewsApi.PoiReviewUserModel poiReviewUserModel;
        String str2;
        UrlModel urlModel;
        PoiReviewsApi.PoiReviewUserModel poiReviewUserModel2;
        PoiReviewsApi.PoiReviewContentModel poiReviewContentModel;
        PoiReviewsApi.PoiReviewContentModel poiReviewContentModel2;
        C1183190gtZ c1183190gtZ = (C1183190gtZ) interfaceC1891350zJl;
        super.onBindItemView(c1183190gtZ);
        PoiReviewModel poiReviewModel = c1183190gtZ.LL.review;
        if (poiReviewModel != null && (poiReviewContentModel2 = poiReviewModel.content) != null) {
            d = poiReviewContentModel2.rating;
        } else {
            d = null;
        }
        if (d != null && d.doubleValue() > 0.0d) {
            C1203330hQ3 c1203330hQ3 = this.LL;
            if (c1203330hQ3 != null) {
                C339190DRl.LIZLLL(c1203330hQ3);
                c1203330hQ3.setValue((float) d.doubleValue());
            }
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                C339190DRl.LIZLLL(tuxTextView);
                tuxTextView.setText(C786410Ut5.k4(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d.doubleValue())}, 1)));
            }
        } else {
            C1203330hQ3 c1203330hQ32 = this.LL;
            if (c1203330hQ32 != null) {
                C339190DRl.LIZIZ(c1203330hQ32);
            }
            TuxTextView tuxTextView2 = this.LLILLJJLI;
            if (tuxTextView2 != null) {
                C339190DRl.LIZIZ(tuxTextView2);
            }
        }
        if (poiReviewModel != null && (poiReviewContentModel = poiReviewModel.content) != null) {
            str = poiReviewContentModel.text;
        } else {
            str = null;
        }
        TuxTextView tuxTextView3 = this.LLILLL;
        if (tuxTextView3 != null) {
            if (str != null && !a0.LJJJIL(str)) {
                C339190DRl.LIZLLL(tuxTextView3);
                tuxTextView3.setText(str);
            } else {
                C339190DRl.LIZIZ(tuxTextView3);
            }
        }
        C427660Gpo c427660Gpo = this.LLILZ;
        if (c427660Gpo != null) {
            if (poiReviewModel != null && (poiReviewUserModel2 = poiReviewModel.author) != null) {
                urlModel = poiReviewUserModel2.avatarThumb;
            } else {
                urlModel = null;
            }
            C427660Gpo.LJIIJJI(c427660Gpo, C438710HIf.LIZ(urlModel), false, null, null, false, false, null, null, false, null, 1022);
        }
        TuxTextView tuxTextView4 = this.LLILZIL;
        if (tuxTextView4 != null) {
            if (poiReviewModel != null && (poiReviewUserModel = poiReviewModel.author) != null && (str2 = poiReviewUserModel.nickname) != null && !a0.LJJJIL(str2)) {
                C339190DRl.LIZLLL(tuxTextView4);
                tuxTextView4.setText(str2);
            } else {
                C339190DRl.LIZIZ(tuxTextView4);
            }
        }
        C786410Ut5.I7(new ACListenerS121S0200000_18(this, c1183190gtZ, 75), this.itemView);
        C427660Gpo c427660Gpo2 = this.LLILZ;
        if (c427660Gpo2 != null) {
            C786410Ut5.T8(c427660Gpo2, new ACListenerS121S0200000_18(this, c1183190gtZ, 76));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e6r, viewGroup, false);
    }
}
