package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C01GW;
import X.C13LP;
import X.C452501pT;
import X.C467400IUo;
import X.InterfaceC1602300rnY;
import X.InterfaceC481880Iv4;
import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.bytedance.android.livesdkapi.host.ILiveStatusCheckServiceV2;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHostStatusCheckerV2 implements ILiveStatusCheckServiceV2 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(149));

    @Override // com.bytedance.android.livesdkapi.host.ILiveStatusCheckServiceV2
    public final void gQ2(final C467400IUo c467400IUo, final String str) {
        InterfaceC481880Iv4 interfaceC481880Iv4 = new InterfaceC481880Iv4() { // from class: X.0Iuu
            @Override // X.InterfaceC481880Iv4
            public final C481790Iuv q(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage) {
                if (c467400IUo.q(feedUserRoomMonitorMessage)) {
                    return new C481790Iuv(true, false, str);
                }
                return new C481790Iuv(false, false, str);
            }
        };
        InterfaceC1602300rnY interfaceC1602300rnY = (InterfaceC1602300rnY) this.LL.getValue();
        if (interfaceC1602300rnY != null) {
            interfaceC1602300rnY.LIZLLL(interfaceC481880Iv4, str);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveStatusCheckServiceV2
    public final void hM0(List<String> list, String str, boolean z, Integer num) {
        int iIntValue;
        InterfaceC1602300rnY interfaceC1602300rnY = (InterfaceC1602300rnY) this.LL.getValue();
        if (interfaceC1602300rnY != null) {
            Set setLLIIIZ = C13LP.LLIIIZ(list);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 5;
            }
            interfaceC1602300rnY.LJIJ(iIntValue, str, setLLIIIZ, z);
        }
    }
}
