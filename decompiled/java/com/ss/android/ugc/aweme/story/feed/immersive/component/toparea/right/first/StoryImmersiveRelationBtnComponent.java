package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.right.first;

import X.C01GW;
import X.C1387050mCN;
import X.C13LE;
import X.C1609930rzr;
import X.C1908830zlx;
import X.C20684815ws;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C296550Bjp;
import X.C298540Bn2;
import X.C452501pT;
import X.C497820Jfg;
import X.C706480RnS;
import X.C724270Sb3;
import X.C729510SjV;
import X.C736680Sv4;
import X.C737910Sx3;
import X.EnumC1387060mCO;
import X.EnumC2274741E1w;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryImmersiveRelationBtnComponent extends BaseCellSlotComponent<StoryImmersiveRelationBtnComponent> {
    public RelationButton LLJZ;
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(408));
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(409));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(180));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 790));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fct;
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
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 791);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_immersive_relation_button", true, awS555S0100000_11);
    }

    public final void Ep(String str) {
        Object obj;
        String str2;
        Object obj2;
        String eventType;
        Object obj3;
        C2189821An6 c2189821An6;
        C2189821An6 c2189821An62;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action", str);
        C724270Sb3 c724270Sb3 = this.LLJI;
        String strLJIL = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (C729510SjV.LJJ(((VideoItemParams) obj).getAweme())) {
            str2 = "story";
        } else {
            str2 = "post";
        }
        c2344009Gk.LJIIIIZZ("story_type", str2);
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) obj2).baseFeedPageParams;
        if (baseFeedPageParams == null || (c2189821An62 = baseFeedPageParams.param) == null || (eventType = c2189821An62.getEventType()) == null) {
            eventType = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", eventType);
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        } else {
            obj3 = null;
        }
        BaseFeedPageParams baseFeedPageParams2 = ((VideoItemParams) obj3).baseFeedPageParams;
        if (baseFeedPageParams2 != null && (c2189821An6 = baseFeedPageParams2.param) != null) {
            strLJIL = C1609930rzr.LJIL(c2189821An6);
        }
        c2344009Gk.LJIIIIZZ("enter_position", strLJIL);
        C20684815ws.LJIILLIIL("story_immersive_follow_btn", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        RelationButton relationButton = (RelationButton) view.findViewById(R.id.t4l);
        this.LLJZ = relationButton;
        if (relationButton != null) {
            relationButton.setDataChangeListener(new AwS590S0100000_11(this, 230));
            relationButton.setFollowClickListener(new AwS625S0100000_11(this, 56));
            relationButton.setMaxWidth((int) (C497820Jfg.LIZIZ(view.getContext()) * 0.3f));
            relationButton.setMinWidth(0);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0RMQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, null, AFwS294S0000000_11.get$arr$(128), 6);
        if (C298540Bn2.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0RMO
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLJJJ;
                }
            }, null, AFwS294S0000000_11.get$arr$(129), 6);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        RelationButton relationButton;
        VideoItemParams videoItemParams2 = videoItemParams;
        User author = videoItemParams2.getAweme().getAuthor();
        if (author != null) {
            C1387050mCN c1387050mCN = new C1387050mCN(author);
            c1387050mCN.LJFF = EnumC2274741E1w.CUSTOM_TT_STORY_IMMERSIVE_FEED;
            c1387050mCN.LJIIJJI = this;
            c1387050mCN.LIZIZ = false;
            c1387050mCN.LJ = EnumC1387060mCO.FRIENDS;
            C1908830zlx c1908830zlxLIZ = c1387050mCN.LIZ();
            RelationButton relationButton2 = this.LLJZ;
            if (relationButton2 != null) {
                relationButton2.LLLLZIL(c1908830zlxLIZ);
            }
        }
        RelationButton relationButton3 = this.LLJZ;
        if (relationButton3 != null) {
            relationButton3.setTracker(new AwS555S0100000_11(videoItemParams2, 43));
        }
        if (((Boolean) this.LLL.getValue()).booleanValue()) {
            RelationButton relationButton4 = this.LLJZ;
            if (relationButton4 != null) {
                relationButton4.setFollowClickListener(new AwS625S0100000_11(videoItemParams2, 2));
                return;
            }
            return;
        }
        if (!C296550Bjp.LIZ() || (relationButton = this.LLJZ) == null) {
            return;
        }
        relationButton.setFollowClickListener(new AwS625S0100000_11(videoItemParams2, 3));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }
}
