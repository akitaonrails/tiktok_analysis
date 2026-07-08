package com.ss.android.ugc.aweme.avatar;

import X.C2274721E1u;
import X.InterfaceC1607260rvY;
import X.InterfaceC1609290ryp;
import com.ss.android.ugc.aweme.avatar.internalonly.IAvatarInternalService;
import com.ss.android.ugc.aweme.avatar.ui.AvatarDelegate;

/* JADX INFO: loaded from: classes25.dex */
public final class AvatarInternalServiceImpl implements IAvatarInternalService {
    @Override // com.ss.android.ugc.aweme.avatar.internalonly.IAvatarInternalService
    public final InterfaceC1609290ryp LIZ() {
        return new AvatarDelegate();
    }

    @Override // com.ss.android.ugc.aweme.avatar.internalonly.IAvatarInternalService
    public final InterfaceC1607260rvY LIZIZ() {
        return new C2274721E1u();
    }
}
