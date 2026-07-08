package com.ss.android.ugc.localnotify.work;

import X.AbstractC795160VHe;
import X.C0VPZ;
import X.C0VQ4;
import X.C0VQ5;
import X.C1387310mCn;
import X.C19328310jZ;
import X.C2188811AlT;
import X.C2524909ux;
import X.C2552009zK;
import X.C255910A1d;
import X.C292390Bd7;
import X.C786410Ut5;
import X.C795180VHg;
import X.C797970VRz;
import android.content.Context;
import android.os.Looper;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.bytedance.push.PushBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.awemepushapi.IPushApi;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class NUGuideNotifyWork extends Worker {
    @Override // androidx.work.Worker
    public final AbstractC795160VHe LJII() {
        PushBody pushBody;
        long j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLIZIZ = jCurrentTimeMillis - this.LLILLJJLI.LIZIZ.LIZIZ();
        String strLIZJ = this.LLILLJJLI.LIZIZ.LIZJ("notification_id");
        if (strLIZJ == null) {
            strLIZJ = CardStruct.IStatusCode.DEFAULT;
        }
        String strLIZJ2 = this.LLILLJJLI.LIZIZ.LIZJ("scheduled_time_string");
        if (strLIZJ2 == null) {
            strLIZJ2 = CardStruct.IStatusCode.DEFAULT;
        }
        String strLIZJ3 = this.LLILLJJLI.LIZIZ.LIZJ("push_msg_title");
        String strLIZJ4 = this.LLILLJJLI.LIZIZ.LIZJ("push_msg_content");
        String strLIZJ5 = this.LLILLJJLI.LIZIZ.LIZJ("push_msg_uri");
        C0VQ5.LIZ(C0VQ5.LIZ, strLIZJ, 4, jCurrentTimeMillis, jLIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NUGuideNotifyWork.doWork(");
        sbLIZ.append(strLIZJ);
        sbLIZ.append(": ");
        sbLIZ.append(strLIZJ2);
        sbLIZ.append(" - offset: ");
        sbLIZ.append(jLIZIZ);
        sbLIZ.append(") - START, ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(" is main? ");
        sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()));
        C2188811AlT.LIZIZ(sbLIZ);
        int iLIZ = C255910A1d.LIZ();
        if (!(1 <= iLIZ && iLIZ < 4)) {
            C0VQ4.LIZIZ.LIZIZ();
            return new C795180VHg();
        }
        PushBody pushBody2 = null;
        if (!((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJII(null)) {
            return new C795180VHg();
        }
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
            return new C795180VHg();
        }
        if (!((IPushApi) ServiceManager.get().getService(IPushApi.class)).isNotifyEnabled(this.LL)) {
            return new C795180VHg();
        }
        if (C19328310jZ.LIZIZ.LJIIIZ() == 0) {
            return new C795180VHg();
        }
        C0VPZ.LIZ.getClass();
        Integer[] numArr = C0VPZ.LIZJ;
        long jLIZ = C0VPZ.LIZ(numArr[0].intValue(), numArr[1].intValue());
        long jLIZ2 = C0VPZ.LIZ(numArr[2].intValue(), numArr[3].intValue());
        if (jLIZ > jLIZ2) {
            jLIZ2 += 86400000;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if ((((jLIZ > jCurrentTimeMillis2 ? 1 : (jLIZ == jCurrentTimeMillis2 ? 0 : -1)) <= 0 && (jCurrentTimeMillis2 > jLIZ2 ? 1 : (jCurrentTimeMillis2 == jLIZ2 ? 0 : -1)) <= 0) || ComplianceServiceProvider.LJIL().LJJJJJL(jCurrentTimeMillis2)) && !C2552009zK.LIZ) {
            return new C795180VHg();
        }
        if (C255910A1d.LIZ() == 3 && !Intrinsics.LJFF(strLIZJ.substring(strLIZJ.length() - 1), CardStruct.IStatusCode.DEFAULT)) {
            long jLJI = ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJI();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isLastLaunchToday(");
            sbLIZ2.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(Long.valueOf(jLJI)));
            sbLIZ2.append(')');
            C2188811AlT.LIZIZ(sbLIZ2);
            if (C1387310mCn.LJII(jLJI) && !C2524909ux.LIZ) {
                return new C795180VHg();
            }
            C797970VRz.LIZ.getClass();
            if (C797970VRz.LIZJ() && !C292390Bd7.LIZ) {
                return new C795180VHg();
            }
        }
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        if (strLIZJ3 == null) {
            strLIZJ3 = "TikTok";
        }
        if (strLIZJ4 == null) {
            strLIZJ4 = "TikTok";
        }
        if (strLIZJ5 == null) {
            strLIZJ5 = "TikTok";
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("doNotify(");
        sbLIZ3.append(strLIZJ3);
        sbLIZ3.append(", ");
        sbLIZ3.append(strLIZJ4);
        sbLIZ3.append(", ");
        sbLIZ3.append(strLIZJ5);
        sbLIZ3.append(')');
        C2188811AlT.LIZIZ(sbLIZ3);
        try {
            pushBody = new PushBody(new JSONObject());
            j = iCurrentTimeMillis;
        } catch (JSONException e) {
            e = e;
        }
        try {
            pushBody.id = j;
            pushBody.rid64 = j;
            pushBody.open_url = strLIZJ5;
            pushBody.title = strLIZJ3;
            pushBody.text = strLIZJ4;
            pushBody.imageUrl = "";
            pushBody.imageType = 0;
        } catch (JSONException e2) {
            e = e2;
            pushBody2 = pushBody;
            TryCatchGuardChecker.doCheck(e);
            pushBody = pushBody2;
        }
        if (pushBody != null) {
            C797970VRz.LIZLLL(C797970VRz.LIZ, pushBody);
        }
        ((IPushApi) ServiceManager.get().getService(IPushApi.class)).doNULocalNotify(this.LL, iCurrentTimeMillis, strLIZJ3, strLIZJ4, strLIZJ5);
        return new C795180VHg();
    }

    public NUGuideNotifyWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
