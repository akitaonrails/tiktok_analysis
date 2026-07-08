package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class Metrics2BizMapping_OptTypeAdapter extends TypeAdapter<Metrics2BizMapping> {
    public final Gson LIZ;

    public Metrics2BizMapping_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final Metrics2BizMapping read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        Metrics2BizMapping metrics2BizMapping = new Metrics2BizMapping();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "metrics_score")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    metrics2BizMapping.metricsScore = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "biz_level")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    metrics2BizMapping.bizLevel = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return metrics2BizMapping;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Metrics2BizMapping metrics2BizMapping) {
        Metrics2BizMapping metrics2BizMapping2 = metrics2BizMapping;
        if (metrics2BizMapping2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("metrics_score");
        Gson gson = this.LIZ;
        List<Integer> list = metrics2BizMapping2.metricsScore;
        Class cls = Integer.TYPE;
        C473040Igo.LIZLLL(gson, c09dl, list, cls);
        c09dl.LJIILLIIL("biz_level");
        C473040Igo.LIZLLL(this.LIZ, c09dl, metrics2BizMapping2.bizLevel, cls);
        c09dl.LJII();
    }
}
