package com.bytedance.android.livesdk.qa;

import X.C0UNW;
import X.C0UXL;
import X.C1109420eya;
import X.C1161920gLG;
import X.C162200jk;
import X.C473410IhP;
import X.EnumC1107860ew4;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.livesdk.dataChannel.RefreshMoreRedDotEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes13.dex */
public class QAService implements IQAService {
    public volatile boolean LL;

    @Override // com.bytedance.android.live.qa.IQAService
    public final void initPublicScreenConfiguration() {
        if (this.LL) {
            return;
        }
        this.LL = true;
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).jc0(new C1109420eya());
    }

    @Override // com.bytedance.android.live.qa.IQAService
    public final void y02() {
        ((IPinCardService) C1161920gLG.LIZJ(IPinCardService.class)).Y70(EnumC1107860ew4.QUESTION, new C0UNW());
    }

    @Override // com.bytedance.android.live.qa.IQAService
    public final void XC2() {
        C473410IhP.LIZ().removeCallbacksAndMessages(C0UXL.LIZ);
        C473410IhP.LIZ().removeCallbacksAndMessages(C0UXL.LIZIZ);
    }

    @Override // com.bytedance.android.live.qa.IQAService
    public final int L12() {
        return C162200jk.LIZ;
    }

    @Override // com.bytedance.android.live.qa.IQAService
    public final void mj0(DataChannel dataChannel) {
        C162200jk.LIZ++;
        if (dataChannel != null) {
            dataChannel.FQ2(RefreshMoreRedDotEvent.class);
        }
    }
}
