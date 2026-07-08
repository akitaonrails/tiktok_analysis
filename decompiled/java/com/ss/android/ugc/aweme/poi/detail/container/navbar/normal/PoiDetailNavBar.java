package com.ss.android.ugc.aweme.poi.detail.container.navbar.normal;

import X.C019F;
import X.C01GW;
import X.C098200Yq;
import X.C0QVF;
import X.C1181970grb;
import X.C1185190gwn;
import X.C1308910kAL;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1766560w4U;
import X.C189200o6;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2255108sX;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1181950grZ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.AAListenerS329S0100000_18;
import Y.ACListenerS121S0200000_18;
import Y.AUListenerS267S0100000_18;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailNavBar extends PoiDetailBaseUiSlotComponent<PoiNavBarModule> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public TextView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public TuxIconView LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public PoiListApi.PoiDetailResponse LLJJJJ;
    public boolean LLJJJJJIL;
    public Animator LLJJJJLIIL;
    public Animator LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailNavBar.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailNavBar() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1081), AFwS256S0000000_18.get$arr$(376), null, true);
        this.LLJJJJJIL = true;
        this.LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1080));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e39;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent
    public final boolean mp() {
        return true;
    }

    public final PoiDetailInfoViewModel sp() {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (PoiDetailInfoViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        C1185190gwn c1185190gwn;
        PoiNavBarModule poiNavBarModule = (PoiNavBarModule) baseComponentData;
        super.CG1(poiNavBarModule);
        Integer haveBackgroundTopMap = poiNavBarModule.getHaveBackgroundTopMap();
        if (haveBackgroundTopMap != null && haveBackgroundTopMap.intValue() == 1) {
            TuxIconView tuxIconView = this.LLJJJ;
            if (tuxIconView != null) {
                C786410Ut5.x5(tuxIconView, 0.0f);
            }
            TuxIconView tuxIconView2 = this.LLJJIJIIJIL;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            C786410Ut5.x5(tuxIconView2, 0.0f);
            View contentView = getContentView();
            if ((contentView instanceof C1185190gwn) && (c1185190gwn = (C1185190gwn) contentView) != null) {
                c1185190gwn.setEventConsumeMode(2);
            }
        }
        TuxIconView tuxIconView3 = this.LLJJJ;
        if (tuxIconView3 != null) {
            C339190DRl.LIZLLL(tuxIconView3);
        }
        this.LLJJLIIIJLLLLLLLZ = poiNavBarModule.getWriteReviewEnable();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJJ = (TuxIconView) view.findViewById(R.id.bmy);
        this.LLJJIJI = (TextView) view.findViewById(R.id.p09);
        this.LLJJIJIL = (TuxIconView) view.findViewById(R.id.e1g);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.k3u);
        C0QVF.LIZ(tuxIconView, 1, null, null, 14);
        this.LLJJIJIIJIL = tuxIconView;
        TuxIconView tuxIconView2 = this.LLJJJ;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS121S0200000_18(this, tuxIconView2, 16));
            C0QVF.LIZ(tuxIconView2, 0, null, null, 14);
        }
        if (Intrinsics.LJFF(kp().LJII(), Boolean.TRUE)) {
            TuxIconView tuxIconView3 = this.LLJJJ;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
            }
            TuxIconView tuxIconView4 = this.LLJJIJIL;
            if (tuxIconView4 == null) {
                tuxIconView4 = null;
            }
            C786410Ut5.a9(tuxIconView4, new ACListenerS121S0200000_18(this, view, 17));
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            ContainerEventDispatcher$PageScrollCallBackAbility containerEventDispatcher$PageScrollCallBackAbility = new ContainerEventDispatcher$PageScrollCallBackAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.container.navbar.normal.PoiDetailNavBar$onViewCreated$4$1
                @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
                public final void oq(int i) {
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
                public final void bq(int i) {
                    C1185190gwn c1185190gwn;
                    Animator animator;
                    boolean z;
                    C1185190gwn c1185190gwn2;
                    C1185190gwn c1185190gwn3;
                    EnumC1181950grZ enumC1181950grZ = this.LL.sp().getState().LLILLL;
                    int i2 = C1181970grb.LIZ[enumC1181950grZ.ordinal()];
                    float fLIZIZ = 1.0f;
                    TextView textView = null;
                    if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                        if (i <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))) {
                            fLIZIZ = i / C418440Gaw.LIZIZ(52);
                        }
                        TextView textView2 = this.LL.LLJJIJI;
                        if (textView2 != null) {
                            textView = textView2;
                        }
                        C786410Ut5.S4(fLIZIZ, textView);
                        return;
                    }
                    int i3 = this.LL.sp().LLILZ;
                    if (i <= i3) {
                        TextView textView3 = this.LL.LLJJIJI;
                        if (textView3 == null) {
                            textView3 = null;
                        }
                        if (textView3.getAlpha() > 0.0f && ((animator = this.LL.LLJJL) == null || !animator.isStarted())) {
                            PoiDetailNavBar poiDetailNavBar = this.LL;
                            EnumC1181950grZ enumC1181950grZ2 = EnumC1181950grZ.TOP_MAP;
                            if (enumC1181950grZ == enumC1181950grZ2 && !C960203pA.LIZIZ(poiDetailNavBar.LJJIJL().getContext())) {
                                z = true;
                            } else {
                                z = false;
                            }
                            poiDetailNavBar.tp(true, z);
                            PoiDetailNavBar poiDetailNavBar2 = this.LL;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                            this.LL.up(valueAnimatorOfFloat, false);
                            poiDetailNavBar2.LLJJL = valueAnimatorOfFloat;
                            if (enumC1181950grZ == enumC1181950grZ2) {
                                View contentView = this.LL.getContentView();
                                if (!(contentView instanceof C1185190gwn) || (c1185190gwn3 = (C1185190gwn) contentView) == null) {
                                    return;
                                }
                                c1185190gwn3.setEventConsumeMode(2);
                                return;
                            }
                            View contentView2 = this.LL.getContentView();
                            if (!(contentView2 instanceof C1185190gwn) || (c1185190gwn2 = (C1185190gwn) contentView2) == null) {
                                return;
                            }
                            c1185190gwn2.setEventConsumeMode(0);
                            return;
                        }
                    }
                    if (i < i3) {
                        return;
                    }
                    TextView textView4 = this.LL.LLJJIJI;
                    if (textView4 == null) {
                        textView4 = null;
                    }
                    if (textView4.getAlpha() >= 1.0f) {
                        return;
                    }
                    Animator animator2 = this.LL.LLJJJJLIIL;
                    if (animator2 != null && animator2.isStarted()) {
                        return;
                    }
                    PoiDetailNavBar poiDetailNavBar3 = this.LL;
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    PoiDetailNavBar poiDetailNavBar4 = this.LL;
                    poiDetailNavBar4.up(valueAnimatorOfFloat2, true);
                    valueAnimatorOfFloat2.addListener(new AAListenerS329S0100000_18(poiDetailNavBar4, 2));
                    poiDetailNavBar3.LLJJJJLIIL = valueAnimatorOfFloat2;
                    View contentView3 = this.LL.getContentView();
                    if (!(contentView3 instanceof C1185190gwn) || (c1185190gwn = (C1185190gwn) contentView3) == null) {
                        return;
                    }
                    c1185190gwn.setEventConsumeMode(1);
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, ContainerEventDispatcher$PageScrollCallBackAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, containerEventDispatcher$PageScrollCallBackAbility, ContainerEventDispatcher$PageScrollCallBackAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(containerEventDispatcher$PageScrollCallBackAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(containerEventDispatcher$PageScrollCallBackAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(ContainerEventDispatcher$PageScrollCallBackAbility.class.getClassLoader(), new Class[]{ContainerEventDispatcher$PageScrollCallBackAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, ContainerEventDispatcher$PageScrollCallBackAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher.PageScrollCallBackAbility");
                    }
                }
            }
        }
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0gwo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1181990grd) obj).LLILLL;
            }
        }, null, new AwS632S0100000_18(this, 107), 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160  */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void op(final com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r18) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.navbar.normal.PoiDetailNavBar.op(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse):void");
    }

    public final void tp(boolean z, boolean z2) {
        Context context;
        Fragment fragmentLJI;
        Object obj;
        if (z) {
            context = new ContextThemeWrapper(LJJIJL().getContext(), R.style.y0);
        } else {
            context = LJJIJL().getContext();
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            TextView textView = this.LLJJIJI;
            TuxIconView tuxIconView = null;
            if (textView == null) {
                textView = null;
            }
            textView.setTextColor(iIntValue);
            TuxIconView tuxIconView2 = this.LLJJJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColor(iIntValue);
            }
            TuxIconView tuxIconView3 = this.LLJJIJIIJIL;
            if (tuxIconView3 != null) {
                tuxIconView = tuxIconView3;
            }
            tuxIconView.setTintColor(iIntValue);
        }
        if (getContext() != null && (fragmentLJI = C724240Sb0.LJI(this)) != null && fragmentLJI.getActivity() != null) {
            if (z) {
                try {
                    TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(fragmentLJI);
                    if (z2) {
                        tuxImmersionBarLIZLLL.LJII();
                        tuxImmersionBarLIZLLL.LJIIJ(true);
                        tuxImmersionBarLIZLLL.LJ(R.attr.bx);
                        tuxImmersionBarLIZLLL.LJI(true);
                    }
                    tuxImmersionBarLIZLLL.LIZIZ.LJIIL();
                    tuxImmersionBarLIZLLL.LIZLLL();
                    C189200o6.m2constructorimpl(tuxImmersionBarLIZLLL);
                    obj = tuxImmersionBarLIZLLL;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj = c098200Yq;
                }
                C189200o6.m1boximpl(obj);
                return;
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, context);
            if (numLIZJ2 != null) {
                int iIntValue2 = numLIZJ2.intValue();
                try {
                    TuxImmersionBar tuxImmersionBarLIZLLL2 = C1766560w4U.LIZLLL(fragmentLJI);
                    tuxImmersionBarLIZLLL2.LJIIIZ(iIntValue2);
                    tuxImmersionBarLIZLLL2.LIZLLL();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
            }
        }
    }

    public final void up(ValueAnimator valueAnimator, boolean z) {
        Animator animator;
        Animator animator2;
        valueAnimator.setDuration(200L);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new AUListenerS267S0100000_18(this, 3));
        if (z) {
            Animator animator3 = this.LLJJL;
            if (animator3 != null && animator3.isStarted() && (animator2 = this.LLJJL) != null) {
                animator2.cancel();
            }
        } else {
            Animator animator4 = this.LLJJJJLIIL;
            if (animator4 != null && animator4.isStarted() && (animator = this.LLJJJJLIIL) != null) {
                animator.cancel();
            }
        }
        valueAnimator.start();
    }
}
