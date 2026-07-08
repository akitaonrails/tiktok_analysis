package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C01GW;
import X.C0IVP;
import X.C1308910kAL;
import X.C1558040qeA;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1619980sG4;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C725890Sdf;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1570900qyu;
import Y.ALAdapterS4S0210000_24;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3NavHideOnScrollConfig;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3NavBarAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS22S1110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import wh6.AbS703S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3NavBarAssem extends UIContentAssem implements FriendsV3NavBarAbility {
    public ObjectAnimator LLIZLLLIL;
    public boolean LLJ;
    public Integer LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C630740Ooa LLJJ;

    public final FrameLayout Go() {
        return (FrameLayout) this.LLJIJIL.getValue();
    }

    public FriendsV3NavBarAssem() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJIJIL = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 521));
        this.LLJILJIL = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 518));
        this.LLJILJILJ = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 520));
        this.LLJILLL = C452501pT.LIZ(enumC452301pR, AFwS213S0000000_24.get$arr$(179));
        this.LLJJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 519));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), FriendsV3NavBarAbility.class, null);
        }
        InterfaceC1570900qyu interfaceC1570900qyu = (InterfaceC1570900qyu) this.LLJILLL.getValue();
        if (interfaceC1570900qyu != null) {
            interfaceC1570900qyu.onDestroyView();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3NavBarAbility
    public final void Ku1(int i) {
        Context context;
        Integer numLIZJ;
        this.LLJI = Integer.valueOf(i);
        if (this.LLJ) {
            LJJIJL().setBackgroundColor(0);
            return;
        }
        if (((FriendsV3NavHideOnScrollConfig) C1558040qeA.LIZIZ.getValue()).enable && Color.alpha(i) == 0 && (context = getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context)) != null) {
            i = numLIZJ.intValue();
        }
        LJJIJL().setBackgroundColor(i);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3NavBarAbility
    public final void WE2(boolean z) {
        Context context;
        if (this.LLJ == z) {
            return;
        }
        this.LLJ = z;
        int iIntValue = 0;
        if (z) {
            LJJIJL().setBackgroundColor(0);
            return;
        }
        Integer numLIZJ = this.LLJI;
        if (numLIZJ != null || ((context = getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context)) != null)) {
            iIntValue = numLIZJ.intValue();
        }
        Ku1(iIntValue);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View viewF2;
        InterfaceC1570900qyu interfaceC1570900qyu;
        super.onViewCreated(view);
        C725890Sdf.LIZIZ(Go(), C0IVP.LIZ());
        FrameLayout frameLayoutGo = Go();
        Context context = getContext();
        if (context != null && (interfaceC1570900qyu = (InterfaceC1570900qyu) this.LLJILLL.getValue()) != null) {
            viewF2 = interfaceC1570900qyu.f2(context);
        } else {
            viewF2 = null;
        }
        frameLayoutGo.addView(viewF2);
        C786410Ut5.I7(new AbS703S0100000_24(this, 11), (View) this.LLJILJIL.getValue());
        C786410Ut5.I7(new AbS703S0100000_24(this, 12), (View) this.LLJILJILJ.getValue());
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, FriendsV3NavBarAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3NavBarAbility
    public final void iy(AwS22S1110000_24 awS22S1110000_24, boolean z) {
        float f;
        ObjectAnimator objectAnimator = this.LLIZLLLIL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z && Go().getVisibility() == 8) {
            C786410Ut5.LJLLLLLL(0, Go());
        }
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
            f2 = 1.0f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.U4(Go(), f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(Go(), "alpha", f2);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        objectAnimatorOfFloat.addListener(new ALAdapterS4S0210000_24(this, z, awS22S1110000_24, 1));
        this.LLIZLLLIL = objectAnimatorOfFloat;
        if (z) {
            awS22S1110000_24.invoke();
            ObjectAnimator objectAnimator2 = this.LLIZLLLIL;
            if (objectAnimator2 != null) {
                C786410Ut5.Pd(objectAnimator2);
                return;
            }
            return;
        }
        ObjectAnimator objectAnimator3 = this.LLIZLLLIL;
        if (objectAnimator3 == null) {
            return;
        }
        C786410Ut5.Pd(objectAnimator3);
    }
}
