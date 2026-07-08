package com.ss.android.ugc.aweme.poi.detail.dishes.gallery;

import X.C1182540gsW;
import X.C1182570gsZ;
import X.InterfaceC0148002o;
import X.InterfaceC738070SxJ;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendDishesGalleryVM extends AssemViewModelWithItem<C1182570gsZ, C1182540gsW> implements InterfaceC738070SxJ<C1182570gsZ, C1182540gsW> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1182570gsZ(0);
    }

    @Override // X.InterfaceC738070SxJ
    public final C1182540gsW state2ItemAccept(InterfaceC0148002o interfaceC0148002o, C1182540gsW c1182540gsW) {
        return c1182540gsW;
    }

    @Override // X.InterfaceC738070SxJ
    public final InterfaceC0148002o itemSync2StateAccept(InterfaceC0148002o interfaceC0148002o, C1182540gsW c1182540gsW, List list) {
        long likeNum;
        boolean userLiked;
        C1182540gsW c1182540gsW2 = c1182540gsW;
        PoiDetailApi.RecommendedDish recommendedDish = c1182540gsW2.LL;
        if (recommendedDish != null) {
            likeNum = recommendedDish.getLikeNum();
        } else {
            likeNum = 0;
        }
        PoiDetailApi.RecommendedDish recommendedDish2 = c1182540gsW2.LL;
        if (recommendedDish2 != null) {
            userLiked = recommendedDish2.getUserLiked();
        } else {
            userLiked = false;
        }
        boolean z = c1182540gsW2.LLILLJJLI;
        interfaceC0148002o.getClass();
        return new C1182570gsZ(recommendedDish, z, userLiked, likeNum);
    }
}
