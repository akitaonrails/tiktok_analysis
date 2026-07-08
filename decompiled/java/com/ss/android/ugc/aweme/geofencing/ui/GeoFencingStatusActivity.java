package com.ss.android.ugc.aweme.geofencing.ui;

import X.ActivityC214874197g;
import X.C0IPK;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C10HU;
import X.C1192870h9B;
import X.C11NJ;
import X.C1202330hOR;
import X.C1308910kAL;
import X.C13BV;
import X.C1697810uHb;
import X.C19216110Fr;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC335920DEw;
import Y.ACListenerS162S0100000_28;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GeoFencingStatusActivity extends ActivityC214874197g {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiIpJik2JiHELIOSYlJyh9PSxiDio8DiAiKiY9LxY4KDsmOwQvPSYlITE1";
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public RecyclerView LLILLL;
    public TuxIconView LLILZ;
    public C0IPK LLILZIL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC214874197g
    public final C1202330hOR LLLLLZL() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LIZJ;
    }

    public final TuxTextView LLLLZLL() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iu7);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C0IPK c0ipk = this.LLILZIL;
        if (c0ipk == null) {
            c0ipk = null;
        }
        LLLLZLLIL(c0ipk.LLLFZ());
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C19216110Fr.LIZ.getClass();
        ((C11NJ) C19216110Fr.LIZJ.getValue()).LJ();
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

    public final void LLLLZLLIL(List<TranslatedRegion> list) {
        Activity activity;
        if (getIntent().getBooleanExtra("extra.read_only", false)) {
            finish();
            return;
        }
        Intent intent = new Intent();
        C10HU.LIZIZ(intent, list);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO2tbJnL0jHc9RgiN+0lxqpwsQsAXrx7aX5X/kJO5WlAK3IhSKAC", null);
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/geofencing/ui/GeoFencingStatusActivity", "setResult", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/geofencing/ui/GeoFencingStatusActivity", "setResult", null, objArr, this, c0wzw, false);
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
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/geofencing/ui/GeoFencingStatusActivity", "setResult", null, objArr, activity, c0wzw, true);
        }
        finish();
    }

    @Override // X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.j3);
        List listLIZ = C10HU.LIZ(getIntent());
        if (listLIZ == null) {
            listLIZ = C13BV.INSTANCE;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("extra.read_only", false);
        if (booleanExtra) {
            LLLLZLL().setTextColor(C960203pA.LIZ(R.attr.a1h, this));
            LLLLZLL().setText(2131849929);
            KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
            if (callbackFindViewById == null) {
                callbackFindViewById = findViewById(R.id.iu9);
                this.LLILLJJLI = (TuxTextView) callbackFindViewById;
            }
            ((TextView) callbackFindViewById).setText(2131849922);
        } else {
            C786410Ut5.h9(LLLLZLL(), new ACListenerS162S0100000_28(this, 53));
        }
        this.LLILZIL = new C0IPK(this, listLIZ, booleanExtra);
        KeyEvent.Callback callbackFindViewById2 = this.LLILLL;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.ium);
            this.LLILLL = (RecyclerView) callbackFindViewById2;
        }
        RecyclerView recyclerView = (RecyclerView) callbackFindViewById2;
        C0IPK c0ipk = this.LLILZIL;
        if (c0ipk == null) {
            c0ipk = null;
        }
        recyclerView.setAdapter(c0ipk);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        KeyEvent.Callback callbackFindViewById3 = this.LLILZ;
        if (callbackFindViewById3 == null) {
            callbackFindViewById3 = findViewById(R.id.iuo);
            this.LLILZ = (TuxIconView) callbackFindViewById3;
        }
        C786410Ut5.a9((TuxIconView) callbackFindViewById3, new ACListenerS162S0100000_28(this, 122));
        C19216110Fr.LIZ.getClass();
        C19216110Fr.LIZIZ(null, null);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onCreate", false);
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

    @Override // X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        List<TranslatedRegion> listLIZ;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || intent == null || (listLIZ = C10HU.LIZ(intent)) == null) {
            return;
        }
        C0IPK c0ipk = this.LLILZIL;
        if (c0ipk == null) {
            c0ipk = null;
        }
        c0ipk.getClass();
        c0ipk.LLILLL = new ArrayList(listLIZ);
        c0ipk.notifyDataSetChanged();
    }
}
