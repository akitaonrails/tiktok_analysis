package com.bytedance.hybrid.spark.third.container;

import X.C098200Yq;
import X.C1048030dNZ;
import X.C1052290dUR;
import X.C12O0;
import X.C1554300qY8;
import X.C189200o6;
import X.C19747212Ny;
import X.C19747312Nz;
import X.C19EH;
import X.C19GS;
import X.C19GT;
import X.C1BHL;
import X.C1BHN;
import X.C1BHO;
import X.C1BHP;
import X.C1BHQ;
import X.C1BHT;
import X.C1BHU;
import X.C1BHV;
import X.C2188811AlT;
import X.C2202311BHh;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC21504619Dw;
import X.InterfaceC1059280dfi;
import X.InterfaceC1542250qEh;
import X.InterfaceC1542320qEo;
import Y.ACListenerS168S0100000_34;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.container.SparkThirdActivity;
import com.bytedance.hybrid.spark.third.container.SparkThirdFragment;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes35.dex */
public final class SparkThirdActivity extends C19GS implements InterfaceC1059280dfi {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWskMC0hISFiOj8yOi5iPSc6OiHELIOSFiKiA9PCQlJyohZhY8KD04HC0lOysSKzElPyYnMQ==";
    public View LL;
    public ImmersionBar LLILLJJLI;
    public C1BHQ LLILLL;
    public SparkThirdFragment LLILZ;
    public SparkThirdContext LLILZIL;
    public InterfaceC1542250qEh LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ;
    public int LLJI;

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    public final void LLLLLZL() {
        String str;
        C1BHO c1bho;
        if (this.LLILZIL == null || (str = this.LLIZ) == null || str.length() == 0 || (c1bho = C1554300qY8.LIZ) == null) {
            return;
        }
        String str2 = this.LLIZ;
        if (str2 == null) {
            str2 = "";
        }
        c1bho.LIZJ(this, str2);
    }

