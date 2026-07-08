package com.ss.android.ugc.aweme.ml.infra;

import X.C0N33;
import X.C1156204fg;
import X.C1511260pQi;
import X.InterfaceC1510960pQE;
import X.InterfaceC1511280pQk;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public abstract class SmartClassifyService implements ISmartClassifyService {
    public static final C1511260pQi Companion = new Object() { // from class: X.0pQi
    };
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public abstract /* synthetic */ void classify(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511280pQk interfaceC1511280pQk);

    public abstract /* synthetic */ void classifyWithAweme(String str, Aweme aweme, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511280pQk interfaceC1511280pQk);

    public abstract /* synthetic */ void classifyWithAweme(String str, Aweme aweme, InterfaceC1511280pQk interfaceC1511280pQk);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public abstract /* synthetic */ void configSceneModel(String str, SmartClassifySceneConfig smartClassifySceneConfig);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public abstract /* synthetic */ boolean enable(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public abstract /* synthetic */ void ensureEnvAvailable(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public abstract /* synthetic */ boolean isEnvReady(String str);

    public abstract /* synthetic */ String lastPredictResultLabel(String str, String str2);

    public abstract /* synthetic */ Map<String, Float> lastPredictResultScoreMap(String str);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartClassifyService instance() {
        Companion.getClass();
        return C1156204fg.LIZ;
    }
}
