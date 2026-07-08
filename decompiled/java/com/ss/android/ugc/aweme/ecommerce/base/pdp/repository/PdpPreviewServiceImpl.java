package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository;

import X.C034S;
import X.C054G;
import X.C098200Yq;
import X.C09JN;
import X.C1055504Av;
import X.C1071004Gu;
import X.C1120604Zw;
import X.C11JF;
import X.C11RS;
import X.C11S5;
import X.C1336100ksC;
import X.C1507790pL7;
import X.C1701940uOG;
import X.C1758140vqu;
import X.C1758480vrS;
import X.C1766860w4y;
import X.C189200o6;
import X.C19719512Dh;
import X.C1AQS;
import X.C2097608Jq;
import X.C2131908Wv;
import X.C958103op;
import X.EnumC1740810vOx;
import X.InterfaceC1487280oo2;
import X.InterfaceC420801kM;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.goda.v2.model.dto.GodaV2Protocol;
import com.bytedance.goda.v2.model.vo.ClientScreen;
import com.bytedance.goda.v2.model.vo.GodaV2RequestParams;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.PdpPreviewServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBatchResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra.EcSeaPdpHeaderImgResolutionExperiment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpPreviewServiceImpl implements IPdpPreviewService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService
    public final Object LIZIZ(String str) {
        C054G c054g = C1758140vqu.LIZ;
        Pair pairLIZJ = C1758140vqu.LIZJ(str);
        if (pairLIZJ != null) {
            return pairLIZJ.getFirst();
        }
        return null;
    }

    public static void LIZLLL(int i, int i2, String str, long j, List list) throws JSONException {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, "tt_anchor_prefetch");
        if (str == null) {
            str = "";
        }
        jSONObject.put("source_page_type", str);
        jSONObject.put("is_success", i2);
        jSONObject.put("duration", SystemClock.elapsedRealtime() - j);
        jSONObject.put("prefetch_cnt", list.size());
        jSONObject.put("success_cnt", i);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_ec_pdp_prefetch", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService
    public final InterfaceC420801kM LIZ(List<String> list, List<Integer> list2, String str, Map<String, ? extends Object> map, String str2) {
        boolean zLJI = MethodIDManager.LJI(137964);
        C11JF c11jfLIZJ = LIZJ(list, list2, str, str2, map, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c11jfLIZJ;
    }

    public final C11JF LIZJ(List list, List list2, String str, final String str2, Map map, final C2131908Wv c2131908Wv) {
        Object c098200Yq;
        Map linkedHashMap;
        String string;
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        boolean z;
        boolean z2;
        String name;
        String str3 = str;
        boolean zLJI = MethodIDManager.LJI(137964);
        IPdpStarter.PdpEnterParam pdpEnterParam = new IPdpStarter.PdpEnterParam(new ConcurrentHashMap(), null, null, null, null, false, null, C958103op.LIZJ(), null, true, true, false, null, null, new ConcurrentHashMap(), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, 0, null, null, null, false, null);
        final ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            if (LIZIZ(str4) == null) {
                arrayList.add(str4);
            }
        }
        String name2 = null;
        if (arrayList.isEmpty()) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return null;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, Object> map2 = pdpEnterParam.requestParams;
        if (str3 == null) {
            str3 = "tt_anchor_prefetch";
        }
        map2.put("template", str3);
        pdpEnterParam.requestParams.put("product_id", arrayList);
        if (list2 != null && (!list2.isEmpty())) {
            pdpEnterParam.requestParams.put("traffic_source_list", list2);
        }
        PageSourceInfo pageSourceInfoLJFF = C1766860w4y.LJFF(C1766860w4y.LIZ, new PageSource(EnumC1740810vOx.PDP_PAGE.getPageCode(), null), "request-sdui_pdp/batch_preload", null, 4);
        if (pageSourceInfoLJFF != null) {
            pdpEnterParam.requestParams.put("page_source_info", pageSourceInfoLJFF);
        }
        if (str2 != null && str2.length() > 0) {
            pdpEnterParam.requestParams.put("source", str2);
        }
        try {
            c098200Yq = BtmSDK.INSTANCE.getBcmChainStandardStringByFinder("c0.d0", PageFinder.via((Object) null), null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null) {
            pdpEnterParam.requestParams.put("bcm_chain", c098200Yq);
        }
        if (map != null) {
            pdpEnterParam.requestParams.putAll(map);
        }
        Object obj = pdpEnterParam.requestParams.get("experiment");
        if (!C19719512Dh.LJII(obj) || (linkedHashMap = (Map) obj) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        Pair[] pairArr = new Pair[1];
        n nVarLIZJ = C1071004Gu.LIZJ();
        if (nVarLIZJ == null || (string = nVarLIZJ.toString()) == null) {
            string = "";
        }
        pairArr[0] = new Pair("ec_pdp_sea_bff_config", string);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (C1071004Gu.LIZ()) {
            C1055504Av.LIZ.getClass();
            C1055504Av.LJI(mapLJIIJ);
        }
        Map mapLIZ = C1758480vrS.LIZ();
        if (mapLIZ != null) {
            mapLJIIJ.putAll(mapLIZ);
        }
        Object linkedHashMap2 = linkedHashMap.get("params_map");
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put("params_map", linkedHashMap2);
        }
        Map mapLIZJ = C19719512Dh.LIZJ(linkedHashMap2);
        mapLIZJ.putAll(mapLJIIJ);
        String str5 = (String) EcSeaPdpHeaderImgResolutionExperiment.LIZ.getValue();
        if ((!a0.LJJJIL(str5)) && str5 != null) {
            mapLIZJ.put("ec_sea_pdp_header_img_resolution", str5);
        }
        pdpEnterParam.requestParams.put("experiment", linkedHashMap);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name3, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        Context applicationContext = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
        Float fValueOf = Float.valueOf(C1336100ksC.LIZJ(applicationContext));
        Float fValueOf2 = Float.valueOf(C1336100ksC.LIZIZ(applicationContext));
        Float fValueOf3 = Float.valueOf(1.0f);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService2 != null) {
                z = true;
            } else {
                z = false;
            }
            String name4 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService2 != null) {
                name2 = iECommerceHostService2.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime3, 1, name4, name2, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        InterfaceC420801kM interfaceC420801kMLJJLJLI = C11RS.LJLZ(PdpApi.LIZ.LJFF(pdpEnterParam, new GodaV2RequestParams(new ClientScreen(fValueOf, fValueOf2, fValueOf3, Boolean.valueOf(((IApplicationDependencyService) iECommerceHostService2).isPad())), null, null, null)).LJL(C11S5.LIZ()).LJJLIIIJJIZ(1L).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.09Y0
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) throws JSONException {
                String str6;
                List<ProductPackStruct> list3;
                ProductPackStruct productPackStruct;
                ProductPackStruct productPackStruct2;
                Map<String, PDPResponse> map3;
                Response response = (Response) obj2;
                ArrayList<ProductInfoPackData> arrayList2 = new ArrayList();
                PDPBatchResponseData pDPBatchResponseData = (PDPBatchResponseData) response.data;
                if (pDPBatchResponseData != null && (map3 = pDPBatchResponseData.pdpResponses) != null) {
                    for (Map.Entry<String, PDPResponse> entry : map3.entrySet()) {
                        entry.getKey();
                        PDPResponse value = entry.getValue();
                        C1054204Ai c1054204Ai = C1054204Ai.LIZ;
                        GodaV2Protocol<ProductInfoPackData> godaV2Protocol = value.godaV2Protocol;
                        Boolean bool = Boolean.FALSE;
                        c1054204Ai.getClass();
                        ProductInfoPackData productInfoPackDataLJI = C1054204Ai.LJI(godaV2Protocol, null, bool);
                        if (productInfoPackDataLJI != null) {
                            arrayList2.add(productInfoPackDataLJI);
                        }
                    }
                }
                if (response.isCodeOK()) {
                    InterfaceC2190408i6 interfaceC2190408i6 = c2131908Wv;
                    if (interfaceC2190408i6 != null) {
                        interfaceC2190408i6.onSuccess();
                    }
                    PdpPreviewServiceImpl pdpPreviewServiceImpl = this;
                    String str7 = str2;
                    List<String> list4 = arrayList;
                    long j = jElapsedRealtime;
                    int i = 0;
                    if (!arrayList2.isEmpty()) {
                        int i2 = 0;
                        for (ProductInfoPackData productInfoPackData : arrayList2) {
                            List<ProductPackStruct> list5 = productInfoPackData.productionInfoPack;
                            if (list5 != null && (productPackStruct2 = (ProductPackStruct) ListProtector.get(list5, 0)) != null) {
                                str6 = productPackStruct2.productId;
                            } else {
                                str6 = null;
                            }
                            if (C123100dR.LIZ(str6) && (list3 = productInfoPackData.productionInfoPack) != null && (productPackStruct = (ProductPackStruct) ListProtector.get(list3, 0)) != null && productPackStruct.baseInfo != null && (i2 = i2 + 1) < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        }
                        i = i2;
                    }
                    pdpPreviewServiceImpl.getClass();
                    PdpPreviewServiceImpl.LIZLLL(i, 1, str7, j, list4);
                    return arrayList2;
                }
                InterfaceC2190408i6 interfaceC2190408i62 = c2131908Wv;
                if (interfaceC2190408i62 != null) {
                    String str8 = response.message;
                    if (str8 == null) {
                        str8 = "response fail";
                    }
                    interfaceC2190408i62.LIZ(str8);
                }
                PdpPreviewServiceImpl pdpPreviewServiceImpl2 = this;
                String str9 = str2;
                List<String> list6 = arrayList;
                long j2 = jElapsedRealtime;
                pdpPreviewServiceImpl2.getClass();
                PdpPreviewServiceImpl.LIZLLL(0, 0, str9, j2, list6);
                return arrayList2;
            }
        }).LJJIJIIJI(new C09JN() { // from class: X.08i5
            @Override // X.C09JN
            public final void accept(Object obj2) throws JSONException {
                C1C7U.LIZ("PdpPreviewServiceImpl@9455.doRequestSDUIBatch$source$2");
                Throwable th2 = (Throwable) obj2;
                InterfaceC2190408i6 interfaceC2190408i6 = c2131908Wv;
                if (interfaceC2190408i6 != null) {
                    String message = th2.getMessage();
                    if (message == null) {
                        message = "response error";
                    }
                    interfaceC2190408i6.LIZ(message);
                }
                PdpPreviewServiceImpl pdpPreviewServiceImpl = this;
                String str6 = str2;
                List<String> list3 = arrayList;
                long j = jElapsedRealtime;
                pdpPreviewServiceImpl.getClass();
                PdpPreviewServiceImpl.LIZLLL(0, 0, str6, j, list3);
                C1C7U.LIZIZ("PdpPreviewServiceImpl@9455.doRequestSDUIBatch$source$2");
            }
        }).LJJIJIL(new C09JN() { // from class: X.00Q2
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("PdpPreviewServiceImpl@9455.doRequestSDUIBatch$source$3");
                C1C7U.LIZIZ("PdpPreviewServiceImpl@9455.doRequestSDUIBatch$source$3");
            }
        })).LJLLLL().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.09Y2
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C1C7U.LIZ("PdpPreviewServiceImpl@9455.doRequestSDUIBatch$source$4");
                Iterator it3 = ((List) obj2).iterator();
                while (it3.hasNext()) {
                    List<ProductPackStruct> list3 = ((ProductInfoPackData) it3.next()).productionInfoPack;
                    if (list3 != null) {
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                        for (ProductPackStruct productPackStruct : list3) {
                            String str6 = productPackStruct.productId;
                            if (str6 != null) {
                                C054G c054g = C1758140vqu.LIZ;
                                C1758140vqu.LJFF(str6, productPackStruct, EnumC1756020vnU.PREFETCH_PART, null);
                            } else {
                                str6 = null;
                            }
                            arrayList2.add(str6);
                        }
                    }
                }
                C1C7U.LIZIZ("PdpPreviewServiceImpl@9455.doRequestSDUIBatch$source$4");
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return (C11JF) interfaceC420801kMLJJLJLI;
    }
}
