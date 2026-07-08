package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C01GW;
import X.C0RF0;
import X.C0RJN;
import X.C0RMW;
import X.C1210704oT;
import X.C13LE;
import X.C2189821An6;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C706480RnS;
import X.C725080ScM;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ARunnableS111S0100000_11;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS693S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryShareComponent extends BaseCellSlotComponent<StoryShareComponent> {
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(389));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 723));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 720));
    public final C630740Ooa LLJZIJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 724));
    public final C01GW LLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(168));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fd6;
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
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 721);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_share", true, awS555S0100000_11);
    }

    public final boolean Ep() {
        C2189821An6 c2189821An6;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (!Intrinsics.LJFF((c0rjnLIZIZ == null || (c2189821An6 = c0rjnLIZIZ.LIZJ) == null) ? null : c2189821An6.getFrom(), "STORY_ENTRANCE_HIGHLIGHTS")) {
            return false;
        }
        C0RMW c0rmw = C0RMW.LIZ;
        C0RF0 c0rf0 = jm().LIZLLL;
        c0rmw.getClass();
        return C0RMW.LJJIJ(c0rf0);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView;
        super.onViewCreated(view);
        if (C1210704oT.LIZ() && !Ep()) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = iLIZIZ;
                marginLayoutParams.height = iLIZIZ;
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                C786410Ut5.W5(view, marginLayoutParams);
                if ((view instanceof TuxIconView) && (tuxIconView = (TuxIconView) view) != null) {
                    tuxIconView.setIconWidth(iLIZIZ2);
                    tuxIconView.setIconHeight(iLIZIZ2);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        C786410Ut5.I7(new AbS693S0100000_11(this, 12), view);
        C725080ScM.LIZ().execute(new ARunnableS111S0100000_11(this, 0));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        if (C1210704oT.LIZ() && !Ep()) {
            return this.LLJLILLLLZIIL.LL;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
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
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            boolean r4 = X.C729510SjV.LJIIL(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L85
            java.lang.String r1 = r0.getUid()
        L18:
            java.lang.String r0 = X.C461720I8s.LIZIZ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r3 = 1
            if (r4 == 0) goto L7f
            if (r0 == 0) goto L7f
            r2 = 1
        L26:
            r3 = 0
        L27:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            boolean r0 = X.C729510SjV.LJIJ(r0)
            if (r0 != 0) goto L6a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            boolean r0 = X.C729510SjV.LJJI(r0)
            if (r0 == 0) goto L3d
            if (r4 == 0) goto L6a
        L3d:
            java.util.List<java.lang.Integer> r0 = com.ss.android.ugc.aweme.feed.assem.tns.banner.VideoReviewStatusVM.LLIZLLLIL
            boolean r0 = X.C10IS.LIZJ(r6)
            if (r0 != 0) goto L6a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.shouldShowReviewStatus(r0)
            if (r0 != 0) goto L6a
            X.0RMW r1 = X.C0RMW.LIZ
            X.0R8b r0 = r5.jm()
            X.0RF0 r0 = r0.LIZLLL
            r1.getClass()
            boolean r0 = X.C0RMW.LJJIJ(r0)
            if (r0 != 0) goto L6a
            if (r2 != 0) goto L6a
            if (r3 == 0) goto L7b
            boolean r0 = X.C289420BWa.LIZ()
            if (r0 != 0) goto L7b
        L6a:
            r1 = 2130773650(0x7f010692, float:1.7150453E38)
        L6d:
            X.01GW r0 = r5.LLJLLL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.tux.icon.TuxIconView r0 = (com.bytedance.tux.icon.TuxIconView) r0
            if (r0 == 0) goto L7a
            r0.setIconRes(r1)
        L7a:
            return
        L7b:
            r1 = 2130772475(0x7f0101fb, float:1.714807E38)
            goto L6d
        L7f:
            r2 = 0
            if (r4 == 0) goto L26
            if (r0 != 0) goto L26
            goto L27
        L85:
            r1 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.component.StoryShareComponent.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
