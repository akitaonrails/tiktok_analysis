package com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamicscroll;

import X.C1173980gei;
import X.C1174850gg7;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1558360qeg;
import X.C1558520qew;
import X.C197039127h;
import X.C20248814Kw;
import X.C2211631BhB;
import X.C2255108sX;
import X.C418440Gaw;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.AAListenerS67S0110000_18;
import Y.AUListenerS267S0100000_18;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiContentComponent;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS262S0300000_18;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiScrollBottomBarComponent extends PoiDetailBaseUiContentComponent<PoiScrollBottomBarModule> {
    public LinearLayout LLJI;
    public Animator LLJIJIL;
    public Animator LLJILJIL;

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, X.InterfaceC1173990gej
    public final void fm1() {
        C1174850gg7.LJII(this);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        String strLJFF = C1174850gg7.LJFF(this);
        if (strLJFF == null) {
            strLJFF = C1173980gei.LIZ(this);
        }
        C1185430gxB.LJJIJIL(c1185430gxB, interfaceC665370Q7zLJIIL, strLJFF, C1173980gei.LIZ(this), new C1185050gwZ(PageFinder.via(LJJIJL())), 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0258 A[PHI: r23
      0x0258: PHI (r23v2 java.lang.String) = (r23v1 java.lang.String), (r23v4 java.lang.String) binds: [B:126:0x0255, B:112:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, X.InterfaceC1173970geh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CG1(com.ss.android.ugc.aweme.slash.component.BaseComponentData r28) {
        /*
            Method dump skipped, instruction units count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamicscroll.PoiScrollBottomBarComponent.CG1(com.ss.android.ugc.aweme.slash.component.BaseComponentData):void");
    }

    public final C197039127h Lo(PoiButton poiButton) {
        String str;
        DynamicIcon dynamicIcon = poiButton.icon;
        if (dynamicIcon == null || (str = poiButton.buttonName) == null) {
            return null;
        }
        C197039127h c197039127h = new C197039127h(LJJIJL().getContext(), null, 6, 0);
        C786410Ut5.J6(c197039127h, new LinearLayout.LayoutParams(-2, -2));
        c197039127h.setButtonVariant(1);
        Integer dynamicIcon2 = dynamicIcon.parseDynamicIcon(LJJIJL().getContext(), null);
        if (dynamicIcon2 != null) {
            c197039127h.setButtonStartIcon(Integer.valueOf(dynamicIcon2.intValue()));
        }
        c197039127h.setButtonSize(2);
        c197039127h.setMaxWidth(Integer.MAX_VALUE);
        c197039127h.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
        c197039127h.setTuxFont(52);
        c197039127h.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        c197039127h.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        c197039127h.LJJLI(true);
        c197039127h.setClickable(true);
        c197039127h.setText(str);
        c197039127h.setTag(poiButton);
        c197039127h.setId(View.generateViewId());
        C2211631BhB.LJ(c197039127h, new AwS384S0200000_18(AFwS256S0000000_18.get$arr$(372), (Function1<? super C20248814Kw, Unit>) new AwS262S0300000_18(poiButton, c197039127h, this, 7), (Function0<Unit>) 35));
        return c197039127h;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiContentComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(view.getContext());
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        C786410Ut5.Td(layoutInflaterNe, R.layout.e15, viewGroup, true);
        LJJIJL().findViewById(R.id.r21);
        this.LLJI = (LinearLayout) LJJIJL().findViewById(R.id.r20);
        C786410Ut5.LJLLLLLL(4, LJJIJL());
        C786410Ut5.T4(LJJIJL(), 0.0f);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            IDynamicBottomBarShowHideAbility iDynamicBottomBarShowHideAbility = new IDynamicBottomBarShowHideAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamicscroll.PoiScrollBottomBarComponent$initAbility$1
                @Override // com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamicscroll.IDynamicBottomBarShowHideAbility
                public final void TU1(boolean z) {
                    Animator animator;
                    PoiScrollBottomBarComponent poiScrollBottomBarComponent = this.LL;
                    if (z) {
                        if (poiScrollBottomBarComponent.LJJIJL().getAlpha() >= 1.0f || ((animator = poiScrollBottomBarComponent.LLJIJIL) != null && animator.isStarted())) {
                            poiScrollBottomBarComponent.getClass();
                            return;
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        poiScrollBottomBarComponent.No(valueAnimatorOfFloat, true);
                        poiScrollBottomBarComponent.LLJIJIL = valueAnimatorOfFloat;
                        return;
                    }
                    if (poiScrollBottomBarComponent.LJJIJL().getAlpha() <= 0.0f) {
                        return;
                    }
                    Animator animator2 = poiScrollBottomBarComponent.LLJILJIL;
                    if (animator2 != null && animator2.isStarted()) {
                        return;
                    }
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    poiScrollBottomBarComponent.No(valueAnimatorOfFloat2, false);
                    poiScrollBottomBarComponent.LLJILJIL = valueAnimatorOfFloat2;
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IDynamicBottomBarShowHideAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, iDynamicBottomBarShowHideAbility, IDynamicBottomBarShowHideAbility.class, null, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(iDynamicBottomBarShowHideAbility);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(iDynamicBottomBarShowHideAbility);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(IDynamicBottomBarShowHideAbility.class.getClassLoader(), new Class[]{IDynamicBottomBarShowHideAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IDynamicBottomBarShowHideAbility.class, null, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamicscroll.IDynamicBottomBarShowHideAbility");
            }
        }
    }

    public final void No(ValueAnimator valueAnimator, boolean z) {
        Animator animator;
        Animator animator2;
        valueAnimator.setDuration(200L);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new AUListenerS267S0100000_18(this, 1));
        valueAnimator.addListener(new AAListenerS67S0110000_18(this, z, 3));
        valueAnimator.addListener(new AAListenerS67S0110000_18(this, z, 2));
        if (z) {
            Animator animator3 = this.LLJILJIL;
            if (animator3 != null && animator3.isStarted() && (animator2 = this.LLJILJIL) != null) {
                animator2.cancel();
            }
        } else {
            Animator animator4 = this.LLJIJIL;
            if (animator4 != null && animator4.isStarted() && (animator = this.LLJIJIL) != null) {
                animator.cancel();
            }
        }
        valueAnimator.start();
    }
}
