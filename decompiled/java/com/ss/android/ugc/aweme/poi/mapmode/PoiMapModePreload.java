package com.ss.android.ugc.aweme.poi.mapmode;

import X.AnonymousClass0957;
import X.C0CVZ;
import X.C0PEM;
import X.C1175170ggd;
import X.C1175450gh5;
import X.C1499810p8F;
import X.C2286608xc;
import X.C2296808zG;
import X.C23250099c;
import X.EnumC1174970ggJ;
import X.EnumC1175380ggy;
import X.InterfaceC1364105Vn;
import X.InterfaceC727570SgN;
import android.os.Build;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.poi.mapmode.api.PoiMapModePoiListApi;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeDataParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeTargetData;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModePreload implements InterfaceC727570SgN<PoiMapModePoiListApi, AnonymousClass0957<? extends PoiMapModeResponse>> {
    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        if (C1175450gh5.LIZ() == 5) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, Api.LIZ, null, 20000, false, 28);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public AnonymousClass0957<? extends PoiMapModeResponse> preload2(Bundle bundle, Function1<? super Class<PoiMapModePoiListApi>, ? extends PoiMapModePoiListApi> function1) {
        EnumC1175380ggy enumC1175380ggy;
        PoiMapModeDataParams poiMapModeDataParams;
        PoiMapModeMobParams poiMapModeMobParams;
        PoiMapModeResponse preLoadPoiDiscoveryResponse;
        Serializable serializable;
        Serializable serializable2;
        Serializable serializable3;
        if (Build.VERSION.SDK_INT < 33) {
            if (bundle != null) {
                serializable = bundle.getSerializable("map_mode_scene");
            } else {
                serializable = null;
            }
            if (serializable instanceof EnumC1175380ggy) {
                enumC1175380ggy = (EnumC1175380ggy) serializable;
            } else {
                enumC1175380ggy = null;
            }
            if (bundle != null) {
                serializable2 = bundle.getSerializable("map_mode_scene");
            } else {
                serializable2 = null;
            }
            if (serializable2 instanceof PoiMapModeDataParams) {
                poiMapModeDataParams = (PoiMapModeDataParams) serializable2;
            } else {
                poiMapModeDataParams = null;
            }
            if (bundle != null) {
                serializable3 = bundle.getSerializable("map_mode_mob_params");
            } else {
                serializable3 = null;
            }
            if (serializable3 instanceof PoiMapModeMobParams) {
                poiMapModeMobParams = (PoiMapModeMobParams) serializable3;
            } else {
                poiMapModeMobParams = null;
            }
        } else if (bundle != null) {
            enumC1175380ggy = (EnumC1175380ggy) bundle.getSerializable("map_mode_scene", EnumC1175380ggy.class);
            poiMapModeDataParams = (PoiMapModeDataParams) bundle.getSerializable("map_mode_data_params", PoiMapModeDataParams.class);
            poiMapModeMobParams = (PoiMapModeMobParams) bundle.getSerializable("map_mode_mob_params", PoiMapModeMobParams.class);
        } else {
            enumC1175380ggy = null;
            poiMapModeDataParams = null;
            poiMapModeMobParams = null;
        }
        if (poiMapModeDataParams != null) {
            preLoadPoiDiscoveryResponse = poiMapModeDataParams.getPreLoadPoiDiscoveryResponse();
        } else {
            preLoadPoiDiscoveryResponse = null;
        }
        if (preLoadPoiDiscoveryResponse != null) {
            return C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0CVZ(null), 3);
        }
        return C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1175170ggd(poiMapModeDataParams, this, function1, enumC1175380ggy, poiMapModeMobParams, null), 3);
    }

    public final Object callCityInitial(Function1<? super Class<PoiMapModePoiListApi>, ? extends PoiMapModePoiListApi> function1, EnumC1175380ggy enumC1175380ggy, PoiMapModeDataParams poiMapModeDataParams, PoiMapModeMobParams poiMapModeMobParams, InterfaceC1364105Vn<? super PoiMapModeResponse> interfaceC1364105Vn) {
        String selectedTabCode;
        int scene;
        String pagePoiId;
        PoiMapModePoiListApi poiMapModePoiListApiInvoke = function1.invoke(PoiMapModePoiListApi.class);
        int subScene = EnumC1174970ggJ.CITY_INITIAL.getSubScene();
        if (poiMapModeDataParams == null || (selectedTabCode = poiMapModeDataParams.getSelectedTabCode()) == null) {
            selectedTabCode = "popular";
        }
        if (enumC1175380ggy != null) {
            scene = enumC1175380ggy.getScene();
        } else {
            scene = 0;
        }
        String fromGroupId = null;
        if (poiMapModeDataParams != null) {
            pagePoiId = poiMapModeDataParams.getPagePoiId();
        } else {
            pagePoiId = null;
        }
        if (poiMapModeMobParams != null) {
            fromGroupId = poiMapModeMobParams.getFromGroupId();
        }
        return poiMapModePoiListApiInvoke.getPoiCategoryList(C2286608xc.LJ(subScene), null, selectedTabCode, C2286608xc.LJ(1), C2286608xc.LJ(40), scene, null, pagePoiId, null, null, null, null, null, null, null, false, null, fromGroupId, null, interfaceC1364105Vn);
    }

    public final Object callYMAL(Function1<? super Class<PoiMapModePoiListApi>, ? extends PoiMapModePoiListApi> function1, EnumC1175380ggy enumC1175380ggy, PoiMapModeDataParams poiMapModeDataParams, PoiMapModeMobParams poiMapModeMobParams, InterfaceC1364105Vn<? super PoiMapModeResponse> interfaceC1364105Vn) {
        int scene;
        String str;
        String string;
        String string2;
        String fromGroupId;
        PoiLocation poiLocation;
        Double d;
        PoiLocation poiLocation2;
        Double d2;
        PoiMapModePoiListApi poiMapModePoiListApiInvoke = function1.invoke(PoiMapModePoiListApi.class);
        int subScene = EnumC1174970ggJ.YMAL.getSubScene();
        String selectedTabCode = poiMapModeDataParams.getSelectedTabCode();
        if (selectedTabCode == null) {
            selectedTabCode = "popular";
        }
        if (enumC1175380ggy != null) {
            scene = enumC1175380ggy.getScene();
        } else {
            scene = 0;
        }
        PoiMapModeTargetData targetPoiData = poiMapModeDataParams.getTargetPoiData();
        if (targetPoiData != null) {
            str = targetPoiData.targetPoiId;
        } else {
            str = null;
        }
        PoiMapModeTargetData targetPoiData2 = poiMapModeDataParams.getTargetPoiData();
        if (targetPoiData2 != null && (poiLocation2 = targetPoiData2.targetPoiLocation) != null && (d2 = poiLocation2.lng) != null) {
            string = d2.toString();
        } else {
            string = null;
        }
        PoiMapModeTargetData targetPoiData3 = poiMapModeDataParams.getTargetPoiData();
        if (targetPoiData3 != null && (poiLocation = targetPoiData3.targetPoiLocation) != null && (d = poiLocation.lat) != null) {
            string2 = d.toString();
        } else {
            string2 = null;
        }
        if (poiMapModeMobParams != null) {
            fromGroupId = poiMapModeMobParams.getFromGroupId();
        } else {
            fromGroupId = null;
        }
        return poiMapModePoiListApiInvoke.getPoiCategoryList(C2286608xc.LJ(subScene), null, selectedTabCode, C2286608xc.LJ(1), C2286608xc.LJ(40), scene, null, str, null, null, null, null, null, string, string2, false, null, fromGroupId, null, interfaceC1364105Vn);
    }
}
