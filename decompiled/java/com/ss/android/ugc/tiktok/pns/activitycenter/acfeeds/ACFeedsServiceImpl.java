package com.ss.android.ugc.tiktok.pns.activitycenter.acfeeds;

import X.C13BV;
import X.C1603960rqE;
import X.C1876510yvp;
import X.C1876620yw0;
import X.C1884180z8C;
import X.C1884190z8D;
import X.C1884220z8G;
import X.C1884260z8K;
import X.C1884270z8L;
import X.C1885840zAs;
import X.C1909107dp;
import X.C19719512Dh;
import X.C23250099c;
import X.C259800zU;
import X.EnumC1884170z8B;
import X.InterfaceC1876540yvs;
import X.InterfaceC1876650yw3;
import X.InterfaceC1876660yw4;
import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IACFeedsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class ACFeedsServiceImpl implements IACFeedsService {
    public final Map<String, C1884220z8G> LIZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IACFeedsService
    public final /* bridge */ /* synthetic */ C1884220z8G LIZLLL(String str) {
        return LJIILJJIL(null, str);
    }

    public final C1884220z8G LJIILJJIL(Activity activity, String str) {
        SparkActivity sparkActivity;
        C1884220z8G c1884220z8G = (C1884220z8G) ((LinkedHashMap) this.LIZ).get(str);
        if (c1884220z8G == null) {
            FeedsResponse feedsResponse = new FeedsResponse();
            if (activity instanceof SparkActivity) {
                sparkActivity = (SparkActivity) activity;
            } else {
                sparkActivity = null;
            }
            c1884220z8G = new C1884220z8G(feedsResponse, str);
            if (sparkActivity != null) {
                c1884220z8G.LLILLL = sparkActivity;
            }
            this.LIZ.put(str, c1884220z8G);
        }
        return c1884220z8G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v47, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v53, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Integer] */
    @Override // com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IACFeedsService
    public final void LIZ(Activity activity, InterfaceC1876650yw3 interfaceC1876650yw3, C1876620yw0 c1876620yw0) {
        C1884220z8G c1884220z8GLJIILJJIL;
        String str;
        String str2 = "-1";
        String reactId = interfaceC1876650yw3.getReactId();
        Object tag = activity.findViewById(R.id.content).getTag(com.zhiliaoapp.musically.R.id.cjt);
        if (C19719512Dh.LJII(tag)) {
            Object obj = ((Map) tag).get(reactId);
            if (obj instanceof C1884220z8G) {
                c1884220z8GLJIILJJIL = (C1884220z8G) obj;
            } else {
                c1884220z8GLJIILJJIL = null;
            }
        } else if (tag instanceof C1884220z8G) {
            c1884220z8GLJIILJJIL = (C1884220z8G) tag;
        } else {
            c1884220z8GLJIILJJIL = LJIILJJIL(activity, reactId);
        }
        if (c1884220z8GLJIILJJIL == null) {
            c1876620yw0.onFail(0, "Failed to get model.");
            return;
        }
        C1603960rqE.LIZ = c1884220z8GLJIILJJIL;
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = "";
        int iIntValue = interfaceC1876650yw3.getInitIndex().intValue();
        if (iIntValue < 0 || iIntValue >= ((ArrayList) c1884220z8GLJIILJJIL.LLIZ).size()) {
            c259800zU.element = -3001;
            c259800zU2.element = "Index is out of range.";
        }
        try {
            str = (String) ((ArrayList) c1884220z8GLJIILJJIL.LLIZ).get(interfaceC1876650yw3.getInitIndex().intValue());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            str = "-1";
        }
        if (!Intrinsics.LJFF(str, interfaceC1876650yw3.getAwemeId())) {
            c259800zU.element = -3002;
            c259800zU2.element = "AwemeId is not match.";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "aweme://aweme/detail/");
        smartRouteBuildRoute.withParam("react_session_id", interfaceC1876650yw3.getReactId());
        smartRouteBuildRoute.withParam("index", interfaceC1876650yw3.getInitIndex().toString());
        smartRouteBuildRoute.withParam("page_type", interfaceC1876650yw3.getEnterFrom());
        smartRouteBuildRoute.withParam("refer", interfaceC1876650yw3.getEnterFrom());
        smartRouteBuildRoute.withParam("video_from", "from_ac_feeds_operate");
        if (Intrinsics.LJFF(interfaceC1876650yw3.getEnterFrom(), "recently_deleted_page")) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_clean_mode", true);
            bundle.putBoolean("support_scroll_in_clean_mode", true);
            bundle.putBoolean("allow_deleted_aweme", true);
            smartRouteBuildRoute.withParam(bundle);
        }
        try {
            if (c1884220z8GLJIILJJIL.LJIILIIL().tryLock(1L, TimeUnit.SECONDS)) {
                try {
                    C1884190z8D.LIZ(interfaceC1876650yw3.getReactId()).LIZ(interfaceC1876650yw3.getInitIndex().intValue(), interfaceC1876650yw3.getAwemeId(), interfaceC1876650yw3.getReactId(), System.currentTimeMillis());
                    if (!c1884220z8GLJIILJJIL.LJIIJ(new C1884180z8C(smartRouteBuildRoute, c259800zU, c259800zU2))) {
                        c259800zU.element = -3003;
                        c259800zU2.element = "On Opening.";
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    c259800zU.element = 0;
                    c259800zU2.element = "Failed to check open.";
                    C1885840zAs.LIZ(EnumC1884170z8B.FAILED_TO_OPEN_DETAIL, "Failed to check open.", e2.getStackTrace().toString());
                }
                c1884220z8GLJIILJJIL.LJIILIIL().unlock();
            } else {
                c259800zU.element = -3003;
                c259800zU2.element = "Calling pns.acLoadAwemeFeeds method.";
            }
            Integer num = (Integer) c259800zU.element;
            if (num != null) {
                c1876620yw0.onFail(num.intValue(), (String) c259800zU2.element);
                return;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1876660yw4.class, interfaceC1876650yw3.getReactId());
            InterfaceC1876660yw4 interfaceC1876660yw4 = (InterfaceC1876660yw4) xBaseModelLIZJ;
            try {
                str2 = (String) ((ArrayList) c1884220z8GLJIILJJIL.LLIZ).get(interfaceC1876650yw3.getInitIndex().intValue());
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            interfaceC1876660yw4.setAwemeId(str2);
            c1876620yw0.onSuccess(xBaseModelLIZJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1884220z8GLJIILJJIL.LJIILIIL().unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IACFeedsService
    public final void LJI(final Activity activity, InterfaceC1876540yvs interfaceC1876540yvs, C1876510yvp c1876510yvp) throws JSONException {
        boolean z;
        Object next;
        String string;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        C1884220z8G c1884220z8GLJIILJJIL;
        boolean zBooleanValue = false;
        if (interfaceC1876540yvs.getReactId().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c1876510yvp.onFail(-3, "reactId can not be empty");
            return;
        }
        if (interfaceC1876540yvs.getDeleteData() == null && (interfaceC1876540yvs.getAwemeIds() == null || interfaceC1876540yvs.getPreCursor() == null || interfaceC1876540yvs.getNextCursor() == null || interfaceC1876540yvs.getHasMore() == null)) {
            c1876510yvp.onFail(-3, "Incomplete parameters.");
            return;
        }
        C1884220z8G c1884220z8GLJIILJJIL2 = LJIILJJIL(activity, interfaceC1876540yvs.getReactId());
        if (Intrinsics.LJFF(interfaceC1876540yvs.getClearData(), Boolean.TRUE)) {
            c1884220z8GLJIILJJIL2.LJIIJJI();
            this.LIZ.remove(interfaceC1876540yvs.getReactId());
            c1884220z8GLJIILJJIL2 = null;
        }
        List<Number> deleteData = interfaceC1876540yvs.getDeleteData();
        if (deleteData != null && (!deleteData.isEmpty())) {
            if (c1884220z8GLJIILJJIL2 != null) {
                c1884220z8GLJIILJJIL = c1884220z8GLJIILJJIL2;
            } else {
                try {
                    c1884220z8GLJIILJJIL = LJIILJJIL(activity, interfaceC1876540yvs.getReactId());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c1876510yvp.onFail(0, "Failed to delete items.");
                    return;
                }
            }
            c1884220z8GLJIILJJIL.LJIIL(deleteData);
        }
        String nextCursor = interfaceC1876540yvs.getNextCursor();
        if (nextCursor != null && nextCursor.length() > 0) {
            if (c1884220z8GLJIILJJIL2 == null) {
                c1884220z8GLJIILJJIL2 = LJIILJJIL(activity, interfaceC1876540yvs.getReactId());
            }
            List<String> awemeIds = interfaceC1876540yvs.getAwemeIds();
            if (awemeIds == null) {
                awemeIds = C13BV.INSTANCE;
            }
            String preCursor = interfaceC1876540yvs.getPreCursor();
            String str = "";
            if (preCursor == null) {
                preCursor = "";
            }
            String nextCursor2 = interfaceC1876540yvs.getNextCursor();
            if (nextCursor2 != null) {
                str = nextCursor2;
            }
            Boolean hasMore = interfaceC1876540yvs.getHasMore();
            if (hasMore != null) {
                zBooleanValue = hasMore.booleanValue();
            }
            c1884220z8GLJIILJJIL2.LJIILIIL().lock();
            if (Intrinsics.LJFF(preCursor, "-1")) {
                c1884220z8GLJIILJJIL2.LJIIJJI();
                EventBus.LIZLLL().LJIJJ(c1884220z8GLJIILJJIL2);
            }
            ((ArrayList) c1884220z8GLJIILJJIL2.LLIZ).addAll(awemeIds);
            List<C1884270z8L> list = c1884220z8GLJIILJJIL2.LLILZLL;
            C1884270z8L c1884270z8L = new C1884270z8L(preCursor, str, zBooleanValue, awemeIds);
            c1884220z8GLJIILJJIL2.LLIZLLLIL = c1884270z8L;
            ((ArrayList) list).add(c1884270z8L);
            Iterator it2 = ((ArrayList) c1884220z8GLJIILJJIL2.LLILZLL).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((C1884270z8L) next).LIZ, c1884220z8GLJIILJJIL2.LLILZIL)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1884270z8L c1884270z8L2 = (C1884270z8L) next;
            if (c1884270z8L2 != null) {
                C23250099c.LIZLLL(c1884220z8GLJIILJJIL2, null, null, new C1884260z8K(c1884220z8GLJIILJJIL2, c1884270z8L2, null), 3);
            } else {
                EnumC1884170z8B enumC1884170z8B = EnumC1884170z8B.FAILED_TO_FIND_NEXT_PAGE;
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("next_cursor", c1884220z8GLJIILJJIL2.LLILZIL);
                C1884270z8L c1884270z8L3 = c1884220z8GLJIILJJIL2.LLIZLLLIL;
                if (c1884270z8L3 != null) {
                    string = c1884270z8L3.toString();
                } else {
                    string = null;
                }
                jSONObject.putOpt("new_page", string);
                C1885840zAs.LIZ(enumC1884170z8B, "Failed to find next page after inject", jSONObject);
            }
            c1884220z8GLJIILJJIL2.LJIILIIL().unlock();
            View viewFindViewById = activity.findViewById(R.id.content);
            if (viewFindViewById != null) {
                viewFindViewById.setTag(com.zhiliaoapp.musically.R.id.cjt, this.LIZ);
            }
            if ((activity instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) activity) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.tiktok.pns.activitycenter.acfeeds.ACFeedsServiceImpl$prepareEnvironment$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        View viewFindViewById2;
                        if (event == Lifecycle.Event.ON_DESTROY && (viewFindViewById2 = activity.findViewById(R.id.content)) != null) {
                            viewFindViewById2.setTag(com.zhiliaoapp.musically.R.id.cjt, null);
                        }
                    }
                });
            }
        }
        c1876510yvp.onSuccess(null);
    }
}
