package com.ss.bduploader.logupload;

import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.bduploader.BDUploadLog;
import com.ss.bduploader.BDUploadUtil;
import com.ss.bduploader.UploadEventManager;
import com.ss.bduploader.net.BDUploadThreadPool;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AppLogEngineUploader implements VideoEventEngineUploader {

    public static class Holder {
        public static final AppLogEngineUploader instance = new AppLogEngineUploader();
    }

    public AppLogEngineUploader() {
    }

    public static AppLogEngineUploader getInstance() {
        return Holder.instance;
    }

    public static void logPrint(final JSONObject jSONObject) {
        BDUploadThreadPool.addExecuteTask(new Runnable() { // from class: com.ss.bduploader.logupload.AppLogEngineUploader.1
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("AppLogEngineUploader@8943.logPrint$2");
                com_ss_bduploader_logupload_AppLogEngineUploader$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("AppLogEngineUploader@8943.logPrint$2");
            }

            public void com_ss_bduploader_logupload_AppLogEngineUploader$1__run$___twin___() {
                if (jSONObject == null) {
                    return;
                }
                BDUploadLog.i("ttmn", "++++++++++++++++");
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    try {
                        String next = itKeys.next();
                        if (next != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("++++:");
                            sbLIZ.append(next);
                            sbLIZ.append(":");
                            sbLIZ.append(jSONObject.get(next));
                            BDUploadLog.i("ttmn", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                BDUploadLog.i("ttmn", "++++++++++++++++++++");
            }

            public static void com_ss_bduploader_logupload_AppLogEngineUploader$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_ss_bduploader_logupload_AppLogEngineUploader$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // com.ss.bduploader.logupload.VideoEventEngineUploader
    public void onEventV3(String str, JSONObject jSONObject) {
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            logPrint(jSONObject);
            if (BDUploadUtil.eventEngineUploader != null) {
                setJsonValue(jSONObject, "upload_log_type", "2");
                BDUploadUtil.eventEngineUploader.onEventV3(str, jSONObject);
                return;
            }
            setJsonValue(jSONObject, "upload_log_type", "1");
            try {
                Class.forName("com.ss.android.common.lib.AppLogNewUtils").getMethod("onEventV3", String.class, JSONObject.class).invoke(null, str, jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                setJsonValue(jSONObject, "upload_log_type", CardStruct.IStatusCode.DEFAULT);
                UploadEventManager.instance.putEvent(jSONObject);
            }
        }
    }

    private JSONObject setJsonValue(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }
}
