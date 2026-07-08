package com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.addtostorybutton.assem;

import X.C197039127h;
import X.C628500Oky;
import X.C706480RnS;
import X.C729520SjW;
import X.InterfaceC729560Sja;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes12.dex */
public final class AddToStoryButtonImmersiveFeedAssem extends BaseCellSlotComponent<AddToStoryButtonImmersiveFeedAssem> implements InterfaceC729560Sja {
    public C197039127h LLJLLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b8k;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC729560Sja
    public final void v5() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 736);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "common_feed_layout_add_to_story_button_immersive_feed", true, awS555S0100000_11);
    }

    public AddToStoryButtonImmersiveFeedAssem() {
        C628500Oky.LIZ(new AwS555S0100000_11(this, 735));
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
        C197039127h c197039127h = this.LLJLLIL;
        if (c197039127h != null) {
            c197039127h.LJJJJL(new AwS585S0100000_6(view, 202));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C729520SjW.LIZ(this, videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }
}
