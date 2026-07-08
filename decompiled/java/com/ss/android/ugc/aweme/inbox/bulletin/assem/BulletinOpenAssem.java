package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C0OLV;
import X.C11WX;
import X.C11WY;
import X.C13LE;
import X.C1440005kM;
import X.C14EU;
import X.C1548820qPI;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1751006tQ;
import X.C19719912Dl;
import X.C20501715Kd;
import X.C20501815Ke;
import X.C2217381BqS;
import X.C262100zr;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C7854034y;
import X.InterfaceC1141530foN;
import X.InterfaceC20501915Kf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2229408oO;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMediaViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes30.dex */
public final class BulletinOpenAssem extends AbstractC738140SxQ implements InterfaceC1141530foN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(206));
    public final AssemVMLazy LLILLL;
    public final C11WY LLILZ;
    public final C11WX LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinOpenAssem.class, "mediaVm", "getMediaVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinMediaViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.11WY] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.11WX] */
    public BulletinOpenAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinMediaViewModel.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 651), AFwS273S0000000_29.get$arr$(85), null, true);
        this.LLILZ = new InterfaceC2229408oO() { // from class: X.11WY
            public final EnumC2229208oM LIZ = EnumC2229208oM.MUSIC;

            @Override // X.InterfaceC2229408oO
            public final void LIZIZ() {
                C0OPX.LJII("BulletinOpenAssem: MUSIC lost focus -> stop player");
                C20501715Kd.LIZJ(null);
            }

            @Override // X.InterfaceC2229408oO
            public final EnumC2229208oM LIZ() {
                return this.LIZ;
            }
        };
        this.LLILZIL = new InterfaceC20501915Kf() { // from class: X.11WX
            @Override // X.InterfaceC20501915Kf
            public final void LJ() {
                this.LIZ.bo().LLILLJJLI.LIZIZ(this.LIZ.LLILZ);
            }

            @Override // X.InterfaceC20501915Kf
            public final void LIZIZ(Music music) {
                this.LIZ.bo().LLILLJJLI.LIZJ(this.LIZ.LLILZ);
            }

            @Override // X.InterfaceC20501915Kf
            public final void LJFF(Music music) {
                this.LIZ.bo().LLILLJJLI.LIZJ(this.LIZ.LLILZ);
            }

            @Override // X.InterfaceC20501915Kf
            public final void LIZ(Music music, C0OR7 c0or7) {
                this.LIZ.bo().LLILLJJLI.LIZIZ(this.LIZ.LLILZ);
            }

            @Override // X.InterfaceC20501915Kf
            public final void LIZJ(Music music, float f, boolean z) {
                this.LIZ.bo().LLILLJJLI.LIZIZ(this.LIZ.LLILZ);
            }

            @Override // X.InterfaceC20501915Kf
            public final void LIZLLL(Music music, String str, float f, boolean z) {
                this.LIZ.bo().LLILLJJLI.LIZIZ(this.LIZ.LLILZ);
            }
        };
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final BulletinMediaViewModel bo() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (BulletinMediaViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        m245do(1);
        C20501815Ke c20501815Ke = C20501715Kd.LIZ;
        C20501715Kd.LJ.add(this.LLILZIL);
        C1548820qPI.LIZLLL("bb_leave_page_event", this);
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        m245do(2);
        C20501815Ke c20501815Ke = C20501715Kd.LIZ;
        C20501715Kd.LJ.remove(this.LLILZIL);
        bo().LLILLJJLI.LIZIZ(this.LLILZ);
        C1548820qPI.LJIIIIZZ("bb_leave_page_event", this);
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        m245do(4);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        m245do(3);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m245do(int i) {
        C0OLV c0olv = (C0OLV) this.LL.getValue();
        if (c0olv != null) {
            C1440005kM.LIZ(new C7854034y(c0olv.LL, (String) this.LLILLJJLI.getValue(), i));
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "bb_leave_page_event")) {
            C20501715Kd.LIZJ(null);
        }
    }

    @C14EU
    public final void onEvent(C1751006tQ c1751006tQ) {
        C20501815Ke c20501815Ke = C20501715Kd.LIZ;
        C20501715Kd.LIZJ(c1751006tQ.LIZ);
    }
}
