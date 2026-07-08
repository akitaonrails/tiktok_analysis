package com.ss.android.ugc.aweme.feedback.screenshot;

import X.AbstractC19875512pd;
import X.AbstractC2361009My;
import X.AnonymousClass0957;
import X.C098200Yq;
import X.C099R;
import X.C09A1;
import X.C0CLW;
import X.C0PEM;
import X.C0V07;
import X.C0V09;
import X.C0XI4;
import X.C1138320fjC;
import X.C123100dR;
import X.C1366580lfM;
import X.C1410470mo9;
import X.C1446220njo;
import X.C1668880tWw;
import X.C1669660tYC;
import X.C1684090tvT;
import X.C1685270txN;
import X.C1720106oR;
import X.C189200o6;
import X.C19EG;
import X.C1DFH;
import X.C20684815ws;
import X.C2093608Ic;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2222691Bz1;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C2344009Gk;
import X.C2487409ou;
import X.C343710Ddh;
import X.C785410UrT;
import X.C786410Ut5;
import X.C813440Vva;
import X.C817570W5j;
import X.C844470XAv;
import X.DialogC1389620mGW;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import Y.ARunnableS11S1400000_25;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.push.api.IMPushApi;
import com.ss.android.ugc.aweme.offline.screenshot.feedback.IScreenshotFeedbackService;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.service.IDogfoodFeedbackService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS143S1200000_28;
import kotlin.jvm.internal.AwS177S1100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class ScreenShotFeedbackService extends AbstractC2361009My implements IScreenShotFeedbackService {
    public static final int $stable = 8;
    public boolean avoidInAppPush;
    public List<String> blackPageList;
    public volatile AnonymousClass0957<? extends List<Object>> dogfoodOncallOptions;
    public boolean feedbackUsable;
    public final C1685270txN floatViewProvider;
    public DialogC1389620mGW loadingDialog;
    public final boolean needDispatchIfHandledAlready;
    public final InterfaceC497601wk scope = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), new C1138320fjC("ScreenShotFeedbackService")).plus(C0PEM.LIZ));

    private final boolean isSnapSlayABEnabled() {
        boolean zLJFF = false;
        try {
            Object objInvoke = Class.forName("com.ss.android.ugc.aweme.bugreport.config.SnapSlayABConfig").getMethod("isEnabled", new Class[0]).invoke(null, new Object[0]);
            zLJFF = Intrinsics.LJFF(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
            return zLJFF;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zLJFF;
        }
    }

    private final boolean isSnapSlayFloatingViewEnabled() {
        boolean zLJFF = false;
        try {
            Object objInvoke = Class.forName("com.ss.android.ugc.aweme.bugreport.config.SnapSlayFloatingViewConfig").getMethod("isEnabled", new Class[0]).invoke(null, new Object[0]);
            zLJFF = Intrinsics.LJFF(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
            return zLJFF;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zLJFF;
        }
    }

    private final boolean checkPageBlocked() {
        List<String> list;
        List<Fragment> listLJJLIIIJL;
        if (this.avoidInAppPush && isDMPushShowing()) {
            return true;
        }
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        C19EG c19eg = validTopActivity instanceof C19EG ? (C19EG) validTopActivity : null;
        if (c19eg != null && (list = this.blackPageList) != null && !list.isEmpty() && list != null) {
            if (containsNotNull(list, c19eg.getClass().getSimpleName())) {
                return true;
            }
            Fragment fragmentBQ2 = C343710Ddh.LIZ(c19eg).BQ2();
            if (fragmentBQ2 != null && containsNotNull(list, fragmentBQ2.getClass().getSimpleName())) {
                return true;
            }
            Fragment fragmentLIZ = C813440Vva.LIZ(c19eg);
            if (fragmentLIZ != null && containsNotNull(list, fragmentLIZ.getClass().getSimpleName())) {
                return true;
            }
            FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
            if (supportFragmentManager != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null) {
                Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
                while (it2.hasNext()) {
                    if (containsNotNull(list, it2.next().getClass().getSimpleName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean isDMPushShowing() {
        IMPushApi.LIZ.getClass();
        return C817570W5j.LIZ().LIZLLL().LJIIIZ();
    }

    public final void safelyDismissDialogIfNeed() {
        Object c098200Yq;
        DialogC1389620mGW dialogC1389620mGW;
        try {
            DialogC1389620mGW dialogC1389620mGW2 = this.loadingDialog;
            if (dialogC1389620mGW2 != null && dialogC1389620mGW2.isShowing() && (dialogC1389620mGW = this.loadingDialog) != null) {
                dialogC1389620mGW.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService
    public void sendShareFeedbackEvent() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(System.currentTimeMillis(), "click_time");
        c2344009Gk.LJIIIIZZ("country", C2222691Bz1.LIZIZ());
        C20684815ws.LJIILLIIL("click_beta_feedback_after_screenshot", c2344009Gk.LIZ);
    }

    public ScreenShotFeedbackService() {
        C844470XAv.LIZ.getClass();
        this.needDispatchIfHandledAlready = C2093608Ic.LIZJ(C844470XAv.LJIILL, "local_test") || isSnapSlayFloatingViewEnabled();
        this.floatViewProvider = new C1685270txN();
    }

    @Override // X.AbstractC2361009My
    public boolean getNeedDispatchIfHandledAlready() {
        return this.needDispatchIfHandledAlready;
    }

    private final void safelyShowDialog(Context context) {
        Object c098200Yq;
        try {
            safelyDismissDialogIfNeed();
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
            dialogC1389620mGW.LJJLJ(2131857960);
            this.loadingDialog = dialogC1389620mGW;
            C786410Ut5.J4(dialogC1389620mGW);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService
    public boolean isFeedbackEnable(boolean z) {
        if (this.feedbackUsable) {
            if (!z || !checkPageBlocked()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC2361009My
    public boolean onShot(String str) {
        C19EG c19eg;
        super.onShot(str);
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity instanceof C19EG) {
            c19eg = (C19EG) validTopActivity;
        } else {
            c19eg = null;
        }
        if (c19eg == null || C1366580lfM.LIZJ()) {
            return false;
        }
        return tryShowScreenShotFloatingView(c19eg, str, null, null, false);
    }

    private final <E> boolean containsNotNull(List<? extends E> list, E e) {
        if (e == null) {
            return false;
        }
        return list.contains(e);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object dogfoodUploadFlow(java.lang.String r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            r15 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C1410490moB
            if (r0 == 0) goto Lb9
            r5 = r3
            X.0moB r5 = (X.C1410490moB) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb9
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L14:
            java.lang.Object r9 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILZIL
            r3 = 4
            r7 = 3
            r8 = 2
            r0 = 1
            r14 = 0
            if (r1 == 0) goto L36
            if (r1 == r0) goto L53
            if (r1 == r8) goto L7c
            if (r1 == r7) goto L9a
            if (r1 != r3) goto Lc0
            java.lang.Object r6 = r5.LL
            X.C155000ia.LIZIZ(r9)
        L30:
            X.C189200o6.m1boximpl(r6)
        L33:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L36:
            X.C155000ia.LIZIZ(r9)
            java.lang.Class<com.ss.android.ugc.aweme.service.IDogfoodUploadService> r9 = com.ss.android.ugc.aweme.service.IDogfoodUploadService.class
            r10 = 0
            r13 = 14
            r11 = r10
            r12 = r10
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r9, r10, r11, r12, r13, r14)
            com.ss.android.ugc.aweme.service.IDogfoodUploadService r2 = (com.ss.android.ugc.aweme.service.IDogfoodUploadService) r2
            if (r2 == 0) goto L33
            r5.LL = r2
            r5.LLILZIL = r0
            java.lang.Object r6 = r2.LIZ()
            if (r6 != r4) goto L60
            return r4
        L53:
            java.lang.Object r2 = r5.LL
            com.ss.android.ugc.aweme.service.IDogfoodUploadService r2 = (com.ss.android.ugc.aweme.service.IDogfoodUploadService) r2
            X.C155000ia.LIZIZ(r9)
            X.00o6 r9 = (X.C189200o6) r9
            java.lang.Object r6 = r9.m10unboximpl()
        L60:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r6)
            if (r0 == 0) goto L9f
            r1 = r6
            com.ss.android.ugc.aweme.service.UploadResponse r1 = (com.ss.android.ugc.aweme.service.UploadResponse) r1
            java.lang.String r0 = r1.uploadToken
            if (r0 == 0) goto L7a
            r5.LL = r6
            r5.LLILLJJLI = r1
            r5.LLILZIL = r8
            java.lang.Object r9 = r2.getImageUrl()
            if (r9 != r4) goto L83
            return r4
        L7a:
            r9 = r14
            goto L85
        L7c:
            com.ss.android.ugc.aweme.service.UploadResponse r1 = r5.LLILLJJLI
            java.lang.Object r6 = r5.LL
            X.C155000ia.LIZIZ(r9)
        L83:
            com.ss.android.ugc.aweme.service.ImageUrl r9 = (com.ss.android.ugc.aweme.service.ImageUrl) r9
        L85:
            java.lang.String r1 = r1.uploadToken
            if (r9 == 0) goto L98
            java.lang.String r0 = r9.url
        L8b:
            r5.LL = r6
            r5.LLILLJJLI = r14
            r5.LLILZIL = r7
            java.lang.Object r0 = r15.launchFeedback(r1, r0, r5)
            if (r0 != r4) goto L9f
            return r4
        L98:
            r0 = r14
            goto L8b
        L9a:
            java.lang.Object r6 = r5.LL
            X.C155000ia.LIZIZ(r9)
        L9f:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r6)
            if (r2 == 0) goto L30
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0mo7 r0 = new X.0mo7
            r0.<init>(r2, r15, r14)
            r5.LL = r6
            r5.LLILZIL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r5, r1, r0)
            if (r0 != r4) goto L30
            return r4
        Lb9:
            X.0moB r5 = new X.0moB
            r5.<init>(r15, r3)
            goto L14
        Lc0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService.dogfoodUploadFlow(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService
    public void startUploadScreenShotFeedback(Context context, String str) {
        safelyShowDialog(context);
        IDogfoodFeedbackService iDogfoodFeedbackService = (IDogfoodFeedbackService) PluggableExtentionKt.pluggableSpi$default(IDogfoodFeedbackService.class, false, false, false, 14, null);
        if (iDogfoodFeedbackService != null) {
            iDogfoodFeedbackService.LIZLLL();
            iDogfoodFeedbackService.LJ();
        }
    }

    public void init(Context context, List<String> list, boolean z) {
        Integer numValueOf;
        ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LJFF(this);
        this.blackPageList = list;
        this.avoidInAppPush = z;
        this.feedbackUsable = true;
        if (isSnapSlayABEnabled()) {
            try {
                Object objNewInstance = Class.forName("com.ss.android.ugc.aweme.bugreport.config.BugReportServiceImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                objNewInstance.getClass().getMethod("onInit", Context.class).invoke(objNewInstance, context);
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        IScreenshotFeedbackService iScreenshotFeedbackService = (IScreenshotFeedbackService) ServiceManager.get().getService(IScreenshotFeedbackService.class);
        if (iScreenshotFeedbackService != null) {
            iScreenshotFeedbackService.LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init， avoidInAppPush=");
        sbLIZ.append(z);
        sbLIZ.append("， blackPageList.size=");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C1720106oR.LJI("DogfoodFeedback", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Object launchFeedback(String str, String str2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C1446220njo(str, str2, this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public void openFeedbackPage(Context context, JSONObject jSONObject, Aweme aweme) {
        Object c098200Yq;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        IDogfoodFeedbackService iDogfoodFeedbackService = (IDogfoodFeedbackService) PluggableExtentionKt.pluggableSpi$default(IDogfoodFeedbackService.class, false, false, false, 14, null);
        if (iDogfoodFeedbackService != null) {
            iDogfoodFeedbackService.LIZIZ();
            iDogfoodFeedbackService.LIZLLL();
            iDogfoodFeedbackService.LJ();
        }
        try {
            c098200Yq = C0CLW.LIZIZ.LIZ.getFeedbackConf().getFeHelp();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        if (!C123100dR.LIZ(str) || str == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url")) == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "https://feedback.tiktokv.com/falcon/fe_tiktok_common/faq/feedback/?feedback_id=-1&is_from_home=2&entrance=&topic_id=-1&hide_nav_bar=1&container_color_auto_dark=1/";
        }
        C0XI4 c0xi4 = new C0XI4(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        c0xi4.LJ("entrance", "screen_shot_submit");
        if (jSONObject != null) {
            c0xi4.LJ("uploaded_image", C786410Ut5.J3(jSONObject));
        }
        C23250099c.LIZLLL(this.scope, null, null, new C1410470mo9(false, this, context, c0xi4, iDogfoodFeedbackService, aweme, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[PHI: r7 r9
      0x0041: PHI (r7v1 android.content.Context) = 
      (r7v0 android.content.Context)
      (r7v4 android.content.Context)
      (r7v4 android.content.Context)
      (r7v4 android.content.Context)
     binds: [B:35:0x0093, B:12:0x002b, B:14:0x0031, B:19:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r9v1 com.ss.android.ugc.aweme.service.IDogfoodFeedbackService) = 
      (r9v0 com.ss.android.ugc.aweme.service.IDogfoodFeedbackService)
      (r9v2 com.ss.android.ugc.aweme.service.IDogfoodFeedbackService)
      (r9v2 com.ss.android.ugc.aweme.service.IDogfoodFeedbackService)
      (r9v2 com.ss.android.ugc.aweme.service.IDogfoodFeedbackService)
     binds: [B:35:0x0093, B:12:0x002b, B:14:0x0031, B:19:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049 A[PHI: r7
      0x0049: PHI (r7v3 android.content.Context) = (r7v1 android.content.Context), (r7v1 android.content.Context), (r7v4 android.content.Context) binds: [B:20:0x0041, B:22:0x0047, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object addDogfoodFlowParameters(android.content.Context r7, X.C0XI4 r8, com.ss.android.ugc.aweme.service.IDogfoodFeedbackService r9, com.ss.android.ugc.aweme.feed.model.Aweme r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof X.C1410480moA
            if (r0 == 0) goto La2
            r5 = r11
            X.0moA r5 = (X.C1410480moA) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La2
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r3 = r5.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r1 = 0
            r4 = 1
            if (r0 == 0) goto L80
            if (r0 != r4) goto La9
            com.ss.android.ugc.aweme.service.IDogfoodFeedbackService r9 = r5.LLILLJJLI
            java.lang.Object r7 = r5.LL
            android.content.Context r7 = (android.content.Context) r7
            X.C155000ia.LIZIZ(r3)
        L29:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            if (r3 == 0) goto L41
            java.util.List r2 = X.C13LP.LLIIII(r3)
            if (r2 == 0) goto L41
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L4b
            if (r9 == 0) goto L49
            X.13BV r2 = r9.LIZJ()
            if (r2 != 0) goto L4b
        L41:
            if (r9 == 0) goto L49
            X.13BV r2 = r9.LIZJ()
            if (r2 != 0) goto L4b
        L49:
            X.13BV r2 = X.C13BV.INSTANCE
        L4b:
            X.04rF r5 = X.C1227904rF.LIZ
            r0 = 2
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "oncall_options"
            r1.<init>(r0, r2)
            r0 = 0
            r3[r0] = r1
            java.lang.Integer r2 = X.C2286608xc.LJ(r4)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "oncall"
            r1.<init>(r0, r2)
            r3[r4] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r3)
            r5.getClass()
            java.lang.String r2 = X.C1227904rF.LJI(r0)
            if (r2 == 0) goto L7d
            X.0ymf r1 = X.C1323690kYB.LIZ(r7)
            java.lang.String r0 = "dogfood"
            r1.LJIIIIZZ(r2, r0)
        L7d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L80:
            X.C155000ia.LIZIZ(r3)
            if (r10 == 0) goto L91
            if (r9 == 0) goto L8c
            r9.LIZ()
            java.lang.String r1 = ""
        L8c:
            java.lang.String r0 = "dogfood_feedback_key"
            r8.LJ(r0, r1)
        L91:
            X.0957<? extends java.util.List<java.lang.Object>> r0 = r6.dogfoodOncallOptions
            if (r0 == 0) goto L41
            r5.LL = r7
            r5.LLILLJJLI = r9
            r5.LLILZIL = r4
            java.lang.Object r3 = r0.LJLIIIL(r5)
            if (r3 != r2) goto L29
            return r2
        La2:
            X.0moA r5 = new X.0moA
            r5.<init>(r6, r11)
            goto L12
        La9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService.addDogfoodFlowParameters(android.content.Context, X.0XI4, com.ss.android.ugc.aweme.service.IDogfoodFeedbackService, com.ss.android.ugc.aweme.feed.model.Aweme, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService
    public boolean tryShowScreenShotFloatingView(C19EG c19eg, String str, String str2, C1684090tvT<?> c1684090tvT, boolean z) {
        Object c0v07;
        C1668880tWw c1668880tWw;
        ArrayList arrayList = new ArrayList();
        if (c1684090tvT != null) {
            arrayList.add(c1684090tvT);
        }
        if (C1366580lfM.LIZIZ()) {
            c0v07 = new C0V07();
        } else {
            c0v07 = C0V09.LIZ;
        }
        Boolean bool = null;
        if (isFeedbackEnable(true) && !z) {
            String string = c19eg.getResources().getString(2131827350);
            if (c0v07 instanceof C0V07) {
                c1668880tWw = C1669660tYC.LLLLZ;
            } else {
                c1668880tWw = null;
            }
            arrayList.add(new C1684090tvT(c1668880tWw, 0, string, str, null, new AwS143S1200000_28(this, c19eg, str, 0), 16));
        }
        if (isSnapSlayABEnabled()) {
            try {
                Object objInvoke = Class.forName("com.ss.android.ugc.aweme.bugreport.config.BugReportToggle").getMethod("isEnabled", Context.class).invoke(null, c19eg);
                if (objInvoke instanceof Boolean) {
                    bool = (Boolean) objInvoke;
                }
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    arrayList.add(new C1684090tvT(null, 2, "Report Bug", str, null, new AwS177S1100000_28(c19eg, str, 3), 17));
                }
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (!arrayList.isEmpty()) {
            C1685270txN c1685270txN = this.floatViewProvider;
            AbstractC19875512pd abstractC19875512pdCopyOf = AbstractC19875512pd.copyOf((Collection) arrayList);
            c1685270txN.getClass();
            C2487409ou.LIZJ(new ARunnableS11S1400000_25(c19eg, c1685270txN, abstractC19875512pdCopyOf, c0v07, str, 0));
            return true;
        }
        return false;
    }
}
