package com.ss.android.ugc.aweme.api;

import X.C040I;
import X.C11NZ;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501320pAg;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;

/* JADX INFO: loaded from: classes25.dex */
public interface ISocial2TabApi {
    @InterfaceC1501170pAR("/tiktok/v1/friends/new_content/multi")
    @InterfaceC1501320pAg(3)
    C11NZ<NewContentResponse> requestRedDotEnhanceQuery(@InterfaceC1501120pAM("friends_tab_cold_start") int i, @InterfaceC1501120pAM("is_non_personalized") Integer num, @C040I MultiRedDotRequest multiRedDotRequest);
}
