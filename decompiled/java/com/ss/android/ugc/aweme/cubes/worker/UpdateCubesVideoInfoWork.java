package com.ss.android.ugc.aweme.cubes.worker;

import X.AbstractC795160VHe;
import X.C0VQD;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C786410Ut5;
import X.C795180VHg;
import X.C811110Vrp;
import X.C844470XAv;
import X.InterfaceC809720Vpa;
import android.content.Context;
import android.os.Looper;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class UpdateCubesVideoInfoWork extends Worker {
    @Override // androidx.work.Worker
    public final AbstractC795160VHe LJII() {
        C0VQD c0vqd = C0VQD.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c0vqd.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("launch_timestamp", String.valueOf(jCurrentTimeMillis));
        C20684815ws.LJIILLIIL("google_cubes_wm_launch", c2344009Gk.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateCubesVideoInfoWork.doWork(");
        sbLIZ.append(this.LLILLJJLI.LIZ);
        sbLIZ.append(": ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(" is main? ");
        sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()));
        C2188811AlT.LIZIZ(sbLIZ);
        C811110Vrp c811110Vrp = C811110Vrp.LIZ;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        InterfaceC809720Vpa interfaceC809720Vpa = new InterfaceC809720Vpa() { // from class: X.0VPt
            @Override // X.InterfaceC809720Vpa
            public final void LIZ() {
                if (!C0VPX.LIZ) {
                    C0VQB.LIZIZ.LIZLLL();
                    C811110Vrp.LIZ.getClass();
                    C811110Vrp.LJ(9);
                    return;
                }
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    C811110Vrp.LIZ.getClass();
                    C811110Vrp.LIZ();
                    return;
                }
                C811110Vrp.LIZ.getClass();
                C811110Vrp.LIZIZ();
                this.LIZ.getClass();
                for (EnumC797240VPe enumC797240VPe : C0VPW.LIZ()) {
                    int duration = ((enumC797240VPe.getDuration() / 60) + enumC797240VPe.getStartHour()) % 24;
                    int duration2 = enumC797240VPe.getDuration() % 60;
                    SimpleDateFormat simpleDateFormat = C0VPY.LIZ;
                    long jLIZ = C0VPY.LIZ(enumC797240VPe.getStartHour(), 0);
                    long jLIZ2 = C0VPY.LIZ(duration, duration2);
                    if (jLIZ > jLIZ2) {
                        jLIZ2 += TimeUnit.DAYS.toMillis(1L);
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jLIZ <= jCurrentTimeMillis2 && jCurrentTimeMillis2 <= jLIZ2) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("During ");
                        sbLIZ2.append(enumC797240VPe.getStartHour());
                        sbLIZ2.append(":00 ~ ");
                        sbLIZ2.append(duration);
                        sbLIZ2.append(':');
                        sbLIZ2.append(duration2);
                        sbLIZ2.append(", can update!");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C0VQB.LIZIZ.LIZ(EnumC1483805rQ.UPDATE_BY_SCHEDULER);
                        return;
                    }
                }
                ((C0VQ1) C797440VPy.LIZ.getValue()).LIZIZ(C0VPW.LIZ);
            }

            @Override // X.InterfaceC809720Vpa
            public final void LIZIZ(C0VQL c0vql) {
                int i = C0VQI.LIZ[c0vql.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onInitFail(ERR_ELSE: ");
                        sbLIZ2.append(c0vql);
                        sbLIZ2.append(')');
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C0VQB.LIZIZ.LIZLLL();
                        return;
                    }
                    C0VQB.LIZIZ.LIZLLL();
                }
            }
        };
        c811110Vrp.getClass();
        C811110Vrp.LIZLLL(contextLIZ, interfaceC809720Vpa);
        return new C795180VHg();
    }

    public UpdateCubesVideoInfoWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
