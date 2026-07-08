package com.ss.android.ugc.aweme.download.component_api.activity;

import X.C0XR2;
import X.C19514711Wn;
import X.C2188811AlT;
import X.C817700W5w;
import X.InterfaceC19515111Wr;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public class DownloadDelegateActivity extends Activity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiEjPiE/JyQoZyw8JTUjJyHELIOSo9PBotOSZ9KSY4IDk6PDxiDSAkJikjKCsXLSkpLi4nLQQvPSYlITE1";
    public Intent LL;

    @Override // android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onResume", false);
    }

    @Override // android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity
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

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextActivity: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, true);
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        TokenCert tokenCertWith;
        final String[] strArr;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onCreate", true);
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
        Intent intent = getIntent();
        this.LL = intent;
        if (intent != null) {
            if (intent.getIntExtra("type", 0) != 1) {
                if (!isFinishing()) {
                    finish();
                }
            } else {
                try {
                    stringExtra = this.LL.getStringExtra("permission_id_key");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
                String[] stringArrayExtra = this.LL.getStringArrayExtra("permission_content_key");
                if (stringArrayExtra != null && stringArrayExtra.length > 0) {
                    final C0XR2 c0xr2 = new C0XR2(this, stringExtra);
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 34) {
                        tokenCertWith = TokenCert.with("bpea-download_api_read_media_video");
                        strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
                    } else if (i == 33) {
                        tokenCertWith = TokenCert.with("bpea-download_api_read_media_video");
                        strArr = new String[]{"android.permission.READ_MEDIA_VIDEO"};
                    } else {
                        tokenCertWith = TokenCert.with("bpea-download_api_write_external_storage");
                        strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
                    }
                    C19514711Wn.LIZLLL(this, tokenCertWith).LIZIZ(strArr).LIZJ(new InterfaceC19515111Wr() { // from class: X.0XR3
                        @Override // X.InterfaceC19515111Wr
                        public final void onCanceled() {
                        }

                        @Override // X.InterfaceC19515111Wr
                        public final void LIZ(C0HWO... c0hwoArr) {
                            boolean z;
                            C0XR5 c0xr5Remove;
                            C0XR5 c0xr5Remove2;
                            if (c0hwoArr == null) {
                                return;
                            }
                            int length = c0hwoArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    if (c0hwoArr[i2].LIZ()) {
                                        z = true;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                            if (z) {
                                C0XR2 c0xr22 = (C0XR2) c0xr2;
                                String str = c0xr22.LIZIZ;
                                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str) && (c0xr5Remove2 = C0XR4.LIZ.remove(str)) != null) {
                                    c0xr5Remove2.LIZ();
                                }
                                Activity activity = c0xr22.LIZ.get();
                                if (activity != null && !activity.isFinishing()) {
                                    activity.finish();
                                    return;
                                }
                                return;
                            }
                            C0XR2 c0xr23 = (C0XR2) c0xr2;
                            String str2 = c0xr23.LIZIZ;
                            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2) && (c0xr5Remove = C0XR4.LIZ.remove(str2)) != null) {
                                c0xr5Remove.LIZIZ();
                            }
                            Activity activity2 = c0xr23.LIZ.get();
                            if (activity2 == null || activity2.isFinishing()) {
                                return;
                            }
                            activity2.finish();
                        }
                    });
                } else if (!isFinishing()) {
                    finish();
                }
            }
            this.LL = null;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onCreate", false);
    }
}
