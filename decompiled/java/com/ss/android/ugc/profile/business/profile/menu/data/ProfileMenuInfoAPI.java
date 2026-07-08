package com.ss.android.ugc.profile.business.profile.menu.data;

import X.C11NZ;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes.dex */
public interface ProfileMenuInfoAPI {
    @InterfaceC1501160pAQ("/tiktok/user/profile/menu/v1")
    C11NZ<ProfileMenuData> getProfileMenuInfo(@InterfaceC1501120pAM("scene_id") String str);
}
