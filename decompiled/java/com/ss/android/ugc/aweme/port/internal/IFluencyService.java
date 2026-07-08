package com.ss.android.ugc.aweme.port.internal;

import X.C860500XpI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public interface IFluencyService {
    public static final C860500XpI Companion = new Object() { // from class: X.0XpI
    };

    void endReport(String str);

    void getCurrentFluencyInfo(long j, Function1<? super JSONObject, Unit> function1, Function1<? super JSONObject, Unit> function12);

    void getSceneFluencyInfo(String str, long j, Function1<? super JSONObject, Unit> function1, Function1<? super JSONObject, Unit> function12);

    void sceneReport(String str);
}
