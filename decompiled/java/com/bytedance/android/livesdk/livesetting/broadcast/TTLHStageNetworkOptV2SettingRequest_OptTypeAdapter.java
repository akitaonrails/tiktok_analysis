package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class TTLHStageNetworkOptV2SettingRequest_OptTypeAdapter extends TypeAdapter<TTLHStageNetworkOptV2SettingRequest> {
    @Override // com.google.gson.TypeAdapter
    public final TTLHStageNetworkOptV2SettingRequest read(C09CU c09cu) {
        TTLHStageNetworkOptV2SettingRequest tTLHStageNetworkOptV2SettingRequest = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            tTLHStageNetworkOptV2SettingRequest = new TTLHStageNetworkOptV2SettingRequest(1, 30);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "group")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        tTLHStageNetworkOptV2SettingRequest.setGroup(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "ttnet_network_status_update_interval")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        tTLHStageNetworkOptV2SettingRequest.setTtNetInterval(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return tTLHStageNetworkOptV2SettingRequest;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHStageNetworkOptV2SettingRequest tTLHStageNetworkOptV2SettingRequest) {
        TTLHStageNetworkOptV2SettingRequest tTLHStageNetworkOptV2SettingRequest2 = tTLHStageNetworkOptV2SettingRequest;
        if (tTLHStageNetworkOptV2SettingRequest2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("group");
        c09dl.LJJJJ(Integer.valueOf(tTLHStageNetworkOptV2SettingRequest2.getGroup()));
        c09dl.LJIILLIIL("ttnet_network_status_update_interval");
        c09dl.LJJJJ(Integer.valueOf(tTLHStageNetworkOptV2SettingRequest2.getTtNetInterval()));
        c09dl.LJII();
    }
}
