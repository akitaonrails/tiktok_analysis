package com.heytap.msp.push;

import android.app.Activity;
import android.content.Context;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.liquid.DownloadRequest;
import com.heytap.mcssdk.liquid.OnLiquidSettingChangeListener;
import com.heytap.mcssdk.utils.StatUtil;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ILiquidTaskQueryCallback;
import com.heytap.msp.push.callback.INotificationPermissionCallback;
import com.heytap.msp.push.callback.IPackageAuthCallbackListener;
import com.heytap.msp.push.callback.IServiceChannelCallback;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.MessageStat;
import com.heytap.msp.push.notification.PushNotificationManager;
import com.heytap.msp.push.statis.StatisticUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class HeytapPushManager {
    public static void clearNotificationAdvanceCallback() {
        PushService.a.a.clearNotificationAdvanceCallback();
    }

    public static void clearNotificationType() {
        clearNotificationType(null);
    }

    public static void clearNotifications() {
        clearNotifications(null);
    }

    public static long getAppLimitCLickTime() {
        return PushService.a.a.getAppLimitCLickTime();
    }

    public static void getNotificationStatus() {
        getNotificationStatus(null);
    }

    public static ICallBackResultService getPushCallback() {
        return PushService.a.a.getPushCallback();
    }

    public static PushNotificationManager getPushNotificationManager() {
        return PushNotificationManager.getInstance();
    }

    public static void getPushStatus() {
        PushService.a.a.getPushStatus();
    }

    public static int getPushVersionCode() {
        return PushService.a.a.getPushVersionCode();
    }

    public static String getPushVersionName() {
        return PushService.a.a.getPushVersionName();
    }

    public static void getRegister() {
        getRegister(null);
    }

    public static String getRegisterID() {
        return PushService.a.a.getRegisterID();
    }

    public static int getSDKVersionCode() {
        return PushService.getSDKVersionCode();
    }

    public static String getSDKVersionName() {
        return PushService.getSDKVersionName();
    }

    public static void openNotificationSettings() {
        openNotificationSettings(null);
    }

    public static void pausePush() {
        pausePush(null);
    }

    public static void register(Context context, String str, String str2, ICallBackResultService iCallBackResultService) {
        register(context, str, str2, null, iCallBackResultService);
    }

    public static void requestNotificationPermission() throws Throwable {
        PushService.a.a.requestNotificationPermission();
    }

    public static void resumePush() {
        resumePush(null);
    }

    public static void setNotificationType(int i) {
        setNotificationType(i, null);
    }

    public static void setPushTime(List<Integer> list, int i, int i2, int i3, int i4) {
        setPushTime(list, i, i2, i3, i4, null);
    }

    public static void statisticEvent(Context context, String str, DataMessage dataMessage) {
        StatisticUtils.statisticEvent(context, str, dataMessage);
    }

    public static void statisticMessage(Context context, MessageStat messageStat) {
        StatUtil.statisticMessage(context, messageStat);
    }

    public static void statisticMessage(Context context, List<MessageStat> list) {
        StatUtil.statisticMessage(context, list);
    }

    public static void unRegister() {
        unRegister(null);
    }

    public static void active(Context context) {
        PushService.a.a.active(context);
    }

    public static void cancelNotification(JSONObject jSONObject) {
        PushService.a.a.cancelNotification(jSONObject);
    }

    public static void clearNotificationType(JSONObject jSONObject) {
        PushService.a.a.clearNotificationType(jSONObject);
    }

    public static void clearNotifications(JSONObject jSONObject) {
        PushService.a.a.clearNotifications(jSONObject);
    }

    public static void disableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        PushService.a.a.disableAppNotificationSwitch(iSetAppNotificationCallBackService);
    }

    public static void enableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        PushService.a.a.enableAppNotificationSwitch(iSetAppNotificationCallBackService);
    }

    public static void getAppNotificationSwitch(IGetAppNotificationCallBackService iGetAppNotificationCallBackService) {
        PushService.a.a.getAppNotificationSwitch(iGetAppNotificationCallBackService);
    }

    public static String getMcsPackageName(Context context) {
        return PushService.a.a.getMcsPackageName(context);
    }

    public static void getNotificationStatus(JSONObject jSONObject) {
        PushService.a.a.getNotificationStatus(jSONObject);
    }

    public static String getReceiveSdkAction(Context context) {
        return PushService.a.a.getReceiveSdkAction(context);
    }

    public static void getRegister(JSONObject jSONObject) {
        PushService.a.a.getRegister(jSONObject);
    }

    public static boolean isSupportCallkit(Context context) {
        return PushService.a.a.isSupportCallkit(context);
    }

    public static boolean isSupportLiquid(Context context) {
        return PushService.a.a.isSupportLiquid(context);
    }

    public static boolean isSupportLiquidBatch(Context context) {
        return PushService.a.a.isSupportLiquidBatch(context);
    }

    public static boolean isSupportPush(Context context) {
        return PushService.a.a.isSupportPushByClient(context);
    }

    public static void openNotificationSettings(JSONObject jSONObject) {
        PushService.a.a.openNotificationSettings(jSONObject);
    }

    public static void pausePush(JSONObject jSONObject) {
        PushService.a.a.pausePush(jSONObject);
    }

    public static void requestDownloadSeeding(DownloadRequest downloadRequest) {
        PushService.a.a.requestDownloadSeeding(downloadRequest);
    }

    public static void requestDownloadSeedingList(List<DownloadRequest> list) {
        PushService.a.a.requestDownloadSeedingList(list);
    }

    public static void resumePush(JSONObject jSONObject) {
        PushService.a.a.resumePush(jSONObject);
    }

    public static void setPushCallback(ICallBackResultService iCallBackResultService) {
        PushService.a.a.setPushCallback(iCallBackResultService);
    }

    public static void setRegisterID(String str) {
        PushService.a.a.setRegisterID(str);
    }

    public static void unRegister(JSONObject jSONObject) {
        PushService.a.a.unRegister(jSONObject);
    }

    public static void unRegisterLiquidChangeSettingObserver(Context context) {
        PushService.a.a.unRegisterLiquidChangeSettingObserver(context);
    }

    public static void init(Context context, boolean z) {
        PushService.a.a.init(context, z);
    }

    public static void queryLiquidTask(Context context, ILiquidTaskQueryCallback iLiquidTaskQueryCallback) {
        PushService.a.a.queryLiquidTask(context, iLiquidTaskQueryCallback);
    }

    public static void registerLiquidSettingChangeListener(Context context, OnLiquidSettingChangeListener onLiquidSettingChangeListener) {
        PushService.a.a.registerLiquidSettingChangeListener(context, onLiquidSettingChangeListener);
    }

    public static void setAppKeySecret(String str, String str2) {
        PushService.a.a.setAppKeySecret(str, str2);
    }

    public static void setNotificationType(int i, JSONObject jSONObject) {
        PushService.a.a.setNotificationType(i, jSONObject);
    }

    public static void queryPackageAuthDetail(Context context, String str, IPackageAuthCallbackListener iPackageAuthCallbackListener) {
        PushService.a.a.queryPackageAuthDetail(context, str, iPackageAuthCallbackListener);
    }

    public static void requestNotificationAdvance(Activity activity, INotificationPermissionCallback iNotificationPermissionCallback, int i) throws Throwable {
        PushService.a.a.requestNotificationAdvance(activity, iNotificationPermissionCallback, i);
    }

    public static void subscribeServiceChannel(Context context, String str, IServiceChannelCallback iServiceChannelCallback) {
        PushService.a.a.subscribeServiceChannel(context, str, iServiceChannelCallback);
    }

    public static void unsubscribeServiceChannel(Context context, String str, IServiceChannelCallback iServiceChannelCallback) {
        PushService.a.a.unsubscribeServiceChannel(context, str, iServiceChannelCallback);
    }

    public static void register(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        PushService.a.a.register(context, str, str2, jSONObject, iCallBackResultService);
    }

    public static void unRegister(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        PushService.a.a.unRegister(context, str, str2, jSONObject, iCallBackResultService);
    }

    public static void setPushTime(List<Integer> list, int i, int i2, int i3, int i4, JSONObject jSONObject) {
        PushService.a.a.setPushTime(list, i, i2, i3, i4, jSONObject);
    }
}
