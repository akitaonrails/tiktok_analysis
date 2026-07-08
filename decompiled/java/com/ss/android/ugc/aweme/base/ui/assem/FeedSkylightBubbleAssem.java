package com.ss.android.ugc.aweme.base.ui.assem;

import X.AbstractC738140SxQ;
import X.C01D1;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C14EU;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C1565840qqk;
import X.C1597100rfA;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1A5L;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C299660Boq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C497820Jfg;
import X.C614770O9j;
import X.C622680Oba;
import X.C628500Oky;
import X.C630740Ooa;
import X.C714060Rzg;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1616310sA9;
import X.InterfaceC1595030rbp;
import X.InterfaceC1595130rbz;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS158S0100000_24;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityOptConfig;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSkylightBubbleAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 59));
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    public final C630740Ooa LLJJIJI = C628500Oky.LIZ(new AwS568S0100000_24(this, 62));
    public final AssemVMLazy LLJJIJIIJIL;
    public final C736950SvV LLJJIJIL;
    public final AnimatorSet LLJJJ;
    public boolean LLJJJIL;
    public ObjectAnimator LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedSkylightBubbleAssem.class, "containerVM", "getContainerVM()Lcom/ss/android/ugc/aweme/base/vm/FeedSkylightContainerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.c76;
    }

    public FeedSkylightBubbleAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightContainerViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 60);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, awS568S0100000_24, AFwS264S0000000_24.get$arr$(20), null, true);
        this.LLJJIJIL = new C736950SvV(C13LE.LIZ(FeedSkylightListViewModel.class), new AwS568S0100000_24(this, 61), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(21), new AwS568S0100000_24((AbstractC738140SxQ) this, 63), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJJ = new AnimatorSet();
    }

    public final FeedSkylightContainerViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (FeedSkylightContainerViewModel) assemVMLazy.getValue();
    }

    public final FeedSkylightListViewModel ip() {
        return (FeedSkylightListViewModel) this.LLJJIJIL.getValue();
    }

    public final int kp() {
        return ((Number) this.LLJJIJI.getValue()).intValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
        ObjectAnimator objectAnimator = this.LLJJJJ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.LLJJJJ;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
        }
    }

    public final void mp(String str) {
        String strLIZLLL;
        InterfaceC1595030rbp interfaceC1595030rbp;
        if (str.length() > 0) {
            ((TextView) this.LLJJI.getValue()).setText(str);
            return;
        }
        TextView textView = (TextView) this.LLJJI.getValue();
        if (FollowingSkylightAbilityOptConfig.LIZ()) {
            Context context = getContext();
            strLIZLLL = null;
            if (context != null) {
                InterfaceC1595130rbz interfaceC1595130rbzFQ2 = ip().FQ2();
                if (!(interfaceC1595130rbzFQ2 instanceof InterfaceC1595030rbp) || (interfaceC1595030rbp = (InterfaceC1595030rbp) interfaceC1595130rbzFQ2) == null || (strLIZLLL = interfaceC1595030rbp.LJIJJ(context, false)) == null) {
                    C1597100rfA c1597100rfA = C1597100rfA.LIZ;
                    int iKp = kp();
                    c1597100rfA.getClass();
                    strLIZLLL = C1597100rfA.LIZLLL(iKp);
                }
            }
        } else {
            C1597100rfA c1597100rfA2 = C1597100rfA.LIZ;
            int iKp2 = kp();
            c1597100rfA2.getClass();
            strLIZLLL = C1597100rfA.LIZLLL(iKp2);
        }
        textView.setText(strLIZLLL);
    }

    @C14EU
    public final void onClearModeEvent(C714060Rzg c714060Rzg) {
        String str;
        Map<String, String> map;
        Fragment fragmentLJI;
        if (!C299660Boq.LIZ()) {
            return;
        }
        if (EnumC1616310sA9.SWITCH_PAGE.getType() == c714060Rzg.LIZIZ && (fragmentLJI = C724240Sb0.LJI(this)) != null && fragmentLJI.getUserVisibleHint()) {
            return;
        }
        String str2 = c714060Rzg.LIZLLL;
        C1564490qoZ c1564490qoZ = (C1564490qoZ) this.LLJJIII.getValue();
        if (c1564490qoZ != null && (map = c1564490qoZ.LL) != null) {
            str = map.get("enter_from");
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str2, str)) {
            if (c714060Rzg.LIZ) {
                if (!this.LLJJJIL) {
                    boolean zVQ2 = hp().vQ2();
                    lp(false, true);
                    Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                    if (fragmentLJI2 != null) {
                        C614770O9j.LIZIZ.LJ().LJJIIJZLJL(kp(), fragmentLJI2, false);
                    }
                    hp().LLILZIL = zVQ2;
                }
                this.LLJJJIL = true;
                return;
            }
            if (hp().LLILZIL) {
                Fragment fragmentLJI3 = C724240Sb0.LJI(this);
                if (fragmentLJI3 != null) {
                    C614770O9j.LIZIZ.LJ().LJJIIJZLJL(kp(), fragmentLJI3, true);
                }
                hp().LLILZIL = false;
            }
            this.LLJJJIL = false;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        IFeedCleanAbility iFeedCleanAbilityLIZ;
        super.onViewCreated(view);
        C622680Oba.LIZJ(this);
        View viewLJJIJL = LJJIJL();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bp);
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.zj);
        viewLJJIJL.setBackground(c384050F3z.LIZ(viewLJJIJL.getContext()));
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 5), viewLJJIJL);
        ((TextView) this.LLJJI.getValue()).setText(view.getContext().getString(2131849134));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (iFeedCleanAbilityLIZ = C1565840qqk.LIZ(fragmentLJI)) != null) {
            iFeedCleanAbilityLIZ.Cp0(LJJIJL());
        }
        int iLIZJ = C497820Jfg.LIZJ(LJJIJL().getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LJJIJL().getLayoutParams();
        marginLayoutParams.topMargin += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)) + iLIZJ;
        C786410Ut5.W5(LJJIJL(), marginLayoutParams);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0r6w
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1575830r6r) obj).LLILZ;
            }
        }, null, new AwS638S0100000_24(this, 146), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0r1O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1575830r6r) obj).LLILLJJLI);
            }
        }, null, new AwS638S0100000_24(this, 147), 6);
        C2271391DvN.LIZ(LJJIJL(), (C1A5L) C2271381DvM.LLJJJJ.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lp(boolean r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightBubbleAssem.lp(boolean, boolean):void");
    }
}
