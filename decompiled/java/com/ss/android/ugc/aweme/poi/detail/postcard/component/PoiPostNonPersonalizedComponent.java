package com.ss.android.ugc.aweme.poi.detail.postcard.component;

import X.C1558360qeg;
import X.C1558520qew;
import X.C2188811AlT;
import X.InterfaceC1181010gq3;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;
import com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostAbility;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostNonPersonalizedComponent extends BasePoiPostNonPersonalizedComponent {
    @Override // com.ss.android.ugc.aweme.poi.detail.postcard.component.BasePoiPostNonPersonalizedComponent
    public final void bo(PoiListApi.PoiMergedListResponse poiMergedListResponse) {
        Fragment fragmentS8;
        IPoiDetailPostAbility iPoiDetailPostAbility;
        PoiVideoListSharedViewModel poiVideoListSharedViewModelLLLLLLZ;
        InterfaceC1181010gq3 interfaceC1181010gq3M306do = m306do();
        if (interfaceC1181010gq3M306do != null && (fragmentS8 = interfaceC1181010gq3M306do.S8()) != null && (iPoiDetailPostAbility = (IPoiDetailPostAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentS8, null), IPoiDetailPostAbility.class, null)) != null && (poiVideoListSharedViewModelLLLLLLZ = iPoiDetailPostAbility.LLLLLLZ()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updatePoiPostResponse poiPostResponse:");
            sbLIZ.append(poiMergedListResponse);
            C2188811AlT.LIZIZ(sbLIZ);
            if (poiMergedListResponse != null) {
                poiVideoListSharedViewModelLLLLLLZ.LLJJJ.clear();
                ((LinkedHashMap) poiVideoListSharedViewModelLLLLLLZ.LLJJJJ).clear();
                ((LinkedHashMap) poiVideoListSharedViewModelLLLLLLZ.LLJJJIL).clear();
                poiVideoListSharedViewModelLLLLLLZ.LLJJIJIL = null;
                poiVideoListSharedViewModelLLLLLLZ.LLILZLL = null;
                poiVideoListSharedViewModelLLLLLLZ.LLIZ = null;
                poiVideoListSharedViewModelLLLLLLZ.LLIZLLLIL = null;
                poiVideoListSharedViewModelLLLLLLZ.LLJI = poiMergedListResponse;
                poiVideoListSharedViewModelLLLLLLZ.manualListRefresh();
            }
        }
    }
}
