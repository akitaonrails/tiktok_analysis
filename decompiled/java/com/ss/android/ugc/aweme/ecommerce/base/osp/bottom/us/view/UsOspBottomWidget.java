package com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.us.view;

import X.C01D1;
import X.C03C8;
import X.C03MV;
import X.C03MY;
import X.C03O0;
import X.C03XN;
import X.C03XP;
import X.C0H1U;
import X.C10515049h;
import X.C13LE;
import X.C1637806bA;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C19M4;
import X.C2217381BqS;
import X.C2262851Dhb;
import X.C2262861Dhc;
import X.C2262981Dho;
import X.C2262991Dhp;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C812503Fj;
import X.C833003Ng;
import X.C833203Ni;
import X.C948003nC;
import X.InterfaceC2217461Bqa;
import Y.AAListenerS280S0200000_35;
import Y.AAListenerS327S0100000_16;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.base.BaseOspBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS649S0100000_35;
import p8b.c;

/* JADX INFO: loaded from: classes36.dex */
public final class UsOspBottomWidget extends BaseOspBottomWidget implements c {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public C03XP LLJJIJIL;
    public FrameLayout LLJJJ;
    public LinearLayout LLJJJIL;
    public C19M4 LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public C03MV LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public boolean LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UsOspBottomWidget.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/bottom/OspBottomViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public UsOspBottomWidget() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OspBottomViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 168), AFwS283S0000000_35.get$arr$(25), null, true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.base.BaseOspBottomWidget, com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.b28;
    }

    @Override // p8b.c
    public final String getViewName() {
        return "OrderSubmitBottomAssemWidget";
    }

    public final OspBottomViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (OspBottomViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.base.BaseOspBottomWidget, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C812503Fj.LIZ.getClass();
        ((LinkedHashMap) C812503Fj.LIZIZ).clear();
    }

    public final void lp(C03XN c03xn) {
        C03XP c03xp;
        int i;
        C833003Ng c833003Ng;
        C03XP c03xp2 = this.LLJJIJIL;
        if (c03xp2 != null) {
            if (c03xn != null && (c833003Ng = c03xn.LIZ) != null && c833003Ng.LIZ) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c03xp2);
        }
        C03XP c03xp3 = this.LLJJIJIL;
        if (c03xp3 != null && c03xp3.getVisibility() == 0 && c03xn != null && (c03xp = this.LLJJIJIL) != null) {
            c03xp.LIZ(c03xn, ip());
        }
    }

    public final void mp(C833203Ni c833203Ni) {
        C833003Ng c833003Ng;
        FrameLayout frameLayout = this.LLJJJ;
        if (frameLayout != null) {
            int i = 0;
            if (c833203Ni == null || (c833003Ng = c833203Ni.LIZ) == null || !c833003Ng.LIZ) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, frameLayout);
        }
        if (c833203Ni != null) {
            C19M4 c19m4 = this.LLJJJJ;
            if (c19m4 != null) {
                C03C8.LIZJ(c19m4, c833203Ni.LIZIZ, "bannerTips", null);
            }
            LinearLayout linearLayout = this.LLJJJIL;
            if (linearLayout != null) {
                C786410Ut5.I7(new AjS40S0200000_1(this, c833203Ni, 12), linearLayout);
            }
            C03O0.LJJJJZ(C03O0.LIZ, "min_spend_info", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554430);
            OspBottomViewModel ospBottomViewModelKp = kp();
            OrderSubmitAssemViewModel orderSubmitAssemViewModelIp = ip();
            OspBottomViewModel.yQ2(orderSubmitAssemViewModelIp, new AwS367S0200000_1(ospBottomViewModelKp, orderSubmitAssemViewModelIp, 256));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.base.BaseOspBottomWidget, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C03MV c03mv;
        super.onViewCreated(view);
        this.LLJJIJIL = (C03XP) view.findViewById(R.id.cbf);
        this.LLJJJ = (FrameLayout) view.findViewById(R.id.ko2);
        this.LLJJJIL = (LinearLayout) view.findViewById(R.id.kog);
        this.LLJJJJ = (C19M4) view.findViewById(R.id.kp8);
        this.LLJJJJJIL = (TuxTextView) view.findViewById(R.id.total_title);
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.total_price);
        this.LLJJL = (TuxTextView) view.findViewById(R.id.rsz);
        this.LLJJLIIIJLLLLLLLZ = (C03MV) view.findViewById(R.id.qks);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.1Dhj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2262851Dhb) obj).LLIZ;
            }
        }, null, new AwS649S0100000_35(this, 8), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.1Dhk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2262851Dhb) obj).LLIZLLLIL;
            }
        }, null, new AwS649S0100000_35(this, 9), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.1Dhl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2262851Dhb) obj).LLJ;
            }
        }, null, new AwS649S0100000_35(this, 10), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.1Dhm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2262851Dhb) obj).LLJI;
            }
        }, null, new AwS649S0100000_35(this, 11), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.1Dhn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2262851Dhb) obj).LLJIJIL;
            }
        }, null, new AwS649S0100000_35(this, 7), 6);
        C948003nC<Boolean> c948003nC = ip().getState().LLJLIL;
        if (c948003nC != null && c948003nC.LIZ.booleanValue() && !this.LLJLIL) {
            C2262851Dhb state = kp().getState();
            lp(state.LLIZ);
            mp(state.LLIZLLLIL);
            sp(state.LLJ);
            op(state.LLJI);
            C03MY c03my = state.LLJIJIL;
            if (c03my != null && (c03mv = this.LLJJLIIIJLLLLLLLZ) != null) {
                c03mv.LIZ(c03my, kp(), ip());
            }
            this.LLJLIL = true;
        }
    }

    public final void op(C2262861Dhc c2262861Dhc) {
        TuxTextView tuxTextView;
        int i;
        int iIntValue;
        if (c2262861Dhc != null && (tuxTextView = this.LLJJJJLIIL) != null) {
            C833003Ng c833003Ng = c2262861Dhc.LIZ;
            if (c833003Ng != null && c833003Ng.LIZ) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxTextView);
            Integer num = c2262861Dhc.LJ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 32;
            }
            tuxTextView.setTuxFont(iIntValue);
            Integer num2 = c2262861Dhc.LJFF;
            if (num2 != null) {
                tuxTextView.setTextColorRes(num2.intValue());
            }
            C2262991Dhp c2262991Dhp = c2262861Dhc.LJIIJ;
            if (c2262991Dhp != null) {
                TuxTextView tuxTextView2 = this.LLJJJJLIIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(c2262991Dhp.LIZIZ);
                }
                int i2 = c2262991Dhp.LIZJ;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJJJJLIIL, "translationY", 0.0f, C418440Gaw.LIZIZ(Integer.valueOf(i2)));
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLJJJJLIIL, "alpha", 1.0f, 0.0f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LLJJJJLIIL, "translationY", C418440Gaw.LIZIZ(Integer.valueOf(-i2)), 0.0f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LLJJJJLIIL, "alpha", 0.0f, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(375L);
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setDuration(250L);
                animatorSet2.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat3);
                animatorSet.addListener(new AAListenerS327S0100000_16(animatorSet2, 21));
                animatorSet2.addListener(new AAListenerS280S0200000_35(this, c2262991Dhp, 1));
                animatorSet.start();
                ip().LLLLZLLIL = Boolean.FALSE;
            } else {
                TuxTextView tuxTextView3 = this.LLJJJJLIIL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(c2262861Dhc.LIZIZ);
                }
            }
            TuxTextView tuxTextView4 = this.LLJJL;
            if (tuxTextView4 != null) {
                C0H1U.LJIIL(tuxTextView4, c2262861Dhc.LJII, true);
            }
        }
    }

    public final void sp(C2262981Dho c2262981Dho) {
        int iIntValue;
        if (c2262981Dho != null) {
            TuxTextView tuxTextView = this.LLJJJJJIL;
            if (tuxTextView != null) {
                C833003Ng c833003Ng = c2262981Dho.LIZ;
                int i = 0;
                if (c833003Ng == null || !c833003Ng.LIZ) {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, tuxTextView);
                Integer num = c2262981Dho.LIZJ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 32;
                }
                tuxTextView.setTuxFont(iIntValue);
                String string = c2262981Dho.LIZIZ;
                if (string == null) {
                    Context context = tuxTextView.getContext();
                    if (context != null) {
                        string = context.getString(2131848100);
                    } else {
                        string = null;
                    }
                }
                tuxTextView.setText(string);
            }
            TuxTextView tuxTextView2 = this.LLJJJJJIL;
            if (tuxTextView2 != null) {
                C1748720vbi.LJFF(tuxTextView2, new C10515049h(), new AwS579S0100000_35(this, 125), new AwS401S0200000_35(this, c2262981Dho, 34));
            }
        }
    }
}
