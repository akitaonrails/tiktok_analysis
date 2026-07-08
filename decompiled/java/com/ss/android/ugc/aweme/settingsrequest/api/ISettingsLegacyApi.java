package com.ss.android.ugc.aweme.settingsrequest.api;

import X.C310720CFy;
import X.InterfaceC345370DgN;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public interface ISettingsLegacyApi {
    List<InterfaceC345370DgN> LIZ();

    C310720CFy LIZIZ();

    void LIZJ(WeakHandler weakHandler, int i, int i2);

    PopupSetting LIZLLL(String str);

    int LJ();

    void preloadPushSettingsManager();

    boolean shouldUseRecyclerPartialUpdate();
}
