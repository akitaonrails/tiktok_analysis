package com.ss.android.ugc.aweme.account.agegate.activity;

import X.C01GW;
import X.C0TLS;
import X.C0TLV;
import X.C0TVB;
import X.C0XGR;
import X.C0XQ5;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C197039127h;
import X.C20684815ws;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C786190Usj;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC335920DEw;
import X.InterfaceC586170Myt;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.profile.model.AgeGateInfo;
import com.ss.android.ugc.aweme.profile.model.AgeGateOption;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS256S0300000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class AccountDeletedActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiKCg2HELIOSLyQ4LGEyKzElPyYnMWsNKiw8PSs4DSo/LTEpLQ4wPCw6IDsq";
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public C197039127h LLILLL;
    public RecyclerView LLILZ;
    public C197039127h LLILZIL;
    public ImageView LLILZLL;
    public boolean LLJI;
    public List<AgeGateOption> LLJILJIL;
    public C786190Usj LLJILJILJ;
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS245S0000000_12.get$arr$(69), "enter_from", String.class);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 365));
    public final User LLJ = C0XQ5.LIZJ();
    public final List<C0TLV> LLJIJIL = new ArrayList();

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C197039127h LLLLLZL() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d7s);
            this.LLILLL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        PopupManager.LIZJ(ComplianceServiceProvider.LIZLLL().LJIIZILJ());
        PopupManager.LIZJ(ComplianceServiceProvider.LIZLLL().LJIIJ());
        C786190Usj c786190Usj = this.LLJILJILJ;
        if (c786190Usj != null) {
            List<InterfaceC586170Myt> list = C0XQ5.LIZ;
            synchronized (C0XQ5.class) {
                try {
                    ((CopyOnWriteArrayList) C0XQ5.LIZ).remove(c786190Usj);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
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
        boolean z;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.x6);
        List<AgeGateOption> optionList = null;
        if (this.LLJ.getAgeGateInfo() != null) {
            AgeGateInfo ageGateInfo = this.LLJ.getAgeGateInfo();
            if (ageGateInfo != null) {
                optionList = ageGateInfo.getOptionList();
            }
            this.LLJILJIL = optionList;
            KeyEvent.Callback callbackFindViewById = this.LL;
            if (callbackFindViewById == null) {
                callbackFindViewById = findViewById(R.id.eu1);
                this.LL = (TuxTextView) callbackFindViewById;
            }
            ((TextView) callbackFindViewById).setText(this.LLJ.getAgeGateInfo().getContent());
            KeyEvent.Callback callbackFindViewById2 = this.LLILLJJLI;
            if (callbackFindViewById2 == null) {
                callbackFindViewById2 = findViewById(R.id.fle);
                this.LLILLJJLI = (TuxTextView) callbackFindViewById2;
            }
            ((TextView) callbackFindViewById2).setText(this.LLJ.getAgeGateInfo().getTitle());
        } else {
            KeyEvent.Callback callbackFindViewById3 = this.LL;
            if (callbackFindViewById3 == null) {
                callbackFindViewById3 = findViewById(R.id.eu1);
                this.LL = (TuxTextView) callbackFindViewById3;
            }
            ((TextView) callbackFindViewById3).setText((CharSequence) null);
            KeyEvent.Callback callbackFindViewById4 = this.LLILLJJLI;
            if (callbackFindViewById4 == null) {
                callbackFindViewById4 = findViewById(R.id.fle);
                this.LLILLJJLI = (TuxTextView) callbackFindViewById4;
            }
            ((TextView) callbackFindViewById4).setText((CharSequence) null);
        }
        List<AgeGateOption> list = this.LLJILJIL;
        if (list != null) {
            for (AgeGateOption ageGateOption : list) {
                String str = ageGateOption.url;
                if (str != null && a0.LJJIIZI(str, "download-your-data", false)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "age_gate_ban");
                    C20684815ws.LJIILLIIL("show_data_download", c2344009Gk.LIZ);
                }
                if (Intrinsics.LJFF(ageGateOption.type, "appeal") || Intrinsics.LJFF(ageGateOption.type, "appeal_internal")) {
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("enter_from", "age_gate_ban");
                    C20684815ws.LJIILLIIL("show_age_appeal", c2344009Gk2.LIZ);
                }
                C0TLV c0tlv = new C0TLV(ageGateOption.content);
                c0tlv.LIZJ = new AwS256S0300000_12(c0tlv, this, ageGateOption, 20);
                ((ArrayList) this.LLJIJIL).add(c0tlv);
            }
        }
        C0TLS c0tls = new C0TLS(this);
        List<C0TLV> list2 = this.LLJIJIL;
        ((ArrayList) c0tls.LLILLJJLI).clear();
        ((ArrayList) c0tls.LLILLJJLI).addAll(list2);
        c0tls.notifyDataSetChanged();
        KeyEvent.Callback callbackFindViewById5 = this.LLILZ;
        if (callbackFindViewById5 == null) {
            callbackFindViewById5 = findViewById(R.id.a0m);
            this.LLILZ = (RecyclerView) callbackFindViewById5;
        }
        ((RecyclerView) callbackFindViewById5).setAdapter(c0tls);
        KeyEvent.Callback callbackFindViewById6 = this.LLILZ;
        if (callbackFindViewById6 == null) {
            callbackFindViewById6 = findViewById(R.id.a0m);
            this.LLILZ = (RecyclerView) callbackFindViewById6;
        }
        ((RecyclerView) callbackFindViewById6).setLayoutManager(new LinearLayoutManager(this));
        KeyEvent.Callback callbackFindViewById7 = this.LLILZIL;
        if (callbackFindViewById7 == null) {
            callbackFindViewById7 = findViewById(R.id.d7p);
            this.LLILZIL = (C197039127h) callbackFindViewById7;
        }
        C786410Ut5.U8((C197039127h) callbackFindViewById7, new ACListenerS147S0100000_12(this, 483));
        LLLLLZL().setEnabled(false);
        C0TVB c0tvb = C0TVB.LIZ;
        String str2 = (String) this.LLIZ.getValue();
        c0tvb.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str2);
        C20684815ws.LJIILLIIL("age_gate_account_delete_show", c0xgr.LIZ);
        if (C960203pA.LIZIZ(this)) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_exclamation_mark_circle_fill;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            c419910GdJ.LJFF = true;
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this);
            KeyEvent.Callback callbackFindViewById8 = this.LLILZLL;
            if (callbackFindViewById8 == null) {
                callbackFindViewById8 = findViewById(R.id.jxe);
                this.LLILZLL = (ImageView) callbackFindViewById8;
            }
            ((ImageView) callbackFindViewById8).setImageDrawable(tuxIconDrawableLIZ);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onCreate", false);
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
