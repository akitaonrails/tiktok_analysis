package com.ss.android.ugc.aweme.commercialize.util.adrouter;

import X.AbstractC1027370cqF;
import X.C1027480cqQ;
import X.C19EG;
import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public interface IAdRouterHandlerDepend {
    void LIZ(String str);

    boolean LIZJ(Context context, String str);

    String LIZLLL();

    AbstractC1027370cqF LJ(Function1<? super Boolean, Unit> function1);

    AbstractC1027370cqF LJFF(Function1<? super Boolean, Unit> function1);

    void LJI(String str, String str2, String str3);

    boolean LJII(int i, Context context, Aweme aweme, boolean z);

    AbstractC1027370cqF LJIIIIZZ(Function1<? super Boolean, Unit> function1);

    boolean LJIIIZ(C19EG c19eg, String str);

    boolean LJIIJ(Context context, String str, Uri uri, C1027480cqQ c1027480cqQ);

    AbstractC1027370cqF LJIIJJI(Function1<? super Boolean, Unit> function1);

    void LJIIL(String str, String str2, String str3, String str4, Context context);

    AbstractC1027370cqF LJIILIIL(Function1<? super Boolean, Unit> function1);

    void LJIILJJIL(Function1<? super Boolean, Unit> function1);

    boolean open(String str);

    void pendingDeepLinkLog(Function1<? super Boolean, Unit> function1);
}
