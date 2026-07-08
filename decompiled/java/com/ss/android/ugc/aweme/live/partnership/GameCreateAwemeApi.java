package com.ss.android.ugc.aweme.live.partnership;

import X.C01GW;
import X.C0X9S;
import X.C452501pT;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.google.gson.n;
import java.util.Map;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class GameCreateAwemeApi {
    public static final GameCreateAwemeApi LIZ = new GameCreateAwemeApi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(96));

    public interface API {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/webcast/partnership/publisher/post_item/")
        C0X9S<n> createGameAweme(@InterfaceC1501150pAP Map<String, String> map);
    }
}
