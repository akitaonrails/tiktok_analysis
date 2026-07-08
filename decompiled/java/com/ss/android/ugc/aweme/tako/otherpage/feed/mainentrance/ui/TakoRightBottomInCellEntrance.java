package com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui;

import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C709490RsJ;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: loaded from: classes12.dex */
public final class TakoRightBottomInCellEntrance extends AbsTakoRightBottomEntrance<TakoRightBottomInCellEntrance> {
    @Override // com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.AbsTakoRightBottomEntrance
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        Bp().vQ2(true);
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.AbsTakoRightBottomEntrance, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C709490RsJ(this, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.AbsTakoRightBottomEntrance, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
        up(videoItemParams);
    }
}
