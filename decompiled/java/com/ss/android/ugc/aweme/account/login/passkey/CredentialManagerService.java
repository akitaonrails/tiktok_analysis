package com.ss.android.ugc.aweme.account.login.passkey;

import X.AnonymousClass0956;
import X.C01GW;
import X.C05X2;
import X.C09AE;
import X.C09JN;
import X.C0BTL;
import X.C0PEM;
import X.C0SY5;
import X.C0WQI;
import X.C0XQ5;
import X.C0XTR;
import X.C10EU;
import X.C11JI;
import X.C11S5;
import X.C1239250iLz;
import X.C1367505Wv;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C13XC;
import X.C13XD;
import X.C15534066i;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1768606wG;
import X.C1886600zC6;
import X.C19316010ha;
import X.C1BV9;
import X.C20343814iy;
import X.C20431614x8;
import X.C20432014xC;
import X.C20432114xD;
import X.C20433614xS;
import X.C20642615q4;
import X.C2296808zG;
import X.C23250099c;
import X.C275570Ar5;
import X.C786410Ut5;
import X.C836280WrK;
import X.C844470XAv;
import X.C851380Xaa;
import X.EnumC20430014ws;
import X.EnumC20430314wv;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC1699660uKa;
import X.InterfaceC20325014fw;
import X.InterfaceC20343914iz;
import X.InterfaceC497601wk;
import X.InterfaceC852200Xbu;
import Y.ARunnableS0S1510000_31;
import Y.ARunnableS102S0100000_2;
import Y.ARunnableS11S0400000_2;
import Y.ARunnableS126S0100000_26;
import Y.ARunnableS8S0310000_12;
import Y.ARunnableS95S0200000_26;
import Y.AfS117S0300000_28;
import Y.AfS200S0100000_31;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.account.experiment.ThirdPartyDeprecationExperiment5;
import com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.PasskeyLoginGoogleErrorEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.PasskeyRegistrationGoogleErrorEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.ShowReplacePasskeyPopupEvent;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS0S4310000_31;
import kotlin.jvm.internal.AwS369S0200000_3;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes32.dex */
public final class CredentialManagerService implements ICredentialManagerService {
    public static String LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static boolean LIZLLL;
    public static volatile AnonymousClass0956 LJ;
    public static volatile AnonymousClass0956 LJI;
    public static volatile C11JI LJIIIIZZ;
    public static volatile AnonymousClass0956 LJIIIZ;
    public static final Map<Integer, C09AE> LJFF = new LinkedHashMap();
    public static volatile WeakReference<Activity> LJII = new WeakReference<>(null);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LJJIIJ() {
        /*
            r3 = this;
            monitor-enter(r3)
            X.11JI r0 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LJIIIIZZ     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r0 == 0) goto L13
            X.11JI r0 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LJIIIIZZ     // Catch: java.lang.Throwable -> L15
            r1 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.isDisposed()     // Catch: java.lang.Throwable -> L15
            if (r0 != r1) goto L12
            goto L13
        L12:
            r2 = 1
        L13:
            monitor-exit(r3)
            return r2
        L15:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LJJIIJ():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LJJIIJZLJL() {
        /*
            r3 = this;
            monitor-enter(r3)
            X.0956 r0 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LJ     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r0 == 0) goto L13
            X.0956 r0 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LJ     // Catch: java.lang.Throwable -> L15
            r1 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.isCompleted()     // Catch: java.lang.Throwable -> L15
            if (r0 != r1) goto L12
            goto L13
        L12:
            r2 = 1
        L13:
            monitor-exit(r3)
            return r2
        L15:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LJJIIJZLJL():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LJJIIZI() {
        /*
            r3 = this;
            monitor-enter(r3)
            X.0956 r0 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LJIIIZ     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r0 == 0) goto L13
            X.0956 r0 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LJIIIZ     // Catch: java.lang.Throwable -> L15
            r1 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.isCompleted()     // Catch: java.lang.Throwable -> L15
            if (r0 != r1) goto L12
            goto L13
        L12:
            r2 = 1
        L13:
            monitor-exit(r3)
            return r2
        L15:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LJJIIZI():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LJJIJ() {
        /*
            r3 = this;
            monitor-enter(r3)
            X.0956 r0 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LJI     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r0 == 0) goto L13
            X.0956 r0 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LJI     // Catch: java.lang.Throwable -> L15
            r1 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.isCompleted()     // Catch: java.lang.Throwable -> L15
            if (r0 != r1) goto L12
            goto L13
        L12:
            r2 = 1
        L13:
            monitor-exit(r3)
            return r2
        L15:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LJJIJ():boolean");
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final boolean LJFF() {
        C19316010ha.LIZ.getClass();
        if (C19316010ha.LIZ()) {
            return C19316010ha.LIZ() && Build.VERSION.SDK_INT >= 28 && C19316010ha.LIZIZ.contains(((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase()) && LJJIIZ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final void LJII() {
        PasskeyRegistrationGoogleErrorEvent passkeyRegistrationGoogleErrorEvent = new PasskeyRegistrationGoogleErrorEvent();
        EnumC20430014ws enumC20430014ws = EnumC20430014ws.PASSKEY_REGISTRATION_ALREADY_RESUMED;
        passkeyRegistrationGoogleErrorEvent.LJI(String.valueOf(enumC20430014ws.getErrorCode()), "error_code");
        passkeyRegistrationGoogleErrorEvent.LJI(String.valueOf(enumC20430014ws.getErrorCode()), "error_type");
        passkeyRegistrationGoogleErrorEvent.LJI(String.valueOf(enumC20430014ws.getErrorCode()), "error_string");
        C844470XAv.LIZ.getClass();
        passkeyRegistrationGoogleErrorEvent.LJI(String.valueOf(LJIIZILJ(C844470XAv.LIZ())), "gms_version");
        passkeyRegistrationGoogleErrorEvent.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final boolean LJIIJ() {
        if (((Number) C275570Ar5.LIZ.getValue()).intValue() == 1) {
            return false;
        }
        IAccountLoginMethodsService iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null);
        if (iAccountLoginMethodsService == null || !iAccountLoginMethodsService.LIZJ() || iAccountLoginMethodsService.LJIIIIZZ()) {
            return !ThirdPartyDeprecationExperiment5.LJFF("google");
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final HashMap<String, Object> LJIIJJI() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("last_scene", -1);
        map.put("next_page", Integer.valueOf(EnumC852910Xd3.PASSKEY.getValue()));
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.PASSKEY_WIZARD;
        map.put("current_scene", Integer.valueOf(enumC852660Xce.getValue()));
        map.put("action_type", Integer.valueOf(enumC852660Xce.getValue()));
        map.put("enter_from", "passkey_wizard");
        return map;
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final boolean LJIILL() {
        C19316010ha.LIZ.getClass();
        return C19316010ha.LIZ() && Build.VERSION.SDK_INT >= 28 && LJJIIZ();
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final void LJIJJLI() {
        PasskeyLoginGoogleErrorEvent passkeyLoginGoogleErrorEvent = new PasskeyLoginGoogleErrorEvent();
        EnumC20430314wv enumC20430314wv = EnumC20430314wv.PASSKEY_LOGIN_ALREADY_RESUMED;
        passkeyLoginGoogleErrorEvent.LJI(String.valueOf(enumC20430314wv.getErrorCode()), "error_code");
        passkeyLoginGoogleErrorEvent.LJI(String.valueOf(enumC20430314wv.getErrorCode()), "error_type");
        passkeyLoginGoogleErrorEvent.LJI(String.valueOf(enumC20430314wv.getErrorCode()), "error_string");
        C844470XAv.LIZ.getClass();
        passkeyLoginGoogleErrorEvent.LJI(String.valueOf(LJIIZILJ(C844470XAv.LIZ())), "gms_version");
        passkeyLoginGoogleErrorEvent.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final boolean LIZJ() {
        return LJIILL() && !C10EU.LJIILIIL() && C0XQ5.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final boolean LJIIL() {
        if (!LJIILL()) {
            return false;
        }
        C01GW c01gw = C0BTL.LIZ;
        return ((Number) c01gw.getValue()).intValue() == 1 || ((Number) c01gw.getValue()).intValue() == 2;
    }

    public final boolean LJJIIZ() {
        if (!C20642615q4.LIZ() || ((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).LJFF().booleanValue()) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        return Build.VERSION.SDK_INT >= 28 && LJIIZILJ(contextLIZ) >= ((long) 230815045) && C786410Ut5.b4(GoogleApiAvailability.getInstance(), contextLIZ) == 0;
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final WeakReference<Activity> LJIILJJIL() {
        return LJII;
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final boolean LJIJJ() {
        return LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final void LIZ(Activity activity) {
        if (LIZLLL || (activity.getIntent() != null && activity.getIntent().getBooleanExtra("is_passkey_wizard", false))) {
            C1397620mTQ c1397620mTQ = new C1397620mTQ(activity);
            c1397620mTQ.LIZJ(0, activity.getString(2131839101), new AwS610S0100000_31(activity, 119));
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            c1397580mTM.LJI(activity.getString(2131839102));
            c1397580mTM.LIZIZ(activity.getString(2131839100));
            c1397580mTM.LJIIL = c1397620mTQ;
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final void LIZIZ(Activity activity) {
        LJIIIIZZ(activity, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LIZLLL(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.Integer, X.09AE> r1 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LJFF     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L1d
            X.09AE r0 = (X.C09AE) r0     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L18
            boolean r0 = r0.isCompleted()     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L18
            goto L1a
        L18:
            r0 = 0
            goto L1b
        L1a:
            r0 = 1
        L1b:
            monitor-exit(r2)
            return r0
        L1d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LIZLLL(int):boolean");
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final boolean LJI(Uri uri) {
        if (!a0.LJJIIZI(uri.toString(), "ucenter_web/passkey_wizard", false) && !a0.LJJIIZI(uri.toString(), "passkey/wizard/create", false)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final void LJIILLIIL(boolean z) {
        LIZLLL = z;
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final long LJIIZILJ(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                return C786410Ut5.Y3(packageManager, "com.google.android.gms", 0).getLongVersionCode();
            }
            return C786410Ut5.Y3(packageManager, "com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[Catch: Exception -> 0x009f, all -> 0x00b7, TRY_LEAVE, TryCatch #0 {Exception -> 0x009f, blocks: (B:4:0x0002, B:6:0x0014, B:7:0x001c, B:9:0x0022, B:17:0x0038, B:18:0x0042, B:20:0x004e, B:23:0x005b, B:25:0x0079, B:29:0x0083, B:32:0x008a, B:35:0x0090, B:16:0x0035), top: B:49:0x0002, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[Catch: Exception -> 0x009f, all -> 0x00b7, TRY_ENTER, TryCatch #0 {Exception -> 0x009f, blocks: (B:4:0x0002, B:6:0x0014, B:7:0x001c, B:9:0x0022, B:17:0x0038, B:18:0x0042, B:20:0x004e, B:23:0x005b, B:25:0x0079, B:29:0x0083, B:32:0x008a, B:35:0x0090, B:16:0x0035), top: B:49:0x0002, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.Boolean LJJIJIIJIL(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r4 = 0
            kotlin.text.Regex r1 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            java.lang.String r0 = "\\."
            r1.<init>(r0)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            java.util.List r2 = r1.split(r7, r4)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            r5 = 1
            if (r0 != 0) goto L35
            int r0 = r2.size()     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            java.util.ListIterator r1 = r2.listIterator(r0)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
        L1c:
            boolean r0 = r1.hasPrevious()     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            if (r0 == 0) goto L35
            java.lang.Object r0 = r1.previous()     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            int r0 = r0.length()     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            if (r0 != 0) goto L2f
            goto L31
        L2f:
            r0 = 0
            goto L32
        L31:
            r0 = 1
        L32:
            if (r0 != 0) goto L1c
            goto L38
        L35:
            X.13BV r1 = X.C13BV.INSTANCE     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            goto L42
        L38:
            int r0 = r1.nextIndex()     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            int r0 = r0 + 1
            java.util.List r1 = X.C13LP.LL(r2, r0)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
        L42:
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            int r0 = r1.length     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            r3 = 3
            if (r0 == r3) goto L5b
            java.lang.String r2 = "idToken invalid size"
            java.lang.String r1 = ""
            java.lang.String r0 = ""
            X.C20432114xD.LJI(r5, r2, r1, r0, r4)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            monitor-exit(r6)
            return r0
        L5b:
            r1 = r1[r5]     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            r0 = 8
            byte[] r2 = android.util.Base64.decode(r1, r0)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            r1.<init>(r0)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            java.lang.String r0 = "nonce"
            java.lang.String r2 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            java.lang.String r0 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LIZ     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            if (r0 == 0) goto L9d
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            if (r0 == 0) goto L9d
        L7f:
            java.lang.String r1 = ""
            if (r5 != 0) goto L9b
            java.lang.String r0 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LIZ     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            if (r0 != 0) goto L98
            java.lang.String r1 = "nonce is null"
            r3 = 2
        L8a:
            java.lang.String r0 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LIZ     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            if (r0 != 0) goto L90
            java.lang.String r0 = ""
        L90:
            X.C20432114xD.LJI(r3, r1, r2, r0, r5)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lb7
            goto Lb5
        L98:
            java.lang.String r1 = "nonce not match"
            goto L8a
        L9b:
            r3 = 0
            goto L8a
        L9d:
            r5 = 0
            goto L7f
        L9f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> Lb7
            if (r3 != 0) goto Lab
            java.lang.String r3 = ""
        Lab:
            java.lang.String r2 = ""
            java.lang.String r1 = ""
            r0 = 4
            X.C20432114xD.LJI(r0, r3, r2, r1, r4)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lb7
        Lb5:
            monitor-exit(r6)
            return r0
        Lb7:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LJJIJIIJIL(java.lang.String):java.lang.Boolean");
    }

    public static C836280WrK LJJIFFI(Intent intent, boolean z) {
        boolean booleanExtra = intent.getBooleanExtra("autoselect_supported", false);
        C20343814iy c20343814iy = new C20343814iy();
        c20343814iy.LIZJ = true;
        c20343814iy.LIZ = "340331662088-6ubo66ljal3ianb35dr9clu3p0ea7v64.apps.googleusercontent.com";
        c20343814iy.LIZLLL = booleanExtra;
        c20343814iy.LIZIZ = LIZ;
        c20343814iy.LIZJ = z;
        return new C836280WrK(c20343814iy.LIZ, c20343814iy.LIZIZ, c20343814iy.LIZJ, c20343814iy.LIZLLL);
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final void LJ(final Activity activity, final AwS369S0200000_3 awS369S0200000_3) {
        String str = CommonFlowActivity._pnsPageId;
        EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.PASSKEY_UPSELL;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.PASSKEY_REGISTRATION;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", "find_account", bundle);
        C786410Ut5.LJJJI("enter_method", "click", bundle);
        C851380Xaa.LIZ(activity, enumC852910Xd3, enumC852660Xce, bundle, new C0XTR() { // from class: X.05gj
            @Override // X.C0XTR
            public final void onResult(int i, int i2, Object obj) {
                boolean z = true;
                if (i2 == 1) {
                    Activity activity2 = activity;
                    activity2.runOnUiThread(new ARunnableS102S0100000_2(activity2, 62));
                } else {
                    z = false;
                }
                awS369S0200000_3.invoke(Boolean.valueOf(z));
            }
        }, null);
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final void LJIIIIZZ(Activity activity, String str) {
        String str2 = CommonFlowActivity._pnsPageId;
        EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.PASSKEY;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.PASSKEY_REGISTRATION;
        Bundle bundle = new Bundle();
        if (str == null) {
            str = "account_page";
        }
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C851380Xaa.LIZ(activity, enumC852910Xd3, enumC852660Xce, bundle, new C1768606wG(activity, 0), null);
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final void LJIILIIL(Activity activity, InterfaceC20325014fw interfaceC20325014fw) {
        InterfaceC497601wk interfaceC497601wkLIZ;
        C0WQI.LIZ(3, "passkey", "tryAuthWithPasskey begin");
        LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(activity);
        if (lifecycleOwnerLIZIZ == null || (interfaceC497601wkLIZ = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ)) == null) {
            interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        }
        C23250099c.LIZLLL(interfaceC497601wkLIZ, C0PEM.LIZJ, null, new C20433614xS(interfaceC20325014fw, this, activity, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final void LJIJI(Activity activity, Intent intent, InterfaceC20343914iz interfaceC20343914iz) {
        LJJIII(activity, intent, interfaceC20343914iz, true);
        C15534066i.LIZ.getClass();
        C15534066i.LIZ("launch_invisible_activity");
    }

    public final synchronized void LJJII(Activity activity, C05X2 c05x2, InterfaceC852200Xbu interfaceC852200Xbu) {
        InterfaceC497601wk interfaceC497601wkLIZ;
        LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(activity);
        if (lifecycleOwnerLIZIZ == null || (interfaceC497601wkLIZ = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ)) == null) {
            interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        }
        LJIIIZ = C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C1367505Wv(this, activity, c05x2, interfaceC852200Xbu, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJJI(X.InterfaceC20343914iz r4, java.lang.String r5, android.content.Intent r6, boolean r7) {
        /*
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r0 = "google_onetap"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto L19
            java.lang.String r0 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LIZ
            if (r0 == 0) goto L18
            X.0WrK r0 = LJJIFFI(r6, r7)
            r2.add(r0)
        L18:
            return r2
        L19:
            java.lang.String r0 = "passkey"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto L18
            java.lang.String r3 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LIZIZ
            r1 = 0
            if (r3 == 0) goto L3d
            int r0 = r3.length()
            if (r0 == 0) goto L3d
            r0 = 0
        L2d:
            if (r0 != 0) goto L59
            java.lang.String r0 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LIZJ
            if (r0 == 0) goto L39
            int r0 = r0.length()
            if (r0 != 0) goto L3a
        L39:
            r1 = 1
        L3a:
            if (r1 != 0) goto L59
            goto L3f
        L3d:
            r0 = 1
            goto L2d
        L3f:
            X.13XC r0 = new X.13XC     // Catch: java.lang.NullPointerException -> L45 java.lang.IllegalArgumentException -> L69
            r0.<init>(r3)     // Catch: java.lang.NullPointerException -> L45 java.lang.IllegalArgumentException -> L69
            goto L7d
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.14xC r1 = new X.14xC
            X.14wv r0 = X.EnumC20430314wv.PASSKEY_LOGIN_NULL_POINTER
            int r0 = r0.getErrorCode()
            r1.<init>(r0)
            r0 = 0
            r4.LLLILZLLLI(r1, r0)
            goto L7c
        L59:
            X.14xC r1 = new X.14xC
            X.14wv r0 = X.EnumC20430314wv.PASSKEY_LOGIN_MISSING_JSON
            int r0 = r0.getErrorCode()
            r1.<init>(r0)
            r0 = 0
            r4.LLLILZLLLI(r1, r0)
            goto L7c
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.14xC r1 = new X.14xC
            X.14wv r0 = X.EnumC20430314wv.PASSKEY_LOGIN_ILLEGAL_ARGUMENT
            int r0 = r0.getErrorCode()
            r1.<init>(r0)
            r0 = 0
            r4.LLLILZLLLI(r1, r0)
        L7c:
            r0 = 0
        L7d:
            if (r0 == 0) goto L82
            r2.add(r0)
        L82:
            java.lang.String r0 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LIZ
            if (r0 == 0) goto L18
            X.0WrK r0 = LJJIFFI(r6, r7)
            r2.add(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LJJI(X.14iz, java.lang.String, android.content.Intent, boolean):java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final void LJIJ(Activity activity, String str, boolean z, C1886600zC6 c1886600zC6) {
        try {
            activity.runOnUiThread(new ARunnableS8S0310000_12(activity, C1697810uHb.LJIILJJIL(new C13XC(str)), z, c1886600zC6, 2));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            int errorCode = EnumC20430314wv.PASSKEY_LOGIN_ILLEGAL_ARGUMENT.getErrorCode();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            c1886600zC6.onError(errorCode, message);
        }
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final synchronized void LJIL(final Activity activity, final C05X2 c05x2, final C1BV9 c1bv9, final InterfaceC1699660uKa interfaceC1699660uKa) {
        if (!LJJIIJZLJL() && !LJJIJ() && !LJJIIZI() && !LJJIIJ()) {
            C844470XAv.LIZ.getClass();
            C20432114xD.LJFF(C844470XAv.LIZ());
            if (c05x2 == C05X2.GOOGLE_ONETAP) {
                LJJII(activity, c05x2, c1bv9);
                return;
            }
            C15534066i.LIZ.getClass();
            C15534066i.LIZIZ = System.currentTimeMillis();
            LJIIIIZZ = (C11JI) C1239250iLz.LIZ("/passport/fido2/begin_discoverable_user_login/", new HashMap()).LJIIZILJ(new C09JN() { // from class: X.14ih
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CredentialManagerService@16d5.tryLoginWithCredentialManager$2");
                    C846060XGy c846060XGy = (C846060XGy) obj;
                    try {
                        String str = CredentialManagerService.LIZ;
                        CredentialManagerService.LIZJ = JSONObjectProtectorUtils.getString(c846060XGy.LJIILJJIL, "webauthn_ticket");
                        c846060XGy.LJIILJJIL.remove("webauthn_ticket");
                        CredentialManagerService.LIZ = null;
                        CredentialManagerService.LIZIZ = C786410Ut5.J3(c846060XGy.LJIILJJIL);
                        C15534066i.LIZ.getClass();
                        C15534066i.LIZ("fetch_passkey_challenge");
                        C05X2 c05x22 = c05x2;
                        if (c05x22 == C05X2.PASSKEY) {
                            CredentialManagerService credentialManagerService = this;
                            Activity activity2 = activity;
                            InterfaceC852200Xbu interfaceC852200Xbu = c1bv9;
                            synchronized (credentialManagerService) {
                                CredentialManagerService.LJII = new WeakReference<>(activity2);
                                activity2.runOnUiThread(new ARunnableS11S0400000_2(activity2, c05x22, credentialManagerService, interfaceC852200Xbu, 0));
                            }
                        } else {
                            this.LJJII(activity, c05x22, c1bv9);
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20431614x8 c20431614x8 = C20431614x8.LIZ;
                        Activity activity3 = activity;
                        C20432014xC c20432014xC = new C20432014xC(EnumC20430314wv.PASSKEY_LOGIN_JSON_EXCEPTION.getErrorCode());
                        InterfaceC852200Xbu interfaceC852200Xbu2 = c1bv9;
                        c20431614x8.getClass();
                        C20431614x8.LJFF(activity3, c20432014xC, false, false, null, interfaceC852200Xbu2);
                        activity.runOnUiThread(new ARunnableS95S0200000_26(interfaceC1699660uKa, e, 34));
                    }
                    C1C7U.LIZIZ("CredentialManagerService@16d5.tryLoginWithCredentialManager$2");
                }
            }, new AfS117S0300000_28(activity, c1bv9, interfaceC1699660uKa, 5));
            return;
        }
        C20431614x8 c20431614x8 = C20431614x8.LIZ;
        C20432014xC c20432014xC = new C20432014xC(EnumC20430314wv.PASSKEY_LOGIN_EXISTING_JOB_RUNNING.getErrorCode());
        c20431614x8.getClass();
        C20431614x8.LJFF(activity, c20432014xC, false, false, null, c1bv9);
        activity.runOnUiThread(new ARunnableS126S0100000_26(interfaceC1699660uKa, 84));
    }

    public final synchronized void LJJIII(Activity activity, Intent intent, InterfaceC20343914iz interfaceC20343914iz, boolean z) {
        String stringExtra;
        try {
            stringExtra = intent.getStringExtra("platform");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        activity.runOnUiThread(new ARunnableS0S1510000_31(activity, stringExtra, LJJI(interfaceC20343914iz, stringExtra, intent, z), this, z, intent, interfaceC20343914iz, 0));
    }

    @Override // com.ss.android.ugc.aweme.ICredentialManagerService
    public final synchronized void LJIIIZ(final Activity activity, final InterfaceC20325014fw interfaceC20325014fw, final boolean z, final String str, final String str2) {
        HashMap map = new HashMap();
        map.put("entrance", str2);
        map.put(Scene.SCENE_SERVICE, str);
        C1239250iLz.LIZ("/passport/fido2/begin_user_registration/", map).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ()).LJIIZILJ(new C09JN() { // from class: X.14ig
            /* JADX WARN: Removed duplicated region for block: B:16:0x00b5 A[Catch: s -> 0x0195, TRY_ENTER, TryCatch #5 {s -> 0x0195, blocks: (B:3:0x0017, B:16:0x00b5, B:18:0x00b9, B:23:0x00e4, B:25:0x00f0), top: B:56:0x0017 }] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x01ac  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r27) {
                /*
                    Method dump skipped, instruction units count: 484
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20342014ig.accept(java.lang.Object):void");
            }
        }, new AfS200S0100000_31(interfaceC20325014fw, 5));
    }

    public final synchronized void LJJIJIIJI(final Activity activity, final String str, final String str2, final String str3, final String str4, final InterfaceC20325014fw interfaceC20325014fw) {
        ShowReplacePasskeyPopupEvent showReplacePasskeyPopupEvent = new ShowReplacePasskeyPopupEvent();
        showReplacePasskeyPopupEvent.LJI("info_page", "enter_from");
        showReplacePasskeyPopupEvent.LJI("click", "enter_method");
        showReplacePasskeyPopupEvent.LJIIIIZZ();
        activity.runOnUiThread(new Runnable() { // from class: X.14iN
            public final /* synthetic */ boolean LLILZLL = true;

            public final void LIZ() {
                Activity activity2 = activity;
                C1397580mTM c1397580mTM = new C1397580mTM(activity2);
                c1397580mTM.LJI(activity2.getString(2131839116));
                c1397580mTM.LIZIZ(activity.getString(2131839113));
                c1397580mTM.LIZLLL(new AwS610S0100000_31(interfaceC20325014fw, 410));
                Activity activity3 = activity;
                CredentialManagerService credentialManagerService = this;
                String str5 = str;
                String str6 = str2;
                boolean z = this.LLILZLL;
                C985403tE.LIZ(c1397580mTM, new AwS0S4310000_31(activity3, interfaceC20325014fw, credentialManagerService, str5, str6, str3, str4, z, 0));
                new C1397510mTF(c1397580mTM).LIZLLL();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CredentialManagerService@16d5.showRecreateConfirmationPopUp$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CredentialManagerService@16d5.showRecreateConfirmationPopUp$1");
            }
        });
    }

    public final synchronized void LJJ(final Activity activity, String str, final String str2, boolean z, final boolean z2, final boolean z3, final String str3, final String str4, final InterfaceC20325014fw interfaceC20325014fw) {
        try {
            final C13XD c13xd = new C13XD(str, z);
            if (LJJIIJZLJL()) {
                interfaceC20325014fw.LIZ(new C20432014xC(EnumC20430014ws.PASSKEY_REGISTRATION_EXISTING_JOB_RUNNING.getErrorCode()), true, false);
            } else {
                activity.runOnUiThread(new Runnable() { // from class: X.14fu
                    public final void LIZ() {
                        InterfaceC497601wk interfaceC497601wkLIZ;
                        LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(activity);
                        if (lifecycleOwnerLIZIZ == null || (interfaceC497601wkLIZ = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ)) == null) {
                            interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
                        }
                        String str5 = CredentialManagerService.LIZ;
                        CredentialManagerService.LJ = C23250099c.LIZLLL(interfaceC497601wkLIZ, C0PEM.LIZJ, null, new C20432514xH(activity, c13xd, z2, z3, interfaceC20325014fw, str4, str2, str3, null), 2);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("CredentialManagerService@16d5.createPasskey$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("CredentialManagerService@16d5.createPasskey$1");
                    }
                });
            }
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC20325014fw.LIZ(new C20432014xC(EnumC20430014ws.PASSKEY_REGISTRATION_ILLEGAL_ARGUMENT.getErrorCode()), true, false);
        } catch (NullPointerException e2) {
            TryCatchGuardChecker.doCheck(e2);
            interfaceC20325014fw.LIZ(new C20432014xC(EnumC20430014ws.PASSKEY_REGISTRATION_NULL_POINTER.getErrorCode()), true, false);
        }
    }
}
