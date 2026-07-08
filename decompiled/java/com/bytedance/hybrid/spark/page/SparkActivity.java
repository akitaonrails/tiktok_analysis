package com.bytedance.hybrid.spark.page;

import X.AbstractC1539070q9Z;
import X.AbstractC1893000zMQ;
import X.C01GW;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
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
import X.C1541970qEF;
import X.C1542770qFX;
import X.C1542780qFY;
import X.C1545540qK0;
import X.C1545810qKR;
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
import X.C1725480v0E;
import X.C1743710vTd;
import X.C1845210y7L;
import X.C1848530yCh;
import X.C189200o6;
import X.C1893150zMf;
import X.C1893160zMg;
import X.C19EH;
import X.C19GS;
import X.C2188811AlT;
import X.C2217641Bqs;
import X.C2217681Bqw;
import X.C2217691Bqx;
import X.C259800zU;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1537220q6a;
import X.EnumC1542040qEM;
import X.EnumC1546110qKv;
import X.EnumC1743700vTc;
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
import X.InterfaceC2217701Bqy;
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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.nxet.ITracingService;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jv6.a;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS323S0000000_34;
import kotlin.jvm.internal.AwS50S0102000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS648S0100000_34;
import kotlin.jvm.internal.AwS69S0010000_34;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class SparkActivity extends C19GS implements InterfaceC1059280dfi, InterfaceC1432560nNm, InterfaceC1546650qLn, ViewTreeObserver.OnGlobalLayoutListener {
    public static final boolean LLJLIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWskMC0hISFiOjHELIOS8yOi5iOS40LWsfOS4hIwQvPSYlITE1";
    public SparkContext LL;
    public InterfaceC1387820mDc LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public Integer LLILZLL;
    public EnumC1546110qKv LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public ImmersionBar LLJI;
    public SparkPageSchemaParam LLJIJIL;
    public SparkFragment LLJILJIL;
    public boolean LLJILJILJ;
    public InterfaceC1542790qFZ LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public String LLJJIJIIJIL;
    public Map<?, ?> LLJJIJIL;
    public Bundle LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C2217641Bqs LLJJL;
    public C1545810qKR LLJJLIIIJLLLLLLLZ;
    public InterfaceC1056670dbV LLJL;

    static {
        Object c098200Yq;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("fix_spark_activity_recreate_param_missing");
            c098200Yq = config != null ? Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable")) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        LLJLIL = bool != null ? bool.booleanValue() : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() throws JSONException {
        LLLLZLLIL(true);
        if (LLLLZI()) {
            return;
        }
        C2217641Bqs c2217641Bqs = this.LLJJL;
        c2217641Bqs.getClass();
        AFwS323S0000000_34 aFwS323S0000000_34 = AFwS323S0000000_34.get$arr$(16);
        Iterator<InterfaceC2217701Bqy> it2 = c2217641Bqs.LIZ.iterator();
        while (it2.hasNext()) {
            if (((Boolean) aFwS323S0000000_34.invoke(it2.next(), this)).booleanValue()) {
                return;
            }
        }
        super.onBackPressed();
    }

    public final String LLLLLZL() {
        return this.LLJILJIL.UR();
    }

    public final void LLLLZIL() {
        ImmersionBar immersionBar;
        C1530030puz.LIZIZ("SparkActivity", "initStatusBar", this.LL);
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        this.LLJI = immersionBarLJIILJJIL;
        if (this.LLILZIL) {
            immersionBarLJIILJJIL.LIZLLL(EnumC21504619Dw.FLAG_HIDE_STATUS_BAR);
        } else {
            immersionBarLJIILJJIL.LIZLLL(EnumC21504619Dw.FLAG_SHOW_BAR);
        }
        Integer num = this.LLILZLL;
        if (num != null) {
            int iIntValue = num.intValue();
            ImmersionBar immersionBar2 = this.LLJI;
            if (immersionBar2 != null) {
                immersionBar2.LJFF.LL = iIntValue;
            }
        }
        EnumC1546110qKv enumC1546110qKv = this.LLIZ;
        if (enumC1546110qKv != null) {
            ImmersionBar immersionBar3 = this.LLJI;
            if (immersionBar3 != null) {
                immersionBar3.LJIIJ(enumC1546110qKv == EnumC1546110qKv.DARK);
            }
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
            if ((c1538050q7v == null || !c1538050q7v.getNeedIgnoreNavigationBarMode()) && (immersionBar = this.LLJI) != null) {
                immersionBar.LJII(enumC1546110qKv == EnumC1546110qKv.DARK);
            }
        }
        if (this.LLIZLLLIL) {
            ImmersionBar immersionBar4 = this.LLJI;
            if (immersionBar4 != null) {
                immersionBar4.LJIIL();
            }
        } else {
            Integer num2 = this.LLILZLL;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                ImmersionBar immersionBar5 = this.LLJI;
                if (immersionBar5 != null) {
                    immersionBar5.LJFF.LL = iIntValue2;
                }
            }
        }
        if (this.LLJIJIL.getTransNavigationBar()) {
            ImmersionBar immersionBar6 = this.LLJI;
            if (immersionBar6 != null) {
                immersionBar6.LJIIJJI();
            }
        } else {
            C1058140dds navigationBarBgColor = this.LLJIJIL.getNavigationBarBgColor();
            if (navigationBarBgColor != null) {
                SparkContext sparkContext = this.LL;
                int color = navigationBarBgColor.getColor(this, sparkContext != null ? sparkContext.LJJJIL() : null);
                ImmersionBar immersionBar7 = this.LLJI;
                if (immersionBar7 != null) {
                    immersionBar7.LJFF.LLILLJJLI = color;
                }
            }
        }
        ((View) this.LLJJJIL.getValue()).setFitsSystemWindows((this.LLIZLLLIL || this.LLJIJIL.getTransNavigationBar()) ? false : true);
        C1540240qBS c1540240qBS = C1540240qBS.LIZ;
        View view = (View) this.LLJJJIL.getValue();
        SparkPageSchemaParam sparkPageSchemaParam = this.LLJIJIL;
        boolean z = this.LLIZLLLIL;
        c1540240qBS.getClass();
        C1540240qBS.LIZ(view, sparkPageSchemaParam, z);
        ImmersionBar immersionBar8 = this.LLJI;
        if (immersionBar8 != null) {
            immersionBar8.LJ();
        }
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        List<InterfaceC2217701Bqy> list;
        C2217641Bqs c2217641Bqs = this.LLJJL;
        c2217641Bqs.getClass();
        c2217641Bqs.LIZ(this, AFwS323S0000000_34.get$arr$(4));
        super.onDestroy();
        C2217641Bqs c2217641Bqs2 = this.LLJJL;
        c2217641Bqs2.getClass();
        c2217641Bqs2.LIZ(this, AFwS323S0000000_34.get$arr$(19));
        try {
            C786410Ut5.C3(getWindow().getDecorView().getViewTreeObserver(), this);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1545810qKR c1545810qKR = this.LLJJLIIIJLLLLLLLZ;
        if (c1545810qKR != null && (list = c1545810qKR.LL) != null) {
            Iterator<InterfaceC2217701Bqy> it2 = list.iterator();
            while (it2.hasNext()) {
                this.LLJJL.LIZ.remove(it2.next());
            }
        }
        if (isFinishing()) {
            this.LLJILJIL.finish();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        View decorView;
        Rect rect = new Rect();
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        int i = rect.bottom;
        int i2 = this.LLJJIII;
        if (i2 == 0) {
            this.LLJJIII = i;
            return;
        }
        if (i2 == i) {
            return;
        }
        if (i2 - i > 100) {
            LLLLZLL(Math.abs(i - i2));
            this.LLJJIII = i;
        } else if (i - i2 > 100) {
            LLLLZLL(-Math.abs(i - i2));
            this.LLJJIII = i;
        }
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        C2217641Bqs c2217641Bqs = this.LLJJL;
        c2217641Bqs.getClass();
        c2217641Bqs.LIZ(this, AFwS323S0000000_34.get$arr$(5));
        super.onPause();
        C2217641Bqs c2217641Bqs2 = this.LLJJL;
        c2217641Bqs2.getClass();
        c2217641Bqs2.LIZ(this, AFwS323S0000000_34.get$arr$(20));
        this.LLJILJIL.onFragmentHide();
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        C2217641Bqs c2217641Bqs = this.LLJJL;
        c2217641Bqs.getClass();
        c2217641Bqs.LIZ(this, AFwS323S0000000_34.get$arr$(7));
        super.onResume();
        C2217641Bqs c2217641Bqs2 = this.LLJJL;
        c2217641Bqs2.getClass();
        c2217641Bqs2.LIZ(this, AFwS323S0000000_34.get$arr$(22));
        this.LLJILJIL.onFragmentShow();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        C2217641Bqs c2217641Bqs = this.LLJJL;
        c2217641Bqs.getClass();
        c2217641Bqs.LIZ(this, AFwS323S0000000_34.get$arr$(10));
        super.onStart();
        C2217641Bqs c2217641Bqs2 = this.LLJJL;
        c2217641Bqs2.getClass();
        c2217641Bqs2.LIZ(this, AFwS323S0000000_34.get$arr$(25));
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        C2217641Bqs c2217641Bqs = this.LLJJL;
        c2217641Bqs.getClass();
        c2217641Bqs.LIZ(this, AFwS323S0000000_34.get$arr$(11));
        super.onStop();
        C2217641Bqs c2217641Bqs2 = this.LLJJL;
        c2217641Bqs2.getClass();
        c2217641Bqs2.LIZ(this, AFwS323S0000000_34.get$arr$(26));
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
        C1530030puz.LIZIZ("SparkActivity", "refresh", this.LL);
        this.LLJILJIL.refresh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SparkActivity() {
        C1541950qED.LIZJ.LJIIL();
        this.LLJIJIL = new SparkPageSchemaParam(null, 1, 0 == true ? 1 : 0);
        this.LLJILJIL = new SparkFragment();
        this.LLJJIJI = true;
        this.LLJJJIL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 17));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 20));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 19));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 16));
        this.LLJJL = new C2217641Bqs();
        this.LLJL = new InterfaceC1056670dbV(this) { // from class: X.1BKa
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
                this.LL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 18));
            }

            @Override // X.InterfaceC1056670dbV
            public final View LJIILJJIL(Context context) {
                return (View) this.LL.getValue();
            }
        };
    }

    public final boolean LLLLZI() {
        String str;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceBlockBackPress: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", disableBackPress:");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", disableHardwareBackPress:");
        sbLIZ.append(false);
        sbLIZ.append(", disableNavigateBackPress:");
        sbLIZ.append(this.LLJILJILJ);
        C1530030puz.LIZIZ("SparkActivity", C2188811AlT.LIZIZ(sbLIZ), this.LL);
        if (this.LLILLL) {
            return true;
        }
        Map<String, Boolean> map = C1024630clp.LLILLL;
        SparkContext sparkContext = this.LL;
        if (sparkContext == null || (str = sparkContext.containerId) == null) {
            str = "";
        }
        if (C1051550dTF.LIZ(this.LLJILJIL.getKitView(), C1051550dTF.LIZIZ(str), this.LLJIJIL.getBlockBackPress())) {
            return true;
        }
        SparkFragment sparkFragment = this.LLJILJIL;
        SparkSchemaParam sparkSchemaParam = sparkFragment.LLIZ;
        return ((sparkSchemaParam == null || !sparkSchemaParam.getEnableLiteMode()) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkFragment.LLILLL) != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIII()) || this.LLILZ;
    }

    @Override // android.app.Activity
    public final void finish() throws JSONException {
        String str;
        if (isFinishing()) {
            return;
        }
        SparkContext sparkContext = this.LL;
        if (sparkContext != null && (str = sparkContext.containerId) != null) {
            C1743710vTd.LIZIZ.put(str, EnumC1743700vTc.LL);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "destroy");
            sparkContext.LJJIIJZLJL(jSONObject, "viewDisappearedWithType");
        }
        super.finish();
        C2217641Bqs c2217641Bqs = this.LLJJL;
        c2217641Bqs.getClass();
        c2217641Bqs.LIZ(this, AFwS323S0000000_34.get$arr$(14));
        C2217641Bqs c2217641Bqs2 = this.LLJJL;
        boolean z = this.LLJJIJI;
        c2217641Bqs2.getClass();
        c2217641Bqs2.LIZ(this, new AwS69S0010000_34(z, 1));
        InterfaceC1542790qFZ interfaceC1542790qFZ = this.LLJILLL;
        C1725480v0E c1725480v0ELJJLI = interfaceC1542790qFZ != null ? interfaceC1542790qFZ.LJJLI() : null;
        if (this.LLJIJIL.getForbiddenAnim()) {
            C786410Ut5.de(this, 0, 0);
        } else if (this.LLJ) {
            C786410Ut5.de(this, 0, R.anim.j9);
        } else if (c1725480v0ELJJLI != null) {
            C786410Ut5.de(this, c1725480v0ELJJLI.LIZ, c1725480v0ELJJLI.LIZIZ);
        } else if (C1545540qK0.LIZIZ(this)) {
            C786410Ut5.de(this, R.anim.g6, R.anim.g7);
        } else {
            C786410Ut5.de(this, R.anim.g5, R.anim.g8);
        }
        this.LLJILJIL.finish();
    }

    @Override // X.C19GS, android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        C2217641Bqs c2217641Bqs = this.LLJJL;
        c2217641Bqs.getClass();
        c2217641Bqs.LIZ(this, AFwS323S0000000_34.get$arr$(17));
    }

    @Override // X.InterfaceC1546650qLn
    public final SparkContext LLIILZL() {
        return this.LL;
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() throws JSONException {
        finish();
    }

    @Override // X.InterfaceC1546650qLn
    public final SparkFragment getSparkFragment() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1546650qLn
    public final boolean k9() {
        return this.LLIZLLLIL;
    }

    @Override // androidx.activity.ComponentActivity
    public final Object onRetainCustomNonConfigurationInstance() {
        return this.LL;
    }

    @Override // X.InterfaceC1546650qLn
    public final void HG(boolean z) {
        this.LLILZ = z;
    }

    @Override // X.InterfaceC1546650qLn
    public final void Ip(boolean z) {
        this.LLJ = z;
    }

    @Override // X.InterfaceC1432560nNm
    public final void KF(InterfaceC1387820mDc interfaceC1387820mDc) {
        this.LLILLJJLI = interfaceC1387820mDc;
    }

    public final void LLLLZLL(int i) throws JSONException {
        boolean z;
        int i2 = 0;
        if (i > 0) {
            z = true;
        } else {
            z = false;
            i = 0;
        }
        C1546210qL5.LIZ.getClass();
        int iLJIIL = C1546210qL5.LJIIL(i, this);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJILJIL.LLILLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C1541970qEF c1541970qEF = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLIILIL;
            c1541970qEF.getClass();
            if (i >= 0) {
                i2 = i;
            }
            if (i2 != c1541970qEF.LJ) {
                c1541970qEF.LJ = i2;
                c1541970qEF.LIZIZ();
            }
        }
        InterfaceC1541990qEH kitView = this.LLJILJIL.getKitView();
        if (kitView != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("visible", z);
            jSONObject.put("height", iLJIIL);
            kitView.LIZ("keyboardStatusChange", jSONObject);
        }
    }

    public final void LLLLZLLIL(boolean z) throws JSONException {
        String str;
        String str2;
        if (z) {
            str = "hardwareBackPress";
        } else {
            str = "navBarBackPress";
        }
        JSONObject jSONObject = new JSONObject();
        SparkContext sparkContext = this.LL;
        if (sparkContext != null) {
            str2 = sparkContext.containerId;
        } else {
            str2 = null;
        }
        jSONObject.put("containerId", str2);
        jSONObject.put("actionFrom", str);
        InterfaceC1541990qEH kitView = this.LLJILJIL.getKitView();
        if (kitView != null) {
            kitView.LIZ("sparkPageBackEvent", jSONObject);
        }
        InterfaceC1541990qEH kitView2 = this.LLJILJIL.getKitView();
        if (kitView2 != null) {
            kitView2.LIZ("pageFinishBackEvent", jSONObject);
        }
    }

    @Override // X.InterfaceC1546650qLn
    public final void Ux(EnumC1546110qKv enumC1546110qKv) {
        this.LLIZ = enumC1546110qKv;
    }

    @Override // X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi(ISparkHostApi.class);
        if (iSparkHostApi != null) {
            iSparkHostApi.LJIIZILJ(context);
        }
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        if (i18nServiceApi != null && i18nServiceApi.LIZ() != null) {
            context = i18nServiceApi.LIZ().LIZJ(context);
        }
        a.install(context);
        Iterator<InterfaceC2217701Bqy> it2 = this.LLJJL.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(this);
        }
        super.attachBaseContext(context);
        Iterator<InterfaceC2217701Bqy> it3 = this.LLJJL.LIZ.iterator();
        while (it3.hasNext()) {
            it3.next().LJIL(this, context);
        }
    }

    @Override // X.InterfaceC1546650qLn
    public final void fh(boolean z) {
        this.LLILLL = z;
    }

    @Override // X.InterfaceC1546650qLn
    public final void g5(boolean z) {
        this.LLILZIL = z;
    }

    @Override // X.InterfaceC1546650qLn
    public final void h9(boolean z) {
        this.LLIZLLLIL = z;
    }

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) throws JSONException {
        this.LLJJIJI = z;
        finish();
        this.LLJJIJI = true;
    }

    @Override // X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2217641Bqs c2217641Bqs = this.LLJJL;
        c2217641Bqs.getClass();
        c2217641Bqs.LIZ(this, new AwS648S0100000_34(configuration, 18));
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        if (i18nServiceApi != null && i18nServiceApi.LIZ() != null) {
            i18nServiceApi.LIZ().LIZIZ(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0dtC, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r10v6 */
    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Map<String, String> mapLJJJ;
        Bundle bundle2;
        C1545810qKR c1545810qKR;
        InterfaceC1542790qFZ interfaceC1542790qFZ;
        C1725480v0E c1725480v0ELJJJJI;
        SparkPageSchemaParam sparkPageSchemaParam;
        SparkContext sparkContext;
        T tLJFF;
        String str;
        Object c098200Yq;
        View viewLJFF;
        View viewLIZIZ;
        InterfaceC1542060qEO interfaceC1542060qEO;
        C1546120qKw c1546120qKwLJFF;
        T tLJFF2;
        T tLIZJ;
        InterfaceC1545600qK6 interfaceC1545600qK6LIZLLL;
        boolean z;
        int color;
        int iIntValue;
        InterfaceC1056670dbV interfaceC1056670dbV;
        SparkSchemaParam sparkSchemaParamLJJJI;
        List<InterfaceC2217701Bqy> list;
        int i;
        SparkContext sparkContext2;
        String string;
        String string2;
        Bundle bundle3;
        String string3;
        C1530030puz.LIZIZ("SparkActivity", "onCreate", this.LL);
        C1041990dDp c1041990dDp = C1041990dDp.LIZ;
        String str2 = 0;
        String str3 = null;
        try {
            stringExtra = getIntent().getStringExtra("SparkContextContainerId");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        c1041990dDp.getClass();
        SparkContext sparkContextLIZ = C1041990dDp.LIZ(stringExtra);
        this.LL = sparkContextLIZ;
        if (sparkContextLIZ == null) {
            Object lastCustomNonConfigurationInstance = getLastCustomNonConfigurationInstance();
            if (lastCustomNonConfigurationInstance instanceof SparkContext) {
                sparkContext2 = (SparkContext) lastCustomNonConfigurationInstance;
            } else {
                sparkContext2 = null;
            }
            this.LL = sparkContext2;
            if (sparkContext2 == null) {
                if (bundle != null) {
                    string = bundle.getString("sparkInsureUrl");
                } else {
                    string = null;
                }
                this.LLJJIJIIJIL = string;
                if (bundle != null) {
                    string2 = bundle.getString("sparkInsureDefaultParams");
                } else {
                    string2 = null;
                }
                this.LLJJIJIL = (Map) C1058250de3.LIZ(string2, Map.class);
                if (bundle != null) {
                    bundle3 = bundle.getBundle("sparkInsureBundle");
                } else {
                    bundle3 = null;
                }
                this.LLJJJ = bundle3;
                if (bundle != null) {
                    string3 = bundle.getString("sparkInsureRuntimeInfo");
                } else {
                    string3 = null;
                }
                Map map = (Map) C1058250de3.LIZ(string3, Map.class);
                String str4 = this.LLJJIJIIJIL;
                if (str4 != null) {
                    SparkContext sparkContext3 = new SparkContext();
                    sparkContext3.LJJLIIJ(str4);
                    if (LLJLIL) {
                        Map<?, ?> map2 = this.LLJJIJIL;
                        if (map2 != null) {
                            sparkContext3.LJJLI(map2);
                        }
                        Bundle bundle4 = this.LLJJJ;
                        if (bundle4 != null) {
                            sparkContext3.LJJJJL(bundle4);
                        }
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        Object value = entry.getValue();
                        if (value != null) {
                            sparkContext3.LJJLIIIJ(value, String.valueOf(entry.getKey()));
                        }
                    }
                    C1041990dDp.LIZ.getClass();
                    C1041990dDp.LIZJ(sparkContext3);
                    this.LL = sparkContext3;
                }
            } else {
                SparkContext sparkContext4 = this.LL;
                if (sparkContext4 != null) {
                    C1041990dDp.LIZ.getClass();
                    C1041990dDp.LIZJ(sparkContext4);
                }
            }
        } else {
            String strLJIJI = sparkContextLIZ.LJIJI();
            if (strLJIJI == null) {
                strLJIJI = "";
            }
            this.LLJJIJIIJIL = strLJIJI;
            SparkContext sparkContext5 = this.LL;
            if (sparkContext5 != null) {
                mapLJJJ = sparkContext5.LJJJ();
            } else {
                mapLJJJ = null;
            }
            this.LLJJIJIL = mapLJJJ;
            SparkContext sparkContext6 = this.LL;
            if (sparkContext6 != null) {
                bundle2 = sparkContext6.bundle;
            } else {
                bundle2 = null;
            }
            this.LLJJJ = bundle2;
        }
        SparkContext sparkContext7 = this.LL;
        if (sparkContext7 != null) {
            sparkContext7.uiType = EnumC1542040qEM.PAGE;
        }
        if (Intrinsics.LJFF(C1535630q41.LIZIZ("fix_spark_issues_when_recreate"), Boolean.TRUE) && bundle != null) {
            C1541950qED.LIZJ.LIZLLL(this.LL, this, -1);
        }
        int i2 = 1;
        C1530570pvr.LIZJ(this.LL, new EnumC1537220q6a[]{EnumC1537220q6a.CREATE_SPARK_END, EnumC1537220q6a.CONTAINER_INIT_END, EnumC1537220q6a.PREPARE_OUTSIDE_CONTAINER_END, EnumC1537220q6a.SPARK_CONTAINER_ENV_PREPARE_START}, null);
        SparkContext sparkContext8 = this.LL;
        if (sparkContext8 != null) {
            sparkContext8.LJFF(C1538200q8A.class);
        }
        SparkContext sparkContext9 = this.LL;
        if (sparkContext9 != null) {
            HashMap map3 = new HashMap();
            if (bundle != null) {
                i = 1;
            } else {
                i = 0;
            }
            map3.put("isRecreated", Integer.valueOf(i));
            sparkContext9.LJJLIIIJILLIZJL(map3);
        }
        SparkContext sparkContext10 = this.LL;
        if (sparkContext10 != null) {
            c1545810qKR = (C1545810qKR) sparkContext10.LJFF(C1545810qKR.class);
        } else {
            c1545810qKR = null;
        }
        this.LLJJLIIIJLLLLLLLZ = c1545810qKR;
        if (c1545810qKR != null && (list = c1545810qKR.LL) != null) {
            Iterator<InterfaceC2217701Bqy> it2 = list.iterator();
            while (it2.hasNext()) {
                this.LLJJL.LIZ.add(it2.next());
            }
        }
        C2217641Bqs c2217641Bqs = this.LLJJL;
        c2217641Bqs.getClass();
        c2217641Bqs.LIZ(this, new AwS648S0100000_34(bundle, 16));
        SparkContext sparkContext11 = this.LL;
        if (sparkContext11 != null) {
            interfaceC1542790qFZ = (InterfaceC1542790qFZ) sparkContext11.LJFF(InterfaceC1542790qFZ.class);
        } else {
            interfaceC1542790qFZ = null;
        }
        this.LLJILLL = interfaceC1542790qFZ;
        if (interfaceC1542790qFZ != null) {
            c1725480v0ELJJJJI = interfaceC1542790qFZ.LJJJJI();
        } else {
            c1725480v0ELJJJJI = null;
        }
        SparkContext sparkContext12 = this.LL;
        if (sparkContext12 != null && (sparkSchemaParamLJJJI = sparkContext12.LJJJI(1)) != null && (sparkSchemaParamLJJJI instanceof SparkPageSchemaParam)) {
            sparkPageSchemaParam = (SparkPageSchemaParam) sparkSchemaParamLJJJI;
        } else {
            sparkPageSchemaParam = new SparkPageSchemaParam(str2, i2, str2);
        }
        this.LLJIJIL = sparkPageSchemaParam;
        SparkContext sparkContext13 = this.LL;
        if (sparkContext13 != null && (interfaceC1056670dbV = (InterfaceC1056670dbV) sparkContext13.LJFF(InterfaceC1056670dbV.class)) != null) {
            this.LLJL = interfaceC1056670dbV;
        }
        super.onCreate(bundle);
        ViewParent parent = ((View) this.LLJJJIL.getValue()).getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            C786410Ut5.LJJJLZIJ((View) this.LLJJJIL.getValue(), (ViewGroup) parent);
        }
        InterfaceC1542060qEO interfaceC1542060qEO2 = C1546010qKl.LIZ;
        if (interfaceC1542060qEO2 != null && (interfaceC1545600qK6LIZLLL = interfaceC1542060qEO2.LIZLLL()) != null && C1540320qBa.LIZ) {
            boolean zLJIJI = u.LJIJI(this.LLJIJIL.getForceThemeStyle(), "light", true);
            if (!zLJIJI && (u.LJIJI(this.LLJIJIL.getForceThemeStyle(), "dark", true) || interfaceC1545600qK6LIZLLL.LIZJ(this))) {
                z = true;
            } else {
                z = false;
            }
            Drawable background = getWindow().getDecorView().getBackground();
            if (background instanceof ColorDrawable) {
                color = ((ColorDrawable) background).getColor();
            } else {
                color = 0;
            }
            if (zLJIJI) {
                setTheme(interfaceC1545600qK6LIZLLL.LIZ());
            } else if (z) {
                setTheme(interfaceC1545600qK6LIZLLL.LJ());
            }
            Integer numLIZIZ = interfaceC1545600qK6LIZLLL.LIZIZ(this);
            if (numLIZIZ != null && color != (iIntValue = numLIZIZ.intValue())) {
                getWindow().getDecorView().setBackgroundColor(iIntValue);
            }
        }
        setContentView((View) this.LLJJJIL.getValue());
        SparkContext sparkContext14 = this.LL;
        if ((sparkContext14 == null || sparkContext14.LJJIJLIJ() == null || Intrinsics.LJFF(C1535630q41.LIZIZ("fix_spark_issues_when_recreate"), Boolean.TRUE)) && (sparkContext = this.LL) != null) {
            sparkContext.LJJJJJ(this);
        }
        final C259800zU c259800zU = new C259800zU();
        SparkContext sparkContext15 = this.LL;
        if (sparkContext15 != null) {
            tLJFF = sparkContext15.LJFF(InterfaceC1892990zMP.class);
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
            SparkContext sparkContext16 = this.LL;
            if (sparkContext16 != null) {
                sparkContext16.LJJ(InterfaceC1892990zMP.class, tLIZJ);
            }
        }
        final C259800zU c259800zU2 = new C259800zU();
        if (!this.LLJIJIL.getHideLoading() && (interfaceC1542060qEO = C1546010qKl.LIZ) != null && (c1546120qKwLJFF = interfaceC1542060qEO.LJFF()) != null && c1546120qKwLJFF.LIZJ) {
            SparkContext sparkContext17 = this.LL;
            if (sparkContext17 != null) {
                tLJFF2 = sparkContext17.LJFF(InterfaceC1542250qEh.class);
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
                SparkContext sparkContext18 = this.LL;
                if (sparkContext18 != null) {
                    sparkContext18.LJJ(InterfaceC1542250qEh.class, null);
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.LLJJJJLIIL.getValue();
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        InterfaceC1542250qEh interfaceC1542250qEh = (InterfaceC1542250qEh) c259800zU2.element;
        if (interfaceC1542250qEh != null && (viewLIZIZ = interfaceC1542250qEh.LIZIZ(this)) != null) {
            ViewParent parent2 = viewLIZIZ.getParent();
            if (parent2 != null && (parent2 instanceof ViewGroup)) {
                C786410Ut5.LJJJLZIJ(viewLIZIZ, (ViewGroup) parent2);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.LLJJJJLIIL.getValue();
            if (viewGroup2 != null) {
                viewGroup2.addView(viewLIZIZ);
            }
            InterfaceC1542250qEh interfaceC1542250qEh2 = (InterfaceC1542250qEh) c259800zU2.element;
            if (interfaceC1542250qEh2 != null) {
                interfaceC1542250qEh2.setProgress(5);
            }
        }
        C786410Ut5.LJJJJI((ViewGroup) this.LLJJJJ.getValue());
        SparkContext sparkContext19 = this.LL;
        if (sparkContext19 != null) {
            T t = c259800zU.element;
            if (t instanceof AbstractC1893000zMQ) {
                ((AbstractC1893000zMQ) t).LIZ(sparkContext19);
            }
        }
        if (!this.LLJIJIL.getHideNavBar() && (!this.LLJIJIL.getTransStatusBar() || this.LLJIJIL.getShowNavBarInTransStatusBar())) {
            InterfaceC1892990zMP interfaceC1892990zMP = (InterfaceC1892990zMP) c259800zU.element;
            if (interfaceC1892990zMP != null) {
                viewLJFF = interfaceC1892990zMP.LJFF(this);
            } else {
                viewLJFF = null;
            }
            C1530030puz.LIZIZ("time_consuming_optimization", "getTitleBarView", this.LL);
            if (viewLJFF != null) {
                ViewParent parent3 = viewLJFF.getParent();
                if (parent3 != null && (parent3 instanceof ViewGroup)) {
                    C786410Ut5.LJJJLZIJ(viewLJFF, (ViewGroup) parent3);
                }
                ((ViewGroup) this.LLJJJJ.getValue()).addView(viewLJFF);
            }
        }
        SparkContext sparkContext20 = this.LL;
        if (sparkContext20 != null) {
            sparkContext20.LJJLIL(new InterfaceC1542320qEo() { // from class: X.1Bqp
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
                    sbLIZ.append(this.LIZ.LLJIJIL.getShowWebUrl());
                    C1530030puz.LIZIZ("SparkActivity", C2188811AlT.LIZIZ(sbLIZ), this.LIZ.LL);
                    if (this.LIZ.LLJIJIL.getShowWebUrl() && !TextUtils.isEmpty(str5) && (interfaceC1892990zMP2 = c259800zU.element) != null) {
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
                    sbLIZ.append(this.LIZ.LLJIJIL.getUseWebviewTitle());
                    C1530030puz.LIZIZ("SparkActivity", C2188811AlT.LIZIZ(sbLIZ), this.LIZ.LL);
                    if (this.LIZ.LLJIJIL.getUseWebviewTitle() && !TextUtils.isEmpty(str5) && TextUtils.isEmpty(this.LIZ.LLJIJIL.getTitle()) && (interfaceC1892990zMP2 = c259800zU.element) != null) {
                        if (str5 == null) {
                            str5 = "";
                        }
                        interfaceC1892990zMP2.setTitle(str5);
                    }
                }
            });
        }
        SparkContext sparkContext21 = this.LL;
        if (sparkContext21 != null) {
            sparkContext21.LJJ(InterfaceC1542340qEq.class, new InterfaceC1542340qEq() { // from class: X.18Kr
                @Override // X.InterfaceC1542340qEq
                public final void qn() {
                    SparkActivity sparkActivity = this.LIZ;
                    sparkActivity.LLILZIL = sparkActivity.LLJJ;
                    sparkActivity.LLIZLLLIL = sparkActivity.LLJJI;
                    sparkActivity.LLLLZIL();
                    ViewGroup viewGroup3 = (ViewGroup) this.LIZ.getWindow().getDecorView();
                    ViewGroup viewGroup4 = (ViewGroup) viewGroup3.findViewById(R.id.vs6);
                    if (viewGroup4 != null) {
                        C786410Ut5.LJJJLZIJ(viewGroup4, viewGroup3);
                        C786410Ut5.LJJJJI(viewGroup4);
                        C786410Ut5.LJLZ(8, viewGroup4);
                    }
                }

                @Override // X.InterfaceC1542340qEq
                public final void LIZ(View view) {
                    SparkActivity sparkActivity = this.LIZ;
                    sparkActivity.LLJJ = sparkActivity.LLILZIL;
                    sparkActivity.LLJJI = sparkActivity.LLIZLLLIL;
                    sparkActivity.LLILZIL = true;
                    sparkActivity.LLIZLLLIL = true;
                    sparkActivity.LLLLZIL();
                    ViewGroup viewGroup3 = (ViewGroup) this.LIZ.getWindow().getDecorView();
                    ViewGroup frameLayout = (ViewGroup) viewGroup3.findViewById(R.id.vs6);
                    if (frameLayout == null) {
                        frameLayout = new FrameLayout(this.LIZ);
                        frameLayout.setId(R.id.vs6);
                        viewGroup3.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                    }
                    C786410Ut5.LJLZ(0, frameLayout);
                    frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
                    frameLayout.requestLayout();
                }
            });
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkFragment#");
        SparkContext sparkContext22 = this.LL;
        if (sparkContext22 != null) {
            str = sparkContext22.containerId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI(strLIZIZ);
        if (fragmentLJJJJZI instanceof SparkFragment) {
            SparkFragment sparkFragment = (SparkFragment) fragmentLJJJJZI;
            this.LLJILJIL = sparkFragment;
            Bundle arguments = sparkFragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            SparkFragment sparkFragment2 = this.LLJILJIL;
            SparkContext sparkContext23 = this.LL;
            if (sparkContext23 != null) {
                str3 = sparkContext23.containerId;
            }
            C786410Ut5.LJJJI("SparkContextContainerId", str3, arguments);
            sparkFragment2.setArguments(arguments);
            this.LLJILJIL.refresh();
        } else {
            C1530030puz.LIZIZ("SparkActivity", "Create SparkFragment", this.LL);
            SparkFragment sparkFragment3 = new SparkFragment();
            this.LLJILJIL = sparkFragment3;
            Bundle bundle5 = new Bundle();
            SparkContext sparkContext24 = this.LL;
            if (sparkContext24 != null) {
                str2 = sparkContext24.containerId;
            }
            C786410Ut5.LJJJI("SparkContextContainerId", str2, bundle5);
            sparkFragment3.setArguments(bundle5);
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            if (fragmentLJJJJZI != null) {
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
            }
            c19ehLJIIJ.LIZJ(((Number) this.LLJJJJJIL.getValue()).intValue(), this.LLJILJIL, strLIZIZ);
            if (Intrinsics.LJFF(C1535630q41.LIZIZ("sparkFragmentCommitNow"), Boolean.TRUE)) {
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
        arrayList.add(new C1546660qLo(this.LLJIJIL, new WeakReference(this)));
        arrayList.add(new C1548240qOM(this.LLJIJIL, new WeakReference(c259800zU.element), this.LL));
        arrayList.add(new C2217691Bqx(this.LLJIJIL, (ViewGroup) this.LLJJJJ.getValue()));
        arrayList.add(new C1893160zMg(this.LLJIJIL, (InterfaceC1892990zMP) c259800zU.element));
        arrayList.add(new C1546640qLm(this.LLJIJIL, this, (InterfaceC1892990zMP) c259800zU.element));
        arrayList.add(new C1546630qLl(this.LLJIJIL, this, (InterfaceC1892990zMP) c259800zU.element));
        arrayList.add(new C1893150zMf(this.LLJIJIL, (InterfaceC1892990zMP) c259800zU.element));
        arrayList.add(new C1546680qLq(this.LLJIJIL, this));
        arrayList.add(new C1546100qKu(this.LLJIJIL, this));
        arrayList.add(new C1546090qKt(this.LLJIJIL, this));
        arrayList.add(new C1542780qFY(this.LLJIJIL, this));
        arrayList.add(new C1546670qLp(this.LLJIJIL, this, (ViewGroup) this.LLJJJJ.getValue()));
        arrayList.add(new C1542770qFX(this.LLJIJIL, this));
        arrayList.add(new C1546690qLr(this.LLJIJIL, this));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC1554280qY6) it3.next()).invoke();
        }
        C1540240qBS c1540240qBS = C1540240qBS.LIZ;
        Window window = getWindow();
        SparkPageSchemaParam sparkPageSchemaParam2 = this.LLJIJIL;
        View viewFindViewById = findViewById(R.id.oc4);
        c1540240qBS.getClass();
        C1540240qBS.LJIIIIZZ(window, sparkPageSchemaParam2, viewFindViewById, false);
        LLLLZIL();
        InterfaceC1892990zMP interfaceC1892990zMP2 = (InterfaceC1892990zMP) c259800zU.element;
        if (interfaceC1892990zMP2 != null) {
            interfaceC1892990zMP2.setBackClickListener(new ACListenerS168S0100000_34(this, 2));
        }
        InterfaceC1892990zMP interfaceC1892990zMP3 = (InterfaceC1892990zMP) c259800zU.element;
        if (interfaceC1892990zMP3 != null) {
            interfaceC1892990zMP3.setCloseAllClickListener(new ACListenerS168S0100000_34(this, 3));
        }
        C786410Ut5.x3(getWindow().getDecorView().getViewTreeObserver(), this);
        SparkContext sparkContext25 = this.LL;
        if (sparkContext25 != null) {
            sparkContext25.LJJ(InterfaceC1542380qEu.class, new InterfaceC1542380qEu() { // from class: X.1Bqu
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
        if (this.LLJIJIL.getForbiddenAnim()) {
            C786410Ut5.de(this, 0, 0);
        } else if (this.LLJ) {
            C786410Ut5.de(this, R.anim.j_, 0);
        } else if (c1725480v0ELJJJJI == null) {
            if (C1545540qK0.LIZIZ(this)) {
                C786410Ut5.de(this, R.anim.g5, R.anim.g8);
            } else {
                C786410Ut5.de(this, R.anim.g6, R.anim.g7);
            }
        } else {
            C786410Ut5.de(this, c1725480v0ELJJJJI.LIZ, c1725480v0ELJJJJI.LIZIZ);
        }
        C2217641Bqs c2217641Bqs2 = this.LLJJL;
        c2217641Bqs2.getClass();
        c2217641Bqs2.LIZ(this, new AwS648S0100000_34(bundle, 21));
        C1530570pvr.LIZJ(this.LL, new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_CONTAINER_ENV_PREPARE_END}, null);
        C1848530yCh.LIZ.getClass();
        ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
        if (iTracingServiceLIZ != null) {
            iTracingServiceLIZ.LJIIZILJ(this);
        }
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        if (i18nServiceApi != null && i18nServiceApi.LIZ() != null) {
            i18nServiceApi.LIZ().LIZIZ(this);
        }
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C2217641Bqs c2217641Bqs = this.LLJJL;
        c2217641Bqs.getClass();
        c2217641Bqs.LIZ(this, new AwS648S0100000_34(bundle, 20));
    }

    @Override // androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C1537510q73 c1537510q73;
        C2217641Bqs c2217641Bqs = this.LLJJL;
        c2217641Bqs.getClass();
        c2217641Bqs.LIZ(this, new AwS648S0100000_34(bundle, 17));
        super.onSaveInstanceState(bundle);
        C786410Ut5.LJJJI("sparkInsureUrl", this.LLJJIJIIJIL, bundle);
        C786410Ut5.LJJJI("sparkInsureDefaultParams", C1058250de3.LIZLLL(this.LLJJIJIL), bundle);
        C786410Ut5.LJJIIZI(bundle, this.LLJJJ, "sparkInsureBundle");
        SparkContext sparkContext = this.LL;
        if (sparkContext != null) {
            c1537510q73 = sparkContext.extraRuntimeInfo;
        } else {
            c1537510q73 = null;
        }
        C786410Ut5.LJJJI("sparkInsureRuntimeInfo", C1058250de3.LIZLLL(c1537510q73), bundle);
        C2217641Bqs c2217641Bqs2 = this.LLJJL;
        c2217641Bqs2.getClass();
        c2217641Bqs2.LIZ(this, new AwS648S0100000_34(bundle, 23));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C2217641Bqs c2217641Bqs = this.LLJJL;
        c2217641Bqs.getClass();
        c2217641Bqs.LIZ(this, new AwS69S0010000_34(z, 0));
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
    }

    @Override // X.InterfaceC1546650qLn
    public final void tH(Integer num) {
        this.LLILZLL = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        AbstractC1539070q9Z abstractC1539070q9Z;
        InterfaceC20190413zK interfaceC20190413zK;
        InterfaceC1387820mDc interfaceC1387820mDc = this.LLILLJJLI;
        if (interfaceC1387820mDc != null) {
            interfaceC1387820mDc.onActivityResult(i, i2, intent);
        }
        SparkContext sparkContext = this.LL;
        if (sparkContext != null && (interfaceC20190413zK = (InterfaceC20190413zK) sparkContext.LJFF(InterfaceC20190413zK.class)) != null) {
            interfaceC20190413zK.onActivityResult(i, i2, intent);
        }
        SparkContext sparkContext2 = this.LL;
        if (sparkContext2 != null && (abstractC1539070q9Z = (AbstractC1539070q9Z) sparkContext2.LJFF(AbstractC1539070q9Z.class)) != null) {
            do {
                abstractC1539070q9Z.onActivityResult(i, i2, intent);
                T t = abstractC1539070q9Z.LL;
                if (t == 0 || !(t instanceof AbstractC1539070q9Z)) {
                    break;
                } else {
                    abstractC1539070q9Z = (AbstractC1539070q9Z) t;
                }
            } while (abstractC1539070q9Z != null);
        }
        C2217641Bqs c2217641Bqs = this.LLJJL;
        c2217641Bqs.getClass();
        c2217641Bqs.LIZ(this, new AwS50S0102000_34(i, i2, intent, 0));
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Throwable {
        int iIntValue = i;
        int[] iArr2 = iArr;
        String[] strArr2 = strArr;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11051, "com/bytedance/hybrid/spark/page/SparkActivity", "onRequestPermissionsResult", this, new Object[]{Integer.valueOf(iIntValue), strArr2, iArr2}, "void", new C0WZW(false, "(I[Ljava/lang/String;[I)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHNkWkHBzTaCXFmFILbgI5Mu2Z", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                iIntValue = ((Integer) obj).intValue();
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                strArr2 = (String[]) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iArr2 = (int[]) obj3;
            }
        }
        super.onRequestPermissionsResult(iIntValue, strArr2, iArr2);
        C2217641Bqs c2217641Bqs = this.LLJJL;
        c2217641Bqs.getClass();
        c2217641Bqs.LIZ(this, new C2217681Bqw(iIntValue, strArr2, iArr2));
    }
}
