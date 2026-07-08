package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interaction.repost;

import X.C01GW;
import X.C098200Yq;
import X.C1356620lPI;
import X.C1360210lV5;
import X.C1770850wBP;
import X.C189200o6;
import X.C20642515q3;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C337180DJs;
import X.C339190DRl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C704790Rkj;
import X.C705700RmC;
import X.C730970Slr;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC1361270lWn;
import Y.ACListenerS155S0100000_21;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3RepostDiggAssem extends BaseFriendsV3CellUISlotAssem<FriendsV3RepostDiggAssem, InterfaceC1361270lWn> {
    public FriendsV3RepostModel LLJL;
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(271));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 585));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 586));
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final ACListenerS155S0100000_21 LLLFF;

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJLILLLLZIIL.getValue();
        if (assemViewModel != null) {
            C1360210lV5 c1360210lV5 = new C2217381BqS() { // from class: X.0lV5
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1357900lRM) obj).LLILLL;
                }
            };
            C1770850wBP c1770850wBP = new C1770850wBP();
            c1770850wBP.LIZIZ = AFwS305S0000000_21.get$arr$(32);
            C736680Sv4.LJIIIIZZ(this, assemViewModel, c1360210lV5, c1770850wBP, AFwS305S0000000_21.get$arr$(33), 4);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return ((Boolean) this.LLL.getValue()).booleanValue() ? R.layout.car : R.layout.caq;
    }

    public final TuxTextView sp() {
        return (TuxTextView) this.LLJZ.getValue();
    }

    public FriendsV3RepostDiggAssem() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJLLIL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(this, 581));
        this.LLJLLL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(this, 582));
        this.LLJZ = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(this, 580));
        this.LLJZIJLIL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(this, 579));
        this.LLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(270));
        this.LLLF = C452501pT.LIZIZ(new AwS565S0100000_21(this, 583));
        this.LLLFF = new ACListenerS155S0100000_21(this, 68);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, Oo(), new AwS565S0100000_21(this, 584));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(this.LLLFF, LJJIJL());
        C786410Ut5.O7((FrameLayout) this.LLJZIJLIL.getValue(), this.LLLFF);
        C786410Ut5.R7((LinearLayout) this.LLJLLL.getValue(), this.LLLFF);
        if (((Boolean) this.LLL.getValue()).booleanValue()) {
            sp().setMaxWidth(((Number) this.LLLF.getValue()).intValue());
            LJJIJL().setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0);
            C426750GoL.LJIIIZ(LJJIJL(), null, null, 0, null, false, 27);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(java.lang.Object r4) {
        /*
            r3 = this;
            X.0lWn r4 = (X.InterfaceC1361270lWn) r4
            boolean r1 = r4 instanceof X.InterfaceC1357880lRK
            r0 = 0
            if (r1 == 0) goto Lf
            X.0lRK r4 = (X.InterfaceC1357880lRK) r4
            if (r4 == 0) goto Lf
            com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel r0 = r4.LLD()
        Lf:
            r3.LLJL = r0
            r2 = 0
            if (r0 == 0) goto L33
            java.lang.Integer r0 = r0.isViewerLiked
            if (r0 == 0) goto L33
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L33
        L1f:
            com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel r0 = r3.LLJL
            if (r0 == 0) goto L2b
            java.lang.Integer r0 = r0.likeCount
            if (r0 == 0) goto L2b
            int r2 = r0.intValue()
        L2b:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r3.tp(r0, r1)
            return
        L33:
            r1 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interaction.repost.FriendsV3RepostDiggAssem.up(java.lang.Object):void");
    }

    public final void up(String str) {
        int iLIZIZ;
        if (str == null) {
            return;
        }
        if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        } else if (str.length() <= 2) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        } else {
            iLIZIZ = -2;
        }
        View contentView = getContentView();
        ViewGroup.LayoutParams layoutParams = getContentView().getLayoutParams();
        layoutParams.width = iLIZIZ;
        C786410Ut5.W5(contentView, layoutParams);
        if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            C337180DJs.LIZ(sp());
        } else {
            sp().setText(str);
            C339190DRl.LIZLLL(sp());
        }
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    public final void tp(String str, boolean z) {
        try {
            ((C730970Slr) this.LLJLLIL.getValue()).setSelected(z);
            if (((C730970Slr) this.LLJLLIL.getValue()).isSelected()) {
                ((LinearLayout) this.LLJLLL.getValue()).setContentDescription(C20642515q3.LJI(2131823228));
            } else {
                ((LinearLayout) this.LLJLLL.getValue()).setContentDescription(C1356620lPI.LIZ(C20642515q3.LJI(2131823204), C2097908Jt.LIZJ(new Pair("number", String.valueOf(str)))));
            }
            if (((Boolean) this.LLL.getValue()).booleanValue()) {
                up(str);
                return;
            }
            sp().setText(str);
            C339190DRl.LIZLLL(sp());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void yp(int i, boolean z) {
        int i2;
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        FriendsV3RepostModel friendsV3RepostModel = this.LLJL;
        if (friendsV3RepostModel != null) {
            friendsV3RepostModel.isViewerLiked = Integer.valueOf(i2);
        }
        FriendsV3RepostModel friendsV3RepostModel2 = this.LLJL;
        if (friendsV3RepostModel2 != null) {
            friendsV3RepostModel2.likeCount = Integer.valueOf(i);
        }
        tp(String.valueOf(i), z);
    }
}
