package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C01GW;
import X.C13LE;
import X.C2217381BqS;
import X.C2487409ou;
import X.C452501pT;
import X.C706480RnS;
import X.C736680Sv4;
import X.C737910Sx3;
import Y.ARunnableS119S0100000_19;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class StoryLoadingComponent extends BaseCellSlotComponent<StoryLoadingComponent> {
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS257S0000000_19.get$arr$(319));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1855));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fcx;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this, 1856);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_loading", true, awS563S0100000_19);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        LineProgressBar lineProgressBar = (LineProgressBar) this.LLJLLL.getValue();
        if (lineProgressBar != null) {
            lineProgressBar.LIZLLL();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C2487409ou.LIZJ(new ARunnableS119S0100000_19(this, 91));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0i9a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJ;
            }
        }, null, AFwS303S0000000_19.get$arr$(20), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
