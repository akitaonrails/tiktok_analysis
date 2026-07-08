package com.ss.android.ugc.awemepushapi;

import X.C813610Vvr;
import X.C815820VzQ;
import X.InterfaceC810020Vq4;
import X.InterfaceC814740Vxg;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public interface IPushApi {
    public static final C815820VzQ Companion = C815820VzQ.LIZ;

    void cancelGroupIfEmpty(Context context, Set<String> set, Set<Integer> set2);

    boolean checkChannelStatus(Context context, String str);

    void clearAll(Context context);

    void clearNotificationId(String str, Context context, int i);

    void deletePushExpiredCache();

    void doNULocalNotify(Context context, int i, String str, String str2, String str3);

    String getAppScheme();

    Uri getDefaultPushSoundUri();

    List<String> getFromNotificationIds();

    List<String> getInteractionSettings();

    Aweme getPushCacheAweme(String str);

    List<String> getPushSettings();

    String getRealChannelId(String str);

    void handleLocalMessage(Context context, String str, JSONObject jSONObject);

    void init(Context context, InterfaceC810020Vq4 interfaceC810020Vq4);

    void initImmediately(Context context, InterfaceC810020Vq4 interfaceC810020Vq4);

    void initMessageDepend();

    void initNotificationChannel();

    boolean isNotificationIdContains(String str);

    boolean isNotifyEnabled(Context context);

    boolean isOppoPushDfReady(Context context);

    boolean isPersonalizedVideoPush(String str);

    boolean isPushProcess(Context context);

    boolean isSswoAct(Activity activity);

    boolean isSystemNotifyChannel(String str);

    boolean isVideoPush(String str);

    Aweme loadPushCacheSync(String str);

    void notifyOnDeeplink(boolean z, Context context, Intent intent, Uri uri);

    void onGcmNotificationClick(JSONObject jSONObject, Activity activity, int i, String str, int i2, String str2);

    void preloadPushCacheAsync(String str);

    void registerSilentMsgHandler(InterfaceC814740Vxg interfaceC814740Vxg);

    void removeRedBadge(Context context);

    void sendPushShowInterceptEvent(String str, int i, String str2);

    void setAutoDisappear(int i);

    boolean setCancelIntent(Context context, Intent intent, C813610Vvr c813610Vvr, boolean z);

    void setupInitConfigs(Context context);

    void startPushProcess(Context context);

    void unRegisterSilentHandler(InterfaceC814740Vxg interfaceC814740Vxg);
}
