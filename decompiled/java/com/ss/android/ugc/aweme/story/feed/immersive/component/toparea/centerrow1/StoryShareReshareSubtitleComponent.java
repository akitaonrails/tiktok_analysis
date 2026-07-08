package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow1;

import X.C1609930rzr;
import X.C20684815ws;
import X.C2344009Gk;
import X.C706480RnS;
import X.C729510SjV;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryShareReshareSubtitleComponent extends BaseCellSlotComponent<StoryShareReshareSubtitleComponent> {
    public TuxIconView LLJLLIL;
    public TuxTextView LLJLLL;
    public SmartImageView LLJZ;
    public TuxTextView LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fe2;
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
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 757);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_share_reshare_subtitle", true, awS555S0100000_11);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLLIL = (TuxIconView) view.findViewById(R.id.w_8);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.w_9);
        this.LLJZ = (SmartImageView) view.findViewById(R.id.w_5);
        this.LLJZIJLIL = (TuxTextView) view.findViewById(R.id.w_7);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[PHI: r5
      0x003d: PHI (r5v5 java.lang.String) = (r5v3 java.lang.String), (r5v6 java.lang.String) binds: [B:52:0x00ba, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r16) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow1.StoryShareReshareSubtitleComponent.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }

    public static void Ep(Aweme aweme, String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("reshare_type", str2);
        if (str3 == null) {
            str3 = "";
        }
        c2344009Gk.LJIIIIZZ("creator_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        c2344009Gk.LJIIIIZZ("original_group_id", str4);
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("story_collection_id", C729510SjV.LJII(aweme));
        C1609930rzr.LIZIZ(aweme, c2344009Gk);
        C20684815ws.LJIILLIIL("s2s_reshare_subtitle", c2344009Gk.LIZ);
    }
}
