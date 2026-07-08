package com.ss.android.ugc.aweme.viewModel;

import X.C004I;
import X.C09JN;
import X.C110R;
import X.C110S;
import X.C110T;
import X.C11S5;
import X.C1701940uOG;
import X.C19429110zp;
import Y.AfS163S0200000_29;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.model.api.request.ProfileNaviListRequest;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviSwitcherViewModel extends BaseJediViewModel<ProfileNaviSwitcherState> {
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new ProfileNaviSwitcherState(null, true, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void lR2() {
        ProfileNaviSwitcherState profileNaviSwitcherState = (ProfileNaviSwitcherState) FQ2();
        if (profileNaviSwitcherState.getHasMore()) {
            C110T c110t = new C110T();
            C110S c110s = new C110S();
            c110s.LIZ = c110t.LIZ;
            ProfileNaviListRequest.Api api = ProfileNaviListRequest.LIZ;
            C110R.LIZ(c110s).LJJIJIIJI(C11S5.LIZ).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS163S0200000_29(profileNaviSwitcherState, this, 2), new C09JN() { // from class: X.110Q
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("ProfileNaviSwitcherViewModel@e6d.getNaviList$1$2");
                    C1C7U.LIZIZ("ProfileNaviSwitcherViewModel@e6d.getNaviList$1$2");
                }
            });
        }
    }

    public final void mR2(ProfileNaviDataModel profileNaviDataModel) {
        C19429110zp.LIZ.LIZIZ(profileNaviDataModel);
        setStateImmediate(AFwS273S0000000_29.get$arr$(302));
        setStateImmediate(AFwS273S0000000_29.get$arr$(303));
    }
}
