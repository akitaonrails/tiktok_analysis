package com.ss.android.ugc.aweme.feed.assem.addyours.mob;

import X.C00F1;
import X.C0NNH;
import X.C0NNI;
import X.C0OB6;
import X.C1554960qZC;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursBottomButtonProvider implements IAddYoursBottomButtonProtocol<C00F1> {
    public final InterfaceC665370Q7z LL;

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        Aweme aweme;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C0NNI c0nni;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2;
        C0OB6 c0ob6;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ3 = C1554960qZC.LIZIZ(this.LL, "source_default_key", Aweme.class, null);
        if (interfaceC1555100qZQLIZIZ3 == null || (aweme = (Aweme) interfaceC1555100qZQLIZIZ3.getSource()) == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(this.LL, "source_default_key", C0NNI.class, null)) == null || (c0nni = (C0NNI) interfaceC1555100qZQLIZIZ.getSource()) == null || (interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(this.LL, "source_default_key", C0OB6.class, null)) == null || (c0ob6 = (C0OB6) interfaceC1555100qZQLIZIZ2.getSource()) == null) {
            return null;
        }
        Long l = c0nni.LL;
        return new C00F1(l != null ? l.toString() : null, c0nni.LLILLJJLI, String.valueOf(c0nni instanceof C0NNH ? 1 : 0), String.valueOf(aweme.getAwemeType()), String.valueOf(AwemeExtKt.getFollowStatus(aweme)), aweme.getGroupId(), c0ob6.LL, 8);
    }

    public AddYoursBottomButtonProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }
}
