package com.ss.android.ugc.feed.platform.panel.login;

import X.C01GW;
import X.C0RLJ;
import X.C0RUJ;
import X.C0SZ8;
import X.C1566140qrE;
import X.C1EE2;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.C733880SqY;
import X.C733890SqZ;
import X.C733940Sqe;
import X.C733970Sqh;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LoginFollowComponent extends BasePanelComponent implements ILoginFollowAbility, C0RUJ, InterfaceC1554640qYg {
    public static final /* synthetic */ int LLILZIL = 0;
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "login_follow";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1431079234) {
            return null;
        }
        return this;
    }

    public final int bo() {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        C0SZ8 c0sz8LJLIL;
        VideoItemParams videoItemParamsLJ;
        if (!C1EE2.LIZIZ.LIZLLL() || (iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLJJLI.getValue()) == null || (c0sz8LJLIL = iViewPagerComponentAbility.LJLIL()) == null || (videoItemParamsLJ = C0RLJ.LJ(c0sz8LJLIL)) == null) {
            return 0;
        }
        return videoItemParamsLJ.isEnterGraphicDetail;
    }

    public LoginFollowComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS555S0100000_11((InterfaceC1565950qqv) this, 1301), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C733890SqZ(false, this));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = C452501pT.LIZIZ(new C733940Sqe(this));
        this.LLILLL = C452501pT.LIZIZ(new C733880SqY(this));
        this.LLILZ = C452501pT.LIZIZ(new C733970Sqh());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f2  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [int] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    @Override // com.ss.android.ugc.feed.platform.panel.login.ILoginFollowAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean fn2(final X.C737030Svd r28, final kotlin.jvm.internal.AwS412S0200000_11 r29) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.login.LoginFollowComponent.fn2(X.0Svd, kotlin.jvm.internal.AwS412S0200000_11):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:240:0x0547  */
    /* JADX INFO: renamed from: do, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m342do(com.ss.android.ugc.aweme.feed.model.Aweme r27, java.lang.String r28, boolean r29, int r30, X.C737030Svd r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 1929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.login.LoginFollowComponent.m342do(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean, int, X.0Svd, boolean):void");
    }
}
