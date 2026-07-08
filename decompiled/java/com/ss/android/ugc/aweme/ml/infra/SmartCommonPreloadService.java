package com.ss.android.ugc.aweme.ml.infra;

import X.C0N33;
import X.C1510750pPt;
import X.C1510950pQD;
import X.InterfaceC1510960pQE;
import X.InterfaceC1510970pQF;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes24.dex */
public abstract class SmartCommonPreloadService implements ISmartCommonPreloadService {
    public static final C1510950pQD Companion = new Object() { // from class: X.0pQD
    };
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService
    public abstract /* synthetic */ void checkAndInit();

    public abstract /* synthetic */ void configOneNewService(SmartClassifySceneConfig smartClassifySceneConfig);

    public abstract /* synthetic */ boolean enable(String str);

    public abstract /* synthetic */ void ensureEnvAvailable(String str);

    public abstract /* synthetic */ boolean isEnvReady(String str);

    public abstract /* synthetic */ boolean lastResult(String str, boolean z);

    public abstract /* synthetic */ float lastResultScore(String str, float f);

    public abstract /* synthetic */ void smartJudge(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1510970pQF interfaceC1510970pQF);

    public abstract /* synthetic */ void smartJudgeWithAweme(String str, Aweme aweme, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1510970pQF interfaceC1510970pQF);

    public abstract /* synthetic */ void smartJudgeWithAweme(String str, Aweme aweme, InterfaceC1510970pQF interfaceC1510970pQF);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartCommonPreloadService instance() {
        Companion.getClass();
        return C1510750pPt.LIZ;
    }
}
