package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C06US;
import X.C098200Yq;
import X.C0LAB;
import X.C0RMA;
import X.C1220000hqw;
import X.C13LE;
import X.C1614306Tt;
import X.C189200o6;
import X.C20684815ws;
import X.C2217381BqS;
import X.C23250099c;
import X.C337180DJs;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C706480RnS;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.highlights.feed.AddToStoryToastHighlightsFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS75S0100000_2;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryHighlightsComponent extends BaseCellSlotComponent<StoryHighlightsComponent> {
    public final C630740Ooa LLJLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 695));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 696));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 698));
    public final C736950SvV LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fck;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 699);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_highlights", true, awS555S0100000_11);
    }

    public final TuxIconView Ep() {
        return (TuxIconView) this.LLLF.getValue();
    }

    public final StoryHighlightsImmersiveSheetVM Fp() {
        return (StoryHighlightsImmersiveSheetVM) this.LLJZ.getValue();
    }

    public StoryHighlightsComponent() {
        AFwS198S0000000_11 aFwS198S0000000_11 = AFwS198S0000000_11.get$arr$(162);
        this.LLJZIJLIL = new C736950SvV(C13LE.LIZ(AddToStoryToastHighlightsFeedSharedVM.class), aFwS198S0000000_11, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(382), new AwS555S0100000_11((AbstractC738140SxQ) this, OppoPermissionPopupMaskDelayExp.DEFAULT), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(381));
        this.LLLF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 697));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
        try {
            C337180DJs.LIZJ(getContentView());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        try {
            C337180DJs.LIZ(getContentView());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void Gp(VideoItemParams videoItemParams) {
        StoryHighlightInfo storyHighlightInfo = videoItemParams.getAweme().storyHighlightInfo;
        if (storyHighlightInfo != null && (storyHighlightInfo.primaryCollectionInfo != null || (storyHighlightInfo != null && storyHighlightInfo.containerCollectionInfo != null))) {
            TuxIconView tuxIconViewEp = Ep();
            if (tuxIconViewEp != null) {
                tuxIconViewEp.setIconRes(R.raw.icon_color_story_highlight);
            }
            TuxIconView tuxIconViewEp2 = Ep();
            if (tuxIconViewEp2 != null) {
                tuxIconViewEp2.LIZ();
                return;
            }
            return;
        }
        TuxIconView tuxIconViewEp3 = Ep();
        if (tuxIconViewEp3 != null) {
            tuxIconViewEp3.setIconRes(R.raw.icon_story_highlight_fill);
        }
        TuxIconView tuxIconViewEp4 = Ep();
        if (tuxIconViewEp4 == null) {
            return;
        }
        tuxIconViewEp4.setTintColorRes(R.attr.zi);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        LifecycleOwner viewLifecycleOwner;
        super.onViewCreated(view);
        C786410Ut5.I7(new AkS75S0100000_2(this, 6), view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (viewLifecycleOwner = fragmentLJI.getViewLifecycleOwner()) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C1614306Tt(viewLifecycleOwner, this, null), 3);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0RML
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLJJJ;
                }
            }, null, AFwS294S0000000_11.get$arr$(0), 6);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return C0RMA.LIZIZ(videoItemParams, jm());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        IAwemeService iAwemeService;
        Aweme awemeLLILZ;
        StoryHighlightInfo storyHighlightInfo;
        VideoItemParams videoItemParams2 = videoItemParams;
        String aid = videoItemParams2.getAweme().getAid();
        String groupId = null;
        if (aid != null && (iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null)) != null && (awemeLLILZ = iAwemeService.LLILZ(aid)) != null && (storyHighlightInfo = awemeLLILZ.storyHighlightInfo) != null) {
            videoItemParams2.getAweme().storyHighlightInfo = storyHighlightInfo;
        }
        Gp(videoItemParams2);
        StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVMFp = Fp();
        if (storyHighlightsImmersiveSheetVMFp != null) {
            Aweme aweme = videoItemParams2.getAweme();
            if (aweme != null) {
                groupId = aweme.getGroupId();
            }
            if (!storyHighlightsImmersiveSheetVMFp.LLJL) {
                C06US c06us = C06US.LIZ;
                String str = storyHighlightsImmersiveSheetVMFp.LLJJJJJIL;
                boolean z = storyHighlightsImmersiveSheetVMFp.LLJJLIIIJLLLLLLLZ;
                if (groupId == null) {
                    groupId = "";
                }
                c06us.getClass();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("enter_from", str);
                c0lab.LIZ(z ? 1 : 0, "is_new_user");
                c0lab.LJ("group_id", groupId);
                C20684815ws.LJIILLIIL("ttsocial_story_highlight_addvideo_btn_show", c0lab.LIZ);
                storyHighlightsImmersiveSheetVMFp.LLJL = true;
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
