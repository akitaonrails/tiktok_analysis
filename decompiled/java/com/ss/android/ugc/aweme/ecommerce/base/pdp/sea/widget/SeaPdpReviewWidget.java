package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget;

import X.C01GW;
import X.C1019103yf;
import X.C1073704Hv;
import X.C1073804Hw;
import X.C128Y;
import X.C13LE;
import X.C19719912Dl;
import X.C19EH;
import X.C2097908Jt;
import X.C426750GoL;
import X.C452501pT;
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
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PdpReviewClickEvent;
import com.ss.android.ugc.aweme.ecommerce.base.review.sea.SeaReviewLynxFragment;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpReviewWidget extends JediBaseWidget {
    public final Fragment LLJ;
    public final C01GW LLJI;

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return R.layout.awv;
    }

    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        HashMap map;
        Integer num;
        C1073804Hw c1073804Hw;
        String str;
        ProductDetailReview productDetailReview;
        ProductDetailReview productDetailReview2;
        Map<String, Object> map2;
        Integer num2;
        SellerInfo sellerInfo;
        ShopReviewEntry shopReviewEntry;
        ProductDetailReview productDetailReview3;
        ProductDetailReview productDetailReview4;
        this.LLILLJJLI = false;
        LJII().XR2().LIZIZ(C2097908Jt.LIZJ(new Pair("if_review_show", "1")));
        String strVR2 = LJII().VR2();
        ProductPackStruct productPackStruct = LJII().LLJIJIL;
        Float fValueOf = (productPackStruct == null || (productDetailReview4 = productPackStruct.review) == null) ? null : productDetailReview4.rating;
        ProductPackStruct productPackStruct2 = LJII().LLJIJIL;
        Integer numValueOf = (productPackStruct2 == null || (productDetailReview3 = productPackStruct2.review) == null) ? null : productDetailReview3.reviewCount;
        InterfaceC1074004Hy interfaceC1074004Hy = LJII().LLLLLJLJLL.LIZJ;
        if (interfaceC1074004Hy != null) {
            try {
                numValueOf = Integer.valueOf(interfaceC1074004Hy.getReviewCount().intValue());
                fValueOf = Float.valueOf(CastFloatProtector.parseFloat(interfaceC1074004Hy.getReviewRating()));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR50, e, null);
            }
        }
        ProductPackStruct productPackStruct3 = LJII().LLJIJIL;
        Integer num3 = (productPackStruct3 == null || (shopReviewEntry = productPackStruct3.shopReview) == null) ? null : shopReviewEntry.reviewCount;
        PdpReviewClickEvent pdpReviewClickEvent = LJII().LLLLLJLJLL.LIZIZ;
        ProductPackStruct productPackStruct4 = LJII().LLJIJIL;
        String str2 = (productPackStruct4 == null || (sellerInfo = productPackStruct4.sellerInfo) == null) ? null : sellerInfo.sellerId;
        ProductPackStruct productPackStruct5 = LJII().LLJIJIL;
        int iIntValue = (productPackStruct5 == null || (num2 = productPackStruct5.bizType) == null) ? -1 : num2.intValue();
        C19EH c19ehLJIIJ = this.LLJ.getChildFragmentManager().LJIIJ();
        SeaReviewLynxFragment seaReviewLynxFragment = new SeaReviewLynxFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("product_id", strVR2, bundle);
        C786410Ut5.LJJIJL(bundle, "review_click_event", pdpReviewClickEvent);
        if (str2 == null) {
            str2 = "";
        }
        C786410Ut5.LJJJI("seller_id", str2, bundle);
        bundle.putInt("review_body_content", LJII().Tg2());
        IPdpStarter.PdpEnterParam pdpEnterParam = LJII().LLIZ;
        if (pdpEnterParam == null || (map2 = pdpEnterParam.trackParams) == null) {
            map = null;
        } else {
            map = new HashMap(map2);
            Map<String, Object> mapLIZ = LJII().XR2().LIZ();
            if (mapLIZ != null) {
                map.putAll(mapLIZ);
            }
        }
        C786410Ut5.LJJIZ(bundle, "pdp_track_param", map);
        bundle.putInt("biz_type", iIntValue);
        C786410Ut5.LJJJI("pdp_unique_id", LJII().LLLZZIL, bundle);
        ProductPackStruct productPackStruct6 = LJII().LLJIJIL;
        C786410Ut5.LJJJI("product_da_info", (productPackStruct6 == null || (productDetailReview2 = productPackStruct6.review) == null) ? null : productDetailReview2.daInfo, bundle);
        ProductPackStruct productPackStruct7 = LJII().LLJIJIL;
        C786410Ut5.LJJJI("review_page_request_params", (productPackStruct7 == null || (productDetailReview = productPackStruct7.review) == null) ? null : productDetailReview.reviewPageRequestParams, bundle);
        C1073704Hv.LIZ = fValueOf != null ? fValueOf.floatValue() : -1.0f;
        C1073704Hv.LIZIZ = numValueOf != null ? numValueOf.intValue() : 0;
        C1073704Hv.LIZJ = num3 != null ? num3.intValue() : 0;
        LJII().Tg2();
        if (pdpReviewClickEvent == null || pdpReviewClickEvent.clickedFilterCount == null || ((num = pdpReviewClickEvent.clickedFilterCount) != null && num.intValue() == 0)) {
            C1073704Hv.LIZLLL = new C1073804Hw("", null, "");
        } else {
            String str3 = pdpReviewClickEvent.clickedFilterName;
            if (str3 == null || (str = pdpReviewClickEvent.clickedFilterId) == null) {
                c1073804Hw = null;
            } else {
                String str4 = pdpReviewClickEvent.clickedFilterType;
                c1073804Hw = new C1073804Hw(str3, str4 != null ? Integer.valueOf(CastIntegerProtector.parseInt(str4)) : null, str);
            }
            C1073704Hv.LIZLLL = c1073804Hw;
        }
        C128Y c128y = this.LLJ;
        if (c128y instanceof InterfaceC1748810vbr) {
            C960603pE.LJIIJ(bundle, TrackNodeStore.LJFF((InterfaceC1748810vbr) c128y, new AwS580S0100000_1(this, 358)).LL);
        }
        try {
            View view = this.LLILZ;
            if (view != null) {
                C426750GoL.LJIIL(view, null, Integer.valueOf(LJII().GR2()), null, null, 29);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1019103yf.LIZ(EnumC1014603xw.UNKNOWN_ERR, th, null);
        }
        seaReviewLynxFragment.setArguments(bundle);
        seaReviewLynxFragment.LLJILJILJ = LJII();
        c19ehLJIIJ.LJIJ(R.id.tgj, seaReviewLynxFragment, "SeaReviewLynxFragment");
        c19ehLJIIJ.LJIIJ();
    }

    @Override // com.bytedance.widget.Widget
    public final void onDestroy() {
        this.LLILLJJLI = true;
        try {
            Fragment fragmentLJJJJZ = this.LLJ.getChildFragmentManager().LJJJJZ(R.id.tgj);
            if (fragmentLJJJJZ != null) {
                C19EH c19ehLJIIJ = this.LLJ.getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZ);
                c19ehLJIIJ.LJIIJ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR_REVIEW_REMOVE_FRAGMENT_ERROR, e, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final Map LJI() {
        SeaReviewLynxFragment seaReviewLynxFragment;
        if (!this.LLJ.isAdded()) {
            return null;
        }
        Fragment fragmentLJJJJZI = this.LLJ.getChildFragmentManager().LJJJJZI("SeaReviewLynxFragment");
        if (!(fragmentLJJJJZI instanceof SeaReviewLynxFragment) || (seaReviewLynxFragment = (SeaReviewLynxFragment) fragmentLJJJJZI) == null) {
            return null;
        }
        return seaReviewLynxFragment.WR().LLILZLL.LIZ.LIZ("c3256.d6034");
    }

    public final SeaPdpViewModel LJII() {
        return (SeaPdpViewModel) this.LLJI.getValue();
    }

    public SeaPdpReviewWidget(SeaPdpFragment seaPdpFragment) {
        this.LLJ = seaPdpFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJI = C452501pT.LIZIZ(new AwS260S0300000_16(this, c19719912DlLIZ, c19719912DlLIZ, 19));
    }
}
