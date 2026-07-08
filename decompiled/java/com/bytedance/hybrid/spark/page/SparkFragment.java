package com.bytedance.hybrid.spark.page;

import X.AbstractC1542100qES;
import X.AbstractC1542200qEc;
import X.C01GW;
import X.C098200Yq;
import X.C1041990dDp;
import X.C1326430kcb;
import X.C1530030puz;
import X.C1537720q7O;
import X.C1538070q7x;
import X.C1541940qEC;
import X.C1541950qED;
import X.C1546010qKl;
import X.C189200o6;
import X.C19EH;
import X.C2097608Jq;
import X.C452501pT;
import X.EnumC1538460q8a;
import X.InterfaceC1051240dSk;
import X.InterfaceC1059280dfi;
import X.InterfaceC1163110gNB;
import X.InterfaceC1541990qEH;
import X.InterfaceC1542060qEO;
import X.InterfaceC1542230qEf;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS567S0100000_23;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class SparkFragment extends Fragment implements InterfaceC1051240dSk, InterfaceC1059280dfi {
    public static final boolean LLJLL;
    public static final boolean LLJLLIL;
    public static final boolean LLJLLL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWskMC0hISFiOjHELIOS8yOi5iOS40LWsfOS4hIwM+KCg+LSs4";
    public final boolean LL;
    public View LLILLJJLI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILLL;
    public C1541940qEC LLILZ;
    public InterfaceC1541990qEH LLILZIL;
    public SparkContext LLILZLL;
    public SparkSchemaParam LLIZ;
    public AbstractC1542100qES LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public AbstractC1542200qEc LLJIJIL;
    public InterfaceC1542230qEf LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public final long LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public FrameLayout LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public long mDestroyTime;

    @Override // X.InterfaceC1059280dfi
    public void m3(boolean z) {
    }

    static {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("optimize_spark_fragment_memory_leak");
            c098200Yq = config != null ? Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable")) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        LLJLL = bool != null ? bool.booleanValue() : true;
        try {
            JSONObject config2 = HybridSettings.INSTANCE.getConfig("optimize_spark_fragment_load_timing");
            c098200Yq2 = config2 != null ? Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config2, "enable")) : null;
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        Boolean bool2 = (Boolean) c098200Yq2;
        LLJLLIL = bool2 != null ? bool2.booleanValue() : false;
        try {
            JSONObject config3 = HybridSettings.INSTANCE.getConfig("disable_spark_fragment_force_release");
            c098200Yq3 = config3 != null ? Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config3, "enable")) : null;
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
            c098200Yq3 = null;
        }
        Boolean bool3 = (Boolean) c098200Yq3;
        if (bool3 != null) {
            bool3.booleanValue();
        }
        try {
            JSONObject config4 = HybridSettings.INSTANCE.getConfig("disable_spark_fragment_remove_spark_context");
            c098200Yq4 = config4 != null ? Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config4, "enable")) : null;
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq4 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        Boolean bool4 = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq4) ? null : c098200Yq4);
        LLJLLL = bool4 != null ? bool4.booleanValue() : true;
    }

    private final InterfaceC1163110gNB SR() {
        InterfaceC1163110gNB interfaceC1163110gNB;
        SparkContext sparkContext = this.LLILZLL;
        if (sparkContext != null && (interfaceC1163110gNB = (InterfaceC1163110gNB) sparkContext.LJFF(InterfaceC1163110gNB.class)) != null) {
            return interfaceC1163110gNB;
        }
        InterfaceC1542060qEO interfaceC1542060qEO = C1546010qKl.LIZ;
        if (interfaceC1542060qEO != null) {
            return interfaceC1542060qEO.LJI();
        }
        return null;
    }

    public boolean PR() {
        SparkSchemaParam sparkSchemaParam = this.LLIZ;
        return sparkSchemaParam != null && sparkSchemaParam.getForceReleaseContextWhenDestroyedForSparkFragment();
    }

    public final EnumC1538460q8a RR() {
        EnumC1538460q8a enumC1538460q8a;
        C1537720q7O c1537720q7O;
        EnumC1538460q8a enumC1538460q8a2;
        SparkSchemaParam sparkSchemaParam = this.LLIZ;
        if (sparkSchemaParam == null || !sparkSchemaParam.getEnableLiteMode()) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL;
            return (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (enumC1538460q8a = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJLILLLLZIIL) == null) ? EnumC1538460q8a.INIT : enumC1538460q8a;
        }
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        return (!(interfaceC1541990qEH instanceof C1537720q7O) || (c1537720q7O = (C1537720q7O) interfaceC1541990qEH) == null || (enumC1538460q8a2 = c1537720q7O.LLJJ) == null) ? EnumC1538460q8a.INIT : enumC1538460q8a2;
    }

    public final String UR() {
        SparkSchemaParam sparkSchemaParam = this.LLIZ;
        boolean z = false;
        if (sparkSchemaParam != null && sparkSchemaParam.getEnableLiteMode()) {
            z = true;
        }
        if (z) {
            InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
            if (interfaceC1541990qEH != null) {
                return interfaceC1541990qEH.getSchema();
            }
            return null;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getUrl();
        }
        return null;
    }

    public final void VR() {
        SparkSchemaParam sparkSchemaParam = this.LLIZ;
        if (sparkSchemaParam == null || !sparkSchemaParam.getEnableLiteMode()) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
                return;
            }
            return;
        }
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.load();
        }
    }

    public final void finish() {
        String string;
        if (this.LLJILLL) {
            return;
        }
        this.LLJILLL = true;
        this.LLJJJJJIL = true;
        SparkContext sparkContext = this.LLILZLL;
        if (sparkContext == null || (string = sparkContext.containerId) == null) {
            Bundle arguments = getArguments();
            string = arguments != null ? arguments.getString("SparkContextContainerId") : null;
        }
        C1041990dDp.LIZ.getClass();
        C1041990dDp.LIZIZ(string);
    }

    public final InterfaceC1541990qEH getKitView() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView;
        InterfaceC1541990qEH kitView;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        if (interfaceC1541990qEH != null) {
            return interfaceC1541990qEH;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            return kitView;
        }
        C1541940qEC c1541940qEC = this.LLILZ;
        if (c1541940qEC == null || (sparkView = c1541940qEC.getSparkView()) == null) {
            return null;
        }
        return sparkView.getKitView();
    }

    public final void onFragmentHide() {
        SparkSchemaParam sparkSchemaParam = this.LLIZ;
        if (sparkSchemaParam == null || !sparkSchemaParam.getEnableLiteMode()) {
            InterfaceC1541990qEH kitView = getKitView();
            if (kitView != null) {
                kitView.onHide();
                return;
            }
            return;
        }
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.onHide();
        }
    }

    public final void onFragmentShow() {
        SparkSchemaParam sparkSchemaParam = this.LLIZ;
        if (sparkSchemaParam == null || !sparkSchemaParam.getEnableLiteMode()) {
            InterfaceC1541990qEH kitView = getKitView();
            if (kitView != null) {
                kitView.onShow();
                return;
            }
            return;
        }
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.onShow();
        }
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
        C1530030puz.LIZIZ("SparkFragment", "refresh", this.LLILZLL);
        VR();
    }

    public SparkFragment() {
        this.LLJJ = System.currentTimeMillis();
        this.LLJJI = C452501pT.LIZIZ(new AwS567S0100000_23(this, 66));
        this.LLJJIII = C452501pT.LIZIZ(new AwS567S0100000_23(this, 63));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS567S0100000_23(this, 65));
        C1541950qED.LIZJ.LJIIL();
    }

    public final void MR() {
        Map<String, Object> globalProps;
        Integer num;
        InterfaceC1541990qEH kitView = getKitView();
        if (kitView == null || (globalProps = kitView.getGlobalProps()) == null) {
            return;
        }
        Object obj = globalProps.get("screenWidth");
        Integer num2 = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num2 != null ? num2.intValue() : 0;
        Object obj2 = globalProps.get("screenHeight");
        kitView.U0(C2097608Jq.LJIIIIZZ(new Pair("screenWidth", Integer.valueOf(iIntValue)), new Pair("screenHeight", Integer.valueOf((!(obj2 instanceof Integer) || (num = (Integer) obj2) == null) ? 0 : num.intValue()))));
    }

    @Override // X.InterfaceC1059280dfi
    public void close() {
        Integer numValueOf;
        C19EH c19ehLJIIJ;
        try {
            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager == null || (c19ehLJIIJ = fragmentManager.LJIIJ()) == null) {
                numValueOf = null;
            } else {
                c19ehLJIIJ.LJIIZILJ(this);
                numValueOf = Integer.valueOf(c19ehLJIIJ.LJIIJ());
            }
            C189200o6.m2constructorimpl(numValueOf);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Activity activity;
        this.mDestroyTime = System.currentTimeMillis();
        super.onDestroy();
        if (LLJLL) {
            SparkContext sparkContext = this.LLILZLL;
            if (!((sparkContext != null ? sparkContext.LJJIJLIJ() : null) instanceof SparkActivity)) {
                SparkContext sparkContext2 = this.LLILZLL;
                if (!((sparkContext2 != null ? sparkContext2.LJJIJLIJ() : null) instanceof SparkPopup) && PR()) {
                    finish();
                }
            }
        }
        boolean z = true;
        if (!this.LLJJJJJIL) {
            SparkContext sparkContext3 = this.LLILZLL;
            Object objLJJIJLIJ = sparkContext3 != null ? sparkContext3.LJJIJLIJ() : null;
            if (!(objLJJIJLIJ instanceof Activity) || (activity = (Activity) objLJJIJLIJ) == null || !activity.isFinishing()) {
                z = false;
            }
        }
        this.LLJJJJJIL = z;
        WR(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.LLJJJJLIIL) {
            onFragmentHide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.LLJJJJLIIL) {
            onFragmentShow();
        }
    }

    public SparkFragment(int i) {
        this();
        this.LL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a A[PHI: r3
      0x002a: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v4 java.lang.String) binds: [B:15:0x0028, B:11:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WR(boolean r8) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkFragment.WR(boolean):void");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        InterfaceC1541990qEH interfaceC1541990qEH;
        Map<String, Object> globalProps;
        int iIntValue;
        int iIntValue2;
        String str;
        Integer num;
        Integer num2;
        super.onConfigurationChanged(configuration);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIIZI(configuration);
        }
        SparkSchemaParam sparkSchemaParam = this.LLIZ;
        if (sparkSchemaParam != null && sparkSchemaParam.getEnableLiteMode() && (i = configuration.orientation) != this.LLJILJILJ) {
            this.LLJILJILJ = i;
            if (i != 0 && (interfaceC1541990qEH = this.LLILZIL) != null && (globalProps = interfaceC1541990qEH.getGlobalProps()) != null) {
                Object obj = globalProps.get("screenWidth");
                if ((obj instanceof Integer) && (num2 = (Integer) obj) != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
                Object obj2 = globalProps.get("screenHeight");
                if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                Map<String, ? extends Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("screenWidth", Integer.valueOf(iIntValue2)), new Pair("screenHeight", Integer.valueOf(iIntValue)));
                SparkContext sparkContext = this.LLILZLL;
                if (sparkContext != null && (str = sparkContext.containerId) != null) {
                    C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
                    C1326430kcb.LIZ().LJ(str, mapLJIIIIZZ);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x025a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NR(com.bytedance.hybrid.spark.SparkContext r22, android.content.Context r23) {
        /*
            Method dump skipped, instruction units count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkFragment.NR(com.bytedance.hybrid.spark.SparkContext, android.content.Context):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C1537720q7O c1537720q7O;
        EnumC1538460q8a enumC1538460q8a;
        boolean z;
        boolean z2;
        SparkContext sparkContext;
        SparkSchemaParam sparkSchemaParam;
        boolean z3;
        boolean zLJI = MethodIDManager.LJI(71980);
        super.onViewCreated(view, bundle);
        if (!LLJLLIL) {
            MR();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                EnumC1538460q8a enumC1538460q8a2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJLILLLLZIIL;
                if (enumC1538460q8a2 != null) {
                    if (enumC1538460q8a2 != EnumC1538460q8a.INIT) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.LLJI = z3;
                }
            } else {
                InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
                if ((interfaceC1541990qEH instanceof C1537720q7O) && (c1537720q7O = (C1537720q7O) interfaceC1541990qEH) != null && (enumC1538460q8a = c1537720q7O.LLJJ) != null) {
                    if (enumC1538460q8a != EnumC1538460q8a.INIT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LLJI = z;
                }
            }
            if (!this.LLJ && !this.LLJI) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.LLJI = z2;
            if (!z2 && !this.LLJL && (sparkContext = this.LLILZLL) != null && sparkContext.autoLoad && (!this.LLJJJIL || (((sparkSchemaParam = this.LLIZ) != null && sparkSchemaParam.getAutoContinueLoad()) || this.LLJLILLLLZIIL))) {
                VR();
            }
        }
        AbstractC1542200qEc abstractC1542200qEc = this.LLJIJIL;
        if (abstractC1542200qEc != null) {
            do {
                abstractC1542200qEc = abstractC1542200qEc.LL;
            } while (abstractC1542200qEc != null);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x034e A[LOOP:0: B:243:0x034e->B:357:?, LOOP_START, PHI: r0
      0x034e: PHI (r0v89 X.0qEc) = (r0v35 X.0qEc), (r0v90 X.0qEc) binds: [B:242:0x034c, B:357:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03e4 A[LOOP:2: B:296:0x03e4->B:361:?, LOOP_START, PHI: r2
      0x03e4: PHI (r2v25 X.0qEc) = (r2v14 X.0qEc), (r2v26 X.0qEc) binds: [B:295:0x03e2, B:361:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x026e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:364:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OR(android.content.Context r10, com.bytedance.hybrid.spark.SparkContext r11, java.lang.String r12, java.lang.String r13, boolean r14, boolean r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkFragment.OR(android.content.Context, com.bytedance.hybrid.spark.SparkContext, java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
