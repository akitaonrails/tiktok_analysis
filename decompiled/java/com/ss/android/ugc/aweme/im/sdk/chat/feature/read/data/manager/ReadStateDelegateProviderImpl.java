package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager;

import X.InterfaceC1755906uD;
import com.ss.android.ugc.aweme.im.readstate.ReadStateDelegateProvider;
import com.ss.android.ugc.aweme.im.readstate.ReadStateMarkDelegate;

/* JADX INFO: loaded from: classes3.dex */
public final class ReadStateDelegateProviderImpl implements ReadStateDelegateProvider {
    @Override // com.ss.android.ugc.aweme.im.readstate.ReadStateDelegateProvider
    public final ReadStateMarkDelegate LIZ(InterfaceC1755906uD interfaceC1755906uD, boolean z) {
        return new ReadStateMarkDelegate(interfaceC1755906uD, z);
    }
}
