package com.ss.android.ugc.airemix.api.service;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C0LOV;
import X.C0M70;
import X.C0M73;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1906580ziK;
import X.C1976907ol;
import X.C2188811AlT;
import X.C23250099c;
import X.C259800zU;
import X.C452501pT;
import X.C560170Ly3;
import X.C563030M6j;
import X.C563130M6t;
import X.C563190M6z;
import X.EnumC452301pR;
import X.InterfaceC497601wk;
import X.InterfaceC563090M6p;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.airemix.api.IAIRemixService;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixCommonEntranceInfo;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixRouterInterceptor implements IInterceptor {
    public final C01GW LL;
    public final C01GW LLILLJJLI;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public AIRemixRouterInterceptor() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LL = C452501pT.LIZ(enumC452301pR, AFwS194S0000000_8.get$arr$(42));
        this.LLILLJJLI = C452501pT.LIZ(enumC452301pR, AFwS194S0000000_8.get$arr$(43));
    }

    public static AIRemixLaunchParam LIZ(RouteIntent routeIntent) {
        Bundle extras;
        Intent extra = routeIntent.getExtra();
        Bundle extras2 = null;
        if (extra != null) {
            try {
                extras = extra.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
        } else {
            extras = null;
        }
        AIRemixLaunchParam aIRemixLaunchParamLIZ = C563130M6t.LIZ(extras);
        if (aIRemixLaunchParamLIZ != null) {
            return aIRemixLaunchParamLIZ;
        }
        IAIRemixService.LIZ.getClass();
        InterfaceC563090M6p interfaceC563090M6pLIZ = C563030M6j.LIZ().LIZ();
        if (interfaceC563090M6pLIZ == null) {
            return null;
        }
        Intent extra2 = routeIntent.getExtra();
        if (extra2 != null) {
            try {
                extras2 = extra2.getExtras();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return interfaceC563090M6pLIZ.LIZ(extras2);
    }

    public static void LJFF(Context context) {
        Activity activityLIZ;
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZLLL = C1906580ziK.LIZLLL();
        if (abstractC1387200mCcLIZLLL == null || (activityLIZIZ = abstractC1387200mCcLIZLLL.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null) {
            if (context != null) {
                activityLIZ = C1388190mED.LIZ(context);
            } else {
                activityLIZ = null;
            }
        }
        if (activityLIZ == null) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("AIRemixRouterInterceptor", "showAiSelfInvitePermissionDeniedToast: no activity for toast");
            return;
        }
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("AIRemixRouterInterceptor", "showAiSelfInvitePermissionDeniedToast: show toast");
        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
        c1389890mGx.LJIIIZ(2131846103);
        c1389890mGx.LJIIJJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, com.ss.android.ugc.airemix.api.service.AIRemixLaunchParam] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, com.ss.android.ugc.airemix.api.service.AIRemixLaunchParam] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String str;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || !Intrinsics.LJFF(uri.getHost(), "ai_remix") || !Intrinsics.LJFF(uri.getPath(), "/create")) {
            return false;
        }
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if ((creativeToolsBizPluginServiceLIZ != null && !creativeToolsBizPluginServiceLIZ.LIZ()) || !((Boolean) this.LL.getValue()).booleanValue()) {
            return true;
        }
        C259800zU c259800zU = new C259800zU();
        ?? LIZ = LIZ(routeIntent);
        if (LIZ == 0) {
            return false;
        }
        c259800zU.element = LIZ;
        if (LIZ.clickTimestamp <= 0) {
            c259800zU.element = AIRemixLaunchParam.LIZ(LIZ, null, false, System.currentTimeMillis(), 127);
            Intent extra = routeIntent.getExtra();
            if (extra != null) {
                extra.putExtra("key_launch_param", (Parcelable) c259800zU.element);
            }
        }
        AIRemixLaunchParam aIRemixLaunchParam = (AIRemixLaunchParam) c259800zU.element;
        if (aIRemixLaunchParam.skipRouterIntercept) {
            return false;
        }
        AIRemixCommonEntranceInfo aIRemixCommonEntranceInfo = aIRemixLaunchParam.aiRemixCommonEntranceInfo;
        if (aIRemixCommonEntranceInfo == null || (str = aIRemixCommonEntranceInfo.sceneName) == null) {
            str = "";
        }
        if (!Intrinsics.LJFF(str, C0M70.AISELF_INVITE.getMobName())) {
            return false;
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLILLJJLI.getValue(), null, null, new C560170Ly3(this, c259800zU, null), 3);
        return true;
    }

    public static void LIZIZ(Context context, AIRemixLaunchParam aIRemixLaunchParam) {
        String str;
        IAIRemixEntranceMobService.LIZ.getClass();
        IAIRemixEntranceMobService iAIRemixEntranceMobServiceLIZ = C0M73.LIZ();
        AIRemixCommonEntranceInfo aIRemixCommonEntranceInfo = aIRemixLaunchParam.aiRemixCommonEntranceInfo;
        if (aIRemixCommonEntranceInfo != null) {
            str = aIRemixCommonEntranceInfo.creationId;
        } else {
            str = null;
        }
        iAIRemixEntranceMobServiceLIZ.LJIILIIL(str, "chat", C0M70.AISELF_INVITE.getMobName());
        if (context != null) {
            AIRemixLaunchParam aIRemixLaunchParamLIZ = AIRemixLaunchParam.LIZ(aIRemixLaunchParam, null, true, 0L, 191);
            IAIRemixService.LIZ.getClass();
            InterfaceC563090M6p interfaceC563090M6pLIZ = C563030M6j.LIZ().LIZ();
            if (interfaceC563090M6pLIZ != null) {
                interfaceC563090M6pLIZ.LJI(context, aIRemixLaunchParamLIZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.feed.model.Aweme> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C563120M6s
            if (r0 == 0) goto L25
            r5 = r8
            X.0M6s r5 = (X.C563120M6s) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L33
            if (r0 != r3) goto L2b
            java.lang.Object r7 = r5.LL
            java.lang.String r7 = (java.lang.String) r7
            goto L4f
        L25:
            X.0M6s r5 = new X.0M6s
            r5.<init>(r6, r8)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = kotlin.text.a0.LJJJIL(r7)
            if (r0 == 0) goto L3d
            return r2
        L3d:
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Exception -> L56
            X.0LOW r0 = new X.0LOW     // Catch: java.lang.Exception -> L56
            r0.<init>(r7, r2)     // Catch: java.lang.Exception -> L56
            r5.LL = r7     // Catch: java.lang.Exception -> L56
            r5.LLILZ = r3     // Catch: java.lang.Exception -> L56
            java.lang.Object r1 = X.C23250099c.LJI(r5, r1, r0)     // Catch: java.lang.Exception -> L56
            if (r1 != r4) goto L52
            return r4
        L4f:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L56
        L52:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1     // Catch: java.lang.Exception -> L56
            r2 = r1
            goto L5a
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5a:
            if (r2 != 0) goto L6f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "loadAwemeById: getAwemeInfo null awemeId="
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "AIRemixRouterInterceptor"
            com.ss.android.agilelogger.ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW(r0, r1)
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.airemix.api.service.AIRemixRouterInterceptor.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.airemix.api.service.AIRemixLaunchParam r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C563100M6q
            if (r0 == 0) goto L6c
            r3 = r14
            X.0M6q r3 = (X.C563100M6q) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r11 = r3.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r1 = 1
            if (r0 == 0) goto L53
            if (r0 != r1) goto L72
            com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService r4 = r3.LL
            X.C155000ia.LIZIZ(r11)
        L24:
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = (com.ss.android.ugc.aweme.feed.model.Aweme) r11
            if (r11 != 0) goto L2d
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = new com.ss.android.ugc.aweme.feed.model.Aweme
            r11.<init>()
        L2d:
            X.0M70 r0 = X.C0M70.AISELF_INVITE
            java.lang.String r7 = r0.getMobName()
            com.ss.android.ugc.aweme.feed.model.AIRemixInfo r0 = r11.aiRemixInfo
            r10 = 0
            if (r0 == 0) goto L51
            java.lang.String r9 = r0.getFirstGid()
        L3c:
            java.lang.String r8 = r11.getAid()
            com.ss.android.ugc.aweme.feed.model.AIRemixInfo r0 = r11.aiRemixInfo
            if (r0 == 0) goto L48
            java.lang.String r10 = r0.getGamePlay()
        L48:
            java.lang.String r5 = "chat"
            r6 = 1
            r4.LIZIZ(r5, r6, r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L51:
            r9 = r10
            goto L3c
        L53:
            X.C155000ia.LIZIZ(r11)
            X.0M73 r0 = com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService.LIZ
            r0.getClass()
            com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService r4 = X.C0M73.LIZ()
            java.lang.String r0 = r13.awemeId
            r3.LL = r4
            r3.LLILZ = r1
            java.lang.Object r11 = r12.LIZJ(r0, r3)
            if (r11 != r2) goto L24
            return r2
        L6c:
            X.0M6q r3 = new X.0M6q
            r3.<init>(r12, r14)
            goto L12
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.airemix.api.service.AIRemixRouterInterceptor.LIZLLL(com.ss.android.ugc.airemix.api.service.AIRemixLaunchParam, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.airemix.api.service.AIRemixLaunchParam r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C563110M6r
            if (r0 == 0) goto L6b
            r3 = r14
            X.0M6r r3 = (X.C563110M6r) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r11 = r3.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r5 = 1
            if (r0 == 0) goto L52
            if (r0 != r5) goto L71
            com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService r4 = r3.LL
            X.C155000ia.LIZIZ(r11)
        L24:
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = (com.ss.android.ugc.aweme.feed.model.Aweme) r11
            if (r11 != 0) goto L2d
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = new com.ss.android.ugc.aweme.feed.model.Aweme
            r11.<init>()
        L2d:
            X.0M70 r0 = X.C0M70.AISELF_INVITE
            java.lang.String r7 = r0.getMobName()
            com.ss.android.ugc.aweme.feed.model.AIRemixInfo r0 = r11.aiRemixInfo
            r10 = 0
            if (r0 == 0) goto L50
            java.lang.String r9 = r0.getFirstGid()
        L3c:
            java.lang.String r8 = r11.getAid()
            com.ss.android.ugc.aweme.feed.model.AIRemixInfo r0 = r11.aiRemixInfo
            if (r0 == 0) goto L48
            java.lang.String r10 = r0.getGamePlay()
        L48:
            java.lang.String r6 = "entrance_click"
            r4.LIZJ(r5, r6, r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L50:
            r9 = r10
            goto L3c
        L52:
            X.C155000ia.LIZIZ(r11)
            X.0M73 r0 = com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService.LIZ
            r0.getClass()
            com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService r4 = X.C0M73.LIZ()
            java.lang.String r0 = r13.awemeId
            r3.LL = r4
            r3.LLILZ = r5
            java.lang.Object r11 = r12.LIZJ(r0, r3)
            if (r11 != r1) goto L24
            return r1
        L6b:
            X.0M6r r3 = new X.0M6r
            r3.<init>(r12, r14)
            goto L12
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.airemix.api.service.AIRemixRouterInterceptor.LJ(com.ss.android.ugc.airemix.api.service.AIRemixLaunchParam, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        AIRemixLaunchParam aIRemixLaunchParamLIZ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null && !creativeToolsBizPluginServiceLIZ.LIZ()) {
            CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ2 = C0LOV.LIZ();
            if (creativeToolsBizPluginServiceLIZ2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("airemix_");
                sbLIZ.append(C0M70.AISELF_INVITE.getMobName());
                creativeToolsBizPluginServiceLIZ2.LIZIZ(context, C2188811AlT.LIZIZ(sbLIZ), true);
            }
            return true;
        }
        Activity activityLIZ2 = null;
        if (!((Boolean) this.LL.getValue()).booleanValue()) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                activityLIZ2 = activityLIZ;
            } else if (context != null) {
                activityLIZ2 = C1388190mED.LIZ(context);
            }
            if (activityLIZ2 == null) {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("AIRemixRouterInterceptor", "showAIRemixEntranceToast: no activity for toast");
                return true;
            }
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("AIRemixRouterInterceptor", "showAIRemixEntranceToast: show toast");
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ2);
            c1389890mGx.LJIIIZ(2131826326);
            c1389890mGx.LJIIJJI();
            return true;
        }
        if (routeIntent == null || (aIRemixLaunchParamLIZ = LIZ(routeIntent)) == null) {
            return false;
        }
        String str = aIRemixLaunchParamLIZ.awemeId;
        if (a0.LJJJIL(str)) {
            return false;
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLILLJJLI.getValue(), null, null, new C563190M6z(this, str, aIRemixLaunchParamLIZ, context, null), 3);
        return true;
    }
}
