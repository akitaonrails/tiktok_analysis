package com.ss.android.ugc.aweme.spark;

import X.AbstractC1539010q9T;
import X.AbstractC1539070q9Z;
import X.AbstractC1893000zMQ;
import X.C01GW;
import X.C098200Yq;
import X.C1024630clp;
import X.C1041990dDp;
import X.C1051550dTF;
import X.C1058140dds;
import X.C1058250de3;
import X.C1161970gLL;
import X.C1530030puz;
import X.C1530570pvr;
import X.C1535630q41;
import X.C1537410q6t;
import X.C1537510q73;
import X.C1538050q7v;
import X.C1538200q8A;
import X.C1540240qBS;
import X.C1540320qBa;
import X.C1541950qED;
import X.C1542770qFX;
import X.C1542780qFY;
import X.C1545820qKS;
import X.C1546010qKl;
import X.C1546090qKt;
import X.C1546100qKu;
import X.C1546120qKw;
import X.C1546210qL5;
import X.C1546630qLl;
import X.C1546640qLm;
import X.C1546660qLo;
import X.C1546670qLp;
import X.C1546680qLq;
import X.C1546690qLr;
import X.C1548240qOM;
import X.C1685300txQ;
import X.C1725480v0E;
import X.C189200o6;
import X.C1893150zMf;
import X.C1893160zMg;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2217651Bqt;
import X.C2217691Bqx;
import X.C259800zU;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1537220q6a;
import X.EnumC1542040qEM;
import X.EnumC1546110qKv;
import X.EnumC21504619Dw;
import X.InterfaceC1056670dbV;
import X.InterfaceC1059280dfi;
import X.InterfaceC1387820mDc;
import X.InterfaceC1432560nNm;
import X.InterfaceC1541990qEH;
import X.InterfaceC1542060qEO;
import X.InterfaceC1542250qEh;
import X.InterfaceC1542320qEo;
import X.InterfaceC1542340qEq;
import X.InterfaceC1542380qEu;
import X.InterfaceC1542790qFZ;
import X.InterfaceC1545600qK6;
import X.InterfaceC1546650qLn;
import X.InterfaceC1554280qY6;
import X.InterfaceC1892990zMP;
import X.InterfaceC20190413zK;
import X.InterfaceC2217711Bqz;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ACListenerS168S0100000_34;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.spark.SparkSAFFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS323S0000000_34;
import kotlin.jvm.internal.AwS322S0000000_34;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS50S0102000_34;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS648S0100000_34;
import kotlin.jvm.internal.AwS69S0010000_34;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class SparkSAFFragment extends SAFTikTokFragment implements InterfaceC1059280dfi, InterfaceC1432560nNm, InterfaceC1546650qLn, ViewTreeObserver.OnGlobalLayoutListener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZjY8KD04ZhY8KD04GwQKDz0yLygpJzs=";
    public SparkContext LLJILLL;
    public InterfaceC1387820mDc LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public Integer LLJJIJIIJIL;
    public EnumC1546110qKv LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public ImmersionBar LLJJJJ;
    public SparkPageSchemaParam LLJJJJJIL;
    public SparkFragment LLJJJJLIIL;
    public InterfaceC1542790qFZ LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public String LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C2217651Bqt LLL;
    public C1545820qKS LLLF;
    public InterfaceC1056670dbV LLLFF;

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        mS(true);
        if (hS()) {
            return true;
        }
        C2217651Bqt c2217651Bqt = this.LLL;
        c2217651Bqt.getClass();
        AFwS323S0000000_34 aFwS323S0000000_34 = AFwS323S0000000_34.get$arr$(18);
        Iterator<InterfaceC2217711Bqz> it2 = c2217651Bqt.LIZ.iterator();
        while (it2.hasNext()) {
            if (((Boolean) aFwS323S0000000_34.invoke(it2.next(), this)).booleanValue()) {
                return true;
            }
        }
        return super.onBackPressed();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void finish() {
        if (Intrinsics.LJFF(C1535630q41.LIZIZ("fix_spark_saf_memory_leak"), Boolean.TRUE)) {
            if (isRemoving() || SL()) {
                return;
            }
            this.LLJJJJLIIL.finish();
            super.finish();
            C2217651Bqt c2217651Bqt = this.LLL;
            c2217651Bqt.getClass();
            c2217651Bqt.LIZ(this, AFwS323S0000000_34.get$arr$(15));
            C2217651Bqt c2217651Bqt2 = this.LLL;
            boolean z = this.LLJLILLLLZIIL;
            c2217651Bqt2.getClass();
            c2217651Bqt2.LIZ(this, new AwS69S0010000_34(z, 2));
            return;
        }
        C19EG activity = getActivity();
        if ((activity == null || !activity.isFinishing()) && !isRemoving()) {
            super.finish();
            C2217651Bqt c2217651Bqt3 = this.LLL;
            c2217651Bqt3.getClass();
            c2217651Bqt3.LIZ(this, AFwS323S0000000_34.get$arr$(15));
            C2217651Bqt c2217651Bqt4 = this.LLL;
            boolean z2 = this.LLJLILLLLZIIL;
            c2217651Bqt4.getClass();
            c2217651Bqt4.LIZ(this, new AwS69S0010000_34(z2, 2));
            this.LLJJJJLIIL.finish();
        }
    }

    public final View getRootView() {
        return (View) this.LLJLLIL.getValue();
    }

    public final void iS() {
        ImmersionBar immersionBar;
        C1530030puz.LIZIZ("SparkSAFFragment", "initStatusBar", this.LLJILLL);
        ImmersionBar immersionBarLJIILIIL = ImmersionBar.LJIILIIL(this, true);
        this.LLJJJJ = immersionBarLJIILIIL;
        if (this.LLJJIJI) {
            immersionBarLJIILIIL.LIZLLL(EnumC21504619Dw.FLAG_HIDE_STATUS_BAR);
        } else {
            immersionBarLJIILIIL.LIZLLL(EnumC21504619Dw.FLAG_SHOW_BAR);
        }
        Integer num = this.LLJJIJIIJIL;
        if (num != null) {
            int iIntValue = num.intValue();
            ImmersionBar immersionBar2 = this.LLJJJJ;
            if (immersionBar2 != null) {
                immersionBar2.LJFF.LL = iIntValue;
            }
        }
        EnumC1546110qKv enumC1546110qKv = this.LLJJIJIL;
        if (enumC1546110qKv != null) {
            ImmersionBar immersionBar3 = this.LLJJJJ;
            if (immersionBar3 != null) {
                immersionBar3.LJIIJ(enumC1546110qKv == EnumC1546110qKv.DARK);
            }
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
            if ((c1538050q7v == null || !c1538050q7v.getNeedIgnoreNavigationBarMode()) && (immersionBar = this.LLJJJJ) != null) {
                immersionBar.LJII(enumC1546110qKv == EnumC1546110qKv.DARK);
            }
        }
        if (this.LLJJJ) {
            ImmersionBar immersionBar4 = this.LLJJJJ;
            if (immersionBar4 != null) {
                immersionBar4.LJIIL();
            }
        } else {
            Integer num2 = this.LLJJIJIIJIL;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                ImmersionBar immersionBar5 = this.LLJJJJ;
                if (immersionBar5 != null) {
                    immersionBar5.LJFF.LL = iIntValue2;
                }
            }
        }
        if (this.LLJJJJJIL.getTransNavigationBar()) {
            ImmersionBar immersionBar6 = this.LLJJJJ;
            if (immersionBar6 != null) {
                immersionBar6.LJIIJJI();
            }
        } else {
            C1058140dds navigationBarBgColor = this.LLJJJJJIL.getNavigationBarBgColor();
            if (navigationBarBgColor != null) {
                Context context = getContext();
                SparkContext sparkContext = this.LLJILLL;
                int color = navigationBarBgColor.getColor(context, sparkContext != null ? sparkContext.LJJJIL() : null);
                ImmersionBar immersionBar7 = this.LLJJJJ;
                if (immersionBar7 != null) {
                    immersionBar7.LJFF.LLILLJJLI = color;
                }
            }
        }
        View rootView = getRootView();
        if (rootView != null) {
            rootView.setFitsSystemWindows((this.LLJJJ || this.LLJJJJJIL.getTransNavigationBar()) ? false : true);
        }
        C1540240qBS c1540240qBS = C1540240qBS.LIZ;
        View rootView2 = getRootView();
        SparkPageSchemaParam sparkPageSchemaParam = this.LLJJJJJIL;
        boolean z = this.LLJJJ;
        c1540240qBS.getClass();
        C1540240qBS.LIZ(rootView2, sparkPageSchemaParam, z);
        ImmersionBar immersionBar8 = this.LLJJJJ;
        if (immersionBar8 != null) {
            immersionBar8.LJ();
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        List<InterfaceC2217711Bqz> list;
        Unit unit;
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        boolean zLJFF = Intrinsics.LJFF(C1535630q41.LIZIZ("fix_spark_saf_memory_leak"), Boolean.TRUE);
        C2217651Bqt c2217651Bqt = this.LLL;
        c2217651Bqt.getClass();
        c2217651Bqt.LIZ(this, AFwS323S0000000_34.get$arr$(6));
        super.onDestroy();
        if (zLJFF) {
            SparkContext sparkContext = this.LLJILLL;
            if (sparkContext != null) {
                sparkContext.LJJIII(InterfaceC1542340qEq.class);
            }
            SparkContext sparkContext2 = this.LLJILLL;
            if (sparkContext2 != null) {
                sparkContext2.LJJIII(InterfaceC1542380qEu.class);
            }
            SparkContext sparkContext3 = this.LLJILLL;
            if (sparkContext3 != null) {
                sparkContext3.LJJIII(InterfaceC1542320qEo.class);
            }
            SparkContext sparkContext4 = this.LLJILLL;
            if (sparkContext4 != null) {
                sparkContext4.LJJIII(InterfaceC1892990zMP.class);
            }
            SparkContext sparkContext5 = this.LLJILLL;
            if (sparkContext5 != null) {
                sparkContext5.LJJIII(InterfaceC1542250qEh.class);
            }
            SparkContext sparkContext6 = this.LLJILLL;
            if (sparkContext6 != null) {
                sparkContext6.LJJIII(C1545820qKS.class);
            }
            SparkContext sparkContext7 = this.LLJILLL;
            if (sparkContext7 != null) {
                sparkContext7.LJJIII(InterfaceC1542790qFZ.class);
            }
            SparkContext sparkContext8 = this.LLJILLL;
            if (sparkContext8 != null) {
                sparkContext8.LJJIII(AbstractC1539010q9T.class);
            }
            SparkContext sparkContext9 = this.LLJILLL;
            if (sparkContext9 != null) {
                sparkContext9.LJJIII(InterfaceC1059280dfi.class);
            }
        }
        C2217651Bqt c2217651Bqt2 = this.LLL;
        c2217651Bqt2.getClass();
        c2217651Bqt2.LIZ(this, AFwS323S0000000_34.get$arr$(21));
        try {
            C19EG activity = getActivity();
            if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewTreeObserver = decorView.getViewTreeObserver()) == null) {
                unit = null;
            } else {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                C2187701Ajg.LIZIZ(viewTreeObserver, this, ViewTreeObserver.OnGlobalLayoutListener.class);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1545820qKS c1545820qKS = this.LLLF;
        if (c1545820qKS != null && (list = c1545820qKS.LL) != null) {
            Iterator<InterfaceC2217711Bqz> it2 = list.iterator();
            while (it2.hasNext()) {
                this.LLL.LIZ.remove(it2.next());
            }
        }
        if (zLJFF) {
            return;
        }
        C19EG activity2 = getActivity();
        if ((activity2 == null || !activity2.isFinishing()) && !isRemoving()) {
            return;
        }
        this.LLJJJJLIIL.finish();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        Window window;
        View decorView;
        Rect rect = new Rect();
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        int i = rect.bottom;
        int i2 = this.LLJLIL;
        if (i2 == 0) {
            this.LLJLIL = i;
            return;
        }
        if (i2 == i) {
            return;
        }
        if (i2 - i > 100) {
            kS(Math.abs(i - i2));
            this.LLJLIL = i;
        } else if (i - i2 > 100) {
            kS(-Math.abs(i - i2));
            this.LLJLIL = i;
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C2217651Bqt c2217651Bqt = this.LLL;
        c2217651Bqt.getClass();
        c2217651Bqt.LIZ(this, AFwS323S0000000_34.get$arr$(8));
        super.onPause();
        C2217651Bqt c2217651Bqt2 = this.LLL;
        c2217651Bqt2.getClass();
        c2217651Bqt2.LIZ(this, AFwS323S0000000_34.get$arr$(23));
        this.LLJJJJLIIL.onFragmentHide();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C2217651Bqt c2217651Bqt = this.LLL;
        c2217651Bqt.getClass();
        c2217651Bqt.LIZ(this, AFwS323S0000000_34.get$arr$(9));
        super.onResume();
        iS();
        C2217651Bqt c2217651Bqt2 = this.LLL;
        c2217651Bqt2.getClass();
        c2217651Bqt2.LIZ(this, AFwS323S0000000_34.get$arr$(24));
        this.LLJJJJLIIL.onFragmentShow();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        C2217651Bqt c2217651Bqt = this.LLL;
        c2217651Bqt.getClass();
        c2217651Bqt.LIZ(this, AFwS323S0000000_34.get$arr$(12));
        super.onStart();
        C2217651Bqt c2217651Bqt2 = this.LLL;
        c2217651Bqt2.getClass();
        c2217651Bqt2.LIZ(this, AFwS323S0000000_34.get$arr$(27));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        C2217651Bqt c2217651Bqt = this.LLL;
        c2217651Bqt.getClass();
        c2217651Bqt.LIZ(this, AFwS323S0000000_34.get$arr$(13));
        super.onStop();
        C2217651Bqt c2217651Bqt2 = this.LLL;
        c2217651Bqt2.getClass();
        c2217651Bqt2.LIZ(this, AFwS323S0000000_34.get$arr$(3));
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
        C1530030puz.LIZIZ("SparkSAFFragment", "refresh", this.LLJILLL);
        this.LLJJJJLIIL.refresh();
    }

    public SparkSAFFragment() {
        C1541950qED.LIZJ.LJIIL();
        aS(new AwS611S0100000_32(this, 174));
        this.LLJJJJJIL = new SparkPageSchemaParam(null, 1, null);
        this.LLJJJJLIIL = new SparkFragment();
        this.LLJLILLLLZIIL = true;
        this.LLJLLIL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 87));
        this.LLJLLL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 89));
        this.LLJZ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 88));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 86));
        this.LLL = new C2217651Bqt();
        this.LLLFF = new InterfaceC1056670dbV(this) { // from class: X.18Kt
            public final C01GW LL;

            @Override // X.InterfaceC1056670dbV
            public final int LJJIJ() {
                return R.id.a5n;
            }

            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC1056670dbV
            public final ViewGroup LJIILIIL() {
                return (ViewGroup) ((View) this.LL.getValue()).findViewById(R.id.s8s);
            }

            @Override // X.InterfaceC1056670dbV
            public final ViewGroup LJIJJ() {
                return (ViewGroup) ((View) this.LL.getValue()).findViewById(R.id.y0b);
            }

            {
                this.LL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 335));
            }

            @Override // X.InterfaceC1056670dbV
            public final View LJIILJJIL(Context context) {
                return (View) this.LL.getValue();
            }
        };
    }

    public final boolean hS() {
        String str;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceBlockBackPress: ");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append(", disableBackPress:");
        sbLIZ.append(this.LLJJIII);
        sbLIZ.append(", disableHardwareBackPress:");
        sbLIZ.append(false);
        sbLIZ.append(", disableNavigateBackPress:");
        sbLIZ.append(false);
        C1530030puz.LIZIZ("SparkSAFFragment", C2188811AlT.LIZIZ(sbLIZ), this.LLJILLL);
        if (this.LLJJI) {
            return true;
        }
        Map<String, Boolean> map = C1024630clp.LLILLL;
        SparkContext sparkContext = this.LLJILLL;
        if (sparkContext == null || (str = sparkContext.containerId) == null) {
            str = "";
        }
        if (C1051550dTF.LIZ(this.LLJJJJLIIL.getKitView(), C1051550dTF.LIZIZ(str), this.LLJJJJJIL.getBlockBackPress())) {
            return true;
        }
        SparkFragment sparkFragment = this.LLJJJJLIIL;
        SparkSchemaParam sparkSchemaParam = sparkFragment.LLIZ;
        return ((sparkSchemaParam == null || !sparkSchemaParam.getEnableLiteMode()) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkFragment.LLILLL) != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIII()) || this.LLJJIII;
    }

    @Override // X.InterfaceC1546650qLn
    public final SparkContext LLIILZL() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() {
        finish();
    }

    @Override // X.InterfaceC1546650qLn
    public final SparkFragment getSparkFragment() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1546650qLn
    public final boolean k9() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1546650qLn
    public final void HG(boolean z) {
        this.LLJJIII = z;
    }

    @Override // X.InterfaceC1546650qLn
    public final void Ip(boolean z) {
        this.LLJJJIL = z;
    }

    @Override // X.InterfaceC1432560nNm
    public final void KF(InterfaceC1387820mDc interfaceC1387820mDc) {
        this.LLJJ = interfaceC1387820mDc;
    }

    @Override // X.InterfaceC1546650qLn
    public final void Ux(EnumC1546110qKv enumC1546110qKv) {
        this.LLJJIJIL = enumC1546110qKv;
    }

    @Override // X.InterfaceC1546650qLn
    public final void fh(boolean z) {
        this.LLJJI = z;
    }

    @Override // X.InterfaceC1546650qLn
    public final void g5(boolean z) {
        this.LLJJIJI = z;
    }

    @Override // X.InterfaceC1546650qLn
    public final void h9(boolean z) {
        this.LLJJJ = z;
    }

    public final void kS(int i) throws JSONException {
        boolean z;
        Integer numValueOf;
        if (i > 0) {
            z = true;
        } else {
            z = false;
            i = 0;
        }
        Context context = getContext();
        if (context != null) {
            C1546210qL5.LIZ.getClass();
            numValueOf = Integer.valueOf(C1546210qL5.LJIIL(i, context));
        } else {
            numValueOf = null;
        }
        InterfaceC1541990qEH kitView = this.LLJJJJLIIL.getKitView();
        if (kitView != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("visible", z);
            jSONObject.put("height", numValueOf);
            kitView.LIZ("keyboardStatusChange", jSONObject);
        }
    }

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
        this.LLJLILLLLZIIL = z;
        finish();
        this.LLJLILLLLZIIL = true;
    }

    public final void mS(boolean z) {
        String str;
        String str2;
        if (z) {
            str = "hardwareBackPress";
        } else {
            str = "navBarBackPress";
        }
        JSONObject jSONObject = new JSONObject();
        SparkContext sparkContext = this.LLJILLL;
        if (sparkContext != null) {
            str2 = sparkContext.containerId;
        } else {
            str2 = null;
        }
        jSONObject.put("containerId", str2);
        jSONObject.put("actionFrom", str);
        InterfaceC1541990qEH kitView = this.LLJJJJLIIL.getKitView();
        if (kitView != null) {
            kitView.LIZ("sparkPageBackEvent", jSONObject);
        }
        InterfaceC1541990qEH kitView2 = this.LLJJJJLIIL.getKitView();
        if (kitView2 != null) {
            kitView2.LIZ("pageFinishBackEvent", jSONObject);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C2217651Bqt c2217651Bqt = this.LLL;
        Context context2 = getContext();
        Iterator<InterfaceC2217711Bqz> it2 = c2217651Bqt.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(context2);
        }
        super.onAttach(context);
        C2217651Bqt c2217651Bqt2 = this.LLL;
        getContext();
        Iterator<InterfaceC2217711Bqz> it3 = c2217651Bqt2.LIZ.iterator();
        while (it3.hasNext()) {
            it3.next().LJIIL();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2217651Bqt c2217651Bqt = this.LLL;
        c2217651Bqt.getClass();
        c2217651Bqt.LIZ(this, new AwS648S0100000_34(configuration, 19));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        C1545820qKS c1545820qKS;
        InterfaceC1542790qFZ interfaceC1542790qFZ;
        C1725480v0E c1725480v0ELJJJJI;
        SparkPageSchemaParam sparkPageSchemaParam;
        SparkContext sparkContext;
        T tLJFF;
        String str;
        String str2;
        Object c098200Yq;
        Window window;
        Window window2;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        String str3;
        View viewLJFF;
        InterfaceC1892990zMP interfaceC1892990zMP;
        InterfaceC1542250qEh interfaceC1542250qEh;
        View viewLIZIZ;
        InterfaceC1542060qEO interfaceC1542060qEO;
        C1546120qKw c1546120qKwLJFF;
        T tLJFF2;
        T tLIZJ;
        InterfaceC1545600qK6 interfaceC1545600qK6LIZLLL;
        boolean z;
        Drawable background;
        int color;
        C19EG activity;
        Integer numLIZIZ;
        int iIntValue;
        C19EG activity2;
        Window window3;
        View decorView2;
        Window window4;
        View decorView3;
        ViewParent parent;
        InterfaceC1056670dbV interfaceC1056670dbV;
        SparkSchemaParam sparkSchemaParamLJJJI;
        List<InterfaceC2217711Bqz> list;
        int i;
        String string2;
        String string3;
        C1530030puz.LIZIZ("SparkSAFFragment", "onCreate", this.LLJILLL);
        C1041990dDp c1041990dDp = C1041990dDp.LIZ;
        Bundle arguments = getArguments();
        View viewFindViewById = null;
        if (arguments != null) {
            string = arguments.getString("SparkContextContainerId");
        } else {
            string = null;
        }
        c1041990dDp.getClass();
        SparkContext sparkContextLIZ = C1041990dDp.LIZ(string);
        this.LLJILLL = sparkContextLIZ;
        if (sparkContextLIZ == null) {
            if (bundle != null) {
                string2 = bundle.getString("sparkInsureUrl");
            } else {
                string2 = null;
            }
            this.LLJLL = string2;
            if (bundle != null) {
                string3 = bundle.getString("sparkInsureRuntimeInfo");
            } else {
                string3 = null;
            }
            Map map = (Map) C1058250de3.LIZ(string3, Map.class);
            String str4 = this.LLJLL;
            if (str4 != null) {
                SparkContext sparkContext2 = new SparkContext();
                sparkContext2.LJJLIIJ(str4);
                for (Map.Entry entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        sparkContext2.LJJLIIIJ(value, String.valueOf(entry.getKey()));
                    }
                }
                C1041990dDp.LIZ.getClass();
                C1041990dDp.LIZJ(sparkContext2);
                this.LLJILLL = sparkContext2;
            }
        } else {
            String strLJIJI = sparkContextLIZ.LJIJI();
            if (strLJIJI == null) {
                strLJIJI = "";
            }
            this.LLJLL = strLJIJI;
        }
        SparkContext sparkContext3 = this.LLJILLL;
        if (sparkContext3 != null) {
            sparkContext3.uiType = EnumC1542040qEM.PAGE;
        }
        if (Intrinsics.LJFF(C1535630q41.LIZIZ("fix_spark_issues_when_recreate"), Boolean.TRUE) && bundle != null) {
            SparkContext sparkContext4 = this.LLJILLL;
            if (sparkContext4 != null) {
                sparkContext4.LJJJZ("isSAFRecreated", "1");
            }
            Context context = getContext();
            if (context != null) {
                C1541950qED.LIZJ.LIZLLL(this.LLJILLL, context, -1);
            }
        }
        C1530570pvr.LIZJ(this.LLJILLL, new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_CONTAINER_ENV_PREPARE_START, EnumC1537220q6a.CREATE_SPARK_END, EnumC1537220q6a.CONTAINER_INIT_END, EnumC1537220q6a.PREPARE_OUTSIDE_CONTAINER_END}, null);
        SparkContext sparkContext5 = this.LLJILLL;
        if (sparkContext5 != null) {
            sparkContext5.LJFF(C1538200q8A.class);
        }
        SparkContext sparkContext6 = this.LLJILLL;
        if (sparkContext6 != null) {
            HashMap map2 = new HashMap();
            if (bundle != null) {
                i = 1;
            } else {
                i = 0;
            }
            map2.put("isRecreated", Integer.valueOf(i));
            sparkContext6.LJJLIIIJILLIZJL(map2);
        }
        SparkContext sparkContext7 = this.LLJILLL;
        if (sparkContext7 != null) {
            c1545820qKS = (C1545820qKS) sparkContext7.LJFF(C1545820qKS.class);
        } else {
            c1545820qKS = null;
        }
        this.LLLF = c1545820qKS;
        if (c1545820qKS != null && (list = c1545820qKS.LL) != null) {
            Iterator<InterfaceC2217711Bqz> it2 = list.iterator();
            while (it2.hasNext()) {
                this.LLL.LIZ.add(it2.next());
            }
        }
        C2217651Bqt c2217651Bqt = this.LLL;
        c2217651Bqt.getClass();
        c2217651Bqt.LIZ(this, new AwS322S0000000_34(bundle, 0));
        SparkContext sparkContext8 = this.LLJILLL;
        if (sparkContext8 != null) {
            interfaceC1542790qFZ = (InterfaceC1542790qFZ) sparkContext8.LJFF(InterfaceC1542790qFZ.class);
        } else {
            interfaceC1542790qFZ = null;
        }
        this.LLJJL = interfaceC1542790qFZ;
        if (interfaceC1542790qFZ != null) {
            c1725480v0ELJJJJI = interfaceC1542790qFZ.LJJJJI();
        } else {
            c1725480v0ELJJJJI = null;
        }
        SparkContext sparkContext9 = this.LLJILLL;
        if (sparkContext9 != null && (sparkSchemaParamLJJJI = sparkContext9.LJJJI(1)) != null && (sparkSchemaParamLJJJI instanceof SparkPageSchemaParam)) {
            sparkPageSchemaParam = (SparkPageSchemaParam) sparkSchemaParamLJJJI;
        } else {
            sparkPageSchemaParam = new SparkPageSchemaParam(null, 1, null);
        }
        this.LLJJJJJIL = sparkPageSchemaParam;
        SparkContext sparkContext10 = this.LLJILLL;
        if (sparkContext10 != null && (interfaceC1056670dbV = (InterfaceC1056670dbV) sparkContext10.LJFF(InterfaceC1056670dbV.class)) != null) {
            this.LLLFF = interfaceC1056670dbV;
        }
        super.onCreate(bundle);
        View rootView = getRootView();
        if (rootView != null && (parent = rootView.getParent()) != null && (parent instanceof ViewGroup)) {
            C786410Ut5.LJJJLZIJ(getRootView(), (ViewGroup) parent);
        }
        InterfaceC1542060qEO interfaceC1542060qEO2 = C1546010qKl.LIZ;
        if (interfaceC1542060qEO2 != null && (interfaceC1545600qK6LIZLLL = interfaceC1542060qEO2.LIZLLL()) != null && C1540320qBa.LIZ) {
            boolean zLJIJI = u.LJIJI(this.LLJJJJJIL.getForceThemeStyle(), "light", true);
            if (!zLJIJI && (u.LJIJI(this.LLJJJJJIL.getForceThemeStyle(), "dark", true) || interfaceC1545600qK6LIZLLL.LIZJ(getActivity()))) {
                z = true;
            } else {
                z = false;
            }
            C19EG activity3 = getActivity();
            if (activity3 != null && (window4 = activity3.getWindow()) != null && (decorView3 = window4.getDecorView()) != null) {
                background = decorView3.getBackground();
            } else {
                background = null;
            }
            if (background instanceof ColorDrawable) {
                color = ((ColorDrawable) background).getColor();
            } else {
                color = 0;
            }
            if (zLJIJI) {
                C19EG activity4 = getActivity();
                if (activity4 != null) {
                    activity4.setTheme(interfaceC1545600qK6LIZLLL.LIZ());
                }
            } else if (z && (activity = getActivity()) != null) {
                activity.setTheme(interfaceC1545600qK6LIZLLL.LJ());
            }
            Context context2 = getContext();
            if (context2 != null && (numLIZIZ = interfaceC1545600qK6LIZLLL.LIZIZ(context2)) != null && color != (iIntValue = numLIZIZ.intValue()) && (activity2 = getActivity()) != null && (window3 = activity2.getWindow()) != null && (decorView2 = window3.getDecorView()) != null) {
                decorView2.setBackgroundColor(iIntValue);
            }
        }
        SparkContext sparkContext11 = this.LLJILLL;
        if ((sparkContext11 == null || sparkContext11.LJJIJLIJ() == null || Intrinsics.LJFF(C1535630q41.LIZIZ("fix_spark_issues_when_recreate"), Boolean.TRUE)) && (sparkContext = this.LLJILLL) != null) {
            sparkContext.LJJJJJ(this);
        }
        final C259800zU c259800zU = new C259800zU();
        SparkContext sparkContext12 = this.LLJILLL;
        if (sparkContext12 != null) {
            tLJFF = sparkContext12.LJFF(InterfaceC1892990zMP.class);
        } else {
            tLJFF = 0;
        }
        c259800zU.element = tLJFF;
        if (tLJFF == 0) {
            InterfaceC1542060qEO interfaceC1542060qEO3 = C1546010qKl.LIZ;
            if (interfaceC1542060qEO3 != null) {
                tLIZJ = interfaceC1542060qEO3.LIZJ();
            } else {
                tLIZJ = 0;
            }
            c259800zU.element = tLIZJ;
            SparkContext sparkContext13 = this.LLJILLL;
            if (sparkContext13 != null) {
                sparkContext13.LJJ(InterfaceC1892990zMP.class, tLIZJ);
            }
        }
        final C259800zU c259800zU2 = new C259800zU();
        if (!this.LLJJJJJIL.getHideLoading() && (interfaceC1542060qEO = C1546010qKl.LIZ) != null && (c1546120qKwLJFF = interfaceC1542060qEO.LJFF()) != null && c1546120qKwLJFF.LIZJ) {
            SparkContext sparkContext14 = this.LLJILLL;
            if (sparkContext14 != null) {
                tLJFF2 = sparkContext14.LJFF(InterfaceC1542250qEh.class);
            } else {
                tLJFF2 = 0;
            }
            c259800zU2.element = tLJFF2;
            if (tLJFF2 == 0) {
                InterfaceC1542060qEO interfaceC1542060qEO4 = C1546010qKl.LIZ;
                if (interfaceC1542060qEO4 != null) {
                    interfaceC1542060qEO4.LIZ();
                }
                c259800zU2.element = null;
                SparkContext sparkContext15 = this.LLJILLL;
                if (sparkContext15 != null) {
                    sparkContext15.LJJ(InterfaceC1542250qEh.class, null);
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.LLJZIJLIL.getValue();
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        Context context3 = getContext();
        if (context3 != null && (interfaceC1542250qEh = (InterfaceC1542250qEh) c259800zU2.element) != null && (viewLIZIZ = interfaceC1542250qEh.LIZIZ(context3)) != null) {
            ViewParent parent2 = viewLIZIZ.getParent();
            if (parent2 != null && (parent2 instanceof ViewGroup)) {
                C786410Ut5.LJJJLZIJ(viewLIZIZ, (ViewGroup) parent2);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.LLJZIJLIL.getValue();
            if (viewGroup2 != null) {
                viewGroup2.addView(viewLIZIZ);
            }
            InterfaceC1542250qEh interfaceC1542250qEh2 = (InterfaceC1542250qEh) c259800zU2.element;
            if (interfaceC1542250qEh2 != null) {
                interfaceC1542250qEh2.setProgress(5);
            }
        }
        C786410Ut5.LJJJJI((ViewGroup) this.LLJLLL.getValue());
        SparkContext sparkContext16 = this.LLJILLL;
        if (sparkContext16 != null) {
            T t = c259800zU.element;
            if (t instanceof AbstractC1893000zMQ) {
                ((AbstractC1893000zMQ) t).LIZ(sparkContext16);
            }
        }
        if (!this.LLJJJJJIL.getHideNavBar() && (!this.LLJJJJJIL.getTransStatusBar() || this.LLJJJJJIL.getShowNavBarInTransStatusBar())) {
            Context context4 = getContext();
            if (context4 != null && (interfaceC1892990zMP = (InterfaceC1892990zMP) c259800zU.element) != null) {
                viewLJFF = interfaceC1892990zMP.LJFF(context4);
            } else {
                viewLJFF = null;
            }
            C1530030puz.LIZIZ("time_consuming_optimization", "getTitleBarView", this.LLJILLL);
            if (viewLJFF != null) {
                ViewParent parent3 = viewLJFF.getParent();
                if (parent3 != null && (parent3 instanceof ViewGroup)) {
                    C786410Ut5.LJJJLZIJ(viewLJFF, (ViewGroup) parent3);
                }
                ((ViewGroup) this.LLJLLL.getValue()).addView(viewLJFF);
            }
        }
        Object objLIZIZ = C1535630q41.LIZIZ("fix_spark_saf_memory_leak");
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(objLIZIZ, bool)) {
            final WeakReference weakReference = new WeakReference(c259800zU.element);
            final boolean useWebviewTitle = this.LLJJJJJIL.getUseWebviewTitle();
            final String title = this.LLJJJJJIL.getTitle();
            final boolean showWebUrl = this.LLJJJJJIL.getShowWebUrl();
            final SparkContext sparkContext17 = this.LLJILLL;
            if (sparkContext17 != null) {
                sparkContext17.LJJLIL(new InterfaceC1542320qEo() { // from class: X.1Bqr
                    @Override // X.InterfaceC1542320qEo
                    public final void LIZJ(String str5, boolean z2) {
                    }

                    @Override // X.InterfaceC1542320qEo
                    public final void LIZ(String str5) {
                        InterfaceC1892990zMP interfaceC1892990zMP2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onReceivedSubTitle ");
                        sbLIZ.append(str5);
                        sbLIZ.append(" showWebUrl = ");
                        sbLIZ.append(showWebUrl);
                        C1530030puz.LIZIZ("SparkSAFFragment", C2188811AlT.LIZIZ(sbLIZ), sparkContext17);
                        if (showWebUrl && !TextUtils.isEmpty(str5) && (interfaceC1892990zMP2 = weakReference.get()) != null) {
                            interfaceC1892990zMP2.setSubTitle(str5);
                        }
                    }

                    @Override // X.InterfaceC1542320qEo
                    public final void LIZIZ(String str5) {
                        InterfaceC1892990zMP interfaceC1892990zMP2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onReceivedTitle ");
                        sbLIZ.append(str5);
                        sbLIZ.append(" useWebTitle = ");
                        sbLIZ.append(useWebviewTitle);
                        C1530030puz.LIZIZ("SparkSAFFragment", C2188811AlT.LIZIZ(sbLIZ), sparkContext17);
                        if (useWebviewTitle && !TextUtils.isEmpty(str5) && TextUtils.isEmpty(title) && (interfaceC1892990zMP2 = weakReference.get()) != null) {
                            if (str5 == null) {
                                str5 = "";
                            }
                            interfaceC1892990zMP2.setTitle(str5);
                        }
                    }
                });
            }
        } else {
            SparkContext sparkContext18 = this.LLJILLL;
            if (sparkContext18 != null) {
                sparkContext18.LJJLIL(new InterfaceC1542320qEo() { // from class: X.1Bqq
                    @Override // X.InterfaceC1542320qEo
                    public final void LIZJ(String str5, boolean z2) {
                    }

                    @Override // X.InterfaceC1542320qEo
                    public final void LIZ(String str5) {
                        InterfaceC1892990zMP interfaceC1892990zMP2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onReceivedSubTitle ");
                        sbLIZ.append(str5);
                        sbLIZ.append(" showWebUrl = ");
                        sbLIZ.append(this.LIZ.LLJJJJJIL.getShowWebUrl());
                        C1530030puz.LIZIZ("SparkSAFFragment", C2188811AlT.LIZIZ(sbLIZ), this.LIZ.LLJILLL);
                        if (this.LIZ.LLJJJJJIL.getShowWebUrl() && !TextUtils.isEmpty(str5) && (interfaceC1892990zMP2 = c259800zU.element) != null) {
                            interfaceC1892990zMP2.setSubTitle(str5);
                        }
                    }

                    @Override // X.InterfaceC1542320qEo
                    public final void LIZIZ(String str5) {
                        InterfaceC1892990zMP interfaceC1892990zMP2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onReceivedTitle ");
                        sbLIZ.append(str5);
                        sbLIZ.append(" useWebTitle = ");
                        sbLIZ.append(this.LIZ.LLJJJJJIL.getUseWebviewTitle());
                        C1530030puz.LIZIZ("SparkSAFFragment", C2188811AlT.LIZIZ(sbLIZ), this.LIZ.LLJILLL);
                        if (this.LIZ.LLJJJJJIL.getUseWebviewTitle() && !TextUtils.isEmpty(str5) && TextUtils.isEmpty(this.LIZ.LLJJJJJIL.getTitle()) && (interfaceC1892990zMP2 = c259800zU.element) != null) {
                            if (str5 == null) {
                                str5 = "";
                            }
                            interfaceC1892990zMP2.setTitle(str5);
                        }
                    }
                });
            }
        }
        SparkContext sparkContext19 = this.LLJILLL;
        if (sparkContext19 != null) {
            sparkContext19.LJJ(InterfaceC1542340qEq.class, new InterfaceC1542340qEq() { // from class: X.18Ks
                @Override // X.InterfaceC1542340qEq
                public final void qn() {
                    ViewGroup viewGroup3;
                    ViewGroup viewGroup4;
                    Window window5;
                    SparkSAFFragment sparkSAFFragment = this.LIZ;
                    sparkSAFFragment.LLJJIJI = sparkSAFFragment.LLJJLIIIJLLLLLLLZ;
                    sparkSAFFragment.LLJJJ = sparkSAFFragment.LLJL;
                    sparkSAFFragment.iS();
                    C19EG activity5 = this.LIZ.getActivity();
                    View decorView4 = null;
                    if (activity5 != null && (window5 = activity5.getWindow()) != null) {
                        decorView4 = window5.getDecorView();
                    }
                    if (!(decorView4 instanceof ViewGroup) || (viewGroup3 = (ViewGroup) decorView4) == null || (viewGroup4 = (ViewGroup) viewGroup3.findViewById(R.id.vs6)) == null) {
                        return;
                    }
                    C786410Ut5.LJJJLZIJ(viewGroup4, viewGroup3);
                    C786410Ut5.LJJJJI(viewGroup4);
                    C786410Ut5.LJLZ(8, viewGroup4);
                }

                @Override // X.InterfaceC1542340qEq
                public final void LIZ(View view) {
                    View decorView4;
                    ViewGroup viewGroup3;
                    ViewGroup viewGroup4;
                    Window window5;
                    SparkSAFFragment sparkSAFFragment = this.LIZ;
                    sparkSAFFragment.LLJJLIIIJLLLLLLLZ = sparkSAFFragment.LLJJIJI;
                    sparkSAFFragment.LLJL = sparkSAFFragment.LLJJJ;
                    sparkSAFFragment.LLJJIJI = true;
                    sparkSAFFragment.LLJJJ = true;
                    sparkSAFFragment.iS();
                    C19EG activity5 = this.LIZ.getActivity();
                    FrameLayout frameLayout = null;
                    if (activity5 != null && (window5 = activity5.getWindow()) != null) {
                        decorView4 = window5.getDecorView();
                    } else {
                        decorView4 = null;
                    }
                    if (decorView4 instanceof ViewGroup) {
                        viewGroup3 = (ViewGroup) decorView4;
                    } else {
                        viewGroup3 = null;
                    }
                    if (viewGroup3 != null) {
                        viewGroup4 = (ViewGroup) viewGroup3.findViewById(R.id.vs6);
                    } else {
                        viewGroup4 = null;
                    }
                    if (viewGroup4 == null) {
                        Context context5 = this.LIZ.getContext();
                        if (context5 != null) {
                            frameLayout = new FrameLayout(context5);
                            frameLayout.setId(R.id.vs6);
                        }
                        if (viewGroup3 != null) {
                            viewGroup3.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                        }
                        viewGroup4 = frameLayout;
                        if (frameLayout == null) {
                            return;
                        }
                    }
                    C786410Ut5.LJLZ(0, viewGroup4);
                    viewGroup4.addView(view, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup4.requestLayout();
                }
            });
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkFragment#");
        SparkContext sparkContext20 = this.LLJILLL;
        if (sparkContext20 != null) {
            str = sparkContext20.containerId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Fragment fragmentLJJJJZI = getChildFragmentManager().LJJJJZI(strLIZIZ);
        if (fragmentLJJJJZI instanceof SparkFragment) {
            SparkFragment sparkFragment = (SparkFragment) fragmentLJJJJZI;
            this.LLJJJJLIIL = sparkFragment;
            Bundle arguments2 = sparkFragment.getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
            }
            SparkFragment sparkFragment2 = this.LLJJJJLIIL;
            SparkContext sparkContext21 = this.LLJILLL;
            if (sparkContext21 != null) {
                str3 = sparkContext21.containerId;
            } else {
                str3 = null;
            }
            C786410Ut5.LJJJI("SparkContextContainerId", str3, arguments2);
            sparkFragment2.setArguments(arguments2);
            this.LLJJJJLIIL.refresh();
        } else {
            C1530030puz.LIZIZ("SparkSAFFragment", "Create SparkFragment", this.LLJILLL);
            SparkFragment sparkFragment3 = new SparkFragment();
            this.LLJJJJLIIL = sparkFragment3;
            Bundle bundle2 = new Bundle();
            SparkContext sparkContext22 = this.LLJILLL;
            if (sparkContext22 != null) {
                str2 = sparkContext22.containerId;
            } else {
                str2 = null;
            }
            C786410Ut5.LJJJI("SparkContextContainerId", str2, bundle2);
            sparkFragment3.setArguments(bundle2);
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            if (fragmentLJJJJZI != null) {
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
            }
            c19ehLJIIJ.LIZJ(((Number) this.LLJZ.getValue()).intValue(), this.LLJJJJLIIL, strLIZIZ);
            if (Intrinsics.LJFF(C1535630q41.LIZIZ("sparkFragmentCommitNow"), bool)) {
                try {
                    c19ehLJIIJ.LJIIJJI();
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            } else {
                c19ehLJIIJ.LJIIJ();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1546660qLo(this.LLJJJJJIL, new WeakReference(this)));
        arrayList.add(new C1548240qOM(this.LLJJJJJIL, new WeakReference(c259800zU.element), this.LLJILLL));
        arrayList.add(new C2217691Bqx(this.LLJJJJJIL, (ViewGroup) this.LLJLLL.getValue()));
        arrayList.add(new C1893160zMg(this.LLJJJJJIL, (InterfaceC1892990zMP) c259800zU.element));
        arrayList.add(new C1546640qLm(this.LLJJJJJIL, this, (InterfaceC1892990zMP) c259800zU.element));
        arrayList.add(new C1546630qLl(this.LLJJJJJIL, this, (InterfaceC1892990zMP) c259800zU.element));
        arrayList.add(new C1893150zMf(this.LLJJJJJIL, (InterfaceC1892990zMP) c259800zU.element));
        arrayList.add(new C1546680qLq(this.LLJJJJJIL, this));
        arrayList.add(new C1546100qKu(this.LLJJJJJIL, this));
        arrayList.add(new C1546090qKt(this.LLJJJJJIL, this));
        arrayList.add(new C1542780qFY(this.LLJJJJJIL, this));
        arrayList.add(new C1546670qLp(this.LLJJJJJIL, this, (ViewGroup) this.LLJLLL.getValue()));
        arrayList.add(new C1542770qFX(this.LLJJJJJIL, getActivity()));
        arrayList.add(new C1546690qLr(this.LLJJJJJIL, this));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC1554280qY6) it3.next()).invoke();
        }
        C1540240qBS c1540240qBS = C1540240qBS.LIZ;
        C19EG activity5 = getActivity();
        if (activity5 != null) {
            window = activity5.getWindow();
        } else {
            window = null;
        }
        SparkPageSchemaParam sparkPageSchemaParam2 = this.LLJJJJJIL;
        View rootView2 = getRootView();
        if (rootView2 != null) {
            viewFindViewById = rootView2.findViewById(R.id.oc4);
        }
        c1540240qBS.getClass();
        C1540240qBS.LJIIIIZZ(window, sparkPageSchemaParam2, viewFindViewById, false);
        iS();
        InterfaceC1892990zMP interfaceC1892990zMP2 = (InterfaceC1892990zMP) c259800zU.element;
        if (interfaceC1892990zMP2 != null) {
            interfaceC1892990zMP2.setBackClickListener(new ACListenerS168S0100000_34(this, 22));
        }
        InterfaceC1892990zMP interfaceC1892990zMP3 = (InterfaceC1892990zMP) c259800zU.element;
        if (interfaceC1892990zMP3 != null) {
            interfaceC1892990zMP3.setCloseAllClickListener(new ACListenerS168S0100000_34(this, 23));
        }
        C19EG activity6 = getActivity();
        if (activity6 != null && (window2 = activity6.getWindow()) != null && (decorView = window2.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
            C2187701Ajg.LIZ(viewTreeObserver, this, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        SparkContext sparkContext23 = this.LLJILLL;
        if (sparkContext23 != null) {
            sparkContext23.LJJ(InterfaceC1542380qEu.class, new InterfaceC1542380qEu() { // from class: X.1Bqv
                @Override // X.InterfaceC1542380qEu
                public final void LIZ(View view) {
                    InterfaceC1542250qEh interfaceC1542250qEh3 = c259800zU2.element;
                    if (interfaceC1542250qEh3 != null) {
                        interfaceC1542250qEh3.setProgress(100);
                    }
                    if (view != null) {
                        view.requestLayout();
                    }
                }
            });
        }
        aS(new AwS398S0200000_32(this, c1725480v0ELJJJJI, 33));
        C2217651Bqt c2217651Bqt2 = this.LLL;
        c2217651Bqt2.getClass();
        c2217651Bqt2.LIZ(this, new AwS322S0000000_34(bundle, 4));
        C1530570pvr.LIZJ(this.LLJILLL, new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_CONTAINER_ENV_PREPARE_END}, null);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C2217651Bqt c2217651Bqt = this.LLL;
        c2217651Bqt.getClass();
        c2217651Bqt.LIZ(this, new AwS648S0100000_34(bundle, 22));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C1537510q73 c1537510q73;
        C2217651Bqt c2217651Bqt = this.LLL;
        c2217651Bqt.getClass();
        c2217651Bqt.LIZ(this, new AwS322S0000000_34(bundle, 1));
        super.onSaveInstanceState(bundle);
        C786410Ut5.LJJJI("sparkInsureUrl", this.LLJLL, bundle);
        SparkContext sparkContext = this.LLJILLL;
        if (sparkContext != null) {
            c1537510q73 = sparkContext.extraRuntimeInfo;
        } else {
            c1537510q73 = null;
        }
        C786410Ut5.LJJJI("sparkInsureRuntimeInfo", C1058250de3.LIZLLL(c1537510q73), bundle);
        C2217651Bqt c2217651Bqt2 = this.LLL;
        c2217651Bqt2.getClass();
        c2217651Bqt2.LIZ(this, new AwS322S0000000_34(bundle, 5));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C2217651Bqt c2217651Bqt = this.LLL;
        c2217651Bqt.getClass();
        c2217651Bqt.LIZ(this, new AwS322S0000000_34(z, 2));
    }

    @Override // X.InterfaceC1546650qLn
    public final void tH(Integer num) {
        this.LLJJIJIIJIL = num;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        iS();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View rootView = getRootView();
        C19GS c19gs = null;
        if (!(rootView instanceof View)) {
            rootView = null;
        }
        if (rootView != null) {
            try {
                ViewTreeLifecycleOwner.set(rootView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(rootView, this);
                rootView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return rootView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return rootView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C2217651Bqt c2217651Bqt = this.LLL;
        c2217651Bqt.getClass();
        c2217651Bqt.LIZ(this, new AwS322S0000000_34(i, strArr, iArr, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onResult(int i, int i2, Intent intent) {
        AbstractC1539070q9Z abstractC1539070q9Z;
        InterfaceC20190413zK interfaceC20190413zK;
        InterfaceC1387820mDc interfaceC1387820mDc = this.LLJJ;
        if (interfaceC1387820mDc != null) {
            interfaceC1387820mDc.onActivityResult(i, i2, intent);
        }
        SparkContext sparkContext = this.LLJILLL;
        if (sparkContext != null && (interfaceC20190413zK = (InterfaceC20190413zK) sparkContext.LJFF(InterfaceC20190413zK.class)) != null) {
            interfaceC20190413zK.onActivityResult(i, i2, intent);
        }
        SparkContext sparkContext2 = this.LLJILLL;
        if (sparkContext2 != null && (abstractC1539070q9Z = (AbstractC1539070q9Z) sparkContext2.LJFF(AbstractC1539070q9Z.class)) != null) {
            do {
                abstractC1539070q9Z.onActivityResult(i, i2, intent);
                T t = abstractC1539070q9Z.LL;
                if (t == 0 || !(t instanceof AbstractC1539070q9Z)) {
                    break;
                }
                abstractC1539070q9Z = (AbstractC1539070q9Z) t;
            } while (abstractC1539070q9Z != null);
        }
        C2217651Bqt c2217651Bqt = this.LLL;
        c2217651Bqt.getClass();
        c2217651Bqt.LIZ(this, new AwS50S0102000_34(i, i2, intent, 1));
        return super.onResult(i, i2, intent);
    }
}
