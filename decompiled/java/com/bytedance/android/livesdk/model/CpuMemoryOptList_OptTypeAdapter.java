package com.bytedance.android.livesdk.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class CpuMemoryOptList_OptTypeAdapter extends TypeAdapter<CpuMemoryOptList> {
    public final Gson LIZ;

    public CpuMemoryOptList_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CpuMemoryOptList read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CpuMemoryOptList cpuMemoryOptList = new CpuMemoryOptList();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "live_cpu_memory_opt_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    cpuMemoryOptList.optList = C473040Igo.LIZIZ(this.LIZ, c09cu, Integer.TYPE);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return cpuMemoryOptList;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CpuMemoryOptList cpuMemoryOptList) {
        CpuMemoryOptList cpuMemoryOptList2 = cpuMemoryOptList;
        if (cpuMemoryOptList2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_cpu_memory_opt_list");
        C473040Igo.LJ(this.LIZ, c09dl, cpuMemoryOptList2.optList, Integer.TYPE);
        c09dl.LJII();
    }
}
