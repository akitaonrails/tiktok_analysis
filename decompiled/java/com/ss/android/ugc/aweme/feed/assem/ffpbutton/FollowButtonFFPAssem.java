package com.ss.android.ugc.aweme.feed.assem.ffpbutton;

import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C0HHT;
import X.C1387050mCN;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C299670Bor;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC2274741E1w;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import com.ss.android.ugc.aweme.feed.adapter.FypExposedCommentAvoidViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FollowButtonFFPAssem extends BaseCellSlotComponent<FollowButtonFFPAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public RelationButton LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public final C01GW LLJZ;
    public final boolean LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FollowButtonFFPAssem.class, "followBtnVM", "getFollowBtnVM()Lcom/ss/android/ugc/aweme/feed/assem/ffpbutton/FollowButtonFFPViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FollowButtonFFPAssem.class, "exposedCommentAvoidVM", "getExposedCommentAvoidVM()Lcom/ss/android/ugc/aweme/feed/adapter/FypExposedCommentAvoidViewModel;", 0);
        c09r3.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FollowButtonFFPAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FollowButtonFFPViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ, 228), null, AFwS243S0000000_11.get$arr$(70));
        this.LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS243S0000000_11.get$arr$(72));
        this.LLJZIJLIL = C299670Bor.LIZ();
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FypExposedCommentAvoidViewModel.class);
        this.LLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ2, 229), null, AFwS243S0000000_11.get$arr$(71));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b5a;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.ffpbutton.FollowButtonFFPAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        User author = videoItemParams2.getAweme().getAuthor();
        RelationButton relationButton = null;
        if (author != null) {
            RelationButton relationButton2 = this.LLJLLIL;
            if (relationButton2 == null) {
                relationButton2 = null;
            }
            C1387050mCN c1387050mCN = new C1387050mCN(author);
            c1387050mCN.LJIIJJI = getHostLifecycleOwner();
            c1387050mCN.LJFF = EnumC2274741E1w.TUX_SEMI_TRANSPARENT;
            c1387050mCN.LIZIZ = true;
            c1387050mCN.LJIIJ = true;
            relationButton2.LLLLZIL(c1387050mCN.LIZ());
        }
        RelationButton relationButton3 = this.LLJLLIL;
        if (relationButton3 == null) {
            relationButton3 = null;
        }
        relationButton3.setTracker(new AwS412S0200000_11(this, videoItemParams2, 101));
        RelationButton relationButton4 = this.LLJLLIL;
        if (relationButton4 != null) {
            relationButton = relationButton4;
        }
        int i = 0;
        this.LLJLLL.getValue(this, LLLF[0]).getClass();
        User author2 = videoItemParams2.getAweme().getAuthor();
        if (author2 == null || author2.getFollowStatus() != 0 || videoItemParams2.getAweme().isAd()) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, relationButton);
    }
}
