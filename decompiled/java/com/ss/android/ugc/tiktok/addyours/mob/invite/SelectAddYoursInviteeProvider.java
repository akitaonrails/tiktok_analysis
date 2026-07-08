package com.ss.android.ugc.tiktok.addyours.mob.invite;

import X.C0240006c;
import X.C0XQ7;
import X.C1554960qZC;
import X.C2752014s;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;

/* JADX INFO: loaded from: classes10.dex */
public final class SelectAddYoursInviteeProvider implements IAddYoursInviteEventProtocol<C0240006c> {
    public final InterfaceC665370Q7z LL;

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C2752014s c2752014s;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(this.LL, "source_default_key", C2752014s.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c2752014s = (C2752014s) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        return new C0240006c(c2752014s.LL, C0XQ7.LJFF().getCurUserId());
    }

    public SelectAddYoursInviteeProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }
}
