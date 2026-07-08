package com.ss.android.ugc.tiktok.addyours.mob.detail;

import X.C0249006l;
import X.C0OB3;
import X.C1554960qZC;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: loaded from: classes10.dex */
public final class EnterAddYoursDetailAwemeProvider implements IEnterAddYoursDetailProvider<C0249006l> {
    public final InterfaceC665370Q7z LL;

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        Aweme aweme;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(this.LL, "source_default_key", Aweme.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (aweme = (Aweme) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        return new C0249006l(Integer.valueOf(aweme.getAwemeType()), Integer.valueOf(AwemeExtKt.getFollowStatus(aweme)), AwemeExtKt.getAuthorUid(aweme), aweme.getGroupId(), C0OB3.LIZ(aweme));
    }

    public EnterAddYoursDetailAwemeProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }
}
