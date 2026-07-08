package com.ss.android.ugc.aweme.poi.detail.postcard.component;

import X.C1558360qeg;
import X.C1558520qew;
import X.InterfaceC1181010gq3;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM;
import com.ss.android.ugc.aweme.poi.detail.postcard.IPoiLimitedPostAbility;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiLimitedPostNonPersonalizedComponent extends BasePoiPostNonPersonalizedComponent {
    @Override // com.ss.android.ugc.aweme.poi.detail.postcard.component.BasePoiPostNonPersonalizedComponent
    public final void bo(PoiListApi.PoiMergedListResponse poiMergedListResponse) {
        Fragment fragmentS8;
        IPoiLimitedPostAbility iPoiLimitedPostAbility;
        PoiPostPageShareVM poiPostPageShareVMS72;
        Fragment fragmentS82;
        IPoiLimitedPostAbility iPoiLimitedPostAbility2;
        PoiPostPageShareVM poiPostPageShareVMLLLLLLZ;
        InterfaceC1181010gq3 interfaceC1181010gq3M306do = m306do();
        if (interfaceC1181010gq3M306do != null && (fragmentS82 = interfaceC1181010gq3M306do.S8()) != null && (iPoiLimitedPostAbility2 = (IPoiLimitedPostAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentS82, null), IPoiLimitedPostAbility.class, null)) != null && (poiPostPageShareVMLLLLLLZ = iPoiLimitedPostAbility2.LLLLLLZ()) != null) {
            poiPostPageShareVMLLLLLLZ.NQ2(poiMergedListResponse);
        }
        InterfaceC1181010gq3 interfaceC1181010gq3M306do2 = m306do();
        if (interfaceC1181010gq3M306do2 != null && (fragmentS8 = interfaceC1181010gq3M306do2.S8()) != null && (iPoiLimitedPostAbility = (IPoiLimitedPostAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentS8, null), IPoiLimitedPostAbility.class, null)) != null && (poiPostPageShareVMS72 = iPoiLimitedPostAbility.s72()) != null) {
            poiPostPageShareVMS72.NQ2(poiMergedListResponse);
        }
    }
}
