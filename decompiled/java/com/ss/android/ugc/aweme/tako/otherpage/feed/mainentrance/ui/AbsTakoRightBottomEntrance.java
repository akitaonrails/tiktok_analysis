package com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui;

import X.C01GW;
import X.C03H5;
import X.C0HHT;
import X.C127G;
import X.C13LE;
import X.C14LC;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C709450RsF;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC2174751A9h;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import Y.AObjectS64S0000000_11;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.viewmodel.ITakoFeedRightBottomEntranceViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbsTakoRightBottomEntrance<T extends C03H5> extends BaseCellSlotComponent<T> implements ComponentPriorityProtocol {
    public static final C709450RsF LLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public static final int LLLFF;
    public static final int LLLFFI;
    public static final int LLLFZ;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11((AbsTakoRightBottomEntrance) this, 946));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11((AbsTakoRightBottomEntrance) this, 947));
    public final InterfaceC1731706qJ LLJZ;
    public C127G LLJZIJLIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0RsF] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbsTakoRightBottomEntrance.class, "bizVM", "getBizVM()Lcom/ss/android/ugc/aweme/tako/otherpage/feed/mainentrance/viewmodel/ITakoFeedRightBottomEntranceViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLL = new Object() { // from class: X.0RsF
        };
        LLLFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH.get())));
        LLLFFI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL))));
        LLLFZ = numValueOf.intValue() > 0 ? numValueOf.intValue() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(47));
    }

    public AbsTakoRightBottomEntrance() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ITakoFeedRightBottomEntranceViewModel.class);
        this.LLJZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 948), null, AFwS243S0000000_11.get$arr$(489));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ep, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "right_container_tako";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fo6;
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
        return false;
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

    public final ITakoFeedRightBottomEntranceViewModel Bp() {
        return (ITakoFeedRightBottomEntranceViewModel) this.LLJZ.getValue(this, LLLF[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJZIJLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJZIJLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ITakoFeedRightBottomEntranceViewModel.class, new AObjectS64S0000000_11(this, 8)}, defaultViewModelProviderFactory);
                    this.LLJZIJLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v31, types: [T, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fp(android.view.View r20) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.AbsTakoRightBottomEntrance.Fp(android.view.View):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = LLLFF;
            C786410Ut5.W5(view, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
