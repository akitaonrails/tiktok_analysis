package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.debug;

import X.C1308910kAL;
import X.C1697810uHb;
import X.C21411718qp;
import X.C21553719Wt;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1106030et7;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.SpinnerAdapter;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.debug.MixLayoutDebugPreviewActivity;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.debug.MixLayoutDebugToolsActivity;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public final class MixLayoutDebugToolsActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspOzw7ITViHELIOSJCYrJCQ1JjonZic5OiY9LTY/Zyc8OzFiLSoxPSJiBCYrBCQ1JjonDCAuPCgHJyogOg4wPCw6IDsq";

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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean zBooleanValue;
        super.onCreate(bundle);
        setContentView(R.layout.fxd);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.to5);
        if (relativeLayout != null) {
            C786410Ut5.S7(relativeLayout, new View.OnClickListener() { // from class: X.0DSJ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str = MixLayoutDebugPreviewActivity._pnsPageId;
                    MixLayoutDebugToolsActivity mixLayoutDebugToolsActivity = this.LL;
                    Intent intent = new Intent(mixLayoutDebugToolsActivity, (Class<?>) MixLayoutDebugPreviewActivity.class);
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(mixLayoutDebugToolsActivity, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, mixLayoutDebugToolsActivity);
                    C2204961BRm.LJJJJJL(mixLayoutDebugToolsActivity, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VHxysnisE6FE3ojqb8wEvf58qZbFs9FyIpTdiJOKt/iFzX2Hn7D55fv/BXHHmroA0KVXih6NsNE7IFDRLuxxr+MdSrmTjtsB8sWWI5Q=", null));
                }
            });
        }
        final C21411718qp c21411718qp = (C21411718qp) findViewById(R.id.wvn);
        Boolean boolLIZIZ = InterfaceC1106030et7.E9.LIZIZ();
        int iIntValue = 0;
        if (boolLIZIZ != null) {
            zBooleanValue = boolLIZIZ.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c21411718qp.setChecked(zBooleanValue);
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.tpj);
        if (relativeLayout2 != null) {
            C786410Ut5.S7(relativeLayout2, new View.OnClickListener() { // from class: X.0fBo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c21411718qp.setChecked(!r1.isChecked());
                    InterfaceC1106030et7.E9.LJFF(Boolean.valueOf(c21411718qp.isChecked()));
                }
            });
        }
        C21553719Wt c21553719Wt = (C21553719Wt) findViewById(R.id.vuj);
        if (c21553719Wt != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, C1697810uHb.LJIIJJI("Right-Top", "Right-Center", "Right-Bottom", "Left-Top", "Left-Center", "Left-Bottom"));
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            c21553719Wt.setAdapter((SpinnerAdapter) arrayAdapter);
            Integer numLIZIZ = InterfaceC1106030et7.F9.LIZIZ();
            if (numLIZIZ != null) {
                iIntValue = numLIZIZ.intValue();
            }
            c21553719Wt.setSelection(iIntValue);
            c21553719Wt.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: X.15PR
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    InterfaceC1106030et7.F9.LJFF(Integer.valueOf(i));
                }
            });
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
}
