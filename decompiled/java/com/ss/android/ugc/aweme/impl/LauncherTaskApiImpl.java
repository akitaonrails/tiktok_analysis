package com.ss.android.ugc.aweme.impl;

import X.C0CCZ;
import X.C20152713tF;
import com.bytedance.ies.ugc.statisticlogger.page.PageTask;
import com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi;
import com.ss.android.ugc.aweme.legoImp.task.AssemInitTask;
import com.ss.android.ugc.aweme.legoImp.task.InitPushTask;
import com.ss.android.ugc.aweme.legoImp.task.MotaInitTask;

/* JADX INFO: loaded from: classes31.dex */
public final class LauncherTaskApiImpl implements ILauncherTaskApi {
    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi
    public final void initPowerPreload() {
        C20152713tF.LIZ.getClass();
        C20152713tF.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi
    public final C0CCZ LIZIZ() {
        return InitPushTask.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi
    public final C0CCZ LIZ() {
        return PageTask.LL;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi
    public final C0CCZ LIZJ() {
        return AssemInitTask.LL;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi
    public final C0CCZ LIZLLL() {
        return MotaInitTask.LL;
    }
}
