package com.ss.android.ugc.aweme.story.feed.immersive.follow;

import X.C01GW;
import X.C0HHT;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C339190DRl;
import X.C452501pT;
import X.C706480RnS;
import X.C724750Sbp;
import X.C735570StH;
import X.C736680Sv4;
import X.C737910Sx3;
import X.EnumC1387060mCO;
import X.EnumC2274741E1w;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class ImmersiveStoryFollowAssem extends BaseCellSlotComponent<ImmersiveStoryFollowAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ImmersiveStoryFollowAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/story/feed/immersive/follow/StoryImmersiveBottomBarVM;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ImmersiveStoryFollowAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryImmersiveBottomBarVM.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 816), null, AFwS243S0000000_11.get$arr$(445));
        this.LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 815));
        this.LLJZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(184));
        this.LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(446));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.feh;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 814);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_video_follow", true, awS555S0100000_11);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0RMN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJJ;
            }
        }, null, AFwS294S0000000_11.get$arr$(136), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        User author;
        VideoItemParams videoItemParams2 = videoItemParams;
        Aweme aweme = videoItemParams2.getAweme();
        User author2 = null;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            C339190DRl.LIZLLL((View) this.LLJLLL.getValue());
            RelationButton relationButton = (RelationButton) this.LLJLLL.getValue();
            if (relationButton != null) {
                C735570StH c735570StH = new C735570StH();
                c735570StH.LIZ = author;
                c735570StH.LIZLLL = EnumC2274741E1w.CUSTOM_STORY_INNER_FEED;
                c735570StH.LJIIIIZZ = m128do();
                c735570StH.LIZIZ = false;
                c735570StH.LIZJ = EnumC1387060mCO.FRIENDS;
                relationButton.LLLLZIL(c735570StH.LIZ());
            }
            RelationButton relationButton2 = (RelationButton) this.LLJLLL.getValue();
            Aweme aweme2 = videoItemParams2.getAweme();
            if (aweme2 != null) {
                author2 = aweme2.getAuthor();
            }
            if (relationButton2 != null && author2 != null) {
                relationButton2.setTracker(new AwS412S0200000_11(this, author2, 60));
            }
            RelationButton relationButton3 = (RelationButton) this.LLJLLL.getValue();
            if (relationButton3 != null) {
                relationButton3.setFollowClickListener(new AwS447S0200000_11(this, videoItemParams2, 15));
                return;
            }
            return;
        }
        C339190DRl.LIZIZ((View) this.LLJLLL.getValue());
    }
}
