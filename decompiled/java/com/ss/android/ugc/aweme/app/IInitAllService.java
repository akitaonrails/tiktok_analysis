package com.ss.android.ugc.aweme.app;

import X.C0CCZ;
import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.legoImp.task.InitLiveServiceTask;
import com.ss.android.ugc.aweme.legoImp.task.InstallEventBus;
import com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceApplicationTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceMainActTask;
import com.ss.android.ugc.aweme.legoImp.task.RegisterLifecycle;

/* JADX INFO: loaded from: classes35.dex */
public interface IInitAllService {
    void LIZ(Application application);

    PreloadInstanceApplicationTask LIZIZ();

    void LIZJ(Application application);

    void LIZLLL();

    RegisterLifecycle LJ();

    void LJFF();

    InitLiveServiceTask LJI();

    void LJII(Context context);

    void LJIIIIZZ(Application application);

    void LJIIIZ();

    InstallEventBus LJIIJ();

    C0CCZ LJIIJJI();

    PreloadInstanceMainActTask LJIIL();
}
