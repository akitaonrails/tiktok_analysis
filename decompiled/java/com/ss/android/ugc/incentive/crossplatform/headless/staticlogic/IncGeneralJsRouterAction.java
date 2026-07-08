package com.ss.android.ugc.incentive.crossplatform.headless.staticlogic;

import X.C01U6;
import X.C1894030zO5;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import kotlin.jvm.internal.AwS112S1000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class IncGeneralJsRouterAction implements IRouteAction {
    public static final C1894030zO5 Companion = new Object() { // from class: X.0zO5
    };

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        if (context != null && str != null && str.length() != 0) {
            C01U6.LIZIZ(new AwS112S1000000_28(context, str, 6));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
