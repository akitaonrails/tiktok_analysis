package com.ss.android.ugc.aweme.upvote.detail.panel;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C1358520lSM;
import X.C13LE;
import X.C1619980sG4;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C618720OOo;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.AAListenerS317S0100000_6;
import Y.AAListenerS332S0100000_21;
import Y.AAListenerS91S0101000_21;
import Y.AUListenerS17S0102000_21;
import Y.AUListenerS256S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostPanelTitleAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public LinearLayout LLJJIJI;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 884));
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostPanelTitleAssem.class, "panelVm", "getPanelVm()Lcom/ss/android/ugc/aweme/upvote/detail/panel/RepostPanelViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(RepostPanelTitleAssem.class, "interactPanelVM", "getInteractPanelVM()Lcom/ss/android/ugc/aweme/upvote/detail/replypanel/vm/RepostInteractListViewModel;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public RepostPanelTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostPanelViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS565S0100000_21(c19719912DlLIZ, 885), AFwS259S0000000_21.get$arr$(236), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(RepostInteractListViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS565S0100000_21(c19719912DlLIZ2, 886), AFwS259S0000000_21.get$arr$(237), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.i6t;
    }

    public final void ip(C1358520lSM c1358520lSM) {
        int top;
        if (c1358520lSM == null) {
            return;
        }
        if (!c1358520lSM.LIZJ && c1358520lSM.LIZIZ != 0) {
            TuxTextView tuxTextView = this.LLJJIII;
            if (tuxTextView != null && tuxTextView.getVisibility() == 0) {
                hp(c1358520lSM.LIZ, c1358520lSM.LIZIZ);
                return;
            }
            TuxTextView tuxTextView2 = this.LLJJI;
            if (tuxTextView2 != null) {
                top = tuxTextView2.getTop();
            } else {
                top = 0;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(top, iLIZIZ);
            valueAnimatorOfInt.setInterpolator(C1619980sG4.LIZLLL());
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS17S0102000_21(this, top, iLIZIZ, 3));
            valueAnimatorOfInt.addListener(new AAListenerS91S0101000_21(this, top, 3));
            valueAnimatorOfInt.addListener(new AAListenerS332S0100000_21(this, 29));
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)));
            valueAnimatorOfInt2.setInterpolator(C1619980sG4.LIZLLL());
            valueAnimatorOfInt2.setDuration(250L);
            valueAnimatorOfInt2.addUpdateListener(new AUListenerS256S0100000_6(this, 70));
            valueAnimatorOfInt2.addListener(new AAListenerS317S0100000_6(this, 37));
            valueAnimatorOfInt2.addListener(new AAListenerS317S0100000_6(this, 36));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2);
            animatorSet.start();
            hp(c1358520lSM.LIZ, c1358520lSM.LIZIZ);
            return;
        }
        TuxTextView tuxTextView3 = this.LLJJIII;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
        }
        LinearLayout linearLayout = this.LLJJIJI;
        if (linearLayout != null) {
            C426750GoL.LJIIL(linearLayout, 0, 0, 0, 0, 16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f A[PHI: r5
      0x011f: PHI (r5v1 int) = (r5v0 int), (r5v3 int) binds: [B:40:0x00d0, B:42:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.panel.RepostPanelTitleAssem.onViewCreated(android.view.View):void");
    }

    public final void hp(int i, long j) {
        TuxTextView tuxTextView = this.LLJJIII;
        if (tuxTextView != null) {
            tuxTextView.setText(getContentView().getResources().getQuantityString(2131755707, (int) j, C618720OOo.LIZ(j), C618720OOo.LIZ(i)));
        }
    }
}
