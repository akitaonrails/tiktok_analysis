package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p0;

import X.C1666050tSN;
import X.C1669670tYD;
import X.C706480RnS;
import X.EnumC1427810nG7;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class SubOnlyStoryTagComponent extends BaseCellSlotComponent<SubOnlyStoryTagComponent> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fd_;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(this, 3187);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_sub_only_story_tag_view", true, awS577S0100000_33);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
        Fo(new AwS577S0100000_33(this, 3186));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        Fo(new AwS577S0100000_33(this, 3188));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.wg4);
        if (viewGroup != null && viewGroup.getChildCount() == 0) {
            ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
            C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, C1666050tSN.LIZ);
            viewGroup.addView(composeView);
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
