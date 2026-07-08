package com.ss.android.ugc.awemepushlib.interaction;

import X.C089N;
import X.C0C64;
import X.C0VS0;
import X.C0WZX;
import X.C10ZH;
import X.C13WZ;
import X.C1499900p8O;
import X.C15O7;
import X.C1701330uNH;
import X.C1869890yl9;
import X.C1C7U;
import X.C20684815ws;
import X.C2093608Ic;
import X.C2111608Pa;
import X.C2162308dZ;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C460020I2e;
import X.C581900Ms0;
import X.C786410Ut5;
import X.C793770VBv;
import X.C809020VoS;
import X.C809030VoT;
import X.C809050VoV;
import X.C809120Voc;
import X.C809970Vpz;
import X.C810000Vq2;
import X.C810360Vqc;
import X.C810670Vr7;
import X.C810810VrL;
import X.C810830VrN;
import X.C810890VrT;
import X.C813610Vvr;
import X.C813820VwC;
import X.C813830VwD;
import X.C813840VwE;
import X.C813850VwF;
import X.C813860VwG;
import X.C813870VwH;
import X.C813950VwP;
import X.C813990VwT;
import X.C814250Vwt;
import X.C814730Vxf;
import X.C814840Vxq;
import X.C814850Vxr;
import X.C814860Vxs;
import X.C823050WQl;
import X.C842870X4r;
import X.C844470XAv;
import X.EnumC20023013Wa;
import X.InterfaceC810020Vq4;
import X.InterfaceC814740Vxg;
import Y.ACallableS420S0100000_13;
import Y.ARunnableS18S1100000_13;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.unifiedauthapi.push.appdiff.ISystemPushAppDiffService;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushlib.experiments.PushMsgGroupAndLimitExp;
import com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import com.ss.android.ugc.awemepushlib.os.receiver.NotificationBroadcastReceiver;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class PushService implements IPushApi {
    public List<String> pushSettings = Arrays.asList("im_push", "im_push_preview_v2", "digg_push", "comment_push", "follow_push", "mention_push", "profile_viewer_push", "friend_upvote_push", "follow_new_video_push", "general_upvote_push", "recommend_video_push", "acq_video_push", "live_push", "screen_time_push", "other_channel", "friend_suggestions", "sms", "natural_disaster_forecasts_push");
    public List<String> interactionSettings = Arrays.asList("im_push", "digg_push", "comment_push", "follow_push", "mention_push", "profile_viewer_push", "friend_upvote_push", "friends_comment_push");

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isSswoAct(Activity activity) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void startPushProcess(Context context) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void deletePushExpiredCache() {
        C813950VwP c813950VwP = C813950VwP.LIZ;
        try {
            C15O7.LIZJ(new Callable() { // from class: X.0VwO
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    File[] fileArrListFiles;
                    C1C7U.LIZ("PushCacheLoader@974.deletePushExpiredCache$1");
                    C813950VwP.LIZ.getClass();
                    String strLIZIZ = C813950VwP.LIZIZ();
                    if (strLIZIZ != null && (fileArrListFiles = new C0VSJ(strLIZIZ).listFiles()) != null) {
                        for (File file : fileArrListFiles) {
                            if (System.currentTimeMillis() - file.lastModified() > 172800000) {
                                file.delete();
                                C813950VwP.LIZ.getClass();
                                InterfaceC813980VwS interfaceC813980VwS = (InterfaceC813980VwS) C813950VwP.LJ.getValue();
                                if (interfaceC813980VwS != null) {
                                    interfaceC813980VwS.LJ(file.getName());
                                }
                            }
                        }
                        C813950VwP.LIZ.getClass();
                        Keva.getRepo("push_video_preload").storeInt("preload_video_count", 0);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PushCacheLoader@974.deletePushExpiredCache$1");
                    return unit;
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public Uri getDefaultPushSoundUri() {
        List<String> list = C810830VrN.LIZ;
        C844470XAv.LIZ.getClass();
        return C810830VrN.LIZ(C810830VrN.LIZIZ(null), C844470XAv.LIZ());
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initMessageDepend() {
        C810000Vq2.LIZ(new InterfaceC810020Vq4() { // from class: X.0VwI
            @Override // X.InterfaceC810020Vq4
            public final String getDefaultUninstallQuestionUrl() {
                return "";
            }
        });
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initNotificationChannel() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C813830VwD c813830VwD = C810810VrL.LIZ;
        int i = C2187451AjH.LIZ;
        if (Build.VERSION.SDK_INT < 26 || contextLIZ == null) {
            return;
        }
        ISystemPushAppDiffService.LIZ.getClass();
        C813850VwF.LIZ().LIZJ();
        C810810VrL.LIZJ(contextLIZ, null);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public String getAppScheme() {
        return C814860Vxs.LIZIZ();
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public List<String> getFromNotificationIds() {
        return MessageShowHandler.LJFF;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public List<String> getInteractionSettings() {
        return this.interactionSettings;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public List<String> getPushSettings() {
        return this.pushSettings;
    }

    private synchronized boolean getConfirmPush(Context context) {
        return C809970Vpz.LJFF().LIZIZ();
    }

    private boolean getNotifyEnabled(Context context) {
        C809970Vpz c809970VpzLJFF = C809970Vpz.LJFF();
        if (c809970VpzLJFF.LIZ(context)) {
            return c809970VpzLJFF.LJIILL;
        }
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void clearAll(Context context) {
        NotificationManager notificationManager = (NotificationManager) C786410Ut5.H2(context, "notification");
        if (notificationManager != null) {
            notificationManager.cancelAll();
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public Aweme getPushCacheAweme(String str) {
        String aid;
        Aweme aweme;
        String aid2;
        String desc;
        Aweme aweme2 = C813950VwP.LIZLLL;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(str, aid)) {
            aweme = C813950VwP.LIZLLL;
            if (C581900Ms0.LIZ >= 0 && Intrinsics.LJFF(str, C581900Ms0.LJ)) {
                C581900Ms0.LJFF = 1;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get cache succeed, awemeId: ");
            if (aweme != null) {
                aid2 = aweme.getAid();
            } else {
                aid2 = null;
            }
            sbLIZ.append(aid2);
            sbLIZ.append(", desc: ");
            if (aweme != null) {
                desc = aweme.getDesc();
            } else {
                desc = null;
            }
            sbLIZ.append(desc);
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            aweme = null;
        }
        C813950VwP.LIZLLL = null;
        return aweme;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public String getRealChannelId(String str) {
        return C810810VrL.LIZIZ(C810830VrN.LIZIZ(null), str);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isNotificationIdContains(String str) {
        return ((ArrayList) C813820VwC.LIZ).contains(str);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isNotifyEnabled(Context context) {
        C809970Vpz c809970VpzLJFF = C809970Vpz.LJFF();
        if (c809970VpzLJFF.LIZ(context)) {
            return c809970VpzLJFF.LJIILL;
        }
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isOppoPushDfReady(Context context) {
        C842870X4r c842870X4r = C842870X4r.LIZ;
        c842870X4r.getClass();
        boolean zLIZ = false;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "push_sdk_oppo_module_df_kill_switch", true, false) && !(zLIZ = C842870X4r.LIZ())) {
            c842870X4r.LIZJ(context);
        }
        return zLIZ;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isPersonalizedVideoPush(String str) {
        return C813840VwE.LIZ.contains(str);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isPushProcess(Context context) {
        String strLIZ = C2162308dZ.LIZ(context);
        if (strLIZ != null) {
            if (strLIZ.endsWith(":push") || strLIZ.endsWith(":pushservice")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isSystemNotifyChannel(String str) {
        return C810810VrL.LIZ.containsKey(str);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isVideoPush(String str) {
        return C813950VwP.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public Aweme loadPushCacheSync(String str) {
        if (str == null) {
            C813950VwP c813950VwP = C813950VwP.LIZ;
            return null;
        }
        C813950VwP.LIZ.getClass();
        Aweme awemeLIZJ = C813950VwP.LIZJ(str);
        if (awemeLIZJ == null || C581900Ms0.LIZ < 0 || !Intrinsics.LJFF(str, C581900Ms0.LJ)) {
            return awemeLIZJ;
        }
        C581900Ms0.LJFF = 1;
        return awemeLIZJ;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void preloadPushCacheAsync(String str) {
        C813950VwP c813950VwP = C813950VwP.LIZ;
        if (str != null && str.length() != 0) {
            C813950VwP.LIZ.getClass();
            Aweme awemeLIZJ = C813950VwP.LIZJ(str);
            if (awemeLIZJ != null) {
                C813950VwP.LIZLLL = awemeLIZJ;
                C15O7.LIZJ(new ACallableS420S0100000_13(awemeLIZJ, 8));
            }
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void registerSilentMsgHandler(InterfaceC814740Vxg interfaceC814740Vxg) {
        if (!C813860VwG.LIZ) {
            int i = C2187451AjH.LIZ;
            C813860VwG.LIZ = true;
        }
        for (int i2 : interfaceC814740Vxg.LIZ()) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C813860VwG.LIZIZ.getValue();
            Object copyOnWriteArraySet = concurrentHashMap.get(Integer.valueOf(i2));
            if (copyOnWriteArraySet == null) {
                synchronized (concurrentHashMap) {
                    try {
                        copyOnWriteArraySet = concurrentHashMap.get(Integer.valueOf(i2));
                        if (copyOnWriteArraySet == null) {
                            copyOnWriteArraySet = new CopyOnWriteArraySet();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            ((CopyOnWriteArraySet) copyOnWriteArraySet).add(interfaceC814740Vxg);
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void removeRedBadge(Context context) {
        AwemeRedBadgerManager awemeRedBadgerManager = AwemeRedBadgerManager.LLILLL;
        awemeRedBadgerManager.getClass();
        if (C810360Vqc.LIZ == 0 || C810360Vqc.LIZ == 2) {
            awemeRedBadgerManager.LLILLJJLI.LIZ(0, context);
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void setAutoDisappear(int i) {
        C810360Vqc.LIZ = i;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void setupInitConfigs(Context context) {
        boolean zLJI = C2162308dZ.LJI(context);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setupInitConfigs() @");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append("; isMainProcesss? : ");
        sbLIZ.append(zLJI);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!zLJI) {
            return;
        }
        C809020VoS c809020VoS = C809050VoV.LIZ;
        C809120Voc c809120Voc = new C809120Voc(zLJI, context);
        c809020VoS.getClass();
        C809030VoT c809030VoT = C809030VoT.LJIIJ;
        c809030VoT.getClass();
        c809030VoT.LJIIIIZZ = c809120Voc;
        C810890VrT.LIZIZ.LJIILLIIL("set_up_init_configs");
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void unRegisterSilentHandler(InterfaceC814740Vxg interfaceC814740Vxg) {
        for (int i : interfaceC814740Vxg.LIZ()) {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) C813860VwG.LIZIZ.getValue()).get(Integer.valueOf(i));
            if (copyOnWriteArraySet != null) {
                copyOnWriteArraySet.remove(interfaceC814740Vxg);
            }
        }
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private void addReadingOrderParams(Intent intent, JSONObject jSONObject) {
        try {
            String strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "reading_order_pre_title");
            if (!TextUtils.isEmpty(strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
                jSONObject.put("reading_order_pre_title", strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
            }
            String strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = INVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "reading_order_post_title");
            if (!TextUtils.isEmpty(strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2)) {
                jSONObject.put("reading_order_post_title", strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2);
            }
            String strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3 = INVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "reading_order_pre_text");
            if (!TextUtils.isEmpty(strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3)) {
                jSONObject.put("reading_order_pre_text", strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3);
            }
            String strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4 = INVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "reading_order_post_text");
            if (!TextUtils.isEmpty(strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4)) {
                jSONObject.put("reading_order_post_text", strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            e.getMessage();
        }
    }

    private String getParameterString(Uri uri, String str) {
        try {
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static void lambda$processMsgDisappearLogic$0(Context context, String str) {
        C1C7U.LIZ("PushService@645a.processMsgDisappearLogic$1L");
        C813990VwT.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doAfterPushClick() - ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(" is main? ");
        sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()));
        C2188811AlT.LIZIZ(sbLIZ);
        if (PushMsgGroupAndLimitExp.LIZIZ()) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "push_msg_click_clear_exp", true) > 0) {
                int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "push_msg_click_clear_exp", true);
                if (iLJIJ == 1) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("clearMsgsOfSameGroup(");
                    sbLIZ2.append(str);
                    sbLIZ2.append(')');
                    C2188811AlT.LIZIZ(sbLIZ2);
                    StatusBarNotification[] activeNotifications = C813990VwT.LIZIZ(context).getActiveNotifications();
                    NotificationManager notificationManagerLIZIZ = C813990VwT.LIZIZ(context);
                    for (StatusBarNotification statusBarNotification : activeNotifications) {
                        String group = statusBarNotification.getNotification().getGroup();
                        if (group == null || group.length() <= 0) {
                            group = "msg_group_id_not_defined";
                        }
                        if (Intrinsics.LJFF(group, str)) {
                            notificationManagerLIZIZ.cancel(statusBarNotification.getTag(), statusBarNotification.getId());
                        }
                    }
                } else if (iLJIJ == 2) {
                    StatusBarNotification[] activeNotifications2 = C813990VwT.LIZIZ(context).getActiveNotifications();
                    NotificationManager notificationManagerLIZIZ2 = C813990VwT.LIZIZ(context);
                    for (StatusBarNotification statusBarNotification2 : activeNotifications2) {
                        notificationManagerLIZIZ2.cancel(statusBarNotification2.getTag(), statusBarNotification2.getId());
                    }
                } else if (iLJIJ == 3) {
                    StatusBarNotification[] activeNotifications3 = C813990VwT.LIZIZ(context).getActiveNotifications();
                    NotificationManager notificationManagerLIZIZ3 = C813990VwT.LIZIZ(context);
                    for (StatusBarNotification statusBarNotification3 : activeNotifications3) {
                        String group2 = statusBarNotification3.getNotification().getGroup();
                        if (group2 == null || group2.length() <= 0) {
                            group2 = "msg_group_id_not_defined";
                        }
                        if (!u.LJJIIJZLJL(group2, "android_exclusive_group", false)) {
                            notificationManagerLIZIZ3.cancel(statusBarNotification3.getTag(), statusBarNotification3.getId());
                        }
                    }
                }
            }
        }
        C1C7U.LIZIZ("PushService@645a.processMsgDisappearLogic$1L");
    }

    public static void processMsgDisappearLogic(Context context, Intent intent) {
        boolean z;
        String strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "push_groups_id");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processMsgDisappearLogic(");
        sbLIZ.append(strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
        sbLIZ.append(") - ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(" is main? ");
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C823050WQl.LIZJ().submit(new ARunnableS18S1100000_13(context, strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, 6));
    }

    private synchronized void setConfirmPush(Context context, boolean z) {
        C809970Vpz.LJFF().LJIIIZ(context, z);
    }

    private void setNotifyEnabled(Context context, boolean z) {
        C809970Vpz c809970VpzLJFF = C809970Vpz.LJFF();
        c809970VpzLJFF.LJIILL = z;
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, "push_setting").edit();
        editorEdit.putBoolean("notify_enabled", c809970VpzLJFF.LJIILL);
        C1499900p8O.LIZ(editorEdit);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean checkChannelStatus(Context context, String str) {
        NotificationChannel notificationChannel;
        String realChannelId = getRealChannelId(str);
        NotificationManager notificationManager = (NotificationManager) C786410Ut5.H2(context, "notification");
        if (Build.VERSION.SDK_INT < 26 || notificationManager == null || ((notificationChannel = notificationManager.getNotificationChannel(realChannelId)) != null && notificationChannel.getImportance() != 0)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void init(Context context, InterfaceC810020Vq4 interfaceC810020Vq4) {
        pushInit(context, interfaceC810020Vq4, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initImmediately(Context context, InterfaceC810020Vq4 interfaceC810020Vq4) {
        pushInit(context, interfaceC810020Vq4, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0254  */
    /* JADX WARN: Type inference failed for: r0v96, types: [X.0V10] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pushInit(final android.content.Context r17, X.InterfaceC810020Vq4 r18, java.lang.Boolean r19) {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.interaction.PushService.pushInit(android.content.Context, X.0Vq4, java.lang.Boolean):void");
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void cancelGroupIfEmpty(Context context, Set<String> set, Set<Integer> set2) {
        if (context != null && set != null && !set.isEmpty()) {
            if (set2 == null) {
                set2 = Collections.emptySet();
            }
            C813990VwT.LIZ.getClass();
            C813990VwT.LIZ(context, set, set2);
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void clearNotificationId(String str, Context context, int i) {
        NotificationManager notificationManager = (NotificationManager) C786410Ut5.H2(context, "notification");
        if (notificationManager != null) {
            notificationManager.cancel(str, i);
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void handleLocalMessage(Context context, String str, JSONObject jSONObject) {
        C814730Vxf c814730VxfFrom = C814730Vxf.from(str);
        if (c814730VxfFrom == null) {
            return;
        }
        C814850Vxr.LJFF("receive_notification", String.valueOf(c814730VxfFrom.rid64));
        if (AwemeRedBadgerManager.LLILLL.LIZJ(context, c814730VxfFrom)) {
            if (jSONObject != null) {
                try {
                    jSONObject.put("message_invalid_reason", "red_badge_only");
                    return;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            return;
        }
        C814850Vxr.LJIIIIZZ(c814730VxfFrom, 10000);
        C814840Vxq c814840Vxq = c814730VxfFrom.extra;
        if (c814840Vxq != null) {
            c814840Vxq.turn_screen_on = false;
        }
        MessageShowHandler.LJIIIIZZ(10000, context, c814730VxfFrom);
        C809970Vpz c809970VpzLJFF = C809970Vpz.LJFF();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c809970VpzLJFF.LIZLLL() != null) {
            c809970VpzLJFF.LIZLLL().edit().putLong("last_notify_time", jCurrentTimeMillis).apply();
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void sendPushShowInterceptEvent(String str, int i, String str2) {
        C814730Vxf c814730VxfFrom = C814730Vxf.from(str);
        if (c814730VxfFrom == null) {
            return;
        }
        C814850Vxr.LJIIJ(c814730VxfFrom, i, str2);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void notifyOnDeeplink(boolean z, Context context, Intent intent, Uri uri) {
        String str;
        long j;
        if (!z) {
            C814850Vxr.LJ(uri.toString(), false);
            return;
        }
        try {
            int iLIZ = C2111608Pa.LIZ(-1, "msg_from", intent);
            long jLIZIZ = C2111608Pa.LIZIZ(intent, "msg_id");
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyOnDeeplink(MSG_ID: ");
            sbLIZ.append(jLIZIZ);
            sbLIZ.append(")");
            C2188811AlT.LIZIZ(sbLIZ);
            C814850Vxr.LJFF("click_notification", String.valueOf(jLIZIZ));
            HashMap map = (HashMap) intent.getSerializableExtra("log_data_extra_to_adsapp");
            if (map == null) {
                map = new HashMap(8);
                C814860Vxs.LJ(uri.toString(), map);
            }
            String strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "post_back");
            String str2 = (String) map.get("rule_id");
            if (TextUtils.isEmpty(INVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "rule_id"))) {
                intent.putExtra("rule_id", str2);
            }
            String parameterString = getParameterString(uri, "push_params");
            if (!TextUtils.isEmpty(parameterString)) {
                map.put("feed_batch_params", parameterString);
            }
            String parameterString2 = getParameterString(uri, "gids");
            if (!TextUtils.isEmpty(parameterString2) && TextUtils.equals("aweme", uri.getHost())) {
                if (parameterString2.contains(",")) {
                    parameterString2 = parameterString2.substring(0, parameterString2.indexOf(","));
                }
                map.put("group_id", parameterString2);
            }
            if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_login", str);
            int iLIZ2 = C2111608Pa.LIZ(-1, "message_from", intent);
            String strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = INVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "message_extra");
            JSONObject jSONObject = new JSONObject(map);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    j = CastLongProtector.parseLong(str2);
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    j = jLIZIZ;
                }
            } else {
                j = jLIZIZ;
            }
            if (iLIZ != 1) {
                if (iLIZ == 2) {
                    int i2 = C2187451AjH.LIZ;
                    C814850Vxr.LIZJ(context, "news_notify_view", jLIZIZ, -1L, new JSONObject[0]);
                    addReadingOrderParams(intent, jSONObject);
                    trackClickPush(context, j, null, false, strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, jSONObject, strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2);
                    processMsgDisappearLogic(context, intent);
                    return;
                }
                return;
            }
            C814850Vxr.LIZJ(context, "news_notify_view", jLIZIZ, -1L, new JSONObject[0]);
            String strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3 = INVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "action_id");
            if (iLIZ2 == 10001) {
                map.put("real_timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
                C814850Vxr.LIZLLL(C2111608Pa.LIZIZ(intent, "push_rule_id"), strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3, map);
            } else {
                int i3 = C2187451AjH.LIZ;
                addReadingOrderParams(intent, jSONObject);
                trackClickPush(context, j, strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3, true, strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, jSONObject, strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2);
                processMsgDisappearLogic(context, intent);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("exception", e2.toString());
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            C793770VBv.LJII("push_click_error_event", jSONObject2, null, null);
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean setCancelIntent(Context context, Intent intent, C813610Vvr c813610Vvr, boolean z) {
        Intent intent2 = new Intent(context, (Class<?>) NotificationBroadcastReceiver.class);
        intent2.setAction("notification_cancelled");
        intent2.putExtra("contentIntentURI", intent);
        if (z) {
            intent2.putExtra("message_from", 10001);
        }
        c813610Vvr.LJJIIZI.deleteIntent = PendingIntent.getBroadcast(context, 0, intent2, 201326592);
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void doNULocalNotify(Context context, int i, String str, String str2, String str3) {
        Uri uriLIZ;
        NotificationManager notificationManager = (NotificationManager) C786410Ut5.H2(context, "notification");
        int iLIZIZ = C810830VrN.LIZIZ(null);
        C810810VrL.LIZJ(context, null);
        C813610Vvr c813610Vvr = new C813610Vvr(context, C810810VrL.LIZIZ(0, "other_channel"));
        c813610Vvr.LJJIIZI.tickerText = C813610Vvr.LIZJ(str);
        c813610Vvr.LJII(16, true);
        c813610Vvr.LJJIIZI.icon = R.drawable.c8f;
        c813610Vvr.LJFF(str);
        c813610Vvr.LJ(str2);
        c813610Vvr.LJJIIZI.when = System.currentTimeMillis();
        c813610Vvr.LJIIJ = 1;
        c813610Vvr.LJII(16, true);
        c813610Vvr.LJJ = 1;
        try {
            uriLIZ = C810830VrN.LIZ(iLIZIZ, context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (uriLIZ == null) {
            c813610Vvr.LJI(1);
        } else {
            c813610Vvr.LJIIIZ(uriLIZ);
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(UriProtector.parse(str3));
        intent.setPackage(context.getPackageName());
        intent.addFlags(268435456);
        intent.putExtra("from_notification", true);
        intent.putExtra("msg_from", 1);
        intent.putExtra("msg_id", i);
        intent.putExtra("message_from", "nu_local_notify");
        c813610Vvr.LJI = PendingIntent.getActivity(context, 0, intent, 201326592, null);
        Notification notificationLIZIZ = c813610Vvr.LIZIZ();
        C786410Ut5.LJJJI("push_label", "new_user_local_push", notificationLIZIZ.extras);
        notificationManager.notify("app_notify_ame", i, notificationLIZIZ);
        C814730Vxf c814730Vxf = new C814730Vxf();
        long j = i;
        c814730Vxf.id = j;
        c814730Vxf.rid64 = j;
        c814730Vxf.openUrl = str3;
        c814730Vxf.title = str;
        c814730Vxf.text = str2;
        C814850Vxr.LJIIIZ(c814730Vxf, false, 10000, "normal", null, null);
        C0VS0.LIZLLL(context).LJ(j);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void onGcmNotificationClick(JSONObject jSONObject, Activity activity, int i, String str, int i2, String str2) {
        Intent intent;
        try {
            jSONObject.optInt("preload_article", 0);
            String strOptString = jSONObject.optString("open_url");
            if (C2093608Ic.LJ(strOptString)) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("app_data");
                if (jSONObjectOptJSONObject != null) {
                    int iOptInt = jSONObjectOptJSONObject.optInt("t", 0);
                    int iOptInt2 = jSONObjectOptJSONObject.optInt("p", 0);
                    long jOptLong = jSONObjectOptJSONObject.optLong("uid", 0L);
                    if (iOptInt == 1) {
                        intent = new Intent();
                        if (iOptInt2 != 1 && iOptInt2 != 3) {
                            if (iOptInt2 == 4 && jOptLong > 0) {
                                C813820VwC.LIZ(intent);
                            }
                        } else {
                            intent.addFlags(536870912);
                            C813820VwC.LIZ(intent);
                        }
                        if (C2093608Ic.LJ(intent.getDataString())) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("ssnotify://common/");
                            sbLIZ.append(iOptInt);
                            sbLIZ.append(iOptInt2);
                            sbLIZ.append(jOptLong);
                            intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                        }
                    } else {
                        intent = null;
                    }
                } else {
                    intent = null;
                }
            } else {
                Uri uri = UriProtector.parse(strOptString);
                String scheme = uri.getScheme();
                if ("sslocal".equals(scheme)) {
                    uri = UriProtector.parse(C10ZH.LIZIZ.LJJ(strOptString));
                }
                intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                if (C10ZH.LIZIZ.LJJI(scheme)) {
                    intent.putExtra("is_from_self", true);
                }
                intent.setData(uri);
            }
            String packageName = activity.getPackageName();
            if (intent == null) {
                intent = C2162308dZ.LIZIZ(activity, packageName);
            }
            if (intent != null) {
                intent.addFlags(268435456);
                C813820VwC.LIZ(intent);
                intent.putExtra("msg_from", 2);
                intent.putExtra("msg_id", i);
                intent.putExtra("message_from", str);
                if (!C2093608Ic.LJ(str2)) {
                    intent.putExtra("message_extra", str2);
                }
                if (i2 == 0) {
                    try {
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                        C1701330uNH.LIZ(intent, activity);
                        C2204961BRm.LJJJJJL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2dv+7a5PH3nxzmANobxXoKP6jm5m1PEyBOf+T", null));
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (!activity.isFinishing()) {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, activity);
                    C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2dv+7a5PH3nxzmANobxXoKP6jm5m1PEyBOf+T", null));
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("can not get launch intent: ");
            sbLIZ2.append(e2);
            C2188811AlT.LIZIZ(sbLIZ2);
            int i3 = C813870VwH.LIZ;
            synchronized (C813870VwH.class) {
            }
        }
    }

    private void trackClickPush(Context context, long j, String str, boolean z, String str2, JSONObject jSONObject, String str3) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            try {
                jSONObject2 = new JSONObject();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            jSONObject2 = jSONObject;
        }
        if (z) {
            jSONObject2.put("click_position", "notify");
            if (str != null) {
                jSONObject2.put("position", str);
            } else {
                jSONObject2.put("position", "push_body");
            }
        } else {
            jSONObject2.put("click_position", "alert");
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject2.put("post_back", str2);
        }
        jSONObject2.put("rule_id", String.valueOf(j));
        C20684815ws.LJIJ("push_click", jSONObject2);
        C814850Vxr.LIZIZ(str3, false);
        C1869890yl9.LJ(JSONObjectProtectorUtils.getString(jSONObject2, "push_label"));
        C13WZ c13wz = C089N.LIZ;
        String strValueOf = String.valueOf(j);
        c13wz.getClass();
        if (C13WZ.LJ() || Objects.equals(c13wz.LJIIIIZZ, EnumC20023013Wa.ClickPushWarm)) {
            c13wz.LJIILJJIL = strValueOf;
        }
        C460020I2e.LIZ.registerActivityLifecycleCallbacks(new C814250Vwt(j, z, str, str2, jSONObject));
    }
}
