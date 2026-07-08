package com.ss.android.ugc.aweme.feed.assem.bubblelist;

import X.C01GW;
import X.C0RD4;
import X.C0RFL;
import X.C0SDY;
import X.C0SDZ;
import X.C0SEO;
import X.C0SEP;
import X.C0SEQ;
import X.C0SER;
import X.C0SES;
import X.C0SET;
import X.C0SEU;
import X.C0SEV;
import X.C0SEY;
import X.C0SXF;
import X.C12ES;
import X.C1356950lPp;
import X.C13LE;
import X.C1558520qew;
import X.C1591220rVg;
import X.C20703515zt;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C693770RJf;
import X.C694180RKu;
import X.C698840Rb8;
import X.C699500RcC;
import X.C700450Rdj;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C726220SeC;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import Y.AAListenerS136S0300000_11;
import Y.AAListenerS322S0100000_11;
import Y.ARunnableS111S0100000_11;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntrancesControlAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class BubbleListAssem extends BaseCellContentComponent<BubbleListAssem> implements ComponentPriorityProtocol, IBubbleListAssemAbility, Observer<C0RD4>, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ int LLLI = 0;
    public C0SEP LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public boolean LLJLLL;
    public int LLLF;
    public ObjectAnimator LLLFF;
    public ObjectAnimator LLLFFI;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new C0SDZ(this));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 197));
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 196));
    public final C630740Ooa LLJL = C628500Oky.LIZ(new C0SDY(this));
    public final C01GW LLJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C0SEY());
    public int LLJZ = -1;
    public int LLJZIJLIL = -1;
    public int LLL = -1;
    public final C0SEO LLLFZ = new C0SEO(this);

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "left_container_social_bubble";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: dp */
    public final void vr(VideoItemParams videoItemParams) {
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

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -346279423) {
            return null;
        }
        return this;
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        C0SEP c0sep = this.LLJLILLLLZIIL;
        if (c0sep != null) {
            c0sep.LIZ();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C0SEP c0sep = this.LLJLILLLLZIIL;
        if (c0sep != null) {
            c0sep.onDestroy();
        }
        if (C0RFL.LIZ()) {
            onDestroyView();
        }
    }

    public final void ep() {
        LifecycleOwner lifecycleOwnerM128do;
        View view = this.LLJLL;
        if (view == null) {
            return;
        }
        if (C1591220rVg.LIZLLL()) {
            if (this.LLJLLL) {
                return;
            }
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                SAFExtensionKt.LIZ(this.LLLFZ, view.getViewTreeObserver(), fragmentLJI);
            }
            this.LLJLLL = true;
            return;
        }
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        Fragment fragmentLIZLLL = iDetailFeedSafService != null ? iDetailFeedSafService.LIZLLL(C724240Sb0.LJI(this)) : null;
        if (this.LLJLLL || (lifecycleOwnerM128do = m128do()) == null) {
            return;
        }
        if (fragmentLIZLLL != null) {
            SAFExtensionKt.LIZ(this.LLLFZ, view.getViewTreeObserver(), fragmentLIZLLL);
        } else {
            SAFExtensionKt.LIZIZ(view.getViewTreeObserver(), lifecycleOwnerM128do, this.LLLFZ);
        }
        this.LLJLLL = true;
    }

    public final boolean kp() {
        C698840Rb8 c698840Rb8 = C698840Rb8.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        c698840Rb8.getClass();
        return C698840Rb8.LIZ(aweme, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mp() {
        /*
            r5 = this;
            android.view.View r3 = r5.LLJLL
            if (r3 != 0) goto L5
            return
        L5:
            boolean r0 = r5.kp()
            r4 = 0
            if (r0 == 0) goto L53
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L51
            java.lang.Object r0 = r0.LL
        L12:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isPhotoMode(r0)
            if (r0 != 0) goto L3f
            X.0SeC r2 = X.C726220SeC.LIZIZ
            X.0R8b r0 = r5.jm()
            int r1 = r0.LIZ
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L2c
            java.lang.Object r4 = r0.LL
        L2c:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r4 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getAweme()
            boolean r0 = r2.LJIIJJI(r1, r0)
            if (r0 == 0) goto L3f
            r5.op(r3)
        L3b:
            r5.ep()
        L3e:
            return
        L3f:
            java.lang.Integer r0 = r5.hp()
            if (r0 == 0) goto L3b
            int r1 = r0.intValue()
            X.0SEP r0 = r5.LLJLILLLLZIIL
            if (r0 == 0) goto L3b
            r0.LJII(r1)
            goto L3b
        L51:
            r0 = r4
            goto L12
        L53:
            X.0SeC r2 = X.C726220SeC.LIZIZ
            X.0R8b r0 = r5.jm()
            int r1 = r0.LIZ
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L61
            java.lang.Object r4 = r0.LL
        L61:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r4 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getAweme()
            boolean r0 = r2.LJIIJJI(r1, r0)
            if (r0 == 0) goto L77
            r5.lp(r3)
            r3.requestLayout()
            r5.ep()
            return
        L77:
            X.0SEP r0 = r5.LLJLILLLLZIIL
            if (r0 == 0) goto L3e
            r0.LIZLLL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem.mp():void");
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    public final Integer hp() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        int iLIZJ = C418440Gaw.LIZJ(context);
        C0SEP c0sep = this.LLJLILLLLZIIL;
        int i = 0;
        int iLJI = c0sep != null ? c0sep.LJI() : 0;
        C0SEP c0sep2 = this.LLJLILLLLZIIL;
        int iLJIIIZ = c0sep2 != null ? c0sep2.LJIIIZ() : 0;
        int bottom = iLIZJ - LJJIJL().getBottom();
        if (bottom <= 0) {
            return null;
        }
        this.LLJZIJLIL = LJJIJL().getBottom();
        int i2 = (int) ((iLIZJ * 0.6f) - bottom);
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = 0;
        do {
            int i4 = i3 + iLJI;
            if (i4 <= i2) {
                i3 = i4;
            }
            i++;
        } while (i < 4);
        if (i3 >= iLJI) {
            i3 += iLJIIIZ;
        }
        return Integer.valueOf(i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroyView() {
        /*
            r4 = this;
            boolean r0 = X.C1591220rVg.LIZLLL()
            if (r0 != 0) goto L2f
            android.view.View r0 = r4.LJJIJL()
            android.view.ViewParent r3 = r0.getParent()
            boolean r0 = r3 instanceof android.view.View
            r2 = 0
            if (r0 == 0) goto L33
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L34
            android.view.ViewParent r1 = r3.getParent()
        L1b:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L30
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L30
            r3 = r1
        L24:
            java.lang.String r0 = "bubble_list"
            X.0Q7z r1 = X.C1558360qeg.LJ(r3, r0)
            java.lang.Class<com.ss.android.ugc.aweme.feed.assem.bubblelist.IBubbleListAssemAbility> r0 = com.ss.android.ugc.aweme.feed.assem.bubblelist.IBubbleListAssemAbility.class
            X.C1558520qew.LJIIJJI(r1, r0, r2)
        L2f:
            return
        L30:
            if (r3 == 0) goto L2f
            goto L24
        L33:
            r3 = r2
        L34:
            r1 = r2
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem.onDestroyView():void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    public final int ip(View view) {
        Object obj;
        Object obj2;
        View view2;
        int top = 0;
        Object parent = null;
        if (kp()) {
            int bottom = view.getBottom();
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                parent = parent2.getParent();
            }
            if ((parent instanceof View) && (view2 = (View) parent) != null) {
                top = view2.getTop();
            }
            return bottom + top;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (C0SXF.LJIJI(((VideoItemParams) obj).getAweme(), false, true)) {
            C726220SeC c726220SeC = C726220SeC.LIZIZ;
            int i = jm().LIZ;
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            if (c726220SeC.LJIIJJI(i, ((VideoItemParams) obj2).getAweme())) {
                float top2 = view.getTop();
                float measuredHeight = view.getMeasuredHeight();
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    parent = c724270Sb33.LL;
                }
                return (int) (top2 + (measuredHeight * ((VideoItemParams) parent).getAweme().getVideo().getFakeLandscapeInfo().getBottom()));
            }
        }
        return view.getBottom();
    }

    public final void lp(View view) {
        Object obj;
        int i;
        int measuredHeight;
        Object parent;
        View view2;
        C724270Sb3 c724270Sb3 = this.LLJI;
        View viewFindViewById = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (C20703515zt.LJIIZILJ(((VideoItemParams) obj).getAweme())) {
            i = 118;
        } else {
            i = 64;
        }
        int height = ((View) view.getParent()).getHeight();
        if (this.LLJLLIL == null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                parent = parent2.getParent();
            } else {
                parent = null;
            }
            if ((parent instanceof View) && (view2 = (View) parent) != null) {
                viewFindViewById = view2.findViewById(R.id.kv2);
            }
            this.LLJLLIL = viewFindViewById;
        }
        View view3 = this.LLJLLIL;
        if (view3 != null) {
            measuredHeight = view3.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        int iIp = ((height - ip(view)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))) - measuredHeight;
        C0SEP c0sep = this.LLJLILLLLZIIL;
        if (c0sep != null) {
            c0sep.LJII(iIp);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        C0RD4 c0rd42 = c0rd4;
        if (kp() && Intrinsics.LJFF(c0rd42.LIZ, "is_desc_expanded")) {
            Object obj = c0rd42.LIZIZ;
            if (obj == null) {
                obj = null;
            }
            if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
                C0SEP c0sep = this.LLJLILLLLZIIL;
                if (c0sep != null) {
                    c0sep.LIZJ();
                }
                C0SEP c0sep2 = this.LLJLILLLLZIIL;
                if (c0sep2 != null) {
                    c0sep2.setVisibility(4);
                    return;
                }
                return;
            }
            C0SEP c0sep3 = this.LLJLILLLLZIIL;
            if (c0sep3 != null) {
                c0sep3.setVisibility(0);
            }
            C0SEP c0sep4 = this.LLJLILLLLZIIL;
            if (c0sep4 == null) {
                return;
            }
            c0sep4.LJIIL();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.0S8o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, new C0SET(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.0S8j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLIZLLLIL;
            }
        }, null, new C0SEU(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.0SEW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLIZ;
            }
        }, null, new C0SEV(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.0S8p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, new C0SEQ(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.0SEX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJJJLIIL;
            }
        }, null, new C0SER(), 6);
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewGroup) && viewLJJIJL != null && (viewFindViewById = viewLJJIJL.findViewById(R.id.s7m)) != null) {
            C01GW<Integer> c01gw = ConstraintSizeVM.LL;
            viewFindViewById.setPaddingRelative(C693770RJf.LIZLLL(), viewFindViewById.getPaddingTop(), C693770RJf.LIZJ(), viewFindViewById.getPaddingBottom());
        }
    }

    public final void op(View view) {
        int i;
        View view2;
        int bottom;
        View viewML;
        C0SEP c0sep;
        C1356950lPp c1356950lPpLJIIJ;
        int iLJ;
        int iIntValue;
        InteractBizTopAreaAttachAbility interactBizTopAreaAttachAbility = (InteractBizTopAreaAttachAbility) this.LLJJL.getValue();
        if (interactBizTopAreaAttachAbility != null) {
            interactBizTopAreaAttachAbility.lV0();
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        if (C20703515zt.LJIIZILJ(((VideoItemParams) obj).getAweme())) {
            i = 118;
        } else {
            i = 64;
        }
        Context context = getContext();
        if (context != null) {
            int iLIZJ = C418440Gaw.LIZJ(context);
            Object parent = view.getParent();
            if (!(parent instanceof View) || (view2 = (View) parent) == null || view2.getHeight() <= 0 || (bottom = iLIZJ - LJJIJL().getBottom()) <= 0) {
                return;
            }
            this.LLJZIJLIL = LJJIJL().getBottom();
            int iIp = ((iLIZJ - ip(view)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))) - bottom;
            Integer numHp = hp();
            if (numHp != null && (iIntValue = numHp.intValue()) <= iIp) {
                iIp = iIntValue;
            }
            C0SEP.LIZ.getClass();
            int i2 = C0SES.LIZIZ;
            if (iIp < i2) {
                iIp = i2;
            }
            LandscapeEntrancesControlAbility landscapeEntrancesControlAbility = (LandscapeEntrancesControlAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (landscapeEntrancesControlAbility != null && (viewML = landscapeEntrancesControlAbility.ML()) != null && (c0sep = this.LLJLILLLLZIIL) != null && (c1356950lPpLJIIJ = c0sep.LJIIJ()) != null) {
                Rect rect = new Rect();
                c1356950lPpLJIIJ.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                viewML.getGlobalVisibleRect(rect2);
                int i3 = rect2.bottom;
                this.LLJZ = i3;
                if (i3 > rect.bottom - iIp) {
                    C0SEP c0sep2 = this.LLJLILLLLZIIL;
                    int iLJIIIZ = 0;
                    if (c0sep2 != null) {
                        iLJ = c0sep2.LJ();
                    } else {
                        iLJ = 0;
                    }
                    C0SEP c0sep3 = this.LLJLILLLLZIIL;
                    if (c0sep3 != null) {
                        iLJIIIZ = c0sep3.LJIIIZ();
                    }
                    iIp = (rect.bottom - rect2.top) + iLJIIIZ + iLJ;
                }
                HandlerHook.viewPost(LJJIJL(), new ARunnableS111S0100000_11(this, 16));
            }
            C0SEP c0sep4 = this.LLJLILLLLZIIL;
            if (c0sep4 != null) {
                c0sep4.LJII(iIp);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x018f  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r9) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.bubblelist.IBubbleListAssemAbility
    public final void si2(Function0<Unit> function0) {
        C12ES.LJIILL(0, LJJIJL());
        C786410Ut5.T4(LJJIJL(), 1.0f);
        ObjectAnimator objectAnimator = this.LLLFFI;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LJJIJL(), "alpha", 1.0f, 0.0f);
        this.LLLFFI = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        }
        ObjectAnimator objectAnimator2 = this.LLLFFI;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(200L);
        }
        ObjectAnimator objectAnimator3 = this.LLLFFI;
        if (objectAnimator3 != null) {
            objectAnimator3.addListener(new AAListenerS136S0300000_11(this, function0, function0, 0));
        }
        ObjectAnimator objectAnimator4 = this.LLLFFI;
        if (objectAnimator4 != null) {
            C786410Ut5.Pd(objectAnimator4);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.bubblelist.IBubbleListAssemAbility
    public final void tt0(boolean z) {
        ObjectAnimator objectAnimator = this.LLLFF;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z) {
            C786410Ut5.T4(LJJIJL(), 0.0f);
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LJJIJL(), "alpha", 0.0f, 1.0f);
            this.LLLFF = objectAnimatorOfFloat;
            if (objectAnimatorOfFloat != null) {
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            }
            ObjectAnimator objectAnimator2 = this.LLLFF;
            if (objectAnimator2 != null) {
                objectAnimator2.setDuration(200L);
            }
            ObjectAnimator objectAnimator3 = this.LLLFF;
            if (objectAnimator3 != null) {
                objectAnimator3.addListener(new AAListenerS322S0100000_11(this, 4));
            }
            ObjectAnimator objectAnimator4 = this.LLLFF;
            if (objectAnimator4 != null) {
                C786410Ut5.Pd(objectAnimator4);
                return;
            }
            return;
        }
        C786410Ut5.T4(LJJIJL(), 1.0f);
        C12ES.LJIILL(0, LJJIJL());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }
}
