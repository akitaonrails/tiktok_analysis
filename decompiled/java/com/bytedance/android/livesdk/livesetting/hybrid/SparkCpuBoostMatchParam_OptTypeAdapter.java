package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class SparkCpuBoostMatchParam_OptTypeAdapter extends TypeAdapter<SparkCpuBoostMatchParam> {
    public final Gson LIZ;

    public SparkCpuBoostMatchParam_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SparkCpuBoostMatchParam read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SparkCpuBoostMatchParam sparkCpuBoostMatchParam = new SparkCpuBoostMatchParam();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "pattern_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    sparkCpuBoostMatchParam.patternList = (String[]) this.LIZ.LJIIJ(String[].class).read(c09cu);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return sparkCpuBoostMatchParam;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SparkCpuBoostMatchParam sparkCpuBoostMatchParam) {
        SparkCpuBoostMatchParam sparkCpuBoostMatchParam2 = sparkCpuBoostMatchParam;
        if (sparkCpuBoostMatchParam2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("pattern_list");
        this.LIZ.LJIIJ(String[].class).write(c09dl, sparkCpuBoostMatchParam2.patternList);
        c09dl.LJII();
    }
}
