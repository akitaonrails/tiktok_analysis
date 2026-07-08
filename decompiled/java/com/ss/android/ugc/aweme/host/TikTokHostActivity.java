package com.ss.android.ugc.aweme.host;

import X.C0OGM;
import X.C199Y;
import X.C960203pA;
import X.InterfaceC214902198i;
import X.InterfaceC342470Dbh;
import X.InterfaceC836750Ws5;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes30.dex */
public class TikTokHostActivity extends C199Y implements C0OGM, InterfaceC836750Ws5 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZi0jOjt9HCwnHSA4ACo/PQ4wPCw6IDsq";
    public Class<? extends InterfaceC214902198i> LL;
    public InterfaceC342470Dbh LLILLJJLI;
    public boolean LLILLL;

    @Override // X.C199Y
    public final boolean getEnableNavigation() {
        return false;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean getEnableSAF() {
        return false;
    }

    @Override // X.C0OGM
    public final int getPageType() {
        return 4;
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.host.TikTokHostActivity", "onResume", true);
        super.onResume();
        this.LLILLL = C960203pA.LIZIZ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.host.TikTokHostActivity", "onResume", false);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.host.TikTokHostActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.host.TikTokHostActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.host.TikTokHostActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn
    public final boolean getEnablePowerPage() {
        return !getEnableSAF();
    }

    @Override // X.C199Y
    public final Class<? extends InterfaceC214902198i> getRootFragmentClz() {
        return this.LL;
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean zLIZIZ = C960203pA.LIZIZ(this);
        if (this.LLILLL != zLIZIZ) {
            this.LLILLL = zLIZIZ;
            recreate();
        } else {
            this.LLILLL = zLIZIZ;
        }
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        Fragment fragment;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.host.TikTokHostActivity", "onCreate", true);
        Fragment fragmentLJJJJZ = getSupportFragmentManager().LJJJJZ(R.id.rmy);
        if (fragmentLJJJJZ != null) {
            this.rootAttachFragment = fragmentLJJJJZ;
        } else {
            try {
                String stringExtra = getIntent().getStringExtra("POWER_FRAGMENT_CLASS_NAME");
                if (stringExtra != null) {
                    Object objNewInstance = Class.forName(stringExtra).newInstance();
                    if ((objNewInstance instanceof Fragment) && (fragment = (Fragment) objNewInstance) != null) {
                        this.rootAttachFragment = fragment;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Fragment fragment2 = this.rootAttachFragment;
        boolean z = fragment2 instanceof SAFTikTokFragment;
        if (getEnableSAF() && fragment2 != null) {
            this.LL = fragment2.getClass();
        }
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.host.TikTokHostActivity", "onCreate", false);
    }

    @Override // X.InterfaceC836750Ws5
    public final void setActivityResultListener(InterfaceC342470Dbh interfaceC342470Dbh) {
        this.LLILLJJLI = interfaceC342470Dbh;
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC342470Dbh interfaceC342470Dbh = this.LLILLJJLI;
        if (interfaceC342470Dbh != null) {
            interfaceC342470Dbh.onActivityResult(i, i2, intent);
        }
    }
}
