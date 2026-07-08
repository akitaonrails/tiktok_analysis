package com.ss.android.ugc.aweme.im.contacts.impl.helper;

import X.C069P;
import X.C0CO3;
import X.C1317205Dm;
import X.C1BG1;
import X.C23250099c;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import android.content.Context;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class IMContactRelatedRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "IMContactRelatedRequest";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        C0CO3 c0co3LJIILIIL;
        ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
        return (contactFeatureLIZ == null || (c0co3LJIILIIL = contactFeatureLIZ.LJIILIIL()) == null) ? C0CO3.NORMAL : c0co3LJIILIIL;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        C1BG1.LIZ.getClass();
        C23250099c.LIZLLL(C1BG1.LJFF, null, null, new C1317205Dm(false, null), 3);
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LIZJ().LIZLLL();
    }
}
