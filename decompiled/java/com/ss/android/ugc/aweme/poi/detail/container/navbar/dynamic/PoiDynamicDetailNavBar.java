package com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic;

import X.C019F;
import X.C098200Yq;
import X.C0C64;
import X.C0QVF;
import X.C1174850gg7;
import X.C1181550gqv;
import X.C1181960gra;
import X.C1181990grd;
import X.C1183070gtN;
import X.C1183770guV;
import X.C1185120gwg;
import X.C1185160gwk;
import X.C1185180gwm;
import X.C1185190gwn;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C189200o6;
import X.C19659111vp;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C2255108sX;
import X.C280180AyW;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1181950grZ;
import X.EnumC1184730gw3;
import X.InterfaceC1181010gq3;
import X.InterfaceC1181670gr7;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.AAListenerS329S0100000_18;
import Y.ACListenerS121S0200000_18;
import Y.AUListenerS267S0100000_18;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.container.IPoiDetailTypeAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiNavButtonGroup;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.assem.NavBarFoldButtonAssem;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.assem.NavBarRightButtonsAssem;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.popup.IPoiHeaderPopTextAbility;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import com.ss.android.ugc.aweme.poi.detail.videolist.model.PoiDetailVideoListModel;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDynamicDetailNavBar extends PoiDetailBaseUiSlotComponent<PoiDynamicNavBarModule> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public float LLJJIJI = 1.0f;
    public TuxIconView LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public TuxIconView LLJJJ;
    public FrameLayout LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public PoiListApi.PoiDetailResponse LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public Animator LLJJL;
    public Animator LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final List<TuxIconView> LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDynamicDetailNavBar.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDynamicDetailNavBar() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 746), AFwS256S0000000_18.get$arr$(375), null, true);
        this.LLJJJJLIIL = true;
        this.LLJLIL = new ArrayList();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2y;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent
    public final boolean mp() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        TuxIconView tuxIconView;
        C1185190gwn c1185190gwn;
        IPoiHeaderPopTextAbility iPoiHeaderPopTextAbility;
        boolean z;
        PoiDynamicNavBarModule poiDynamicNavBarModule = (PoiDynamicNavBarModule) baseComponentData;
        super.CG1(poiDynamicNavBarModule);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (iPoiHeaderPopTextAbility = (IPoiHeaderPopTextAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IPoiHeaderPopTextAbility.class, null)) != null) {
            List<PoiScrollingBubble> scrollingBubbleList = poiDynamicNavBarModule.getScrollingBubbleList();
            PoiNavButtonGroup poiNavButtonGroup = poiDynamicNavBarModule.getPoiNavButtonGroup();
            if (poiNavButtonGroup != null && !poiNavButtonGroup.isImmersion()) {
                z = true;
            } else {
                z = false;
            }
            iPoiHeaderPopTextAbility.Ai2(scrollingBubbleList, Boolean.valueOf(z));
        }
        ((ArrayList) this.LLJLIL).clear();
        TuxIconView tuxIconView2 = this.LLJJIJIIJIL;
        if (tuxIconView2 != null) {
            ((ArrayList) this.LLJLIL).add(tuxIconView2);
        }
        TuxIconView tuxIconView3 = this.LLJJJ;
        if (tuxIconView3 != null) {
            ((ArrayList) this.LLJLIL).add(tuxIconView3);
        }
        LinearLayout linearLayout = this.LLJJIJIL;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        C723850SaN.LJII(this, C13LE.LIZ(NavBarRightButtonsAssem.class), null);
        C723850SaN.LJII(this, C13LE.LIZ(NavBarFoldButtonAssem.class), null);
        C723850SaN.LIZLLL(this, new AwS368S0200000_2(this, poiDynamicNavBarModule, 120));
        Integer haveBackgroundTopMap = poiDynamicNavBarModule.getHaveBackgroundTopMap();
        if (haveBackgroundTopMap != null && haveBackgroundTopMap.intValue() == 1) {
            C339190DRl.LIZIZ(getContentView());
            View contentView = getContentView();
            if ((contentView instanceof C1185190gwn) && (c1185190gwn = (C1185190gwn) contentView) != null) {
                c1185190gwn.setEventConsumeMode(2);
            }
        } else if (!poiDynamicNavBarModule.isFakeNavBarModule() && (tuxIconView = this.LLJJIJIIJIL) != null) {
            C339190DRl.LIZLLL(tuxIconView);
        }
        this.LLJL = poiDynamicNavBarModule.getWriteReviewEnable();
        LJJIJL().findViewById(R.id.p1d);
        sp(true);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView;
        super.onViewCreated(view);
        this.LLJJIJIIJIL = (TuxIconView) view.findViewById(R.id.bmy);
        this.LLJJIJIL = (LinearLayout) view.findViewById(R.id.tkn);
        this.LLJJJ = (TuxIconView) view.findViewById(R.id.ido);
        this.LLJJJIL = (FrameLayout) view.findViewById(R.id.ri5);
        if (Intrinsics.LJFF(kp().LJII(), Boolean.TRUE) && (tuxIconView = this.LLJJIJIIJIL) != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 543));
        TuxIconView tuxIconView2 = this.LLJJIJIIJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS121S0200000_18(this, tuxIconView2, 58));
            C0QVF.LIZ(tuxIconView2, 0, null, null, 14);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            IDynamicNavBarIconAbility iDynamicNavBarIconAbility = new IDynamicNavBarIconAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.PoiDynamicDetailNavBar$initAbility$1
                @Override // com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.IDynamicNavBarIconAbility
                public final void p62(TuxIconView tuxIconView3) {
                    if (tuxIconView3 != null) {
                        ((ArrayList) this.LL.LLJLIL).add(tuxIconView3);
                    }
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IDynamicNavBarIconAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, iDynamicNavBarIconAbility, IDynamicNavBarIconAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(iDynamicNavBarIconAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(iDynamicNavBarIconAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(IDynamicNavBarIconAbility.class.getClassLoader(), new Class[]{IDynamicNavBarIconAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IDynamicNavBarIconAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.IDynamicNavBarIconAbility");
                    }
                }
            }
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJI2, null);
            ContainerEventDispatcher$PageScrollCallBackAbility containerEventDispatcher$PageScrollCallBackAbility = new ContainerEventDispatcher$PageScrollCallBackAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.PoiDynamicDetailNavBar$initAbility$2$1
                @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
                public final void oq(int i) {
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
                public final void bq(int i) {
                    C1185190gwn c1185190gwn;
                    Animator animator;
                    C1185190gwn c1185190gwn2;
                    C1185190gwn c1185190gwn3;
                    AssemVMLazy assemVMLazy = this.LL.LLJJJJ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiDynamicDetailNavBar.LLJLILLLLZIIL;
                    EnumC1181950grZ enumC1181950grZ = ((C1181990grd) assemVMLazy.getValue().getState()).LLILLL;
                    int i2 = C1181960gra.LIZ[enumC1181950grZ.ordinal()];
                    float fLIZIZ = 1.0f;
                    if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                        PoiDynamicDetailNavBar poiDynamicDetailNavBar = this.LL;
                        if (i <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))) {
                            fLIZIZ = i / C418440Gaw.LIZIZ(52);
                        }
                        poiDynamicDetailNavBar.LLJJIJI = fLIZIZ;
                        return;
                    }
                    int i3 = ((PoiDetailInfoViewModel) this.LL.LLJJJJ.getValue()).LLILZ;
                    if (i <= i3) {
                        PoiDynamicDetailNavBar poiDynamicDetailNavBar2 = this.LL;
                        if (poiDynamicDetailNavBar2.LLJJIJI > 0.0f && ((animator = poiDynamicDetailNavBar2.LLJJLIIIJLLLLLLLZ) == null || !animator.isStarted())) {
                            this.LL.sp(true);
                            this.LL.tp(true);
                            PoiDynamicDetailNavBar poiDynamicDetailNavBar3 = this.LL;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                            this.LL.up(valueAnimatorOfFloat, false);
                            poiDynamicDetailNavBar3.LLJJLIIIJLLLLLLLZ = valueAnimatorOfFloat;
                            if (enumC1181950grZ == EnumC1181950grZ.TOP_MAP) {
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
                    PoiDynamicDetailNavBar poiDynamicDetailNavBar4 = this.LL;
                    if (poiDynamicDetailNavBar4.LLJJIJI >= 1.0f) {
                        return;
                    }
                    Animator animator2 = poiDynamicDetailNavBar4.LLJJL;
                    if (animator2 != null && animator2.isStarted()) {
                        return;
                    }
                    PoiDynamicDetailNavBar poiDynamicDetailNavBar5 = this.LL;
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    PoiDynamicDetailNavBar poiDynamicDetailNavBar6 = this.LL;
                    poiDynamicDetailNavBar6.up(valueAnimatorOfFloat2, true);
                    valueAnimatorOfFloat2.addListener(new AAListenerS329S0100000_18(poiDynamicDetailNavBar6, 1));
                    poiDynamicDetailNavBar5.LLJJL = valueAnimatorOfFloat2;
                    View contentView3 = this.LL.getContentView();
                    if (!(contentView3 instanceof C1185190gwn) || (c1185190gwn = (C1185190gwn) contentView3) == null) {
                        return;
                    }
                    c1185190gwn.setEventConsumeMode(1);
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLJFF2, ContainerEventDispatcher$PageScrollCallBackAbility.class, null);
            if (interfaceC494301wDLIZ2 == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF2, containerEventDispatcher$PageScrollCallBackAbility, ContainerEventDispatcher$PageScrollCallBackAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(interfaceC494301wDLIZ2);
                    if (invocationHandler2 instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler2).LL.add(containerEventDispatcher$PageScrollCallBackAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2255108sX c2255108sX2 = new C2255108sX();
                    c2255108sX2.LL.add(containerEventDispatcher$PageScrollCallBackAbility);
                    c2255108sX2.LL.add((T) interfaceC494301wDLIZ2);
                    Object objNewProxyInstance2 = Proxy.newProxyInstance(ContainerEventDispatcher$PageScrollCallBackAbility.class.getClassLoader(), new Class[]{ContainerEventDispatcher$PageScrollCallBackAbility.class}, c2255108sX2);
                    if (objNewProxyInstance2 != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF2, (InterfaceC494301wD) objNewProxyInstance2, ContainerEventDispatcher$PageScrollCallBackAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher.PageScrollCallBackAbility");
                    }
                }
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gwq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1181990grd) obj).LLILLL;
            }
        }, null, new AwS632S0100000_18(this, 275), 6);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent
    public final void op(PoiListApi.PoiDetailResponse poiDetailResponse) {
        Object c098200Yq;
        C1181550gqv c1181550gqvEr2;
        PoiDetailVideoListModel poiDetailVideoListModelLIZ;
        C1181550gqv c1181550gqvEr22;
        PoiDetailVideoListModel poiDetailVideoListModelLIZ2;
        IPoiDetailTypeAbility iPoiDetailTypeAbility;
        this.LLJJJJJIL = poiDetailResponse;
        if (poiDetailResponse != null && C1183770guV.LIZ() && PoiEnableExperiment.LIZLLL()) {
            List<Aweme> listLIZ = null;
            try {
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI != null && (iPoiDetailTypeAbility = (IPoiDetailTypeAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IPoiDetailTypeAbility.class, null)) != null) {
                    c098200Yq = iPoiDetailTypeAbility.Ds0(this.LLJJJJJIL);
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            EnumC1184730gw3 enumC1184730gw3 = (EnumC1184730gw3) c098200Yq;
            if (C1183070gtN.LIZIZ() && C1183070gtN.LIZ(enumC1184730gw3) && ((Number) C280180AyW.LIZ.getValue()).intValue() != 2 && (C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_common_write_review_entrance", true) != 1 || !this.LLJL)) {
                return;
            }
            long jLongValue = 0;
            if (this.LLJJJJLIIL) {
                String poiId = kp().getPoiId();
                InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
                if (interfaceC1181010gq3LIZ != null && (c1181550gqvEr22 = interfaceC1181010gq3LIZ.Er2()) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((LinkedHashMap) c1181550gqvEr22.LIZ).entrySet().iterator();
                    while (it2.hasNext()) {
                        Object value = ((Map.Entry) it2.next()).getValue();
                        if (value instanceof C1185120gwg) {
                            arrayList.add(value);
                        }
                    }
                    C1185120gwg c1185120gwg = (C1185120gwg) ((InterfaceC1181670gr7) C13LP.LJJJLL(arrayList));
                    if (c1185120gwg != null && (poiDetailVideoListModelLIZ2 = c1185120gwg.LIZ()) != null) {
                        listLIZ = poiDetailVideoListModelLIZ2.LIZ();
                    }
                }
                Long realFavoriteCnt = poiDetailResponse.getRealFavoriteCnt();
                if (realFavoriteCnt != null) {
                    jLongValue = realFavoriteCnt.longValue();
                }
                String strIsClaimedForMob = poiDetailResponse.isClaimedForMob();
                String strLIZIZ = kp().LIZIZ();
                if (strLIZIZ == null) {
                    strLIZIZ = kp().LJIIJJI();
                }
                C1185180gwm.LIZ(poiId, new C1185160gwk(strIsClaimedForMob, listLIZ, strLIZIZ, kp().LIZJ(), jLongValue, kp().LIZ()));
                this.LLJJJJLIIL = false;
                return;
            }
            C1185160gwk c1185160gwkLIZIZ = C1185180gwm.LIZIZ(kp().getPoiId());
            if (c1185160gwkLIZIZ != null) {
                String poiId2 = kp().getPoiId();
                List<Aweme> list = c1185160gwkLIZIZ.LIZIZ;
                if (list == null) {
                    InterfaceC1181010gq3 interfaceC1181010gq3LIZ2 = C1174850gg7.LIZ(this);
                    if (interfaceC1181010gq3LIZ2 != null && (c1181550gqvEr2 = interfaceC1181010gq3LIZ2.Er2()) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = ((LinkedHashMap) c1181550gqvEr2.LIZ).entrySet().iterator();
                        while (it3.hasNext()) {
                            Object value2 = ((Map.Entry) it3.next()).getValue();
                            if (value2 instanceof C1185120gwg) {
                                arrayList2.add(value2);
                            }
                        }
                        C1185120gwg c1185120gwg2 = (C1185120gwg) ((InterfaceC1181670gr7) C13LP.LJJJLL(arrayList2));
                        if (c1185120gwg2 != null && (poiDetailVideoListModelLIZ = c1185120gwg2.LIZ()) != null) {
                            listLIZ = poiDetailVideoListModelLIZ.LIZ();
                        }
                    }
                } else {
                    listLIZ = list;
                }
                Long realFavoriteCnt2 = poiDetailResponse.getRealFavoriteCnt();
                if (realFavoriteCnt2 != null) {
                    jLongValue = realFavoriteCnt2.longValue();
                }
                C1185180gwm.LIZ(poiId2, new C1185160gwk(poiDetailResponse.isClaimedForMob(), listLIZ, c1185160gwkLIZIZ.LIZLLL, c1185160gwkLIZIZ.LJ, jLongValue, c1185160gwkLIZIZ.LJFF));
            }
        }
    }

    public final void sp(boolean z) {
        boolean zIsImmersion;
        Integer numLIZJ;
        PoiNavButtonGroup poiNavButtonGroup;
        PoiDynamicNavBarModule poiDynamicNavBarModule = (PoiDynamicNavBarModule) C1174850gg7.LIZJ(this);
        if (poiDynamicNavBarModule != null && (poiNavButtonGroup = poiDynamicNavBarModule.getPoiNavButtonGroup()) != null) {
            zIsImmersion = poiNavButtonGroup.isImmersion();
        } else {
            zIsImmersion = false;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(LJJIJL().getContext(), R.style.y3);
        if (zIsImmersion && z) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a0o, contextThemeWrapper);
        } else {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, LJJIJL().getContext());
        }
        if (numLIZJ != null) {
            numLIZJ.intValue();
            Iterator<TuxIconView> it2 = this.LLJLIL.iterator();
            while (it2.hasNext()) {
                it2.next().setTintColor(numLIZJ.intValue());
            }
            if (z) {
                for (TuxIconView tuxIconView : this.LLJLIL) {
                    Boolean boolValueOf = Boolean.valueOf(zIsImmersion);
                    Context context = getContext();
                    if (context != null) {
                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zc, new ContextThemeWrapper(LJJIJL().getContext(), R.style.y3));
                        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && tuxIconView != null) {
                            C384050F3z c384050F3z = new C384050F3z();
                            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                            c384050F3z.LIZ = numLIZJ2;
                            Drawable drawableLIZ = c384050F3z.LIZ(context);
                            C19659111vp c19659111vp = new C19659111vp();
                            c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
                            c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
                            c19659111vp.LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                            c19659111vp.LJ = Integer.valueOf(R.attr.p0);
                            tuxIconView.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(context)));
                        }
                    }
                    if (zIsImmersion) {
                        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                    } else {
                        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    }
                }
                return;
            }
            for (TuxIconView tuxIconView2 : this.LLJLIL) {
                tuxIconView2.setBackground(null);
                tuxIconView2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                tuxIconView2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            }
        }
    }

    public final void tp(boolean z) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            if (z) {
                ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19egLIZ);
                TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19egLIZ, immersionBarLJIILJJIL);
                immersionBarLJIILJJIL.LJIIL();
                tuxImmersionBar.LIZLLL();
                return;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zq, LJJIJL().getContext());
            if (numLIZJ == null) {
                return;
            }
            int iIntValue = numLIZJ.intValue();
            TuxImmersionBar tuxImmersionBar2 = new TuxImmersionBar(c19egLIZ, ImmersionBar.LJIILJJIL(c19egLIZ));
            tuxImmersionBar2.LJIIIZ(iIntValue);
            tuxImmersionBar2.LIZLLL();
        }
    }

    public final void up(ValueAnimator valueAnimator, boolean z) {
        Animator animator;
        Animator animator2;
        valueAnimator.setDuration(200L);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new AUListenerS267S0100000_18(this, 2));
        if (z) {
            Animator animator3 = this.LLJJLIIIJLLLLLLLZ;
            if (animator3 != null && animator3.isStarted() && (animator2 = this.LLJJLIIIJLLLLLLLZ) != null) {
                animator2.cancel();
            }
        } else {
            Animator animator4 = this.LLJJL;
            if (animator4 != null && animator4.isStarted() && (animator = this.LLJJL) != null) {
                animator.cancel();
            }
        }
        valueAnimator.start();
    }
}
