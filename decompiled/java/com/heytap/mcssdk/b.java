package com.heytap.mcssdk;

import android.app.Activity;
import android.content.Context;
import com.heytap.mcssdk.liquid.DownloadRequest;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ILiquidTaskQueryCallback;
import com.heytap.msp.push.callback.INotificationPermissionCallback;
import com.heytap.msp.push.callback.IPackageAuthCallbackListener;
import com.heytap.msp.push.callback.IServiceChannelCallback;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public interface b {
    void callBackTimePushVerifyResult(JSONObject jSONObject);

    void cancelNotification(JSONObject jSONObject);

    void clearNotificationAdvanceCallback();

    void clearNotificationType();

    void clearNotificationType(JSONObject jSONObject);

    void clearNotifications();

    void clearNotifications(JSONObject jSONObject);

    void disableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService);

    void enableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService);

    long getAppLimitCLickTime();

    void getAppNotificationSwitch(IGetAppNotificationCallBackService iGetAppNotificationCallBackService);

    void getNotificationStatus();

    void getNotificationStatus(JSONObject jSONObject);

    void getRegister();

    void getRegister(JSONObject jSONObject);

    String getRegisterID();

    boolean isSupportLiquid(Context context);

    boolean isSupportLiquidBatch(Context context);

    void openNotificationSettings();

    void openNotificationSettings(JSONObject jSONObject);

    void pausePush();

    void pausePush(JSONObject jSONObject);

    void queryLiquidTask(Context context, ILiquidTaskQueryCallback iLiquidTaskQueryCallback);

    void queryPackageAuthDetail(Context context, String str, IPackageAuthCallbackListener iPackageAuthCallbackListener);

    void register(Context context, String str, String str2, ICallBackResultService iCallBackResultService);

    void register(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService);

    void requestDownloadSeeding(DownloadRequest downloadRequest);

    void requestDownloadSeedingList(List<DownloadRequest> list);

    void requestNotificationAdvance(Activity activity, INotificationPermissionCallback iNotificationPermissionCallback, int i);

    void requestNotificationPermission();

    void resumePush();

    void resumePush(JSONObject jSONObject);

    void setNotificationType(int i);

    void setNotificationType(int i, JSONObject jSONObject);

    void setPushTime(List<Integer> list, int i, int i2, int i3, int i4);

    void setPushTime(List<Integer> list, int i, int i2, int i3, int i4, JSONObject jSONObject);

    void setRegisterID(String str);

    void subscribeServiceChannel(Context context, String str, IServiceChannelCallback iServiceChannelCallback);

    void unRegister();

    void unRegister(JSONObject jSONObject);

    void unsubscribeServiceChannel(Context context, String str, IServiceChannelCallback iServiceChannelCallback);
}
