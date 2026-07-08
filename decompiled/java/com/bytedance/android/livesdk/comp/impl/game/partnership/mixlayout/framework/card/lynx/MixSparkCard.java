package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.lynx;

import X.AbstractC1542200qEc;
import X.AbstractC1882890z67;
import X.C01GW;
import X.C098200Yq;
import X.C0KYM;
import X.C1087600ePO;
import X.C1091270eVJ;
import X.C1155600gB4;
import X.C13E8;
import X.C1880870z2r;
import X.C1881240z3S;
import X.C1881800z4M;
import X.C1882380z5I;
import X.C1882610z5f;
import X.C1882840z62;
import X.C1882870z65;
import X.C1883100z6S;
import X.C1883130z6V;
import X.C1883770z7X;
import X.C1883800z7a;
import X.C1883830z7d;
import X.C1883840z7e;
import X.C1883850z7f;
import X.C1883870z7h;
import X.C1883880z7i;
import X.C1883910z7l;
import X.C1883920z7m;
import X.C1883960z7q;
import X.C189200o6;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C476770Imp;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1059280dfi;
import X.InterfaceC1541990qEH;
import X.InterfaceC1881340z3c;
import X.InterfaceC1883040z6M;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.Property;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.lynx.MixSparkCard;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class MixSparkCard extends AbstractC1882890z67<String> {
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C1883830z7d LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public C1883920z7m LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public C1883960z7q LLJL;
    public boolean LLJLIL;
    public final C1883770z7X LLJLILLLLZIIL;
    public final int LLJLL;

    @Override // X.AbstractC1882890z67, X.InterfaceC1883030z6L
    public final String LJIL() {
        return (String) this.LLJJIJIL.getValue();
    }

    public final C13E8<C1087600ePO> LJJJJZ() {
        return (C13E8) this.LLJJJJJIL.getValue();
    }

    public final void LJJJLIIL() throws JSONException {
        SparkContext sparkContext;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        C1883920z7m c1883920z7m = this.LLJJL;
        if (c1883920z7m != null) {
            String strLJJJJZI = LJJJJZI();
            if (c1883920z7m.LIZ) {
                InterfaceC1541990qEH interfaceC1541990qEH = c1883920z7m.LIZJ;
                if (interfaceC1541990qEH != null) {
                    interfaceC1541990qEH.d1(strLJJJJZI);
                    return;
                }
                return;
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1883920z7m.LIZIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) == null || (interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ()) == null) {
                return;
            }
            interfaceC1541990qEHLJIJJ.d1(strLJJJJZI);
        }
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIIZI() {
        C1883920z7m c1883920z7m;
        String strLIZIZ;
        super.LJJIIZI();
        LJJJIL("on_tab_sticky_enter");
        LJJJIL("on_tab_sticky_exit");
        C1883920z7m c1883920z7m2 = this.LLJJL;
        if (c1883920z7m2 != null && (strLIZIZ = c1883920z7m2.LIZIZ()) != null && strLIZIZ.length() != 0) {
            ((ConcurrentHashMap) C1882840z62.LIZIZ.getValue()).put(strLIZIZ, new WeakReference(this));
        }
        if (this.LLJILJILJ == 2 || (c1883920z7m = this.LLJJL) == null) {
            return;
        }
        if (c1883920z7m.LIZ) {
            InterfaceC1541990qEH interfaceC1541990qEH = c1883920z7m.LIZJ;
            if (interfaceC1541990qEH != null) {
                interfaceC1541990qEH.load();
                return;
            }
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1883920z7m.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
        }
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJ() {
        String strLIZIZ;
        String strLIZIZ2;
        super.LJJIJ();
        C1883920z7m c1883920z7m = this.LLJJL;
        if (c1883920z7m != null) {
            c1883920z7m.LIZ();
        }
        C1883920z7m c1883920z7m2 = this.LLJJL;
        if (c1883920z7m2 != null && (strLIZIZ2 = c1883920z7m2.LIZIZ()) != null) {
            C1882840z62.LIZIZ(strLIZIZ2);
        }
        this.LLJJL = null;
        for (C1087600ePO c1087600ePO : LJJJJZ()) {
            C1883920z7m sparkView = c1087600ePO.getSparkView();
            if (sparkView != null) {
                sparkView.LIZ();
            }
            C1883920z7m sparkView2 = c1087600ePO.getSparkView();
            if (sparkView2 != null && (strLIZIZ = sparkView2.LIZIZ()) != null) {
                C1882840z62.LIZIZ(strLIZIZ);
            }
        }
        LJJJJZ().clear();
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJIIJI() {
        String strLIZIZ;
        String strLIZIZ2;
        super.LJJIJIIJI();
        LJJJJJ("on_tab_sticky_enter");
        LJJJJJ("on_tab_sticky_exit");
        C1883920z7m c1883920z7m = this.LLJJL;
        if (c1883920z7m != null && (strLIZIZ2 = c1883920z7m.LIZIZ()) != null) {
            C1882840z62.LIZIZ(strLIZIZ2);
        }
        for (C1087600ePO c1087600ePO : LJJJJZ()) {
            C1883920z7m sparkView = c1087600ePO.getSparkView();
            if (sparkView != null) {
                sparkView.LIZ();
            }
            C1883920z7m sparkView2 = c1087600ePO.getSparkView();
            if (sparkView2 != null && (strLIZIZ = sparkView2.LIZIZ()) != null) {
                C1882840z62.LIZIZ(strLIZIZ);
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.LLJJJJLIIL.getValue();
        if (viewGroup.getChildCount() > 1) {
            int childCount = viewGroup.getChildCount() - 1;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, null);
            viewGroup.removeViews(1, childCount);
        }
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJLIJ() throws JSONException {
        super.LJJIJLIJ();
        if (this.LLJJLIIIJLLLLLLLZ) {
            LJJJLIIL();
        } else {
            this.LLJL = new C1883960z7q(this);
        }
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIL() {
        View viewLIZJ;
        super.LJJIL();
        C1883920z7m c1883920z7m = this.LLJJL;
        if (c1883920z7m == null || (viewLIZJ = c1883920z7m.LIZJ()) == null) {
            return;
        }
        C476770Imp.LIZIZ(viewLIZJ, new Runnable() { // from class: X.0z7c
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MixSparkCard@26b9.onRetry$1");
                try {
                    C1883920z7m c1883920z7m2 = this.LL.LLJJL;
                    if (c1883920z7m2 != null) {
                        if (c1883920z7m2.LIZ) {
                            InterfaceC1541990qEH interfaceC1541990qEH = c1883920z7m2.LIZJ;
                            if (interfaceC1541990qEH != null) {
                                interfaceC1541990qEH.reload();
                            }
                        } else {
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1883920z7m2.LIZIZ;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.refresh();
                            }
                        }
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MixSparkCard@26b9.onRetry$1");
            }
        }, 500L);
    }

    public final void LJJJJLI() {
        String strLIZIZ;
        if (LJJJJZ().isEmpty()) {
            C20441214yg.LJ("MixSparkCard", "closeSecondSparkView error, stack is empty");
            return;
        }
        C1087600ePO c1087600ePOLJIIZILJ = LJJJJZ().LJIIZILJ();
        if (c1087600ePOLJIIZILJ != null) {
            C1883920z7m sparkView = c1087600ePOLJIIZILJ.getSparkView();
            if (sparkView != null) {
                sparkView.LIZ();
            }
            C1883920z7m sparkView2 = c1087600ePOLJIIZILJ.getSparkView();
            if (sparkView2 != null && (strLIZIZ = sparkView2.LIZIZ()) != null) {
                C1882840z62.LIZIZ(strLIZIZ);
            }
        }
        final C1091270eVJ c1091270eVJ = (C1091270eVJ) this.LLJJJJLIIL.getValue();
        if (c1091270eVJ.getChildCount() != 0) {
            final View childAt = c1091270eVJ.getChildAt(c1091270eVJ.getChildCount() - 1);
            final ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, 0.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(250L);
            objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0UvQ
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C1091270eVJ c1091270eVJ2 = c1091270eVJ;
                    View view = childAt;
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1091270eVJ2, view);
                    c1091270eVJ2.removeView(view);
                }
            });
            objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0UvP
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    C1091270eVJ c1091270eVJ2 = c1091270eVJ;
                    View view = childAt;
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1091270eVJ2, view);
                    c1091270eVJ2.removeView(view);
                }
            });
            if (c1091270eVJ.getWidth() <= 0) {
                HandlerHook.viewPost(c1091270eVJ, new Runnable() { // from class: X.0UvN
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SparkContainerView@3552.popView$1");
                        try {
                            objectAnimatorOfFloat.setFloatValues(0.0f, getWidth());
                            C786410Ut5.Pd(objectAnimatorOfFloat);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SparkContainerView@3552.popView$1");
                    }
                });
            } else {
                objectAnimatorOfFloat.setFloatValues(0.0f, c1091270eVJ.getWidth());
                C786410Ut5.Pd(objectAnimatorOfFloat);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String LJJJJZI() throws JSONException {
        Object c098200Yq;
        Object c098200Yq2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"initial_data\":");
        try {
            String str = (String) this.LLILZIL;
            if (str == null) {
                str = "{}";
            }
            c098200Yq = new JSONObject(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("MixSparkCard", "getInitialData error", thM5exceptionOrNullimpl);
            c098200Yq = new JSONObject();
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        for (Map.Entry<String, Object> entry : C1882380z5I.LIZ(C1882380z5I.LIZJ(this.LLILLL)).entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        jSONObject.put("gamecp_mix_page_token", this.LLILLL.LIZLLL());
        Size sizeLIZIZ = C1883130z6V.LIZIZ(this);
        float fLJJI = 0.0f;
        jSONObject.put("container_width", Float.valueOf(sizeLIZIZ == null ? 0.0f : C497740JfY.LJJI(sizeLIZIZ.getWidth())));
        Size sizeLIZIZ2 = C1883130z6V.LIZIZ(this);
        if (sizeLIZIZ2 != null) {
            fLJJI = C497740JfY.LJJI(sizeLIZIZ2.getHeight());
            if (LJJII() > 0) {
                fLJJI -= LJJII();
            }
        }
        jSONObject.put("container_height", Float.valueOf(fLJJI));
        jSONObject.put("located_tab_class", C1883130z6V.LIZ(this));
        C1881800z4M c1881800z4MLJIIIZ = this.LLILLL.LJIIJJI().LJIIIZ();
        jSONObject.put("is_default_tab", Intrinsics.LJFF(c1881800z4MLJIIIZ != null ? c1881800z4MLJIIIZ.LIZIZ : null, C1883130z6V.LIZ(this)) ? "1" : CardStruct.IStatusCode.DEFAULT);
        jSONObject.put("is_single_column", Intrinsics.LJFF(this.LLILLL.LJIIJJI().LLILZLL, Boolean.TRUE) ? CardStruct.IStatusCode.DEFAULT : "1");
        try {
            c098200Yq2 = new JSONObject(C476770Imp.LJ(C1882380z5I.LIZ(C1882380z5I.LIZLLL(this.LLILLL))));
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
            c098200Yq2 = new JSONObject();
        }
        jSONObject.put("common_tracking_params", c098200Yq2);
        JSONObject jSONObjectLIZ = this.LLILLJJLI.LLILLL.LIZ();
        if (jSONObjectLIZ != null) {
            jSONObject.put("target_tab_class", jSONObjectLIZ.optString("target_tab_class"));
            jSONObject.put("extra_card_config", C786410Ut5.J3(jSONObjectLIZ));
        }
        sbLIZ.append(C786410Ut5.J3(jSONObject));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        View viewLIZJ;
        if (this.LLJJL == null) {
            ((C0KYM) this.LLJJIJIIJIL.getValue()).LJII("is_powered_by_mix_lynx_card", "1");
            long jUptimeMillis = SystemClock.uptimeMillis();
            String string = ((C0KYM) this.LLJJIJIIJIL.getValue()).LIZ().toString();
            this.LLJJL = C1883910z7l.LIZ(this.LL, this, string, this.LLILLL.getLifecycleOwner(), false, new C1883840z7e(this));
            String str = (String) this.LLJJIJIL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create spark with schema: ");
            sbLIZ.append(string);
            C1882870z65.LIZ(this, str, C2188811AlT.LIZIZ(sbLIZ));
            this.LLJILJIL.put("spark_create_cost", Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
        }
        ViewGroup viewGroup2 = (ViewGroup) this.LLJJJJLIIL.getValue();
        C1883920z7m c1883920z7m = this.LLJJL;
        if (c1883920z7m != null && (viewLIZJ = c1883920z7m.LIZJ()) != null) {
            viewGroup2.addView(viewLIZJ);
        }
        return viewGroup2;
    }

    @Override // X.AbstractC1882890z67, X.InterfaceC1882930z6B
    public final void LJIJ(int i) {
        super.LJIJ(i);
        C1883920z7m c1883920z7m = this.LLJJL;
        if (c1883920z7m != null) {
            c1883920z7m.LIZLLL("viewDisappeared", null);
        }
        Iterator<C1087600ePO> it2 = LJJJJZ().iterator();
        while (it2.hasNext()) {
            C1883920z7m sparkView = it2.next().getSparkView();
            if (sparkView != null) {
                sparkView.LIZLLL("viewAppeared", null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1882890z67
    public final void LJJIFFI(String str) {
        this.LLILZIL = str;
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIZ(int i) {
        C1883100z6S c1883100z6S;
        String str;
        super.LJJIZ(i);
        C1883920z7m c1883920z7m = this.LLJJL;
        if (c1883920z7m != null) {
            c1883920z7m.LIZLLL("viewAppeared", null);
        }
        Iterator<C1087600ePO> it2 = LJJJJZ().iterator();
        while (it2.hasNext()) {
            C1883920z7m sparkView = it2.next().getSparkView();
            if (sparkView != null) {
                sparkView.LIZLLL("viewAppeared", null);
            }
        }
        InterfaceC1883040z6M interfaceC1883040z6M = this.LLIZ;
        if ((interfaceC1883040z6M instanceof C1883100z6S) && (c1883100z6S = (C1883100z6S) interfaceC1883040z6M) != null) {
            if (c1883100z6S.LLILZIL.LJIIJJI().LLJJI) {
                str = "on_tab_sticky_enter";
            } else {
                str = "on_tab_sticky_exit";
            }
            C1883920z7m c1883920z7m2 = this.LLJJL;
            if (c1883920z7m2 != null) {
                c1883920z7m2.LIZLLL(str, null);
            }
        }
    }

    @Override // X.AbstractC1882890z67
    public final void LJJJ(View view) {
        View viewLIZJ;
        this.LLILZLL = view;
        C1883920z7m c1883920z7m = this.LLJJL;
        if (c1883920z7m != null && (viewLIZJ = c1883920z7m.LIZJ()) != null) {
            viewLIZJ.setTag(this.LLJLL, this);
        }
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJJJJLL(View view) {
        if (view instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
            return (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJJJJLL = LJJJJLL(viewGroup.getChildAt(childCount));
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJJJJLL != null) {
                    return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJJJJLL;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0008  */
    @Override // X.AbstractC1882890z67
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(java.lang.Object r9, java.lang.String r10) {
        /*
            r8 = this;
            X.00zU r5 = new X.00zU
            r5.<init>()
            if (r9 == 0) goto L8
            goto La
        L8:
            r1 = 0
            goto L15
        La:
            java.lang.String r0 = X.C476770Imp.LJ(r9)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L8
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1d
        L15:
            r5.element = r1     // Catch: java.lang.Throwable -> L1d
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L1d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L1d
            goto L29
        L1d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L29:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r0)
            java.lang.String r6 = "MixSparkCard"
            if (r1 == 0) goto L39
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            java.lang.String r0 = "dispatchEventToLynx param parse error, must be JSONObject"
            X.C20441214yg.LJFF(r6, r0, r1)
        L38:
            return
        L39:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.0z7m r0 = r8.LLJJL
            if (r0 == 0) goto L45
            r4.add(r0)
        L45:
            X.13E8 r0 = r8.LJJJJZ()
            java.util.Iterator r1 = r0.iterator()
        L4d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r1.next()
            X.0ePO r0 = (X.C1087600ePO) r0
            X.0z7m r0 = r0.getSparkView()
            if (r0 == 0) goto L4d
            r4.add(r0)
            goto L4d
        L63:
            X.01GW r0 = r8.LLJJJJ
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r10)
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            if (r0 == 0) goto L38
            java.util.Iterator r7 = r0.iterator()
        L77:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r3 = r7.next()
            java.util.Iterator r2 = r4.iterator()
        L85:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r1 = r2.next()
            X.0z7m r1 = (X.C1883920z7m) r1
            java.lang.String r0 = r1.LIZIZ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L85
            T r0 = r5.element     // Catch: java.lang.Throwable -> La8
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> La8
            r1.LIZLLL(r10, r0)     // Catch: java.lang.Throwable -> La8
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> La8
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> La8
            goto Lb4
        La8:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        Lb4:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r1 == 0) goto L85
            java.lang.String r0 = "dispatchEventToLynx sendEventByJSON error"
            X.C20441214yg.LJFF(r6, r0, r1)
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.lynx.MixSparkCard.LJJIII(java.lang.Object, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0z7X] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0z7d] */
    public MixSparkCard(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        super(context, c1155600gB4, interfaceC1881340z3c);
        this.LLJJIJI = C452501pT.LIZIZ(new C1880870z2r(this));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C1881240z3S(this));
        this.LLJJIJIL = C452501pT.LIZIZ(new C1883800z7a(this));
        this.LLJJJ = C452501pT.LIZIZ(new C1882610z5f(c1155600gB4));
        this.LLJJJIL = new InterfaceC1059280dfi() { // from class: X.0z7d
            @Override // X.InterfaceC1059280dfi
            public final void close() {
                MixSparkCard mixSparkCard = this.LL;
                mixSparkCard.getClass();
                C20441214yg.LIZIZ("MixSparkCard", "onSparkRequestClose");
                mixSparkCard.LJJJI(null, "on_card_request_close");
            }

            @Override // X.InterfaceC1051240dSk
            public final void refresh() {
                this.LL.getClass();
                C20441214yg.LIZIZ("MixSparkCard", "onSparkRequestRefresh");
            }

            @Override // X.InterfaceC1059280dfi
            public final void m3(boolean z) {
                MixSparkCard mixSparkCard = this.LL;
                mixSparkCard.getClass();
                C20441214yg.LIZIZ("MixSparkCard", "onSparkRequestClose");
                mixSparkCard.LJJJI(null, "on_card_request_close");
            }
        };
        this.LLJJJJ = C452501pT.LIZIZ(new C1883850z7f());
        this.LLJJJJJIL = C452501pT.LIZIZ(new C1883870z7h());
        this.LLJJJJLIIL = C452501pT.LIZIZ(new C1883880z7i(context));
        this.LLJLILLLLZIIL = new AbstractC1542200qEc() { // from class: X.0z7X
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                MixSparkCard mixSparkCard = this.LLILLJJLI;
                mixSparkCard.LLJJLIIIJLLLLLLLZ = true;
                mixSparkCard.LLJLIL = false;
                C1883960z7q c1883960z7q = mixSparkCard.LLJL;
                if (c1883960z7q != null) {
                    mixSparkCard.LLJL = null;
                    C176600m4.LIZJ(new C1883780z7Y(c1883960z7q));
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
                this.LLILLJJLI.LJJIJIL();
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
                MixSparkCard mixSparkCard = this.LLILLJJLI;
                mixSparkCard.LLJLIL = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1542120qEU.LIZ);
                sbLIZ.append(':');
                sbLIZ.append(c1542120qEU.LIZIZ);
                mixSparkCard.LJJJJ(1201, C2188811AlT.LIZIZ(sbLIZ));
                this.LLILLJJLI.LJJIJIIJIL();
                this.LLILLJJLI.LLILLL.getEventCenter().LIZIZ(this.LLILLJJLI.LLJJIJIL.getValue(), "on_lynx_card_load_failed");
            }
        };
        this.LLJLL = R.id.yqz;
    }
}
