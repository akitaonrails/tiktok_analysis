package com.ss.android.ugc.aweme.search.detail.keyframe.ui;

import X.C0H8A;
import X.C1196320hEk;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C1385040m98;
import X.C1558520qew;
import X.C384050F3z;
import X.C418440Gaw;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.ss.android.ugc.aweme.search.detail.keyframe.vscope.SearchDetailKeyFrameBottomAssemAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public final class KeyframeBottomCellImageStyle extends BaseKeyframeCell<C0H8A> {
    @Override // com.ss.android.ugc.aweme.search.detail.keyframe.ui.BaseKeyframeCell
    public final int X5() {
        return R.raw.tux_lottie_common_search_videocover_wave_dark;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ew4;
    }

    @Override // com.ss.android.ugc.aweme.search.detail.keyframe.ui.BaseKeyframeCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = C1385040m98.LIZ(this.itemView.getContext(), true);
        View view = (View) this.LLILZ.getValue();
        if (view != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            C1361400lX0 c1361400lX0 = this.LLILLL;
            c384050F3z.LIZ = c1361400lX0 != null ? C1308910kAL.LIZJ(R.attr.a03, c1361400lX0) : null;
            view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
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
