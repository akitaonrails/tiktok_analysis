package com.bytedance.android.livesdkapi.host;

import X.C434310H1h;
import X.C472620Ig8;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHostFriendsDummy implements IHostFriends {
    public static final LiveHostFriendsDummy LL = new LiveHostFriendsDummy();

    @Override // com.bytedance.android.livesdkapi.host.IHostFriends
    public final void lc0(View view, User user, LifecycleOwner lifecycleOwner, C472620Ig8 c472620Ig8, C434310H1h c434310H1h, AwS585S0100000_6 awS585S0100000_6) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostFriends
    public final View vP(Context context) {
        return new View(context);
    }
}
