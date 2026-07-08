package com.ss.android.ugc.aweme.upvote.service;

import X.C10EU;
import X.C1220000hqw;
import X.C1260800iuk;
import X.C13LE;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel;
import java.util.Map;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class RepostListVMServiceImpl implements IRepostListVMService {
    @Override // com.ss.android.ugc.aweme.upvote.service.IRepostListVMService
    public final void LIZ(LifecycleOwner lifecycleOwner, User user, String str, String str2, Map<String, String> map) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        C1260800iuk c1260800iuk = new C1260800iuk(str, str2);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostListViewModel.class);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(336);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(lifecycleOwner);
        if (lifecycleOwner instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) lifecycleOwner;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        C736950SvV c736950SvV = new C736950SvV(c19719912DlLIZ, c1260800iuk, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS257S0000000_19, null, null, null);
        if (str != null) {
            ((RepostListViewModel) c736950SvV.getValue()).LLJILJIL = str;
        }
        RepostListViewModel repostListViewModel = (RepostListViewModel) c736950SvV.getValue();
        String uid = user.getUid();
        if (uid == null) {
            uid = "";
        }
        repostListViewModel.JQ2(uid);
        ((RepostListViewModel) c736950SvV.getValue()).LLJILLL = C10EU.LJIILL(user, false);
        ((RepostListViewModel) c736950SvV.getValue()).LLJJIII = true;
        if (map != null) {
            ((RepostListViewModel) c736950SvV.getValue()).LLIZ = map;
        }
    }
}
