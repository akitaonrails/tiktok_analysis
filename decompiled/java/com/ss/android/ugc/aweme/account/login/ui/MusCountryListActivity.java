package com.ss.android.ugc.aweme.account.login.ui;

import X.C0DLI;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1697810uHb;
import X.C1748570vbT;
import X.C1748940vc4;
import X.C1749260vca;
import X.C1775970wJf;
import X.C20469080d;
import X.C21630519l1;
import X.C2280601EOk;
import X.C299020Bno;
import X.C335910DEv;
import X.C444960Hcc;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1748590vbV;
import X.InterfaceC1748950vc5;
import X.InterfaceC1916090zxf;
import Y.ACListenerS160S0100000_26;
import Y.AComparatorS523S0100000_26;
import Y.AObjectS125S0000000_26;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import u4.q0;

/* JADX INFO: loaded from: classes27.dex */
public class MusCountryListActivity extends BaseActivity implements InterfaceC1916090zxf {
    public static InterfaceC1748950vc5 LLJILJILJ = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiHELIOSJSA0IStiPCZ9BTA/CiAmJjE+MAM6OzENKjs6Piw4MA==";
    public RecyclerView LL;
    public C21630519l1 LLILLJJLI;
    public TuxTextView LLILLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public Set<String> LLJ;
    public C1749260vca LLJIJIL;
    public ImageView LLJILJIL;
    public final ArrayList<C2280601EOk> LLILZ = new ArrayList<>();
    public final ArrayList<C2280601EOk> LLILZIL = new ArrayList<>();
    public Boolean LLILZLL = Boolean.FALSE;
    public String LLJI = "";

    @Override // X.InterfaceC1916090zxf
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        int i = C1389600mGU.LIZIZ(this) ? 0 : R.anim.ad;
        overridePendingTransition(0, i);
        InterfaceC1748950vc5 interfaceC1748950vc5 = LLJILJILJ;
        if (interfaceC1748950vc5 != null) {
            interfaceC1748950vc5.onExit();
            LLJILJILJ = null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
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

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
    }

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
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onCreate", true);
        activityConfiguration(new AObjectS125S0000000_26(2));
        super.onCreate(bundle);
        String[] stringArrayExtra = getIntent().getStringArrayExtra("excluded_countries_alpha2");
        if (stringArrayExtra != null) {
            HashSet hashSet = new HashSet();
            this.LLJ = hashSet;
            hashSet.addAll(Arrays.asList(stringArrayExtra));
        }
        C2280601EOk c2280601EOk = C2280601EOk.LJFF;
        C20469080d.LIZ();
        ArrayList arrayList = new ArrayList(C2280601EOk.LJI);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C2280601EOk c2280601EOk2 = (C2280601EOk) it2.next();
            Set<String> set = this.LLJ;
            if (set != null) {
                if (((HashSet) set).contains(c2280601EOk2.LIZJ)) {
                    it2.remove();
                }
            }
            c2280601EOk2.LIZIZ = getResources().getString(c2280601EOk2.LIZ).substring(0, 1);
        }
        Collections.sort(arrayList, new AComparatorS523S0100000_26(this, 4));
        this.LLILZIL.addAll(arrayList);
        this.LLILZ.addAll(arrayList);
        setContentView(R.layout.x7);
        String stringExtra2 = null;
        try {
            stringExtra = getIntent().getStringExtra("login_panel_type");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LLIZ = stringExtra;
        try {
            stringExtra2 = getIntent().getStringExtra("page");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        this.LLIZLLLIL = stringExtra2;
        this.LLJIJIL = (C1749260vca) findViewById(R.id.u78);
        q0.LJIJI(findViewById(R.id.title), true);
        this.LLJILJIL = (ImageView) findViewById(R.id.bn2);
        this.LL = (RecyclerView) findViewById(R.id.tv5);
        this.LLILLL = (TuxTextView) findViewById(R.id.pac);
        this.LL.setLayoutManager(new LinearLayoutManager(this));
        C1748570vbT c1748570vbT = new C1748570vbT(this.LLILZ);
        this.LL.setAdapter(c1748570vbT);
        c1748570vbT.LLILZ = new InterfaceC1748590vbV() { // from class: X.0vc3
            @Override // X.InterfaceC1748590vbV
            public final void LIZ(C2280601EOk c2280601EOk3) {
                MusCountryListActivity musCountryListActivity = this.LIZ;
                String str = MusCountryListActivity._pnsPageId;
                musCountryListActivity.getClass();
                if (c2280601EOk3 != null) {
                    C1238280iKQ.LIZ(c2280601EOk3);
                    InterfaceC1748950vc5 interfaceC1748950vc5 = MusCountryListActivity.LLJILJILJ;
                    if (interfaceC1748950vc5 != null) {
                        interfaceC1748950vc5.onChanged(c2280601EOk3.LIZLLL, c2280601EOk3.LIZJ);
                    }
                    String str2 = musCountryListActivity.LLIZ;
                    String str3 = musCountryListActivity.LLIZLLLIL;
                    String str4 = musCountryListActivity.LLJI;
                    C853660XeG.LIZ.getClass();
                    C0XGR c0xgr = new C0XGR();
                    if (str2 != null) {
                        c0xgr.LIZJ("login_panel_type", str2);
                    }
                    if (str3 != null) {
                        c0xgr.LIZJ("page", str3);
                    }
                    c0xgr.LIZJ("input_type", str4);
                    C20684815ws.LJIILLIIL("select_region_code_result", c0xgr.LIZ);
                    musCountryListActivity.onBackPressed();
                }
            }
        };
        this.LLILLJJLI = (C21630519l1) findViewById(R.id.vap);
        ArrayList arrayList2 = new ArrayList();
        Iterator<C2280601EOk> it3 = this.LLILZIL.iterator();
        String str = "";
        while (it3.hasNext()) {
            String str2 = it3.next().LIZIZ;
            if (!str2.equals(str)) {
                arrayList2.add(str2);
                str = str2;
            }
        }
        this.LLILLJJLI.setIndexItems((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        this.LLILLJJLI.setPosition(C444960Hcc.LIZIZ() ? 1 : 0);
        this.LLILLJJLI.setOnSelectIndexItemListener(new C1748940vc4(this));
        C0DLI.LIZ(this, this.LLJIJIL);
        this.LLJIJIL.getEditTextView().addTextChangedListener(new C1775970wJf(c1748570vbT, this, 3));
        C786410Ut5.Q7(this.LLJILJIL, new ACListenerS160S0100000_26(this, 85));
        getWindow().setSoftInputMode(48);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
