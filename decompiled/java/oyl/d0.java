package oyl;

import X.C01GW;
import X.C09JN;
import X.C0C64;
import X.C11JF;
import X.C11O8;
import X.C11RO;
import X.C11VU;
import X.C12P3;
import X.C13BV;
import X.C13LP;
import X.C13SZ;
import X.C1459900o5s;
import X.C1460190o6L;
import X.C1651600t54;
import X.C1654400t9a;
import X.C1657770tF1;
import X.C1657800tF4;
import X.C1657820tF6;
import X.C1657830tF7;
import X.C1657860tFA;
import X.C1657890tFD;
import X.C1659010tH1;
import X.C1659020tH2;
import X.C1659070tH7;
import X.C1659080tH8;
import X.C1659140tHE;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C201955140j;
import X.C21341918fZ;
import X.C21342318fd;
import X.C2188811AlT;
import X.C375830EoP;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1651310t4b;
import X.EnumC992740bwO;
import X.InterfaceC1318780kQG;
import X.InterfaceC1651490t4t;
import X.InterfaceC1657840tF8;
import X.InterfaceC1657870tFB;
import X.InterfaceC1657880tFC;
import X.InterfaceC1657910tFF;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AComparatorS44S0000000_25;
import Y.ALAdapterS19S0200000_25;
import Y.AUListenerS256S0100000_6;
import Y.AfS159S0200000_25;
import Y.AkS486S0100000_25;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.toolbar.widget.ToolbarScrollView;
import com.zhiliaoapp.musically.R;
import irm.AkS62S0200000_25;
import iyl.i3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class d0 extends LinearLayout {
    public static final C01GW<C11RO> LLJLLIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(511));
    public C1657800tF4 LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final float LLILZLL;
    public int LLIZ;
    public EnumC992740bwO LLIZLLLIL;
    public final C01GW LLJ;
    public InterfaceC1657840tF8 LLJI;
    public final LinearLayout LLJIJIL;
    public final LinearLayout LLJILJIL;
    public final ToolbarScrollView LLJILJILJ;
    public final TuxIconView LLJILLL;
    public final View LLJJ;
    public AnimatorSet LLJJI;
    public C11JF LLJJIII;
    public boolean LLJJIJI;
    public TouchDelegate LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public InterfaceC1657910tFF LLJJJIL;
    public final List<InterfaceC1657910tFF> LLJJJJ;
    public final CopyOnWriteArrayList<InterfaceC1657870tFB> LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public volatile List<i3> LLJJL;
    public volatile List<i3> LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public InterfaceC1651490t4t LLJLL;

    public final void LJIIZILJ() {
        super.setTouchDelegate(null);
    }

    private final LayoutTransition getDefaultTransition() {
        return (LayoutTransition) this.LLJLILLLLZIIL.getValue();
    }

    private final boolean getEnableToolbarThreadOpt() {
        return ((Boolean) this.LLJJIJIL.getValue()).booleanValue();
    }

    private final C1657890tFD getFixedListUpdateCallback() {
        return (C1657890tFD) this.LLJL.getValue();
    }

    private final C12P3 getShowMoreBackground() {
        return (C12P3) this.LLJJJ.getValue();
    }

    private final C1657890tFD getSlideListUpdateCallback() {
        return (C1657890tFD) this.LLJLIL.getValue();
    }

    public final void LIZJ() {
        List<i3> listLIZLLL;
        InterfaceC1657840tF8 interfaceC1657840tF8;
        AnimatorSet animatorSet = this.LLJJI;
        if ((animatorSet != null && animatorSet.isRunning()) || this.LLIZ == 0 || this.LLJI == null) {
            return;
        }
        C201955140j.LIZLLL(C1459900o5s.LIZIZ, "ToolbarListView", "collapse");
        EnumC992740bwO enumC992740bwO = EnumC992740bwO.NONE;
        this.LLIZ = 0;
        this.LLIZLLLIL = enumC992740bwO;
        setBackground(null);
        InterfaceC1657840tF8 interfaceC1657840tF82 = this.LLJI;
        if (interfaceC1657840tF82 != null && (listLIZLLL = interfaceC1657840tF82.LIZLLL()) != null && (!listLIZLLL.isEmpty()) && (interfaceC1657840tF8 = this.LLJI) != null) {
            interfaceC1657840tF8.LIZJ(listLIZLLL, true, null);
        }
        getBatchViewStateListener().LLLFFI();
    }

    public final boolean LJIILIIL() {
        return this.LLIZ == 1;
    }

    public final boolean LJIILJJIL() {
        return this.LLIZ == 1 && this.LLIZLLLIL == EnumC992740bwO.USER_CLICK;
    }

    public final void LJIILL() {
        List<i3> listLIZLLL;
        if (this.LLJJIJI) {
            C201955140j.LIZLLL(C1459900o5s.LIZIZ, "ToolbarListView", "onViewAttach");
            this.LLJJIJI = false;
            C13BV c13bv = C13BV.INSTANCE;
            this.LLJJL = c13bv;
            this.LLJJLIIIJLLLLLLLZ = c13bv;
            LinearLayout linearLayout = this.LLJILJIL;
            if (linearLayout == null) {
                linearLayout = null;
            }
            linearLayout.setLayoutTransition(null);
            InterfaceC1657840tF8 interfaceC1657840tF8 = this.LLJI;
            if (interfaceC1657840tF8 == null || (listLIZLLL = interfaceC1657840tF8.LIZLLL()) == null || !(!listLIZLLL.isEmpty())) {
                return;
            }
            LIZLLL(LIZIZ(new C1651600t54(listLIZLLL)));
        }
    }

    public final void LJIILLIIL() {
        InterfaceC1657840tF8 interfaceC1657840tF8 = this.LLJI;
        List<i3> listLIZLLL = interfaceC1657840tF8 != null ? interfaceC1657840tF8.LIZLLL() : null;
        C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewRecycle ");
        sbLIZ.append(listLIZLLL != null ? Integer.valueOf(listLIZLLL.size()) : null);
        C201955140j.LIZLLL(c1459900o5s, "ToolbarListView", C2188811AlT.LIZIZ(sbLIZ));
        LinearLayout linearLayout = this.LLJILJIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        linearLayout.setLayoutTransition(null);
        if (listLIZLLL != null) {
            for (i3 i3Var : listLIZLLL) {
                this.LLJJIJI = true;
                InterfaceC1657880tFC interfaceC1657880tFC = getItemMap().get(i3Var.LLJLIL);
                if (interfaceC1657880tFC != null) {
                    interfaceC1657880tFC.LJ();
                }
                getItemMap().remove(i3Var.LLJLIL);
            }
        }
    }

    public final void LJIJI() {
        super.setTouchDelegate(this.LLJJIJIIJIL);
    }

    public final InterfaceC1657870tFB getBatchViewStateListener() {
        return (InterfaceC1657870tFB) this.LLJJJJLIIL.getValue();
    }

    public final List<i3> getCurrentDisplayListData() {
        return C13LP.LJLIL(this.LLJJLIIIJLLLLLLLZ, this.LLJJL);
    }

    public final Map<String, InterfaceC1657880tFC> getItemMap() {
        return (Map) this.LLJ.getValue();
    }

    public final Rect getSlideRegionRect() {
        return new Rect(this.LLJILJILJ.getLeft(), this.LLJILJILJ.getTop(), this.LLJILJILJ.getRight(), this.LLJILJILJ.getBottom());
    }

    public final int getSlideRegionScrollY() {
        return this.LLJILJILJ.getScrollY();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.LLJJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C11JF c11jf = this.LLJJIII;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    public final boolean getAlwaysHideSaveLocal() {
        return this.LLILLJJLI;
    }

    public final int getMaxCollapseSlideCnt() {
        return this.LLILZ;
    }

    public final int getMaxCollapseSlideFixTotalCnt() {
        return this.LLILZIL;
    }

    public final InterfaceC1651490t4t getToolbarDataManager() {
        return this.LLJLL;
    }

    public d0(Context context) {
        int i;
        super(context, null, 0);
        this.LL = new C1657800tF4(false, false);
        this.LLILLJJLI = true;
        this.LLILLL = ScreenUtils.getScreenHeight(context);
        this.LLILZ = 4;
        this.LLILZIL = -1;
        this.LLILZLL = 9.5f;
        this.LLIZLLLIL = EnumC992740bwO.NONE;
        this.LLJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(513));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4282));
        this.LLJJJ = C452501pT.LIZIZ(new AwS569S0100000_25(context, 957));
        this.LLJJJJ = new ArrayList();
        this.LLJJJJJIL = new CopyOnWriteArrayList<>();
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 951));
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJJL = c13bv;
        this.LLJJLIIIJLLLLLLLZ = c13bv;
        this.LLJL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 955));
        this.LLJLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 961));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(353));
        LinearLayout.inflate(context, R.layout.d6x, this);
        this.LLJIJIL = (LinearLayout) findViewById(R.id.i1g);
        this.LLJJ = findViewById(R.id.mpe);
        this.LLJILJIL = (LinearLayout) findViewById(R.id.vjs);
        ToolbarScrollView toolbarScrollView = (ToolbarScrollView) findViewById(R.id.vjt);
        this.LLJILJILJ = toolbarScrollView;
        final TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.y7p);
        this.LLJILLL = tuxIconView;
        C1657820tF6.LIZ.getClass();
        if (C1657820tF6.LIZIZ()) {
            i = R.raw.icon_color_chevron_up_fill;
        } else {
            i = R.raw.icon_chevron_down_small_fill;
        }
        tuxIconView.setIconRes(i);
        if (!C1657820tF6.LIZIZ()) {
            tuxIconView.setTintColorRes(R.attr.ee);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e5);
            tuxIconView.setBackground(c384050F3z.LIZ(context));
        }
        C786410Ut5.I7(new AkS62S0200000_25(this, context, 3), tuxIconView);
        float fLIZIZ = C418440Gaw.LIZIZ(32);
        float fLIZIZ2 = C418440Gaw.LIZIZ(27);
        final int iLIZIZ = (int) C11VU.LIZIZ(fLIZIZ, tuxIconView.getContext());
        final int iLIZIZ2 = (int) C11VU.LIZIZ(fLIZIZ2, tuxIconView.getContext());
        final Rect rect = new Rect();
        rect.left = (int) C11VU.LIZIZ(2.0f, tuxIconView.getContext());
        rect.top = (int) C11VU.LIZIZ(5.0f, tuxIconView.getContext());
        rect.right = (int) C11VU.LIZIZ(2.0f, tuxIconView.getContext());
        rect.bottom = (int) C11VU.LIZIZ(0.0f, tuxIconView.getContext());
        C786410Ut5.x3(tuxIconView.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0t2e
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.StringBuilder] */
            /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View] */
            /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View] */
            /* JADX WARN: Type inference failed for: r7v3, types: [android.view.View, android.view.ViewGroup, java.lang.Object] */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C786410Ut5.C3(tuxIconView.getViewTreeObserver(), this);
                ?? r7 = tuxIconView;
                int i2 = iLIZIZ;
                int i3 = iLIZIZ2;
                while (true) {
                    ViewParent parent = r7.getParent();
                    if (!(parent instanceof ViewGroup)) {
                        return;
                    }
                    r7 = (ViewGroup) parent;
                    if (r7.getWidth() >= i2 && r7.getHeight() >= i3) {
                        View view = tuxIconView;
                        int i4 = iLIZIZ;
                        int i5 = iLIZIZ2;
                        Rect rect2 = rect;
                        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                        ?? LIZ = C2188811AlT.LIZ();
                        LIZ.append("expandViewTouchArea: ");
                        LIZ.append(view);
                        LIZ.append(", ");
                        LIZ.append(r7);
                        interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(LIZ));
                        C1652270t69.LIZ(i4, i5, rect2, view, r7);
                        return;
                    }
                }
            }
        });
        toolbarScrollView.setScrollStateChangeListener(new InterfaceC1318780kQG() { // from class: X.0tFE
            @Override // X.InterfaceC1318780kQG
            public final void LIZ(int i2) {
                this.LIZ.getBatchViewStateListener().LIZ(i2);
            }
        });
        toolbarScrollView.setGetFirstItemRect(new AwS566S0100000_22(this, 993));
    }

    public final void LIZ(InterfaceC1657870tFB interfaceC1657870tFB) {
        if (!this.LLJJJJJIL.contains(interfaceC1657870tFB)) {
            this.LLJJJJJIL.add(interfaceC1657870tFB);
            interfaceC1657870tFB.LIZLLL(this.LLJJL, this.LLJJLIIIJLLLLLLLZ);
        }
    }

    public final C1657830tF7 LIZIZ(C1651600t54 c1651600t54) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        boolean z2;
        List<i3> listSubList;
        int size;
        List<i3> list = c1651600t54.LIZ;
        ArrayList arrayList3 = new ArrayList();
        for (i3 i3Var : list) {
            if (i3Var.LLJLL) {
                arrayList3.add(i3Var);
            }
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS44S0000000_25(8), arrayList3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listLJLLLL) {
            EnumC1651310t4b enumC1651310t4b = ((i3) obj).LLJLILLLLZIIL;
            Object arrayList4 = linkedHashMap.get(enumC1651310t4b);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(enumC1651310t4b, arrayList4);
            }
            ((List) arrayList4).add(obj);
        }
        List<i3> list2 = this.LLJJL;
        List<i3> list3 = this.LLJJLIIIJLLLLLLLZ;
        Collection collection = (Collection) linkedHashMap.get(EnumC1651310t4b.FIXED);
        if (collection != null) {
            arrayList = new ArrayList(collection);
        } else {
            arrayList = new ArrayList();
        }
        Collection collection2 = (Collection) linkedHashMap.get(EnumC1651310t4b.SLIDE);
        if (collection2 != null) {
            arrayList2 = new ArrayList(collection2);
        } else {
            arrayList2 = new ArrayList();
        }
        int iLJIIIIZZ = LJIIIIZZ(arrayList.size(), arrayList2);
        C1460190o6L c1460190o6L = null;
        if (arrayList2.size() <= iLJIIIIZZ) {
            z = false;
        } else {
            List listSubList2 = arrayList2.subList(iLJIIIIZZ, arrayList2.size());
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : listSubList2) {
                if (((i3) obj2).LLJJJIL) {
                    arrayList5.add(obj2);
                }
            }
            int i = 0;
            z = false;
            for (Object obj3 : arrayList5) {
                int i2 = i + 1;
                if (i >= 0) {
                    int size2 = (iLJIIIIZZ - arrayList5.size()) + i;
                    arrayList2.remove(obj3);
                    ListProtector.add(arrayList2, size2, obj3);
                    z = true;
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int i3 = this.LLIZ;
            int size3 = arrayList.size();
            if (i3 == 0) {
                size = LJIIIIZZ(size3, arrayList2);
            } else {
                size = arrayList2.size();
            }
            int size4 = arrayList.size();
            if (this.LLIZ != 0 ? size > LJIIIIZZ(size4, arrayList2) : arrayList2.size() > size) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("couldShowMore ");
            sbLIZ.append(z2);
            sbLIZ.append(" expectScrollRegionCnt ");
            sbLIZ.append(size);
            sbLIZ.append(" currentState ");
            sbLIZ.append(this.LLIZ);
            sbLIZ.append(" maxHeight:");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(" newFixedData.size:");
            sbLIZ.append(arrayList.size());
            sbLIZ.append(" newSlideData.size:");
            sbLIZ.append(arrayList2.size());
            C201955140j.LJIILL(c1459900o5s, "ToolbarListView", C2188811AlT.LIZIZ(sbLIZ));
            int size5 = arrayList2.size();
            listSubList = arrayList2;
            if (size5 > size) {
                listSubList = arrayList2.subList(0, size);
            }
        } else {
            z2 = false;
            listSubList = arrayList2;
        }
        this.LLJJL = arrayList;
        this.LLJJLIIIJLLLLLLLZ = listSubList;
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new C1657860tFA(list2, arrayList), true);
        C21341918fZ c21341918fZLIZ2 = C21342318fd.LIZ(new C1657860tFA(list3, listSubList), true);
        if (z) {
            c1460190o6L = c1651600t54.LIZJ;
        }
        return new C1657830tF7(z2, c1651600t54.LIZIZ, c1460190o6L, list2, arrayList, list3, listSubList, c21341918fZLIZ, c21341918fZLIZ2);
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0164: INVOKE (r10v0 ?? I:oyl.d0), (r0 I:X.0tF7), (r1 I:java.lang.Exception) STATIC call: oyl.d0.LJFF(oyl.d0, X.0tF7, java.lang.Exception):void A[MD:(oyl.d0, X.0tF7, java.lang.Exception):void (m)] (LINE:16777572), block:B:68:0x0161 */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0164: INVOKE (r10 I:oyl.d0), (r0 I:X.0tF7), (r1 I:java.lang.Exception) STATIC call: oyl.d0.LJFF(oyl.d0, X.0tF7, java.lang.Exception):void A[MD:(oyl.d0, X.0tF7, java.lang.Exception):void (m)] (LINE:16777572), block:B:68:0x0161 */
    public final void LIZLLL(C1657830tF7 c1657830tF7) {
        d0 d0VarLJFF;
        C1657830tF7 c1657830tF7LJFF;
        LayoutTransition defaultTransition;
        int i;
        try {
            C1657800tF4 c1657800tF4 = this.LL;
            boolean z = c1657800tF4.LIZ;
            boolean z2 = c1657800tF4.LIZIZ;
            LayoutTransition layoutTransition = null;
            int i2 = 8;
            boolean z3 = true;
            if (c1657830tF7.LIZ) {
                C786410Ut5.LLLLLLZZ(this.LLJILLL, 0);
            } else {
                C786410Ut5.LLLLLLZZ(this.LLJILLL, 8);
                C786410Ut5.Fb(this.LLJILLL, 0.0f);
                setBackground(null);
                if ((this.LLIZ == 1 || this.LLJLL != null) && !c1657830tF7.LIZIZ && !z) {
                    LJIJJLI(false, false);
                }
                EnumC992740bwO enumC992740bwO = EnumC992740bwO.NONE;
                this.LLIZ = 0;
                this.LLIZLLLIL = enumC992740bwO;
            }
            C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dispatchSlideUpdateResult,");
            sbLIZ.append(c1657830tF7);
            C201955140j.LIZLLL(c1459900o5s, "ToolbarListView", C2188811AlT.LIZIZ(sbLIZ));
            getFixedListUpdateCallback().LJ(c1657830tF7.LIZLLL, c1657830tF7.LJ, null);
            c1657830tF7.LJII.LIZIZ(getFixedListUpdateCallback());
            if (getFixedListUpdateCallback().LIZLLL()) {
                LinearLayout linearLayout = this.LLJIJIL;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                if (c1657830tF7.LJ.isEmpty()) {
                    i = 8;
                } else {
                    i = 0;
                }
                C786410Ut5.LJZL(i, linearLayout);
                View view = this.LLJJ;
                if ((!c1657830tF7.LJ.isEmpty()) && (!c1657830tF7.LJI.isEmpty())) {
                    i2 = 0;
                }
                C786410Ut5.LJLLLLLL(i2, view);
            }
            int size = c1657830tF7.LJFF.size();
            int size2 = c1657830tF7.LJI.size();
            LinearLayout linearLayout2 = this.LLJILJIL;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            if (c1657830tF7.LIZIZ) {
                defaultTransition = getDefaultTransition();
            } else {
                defaultTransition = null;
            }
            linearLayout2.setLayoutTransition(defaultTransition);
            if (c1657830tF7.LIZIZ) {
                if (c1657830tF7.LIZJ != null) {
                    LinearLayout linearLayout3 = this.LLJILJIL;
                    if (linearLayout3 == null) {
                        linearLayout3 = null;
                    }
                    linearLayout3.setLayoutTransition(null);
                    C1460190o6L c1460190o6L = c1657830tF7.LIZJ;
                    if (c1460190o6L != null) {
                        layoutTransition = c1460190o6L.LIZ;
                    }
                    LJ(this, c1657830tF7, layoutTransition);
                    LJIJ(this, size, size2, c1657830tF7.LJ.size(), true, c1657830tF7.LIZJ, null, 32);
                    return;
                }
                if (size2 > size) {
                    LJ(this, c1657830tF7, null);
                    LJIJ(this, size, size2, c1657830tF7.LJ.size(), true, null, new AwS569S0100000_25(this, 949), 16);
                    LJIJJLI(LJIILJJIL(), true);
                    return;
                } else {
                    if (z && z2) {
                        setBackground(getShowMoreBackground());
                    }
                    LJIJJLI(z, true);
                    LJIJ(this, size, size2, c1657830tF7.LJ.size(), true, null, new AwS426S0200000_25(this, c1657830tF7, 156), 16);
                    return;
                }
            }
            LJ(this, c1657830tF7, null);
            if (!z) {
                if (!LJIILJJIL()) {
                    z3 = false;
                }
            } else if (z2) {
                setBackground(getShowMoreBackground());
            }
            LJIJ(this, size, size2, c1657830tF7.LJ.size(), false, null, null, 48);
            LJIJJLI(z3, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJFF(d0VarLJFF, c1657830tF7LJFF, e);
        }
    }

    public final void LJI(EnumC992740bwO enumC992740bwO) {
        List<i3> listLIZLLL;
        InterfaceC1657840tF8 interfaceC1657840tF8;
        AnimatorSet animatorSet = this.LLJJI;
        if ((animatorSet != null && animatorSet.isRunning()) || this.LLIZ == 1 || this.LLJI == null) {
            return;
        }
        C201955140j.LIZLLL(C1459900o5s.LIZIZ, "ToolbarListView", "expand");
        this.LLIZ = 1;
        this.LLIZLLLIL = enumC992740bwO;
        setBackground(getShowMoreBackground());
        InterfaceC1657840tF8 interfaceC1657840tF82 = this.LLJI;
        if (interfaceC1657840tF82 != null && (listLIZLLL = interfaceC1657840tF82.LIZLLL()) != null && (!listLIZLLL.isEmpty()) && (interfaceC1657840tF8 = this.LLJI) != null) {
            interfaceC1657840tF8.LIZJ(listLIZLLL, true, null);
        }
        getBatchViewStateListener().LLLFZ();
    }

    public final boolean LJII(MotionEvent motionEvent) {
        Object next;
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        Iterator it2 = ((ArrayList) this.LLJJJJ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((InterfaceC1657910tFF) next).LJJJJ(motionEvent) && action != 3) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1657910tFF interfaceC1657910tFF = (InterfaceC1657910tFF) next;
        this.LLJJJIL = interfaceC1657910tFF;
        if (interfaceC1657910tFF == null) {
            return false;
        }
        return true;
    }

    public final C1654400t9a LJIIIZ(String str) {
        i3 next;
        InterfaceC1657880tFC interfaceC1657880tFC;
        Iterator<i3> it2 = getCurrentDisplayListData().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LLJLIL, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        i3 i3Var = next;
        if (i3Var == null || (interfaceC1657880tFC = getItemMap().get(i3Var.LLJLIL)) == null) {
            return null;
        }
        return interfaceC1657880tFC.LIZLLL();
    }

    public final int LJIIJ(int i) {
        int iLIZIZ;
        int i2 = C1659140tHE.LLJJL;
        int i3 = i * C1659140tHE.LLJJL;
        if (i3 > 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
        } else {
            iLIZIZ = 0;
        }
        return ((this.LLILLL - i3) - iLIZIZ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
    }

    public final View LJIIJJI(int i) {
        i3 next;
        InterfaceC1657880tFC interfaceC1657880tFC;
        Iterator<i3> it2 = getCurrentDisplayListData().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LLILLL.getType() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        i3 i3Var = next;
        if (i3Var == null || (interfaceC1657880tFC = getItemMap().get(i3Var.LLJLIL)) == null) {
            return null;
        }
        return interfaceC1657880tFC.getItemView();
    }

    public final View LJIIL(String str) {
        i3 next;
        InterfaceC1657880tFC interfaceC1657880tFC;
        Iterator<i3> it2 = getCurrentDisplayListData().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LLJLIL, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        i3 i3Var = next;
        if (i3Var == null || (interfaceC1657880tFC = getItemMap().get(i3Var.LLJLIL)) == null) {
            return null;
        }
        return interfaceC1657880tFC.getItemView();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (LJII(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            InterfaceC1657910tFF interfaceC1657910tFF = this.LLJJJIL;
            if (interfaceC1657910tFF == null) {
                if (motionEvent.getAction() != 0 && LJII(motionEvent)) {
                    return true;
                }
            } else {
                interfaceC1657910tFF.onTouchEvent(motionEvent);
                int action = motionEvent.getAction();
                if (action != 1 && action != 3) {
                    return true;
                }
                this.LLJJJIL = null;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAlwaysHideSaveLocal(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setEnableFadingEdge(boolean z) {
        this.LLJILJILJ.setVerticalFadingEdgeEnabled(z);
    }

    public final void setMaxCollapseSlideCnt(int i) {
        this.LLILZ = i;
    }

    public final void setMaxCollapseSlideFixTotalCnt(int i) {
        this.LLILZIL = i;
    }

    public final void setMaxHeight(int i) {
        if (i == this.LLILLL) {
            return;
        }
        this.LLILLL = i;
    }

    public final void setShowingTextGuideFlag(C1657800tF4 c1657800tF4) {
        this.LL = c1657800tF4;
    }

    public final void setToolbarDataManager(InterfaceC1651490t4t interfaceC1651490t4t) {
        this.LLJLL = interfaceC1651490t4t;
    }

    @Override // android.view.View
    public void setTouchDelegate(TouchDelegate touchDelegate) {
        this.LLJJIJIIJIL = touchDelegate;
        super.setTouchDelegate(touchDelegate);
    }

    public final int LJIIIIZZ(int i, List<i3> list) {
        int iMin;
        String str;
        int iFloor = (int) Math.floor((LJIIJ(i) * 1.0f) / C1659140tHE.LLJJL);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_edit_toolbar_scroll_issue_fix", true, false)) {
            iFloor = Math.min(iFloor, (int) (this.LLILZLL - i));
        }
        int i2 = this.LLILZIL - i;
        if (i2 >= 0) {
            iMin = Math.min(i2, iFloor);
        } else {
            iMin = Math.min(this.LLILZ, iFloor);
        }
        int iMin2 = Math.min(iMin, list.size());
        if (iMin2 == list.size() && this.LLILLJJLI) {
            i3 i3Var = (i3) C13LP.LJJLIIIJL(list);
            if (i3Var != null) {
                str = i3Var.LLJLIL;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "save_local")) {
                return iMin2 - 1;
            }
        }
        if (!getEnableToolbarThreadOpt()) {
            return iMin2;
        }
        return Math.max(iMin2, 0);
    }

    public final void LJIJJ(InterfaceC1657840tF8 interfaceC1657840tF8, Function0<Unit> function0) {
        C11O8 c11o8LJJJLZIJ;
        C11JF c11jf = this.LLJJIII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJI = interfaceC1657840tF8;
        getFixedListUpdateCallback().LLILZLL = interfaceC1657840tF8;
        getSlideListUpdateCallback().LLILZLL = interfaceC1657840tF8;
        if (getEnableToolbarThreadOpt()) {
            c11o8LJJJLZIJ = interfaceC1657840tF8.LIZ().LJIL(10L, TimeUnit.MILLISECONDS).LJJJJZI(new AkS486S0100000_25(this, 24)).LJJJLZIJ(C1701940uOG.LIZIZ());
        } else {
            c11o8LJJJLZIJ = interfaceC1657840tF8.LIZ().LJJJLZIJ(LLJLLIL.getValue()).LJIL(10L, TimeUnit.MILLISECONDS).LJJJJZI(new AkS486S0100000_25(this, 25)).LJJJLZIJ(C1701940uOG.LIZIZ());
        }
        this.LLJJIII = (C11JF) c11o8LJJJLZIJ.LJJLL(new AfS159S0200000_25(this, function0, 10), new C09JN() { // from class: X.0tF5
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ToolbarListView@4ad4.setAdapter$2");
                Throwable th = (Throwable) obj;
                C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error: ");
                sbLIZ.append(th.getMessage());
                C201955140j.LJIIIIZZ(c1459900o5s, "ToolbarListView", C2188811AlT.LIZIZ(sbLIZ));
                C1AF0.LJ(th);
                C1C7U.LIZIZ("ToolbarListView@4ad4.setAdapter$2");
            }
        });
    }

    public final void LJIJJLI(boolean z, boolean z2) {
        List<i3> listLIZLLL;
        boolean z3;
        Object obj;
        InterfaceC1651490t4t interfaceC1651490t4t = this.LLJLL;
        if (interfaceC1651490t4t != null) {
            if (z2) {
                if (z) {
                    obj = C1659020tH2.LIZ;
                } else {
                    obj = C1659010tH1.LIZ;
                }
            } else if (z) {
                obj = C1659080tH8.LIZ;
            } else {
                obj = C1659070tH7.LIZ;
            }
            interfaceC1651490t4t.LJI(C1657770tF1.LIZ, obj);
            return;
        }
        C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try setTextVisibility ");
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(z2);
        C201955140j.LIZLLL(c1459900o5s, "ToolbarListView", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1657840tF8 interfaceC1657840tF8 = this.LLJI;
        if (interfaceC1657840tF8 != null && (listLIZLLL = interfaceC1657840tF8.LIZLLL()) != null) {
            ArrayList<i3> arrayList = new ArrayList();
            for (i3 i3Var : listLIZLLL) {
                if (i3Var.LLJLILLLLZIIL == EnumC1651310t4b.SLIDE) {
                    arrayList.add(i3Var);
                }
            }
            for (i3 i3Var2 : arrayList) {
                if (z && !i3Var2.LLJJIJIL) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                InterfaceC1657880tFC interfaceC1657880tFC = getItemMap().get(i3Var2.LLJLIL);
                if (interfaceC1657880tFC != null) {
                    interfaceC1657880tFC.LIZ(i3.LJIIIZ(i3Var2, 0, 0, 0, null, 0, false, false, false, false, z3, null, null, 0, new C375830EoP(new Pair(Boolean.valueOf(z3), Boolean.valueOf(z2))), null, null, false, null, false, 0.0f, null, 268368895));
                }
            }
        }
    }

    public static final void LJ(d0 d0Var, C1657830tF7 c1657830tF7, LayoutTransition layoutTransition) {
        try {
            d0Var.getSlideListUpdateCallback().LJ(c1657830tF7.LJFF, c1657830tF7.LJI, layoutTransition);
            c1657830tF7.LJIIIIZZ.LIZIZ(d0Var.getSlideListUpdateCallback());
            d0Var.getSlideListUpdateCallback().LIZLLL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJFF(d0Var, c1657830tF7, e);
        }
    }

    public static final void LJFF(d0 d0Var, C1657830tF7 c1657830tF7, Exception exc) {
        C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exception on update:\n");
        sbLIZ.append(C13SZ.LIZIZ(exc));
        C201955140j.LJIIIIZZ(c1459900o5s, "ToolbarListView", C2188811AlT.LIZIZ(sbLIZ));
        C13BV c13bv = C13BV.INSTANCE;
        d0Var.LLJJLIIIJLLLLLLLZ = c13bv;
        d0Var.LLJJL = c13bv;
        d0Var.getFixedListUpdateCallback().LIZIZ();
        d0Var.getSlideListUpdateCallback().LIZIZ();
        LinearLayout linearLayout = d0Var.LLJIJIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJJJJJL(linearLayout);
        LinearLayout linearLayout2 = d0Var.LLJILJIL;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        C786410Ut5.LJJJJJL(linearLayout2);
        if (c1657830tF7.LIZJ != null) {
            c1657830tF7.LIZJ = null;
            c1657830tF7.LIZIZ = false;
        }
        InterfaceC1657840tF8 interfaceC1657840tF8 = d0Var.LLJI;
        if (interfaceC1657840tF8 != null) {
            interfaceC1657840tF8.LJ();
        }
    }

    public static void LJIJ(d0 d0Var, int i, int i2, int i3, boolean z, C1460190o6L c1460190o6L, Function0 function0, int i4) {
        long jLongValue;
        float f;
        Function0 function02 = function0;
        Long l = null;
        if ((i4 & 16) != 0) {
            c1460190o6L = null;
        }
        if ((i4 & 32) != 0) {
            function02 = null;
        }
        AnimatorSet animatorSet = d0Var.LLJJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        float f2 = d0Var.LLILZLL - i3;
        int i5 = C1659140tHE.LLJJL;
        int iMin = Math.min((int) (f2 * i5), d0Var.LJIIJ(i3));
        final int iMin2 = Math.min(i * i5, iMin);
        final int iMin3 = Math.min(i5 * i2, iMin);
        C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetSize,startCount:");
        sbLIZ.append(i);
        sbLIZ.append(",endCount:");
        sbLIZ.append(i2);
        sbLIZ.append(",fixedRegionCount:");
        sbLIZ.append(i3);
        sbLIZ.append(",maxSlideRegionHeight:");
        sbLIZ.append(iMin);
        sbLIZ.append(",startHeight:");
        sbLIZ.append(iMin2);
        sbLIZ.append(",endHeight:");
        sbLIZ.append(iMin3);
        C201955140j.LIZLLL(c1459900o5s, "ToolbarListView", C2188811AlT.LIZIZ(sbLIZ));
        float f3 = 180.0f;
        if (z) {
            final ToolbarScrollView toolbarScrollView = d0Var.LLJILJILJ;
            if (c1460190o6L != null) {
                l = 200L;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iMin2, iMin3);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 250;
            }
            valueAnimatorOfInt.setDuration(jLongValue);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(toolbarScrollView, 123));
            valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: X.0GiV
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    super.onAnimationCancel(animator);
                    View view = toolbarScrollView;
                    int i6 = iMin3;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.height = i6;
                    C786410Ut5.W5(view, layoutParams);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    View view = toolbarScrollView;
                    int i6 = iMin3;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.height = i6;
                    C786410Ut5.W5(view, layoutParams);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    View view = toolbarScrollView;
                    int i6 = iMin2;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.height = i6;
                    C786410Ut5.W5(view, layoutParams);
                }
            });
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.addListener(new ALAdapterS19S0200000_25(function02, d0Var, 6));
            if (c1460190o6L != null) {
                animatorSet2.play(valueAnimatorOfInt);
            } else {
                TuxIconView tuxIconView = d0Var.LLJILLL;
                if (i2 > i) {
                    f = 0.0f;
                } else {
                    f = 180.0f;
                }
                if (i2 <= i) {
                    f3 = 0.0f;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView, (Property<TuxIconView, Float>) View.ROTATION, f, f3);
                objectAnimatorOfFloat.setDuration(250L);
                objectAnimatorOfFloat.addListener(new ALAdapterS19S0200000_25(tuxIconView, d0Var, 5));
                animatorSet2.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat);
            }
            animatorSet2.start();
            d0Var.LLJJI = animatorSet2;
            return;
        }
        TuxIconView tuxIconView2 = d0Var.LLJILLL;
        if (d0Var.LLIZ != 1) {
            f3 = 0.0f;
        }
        C786410Ut5.Fb(tuxIconView2, f3);
        ViewGroup.LayoutParams layoutParams = d0Var.LLJILJILJ.getLayoutParams();
        layoutParams.height = iMin3;
        ToolbarScrollView toolbarScrollView2 = d0Var.LLJILJILJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(toolbarScrollView2);
        toolbarScrollView2.setLayoutParams(layoutParams);
        if (function02 == null) {
            return;
        }
        function02.invoke();
    }
}
