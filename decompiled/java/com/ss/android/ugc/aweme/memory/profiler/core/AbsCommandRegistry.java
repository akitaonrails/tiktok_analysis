package com.ss.android.ugc.aweme.memory.profiler.core;

import com.google.gson.n;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbsCommandRegistry extends AbsBridge {
    public abstract void executeCommand(int i, String str, n nVar);

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge
    public void onReceive(int i, boolean z, String str, n nVar) {
        executeCommand(i, str, nVar);
    }
}
