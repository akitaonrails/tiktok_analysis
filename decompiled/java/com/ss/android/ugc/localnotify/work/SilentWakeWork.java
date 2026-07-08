package com.ss.android.ugc.localnotify.work;

import X.AbstractC795160VHe;
import X.C0VQ5;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C795180VHg;
import android.content.Context;
import android.os.Looper;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class SilentWakeWork extends Worker {
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
        C0VQ5.LIZ(C0VQ5.LIZ, strLIZJ, 0, jCurrentTimeMillis, jLIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SilentWakeWork.doWork(");
        sbLIZ.append(strLIZJ);
        sbLIZ.append(": ");
        sbLIZ.append(str);
        sbLIZ.append(" - offset: ");
        sbLIZ.append(jLIZIZ);
        sbLIZ.append(") START, ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(" is main? ");
        sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()));
        C2188811AlT.LIZIZ(sbLIZ);
        return new C795180VHg();
    }

    public SilentWakeWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
