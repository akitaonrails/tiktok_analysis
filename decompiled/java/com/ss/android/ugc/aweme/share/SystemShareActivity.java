package com.ss.android.ugc.aweme.share;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C054G;
import X.C086I;
import X.C098200Yq;
import X.C09A1;
import X.C09C2;
import X.C09O4;
import X.C09O5;
import X.C09O8;
import X.C09O9;
import X.C0DVR;
import X.C0PEM;
import X.C0XKJ;
import X.C0XQ7;
import X.C0YTK;
import X.C10EU;
import X.C1266130j3L;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1402840mbq;
import X.C14EU;
import X.C1531205z4;
import X.C1850540yFw;
import X.C189200o6;
import X.C19514711Wn;
import X.C19EH;
import X.C19GS;
import X.C1B45;
import X.C1B46;
import X.C1B47;
import X.C1B4B;
import X.C1B4F;
import X.C1B4P;
import X.C1B4Q;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2189108ht;
import X.C2198601B3a;
import X.C2198841B3y;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C2360609Mu;
import X.C452501pT;
import X.C622680Oba;
import X.C786410Ut5;
import X.C985403tE;
import X.InterfaceC1294060jmO;
import X.InterfaceC20688515xT;
import X.InterfaceC586170Myt;
import Y.AObserverS236S0100000_34;
import Y.ARunnableS134S0100000_34;
import Y.ARunnableS81S0200000_12;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.authorize.model.CopyRightResponse;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.im.service.service.IIMContactManager;
import com.ss.android.ugc.aweme.im.service.service.IIMMessageOpenService;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import com.ss.android.ugc.aweme.openshare.DmShare;
import com.ss.android.ugc.aweme.openshare.IShareRespSendService;
import com.ss.android.ugc.aweme.openshare.Share$Request;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import com.ss.android.ugc.aweme.share.systemshare.SystemShareEntryFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes35.dex */
public final class SystemShareActivity extends C19GS implements InterfaceC586170Myt, InterfaceC20688515xT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjHELIOSYkKD02ZhY1Ojs2JRYkKD02CSY4IDk6PDw=";
    public C1402840mbq LLILLJJLI;
    public Share$Request LLILLL;
    public C1B4B LLILZ;
    public DmShare.TikTokShareDirectMessageSettings LLILZLL;
    public DmShare.TikTokDSPSettings LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public ClientScopeResponse LLJILJILJ;
    public CopyRightResponse LLJILLL;
    public final C01GW LLJJ;
    public SystemShareEntryFragment LLJJI;
    public final AObserverS236S0100000_34 LLJJIII;
    public final AObserverS236S0100000_34 LLJJIJI;
    public final C1B4P LL = new C1B4P();
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(115));
    public String LLJI = "";
    public final C054G LLJIJIL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final CreativeInfo LLJILJIL = new CreativeInfo(null, 0, null, 7, null);

    public final void LLLZ() {
        C1402840mbq c1402840mbq = this.LLILLJJLI;
        if (c1402840mbq == null) {
            c1402840mbq = null;
        }
        c1402840mbq.mShareMediaType = this.LL.LIZ();
        String callingPackage = getCallingPackage();
        if (callingPackage == null) {
            Share$Request share$Request = this.LLILLL;
            if (share$Request == null) {
                share$Request = null;
            }
            callingPackage = share$Request.getCallerPackage();
        }
        C1B4B c1b4b = new C1B4B(this.LL, this.LLJILJIL.getCreationId(), callingPackage);
        this.LLILZ = c1b4b;
        C1402840mbq c1402840mbq2 = this.LLILLJJLI;
        if (c1402840mbq2 == null) {
            c1402840mbq2 = null;
        }
        C1B4B.LIZJ(c1b4b, this, c1402840mbq2, null, null, false, 60);
        c1b4b.LJ.observeForever(this.LLJJIJI);
        c1b4b.LJI.observeForever(this.LLJJIII);
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onStart", false);
    }

    @C14EU
    public final void onUserBannedEvent(C0XKJ c0xkj) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static String[] LLLLZIL() {
        int i = Build.VERSION.SDK_INT;
        return i >= 34 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : i == 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    }

    @Override // X.InterfaceC20688515xT
    public final void LJJIJIIJIL() {
        TuxSheet tuxSheet;
        SystemShareEntryFragment systemShareEntryFragment = this.LLJJI;
        if (systemShareEntryFragment == null || (tuxSheet = systemShareEntryFragment.SR().LLJJJ) == null) {
            return;
        }
        tuxSheet.dismiss();
    }

    public final SystemShareActivityViewModel LLLLZLLIL() {
        return (SystemShareActivityViewModel) this.LLJJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.1B4M] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZ() {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.SystemShareActivity.LLZ():void");
    }

    public final boolean LLZLLLL() {
        if (!((IOpenPlatformService) this.LLILZIL.getValue()).LIZJ(getIntent()) && ((Intrinsics.LJFF(getIntent().getAction(), "android.intent.action.SEND") && getIntent().getParcelableExtra("android.intent.extra.STREAM") != null) || (Intrinsics.LJFF(getIntent().getAction(), "android.intent.action.SEND_MULTIPLE") && getIntent().getParcelableArrayListExtra("android.intent.extra.STREAM") != null))) {
            return true;
        }
        Bundle bundleLLLLLZL = LLLLLZL(getIntent());
        if ((bundleLLLLLZL != null ? bundleLLLLLZL.getString("android.support.v4.app.EXTRA_CALLING_PACKAGE") : null) != null) {
            Bundle bundleLLLLLZL2 = LLLLLZL(getIntent());
            if (a0.LJJIIZI(bundleLLLLLZL2 != null ? bundleLLLLLZL2.getString("android.support.v4.app.EXTRA_CALLING_PACKAGE") : null, "photo", false)) {
                return true;
            }
        }
        return false;
    }

    public final void init() {
        String[] strArr;
        C19514711Wn c19514711WnLIZIZ;
        C1B46 c1b46 = C1B46.LIZ;
        Intent intent = getIntent();
        c1b46.getClass();
        C1402840mbq c1402840mbqLIZ = C1B46.LIZ(intent);
        if (c1402840mbqLIZ != null) {
            this.LLILLJJLI = c1402840mbqLIZ;
        }
        C1402840mbq c1402840mbq = this.LLILLJJLI;
        if (c1402840mbq == null) {
            C1B46.LIZIZ();
            return;
        }
        Share$Request share$RequestLJ = C1B46.LJ(c1402840mbq.getShareRequestBundle());
        if (share$RequestLJ != null) {
            this.LLILLL = share$RequestLJ;
        }
        if (this.LLILLL == null) {
            C1B46.LIZIZ();
            return;
        }
        if (C10EU.LJIIIIZZ()) {
            C1B4F c1b4f = C1B4F.LJIIZILJ;
            C2344809Gs.LJ("Share Denied");
            C1850540yFw c1850540yFw = C1850540yFw.LIZ;
            C1B4F c1b4f2 = C1B4F.LJJIJ;
            c1850540yFw.getClass();
            C1850540yFw.LIZ(c1b4f2);
            b(2131847057, c1b4f, null);
            SmartRouter.buildRoute(this, "//kids/main").open();
            Activity[] activityStack = ActivityStack.getActivityStack();
            ArrayList<Activity> arrayList = new ArrayList();
            for (Activity activity : activityStack) {
                if (activity instanceof SystemShareActivity) {
                    arrayList.add(activity);
                }
            }
            for (Activity activity2 : arrayList) {
                activity2.finish();
                C786410Ut5.ae(0, activity2, 0);
            }
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("skip_permission_check", false) && LLZLLLL() && !((Boolean) C2360609Mu.LIZ.getValue()).booleanValue()) {
            LLZ();
            return;
        }
        String[] strArrLLLLZIL = LLLLZIL();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
            c19514711WnLIZIZ = C19514711Wn.LIZIZ.LIZIZ(this, TokenCert.Companion.with("bpea-opensdk_sdk34_permission"));
        } else if (i == 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
            c19514711WnLIZIZ = C19514711Wn.LIZIZ.LIZIZ(this, TokenCert.Companion.with("bpea-opensdk_sdk33_permission"));
        } else {
            strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
            c19514711WnLIZIZ = C19514711Wn.LIZIZ.LIZIZ(this, TokenCert.Companion.with("bpea-opensdk_permission"));
        }
        c19514711WnLIZIZ.LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new C1266130j3L(this, strArrLLLLZIL, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    @Override // X.C19EG, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.SystemShareActivity.onResume():void");
    }

    public SystemShareActivity() {
        new MutableLiveData();
        this.LLJJ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 67));
        this.LLJJIII = new AObserverS236S0100000_34(this, 13);
        this.LLJJIJI = new AObserverS236S0100000_34(this, 12);
    }

    public static boolean LLZLI() {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null) {
            return false;
        }
        try {
            String simpleName = topActivity.getClass().getSimpleName();
            if (!Intrinsics.LJFF(simpleName, "SignUpOrLoginActivity")) {
                if (!Intrinsics.LJFF(simpleName, "LoginMethodListActivity")) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (this.LLILZ != null) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS134S0100000_34((Object) this, 33));
        }
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI("TTOP_SystemShare");
        if (fragmentLJJJJZI != null) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
            c19ehLJIIJ.LJIIL();
        }
        super.onDestroy();
        C622680Oba.LIZLLL(this);
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

    public static Bundle LLLLLZL(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLLZI(X.InterfaceC1364105Vn r13) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.SystemShareActivity.LLLLZI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLLZLL(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.share.ClientScopeResponse> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof X.C1B48
            if (r0 == 0) goto L21
            r13 = r15
            X.1B48 r13 = (X.C1B48) r13
            int r2 = r13.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r13.LLILLL = r2
        L12:
            java.lang.Object r3 = r13.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r13.LLILLL
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L2f
            if (r0 != r5) goto L27
            goto L76
        L21:
            X.1B48 r13 = new X.1B48
            r13.<init>(r14, r15)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r3 = r14.getCallingPackage()
            if (r3 != 0) goto L41
            com.ss.android.ugc.aweme.openshare.Share$Request r0 = r14.LLILLL
            if (r0 != 0) goto L3d
            r0 = r6
        L3d:
            java.lang.String r3 = r0.getCallerPackage()
        L41:
            X.11Xx r2 = X.C19518311Xx.LIZ     // Catch: java.lang.Exception -> Laf
            X.0mbq r0 = r14.LLILLJJLI     // Catch: java.lang.Exception -> Laf
            if (r0 != 0) goto L48
            r0 = r6
        L48:
            java.lang.String r8 = r0.mClientKey     // Catch: java.lang.Exception -> Laf
            java.lang.String r1 = ""
            if (r8 != 0) goto L4f
            r8 = r1
        L4f:
            java.lang.String r9 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> Laf
            android.content.pm.PackageManager r0 = r14.getPackageManager()     // Catch: java.lang.Exception -> Laf
            java.lang.String r10 = X.C0WI6.LIZ(r0, r3)     // Catch: java.lang.Exception -> Laf
            X.0mbq r0 = r14.LLILLJJLI     // Catch: java.lang.Exception -> Laf
            if (r0 != 0) goto L60
            r0 = r6
        L60:
            java.lang.String r11 = r0.getSdkNameForServer()     // Catch: java.lang.Exception -> Laf
            if (r11 != 0) goto L67
            r11 = r1
        L67:
            r13.LLILLL = r5     // Catch: java.lang.Exception -> Laf
            r2.getClass()     // Catch: java.lang.Exception -> Laf
            X.1Au3 r7 = X.C19518311Xx.LIZIZ     // Catch: java.lang.Exception -> Laf
            r12 = 1
            java.lang.Object r3 = r7.LIZ(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> Laf
            if (r3 != r4) goto L79
            return r4
        L76:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> Laf
        L79:
            com.ss.android.ugc.aweme.share.ClientScopeResponse r3 = (com.ss.android.ugc.aweme.share.ClientScopeResponse) r3     // Catch: java.lang.Exception -> Laf
            if (r3 == 0) goto L80
            java.lang.String r1 = r3.message
            goto L81
        L80:
            r1 = r6
        L81:
            java.lang.String r0 = "success"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto Lae
            if (r3 == 0) goto Lae
            com.ss.android.ugc.aweme.share.ScopeData r0 = r3.data
            if (r0 == 0) goto Lae
            java.util.List<com.ss.android.ugc.aweme.share.Scope> r0 = r0.scopes
            if (r0 == 0) goto Lae
            java.util.Iterator r2 = r0.iterator()
        L97:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lae
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.share.Scope r0 = (com.ss.android.ugc.aweme.share.Scope) r0
            java.lang.String r1 = r0.name
            java.lang.String r0 = "aweme.share"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L97
            return r3
        Lae:
            return r6
        Laf:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.SystemShareActivity.LLLLZLL(X.05Vn):java.lang.Object");
    }

    public final void LLLLZLLLI(String str) {
        String string;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (C0XQ7.LJFF() != null) {
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                LLZZZIL(0, curUserId, str);
                return;
            }
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            Bundle bundle = new Bundle();
            bundle.putBoolean("need_skip_restart", true);
            C786410Ut5.LJJJI("sdk_name", C2198601B3a.LIZ(LLLLLZL(getIntent())), bundle);
            Bundle bundleLLLLLZL = LLLLLZL(getIntent());
            if (bundleLLLLLZL == null || (string = bundleLLLLLZL.getString("_aweme_params_caller_open_sdk_version")) == null) {
                string = "";
            }
            C786410Ut5.LJJJI("sdk_version", string, bundle);
            C786410Ut5.LJLIIL(1500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS81S0200000_12(bundle, this, 4));
            return;
        }
        LLZZZIL(-1, curUserId, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZLZ(X.C1B4Q r19) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.SystemShareActivity.LLLZLZ(X.1B4Q):void");
    }

    public final void LLZZ(String str) {
        C2198841B3y c2198841B3y = C2198841B3y.LIZ;
        String str2 = this.LLJI;
        C1402840mbq c1402840mbq = this.LLILLJJLI;
        C1402840mbq c1402840mbq2 = null;
        if (c1402840mbq == null) {
            c1402840mbq = null;
        }
        String sdkNameForServer = c1402840mbq.getSdkNameForServer();
        C1402840mbq c1402840mbq3 = this.LLILLJJLI;
        if (c1402840mbq3 != null) {
            c1402840mbq2 = c1402840mbq3;
        }
        String str3 = c1402840mbq2.mSdkVersion;
        c2198841B3y.getClass();
        C2198841B3y.LJFF(str, str2, sdkNameForServer, str3, "");
    }

    public final void LLZZLLIL(String str) {
        C1402840mbq c1402840mbq;
        C1402840mbq c1402840mbq2;
        C2198841B3y c2198841B3y = C2198841B3y.LIZ;
        C1402840mbq c1402840mbq3 = this.LLILLJJLI;
        if (c1402840mbq3 == null) {
            c1402840mbq = null;
        } else {
            c1402840mbq = c1402840mbq3;
        }
        String str2 = c1402840mbq.mClientKey;
        if (c1402840mbq3 == null) {
            c1402840mbq2 = null;
        } else {
            c1402840mbq2 = c1402840mbq3;
        }
        String str3 = c1402840mbq2.mSdkVersion;
        if (c1402840mbq3 == null) {
            c1402840mbq3 = null;
        }
        String sdkNameForServer = c1402840mbq3.getSdkNameForServer();
        c2198841B3y.getClass();
        C2198841B3y.LJFF("share_init", str2, sdkNameForServer, str3, str);
    }

    public final void a(String str) {
        Object obj;
        if (str == null) {
            return;
        }
        try {
            String string = UUID.randomUUID().toString();
            SmartRouter.buildRoute(this, UriProtector.parse(str).buildUpon().appendQueryParameter("m_unique_id", string).appendQueryParameter("m_need_share_finish_notification", "1").build().toString()).open();
            C189200o6.m2constructorimpl(string);
            obj = string;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        C189200o6.m5exceptionOrNullimpl(obj);
        C189200o6.m7isFailureimpl(obj);
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String str;
        boolean zLJI = MethodIDManager.LJI(72032);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onCreate", true);
        super.onCreate(bundle);
        initializeViewTreeOwners();
        C1B46 c1b46 = C1B46.LIZ;
        Intent intent = getIntent();
        c1b46.getClass();
        C1402840mbq c1402840mbqLIZ = C1B46.LIZ(intent);
        if (c1402840mbqLIZ != null) {
            this.LLILLJJLI = c1402840mbqLIZ;
        }
        try {
            stringExtra = getIntent().getStringExtra("_aweme_open_sdk_params_client_key");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            str = "sdk";
        } else if (!LLZLLLL()) {
            str = "system_share";
        } else {
            str = "tiktok_app_icon";
        }
        if (!C1B46.LJII(this) && !C1B46.LJI(this)) {
            getIntent().putExtra("enter_dm", "system_share");
            if (LLZLLLL()) {
                C1850540yFw.LIZ.getClass();
                C20684815ws.onEventV3("tiktok_app_icon_click");
            }
            init();
        }
        LLZZLLIL(str);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onCreate", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @C14EU
    public final void onReceiveIMContactShareStatusEvent(C1531205z4 c1531205z4) {
        C1B45 c1b45;
        String str;
        C1402840mbq c1402840mbq;
        C1402840mbq c1402840mbq2;
        int i = c1531205z4.LIZIZ;
        IShareRespSendService iShareRespSendService = (IShareRespSendService) ServiceManager.get().getService(IShareRespSendService.class);
        if (i == 2) {
            iShareRespSendService.LIZ(this);
            return;
        }
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    return;
                } else {
                    c1b45 = C1B45.LJFF;
                }
            } else {
                c1b45 = C1B45.LJIIIZ;
            }
        } else {
            c1b45 = C1B45.LJ;
        }
        C1402840mbq c1402840mbq3 = this.LLILLJJLI;
        C1402840mbq c1402840mbq4 = null;
        if (c1402840mbq3 == null) {
            c1402840mbq3 = null;
        }
        String str2 = c1402840mbq3.mClientKey;
        if (str2 != null && str2.length() != 0) {
            str = "sdk";
        } else {
            str = "system_share";
        }
        if (Intrinsics.LJFF(c1b45, C1B45.LJ)) {
            C1402840mbq c1402840mbq5 = this.LLILLJJLI;
            if (c1402840mbq5 == null) {
                c1402840mbq2 = null;
            } else {
                c1402840mbq2 = c1402840mbq5;
            }
            String str3 = c1402840mbq2.mClientKey;
            if (c1402840mbq5 == null) {
                c1402840mbq5 = null;
            }
            String sdkNameForServer = c1402840mbq5.getSdkNameForServer();
            C1402840mbq c1402840mbq6 = this.LLILLJJLI;
            if (c1402840mbq6 == null) {
                c1402840mbq6 = null;
            }
            C2198841B3y.LJI(str3, str, sdkNameForServer, c1402840mbq6.mSdkVersion, c1b45);
            IShareRespSendService iShareRespSendService2 = (IShareRespSendService) ServiceManager.get().getService(IShareRespSendService.class);
            C1402840mbq c1402840mbq7 = this.LLILLJJLI;
            if (c1402840mbq7 != null) {
                c1402840mbq4 = c1402840mbq7;
            }
            iShareRespSendService2.LIZIZ(this, c1402840mbq4, C1B4F.LJIILL);
            return;
        }
        C1402840mbq c1402840mbq8 = this.LLILLJJLI;
        if (c1402840mbq8 == null) {
            c1402840mbq = null;
        } else {
            c1402840mbq = c1402840mbq8;
        }
        String str4 = c1402840mbq.mClientKey;
        if (c1402840mbq8 == null) {
            c1402840mbq8 = null;
        }
        String sdkNameForServer2 = c1402840mbq8.getSdkNameForServer();
        C1402840mbq c1402840mbq9 = this.LLILLJJLI;
        if (c1402840mbq9 != null) {
            c1402840mbq4 = c1402840mbq9;
        }
        C2198841B3y.LJI(str4, str, sdkNameForServer2, c1402840mbq4.mSdkVersion, c1b45);
        iShareRespSendService.LIZLLL(this, c1b45);
    }

    public final void LLLZIL(ArrayList<String> arrayList, C09O8 c09o8) {
        boolean z;
        C1402840mbq c1402840mbq = null;
        if (!C086I.LIZIZ(arrayList)) {
            int i = 1;
            if (arrayList != null && arrayList.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Uri uri = UriProtector.parse((String) ListProtector.get(arrayList, 0));
                if (u.LJIJI("content", uri.getScheme(), true)) {
                    C23250099c.LIZLLL(this.LLJIJIL, null, null, new C09O5(this, uri, c09o8, null), 3);
                } else {
                    C1B4P c1b4p = this.LL;
                    if (c09o8 != C09O8.IMAGE) {
                        i = 2;
                    }
                    c1b4p.LIZ = i;
                    c1b4p.LIZIZ = arrayList;
                    LLLZ();
                }
            } else {
                C23250099c.LIZLLL(this.LLJIJIL, null, null, new C09O4(arrayList, this, c09o8, null), 3);
            }
            C2189108ht.LIZ("system_share");
            return;
        }
        IShareRespSendService iShareRespSendService = (IShareRespSendService) ServiceManager.get().getService(IShareRespSendService.class);
        C1402840mbq c1402840mbq2 = this.LLILLJJLI;
        if (c1402840mbq2 != null) {
            c1402840mbq = c1402840mbq2;
        }
        iShareRespSendService.LIZIZ(this, c1402840mbq, C1B4F.LJIIIIZZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLZZIL(X.C1402840mbq r13, X.InterfaceC1364105Vn<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.SystemShareActivity.LLLZZIL(X.0mbq, X.05Vn):java.lang.Object");
    }

    public static void f(Context context, String str, boolean z) {
        if (context == null) {
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0DVR(context, str, null, z), 3);
    }

    @Override // X.InterfaceC20688515xT
    public final void LLILIL(final IMContact iMContact, List<? extends MediaModel> list, String str) {
        C20684815ws.LJIILLIIL("chat_suggestion_click", new C2344009Gk().LIZ);
        Iterator<? extends MediaModel> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            MediaModel next = it2.next();
            MediaModel mediaModel = next;
            if (mediaModel.LJIILJJIL() && mediaModel.duration > 60000) {
                if (next != null) {
                    C1397580mTM c1397580mTM = new C1397580mTM(this);
                    c1397580mTM.LJI(getString(2131824832));
                    c1397580mTM.LIZIZ(getString(2131824830));
                    c1397580mTM.LJII = false;
                    C985403tE.LIZ(c1397580mTM, new AwS611S0100000_32(this, 83));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    return;
                }
            }
        }
        List<String> listLIZIZ = ((IIMContactManager) ServiceManager.get().getService(IIMContactManager.class)).LIZIZ(Collections.singletonList(iMContact));
        WeakReference weakReference = new WeakReference(new C0YTK() { // from class: X.18h7
            public volatile boolean LIZ;

            @Override // X.C0YTK
            public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list2, Map<C869590Y9l, C0YMW> map) {
            }

            @Override // X.C0YTK
            public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
            }

            @Override // X.C0YTY
            public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list2) {
                if (!this.LIZ) {
                    this.LIZIZ.finish();
                }
            }

            @Override // X.C0YTK
            public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                if (!this.LIZ) {
                    this.LIZ = true;
                    IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                    EnterChatParams enterChatParams = new EnterChatParams(this.LIZIZ, iMContact);
                    enterChatParams.setReturnPage("inbox");
                    imChatService.LJIILLIIL(enterChatParams, null);
                    this.LIZIZ.finish();
                }
            }

            @Override // X.C0YTY
            public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                if (!this.LIZ) {
                    this.LIZ = true;
                    IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                    EnterChatParams enterChatParams = new EnterChatParams(this.LIZIZ, iMContact);
                    enterChatParams.setReturnPage("inbox");
                    imChatService.LJIILLIIL(enterChatParams, null);
                    this.LIZIZ.finish();
                }
            }

            @Override // X.C0YTK
            public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
                SystemShareActivity systemShareActivity = this.LIZIZ;
                C1397580mTM c1397580mTM2 = new C1397580mTM(systemShareActivity);
                c1397580mTM2.LJI(systemShareActivity.getString(2131824832));
                c1397580mTM2.LJII = false;
                C985403tE.LIZ(c1397580mTM2, new AwS611S0100000_32(this.LIZIZ, 84));
                new C1397510mTF(c1397580mTM2).LIZLLL();
            }
        });
        IIMMessageOpenService iIMMessageOpenService = (IIMMessageOpenService) PluggableExtentionKt.pluggableSpi$default(IIMMessageOpenService.class, false, false, false, 14, null);
        if (iIMMessageOpenService != null) {
            iIMMessageOpenService.LIZJ(listLIZIZ, list, str, (C0YTK) weakReference.get());
        }
    }

    public final void LLZZZIL(int i, String str, String str2) {
        C1402840mbq c1402840mbq;
        Object c098200Yq;
        String string;
        C1402840mbq c1402840mbq2;
        C1402840mbq c1402840mbq3;
        C1402840mbq c1402840mbq4;
        C1402840mbq c1402840mbq5 = null;
        if (i != 0) {
            IShareRespSendService iShareRespSendService = (IShareRespSendService) ServiceManager.get().getService(IShareRespSendService.class);
            C1B45 c1b45 = C1B45.LJIIIIZZ;
            iShareRespSendService.LIZLLL(this, c1b45);
            C2198841B3y c2198841B3y = C2198841B3y.LIZ;
            C1402840mbq c1402840mbq6 = this.LLILLJJLI;
            if (c1402840mbq6 == null) {
                c1402840mbq4 = null;
            } else {
                c1402840mbq4 = c1402840mbq6;
            }
            String str3 = c1402840mbq4.mClientKey;
            if (c1402840mbq6 == null) {
                c1402840mbq6 = null;
            }
            String sdkNameForServer = c1402840mbq6.getSdkNameForServer();
            C1402840mbq c1402840mbq7 = this.LLILLJJLI;
            if (c1402840mbq7 != null) {
                c1402840mbq5 = c1402840mbq7;
            }
            String str4 = c1402840mbq5.mSdkVersion;
            c2198841B3y.getClass();
            C2198841B3y.LJ(str3, sdkNameForServer, str4, c1b45);
            return;
        }
        if (C1B46.LJII(this) && !Intrinsics.LJFF(str, str2) && str.length() > 0 && str2.length() > 0) {
            IShareRespSendService iShareRespSendService2 = (IShareRespSendService) ServiceManager.get().getService(IShareRespSendService.class);
            C1B45 c1b452 = C1B45.LJI;
            iShareRespSendService2.LIZLLL(this, c1b452);
            C2198841B3y c2198841B3y2 = C2198841B3y.LIZ;
            C1402840mbq c1402840mbq8 = this.LLILLJJLI;
            if (c1402840mbq8 == null) {
                c1402840mbq3 = null;
            } else {
                c1402840mbq3 = c1402840mbq8;
            }
            String str5 = c1402840mbq3.mClientKey;
            if (c1402840mbq8 == null) {
                c1402840mbq8 = null;
            }
            String sdkNameForServer2 = c1402840mbq8.getSdkNameForServer();
            C1402840mbq c1402840mbq9 = this.LLILLJJLI;
            if (c1402840mbq9 != null) {
                c1402840mbq5 = c1402840mbq9;
            }
            String str6 = c1402840mbq5.mSdkVersion;
            c2198841B3y2.getClass();
            C2198841B3y.LJ(str5, sdkNameForServer2, str6, c1b452);
            return;
        }
        if (!LLZLI()) {
            String str7 = "";
            C622680Oba.LIZJ(this);
            if (!C1B46.LJI(this)) {
                C23250099c.LIZLLL(this.LLJIJIL, null, null, new C09O9(this, null), 3);
                DmShare.TikTokShareDirectMessageSettings tikTokShareDirectMessageSettings = this.LLILZLL;
                if (tikTokShareDirectMessageSettings == null) {
                    tikTokShareDirectMessageSettings = null;
                }
                if (!u.LJJIIJZLJL(UriProtector.parse(tikTokShareDirectMessageSettings.dmSchema).toString(), "aweme://im/share_message", false)) {
                    IShareRespSendService iShareRespSendService3 = (IShareRespSendService) ServiceManager.get().getService(IShareRespSendService.class);
                    C1B45 c1b453 = C1B45.LJIIJ;
                    iShareRespSendService3.LIZLLL(this, c1b453);
                    C2198841B3y c2198841B3y3 = C2198841B3y.LIZ;
                    C1402840mbq c1402840mbq10 = this.LLILLJJLI;
                    if (c1402840mbq10 == null) {
                        c1402840mbq2 = null;
                    } else {
                        c1402840mbq2 = c1402840mbq10;
                    }
                    String str8 = c1402840mbq2.mClientKey;
                    if (c1402840mbq10 == null) {
                        c1402840mbq10 = null;
                    }
                    String sdkNameForServer3 = c1402840mbq10.getSdkNameForServer();
                    C1402840mbq c1402840mbq11 = this.LLILLJJLI;
                    if (c1402840mbq11 == null) {
                        c1402840mbq11 = null;
                    }
                    String str9 = c1402840mbq11.mSdkVersion;
                    c2198841B3y3.getClass();
                    C2198841B3y.LJ(str8, sdkNameForServer3, str9, c1b453);
                }
                try {
                    if (this.LLILLJJLI == null) {
                        C1B46.LIZ.getClass();
                        C1B46.LIZIZ();
                        return;
                    }
                    try {
                        try {
                            Gson gsonLIZ = C09C2.LIZ();
                            Bundle bundleLLLLLZL = LLLLLZL(getIntent());
                            if (bundleLLLLLZL != null) {
                                string = bundleLLLLLZL.getString("dm_share_settings");
                            } else {
                                string = null;
                            }
                            DmShare.TikTokShareDirectMessageSettings tikTokShareDirectMessageSettings2 = (DmShare.TikTokShareDirectMessageSettings) gsonLIZ.LJII(string, DmShare.TikTokShareDirectMessageSettings.class);
                            if (tikTokShareDirectMessageSettings2 != null) {
                                c098200Yq = tikTokShareDirectMessageSettings2.dmSchema;
                            } else {
                                c098200Yq = null;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            c098200Yq = "";
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    String str10 = (String) c098200Yq;
                    if (str10 != null) {
                        str7 = str10;
                    }
                    a(str7);
                    return;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    IShareRespSendService iShareRespSendService4 = (IShareRespSendService) ServiceManager.get().getService(IShareRespSendService.class);
                    C1B45 c1b454 = C1B45.LJIIIIZZ;
                    iShareRespSendService4.LIZLLL(this, c1b454);
                    C2198841B3y c2198841B3y4 = C2198841B3y.LIZ;
                    C1402840mbq c1402840mbq12 = this.LLILLJJLI;
                    if (c1402840mbq12 == null) {
                        c1402840mbq = null;
                    } else {
                        c1402840mbq = c1402840mbq12;
                    }
                    String str11 = c1402840mbq.mClientKey;
                    if (c1402840mbq12 == null) {
                        c1402840mbq12 = null;
                    }
                    String sdkNameForServer4 = c1402840mbq12.getSdkNameForServer();
                    C1402840mbq c1402840mbq13 = this.LLILLJJLI;
                    if (c1402840mbq13 != null) {
                        c1402840mbq5 = c1402840mbq13;
                    }
                    String str12 = c1402840mbq5.mSdkVersion;
                    c2198841B3y4.getClass();
                    C2198841B3y.LJ(str11, sdkNameForServer4, str12, c1b454);
                    return;
                }
            }
            C23250099c.LIZLLL(this.LLJIJIL, null, null, new C1B47(this, null), 3);
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "aweme://main");
        smartRouteBuildRoute.addFlags(268468224);
        smartRouteBuildRoute.withCallback(new OpenResultCallback() { // from class: X.18QN
            @Override // com.bytedance.router.OpenResultCallback
            public final void onActionResult(Object obj) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onEmpty() {
                C1951107kb.LIZ(this);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onFail(String str13, String str14) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onIntercept(String str13) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMatched(String str13) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMissed(String str13) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onOpen(Intent intent) {
                C1951107kb.LIZIZ(this, intent);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJIIIZ(2131857164);
                c1389890mGx.LJIIJJI();
            }
        });
        smartRouteBuildRoute.open();
    }

    public final void b(int i, C1B4F c1b4f, Integer num) {
        LLLZLZ(new C1B4Q(i, c1b4f, num, false));
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC1294060jmO
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2001 && i2 != -1) {
            String curUserId = C0XQ7.LJFF().getCurUserId();
            DmShare.TikTokShareDirectMessageSettings tikTokShareDirectMessageSettings = this.LLILZLL;
            if (tikTokShareDirectMessageSettings == null) {
                tikTokShareDirectMessageSettings = null;
            }
            LLZZZIL(-1, curUserId, String.valueOf(tikTokShareDirectMessageSettings.fromUser));
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        DmShare.TikTokShareDirectMessageSettings tikTokShareDirectMessageSettings;
        if (user == null) {
            return;
        }
        if (!C1B46.LJI(this) && this.LLILZLL == null) {
            ((IShareRespSendService) ServiceManager.get().getService(IShareRespSendService.class)).LIZLLL(this, C1B45.LJIIJ);
            C1B46.LIZ.getClass();
            C1B46.LIZIZ();
            return;
        }
        if (C1B46.LJI(this) && this.LLIZ == null) {
            if (LLZLI()) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "aweme://main");
                smartRouteBuildRoute.addFlags(268468224);
                smartRouteBuildRoute.open();
            } else {
                f(this, "Unknown error", false);
            }
        }
        if (!C1B46.LJI(this) && (tikTokShareDirectMessageSettings = this.LLILZLL) != null) {
            LLLLZLLLI(String.valueOf(tikTokShareDirectMessageSettings.fromUser));
        } else {
            if (!C1B46.LJI(this)) {
                return;
            }
            LLLLZLLLI("");
        }
    }
}
