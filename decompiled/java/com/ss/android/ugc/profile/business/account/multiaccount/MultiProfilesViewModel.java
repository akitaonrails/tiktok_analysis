package com.ss.android.ugc.profile.business.account.multiaccount;

import X.C848230XPh;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.List;
import kotlin.jvm.internal.AFwS247S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class MultiProfilesViewModel extends ViewModel {
    public final C848230XPh LL;
    public final LiveData<List<SignificantUserInfo>> LLILLJJLI;

    public MultiProfilesViewModel() {
        C848230XPh c848230XPh = C848230XPh.LL;
        this.LL = c848230XPh;
        c848230XPh.getClass();
        UserStore.LIZ.getClass();
        this.LLILLJJLI = Transformations.map(UserStore.LJII, AFwS247S0000000_13.get$arr$(31));
    }
}
