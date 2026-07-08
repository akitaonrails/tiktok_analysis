package com.ss.android.ugc.aweme.share.core.ui;

import X.AbstractC343940De4;
import X.C01GW;
import X.C098200Yq;
import X.C09RB;
import X.C09RD;
import X.C0TVI;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C1362230lYL;
import X.C1369210ljb;
import X.C1369530lk7;
import X.C1369580lkC;
import X.C1369740lkS;
import X.C1369870lkf;
import X.C1369940lkm;
import X.C1370370llT;
import X.C1370570lln;
import X.C1370670llx;
import X.C1370870lmH;
import X.C1371060lma;
import X.C1371590lnR;
import X.C1391190mJ3;
import X.C14JJ;
import X.C14K9;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19724012Fa;
import X.C19EG;
import X.C19GS;
import X.C2152008bu;
import X.C2187701Ajg;
import X.C299110Bnx;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427690Gpr;
import X.C443120HZe;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1369720lkQ;
import X.InterfaceC1058150ddt;
import X.InterfaceC1362720lZ8;
import X.InterfaceC1366490lfD;
import X.InterfaceC1369830lkb;
import X.InterfaceC1370040lkw;
import X.InterfaceC1370110ll3;
import X.InterfaceC1370520lli;
import X.InterfaceC1370540llk;
import X.InterfaceC1370580llo;
import X.InterfaceC1370650llv;
import X.InterfaceC1370660llw;
import X.InterfaceC1370690llz;
import X.InterfaceC1371680lna;
import X.ViewOnLayoutChangeListenerC1370500llg;
import X.ViewOnLayoutChangeListenerC1401910maL;
import X.ViewTreeObserverOnGlobalLayoutListenerC1371050lmZ;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS90S0200000_21;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.material.bottomsheet.SharePanelNewBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import com.ss.android.ugc.aweme.share.core.ui.TuxSharePanelNewBehavior;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import u4.q0;
import wh6.AbS701S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class SkeletonSharePanelFragment extends Fragment implements InterfaceC1058150ddt, InterfaceC1362720lZ8 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkKD02ZiYjHELIOSOyp9PSxiGiQ2JCA4JiEAICQ+LB8yJiAgDz0yLygpJzs=";
    public TuxSheet LLILLJJLI;
    public BaseSharePackage LLILLL;
    public C1371590lnR LLILZ;
    public boolean LLILZLL;
    public int LLIZ;
    public InterfaceC1370040lkw LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public SharePanelNewBehavior LLJILJILJ;
    public TuxSharePanelNewBehavior LLJILLL;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public float LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public int LLJJJJJIL;
    public C1361400lX0 LLJJL;
    public Function0<Unit> LLJLILLLLZIIL;
    public Function1<? super View, Unit> LLJLL;
    public View LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public InterfaceC1370690llz LLJZIJLIL;
    public boolean LLL;
    public int LLLF;
    public ViewOnLayoutChangeListenerC1370500llg LLLLIIL;
    public ViewOnLayoutChangeListenerC1401910maL LLLLIILL;
    public int LLLLILI;
    public int LLLLJ;
    public boolean LLLLJI;
    public List<InterfaceC1370520lli> LL = new ArrayList();
    public boolean LLILZIL = true;
    public final SkeletonSharePanelBehavior<View> LLJIJIL = new SkeletonSharePanelBehavior<>();
    public final TuxSkeletonSharePanelBehavior<View> LLJILJIL = new TuxSkeletonSharePanelBehavior<>();
    public int LLJJ = 1;
    public C443120HZe<? extends View, ? extends View, ? extends View> LLJJJJLIIL = new C443120HZe<>(null, null, null);
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 601));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 602));
    public final ViewTreeObserverOnGlobalLayoutListenerC1371050lmZ LLJLIL = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0lmZ
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            int i;
            Window window;
            View decorView;
            WindowInsets rootWindowInsets;
            DisplayCutout displayCutout;
            Dialog dialog;
            Window window2;
            View decorView2;
            WindowManager windowManager;
            Display displayLLILZIL;
            SkeletonSharePanelFragment skeletonSharePanelFragment = this.LL;
            if (!skeletonSharePanelFragment.LLJJJJ || skeletonSharePanelFragment.LLILLJJLI == null) {
                return;
            }
            Point point = new Point();
            C19EG activity = skeletonSharePanelFragment.getActivity();
            if (activity != null && (windowManager = activity.getWindowManager()) != null && (displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkjGUTx3XvIQY7FeQgn82SKKVJNNJZp3bcf6L/MNB9b1QUmA=", null))) != null) {
                displayLLILZIL.getSize(point);
            }
            Rect rect = new Rect();
            TuxSheet tuxSheet = skeletonSharePanelFragment.LLILLJJLI;
            if (tuxSheet != null && (dialog = tuxSheet.getDialog()) != null && (window2 = dialog.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                decorView2.getWindowVisibleDisplayFrame(rect);
            }
            int i2 = point.y;
            C19EG activity2 = skeletonSharePanelFragment.getActivity();
            if (activity2 == null || (window = activity2.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootWindowInsets = decorView.getRootWindowInsets()) == null || Build.VERSION.SDK_INT < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
                i = 0;
            } else {
                i = 0;
                for (Rect rect2 : displayCutout.getBoundingRects()) {
                    if (rect2.top == 0) {
                        i += rect2.bottom;
                    }
                }
            }
            int i3 = (i2 + i) - rect.bottom;
            skeletonSharePanelFragment.LLJJJ = i3;
            skeletonSharePanelFragment.LLJJJIL = i3 > 0;
        }
    };
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS565S0100000_21(this, 796));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 799));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 798));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 805));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 800));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 793));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 802));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 603));
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 806));
    public final C01GW LLLIILIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 792));
    public final C01GW LLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 804));
    public final C01GW LLLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 797));
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 795));
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 604));
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 791));
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 608));
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 609));
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 605));
    public final C01GW LLLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 606));
    public final C01GW LLLLII = C452501pT.LIZIZ(new AwS556S0100000_12(this, 607));
    public final C01GW LLLLIIIILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 803));
    public final C01GW LLLLIILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 801));
    public final C01GW LLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 790));

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    public final boolean BS() {
        ArrayList arrayListLJ = C1697810uHb.LJ("now_invite", "now_post", "now_video");
        BaseSharePackage baseSharePackage = this.LLILLL;
        if (baseSharePackage == null) {
            baseSharePackage = null;
        }
        boolean zContains = arrayListLJ.contains(baseSharePackage.itemType);
        BaseSharePackage baseSharePackage2 = this.LLILLL;
        if (baseSharePackage2 == null) {
            baseSharePackage2 = null;
        }
        boolean z = zContains || baseSharePackage2.extras.getBoolean("is_match_campaign_condition", false);
        C1371590lnR c1371590lnR = this.LLILZ;
        return z || (TextUtils.isEmpty((c1371590lnR != null ? c1371590lnR : null).LJJJI) ^ true);
    }

    public final void PR() {
        Dialog dialog;
        Window window;
        TuxSheet tuxSheet = this.LLILLJJLI;
        if (tuxSheet == null || (dialog = tuxSheet.getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.clearFlags(2);
    }

    public final FrameLayout RR() {
        return (FrameLayout) this.LLLIILIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RS() {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment.RS():void");
    }

    public final FrameLayout SR() {
        return (FrameLayout) this.LLLIIII.getValue();
    }

    public final FrameLayout UR() {
        return (FrameLayout) this.LLLILZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d8  */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r16v6, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r17v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r17v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.ss.android.ugc.aweme.share.base.model.BaseSharePackage] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ll3] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void US() {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment.US():void");
    }

    public final C1370570lln VR() {
        return (C1370570lln) this.LLLFFI.getValue();
    }

    public final boolean VS() {
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        if (interfaceC1370110ll3 != null) {
            BaseSharePackage baseSharePackage = this.LLILLL;
            if (baseSharePackage == null) {
                baseSharePackage = null;
            }
            if (interfaceC1370110ll3.LIZLLL(baseSharePackage)) {
                C1371590lnR c1371590lnR = this.LLILZ;
                if (c1371590lnR == null) {
                    c1371590lnR = null;
                }
                EnumC1369720lkQ enumC1369720lkQ = c1371590lnR.LJII;
                EnumC1369720lkQ enumC1369720lkQ2 = EnumC1369720lkQ.VERTICAL;
                boolean z = enumC1369720lkQ == enumC1369720lkQ2;
                String enterMethod = getEnterMethod();
                BaseSharePackage baseSharePackage2 = this.LLILLL;
                return z || (C1369210ljb.LIZJ(baseSharePackage2 != null ? baseSharePackage2 : null, enterMethod) == enumC1369720lkQ2);
            }
        }
        return false;
    }

    public final View WR() {
        return (View) this.LLLJIL.getValue();
    }

    public final LinearLayout ZR() {
        return (LinearLayout) this.LLLLIIIILLL.getValue();
    }

    public final LinearLayout aS() {
        return (LinearLayout) this.LLLIL.getValue();
    }

    public final LinearLayout bS() {
        return (LinearLayout) this.LLLI.getValue();
    }

    public final LinearLayout cS() {
        return (LinearLayout) this.LLLIIL.getValue();
    }

    public final String getEnterMethod() {
        return (String) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C1369740lkS hS() {
        for (InterfaceC1370520lli interfaceC1370520lli : this.LL) {
            if (interfaceC1370520lli instanceof C1369740lkS) {
                return (C1369740lkS) interfaceC1370520lli;
            }
        }
        return null;
    }

    public final InterfaceC1370580llo iS() {
        return (InterfaceC1370580llo) this.LLLFF.getValue();
    }

    public final String kS() {
        C1371590lnR c1371590lnR = this.LLILZ;
        if ((c1371590lnR == null ? null : c1371590lnR).LJIILLIIL != 0) {
            if (c1371590lnR == null) {
                c1371590lnR = null;
            }
            String strLIZIZ = C1369530lk7.LIZIZ(c1371590lnR.LJIILLIIL);
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
            Resources resources = getResources();
            C1371590lnR c1371590lnR2 = this.LLILZ;
            return resources.getString((c1371590lnR2 != null ? c1371590lnR2 : null).LJIILLIIL);
        }
        if (c1371590lnR == null) {
            c1371590lnR = null;
        }
        if (c1371590lnR.LJJIJIIJIL || !c1371590lnR.LJIJJLI) {
            String strLIZIZ2 = C1369530lk7.LIZIZ(R.string.tba);
            return strLIZIZ2 == null ? getResources().getString(R.string.tba) : strLIZIZ2;
        }
        String strLIZIZ3 = C1369530lk7.LIZIZ(2131835798);
        return strLIZIZ3 == null ? getResources().getString(2131835798) : strLIZIZ3;
    }

    public final TuxNavBar mS() {
        return (TuxNavBar) this.LLLIIIL.getValue();
    }

    public final TuxTextView nS() {
        return (TuxTextView) this.LLLJL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean oS() {
        /*
            r6 = this;
            X.0ll3 r2 = X.C1370370llT.LIZ
            r5 = 0
            r4 = 1
            r1 = 0
            if (r2 == 0) goto L58
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r0 = r6.LLILLL
            if (r0 != 0) goto Lc
            r0 = r5
        Lc:
            boolean r0 = r2.LIZLLL(r0)
            if (r0 != r4) goto L58
            X.0lnR r1 = r6.LLILZ
            if (r1 != 0) goto L56
            r0 = r5
        L17:
            X.0lkQ r0 = r0.LJII
            X.0lkQ r3 = X.EnumC1369720lkQ.VERTICAL
            if (r0 != r3) goto L54
            if (r1 != 0) goto L20
            r1 = r5
        L20:
            java.util.List<X.0llN> r0 = r1.LJFF
            if (r0 == 0) goto L54
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L54
            boolean r0 = r1.LJJIIZI
            if (r0 != 0) goto L54
            r2 = 1
        L2f:
            java.lang.String r1 = r6.getEnterMethod()
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r0 = r6.LLILLL
            if (r0 != 0) goto L38
            r0 = r5
        L38:
            X.0lkQ r0 = X.C1369210ljb.LIZJ(r0, r1)
            if (r0 != r3) goto L52
            X.0lnR r0 = r6.LLILZ
            if (r0 == 0) goto L43
            r5 = r0
        L43:
            boolean r0 = r5.LJJIJIIJIL
            if (r0 != 0) goto L52
            boolean r0 = r5.LJIJJLI
            if (r0 == 0) goto L52
            r0 = 1
        L4c:
            if (r2 != 0) goto L51
            if (r0 != 0) goto L51
            r4 = 0
        L51:
            return r4
        L52:
            r0 = 0
            goto L4c
        L54:
            r2 = 0
            goto L2f
        L56:
            r0 = r1
            goto L17
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment.oS():boolean");
    }

    public final boolean sS() {
        BaseSharePackage baseSharePackage = this.LLILLL;
        if (baseSharePackage == null) {
            return false;
        }
        return baseSharePackage.extras.getBoolean("share_panel_new_nav_bar", false);
    }

    public final void u3() {
        TuxSheet tuxSheet = this.LLILLJJLI;
        if (tuxSheet != null) {
            tuxSheet.dismissAllowingStateLoss();
        }
        C19EG activity = getActivity();
        if (activity != null) {
            C1371590lnR c1371590lnR = this.LLILZ;
            if (c1371590lnR == null) {
                c1371590lnR = null;
            }
            InterfaceC1366490lfD interfaceC1366490lfD = c1371590lnR.LJJIFFI;
            if (interfaceC1366490lfD != null) {
                BaseSharePackage baseSharePackage = this.LLILLL;
                interfaceC1366490lfD.LJ(activity, baseSharePackage != null ? baseSharePackage : null);
            }
        }
    }

    public final boolean uS() {
        BaseSharePackage baseSharePackage = this.LLILLL;
        if (baseSharePackage == null || this.LLILZ == null) {
            return false;
        }
        if (!baseSharePackage.LJIILL()) {
            return false;
        }
        C1371590lnR c1371590lnR = this.LLILZ;
        C1362230lYL c1362230lYL = (c1371590lnR != null ? c1371590lnR : null).LJJLIIIJILLIZJL;
        return c1362230lYL != null && c1362230lYL.LJIJ;
    }

    public final boolean wS() {
        return ((Boolean) this.LLLLIILLL.getValue()).booleanValue();
    }

    public final boolean zS() {
        C1371590lnR c1371590lnR = this.LLILZ;
        if (!(c1371590lnR == null ? null : c1371590lnR).LJJJJJ) {
            return false;
        }
        if (c1371590lnR == null) {
            c1371590lnR = null;
        }
        return c1371590lnR.LJJJJJL != null;
    }

    public final void GS() {
        TuxIconView tuxIconView;
        if (sS() && (tuxIconView = (TuxIconView) this.LLLL.getValue()) != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(26));
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_x_mark_small;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(c419910GdJ.LIZ(tuxIconView.getContext()), c384050F3z.LIZ(tuxIconView.getContext())));
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            tuxIconView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
            C426750GoL.LJIIIZ(tuxIconView, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, false, 27);
            C427690Gpr.LJ(tuxIconView, C418440Gaw.LIZIZ(200));
        }
    }

    public final void HS() {
        if (sS()) {
            GS();
            TuxIconView tuxIconView = (TuxIconView) this.LLLL.getValue();
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.LLLL.getValue();
        if (tuxIconView2 != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView2.getLayoutParams();
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            tuxIconView2.setIconRes(R.raw.icon_x_mark);
            tuxIconView2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            tuxIconView2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            tuxIconView2.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
            C426750GoL.LJIIIZ(tuxIconView2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, false, 27);
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
        }
    }

    public final void LJJIL() {
        FrameLayout frameLayoutSR;
        View viewFindFocus;
        if (!uS() || !this.LLJJJIL || (frameLayoutSR = SR()) == null || (viewFindFocus = frameLayoutSR.findFocus()) == null) {
            return;
        }
        KeyboardUtils.LIZIZ(viewFindFocus);
        viewFindFocus.clearFocus();
    }

    public final void MR() throws Throwable {
        int iLIZIZ;
        FrameLayout frameLayoutSR = SR();
        ViewGroup.LayoutParams layoutParams = frameLayoutSR != null ? frameLayoutSR.getLayoutParams() : null;
        int iLIZIZ2 = this.LLJJ == 2 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) : 0;
        if (this.LLJJJIL) {
            iLIZIZ2 += this.LLJJJ;
        }
        int[] iArr = new int[2];
        FrameLayout frameLayoutUR = UR();
        if (frameLayoutUR != null) {
            frameLayoutUR.getLocationOnScreen(iArr);
        }
        int height = this.LLJJJJJIL;
        if (height <= 0) {
            int iLIZIZ3 = C1371060lma.LIZIZ(getActivity());
            Resources resources = requireContext().getResources();
            int iN3 = C786410Ut5.n3(resources, "navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = (iLIZIZ3 - (iN3 > 0 ? resources.getDimensionPixelSize(iN3) : 0)) - iArr[1];
            FrameLayout frameLayoutUR2 = UR();
            height = (dimensionPixelSize - (frameLayoutUR2 != null ? frameLayoutUR2.getHeight() : 0)) - iLIZIZ2;
            this.LLJJJJJIL = height;
        }
        if (this.LLJJJIL && height < (iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(188)))) {
            height = iLIZIZ;
        }
        if (layoutParams != null) {
            layoutParams.height = height;
        }
        FrameLayout frameLayoutSR2 = SR();
        if (frameLayoutSR2 != null) {
            C786410Ut5.a6(frameLayoutSR2, layoutParams);
        }
        FrameLayout frameLayoutSR3 = SR();
        if (frameLayoutSR3 != null) {
            frameLayoutSR3.setPadding(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
    }

    public final int NR() {
        int measuredHeight;
        View childAt;
        C1370570lln c1370570llnVR = VR();
        int measuredHeight2 = c1370570llnVR != null ? c1370570llnVR.getMeasuredHeight() : 0;
        if (!this.LLJJIII) {
            return measuredHeight2;
        }
        LinearLayout linearLayoutBS = bS();
        if (linearLayoutBS == null || (childAt = linearLayoutBS.getChildAt(0)) == null) {
            measuredHeight = 0;
        } else {
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            measuredHeight = childAt.getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        }
        int i = measuredHeight2 - measuredHeight;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    public final void QS() {
        View view;
        C1369580lkC c1369580lkC;
        Context context;
        Integer numLIZJ;
        List listLJJII;
        Object next;
        LinearLayout linearLayoutBS = bS();
        if (linearLayoutBS == null || (listLJJII = C09RB.LJJII(new C09RD(linearLayoutBS))) == null) {
            view = null;
        } else {
            Iterator it2 = listLJJII.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (next instanceof C1369580lkC) {
                        break;
                    }
                }
            }
            view = (View) next;
        }
        C1371590lnR c1371590lnR = this.LLILZ;
        if (c1371590lnR == null) {
            c1371590lnR = null;
        }
        if (Intrinsics.LJFF(c1371590lnR.LJJJLIIL, Boolean.TRUE) && view != null && (context = view.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.p4, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            C426750GoL.LJIIL(view, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 23);
            view.setBackgroundColor(iIntValue);
        }
        BaseSharePackage baseSharePackage = this.LLILLL;
        if (baseSharePackage == null) {
            baseSharePackage = null;
        }
        if (baseSharePackage.extras.getBoolean("use_enhance_share_panel_use_square_icon", false) && (view instanceof C1369580lkC) && (c1369580lkC = (C1369580lkC) view) != null) {
            c1369580lkC.setSquareStyle(true);
            c1369580lkC.setLabelViewTopMargin(6);
        }
        if (!uS() || view == null) {
            return;
        }
        C426750GoL.LJIIIZ(view, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), false, 23);
    }

    public final int gS() throws Throwable {
        float f;
        float f2;
        View view;
        int iLIZJ = C1371060lma.LIZJ(getContext());
        C1371590lnR c1371590lnR = this.LLILZ;
        if (c1371590lnR == null) {
            c1371590lnR = null;
        }
        C1370670llx c1370670llx = c1371590lnR.LJJ;
        if (c1370670llx == null || (view = c1370670llx.LIZ) == null || view.getVisibility() != 0 || iLIZJ >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(OppoPermissionPopupMaskDelayExp.DEFAULT)))) {
            f = iLIZJ;
            f2 = 0.7f;
        } else {
            f = iLIZJ;
            f2 = 0.85f;
        }
        return (int) (f * f2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1371050lmZ viewTreeObserverOnGlobalLayoutListenerC1371050lmZ = this.LLJLIL;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1371050lmZ);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1371050lmZ, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        if (uS()) {
            FrameLayout frameLayoutSR = SR();
            if (frameLayoutSR != null) {
                frameLayoutSR.removeOnLayoutChangeListener(this.LLLLIIL);
            }
            SharePanelNewBehavior sharePanelNewBehavior = this.LLJILJILJ;
            if (sharePanelNewBehavior != null) {
                ValueAnimator valueAnimator = sharePanelNewBehavior.LJIILJJIL;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                sharePanelNewBehavior.LJIILJJIL = null;
                VelocityTracker velocityTracker = sharePanelNewBehavior.LJIIL;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                sharePanelNewBehavior.LJIIL = null;
                ((ArrayList) sharePanelNewBehavior.LIZLLL).clear();
                sharePanelNewBehavior.LJ = null;
                sharePanelNewBehavior.LJIJ = null;
            }
            TuxSharePanelNewBehavior tuxSharePanelNewBehavior = this.LLJILLL;
            if (tuxSharePanelNewBehavior != null) {
                ValueAnimator valueAnimator2 = tuxSharePanelNewBehavior.LJJJJZ;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                tuxSharePanelNewBehavior.LJJJJZ = null;
                VelocityTracker velocityTracker2 = tuxSharePanelNewBehavior.LJJJJLI;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                }
                tuxSharePanelNewBehavior.LJJJJLI = null;
                ((ArrayList) tuxSharePanelNewBehavior.LJJJ).clear();
                tuxSharePanelNewBehavior.LJJJI = null;
                tuxSharePanelNewBehavior.LJJJLZIJ = null;
            }
        }
        InterfaceC1371680lna interfaceC1371680lna = C1370370llT.LIZJ;
        if (interfaceC1371680lna != null) {
            interfaceC1371680lna.i("SkeletonShareFragment", "onDestroy");
        }
        super.onDestroy();
        this.LLILLJJLI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        InterfaceC1371680lna interfaceC1371680lna = C1370370llT.LIZJ;
        if (interfaceC1371680lna != null) {
            interfaceC1371680lna.i("SkeletonShareFragment", "onPause");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC1371680lna interfaceC1371680lna = C1370370llT.LIZJ;
        if (interfaceC1371680lna != null) {
            interfaceC1371680lna.i("SkeletonShareFragment", "onResume");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC1371680lna interfaceC1371680lna = C1370370llT.LIZJ;
        if (interfaceC1371680lna != null) {
            interfaceC1371680lna.i("SkeletonShareFragment", "onStart");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        InterfaceC1371680lna interfaceC1371680lna = C1370370llT.LIZJ;
        if (interfaceC1371680lna != null) {
            interfaceC1371680lna.i("SkeletonShareFragment", "onStop");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qS() {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment.qS():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0a24  */
    /* JADX WARN: Type inference failed for: r2v185 */
    /* JADX WARN: Type inference failed for: r2v59, types: [com.ss.android.ugc.aweme.share.base.model.BaseSharePackage] */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r6v62, types: [X.09AY, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.view.View[], java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rS() {
        /*
            Method dump skipped, instruction units count: 2599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment.rS():void");
    }

    @Override // X.InterfaceC1362720lZ8
    public final void Ds(Function0<Unit> function0) {
        View viewFindViewById;
        View view;
        View view2 = getView();
        if (view2 != null && (viewFindViewById = view2.findViewById(R.id.tos)) != null && ((Boolean) this.LLLLIL.getValue()).booleanValue()) {
            viewFindViewById.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
            TuxIconView tuxIconView = (TuxIconView) this.LLLJ.getValue();
            if (tuxIconView != null) {
                ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                tuxIconView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
                C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, null, false, 30);
                C786410Ut5.I7(new AbS701S0100000_21(function0, 9, 42), tuxIconView);
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            View view3 = (View) this.LLLLII.getValue();
            if (view3 != null && view3.getVisibility() == 0 && (view = (View) this.LLLLII.getValue()) != null) {
                C426750GoL.LJIIIZ(view, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, null, false, 30);
            }
            TuxTextView tuxTextViewNS = nS();
            if (tuxTextViewNS != null) {
                tuxTextViewNS.getLayoutParams().height = -2;
                tuxTextViewNS.setTuxFont(33);
                tuxTextViewNS.setTextColorRes(R.attr.a1h);
                C786410Ut5.LLLLZLL(tuxTextViewNS, 0);
            }
            HS();
        }
    }

    public final void ES(boolean z) {
        Dialog dialog;
        Window window;
        View decorView;
        View viewFindViewById;
        int i;
        Dialog dialog2;
        Window window2;
        int i2;
        if (!uS()) {
            return;
        }
        BaseSharePackage baseSharePackage = this.LLILLL;
        if (baseSharePackage == null) {
            baseSharePackage = null;
        }
        baseSharePackage.extras.putBoolean("drag_to_expand_handle_visible", z);
        TuxSheet tuxSheet = this.LLILLJJLI;
        if (tuxSheet != null && (dialog2 = tuxSheet.getDialog()) != null && (window2 = dialog2.getWindow()) != null) {
            if (z) {
                i2 = 48;
            } else {
                i2 = 16;
            }
            window2.setSoftInputMode(i2);
        }
        TuxSheet tuxSheet2 = this.LLILLJJLI;
        if (tuxSheet2 != null && (dialog = tuxSheet2.getDialog()) != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(R.id.v4f)) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
        if (C299110Bnx.LIZ()) {
            TuxSharePanelNewBehavior tuxSharePanelNewBehavior = this.LLJILLL;
            if (tuxSharePanelNewBehavior != null) {
                tuxSharePanelNewBehavior.LJJLIIIIJ = z;
                return;
            }
            return;
        }
        SharePanelNewBehavior sharePanelNewBehavior = this.LLJILJILJ;
        if (sharePanelNewBehavior == null) {
            return;
        }
        sharePanelNewBehavior.LJIL = z;
    }

    @Override // X.InterfaceC1362720lZ8
    public final void F8(AbstractC343940De4 abstractC343940De4) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, abstractC343940De4);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FS(int r15) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment.FS(int):void");
    }

    public final void JS(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        LinearLayout linearLayoutZR;
        LinearLayout linearLayoutZR2 = ZR();
        ViewGroup.LayoutParams layoutParams = null;
        if (linearLayoutZR2 != null) {
            layoutParams = linearLayoutZR2.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.bottomMargin != i && (linearLayoutZR = ZR()) != null) {
            marginLayoutParams.bottomMargin = i;
            C786410Ut5.d6(linearLayoutZR, marginLayoutParams);
        }
    }

    public final void LJLILLLLZI(String str) {
        TextView textView;
        TextView textView2;
        if (str != null) {
            TuxTextView tuxTextViewNS = nS();
            if (tuxTextViewNS != null) {
                tuxTextViewNS.setText(str);
            }
            TuxNavBar tuxNavBarMS = mS();
            if (tuxNavBarMS != null && (textView2 = (TextView) tuxNavBarMS.findViewById(R.id.p1i)) != null) {
                textView2.setText(str);
                return;
            }
            return;
        }
        String strKS = kS();
        TuxTextView tuxTextViewNS2 = nS();
        if (tuxTextViewNS2 != null) {
            tuxTextViewNS2.setText(strKS);
        }
        TuxNavBar tuxNavBarMS2 = mS();
        if (tuxNavBarMS2 == null || (textView = (TextView) tuxNavBarMS2.findViewById(R.id.p1i)) == null) {
            return;
        }
        textView.setText(strKS);
    }

    public final void NS(final InterfaceC1370690llz interfaceC1370690llz) {
        Dialog dialog;
        Window window;
        View decorView;
        if (!uS()) {
            return;
        }
        this.LLJZIJLIL = interfaceC1370690llz;
        BaseSharePackage baseSharePackage = this.LLILLL;
        if (baseSharePackage == null) {
            baseSharePackage = null;
        }
        if (baseSharePackage.LJIILIIL()) {
            if (C299110Bnx.LIZ()) {
                TuxSharePanelNewBehavior tuxSharePanelNewBehavior = this.LLJILLL;
                if (tuxSharePanelNewBehavior != null) {
                    ((ArrayList) tuxSharePanelNewBehavior.LJJJ).add(new InterfaceC1370660llw() { // from class: X.0llt
                        @Override // X.InterfaceC1370660llw
                        public final void LIZ(float f, int i) {
                            interfaceC1370690llz.Pe(i);
                        }
                    });
                }
            } else {
                SharePanelNewBehavior sharePanelNewBehavior = this.LLJILJILJ;
                if (sharePanelNewBehavior != null) {
                    ((ArrayList) sharePanelNewBehavior.LIZLLL).add(new InterfaceC1370650llv() { // from class: X.0llu
                        @Override // X.InterfaceC1370650llv
                        public final void LIZ(float f, int i) {
                            interfaceC1370690llz.Pe(i);
                        }
                    });
                }
            }
        }
        if (uS() && SR() != null) {
            if (this.LLLLIIL == null) {
                this.LLLLIIL = new ViewOnLayoutChangeListenerC1370500llg(this, interfaceC1370690llz);
            }
            FrameLayout frameLayoutSR = SR();
            if (frameLayoutSR != null) {
                frameLayoutSR.addOnLayoutChangeListener(this.LLLLIIL);
            }
        }
        TuxSheet tuxSheet = this.LLILLJJLI;
        if (tuxSheet != null && (dialog = tuxSheet.getDialog()) != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            C14K9.LJIJJ(decorView, new C0TVI() { // from class: X.0llf
                public int LL;

                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    FrameLayout frameLayoutSR2;
                    View rootView;
                    C21578619ce c21578619ce;
                    SharePanelNewBehavior sharePanelNewBehavior2;
                    boolean zLJIIIIZZ = c20246014Ju.LJIIIIZZ(8);
                    this.LLILLJJLI.LLJJJIL = zLJIIIIZZ;
                    int i = c20246014Ju.LIZ(8).LIZLLL;
                    BaseSharePackage baseSharePackage2 = this.LLILLJJLI.LLILLL;
                    if (baseSharePackage2 == null) {
                        baseSharePackage2 = null;
                    }
                    if (baseSharePackage2.LJIILIIL()) {
                        if (zLJIIIIZZ) {
                            if (C299110Bnx.LIZ()) {
                                TuxSharePanelNewBehavior tuxSharePanelNewBehavior2 = this.LLILLJJLI.LLJILLL;
                                if (tuxSharePanelNewBehavior2 != null && tuxSharePanelNewBehavior2.LJJJJJL == 4 && tuxSharePanelNewBehavior2.LJJJJJL != 3) {
                                    tuxSharePanelNewBehavior2.LJIIIIZZ(tuxSharePanelNewBehavior2.LJJJJL, 3);
                                }
                            } else {
                                SharePanelNewBehavior sharePanelNewBehavior3 = this.LLILLJJLI.LLJILJILJ;
                                if (sharePanelNewBehavior3 != null && sharePanelNewBehavior3.LIZIZ() && (sharePanelNewBehavior2 = this.LLILLJJLI.LLJILJILJ) != null && sharePanelNewBehavior2.LJIIJ != 3) {
                                    sharePanelNewBehavior2.LIZLLL(sharePanelNewBehavior2.LJIIJJI, 3);
                                }
                            }
                        } else {
                            SkeletonSharePanelFragment skeletonSharePanelFragment = this.LLILLJJLI;
                            if (!skeletonSharePanelFragment.LLLLJI && (frameLayoutSR2 = skeletonSharePanelFragment.SR()) != null) {
                                C786410Ut5.fd(frameLayoutSR2, 0.0f);
                            }
                        }
                        View view2 = this.LLILLJJLI.LLJLLIL;
                        if (view2 != null && (rootView = view2.getRootView()) != null && (c21578619ce = (C21578619ce) rootView.findViewById(R.id.v4b)) != null) {
                            c21578619ce.setNestedScrollingEnabled(true ^ zLJIIIIZZ);
                        }
                        return c20246014Ju;
                    }
                    if (zLJIIIIZZ) {
                        int iLIZJ = (int) (((double) C1371060lma.LIZJ(this.LLILLJJLI.getContext())) * 0.85d);
                        LinearLayout linearLayoutCS = this.LLILLJJLI.cS();
                        if (linearLayoutCS != null) {
                            int measuredHeight = iLIZJ - (linearLayoutCS.getMeasuredHeight() + i);
                            this.LL = measuredHeight;
                            if (measuredHeight < 0) {
                                interfaceC1370690llz.k3(measuredHeight);
                            }
                        }
                        return c20246014Ju;
                    }
                    int i2 = this.LL;
                    if (i2 < 0) {
                        interfaceC1370690llz.k3(-i2);
                        this.LL = 0;
                    }
                    return c20246014Ju;
                }
            });
            q0.LJJII(decorView, new C14JJ() { // from class: X.0llj
                {
                    super(1);
                }

                @Override // X.C14JJ
                public final void LIZ(C14JM c14jm) {
                    this.LLILLL.LLLLJI = false;
                }

                @Override // X.C14JJ
                public final void LIZIZ(C14JM c14jm) {
                    boolean z;
                    SkeletonSharePanelFragment skeletonSharePanelFragment = this.LLILLL;
                    if ((c14jm.LIZ() & 8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    skeletonSharePanelFragment.LLLLJI = z;
                }

                @Override // X.C14JJ
                public final C20246014Ju LIZJ(C20246014Ju c20246014Ju, List<C14JM> list) {
                    BaseSharePackage baseSharePackage2 = this.LLILLL.LLILLL;
                    if (baseSharePackage2 == null) {
                        baseSharePackage2 = null;
                    }
                    if (!baseSharePackage2.LJIILIIL() || !this.LLILLL.LLLLJI) {
                        return c20246014Ju;
                    }
                    int i = c20246014Ju.LIZ(8).LIZLLL - c20246014Ju.LIZ(2).LIZLLL;
                    if (i < 0) {
                        i = 0;
                    }
                    FrameLayout frameLayoutSR2 = this.LLILLL.SR();
                    if (frameLayoutSR2 != null) {
                        C786410Ut5.fd(frameLayoutSR2, -i);
                    }
                    return c20246014Ju;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OR(boolean r12) {
        /*
            r11 = this;
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r11.LLILLJJLI
            if (r0 == 0) goto L75
            android.app.Dialog r4 = r0.getDialog()
            if (r4 == 0) goto L75
            boolean r5 = r11.LLILZLL
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r10 = r11.LLILLL
            if (r10 != 0) goto L11
            r10 = 0
        L11:
            android.content.Context r1 = r4.getContext()
            android.view.Window r3 = r4.getWindow()
            X.0lm4 r0 = X.C1370730lm3.LIZ(r1)
            r6 = 0
            if (r0 == 0) goto L90
            int r8 = r0.LIZJ
        L22:
            int r0 = X.C497820Jfg.LIZJ(r1)
            int r8 = r8 - r0
            if (r3 == 0) goto L75
            r7 = -1
            r2 = 1
            if (r12 == 0) goto L8b
            java.lang.String r9 = "enter_method"
            if (r10 == 0) goto L89
            android.os.Bundle r0 = r10.extras
            if (r0 == 0) goto L76
            java.lang.String r1 = r0.getString(r9)
            if (r1 == 0) goto L76
            java.lang.String r0 = "icon"
            boolean r0 = r1.equals(r0)
            if (r0 != r2) goto L76
        L43:
            X.C1065860dqK.LIZ(r3, r7)
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L4f
            X.C1370030lkv.LIZ(r0)
        L4f:
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L58
            r0.setStatusBarColor(r6)
        L58:
            android.view.Window r1 = r4.getWindow()
            if (r1 == 0) goto L63
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r0)
        L63:
            X.0llk r0 = X.C1370370llT.LJII
            if (r0 == 0) goto L72
            boolean r0 = r0.LIZ(r5)
            if (r0 != r2) goto L72
            r0 = 80
            r3.setGravity(r0)
        L72:
            r4.setCanceledOnTouchOutside(r2)
        L75:
            return
        L76:
            android.os.Bundle r0 = r10.extras
            if (r0 == 0) goto L89
            java.lang.String r1 = r0.getString(r9)
            if (r1 == 0) goto L89
            java.lang.String r0 = "share_panel"
            boolean r0 = r1.equals(r0)
            if (r0 != r2) goto L89
            goto L43
        L89:
            if (r8 != 0) goto L8c
        L8b:
            r8 = -1
        L8c:
            X.C1065860dqK.LIZ(r3, r8)
            goto L63
        L90:
            r8 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment.OR(boolean):void");
    }

    public final void PS(int i) {
        RelativeLayout relativeLayout;
        TuxIconView tuxIconView;
        View view = getView();
        if (view == null) {
            return;
        }
        BaseSharePackage baseSharePackage = this.LLILLL;
        C1371590lnR c1371590lnR = null;
        if (baseSharePackage == null) {
            baseSharePackage = null;
        }
        C1371590lnR c1371590lnR2 = this.LLILZ;
        if (c1371590lnR2 != null) {
            c1371590lnR = c1371590lnR2;
        }
        C1370870lmH c1370870lmH = c1371590lnR.LJJLIIIJLJLI;
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 794);
        View viewFindViewById = view.findViewById(R.id.y_b);
        if (viewFindViewById != null) {
            Iterator<Object> it2 = C19724012Fa.LIZJ(viewFindViewById).iterator();
            while (true) {
                C2152008bu c2152008bu = (C2152008bu) it2;
                if (!c2152008bu.hasNext()) {
                    break;
                } else {
                    C786410Ut5.LJLLLLLL(i, (View) c2152008bu.next());
                }
            }
            if (c1370870lmH != null && baseSharePackage.extras.getBoolean("hit_group_hatching_exp") && (relativeLayout = (RelativeLayout) view.findViewById(R.id.tot)) != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.lqb)) != null) {
                if (i == 8) {
                    C786410Ut5.LLIIL(relativeLayout, 0);
                    C786410Ut5.a9(tuxIconView, new ACListenerS155S0100000_21(awS565S0100000_21, 92));
                } else {
                    C786410Ut5.LLIIL(relativeLayout, 8);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer dS(android.content.Context r4) {
        /*
            r3 = this;
            X.0llk r1 = X.C1370370llT.LJII
            r2 = 1
            if (r1 == 0) goto L15
            boolean r0 = r3.LLILZLL
            boolean r0 = r1.LIZ(r0)
            if (r0 != r2) goto L15
        Ld:
            r0 = 2131100278(0x7f060276, float:1.7812933E38)
        L10:
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r4)
            return r0
        L15:
            X.0llk r1 = X.C1370370llT.LJII
            if (r1 == 0) goto L22
            int r0 = r3.LLIZ
            boolean r0 = r1.LJIIIZ(r0)
            if (r0 != r2) goto L22
            goto Ld
        L22:
            java.lang.String r1 = r3.getEnterMethod()
            java.lang.String r0 = "long_press"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L3b
            X.0lnR r0 = r3.LLILZ
            if (r0 != 0) goto L33
            r0 = 0
        L33:
            boolean r0 = r0.LJJIJIL
            if (r0 != 0) goto L3b
            r0 = 2131100616(0x7f0603c8, float:1.7813618E38)
            goto L10
        L3b:
            r0 = 2131100619(0x7f0603cb, float:1.7813625E38)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment.dS(android.content.Context):java.lang.Integer");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJII(true);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog;
        super.onConfigurationChanged(configuration);
        OR(this.LLILZIL);
        LinearLayout linearLayoutCS = cS();
        if (linearLayoutCS != null) {
            HandlerHook.viewPost(linearLayoutCS, new ARunnableS90S0200000_21(configuration, this, 27));
        }
        TuxSheet tuxSheet = this.LLILLJJLI;
        if (tuxSheet != null && (dialog = tuxSheet.getDialog()) != null) {
            InterfaceC1370040lkw interfaceC1370040lkw = this.LLIZLLLIL;
            if (interfaceC1370040lkw == null) {
                interfaceC1370040lkw = null;
            }
            interfaceC1370040lkw.LJFF(dialog);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        try {
            C1371590lnR c1371590lnR = this.LLILZ;
            Unit unit = null;
            if (c1371590lnR != null) {
                str = c1371590lnR.LJJLIL;
            } else {
                str = null;
            }
            InterfaceC1369830lkb interfaceC1369830lkb = C1370370llT.LJIIJ;
            if (interfaceC1369830lkb != null && interfaceC1369830lkb.LIZ() != null) {
                C1369940lkm.LIZ(this, str);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1362720lZ8
    public final void s1(int i) {
        int peekHeight;
        if (C299110Bnx.LIZ()) {
            peekHeight = this.LLJILJIL.getPeekHeight();
        } else {
            peekHeight = this.LLJIJIL.getPeekHeight();
        }
        int i2 = this.LLJJ;
        if (i2 == 2) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJIILL(peekHeight + i, this);
        } else {
            if (i2 != 1) {
                return;
            }
            String str2 = TuxSheet._pnsPageId;
            C1391190mJ3.LJIILLIIL(peekHeight + i, this);
        }
    }

    public final boolean yS(MotionEvent motionEvent) {
        int rawY;
        FrameLayout frameLayoutSR = SR();
        if (frameLayoutSR != null) {
            int[] iArr = new int[2];
            frameLayoutSR.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int width = frameLayoutSR.getWidth() + i;
            int height = frameLayoutSR.getHeight() + i2;
            int rawX = (int) motionEvent.getRawX();
            if (i <= rawX && rawX <= width && i2 <= (rawY = (int) motionEvent.getRawY()) && rawY <= height) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        C1371590lnR c1371590lnR = this.LLILZ;
        if (c1371590lnR == null) {
            c1371590lnR = null;
        }
        InterfaceC1058150ddt interfaceC1058150ddt = c1371590lnR.LJJLJLI;
        if (interfaceC1058150ddt != null) {
            interfaceC1058150ddt.LLLFFI(tuxSheet, f);
            return;
        }
        if (!this.LLJJIJI && f < -0.02d) {
            this.LLJJIJI = true;
            if (C299110Bnx.LIZ()) {
                this.LLJILJIL.LJIJ = true;
            } else {
                this.LLJIJIL.setSkipCollapsed(true);
            }
        }
        if (this.LLJJIJIIJIL < f) {
            this.LLJJIJI = false;
            if (C299110Bnx.LIZ()) {
                this.LLJILJIL.LJIJ = false;
            } else {
                this.LLJIJIL.setSkipCollapsed(false);
            }
        }
        this.LLJJIJIIJIL = f;
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) throws Throwable {
        C1371590lnR c1371590lnR = this.LLILZ;
        if (c1371590lnR == null) {
            c1371590lnR = null;
        }
        InterfaceC1058150ddt interfaceC1058150ddt = c1371590lnR.LJJLJLI;
        if (interfaceC1058150ddt != null) {
            interfaceC1058150ddt.LLLLIIIILLL(tuxSheet, i);
        } else if (i == 4 && this.LLJ) {
            MR();
            this.LLJ = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZLLL;
        Dialog dialog;
        boolean z;
        int i;
        this.LLJJL = C1369530lk7.LIZ(getContext());
        TuxSheet tuxSheet = this.LLILLJJLI;
        C19GS c19gs = null;
        if (tuxSheet != null && (dialog = tuxSheet.getDialog()) != null) {
            InterfaceC1370040lkw interfaceC1370040lkw = this.LLIZLLLIL;
            if (interfaceC1370040lkw == null) {
                interfaceC1370040lkw = null;
            }
            InterfaceC1370540llk interfaceC1370540llk = C1370370llT.LJII;
            if (interfaceC1370540llk != null && interfaceC1370540llk.LIZ(this.LLILZLL)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.LLL = true;
                i = R.layout.d8u;
            } else if (this.LLILZIL && wS()) {
                i = R.layout.d8t;
            } else {
                i = R.layout.d8r;
            }
            viewLIZLLL = interfaceC1370040lkw.LIZLLL(dialog, i, getView(), null, this.LLJJL);
        } else {
            viewLIZLLL = null;
        }
        this.LLJLLIL = viewLIZLLL;
        if (viewLIZLLL != null) {
            viewLIZLLL.setTag("SKELETON_SHARE_FRAGMENT_ROOT_VIEW");
        }
        View view = this.LLJLLIL;
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                view.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view;
    }
}
