package com.ss.android.ugc.profile.business.profile.background;

import X.AbstractC214823195h;
import X.C01GW;
import X.C0HF2;
import X.C0SXF;
import X.C0TVI;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C14K9;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1749280vcc;
import X.C1767106w1;
import X.C2187451AjH;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C455790Hu5;
import X.C497270Jen;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC335920DEw;
import X.EnumC452301pR;
import X.EnumC455750Hu1;
import X.InterfaceC1749320vcg;
import Y.ACListenerS141S0100000_6;
import Y.AObserverS210S0100000_6;
import Y.ARunnableS106S0100000_6;
import Y.AsS28S0200000_6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class ProfileBgVideoListActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9ODcjLyHELIOSY/LWsuKCw4LzcjPCE3ZhU+Jik6JCAOLhk6LCAjBSYgPAQvPSYlITE1";
    public RecyclerView LLILLL;
    public C1390410mHn LLILZ;
    public C1749280vcc LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public boolean LLJ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 881));
    public final C01GW LLILLJJLI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS550S0100000_6(this, 880));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(358));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(357));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C0HF2 LLLLLZL() {
        return (C0HF2) this.LLILLJJLI.getValue();
    }

    public final ProfileBgVideoListViewModel LLLLZI() {
        return (ProfileBgVideoListViewModel) this.LL.getValue();
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

    public final void LLLLZIL(boolean z) {
        boolean z2;
        T value = LLLLZI().LLILZ.getValue();
        if (z && (value == EnumC455750Hu1.REFRESH_SUCCESS || value == EnumC455750Hu1.LOAD_MORE_SUCCESS)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            View view = this.LLILZLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            C1749280vcc c1749280vcc = this.LLILZIL;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
            }
            RecyclerView recyclerView = this.LLILLL;
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 8);
                return;
            }
            return;
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        C1749280vcc c1749280vcc2 = this.LLILZIL;
        if (c1749280vcc2 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc2, 8);
        }
        RecyclerView recyclerView2 = this.LLILLL;
        if (recyclerView2 == null) {
            return;
        }
        C786410Ut5.LLIZLLLIL(recyclerView2, 0);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        View view;
        ViewGroup.LayoutParams layoutParams;
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListActivity", "onCreate", true);
        if (C960203pA.LIZIZ(this)) {
            i = R.style.y0;
        } else {
            i = R.style.xm;
        }
        setTheme(i);
        super.onCreate(bundle);
        setContentView(R.layout.ebw);
        C497270Jen.LJFF(this);
        if (C960203pA.LIZIZ(this)) {
            C455790Hu5.LIZ(this);
        } else {
            C497270Jen.LIZJ(this);
        }
        View viewFindViewById = findViewById(R.id.byk);
        if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
            layoutParams.height = C0SXF.LJIIZILJ(this);
        }
        this.LLIZ = findViewById(R.id.byk);
        this.LLIZLLLIL = findViewById(R.id.byl);
        this.LLILLL = (RecyclerView) findViewById(R.id.tup);
        this.LLILZ = (C1390410mHn) findViewById(R.id.byi);
        this.LLILZIL = (C1749280vcc) findViewById(R.id.byj);
        this.LLILZLL = findViewById(R.id.byf);
        C1749280vcc c1749280vcc = this.LLILZIL;
        if (c1749280vcc != null) {
            c1749280vcc.setTopMargin(0.0f);
        }
        C1749280vcc c1749280vcc2 = this.LLILZIL;
        if (c1749280vcc2 != null) {
            c1749280vcc2.LIZ(new InterfaceC1749320vcg() { // from class: X.0Hu4
                @Override // X.InterfaceC1749320vcg
                public final void hide() {
                    C1390410mHn c1390410mHn = this.LIZ.LLILZ;
                    if (c1390410mHn != null) {
                        c1390410mHn.LIZLLL();
                    }
                    C1390410mHn c1390410mHn2 = this.LIZ.LLILZ;
                    if (c1390410mHn2 != null) {
                        C786410Ut5.LLLZZIL(c1390410mHn2, 8);
                    }
                }

                @Override // X.InterfaceC1749320vcg
                public final void show() {
                    C1390410mHn c1390410mHn = this.LIZ.LLILZ;
                    if (c1390410mHn != null) {
                        c1390410mHn.LIZJ();
                    }
                    C1390410mHn c1390410mHn2 = this.LIZ.LLILZ;
                    if (c1390410mHn2 != null) {
                        C786410Ut5.LLLZZIL(c1390410mHn2, 0);
                    }
                }
            });
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            HandlerHook.viewPost(view2, new ARunnableS106S0100000_6(this, 190));
        }
        View viewFindViewById2 = findViewById(R.id.cnv);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS141S0100000_6(this, 113), viewFindViewById2);
        }
        RecyclerView recyclerView = this.LLILLL;
        Object parent = null;
        if (recyclerView != null) {
            parent = recyclerView.getParent();
        }
        if ((parent instanceof View) && (view = (View) parent) != null) {
            final int paddingBottom = view.getPaddingBottom();
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0DOr
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view3, C20246014Ju c20246014Ju) {
                    boolean z;
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(2);
                    int i2 = 0;
                    if (c20246014Ju.LJIIIIZZ(2) && c20244914JjLIZ.LIZLLL > 0) {
                        z = true;
                        i2 = c20244914JjLIZ.LIZLLL;
                    } else {
                        z = false;
                    }
                    view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), paddingBottom + i2);
                    if (z) {
                        ProfileBgVideoListActivity profileBgVideoListActivity = this;
                        if (!profileBgVideoListActivity.LLJ) {
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, profileBgVideoListActivity);
                            if (numLIZJ != null) {
                                this.getWindow().setNavigationBarColor(numLIZJ.intValue());
                            }
                            new C1A6V(this.getWindow(), this.getWindow().getDecorView()).LIZIZ(!C960203pA.LIZIZ(this));
                            this.LLJ = true;
                        }
                    }
                    return c20246014Ju;
                }
            });
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
        }
        LLLLZI().LLILLJJLI.observe(this, new AObserverS210S0100000_6(this, 38));
        LLLLZI().LLILZ.observe(this, new AObserverS210S0100000_6(this, 32));
        LLLLZI().LLILZLL.observe(this, new AObserverS210S0100000_6(this, 33));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        RecyclerView recyclerView2 = this.LLILLL;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView3 = this.LLILLL;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new C1767106w1(3));
        }
        final C0HF2 c0hf2LLLLLZL = LLLLLZL();
        c0hf2LLLLLZL.getClass();
        gridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.0Hu6
            public final /* synthetic */ int LJFF = 3;

            @Override // X.AbstractC214823195h
            public final int LJFF(int i2) {
                if (c0hf2LLLLLZL.getItemViewType(i2) != 1) {
                    return 1;
                }
                return this.LJFF;
            }
        };
        RecyclerView recyclerView4 = this.LLILLL;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(LLLLLZL());
        }
        RecyclerView recyclerView5 = this.LLILLL;
        if (recyclerView5 != null) {
            recyclerView5.addOnScrollListener(new AsS28S0200000_6(gridLayoutManager, this, 1));
        }
        if (((String) this.LLJI.getValue()).length() == 0 && ((String) this.LLJIJIL.getValue()).length() == 0) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZ("ProfileBackground", "userId is empty, cannot load videos");
        } else {
            LLLLZI().vQ2((String) this.LLJI.getValue(), (String) this.LLJIJIL.getValue(), true);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListActivity", "onCreate", false);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        String stringExtra;
        Float fValueOf;
        Boolean boolValueOf;
        Activity activity;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent2);
        if (i == 1001) {
            int iIntValue = -1;
            if (i2 == -1) {
                StringBuilder sb = new StringBuilder("VideoList: forward preview result awemeId=");
                if (intent2 != null) {
                    try {
                        stringExtra = intent2.getStringExtra("extra_bg_aweme_id");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        stringExtra = null;
                    }
                } else {
                    stringExtra = null;
                }
                sb.append(stringExtra);
                sb.append(" offsetRatio=");
                if (intent2 != null) {
                    fValueOf = Float.valueOf(intent2.getFloatExtra("extra_bg_offset_ratio", 0.5f));
                } else {
                    fValueOf = null;
                }
                sb.append(fValueOf);
                sb.append(" bgUpdated=");
                if (intent2 != null) {
                    boolValueOf = Boolean.valueOf(intent2.getBooleanExtra("extra_bg_updated", false));
                } else {
                    boolValueOf = null;
                }
                sb.append(boolValueOf);
                C1720106oR.LJI("ProfileBackground", sb.toString());
                C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5vpjsCmOQvxKkBRrqLwSJLa+uAZs9Z/Y3ig7uX5mXjpWgHW0v6FOF7IbSj0PSV", null);
                C0WST c0wst = new C0WST();
                Object[] objArr = {-1, intent2};
                C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/profile/business/profile/background/ProfileBgVideoListActivity", "setResult", this, objArr, "void", c0wzw);
                if (c0wsuLIZIZ.LIZ) {
                    c0wst.LIZ(11071, "com/ss/android/ugc/profile/business/profile/background/ProfileBgVideoListActivity", "setResult", null, objArr, this, c0wzw, false);
                } else {
                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                    if (objArr2 != null) {
                        Object obj = objArr2[0];
                        if (obj != null) {
                            activity = (Activity) obj;
                        } else {
                            activity = this;
                        }
                        Object obj2 = objArr2[1];
                        if (obj2 != null) {
                            iIntValue = ((Integer) obj2).intValue();
                        }
                        Object obj3 = c0wsuLIZIZ.LIZJ[2];
                        if (obj3 != null) {
                            intent2 = (Intent) obj3;
                        }
                    } else {
                        activity = this;
                    }
                    activity.setResult(iIntValue, intent2);
                    c0wst.LIZ(11071, "com/ss/android/ugc/profile/business/profile/background/ProfileBgVideoListActivity", "setResult", null, objArr, activity, c0wzw, true);
                }
                finish();
            }
        }
    }
}
