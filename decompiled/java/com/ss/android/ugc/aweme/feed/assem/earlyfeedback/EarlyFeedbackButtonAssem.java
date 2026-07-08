package com.ss.android.ugc.aweme.feed.assem.earlyfeedback;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0PEM;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C13LE;
import X.C197039127h;
import X.C1DDV;
import X.C20338914iB;
import X.C20638615pQ;
import X.C2168608ea;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C265900AbU;
import X.C299060Bns;
import X.C299790Bp3;
import X.C418440Gaw;
import X.C452501pT;
import X.C705520Rlu;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC700430Rdh;
import X.EnumC700440Rdi;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AFwS319S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class EarlyFeedbackButtonAssem extends BaseCellSlotComponent<EarlyFeedbackButtonAssem> {
    public static final Set<String> LLLIIL = Collections.newSetFromMap(new ConcurrentHashMap());
    public View LLJLLIL;
    public C197039127h LLJLLL;
    public C197039127h LLJZ;
    public C20638615pQ LLLFZ;
    public AnonymousClass0956 LLLI;
    public boolean LLLII;
    public AnimatorSet LLLIIII;
    public Integer LLLIIIIL;
    public final C01GW LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(EarlyFeedbackVM.class), AFwS276S0000000_31.get$arr$(119));
    public final C01GW LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS276S0000000_31.get$arr$(120));
    public final C01GW LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS276S0000000_31.get$arr$(121));
    public int LLLFF = -1;
    public int LLLFFI = -1;
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 645));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b9z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000a A[PHI: r1
      0x000a: PHI (r1v1 android.view.View) = (r1v0 android.view.View), (r1v4 android.view.View) binds: [B:3:0x0002, B:5:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x001c -> B:5:0x0008). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Gp() {
        /*
            r3 = this;
            android.view.View r1 = r3.LLJLLIL
            if (r1 != 0) goto La
            android.view.View r1 = r3.LJJIJL()
        L8:
            if (r1 == 0) goto L1f
        La:
            int r2 = r1.getId()
            r0 = 2131368232(0x7f0a1928, float:1.8356408E38)
            if (r2 != r0) goto L14
            return r1
        L14:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L1f
            android.view.View r1 = (android.view.View) r1
            goto L8
        L1f:
            android.view.View r0 = r3.LLJLLIL
            if (r0 != 0) goto L27
            android.view.View r0 = r3.LJJIJL()
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem.Gp():android.view.View");
    }

    public final EarlyFeedbackVM Ip() {
        return (EarlyFeedbackVM) this.LLJZIJLIL.getValue();
    }

    public final EarlyFeedbackTriggerAbility Jp() {
        return (EarlyFeedbackTriggerAbility) this.LLLIIIL.getValue();
    }

    public final void Up() {
        AnimatorSet animatorSet = this.LLLIIII;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLLIIII = null;
        View viewLJJIJL = this.LLJLLIL;
        if (viewLJJIJL == null) {
            viewLJJIJL = LJJIJL();
        }
        C786410Ut5.T4(viewLJJIJL, 1.0f);
        View viewLJJIJL2 = this.LLJLLIL;
        if (viewLJJIJL2 == null) {
            viewLJJIJL2 = LJJIJL();
        }
        C786410Ut5.ed(viewLJJIJL2, 0.0f);
        Tp(Gp());
    }

    public final void Vp() {
        EarlyFeedbackTriggerAbility earlyFeedbackTriggerAbilityJp;
        C20638615pQ c20638615pQ = this.LLLFZ;
        if (c20638615pQ != null) {
            c20638615pQ.LJ = -1L;
            c20638615pQ.LJFF = 0L;
            c20638615pQ.LJI = false;
        }
        this.LLLFZ = null;
        AnonymousClass0956 anonymousClass0956 = this.LLLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLI = null;
        if (this.LLLII && (earlyFeedbackTriggerAbilityJp = Jp()) != null) {
            earlyFeedbackTriggerAbilityJp.LLLLLL(false);
        }
        this.LLLII = false;
    }

    public final C20638615pQ Fp() {
        long jLIZ = C1DDV.LIZ();
        if (jLIZ > 0) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (!AwemeExtKt.isPhotoMode(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
                return Bp(jLIZ);
            }
        }
        return null;
    }

    public final C20638615pQ Bp(long j) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String aid = ((VideoItemParams) obj).getAweme().getAid();
        if (aid != null && LLLIIL.contains(aid)) {
            EarlyFeedbackTriggerAbility earlyFeedbackTriggerAbilityJp = Jp();
            if (earlyFeedbackTriggerAbilityJp != null) {
                earlyFeedbackTriggerAbilityJp.LLLLLL(true);
            }
            return null;
        }
        C20638615pQ c20638615pQ = this.LLLFZ;
        if (c20638615pQ != null) {
            return c20638615pQ;
        }
        this.LLLII = true;
        EarlyFeedbackTriggerAbility earlyFeedbackTriggerAbilityJp2 = Jp();
        if (earlyFeedbackTriggerAbilityJp2 != null) {
            earlyFeedbackTriggerAbilityJp2.LLLLLL(false);
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        C20638615pQ c20638615pQ2 = new C20638615pQ(((VideoItemParams) obj2).getAweme().getAid(), j, new AwS575S0100000_31(this, 643));
        this.LLLFZ = c20638615pQ2;
        return c20638615pQ2;
    }

    public final void Ep(String str) {
        EarlyFeedbackTriggerAbility earlyFeedbackTriggerAbilityJp;
        Vp();
        if (C299790Bp3.LIZ() && str != null && (earlyFeedbackTriggerAbilityJp = Jp()) != null) {
            earlyFeedbackTriggerAbilityJp.ei2(str);
        }
        if (C1DDV.LIZ() > 0) {
            final AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 644);
            AnimatorSet animatorSet = this.LLLIIII;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            final View viewLJJIJL = this.LLJLLIL;
            if (viewLJJIJL == null) {
                viewLJJIJL = LJJIJL();
            }
            final View viewGp = Gp();
            if (viewLJJIJL.getVisibility() != 0 && LJJIJL().getVisibility() != 0) {
                awS575S0100000_31.invoke();
            } else {
                ArrayList arrayList = new ArrayList();
                Interpolator interpolator = C705520Rlu.LIZ;
                ValueAnimator valueAnimatorLIZIZ = C705520Rlu.LIZIZ(viewGp, C418440Gaw.LIZIZ(Float.valueOf(36.0f)));
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewLJJIJL, (Property<View, Float>) View.ALPHA, viewLJJIJL.getAlpha(), 0.0f);
                objectAnimatorOfFloat.setDuration(200L);
                objectAnimatorOfFloat.setInterpolator(valueAnimatorLIZIZ.getInterpolator());
                arrayList.add(objectAnimatorOfFloat);
                arrayList.add(valueAnimatorLIZIZ);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(arrayList);
                animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: X.15hG
                    public boolean LL;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        this.LL = true;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        if (!this.LL) {
                            C786410Ut5.T4(viewLJJIJL, 1.0f);
                            this.Tp(viewGp);
                            awS575S0100000_31.invoke();
                            this.LLLIIII = null;
                        }
                    }
                });
                animatorSet2.start();
                this.LLLIIII = animatorSet2;
            }
        } else {
            Up();
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
        if (str != null) {
            C20338914iB.LIZ.remove(str);
        }
    }

    public final boolean Qp(String str) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        return Intrinsics.LJFF(str, ((VideoItemParams) obj).getAweme().getAid());
    }

    public final void Tp(View view) {
        C786410Ut5.T4(view, 1.0f);
        C786410Ut5.ed(view, 0.0f);
        Xp(view, -2, this.LLLIIIIL);
        this.LLLIIIIL = null;
        C786410Ut5.LJLLLLLL(0, view);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLLIL = view.findViewById(R.id.tqy);
        this.LLJLLL = (C197039127h) view.findViewById(R.id.cr7);
        this.LLJZ = (C197039127h) view.findViewById(R.id.csh);
        if (((Boolean) C265900AbU.LIZ.getValue()).booleanValue()) {
            C197039127h c197039127h = this.LLJLLL;
            if (c197039127h != null) {
                this.LLJJLIIIJLLLLLLLZ.LIZ(c197039127h, EnumC700430Rdh.POSITIVE, EnumC700440Rdi.CLICK);
            }
            C197039127h c197039127h2 = this.LLJZ;
            if (c197039127h2 != null) {
                this.LLJJLIIIJLLLLLLLZ.LIZ(c197039127h2, EnumC700430Rdh.NEGATIVE, EnumC700440Rdi.CLICK);
            }
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0S7g
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS319S0000000_31.get$arr$(15), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0SEe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLIZ;
            }
        }, null, AFwS319S0000000_31.get$arr$(16), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0S75
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLIZLLLIL;
            }
        }, null, AFwS319S0000000_31.get$arr$(17), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0S7h
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, C736820SvI.LJ(), AFwS319S0000000_31.get$arr$(18), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0S70
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILJILJ;
            }
        }, C736820SvI.LJ(), AFwS319S0000000_31.get$arr$(11), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0S7R
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILLL;
            }
        }, C736820SvI.LJ(), AFwS319S0000000_31.get$arr$(12), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0S6z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJLIL;
            }
        }, C736820SvI.LJ(), AFwS319S0000000_31.get$arr$(13), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0S72
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJI;
            }
        }, C736820SvI.LJ(), AFwS319S0000000_31.get$arr$(14), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Object obj;
        Object obj2;
        Up();
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        Vp();
        long jLIZ = C1DDV.LIZ();
        if (jLIZ > 0) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (AwemeExtKt.isPhotoMode(((VideoItemParams) obj).getAweme())) {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                String aid = ((VideoItemParams) obj2).getAweme().getAid();
                if (aid != null && LLLIIL.contains(aid)) {
                    EarlyFeedbackTriggerAbility earlyFeedbackTriggerAbilityJp = Jp();
                    if (earlyFeedbackTriggerAbilityJp != null) {
                        earlyFeedbackTriggerAbilityJp.LLLLLL(true);
                    }
                } else if (this.LLLI == null) {
                    this.LLLII = true;
                    EarlyFeedbackTriggerAbility earlyFeedbackTriggerAbilityJp2 = Jp();
                    if (earlyFeedbackTriggerAbilityJp2 != null) {
                        earlyFeedbackTriggerAbilityJp2.LLLLLL(false);
                    }
                    this.LLLI = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C2168608ea(jLIZ, this, null), 3);
                }
            } else {
                Bp(jLIZ);
            }
        }
        EarlyFeedbackTriggerAbility earlyFeedbackTriggerAbilityJp3 = Jp();
        if (earlyFeedbackTriggerAbilityJp3 != null) {
            earlyFeedbackTriggerAbilityJp3.LLLILZ(new AwS610S0100000_31(this, 532));
        }
    }

    public final void Wp(int i, Fragment fragment) {
        if (C299060Bns.LIZ()) {
            C1389880mGw c1389880mGw = new C1389880mGw(fragment);
            c1389880mGw.LJIIIIZZ(i);
            c1389880mGw.LIZ(true);
            c1389880mGw.LIZLLL(3000L);
            c1389880mGw.LJIIJ();
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(fragment);
        c1389890mGx.LJIIIZ(i);
        c1389890mGx.LIZ(true);
        c1389890mGx.LIZLLL(3000L);
        c1389890mGx.LJIIJJI();
    }

    public static void Xp(View view, int i, Integer num) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = i;
        if (num != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = num.intValue();
        }
        C786410Ut5.W5(view, layoutParams);
    }
}
