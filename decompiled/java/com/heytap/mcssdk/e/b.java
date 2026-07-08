package com.heytap.mcssdk.e;

import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.utils.e;
import com.heytap.mcssdk.utils.i;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.statis.StatisticUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes14.dex */
public class b implements c {
    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, DataMessage dataMessage) {
        if (context == null) {
            e.b("context is null");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Receive revokeMessage  extra : ");
        sbLIZ.append(dataMessage.getStatisticsExtra());
        sbLIZ.append("notifyId :");
        sbLIZ.append(dataMessage.getNotifyID());
        sbLIZ.append("messageId : ");
        sbLIZ.append(dataMessage.getTaskID());
        e.b(C2188811AlT.LIZIZ(sbLIZ));
        ((NotificationManager) C786410Ut5.H2(context, "notification")).cancel(dataMessage.getNotifyID());
        b(context, dataMessage);
    }

    private void b(Context context, DataMessage dataMessage) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(dataMessage);
        map.put(dataMessage.getEventId(), arrayList);
        StatisticUtils.statisticEvent(context, map);
    }

    @Override // com.heytap.mcssdk.e.c
    public void a(final Context context, Intent intent, BaseMode baseMode, final IDataMessageCallBackService iDataMessageCallBackService) {
        if (baseMode != null && baseMode.getType() == 4103) {
            final DataMessage dataMessage = (DataMessage) baseMode;
            if (iDataMessageCallBackService != null) {
                i.b(new Runnable() { // from class: com.heytap.mcssdk.e.b.1
                    public void com_heytap_mcssdk_e_b$1__run$___twin___() {
                        if (dataMessage.getMsgCommand() == 1) {
                            b.this.a(context, dataMessage);
                        } else {
                            iDataMessageCallBackService.processMessage(context, dataMessage);
                        }
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        C1C7U.LIZ("b@3b54.a$1");
                        com_heytap_mcssdk_e_b$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        C1C7U.LIZIZ("b@3b54.a$1");
                    }

                    public static void com_heytap_mcssdk_e_b$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        try {
                            anonymousClass1.com_heytap_mcssdk_e_b$1__run$___twin___();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }
                });
            }
        }
    }
}
