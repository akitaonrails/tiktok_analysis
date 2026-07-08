package com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.addtostorybutton.assem;

import X.C197039127h;
import X.C729520SjW;
import X.InterfaceC729560Sja;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class AddToStoryButtonFeedAssem extends BaseCellSlotComponent<AddToStoryButtonFeedAssem> implements InterfaceC729560Sja {
    public C197039127h LLJLLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b8j;
    }

    @Override // X.InterfaceC729560Sja
    public final void v5() {
    }

    @Override // X.InterfaceC729560Sja
    public final C197039127h Ch() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC729560Sja
    public final void R4(C197039127h c197039127h) {
        this.LLJLLIL = c197039127h;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C729520SjW.LIZIZ(this, view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C729520SjW.LIZ(this, videoItemParams);
    }
}
