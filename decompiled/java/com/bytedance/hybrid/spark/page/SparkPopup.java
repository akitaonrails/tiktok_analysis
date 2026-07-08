package com.bytedance.hybrid.spark.page;

import X.AbstractC1539070q9Z;
import X.AbstractC1911210zpn;
import X.C01GW;
import X.C086F;
import X.C098200Yq;
import X.C0TVG;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1338790kwX;
import X.C1389600mGU;
import X.C1520080pew;
import X.C1520360pfO;
import X.C1529880puk;
import X.C1530030puz;
import X.C1535630q41;
import X.C1537820q7Y;
import X.C1545870qKX;
import X.C1545970qKh;
import X.C1546200qL4;
import X.C1546210qL5;
import X.C1549340qQ8;
import X.C1554130qXr;
import X.C1554240qY2;
import X.C1554250qY3;
import X.C1554470qYP;
import X.C16G0;
import X.C189200o6;
import X.C1912890zsV;
import X.C19EG;
import X.C19EH;
import X.C20244914Jj;
import X.C20246014Ju;
import X.C20533215Wg;
import X.C2183921Ada;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C415540GRc;
import X.C452501pT;
import X.C786410Ut5;
import X.DialogC197047127p;
import X.InterfaceC1051240dSk;
import X.InterfaceC1059280dfi;
import X.InterfaceC1106350etd;
import X.InterfaceC1387820mDc;
import X.InterfaceC1432560nNm;
import X.InterfaceC1538940q9M;
import X.InterfaceC1538950q9N;
import X.InterfaceC1541990qEH;
import X.InterfaceC1554220qY0;
import X.InterfaceC1554280qY6;
import X.InterfaceC1800900wxs;
import X.InterfaceC20190413zK;
import X.ViewTreeObserverOnGlobalLayoutListenerC1554260qY4;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS92S0200000_23;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS308S0000000_23;
import kotlin.jvm.internal.AwS307S0000000_23;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS637S0100000_23;
import org.json.JSONException;
import org.json.JSONObject;
import u4.q0;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkPopup extends AppCompatDialogFragment implements InterfaceC1051240dSk, InterfaceC1059280dfi, InterfaceC1800900wxs, InterfaceC1432560nNm, View.OnAttachStateChangeListener, ViewTreeObserver.OnWindowFocusChangeListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWskMC0hISFiHELIOSOj8yOi5iOS40LWsfOS4hIxUjOToj";
    public FrameLayout LLILLJJLI;
    public LinearLayout LLILLL;
    public C415540GRc LLILZ;
    public FrameLayout LLILZIL;
    public View LLILZLL;
    public C16G0 LLIZ;
    public C2183921Ada LLJ;
    public SparkPopupSchemaParam LLJI;
    public SparkContext LLJIJIL;
    public View LLJILJIL;
    public ViewTreeObserverOnGlobalLayoutListenerC1554260qY4 LLJILJILJ;
    public SparkFragment LLJILLL;
    public BottomSheetBehavior<LinearLayout> LLJJ;
    public C1912890zsV LLJJIII;
    public int LLJJIJI;
    public InterfaceC1387820mDc LLJJIJIL;
    public C1545870qKX LLJJJIL;
    public boolean LLJJJJ;
    public int LLJJJJJIL;
    public ViewTreeObserver.OnGlobalLayoutListener LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public C20246014Ju LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZIJLIL;
    public final boolean LLL;
    public final boolean LLLF;
    public final boolean LLLFF;
    public View LLLFFI;
    public boolean LLLFZ;
    public Integer[] LLLI;
    public boolean LLLII;
    public final C01GW LLLIIII;
    public boolean LLLIIIIL;
    public final C1554470qYP LLLIIIL;
    public final int LL = C1338790kwX.LIZ(100.0f);
    public final List<InterfaceC1554280qY6> LLIZLLLIL = new ArrayList();
    public final C1554250qY3 LLJJI = new C1554250qY3();
    public int LLJJIJIIJIL = -1;
    public final C1554130qXr LLJJJ = new C1554130qXr();
    public int LLJZ = -1;

    static {
        new C1549340qQ8();
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() {
        gS(true);
    }

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    public SparkPopup() {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("popup_compat_show_event");
            c098200Yq = config != null ? Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable")) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        this.LLL = bool != null ? bool.booleanValue() : false;
        try {
            JSONObject config2 = HybridSettings.INSTANCE.getConfig("fix_popup_anim_lag");
            c098200Yq2 = config2 != null ? Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config2, "enable")) : null;
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Boolean bool2 = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
        this.LLLF = bool2 != null ? bool2.booleanValue() : true;
        try {
            JSONObject config3 = HybridSettings.INSTANCE.getConfig("fix_popup_height");
            c098200Yq3 = config3 != null ? Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config3, "enable")) : null;
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        Boolean bool3 = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq3) ? null : c098200Yq3);
        this.LLLFF = bool3 != null ? bool3.booleanValue() : true;
        this.LLLI = new Integer[0];
        this.LLLIIII = C452501pT.LIZIZ(new AwS567S0100000_23(this, 68));
        this.LLLIIIL = new C1554470qYP(this, 0);
    }

    @Override // X.InterfaceC1800900wxs
    public final void Lm() {
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.LLJJ;
        if (bottomSheetBehavior != null && bottomSheetBehavior.LJJIIJ == 3) {
            Window windowWR = WR();
            getActivity();
            SparkPopupSchemaParam sparkPopupSchemaParam = this.LLJI;
            if (sparkPopupSchemaParam == null) {
                sparkPopupSchemaParam = null;
            }
            int iLIZIZ = C1549340qQ8.LIZIZ(windowWR, sparkPopupSchemaParam, this, true);
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior2 = this.LLJJ;
            if (bottomSheetBehavior2 == null) {
                bottomSheetBehavior2 = null;
            }
            if (bottomSheetBehavior2.getPeekHeight() != iLIZIZ) {
                BottomSheetBehavior<LinearLayout> bottomSheetBehavior3 = this.LLJJ;
                if (bottomSheetBehavior3 == null) {
                    bottomSheetBehavior3 = null;
                }
                bottomSheetBehavior3.setPeekHeight(iLIZIZ);
            }
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior4 = this.LLJJ;
            (bottomSheetBehavior4 != null ? bottomSheetBehavior4 : null).LIZIZ(4, true);
            iS(-1, true, true);
        }
    }

    public final LinearLayout MR() {
        LinearLayout linearLayout = this.LLILLL;
        if (linearLayout == null) {
            return null;
        }
        return linearLayout;
    }

    public final SparkPopupSchemaParam NR() {
        SparkPopupSchemaParam sparkPopupSchemaParam = this.LLJI;
        if (sparkPopupSchemaParam == null) {
            return null;
        }
        return sparkPopupSchemaParam;
    }

    public final C1545970qKh ZR() {
        return (C1545970qKh) this.LLLIIII.getValue();
    }

    public final int aS() {
        InterfaceC1106350etd interfaceC1106350etd;
        View viewLIZ = this.LLJILJIL;
        if (viewLIZ == null) {
            SparkContext sparkContext = this.LLJIJIL;
            viewLIZ = (sparkContext == null || (interfaceC1106350etd = (InterfaceC1106350etd) sparkContext.LJFF(InterfaceC1106350etd.class)) == null) ? null : interfaceC1106350etd.LIZ();
        }
        this.LLJILJIL = viewLIZ;
        SparkPopupSchemaParam sparkPopupSchemaParam = this.LLJI;
        return C1549340qQ8.LIZJ(viewLIZ, sparkPopupSchemaParam != null ? sparkPopupSchemaParam : null);
    }

    public final SparkFragment cS() {
        SparkFragment sparkFragment;
        SparkFragment sparkFragment2 = this.LLJILLL;
        if (sparkFragment2 != null) {
            return sparkFragment2;
        }
        if (isAdded()) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("popup#");
            SparkContext sparkContext = this.LLJIJIL;
            sbLIZ.append(sparkContext != null ? sparkContext.containerId : null);
            Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
            if ((fragmentLJJJJZI instanceof SparkFragment) && (sparkFragment = (SparkFragment) fragmentLJJJJZI) != null) {
                return sparkFragment;
            }
        }
        return new SparkFragment();
    }

    @Override // X.InterfaceC1800900wxs
    public final void cj() {
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.LLJJ;
        if (bottomSheetBehavior != null && bottomSheetBehavior.LJJIIJ == 4) {
            SparkPopupSchemaParam sparkPopupSchemaParam = this.LLJI;
            if (sparkPopupSchemaParam == null) {
                sparkPopupSchemaParam = null;
            }
            int dragHeight = sparkPopupSchemaParam.getDragHeight();
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior2 = this.LLJJ;
            if (bottomSheetBehavior2 == null) {
                bottomSheetBehavior2 = null;
            }
            if (bottomSheetBehavior2.LIZ() != dragHeight) {
                BottomSheetBehavior<LinearLayout> bottomSheetBehavior3 = this.LLJJ;
                if (bottomSheetBehavior3 == null) {
                    bottomSheetBehavior3 = null;
                }
                bottomSheetBehavior3.LJIJJLI = dragHeight;
            }
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior4 = this.LLJJ;
            (bottomSheetBehavior4 != null ? bottomSheetBehavior4 : null).LIZIZ(3, true);
            iS(-1, true, true);
        }
    }

    public final boolean nS() {
        SparkContext sparkContext;
        SparkContext sparkContext2 = this.LLJIJIL;
        if (sparkContext2 == null) {
            return false;
        }
        C1529880puk c1529880puk = SparkContext.Companion;
        SparkSchemaParam sparkSchemaParamLJJJI = sparkContext2.LJJJI(-1);
        if (sparkSchemaParamLJJJI == null || (sparkContext = this.LLJIJIL) == null || !(sparkSchemaParamLJJJI instanceof SparkPopupSchemaParam) || ((AbsSparkPopupSchemaParam) sparkSchemaParamLJJJI).getSilentLoadType() != 1) {
            return false;
        }
        C1554130qXr c1554130qXr = this.LLJJJ;
        c1554130qXr.getClass();
        return c1554130qXr.LIZIZ(new AwS637S0100000_23(sparkContext, 17), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        List<InterfaceC1554220qY0> list;
        ViewTreeObserver viewTreeObserver;
        View view;
        ViewTreeObserver viewTreeObserver2;
        ViewTreeObserver viewTreeObserver3;
        View view2;
        ViewTreeObserver viewTreeObserver4;
        C1554130qXr c1554130qXr = this.LLJJJ;
        c1554130qXr.getClass();
        c1554130qXr.LIZ(AFwS308S0000000_23.get$arr$(17), this);
        super.onDestroy();
        View view3 = this.LLJILJIL;
        if (view3 != null && (viewTreeObserver3 = view3.getViewTreeObserver()) != null && viewTreeObserver3.isAlive() && (view2 = this.LLJILJIL) != null && (viewTreeObserver4 = view2.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1554260qY4 viewTreeObserverOnGlobalLayoutListenerC1554260qY4 = this.LLJILJILJ;
            viewTreeObserver4.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1554260qY4);
            C2187701Ajg.LIZIZ(viewTreeObserver4, viewTreeObserverOnGlobalLayoutListenerC1554260qY4, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        View view4 = getView();
        if (view4 != null && (viewTreeObserver = view4.getViewTreeObserver()) != null && viewTreeObserver.isAlive() && (view = getView()) != null && (viewTreeObserver2 = view.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnWindowFocusChangeListener(this);
        }
        View view5 = this.LLLFFI;
        if (view5 != null) {
            C0TVG.LIZIZ(view5, this.LLLIIIL);
        }
        this.LLLFFI = null;
        C1554130qXr c1554130qXr2 = this.LLJJJ;
        c1554130qXr2.getClass();
        c1554130qXr2.LIZ(AFwS308S0000000_23.get$arr$(14), this);
        C1545870qKX c1545870qKX = this.LLJJJIL;
        if (c1545870qKX != null && (list = c1545870qKX.LIZ) != null) {
            Iterator<InterfaceC1554220qY0> it2 = list.iterator();
            while (it2.hasNext()) {
                this.LLJJJ.LIZ.remove(it2.next());
            }
        }
        C1530030puz.LIZIZ("SparkPopupLoadingProcess", "SparkPopup onDestroy", this.LLJIJIL);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() throws JSONException {
        C1530030puz.LIZIZ("SparkPopupLoadingProcess", "SparkPopup onDetach", this.LLJIJIL);
        super.onDetach();
        PR(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() throws JSONException {
        SparkFragment sparkFragment;
        C1530030puz.LIZIZ("SparkPopupLoadingProcess", "SparkPopup onPause", this.LLJIJIL);
        C1554130qXr c1554130qXr = this.LLJJJ;
        c1554130qXr.getClass();
        c1554130qXr.LIZ(AFwS308S0000000_23.get$arr$(7), this);
        this.LLJLLL = false;
        PR(false);
        SparkPopupSchemaParam sparkPopupSchemaParam = this.LLJI;
        if (sparkPopupSchemaParam == null) {
            sparkPopupSchemaParam = null;
        }
        if (!sparkPopupSchemaParam.getPopupCompatShowEvent() && !this.LLL && (sparkFragment = this.LLJILLL) != null) {
            sparkFragment.onFragmentHide();
        }
        super.onPause();
        C1554130qXr c1554130qXr2 = this.LLJJJ;
        c1554130qXr2.getClass();
        c1554130qXr2.LIZ(AFwS308S0000000_23.get$arr$(5), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() throws JSONException {
        InterfaceC1541990qEH kitView;
        String strLJIJI;
        String str;
        SparkFragment sparkFragment;
        C1554130qXr c1554130qXr = this.LLJJJ;
        c1554130qXr.getClass();
        c1554130qXr.LIZ(AFwS308S0000000_23.get$arr$(8), this);
        super.onResume();
        this.LLJLLL = true;
        PR(true);
        SparkPopupSchemaParam sparkPopupSchemaParam = this.LLJI;
        if (sparkPopupSchemaParam == null) {
            sparkPopupSchemaParam = null;
        }
        if (!sparkPopupSchemaParam.getPopupCompatShowEvent() && !this.LLL && (sparkFragment = this.LLJILLL) != null) {
            sparkFragment.onFragmentShow();
        }
        if (this.LLJJIJIIJIL == -1) {
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.LLJJ;
            this.LLJJIJIIJIL = bottomSheetBehavior != null ? bottomSheetBehavior.LJJIIJ : 3;
            SparkFragment sparkFragment2 = this.LLJILLL;
            if (sparkFragment2 != null && (kitView = sparkFragment2.getKitView()) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("state", this.LLJJIJIIJIL == 3 ? "onEnterExpandState" : "onEnterNormalState");
                SparkContext sparkContext = this.LLJIJIL;
                String str2 = "";
                if (sparkContext == null || (strLJIJI = sparkContext.LJIJI()) == null) {
                    strLJIJI = "";
                }
                jSONObject.put("url", strLJIJI);
                SparkContext sparkContext2 = this.LLJIJIL;
                if (sparkContext2 != null && (str = sparkContext2.containerId) != null) {
                    str2 = str;
                }
                jSONObject.put("container_id", str2);
                kitView.LIZ("onVariableHeightStateChanged", jSONObject);
            }
        }
        C1554130qXr c1554130qXr2 = this.LLJJJ;
        c1554130qXr2.getClass();
        c1554130qXr2.LIZ(AFwS308S0000000_23.get$arr$(6), this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() throws JSONException {
        Window window;
        View decorView;
        C1530030puz.LIZIZ("SparkPopupLoadingProcess", "SparkPopup onStart", this.LLJIJIL);
        C1554130qXr c1554130qXr = this.LLJJJ;
        c1554130qXr.getClass();
        c1554130qXr.LIZ(AFwS308S0000000_23.get$arr$(18), this);
        super.onStart();
        SparkFragment sparkFragment = this.LLJILLL;
        if (sparkFragment != null) {
            SparkPopupSchemaParam sparkPopupSchemaParam = this.LLJI;
            if (sparkPopupSchemaParam == null) {
                sparkPopupSchemaParam = null;
            }
            if (sparkPopupSchemaParam.getDelaySparkViewLoad() && sparkFragment.isAdded()) {
                Lifecycle.State currentState = sparkFragment.getLifecycle().getCurrentState();
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (!currentState.isAtLeast(state)) {
                    C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                    c19ehLJIIJ.LJIL(sparkFragment, state);
                    RR(c19ehLJIIJ);
                }
            }
        }
        C1554130qXr c1554130qXr2 = this.LLJJJ;
        c1554130qXr2.getClass();
        c1554130qXr2.LIZ(AFwS308S0000000_23.get$arr$(15), this);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        C1530030puz.LIZIZ("SparkPopupLoadingProcess", "SparkPopup onStop", this.LLJIJIL);
        C1554130qXr c1554130qXr = this.LLJJJ;
        c1554130qXr.getClass();
        c1554130qXr.LIZ(AFwS308S0000000_23.get$arr$(19), this);
        super.onStop();
        C1554130qXr c1554130qXr2 = this.LLJJJ;
        c1554130qXr2.getClass();
        c1554130qXr2.LIZ(AFwS308S0000000_23.get$arr$(16), this);
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
        SparkFragment sparkFragment = this.LLJILLL;
        if (sparkFragment != null) {
            sparkFragment.refresh();
        }
        C1530030puz.LIZIZ("SparkPopupLoadingProcess", "SparkPopup refresh", this.LLJIJIL);
    }

    public final Window WR() {
        DialogFragment dialogFragment;
        Dialog dialog;
        Window window;
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            Fragment parentFragment = getParentFragment();
            if (!(parentFragment instanceof DialogFragment) || (dialogFragment = (DialogFragment) parentFragment) == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null) {
                Activity activityLIZLLL = C1537820q7Y.LIZLLL();
                if (activityLIZLLL != null) {
                    return activityLIZLLL.getWindow();
                }
                return null;
            }
        }
        return window;
    }

    @Override // X.InterfaceC1432560nNm
    public final void KF(InterfaceC1387820mDc interfaceC1387820mDc) {
        this.LLJJIJIL = interfaceC1387820mDc;
    }

    public final void PR(boolean z) throws JSONException {
        boolean zHasWindowFocus;
        boolean z2;
        InterfaceC1541990qEH kitView;
        InterfaceC1541990qEH kitView2;
        View decorView;
        C20246014Ju c20246014Ju;
        if (z == this.LLJLLIL) {
            return;
        }
        boolean z3 = this.LLJLLL;
        boolean zIsVisible = isVisible();
        boolean userVisibleHint = getUserVisibleHint();
        View view = getView();
        if (view != null) {
            zHasWindowFocus = view.hasWindowFocus();
        } else {
            zHasWindowFocus = false;
        }
        if (z3 && zIsVisible && userVisibleHint && zHasWindowFocus) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != this.LLJLLIL) {
            this.LLJLLIL = z2;
            SparkPopupSchemaParam sparkPopupSchemaParam = this.LLJI;
            if (sparkPopupSchemaParam == null) {
                sparkPopupSchemaParam = null;
            }
            if (sparkPopupSchemaParam.getPopupCompatShowEvent() || this.LLL) {
                if (z2) {
                    SparkFragment sparkFragment = this.LLJILLL;
                    if (sparkFragment != null && (kitView2 = sparkFragment.getKitView()) != null) {
                        kitView2.onShow();
                    }
                } else {
                    SparkFragment sparkFragment2 = this.LLJILLL;
                    if (sparkFragment2 != null && (kitView = sparkFragment2.getKitView()) != null) {
                        kitView.onHide();
                    }
                }
            }
            Window windowWR = WR();
            if (windowWR != null && (decorView = windowWR.getDecorView()) != null && (c20246014Ju = this.LLJLL) != null) {
                OR(decorView, c20246014Ju);
            }
        }
    }

    public final void RR(C19EH c19eh) throws JSONException {
        String strLJIJI;
        String str;
        String strLJIJI2;
        String str2 = "";
        String str3 = null;
        try {
            C086F c086f = C086F.LIZ;
            ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(c19eh, 107);
            c086f.getClass();
            C086F.LJII(aRunnableS107S0100000_7);
            SparkContext sparkContext = this.LLJIJIL;
            if (sparkContext != null) {
                str = sparkContext.containerId;
            } else {
                str = null;
            }
            C1520360pfO c1520360pfO = new C1520360pfO("commitNowAllowingStateLossSafely");
            c1520360pfO.LIZIZ = "sparkTrace";
            if (sparkContext == null || (strLJIJI2 = sparkContext.LJIJI()) == null) {
                strLJIJI2 = "";
            }
            c1520360pfO.LIZ = strLJIJI2;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success");
            c1520360pfO.LIZLLL = jSONObject;
            C1520080pew.LIZ(str, c1520360pfO.LIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c19eh.LJIIJ();
            SparkContext sparkContext2 = this.LLJIJIL;
            if (sparkContext2 != null) {
                str3 = sparkContext2.containerId;
            }
            C1520360pfO c1520360pfO2 = new C1520360pfO("commitNowAllowingStateLossSafely");
            c1520360pfO2.LIZIZ = "sparkTrace";
            if (sparkContext2 != null && (strLJIJI = sparkContext2.LJIJI()) != null) {
                str2 = strLJIJI;
            }
            c1520360pfO2.LIZ = str2;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "failed");
            c1520360pfO2.LIZLLL = jSONObject2;
            C1520080pew.LIZ(str3, c1520360pfO2.LIZ());
        }
    }

    public final void SR(int i) throws JSONException {
        String str;
        String str2;
        SparkFragment sparkFragmentCS = cS();
        this.LLJILLL = sparkFragmentCS;
        Bundle bundle = new Bundle();
        SparkContext sparkContext = this.LLJIJIL;
        SparkPopupSchemaParam sparkPopupSchemaParam = null;
        if (sparkContext != null) {
            str = sparkContext.containerId;
        } else {
            str = null;
        }
        C786410Ut5.LJJJI("SparkContextContainerId", str, bundle);
        sparkFragmentCS.setArguments(bundle);
        if (sparkFragmentCS.isAdded()) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJJIFFI(sparkFragmentCS);
            SparkPopupSchemaParam sparkPopupSchemaParam2 = this.LLJI;
            if (sparkPopupSchemaParam2 != null) {
                sparkPopupSchemaParam = sparkPopupSchemaParam2;
            }
            if (sparkPopupSchemaParam.getDelaySparkViewLoad()) {
                c19ehLJIIJ.LJIL(sparkFragmentCS, Lifecycle.State.INITIALIZED);
            }
            RR(c19ehLJIIJ);
            return;
        }
        C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popup#");
        SparkContext sparkContext2 = this.LLJIJIL;
        if (sparkContext2 != null) {
            str2 = sparkContext2.containerId;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        c19ehLJIIJ2.LIZJ(i, sparkFragmentCS, C2188811AlT.LIZIZ(sbLIZ));
        SparkPopupSchemaParam sparkPopupSchemaParam3 = this.LLJI;
        if (sparkPopupSchemaParam3 != null) {
            sparkPopupSchemaParam = sparkPopupSchemaParam3;
        }
        if (sparkPopupSchemaParam.getDelaySparkViewLoad()) {
            c19ehLJIIJ2.LJIL(sparkFragmentCS, Lifecycle.State.INITIALIZED);
        }
        RR(c19ehLJIIJ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa A[PHI: r2
      0x00aa: PHI (r2v7 boolean) = (r2v6 boolean), (r2v10 boolean), (r2v10 boolean), (r2v10 boolean) binds: [B:63:0x00a7, B:40:0x0065, B:45:0x0071, B:50:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void UR(int r7) {
        /*
            r6 = this;
            android.view.Window r0 = r6.WR()
            r5 = 0
            if (r0 == 0) goto Lb9
            android.view.View r3 = r0.getDecorView()
        Lb:
            android.view.View r0 = r6.getView()
            if (r0 == 0) goto Lb6
            android.view.ViewParent r2 = r0.getParent()
        L15:
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto Lb3
            android.view.View r2 = (android.view.View) r2
        L1b:
            r1 = 0
            if (r2 == 0) goto Lb0
            int r2 = r2.getPaddingBottom()
        L22:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lae
            r0 = r3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto Lae
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto Lae
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
        L35:
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto Lac
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            if (r1 == 0) goto Lac
            int r0 = r1.bottomMargin
        L3f:
            int r7 = r7 - r2
            int r7 = r7 - r0
            if (r3 == 0) goto L95
            int r0 = r3.getWindowSystemUiVisibility()
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L95
            r4 = 1
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r6.LLJI
            if (r0 != 0) goto L51
            r0 = r5
        L51:
            X.0dtC r1 = r0.getEngineType()
            X.0dtC r0 = X.EnumC1067640dtC.WEB
            if (r1 != r0) goto La6
            r2 = 1
        L5a:
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r6.LLJI
            if (r0 != 0) goto L5f
            r0 = r5
        L5f:
            X.0dtC r1 = r0.getEngineType()
            X.0dtC r0 = X.EnumC1067640dtC.LYNX
            if (r1 != r0) goto Laa
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r6.LLJI
            if (r0 != 0) goto L6c
            r0 = r5
        L6c:
            int r1 = r0.getKeyboardAdjust()
            r0 = 2
            if (r1 != r0) goto Laa
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r6.LLJI
            if (r0 != 0) goto L78
            r0 = r5
        L78:
            boolean r0 = r0.getKeyboardCompat()
            if (r0 == 0) goto Laa
            r0 = 1
        L7f:
            if (r2 != 0) goto L83
            if (r0 == 0) goto L95
        L83:
            int r2 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r0 = r3.getPaddingRight()
            r3.setPadding(r2, r1, r0, r7)
            r3.requestLayout()
        L95:
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r6.LLJI
            if (r0 == 0) goto L9a
            r5 = r0
        L9a:
            boolean r0 = r5.getSelfAdaptiveHeight()
            if (r0 != 0) goto La5
            r1 = 1
            r0 = -1
            r6.iS(r0, r1, r1)
        La5:
            return
        La6:
            r2 = 0
            if (r4 == 0) goto Laa
            goto L5a
        Laa:
            r0 = 0
            goto L7f
        Lac:
            r0 = 0
            goto L3f
        Lae:
            r1 = r5
            goto L35
        Lb0:
            r2 = 0
            goto L22
        Lb3:
            r2 = r5
            goto L1b
        Lb6:
            r2 = r5
            goto L15
        Lb9:
            r3 = r5
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkPopup.UR(int):void");
    }

    public final int VR(Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.LLJJ;
            if (bottomSheetBehavior != null) {
                iIntValue = bottomSheetBehavior.LJJIIJ;
            } else {
                iIntValue = -1;
            }
        }
        SparkPopupSchemaParam sparkPopupSchemaParam = null;
        if (iIntValue == 3) {
            SparkPopupSchemaParam sparkPopupSchemaParam2 = this.LLJI;
            if (sparkPopupSchemaParam2 == null) {
                sparkPopupSchemaParam2 = null;
            }
            if (sparkPopupSchemaParam2.getDragMinMarginTop() > 0) {
                SparkPopupSchemaParam sparkPopupSchemaParam3 = this.LLJI;
                if (sparkPopupSchemaParam3 != null) {
                    sparkPopupSchemaParam = sparkPopupSchemaParam3;
                }
                return sparkPopupSchemaParam.getDragMinMarginTop();
            }
        }
        SparkPopupSchemaParam sparkPopupSchemaParam4 = this.LLJI;
        if (sparkPopupSchemaParam4 != null) {
            sparkPopupSchemaParam = sparkPopupSchemaParam4;
        }
        return sparkPopupSchemaParam.getMinMarginTop();
    }

    public final void bS(SparkContext sparkContext) {
        C1545870qKX c1545870qKX;
        List<InterfaceC1554220qY0> list;
        C1530030puz.LIZIZ("SparkPopupLoadingProcess", "SparkPopup init", sparkContext);
        this.LLJIJIL = sparkContext;
        if (sparkContext != null) {
            c1545870qKX = (C1545870qKX) sparkContext.LJFF(C1545870qKX.class);
        } else {
            c1545870qKX = null;
        }
        this.LLJJJIL = c1545870qKX;
        if (c1545870qKX != null && (list = c1545870qKX.LIZ) != null) {
            Iterator<InterfaceC1554220qY0> it2 = list.iterator();
            while (it2.hasNext()) {
                this.LLJJJ.LIZ.add(it2.next());
            }
        }
    }

    public final void dS(int i) throws JSONException {
        boolean z;
        Integer numValueOf;
        InterfaceC1541990qEH kitView;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJLIIIJLLLLLLLZ = z;
        if (!z) {
            i = 0;
        }
        Context context = getContext();
        if (context != null) {
            C1546210qL5.LIZ.getClass();
            numValueOf = Integer.valueOf(C1546210qL5.LJIIL(i, context));
        } else {
            numValueOf = null;
        }
        SparkFragment sparkFragment = this.LLJILLL;
        if (sparkFragment != null && (kitView = sparkFragment.getKitView()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("visible", this.LLJJLIIIJLLLLLLLZ);
            jSONObject.put("height", numValueOf);
            kitView.LIZ("keyboardStatusChange", jSONObject);
        }
    }

    public final void gS(boolean z) {
        C19EG activity;
        Object c098200Yq;
        C19EG activity2;
        InterfaceC1541990qEH kitView;
        C1530030puz.LIZIZ("SparkPopupLoadingProcess", "SparkPopup popupDismiss", this.LLJIJIL);
        if (this.LLLFZ) {
            return;
        }
        SparkFragment sparkFragment = this.LLJILLL;
        AbstractC1911210zpn abstractC1911210zpn = null;
        if (sparkFragment != null) {
            activity = sparkFragment.getActivity();
        } else {
            activity = null;
        }
        if (activity instanceof SparkActivity) {
            SparkFragment sparkFragment2 = this.LLJILLL;
            if (sparkFragment2 != null) {
                activity2 = sparkFragment2.getActivity();
            } else {
                activity2 = null;
            }
            SparkFragment sparkFragment3 = ((SparkActivity) activity2).LLJILJIL;
            if (sparkFragment3 != null && (kitView = sparkFragment3.getKitView()) != null) {
                kitView.LIZ("onDismissPopup", null);
            }
        }
        if (getFragmentManager() != null) {
            if (z) {
                C2183921Ada c2183921Ada = this.LLJ;
                if (c2183921Ada == null) {
                    c2183921Ada = null;
                }
                SparkContext sparkContext = this.LLJIJIL;
                if (sparkContext != null) {
                    abstractC1911210zpn = (AbstractC1911210zpn) sparkContext.LJFF(AbstractC1911210zpn.class);
                }
                c2183921Ada.LIZIZ(abstractC1911210zpn, new AwS551S0100000_7(this, 118));
            } else {
                try {
                    dismissAllowingStateLoss();
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            }
        }
        SparkFragment sparkFragment4 = this.LLJILLL;
        if (sparkFragment4 != null) {
            sparkFragment4.finish();
        }
        C1554130qXr c1554130qXr = this.LLJJJ;
        c1554130qXr.getClass();
        c1554130qXr.LIZ(AFwS308S0000000_23.get$arr$(20), this);
        this.LLLFZ = true;
    }

    public final void mS(boolean z) {
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.LLJJ;
        if (bottomSheetBehavior == null) {
            return;
        }
        SparkPopupSchemaParam sparkPopupSchemaParam = null;
        bottomSheetBehavior.LJIIZILJ = z;
        SparkPopupSchemaParam sparkPopupSchemaParam2 = this.LLJI;
        if (sparkPopupSchemaParam2 != null) {
            sparkPopupSchemaParam = sparkPopupSchemaParam2;
        }
        sparkPopupSchemaParam.setDragByGesture(z);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) throws JSONException {
        C1530030puz.LIZIZ("SparkPopupLoadingProcess", "SparkPopup onAttach", this.LLJIJIL);
        super.onAttach(context);
        PR(true);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1545970qKh c1545970qKhZR = ZR();
        LinearLayout linearLayoutMR = c1545970qKhZR.LIZ.MR();
        if (linearLayoutMR != null) {
            SparkPopupSchemaParam sparkPopupSchemaParamNR = c1545970qKhZR.LIZ.NR();
            c1545970qKhZR.LIZJ = new Configuration(configuration);
            if (sparkPopupSchemaParamNR != null && sparkPopupSchemaParamNR.getEnableAutoAdaptation()) {
                c1545970qKhZR.LJIIL(configuration);
                c1545970qKhZR.LJIIJ(configuration);
            }
            HandlerHook.viewPost(linearLayoutMR, new ARunnableS92S0200000_23(c1545970qKhZR, configuration, 132));
        }
        C1554130qXr c1554130qXr = this.LLJJJ;
        c1554130qXr.getClass();
        c1554130qXr.LIZ(new AwS637S0100000_23(configuration, 16), this);
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        SparkSchemaParam sparkSchemaParamLJJJI;
        SparkPopupSchemaParam sparkPopupSchemaParam;
        View decorView;
        C1530030puz.LIZIZ("SparkPopupLoadingProcess", "SparkPopup onCreateDialog", this.LLJIJIL);
        final Context contextRequireContext = requireContext();
        DialogC197047127p dialogC197047127p = new DialogC197047127p(contextRequireContext) { // from class: X.0qXp
            @Override // X.C19EK, android.app.Dialog
            public final void onBackPressed() {
                String str;
                C1530030puz.LIZIZ("SparkPopupLoadingProcess", "SparkPopup onBackPressed", this.LLJ.LLJIJIL);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("disableBackPress:");
                SparkPopupSchemaParam sparkPopupSchemaParam2 = this.LLJ.LLJI;
                if (sparkPopupSchemaParam2 == null) {
                    sparkPopupSchemaParam2 = null;
                }
                sbLIZ.append(sparkPopupSchemaParam2);
                sbLIZ.append(".disableBackPress");
                C1530030puz.LIZIZ("SparkActivity", C2188811AlT.LIZIZ(sbLIZ), this.LLJ.LLJIJIL);
                Map<String, Boolean> map = C1024630clp.LLILLL;
                SparkContext sparkContext = this.LLJ.LLJIJIL;
                if (sparkContext == null || (str = sparkContext.containerId) == null) {
                    str = "";
                }
                boolean zLIZIZ = C1051550dTF.LIZIZ(str);
                SparkFragment sparkFragment = this.LLJ.LLJILLL;
                InterfaceC1541990qEH kitView = sparkFragment != null ? sparkFragment.getKitView() : null;
                SparkPopupSchemaParam sparkPopupSchemaParam3 = this.LLJ.LLJI;
                if (sparkPopupSchemaParam3 == null) {
                    sparkPopupSchemaParam3 = null;
                }
                if (C1051550dTF.LIZ(kitView, zLIZIZ, sparkPopupSchemaParam3.getBlockBackPress())) {
                    return;
                }
                SparkPopup sparkPopup = this.LLJ;
                C1554130qXr c1554130qXr = sparkPopup.LLJJJ;
                c1554130qXr.getClass();
                if (c1554130qXr.LIZIZ(AFwS308S0000000_23.get$arr$(10), sparkPopup)) {
                    return;
                }
                SparkPopupSchemaParam sparkPopupSchemaParam4 = this.LLJ.LLJI;
                if ((sparkPopupSchemaParam4 != null ? sparkPopupSchemaParam4 : null).getDisableBackPress()) {
                    return;
                }
                this.LLJ.gS(true);
            }
        };
        C19EG activity = getActivity();
        if (activity != null) {
            dialogC197047127p.setOwnerActivity(activity);
        }
        SparkContext sparkContext = this.LLJIJIL;
        dialogC197047127p.LLILZLL = sparkContext;
        if (sparkContext != null) {
            sparkSchemaParamLJJJI = sparkContext.LJJJI(2);
        } else {
            sparkSchemaParamLJJJI = null;
        }
        if (sparkSchemaParamLJJJI instanceof SparkPopupSchemaParam) {
            sparkPopupSchemaParam = (SparkPopupSchemaParam) sparkSchemaParamLJJJI;
        } else {
            sparkPopupSchemaParam = null;
        }
        dialogC197047127p.LLIZ = sparkPopupSchemaParam;
        Window window = dialogC197047127p.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogC197047127p);
        return dialogC197047127p;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/hybrid/spark/page/SparkPopup", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHNkWkHBzTaCXFmEMHah4/", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        C1530030puz.LIZIZ("SparkPopupLoadingProcess", "SparkPopup onHiddenChanged, hidden = " + z, this.LLJIJIL);
        super.onHiddenChanged(z);
        PR(z ^ true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C1554130qXr c1554130qXr = this.LLJJJ;
        c1554130qXr.getClass();
        c1554130qXr.LIZ(new AwS307S0000000_23(bundle, 2), this);
        super.onSaveInstanceState(bundle);
        C1554130qXr c1554130qXr2 = this.LLJJJ;
        c1554130qXr2.getClass();
        c1554130qXr2.LIZ(new AwS307S0000000_23(bundle, 1), this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) throws JSONException {
        PR(true);
        C1554130qXr c1554130qXr = this.LLJJJ;
        c1554130qXr.getClass();
        c1554130qXr.LIZ(AFwS308S0000000_23.get$arr$(9), this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) throws JSONException {
        view.removeOnAttachStateChangeListener(this);
        PR(false);
        C1554130qXr c1554130qXr = this.LLJJJ;
        c1554130qXr.getClass();
        c1554130qXr.LIZ(AFwS308S0000000_23.get$arr$(11), this);
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) throws JSONException {
        PR(z);
        C1554130qXr c1554130qXr = this.LLJJJ;
        c1554130qXr.getClass();
        c1554130qXr.LIZ(new C1554240qY2(z), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/bytedance/hybrid/spark/page/SparkPopup", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHNkWkHBzTaCXFmEMHah4/", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        PR(z);
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(SparkPopup.class);
        }
    }

    public final C20246014Ju OR(View view, C20246014Ju c20246014Ju) throws JSONException {
        int i;
        Configuration configuration;
        Resources resources;
        Configuration configuration2;
        Resources resources2;
        View view2;
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior;
        int measuredHeight;
        boolean z;
        int paddingTop;
        int i2;
        if (view == null) {
            return C20246014Ju.LIZIZ;
        }
        C20246014Ju c20246014JuLJIIL = q0.LJIIL(view, c20246014Ju);
        boolean zLJIIIIZZ = c20246014Ju.LJIIIIZZ(8);
        boolean zLIZLLL = C1549340qQ8.LIZLLL(view, WR(), getView());
        if (c20246014Ju.LJIIIIZZ(2) && !zLIZLLL) {
            i = c20246014Ju.LIZ(2).LIZLLL;
        } else {
            i = 0;
        }
        if (zLJIIIIZZ) {
            i = c20246014Ju.LIZ(8).LIZLLL;
        }
        View viewFindViewById = view.findViewById(android.R.id.content);
        if (C1535630q41.LJJI && Build.VERSION.SDK_INT >= 35 && viewFindViewById != null && !this.LLLII) {
            C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
            int paddingLeft = viewFindViewById.getPaddingLeft();
            int paddingRight = viewFindViewById.getPaddingRight();
            if (viewFindViewById.getPaddingTop() == 0) {
                SparkPopupSchemaParam sparkPopupSchemaParam = this.LLJI;
                if (sparkPopupSchemaParam == null) {
                    sparkPopupSchemaParam = null;
                }
                if (sparkPopupSchemaParam.getTransStatusBar()) {
                    paddingTop = 0;
                } else {
                    paddingTop = c20244914JjLIZ.LIZIZ;
                }
            } else {
                paddingTop = viewFindViewById.getPaddingTop();
            }
            SparkPopupSchemaParam sparkPopupSchemaParam2 = this.LLJI;
            if (sparkPopupSchemaParam2 == null) {
                sparkPopupSchemaParam2 = null;
            }
            if (!sparkPopupSchemaParam2.getTransNavigationBar()) {
                i2 = c20244914JjLIZ.LIZLLL;
            } else {
                i2 = 0;
            }
            viewFindViewById.setPadding(paddingLeft, paddingTop, paddingRight, i2);
        }
        int i3 = this.LLJZ;
        if (i3 == -1) {
            this.LLJZ = i;
            return c20246014JuLJIIL;
        }
        if (i3 == i) {
            return c20246014JuLJIIL;
        }
        SparkPopupSchemaParam sparkPopupSchemaParam3 = this.LLJI;
        if (sparkPopupSchemaParam3 == null) {
            sparkPopupSchemaParam3 = null;
        }
        if (sparkPopupSchemaParam3.getIgnoreKeyboardStatusChange() || !this.LLJLLIL) {
            return c20246014JuLJIIL;
        }
        int i4 = this.LLJZ;
        int i5 = i - i4;
        int i6 = this.LL;
        if (i5 > i6) {
            dS(Math.abs(i5));
            this.LLJL = Math.abs(i5);
            if (getActivity() != null && (view2 = getView()) != null) {
                SparkPopupSchemaParam sparkPopupSchemaParam4 = this.LLJI;
                if (sparkPopupSchemaParam4 == null) {
                    sparkPopupSchemaParam4 = null;
                }
                if (!sparkPopupSchemaParam4.getSelfAdaptiveHeight() || this.LLJLILLLLZIIL) {
                    int iLIZ = C1549340qQ8.LIZ(WR(), view2, this);
                    if (this.LLJJIJI == 0) {
                        SparkPopupSchemaParam sparkPopupSchemaParam5 = this.LLJI;
                        if (sparkPopupSchemaParam5 == null) {
                            sparkPopupSchemaParam5 = null;
                        }
                        if (sparkPopupSchemaParam5.getSelfAdaptiveHeight()) {
                            SparkPopupSchemaParam sparkPopupSchemaParam6 = this.LLJI;
                            if (sparkPopupSchemaParam6 == null) {
                                sparkPopupSchemaParam6 = null;
                            }
                            measuredHeight = sparkPopupSchemaParam6.getHeight();
                            int iVR = iLIZ - VR(null);
                            if (measuredHeight > iVR) {
                                measuredHeight = iVR;
                            }
                            if (measuredHeight < 0) {
                                measuredHeight = 0;
                            }
                        } else {
                            LinearLayout linearLayout = this.LLILLL;
                            if (linearLayout == null) {
                                linearLayout = null;
                            }
                            measuredHeight = linearLayout.getMeasuredHeight();
                        }
                        this.LLJJIJI = measuredHeight;
                    }
                    int i7 = this.LLJJIJI;
                    int iVR2 = iLIZ - VR(null);
                    if (i7 > iVR2) {
                        i7 = iVR2;
                    }
                    LinearLayout linearLayout2 = this.LLILLL;
                    if (linearLayout2 == null) {
                        linearLayout2 = null;
                    }
                    ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = i7;
                    }
                    int iAS = i7 - aS();
                    C415540GRc c415540GRc = this.LLILZ;
                    if (c415540GRc == null) {
                        c415540GRc = null;
                    }
                    ViewGroup.LayoutParams layoutParams2 = c415540GRc.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = iAS;
                    }
                    if (!ZR().LJIIIIZZ()) {
                        LinearLayout linearLayout3 = this.LLILLL;
                        if (linearLayout3 == null) {
                            linearLayout3 = null;
                        }
                        int iLIZ2 = C1546200qL4.LIZ(linearLayout3) & 7;
                        LinearLayout linearLayout4 = this.LLILLL;
                        if (linearLayout4 == null) {
                            linearLayout4 = null;
                        }
                        C1546200qL4.LIZJ(iLIZ2 | 80, linearLayout4);
                    }
                    BottomSheetBehavior<LinearLayout> bottomSheetBehavior2 = this.LLJJ;
                    if (bottomSheetBehavior2 != null) {
                        bottomSheetBehavior2.LJJIII = true;
                        if (this.LLJJL == 0) {
                            this.LLJJL = bottomSheetBehavior2.getPeekHeight();
                        }
                        BottomSheetBehavior<LinearLayout> bottomSheetBehavior3 = this.LLJJ;
                        if (bottomSheetBehavior3 == null) {
                            bottomSheetBehavior = null;
                        } else {
                            bottomSheetBehavior = bottomSheetBehavior3;
                        }
                        if (bottomSheetBehavior.LJJIIJ != 3) {
                            if (bottomSheetBehavior3 == null) {
                                bottomSheetBehavior3 = null;
                            }
                            bottomSheetBehavior3.setPeekHeight(iAS);
                        } else {
                            if (bottomSheetBehavior3 == null) {
                                bottomSheetBehavior3 = null;
                            }
                            bottomSheetBehavior3.LJIJJLI = iAS;
                        }
                    }
                }
                BottomSheetBehavior<LinearLayout> bottomSheetBehavior4 = this.LLJJ;
                if (bottomSheetBehavior4 != null && (z = bottomSheetBehavior4.LJIIZILJ)) {
                    bottomSheetBehavior4.LJJIII = true;
                    this.LLJLIL = z;
                    mS(false);
                    BottomSheetBehavior<LinearLayout> bottomSheetBehavior5 = this.LLJJ;
                    if (bottomSheetBehavior5 == null) {
                        bottomSheetBehavior5 = null;
                    }
                    bottomSheetBehavior5.setHideable(false);
                }
                LinearLayout linearLayout5 = this.LLILLL;
                if (linearLayout5 == null) {
                    linearLayout5 = null;
                }
                linearLayout5.requestLayout();
                C415540GRc c415540GRc2 = this.LLILZ;
                if (c415540GRc2 == null) {
                    c415540GRc2 = null;
                }
                c415540GRc2.requestLayout();
            }
            C1545970qKh c1545970qKhZR = ZR();
            Context contextLIZIZ = c1545970qKhZR.LIZIZ();
            if (contextLIZIZ != null && (resources2 = contextLIZIZ.getResources()) != null) {
                configuration2 = resources2.getConfiguration();
            } else {
                configuration2 = null;
            }
            c1545970qKhZR.LJIIJ(configuration2);
            UR(i);
            C1545970qKh c1545970qKhZR2 = ZR();
            SparkPopupSchemaParam sparkPopupSchemaParamNR = c1545970qKhZR2.LIZ.NR();
            if (sparkPopupSchemaParamNR != null && sparkPopupSchemaParamNR.getKeyboardAdjust() == 2) {
                c1545970qKhZR2.LIZ(null);
            }
            this.LLJZ = i;
            return c20246014JuLJIIL;
        }
        if (i4 - i > i6) {
            dS(-Math.abs(i5));
            this.LLJL = 0;
            if (getActivity() != null) {
                View view3 = getView();
                if (view3 != null) {
                    SparkPopupSchemaParam sparkPopupSchemaParam7 = this.LLJI;
                    if (sparkPopupSchemaParam7 == null) {
                        sparkPopupSchemaParam7 = null;
                    }
                    if (!sparkPopupSchemaParam7.getSelfAdaptiveHeight() || this.LLJLILLLLZIIL) {
                        LinearLayout linearLayout6 = this.LLILLL;
                        if (linearLayout6 == null) {
                            linearLayout6 = null;
                        }
                        ViewGroup.LayoutParams layoutParams3 = linearLayout6.getLayoutParams();
                        Window windowWR = WR();
                        getActivity();
                        SparkPopupSchemaParam sparkPopupSchemaParam8 = this.LLJI;
                        if (sparkPopupSchemaParam8 == null) {
                            sparkPopupSchemaParam8 = null;
                        }
                        layoutParams3.height = C1549340qQ8.LIZIZ(windowWR, sparkPopupSchemaParam8, this, false);
                        C415540GRc c415540GRc3 = this.LLILZ;
                        if (c415540GRc3 == null) {
                            c415540GRc3 = null;
                        }
                        ViewGroup.LayoutParams layoutParams4 = c415540GRc3.getLayoutParams();
                        LinearLayout linearLayout7 = this.LLILLL;
                        if (linearLayout7 == null) {
                            linearLayout7 = null;
                        }
                        layoutParams4.height = linearLayout7.getLayoutParams().height - aS();
                        BottomSheetBehavior<LinearLayout> bottomSheetBehavior6 = this.LLJJ;
                        if (bottomSheetBehavior6 != null) {
                            bottomSheetBehavior6.LJJIII = true;
                            if (bottomSheetBehavior6.LJJIIJ != 3) {
                                LinearLayout linearLayout8 = this.LLILLL;
                                if (linearLayout8 == null) {
                                    linearLayout8 = null;
                                }
                                bottomSheetBehavior6.setPeekHeight(linearLayout8.getLayoutParams().height);
                            } else {
                                LinearLayout linearLayout9 = this.LLILLL;
                                if (linearLayout9 == null) {
                                    linearLayout9 = null;
                                }
                                bottomSheetBehavior6.LJIJJLI = linearLayout9.getLayoutParams().height;
                            }
                        }
                        if (!ZR().LJIIIIZZ()) {
                            SparkPopupSchemaParam sparkPopupSchemaParam9 = this.LLJI;
                            if (sparkPopupSchemaParam9 == null) {
                                sparkPopupSchemaParam9 = null;
                            }
                            int iLIZIZ = C1546200qL4.LIZIZ(sparkPopupSchemaParam9, view3, this.LLLI);
                            LinearLayout linearLayout10 = this.LLILLL;
                            if (linearLayout10 == null) {
                                linearLayout10 = null;
                            }
                            C1546200qL4.LIZJ(iLIZIZ, linearLayout10);
                        }
                    }
                }
                BottomSheetBehavior<LinearLayout> bottomSheetBehavior7 = this.LLJJ;
                if (bottomSheetBehavior7 != null) {
                    bottomSheetBehavior7.LJJIII = true;
                    if (this.LLJLIL) {
                        mS(true);
                    }
                    BottomSheetBehavior<LinearLayout> bottomSheetBehavior8 = this.LLJJ;
                    if (bottomSheetBehavior8 == null) {
                        bottomSheetBehavior8 = null;
                    }
                    SparkPopupSchemaParam sparkPopupSchemaParam10 = this.LLJI;
                    if (sparkPopupSchemaParam10 == null) {
                        sparkPopupSchemaParam10 = null;
                    }
                    bottomSheetBehavior8.setHideable(sparkPopupSchemaParam10.getEnablePullDownClose());
                }
                C16G0 c16g0 = this.LLIZ;
                if (c16g0 != null) {
                    c16g0.requestLayout();
                }
            }
            C1545970qKh c1545970qKhZR3 = ZR();
            Context contextLIZIZ2 = c1545970qKhZR3.LIZIZ();
            if (contextLIZIZ2 != null && (resources = contextLIZIZ2.getResources()) != null) {
                configuration = resources.getConfiguration();
            } else {
                configuration = null;
            }
            c1545970qKhZR3.LJIIJ(configuration);
            UR(i);
            C1545970qKh c1545970qKhZR4 = ZR();
            SparkPopupSchemaParam sparkPopupSchemaParamNR2 = c1545970qKhZR4.LIZ.NR();
            if (sparkPopupSchemaParamNR2 != null && sparkPopupSchemaParamNR2.getKeyboardAdjust() == 2) {
                c1545970qKhZR4.LIZ(null);
            }
            this.LLJZ = i;
        }
        return c20246014JuLJIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024e  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkPopup.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void show(androidx.fragment.app.FragmentManager r18, java.lang.String r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkPopup.show(androidx.fragment.app.FragmentManager, java.lang.String):void");
    }

    public final void hS(Context context, SparkContext sparkContext, InterfaceC1538950q9N interfaceC1538950q9N) {
        C1530030puz.LIZIZ("SparkPopupLoadingProcess", "SparkPopup preload", sparkContext);
        sparkContext.LJJ(InterfaceC1538940q9M.class, new InterfaceC1538940q9M() { // from class: X.0qXn
            @Override // X.InterfaceC1538940q9M
            public final void LIZ() {
            }

            @Override // X.InterfaceC1538940q9M
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1538940q9M
            public final void LJJ() {
                this.LIZ.LLJLILLLLZIIL = true;
            }
        });
        this.LLJILLL = cS();
        if (sparkContext.LJJIJLIJ() == null) {
            sparkContext.LJJJJJ(this);
        }
        SparkFragment sparkFragment = this.LLJILLL;
        if (sparkFragment != null) {
            sparkFragment.LLJ = true;
            sparkFragment.LLILZLL = sparkContext;
            sparkContext.LJJ(InterfaceC1538950q9N.class, interfaceC1538950q9N);
            sparkFragment.NR(sparkContext, context);
            sparkFragment.VR();
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0qY4] */
    public final void iS(final int i, final boolean z, final boolean z2) {
        View view;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        ViewTreeObserver viewTreeObserver3;
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior;
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior2;
        Window windowWR = WR();
        getActivity();
        SparkPopupSchemaParam sparkPopupSchemaParam = this.LLJI;
        SparkPopupSchemaParam sparkPopupSchemaParam2 = null;
        if (sparkPopupSchemaParam == null) {
            sparkPopupSchemaParam = null;
        }
        final int i2 = 0;
        int iLIZIZ = C1549340qQ8.LIZIZ(windowWR, sparkPopupSchemaParam, this, false);
        if (i > -1) {
            iLIZIZ = i;
        }
        if (z2 && (bottomSheetBehavior = this.LLJJ) != null && bottomSheetBehavior.getPeekHeight() != iLIZIZ) {
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior3 = this.LLJJ;
            if (bottomSheetBehavior3 == null) {
                bottomSheetBehavior2 = null;
            } else {
                bottomSheetBehavior2 = bottomSheetBehavior3;
            }
            if (bottomSheetBehavior2.LJJIIJ != 3) {
                if (bottomSheetBehavior3 == null) {
                    bottomSheetBehavior3 = null;
                }
                bottomSheetBehavior3.setPeekHeight(iLIZIZ);
            } else {
                if (bottomSheetBehavior3 == null) {
                    bottomSheetBehavior3 = null;
                }
                bottomSheetBehavior3.LJIJJLI = iLIZIZ;
            }
            LinearLayout linearLayout = this.LLILLL;
            if (linearLayout == null) {
                linearLayout = null;
            }
            linearLayout.requestLayout();
        }
        if (z) {
            final SparkPopupSchemaParam sparkPopupSchemaParam3 = this.LLJI;
            if (sparkPopupSchemaParam3 == null) {
                sparkPopupSchemaParam3 = null;
            }
            final C415540GRc c415540GRc = this.LLILZ;
            if (c415540GRc == null) {
                c415540GRc = null;
            }
            final Window windowWR2 = WR();
            final C19EG activity = getActivity();
            new InterfaceC1554280qY6(sparkPopupSchemaParam3, c415540GRc, this, windowWR2, activity, i2) { // from class: X.0qXu
                public final SparkPopupSchemaParam LIZ;
                public final View LIZIZ;
                public final SparkPopup LIZJ;
                public final Window LIZLLL;
                public final int LJ;

                @Override // X.InterfaceC1554280qY6
                public final void invoke() {
                    if (this.LIZ.getSelfAdaptiveHeight()) {
                        if (this.LIZJ.LLJZIJLIL) {
                            return;
                        }
                        this.LIZIZ.getLayoutParams().height = -2;
                        this.LIZIZ.requestLayout();
                        return;
                    }
                    int iLIZIZ2 = C1549340qQ8.LIZIZ(this.LIZLLL, this.LIZ, this.LIZJ, false);
                    ViewGroup.LayoutParams layoutParams = this.LIZIZ.getLayoutParams();
                    if (iLIZIZ2 >= 0) {
                        iLIZIZ2 += this.LJ;
                    }
                    layoutParams.height = iLIZIZ2;
                    this.LIZIZ.requestLayout();
                }

                {
                    this.LIZ = sparkPopupSchemaParam3;
                    this.LIZIZ = c415540GRc;
                    this.LIZJ = this;
                    this.LIZLLL = windowWR2;
                    this.LJ = i2;
                }
            }.invoke();
            final int iAS = aS();
            if (iAS < 0) {
                SparkPopupSchemaParam sparkPopupSchemaParam4 = this.LLJI;
                if (sparkPopupSchemaParam4 == null) {
                    sparkPopupSchemaParam4 = null;
                }
                if (sparkPopupSchemaParam4.getFixTopViewHeightIssue() && (view = this.LLJILJIL) != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
                    View view2 = this.LLJILJIL;
                    if (view2 != null && (viewTreeObserver3 = view2.getViewTreeObserver()) != null) {
                        ViewTreeObserverOnGlobalLayoutListenerC1554260qY4 viewTreeObserverOnGlobalLayoutListenerC1554260qY4 = this.LLJILJILJ;
                        viewTreeObserver3.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1554260qY4);
                        C2187701Ajg.LIZIZ(viewTreeObserver3, viewTreeObserverOnGlobalLayoutListenerC1554260qY4, ViewTreeObserver.OnGlobalLayoutListener.class);
                    }
                    this.LLJILJILJ = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0qY4
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            this.LL.iS(i, z, z2);
                        }
                    };
                    View view3 = this.LLJILJIL;
                    if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null) {
                        ViewTreeObserverOnGlobalLayoutListenerC1554260qY4 viewTreeObserverOnGlobalLayoutListenerC1554260qY42 = this.LLJILJILJ;
                        viewTreeObserver2.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1554260qY42);
                        C2187701Ajg.LIZ(viewTreeObserver2, viewTreeObserverOnGlobalLayoutListenerC1554260qY42, ViewTreeObserver.OnGlobalLayoutListener.class);
                    }
                }
            }
            final SparkPopupSchemaParam sparkPopupSchemaParam5 = this.LLJI;
            if (sparkPopupSchemaParam5 == null) {
                sparkPopupSchemaParam5 = null;
            }
            final LinearLayout linearLayout2 = this.LLILLL;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            final Window windowWR3 = WR();
            final C19EG activity2 = getActivity();
            new InterfaceC1554280qY6(sparkPopupSchemaParam5, linearLayout2, this, windowWR3, activity2, iAS) { // from class: X.0qXu
                public final SparkPopupSchemaParam LIZ;
                public final View LIZIZ;
                public final SparkPopup LIZJ;
                public final Window LIZLLL;
                public final int LJ;

                @Override // X.InterfaceC1554280qY6
                public final void invoke() {
                    if (this.LIZ.getSelfAdaptiveHeight()) {
                        if (this.LIZJ.LLJZIJLIL) {
                            return;
                        }
                        this.LIZIZ.getLayoutParams().height = -2;
                        this.LIZIZ.requestLayout();
                        return;
                    }
                    int iLIZIZ2 = C1549340qQ8.LIZIZ(this.LIZLLL, this.LIZ, this.LIZJ, false);
                    ViewGroup.LayoutParams layoutParams = this.LIZIZ.getLayoutParams();
                    if (iLIZIZ2 >= 0) {
                        iLIZIZ2 += this.LJ;
                    }
                    layoutParams.height = iLIZIZ2;
                    this.LIZIZ.requestLayout();
                }

                {
                    this.LIZ = sparkPopupSchemaParam5;
                    this.LIZIZ = linearLayout2;
                    this.LIZJ = this;
                    this.LIZLLL = windowWR3;
                    this.LJ = iAS;
                }
            }.invoke();
            SparkPopupSchemaParam sparkPopupSchemaParam6 = this.LLJI;
            if (sparkPopupSchemaParam6 == null) {
                sparkPopupSchemaParam6 = null;
            }
            if (sparkPopupSchemaParam6.getSelfAdaptiveHeight() && !this.LLJZIJLIL) {
                this.LLJZIJLIL = true;
            }
            SparkPopupSchemaParam sparkPopupSchemaParam7 = this.LLJI;
            if (sparkPopupSchemaParam7 != null) {
                sparkPopupSchemaParam2 = sparkPopupSchemaParam7;
            }
            if (sparkPopupSchemaParam2.getEnableUpdateScreenMetrics()) {
                C086F c086f = C086F.LIZ;
                ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(this, 199);
                c086f.getClass();
                C086F.LJII(aRunnableS123S0100000_23);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        AbstractC1539070q9Z abstractC1539070q9Z;
        InterfaceC20190413zK interfaceC20190413zK;
        C1554130qXr c1554130qXr = this.LLJJJ;
        c1554130qXr.getClass();
        c1554130qXr.LIZ(new AwS307S0000000_23(i, i2, intent, 0), this);
        super.onActivityResult(i, i2, intent);
        InterfaceC1387820mDc interfaceC1387820mDc = this.LLJJIJIL;
        if (interfaceC1387820mDc != null) {
            interfaceC1387820mDc.onActivityResult(i, i2, intent);
        }
        SparkContext sparkContext = this.LLJIJIL;
        if (sparkContext != null && (interfaceC20190413zK = (InterfaceC20190413zK) sparkContext.LJFF(InterfaceC20190413zK.class)) != null) {
            interfaceC20190413zK.onActivityResult(i, i2, intent);
        }
        SparkContext sparkContext2 = this.LLJIJIL;
        if (sparkContext2 != null && (abstractC1539070q9Z = (AbstractC1539070q9Z) sparkContext2.LJFF(AbstractC1539070q9Z.class)) != null) {
            do {
                abstractC1539070q9Z.onActivityResult(i, i2, intent);
                AbstractC1539070q9Z next = abstractC1539070q9Z.next();
                if (next != null && (next instanceof AbstractC1539070q9Z)) {
                    abstractC1539070q9Z = next;
                } else {
                    return;
                }
            } while (abstractC1539070q9Z != null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b9  */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0dtC, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r18, android.view.ViewGroup r19, android.os.Bundle r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkPopup.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C1554130qXr c1554130qXr = this.LLJJJ;
        c1554130qXr.getClass();
        c1554130qXr.LIZ(new AwS307S0000000_23(i, strArr, iArr, 3), this);
    }
}
