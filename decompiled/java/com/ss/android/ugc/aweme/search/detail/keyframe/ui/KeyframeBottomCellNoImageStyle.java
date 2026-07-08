package com.ss.android.ugc.aweme.search.detail.keyframe.ui;

import X.C0H8A;
import X.C1196320hEk;
import X.C1385040m98;
import X.C1558520qew;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.search.detail.keyframe.vscope.SearchDetailKeyFrameBottomAssemAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public final class KeyframeBottomCellNoImageStyle extends BaseKeyframeCell<C0H8A> {
    @Override // com.ss.android.ugc.aweme.search.detail.keyframe.ui.BaseKeyframeCell
    public final int X5() {
        return R.raw.tux_lottie_common_search_videocover_wave_dark;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ew6;
    }

    @Override // com.ss.android.ugc.aweme.search.detail.keyframe.ui.BaseKeyframeCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = C1385040m98.LIZ(this.itemView.getContext(), true);
    }

    @Override // com.ss.android.ugc.aweme.search.detail.keyframe.ui.BaseKeyframeCell
    public final void W5(C0H8A c0h8a) {
        SearchDetailKeyFrameBottomAssemAbility searchDetailKeyFrameBottomAssemAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
        if (interfaceC665370Q7zLIZ != null && (searchDetailKeyFrameBottomAssemAbility = (SearchDetailKeyFrameBottomAssemAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, SearchDetailKeyFrameBottomAssemAbility.class, null)) != null) {
            searchDetailKeyFrameBottomAssemAbility.ZB(getBindingAdapterPosition(), c0h8a);
        }
    }
}
