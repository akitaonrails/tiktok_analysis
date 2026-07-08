package com.ss.android.ugc.aweme.search.common.communicate;

import X.AbstractC1387200mCc;
import X.C07RH;
import X.C0Q54;
import X.C0QDR;
import X.C0QE7;
import X.C0QE8;
import X.C0QEO;
import X.C1388190mED;
import X.C1389890mGx;
import X.C18138078m;
import X.C1906580ziK;
import X.C19EG;
import X.C20580084k;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C271260Ak8;
import X.C272580AmG;
import X.C664410Q4h;
import X.C664990Q6n;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C823050WQl;
import X.EnumC654470Pll;
import X.EnumC664420Q4i;
import X.InterfaceC214897198d;
import X.RunnableC514801zW;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.preload.SAFPreloadManager;
import com.ss.android.ugc.aweme.search.ISearchServiceLite;
import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS293S0000000_10;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchServiceLiteImpl implements ISearchServiceLite {
    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LIZIZ() throws InterruptedException {
        if (((Number) C18138078m.LIZ.getValue()).intValue() != 0) {
            Thread.sleep(((Number) r1.getValue()).intValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LIZJ(String str) {
        SearchMiddleMonitor.INSTANCE.touchUp(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LIZLLL(String str) {
        SearchMiddleMonitor.INSTANCE.touch(str);
        if (C07RH.LIZ(str)) {
            LJI(null, new Bundle());
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LJII(Throwable th) {
        C664410Q4h.LIZIZ(EnumC654470Pll.COMMON, C0Q54.PERFORMANCE, th, "gson_preload", C2097608Jq.LJ(), C2097608Jq.LJ(), "search");
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LIZ(long j, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, "feed_bar");
        jSONObject.put("type", str);
        jSONObject.put("cost", j);
        C823050WQl.LIZIZ().execute(new RunnableC514801zW(jSONObject, 203));
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LJ(Context context, Bundle bundle) {
        IFamilyPairingService iFamilyPairingServiceLJIIL;
        Uri.Builder builderBuildUpon;
        Object obj;
        C664990Q6n.LIZ.getClass();
        if (context != null) {
            Uri uriBuild = UriProtector.parse("");
            Set<String> setKeySet = bundle.keySet();
            if (setKeySet != null) {
                if (uriBuild != null) {
                    builderBuildUpon = uriBuild.buildUpon();
                } else {
                    builderBuildUpon = null;
                }
                for (String str : setKeySet) {
                    try {
                        obj = bundle.get(str);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        obj = null;
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        obj = null;
                    }
                    if (builderBuildUpon != null) {
                        if (obj == null) {
                            obj = "";
                        }
                        builderBuildUpon.appendQueryParameter(str, String.valueOf(obj));
                    }
                }
                if (builderBuildUpon != null) {
                    uriBuild = builderBuildUpon.build();
                } else {
                    uriBuild = null;
                }
            }
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null && (iFamilyPairingServiceLJIIL = ComplianceServiceProvider.LJIIL()) != null && iFamilyPairingServiceLJIIL.LJIIIZ()) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131834392);
                c1389890mGx.LJIIJJI();
            } else {
                if (uriBuild == null) {
                    return;
                }
                C0QEO.LIZ.LJIIJJI(context, uriBuild, null, null, AFwS293S0000000_10.get$arr$(59));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LJFF(View view, Throwable th) {
        String string;
        if (((Boolean) C271260Ak8.LIZ.getValue()).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            try {
                LinkedList linkedList = new LinkedList();
                linkedList.push(view);
                while (!linkedList.isEmpty()) {
                    View view2 = (View) linkedList.pop();
                    if (view2 != null) {
                        string = view2.toString();
                    } else {
                        string = null;
                    }
                    sb.append(string);
                    sb.append("\n");
                    if (view2 instanceof ViewGroup) {
                        int childCount = ((ViewGroup) view2).getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            linkedList.push(((ViewGroup) view2).getChildAt(i));
                        }
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("viewTree: \n");
                sbLIZ.append((Object) sb);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C664410Q4h.LIZIZ(EnumC654470Pll.SEARCH_SAF, EnumC664420Q4i.FEED, th, sb.toString(), C2097608Jq.LJ(), C2097608Jq.LJ(), "search");
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.199M] */
    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LJI(C19EG c19eg, final Bundle bundle) {
        Activity activityLIZIZ;
        Activity activityLIZIZ2;
        Activity activity;
        InterfaceC214897198d interfaceC214897198d;
        if (C0QDR.LIZLLL) {
            return;
        }
        NavigationScene navigationScene = null;
        if (c19eg == null) {
            try {
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null && (activityLIZIZ2 = abstractC1387200mCcLJ.LIZIZ()) != null) {
                    activityLIZIZ = C737910Sx3.LIZIZ(activityLIZIZ2);
                } else {
                    activityLIZIZ = null;
                }
                if (activityLIZIZ instanceof C19EG) {
                    c19eg = (C19EG) activityLIZIZ;
                } else {
                    c19eg = null;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if ((c19eg instanceof InterfaceC214897198d) && (interfaceC214897198d = (InterfaceC214897198d) c19eg) != null) {
            navigationScene = interfaceC214897198d.getNavigationScene();
        }
        if (c19eg != null && navigationScene != null && (activity = navigationScene.mActivity) != null) {
            C0QDR.LIZLLL = true;
            final C0QE7 c0qe7 = new C0QE7();
            final C19EG c19eg2 = (C19EG) activity;
            final ?? r2 = new C0QE8() { // from class: X.199M
                @Override // X.C0QE8
                public final void run() {
                    Lifecycle.State stateLIZJ = C0R1H.LIZJ(c19eg2);
                    Lifecycle.State state = Lifecycle.State.DESTROYED;
                    if (stateLIZJ == state) {
                        return;
                    }
                    InterfaceC214902198i interfaceC214902198iInvoke = c0qe7.invoke();
                    Class<?> cls = interfaceC214902198iInvoke.getClass();
                    Bundle bundle2 = bundle;
                    C786410Ut5.LJJJI("fragmentClass", cls.getName(), bundle2);
                    C214932199m c214932199mLIZ = AnonymousClass1998.LIZ(bundle2, true, false, false);
                    final C19EG c19eg3 = c19eg2;
                    InterfaceC19394510uF interfaceC19394510uF = new InterfaceC19394510uF() { // from class: X.199O
                        @Override // X.InterfaceC19394510uF
                        public final <T extends View> T LIZ(int i) {
                            return new FrameLayout(c19eg3);
                        }
                    };
                    C199W c199w = C214937199r.LJI;
                    SAFPreloadManager sAFPreloadManager = SAFPreloadManager.LIZ;
                    C19C2 c19c2 = new C19C2(R.id.tya, interfaceC19394510uF, c19eg3, c214932199mLIZ, c199w, new C1701300uNE(SAFPreloadManager.class.getClassLoader()), 128);
                    ((CopyOnWriteArrayList) c214932199mLIZ.LLJILJIL).add(new C199N(interfaceC214902198iInvoke, cls));
                    interfaceC214902198iInvoke.tM();
                    c19c2.LIZLLL(c19eg2, null);
                    try {
                        c19c2.LIZIZ();
                        interfaceC214902198iInvoke.zd();
                        final int iHashCode = c19eg2.hashCode();
                        SAFFragmentRootScene sAFFragmentRootScene = c214932199mLIZ.LLJI;
                        if (sAFFragmentRootScene == null || sAFFragmentRootScene.mView == null || C0R1H.LIZJ(c19eg2).compareTo(state) <= 0) {
                            return;
                        }
                        C199A c199a = new C199A(cls, c214932199mLIZ);
                        final C19EG c19eg4 = c19eg2;
                        synchronized (sAFPreloadManager) {
                            try {
                                ConcurrentHashMap<Integer, List<C199R>> concurrentHashMap = SAFPreloadManager.LIZIZ;
                                List<C199R> arrayList = concurrentHashMap.get(Integer.valueOf(iHashCode));
                                if (arrayList == null) {
                                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0qqa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("SAFPreloadManager@c342.preloadFragmentWithScene$1$2$cache$1$1");
                                            try {
                                                C0R1H.LIZIZ(c19eg4, new SAFPreloadManager.SAFPreloadLifecycleObserver(iHashCode));
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("SAFPreloadManager@c342.preloadFragmentWithScene$1$2$cache$1$1");
                                        }
                                    });
                                    arrayList = new ArrayList<>();
                                    concurrentHashMap.put(Integer.valueOf(iHashCode), arrayList);
                                }
                                arrayList.add(c199a);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            };
            C786410Ut5.LJJZZIII(C20580084k.LIZIZ, new Runnable() { // from class: X.0QE6
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreloadExecutor@b459.execute$1");
                    try {
                        r2.run();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PreloadExecutor@b459.execute$1");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LJIIIIZZ(String str, long j) {
        if (((Boolean) C272580AmG.LIZ.getValue()).booleanValue()) {
            SearchMiddleMonitor.INSTANCE.fcpTiming(str, j);
        }
    }
}
