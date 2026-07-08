package com.ss.android.ugc.profile.platform.framework.service;

import X.InterfaceC723190SYj;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes20.dex */
public interface IWatchFromProfile {
    void watchFromProfile(Context context, User user, boolean z, String str, InterfaceC723190SYj interfaceC723190SYj, SlimRoom slimRoom, String str2, String str3);

    void watchFromProfile(Context context, User user, boolean z, String str, InterfaceC723190SYj interfaceC723190SYj, String str2);
}
