package com.ss.android.ugc.aweme.relation.ffp.ui;

import X.C1295960jpS;
import X.C13IQ;
import X.C13LE;
import X.C1619980sG4;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import Y.ALAdapterS12S0100000_16;
import Y.ARunnableS116S0100000_16;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.relation.ffp.vm.AnimationAuthVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AnimationAuthFragment extends FFPBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJS4nISHELIOSoiZyk1OGs5IGESJiwhKDs6JysNPDs7DjctLiI2JjE=";
    public final AssemVMLazy LLIZLLLIL;
    public C1295960jpS LLJ;
    public final int LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnimationAuthFragment.class, "animationAuthVM", "getAnimationAuthVM()Lcom/ss/android/ugc/aweme/relation/ffp/vm/AnimationAuthVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void cS() {
        C736680Sv4.LJIIIIZZ(this, dS(), new C2217381BqS() { // from class: X.0dwy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1069960dww) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS630S0100000_16(this, 21), 4);
        C736680Sv4.LJIIIIZZ(this, dS(), new C2217381BqS() { // from class: X.0dwx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1069960dww) obj).LLILLL);
            }
        }, C736820SvI.LIZLLL(), new AwS630S0100000_16(this, 22), 4);
    }

    public final AnimationAuthVM dS() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (AnimationAuthVM) assemVMLazy.getValue();
    }

    public AnimationAuthFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AnimationAuthVM.class);
        this.LLIZLLLIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 492), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 493), AFwS252S0000000_16.get$arr$(315));
        this.LLJI = R.layout.c_b;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int UR() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void bS(View view) {
        C1295960jpS c1295960jpS = (C1295960jpS) view.findViewById(R.id.jd2);
        c1295960jpS.addAnimatorListener(new ALAdapterS12S0100000_16(this, 7));
        this.LLJ = c1295960jpS;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.y3j);
        tuxTextView.setTuxFont(13);
        tuxTextView.LJJJJI(36.0f);
        tuxTextView.animate().setDuration(400L).setStartDelay(300L).alpha(1.0f).translationYBy(-40.0f).setInterpolator(C1619980sG4.LJ()).withEndAction(new ARunnableS116S0100000_16(this, 70)).start();
    }
}
