package com.ss.android.ugc.aweme.account.reactive;

import X.C0FNV;
import X.C0PVY;
import X.C0XYI;
import X.C1255180ilg;
import X.C12ES;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C197039127h;
import X.C20684815ws;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.C850590XYj;
import X.DialogC1389620mGW;
import X.EnumC335920DEw;
import X.InterfaceC1740760vOs;
import X.InterfaceC1850100yFE;
import X.InterfaceC1916090zxf;
import Y.ACListenerS161S0100000_27;
import Y.AObjectS401S0100000_27;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity;
import com.ss.android.ugc.aweme.appdiff.IAccountAppDiffProtocol;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class ReactiveAccountActivity extends BaseActivity implements InterfaceC1740760vOs, InterfaceC1916090zxf {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiHELIOSOyoyKzElPyp9GiAtKjs6PiANKiw8PSs4CCwnITMlPTY=";
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public C197039127h LLILZIL;
    public boolean LLILZLL;
    public InterfaceC1850100yFE LLIZ;
    public boolean LLIZLLLIL;
    public DialogC1389620mGW LLJ;

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b2361";
    }

    @Override // X.InterfaceC1916090zxf
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public final boolean LLLLLZL() {
        if (this.LLIZLLLIL) {
            return true;
        }
        this.LLIZLLLIL = true;
        if (this.LLJ == null) {
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(this);
            this.LLJ = dialogC1389620mGW;
            dialogC1389620mGW.LJJLJ(2131835638);
        }
        DialogC1389620mGW dialogC1389620mGW2 = this.LLJ;
        if (dialogC1389620mGW2 == null) {
            return false;
        }
        C0FNV.LIZJ(dialogC1389620mGW2);
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        PopupManager.LIZJ(ComplianceServiceProvider.LJI().LJJIJIIJIL());
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

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String string;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity", "onCreate", true);
        activityConfiguration(new Function1() { // from class: X.0yFF
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str2 = ReactiveAccountActivity._pnsPageId;
                C1193630hAP c1193630hAP = C1192870h9B.LIZ;
                Objects.requireNonNull(c1193630hAP);
                ((C06W2) obj).Dw2(new AObjectS401S0100000_27(c1193630hAP, 3));
                return null;
            }
        });
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("reactive_page_revamp", false);
        this.LLILZLL = booleanExtra;
        if (booleanExtra) {
            this.LLIZ = new C850590XYj(this);
        } else {
            this.LLIZ = new C0XYI(this);
        }
        setContentView(R.layout.x9);
        this.LL = (TuxTextView) findViewById(R.id.tv_title);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.zhs);
        this.LLILZIL = (C197039127h) findViewById(R.id.ctv);
        this.LLILLL = (TuxTextView) findViewById(R.id.crr);
        this.LLILZ = (TuxTextView) findViewById(R.id.zj4);
        if (C0PVY.LIZ(this.LLIZ.LIZ(), 1)) {
            View viewFindViewById = findViewById(R.id.lle);
            View viewFindViewById2 = findViewById(R.id.u3e);
            ((LinearLayout.LayoutParams) viewFindViewById.getLayoutParams()).topMargin = (int) C12ES.LIZJ(136.0f, this);
            ((RelativeLayout.LayoutParams) viewFindViewById2.getLayoutParams()).topMargin = (int) C12ES.LIZJ(16.0f, this);
            this.LLILLJJLI.setGravity(8388611);
        }
        if (C0PVY.LIZ(this.LLIZ.LIZ(), 1)) {
            IComplianceSettingsService iComplianceSettingsServiceLJJI = ComplianceServiceProvider.LJJI();
            if (!TextUtils.isEmpty(this.LLIZ.LIZLLL())) {
                this.LLILLJJLI.setText(iComplianceSettingsServiceLJJI.LJJIIZ(this, this.LLIZ.LIZLLL(), this.LLIZ.LIZIZ()));
            } else {
                ArrayList arrayList = new ArrayList();
                String string2 = getString(2131834296);
                Boolean bool = Boolean.FALSE;
                arrayList.add(new PolicyBodyLinkList(string2, "aweme://webview/?url=https://www.tiktok.com/legal/terms-of-service?", bool, 0, bool, ""));
                arrayList.add(new PolicyBodyLinkList(getString(2131834295), "aweme://webview/?url=https://www.tiktok.com/legal/privacy-policy?", bool, 0, bool, ""));
                this.LLILLJJLI.setText(iComplianceSettingsServiceLJJI.LJJIIZ(this, getString(2131830505), arrayList));
            }
            this.LLILLJJLI.setMovementMethod(LinkMovementMethod.getInstance());
            TuxTextView tuxTextView = this.LL;
            if (!TextUtils.isEmpty(this.LLIZ.LJ())) {
                string = this.LLIZ.LJ();
            } else {
                string = getString(2131830506);
            }
            tuxTextView.setText(string);
            this.LLILZIL.setText(2131830504);
        } else {
            this.LL.setText(2131836790);
            TuxTextView tuxTextView2 = this.LLILLJJLI;
            IAccountAppDiffProtocol.LIZ.getClass();
            IAccountAppDiffProtocol value = C1255180ilg.LIZIZ.getValue();
            String string3 = getString(2131836788);
            value.LIZIZ(string3);
            tuxTextView2.setText(string3);
            this.LLILZIL.setText(2131836787);
        }
        C786410Ut5.h9(this.LLILLL, new ACListenerS161S0100000_27(this, 125));
        C786410Ut5.U8(this.LLILZIL, new ACListenerS161S0100000_27(this, 126));
        String str2 = "1";
        if (this.LLIZ.LJII()) {
            C786410Ut5.LLLLZLL(this.LLILZ, 0);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "reactive_account");
            if (this.LLILZLL) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("reactive_page_revamp", str);
            C20684815ws.LJIILLIIL("show_data_download", c2344009Gk.LIZ);
            C786410Ut5.h9(this.LLILZ, new ACListenerS161S0100000_27(this, 127));
            this.LLILZ.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (!this.LLILZLL) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("reactive_page_revamp", str2)};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        Objects.requireNonNull(key);
        Object value2 = entry.getValue();
        Objects.requireNonNull(value2);
        if (map.put(key, value2) == null) {
            C20684815ws.LJIILLIIL("show_reactivate_account", Collections.unmodifiableMap(map));
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity", "onCreate", false);
        } else {
            throw new IllegalArgumentException("duplicate key: " + key);
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
