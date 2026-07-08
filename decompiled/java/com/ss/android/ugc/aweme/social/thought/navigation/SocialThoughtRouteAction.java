package com.ss.android.ugc.aweme.social.thought.navigation;

import X.C0CY2;
import X.C0CY5;
import X.C0WZX;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1701330uNH;
import X.C19EG;
import X.C2204961BRm;
import X.C23250099c;
import X.C314570CUt;
import X.C317780Ccy;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.social.thought.ui.like.SocialThoughtInteractionVM;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SocialThoughtRouteAction implements IRouteAction {
    public static final int $stable = 0;
    public static final C317780Ccy Companion = new Object() { // from class: X.0Ccy
    };

    public final void showUnavailable(C19EG c19eg) {
        C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
        c1389890mGx.LJIIJ(c19eg.getString(2131850214));
        c1389890mGx.LJIIJJI();
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_social_thought_navigation_SocialThoughtRouteAction_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(C19EG c19eg, Intent intent) throws Throwable {
        C1701330uNH.LIZ(intent, c19eg);
        C2204961BRm.LLJJJJ(c19eg, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0HxsIa5vyM7VV/lti9TG0ns0JElAQq/Pi3wOQD0Xr/J9ePVs2J4ZG1ACIL6+", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_social_thought_navigation_SocialThoughtRouteAction_com_bytedance_router_monitor_page_PageLancet_startActivity(C19EG c19eg, Intent intent) throws Throwable {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_social_thought_navigation_SocialThoughtRouteAction_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(c19eg, intent);
    }

    private final void routeToInboxThen(C19EG c19eg, Function1<? super C19EG, Unit> function1) throws Throwable {
        Class<? extends Activity> mainActivityClass;
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (iMainService == null || (((mainActivityClass = iMainService.getMainActivityClass()) != null && Intrinsics.LJFF(c19eg.getClass(), mainActivityClass)) || iMainService == null)) {
            function1.invoke(c19eg);
            return;
        }
        Intent mainActivityIntent = iMainService.getMainActivityIntent(c19eg);
        if (mainActivityIntent != null) {
            mainActivityIntent.setFlags(67108864);
            mainActivityIntent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            INVOKEVIRTUAL_com_ss_android_ugc_aweme_social_thought_navigation_SocialThoughtRouteAction_com_bytedance_router_monitor_page_PageLancet_startActivity(c19eg, mainActivityIntent);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(ProcessLifecycleOwner.Companion.get()), null, null, new C314570CUt(this, c19eg, function1, null), 3);
            return;
        }
        function1.invoke(c19eg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #0 {all -> 0x008b, blocks: (B:32:0x007c, B:33:0x007f, B:36:0x0085, B:37:0x0087, B:25:0x0057, B:27:0x0067, B:29:0x006d), top: B:50:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:32:0x007c, B:33:0x007f, B:36:0x0085, B:37:0x0087, B:25:0x0057, B:27:0x0067, B:29:0x006d), top: B:50:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object validateOwnedTid(java.lang.String r14, X.InterfaceC1364105Vn<? super java.lang.Boolean> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C0CY3
            if (r0 == 0) goto L23
            r5 = r15
            X.0CY3 r5 = (X.C0CY3) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r3 = r5.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 1
            r2 = 0
            if (r0 == 0) goto L31
            if (r0 != r4) goto L29
            java.lang.Object r14 = r5.LL
            goto L7c
        L23:
            X.0CY3 r5 = new X.0CY3
            r5.<init>(r13, r15)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            java.lang.String r3 = r0.getUid()
            if (r3 == 0) goto L55
            int r0 = r3.length()
            if (r0 <= 0) goto L53
            r0 = 1
        L49:
            if (r0 == 0) goto L55
        L4b:
            if (r3 != 0) goto L57
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L53:
            r0 = 0
            goto L49
        L55:
            r3 = r2
            goto L4b
        L57:
            java.lang.Class<com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService> r7 = com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService.class
            r8 = 0
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L8b
            com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService r0 = (com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService) r0     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L82
            com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService r1 = r0.LJJIIZI()     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L82
            java.util.List r0 = java.util.Collections.singletonList(r3)     // Catch: java.lang.Throwable -> L8b
            r5.LL = r14     // Catch: java.lang.Throwable -> L8b
            r5.LLILZ = r4     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r3 = r1.LIZLLL(r0, r5)     // Catch: java.lang.Throwable -> L8b
            if (r3 != r6) goto L7f
            return r6
        L7c:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L8b
        L7f:
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L8b
            goto L83
        L82:
            r3 = r2
        L83:
            if (r3 != 0) goto L87
            X.13BV r3 = X.C13BV.INSTANCE     // Catch: java.lang.Throwable -> L8b
        L87:
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L8b
            goto L97
        L8b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L97:
            X.C189200o6.m5exceptionOrNullimpl(r3)
            X.13BV r1 = X.C13BV.INSTANCE
            boolean r0 = X.C189200o6.m7isFailureimpl(r3)
            if (r0 == 0) goto La3
            r3 = r1
        La3:
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = X.C13LP.LJJJLL(r3)
            com.ss.android.ugc.aweme.social.thought.api.model.ThoughtQueryResult r0 = (com.ss.android.ugc.aweme.social.thought.api.model.ThoughtQueryResult) r0
            if (r0 == 0) goto Lb3
            com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo r0 = r0.thoughtInfo
            if (r0 == 0) goto Lb3
            java.lang.String r2 = r0.thoughtId
        Lb3:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction.validateOwnedTid(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[PHI: r2
      0x0026: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:27:0x0047, B:14:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    @Override // com.bytedance.router.route.IRouteAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object open(android.content.Context r7, java.lang.String r8, android.os.Bundle r9) throws java.lang.Throwable {
        /*
            r6 = this;
            r5 = 0
            if (r9 == 0) goto L4a
            java.lang.String r0 = "scene"
            java.lang.String r4 = r9.getString(r0)
        L9:
            java.lang.String r3 = ""
            if (r4 != 0) goto Le
            r4 = r3
        Le:
            if (r9 == 0) goto L46
            java.lang.String r0 = "thought_id"
            java.lang.String r2 = r9.getString(r0)
            if (r2 == 0) goto L3e
            int r0 = r2.length()
            if (r0 <= 0) goto L3e
        L1e:
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = r9.getString(r0)
            if (r1 != 0) goto L27
        L26:
            r1 = r3
        L27:
            if (r9 == 0) goto L32
            java.lang.String r0 = "enter_method"
            java.lang.String r0 = r9.getString(r0)
            if (r0 == 0) goto L32
            r3 = r0
        L32:
            java.lang.String r0 = "like_list"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L3d
            r6.openLikeList(r7, r2, r1, r3)
        L3d:
            return r5
        L3e:
            java.lang.String r0 = "tid"
            java.lang.String r2 = r9.getString(r0)
            if (r2 != 0) goto L47
        L46:
            r2 = r3
        L47:
            if (r9 == 0) goto L26
            goto L1e
        L4a:
            r4 = r5
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction.open(android.content.Context, java.lang.String, android.os.Bundle):java.lang.Object");
    }

    private final void openLikeList(Context context, String str, String str2, String str3) throws Throwable {
        Activity topActivity;
        C19EG c19eg;
        if (context == null || (topActivity = C1388190mED.LIZ(context)) == null) {
            topActivity = ActivityStack.getTopActivity();
        }
        if ((topActivity instanceof C19EG) && (c19eg = (C19EG) topActivity) != null) {
            if (str.length() == 0) {
                showUnavailable(c19eg);
            } else {
                routeToInboxThen(c19eg, new C0CY5(this, str, str2, str3));
            }
        }
    }

    public final void startLikePanelFlow(C19EG c19eg, String str, String str2, String str3) {
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(c19eg);
        dialogC1389620mGW.LJJLIIJ(true);
        dialogC1389620mGW.setCancelable(true);
        C786410Ut5.J4(dialogC1389620mGW);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19eg), null, null, new C0CY2(str, dialogC1389620mGW, this, c19eg, (SocialThoughtInteractionVM) new ViewModelProvider(c19eg).get(SocialThoughtInteractionVM.class), str2, str3, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForNewTopActivity(X.C19EG r8, long r9, long r11, X.InterfaceC1364105Vn<? super X.C19EG> r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof X.C0CY4
            if (r0 == 0) goto L62
            r3 = r13
            X.0CY4 r3 = (X.C0CY4) r3
            int r2 = r3.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r3.LLILZLL = r2
        L12:
            java.lang.Object r1 = r3.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZLL
            r2 = 1
            if (r0 == 0) goto L59
            if (r0 != r2) goto L69
            long r9 = r3.LLILLL
            long r11 = r3.LLILLJJLI
            X.19EG r8 = r3.LL
            X.C155000ia.LIZIZ(r1)
        L28:
            long r5 = android.os.SystemClock.uptimeMillis()
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L68
            android.app.Activity r1 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            boolean r0 = r1 instanceof X.C19EG
            if (r0 == 0) goto L4a
            if (r1 == 0) goto L4a
            if (r1 == r8) goto L4a
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L4a
            boolean r0 = r1.isDestroyed()
            if (r0 != 0) goto L4a
            return r1
        L4a:
            r3.LL = r8
            r3.LLILLJJLI = r11
            r3.LLILLL = r9
            r3.LLILZLL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r11, r3)
            if (r0 != r4) goto L28
            return r4
        L59:
            X.C155000ia.LIZIZ(r1)
            long r0 = android.os.SystemClock.uptimeMillis()
            long r9 = r9 + r0
            goto L28
        L62:
            X.0CY4 r3 = new X.0CY4
            r3.<init>(r7, r13)
            goto L12
        L68:
            return r0
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction.waitForNewTopActivity(X.19EG, long, long, X.05Vn):java.lang.Object");
    }
}
