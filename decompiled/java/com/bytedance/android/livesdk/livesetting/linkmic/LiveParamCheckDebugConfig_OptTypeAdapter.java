package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveParamCheckDebugConfig_OptTypeAdapter extends TypeAdapter<LiveParamCheckDebugConfig> {
    public final Gson LIZ;

    public LiveParamCheckDebugConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveParamCheckDebugConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveParamCheckDebugConfig liveParamCheckDebugConfig = new LiveParamCheckDebugConfig(false, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "save_stack_trace_online")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveParamCheckDebugConfig.setSaveStackTraceOnline(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "save_stack_trace_event_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveParamCheckDebugConfig.setSaveStackTraceEventList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveParamCheckDebugConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveParamCheckDebugConfig liveParamCheckDebugConfig) throws IOException {
        LiveParamCheckDebugConfig liveParamCheckDebugConfig2 = liveParamCheckDebugConfig;
        if (liveParamCheckDebugConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("save_stack_trace_online");
        c09dl.LJJJJJL(liveParamCheckDebugConfig2.getSaveStackTraceOnline());
        c09dl.LJIILLIIL("save_stack_trace_event_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveParamCheckDebugConfig2.getSaveStackTraceEventList(), String.class);
        c09dl.LJII();
    }
}
