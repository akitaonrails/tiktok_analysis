package com.ss.android.ugc.aweme.services;

import X.EnumC1654750tA9;
import X.InterfaceC204626155c;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public interface IMusicPanelService {
    List<InterfaceC204626155c> createDefaultMusicTabViews(InitMusicTabViewsData initMusicTabViewsData);

    int getDefaultLandingPos(InitMusicTabViewsData initMusicTabViewsData);

    List<EnumC1654750tA9> getHiddenTabs(Function0<? extends IMusicRequestParam> function0);

    int getPanelBackground(Activity activity);

    int getPanelTheme(Context context, boolean z);
}
