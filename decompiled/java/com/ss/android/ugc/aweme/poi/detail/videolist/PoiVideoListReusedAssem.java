package com.ss.android.ugc.aweme.poi.detail.videolist;

import X.C1163420gNg;
import X.C1163440gNi;
import X.C1180340goy;
import X.C13LE;
import X.C19719912Dl;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.container.PoiDetailPostContainerAssem;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiVideoListReusedAssem extends BaseSlashGlueReusedAssem<PoiListApi.PoiMergedListResponse> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e79;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem
    public final C1163440gNi tp() {
        return (SlashComponentUIPreloadExp.LIZ("poi_merged_list") || SlashComponentUIPreloadExp.LIZ("poi_video_list")) ? C1163420gNg.LIZ(new C1180340goy()) : C1163440gNi.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem
    public final C19719912Dl sp(BaseComponentData baseComponentData) {
        int size;
        List<PoiListApi.PoiMergedListItem> mergedListItems;
        PoiListApi.PoiMergedListResponse poiMergedListResponse = (PoiListApi.PoiMergedListResponse) baseComponentData;
        if (poiMergedListResponse != null && (mergedListItems = poiMergedListResponse.getMergedListItems()) != null) {
            size = mergedListItems.size();
        } else {
            size = 0;
        }
        if (size >= 6 || (poiMergedListResponse != null && poiMergedListResponse.hasMoreData$poi_release())) {
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
        } else {
            View view2 = this.LLJJLIIIJLLLLLLLZ;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -2;
                    C786410Ut5.W5(view2, layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        return C13LE.LIZ(PoiDetailPostContainerAssem.class);
    }
}
