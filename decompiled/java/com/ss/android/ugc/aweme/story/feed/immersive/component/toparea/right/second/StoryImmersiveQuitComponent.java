package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.right.second;

import X.C0RF0;
import X.C706480RnS;
import X.C786410Ut5;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;
import wh6.AbS693S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryImmersiveQuitComponent extends BaseCellSlotComponent<StoryImmersiveQuitComponent> {
    public C0RF0 LLJLLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fcs;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 796);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_immersive_quit", true, awS555S0100000_11);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.I7(new AbS693S0100000_11(this, 14, 42), view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
