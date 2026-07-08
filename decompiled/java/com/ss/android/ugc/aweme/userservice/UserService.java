package com.ss.android.ugc.aweme.userservice;

import X.AbstractC19484711Kz;
import X.AnonymousClass0716;
import X.C11NZ;
import X.C11T2;
import X.C11TK;
import X.C11TN;
import X.C11TO;
import X.C1641660sp2;
import X.C1675760ti2;
import X.C19212410Eg;
import X.C19474411Ha;
import X.C707370Rot;
import X.InterfaceC19505211Sw;
import Y.AfS163S0200000_29;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.profile.model.FamilyPairingRequestUnBlock;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;

/* JADX INFO: loaded from: classes30.dex */
public final class UserService implements IUserService {
    public C11TK LIZ;

    public final synchronized void LIZ() {
        if (this.LIZ == null) {
            C11TN.LIZ.getClass();
            this.LIZ = C11TN.LIZJ;
        }
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final NextLiveData<FamilyPairingRequestUnBlock> LJFF() {
        return C707370Rot.LIZ.LIZ("#FamiyPairingBlockStatus");
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final NextLiveData<BlockStatus> LJI() {
        return C707370Rot.LIZ.LIZ("#BlockStatus");
    }

    public UserService() {
        new HashMap();
        if (((Boolean) AnonymousClass0716.LJIJ.getValue()).booleanValue()) {
            return;
        }
        LIZ();
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final C1675760ti2 LJ() {
        LIZ();
        C11TN.LIZ.getClass();
        return C11TN.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final C11NZ<C1641660sp2<User>> LJIIIZ(String str) {
        LIZ();
        return C11T2.LIZ(this.LIZ.LIZJ).LIZ(str, new InterfaceC19505211Sw[0]);
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final C11NZ<BaseResponse> LIZLLL(String str, String str2) {
        LIZ();
        return request(new C11TO(str, str2));
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final FollowStatus LJII(int i, String str, String str2) throws ExecutionException, InterruptedException {
        LIZ();
        CommonFollowApi.LIZ.getClass();
        FollowStatus followStatusLIZ = CommonFollowApi.LIZ(i, -1, -1, -1, str, str2, "", "", null, null);
        this.LIZ.LJFF.onNext(new Pair<>(new C19212410Eg(str, str2, i, -1, -1, "", -1, null, null, null, null), followStatusLIZ));
        return followStatusLIZ;
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final C19474411Ha LJIIJ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4) {
        LIZ();
        C11TK c11tk = this.LIZ;
        C19212410Eg c19212410Eg = new C19212410Eg(str, str2, i, i2, i3, str3, i4, str4, null, null, null);
        return AbstractC19484711Kz.LJIJJ(c11tk.LIZLLL.request(c19212410Eg).LJJIII(new AfS163S0200000_29(c11tk, c19212410Eg, 17)));
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final FollowStatus LJIIIIZZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, Map map) throws ExecutionException, InterruptedException {
        LIZ();
        CommonFollowApi.LIZ.getClass();
        FollowStatus followStatusLIZ = CommonFollowApi.LIZ(i, i2, i3, i4, str, str2, str3, str4, str5, map);
        this.LIZ.LJFF.onNext(new Pair<>(new C19212410Eg(str, str2, i, i3, i2, str3, i4, null, null, null, null), followStatusLIZ));
        return followStatusLIZ;
    }
}
