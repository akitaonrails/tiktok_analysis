package com.ss.android.ugc.tiktok.addyours.mob.detail;

import X.C0246006i;
import X.C0OB6;
import X.C1554960qZC;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.ss.android.tracker.event.EventParamsProtocol;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursClientShowPageProvider implements EventParamsProtocol<C0246006i> {
    public final InterfaceC665370Q7z LL;

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C0246006i getParam() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C0OB6 c0ob6;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        if (interfaceC665370Q7z == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0OB6.class, null)) == null || (c0ob6 = (C0OB6) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        return new C0246006i(c0ob6.LL);
    }

    public AddYoursClientShowPageProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }
}
