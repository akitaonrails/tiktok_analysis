package com.bytedance.im.core.repair;

import X.C09AY;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C868780Y6i;
import X.C871320YGc;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final class RepairManagerV2$handler$2 extends C09AY implements Function0<AnonymousClass1> {
    public final /* synthetic */ RepairManagerV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairManagerV2$handler$2(RepairManagerV2 repairManagerV2) {
        super(0);
        this.LL = repairManagerV2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.im.core.repair.RepairManagerV2$handler$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ AnonymousClass1 invoke() {
        this.LL.LIZIZ.start();
        Looper looperW2 = C786410Ut5.W2(this.LL.LIZIZ);
        final RepairManagerV2 repairManagerV2 = this.LL;
        return new BPEAHandler(looperW2) { // from class: com.bytedance.im.core.repair.RepairManagerV2$handler$2.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C871320YGc c871320YGc;
                C1C7U.LIZ("RepairManagerV2@ec47.handler$2$1");
                RepairManagerV2 repairManagerV22 = repairManagerV2;
                int i = message.what;
                C868780Y6i c868780Y6iLIZLLL = repairManagerV22.LIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pollingMsgForInbox ");
                sbLIZ.append(i);
                C868780Y6i.LJ(c868780Y6iLIZLLL, "RepairManagerV2 ", C2188811AlT.LIZIZ(sbLIZ), 4);
                if (!repairManagerV22.LIZ.LJ().LJ().isAppBackground()) {
                    if (repairManagerV22.LIZ.LJ().LIZ().LIZIZ() && (c871320YGc = repairManagerV22.LJ.get(i)) != null) {
                        repairManagerV22.LIZ.LJIIZILJ().getDomain().LIZJ().LLIIJLIL(i, c871320YGc.LIZ, null, null, false);
                    }
                    repairManagerV22.LIZIZ().sendEmptyMessageDelayed(i, repairManagerV22.LIZJ(i) * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                }
                C1C7U.LIZIZ("RepairManagerV2@ec47.handler$2$1");
            }
        };
    }
}
