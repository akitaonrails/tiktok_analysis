package com.ss.android.ugc.aweme.legoImp.task.publishtest;

import X.C786410Ut5;
import X.C805380Via;
import Y.ARunnableS46S0300000_13;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.e;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.experiment.publishtest.PublishTestSupportSetting$PublishTestSupportConfig;
import com.ss.android.ugc.aweme.net.partner.RigPathBystander;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class PublishDrillServiceImpl implements IPublishDrillService {
    public volatile Map<String, String> LIZ;

    public static String LIZLLL(String str) {
        if ("paths_in_crash_ext".equals(str)) {
            RigPathBystander.LIZ.getClass();
            return RigPathBystander.LIZLLL.toString();
        }
        if ("drill_publish_data".equals(str)) {
            return String.valueOf(System.currentTimeMillis());
        }
        return C786410Ut5.j4("unsupport tag %s", new Object[]{str});
    }

    public final Map<String, String> LIZJ(PublishTestSupportSetting$PublishTestSupportConfig publishTestSupportSetting$PublishTestSupportConfig) {
        if (this.LIZ != null) {
            return this.LIZ;
        }
        this.LIZ = new HashMap();
        String str = publishTestSupportSetting$PublishTestSupportConfig.customerDataTags;
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                ((HashMap) this.LIZ).put(str2, LIZLLL(str2));
            }
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.legoImp.task.publishtest.IPublishDrillService
    public final void LIZ(Context context, PublishTestSupportSetting$PublishTestSupportConfig publishTestSupportSetting$PublishTestSupportConfig) {
        String string;
        try {
            Object[] objArr = new Object[1];
            if (publishTestSupportSetting$PublishTestSupportConfig != null) {
                string = publishTestSupportSetting$PublishTestSupportConfig.toString();
            } else {
                string = "null";
            }
            objArr[0] = string;
            C786410Ut5.j4("PublishTestSupportSetting config %s ", objArr);
            if (publishTestSupportSetting$PublishTestSupportConfig != null && publishTestSupportSetting$PublishTestSupportConfig.testTriggerDelay >= 0) {
                new BPEAThread(new ARunnableS46S0300000_13(this, publishTestSupportSetting$PublishTestSupportConfig, context, 12)).start();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C805380Via.LJ("LOG_TYPE_PUBLISH_DRILL_TEST", "drill_inner_error", th);
        }
    }

    @Override // com.ss.android.ugc.aweme.legoImp.task.publishtest.IPublishDrillService
    public final void LIZIZ(Context context, String str) {
        if (str != null) {
            e eVar = new e();
            eVar.LJIILL = true;
            LIZ(context, (PublishTestSupportSetting$PublishTestSupportConfig) GsonProtectorUtils.fromJson(eVar.LIZ(), str, PublishTestSupportSetting$PublishTestSupportConfig.class));
        }
    }

    public final void LJ(Context context, PublishTestSupportSetting$PublishTestSupportConfig publishTestSupportSetting$PublishTestSupportConfig) {
        Object objLIZLLL;
        if (!TextUtils.isEmpty(publishTestSupportSetting$PublishTestSupportConfig.drillPath) && !TextUtils.isEmpty(publishTestSupportSetting$PublishTestSupportConfig.appLogEvent)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                jSONObject.put("event_v3_reserved_field_time_stamp", System.currentTimeMillis());
                jSONObject.put("drill_path", publishTestSupportSetting$PublishTestSupportConfig.drillPath);
                if (!TextUtils.isEmpty(publishTestSupportSetting$PublishTestSupportConfig.appLogWithDataTags)) {
                    Map<String, String> mapLIZJ = LIZJ(publishTestSupportSetting$PublishTestSupportConfig);
                    HashMap map = new HashMap();
                    for (String str : publishTestSupportSetting$PublishTestSupportConfig.appLogWithDataTags.split(",")) {
                        HashMap map2 = (HashMap) mapLIZJ;
                        if (map2.containsKey(str)) {
                            objLIZLLL = map2.get(str);
                        } else {
                            objLIZLLL = LIZLLL(str);
                        }
                        map.put(str, objLIZLLL);
                    }
                    jSONObject.put("custom_data", C786410Ut5.J3(new JSONObject(map)));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            AppLog.onEvent(context, "event_v3", publishTestSupportSetting$PublishTestSupportConfig.appLogEvent, null, 0L, 0L, jSONObject);
        }
    }
}
