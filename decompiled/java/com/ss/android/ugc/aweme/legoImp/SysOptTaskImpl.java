package com.ss.android.ugc.aweme.legoImp;

import X.C0CCZ;
import com.ss.android.legoapi.ISysOptTaskApi;
import com.ss.android.ugc.aweme.legoImp.task.DynamicTryCatchTask;
import com.ss.android.ugc.aweme.legoImp.task.FdSanFatalSwitchTask;
import com.ss.android.ugc.aweme.legoImp.task.HoraeInitTask;
import com.ss.android.ugc.aweme.legoImp.task.MemOptTask;
import com.ss.android.ugc.aweme.legoImp.task.NativeBitmapTask;
import com.ss.android.ugc.aweme.legoImp.task.ResCheckerTask;
import com.ss.android.ugc.aweme.legoImp.task.SamangCrashHandleTask;
import com.ss.android.ugc.aweme.legoImp.task.SliverTrackerTask;
import com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitGodzilla;

/* JADX INFO: loaded from: classes32.dex */
public final class SysOptTaskImpl implements ISysOptTaskApi {
    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LIZ() {
        return new MemOptTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LIZIZ() {
        return new DynamicTryCatchTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LIZJ() {
        return new NativeBitmapTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LIZLLL() {
        return new FdSanFatalSwitchTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LJ() {
        return new ResCheckerTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LJFF() {
        return new SysOptimizerTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LJI() {
        return new SamangCrashHandleTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LJII() {
        return new HoraeInitTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LJIIIZ() {
        return new SliverTrackerTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LJIIIIZZ() {
        return InitGodzilla.LL;
    }
}
