package com.ss.android.ugc.aweme.tako.botpage.cards.answer.retry;

import X.C019F;
import X.C0HZQ;
import X.C1308910kAL;
import X.C13LE;
import X.C14J2;
import X.C14KQ;
import X.C1637806bA;
import X.C1857060yQS;
import X.C1857750yRZ;
import X.C1918907fP;
import X.C19719912Dl;
import X.C19ME;
import X.C20742216Eq;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427660Gpo;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerBubbleRetryAssem extends TakoBaseAssem<C1857060yQS> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public TuxTextView LLJZIJLIL;
    public TuxTextView LLL;
    public C14J2 LLLF;
    public C1857060yQS LLLFF;
    public final AssemVMLazy LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAnswerBubbleRetryAssem.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoAnswerBubbleRetryAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageViewModel.class);
        this.LLLFFI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1860), AFwS269S0000000_27.get$arr$(206), null, true);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmf;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ep, reason: merged with bridge method [inline-methods] */
    public final void up(C1857060yQS c1857060yQS) {
        this.LLLFF = c1857060yQS;
        Context context = getContext();
        if (context != null) {
            TuxTextView tuxTextView = this.LLJZIJLIL;
            if (tuxTextView != null) {
                tuxTextView.setText(context.getString(c1857060yQS.LLILLJJLI));
            }
            TuxTextView tuxTextView2 = this.LLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(context.getString(c1857060yQS.LLILLL));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C14J2 c14j2;
        C19ME c19me;
        Integer numLIZJ;
        View view2;
        super.onViewCreated(view);
        this.LLLF = (C14J2) view.findViewById(R.id.ety);
        this.LLJZIJLIL = (TuxTextView) view.findViewById(R.id.ql7);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.kw0);
        this.LLL = tuxTextView;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS161S0100000_27(this, 66));
        }
        C14J2 c14j22 = this.LLLF;
        if (c14j22 != null) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
            } else {
                view2 = null;
            }
            c14j22.LIZ(0, true, false, view2, null, null, null, null, yp());
        }
        int iIntValue = 0;
        if (up()) {
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) != null) {
                int iIntValue2 = numLIZJ.intValue();
                C14J2 c14j23 = this.LLLF;
                if (c14j23 != null) {
                    c14j23.setBackgroundDrawColor(iIntValue2);
                }
            }
            C14J2 c14j24 = this.LLLF;
            if (c14j24 != null) {
                C426750GoL.LJIIL(c14j24, 0, 0, 0, 0, 16);
            }
            C14J2 c14j25 = this.LLLF;
            if (c14j25 != null) {
                C426750GoL.LJIIIZ(c14j25, Integer.valueOf(C1918907fP.LIZ()), null, null, null, false, 30);
            }
            C20742216Eq c20742216Eq = (C20742216Eq) view.findViewById(R.id.eva);
            if (c20742216Eq != null) {
                float fLJIIIIZZ = C14KQ.LJIIIIZZ(getContext());
                float fLIZ = (fLJIIIIZZ - C1918907fP.LIZ()) / fLJIIIIZZ;
                ViewGroup.LayoutParams layoutParams = c20742216Eq.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                    c19me.guidePercent = fLIZ;
                    C786410Ut5.n6(c20742216Eq, c19me);
                }
            }
        } else {
            Context context2 = getContext();
            if (context2 != null) {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zr, context2);
                if (numLIZJ2 != null) {
                    iIntValue = numLIZJ2.intValue();
                }
                C14J2 c14j26 = this.LLLF;
                if (c14j26 != null) {
                    c14j26.setBackgroundDrawColor(iIntValue);
                }
            }
            if (!yp() && (c14j2 = this.LLLF) != null) {
                C1857750yRZ.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), c14j2);
                C426750GoL.LJIIL(c14j2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, null, null, 30);
            }
        }
        C14J2 c14j27 = this.LLLF;
        if (c14j27 != null) {
            c14j27.setCornerRadius(C418440Gaw.LIZIZ(16));
        }
    }
}
