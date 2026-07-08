package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.EventDrivenConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ClientAiEventDrivenConfig_OptTypeAdapter extends TypeAdapter<ClientAiEventDrivenConfig> {
    public final Gson LIZ;

    public ClientAiEventDrivenConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ClientAiEventDrivenConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ClientAiEventDrivenConfig clientAiEventDrivenConfig = new ClientAiEventDrivenConfig(null, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "event_config_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    clientAiEventDrivenConfig.eventConfigList = C473040Igo.LIZ(this.LIZ, c09cu, EventDrivenConfig.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "enabled_strategies")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    clientAiEventDrivenConfig.enabledStrategies = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return clientAiEventDrivenConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ClientAiEventDrivenConfig clientAiEventDrivenConfig) {
        ClientAiEventDrivenConfig clientAiEventDrivenConfig2 = clientAiEventDrivenConfig;
        if (clientAiEventDrivenConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("event_config_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, clientAiEventDrivenConfig2.eventConfigList, EventDrivenConfig.class);
        c09dl.LJIILLIIL("enabled_strategies");
        C473040Igo.LIZLLL(this.LIZ, c09dl, clientAiEventDrivenConfig2.enabledStrategies, String.class);
        c09dl.LJII();
    }
}
