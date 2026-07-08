package com.ss.android.ugc.tiktok.addyours.mob.detail;

import X.C0245006h;
import X.C1554960qZC;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.ss.android.tracker.event.EventParamsProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursClientShowFromAwemeProvider implements EventParamsProtocol<C0245006h> {
    public final InterfaceC665370Q7z LL;

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C0245006h getParam() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        Aweme aweme;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        if (interfaceC665370Q7z == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "from_aweme", Aweme.class, null)) == null || (aweme = (Aweme) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        return new C0245006h(aweme.getGroupId());
    }

    public AddYoursClientShowFromAwemeProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }
}
