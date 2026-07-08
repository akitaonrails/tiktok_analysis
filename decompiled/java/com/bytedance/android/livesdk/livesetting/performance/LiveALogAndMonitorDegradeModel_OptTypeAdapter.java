package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveALogAndMonitorDegradeModel_OptTypeAdapter extends TypeAdapter<LiveALogAndMonitorDegradeModel> {
    public final Gson LIZ;

    public LiveALogAndMonitorDegradeModel_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveALogAndMonitorDegradeModel read(C09CU c09cu) {
        LiveALogAndMonitorDegradeModel liveALogAndMonitorDegradeModel = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveALogAndMonitorDegradeModel = new LiveALogAndMonitorDegradeModel(new ArrayList(), new ArrayList());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "live_alog_degrade_allowlist")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveALogAndMonitorDegradeModel.aLogList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "live_monitor_degrade_allowlist")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveALogAndMonitorDegradeModel.monitorList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveALogAndMonitorDegradeModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveALogAndMonitorDegradeModel liveALogAndMonitorDegradeModel) {
        LiveALogAndMonitorDegradeModel liveALogAndMonitorDegradeModel2 = liveALogAndMonitorDegradeModel;
        if (liveALogAndMonitorDegradeModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_alog_degrade_allowlist");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveALogAndMonitorDegradeModel2.aLogList, String.class);
        c09dl.LJIILLIIL("live_monitor_degrade_allowlist");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveALogAndMonitorDegradeModel2.monitorList, String.class);
        c09dl.LJII();
    }
}
