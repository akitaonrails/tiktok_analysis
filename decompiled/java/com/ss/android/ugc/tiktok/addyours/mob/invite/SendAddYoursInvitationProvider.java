package com.ss.android.ugc.tiktok.addyours.mob.invite;

import X.C00F2;
import X.C1554960qZC;
import X.C2752014s;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;

/* JADX INFO: loaded from: classes10.dex */
public final class SendAddYoursInvitationProvider implements IAddYoursInviteEventProtocol<C00F2> {
    public final InterfaceC665370Q7z LL;

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C2752014s c2752014s;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(this.LL, "source_default_key", C2752014s.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c2752014s = (C2752014s) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        return new C00F2(c2752014s.LL, c2752014s.LLILLJJLI, c2752014s.LLILZ, c2752014s.LLILZIL, 4);
    }

    public SendAddYoursInvitationProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }
}
