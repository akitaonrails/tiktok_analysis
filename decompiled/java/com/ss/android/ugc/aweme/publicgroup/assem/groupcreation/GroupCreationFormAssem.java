package com.ss.android.ugc.aweme.publicgroup.assem.groupcreation;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0I0B;
import X.C0I7D;
import X.C0PEM;
import X.C0TVI;
import X.C1228470i4b;
import X.C1228650i4t;
import X.C128Y;
import X.C13LE;
import X.C14K9;
import X.C1511705vv;
import X.C1527305yR;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1748470vbJ;
import X.C19719912Dl;
import X.C20097313kJ;
import X.C21578619ce;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C418440Gaw;
import X.C452501pT;
import X.C723580SZw;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C814420VxA;
import X.InterfaceC1228980i5Q;
import X.InterfaceC2217461Bqa;
import X.ViewOnTouchListenerC1233300iCO;
import Y.ARunnableS30S0101000_19;
import Y.ATListenerS452S0100000_19;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.groupcreation.vm.UnifiedGroupCreationVM;
import com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.GroupCreationFormAssem;
import com.ss.android.ugc.aweme.publicgroup.vm.PublicGroupCreationVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS159S0101000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupCreationFormAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1527305yR.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupCreationFormAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publicgroup/vm/PublicGroupCreationVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GroupCreationFormAssem.class, "unifiedGroupCreationVM", "getUnifiedGroupCreationVM()Lcom/ss/android/ugc/aweme/groupcreation/vm/UnifiedGroupCreationVM;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public GroupCreationFormAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PublicGroupCreationVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 1694), AFwS257S0000000_19.get$arr$(255), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(UnifiedGroupCreationVM.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 1695), AFwS257S0000000_19.get$arr$(256), null, true);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1687));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1693));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1688));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1690));
        this.LLJJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1691));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1689));
        this.LLJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1692));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cjb;
    }

    public final FrameLayout hp() {
        C1748470vbJ c1748470vbJ;
        C1748470vbJ c1748470vbJ2;
        C1748470vbJ c1748470vbJ3;
        View view = (View) this.LLJJJJLIIL.getValue();
        if (view != null && (c1748470vbJ3 = (C1748470vbJ) view.findViewById(R.id.sf6)) != null && c1748470vbJ3.getEditText().hasFocus()) {
            return (FrameLayout) this.LLJJJJLIIL.getValue();
        }
        View view2 = (View) this.LLJJL.getValue();
        if (view2 != null && (c1748470vbJ2 = (C1748470vbJ) view2.findViewById(R.id.sf9)) != null && c1748470vbJ2.getEditText().hasFocus()) {
            return (FrameLayout) this.LLJJL.getValue();
        }
        View view3 = (View) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (view3 == null || (c1748470vbJ = (C1748470vbJ) view3.findViewById(R.id.sew)) == null || !c1748470vbJ.getEditText().hasFocus()) {
            return null;
        }
        return (FrameLayout) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C0I7D ip() {
        C1748470vbJ c1748470vbJ;
        C1748470vbJ c1748470vbJ2;
        C1748470vbJ c1748470vbJ3;
        View view = (View) this.LLJJJJLIIL.getValue();
        if (view != null && (c1748470vbJ3 = (C1748470vbJ) view.findViewById(R.id.sf6)) != null && c1748470vbJ3.getEditText().hasFocus()) {
            return c1748470vbJ3.getEditText();
        }
        View view2 = (View) this.LLJJL.getValue();
        if (view2 != null && (c1748470vbJ2 = (C1748470vbJ) view2.findViewById(R.id.sf9)) != null && c1748470vbJ2.getEditText().hasFocus()) {
            return c1748470vbJ2.getEditText();
        }
        View view3 = (View) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (view3 == null || (c1748470vbJ = (C1748470vbJ) view3.findViewById(R.id.sew)) == null || !c1748470vbJ.getEditText().hasFocus()) {
            return null;
        }
        return c1748470vbJ.getEditText();
    }

    public final C21578619ce kp() {
        return (C21578619ce) this.LLJJJJ.getValue();
    }

    public final void lp() {
        String str;
        C1228470i4b c1228470i4b;
        if (this.LLJJIJIL) {
            return;
        }
        this.LLJJIJIL = true;
        C1527305yR c1527305yR = (C1527305yR) this.LLJJI.getValue();
        C1228650i4t c1228650i4t = (c1527305yR == null || (c1228470i4b = c1527305yR.LL) == null) ? null : c1228470i4b.LIZ;
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        PublicGroupCreationVM publicGroupCreationVM = (PublicGroupCreationVM) assemVMLazy.getValue();
        String str2 = c1228650i4t != null ? c1228650i4t.LIZ : null;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (c1228650i4t != null && (str = c1228650i4t.LIZIZ) != null) {
            str3 = str;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1511705vv(publicGroupCreationVM, str2, str3, C0I0B.LJFF.LIZIZ(), null), 3);
    }

    public final void LJJIL() {
        C0I7D c0i7dIp = ip();
        if (c0i7dIp != null && c0i7dIp.hasFocus()) {
            c0i7dIp.clearFocus();
        }
        KeyboardUtils.LIZIZ(c0i7dIp);
        if (this.LLJJIJI) {
            this.LLJJIJI = false;
            this.LLJJIJIIJIL = 0;
            mp(0, false);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1228470i4b c1228470i4b;
        C1228650i4t c1228650i4t;
        C1228470i4b c1228470i4b2;
        C1228650i4t c1228650i4t2;
        InterfaceC1228980i5Q interfaceC1228980i5Q;
        ViewOnTouchListenerC1233300iCO viewOnTouchListenerC1233300iCOOx;
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 548));
        C14K9.LJIJJ(getContentView().getRootView(), new C0TVI() { // from class: X.0iCQ
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                Object objH2;
                WindowManager windowManager;
                int iHeight;
                Display displayLLILZIL;
                ViewTreeObserver viewTreeObserver;
                WindowMetrics windowMetricsLLILZ;
                Rect bounds;
                boolean zLJIIIIZZ = c20246014Ju.LJIIIIZZ(8);
                int i = c20246014Ju.LIZ(8).LIZLLL;
                GroupCreationFormAssem groupCreationFormAssem = this.LL;
                if (zLJIIIIZZ != groupCreationFormAssem.LLJJIJI || i != groupCreationFormAssem.LLJJIJIIJIL) {
                    groupCreationFormAssem.LLJJIJI = zLJIIIIZZ;
                    groupCreationFormAssem.LLJJIJIIJIL = i;
                    FrameLayout frameLayoutHp = groupCreationFormAssem.hp();
                    if (frameLayoutHp != null) {
                        int[] iArr = new int[2];
                        frameLayoutHp.getLocationOnScreen(iArr);
                        int height = iArr[1] + frameLayoutHp.getHeight();
                        Rect rect = new Rect();
                        View rootView = groupCreationFormAssem.getContentView().getRootView();
                        if (rootView != null) {
                            rootView.getWindowVisibleDisplayFrame(rect);
                        }
                        Context context = groupCreationFormAssem.getContext();
                        if (context != null) {
                            objH2 = C786410Ut5.H2(context, "window");
                        } else {
                            objH2 = null;
                        }
                        if (objH2 instanceof WindowManager) {
                            windowManager = (WindowManager) objH2;
                        } else {
                            windowManager = null;
                        }
                        int i2 = 0;
                        if (Build.VERSION.SDK_INT >= 30) {
                            if (windowManager != null && (windowMetricsLLILZ = C2204961BRm.LLILZ(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq9YZPH3zU0aA6miiDEZUKwQPuWVaQW+H2/DoUujrc6bV5iaMg36KEAJ9hviem0tGl9D3sLew==", null))) != null && (bounds = windowMetricsLLILZ.getBounds()) != null) {
                                iHeight = bounds.height();
                            } else {
                                iHeight = 0;
                            }
                        } else {
                            Point point = new Point();
                            if (windowManager != null && (displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq9YZPH3zU0aA6miiDEZUKwQPuWVaQW+H2/DoUujrc6bV5iaMg36KEAJ9hviem0tGl9D3sLew==", null))) != null) {
                                displayLLILZIL.getRealSize(point);
                            }
                            iHeight = point.y;
                        }
                        int i3 = height - (iHeight - i);
                        if (i3 > 0) {
                            i2 = i3;
                        }
                        boolean zMp = groupCreationFormAssem.mp(i2, zLJIIIIZZ);
                        if (!zLJIIIIZZ) {
                            C0I7D c0i7dIp = groupCreationFormAssem.ip();
                            if (c0i7dIp != null) {
                                c0i7dIp.clearFocus();
                            }
                        } else if (i2 > 0) {
                            AwS159S0101000_19 awS159S0101000_19 = new AwS159S0101000_19(groupCreationFormAssem, i2, 7);
                            if (zMp) {
                                C21578619ce c21578619ceKp = groupCreationFormAssem.kp();
                                if (c21578619ceKp != null && (viewTreeObserver = c21578619ceKp.getViewTreeObserver()) != null) {
                                    ViewTreeObserverOnGlobalLayoutListenerC1266000j38 viewTreeObserverOnGlobalLayoutListenerC1266000j38 = new ViewTreeObserverOnGlobalLayoutListenerC1266000j38(groupCreationFormAssem, awS159S0101000_19, 4);
                                    viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1266000j38);
                                    C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1266000j38, ViewTreeObserver.OnGlobalLayoutListener.class);
                                }
                            } else {
                                awS159S0101000_19.invoke();
                            }
                        }
                    }
                }
                return q0.LJIIL(view2, c20246014Ju);
            }
        });
        C20097313kJ.LIZJ(getContentView().getRootView());
        ATListenerS452S0100000_19 aTListenerS452S0100000_19 = new ATListenerS452S0100000_19(this, 11);
        C128Y c128yLJI = C724240Sb0.LJI(this);
        if ((c128yLJI instanceof InterfaceC1228980i5Q) && (interfaceC1228980i5Q = (InterfaceC1228980i5Q) c128yLJI) != null && (viewOnTouchListenerC1233300iCOOx = interfaceC1228980i5Q.ox()) != null) {
            if (!((ArrayList) viewOnTouchListenerC1233300iCOOx.LL).contains(aTListenerS452S0100000_19)) {
                ((ArrayList) viewOnTouchListenerC1233300iCOOx.LL).add(aTListenerS452S0100000_19);
            }
        } else {
            C21578619ce c21578619ceKp = kp();
            if (c21578619ceKp != null) {
                c21578619ceKp.setOnTouchListener(aTListenerS452S0100000_19);
            }
        }
        ((View) this.LLJJJIL.getValue()).setOnTouchListener(new ATListenerS452S0100000_19(this, 10));
        C1527305yR c1527305yR = (C1527305yR) this.LLJJI.getValue();
        final boolean z = false;
        if (c1527305yR != null && (c1228470i4b2 = c1527305yR.LL) != null && (c1228650i4t2 = c1228470i4b2.LIZ) != null) {
            getContentView().setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1228650i4t2.LJIJI))), 0, 0);
        }
        final FrameLayout frameLayout = (FrameLayout) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (frameLayout != null) {
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0iCL
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int i9;
                    C21578619ce c21578619ceKp2;
                    if (z) {
                        AssemVMLazy assemVMLazy = this.LLJJIII;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupCreationFormAssem.LLJLIL;
                        PublicGroupCreationVM publicGroupCreationVM = (PublicGroupCreationVM) assemVMLazy.getValue();
                        if (publicGroupCreationVM.LLILZ == 0) {
                            int[] iArr = new int[2];
                            view2.getLocationOnScreen(iArr);
                            publicGroupCreationVM.LLILZ = iArr[1];
                        }
                        view2.getHeight();
                    }
                    GroupCreationFormAssem groupCreationFormAssem = this;
                    FrameLayout frameLayout2 = frameLayout;
                    if (frameLayout2 == null) {
                        groupCreationFormAssem.getClass();
                        return;
                    }
                    if (!Intrinsics.LJFF(groupCreationFormAssem.hp(), frameLayout2)) {
                        return;
                    }
                    GroupCreationFormAssem groupCreationFormAssem2 = this;
                    if (groupCreationFormAssem2.LLJJIJI && (i9 = i4 - i8) != 0 && i9 > 0 && (c21578619ceKp2 = groupCreationFormAssem2.kp()) != null) {
                        HandlerHook.viewPost(c21578619ceKp2, new ARunnableS30S0101000_19(i9, this, 8));
                    }
                }
            });
        }
        final FrameLayout frameLayout2 = (FrameLayout) this.LLJJJJLIIL.getValue();
        if (frameLayout2 != null) {
            frameLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0iCL
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int i9;
                    C21578619ce c21578619ceKp2;
                    if (z) {
                        AssemVMLazy assemVMLazy = this.LLJJIII;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupCreationFormAssem.LLJLIL;
                        PublicGroupCreationVM publicGroupCreationVM = (PublicGroupCreationVM) assemVMLazy.getValue();
                        if (publicGroupCreationVM.LLILZ == 0) {
                            int[] iArr = new int[2];
                            view2.getLocationOnScreen(iArr);
                            publicGroupCreationVM.LLILZ = iArr[1];
                        }
                        view2.getHeight();
                    }
                    GroupCreationFormAssem groupCreationFormAssem = this;
                    FrameLayout frameLayout22 = frameLayout2;
                    if (frameLayout22 == null) {
                        groupCreationFormAssem.getClass();
                        return;
                    }
                    if (!Intrinsics.LJFF(groupCreationFormAssem.hp(), frameLayout22)) {
                        return;
                    }
                    GroupCreationFormAssem groupCreationFormAssem2 = this;
                    if (groupCreationFormAssem2.LLJJIJI && (i9 = i4 - i8) != 0 && i9 > 0 && (c21578619ceKp2 = groupCreationFormAssem2.kp()) != null) {
                        HandlerHook.viewPost(c21578619ceKp2, new ARunnableS30S0101000_19(i9, this, 8));
                    }
                }
            });
        }
        final FrameLayout frameLayout3 = (FrameLayout) this.LLJJL.getValue();
        final boolean z2 = true;
        if (frameLayout3 != null) {
            frameLayout3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0iCL
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int i9;
                    C21578619ce c21578619ceKp2;
                    if (z2) {
                        AssemVMLazy assemVMLazy = this.LLJJIII;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupCreationFormAssem.LLJLIL;
                        PublicGroupCreationVM publicGroupCreationVM = (PublicGroupCreationVM) assemVMLazy.getValue();
                        if (publicGroupCreationVM.LLILZ == 0) {
                            int[] iArr = new int[2];
                            view2.getLocationOnScreen(iArr);
                            publicGroupCreationVM.LLILZ = iArr[1];
                        }
                        view2.getHeight();
                    }
                    GroupCreationFormAssem groupCreationFormAssem = this;
                    FrameLayout frameLayout22 = frameLayout3;
                    if (frameLayout22 == null) {
                        groupCreationFormAssem.getClass();
                        return;
                    }
                    if (!Intrinsics.LJFF(groupCreationFormAssem.hp(), frameLayout22)) {
                        return;
                    }
                    GroupCreationFormAssem groupCreationFormAssem2 = this;
                    if (groupCreationFormAssem2.LLJJIJI && (i9 = i4 - i8) != 0 && i9 > 0 && (c21578619ceKp2 = groupCreationFormAssem2.kp()) != null) {
                        HandlerHook.viewPost(c21578619ceKp2, new ARunnableS30S0101000_19(i9, this, 8));
                    }
                }
            });
        }
        C1527305yR c1527305yR2 = (C1527305yR) this.LLJJI.getValue();
        if (c1527305yR2 != null && (c1228470i4b = c1527305yR2.LL) != null && (c1228650i4t = c1228470i4b.LIZ) != null && c1228650i4t.LJJIIZ) {
            AssemVMLazy assemVMLazy = this.LLJJJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06If
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1588006Jq) obj).LL;
                }
            }, null, new AwS633S0100000_19(this, 266), 6);
            return;
        }
        lp();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mp(int r9, boolean r10) {
        /*
            r8 = this;
            X.01GW r0 = r8.LLJL
            java.lang.Object r6 = r0.getValue()
            android.view.View r6 = (android.view.View) r6
            r7 = 0
            if (r6 == 0) goto L49
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r4 = 1
            if (r10 == 0) goto L47
            android.view.View r1 = r8.LJJIJL()
            if (r1 == 0) goto L45
            r3 = 2
            int[] r0 = new int[r3]
            r1.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r0 = r1.getHeight()
            int r2 = r2 + r0
            X.01GW r0 = r8.LLJJJJJIL
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L45
            int[] r0 = new int[r3]
            r1.getLocationOnScreen(r0)
            r0 = r0[r4]
            int r0 = r0 - r2
        L37:
            int r9 = r9 + r0
        L38:
            int r0 = r5.height
            if (r0 == r9) goto L49
            r5.height = r9
            X.C786410Ut5.W5(r6, r5)
            r6.requestLayout()
            return r4
        L45:
            r0 = 0
            goto L37
        L47:
            r9 = 0
            goto L38
        L49:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.GroupCreationFormAssem.mp(int, boolean):boolean");
    }
}
