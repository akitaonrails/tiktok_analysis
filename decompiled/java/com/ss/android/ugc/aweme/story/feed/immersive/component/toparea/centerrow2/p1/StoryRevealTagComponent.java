package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p1;

import X.C2188811AlT;
import X.C706480RnS;
import X.C728010Sh5;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS88S0100000_19;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryRevealTagComponent extends BaseCellSlotComponent<StoryRevealTagComponent> {
    public TuxTextView LLJLLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fdz;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 766);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_reveal_tag", true, awS555S0100000_11);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Context context;
        super.onViewCreated(view);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.w9x);
        this.LLJLLIL = tuxTextView;
        if (tuxTextView != null && (context = tuxTextView.getContext()) != null) {
            String string = context.getString(2131849103);
            TuxTextView tuxTextView2 = this.LLJLLIL;
            if (tuxTextView2 != null) {
                C728010Sh5.LIZ.getClass();
                if (C728010Sh5.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(string);
                    sbLIZ.append(" · ");
                    sbLIZ.append(context.getString(2131834722));
                    string = C2188811AlT.LIZIZ(sbLIZ);
                }
                tuxTextView2.setText(string);
            }
        }
        C728010Sh5.LIZ.getClass();
        if (C728010Sh5.LIZ()) {
            C786410Ut5.I7(new AkS88S0100000_19(this, 1), view);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
