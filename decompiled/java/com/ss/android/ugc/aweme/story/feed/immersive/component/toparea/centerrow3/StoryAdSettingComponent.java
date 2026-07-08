package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow3;

import X.C01GW;
import X.C1017070cZd;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C706480RnS;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryAdSettingComponent extends BaseCellSlotComponent<StoryAdSettingComponent> {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 777));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.far;
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
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 778);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_ad_setting", true, awS555S0100000_11);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View view2 = (View) this.LLJLLIL.getValue();
        if (view2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bt);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            view2.setBackground(c384050F3z.LIZ(view.getContext()));
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
        VideoItemParams videoItemParams2 = videoItemParams;
        TextView textView = (TextView) this.LLJLLIL.getValue();
        if (textView != null) {
            textView.setText(C1017070cZd.LJIL(videoItemParams2.getAweme()));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }
}
