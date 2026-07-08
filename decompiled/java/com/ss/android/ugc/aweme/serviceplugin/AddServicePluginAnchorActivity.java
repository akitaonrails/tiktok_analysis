package com.ss.android.ugc.aweme.serviceplugin;

import X.AbstractC1539010q9T;
import X.C01GW;
import X.C0OM1;
import X.C11NJ;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1524100plQ;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C197039127h;
import X.C20684815ws;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC335920DEw;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ACListenerS147S0100000_12;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS27S0010000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class AddServicePluginAnchorActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOzk6KyA8JTHELIOSo0IStiCCs3GyA+PyYwLRUgPCg6JgQiKic8OgQvPSYlITE1";
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LL;
    public View LLILLJJLI;
    public TuxNavBar LLILLL;
    public C197039127h LLILZ;
    public TuxTextView LLILZIL;
    public String LLILZLL;
    public long LLIZ;
    public boolean LLIZLLLIL;
    public long LLJ;
    public boolean LLJI;
    public C1524100plQ LLJJI;
    public String LLJIJIL = "";
    public final C11NJ LLJILJIL = new C11NJ();
    public String LLJILJILJ = "";
    public int LLJILLL = -1;
    public String LLJJ = "";
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(202));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(201));
    public String LLJJIJIIJIL = "";
    public String LLJJIJIL = "";
    public String LLJJJ = "";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.serviceplugin.AddServicePluginAnchorActivity", "onResume", true);
        super.onResume();
        if (this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
            this.LLIZ += System.currentTimeMillis() - this.LLJ;
        }
        LLLLZI();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.serviceplugin.AddServicePluginAnchorActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.serviceplugin.AddServicePluginAnchorActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.serviceplugin.AddServicePluginAnchorActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.serviceplugin.AddServicePluginAnchorActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLZI() {
        WebKitView webKitView;
        C1524100plQ c1524100plQ = this.LLJJI;
        if (c1524100plQ == null || (webKitView = c1524100plQ.LLIZ) == null) {
            return;
        }
        boolean zCanGoBack = webKitView.canGoBack();
        TuxNavBar tuxNavBar = this.LLILLL;
        if (tuxNavBar == null) {
            tuxNavBar = null;
        }
        tuxNavBar.LJJ(new AwS27S0010000_12(zCanGoBack, 7), "back");
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        WebKitView webKitView;
        C1524100plQ c1524100plQ = this.LLJJI;
        if (c1524100plQ == null || (webKitView = c1524100plQ.LLIZ) == null) {
            return;
        }
        if (!webKitView.canGoBack()) {
            finish();
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = null;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIII();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        String strLLLLLZL = LLLLLZL(getIntent(), "enter_from");
        if (strLLLLLZL != null && strLLLLLZL.length() != 0) {
            String strLLLLLZL2 = LLLLLZL(getIntent(), "mob_extra");
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", LLLLLZL(getIntent(), "enter_from"));
            c2344009Gk.LJIIIIZZ("author_id", LLLLLZL(getIntent(), "author_id"));
            c2344009Gk.LJIIIIZZ("group_id", LLLLLZL(getIntent(), "group_id"));
            c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLIZ, "duration");
            c2344009Gk.LJIIIIZZ("anchor_id", LLLLLZL(getIntent(), "anchor_id"));
            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(strLLLLLZL2);
            if (mapLJIIJ != null) {
                for (Map.Entry<String, Object> entry : mapLJIIJ.entrySet()) {
                    c2344009Gk.LJFF(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
            C20684815ws.LJIILLIIL("multi_anchor_stay_time", c2344009Gk.LIZ);
        }
        this.LLJILJIL.LJ();
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (!this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
            this.LLJ = System.currentTimeMillis();
        }
        this.LLJILJIL.LJ();
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        String strLJIIIIZZ;
        Bundle extras;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.serviceplugin.AddServicePluginAnchorActivity", "onCreate", true);
        activityConfiguration(AFwS245S0000000_12.get$arr$(84));
        super.onCreate(bundle);
        setContentView(R.layout.k9);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.webview_container);
        setStatusBar(findViewById(R.id.w0u));
        this.LLILLL = (TuxNavBar) findViewById(R.id.aeb);
        this.LLILZ = (C197039127h) findViewById(R.id.eoq);
        this.LLILZIL = (TuxTextView) findViewById(R.id.che);
        C197039127h c197039127h = this.LLILZ;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS147S0100000_12(this, 258));
        }
        C197039127h c197039127h2 = this.LLILZ;
        if (c197039127h2 != null) {
            c197039127h2.setEnabled(false);
        }
        String strLLLLLZL = LLLLLZL(getIntent(), "url");
        String str = "";
        if (strLLLLLZL == null) {
            strLLLLLZL = "";
        }
        String strLLLLLZL2 = LLLLLZL(getIntent(), "platform_id");
        if (strLLLLLZL2 == null) {
            strLLLLLZL2 = "";
        }
        this.LLJJIJIL = strLLLLLZL2;
        String strLLLLLZL3 = LLLLLZL(getIntent(), "platform_name");
        if (strLLLLLZL3 == null) {
            strLLLLLZL3 = "";
        }
        this.LLJJJ = strLLLLLZL3;
        this.LLJILJILJ = strLLLLLZL;
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(strLLLLLZL);
        sparkContext.bizCert = new ThirdPartyBizCert(402685961);
        sparkContext.LJJL("need_sec_link", true);
        sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0Tqq
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                C1541480qDS c1541480qDS;
                if ((interfaceC1531560pxS instanceof C1541480qDS) && (c1541480qDS = (C1541480qDS) interfaceC1531560pxS) != null) {
                    c1541480qDS.LJII(C1524100plQ.class, new AwS591S0100000_12(this.LLILLJJLI, 645));
                }
            }
        });
        c1537900q7g.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(this, sparkContext).LIZ(false);
        this.LL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
        viewGroup.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, new ViewGroup.LayoutParams(-1, -1));
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        TuxNavBar tuxNavBar = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = null;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
        this.LLJILLL = getIntent().getIntExtra("type", -1);
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (extras == null || (string = extras.getString("subtype")) == null) {
            string = "";
        }
        this.LLJJ = string;
        LLLLLZL(getIntent(), "url");
        String strLLLLLZL4 = LLLLLZL(getIntent(), "anchor_type");
        if (strLLLLLZL4 == null) {
            strLLLLLZL4 = "";
        }
        this.LLILZLL = strLLLLLZL4;
        LLLLLZL(getIntent(), "anchor_subtype");
        String str2 = this.LLILZLL;
        if (str2 == null || str2.length() == 0) {
            AnchorListManager anchorListManager = AnchorListManager.LIZ;
            int i = this.LLJILLL;
            String str3 = this.LLJJ;
            anchorListManager.getClass();
            AnchorPublishStruct anchorPublishStructLJFF = AnchorListManager.LJFF(i, str3);
            if (anchorPublishStructLJFF == null || (strLJIIIIZZ = AnchorListManager.LJIIIIZZ(anchorPublishStructLJFF)) == null) {
                strLJIIIIZZ = "";
            }
            this.LLILZLL = strLJIIIIZZ;
        }
        if (LLLLLZL(getIntent(), "enter_from") != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("anchor_id", LLLLLZL(getIntent(), "anchor_id"));
            C20684815ws.LJIILLIIL("tns_tiktok_3Panchor_report_page_view", c2344009Gk.LIZ);
        }
        this.LLIZ = System.currentTimeMillis();
        String strLLLLLZL5 = LLLLLZL(getIntent(), "title");
        if (strLLLLLZL5 != null) {
            str = strLLLLLZL5;
        }
        this.LLJIJIL = str;
        getWindow().getDecorView().setBackground(new ColorDrawable(C960203pA.LIZ(R.attr.ee, this)));
        View view = this.LLILLJJLI;
        if (view == null) {
            view = null;
        }
        C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, C497820Jfg.LIZJ(this)));
        TuxNavBar tuxNavBar2 = this.LLILLL;
        if (tuxNavBar2 == null) {
            tuxNavBar2 = null;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZIZ = "back";
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 584));
        c0om1.LJ(c1251150ifB);
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_x_mark;
        c1251150ifB2.LIZIZ = "close";
        c1251150ifB2.LIZJ(new AwS556S0100000_12(this, 585));
        c0om1.LJ(c1251150ifB2);
        c0om1.LIZJ = new C1250250idj();
        tuxNavBar2.setNavActions(c0om1);
        TuxNavBar tuxNavBar3 = this.LLILLL;
        if (tuxNavBar3 != null) {
            tuxNavBar = tuxNavBar3;
        }
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = this.LLJIJIL;
        tuxNavBar.LJIJJ(c1250250idj);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.serviceplugin.AddServicePluginAnchorActivity", "onCreate", false);
    }

    public final void setStatusBar(View view) {
        this.LLILLJJLI = view;
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

    public static String LLLLLZL(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
