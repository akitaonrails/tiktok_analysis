package com.ss.android.ugc.aweme.compliance.privacy.checkup.relation;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Pair;

/* JADX INFO: loaded from: classes20.dex */
public final class CheckupRelationViewModel extends ViewModel {
    public final MutableLiveData<Integer> LL;
    public final MutableLiveData<Integer> LLILLJJLI;
    public final MutableLiveData<Integer> LLILLL;
    public final MutableLiveData<Pair<Fragment, Boolean>> LLILZ;

    public CheckupRelationViewModel() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        User currentUser = iUserService != null ? iUserService.getCurrentUser() : null;
        this.LL = new MutableLiveData<>(currentUser != null ? Integer.valueOf(currentUser.getFollowingCount()) : null);
        this.LLILLJJLI = new MutableLiveData<>(currentUser != null ? Integer.valueOf(currentUser.getFollowerCount()) : null);
        this.LLILLL = new MutableLiveData<>(currentUser != null ? Integer.valueOf(currentUser.getFriendCount()) : null);
        this.LLILZ = new MutableLiveData<>();
    }
}
