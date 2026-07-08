package com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui;

import X.AbstractC683590Qrd;
import X.C01GW;
import X.C0OM1;
import X.C0P6P;
import X.C0TVI;
import X.C1237450iJ5;
import X.C1308910kAL;
import X.C14K9;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C682300QpY;
import X.C786410Ut5;
import X.EnumC335920DEw;
import Y.ACListenerS114S0200000_10;
import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.model.SearchEffect;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.viewmodel.SearchEffectListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS47S0100100_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchEffectListActivity extends BaseActivity implements C0P6P {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiHELIOSLCk1LSY4JSYgPGsvJj02ZjAlZxw2KTcvIQo1LiAvPQM6OzENKjs6Piw4MA==";
    public View LLILLJJLI;
    public String LLILLL;
    public String LLILZIL;
    public final C682300QpY LLILZLL;
    public String LLIZ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 554));
    public String LLILZ = "tiktok_effects";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui.SearchEffectListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui.SearchEffectListActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui.SearchEffectListActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui.SearchEffectListActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui.SearchEffectListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        String str = this.LLILLL;
        if (str != null) {
            ((SearchEffectListViewModel) this.LL.getValue()).vQ2(getBasicItemCount(), str, this.LLILZ, this.LLIZ, null);
            showLoadMoreLoading();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0QpY, X.0QrV] */
    public SearchEffectListActivity() {
        ?? r0 = new AbstractC683590Qrd<SearchEffect>() { // from class: X.0QpY
            @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
            public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                C682310QpZ c682310QpZ;
                SearchEffect searchEffect;
                super.onViewAttachedToWindow(viewHolder);
                if ((viewHolder instanceof C682310QpZ) && (c682310QpZ = (C682310QpZ) viewHolder) != null && (searchEffect = c682310QpZ.LLILZLL) != null) {
                    C651970Phj.LLILLL.getClass();
                    Map mapLIZJ = C651980Phk.LIZJ();
                    C682330Qpb c682330Qpb = new C682330Qpb();
                    c682330Qpb.LJIIZILJ("search_id", (String) mapLIZJ.get("search_id"));
                    c682330Qpb.LJIJI("search_result_id", searchEffect.getDocId());
                    c682330Qpb.LJIJJ("search_result");
                    c682330Qpb.LJIIZILJ("search_keyword", (String) mapLIZJ.get("search_keyword"));
                    c682330Qpb.LJIIZILJ("token_type", "tiktok_effects");
                    c682330Qpb.LJJIII(0);
                    c682330Qpb.LJJIIZ(Integer.valueOf(c682310QpZ.getAdapterPosition()));
                    c682330Qpb.LJIIZILJ("prop_id", searchEffect.getEffectId());
                    c682330Qpb.LJIILJJIL();
                }
            }

            @Override // X.AbstractC683590Qrd
            public final void setData(List<SearchEffect> list) {
                super.setData(list);
                resetLoadMoreState();
            }

            @Override // X.AbstractC438050HFr
            public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                SearchEffect searchEffect;
                List<T> list = this.mmItems;
                if (list != 0 && (searchEffect = (SearchEffect) ListProtector.get(list, i)) != null) {
                    C682310QpZ c682310QpZ = (C682310QpZ) viewHolder;
                    c682310QpZ.LLILZLL = searchEffect;
                    c682310QpZ.LL.setText(searchEffect.getName());
                    if (searchEffect.getUseNumber() < 0) {
                        C786410Ut5.LLIL(c682310QpZ.LLILLJJLI, 8);
                    } else {
                        c682310QpZ.LLILLJJLI.setText(c682310QpZ.itemView.getContext().getResources().getQuantityString(2131755694, searchEffect.getUseNumber(), C820940WIi.LIZ(searchEffect.getUseNumber())));
                    }
                    if (TextUtils.isEmpty(searchEffect.getHint())) {
                        C786410Ut5.LLIL(c682310QpZ.LLILLL, 8);
                    } else {
                        c682310QpZ.LLILLL.setText(searchEffect.getHint());
                    }
                    UrlModel iconUrl = searchEffect.getIconUrl();
                    if (iconUrl != null) {
                        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(iconUrl));
                        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
                        c1331670kl3LJIIIIZZ.LJJ(c682310QpZ.LLILZ);
                        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                    }
                    C786410Ut5.I7(new ACListenerS114S0200000_10(searchEffect, c682310QpZ, 0), c682310QpZ.itemView);
                    C786410Ut5.O7(c682310QpZ.LLILZIL, new ACListenerS114S0200000_10(searchEffect, c682310QpZ, 1));
                }
            }

            @Override // X.AbstractC438050HFr
            public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
                Context context;
                int i2 = C682310QpZ.LLIZ;
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                } else {
                    context = null;
                }
                return new C682310QpZ(C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ey5, viewGroup, false));
            }
        };
        r0.setLoadMoreListener(this);
        this.LLILZLL = r0;
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
        String stringExtra;
        String string;
        String stringExtra2;
        String stringExtra3;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui.SearchEffectListActivity", "onCreate", true);
        activityConfiguration(AFwS241S0000000_10.get$arr$(266));
        super.onCreate(bundle);
        setContentView(R.layout.ese);
        getIntent().getIntExtra("type", 0);
        View view = null;
        try {
            stringExtra = getIntent().getStringExtra("alasrc");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "tiktok_effects";
        }
        this.LLILZ = stringExtra;
        try {
            string = getIntent().getStringExtra("title");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (string == null) {
            string = getString(2131847142);
        }
        this.LLILZIL = string;
        try {
            stringExtra2 = getIntent().getStringExtra("keyword");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            stringExtra2 = null;
        }
        this.LLILLL = stringExtra2;
        try {
            stringExtra3 = getIntent().getStringExtra("search_id");
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            stringExtra3 = null;
        }
        this.LLIZ = stringExtra3;
        String str = this.LLILLL;
        if (str != null) {
            ((SearchEffectListViewModel) this.LL.getValue()).vQ2(getBasicItemCount(), str, this.LLILZ, this.LLIZ, new AwS47S0100100_10(this, SystemClock.elapsedRealtime(), 0));
        }
        ((SearchEffectListViewModel) this.LL.getValue()).LL.observe(this, new AObserverS214S0100000_10(this, 48));
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(findViewById(R.id.u9x), new C0TVI() { // from class: X.0DMC
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view2.setPadding(c20244914JjLIZ.LIZ, c20244914JjLIZ.LIZIZ, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        TuxNavBar tuxNavBar = (TuxNavBar) findViewById(R.id.y08);
        if (tuxNavBar == null) {
            tuxNavBar = null;
        }
        C0OM1 c0om1 = new C0OM1();
        String str2 = this.LLILZIL;
        if (str2 == null) {
            str2 = "";
        }
        C1237450iJ5.LIZIZ(c0om1, str2, new AwS554S0100000_10(this, 11));
        tuxNavBar.setNavActions(c0om1);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ms4);
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setAdapter(this.LLILZLL);
        View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) findViewById(R.id.g3r));
        this.LLILLJJLI = viewLJLLLL;
        if (viewLJLLLL != null) {
            view = viewLJLLLL;
        }
        C786410Ut5.LJLLLLLL(0, view);
        setLoadEmptyText("");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui.SearchEffectListActivity", "onCreate", false);
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
