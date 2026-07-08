package com.ss.android.di.push;

import X.C813610Vvr;
import X.InterfaceC810020Vq4;
import X.InterfaceC814740Vxg;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.awemepushapi.IPushApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class PushServiceMock implements IPushApi {
    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void cancelGroupIfEmpty(Context context, Set<String> set, Set<Integer> set2) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean checkChannelStatus(Context context, String str) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void clearAll(Context context) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void clearNotificationId(String str, Context context, int i) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void deletePushExpiredCache() {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void doNULocalNotify(Context context, int i, String str, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public String getAppScheme() {
        return "sslocal";
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public Uri getDefaultPushSoundUri() {
        return null;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public Aweme getPushCacheAweme(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public String getRealChannelId(String str) {
        return "";
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void handleLocalMessage(Context context, String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void init(Context context, InterfaceC810020Vq4 interfaceC810020Vq4) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initImmediately(Context context, InterfaceC810020Vq4 interfaceC810020Vq4) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initMessageDepend() {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initNotificationChannel() {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isNotificationIdContains(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isNotifyEnabled(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isOppoPushDfReady(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isPersonalizedVideoPush(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isPushProcess(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isSswoAct(Activity activity) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isSystemNotifyChannel(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isVideoPush(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public Aweme loadPushCacheSync(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void notifyOnDeeplink(boolean z, Context context, Intent intent, Uri uri) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void onGcmNotificationClick(JSONObject jSONObject, Activity activity, int i, String str, int i2, String str2) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void preloadPushCacheAsync(String str) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void registerSilentMsgHandler(InterfaceC814740Vxg interfaceC814740Vxg) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void removeRedBadge(Context context) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void sendPushShowInterceptEvent(String str, int i, String str2) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void setAutoDisappear(int i) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean setCancelIntent(Context context, Intent intent, C813610Vvr c813610Vvr, boolean z) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void setupInitConfigs(Context context) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void startPushProcess(Context context) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void unRegisterSilentHandler(InterfaceC814740Vxg interfaceC814740Vxg) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public List<String> getFromNotificationIds() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public List<String> getInteractionSettings() {
        return Collections.emptyList();
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public List<String> getPushSettings() {
        return Collections.emptyList();
    }
}
