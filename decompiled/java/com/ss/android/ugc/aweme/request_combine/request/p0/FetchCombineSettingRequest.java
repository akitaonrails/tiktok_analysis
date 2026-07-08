package com.ss.android.ugc.aweme.request_combine.request.p0;

import X.AbstractC312990COr;
import X.C09S2;
import X.C0CO3;
import X.C0CP7;
import X.C11S5;
import X.C1701940uOG;
import X.C312870COf;
import X.C312980COq;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC1487280oo2;
import X.InterfaceC2661011f;
import X.InterfaceC312070CLd;
import X.InterfaceC626120Oh8;
import X.InterfaceC800130Va7;
import Y.ACallableS0S1001000_3;
import Y.ARunnableS0S0001000_3;
import Y.ARunnableS73S0200000_4;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.google.gson.e;
import com.ss.android.ugc.aweme.favorites.agents.AwemeCollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.CollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.UserTypeAdapterFactory;
import com.ss.android.ugc.aweme.request_combine.api.SettingCombineApi;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class FetchCombineSettingRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchCombineSettingRequest";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.P0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.0CLc] */
    @Override // X.InterfaceC800130Va7
    public final void LJI(final Context context, boolean z) {
        Integer numValueOf;
        ISettingRequestExtraInfo iSettingRequestExtraInfo = (ISettingRequestExtraInfo) ServiceManager.get().getService(ISettingRequestExtraInfo.class);
        if (iSettingRequestExtraInfo != 0) {
            iSettingRequestExtraInfo.LIZ(new InterfaceC312070CLd() { // from class: X.0CLc
                @Override // X.InterfaceC312070CLd
                public final void LIZ(Map<String, String> map) {
                    ISettingsRequestService iSettingsRequestService = (ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class);
                    if (iSettingsRequestService != null) {
                        iSettingsRequestService.LJIIJJI(map);
                    }
                }
            });
        }
        C312980COq.LIZ.getClass();
        boolean zLJI = MethodIDManager.LJI(196689);
        C0CP7.LIZ.LJFF();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str : C312980COq.LIZLLL.keySet()) {
            int i2 = i + 1;
            if (i != 0) {
                sb.append(",");
            }
            sb.append(str);
            i = i2;
        }
        Keva repoFromSp = KevaImpl.getRepoFromSp(context, "setting_repo_sp", 0);
        Object objCreate = null;
        if (repoFromSp != null) {
            numValueOf = Integer.valueOf(repoFromSp.getInt("key_has_local_cache", 0));
        } else {
            numValueOf = null;
        }
        HashMap map = new HashMap();
        map.put("api_list", sb.toString());
        map.put("has_local_cache", String.valueOf(numValueOf));
        Iterator<T> it2 = C312980COq.LIZLLL.values().iterator();
        while (it2.hasNext()) {
            Map mapLIZIZ = ((AbstractC312990COr) it2.next()).LIZIZ();
            if (mapLIZIZ != null) {
                map.putAll(mapLIZIZ);
            }
        }
        SettingCombineApi.LIZ.getClass();
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(C312870COf.LIZIZ);
        if (interfaceC2661011fLIZ != null) {
            objCreate = interfaceC2661011fLIZ.create(SettingCombineApi.class);
        }
        ((SettingCombineApi) objCreate).request(map).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.14SF
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C080U next;
                String str2;
                C0X52 c0x52 = (C0X52) obj;
                e eVarLIZIZ = JsonParseUtils.LIZIZ();
                eVarLIZIZ.LIZLLL(new CollectionTypeAdapterFactory());
                eVarLIZIZ.LIZLLL(new MusicTypeAdapterFactory());
                eVarLIZIZ.LIZLLL(new UserTypeAdapterFactory());
                eVarLIZIZ.LIZJ(new BackgroundVideoDeserializer(), BackgroundVideo.class);
                eVarLIZIZ.LIZLLL(new BaseResponseObjectTypeAdapterFactory());
                if (C298410Bmp.LIZ()) {
                    eVarLIZIZ.LIZLLL(new AwemeCollectionTypeAdapterFactory());
                    C0O5Y.LIZ.getClass();
                    C0O5Y.LIZLLL = true;
                }
                AbstractC2126608Uu abstractC2126608Uu = (AbstractC2126608Uu) GsonProtectorUtils.fromJson(eVarLIZIZ.LIZ(), (String) c0x52.LIZIZ, SettingCombineModel.class);
                Iterator<C080U> it3 = c0x52.LIZ.LIZLLL.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (Intrinsics.LJFF(next.LIZ, "x-tt-logid")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C080U c080u = next;
                if (c080u != null && (str2 = c080u.LIZIZ) != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("x-tt-logid", str2);
                    linkedHashMap.put("url", c0x52.LIZ.LIZ);
                    ISettingRequestExtraInfo iSettingRequestExtraInfo2 = (ISettingRequestExtraInfo) ServiceManager.get().getService(ISettingRequestExtraInfo.class);
                    if (iSettingRequestExtraInfo2 != null) {
                        iSettingRequestExtraInfo2.LIZIZ(linkedHashMap);
                    }
                }
                abstractC2126608Uu.checkValid();
                return abstractC2126608Uu;
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<SettingCombineModel>() { // from class: X.0COn
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                if ((th instanceof C1494690ozz) && ((C1494690ozz) th).getStatusCode() == 509) {
                    return;
                }
                if ((th instanceof C0XIR) && ((C23112093u) th).getErrorCode() == 509) {
                    return;
                }
                C312980COq.LIZ.getClass();
                C799900VZk.LIZ.getClass();
                C312960COo c312960COo = new C312960COo();
                Iterator<AbstractC312990COr> it3 = C312980COq.LIZLLL.values().iterator();
                while (it3.hasNext()) {
                    it3.next().LJ(c312960COo);
                }
                c312960COo.LIZIZ();
                Iterator it4 = ((CopyOnWriteArrayList) C312980COq.LIZJ).iterator();
                while (it4.hasNext()) {
                    ((InterfaceC312970COp) it4.next()).LIZIZ();
                }
                String message = th.getMessage();
                C15O7.LIZIZ(new ACallableS0S1001000_3(context, C312980COq.LIZLLL.size(), message, 0), C20684815ws.LJFF(), null);
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(SettingCombineModel settingCombineModel) {
                SettingCombineModel settingCombineModel2 = settingCombineModel;
                if (C1702430uP3.LIZJ) {
                    C2187451AjH.LJFF(2000L);
                }
                if (C0CCS.LIZ) {
                    C2187451AjH.LJJI(3000L);
                }
                if (C0CCS.LIZIZ) {
                    ExecutorC2043307zT executorC2043307zT = C2113808Pw.LIZIZ;
                    C786410Ut5.LJLIIL(16L, executorC2043307zT.LL, new ARunnableS73S0200000_4(context, settingCombineModel2, 25));
                    C786410Ut5.LJJZZIII(executorC2043307zT.LL, new ARunnableS0S0001000_3(C312980COq.LIZLLL.size(), 2));
                    return;
                }
                C312980COq c312980COq = C312980COq.LIZ;
                Context context2 = context;
                c312980COq.getClass();
                C312980COq.LJ(context2, settingCombineModel2);
                final int size = C312980COq.LIZLLL.size();
                C15O7.LIZIZ(new Callable() { // from class: X.08pc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("ColdLaunchRequestCombiner@5259.request$3$onNext$3");
                        C2241008qG c2241008qG = new C2241008qG();
                        c2241008qG.LIZ.put("requestCount", Integer.valueOf(size));
                        JSONObject jSONObjectLJ = c2241008qG.LJ();
                        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                        C793770VBv.LJIIJJI("combine_settings_monitor_service", 0, jSONObjectLJ);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("ColdLaunchRequestCombiner@5259.request$3$onNext$3");
                        return unit;
                    }
                }, C20684815ws.LJFF(), null);
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
