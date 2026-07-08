package com.ss.android.ugc.aweme.legoImpl;

import com.ss.android.legoapi.IAccountInitializerTaskApi;
import com.ss.android.ugc.aweme.legoImpl.task.AccountRegisterTask;
import com.ss.android.ugc.aweme.legoImpl.task.LoginProxyTask;
import com.ss.android.ugc.aweme.legoImpl.task.RegisterSessionReceiver;
import com.ss.android.ugc.aweme.legoImpl.task.TokenSdkTask;

/* JADX INFO: loaded from: classes14.dex */
public final class AccountInitializerTaskImpl implements IAccountInitializerTaskApi {
    @Override // com.ss.android.legoapi.IAccountInitializerTaskApi
    public final TokenSdkTask LIZ() {
        return new TokenSdkTask();
    }

    @Override // com.ss.android.legoapi.IAccountInitializerTaskApi
    public final AccountRegisterTask LIZIZ() {
        return new AccountRegisterTask();
    }

    @Override // com.ss.android.legoapi.IAccountInitializerTaskApi
    public final LoginProxyTask LIZJ() {
        return new LoginProxyTask();
    }

    @Override // com.ss.android.legoapi.IAccountInitializerTaskApi
    public final RegisterSessionReceiver LIZLLL() {
        return new RegisterSessionReceiver();
    }
}
