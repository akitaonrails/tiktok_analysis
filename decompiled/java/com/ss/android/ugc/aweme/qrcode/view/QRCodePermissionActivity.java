package com.ss.android.ugc.aweme.qrcode.view;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1070210dxL;
import X.C10ZE;
import X.C14W2;
import X.C19334910kd;
import X.C19514711Wn;
import X.C19741112Lp;
import X.C19GS;
import X.C20684815ws;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.qrcode.IScanQRCodeDiffProtocol;
import java.util.HashMap;

/* JADX INFO: loaded from: classes29.dex */
public class QRCodePermissionActivity extends C19GS {
    public static C10ZE LLILZ = null;
    public static long LLILZIL = 0;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjQ+KiA3LWHELIOSs6ICokZhQeCiA3LRUpOyI6OzYlJiESKzElPyYnMQ==";
    public boolean LL;
    public int LLILLJJLI = -1;
    public boolean LLILLL;

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onResume", false);
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLLZL() throws Throwable {
        Context context;
        Context context2;
        int iIntValue = this.LLILLJJLI;
        if (iIntValue == 5) {
            C10ZE c10ze = LLILZ;
            String str = ScanQRCodeActivityV2._pnsPageId;
            Intent intent = new Intent(this, (Class<?>) ScanQRCodeActivityV2.class);
            intent.putExtra("is_kill_self_after_scan", true);
            intent.putExtra("scan_page_from", iIntValue);
            ScanQRCodeActivityV2.LLLF = c10ze;
            ScanQRCodeActivityV2.LLLLLZL(this, intent);
        } else if (iIntValue == 8) {
            C10ZE c10ze2 = LLILZ;
            String str2 = ScanQRCodeActivityV2._pnsPageId;
            Intent intent2 = new Intent(this, (Class<?>) ScanQRCodeActivityV2.class);
            intent2.putExtra("is_kill_self_after_scan", false);
            intent2.putExtra("scan_page_from", iIntValue);
            ScanQRCodeActivityV2.LLLF = c10ze2;
            ScanQRCodeActivityV2.LLLLLZL(this, intent2);
        } else if (iIntValue != -1) {
            boolean zBooleanValue = this.LLILLL;
            C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPu6YJDK2Xx2eneiRHXDOVuC7RbBvl4dmZb5OTzZSc7+2BBaXg==", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = {this, Integer.valueOf(iIntValue), Boolean.valueOf(zBooleanValue)};
            C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Context;IZ)V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/qrcode/view/ScanQRCodeActivityV2", "startActivity", ScanQRCodeActivityV2.class, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(11098, "com/ss/android/ugc/aweme/qrcode/view/ScanQRCodeActivityV2", "startActivity", null, objArr, ScanQRCodeActivityV2.class, c0wzw, false);
            } else {
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                if (objArr2 != null) {
                    Object obj = objArr2[0];
                    context2 = obj != null ? (Context) obj : this;
                    Object obj2 = objArr2[1];
                    if (obj2 != null) {
                        iIntValue = ((Integer) obj2).intValue();
                    }
                    Object obj3 = c0wsuLIZIZ.LIZJ[2];
                    if (obj3 != null) {
                        zBooleanValue = ((Boolean) obj3).booleanValue();
                    }
                } else {
                    context2 = this;
                }
                String str3 = ScanQRCodeActivityV2._pnsPageId;
                Intent intent3 = new Intent(context2, (Class<?>) ScanQRCodeActivityV2.class);
                intent3.putExtra("scan_page_from", iIntValue);
                intent3.putExtra("camera_only", zBooleanValue);
                ScanQRCodeActivityV2.LLLLLZL(context2, intent3);
                c0wst.LIZ(11098, "com/ss/android/ugc/aweme/qrcode/view/ScanQRCodeActivityV2", "startActivity", null, objArr, ScanQRCodeActivityV2.class, c0wzw, true);
            }
        } else {
            boolean zBooleanValue2 = this.LL;
            C0WZX c0wzx2 = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPu6YJDK2Xx2eneiRHXDOVuC7RbBvl4dmZb5OTzZSc7+2BBaXg==", null);
            C0WST c0wst2 = new C0WST();
            Object[] objArr3 = {this, Boolean.valueOf(zBooleanValue2)};
            C0WZW c0wzw2 = new C0WZW(false, "(Landroid/content/Context;Z)V", c0wzx2);
            C0WSU c0wsuLIZIZ2 = c0wst2.LIZIZ(11098, "com/ss/android/ugc/aweme/qrcode/view/ScanQRCodeActivityV2", "startActivity", ScanQRCodeActivityV2.class, objArr3, "void", c0wzw2);
            if (c0wsuLIZIZ2.LIZ) {
                c0wst2.LIZ(11098, "com/ss/android/ugc/aweme/qrcode/view/ScanQRCodeActivityV2", "startActivity", null, objArr3, ScanQRCodeActivityV2.class, c0wzw2, false);
            } else {
                Object[] objArr4 = c0wsuLIZIZ2.LIZJ;
                if (objArr4 != null) {
                    Object obj4 = objArr4[0];
                    context = obj4 != null ? (Context) obj4 : this;
                    Object obj5 = objArr4[1];
                    if (obj5 != null) {
                        zBooleanValue2 = ((Boolean) obj5).booleanValue();
                    }
                } else {
                    context = this;
                }
                String str4 = ScanQRCodeActivityV2._pnsPageId;
                Intent intent4 = new Intent(context, (Class<?>) ScanQRCodeActivityV2.class);
                intent4.putExtra("enter_from", zBooleanValue2);
                ScanQRCodeActivityV2.LLLLLZL(context, intent4);
                c0wst2.LIZ(11098, "com/ss/android/ugc/aweme/qrcode/view/ScanQRCodeActivityV2", "startActivity", null, objArr3, ScanQRCodeActivityV2.class, c0wzw2, true);
            }
        }
        finish();
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

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        boolean z;
        Object obj;
        Object obj2;
        boolean z2 = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        IScanQRCodeDiffProtocol.LIZ.getClass();
        C1070210dxL.LIZIZ.getValue().LIZ();
        if (!ComplianceServiceProvider.LJIILJJIL().LJII(null)) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onCreate", false);
            return;
        }
        int iLIZ = C14W2.LIZ(this);
        C19741112Lp.LIZ.getClass();
        boolean zLIZLLL = C19741112Lp.LIZLLL(this, "android.permission.CAMERA");
        if (iLIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        HashMap map = new HashMap();
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("origin", obj);
        if (zLIZLLL) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("new", obj2);
        if (zLIZLLL != z) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("equal", str);
        C20684815ws.LJIILLIIL("power_permission_grant_track", map);
        if (iLIZ != 0) {
            z2 = false;
        }
        this.LL = getIntent().getBooleanExtra("enter_from", false);
        this.LLILLJJLI = getIntent().getIntExtra("page_from", -1);
        this.LLILLL = getIntent().getBooleanExtra("camera_only", false);
        if (!z2) {
            C19514711Wn.LIZLLL(this, TokenCert.with("bpea-qrcode_camera")).LIZIZ("android.permission.CAMERA").LIZJ(new C19334910kd(this, 1));
        } else {
            LLLLLZL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onCreate", false);
    }
}
