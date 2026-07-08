package com.ss.android.ugc.aweme.ecommerce.base.pdp.widget;

import X.C01GW;
import X.C04I1;
import X.C1019103yf;
import X.C128Y;
import X.C13LE;
import X.C19719912Dl;
import X.C19EH;
import X.C426750GoL;
import X.C452501pT;
import X.C756302xN;
import X.C786410Ut5;
import X.C960603pE;
import X.EnumC1014603xw;
import X.InterfaceC1074004Hy;
import X.InterfaceC1748810vbr;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.lynx.ReviewFragmentLynx;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PdpReviewClickEvent;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpReviewWidget extends JediBaseWidget {
    public final Fragment LLJ;
    public final C01GW LLJI;

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return R.layout.asy;
    }

    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        String reviewEnterFrom;
        Map<String, Object> map;
        Number reviewPageSource;
        Integer num;
        ProductDetailReview productDetailReview;
        SellerInfo sellerInfo;
        ShopReviewEntry shopReviewEntry;
        ProductDetailReview productDetailReview2;
        ProductDetailReview productDetailReview3;
        this.LLILLJJLI = false;
        String strRR2 = LJI().RR2();
        ProductPackStruct productPackStruct = LJI().LLJILLL;
        HashMap map2 = null;
        Float fValueOf = (productPackStruct == null || (productDetailReview3 = productPackStruct.review) == null) ? null : productDetailReview3.rating;
        ProductPackStruct productPackStruct2 = LJI().LLJILLL;
        Integer numValueOf = (productPackStruct2 == null || (productDetailReview2 = productPackStruct2.review) == null) ? null : productDetailReview2.reviewCount;
        InterfaceC1074004Hy interfaceC1074004Hy = LJI().LLLLLILLIL.LIZJ;
        if (interfaceC1074004Hy != null) {
            try {
                numValueOf = Integer.valueOf(interfaceC1074004Hy.getReviewCount().intValue());
                fValueOf = Float.valueOf(CastFloatProtector.parseFloat(interfaceC1074004Hy.getReviewRating()));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR50, e, null);
            }
        }
        ProductPackStruct productPackStruct3 = LJI().LLJILLL;
        Integer num2 = (productPackStruct3 == null || (shopReviewEntry = productPackStruct3.shopReview) == null) ? null : shopReviewEntry.reviewCount;
        PdpReviewClickEvent pdpReviewClickEvent = LJI().LLLLLILLIL.LIZIZ;
        ProductPackStruct productPackStruct4 = LJI().LLJILLL;
        String str = (productPackStruct4 == null || (sellerInfo = productPackStruct4.sellerInfo) == null) ? null : sellerInfo.sellerId;
        ProductPackStruct productPackStruct5 = LJI().LLJILLL;
        boolean zLIZ = C756302xN.LIZ((productPackStruct5 == null || (productDetailReview = productPackStruct5.review) == null) ? null : productDetailReview.reviewAspectPercentageCards);
        ProductPackStruct productPackStruct6 = LJI().LLJILLL;
        int iIntValue = (productPackStruct6 == null || (num = productPackStruct6.bizType) == null) ? -1 : num.intValue();
        C19EH c19ehLJIIJ = this.LLJ.getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJJ(R.anim.f475bc, R.anim.bd);
        ReviewFragmentLynx reviewFragmentLynx = new ReviewFragmentLynx();
        Bundle bundle = new Bundle();
        if (strRR2 == null) {
            strRR2 = "";
        }
        C786410Ut5.LJJJI("product_id", strRR2, bundle);
        bundle.putInt("review_count", numValueOf != null ? numValueOf.intValue() : 0);
        bundle.putInt("shop_review_cnt", num2 != null ? num2.intValue() : 0);
        bundle.putFloat("review_score", fValueOf != null ? fValueOf.floatValue() : -1.0f);
        C786410Ut5.LJJIJL(bundle, "review_click_event", pdpReviewClickEvent);
        bundle.putInt("page_source", (interfaceC1074004Hy == null || (reviewPageSource = interfaceC1074004Hy.getReviewPageSource()) == null) ? C04I1.DEFAULTPAGE.getValue() : reviewPageSource.intValue());
        if (interfaceC1074004Hy == null || (reviewEnterFrom = interfaceC1074004Hy.getReviewEnterFrom()) == null) {
            reviewEnterFrom = "";
        }
        C786410Ut5.LJJJI("enter_from", reviewEnterFrom, bundle);
        bundle.putInt("review_body_content", LJI().Tg2());
        if (str == null) {
            str = "";
        }
        C786410Ut5.LJJJI("seller_id", str, bundle);
        IPdpStarter.PdpEnterParam pdpEnterParam = LJI().LLJI;
        if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
            map2 = new HashMap(map);
        }
        C786410Ut5.LJJIZ(bundle, "pdp_track_param", map2);
        bundle.putBoolean("is_over_fit_show", zLIZ);
        bundle.putInt("biz_type", iIntValue);
        C128Y c128y = this.LLJ;
        if (c128y instanceof InterfaceC1748810vbr) {
            C960603pE.LJIIJ(bundle, TrackNodeStore.LJFF((InterfaceC1748810vbr) c128y, new AwS580S0100000_1(this, 813)).LL);
        }
        View view = this.LLILZ;
        if (view != null) {
            C426750GoL.LJIIL(view, null, Integer.valueOf(LJI().BR2()), null, null, 29);
        }
        reviewFragmentLynx.setArguments(bundle);
        c19ehLJIIJ.LJIJ(R.id.tgj, reviewFragmentLynx, "ReviewFragmentLynx");
        c19ehLJIIJ.LJIIJ();
    }

    @Override // com.bytedance.widget.Widget
    public final void onDestroy() {
        this.LLILLJJLI = true;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel LJI() {
        return (PdpViewModel) this.LLJI.getValue();
    }

    public PdpReviewWidget(PdpFragment pdpFragment) {
        this.LLJ = pdpFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpViewModel.class);
        this.LLJI = C452501pT.LIZIZ(new AwS260S0300000_16(this, c19719912DlLIZ, c19719912DlLIZ, 25));
    }
}
