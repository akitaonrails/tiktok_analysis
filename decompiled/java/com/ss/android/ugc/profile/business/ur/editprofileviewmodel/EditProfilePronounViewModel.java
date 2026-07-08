package com.ss.android.ugc.profile.business.ur.editprofileviewmodel;

import X.C1215890hkJ;
import X.C1220000hqw;
import X.C13LE;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC0148002o;
import android.text.TextUtils;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserPronounsInfo;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS18S2000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class EditProfilePronounViewModel extends AssemViewModel<C1215890hkJ> {
    public EditProfileSyncSharedViewModel LL;
    public User LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1215890hkJ(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        EditProfileSyncSharedViewModel editProfileSyncSharedViewModel = (EditProfileSyncSharedViewModel) new C736950SvV(C13LE.LIZ(EditProfileSyncSharedViewModel.class), AFwS207S0000000_19.get$arr$(433), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS257S0000000_19.get$arr$(407), null, null, null).getValue();
        this.LL = editProfileSyncSharedViewModel;
        this.LLILLJJLI = (User) editProfileSyncSharedViewModel.LLILLL.getValue();
    }

    public final void vQ2(UserPronounsInfo userPronounsInfo) {
        Boolean enableEditPronouns;
        String str;
        EditProfileSyncSharedViewModel editProfileSyncSharedViewModel = null;
        if (userPronounsInfo != null) {
            enableEditPronouns = userPronounsInfo.getEnableEditPronouns();
        } else {
            enableEditPronouns = null;
        }
        if (enableEditPronouns != null && !Intrinsics.LJFF(userPronounsInfo.getEnableEditPronouns(), Boolean.FALSE)) {
            if (!TextUtils.isEmpty(userPronounsInfo.getPronouns())) {
                str = "bold";
            } else {
                str = "blank";
            }
            EditProfileSyncSharedViewModel editProfileSyncSharedViewModel2 = this.LL;
            if (editProfileSyncSharedViewModel2 != null) {
                editProfileSyncSharedViewModel = editProfileSyncSharedViewModel2;
            }
            editProfileSyncSharedViewModel.getClass();
            editProfileSyncSharedViewModel.setState(new AwS18S2000000_19("pronoun", str, 4));
            return;
        }
        EditProfileSyncSharedViewModel editProfileSyncSharedViewModel3 = this.LL;
        if (editProfileSyncSharedViewModel3 != null) {
            editProfileSyncSharedViewModel = editProfileSyncSharedViewModel3;
        }
        editProfileSyncSharedViewModel.getClass();
        editProfileSyncSharedViewModel.setState(new AwS18S2000000_19("pronoun", "null", 4));
    }
}
