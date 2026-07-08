package com.ss.android.ugc.localnotify.work;

import X.AbstractC795160VHe;
import X.C0CQL;
import X.C0VPZ;
import X.C0VQ2;
import X.C0VQ5;
import X.C11S5;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2552009zK;
import X.C292390Bd7;
import X.C786410Ut5;
import X.C795180VHg;
import X.C797270VPh;
import X.C797970VRz;
import Y.AfS178S0100000_9;
import Y.AfS182S0100000_13;
import android.content.Context;
import android.os.Looper;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.localnotify.api.LocalNotifyInfoApi;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class DoNotifyWork extends Worker {
    @Override // androidx.work.Worker
    public final AbstractC795160VHe LJII() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLIZIZ = jCurrentTimeMillis - this.LLILLJJLI.LIZIZ.LIZIZ();
        String strLIZJ = this.LLILLJJLI.LIZIZ.LIZJ("notification_id");
        String str = CardStruct.IStatusCode.DEFAULT;
        if (strLIZJ == null) {
            strLIZJ = CardStruct.IStatusCode.DEFAULT;
        }
        String strLIZJ2 = this.LLILLJJLI.LIZIZ.LIZJ("scheduled_time_string");
        if (strLIZJ2 != null) {
            str = strLIZJ2;
        }
        C0VQ5.LIZ(C0VQ5.LIZ, strLIZJ, 2, jCurrentTimeMillis, jLIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DoNotifyWork.doWork(");
        sbLIZ.append(strLIZJ);
        sbLIZ.append(": ");
        sbLIZ.append(str);
        sbLIZ.append(" - offset: ");
        sbLIZ.append(jLIZIZ);
        sbLIZ.append(") - START, ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(" is main? ");
        sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()));
        C2188811AlT.LIZIZ(sbLIZ);
        if (!C797270VPh.LIZ) {
            C0VQ2.LIZ().LJFF();
            return new C795180VHg();
        }
        C797970VRz.LIZ.getClass();
        if (C797970VRz.LIZJ() && !C292390Bd7.LIZ) {
            return new C795180VHg();
        }
        if (!C2214201BlK.LJIIJJI) {
            return new C795180VHg();
        }
        C0VPZ.LIZ.getClass();
        Integer[] numArr = C0VPZ.LIZIZ;
        long jLIZ = C0VPZ.LIZ(numArr[0].intValue(), numArr[1].intValue());
        long jLIZ2 = C0VPZ.LIZ(numArr[2].intValue(), numArr[3].intValue());
        if (jLIZ > jLIZ2) {
            jLIZ2 += 86400000;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (((jLIZ <= jCurrentTimeMillis2 && jCurrentTimeMillis2 <= jLIZ2) || ComplianceServiceProvider.LJIL().LJJJJJL(jCurrentTimeMillis2)) && !C2552009zK.LIZ) {
            return new C795180VHg();
        }
        if (!((IPushApi) ServiceManager.get().getService(IPushApi.class)).isNotifyEnabled(this.LL)) {
            return new C795180VHg();
        }
        JSONObject jSONObject = new JSONObject();
        LocalNotifyInfoApi.LIZ.getClass();
        C0CQL.LIZIZ.getLocalNotifyInfo().LJL(C11S5.LIZ()).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS182S0100000_13(jSONObject, 108), new AfS178S0100000_9(jSONObject, 63));
        return new C795180VHg();
    }

    public DoNotifyWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
