package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C01GW;
import X.C0HHT;
import X.C1210704oT;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452501pT;
import X.C706480RnS;
import X.C723830SaL;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.immersive.follow.StoryImmersiveBottomBarVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryOtherBottomBarComponent extends BaseCellSlotComponent<StoryOtherBottomBarComponent> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(166));
    public final InterfaceC1731706qJ LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryOtherBottomBarComponent.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/story/feed/immersive/follow/StoryImmersiveBottomBarVM;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StoryOtherBottomBarComponent() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryImmersiveBottomBarVM.class);
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 710), null, AFwS243S0000000_11.get$arr$(385));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fcz;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 709);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_other_bottom_bar", true, awS555S0100000_11);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        C339190DRl.LIZIZ(getContentView());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById;
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS377S0200000_11(this, view, 54));
        if (C1210704oT.LIZIZ() && (viewFindViewById = view.findViewById(R.id.i7z)) != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 16;
                layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
                C786410Ut5.W5(viewFindViewById, layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(this, LLJZ[0]), new C2217381BqS() { // from class: X.0RLr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0NQV) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(121), 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if ((true ^ X.C694400RLq.LIZIZ(r6, r4)) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (X.C10EU.LJIILJJIL(r6.getAweme().getAuthor()) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        X.C786410Ut5.LJLLLLLL(4, getContentView());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        return;
     */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r6 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r6
            X.01GW r0 = r5.LLJLLIL
            java.lang.Object r0 = r0.getValue()
            X.0RBZ r0 = (X.C0RBZ) r0
            X.C691730RBj.LIZ(r5, r0, r6)
            X.0R8b r4 = r5.jm()
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r6.baseFeedPageParams
            r3 = 0
            if (r0 == 0) goto L7f
            X.1An6 r0 = r0.param
            if (r0 == 0) goto L7f
            java.lang.String r1 = r0.getFrom()
        L1e:
            java.lang.String r0 = "STORY_ENTRANCE_INBOX_GROUP_CHAT"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r2 = 1
            if (r0 != 0) goto L41
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r6.baseFeedPageParams
            if (r0 == 0) goto L50
            X.1An6 r0 = r0.param
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.feed.param.DetailNavArgModel r0 = r0.getNavArgModel()
            if (r0 == 0) goto L50
            java.lang.Boolean r1 = r0.getStoryIsFromGroupChatSingleAvatar()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L50
        L41:
            boolean r0 = X.C694400RLq.LIZIZ(r6, r4)
            r2 = r2 ^ r0
            if (r2 == 0) goto L81
        L48:
            android.view.View r0 = r5.getContentView()
            X.C339190DRl.LIZLLL(r0)
            return
        L50:
            boolean r0 = X.C298540Bn2.LIZ()
            if (r0 == 0) goto L48
            boolean r0 = X.C0BWW.LIZ()
            if (r0 == 0) goto L48
            java.lang.String[] r1 = X.C0RMB.LJ
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r6.baseFeedPageParams
            if (r0 == 0) goto L6a
            X.1An6 r0 = r0.param
            if (r0 == 0) goto L6a
            java.lang.String r3 = r0.getFrom()
        L6a:
            int r0 = X.C13LQ.LJJIJIIJI(r3, r1)
            if (r0 < 0) goto L48
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            boolean r0 = X.C10EU.LJIILJJIL(r0)
            if (r0 != 0) goto L81
            goto L48
        L7f:
            r1 = r3
            goto L1e
        L81:
            android.view.View r1 = r5.getContentView()
            r0 = 4
            X.C786410Ut5.LJLLLLLL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.component.StoryOtherBottomBarComponent.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }
}
