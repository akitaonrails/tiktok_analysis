package com.ss.android.ugc.aweme.business.common.protocol;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0IVP;
import X.C13LQ;
import X.C1564480qoY;
import X.C1564500qoa;
import X.C1564510qob;
import X.C1564550qof;
import X.C1564560qog;
import X.C319860CgK;
import X.C418440Gaw;
import X.C452501pT;
import X.C619430ORh;
import X.C723850SaN;
import X.C724240Sb0;
import X.C814420VxA;
import X.InterfaceC1564580qoi;
import X.InterfaceC1566920qsU;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import com.ss.android.ugc.aweme.protocol.IFriendsFeedSkylightProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsFeedSkylightProtocol implements IFriendsFeedSkylightProtocol {
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(76));
    public boolean LLILLJJLI;

    public static C1564500qoa LIZJ() {
        if (!C319860CgK.LIZ()) {
            C1564510qob c1564510qob = new C1564510qob();
            C1564500qoa c1564500qoa = c1564510qob.LIZ;
            c1564500qoa.LJFF = 0;
            c1564500qoa.LIZLLL = false;
            c1564500qoa.LJ = C13LQ.LJJLL(new InterfaceC1564580qoi[]{new C1564560qog(), new C1564550qof()});
            c1564510qob.LIZ(new C619430ORh());
            InterfaceC1566920qsU interfaceC1566920qsU = new InterfaceC1566920qsU() { // from class: X.0rLY
                @Override // X.InterfaceC1566920qsU
                public final void LIZ(AbstractC738140SxQ abstractC738140SxQ) {
                    boolean z;
                    C1596130rdb.LIZ.getClass();
                    if (C1596130rdb.LJIIIZ(0)) {
                        return;
                    }
                    C01D1 c01d1 = C01D1.LIZ;
                    C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightContainerViewModel.class);
                    AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1790);
                    FeedSkylightContainerViewModel feedSkylightContainerViewModel = (FeedSkylightContainerViewModel) C724750Sbp.LIZ(abstractC738140SxQ, C724750Sbp.LJIIJ(abstractC738140SxQ, c19719912DlLIZ), c01d1, C1637806bA.LIZ, awS568S0100000_24, AFwS264S0000000_24.get$arr$(664), null, true).getValue();
                    String str = feedSkylightContainerViewModel.LL;
                    C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
                    if (c1589640rT8.l2() && c1589640rT8.LLLLLLL() && !c1589640rT8.s2() && !C305290Bxv.LIZ()) {
                        z = true;
                    } else {
                        c1589640rT8.j3(false);
                        z = false;
                    }
                    if (z) {
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateSkylightDisplayStatusOnRefresh checks hiding skylight or not, enterMethod: ");
                        sbLIZ.append(str);
                        sbLIZ.append(", scene: ");
                        sbLIZ.append(0);
                        C1720106oR.LJI("SkylightDisplayUtil", C2188811AlT.LIZIZ(sbLIZ));
                        C1584950rLZ.LIZ(feedSkylightContainerViewModel);
                        return;
                    }
                    if (!feedSkylightContainerViewModel.wQ2()) {
                        feedSkylightContainerViewModel.BQ2(true);
                    }
                    if (C1584950rLZ.LIZIZ(0)) {
                        if (feedSkylightContainerViewModel.vQ2()) {
                            feedSkylightContainerViewModel.zQ2(false, true);
                        }
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateSkylightDisplayStatusOnRefresh opens skylight automatically, enterMethod: ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", scene: ");
                        sbLIZ2.append(0);
                        C1720106oR.LJI("SkylightDisplayUtil", C2188811AlT.LIZIZ(sbLIZ2));
                        FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModel, true, "auto", false, true, false, null, 52);
                        return;
                    }
                    if (c1589640rT8.l2() && feedSkylightContainerViewModel.xQ2() && feedSkylightContainerViewModel.wQ2()) {
                        return;
                    }
                    feedSkylightContainerViewModel.zQ2(true, true);
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("updateSkylightDisplayStatusOnRefresh closes skylight, enterMethod: ");
                    sbLIZ3.append(str);
                    sbLIZ3.append(", scene: ");
                    sbLIZ3.append(0);
                    C1720106oR.LJI("SkylightDisplayUtil", C2188811AlT.LIZIZ(sbLIZ3));
                    FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModel, false, str, false, false, false, null, 60);
                }
            };
            C1564500qoa c1564500qoa2 = c1564510qob.LIZ;
            c1564500qoa2.LJI = interfaceC1566920qsU;
            return c1564500qoa2;
        }
        C1564510qob c1564510qob2 = new C1564510qob();
        C1564500qoa c1564500qoa3 = c1564510qob2.LIZ;
        c1564500qoa3.LJFF = 0;
        c1564500qoa3.LIZLLL = false;
        Integer numValueOf = Integer.valueOf(R.attr.uk);
        C1564500qoa c1564500qoa4 = c1564510qob2.LIZ;
        c1564500qoa4.LIZ = numValueOf;
        c1564500qoa4.LIZJ = false;
        c1564510qob2.LIZ.LIZIZ = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(127)));
        c1564510qob2.LIZ.LJ = C13LQ.LJJLL(new InterfaceC1564580qoi[]{new C1564560qog(), new C1564550qof()});
        c1564510qob2.LIZ(new C619430ORh());
        InterfaceC1566920qsU interfaceC1566920qsU2 = new InterfaceC1566920qsU() { // from class: X.0rJX
            @Override // X.InterfaceC1566920qsU
            public final void LIZ(AbstractC738140SxQ abstractC738140SxQ) {
                C1596130rdb.LIZ.getClass();
                if (C1596130rdb.LJIIIZ(0)) {
                    return;
                }
                C01D1 c01d1 = C01D1.LIZ;
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightContainerViewModel.class);
                AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1794);
                FeedSkylightContainerViewModel feedSkylightContainerViewModel = (FeedSkylightContainerViewModel) C724750Sbp.LIZ(abstractC738140SxQ, C724750Sbp.LJIIJ(abstractC738140SxQ, c19719912DlLIZ), c01d1, C1637806bA.LIZ, awS568S0100000_24, AFwS264S0000000_24.get$arr$(667), null, true).getValue();
                if (!feedSkylightContainerViewModel.wQ2()) {
                    feedSkylightContainerViewModel.BQ2(true);
                }
            }
        };
        C1564500qoa c1564500qoa5 = c1564510qob2.LIZ;
        c1564500qoa5.LJI = interfaceC1566920qsU2;
        return c1564500qoa5;
    }

    @Override // com.ss.android.ugc.aweme.protocol.SkylightProtocol
    public final void PA0(AbstractC738140SxQ abstractC738140SxQ) {
        if (C319860CgK.LIZ()) {
            if (C0IVP.LIZ()) {
                C723850SaN.LIZJ(abstractC738140SxQ, new AwS603S0100000_24(abstractC738140SxQ, 514));
                return;
            }
            C1564480qoY.LIZJ("homepage_friends");
            C1564480qoY.LIZIZ("homepage_friends");
            C723850SaN.LIZJ(abstractC738140SxQ, new AwS390S0200000_24(abstractC738140SxQ, this, 86));
            return;
        }
        if (C0IVP.LIZ() && FriendsTabTopExperiment.LIZIZ()) {
            return;
        }
        if (C0IVP.LIZ()) {
            LIZ(C724240Sb0.LJI(abstractC738140SxQ), C724240Sb0.LIZ(abstractC738140SxQ));
            C723850SaN.LIZJ(abstractC738140SxQ, new AwS390S0200000_24(abstractC738140SxQ, this, 88));
        } else {
            C1564480qoY.LIZJ("homepage_friends");
            C1564480qoY.LIZIZ("homepage_friends");
            LIZ(C724240Sb0.LJI(abstractC738140SxQ), C724240Sb0.LIZ(abstractC738140SxQ));
            C723850SaN.LIZJ(abstractC738140SxQ, new AwS390S0200000_24(abstractC738140SxQ, this, 90));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(androidx.fragment.app.Fragment r6, X.C19EG r7) {
        /*
            r5 = this;
            X.01GW r0 = r5.LL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lf
            return
        Lf:
            boolean r0 = r5.LLILLJJLI
            if (r0 == 0) goto L14
            return
        L14:
            r3 = 0
            if (r7 == 0) goto L27
            X.0Q7z r0 = X.C1558360qeg.LJI(r7, r3)
            com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility r1 = X.C1583510rJF.LIZLLL(r0)
            if (r1 == 0) goto L24
            r1.kK2()
        L24:
            if (r6 != 0) goto L29
            return
        L27:
            r1 = r3
            goto L24
        L29:
            r0 = 1
            r5.LLILLJJLI = r0
            X.00zU r2 = new X.00zU
            r2.<init>()
            if (r1 == 0) goto L39
            android.view.View r0 = r1.wU()
            if (r0 != 0) goto L82
        L39:
            if (r7 == 0) goto L93
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getTabLayoutByFragment: fragment = "
            r4.append(r0)
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = X.C343710Ddh.LIZ(r7)
            androidx.fragment.app.Fragment r0 = r0.BQ2()
            r4.append(r0)
            java.lang.String r0 = ", view =  "
            r4.append(r0)
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = X.C343710Ddh.LIZ(r7)
            androidx.fragment.app.Fragment r1 = r0.BQ2()
            boolean r0 = r1 instanceof X.InterfaceC1564520qoc
            if (r0 == 0) goto L91
            X.0qoc r1 = (X.InterfaceC1564520qoc) r1
            if (r1 == 0) goto L91
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.ir()
        L68:
            r4.append(r0)
            X.C2188811AlT.LIZIZ(r4)
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = X.C343710Ddh.LIZ(r7)
            androidx.fragment.app.Fragment r1 = r0.BQ2()
            boolean r0 = r1 instanceof X.InterfaceC1564520qoc
            if (r0 == 0) goto L93
            X.0qoc r1 = (X.InterfaceC1564520qoc) r1
            if (r1 == 0) goto L93
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.ir()
        L82:
            r2.element = r0
            kotlin.jvm.internal.AwS377S0200000_11 r4 = new kotlin.jvm.internal.AwS377S0200000_11
            r0 = 113(0x71, float:1.58E-43)
            r4.<init>(r6, r2, r0)
            r1 = 3
            r0 = 0
            X.C723850SaN.LIZ(r6, r0, r3, r4, r1)
            return
        L91:
            r0 = r3
            goto L68
        L93:
            r0 = r3
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.business.common.protocol.FriendsFeedSkylightProtocol.LIZ(androidx.fragment.app.Fragment, X.19EG):void");
    }
}
