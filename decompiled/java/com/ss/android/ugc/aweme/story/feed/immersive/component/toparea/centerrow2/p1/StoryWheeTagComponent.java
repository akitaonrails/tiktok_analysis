package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p1;

import X.C01GW;
import X.C13LE;
import X.C1C5K;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C452501pT;
import X.C706480RnS;
import X.C724270Sb3;
import X.C729510SjV;
import X.C735840Sti;
import X.C736680Sv4;
import X.C737910Sx3;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryWheeTagComponent extends BaseCellSlotComponent<StoryWheeTagComponent> {
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(407));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 767));
    public C1C5K LLJZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fei;
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
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 768);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_whee_tag", true, awS555S0100000_11);
    }

    public final C2344009Gk Ep() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C2189821An6 c2189821An6 = (C2189821An6) this.LLJLLL.getValue();
        String eventType = c2189821An6 != null ? c2189821An6.getEventType() : null;
        if (eventType == null) {
            eventType = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", eventType);
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        if (authorUid == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        String aid = aweme.getAid();
        c2344009Gk.LJIIIIZZ("group_id", aid != null ? aid : "");
        C735840Sti c735840Sti = C735840Sti.LIZ;
        User author = aweme.getAuthor();
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author), "follow_status");
        c2344009Gk.LJIIIIZZ("is_note", C729510SjV.LJJIIZI(aweme) ? "1" : CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "whee_content");
        return c2344009Gk;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0RrC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIL;
            }
        }, null, AFwS294S0000000_11.get$arr$(127), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r15) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p1.StoryWheeTagComponent.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }
}
