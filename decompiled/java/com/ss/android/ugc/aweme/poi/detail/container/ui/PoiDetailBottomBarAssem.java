package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C019F;
import X.C1181980grc;
import X.C1181990grd;
import X.C1183070gtN;
import X.C1189060h32;
import X.C1252710ihh;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2255108sX;
import X.C418440Gaw;
import X.C459880I1q;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1184330gvP;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ARunnableS106S0100000_6;
import Y.AUListenerS267S0100000_18;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.collect.collectassem.IPoiDetailFavoriteBottomVAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiBottomBarModule;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS75S1300000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailBottomBarAssem extends PoiDetailBaseAssem<PoiBottomBarModule> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final AssemVMLazy LLJJL;
    public Animator LLJJLIIIJLLLLLLLZ;
    public Animator LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailBottomBarAssem.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailBottomBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1112), AFwS256S0000000_18.get$arr$(384), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2j;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return false;
    }

    public final void Ep() {
        if (this.LLJLIL) {
            return;
        }
        this.LLJLIL = true;
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null) {
            interfaceC1184330gvP.DK(null, "click_banner", null, null, PageFinder.via(C724240Sb0.LJI(this)));
        }
    }

    public final void Fp(boolean z) {
        if (z) {
            IPoiDetailFavoriteBottomVAbility iPoiDetailFavoriteBottomVAbility = (IPoiDetailFavoriteBottomVAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPoiDetailFavoriteBottomVAbility.class, null);
            if (iPoiDetailFavoriteBottomVAbility != null) {
                iPoiDetailFavoriteBottomVAbility.LJLIIL();
            }
            LJJIJL().setClickable(true);
            return;
        }
        IPoiDetailFavoriteBottomVAbility iPoiDetailFavoriteBottomVAbility2 = (IPoiDetailFavoriteBottomVAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPoiDetailFavoriteBottomVAbility.class, null);
        if (iPoiDetailFavoriteBottomVAbility2 != null) {
            iPoiDetailFavoriteBottomVAbility2.LLILZIL();
        }
        LJJIJL().setClickable(false);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            ContainerEventDispatcher$PageScrollCallBackAbility containerEventDispatcher$PageScrollCallBackAbility = new ContainerEventDispatcher$PageScrollCallBackAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBottomBarAssem.onViewCreated.1
                @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
                public final void oq(int i) {
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
                public final void bq(int i) {
                    Animator animator;
                    float fLIZIZ;
                    if (C1183070gtN.LIZIZ() && !C459880I1q.LIZ(PoiDetailBottomBarAssem.this)) {
                        return;
                    }
                    AssemVMLazy assemVMLazy = PoiDetailBottomBarAssem.this.LLJJL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiDetailBottomBarAssem.LLJLL;
                    int i2 = C1181980grc.LIZ[((C1181990grd) assemVMLazy.getValue().getState()).LLILLL.ordinal()];
                    if (i2 != 1 && i2 != 2 && i2 != 3) {
                        if (i > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))) {
                            fLIZIZ = 1.0f;
                        } else {
                            fLIZIZ = i / C418440Gaw.LIZIZ(52);
                        }
                        C786410Ut5.T4(PoiDetailBottomBarAssem.this.LJJIJL(), fLIZIZ);
                        if (fLIZIZ >= 0.8f) {
                            PoiDetailBottomBarAssem.this.Fp(true);
                        } else {
                            PoiDetailBottomBarAssem.this.Fp(false);
                        }
                        if (fLIZIZ >= 1.0f) {
                            PoiDetailBottomBarAssem.this.Ep();
                            return;
                        }
                        return;
                    }
                    int i3 = ((PoiDetailInfoViewModel) PoiDetailBottomBarAssem.this.LLJJL.getValue()).LLILZ;
                    if (i >= i3 || PoiDetailBottomBarAssem.this.LJJIJL().getAlpha() <= 0.0f || ((animator = PoiDetailBottomBarAssem.this.LLJL) != null && animator.isStarted())) {
                        if (i <= i3 || PoiDetailBottomBarAssem.this.LJJIJL().getAlpha() >= 1.0f) {
                            return;
                        }
                        Animator animator2 = PoiDetailBottomBarAssem.this.LLJJLIIIJLLLLLLLZ;
                        if (animator2 != null && animator2.isStarted()) {
                            return;
                        }
                        PoiDetailBottomBarAssem poiDetailBottomBarAssem = PoiDetailBottomBarAssem.this;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        PoiDetailBottomBarAssem.this.Gp(valueAnimatorOfFloat, true);
                        poiDetailBottomBarAssem.LLJJLIIIJLLLLLLLZ = valueAnimatorOfFloat;
                        PoiDetailBottomBarAssem.this.Fp(true);
                        PoiDetailBottomBarAssem.this.Ep();
                        return;
                    }
                    PoiDetailBottomBarAssem poiDetailBottomBarAssem2 = PoiDetailBottomBarAssem.this;
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    PoiDetailBottomBarAssem.this.Gp(valueAnimatorOfFloat2, false);
                    poiDetailBottomBarAssem2.LLJL = valueAnimatorOfFloat2;
                    PoiDetailBottomBarAssem.this.Fp(false);
                }
            };
            AwS75S1300000_6 awS75S1300000_6 = new AwS75S1300000_6(this, interfaceC665370Q7zLJFF, containerEventDispatcher$PageScrollCallBackAbility, null, 1);
            if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                awS75S1300000_6.invoke();
            } else {
                C1189060h32.LJIJ(new ARunnableS106S0100000_6((Object) awS75S1300000_6, 90));
            }
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
        C786410Ut5.T4(LJJIJL(), 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final void tp(PoiListApi.PoiDetailResponse poiDetailResponse) {
        if (!this.LLJLILLLLZIIL) {
            this.LLJLILLLLZIIL = true;
            C723850SaN.LIZLLL(this, new AwS384S0200000_18(this, poiDetailResponse, 21));
        }
    }

    public final void Gp(ValueAnimator valueAnimator, boolean z) {
        Animator animator;
        Animator animator2;
        valueAnimator.setDuration(200L);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new AUListenerS267S0100000_18(this, 5));
        if (z) {
            Animator animator3 = this.LLJL;
            if (animator3 != null && animator3.isStarted() && (animator2 = this.LLJL) != null) {
                animator2.cancel();
            }
        } else {
            Animator animator4 = this.LLJJLIIIJLLLLLLLZ;
            if (animator4 != null && animator4.isStarted() && (animator = this.LLJJLIIIJLLLLLLLZ) != null) {
                animator.cancel();
            }
        }
        valueAnimator.start();
    }
}
