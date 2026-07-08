package com.ss.android.ugc.aweme.im.activestatus.impl.settings;

import X.C897370ZIh;
import X.EnumC1643306c3;
import X.InterfaceC897380ZIi;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import kotlin.jvm.internal.AwS119S1200000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityStatusSetPublicAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        String string;
        if (bundle == null || (string = bundle.getString("enter_from")) == null) {
            string = "";
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJ().LJIIIZ(EnumC1643306c3.PUBLIC, new AwS119S1200000_2(context, string, C897370ZIh.LIZ().LJ().LJFF(), 2));
        return Boolean.TRUE;
    }
}
