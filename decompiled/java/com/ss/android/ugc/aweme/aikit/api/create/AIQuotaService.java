package com.ss.android.ugc.aweme.aikit.api.create;

import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.theater.creation.scene.AITheaterCreationRootScene;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public interface AIQuotaService {
    boolean LIZ(Source source);

    QuotaCache LIZIZ(Source source);

    void LIZJ(Source source, AITheaterCreationRootScene aITheaterCreationRootScene, AwS587S0100000_8 awS587S0100000_8);

    Object LIZLLL(Source source, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn);

    void LJ(Source source, Integer num, Integer num2);

    void LJFF(Source source, Function1<? super Integer, Unit> function1);

    void LJI(Map<Source, QuotaRequestParam> map);
}
