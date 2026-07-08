package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p2;

import X.C2188811AlT;
import X.C298450Bmt;
import X.C706480RnS;
import X.C786410Ut5;
import Y.ACListenerS146S0100000_11;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StorySecretReplyTagComponent extends BaseCellSlotComponent<StorySecretReplyTagComponent> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fd4;
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
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 771);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_secret_reply_tag_view", true, awS555S0100000_11);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int i;
        super.onViewCreated(view);
        TextView textView = (TextView) getContentView().findViewById(R.id.z_d);
        String string = textView.getContext().getString(2131847242);
        if (C298450Bmt.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(" · ");
            sbLIZ.append(textView.getContext().getString(2131847243));
            string = C2188811AlT.LIZIZ(sbLIZ);
        }
        textView.setText(string);
        TuxIconView tuxIconView = (TuxIconView) getContentView().findViewById(R.id.l92);
        if (C298450Bmt.LIZ()) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
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
        if (C298450Bmt.LIZ()) {
            C786410Ut5.I7(new ACListenerS146S0100000_11(videoItemParams2, 97), getContentView());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }
}
