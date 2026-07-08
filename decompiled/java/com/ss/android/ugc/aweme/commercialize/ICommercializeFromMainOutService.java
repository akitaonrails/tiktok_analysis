package com.ss.android.ugc.aweme.commercialize;

import X.C1029220ctE;
import X.C1429520nIs;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public interface ICommercializeFromMainOutService {
    boolean LIZ(Context context, String str);

    boolean LIZIZ(Context context, String str);

    boolean LIZLLL(Context context, String str, String str2, Map map);

    void LJ(C1029220ctE c1029220ctE, String str, Context context);

    boolean LJFF(Context context, String str, String str2, boolean z);

    Intent LJI(Context context, Uri uri, boolean z, boolean z2);

    boolean LJII(Context context, Aweme aweme);

    boolean LJIIIIZZ(String str);

    boolean LJIIIZ(Activity activity, String str);

    boolean LJIIJ(Context context, String str, String str2);

    C1429520nIs LJIIJJI();

    boolean openAdWebUrl(Context context, String str, String str2);

    void pendingDeepLinkLog(Function1<? super Boolean, Unit> function1);
}
