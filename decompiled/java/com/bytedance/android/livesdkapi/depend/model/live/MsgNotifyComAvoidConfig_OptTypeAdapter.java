package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MsgNotifyComAvoidConfig_OptTypeAdapter extends TypeAdapter<MsgNotifyComAvoidConfig> {
    public final Gson LIZ;

    public MsgNotifyComAvoidConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MsgNotifyComAvoidConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MsgNotifyComAvoidConfig msgNotifyComAvoidConfig = new MsgNotifyComAvoidConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "component_rule_list_v2")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    msgNotifyComAvoidConfig.componentRuleListV2 = C473040Igo.LIZ(this.LIZ, c09cu, MsgNotifyComponentAvoidRuleV2.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return msgNotifyComAvoidConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MsgNotifyComAvoidConfig msgNotifyComAvoidConfig) {
        MsgNotifyComAvoidConfig msgNotifyComAvoidConfig2 = msgNotifyComAvoidConfig;
        if (msgNotifyComAvoidConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("component_rule_list_v2");
        C473040Igo.LIZLLL(this.LIZ, c09dl, msgNotifyComAvoidConfig2.componentRuleListV2, MsgNotifyComponentAvoidRuleV2.class);
        c09dl.LJII();
    }
}
