package com.ss.android.ugc.aweme.im.streak.impl.api;

import X.C09CT;
import X.C0X9S;
import X.C1565806Bc;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes3.dex */
public interface StreakCompensationApi {
    public static final C1565806Bc LIZ = C1565806Bc.LIZ;

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/im/streaks/compensation")
    C0X9S<StreakCompensationResponse> streakCompensation(@InterfaceC1501050pAF("type") int i, @InterfaceC1501050pAF("conversation_id") String str);

    public static final class StreakCompensationResponse {

        @C09CT("status_code")
        public final Integer statusCode;

        public StreakCompensationResponse() {
            this(null);
        }

        public StreakCompensationResponse(Integer num) {
            this.statusCode = num;
        }
    }
}