    @Override // X.C19GS
    public final C19GT getDelegate() {
        C19GT delegate;
        C1BHO c1bho = C1554300qY8.LIZ;
        return (c1bho == null || c1bho.LJFF() == null || (delegate = super.getDelegate()) == null) ? super.getDelegate() : delegate;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C1BHL c1bhl;
        C1BHL c1bhl2;
        C1BHP c1bhp;
        SparkThirdContext sparkThirdContext = this.LLILZIL;
        if (sparkThirdContext == null || (c1bhp = sparkThirdContext.activityCallback) == null || !c1bhp.onBackPressed()) {
            SparkThirdFragment sparkThirdFragment = this.LLILZ;
            if (sparkThirdFragment == null || !sparkThirdFragment.MR()) {
                SparkThirdFragment sparkThirdFragment2 = this.LLILZ;
                if (sparkThirdFragment2 == null || (c1bhl = sparkThirdFragment2.LLILZ) == null || !c1bhl.canGoBack()) {
                    super.onBackPressed();
                    return;
                }
                SparkThirdFragment sparkThirdFragment3 = this.LLILZ;
                if (sparkThirdFragment3 == null || (c1bhl2 = sparkThirdFragment3.LLILZ) == null) {
                    return;
                }
                c1bhl2.LIZIZ();
            }
        }
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C1BHP c1bhp;
        C1BHP c1bhp2;
        SparkThirdContext sparkThirdContext = this.LLILZIL;
        if (sparkThirdContext != null && (c1bhp2 = sparkThirdContext.activityCallback) != null) {
            c1bhp2.LJFF();
        }
        super.onDestroy();
        SparkThirdContext sparkThirdContext2 = this.LLILZIL;
        if (sparkThirdContext2 != null && (c1bhp = sparkThirdContext2.activityCallback) != null) {
            c1bhp.LJIIZILJ();
        }
        SparkThirdContext sparkThirdContext3 = this.LLILZIL;
        String str = sparkThirdContext3 != null ? sparkThirdContext3.containerId : null;
        Map<String, SparkThirdContext> map = C1052290dUR.LIZ;
        if (str == null) {
            str = "";
        }
        map.remove(str);
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        C1BHP c1bhp;
        C1BHP c1bhp2;
        SparkThirdContext sparkThirdContext = this.LLILZIL;
        if (sparkThirdContext != null && (c1bhp2 = sparkThirdContext.activityCallback) != null) {
            c1bhp2.LJ();
        }
        super.onPause();
        SparkThirdContext sparkThirdContext2 = this.LLILZIL;
        if (sparkThirdContext2 == null || (c1bhp = sparkThirdContext2.activityCallback) == null) {
            return;
        }
        c1bhp.LIZIZ(this);
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        C1BHP c1bhp;
        C1BHP c1bhp2;
        SparkThirdContext sparkThirdContext = this.LLILZIL;
        if (sparkThirdContext != null && (c1bhp2 = sparkThirdContext.activityCallback) != null) {
            c1bhp2.LJIIIZ();
        }
        super.onResume();
        SparkThirdContext sparkThirdContext2 = this.LLILZIL;
        if (sparkThirdContext2 == null || (c1bhp = sparkThirdContext2.activityCallback) == null) {
            return;
        }
        c1bhp.LJIJJLI();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        C1BHP c1bhp;
        C1BHP c1bhp2;
        SparkThirdContext sparkThirdContext = this.LLILZIL;
        if (sparkThirdContext != null && (c1bhp2 = sparkThirdContext.activityCallback) != null) {
            c1bhp2.LJIIIIZZ();
        }
        super.onStart();
        SparkThirdContext sparkThirdContext2 = this.LLILZIL;
        if (sparkThirdContext2 == null || (c1bhp = sparkThirdContext2.activityCallback) == null) {
            return;
        }
        c1bhp.LJII();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        C1BHP c1bhp;
        C1BHP c1bhp2;
        SparkThirdContext sparkThirdContext = this.LLILZIL;
        if (sparkThirdContext != null && (c1bhp2 = sparkThirdContext.activityCallback) != null) {
            c1bhp2.LIZLLL();
        }
        super.onStop();
        SparkThirdContext sparkThirdContext2 = this.LLILZIL;
        if (sparkThirdContext2 != null && (c1bhp = sparkThirdContext2.activityCallback) != null) {
            c1bhp.LJI();
        }
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
        SparkThirdFragment sparkThirdFragment = this.LLILZ;
        if (sparkThirdFragment != null) {
            sparkThirdFragment.refresh();
        }
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() {
        finish();
    }

    @Override // X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        try {
            C1BHO c1bho = C1554300qY8.LIZ;
            if (c1bho != null && c1bho.LJFF() != null) {
                C19747312Nz.LIZ(context);
                if (context != null) {
                    super.attachBaseContext(context);
                    return;
                }
            }
            super.attachBaseContext(context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            super.attachBaseContext(context);
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String string;
        int i;
        ThirdPartyBizCert thirdPartyBizCert;
        C1BHQ c1bhu;
        InterfaceC1542250qEh c1048030dNZ;
        C1BHP c1bhp;
        String str;
        String str2;
        String str3;
        View viewLIZIZ;
        List<C12O0> list;
        long jUptimeMillis = SystemClock.uptimeMillis();
        String str4 = null;
        if (bundle == null || (stringExtra = bundle.getString("ContainerId")) == null) {
            try {
                stringExtra = getIntent().getStringExtra("ContainerId");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        }
        this.LLJ = stringExtra;
        if (bundle == null || (string = bundle.getString("currentUrl")) == null) {
            SparkThirdContext sparkThirdContext = this.LLILZIL;
            if (sparkThirdContext != null) {
                string = sparkThirdContext.url;
            } else {
                string = null;
            }
        }
        this.LLIZ = string;
        if (bundle != null) {
            i = bundle.getInt("dataflowId");
        } else {
            SparkThirdContext sparkThirdContext2 = this.LLILZIL;
            if (sparkThirdContext2 != null && (thirdPartyBizCert = sparkThirdContext2.bizCert) != null) {
                i = thirdPartyBizCert.dataflowId;
            } else {
                i = 0;
            }
        }
        this.LLJI = i;
        SparkThirdContext sparkThirdContextLIZ = C1052290dUR.LIZ(this.LLJ);
        this.LLILZIL = sparkThirdContextLIZ;
        if (sparkThirdContextLIZ == null) {
            SparkThirdContext sparkThirdContext3 = new SparkThirdContext();
            String str5 = this.LLJ;
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            sparkThirdContext3.containerId = str5;
            sparkThirdContext3.bizCert = new ThirdPartyBizCert(this.LLJI);
            String str7 = this.LLIZ;
            if (str7 != null) {
                str6 = str7;
            }
            sparkThirdContext3.url = str6;
            C1052290dUR.LIZ.put(sparkThirdContext3.containerId, sparkThirdContext3);
            this.LLILZIL = sparkThirdContext3;
        }
        SparkThirdContext sparkThirdContext4 = this.LLILZIL;
        if (sparkThirdContext4 != null) {
            C1BHT c1bht = sparkThirdContext4.performanceState;
            if (c1bht != null) {
                c1bht.LIZ = jUptimeMillis;
                c1bht.LIZIZ = false;
                c1bht.LIZJ = false;
            }
            C1BHP c1bhp2 = sparkThirdContext4.activityCallback;
            if (c1bhp2 != null) {
                c1bhp2.LJIILIIL();
            }
        }
        super.onCreate(bundle);
        this.LL = C786410Ut5.Sd(R.layout.f_r, C786410Ut5.ne(this), null);
        C1BHO c1bho = C1554300qY8.LIZ;
        boolean z = true;
        if (c1bho != null && c1bho.LJ() != null) {
            if (C960203pA.LIZIZ(this)) {
                setTheme(C19747212Ny.LIZIZ());
                Integer numLIZ = C19747212Ny.LIZ(this);
                if (numLIZ != null) {
                    getWindow().getDecorView().setBackgroundColor(numLIZ.intValue());
                }
                this.LLIZLLLIL = true;
            } else {
                setTheme(C19747212Ny.LIZJ());
                getWindow().getDecorView().setBackgroundColor(-1);
            }
        }
        View view = this.LL;
        if (view == null) {
            view = null;
        }
        setContentView(view);
        SparkThirdContext sparkThirdContext5 = this.LLILZIL;
        if (sparkThirdContext5 != null && sparkThirdContext5.container == null && sparkThirdContext5 != null) {
            sparkThirdContext5.container = this;
        }
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        this.LLILLJJLI = immersionBarLJIILJJIL;
        immersionBarLJIILJJIL.LIZLLL(EnumC21504619Dw.FLAG_SHOW_BAR);
        ImmersionBar immersionBar = this.LLILLJJLI;
        if (immersionBar != null) {
            immersionBar.LJFF.LL = 0;
            immersionBar.LJIIJ(!this.LLIZLLLIL);
        }
        ImmersionBar immersionBar2 = this.LLILLJJLI;
        if (immersionBar2 != null) {
            immersionBar2.LJII(!this.LLIZLLLIL);
        }
        ImmersionBar immersionBar3 = this.LLILLJJLI;
        if (immersionBar3 != null) {
            immersionBar3.LJFF.LL = 0;
        }
        View view2 = this.LL;
        if (view2 == null) {
            view2 = null;
        }
        view2.setFitsSystemWindows(true);
        ImmersionBar immersionBar4 = this.LLILLJJLI;
        if (immersionBar4 != null) {
            immersionBar4.LJ();
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.vss);
        C786410Ut5.LJJJJIZL(frameLayout);
        SparkThirdContext sparkThirdContext6 = this.LLILZIL;
        if (sparkThirdContext6 == null || (c1bhu = sparkThirdContext6.titleBar) == null) {
            C1BHO c1bho2 = C1554300qY8.LIZ;
            if (c1bho2 != null && c1bho2.LIZ() != null) {
                c1bhu = new C1BHV();
            } else {
                c1bhu = new C1BHU(this, null, 6);
            }
        }
        this.LLILLL = c1bhu;
        SparkThirdContext sparkThirdContext7 = this.LLILZIL;
        if (sparkThirdContext7 != null) {
            sparkThirdContext7.titleBar = c1bhu;
        }
        C1BHU c1bhuLJFF = c1bhu.LJFF(this);
        if (c1bhuLJFF != null) {
            ViewParent parent = c1bhuLJFF.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                C786410Ut5.LJJJLZIJ(c1bhuLJFF, (ViewGroup) parent);
            }
            frameLayout.addView(c1bhuLJFF);
        }
        C1BHQ c1bhq = this.LLILLL;
        if (c1bhq != null) {
            c1bhq.setTheme(this.LLIZLLLIL);
        }
        C1BHQ c1bhq2 = this.LLILLL;
        if (c1bhq2 != null) {
            c1bhq2.LIZ(this.LLILZIL);
        }
        C1BHQ c1bhq3 = this.LLILLL;
        if (c1bhq3 != null) {
            c1bhq3.setBackClickListener(new ACListenerS168S0100000_34(this, 44));
        }
        C1BHQ c1bhq4 = this.LLILLL;
        int i2 = 8;
        if (c1bhq4 != null) {
            c1bhq4.setCloseAllVisibility(8);
        }
        C1BHQ c1bhq5 = this.LLILLL;
        if (c1bhq5 != null) {
            c1bhq5.setCloseAllClickListener(new ACListenerS168S0100000_34(this, 45));
        }
        SparkThirdContext sparkThirdContext8 = this.LLILZIL;
        if (sparkThirdContext8 != null && sparkThirdContext8.disableOpenInSystem && ((list = sparkThirdContext8.actions) == null || list.isEmpty())) {
            z = false;
        }
        C1BHQ c1bhq6 = this.LLILLL;
        if (c1bhq6 != null) {
            if (z) {
                i2 = 0;
            }
            c1bhq6.setMoreButtonVisibility(i2);
        }
        C1BHQ c1bhq7 = this.LLILLL;
        if (c1bhq7 != null) {
            c1bhq7.setMoreButtonClickListener(new ACListenerS168S0100000_34(this, 46));
        }
        SparkThirdContext sparkThirdContext9 = this.LLILZIL;
        if (sparkThirdContext9 == null || (c1048030dNZ = sparkThirdContext9.progressBar) == null) {
            C1BHO c1bho3 = C1554300qY8.LIZ;
            if (c1bho3 != null && c1bho3.LIZ() != null) {
                c1048030dNZ = new C1048030dNZ();
            } else {
                c1048030dNZ = new InterfaceC1542250qEh() { // from class: X.0dtU
                    public View LIZ;
                    public ProgressBar LIZIZ;

                    @Override // X.InterfaceC1542250qEh
                    public final void LIZ(boolean z2) {
                        int i3;
                        View view3 = this.LIZ;
                        if (view3 == null) {
                            view3 = null;
                        }
                        if (z2) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        C786410Ut5.LJLLLLLL(i3, view3);
                    }

                    @Override // X.InterfaceC1542250qEh
                    public final View LIZIZ(Context context) {
                        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f_v, null, false);
                        this.LIZ = viewTd;
                        if (viewTd == null) {
                            viewTd = null;
                        }
                        this.LIZIZ = (ProgressBar) viewTd.findViewById(R.id.vsr);
                        View view3 = this.LIZ;
                        if (view3 == null) {
                            return null;
                        }
                        return view3;
                    }

                    @Override // X.InterfaceC1542250qEh
                    public final void setProgress(int i3) {
                        ProgressBar progressBar = this.LIZIZ;
                        if (progressBar == null) {
                            progressBar = null;
                        }
                        progressBar.setProgress(i3);
                    }
                };
            }
        }
        this.LLILZLL = c1048030dNZ;
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.s_6);
        if (frameLayout2 != null) {
            C786410Ut5.LJJJJIZL(frameLayout2);
        }
        InterfaceC1542250qEh interfaceC1542250qEh = this.LLILZLL;
        if (interfaceC1542250qEh != null && (viewLIZIZ = interfaceC1542250qEh.LIZIZ(this)) != null) {
            ViewParent parent2 = viewLIZIZ.getParent();
            if (parent2 != null && (parent2 instanceof ViewGroup)) {
                C786410Ut5.LJJJLZIJ(viewLIZIZ, (ViewGroup) parent2);
            }
            if (frameLayout2 != null) {
                frameLayout2.addView(viewLIZIZ);
            }
            InterfaceC1542250qEh interfaceC1542250qEh2 = this.LLILZLL;
            if (interfaceC1542250qEh2 != null) {
                interfaceC1542250qEh2.LIZ(false);
            }
            InterfaceC1542250qEh interfaceC1542250qEh3 = this.LLILZLL;
            if (interfaceC1542250qEh3 != null) {
                interfaceC1542250qEh3.setProgress(5);
            }
        }
        SparkThirdContext sparkThirdContext10 = this.LLILZIL;
        if (sparkThirdContext10 != null) {
            sparkThirdContext10.progressBar = this.LLILZLL;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SparkThirdFragment#");
            SparkThirdContext sparkThirdContext11 = this.LLILZIL;
            if (sparkThirdContext11 != null) {
                str = sparkThirdContext11.containerId;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI(strLIZIZ);
            if (fragmentLJJJJZI != null && (fragmentLJJJJZI instanceof SparkThirdFragment)) {
                SparkThirdFragment sparkThirdFragment = (SparkThirdFragment) fragmentLJJJJZI;
                this.LLILZ = sparkThirdFragment;
                Bundle arguments = sparkThirdFragment.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                SparkThirdFragment sparkThirdFragment2 = this.LLILZ;
                if (sparkThirdFragment2 != null) {
                    SparkThirdContext sparkThirdContext12 = this.LLILZIL;
                    if (sparkThirdContext12 != null) {
                        str3 = sparkThirdContext12.containerId;
                    } else {
                        str3 = null;
                    }
                    C786410Ut5.LJJJI("ContainerId", str3, arguments);
                    sparkThirdFragment2.setArguments(arguments);
                }
            } else {
                SparkThirdFragment sparkThirdFragment3 = new SparkThirdFragment();
                this.LLILZ = sparkThirdFragment3;
                Bundle bundle2 = new Bundle();
                SparkThirdContext sparkThirdContext13 = this.LLILZIL;
                if (sparkThirdContext13 != null) {
                    str2 = sparkThirdContext13.containerId;
                } else {
                    str2 = null;
                }
                C786410Ut5.LJJJI("ContainerId", str2, bundle2);
                sparkThirdFragment3.setArguments(bundle2);
                C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                if (fragmentLJJJJZI != null) {
                    c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
                }
                c19ehLJIIJ.LIZJ(R.id.iiv, this.LLILZ, strLIZIZ);
                c19ehLJIIJ.LJIIJ();
            }
        } catch (BadParcelableException e2) {
            TryCatchGuardChecker.doCheck(e2);
            SparkThirdContext sparkThirdContext14 = this.LLILZIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fragment_transaction:BadParcelableException:");
            sbLIZ2.append(e2.getMessage());
            C1BHN.LIZ(sparkThirdContext14, "fail", C2188811AlT.LIZIZ(sbLIZ2));
        }
        SparkThirdFragment sparkThirdFragment4 = this.LLILZ;
        if (sparkThirdFragment4 != null) {
            sparkThirdFragment4.LL = new InterfaceC1542320qEo() { // from class: X.1BHR
                @Override // X.InterfaceC1542320qEo
                public final void LIZJ(String str8, boolean z2) {
                }

                @Override // X.InterfaceC1542320qEo
                public final void LIZ(String str8) {
                    C1BHQ c1bhq8;
                    if (str8.length() > 0 && (c1bhq8 = this.LIZ.LLILLL) != null) {
                        c1bhq8.setSubTitle(str8);
                    }
                }

                @Override // X.InterfaceC1542320qEo
                public final void LIZIZ(String str8) {
                    C1BHQ c1bhq8 = this.LIZ.LLILLL;
                    if (c1bhq8 != null) {
                        if (str8 == null) {
                            str8 = "";
                        }
                        c1bhq8.setTitle(str8);
                    }
                }
            };
        }
        SparkThirdContext sparkThirdContext15 = this.LLILZIL;
        if (sparkThirdContext15 != null) {
            str4 = sparkThirdContext15.url;
        }
        this.LLIZ = str4;
        if (sparkThirdFragment4 != null) {
            sparkThirdFragment4.LLILLJJLI = new C2202311BHh() { // from class: X.1BHM
                @Override // X.C2202311BHh, X.InterfaceC2202301BHg
                public final void LIZ(int i3, String str8) {
                }

                @Override // X.C2202311BHh, X.InterfaceC2202301BHg
                public final void LIZIZ(String str8) {
                    C1BHL c1bhl;
                    SparkThirdActivity sparkThirdActivity = this.LIZ;
                    C1BHQ c1bhq8 = sparkThirdActivity.LLILLL;
                    if (c1bhq8 != null) {
                        SparkThirdFragment sparkThirdFragment5 = sparkThirdActivity.LLILZ;
                        int i3 = 0;
                        if (sparkThirdFragment5 == null || (c1bhl = sparkThirdFragment5.LLILZ) == null || !c1bhl.canGoBack()) {
                            i3 = 8;
                        }
                        c1bhq8.setCloseAllVisibility(i3);
                    }
                }

                @Override // X.C2202311BHh, X.InterfaceC2202301BHg
                public final void LIZJ(String str8) {
                    SparkThirdActivity sparkThirdActivity = this.LIZ;
                    sparkThirdActivity.LLIZ = str8;
                    sparkThirdActivity.LLLLLZL();
                }
            };
        }
        LLLLLZL();
        SparkThirdContext sparkThirdContext16 = this.LLILZIL;
        if (sparkThirdContext16 != null && (c1bhp = sparkThirdContext16.activityCallback) != null) {
            c1bhp.LIZ(this);
        }
    }

    @Override // androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        ThirdPartyBizCert thirdPartyBizCert;
        try {
            C786410Ut5.LJJJI("currentUrl", this.LLIZ, bundle);
            C786410Ut5.LJJJI("ContainerId", this.LLJ, bundle);
            SparkThirdContext sparkThirdContext = this.LLILZIL;
            int i = 0;
            if (sparkThirdContext != null && (thirdPartyBizCert = sparkThirdContext.bizCert) != null) {
                i = thirdPartyBizCert.dataflowId;
            }
            bundle.putInt("dataflowId", i);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.onSaveInstanceState(bundle);
    }
}
