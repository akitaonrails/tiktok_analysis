package com.ss.android.ugc.aweme.search.entry.commenticon.assem;

import X.C0QQT;
import X.C0QQW;
import X.C1397760mTe;
import X.C13LP;
import X.C14EU;
import X.C1850607Mq;
import X.C1A5L;
import X.C20094413jq;
import X.C20094813ju;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C426750GoL;
import X.C427690Gpr;
import X.C497820Jfg;
import X.C667180QEy;
import X.C687700QyG;
import X.C786410Ut5;
import X.EnumC1397840mTm;
import X.EnumC667250QFf;
import X.InterfaceC1146704e9;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.entry.commenticon.communication.CommentRootFragmentScope;
import com.ss.android.ugc.aweme.search.entry.commenticon.config.CommentSearchIconEnabledEnterFromData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes11.dex */
public final class ShrinkVideoSearchIconAssem extends UIContentAssem implements C0QQT, InterfaceC737790Swr, InterfaceC1146704e9 {
    public final ShrinkVideoSearchIconAssem LLIZLLLIL = this;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public FrameLayout LLJILJIL;
    public TuxIconView LLJILJILJ;
    public C667180QEy LLJILLL;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentRootFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentRootFragmentScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.C0QQT
    public final boolean Si() {
        return this.LLJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.LLJIJIL
            if (r0 == 0) goto L3a
            boolean r0 = r2.LLJI
            if (r0 != 0) goto L3a
            com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService r0 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJIL()
            boolean r0 = r0.LJJJJZI()
            if (r0 != 0) goto L3a
            X.0QEy r0 = r2.LLJILLL
            if (r0 == 0) goto L38
            java.lang.String r1 = r0.LIZJ
        L18:
            java.lang.String r0 = "title_panel"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L30
            X.0SHs r1 = X.C718860SHs.LIZ
            r1.getClass()
            boolean r0 = X.C0QQX.LIZ
            if (r0 != 0) goto L30
            r1.getClass()
            boolean r0 = X.C2548109yh.LIZ
            if (r0 == 0) goto L3a
        L30:
            if (r3 == 0) goto L3a
            android.widget.FrameLayout r0 = r2.LLJILJIL
            X.C337180DJs.LIZJ(r0)
            return
        L38:
            r1 = 0
            goto L18
        L3a:
            android.widget.FrameLayout r0 = r2.LLJILJIL
            X.C337180DJs.LIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.entry.commenticon.assem.ShrinkVideoSearchIconAssem.Go(boolean):void");
    }

    @Override // X.C0QQT
    public final void L9(boolean z) {
        this.LLJI = z;
        Go(true);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentRootFragmentScope.class}).unbindAbility(this.LLIZLLLIL, C0QQT.class);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSearchSevenScreenEvent(C0QQW c0qqw) {
        if (c0qqw.LIZ == EnumC667250QFf.STATE_SEVEN_SCREEN) {
            Go(false);
        }
        if (c0qqw.LIZ == EnumC667250QFf.STATE_CLOSE_SCREEN) {
            Go(true);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentRootFragmentScope.class}).bindAbility(this.LLIZLLLIL, C0QQT.class);
    }

    @Override // X.C0QQT
    public final void e3(int i, int i2, Boolean bool, C667180QEy c667180QEy) {
        String string;
        Integer numValueOf;
        if (i != i2) {
            if (!Intrinsics.LJFF(bool, Boolean.TRUE) && !Intrinsics.LJFF(c667180QEy.LIZJ, "comment_card")) {
                return;
            }
            if (!C13LP.LJJJJ(c667180QEy.LIZ, ((CommentSearchIconEnabledEnterFromData) C1850607Mq.LIZIZ.getValue()).enabledEnterFrom)) {
                this.LLJIJIL = false;
                Go(true);
                return;
            }
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 3) {
                        return;
                    }
                } else {
                    this.LLJIJIL = false;
                    this.LLJI = false;
                    Go(true);
                    return;
                }
            }
            if (!this.LLJ) {
                this.LLJ = true;
                ViewStub viewStub = (ViewStub) LJJIJL().findViewById(R.id.blz);
                viewStub.setLayoutResource(R.layout.evm);
                viewStub.setInflatedId(R.id.ual);
                View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                this.LLJILJIL = (FrameLayout) viewLJLLLL.findViewById(R.id.ual);
                this.LLJILJILJ = (TuxIconView) viewLJLLLL.findViewById(R.id.uaj);
                FrameLayout frameLayout = this.LLJILJIL;
                if (frameLayout != null) {
                    Context context = getContext();
                    if (context != null) {
                        numValueOf = Integer.valueOf(C497820Jfg.LIZJ(context));
                    } else {
                        numValueOf = null;
                    }
                    C426750GoL.LJIIL(frameLayout, null, numValueOf, null, null, 29);
                }
                C2271391DvN.LIZ(this.LLJILJILJ, (C1A5L) C2271381DvM.LJJLIIIJJI.getValue());
                Context context2 = getContext();
                if (context2 == null || (string = context2.getString(R.string.spp)) == null) {
                    string = "";
                }
                TuxIconView tuxIconView = this.LLJILJILJ;
                if (tuxIconView != null) {
                    int i3 = C20094413jq.LJIIZILJ;
                    C1397760mTe c1397760mTe = new C1397760mTe();
                    c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
                    c1397760mTe.LIZJ = null;
                    c1397760mTe.LIZ = string;
                    C20094813ju.LIZ(tuxIconView, c1397760mTe.LIZ());
                }
                TuxIconView tuxIconView2 = this.LLJILJILJ;
                if (tuxIconView2 != null) {
                    C427690Gpr.LJI(tuxIconView2, null);
                }
                TuxIconView tuxIconView3 = this.LLJILJILJ;
                if (tuxIconView3 != null) {
                    C786410Ut5.a9(tuxIconView3, new ACListenerS145S0100000_10(this, 90));
                }
            }
            this.LLJILLL = c667180QEy;
            this.LLJIJIL = true;
            Go(true);
        }
    }
}
