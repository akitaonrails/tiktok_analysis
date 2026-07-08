package com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke;

import X.InterfaceC1021920chS;
import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.model.AiAgentConfig;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public interface ICRouterComponentClick {
    boolean LIZ(Context context, Aweme aweme, String str, int i);

    boolean LIZIZ(Context context, Aweme aweme, String str, int i);

    void LIZJ(Aweme aweme, String str, Context context, InterfaceC1021920chS interfaceC1021920chS);

    void LIZLLL(Aweme aweme, String str, Context context, Function0 function0);

    boolean LJ(Context context, Aweme aweme, String str, int i);

    boolean LJFF(Context context, Aweme aweme, String str, int i);

    void LJI(Aweme aweme, int i, Context context, Map map, CRouterCoreModel cRouterCoreModel, AiAgentConfig aiAgentConfig);

    boolean LJII(Context context, Aweme aweme, String str, int i);
}
