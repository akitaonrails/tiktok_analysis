package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.debug;

import X.C1308910kAL;
import X.C1361400lX0;
import X.C1697810uHb;
import X.C197039127h;
import X.C2181008ga;
import X.C23250099c;
import X.C299020Bno;
import X.C335910DEv;
import X.C418440Gaw;
import X.C786410Ut5;
import X.EnumC335920DEw;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.debug.MixLayoutDebugPreviewActivity;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class MixLayoutDebugPreviewActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspOzw7ITViJCHELIOSYrJCQ1JjonZic5OiY9LTY/Zyc8OzFiLSoxPSJiBCYrBCQ1JjonDCAuPCgDOiA6ICokCSY4IDk6PDw=";
    public EditText LL;
    public EditText LLILLJJLI;
    public EditText LLILLL;
    public TextView LLILZ;
    public C197039127h LLILZIL;
    public EditText LLILZLL;

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

    public static void LLLLLZL(View view) {
        int iIntValue;
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ey_, new C1361400lX0(view.getContext(), R.style.v0));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        gradientDrawable.setColor(iIntValue);
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
        view.setBackground(gradientDrawable);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fxc);
        this.LL = (EditText) findViewById(R.id.gpj);
        this.LLILLJJLI = (EditText) findViewById(R.id.gsy);
        this.LLILLL = (EditText) findViewById(R.id.gpx);
        this.LLILZ = (TextView) findViewById(R.id.gp4);
        this.LLILZLL = (EditText) findViewById(R.id.goy);
        this.LLILZIL = (C197039127h) findViewById(R.id.ct1);
        EditText editText = this.LL;
        if (editText != null) {
            LLLLLZL(editText);
        }
        EditText editText2 = this.LLILLJJLI;
        if (editText2 != null) {
            LLLLLZL(editText2);
        }
        EditText editText3 = this.LLILLL;
        if (editText3 != null) {
            LLLLLZL(editText3);
        }
        TextView textView = this.LLILZ;
        if (textView != null) {
            LLLLLZL(textView);
        }
        EditText editText4 = this.LLILZLL;
        if (editText4 != null) {
            LLLLLZL(editText4);
        }
        C197039127h c197039127h = this.LLILZIL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0DSL
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String string;
                    float fFloatValue;
                    String string2;
                    Editable editableLLJILLL;
                    String string3;
                    CharSequence text;
                    Editable editableLLJILLL2;
                    String string4;
                    Float fLJIIIIZZ;
                    Editable editableLLJILLL3;
                    String string5;
                    Float fLJIIIIZZ2;
                    Editable editableLLJILLL4;
                    MixLayoutDebugPreviewActivity mixLayoutDebugPreviewActivity = this.LL;
                    EditText editText5 = mixLayoutDebugPreviewActivity.LL;
                    String str = "";
                    if (editText5 == null || (editableLLJILLL4 = C2204961BRm.LLJILLL(editText5, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VHxysnisE6FE3ojqb8wEvf58qZbFs9FyIpTdiJOKt/iFzX2Hn7D55fv/BXHHmroA0KVXih6NsNE7IFDRLuxxr+MdSrmTjtsB8sWWI5Q=", null))) == null || (string = editableLLJILLL4.toString()) == null) {
                        string = "";
                    }
                    if (C476770Imp.LIZLLL(string)) {
                        EditText editText6 = mixLayoutDebugPreviewActivity.LLILLJJLI;
                        float fFloatValue2 = 0.0f;
                        if (editText6 != null && (editableLLJILLL3 = C2204961BRm.LLJILLL(editText6, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VHxysnisE6FE3ojqb8wEvf58qZbFs9FyIpTdiJOKt/iFzX2Hn7D55fv/BXHHmroA0KVXih6NsNE7IFDRLuxxr+MdSrmTjtsB8sWWI5Q=", null))) != null && (string5 = editableLLJILLL3.toString()) != null && (fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(string5)) != null) {
                            fFloatValue = fLJIIIIZZ2.floatValue();
                        } else {
                            fFloatValue = 0.0f;
                        }
                        int iLIZIZ = (int) C497740JfY.LIZIZ(fFloatValue);
                        EditText editText7 = mixLayoutDebugPreviewActivity.LLILLL;
                        if (editText7 != null && (editableLLJILLL2 = C2204961BRm.LLJILLL(editText7, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VHxysnisE6FE3ojqb8wEvf58qZbFs9FyIpTdiJOKt/iFzX2Hn7D55fv/BXHHmroA0KVXih6NsNE7IFDRLuxxr+MdSrmTjtsB8sWWI5Q=", null))) != null && (string4 = editableLLJILLL2.toString()) != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(string4)) != null) {
                            fFloatValue2 = fLJIIIIZZ.floatValue();
                        }
                        int iLIZIZ2 = (int) C497740JfY.LIZIZ(fFloatValue2);
                        TextView textView2 = mixLayoutDebugPreviewActivity.LLILZ;
                        if (textView2 == null || (text = textView2.getText()) == null || (string2 = text.toString()) == null) {
                            string2 = "";
                        }
                        EditText editText8 = mixLayoutDebugPreviewActivity.LLILZLL;
                        if (editText8 != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText8, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VHxysnisE6FE3ojqb8wEvf58qZbFs9FyIpTdiJOKt/iFzX2Hn7D55fv/BXHHmroA0KVXih6NsNE7IFDRLuxxr+MdSrmTjtsB8sWWI5Q=", null))) != null && (string3 = editableLLJILLL.toString()) != null) {
                            str = string3;
                        }
                        new C1881170z3L(mixLayoutDebugPreviewActivity, new C1881180z3M(str, string2, string, iLIZIZ, iLIZIZ2)).LJIJJ(mixLayoutDebugPreviewActivity.getSupportFragmentManager());
                    }
                }
            });
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2181008ga(this, null), 3);
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
