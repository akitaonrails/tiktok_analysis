package com.ss.android.ugc.aweme.newcreatoredit;

import X.AbstractC480470Isn;
import X.AnonymousClass1653;
import X.C01GW;
import X.C0BJD;
import X.C0P0T;
import X.C117R;
import X.C1308910kAL;
import X.C1391600mJi;
import X.C15438062q;
import X.C161T;
import X.C1697810uHb;
import X.C19U0;
import X.C20703515zt;
import X.C207167164v;
import X.C207169164x;
import X.C21384118mN;
import X.C21384818mU;
import X.C21546519Tz;
import X.C299020Bno;
import X.C335910DEv;
import X.C450720Hlu;
import X.C452501pT;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1235690iGF;
import X.EnumC335920DEw;
import X.InterfaceC1584740rLE;
import X.InterfaceC469360Ias;
import Y.ACListenerS165S0100000_31;
import Y.AObserverS233S0100000_31;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel;
import com.ss.android.ugc.aweme.newcreatoredit.original.NewCreatorCaptionEditOriginalFragment;
import com.ss.android.ugc.aweme.newcreatoredit.translation.NewCreatorCaptionEditTranslationFragment;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class NewCreatorCaptionEditActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZispPiwhLSQ4JjHELIOS02LCw4ZwE2PwY+LC4nJzcPKD8nISoiDCs6PAQvPSYlITE1";
    public Aweme LL;
    public final List<C207167164v> LLILLJJLI = new ArrayList();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 923));
    public C117R LLILZ;
    public AnonymousClass1653 LLILZIL;
    public C207169164x LLILZLL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditActivity", "onStart", false);
    }

    public final NewCreatorCaptionEditViewModel LLLLZI() {
        return (NewCreatorCaptionEditViewModel) this.LLILLL.getValue();
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
        Aweme aweme;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.b5q);
        getWindow().setNavigationBarColor(-16777216);
        long longExtra = getIntent().getLongExtra("cla_subtitle_id", 0L);
        String strLLLLLZL = LLLLLZL(getIntent(), "item_id");
        String strLLLLLZL2 = LLLLLZL(getIntent(), "group_id");
        String strLLLLLZL3 = LLLLLZL(getIntent(), "author_id");
        String strLLLLLZL4 = LLLLLZL(getIntent(), "enter_from");
        String strLLLLLZL5 = LLLLLZL(getIntent(), "enter_method");
        getIntent().getBooleanExtra("should_show_caption_on_video", true);
        boolean booleanExtra = getIntent().getBooleanExtra("add_caption_flow_entry", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("with_tap_to_edit", false);
        Serializable serializableExtra = getIntent().getSerializableExtra("aweme");
        C207169164x c207169164x = null;
        if (serializableExtra instanceof Aweme) {
            aweme = (Aweme) serializableExtra;
        } else {
            aweme = null;
        }
        this.LL = aweme;
        final C21384118mN c21384118mN = new C21384118mN(strLLLLLZL2, strLLLLLZL3, strLLLLLZL4, strLLLLLZL5);
        LLLLZI().LLILZLL = new C21384818mU(Long.valueOf(longExtra), strLLLLLZL, strLLLLLZL2, strLLLLLZL3, strLLLLLZL4, strLLLLLZL5, Boolean.valueOf(booleanExtra), this.LL, Boolean.valueOf(booleanExtra2));
        if (C20703515zt.LJJIIJ(this.LL)) {
            NewCreatorCaptionEditOriginalFragment newCreatorCaptionEditOriginalFragment = new NewCreatorCaptionEditOriginalFragment();
            newCreatorCaptionEditOriginalFragment.LLILZ = LLLLZI();
            ((ArrayList) this.LLILLJJLI).add(new C207167164v(newCreatorCaptionEditOriginalFragment, getString(2131828786)));
        }
        if (!C0BJD.LIZ()) {
            NewCreatorCaptionEditTranslationFragment newCreatorCaptionEditTranslationFragment = new NewCreatorCaptionEditTranslationFragment();
            newCreatorCaptionEditTranslationFragment.LLILZ = LLLLZI();
            ((ArrayList) this.LLILLJJLI).add(new C207167164v(newCreatorCaptionEditTranslationFragment, getString(2131828787)));
            if (!C20703515zt.LJJIIJ(this.LL)) {
                LLLLZI().LLJJ = true;
            }
        }
        AnonymousClass1653 anonymousClass1653 = (AnonymousClass1653) findViewById(R.id.dl0);
        this.LLILZIL = anonymousClass1653;
        if (anonymousClass1653 != null) {
            c207169164x = new C207169164x(anonymousClass1653);
        }
        this.LLILZLL = c207169164x;
        C786410Ut5.a9((TuxIconView) findViewById(R.id.dkz), new ACListenerS165S0100000_31(this, 213));
        C117R c117r = (C117R) findViewById(R.id.dl7);
        final List<C207167164v> list = this.LLILLJJLI;
        final C207169164x c207169164x2 = this.LLILZLL;
        final NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModelLLLLZI = LLLLZI();
        c117r.addOnPageChangeListener(new InterfaceC469360Ias(list, c207169164x2, newCreatorCaptionEditViewModelLLLLZI, c21384118mN) { // from class: X.164u
            public final List<C207167164v> LL;
            public final C207169164x LLILLJJLI;
            public final NewCreatorCaptionEditViewModel LLILLL;
            public final C21384118mN LLILZ;

            @Override // X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrolled(int i, float f, int i2) {
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                int i2 = 0;
                for (C207167164v c207167164v : this.LL) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C207167164v c207167164v2 = c207167164v;
                        if (i2 != i) {
                            NewCreatorCaptionEditFragment newCreatorCaptionEditFragment = c207167164v2.LIZ;
                            newCreatorCaptionEditFragment.VR().LJIIIZ(0.0f);
                            newCreatorCaptionEditFragment.iS(0, false);
                        }
                        boolean z = !((C207167164v) ListProtector.get(this.LL, i)).LIZ.cS();
                        this.LLILLL.LLJJ = z;
                        if (z && i2 == i) {
                            C21384118mN c21384118mN2 = this.LLILZ;
                            c21384118mN2.getClass();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c21384118mN2.LIZ(c2344009Gk);
                            C20684815ws.LJIILLIIL("enter_edit_translation_captions", c2344009Gk.LIZ);
                        }
                        C207169164x c207169164x3 = this.LLILLJJLI;
                        if (c207169164x3 != null) {
                            C0P0T c0p0t = c207169164x3.LIZIZ;
                            if (c0p0t != null) {
                                c0p0t.dismiss();
                            }
                            c207169164x3.LIZIZ = null;
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }

            {
                this.LL = list;
                this.LLILLJJLI = c207169164x2;
                this.LLILLL = newCreatorCaptionEditViewModelLLLLZI;
                this.LLILZ = c21384118mN;
            }
        });
        List<C207167164v> list2 = this.LLILLJJLI;
        final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it2 = ((ArrayList) list2).iterator();
        while (it2.hasNext()) {
            arrayList.add(((C207167164v) it2.next()).LIZ);
        }
        List<C207167164v> list3 = this.LLILLJJLI;
        final ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator it3 = ((ArrayList) list3).iterator();
        while (it3.hasNext()) {
            arrayList2.add(((C207167164v) it3.next()).LIZIZ);
        }
        final FragmentManager supportFragmentManager = getSupportFragmentManager();
        getLifecycle();
        c117r.setAdapter(new AbstractC480470Isn(arrayList, arrayList2, supportFragmentManager) { // from class: X.0HFP
            public final List<Fragment> LLIZ;
            public final List<String> LLIZLLLIL;

            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return this.LLIZ.size();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final CharSequence LJIJJLI(int i) {
                return (CharSequence) ListProtector.get(this.LLIZLLLIL, i);
            }

            @Override // X.AbstractC480470Isn
            public final Fragment LJJIJIL(int i) {
                return (Fragment) ListProtector.get(this.LLIZ, i);
            }

            {
                super(supportFragmentManager, 1);
                this.LLIZ = arrayList;
                this.LLIZLLLIL = arrayList2;
            }
        });
        this.LLILZ = c117r;
        AnonymousClass1653 anonymousClass16532 = this.LLILZIL;
        if (anonymousClass16532 != null) {
            anonymousClass16532.setupWithViewPager(this.LLILZ);
        }
        AnonymousClass1653 anonymousClass16533 = this.LLILZIL;
        if (anonymousClass16533 != null) {
            anonymousClass16533.LIZ();
        }
        final AnonymousClass1653 anonymousClass16534 = this.LLILZIL;
        if (anonymousClass16534 != null) {
            anonymousClass16534.addOnTabSelectedListener(new InterfaceC1584740rLE() { // from class: X.164w
                @Override // X.InterfaceC1586460rO0
                public final void Yn(C19U0 c19u0) {
                }

                @Override // X.InterfaceC1586460rO0
                public final void ih(C19U0 c19u0) {
                }

                @Override // X.InterfaceC1586460rO0
                public final void Oq(C19U0 c19u0) {
                    anonymousClass16534.LIZ();
                }
            });
        }
        LLLLZI().LLJIJIL.observe(this, new AObserverS233S0100000_31(this, 47));
        LLLLZI().LLIZLLLIL.observe(this, new AObserverS233S0100000_31(this, 48));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        C207169164x c207169164x;
        Aweme aweme;
        C19U0 tabAt;
        C21546519Tz c21546519Tz;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z && (c207169164x = this.LLILZLL) != null && (aweme = this.LL) != null) {
            C0P0T c0p0t = c207169164x.LIZIZ;
            if ((c0p0t != null && c0p0t.isShowing()) || !C20703515zt.LJJIIJ(aweme) || C0BJD.LIZ() || C161T.LIZ().LIZJ() || (tabAt = c207169164x.LIZ.getTabAt(1)) == null || (c21546519Tz = tabAt.LJIIIIZZ) == null) {
                return;
            }
            C161T.LIZ().LJI();
            C450720Hlu c450720Hlu = new C450720Hlu(c21546519Tz.getContext());
            c450720Hlu.LLILLJJLI.LJII = 3000L;
            c450720Hlu.LJIIJ(2131828803);
            EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.BOTTOM;
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZLLL = enumC1235690iGF;
            c1391600mJi.LIZIZ = c21546519Tz;
            c450720Hlu.LJIIIZ(false, null);
            c450720Hlu.LLILLJJLI.LJIJJ = false;
            c450720Hlu.LJI(C960203pA.LIZ(R.attr.a0d, c21546519Tz.getContext()));
            C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
            c207169164x.LIZIZ = c0p0tLIZIZ;
            c0p0tLIZIZ.show();
        }
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
