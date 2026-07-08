package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.QualcommGpuHintSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class QualcommGpuHintSettings_GpuHintSettings_OptTypeAdapter extends TypeAdapter<QualcommGpuHintSettings.GpuHintSettings> {
    public final Gson LIZ;

    public QualcommGpuHintSettings_GpuHintSettings_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final QualcommGpuHintSettings.GpuHintSettings read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        QualcommGpuHintSettings.GpuHintSettings gpuHintSettings = new QualcommGpuHintSettings.GpuHintSettings(false, 0, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1547555666) {
                    if (iHashCode != -481544705) {
                        if (iHashCode == -389978843 && strLJJJJ.equals("webcast_broadcast_qualcomm_gpu_hint_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gpuHintSettings.gpuHintType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("webcast_broadcast_qualcomm_gpu_hint_duration")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            gpuHintSettings.gpuHintDuration = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("webcast_broadcast_qualcomm_gpu_hint_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gpuHintSettings.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return gpuHintSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, QualcommGpuHintSettings.GpuHintSettings gpuHintSettings) throws IOException {
        QualcommGpuHintSettings.GpuHintSettings gpuHintSettings2 = gpuHintSettings;
        if (gpuHintSettings2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("webcast_broadcast_qualcomm_gpu_hint_enable");
        c09dl.LJJJJJL(gpuHintSettings2.enable);
        c09dl.LJIILLIIL("webcast_broadcast_qualcomm_gpu_hint_type");
        c09dl.LJJJJ(Integer.valueOf(gpuHintSettings2.gpuHintType));
        c09dl.LJIILLIIL("webcast_broadcast_qualcomm_gpu_hint_duration");
        c09dl.LJJJJ(Integer.valueOf(gpuHintSettings2.gpuHintDuration));
        c09dl.LJII();
    }
}
