package com.bytedance.router.route;

import X.C15438062q;
import X.C838410Wul;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.MultiRouteIntent;
import com.bytedance.router.RouteManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes33.dex */
public final class MultiRoute extends BaseRoute {
    @Override // com.bytedance.router.route.BaseRoute
    public MultiRouteIntent getRouteIntent() {
        return (MultiRouteIntent) super.getRouteIntent();
    }

    @Override // com.bytedance.router.route.IRoute
    public void open(Context context) throws Throwable {
        ArrayList<BaseRoute> routes = getRouteIntent().getRoutes();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(routes, 10));
        Iterator<BaseRoute> it2 = routes.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getComponent(context));
        }
        C838410Wul.LJII(context, (Intent[]) arrayList.toArray(new Intent[0]), getRouteIntent().getAnimationBundle());
        RouteManager.getInstance().getRouteCallbackProxy().onSuccess(null);
    }
}
