package com.ss.android.ugc.feed.platform.cell.interact.info;

import X.C786410Ut5;
import X.C799570VYd;
import Y.ARunnableS109S0100000_9;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes10.dex */
public final class SentinelSpaceAssem extends BaseCellSlotComponent<SentinelSpaceAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ba3;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS109S0100000_9(this, 120));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
