package com.ss.android.ugc.aweme.wiki;

import X.C09JN;
import X.C0OM1;
import X.C1066080dqg;
import X.C11NJ;
import X.C11NZ;
import X.C11W4;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LN;
import X.C13LP;
import X.C1440005kM;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1741890vQh;
import X.C1799610wvn;
import X.C19775912Yz;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C497820Jfg;
import X.C585740MyC;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC335920DEw;
import X.InterfaceC1541990qEH;
import X.InterfaceC1542320qEo;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ACListenerS163S0100000_29;
import Y.AfS198S0100000_29;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS144S1200000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes30.dex */
public final class AddWikiActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCHELIOSI2ZjIlIiZ9CSEoHiY4IQQvPSYlITE1";
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LL;
    public FrameLayout LLILLL;
    public LinearLayout LLILZ;
    public View LLILZIL;
    public TuxNavBar LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public ListenableFuture<CheckAnchorModerationResultResponse> LLJIJIL;
    public boolean LLJILJIL;
    public long LLJILJILJ;
    public boolean LLJILLL;
    public long LLJJ;
    public boolean LLJJI;
    public String LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final SparkContext LLILLJJLI = new SparkContext();
    public String LLJJIII = "";
    public String LLJJIJI = "";
    public String LLJJIJIIJIL = "";
    public final C11NJ LLJJIJIL = new C11NJ();
    public String LLJJL = "";
    public int LLJJLIIIJLLLLLLLZ = -1;
    public String LLJL = "";
    public String LLJLIL = "";

    static {
        new C11W4();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final boolean LLLLZLLIL() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIILLIIL();
    }

    public final LinearLayout LLLLZLLLI() {
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout != null) {
            return linearLayout;
        }
        return null;
    }

    public final boolean LLLZ() {
        return this.LLJJJJJIL || u.LJIJI(this.LLJ, "Wiki", true) || u.LJIJI(this.LLJ, "Yelp", true) || u.LJIJI(this.LLJ, "TripAdvisor", true) || u.LJIJI(this.LLJ, "Quizlet", true);
    }

    public final void LLZ() {
        String strLIZ;
        String str;
        String str2;
        Boolean boolValueOf;
        String str3 = this.LLJJIII;
        if (u.LJIJI(this.LLJ, "Yelp", true) || u.LJIJI(this.LLJ, "TripAdvisor", true)) {
            str3 = (String) ListProtector.get(a0.LJJLIIIJILLIZJL(str3, new String[]{" - "}, 0, 6), 0);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        String strLLLLLZL = LLLLLZL(getIntent(), "placeholder_enter_from");
        c2344009Gk.LJIIIIZZ("enter_from", (strLLLLLZL == null || strLLLLLZL.length() == 0) ? "video_post_page" : LLLLLZL(getIntent(), "placeholder_enter_from"));
        String strLLLLLZL2 = LLLLLZL(getIntent(), "shoot_way");
        if (strLLLLLZL2 != null && strLLLLLZL2.length() != 0) {
            c2344009Gk.LJFF("shoot_way", strLLLLLZL2);
        }
        String strLLLLLZL3 = LLLLLZL(getIntent(), "creation_id");
        if (strLLLLLZL3 != null && strLLLLLZL3.length() != 0) {
            c2344009Gk.LJFF("creation_id", strLLLLLZL3);
        }
        JSONObject jSONObject = new JSONObject();
        if (!this.LLJJJJ) {
            new AwS144S1200000_29(str3, this, c2344009Gk, 7).invoke();
            return;
        }
        jSONObject.put("add_from", 2);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (strLIZ = C1066080dqg.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB)) == null) {
            strLIZ = this.LLJLIL;
        }
        if (this.LLJJJJLIIL) {
            str = this.LLJJIJIIJIL;
        } else {
            str = "";
            if (TextUtils.isEmpty("") && (str2 = this.LLJJIJI) != null) {
                str = str2;
            }
            if (TextUtils.isEmpty(str)) {
                str = this.LLJJIJIIJIL;
            }
        }
        C1440005kM.LIZ(new C1799610wvn(new AnchorTransData(this.LLJJLIIIJLLLLLLLZ, C786410Ut5.J3(jSONObject), str, "", 1, "", null, true, strLIZ, "", Long.MAX_VALUE, "", this.LLJL, true, null, null, null, null, 0, -1, null, null)));
        finish();
        AnchorListManager anchorListManager = AnchorListManager.LIZ;
        int i = this.LLJJLIIIJLLLLLLLZ;
        String str4 = this.LLJL;
        anchorListManager.getClass();
        AnchorPublishStruct anchorPublishStructLJFF = AnchorListManager.LJFF(i, str4);
        c2344009Gk.LJIIIIZZ("anchor_type", anchorPublishStructLJFF != null ? AnchorListManager.LJIIIIZZ(anchorPublishStructLJFF) : null);
        c2344009Gk.LJIIIIZZ("anchor_entry", str);
        int i2 = this.LLJJLIIIJLLLLLLLZ;
        String str5 = this.LLJL;
        anchorListManager.getClass();
        AnchorPublishStruct anchorPublishStructLJFF2 = AnchorListManager.LJFF(i2, str5);
        c2344009Gk.LJIIIIZZ("new_tag", (anchorPublishStructLJFF2 == null || (boolValueOf = Boolean.valueOf(anchorPublishStructLJFF2.hadNew)) == null || !boolValueOf.booleanValue()) ? CardStruct.IStatusCode.DEFAULT : "1");
        c2344009Gk.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("choose_anchor", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C1440005kM.LIZ(new C585740MyC(System.currentTimeMillis() - this.LLJILJILJ));
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        String strLLLLLZL = LLLLLZL(getIntent(), "enter_from");
        if ((strLLLLLZL != null && strLLLLLZL.length() != 0) || this.LLJJJJJIL) {
            String strLLLLLZL2 = LLLLLZL(getIntent(), "mob_extra");
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (u.LJIJI(this.LLJ, "Yelp", true)) {
                c2344009Gk.LJIIIIZZ("enter_from", LLLLLZL(getIntent(), "enter_from"));
                c2344009Gk.LJIIIIZZ("anchor_type", "Yelp");
                c2344009Gk.LJIIIIZZ("anchor_entry", LLLLLZL(getIntent(), "anchor_entry"));
                c2344009Gk.LJIIIIZZ("author_id", LLLLLZL(getIntent(), "author_id"));
                c2344009Gk.LJIIIIZZ("group_id", LLLLLZL(getIntent(), "group_id"));
                c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLJILJILJ, "duration");
                LLLLZIL(c2344009Gk, strLLLLLZL2);
                C20684815ws.LJIILLIIL("multi_anchor_stay_time", c2344009Gk.LIZ);
            } else if (u.LJIJI(this.LLJ, "TripAdvisor", true)) {
                c2344009Gk.LJIIIIZZ("enter_from", LLLLLZL(getIntent(), "enter_from"));
                c2344009Gk.LJIIIIZZ("anchor_type", "TripAdvisor");
                c2344009Gk.LJIIIIZZ("anchor_entry", LLLLLZL(getIntent(), "anchor_entry"));
                c2344009Gk.LJIIIIZZ("author_id", LLLLLZL(getIntent(), "author_id"));
                c2344009Gk.LJIIIIZZ("group_id", LLLLLZL(getIntent(), "group_id"));
                c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLJILJILJ, "duration");
                LLLLZIL(c2344009Gk, strLLLLLZL2);
                C20684815ws.LJIILLIIL("multi_anchor_stay_time", c2344009Gk.LIZ);
            } else if (!this.LLJJJIL) {
                LLLLZLL(c2344009Gk);
                c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLJILJILJ, "duration");
                c2344009Gk.LJIIIIZZ("anchor_id", LLLLLZL(getIntent(), "anchor_id"));
                LLLLZIL(c2344009Gk, strLLLLLZL2);
                C20684815ws.LJIILLIIL("multi_anchor_stay_time", c2344009Gk.LIZ);
            }
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onResume", true);
        super.onResume();
        if (this.LLJILLL) {
            this.LLJILLL = false;
            this.LLJILJILJ += System.currentTimeMillis() - this.LLJJ;
        }
        if (this.LLJJJIL) {
            this.LLJJIJIL.LIZ(C11NZ.LJJJJLI(500L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C1701940uOG.LIZIZ()).LJJLL(new AfS198S0100000_29(this, 12), new C09JN() { // from class: X.0Uvp
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("AddWikiActivity@9242.onResume$subscribe$2");
                    C1C7U.LIZIZ("AddWikiActivity@9242.onResume$subscribe$2");
                }
            }));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        C1440005kM.LIZ(new IEvent() { // from class: X.11Vt
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!LLLLZLLIL()) {
            super.onBackPressed();
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIII();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (!this.LLJILLL) {
            this.LLJILLL = true;
            this.LLJJ = System.currentTimeMillis();
        }
        this.LLJJIJIL.LJ();
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

    public final void LLLLZI(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("button_name", str);
        c2344009Gk.LJIIIIZZ("page_type", "wiki");
        LLLLZIL(c2344009Gk, LLLLLZL(getIntent(), "mob_extra"));
        C20684815ws.LJIILLIIL("search_webpage_button_click", c2344009Gk.LIZ);
    }

    public final C2344009Gk LLLLZLL(C2344009Gk c2344009Gk) {
        c2344009Gk.LJIIIIZZ("enter_from", LLLLLZL(getIntent(), "enter_from"));
        c2344009Gk.LJIIIIZZ("wiki_entry", LLLLLZL(getIntent(), "wiki_entry"));
        c2344009Gk.LJIIIIZZ("author_id", LLLLLZL(getIntent(), "author_id"));
        c2344009Gk.LJIIIIZZ("group_id", LLLLLZL(getIntent(), "group_id"));
        c2344009Gk.LJIIIIZZ("language", LLLLLZL(getIntent(), "language"));
        return c2344009Gk;
    }

    public final void LLLZLZ(Uri uri) {
        boolean z = true;
        int i = 8;
        if (!u.LJIJI(this.LLJ, "Yelp", true) && !u.LJIJI(this.LLJ, "TripAdvisor", true)) {
            if (u.LJIJI(this.LLJ, "Quizlet", true)) {
                if (LLLLLZL(getIntent(), "enter_from") == null && new Regex(".*/tt/[0-9]*").matches(uri.toString())) {
                    C786410Ut5.LJZL(0, LLLLZLLLI());
                    LLZLI("close", true);
                    LLZLI("back", LLLLZLLIL());
                    LLZLI("more", false);
                    return;
                }
                C786410Ut5.LJZL(8, LLLLZLLLI());
                LLZLI("close", LLLLZLLIL());
                LLZLI("back", true);
                LLZLI("more", LLLZ());
                return;
            }
            View view = null;
            if (u.LJIJI(LLLZIL(uri, "hide_nav_bar"), "1", true)) {
                C786410Ut5.LJZL(8, LLLLZLLLI());
                View view2 = this.LLILZIL;
                if (view2 != null) {
                    view = view2;
                }
                C786410Ut5.LJLLLLLL(8, view);
                TuxNavBar tuxNavBar = this.LLILZLL;
                if (tuxNavBar != null) {
                    C786410Ut5.LLLLZLLLI(tuxNavBar, 8);
                    return;
                }
                return;
            }
            View view3 = this.LLILZIL;
            if (view3 != null) {
                view = view3;
            }
            C786410Ut5.LJLLLLLL(0, view);
            TuxNavBar tuxNavBar2 = this.LLILZLL;
            if (tuxNavBar2 != null) {
                C786410Ut5.LLLLZLLLI(tuxNavBar2, 0);
            }
            boolean zLJIJI = u.LJIJI(LLLZIL(uri, "addButton"), "true", true);
            LinearLayout linearLayoutLLLLZLLLI = LLLLZLLLI();
            if (zLJIJI) {
                i = 0;
            }
            C786410Ut5.LJZL(i, linearLayoutLLLLZLLLI);
            boolean z2 = !u.LJIJI(LLLZIL(uri, "close"), "false", true);
            LLZLI("close", z2);
            if (!(!u.LJIJI(LLLZIL(uri, "back"), "false", true)) && z2) {
                z = false;
            }
            LLZLI("back", z);
            LLZLI("more", LLLZ());
            return;
        }
        if (LLLLLZL(getIntent(), "enter_from") == null) {
            C786410Ut5.LJZL(0, LLLLZLLLI());
            LLZLI("close", true);
            LLZLI("back", LLLLZLLIL());
            LLZLI("more", false);
            return;
        }
        C786410Ut5.LJZL(8, LLLLZLLLI());
        LLZLI("close", LLLLZLLIL());
        LLZLI("back", true);
        LLZLI("more", LLLZ());
    }

    public final String LLLZZIL(String str) {
        String str2;
        MatchResult matchResultFind$default;
        String value;
        String strLJLJLJ;
        List listLJJLIIIJILLIZJL;
        if (str == null || (matchResultFind$default = Regex.find$default(new Regex("https://.+/"), str, 0, 2, null)) == null || (value = matchResultFind$default.getValue()) == null || (strLJLJLJ = C13LN.LJLJLJ(8, value)) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJLJLJ, new String[]{"/"}, 0, 6)) == null || (str2 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0)) == null) {
            str2 = "";
        }
        return C13LP.LJJLIIIJ(C13LP.LLD(2, a0.LJJLIIIJILLIZJL(str2, new String[]{e3.d}, 0, 6)), e3.d, null, null, 0, null, null, 62);
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
        String host;
        String strLJIIIIZZ;
        String strLIZ;
        InterfaceC1541990qEH kitView;
        View viewE1;
        String path;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", true);
        activityConfiguration(AFwS273S0000000_29.get$arr$(202));
        super.onCreate(bundle);
        setContentView(R.layout.ks);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.vsv);
        this.LLILLL = (FrameLayout) findViewById(R.id.f_j);
        this.LLILZ = (LinearLayout) findViewById(R.id.ad0);
        setStatusBar(findViewById(R.id.w0u));
        this.LLILZLL = (TuxNavBar) findViewById(R.id.afj);
        View viewFindViewById = findViewById(R.id.ad0);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 140), viewFindViewById);
        }
        String strLLLLLZL = LLLLLZL(getIntent(), "url");
        String str = "";
        if (strLLLLLZL == null) {
            strLLLLLZL = "";
        }
        SparkContext sparkContext = this.LLILLJJLI;
        sparkContext.bizCert = new ThirdPartyBizCert(402673664);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://webview?url=");
        sbLIZ.append(URLEncoder.encode(strLLLLLZL, "UTF-8"));
        sbLIZ.append("&target_handler=crossPlatform");
        sparkContext.LJJLIIJ(C2188811AlT.LIZIZ(sbLIZ));
        sparkContext.LJJJZ("sec_link_scene", "anchors");
        sparkContext.LJJLIL(new InterfaceC1542320qEo() { // from class: X.11WE
            @Override // X.InterfaceC1542320qEo
            public final void LIZ(String str2) {
            }

            @Override // X.InterfaceC1542320qEo
            public final void LIZJ(String str2, boolean z) {
            }

            @Override // X.InterfaceC1542320qEo
            public final void LIZIZ(String str2) {
                AddWikiActivity addWikiActivity = this.LIZ;
                if (str2 == null) {
                    str2 = "";
                }
                addWikiActivity.LLJJIJI = str2;
            }
        });
        this.LLILLJJLI.LJJJJZ(new C19775912Yz(this, 1));
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext2 = this.LLILLJJLI;
        c1537900q7g.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(this, sparkContext2).LIZ(false);
        this.LL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
        if (viewGroup != null) {
            viewGroup.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
        }
        Uri data = getIntent().getData();
        View view = null;
        if (data != null) {
            host = data.getHost();
        } else {
            host = null;
        }
        if (TextUtils.equals(host, "third_party_common_webview")) {
            Uri data2 = getIntent().getData();
            if (data2 != null) {
                path = data2.getPath();
            } else {
                path = null;
            }
            this.LLJJJIL = true;
            if (TextUtils.equals(path, "/create")) {
                this.LLJJJJ = true;
                String strLLLLLZL2 = LLLLLZL(getIntent(), "add_button_url_regex");
                if (strLLLLLZL2 == null) {
                    strLLLLLZL2 = "";
                }
                this.LLJJL = strLLLLLZL2;
                this.LLJJLIIIJLLLLLLLZ = getIntent().getIntExtra("type", -1);
                String strLLLLLZL3 = LLLLLZL(getIntent(), "subtype");
                if (strLLLLLZL3 == null) {
                    strLLLLLZL3 = "";
                }
                this.LLJL = strLLLLLZL3;
                String strLLLLLZL4 = LLLLLZL(getIntent(), "url");
                if (strLLLLLZL4 == null) {
                    strLLLLLZL4 = "";
                }
                this.LLJLIL = strLLLLLZL4;
            } else if (TextUtils.equals(path, "/show")) {
                this.LLJJJJJIL = true;
            }
        }
        String strLLLLLZL5 = LLLLLZL(getIntent(), "anchor_type");
        if (strLLLLLZL5 == null) {
            strLLLLLZL5 = "";
        }
        this.LLJ = strLLLLLZL5;
        LLLLLZL(getIntent(), "anchor_subtype");
        this.LLJJJJLIIL = getIntent().getBooleanExtra("anchor_nova_source", false);
        String str2 = this.LLJ;
        if (str2 == null || str2.length() == 0) {
            AnchorListManager anchorListManager = AnchorListManager.LIZ;
            int i = this.LLJJLIIIJLLLLLLLZ;
            String str3 = this.LLJL;
            anchorListManager.getClass();
            AnchorPublishStruct anchorPublishStructLJFF = AnchorListManager.LJFF(i, str3);
            if (anchorPublishStructLJFF == null || (strLJIIIIZZ = AnchorListManager.LJIIIIZZ(anchorPublishStructLJFF)) == null) {
                strLJIIIIZZ = "";
            }
            this.LLJ = strLJIIIIZZ;
        }
        if ((LLLLLZL(getIntent(), "enter_from") != null && (u.LJIJI(this.LLJ, "Wiki", true) || u.LJIJI(this.LLJ, "Yelp", true) || u.LJIJI(this.LLJ, "TripAdvisor", true) || u.LJIJI(this.LLJ, "Quizlet", true))) || this.LLJJJJJIL) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("anchor_id", LLLLLZL(getIntent(), "anchor_id"));
            C20684815ws.LJIILLIIL("tns_tiktok_3Panchor_report_page_view", c2344009Gk.LIZ);
        }
        this.LLJILJILJ = System.currentTimeMillis();
        String strLLLLLZL6 = LLLLLZL(getIntent(), "title");
        if (strLLLLLZL6 != null) {
            str = strLLLLLZL6;
        }
        this.LLJJIJIIJIL = str;
        if (!TextUtils.equals(UriProtector.parse(strLLLLLZL).getScheme(), "https")) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", false);
            return;
        }
        LLLZLZ(UriProtector.parse(strLLLLLZL));
        if (u.LJIJI(LLLZIL(UriProtector.parse(strLLLLLZL), "noRedirect"), "true", true)) {
            FrameLayout frameLayout = this.LLILLL;
            if (frameLayout == null) {
                frameLayout = null;
            }
            C786410Ut5.LJZ(0, frameLayout);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
        }
        if (viewGroup != null) {
            viewGroup.requestFocus();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            strLIZ = C1066080dqg.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
        } else {
            strLIZ = null;
        }
        this.LLJJJ = strLIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getKitView()) != null && (viewE1 = kitView.e1()) != null) {
            viewE1.requestFocus();
        }
        this.LLJILJIL = getIntent().getBooleanExtra("show_keyboard", false);
        getWindow().getDecorView().setBackground(new ColorDrawable(C960203pA.LIZ(R.attr.ee, this)));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C497820Jfg.LIZJ(this));
        View view2 = this.LLILZIL;
        if (view2 != null) {
            view = view2;
        }
        C786410Ut5.W5(view, layoutParams);
        TuxNavBar tuxNavBar = this.LLILZLL;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZIZ = "back";
            c1251150ifB.LIZJ(new AwS573S0100000_29(this, 602));
            c0om1.LJ(c1251150ifB);
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_x_mark;
            c1251150ifB2.LIZIZ = "close";
            c1251150ifB2.LIZJ(new AwS573S0100000_29(this, 603));
            c0om1.LJ(c1251150ifB2);
            C1251150ifB c1251150ifB3 = new C1251150ifB();
            c1251150ifB3.LIZLLL();
            c1251150ifB3.LIZJ = R.raw.icon_ellipsis_vertical;
            c1251150ifB3.LIZIZ = "more";
            c1251150ifB3.LIZJ(new AwS560S0100000_16(this, 597));
            c0om1.LIZIZ(c1251150ifB3);
            c0om1.LIZJ = new C1250250idj();
            tuxNavBar.setNavActions(c0om1);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", false);
    }

    public final void setStatusBar(View view) {
        this.LLILZIL = view;
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

    public final C2344009Gk LLLLZIL(C2344009Gk c2344009Gk, String str) {
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        if (mapLJIIJ != null) {
            for (Map.Entry<String, Object> entry : mapLJIIJ.entrySet()) {
                c2344009Gk.LJFF(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return c2344009Gk;
    }

    public final String LLLZIL(Uri uri, String str) {
        try {
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final void LLZLI(Object obj, boolean z) {
        TuxNavBar tuxNavBar = this.LLILZLL;
        if (tuxNavBar != null) {
            tuxNavBar.LJJ(new AwS41S0010000_29(z, 35), obj);
        }
    }
}
