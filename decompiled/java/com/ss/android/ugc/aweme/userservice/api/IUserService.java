package com.ss.android.ugc.aweme.userservice.api;

import X.C11NZ;
import X.C1641660sp2;
import X.C1675760ti2;
import X.C19474411Ha;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.profile.model.FamilyPairingRequestUnBlock;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public interface IUserService {
    C11NZ<BaseResponse> LIZLLL(String str, String str2);

    C1675760ti2 LJ();

    NextLiveData<FamilyPairingRequestUnBlock> LJFF();

    NextLiveData<BlockStatus> LJI();

    FollowStatus LJII(int i, String str, String str2);

    FollowStatus LJIIIIZZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, Map map);

    C11NZ<C1641660sp2<User>> LJIIIZ(String str);

    C19474411Ha LJIIJ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4);
}
