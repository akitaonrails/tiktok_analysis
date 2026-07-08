package com.ss.android.ugc.aweme.services;

import X.C0J5O;
import X.InterfaceC723190SYj;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.framework.service.IWatchFromProfile;

/* JADX INFO: loaded from: classes8.dex */
public final class WatchFromProfileImpl implements IWatchFromProfile {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.profile.platform.framework.service.IWatchFromProfile
    public void watchFromProfile(Context context, User user, boolean z, String str, InterfaceC723190SYj interfaceC723190SYj, String str2) {
        C0J5O c0j5oZ5;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
            c0j5oZ5.LJFF(context, user, z, str, null, null, str2);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.IWatchFromProfile
    public void watchFromProfile(Context context, User user, boolean z, String str, InterfaceC723190SYj interfaceC723190SYj, SlimRoom slimRoom, String str2, String str3) {
        C0J5O c0j5oZ5;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
            c0j5oZ5.LJFF(context, user, z, str, slimRoom, str2, str3);
        }
    }
}
