package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C694220RKy;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class TrendingBottomBarAssem extends BaseCellSlotComponent<TrendingBottomBarAssem> {
    public ViewGroup LLJLLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bb5;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLLIL = (ViewGroup) view.findViewById(R.id.cf5);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C694220RKy.LIZ(videoItemParams);
        ViewGroup viewGroup = this.LLJLLIL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
    }
}
