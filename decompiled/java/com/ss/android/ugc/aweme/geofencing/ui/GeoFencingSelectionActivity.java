package com.ss.android.ugc.aweme.geofencing.ui;

import X.ActivityC214874197g;
import X.C01GW;
import X.C0DHG;
import X.C0I7D;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C10HU;
import X.C1192870h9B;
import X.C11NJ;
import X.C1202330hOR;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13BV;
import X.C1697810uHb;
import X.C1749280vcc;
import X.C19216110Fr;
import X.C19719212De;
import X.C20509915Nh;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C470510Icj;
import X.C473080Igs;
import X.C521840KdK;
import X.C632670Orh;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC335920DEw;
import Y.ACListenerS162S0100000_28;
import Y.AfS176S0100000_7;
import Y.AkS471S0100000_7;
import Y.AsS54S0100000_28;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS682S0100000_33;

/* JADX INFO: loaded from: classes29.dex */
public final class GeoFencingSelectionActivity extends ActivityC214874197g {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiIpJik2JiYlHELIOSJyh9PSxiDio8DiAiKiY9LxYpJSowPCwjJw4wPCw6IDsq";
    public RecyclerView LL;
    public C0I7D LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public C470510Icj LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(189));
    public List<TranslatedRegion> LLIZLLLIL;
    public C1749280vcc LLJ;
    public View LLJI;
    public boolean LLJIJIL;
    public C20509915Nh LLJILJIL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LJ() {
        View view = this.LLJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C786410Ut5.LLIZLLLIL(LLLLZLLIL(), 8);
        C1749280vcc c1749280vcc = this.LLJ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
        }
        C1749280vcc c1749280vcc2 = this.LLJ;
        if (c1749280vcc2 != null) {
            c1749280vcc2.LJ();
        }
    }

    @Override // X.ActivityC214874197g
    public final C1202330hOR LLLLLZL() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LIZJ;
    }

    public final void LLLLZLL() {
        C19216110Fr c19216110Fr = C19216110Fr.LIZ;
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 70);
        AwS607S0100000_28 awS607S0100000_282 = new AwS607S0100000_28(this, 71);
        c19216110Fr.getClass();
        if (C19216110Fr.LIZIZ.isEmpty()) {
            C19216110Fr.LIZIZ(awS607S0100000_28, awS607S0100000_282);
        } else {
            awS607S0100000_28.invoke(C473080Igs.LIZ(C19216110Fr.LIZIZ));
        }
    }

    public final RecyclerView LLLLZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iuf);
            this.LL = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final TuxTextView LLLLZLLLI() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iuh);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView LLLZ() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iui);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C0I7D LLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iuk);
            this.LLILLJJLI = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C470510Icj c470510Icj = this.LLILZLL;
        if (c470510Icj == null) {
            c470510Icj = null;
        }
        c470510Icj.LLLFZ();
        List<TranslatedRegion> list = this.LLIZLLLIL;
        if (list == null) {
            list = null;
        }
        if (!list.isEmpty()) {
            List<TranslatedRegion> list2 = this.LLIZLLLIL;
            LLLZLZ(list2 != null ? list2 : null);
        } else {
            if (C0DHG.LIZ() && C1388190mED.LIZ(this) != null) {
                C632670Orh.LIZIZ(this, new C19719212De(-2111780034, new AwS682S0100000_33(this, 4), true));
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(this);
            c1397580mTM.LJFF(2131849921);
            c1397580mTM.LIZ(2131849920);
            C985403tE.LIZ(c1397580mTM, new AwS607S0100000_28(this, 72));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((C11NJ) this.LLIZ.getValue()).dispose();
        C20509915Nh c20509915Nh = this.LLJILJIL;
        if (c20509915Nh != null) {
            c20509915Nh.LIZIZ();
        }
        this.LLJILJIL = null;
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

    public final void LLLZLZ(List<TranslatedRegion> list) {
        Activity activity;
        Intent intent = new Intent();
        C10HU.LIZIZ(intent, list);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO2tbJnL0jHc9RgiN+0lxqpwsQsAXrx7aX5G81NY4kFMMVo0Vb0NxTgr", null);
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/geofencing/ui/GeoFencingSelectionActivity", "setResult", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/geofencing/ui/GeoFencingSelectionActivity", "setResult", null, objArr, this, c0wzw, false);
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
                    intent = (Intent) obj3;
                }
            } else {
                activity = this;
            }
            activity.setResult(iIntValue, intent);
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/geofencing/ui/GeoFencingSelectionActivity", "setResult", null, objArr, activity, c0wzw, true);
        }
        finish();
    }

    @Override // X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.j2);
        this.LLJ = (C1749280vcc) findViewById(R.id.w28);
        this.LLJI = findViewById(R.id.iuj);
        LJ();
        List<TranslatedRegion> listLIZ = C10HU.LIZ(getIntent());
        if (listLIZ == null) {
            listLIZ = C13BV.INSTANCE;
        }
        this.LLIZLLLIL = listLIZ;
        Iterator<TranslatedRegion> it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().setSelected(true);
        }
        this.LLILZLL = new C470510Icj(C13BV.INSTANCE, listLIZ);
        RecyclerView recyclerViewLLLLZLLIL = LLLLZLLIL();
        C470510Icj c470510Icj = this.LLILZLL;
        C470510Icj c470510Icj2 = null;
        if (c470510Icj == null) {
            c470510Icj = null;
        }
        recyclerViewLLLLZLLIL.setAdapter(c470510Icj);
        recyclerViewLLLLZLLIL.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewLLLLZLLIL.addOnScrollListener(new AsS54S0100000_28(this, 3));
        C11NJ c11nj = (C11NJ) this.LLIZ.getValue();
        C470510Icj c470510Icj3 = this.LLILZLL;
        if (c470510Icj3 != null) {
            c470510Icj2 = c470510Icj3;
        }
        c11nj.LIZ(c470510Icj2.LLILLL.LJJJJZI(new AkS471S0100000_7(c470510Icj2, 9)).LJJLJLI(new AfS176S0100000_7(this, 259)));
        LLLZIL().addTextChangedListener(new C521840KdK(this, 5));
        C786410Ut5.h9(LLLZ(), new ACListenerS162S0100000_28(this, 117));
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iu8);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        C786410Ut5.h9((TuxTextView) callbackFindViewById, new ACListenerS162S0100000_28(this, 118));
        C786410Ut5.h9(LLLLZLLLI(), new ACListenerS162S0100000_28(this, 119));
        LLLLZLL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onCreate", false);
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
