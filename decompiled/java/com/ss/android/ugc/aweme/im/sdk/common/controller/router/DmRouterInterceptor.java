package com.ss.android.ugc.aweme.im.sdk.common.controller.router;

import X.AbstractC1387200mCc;
import X.C0CNO;
import X.C0I0B;
import X.C0WZX;
import X.C1388190mED;
import X.C1400340mXo;
import X.C1701330uNH;
import X.C1906580ziK;
import X.C1976907ol;
import X.C19EG;
import X.C2204961BRm;
import X.C278880AwQ;
import X.C287700BPk;
import X.C907170ZiN;
import X.C912950Zrh;
import X.C912960Zri;
import X.InterfaceC1603190roz;
import X.InterfaceC21300818Xm;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.router.util.Util;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.PreLoginHandleService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatlist.api.model.DMNavArg;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes15.dex */
public final class DmRouterInterceptor implements IInterceptor {
    public static String LL = "";
    public static long LLILLJJLI;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            host = uri.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF("chat", host);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Intent extra;
        Object objLIZIZ;
        Object obj;
        C19EG c19eg;
        String conversationId;
        Integer messagePreviewEnabled;
        Activity activityLIZ;
        IAiChatFeatureService iAiChatFeatureService;
        InterfaceC21300818Xm interfaceC21300818XmLIZ;
        InterfaceC21300818Xm interfaceC21300818XmLIZ2;
        if (context == null || routeIntent == null || routeIntent.getExtra() == null || (extra = routeIntent.getExtra()) == null) {
            return false;
        }
        String strLJJIFFI = u.LJJIFFI(String.valueOf(extra.getData()), "chat/center", "chat/center2", false);
        Uri uri = UriProtector.parse(strLJJIFFI);
        extra.setData(uri);
        Context contextLIZ = C1388190mED.LIZ(context);
        if (contextLIZ == null) {
            contextLIZ = context;
        }
        String stringExtra = null;
        if (!((C1400340mXo) C0I0B.LJFF.LIZ()).isLogin() && (contextLIZ instanceof Activity)) {
            Activity activity = (Activity) contextLIZ;
            Intent intentLIZ = PreLoginHandleService.LIZIZ().LIZ(activity, extra, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "multi_account_push_uid"));
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentLIZ, "Context_startActivity_1");
            C1701330uNH.LIZ(intentLIZ, activity);
            C2204961BRm.LJIILLIIL(activity, intentLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjMFbEWrnLNKG6OgAI1xDYOLYZC1DZLXW1mHmYqNbH64UBKaUUQvteITYMNg==", null));
        } else {
            IIMChatPerfLogger.LIZ.getClass();
            IIMChatPerfLogger iIMChatPerfLoggerLIZ = C907170ZiN.LIZ();
            if (iIMChatPerfLoggerLIZ != null) {
                iIMChatPerfLoggerLIZ.LJIIIZ();
            }
            DMNavArg.Companion.getClass();
            DMNavArg dMNavArgLIZIZ = C912960Zri.LIZIZ(extra);
            String path = uri.getPath();
            String conversationId2 = dMNavArgLIZIZ.getConversationId();
            if (((Boolean) C287700BPk.LIZ.getValue()).booleanValue() && ((path != null && path.length() != 0 && u.LJIIZILJ("chat/ai_imagine", path, false)) || ((iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null)) != null && (interfaceC21300818XmLIZ = iAiChatFeatureService.LIZ()) != null && interfaceC21300818XmLIZ.LJIIIIZZ(conversationId2)))) {
                IAiChatFeatureService iAiChatFeatureService2 = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
                if (iAiChatFeatureService2 != null && (interfaceC21300818XmLIZ2 = iAiChatFeatureService2.LIZ()) != null) {
                    try {
                        stringExtra = extra.getStringExtra("shoot_enter_method");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    interfaceC21300818XmLIZ2.LIZIZ(context, stringExtra);
                    return true;
                }
            } else if (!Intrinsics.LJFF(Util.sliceUrlParams(strLJJIFFI).get("enter_method"), "deeplink_email") && (conversationId = dMNavArgLIZIZ.getConversationId()) != null && conversationId.length() > 0 && (((messagePreviewEnabled = dMNavArgLIZIZ.getMessagePreviewEnabled()) != null && messagePreviewEnabled.intValue() == 1) || Intrinsics.LJFF(dMNavArgLIZIZ.getPushLabel(), "click_push_im_msg_req"))) {
                if ((LL.length() <= 0 || !Intrinsics.LJFF(LL, dMNavArgLIZIZ.getConversationId()) || TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - LLILLJJLI) >= 800) && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                    String conversationId3 = dMNavArgLIZIZ.getConversationId();
                    if (conversationId3 == null) {
                        conversationId3 = "";
                    }
                    LL = conversationId3;
                    LLILLJJLI = System.nanoTime();
                    new C912950Zrh(0).LIZIZ(activityLIZ, dMNavArgLIZIZ);
                    return true;
                }
            } else {
                Intent mainActivityIntent = ((IMainService) ServiceManager.get().getService(IMainService.class)).getMainActivityIntent(context);
                if (mainActivityIntent != null) {
                    mainActivityIntent.setFlags(67108864);
                    mainActivityIntent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
                    mainActivityIntent.putExtras(extra);
                } else {
                    mainActivityIntent = null;
                }
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, mainActivityIntent, "Context_startActivity_1");
                C1701330uNH.LIZ(mainActivityIntent, context);
                C2204961BRm.LJJJJJL(context, mainActivityIntent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjMFbEWrnLNKG6OgAI1xDYOLYZC1DZLXW1mHmYqNbH64UBKaUUQvteITYMNg==", null));
                if (((Number) C278880AwQ.LIZ.getValue()).intValue() == 1) {
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null) {
                        objLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
                    } else {
                        objLIZIZ = null;
                    }
                    if (objLIZIZ instanceof InterfaceC1603190roz) {
                        obj = (InterfaceC1603190roz) objLIZIZ;
                    } else {
                        obj = null;
                    }
                    if ((obj instanceof C19EG) && (c19eg = (C19EG) obj) != null) {
                        C0CNO.LIZLLL(0L, new AwS556S0100000_12(c19eg, 856));
                        return true;
                    }
                }
            }
        }
        return true;
    }
}
