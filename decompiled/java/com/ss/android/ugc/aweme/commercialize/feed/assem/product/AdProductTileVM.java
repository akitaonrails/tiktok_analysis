package com.ss.android.ugc.aweme.commercialize.feed.assem.product;

import X.C1022820ciu;
import X.C2184171Adz;
import X.C232300v3;
import X.InterfaceC0148002o;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: loaded from: classes32.dex */
public final class AdProductTileVM extends FeedBaseViewModel<C232300v3> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C232300v3(null);
    }

    public final void wQ2() {
        Aweme aweme;
        VideoItemParams item = getItem();
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", (item == null || (aweme = item.getAweme()) == null) ? null : aweme.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZJ("card", "refer");
        c1022820ciuLIZLLL.LIZIZ("AdPlp", Scene.SCENE_SERVICE);
        c1022820ciuLIZLLL.LIZIZ("native_product_tile", "cardType");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        C232300v3 c232300v3 = (C232300v3) interfaceC0148002o;
        AwemeBizExtKt.setAdDescMaxLines(videoItemParams.getAweme(), 2);
        super.paramSync2StateAccept(c232300v3, videoItemParams);
        return c232300v3;
    }

    public final void vQ2(int i, String str) {
        AwemeRawAd awemeRawAd;
        Aweme aweme;
        VideoItemParams item = getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "card_product_show", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("card", "refer");
        c1022820ciuLIZLLL.LIZIZ("AdPlp", Scene.SCENE_SERVICE);
        c1022820ciuLIZLLL.LIZIZ("native_product_tile", "cardType");
        c1022820ciuLIZLLL.LIZIZ(str, "productId");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "card_index");
        c1022820ciuLIZLLL.LJII();
    }
}
