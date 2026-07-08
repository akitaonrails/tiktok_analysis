package com.ss.android.ugc.aweme.friendstab.text.assem;

import X.C019F;
import X.C1223430hwT;
import X.C1389300mG0;
import X.C13LE;
import X.C1623706Xj;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C339190DRl;
import X.C626310OhR;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS93S0200000_24;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.friendstab.text.viewmodel.FriendsV3TextFeedListViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3StatusAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3TextStatusAssem extends FriendsV3StatusAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final AssemVMLazy LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3TextStatusAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/text/viewmodel/FriendsV3TextFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3TextStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3TextFeedListViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 211), AFwS264S0000000_24.get$arr$(138), null, true);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3StatusAssem
    public final void Lo() {
        TuxSkeletonLayout tuxSkeletonLayout;
        if (this.LLJJIII == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(LJJIJL().getContext()), R.layout.cbn, Ho(), false);
            TuxSkeletonLayout tuxSkeletonLayout2 = viewTd instanceof TuxSkeletonLayout ? (TuxSkeletonLayout) viewTd : null;
            this.LLJJIII = tuxSkeletonLayout2;
            this.LLJJIJI = tuxSkeletonLayout2 != null ? tuxSkeletonLayout2.findViewById(R.id.vip) : null;
        }
        TuxSkeletonLayout tuxSkeletonLayout3 = this.LLJJIII;
        if (tuxSkeletonLayout3 != null) {
            Ho().LIZIZ(tuxSkeletonLayout3);
            tuxSkeletonLayout3.setLoading(true);
            TuxSkeletonLayout tuxSkeletonLayout4 = this.LLJJIII;
            if (tuxSkeletonLayout4 != null && (tuxSkeletonLayout = (TuxSkeletonLayout) tuxSkeletonLayout4.findViewById(R.id.hur)) != null) {
                tuxSkeletonLayout.setRepeat(1 ^ (Oo() ? 1 : 0));
                tuxSkeletonLayout.setPreviewItemRes(R.layout.cbq);
                HandlerHook.viewPost(tuxSkeletonLayout, new ARunnableS93S0200000_24(this, tuxSkeletonLayout, 12));
            }
        }
        View view = this.LLJJIJI;
        if (view != null) {
            C337180DJs.LIZ(view);
        }
        Ho().LJ();
        C339190DRl.LIZLLL(Ho());
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3StatusAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final FriendsV3TextFeedListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (FriendsV3TextFeedListViewModel) assemVMLazy.getValue();
    }

    public final boolean Oo() {
        return C1389300mG0.LJIJI(C724240Sb0.LJI(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3StatusAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.friendstab.text.viewmodel.FriendsV3TextFeedListViewModel r0 = r5.Go()
            X.002o r0 = r0.getState()
            X.0hwT r0 = (X.C1223430hwT) r0
            r0.getClass()
            X.0Ojc r0 = r0.getListState()
            java.util.List<ITEM> r0 = r0.LLILZ
            r3 = 0
            if (r0 == 0) goto Lb0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != r1) goto Lb0
        L1d:
            boolean r0 = r5.Oo()
            if (r0 == 0) goto Lb3
            if (r1 == 0) goto Lb3
            X.0uv6 r4 = new X.0uv6
            r4.<init>()
            X.0vcc r0 = r5.Ho()
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto Lae
            X.0HTI r1 = new X.0HTI
            r1.<init>()
            r0 = 2130968591(0x7f04000f, float:1.754584E38)
            r1.LIZ = r0
            android.graphics.drawable.Drawable r1 = r1.LIZ(r2)
        L42:
            r0 = 2
            r4.LIZJ = r0
            r4.LIZ = r1
            X.0vcc r0 = r5.Ho()
            android.content.Context r1 = r0.getContext()
            r0 = 2131850123(0x7f11738b, float:1.93338E38)
            java.lang.String r0 = r1.getString(r0)
            r4.LJI = r0
            X.0vcc r0 = r5.Ho()
            android.content.Context r1 = r0.getContext()
            r0 = 2131850122(0x7f11738a, float:1.9333797E38)
            java.lang.String r0 = r1.getString(r0)
            r4.LJIIIIZZ = r0
            r2 = 75
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r1 = X.C814420VxA.LIZIZ(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r4.LIZLLL = r1
            r4.LJ = r0
            X.0vcc r1 = r5.Ho()
            r0 = 172(0xac, float:2.41E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            r1.setTopMargin(r0)
            X.0vcc r0 = r5.Ho()
            r0.setStatus(r4)
            com.bytedance.tux.skeleton.TuxSkeletonLayout r0 = r5.LLJJIII
            if (r0 == 0) goto La6
            r0.setLoading(r3)
        La6:
            X.0vcc r0 = r5.Ho()
            X.C339190DRl.LIZLLL(r0)
            return
        Lae:
            r1 = 0
            goto L42
        Lb0:
            r1 = 0
            goto L1d
        Lb3:
            super.R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.text.assem.FriendsV3TextStatusAssem.R():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3StatusAssem, com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1223430hwT c1223430hwT = (C1223430hwT) Go().getState();
        c1223430hwT.getClass();
        if (c1223430hwT.getListState().LL instanceof C1623706Xj) {
            C626310OhR c626310OhR = C626310OhR.LIZ;
            String strLIZ = C1389300mG0.LIZ(getPanelContext());
            boolean zOo = Oo();
            c626310OhR.getClass();
            C626310OhR.LIZLLL(3, strLIZ, zOo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3StatusAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jo(java.lang.Throwable r9) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.text.assem.FriendsV3TextStatusAssem.Jo(java.lang.Throwable):void");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3StatusAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().asyncSubscribe(new C2217381BqS() { // from class: X.0qwe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1223430hwT c1223430hwT = (C1223430hwT) obj;
                c1223430hwT.getClass();
                return C627260Oiy.LIZLLL(c1223430hwT);
            }
        }, this, C736820SvI.LIZLLL(), new AwS603S0100000_24(this, 74), AFwS213S0000000_24.get$arr$(168), new AwS603S0100000_24(this, 75));
    }
}
