package com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core;

import X.C0OM1;
import X.C0PEM;
import X.C123100dR;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C15438062q;
import X.C1697810uHb;
import X.C20600815jK;
import X.C20642515q3;
import X.C23250099c;
import X.C299020Bno;
import X.C335910DEv;
import X.C682730QqF;
import X.C682750QqH;
import X.C960203pA;
import X.EnumC335920DEw;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS37S0100000_10;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.discover.model.CardText;
import com.ss.android.ugc.aweme.discover.model.SearchMinis;
import com.ss.android.ugc.aweme.discover.model.SearchMinisItem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.model.SearchMinisItemDataModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.ui.SearchMinisCardItemCell;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMinisAllResultsActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiPSAjHELIOSOyAtOyw7ZiglJyYgZiYjOyp9GyAtOyw7BSwiIDwSJCkeLDwmJDE/CCwnITMlPTY=";
    public ViewOnAttachStateChangeListenerC20604515jv LL;
    public TuxNavBar LLILLJJLI;
    public SearchMinis LLILLL;
    public HashMap<String, String> LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public boolean LLJ;
    public volatile boolean LLJI;
    public volatile int LLJIJIL;
    public volatile boolean LLJILJIL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisAllResultsActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisAllResultsActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisAllResultsActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisAllResultsActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisAllResultsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final ViewOnAttachStateChangeListenerC20604515jv LLLLZI() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ax1);
            this.LL = (ViewOnAttachStateChangeListenerC20604515jv) callbackFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) callbackFindViewById;
    }

    public final void LLLLZIL() {
        if (!this.LLJ || this.LLJILJIL) {
            return;
        }
        this.LLJILJIL = true;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C682750QqH(this, null), 2);
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
        Bundle extras;
        Object obj;
        List<SearchMinisItem> list;
        String strValueOf;
        String strValueOf2;
        String str;
        List<CardText> list2;
        HashMap<String, String> map;
        List<SearchMinisItem> list3;
        SearchMinis searchMinis;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisAllResultsActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (extras == null) {
                extras = Bundle.EMPTY;
            }
        } else {
            extras = Bundle.EMPTY;
        }
        Serializable serializable = extras.getSerializable("minis_card");
        if ((serializable instanceof SearchMinis) && (searchMinis = (SearchMinis) serializable) != null) {
            this.LLILLL = searchMinis;
        }
        this.LLJ = extras.getBoolean("is_mini_game", false);
        try {
            obj = extras.get("minis_et_params");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            obj = null;
        } catch (OutOfMemoryError e3) {
            TryCatchGuardChecker.doCheck(e3);
            obj = null;
        }
        if ((obj instanceof HashMap) && (map = (HashMap) obj) != null) {
            this.LLILZ = map;
            if (this.LLJ) {
                C682730QqF.LIZ.getClass();
                C682730QqF.LJFF("mini_game", map);
            } else {
                SearchMinis searchMinis2 = this.LLILLL;
                if (searchMinis2 != null && (list3 = searchMinis2.minisItems) != null && (!list3.isEmpty())) {
                    C682730QqF.LIZ.getClass();
                    C682730QqF.LJFF("mini_app", map);
                }
            }
        }
        String string = extras.getString("search_keyword");
        if (string != null) {
            this.LLILZIL = string;
        }
        String string2 = extras.getString("search_id");
        if (string2 != null) {
            this.LLILZLL = string2;
        }
        String string3 = extras.getString("doc_id");
        if (string3 != null) {
            this.LLIZ = string3;
        }
        SearchMinis searchMinis3 = this.LLILLL;
        if (searchMinis3 != null && (list2 = searchMinis3.cardTextList) != null) {
            int i = 0;
            for (CardText cardText : list2) {
                int i2 = i + 1;
                if (i >= 0) {
                    CardText cardText2 = cardText;
                    if (Intrinsics.LJFF(cardText2.textKey, "minis_search_card_title")) {
                        this.LLIZLLLIL = cardText2.textContent;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (!C123100dR.LIZ(this.LLIZLLLIL)) {
            this.LLIZLLLIL = C20642515q3.LJI(2131822274);
        }
        setContentView(R.layout.f1_);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLZI = LLLLZI();
        if (viewOnAttachStateChangeListenerC20604515jvLLLLZI != null) {
            viewOnAttachStateChangeListenerC20604515jvLLLLZI.LJIILJJIL(SearchMinisCardItemCell.class);
        }
        SearchMinis searchMinis4 = this.LLILLL;
        String str2 = "";
        if (searchMinis4 != null && (list = searchMinis4.minisItems) != null) {
            List<CardText> list4 = searchMinis4.cardTextList;
            if (list4 != null) {
                strValueOf = null;
                strValueOf2 = null;
                int i3 = 0;
                for (CardText cardText3 : list4) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        CardText cardText4 = cardText3;
                        if (Intrinsics.LJFF(cardText4.textKey, "minis_search_card_click_button")) {
                            strValueOf = String.valueOf(cardText4.textContent);
                        }
                        if (Intrinsics.LJFF(cardText4.textKey, "minis_search_card_recent_tag")) {
                            strValueOf2 = String.valueOf(cardText4.textContent);
                        }
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                strValueOf = null;
                strValueOf2 = null;
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i5 = 0;
            for (SearchMinisItem searchMinisItem : list) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    SearchMinisItem searchMinisItem2 = searchMinisItem;
                    if (!Intrinsics.LJFF(searchMinisItem2.isRecently(), Boolean.TRUE)) {
                        str = "";
                    } else {
                        str = strValueOf2;
                    }
                    arrayList.add(new SearchMinisItemDataModel(searchMinisItem2, strValueOf, str, this.LLILZ, true, String.valueOf(i5)));
                    i5 = i6;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            this.LLJIJIL = arrayList.size();
            C20600815jK<InterfaceC1891350zJl> state = LLLLZI().getState();
            if (state != null) {
                state.LJIILL(arrayList, null);
            }
        }
        LLLLZIL();
        LLLLZI().addOnScrollListener(new AsS37S0100000_10(this, 19));
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        immersionBarLJIILJJIL.LJIIL();
        immersionBarLJIILJJIL.LJIIJJI();
        tuxImmersionBar.LJIIJJI();
        tuxImmersionBar.LIZ(false);
        immersionBarLJIILJJIL.LJIIJ(!C960203pA.LIZIZ(this));
        tuxImmersionBar.LIZLLL();
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p15);
            this.LLILLJJLI = (TuxNavBar) callbackFindViewById;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) callbackFindViewById;
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZJ(new AwS554S0100000_10(this, 1097));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        String str3 = this.LLIZLLLIL;
        if (str3 != null) {
            str2 = str3;
        }
        c1250250idj.LIZJ = str2;
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisAllResultsActivity", "onCreate", false);
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLLLZL(int r17, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Response> r18) {
        /*
            r16 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C682770QqJ
            r6 = r16
            if (r0 == 0) goto L25
            r4 = r3
            X.0QqJ r4 = (X.C682770QqJ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r4.LLILLL = r2
        L16:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r5 = 0
            r11 = 1
            if (r0 == 0) goto L33
            if (r0 != r11) goto L2b
            goto L70
        L25:
            X.0QqJ r4 = new X.0QqJ
            r4.<init>(r6, r3)
            goto L16
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreApiV2.LIZ     // Catch: java.lang.Exception -> L82
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Exception -> L82
            com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreApiV2$Api r2 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreApiV2.Api) r2     // Catch: java.lang.Exception -> L82
            if (r2 == 0) goto L81
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L82
            X.04rF r0 = X.C1227904rF.LIZ     // Catch: java.lang.Exception -> L82
            java.lang.String r13 = r6.LLILZIL     // Catch: java.lang.Exception -> L82
            java.lang.String r14 = r6.LLILZLL     // Catch: java.lang.Exception -> L82
            java.lang.String r15 = r6.LLIZ     // Catch: java.lang.Exception -> L82
            com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Request r6 = new com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Request     // Catch: java.lang.Exception -> L82
            java.lang.String r7 = "16"
            java.lang.String r12 = ""
            r8 = 0
            r10 = 7
            r9 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L82
            r0.getClass()     // Catch: java.lang.Exception -> L82
            java.lang.String r0 = X.C1227904rF.LJI(r6)     // Catch: java.lang.Exception -> L82
            if (r0 == 0) goto L76
            r1.<init>(r0)     // Catch: java.lang.Exception -> L82
            java.util.Map r0 = X.C663670Q1l.LIZIZ(r1)     // Catch: java.lang.Exception -> L82
            r4.LLILLL = r11     // Catch: java.lang.Exception -> L82
            java.lang.Object r1 = r2.LIZ(r0, r4)     // Catch: java.lang.Exception -> L82
            if (r1 != r3) goto L73
            return r3
        L70:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L82
        L73:
            com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Response r1 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Response) r1     // Catch: java.lang.Exception -> L82
            return r1
        L76:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L82
            r1.toString()     // Catch: java.lang.Exception -> L82
            r0.<init>(r1)     // Catch: java.lang.Exception -> L82
            throw r0     // Catch: java.lang.Exception -> L82
        L81:
            return r5
        L82:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisAllResultsActivity.LLLLLZL(int, X.05Vn):java.lang.Object");
    }
}
