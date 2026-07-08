package com.ss.android.ugc.aweme.account.api;

import X.C01GW;
import X.C15O7;
import X.C452501pT;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class UserSettingsApi {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(18));

    public interface Api {
        @InterfaceC1501240pAY("/passport/user/settings/")
        @InterfaceC1501300pAe
        C15O7<UserSettingsResponse> userSettings(@InterfaceC1501100pAK("category") int i, @InterfaceC1501100pAK("new_nickname") String str);
    }
}
