package com.ss.android.ugc.tiktok.addyours.mob.detail;

import X.C0247006j;
import X.C1554960qZC;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.ss.android.tracker.event.EventParamsProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursClientShowAwemeProvider implements EventParamsProtocol<C0247006j> {
    public final InterfaceC665370Q7z LL;

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C0247006j getParam() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        Aweme aweme;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        if (interfaceC665370Q7z == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", Aweme.class, null)) == null || (aweme = (Aweme) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        return new C0247006j(Integer.valueOf(aweme.getAwemeType()), AwemeExtKt.getAuthorUid(aweme), aweme.getAid(), AwemeExtKt.getFollowStatus(aweme) == 2 ? "friends" : null);
    }

    public AddYoursClientShowAwemeProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }
}
