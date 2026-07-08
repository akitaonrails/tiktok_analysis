package com.ss.android.ugc.aweme.commercialize;

import X.AbstractC1025070cmX;
import X.C1021860chM;
import X.C1028050crL;
import X.C1029220ctE;
import X.C1034340d1U;
import X.C1041940dDk;
import X.C1429520nIs;
import X.InterfaceC1027210cpz;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.ugc.aweme.commercialize.im.OpenChatExt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public final class CommercializeFromMainServiceImpl implements ICommercializeFromMainOutService {
    @Override // com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService
    public final C1429520nIs LJIIJJI() {
        return new C1429520nIs();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService
    public final boolean LJIIIIZZ(String str) {
        return OpenChatExt.LL.LIZ(null, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService
    public final void pendingDeepLinkLog(final Function1<? super Boolean, Unit> function1) {
        AbstractC1025070cmX.LJJIII(new InterfaceC1027210cpz() { // from class: X.0cmx
            @Override // X.InterfaceC1027210cpz
            public final /* synthetic */ void LIZ(boolean z) {
                function1.invoke(Boolean.valueOf(z));
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService
    public final boolean LIZ(Context context, String str) {
        return AbstractC1025070cmX.LJIILJJIL(context, str, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService
    public final boolean LIZIZ(Context context, String str) {
        return C1021860chM.LJJJJ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService
    public final boolean LJII(Context context, Aweme aweme) {
        return AbstractC1025070cmX.LJIIZILJ(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService
    public final boolean LJIIIZ(Activity activity, String str) {
        return OpenChatExt.LL.LIZ(activity, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService
    public final void LJ(C1029220ctE c1029220ctE, String str, Context context) {
        C1034340d1U.LIZLLL.LIZ().LIZ("draw_ad", c1029220ctE, null, str, context);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService
    public final boolean LJIIJ(Context context, String str, String str2) {
        return C1021860chM.LJJJJI(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService
    public final boolean openAdWebUrl(Context context, String str, String str2) {
        return AbstractC1025070cmX.LJIILL(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService
    public final boolean LIZLLL(Context context, String str, String str2, Map map) {
        return C1028050crL.LIZIZ(context, str, str2, true, map, true, null, 0);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService
    public final boolean LJFF(Context context, String str, String str2, boolean z) {
        return C1041940dDk.LIZJ(context, str, str2, z);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService
    public final Intent LJI(Context context, Uri uri, boolean z, boolean z2) {
        return C1041940dDk.LIZIZ(context, uri, z, z2);
    }
}
