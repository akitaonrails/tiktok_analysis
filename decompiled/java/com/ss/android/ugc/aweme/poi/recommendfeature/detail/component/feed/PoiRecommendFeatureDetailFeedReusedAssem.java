package com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed;

import X.C13LE;
import X.C19719912Dl;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureDetailFeedReusedAssem extends BaseSlashGlueReusedAssem<PoiRecommendFeatureDetailFeedModule> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e79;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem
    public final C19719912Dl sp(BaseComponentData baseComponentData) {
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
                C786410Ut5.W5(view, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        return C13LE.LIZ(PoiRecommendFeatureDetailFeedAssem.class);
    }
}
