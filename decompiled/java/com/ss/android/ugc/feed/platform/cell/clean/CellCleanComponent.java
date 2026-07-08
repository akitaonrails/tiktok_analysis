package com.ss.android.ugc.feed.platform.cell.clean;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C07CX;
import X.C0S43;
import X.C1558520qew;
import X.C1AV2;
import X.C1AVH;
import X.C2180521AVm;
import X.C2180551AVp;
import X.C2180571AVr;
import X.C2188811AlT;
import X.C452501pT;
import X.C733680SqE;
import X.C733690SqF;
import X.C733710SqH;
import X.C786410Ut5;
import X.EnumC2180541AVo;
import X.InterfaceC1554640qYg;
import X.InterfaceC2180591AVt;
import X.InterfaceC494301wD;
import Y.ALAdapterS8S0100000_11;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class CellCleanComponent extends BaseCellContentComponent<CellCleanComponent> implements ICellCleanAbility, InterfaceC1554640qYg {
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new C733710SqH());
    public final C01GW LLJJL = C452501pT.LIZIZ(new C733690SqF(this));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C733680SqE(this));
    public Animator LLJL;
    public ViewGroup LLJLIL;
    public ViewGroup LLJLILLLLZIIL;
    public ViewGroup LLJLL;
    public View LLJLLIL;
    public View LLJLLL;
    public View LLJZ;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1312751005) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLIL = (ViewGroup) view.findViewById(R.id.widget_container);
        this.LLJLILLLLZIIL = (ViewGroup) view.findViewById(R.id.kvf);
        this.LLJLLIL = view.findViewById(R.id.qmw);
        this.LLJLLL = view.findViewById(R.id.hp7);
        this.LLJZ = view.findViewById(R.id.tjh);
        this.LLJLL = (ViewGroup) view.findViewById(R.id.qk5);
        if (((Number) C07CX.LIZ.getValue()).intValue() >= 1) {
            C07CX.LIZ(this.LLJLIL);
            C07CX.LIZ(this.LLJLL);
            C07CX.LIZ(this.LLJLILLLLZIIL);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    public final void ep(float f, String str, boolean z, boolean z2) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ALPHA;
        if (!C2180571AVr.LIZIZ(enumC2180541AVo, Float.valueOf(f)) && (viewGroup2 = this.LLJLIL) != null) {
            C1AV2 c1av2LIZIZ = C1AV2.LIZIZ((C1AV2) C1AVH.LJIIIZ.getValue(), null, null, false, 127);
            c1av2LIZIZ.LIZ(str);
            C2180521AVm.LIZ(viewGroup2, enumC2180541AVo, c1av2LIZIZ);
        }
        ViewGroup viewGroup3 = this.LLJLIL;
        if (viewGroup3 != null) {
            C786410Ut5.R4(f, viewGroup3);
        }
        ViewGroup viewGroup4 = this.LLJLL;
        if (viewGroup4 != null) {
            C786410Ut5.R4(f, viewGroup4);
        }
        if (z2 && (viewGroup = this.LLJLILLLLZIIL) != null) {
            C786410Ut5.R4(f, viewGroup);
        }
        if (z) {
            float fFloatValue = f * ((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).floatValue();
            View view = this.LLJLLIL;
            if (view != null) {
                C786410Ut5.T4(view, fFloatValue);
            }
            View view2 = this.LLJLLL;
            if (view2 != null) {
                C786410Ut5.T4(view2, fFloatValue);
            }
            View view3 = this.LLJZ;
            if (view3 != null) {
                C786410Ut5.T4(view3, fFloatValue);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.clean.ICellCleanAbility
    public final void Xk(Animator animator, final String str, boolean z, final boolean z2, final boolean z3, boolean z4) {
        boolean z5;
        float f;
        long duration;
        TimeInterpolator linearInterpolator;
        long startDelay;
        C0S43 c0s43;
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJJJJLIIL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toggleClean request: clean ");
        sbLIZ.append(z);
        sbLIZ.append(", hasCustomAnimation: ");
        if (animator != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        sbLIZ.append(z5);
        sbLIZ.append(" immediately: ");
        sbLIZ.append(z4);
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        Animator animator2 = this.LLJL;
        if (animator2 != null) {
            animator2.end();
        }
        this.LLJL = null;
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
            f2 = 1.0f;
        } else {
            f = 1.0f;
        }
        if (z4) {
            ep(f, str, z2, z3);
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
            EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
            if (!C2180571AVr.LIZIZ(enumC2180541AVo, Integer.valueOf(i)) && (viewGroup2 = this.LLJLIL) != null) {
                C1AV2 c1av2LIZIZ = C1AV2.LIZIZ((C1AV2) C1AVH.LJIIIZ.getValue(), null, null, false, 127);
                c1av2LIZIZ.LIZ(str);
                C2180521AVm.LIZ(viewGroup2, enumC2180541AVo, c1av2LIZIZ);
            }
            ViewGroup viewGroup3 = this.LLJLIL;
            if (viewGroup3 != null) {
                C786410Ut5.LJLZ(i, viewGroup3);
            }
            ViewGroup viewGroup4 = this.LLJLL;
            if (viewGroup4 != null) {
                C786410Ut5.LJLZ(i, viewGroup4);
            }
            if (z3 && (viewGroup = this.LLJLILLLLZIIL) != null) {
                C786410Ut5.LJLZ(i, viewGroup);
            }
        } else {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
            if (animator != null) {
                duration = animator.getDuration();
            } else {
                duration = 200;
            }
            valueAnimatorOfFloat.setDuration(duration);
            if (animator == null || (linearInterpolator = animator.getInterpolator()) == null) {
                linearInterpolator = new LinearInterpolator();
            }
            valueAnimatorOfFloat.setInterpolator(linearInterpolator);
            if (animator != null) {
                startDelay = animator.getStartDelay();
            } else {
                startDelay = 0;
            }
            valueAnimatorOfFloat.setStartDelay(startDelay);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0SqG
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    this.LL.ep(fFloatValue, str, z2, z3);
                }
            });
            valueAnimatorOfFloat.addListener(new ALAdapterS8S0100000_11(this, 7));
            valueAnimatorOfFloat.start();
            this.LLJL = valueAnimatorOfFloat;
        }
        FeedInfraTimingSensor feedInfraTimingSensor = FeedInfraTimingSensor.LL;
        if (z) {
            c0s43 = C0S43.CLEAN_MODE_OPEN;
        } else {
            c0s43 = C0S43.CLEAN_MODE_CLOSE;
        }
        feedInfraTimingSensor.getClass();
        FeedInfraTimingSensor.LIZLLL(c0s43, str);
    }
}
