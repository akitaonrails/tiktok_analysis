package com.ss.android.ugc.aweme.account.login.v2.base;

import X.AbstractActivityC1237560iJG;
import X.C01GW;
import X.C0XGR;
import X.C0XTR;
import X.C1238450iKh;
import X.C13BV;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C452501pT;
import X.C784500Uq0;
import X.C786410Ut5;
import X.C851380Xaa;
import X.C852970Xd9;
import X.C853010XdD;
import X.C853670XeH;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC1916090zxf;
import X.InterfaceC876920Yag;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS592S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public class CommonFlowActivity extends AbstractActivityC1237560iJG implements InterfaceC1916090zxf, InterfaceC876920Yag {
    public static final SparseArray<C0XTR> LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiHELIOSJSA0IStiP319KiQ/LGEQJyghJiEVJCo7CCwnITMlPTY=";
    public boolean LLILZLL;
    public Integer LLJI;
    public EnumC852910Xd3 LLILZIL = EnumC852910Xd3.PHONE_SMS_CHANGE_PASSWORD;
    public Bundle LLIZ = new Bundle();
    public boolean LLIZLLLIL = true;
    public final C01GW LLJ = C452501pT.LIZIZ(new C853010XdD(this));

    @Override // X.InterfaceC1916090zxf
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC1237560iJG, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        new C851380Xaa();
        LLJIJIL = new SparseArray<>();
    }

    public final Bundle LLLZZIL() {
        return (Bundle) this.LLJ.getValue();
    }

    public final void LLLZIL() {
        int intExtra = getIntent().getIntExtra("callback_action_type", -1);
        if (intExtra != -1) {
            SparseArray<C0XTR> sparseArray = LLJIJIL;
            if (sparseArray.get(intExtra) != null) {
                if (!this.LLIZLLLIL || this.LLILZLL) {
                    C0XTR c0xtr = sparseArray.get(intExtra);
                    Integer num = this.LLJI;
                    c0xtr.onResult(num != null ? num.intValue() : intExtra, 1, this.LLIZ);
                } else {
                    sparseArray.get(intExtra).onResult(intExtra, 2, null);
                }
                sparseArray.remove(intExtra);
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        LLLZIL();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.LLILLL) {
            finish();
        }
    }

    public List<Integer> zs() {
        int intExtra = getIntent().getIntExtra("current_scene", EnumC852660Xce.NONE.getValue());
        return (intExtra == EnumC852660Xce.MODIFY_PHONE.getValue() || intExtra == EnumC852660Xce.BIND_PHONE.getValue()) ? Collections.singletonList(10) : C13BV.INSTANCE;
    }

    @Override // X.AbstractActivityC1237560iJG
    public final void LLLLZLLIL(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        C852970Xd9 c852970Xd9 = EnumC852910Xd3.Companion;
        int i = bundle2.getInt("next_page", EnumC852910Xd3.PHONE_SMS_CHANGE_PASSWORD.getValue());
        c852970Xd9.getClass();
        EnumC852910Xd3 enumC852910Xd3LIZ = C852970Xd9.LIZ(i);
        int i2 = bundle2.getInt("previous_page", -1);
        if (i2 == enumC852910Xd3LIZ.getValue() && i2 != -1) {
            onBackPressed();
            return;
        }
        bundle2.putInt("previous_page", bundle2.getInt("current_page", -1));
        bundle2.putInt("current_page", enumC852910Xd3LIZ.getValue());
        int i3 = bundle2.getInt("next_next_page", -1);
        if (i3 != -1) {
            bundle2.putInt("next_page", i3);
            bundle2.remove("next_next_page");
        } else {
            bundle2.remove("next_page");
        }
        C786410Ut5.LJJJI("previous_page_name", bundle2.getString("current_page_name"), bundle2);
        bundle2.remove("current_page_name");
        if (enumC852910Xd3LIZ == EnumC852910Xd3.FINISH) {
            this.LLIZLLLIL = false;
            finish();
        } else {
            C853670XeH.LIZ.getClass();
            AbstractActivityC1237560iJG.LLLZ(this, C853670XeH.LIZ(enumC852910Xd3LIZ), bundle2);
        }
    }

    @Override // X.AbstractActivityC1237560iJG
    public final void LLLLZLLLI(Bundle bundle) {
        Bundle bundle2;
        String string;
        this.LLILZLL = true;
        if (bundle == null || (bundle2 = bundle.getBundle("final_data")) == null) {
            bundle2 = new Bundle();
        }
        this.LLIZ = bundle2;
        Bundle value = ((ActionResultModel) ViewModelProviders.of(this).get(ActionResultModel.class)).LL.getValue();
        if (value != null) {
            string = value.getString("enter_from_item");
        } else {
            string = null;
        }
        if (C784500Uq0.LIZIZ(getIntent())) {
            this.LLILLL = true;
            LLLZIL();
        } else {
            C1238450iKh.LIZ(this, string, new AwS592S0100000_13(this, 24));
        }
    }

    public final void LLZ(Bundle bundle) {
        int intExtra = getIntent().getIntExtra("callback_action_type", -1);
        if (intExtra != -1) {
            SparseArray<C0XTR> sparseArray = LLJIJIL;
            C0XTR c0xtr = sparseArray.get(intExtra);
            if (c0xtr != null) {
                c0xtr.onResult(intExtra, 1, bundle);
            }
            sparseArray.remove(intExtra);
        }
    }

    @Override // X.AbstractActivityC1237560iJG, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        Bundle bundle2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onCreate", true);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate(");
        sbLIZ.append(bundle);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        activityConfiguration(new AwS592S0100000_13(this, 25));
        super.onCreate(bundle);
        C852970Xd9 c852970Xd9 = EnumC852910Xd3.Companion;
        int intExtra = getIntent().getIntExtra("next_page", EnumC852910Xd3.PHONE_SMS_CHANGE_PASSWORD.getValue());
        c852970Xd9.getClass();
        this.LLILZIL = C852970Xd9.LIZ(intExtra);
        String stringExtra3 = null;
        if (bundle == null) {
            MediatorLiveData<Bundle> mediatorLiveData = ((ActionResultModel) ViewModelProviders.of(this).get(ActionResultModel.class)).LL;
            try {
                bundle2 = getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            String strLLLLLZL = AbstractActivityC1237560iJG.LLLLLZL(getIntent(), "enter_from");
            String str = "";
            if (strLLLLLZL == null) {
                strLLLLLZL = "";
            }
            C786410Ut5.LJJJI("enter_from", strLLLLLZL, bundle2);
            String strLLLLLZL2 = AbstractActivityC1237560iJG.LLLLLZL(getIntent(), "enter_method");
            if (strLLLLLZL2 == null) {
                strLLLLLZL2 = "";
            }
            C786410Ut5.LJJJI("enter_method", strLLLLLZL2, bundle2);
            String strLLLLLZL3 = AbstractActivityC1237560iJG.LLLLLZL(getIntent(), "enter_type");
            if (strLLLLLZL3 != null) {
                str = strLLLLLZL3;
            }
            C786410Ut5.LJJJI("enter_type", str, bundle2);
            bundle2.putInt("next_page", this.LLILZIL.getValue());
            mediatorLiveData.postValue(bundle2);
        }
        C0XGR c0xgr = new C0XGR();
        try {
            stringExtra = getIntent().getStringExtra("enter_from");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            stringExtra = null;
        }
        c0xgr.LIZLLL("enter_from", stringExtra);
        try {
            stringExtra2 = getIntent().getStringExtra("enter_method");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            stringExtra2 = null;
        }
        c0xgr.LIZLLL("enter_method", stringExtra2);
        try {
            stringExtra3 = getIntent().getStringExtra("page");
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        c0xgr.LIZLLL("page", stringExtra3);
        C20684815ws.LJIILLIIL("enter_email_code_page", c0xgr.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onCreate", false);
    }

    public final void LLLZLZ(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.LLIZ = bundle;
        this.LLJI = Integer.valueOf(i);
        this.LLIZLLLIL = false;
        finish();
    }

    @Override // X.AbstractActivityC1237560iJG, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
