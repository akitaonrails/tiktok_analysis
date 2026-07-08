package com.heytap.mcssdk.d;

import X.C2188811AlT;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.DataMessage;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class c extends d {
    @Override // com.heytap.mcssdk.d.e
    public BaseMode a(Context context, int i, Intent intent) {
        if (4103 != i && 4098 != i && 4108 != i) {
            return null;
        }
        BaseMode baseModeA = a(intent, i);
        com.heytap.mcssdk.f.a.a(context, "push_transmit", (DataMessage) baseModeA);
        return baseModeA;
    }

    @Override // com.heytap.mcssdk.d.d
    public BaseMode a(Intent intent, int i) {
        try {
            DataMessage dataMessage = new DataMessage();
            dataMessage.setMessageID(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "messageID")));
            dataMessage.setTaskID(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "taskID")));
            dataMessage.setGlobalId(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "globalID")));
            dataMessage.setAppPackage(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "appPackage")));
            dataMessage.setTitle(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "title")));
            dataMessage.setContent(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "content")));
            dataMessage.setDescription(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "description")));
            String strD = com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "notifyID"));
            dataMessage.setNotifyID(TextUtils.isEmpty(strD) ? 0 : CastIntegerProtector.parseInt(strD));
            dataMessage.setMiniProgramPkg(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "miniProgramPkg")));
            dataMessage.setMessageType(i);
            dataMessage.setEventId(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "eventId")));
            dataMessage.setStatisticsExtra(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "statistics_extra")));
            String strD2 = com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "data_extra"));
            dataMessage.setDataExtra(strD2);
            String strA = a(strD2);
            dataMessage.setMsgCommand(TextUtils.isEmpty(strA) ? 0 : CastIntegerProtector.parseInt(strA));
            dataMessage.setBalanceTime(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "balanceTime")));
            dataMessage.setStartDate(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "startDate")));
            dataMessage.setEndDate(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "endDate")));
            dataMessage.setTimeRanges(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "timeRanges")));
            dataMessage.setRule(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "rule")));
            dataMessage.setForcedDelivery(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "forcedDelivery")));
            dataMessage.setDistinctContent(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "distinctBycontent")));
            dataMessage.setAppId(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "appID")));
            return dataMessage;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OnHandleIntent--");
            sbLIZ.append(e.getMessage());
            com.heytap.mcssdk.utils.e.b(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public String a(String str) {
        String strOptString = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            strOptString = new JSONObject(str).optString("msg_command");
            return strOptString;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            com.heytap.mcssdk.utils.e.b(e.getMessage());
            return strOptString;
        }
    }

    public static String INVOKEVIRTUAL_com_heytap_mcssdk_d_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
