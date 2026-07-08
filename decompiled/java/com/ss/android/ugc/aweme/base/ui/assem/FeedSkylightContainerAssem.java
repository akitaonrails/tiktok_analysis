package com.ss.android.ugc.aweme.base.ui.assem;

import X.C01D1;
import X.C01GW;
import X.C13LE;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723580SZw;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSkylightContainerAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    public final C630740Ooa LLJJIII = C628500Oky.LIZ(new AwS568S0100000_24(this, 64));
    public final AssemVMLazy LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedSkylightContainerAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/base/vm/FeedSkylightContainerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FeedSkylightContainerAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightContainerViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 66);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, awS568S0100000_24, AFwS264S0000000_24.get$arr$(22), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 65));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.c77;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13) {
        /*
            r12 = this;
            kotlin.jvm.internal.AwS581S0100000_2 r1 = new kotlin.jvm.internal.AwS581S0100000_2
            r0 = 71
            r6 = r12
            r1.<init>(r6, r0)
            X.C723850SaN.LIZLLL(r6, r1)
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r6.LLJJIJI
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightContainerAssem.LLJJIJIL
            r5 = 0
            com.bytedance.assem.arch.viewModel.AssemViewModel r2 = r1.getValue()
            com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel r2 = (com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel) r2
            X.0Ooa r0 = r6.LLJJIII
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2.LLILLJJLI = r0
            X.0qg8 r0 = r6.LLJJI
            java.lang.Object r0 = r0.getValue()
            X.0qoZ r0 = (X.C1564490qoZ) r0
            r9 = 0
            if (r0 == 0) goto Lb8
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LL
            if (r1 == 0) goto Lb9
            r0 = r1
        L34:
            r2.LLILLL = r0
            if (r1 == 0) goto L42
            java.lang.String r0 = "enter_from"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L44
        L42:
            java.lang.String r0 = ""
        L44:
            r2.LLIZ = r0
            com.bytedance.assem.arch.viewModel.AssemVMLazy r0 = r6.LLJJIJI
            com.bytedance.assem.arch.viewModel.AssemViewModel r7 = r0.getValue()
            X.0r1N r8 = new X.C2217381BqS() { // from class: X.0r1N
                static {
                    /*
                        X.0r1N r0 = new X.0r1N
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0r1N) X.0r1N.LL X.0r1N
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1572430r1N.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0r6r> r3 = X.C1575830r6r.class
                        java.lang.String r2 = "getShowSkylightViews()Z"
                        r1 = 0
                        java.lang.String r0 = "showSkylightViews"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1572430r1N.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0r6r r2 = (X.C1575830r6r) r2
                        boolean r0 = r2.LLILLJJLI
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1572430r1N.get(java.lang.Object):java.lang.Object");
                }
            }
            kotlin.jvm.internal.AwS638S0100000_24 r10 = new kotlin.jvm.internal.AwS638S0100000_24
            r0 = 15
            r10.<init>(r6, r0)
            r11 = 6
            X.C736680Sv4.LJIIIIZZ(r6, r7, r8, r9, r10, r11)
            com.bytedance.assem.arch.viewModel.AssemVMLazy r0 = r6.LLJJIJI
            com.bytedance.assem.arch.viewModel.AssemViewModel r7 = r0.getValue()
            X.0r1M r8 = new X.C2217381BqS() { // from class: X.0r1M
                static {
                    /*
                        X.0r1M r0 = new X.0r1M
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0r1M) X.0r1M.LL X.0r1M
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1572420r1M.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0r6r> r3 = X.C1575830r6r.class
                        java.lang.String r2 = "getFriendsV3SkylightShowState()Z"
                        r1 = 0
                        java.lang.String r0 = "friendsV3SkylightShowState"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1572420r1M.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0r6r r2 = (X.C1575830r6r) r2
                        boolean r0 = r2.LLIZ
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1572420r1M.get(java.lang.Object):java.lang.Object");
                }
            }
            kotlin.jvm.internal.AwS638S0100000_24 r10 = new kotlin.jvm.internal.AwS638S0100000_24
            r0 = 16
            r10.<init>(r6, r0)
            X.C736680Sv4.LJIIIIZZ(r6, r7, r8, r9, r10, r11)
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r6)
            if (r0 == 0) goto L82
            com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility r1 = X.C1565840qqk.LIZ(r0)
            if (r1 == 0) goto L82
            X.01GW r0 = r6.LLJJIJIIJIL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r1.Cp0(r0)
        L82:
            android.view.View r4 = r6.LJJIJL()
            android.view.View r0 = r6.LJJIJL()
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r2 = r3.topMargin
            X.0qg8 r0 = r6.LLJJI
            java.lang.Object r0 = r0.getValue()
            X.0qoZ r0 = (X.C1564490qoZ) r0
            if (r0 == 0) goto Lb1
            X.0qoa r0 = r0.LLILLJJLI
            if (r0 == 0) goto Lb1
            boolean r1 = r0.LIZJ
            r0 = 1
            if (r1 != r0) goto Lb1
            android.view.View r0 = r6.LJJIJL()
            android.content.Context r0 = r0.getContext()
            int r5 = X.C497820Jfg.LIZJ(r0)
        Lb1:
            int r2 = r2 + r5
            r3.topMargin = r2
            X.C786410Ut5.W5(r4, r3)
            return
        Lb8:
            r1 = r9
        Lb9:
            java.util.Map r0 = X.C2097608Jq.LJ()
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightContainerAssem.onViewCreated(android.view.View):void");
    }
}
