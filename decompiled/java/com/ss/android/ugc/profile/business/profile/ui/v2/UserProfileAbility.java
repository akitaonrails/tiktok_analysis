package com.ss.android.ugc.profile.business.profile.ui.v2;

import X.C1252220igu;
import X.C1253180iiS;
import X.C1260280itu;
import X.EnumC1251790igD;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;

/* JADX INFO: loaded from: classes20.dex */
public interface UserProfileAbility extends ProfileBaseAbility {
    void LJIJ();

    boolean NA();

    void T7(User user);

    C1260280itu Zp();

    void aP(String str);

    C1252220igu getOtherParams();

    User getUser();

    void hU1(boolean z, Boolean bool);

    void lO2(int i, int i2);

    void ma2(Boolean bool, String str);

    void pM0(User user, ProfileUser profileUser);

    void sA2(User user, EnumC1251790igD enumC1251790igD);

    boolean sW0();

    C1253180iiS y12();
}
