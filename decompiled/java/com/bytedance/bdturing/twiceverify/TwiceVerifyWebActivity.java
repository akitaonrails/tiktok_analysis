package com.bytedance.bdturing.twiceverify;

import X.AbstractC202165148l;
import X.C12ES;
import X.C149F;
import X.C149H;
import X.C14AT;
import X.C14B7;
import X.C1602160rnK;
import X.C19GS;
import X.C202158148e;
import X.C202171148r;
import X.C202176148w;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C794280VDu;
import X.C822560WOo;
import X.InterfaceC202162148i;
import X.InterfaceC20220614Aa;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;
import com.bytedance.bdturing.methods.JsBridgeModule;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes31.dex */
public class TwiceVerifyWebActivity extends C19GS {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWsuLTsmOiwiLmEnPywvLDHELIOSk2OiwqMGEHPywvLBk2OiwqMBg2KgQvPSYlITE1";
    public C14B7 LL;
    public View LLILLJJLI;
    public AbstractC202165148l LLILLL;
    public String LLILZ = "";
    public final String LLILZIL = "captcha_location_activity";
    public final String LLILZLL = "request";
    public final C14AT LLIZ = new InterfaceC20220614Aa() { // from class: X.14AT
        @Override // X.InterfaceC20220614Aa
        public final void LIZIZ(int i) {
            String simpleName;
            if (this.LIZ.LLILLL.getActivity() != null) {
                simpleName = this.LIZ.LLILLL.getActivity().getClass().getSimpleName();
            } else {
                simpleName = this.LIZ.LLILZ;
            }
            C202179148z.LJFF(0, i, "success", simpleName);
        }

        @Override // X.InterfaceC20220614Aa
        public final void LIZ(int i, int i2, String str) {
            String simpleName;
            if (this.LIZ.LLILLL.getActivity() != null) {
                simpleName = this.LIZ.LLILLL.getActivity().getClass().getSimpleName();
            } else {
                simpleName = this.LIZ.LLILZ;
            }
            C202179148z.LJFF(i, i2, str, simpleName);
        }
    };

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View decorView = getWindow().getDecorView();
        setFinishOnTouchOutside(false);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) decorView.getLayoutParams();
        layoutParams.gravity = 80;
        layoutParams.width = C12ES.LJIIJ(this);
        C202171148r.LIZ().getClass();
        layoutParams.height = (int) C12ES.LIZJ(304.0f, this);
        AbstractC202165148l abstractC202165148l = this.LLILLL;
        if (abstractC202165148l instanceof C149H) {
            layoutParams.height = (int) C12ES.LIZJ(290.0f, this);
        } else if (abstractC202165148l instanceof C149F) {
            layoutParams.height = (int) C12ES.LIZJ(304.0f, this);
        }
        getWindowManager().updateViewLayout(decorView, layoutParams);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
        InterfaceC202162148i interfaceC202162148i = C202171148r.LIZ().LIZIZ;
        if (interfaceC202162148i != null) {
            ((C202176148w) interfaceC202162148i).LIZ.onFail(2);
        }
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.LL = null;
        C202171148r c202171148rLIZ = C202171148r.LIZ();
        c202171148rLIZ.LIZIZ = null;
        c202171148rLIZ.LIZJ = null;
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
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

    public final void LLLLLZL(int i) {
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.ab2));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ERROR:");
        sbLIZ.append(i);
        C786410Ut5.re(Toast.makeText(this, C2188811AlT.LIZIZ(sbLIZ), 1));
        C14B7 c14b7 = this.LL;
        if (c14b7 != null) {
            int visibility = c14b7.getVisibility();
            c14b7.setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, c14b7);
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ac0);
        C202171148r.LIZ().LIZ.LJ();
        if (bundle != null) {
            this.LLILLL = (AbstractC202165148l) bundle.getSerializable(this.LLILZLL);
            this.LLILZ = bundle.getString(this.LLILZIL);
        } else {
            AbstractC202165148l abstractC202165148l = C202171148r.LIZ().LIZJ;
            this.LLILLL = abstractC202165148l;
            this.LLILZ = abstractC202165148l.getActivity().getClass().getSimpleName();
        }
        if (this.LL == null) {
            C14B7 c14b7 = (C14B7) findViewById(R.id.bul);
            this.LL = c14b7;
            c14b7.LIZ(this.LLIZ);
        }
        C14B7 c14b72 = this.LL;
        if (c14b72 != null) {
            c14b72.setParentActivity(this);
        }
        this.LL.getSettings().setJavaScriptEnabled(true);
        new JsBridgeModule(new C202158148e(this), this.LL);
        HashMap map = new HashMap();
        C14B7 c14b73 = this.LL;
        String url = this.LLILLL.getUrl();
        if (C794280VDu.LIZ(c14b73, "monitor")) {
            c14b73.loadUrl(url, map);
        } else {
            String strOnLoadUrl = C822560WOo.LIZ.onLoadUrl(c14b73, url);
            if (!TextUtils.isEmpty(strOnLoadUrl)) {
                url = strOnLoadUrl;
            }
            c14b73.loadUrl(url, map);
        }
        this.LLILLJJLI = findViewById(R.id.y5c);
        C202171148r.LIZ().getClass();
    }

    @Override // androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C786410Ut5.LJJIZ(bundle, this.LLILZLL, this.LLILLL);
        String str = this.LLILZIL;
        Activity activity = this.LLILLL.getActivity();
        Objects.requireNonNull(activity);
        C786410Ut5.LJJJI(str, activity.getClass().getSimpleName(), bundle);
        super.onSaveInstanceState(bundle);
    }
}
