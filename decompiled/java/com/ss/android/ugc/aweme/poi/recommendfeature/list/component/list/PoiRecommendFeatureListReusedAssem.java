package com.ss.android.ugc.aweme.poi.recommendfeature.list.component.list;

import X.C1163420gNg;
import X.C1163440gNi;
import X.C1180340goy;
import X.C13LE;
import X.C19719912Dl;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureListReusedAssem extends BaseSlashGlueReusedAssem<PoiRecommendFeatureListModule> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e79;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem
    public final C1163440gNi tp() {
        return C1163420gNg.LIZ(new C1180340goy());
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
        return C13LE.LIZ(PoiRecommendFeatureListAssem.class);
    }
}
