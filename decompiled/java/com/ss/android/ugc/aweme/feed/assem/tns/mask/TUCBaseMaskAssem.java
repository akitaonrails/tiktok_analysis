package com.ss.android.ugc.aweme.feed.assem.tns.mask;

import X.C01GW;
import X.C03H5;
import X.C0CNO;
import X.C0HHT;
import X.C1389300mG0;
import X.C1389890mGx;
import X.C13LE;
import X.C1558520qew;
import X.C1618440sDa;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC706770Rnv;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class TUCBaseMaskAssem<RECEIVER extends C03H5> extends FeedBaseAssem<RECEIVER> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(95));
    public final InterfaceC1731706qJ LLJL;
    public final C01GW LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TUCBaseMaskAssem.class, "tucMaskVM", "getTucMaskVM()Lcom/ss/android/ugc/aweme/feed/assem/tns/mask/TUCMaskViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TUCBaseMaskAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TUCMaskViewModel.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 263), null, AFwS243S0000000_11.get$arr$(94));
        this.LLJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(96));
    }

    public abstract boolean Ap();

    public void Ep() {
    }

    public abstract void Fp();

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bb2;
    }

    public void tp() {
    }

    public void up() {
    }

    public final TUCMaskViewModel yp() {
        return (TUCMaskViewModel) this.LLJL.getValue(this, LLJLILLLLZIIL[0]);
    }

    public final void zp() {
        C0CNO.LIZLLL(0L, new AwS555S0100000_11((TUCBaseMaskAssem) this, 262));
    }

    public final void Bp() {
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IViewPagerComponentAbility.class, null);
        if (iViewPagerComponentAbility == null || !iViewPagerComponentAbility.rH()) {
            C1389890mGx c1389890mGx = new C1389890mGx(getContentView());
            c1389890mGx.LJIIIZ(2131858127);
            c1389890mGx.LJIIJJI();
        } else {
            C1389890mGx c1389890mGx2 = new C1389890mGx(getContentView());
            c1389890mGx2.LJIIIZ(2131839880);
            c1389890mGx2.LJIIJJI();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        Object obj;
        C786410Ut5.LJLLLLLL(8, getContentView());
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0S8c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 18), 4);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0S8q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 19), 4);
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (interfaceC706770RnvLJJIIJ.LJJIIJZLJL(((VideoItemParams) obj).fragment)) {
            C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0S8a
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj3) {
                    return ((C709790Rsn) obj3).LLJJIJIL;
                }
            }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 20), 4);
        }
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.0S8r
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((C0RFV) obj3).LLJ;
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 21), 4);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.0S8d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((C0RFV) obj3).LLJILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 16), 4);
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        if (C1389300mG0.LJIIJ(((VideoItemParams) obj2).fragment)) {
            C736680Sv4.LJIIIIZZ(this, yp(), new C2217381BqS() { // from class: X.0S8b
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj3) {
                    return ((C232400v4) obj3).LL;
                }
            }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 17), 4);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        zp();
    }
}
