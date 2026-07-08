package com.ss.android.ugc.tiktok.location_api.service.jsb;

import X.C01GW;
import X.C08JS;
import X.C09CU;
import X.C09CW;
import X.C09D6;
import X.C09DL;
import X.C0TSS;
import X.C1207450hWh;
import X.C1AUZ;
import X.C2188811AlT;
import X.C2382909Vj;
import X.C452501pT;
import X.EnumC1063300dmC;
import X.InterfaceC634840OvC;
import X.InterfaceC687820QyS;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.tiktok.location_api.service.jsb.RequestLocationData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class RequestLocationData extends C0TSS {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(751));

    /* JADX INFO: loaded from: classes4.dex */
    public static final class MapTypeAdapter extends TypeAdapter<Object> {
        public final TypeAdapter<Object> LIZ = C08JS.LIZIZ().LJIIJ(Object.class);

        @Override // com.google.gson.TypeAdapter
        public final Object read(C09CU c09cu) {
            C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
            if (c09d6LJJLIIIJ != null) {
                int i = C09CW.LIZ[c09d6LJJLIIIJ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            String strLJJJZ = c09cu.LJJJZ();
                            if (!a0.LJJIJ(strLJJJZ, '.') && !a0.LJJIJ(strLJJJZ, 'e') && !a0.LJJIJ(strLJJJZ, 'E')) {
                                long j = CastLongProtector.parseLong(strLJJJZ);
                                if (-2147483648L <= j && j <= 2147483647L) {
                                    return Integer.valueOf((int) j);
                                }
                                return Long.valueOf(j);
                            }
                            return Double.valueOf(CastDoubleProtector.parseDouble(strLJJJZ));
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        c09cu.LIZ();
                        while (c09cu.LJIIZILJ()) {
                            Object obj = read(c09cu);
                            if (obj != null) {
                                arrayList.add(obj);
                            }
                        }
                        c09cu.LJI();
                        return arrayList;
                    }
                } else {
                    HashMap map = new HashMap();
                    c09cu.LIZIZ();
                    while (c09cu.LJIIZILJ()) {
                        String strLJJJJ = c09cu.LJJJJ();
                        Object obj2 = read(c09cu);
                        if (obj2 != null) {
                            map.put(strLJJJJ, obj2);
                        }
                    }
                    c09cu.LJII();
                    return map;
                }
            }
            return this.LIZ.read(c09cu);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, Object obj) {
            this.LIZ.write(c09dl, obj);
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        View view2;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        if (!(view instanceof WebView)) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                view2 = interfaceC634840OvC2.getView();
            } else {
                view2 = null;
            }
            if (!(view2 instanceof LynxView)) {
                C2382909Vj.LIZ(completionBlock, 0, "RequestLocationData get wrong view", null, 4);
                return;
            }
        }
        String hybridUrl = getHybridUrl(enumC1063300dmC);
        if (hybridUrl == null) {
            C2382909Vj.LIZ(completionBlock, 0, "RequestLocationData get wrong url", null, 4);
            return;
        }
        Uri uri = UriProtector.parse(hybridUrl);
        String path = uri.getPath();
        String host = uri.getHost();
        if (!C1AUZ.LIZ(enumC1063300dmC, path, host) && !C1AUZ.LIZIZ(enumC1063300dmC, path, host)) {
            C2382909Vj.LIZ(completionBlock, 0, "RequestLocationData get wrong path", null, 4);
            return;
        }
        try {
            TokenCert.Companion companion = TokenCert.Companion;
            TokenCert tokenCertWith = companion.with("bpea-location_request_enc_data_not_reverse");
            tokenCertWith.auth("svfi");
            C1207450hWh c1207450hWh = C1207450hWh.LIZ;
            TokenCert tokenCertWith2 = companion.with("bpea-poi_search_fetcher_location_decrypt");
            tokenCertWith2.auth("mckd");
            c1207450hWh.LJIIL("poi", "creator_center", tokenCertWith, tokenCertWith2, new InterfaceC687820QyS() { // from class: X.0hMW
                @Override // X.InterfaceC687820QyS
                public final void LIZ(LocationData locationData) {
                    C1199590hK1 c1199590hK1LIZIZ;
                    String containerID;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String strEncodeToString = null;
                    try {
                        double d = locationData.latitude;
                        double d2 = locationData.longitude;
                        TokenCert tokenCertWith3 = TokenCert.Companion.with("bpea-poi_search_encrypt_location_data");
                        tokenCertWith3.auth("hyqv");
                        c1199590hK1LIZIZ = C839940WxE.LIZIZ(d, d2, tokenCertWith3);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c1199590hK1LIZIZ = null;
                    }
                    if (c1199590hK1LIZIZ == null) {
                        linkedHashMap.put("encrypt_location", "");
                    } else {
                        linkedHashMap.put("encrypt_location", c1199590hK1LIZIZ.LIZIZ + ',' + c1199590hK1LIZIZ.LIZ);
                    }
                    CompletionBlock<C0TST> completionBlock2 = completionBlock;
                    InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC3 != null) {
                        containerID = interfaceC634840OvC3.getContainerID();
                    } else {
                        containerID = null;
                    }
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0TST.class, containerID);
                    RequestLocationData requestLocationData = this;
                    C0TST c0tst = (C0TST) xBaseModelLIZJ;
                    c0tst.setEncLatitude(locationData.encryptedLatitude);
                    c0tst.setEncLongitude(locationData.encryptedLongitude);
                    String json = GsonProtectorUtils.toJson((Gson) requestLocationData.LLILLL.getValue(), linkedHashMap);
                    if (!TextUtils.isEmpty(json)) {
                        try {
                            byte[] bytes = json.getBytes(Charsets.UTF_8);
                            byte[] bArrLIZ = EncryptorUtil.LIZ(bytes.length, bytes);
                            if (bArrLIZ != null) {
                                strEncodeToString = Base64.encodeToString(bArrLIZ, 0);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    c0tst.setEncData(strEncodeToString);
                    completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                }

                @Override // X.InterfaceC687820QyS
                public final void onError(int i, String str) {
                    CompletionBlock<C0TST> completionBlock2 = completionBlock;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i);
                    sbLIZ.append(", ");
                    if (str == null) {
                        str = "";
                    }
                    sbLIZ.append(str);
                    C2382909Vj.LIZ(completionBlock2, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
                }
            }, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetch location exception: ");
            sbLIZ.append(e.getMessage());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }
}
