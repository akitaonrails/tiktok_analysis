package com.ss.android.ugc.aweme.feed.assem.tns.statecontrol;

import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C724750Sbp;
import X.C737910Sx3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class StateControlMediaAssem extends BaseCellSlotComponent<StateControlMediaAssem> implements ComponentPriorityProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 268));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StateControlMediaAssem.class, "scmLabelVM", "getScmLabelVM()Lcom/ss/android/ugc/aweme/feed/assem/tns/statecontrol/StateControlMediaVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StateControlMediaAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StateControlMediaVM.class);
        C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 269), null, AFwS243S0000000_11.get$arr$(97));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "left_container_scm";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bb1;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unBind() {
        /*
            r5 = this;
            boolean r0 = r5.bp()
            if (r0 == 0) goto L46
            android.view.View r1 = r5.getContentView()
            r0 = 2131389394(0x7f0a6bd2, float:1.839933E38)
            android.view.View r4 = r1.findViewById(r0)
            if (r4 == 0) goto L46
            com.ss.android.ugc.feed.platform.ab.FeedComponentsMarginBugFixConfig r0 = X.C0C2P.LIZ
            if (r0 == 0) goto L4b
            boolean r1 = r0.stateControlMarginFix
            r0 = 1
            if (r1 != r0) goto L4b
        L1c:
            r3 = 0
            if (r0 != 0) goto L43
            android.view.View r0 = r5.LJJIJL()
            android.content.Context r2 = r0.getContext()
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L49
            java.lang.Object r0 = r0.LL
        L2d:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            java.lang.String r1 = r0.mEventType
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L47
            java.lang.Object r0 = r0.LL
        L37:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            boolean r0 = X.C0RR7.LIZIZ(r2, r0, r1)
            if (r0 == 0) goto L46
        L43:
            X.C694320RLi.LIZ(r4, r3)
        L46:
            return
        L47:
            r0 = r3
            goto L37
        L49:
            r0 = r3
            goto L2d
        L4b:
            r0 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.tns.statecontrol.StateControlMediaAssem.unBind():void");
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r8) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.tns.statecontrol.StateControlMediaAssem.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLLIL.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.zB1(this);
        }
    }
}
