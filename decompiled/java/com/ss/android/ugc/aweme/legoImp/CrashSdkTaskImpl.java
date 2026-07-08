package com.ss.android.ugc.aweme.legoImp;

import X.C0CCZ;
import X.EnumC799870VZh;
import com.ss.android.legoapi.ICrashSdkTaskApi;
import com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask;
import com.ss.android.ugc.aweme.legoImp.task.AnrTask;
import com.ss.android.ugc.aweme.legoImp.task.CrashSdkInitTask;
import com.ss.android.ugc.aweme.legoImp.task.MemoryMonitorTask;
import com.ss.android.ugc.aweme.legoImp.task.NpthCoreInitTask;
import com.ss.android.ugc.aweme.legoImp.task.NpthExtentTask;
import com.ss.android.ugc.aweme.legoImp.task.NpthSecondInitTask;
import com.ss.android.ugc.aweme.legoImp.task.SafeViewInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ViewHolderLogTask;

/* JADX INFO: loaded from: classes14.dex */
public final class CrashSdkTaskImpl implements ICrashSdkTaskApi {
    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LIZIZ() {
        return new NpthExtentTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LIZJ() {
        return new ViewHolderLogTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LIZLLL() {
        return new SafeViewInitTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LJ() {
        return new NpthCoreInitTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LJFF() {
        return new MemoryMonitorTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LJI() {
        return new AnrTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LJII() {
        return new NpthSecondInitTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LIZ(EnumC799870VZh enumC799870VZh) {
        return new CrashSdkInitTask(enumC799870VZh);
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LJIIIIZZ(EnumC799870VZh enumC799870VZh) {
        return new AnalysisHprofTask(enumC799870VZh);
    }
}
