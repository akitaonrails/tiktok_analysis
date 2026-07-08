package com.ss.android.ugc.aweme.ecommerce.base.common;

import X.C01GW;
import X.C080W;
import X.C098200Yq;
import X.C0X52;
import X.C1277704zH;
import X.C1336330ksZ;
import X.C13LP;
import X.C1758290vr9;
import X.C189200o6;
import X.C2175508fh;
import X.C452501pT;
import X.C981103sX;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class EcommerceNetworkMonitor implements NetworkPartner.Bystander {
    public static final C01GW<Map<String, List<String>>> LIZ = C452501pT.LIZIZ(new C981103sX());

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LIZLLL(C0X52<?> c0x52) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJI(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJ(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void onException(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
        String strLIZ;
        Object obj;
        TypedInput typedInput;
        TypedByteArray typedByteArray;
        TypedInput typedInput2;
        int i;
        C1758290vr9 c1758290vr9;
        ProductInfoPackData productInfoPackData;
        List<ProductPackStruct> list;
        ProductPackStruct productPackStruct;
        String str;
        C2175508fh c2175508fh;
        String path = request.getPath();
        if (((ArrayList) C1277704zH.LIZ()).contains(path)) {
            try {
                List<String> list2 = LIZ.getValue().get(path);
                if (list2 != null) {
                    Object obj2 = null;
                    if (c0x52 == null) {
                        strLIZ = null;
                    } else {
                        strLIZ = C1336330ksZ.LIZ(c0x52);
                    }
                    HashMap map = new HashMap();
                    if (strLIZ != null) {
                        map.put("log_id", strLIZ);
                    }
                    map.put("path", path);
                    if (c0x52 == null) {
                        obj = null;
                    } else {
                        obj = c0x52.LIZIZ;
                    }
                    map.put("requestParams", C080W.LIZIZ(request));
                    if (obj instanceof Response) {
                        map.put("code", String.valueOf(((Response) obj).code));
                        map.put("message", String.valueOf(((Response) obj).message));
                    } else if (obj instanceof BaseResponse) {
                        map.put("code", String.valueOf(((BaseResponse) obj).error_code));
                        String str2 = ((BaseResponse) obj).message;
                        str2.toString();
                        map.put("message", str2);
                    }
                    if (c0x52 != null && (c2175508fh = c0x52.LIZ) != null) {
                        typedInput = c2175508fh.LJ;
                    } else {
                        typedInput = null;
                    }
                    if (typedInput instanceof TypedByteArray) {
                        typedByteArray = (TypedByteArray) typedInput;
                    } else {
                        typedByteArray = null;
                    }
                    String str3 = "";
                    if (typedByteArray != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            try {
                                typedByteArray.writeTo(byteArrayOutputStream);
                                str3 = byteArrayOutputStream.toString();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            byteArrayOutputStream.close();
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            byteArrayOutputStream.close();
                            throw th2;
                        }
                    } else {
                        if (c0x52 != null) {
                            obj2 = c0x52.LIZIZ;
                        }
                        if ((obj2 instanceof TypedInput) && (typedInput2 = (TypedInput) obj2) != null) {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                InputStream inputStreamIn = typedInput2.in();
                                byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                                do {
                                    i = inputStreamIn.read(bArr);
                                    byteArrayOutputStream2.write(bArr, 0, i);
                                } while (i != -1);
                                str3 = new String(byteArrayOutputStream2.toByteArray(), Charsets.UTF_8);
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                    }
                    map.put("response", str3);
                    HashMap map2 = new HashMap();
                    if (Intrinsics.LJFF(path, "/api/v1/shop/product_info/get") && (obj instanceof C1758290vr9) && (c1758290vr9 = (C1758290vr9) obj) != null && (productInfoPackData = (ProductInfoPackData) c1758290vr9.data) != null && (list = productInfoPackData.productionInfoPack) != null && (productPackStruct = (ProductPackStruct) C13LP.LJJJLZIJ(0, list)) != null && (str = productPackStruct.productId) != null) {
                        map.put("product_id", str);
                        map2.put("product_id", str);
                    }
                    PageMonitor.LIZ.LIZLLL(list2, map, map2);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C189200o6.m2constructorimpl(new C098200Yq(th3));
            }
        }
    }
}
