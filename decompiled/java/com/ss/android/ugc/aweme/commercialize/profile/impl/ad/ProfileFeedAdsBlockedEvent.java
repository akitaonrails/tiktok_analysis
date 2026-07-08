package com.ss.android.ugc.aweme.commercialize.profile.impl.ad;

import X.AbstractC1053130dVn;
import X.AbstractC207072161e;
import X.C13LE;
import X.C2097908Jt;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileFeedAdsBlockedEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ProfileFeedAdsBlockedEvent() {
        super("profile_feed_ads_blocked");
        this.LJII = C2097908Jt.LIZJ(new Pair("account_type", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(AbstractC1053130dVn.class)), AbstractC207072161e.LJ("{\"allowed\":[\"business_account\",\"privacy_account\"]}", "enum"), false)));
    }

    @Override // X.AbstractC207072161e
    public final Map<String, C2805016t> LIZJ() {
        return this.LJII;
    }

    @Override // X.AbstractC207072161e
    public final AbstractC207072161e LJII(InterfaceC1282004zy interfaceC1282004zy) {
        LIZ().add(interfaceC1282004zy);
        return this;
    }
}
