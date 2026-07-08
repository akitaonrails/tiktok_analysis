package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C01GW;
import X.C0BX5;
import X.C0QSJ;
import X.C0RF0;
import X.C0ROI;
import X.C0RV4;
import X.C0SDU;
import X.C0SDV;
import X.C0SKM;
import X.C0SOW;
import X.C1017070cZd;
import X.C1351210lGZ;
import X.C13LE;
import X.C14EU;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C714060Rzg;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC707300Rom;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.InterfaceC704110Rjd;
import Y.ARunnableS80S0200000_11;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbsPhotosDotIndicatorAssem extends PhotoSlideIndicatorAssem<AbsPhotosDotIndicatorAssem> implements ComponentPriorityProtocol, C0SDU, View.OnTouchListener, InterfaceC1146704e9 {
    public static final C0RV4 LLLILZJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public C0SOW LLJLLL;
    public View LLJZ;
    public boolean LLL;
    public boolean LLLF;
    public float LLLFF;
    public int LLLFFI;
    public int LLLFZ;
    public int LLLI;
    public C1351210lGZ LLLII;
    public boolean LLLIIL;
    public volatile InterfaceC704110Rjd LLLIILIL;
    public InterfaceC665370Q7z LLLIL;
    public C0QSJ LLLILZ;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 994));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 996));
    public final C630740Ooa LLLIIIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 995));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(225));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbsPhotosDotIndicatorAssem.class, "photoPageControlShadowAbility", "getPhotoPageControlShadowAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoPageControlShadowAbility;", 0);
        C13LE.LIZ.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLILZJ = new C0RV4();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e_f;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    public boolean Tp() {
        return false;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.InterfaceC704110Rjd Qp() {
        /*
            r4 = this;
            X.0Rjd r0 = r4.LLLIILIL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0Rjd r0 = r4.LLLIILIL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLLILZ     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLLIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.feed.platform.container.scope.VideoCellScope> r1 = com.ss.android.ugc.feed.platform.container.scope.VideoCellScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLLILZ = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0Rjd> r0 = X.InterfaceC704110Rjd.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0Rjd r0 = (X.InterfaceC704110Rjd) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLLIILIL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem.Qp():X.0Rjd");
    }

    public final boolean Ip() {
        PhotoCarouselInfoStruct photoCarouselInfo;
        Integer carouselIndicatorType;
        C724270Sb3 c724270Sb3 = this.LLJI;
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
        return (awemeRawAdLJJIJLIJ == null || (photoCarouselInfo = awemeRawAdLJJIJLIJ.getPhotoCarouselInfo()) == null || (carouselIndicatorType = photoCarouselInfo.getCarouselIndicatorType()) == null || carouselIndicatorType.intValue() != 2) ? false : true;
    }

    @Override // X.C0SDU
    public final int Ng() {
        C0SOW c0sow = this.LLJLLL;
        if (c0sow != null) {
            return (c0sow.getWidth() - c0sow.getPaddingLeft()) - c0sow.getPaddingRight();
        }
        return 0;
    }

    @Override // X.C0SDU
    public final void z7() {
        C0SOW c0sow = this.LLJLLL;
        if (c0sow != null) {
            c0sow.LJI();
        }
    }

    @Override // X.C0SDU
    public final void zi() {
        C0SOW c0sow = this.LLJLLL;
        if (c0sow != null) {
            c0sow.LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        if (C0BX5.LIZ()) {
            return this.LLL ? "bottom_container_photomode_dot_page_control" : "top_bottom_container_photomode_indicator";
        }
        BaseFeedPageParams baseFeedPageParams = jm().LJ;
        if (baseFeedPageParams == null) {
            return "top_bottom_container_photomode_indicator";
        }
        int i = BubbleListAssem.LLLI;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        C0RF0 c0rf0 = jm().LIZLLL;
        return C0ROI.LIZIZ(baseFeedPageParams, aweme, c0rf0 != null ? c0rf0.LIZJ : null) ? "bottom_container_photomode_dot_page_control" : "top_bottom_container_photomode_indicator";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    public final void Up() {
        InterfaceC704110Rjd interfaceC704110RjdQp = Qp();
        if (interfaceC704110RjdQp != null) {
            interfaceC704110RjdQp.I6(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Vp() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2 r0 = r3.Bp()
            X.002o r0 = r0.getState()
            X.0S9P r0 = (X.C0S9P) r0
            boolean r2 = r0.LLILZ
            X.0SOW r1 = r3.LLJLLL
            if (r1 == 0) goto L2a
            boolean r0 = r3.Tp()
            if (r0 == 0) goto L2b
            if (r2 != 0) goto L2b
            boolean r0 = r3.LLLIIL
            if (r0 == 0) goto L26
            X.01GW<X.0RGG> r0 = X.C0RGG.LJ
            X.0RGG r0 = X.C586380MzE.LIZ()
            boolean r0 = r0.LIZLLL
            if (r0 == 0) goto L2b
        L26:
            r0 = 1
        L27:
            r1.setDarkMode(r0)
        L2a:
            return
        L2b:
            r0 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem.Vp():void");
    }

    @Override // X.C0SDU
    public final int di() {
        View view;
        int top = 0;
        int top2 = (bp() ? getContentView().getTop() : 0) + LJJIJL().getTop();
        Object parent = LJJIJL().getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            top = view.getTop();
        }
        return top2 + top;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        if (!C0SKM.LIZLLL() || EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideIndicatorAssem
    /* JADX INFO: renamed from: Ep */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r5) {
        /*
            r4 = this;
            X.0R8b r0 = r4.jm()
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r3 = r0.LJ
            r2 = 1
            if (r3 == 0) goto L98
            int r0 = com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem.LLLI
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.getAweme()
            X.0R8b r0 = r4.jm()
            X.0RF0 r0 = r0.LIZLLL
            if (r0 == 0) goto L96
            androidx.fragment.app.Fragment r0 = r0.LIZJ
        L19:
            boolean r0 = X.C0ROI.LIZIZ(r3, r1, r0)
            if (r0 != r2) goto L98
            r0 = 1
        L20:
            r4.LLL = r0
            boolean r0 = X.C0SCS.LIZ(r5)
            if (r0 != 0) goto L8e
            X.0SOW r0 = r4.LLJLLL
            if (r0 == 0) goto L2f
            r0.LJIIIZ()
        L2f:
            X.0RV4 r0 = com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem.LLLILZJ
            r0.getClass()
            boolean r0 = X.C0RV4.LIZ(r5)
            X.0Rom r1 = r4.Jp(r0)
            if (r0 == 0) goto L7f
            android.view.View r0 = r4.LLJZ
            if (r0 == 0) goto L45
            X.C339190DRl.LIZLLL(r0)
        L45:
            X.0SOW r0 = r4.LLJLLL
            if (r0 == 0) goto L4c
            r0.setLayoutManager$post_mode_release(r1)
        L4c:
            X.01GW<X.0RGG> r0 = X.C0RGG.LJ
            X.0RGG r1 = X.C586380MzE.LIZ()
            java.lang.String r0 = r5.mEventType
            boolean r0 = r1.LIZJ(r0)
            r4.LLLIIL = r0
            X.0SOW r0 = r4.LLJLLL
            if (r0 == 0) goto L70
            X.0SOc r1 = r0.getLayoutManager()
            if (r1 == 0) goto L70
            boolean r0 = r4.Tp()
            if (r0 == 0) goto L7d
            boolean r0 = r4.LLLIIL
            if (r0 != 0) goto L7d
        L6e:
            r1.LIZ = r2
        L70:
            super.up(r5)
            X.0Rjd r0 = r4.Qp()
            if (r0 == 0) goto L7c
            r0.ab()
        L7c:
            return
        L7d:
            r2 = 0
            goto L6e
        L7f:
            android.view.View r0 = r4.LLJZ
            if (r0 == 0) goto L86
            X.C339190DRl.LIZIZ(r0)
        L86:
            X.0SOW r0 = r4.LLJLLL
            if (r0 == 0) goto L4c
            r0.setLayoutManager$post_mode_release(r1)
            goto L4c
        L8e:
            X.0SOW r0 = r4.LLJLLL
            if (r0 == 0) goto L2f
            r0.LJ()
            goto L2f
        L96:
            r0 = 0
            goto L19
        L98:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem.up(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideIndicatorAssem
    public final void Fp(int i) {
        C0SOW c0sow = this.LLJLLL;
        if (c0sow != null) {
            c0sow.setSelectedIndex(i);
        }
        this.LLLFZ = i;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideIndicatorAssem
    public final void Gp(int i) {
        C0SOW c0sow;
        ViewGroup.LayoutParams layoutParams;
        View view;
        InteractAreaCommonAbility interactAreaCommonAbility;
        int i2;
        C0SOW c0sow2 = this.LLJLLL;
        Object obj = null;
        if (!(c0sow2 instanceof View)) {
            c0sow2 = null;
        }
        if (c0sow2 != null) {
            if (i > 1) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, c0sow2);
        }
        if (i > 1 && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJZIJLIL.getValue()) != null) {
            interactAreaCommonAbility.zB1(this);
        }
        C0SOW c0sow3 = this.LLJLLL;
        if (c0sow3 != null) {
            c0sow3.setCount(i);
        }
        this.LLLI = i;
        C0RV4 c0rv4 = LLLILZJ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        c0rv4.getClass();
        if (C0RV4.LIZ((VideoItemParams) obj) && (c0sow = this.LLJLLL) != null && (layoutParams = c0sow.getLayoutParams()) != null && (view = this.LLJZ) != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = layoutParams.width + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                C786410Ut5.W5(view, layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public EnumC707300Rom Jp(boolean z) {
        if (z) {
            return EnumC707300Rom.SLIDE;
        }
        return EnumC707300Rom.DEFAULT;
    }

    @Override // X.C0SDU
    public final C0SDV l2(int i) {
        View viewFindViewById;
        if (Bo() && (viewFindViewById = LJJIJL().findViewById(i)) != null) {
            int width = viewFindViewById.getWidth();
            int height = viewFindViewById.getHeight();
            int paddingLeft = viewFindViewById.getPaddingLeft();
            int paddingRight = viewFindViewById.getPaddingRight();
            viewFindViewById.getLeft();
            int top = viewFindViewById.getTop();
            viewFindViewById.getRight();
            viewFindViewById.getBottom();
            return new C0SDV(width, height, paddingLeft, paddingRight, top);
        }
        return null;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onClearModeEvent(C714060Rzg c714060Rzg) {
        Object obj;
        String str = c714060Rzg.LIZLLL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(str, ((VideoItemParams) obj).mEventType) || !C0SKM.LIZLLL()) {
            return;
        }
        this.LLLIIL = c714060Rzg.LIZ;
        Vp();
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideIndicatorAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C0SOW c0sow = (C0SOW) view.findViewById(R.id.qed);
        if (c0sow != null) {
            HandlerHook.viewPost(c0sow, new ARunnableS80S0200000_11(c0sow, this, 14));
        } else {
            c0sow = null;
        }
        this.LLJLLL = c0sow;
        super.onViewCreated(view);
        this.LLJZ = view.findViewById(R.id.qes);
        if (C0SKM.LIZLLL()) {
            C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Rjb
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C0S9P) obj).LLILZ);
                }
            }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(151), 4);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideIndicatorAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.C0SDU
    public final void Mc(int i, View.OnLayoutChangeListener onLayoutChangeListener) {
        View viewFindViewById;
        if (Bo() && (viewFindViewById = LJJIJL().findViewById(i)) != null) {
            viewFindViewById.addOnLayoutChangeListener(onLayoutChangeListener);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b3  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.C0SDU
    public final void uj(int i, View.OnLayoutChangeListener onLayoutChangeListener) {
        View viewFindViewById;
        if (Bo() && (viewFindViewById = LJJIJL().findViewById(i)) != null) {
            viewFindViewById.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
    }
}
