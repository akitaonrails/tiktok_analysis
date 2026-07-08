package com.ss.android.ugc.tiktok.addyours.mob.detail;

import X.C00F0;
import X.C0OB6;
import X.C1554960qZC;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;

/* JADX INFO: loaded from: classes10.dex */
public final class FavouriteAddYoursProvider implements IFavouriteAddYoursProvider<C00F0> {
    public final InterfaceC665370Q7z LL;

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C0OB6 c0ob6;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        AddYoursTopic addYoursTopic;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(this.LL, "source_default_key", C0OB6.class, null);
        if (interfaceC1555100qZQLIZIZ2 == null || (c0ob6 = (C0OB6) interfaceC1555100qZQLIZIZ2.getSource()) == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(this.LL, "source_default_key", AddYoursTopic.class, null)) == null || (addYoursTopic = (AddYoursTopic) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        return new C00F0(addYoursTopic.getTopicId(), addYoursTopic.getText(), c0ob6.LL);
    }

    public FavouriteAddYoursProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }
}
