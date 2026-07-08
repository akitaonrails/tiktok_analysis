package com.ss.android.ugc.aweme.vibefeed.feed.preload;

import X.AnonymousClass0957;
import X.C0CQT;
import X.C0PEM;
import X.C1499810p8F;
import X.C1575440r6E;
import X.C2296808zG;
import X.C23250099c;
import X.C629170Om3;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.ss.android.ugc.aweme.vibefeed.model.VibeConfigResponse;
import com.ss.android.ugc.aweme.vibefeed.network.IVibeApi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeConfigPreload implements InterfaceC727570SgN<IVibeApi, AnonymousClass0957<? extends VibeConfigResponse>> {
    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(true, C0CQT.LIZJ, null, 0, false, 25);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public AnonymousClass0957<? extends VibeConfigResponse> preload2(Bundle bundle, Function1<? super Class<IVibeApi>, ? extends IVibeApi> function1) {
        String string;
        int i;
        String string2;
        String strLIZ = C1575440r6E.LIZ();
        String str = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        if (bundle == null || (string = bundle.getString("to_user_id")) == null) {
            string = "";
        }
        if (bundle != null && (string2 = bundle.getString("conversation_id")) != null) {
            str = string2;
        }
        if (bundle != null) {
            i = bundle.getInt("mutual_feed_scene");
        } else {
            i = 0;
        }
        return C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C629170Om3(i, strLIZ, str, string, null, function1), 3);
    }
}
