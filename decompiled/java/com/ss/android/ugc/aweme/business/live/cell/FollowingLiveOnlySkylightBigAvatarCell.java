package com.ss.android.ugc.aweme.business.live.cell;

import X.C01GW;
import X.C0IVT;
import X.C1597740rgC;
import X.C1597840rgM;
import X.C1607470rvt;
import X.C1610740s1A;
import X.C1610770s1D;
import X.C1720106oR;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C294120Bfu;
import X.C341940Daq;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1605560rso;
import X.EnumC1610470s0j;
import X.InterfaceC1891350zJl;
import Y.ACListenerS126S0200000_24;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingLiveOnlySkylightBigAvatarCell extends BaseFollowingLiveOnlySkylightCell<C1597840rgM> {
    public C1610740s1A LLIZLLLIL;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 161));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 158));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 162));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 160));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 159));
    public final EnumC1605560rso LLJ = EnumC1605560rso.MUTE_LIVES;
    public final Map<String, String> LLJI = C2097608Jq.LJ();

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View L5() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final User N5() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View R5() {
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.c7y;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell
    public final View Hy1() {
        return (View) this.LLILZ.getValue();
    }

    public final View a6() {
        return (View) this.LLILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        ViewGroup viewGroup;
        super.onItemViewCreated();
        if (C1607470rvt.LIZ().followingSkyFixVersion <= 0) {
            View viewA6 = a6();
            if ((viewA6 instanceof ConstraintLayout) && (viewGroup = (ViewGroup) viewA6) != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
        this.LLIZLLLIL = new C1610740s1A(EnumC1610470s0j.SKYLIGHT, (View) this.LLILZ.getValue(), (View) this.LLILZ.getValue(), (C1610770s1D) this.LLIZ.getValue());
        View view = (View) this.LLIZ.getValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        layoutParams.height += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        C786410Ut5.W5(view, layoutParams);
        C426750GoL.LJIIL(view, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), 16);
        C1610740s1A c1610740s1A = this.LLIZLLLIL;
        if (c1610740s1A != null) {
            c1610740s1A.LJIIIIZZ = false;
        }
        TuxTextView tuxTextView = (TuxTextView) this.LLILZIL.getValue();
        if (!(tuxTextView instanceof TuxTextView) || tuxTextView == null) {
            return;
        }
        tuxTextView.setTuxFont(82);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onPause() {
        super.onPause();
        C1610740s1A c1610740s1A = this.LLIZLLLIL;
        if (c1610740s1A != null) {
            c1610740s1A.Ir();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C1610740s1A c1610740s1A = this.LLIZLLLIL;
        if (c1610740s1A != null) {
            c1610740s1A.LIZ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C1610740s1A c1610740s1A = this.LLIZLLLIL;
        if (c1610740s1A != null) {
            c1610740s1A.LJIIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final EnumC1605560rso I5() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final Map<String, String> P5() {
        return this.LLJI;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1597840rgM c1597840rgM = (C1597840rgM) interfaceC1891350zJl;
        super.onBindItemView(c1597840rgM);
        c1597840rgM.getClass();
        C786410Ut5.Ob(this.itemView, 1.0f);
        C786410Ut5.pc(this.itemView, 1.0f);
        W5((TextView) this.LLILZLL.getValue());
        if (C294120Bfu.LIZJ()) {
            C426750GoL.LJIIIZ((View) this.LLILZIL.getValue(), 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19))), false, 16);
            ((C1610770s1D) this.LLIZ.getValue()).setInnerStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))));
        }
        C786410Ut5.Y((C1610770s1D) this.LLIZ.getValue(), 0);
        C1610740s1A c1610740s1A = this.LLIZLLLIL;
        if (c1610740s1A != null) {
            c1610740s1A.LJFF(null, FollowingLiveOnlySkylightBigAvatarCell.class, null, null, null);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a6().getLayoutParams();
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.height = C341940Daq.LIZ(130);
        marginLayoutParams.width = C341940Daq.LIZ(96);
        a6().setPaddingRelative(0, 0, 0, 0);
        C786410Ut5.W5(a6(), marginLayoutParams);
        C2271391DvN.LIZ(a6(), C2271381DvM.LIZ());
        C786410Ut5.I7(new ACListenerS126S0200000_24(this, c1597840rgM, 33), a6());
        try {
            C1597740rgC.LIZ.getClass();
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().T8(C0IVT.LIZ("homepage_follow", "live_cover", C1597740rgC.LJII(null)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZJ("LiveOnlySkylightBigAvatarCell", e);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        C1610740s1A c1610740s1A = this.LLIZLLLIL;
        if (c1610740s1A != null) {
            c1610740s1A.xs();
        }
    }
}
