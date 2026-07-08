package com.ss.android.ugc.aweme.ecommerce.mall.mixhome;

import X.C01GW;
import X.C1244080iTm;
import X.C1741890vQh;
import X.C20466080a;
import X.C2130208We;
import X.EnumC1771620wCe;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.chunk.IEcChunkService;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallChunkImageOpt;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopMallChunkService implements IEcChunkService {
    public static final byte[] LIZ = "\"chunk_name\"".getBytes(Charsets.UTF_8);

    @Override // com.ss.android.ugc.aweme.ecommerce.chunk.IEcChunkService
    public final void LIZ(String str, byte[] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        String str2;
        int i;
        Object obj2;
        Object obj3;
        Map map;
        if (!Intrinsics.LJFF(str, "api/v1/mall/homepage/bff/stream/get")) {
            return;
        }
        C01GW c01gw = EcMixMallChunkImageOpt.LIZIZ;
        if (((EcMixMallChunkImageOpt.EcMixMallChunkImageOptConfig) c01gw.getValue()).chunk1Image == 1) {
            z = true;
        } else {
            z = false;
        }
        if (((EcMixMallChunkImageOpt.EcMixMallChunkImageOptConfig) c01gw.getValue()).chunk2Image == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((EcMixMallChunkImageOpt.EcMixMallChunkImageOptConfig) c01gw.getValue()).pdp == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z && !z2 && !z3) {
            return;
        }
        int length = bArr.length - LIZ.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 > length) {
                break;
            }
            int length2 = LIZ.length;
            for (int i3 = 0; i3 < length2; i3++) {
                if (bArr[i2 + i3] != LIZ[i3]) {
                    break;
                }
            }
            int length3 = i2 + LIZ.length;
            while (length3 < bArr.length && C1244080iTm.LJ((char) bArr[length3])) {
                length3++;
            }
            if (length3 >= bArr.length || bArr[length3] != 58) {
                break;
            }
            int i4 = length3 + 1;
            while (i4 < bArr.length && C1244080iTm.LJ((char) bArr[i4])) {
                i4++;
            }
            if (i4 >= bArr.length || bArr[i4] != 34) {
                break;
            }
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < bArr.length && bArr[i6] != 34) {
                i6++;
            }
            if (i6 > i5) {
                str2 = new String(bArr, i5, i6 - i5, Charsets.UTF_8);
            }
            i2++;
        }
        str2 = null;
        EnumC1771620wCe enumC1771620wCe = EnumC1771620wCe.FIRST_CHUNK;
        if (Intrinsics.LJFF(str2, enumC1771620wCe.getValue())) {
            if (!z && !z3) {
                return;
            }
        } else if (Intrinsics.LJFF(str2, EnumC1771620wCe.SECOND_CHUNK.getValue())) {
            if (!z2 && !z3) {
                return;
            }
        } else if (!z && !z2 && !z3) {
            return;
        }
        HashMap<String, Object> mapLJIIJJI = C1741890vQh.LJIIJJI(bArr);
        if (str2 == null) {
            if (mapLJIIJJI != null) {
                obj2 = mapLJIIJJI.get("data");
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof Map) && (map = (Map) obj2) != null) {
                obj3 = map.get("chunk_name");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                obj = obj3;
            }
        } else {
            obj = str2;
        }
        if (Intrinsics.LJFF(obj, enumC1771620wCe.getValue())) {
            i = 1;
        } else {
            i = 2;
            z = z2;
        }
        if (z) {
            Boolean bool = Boolean.TRUE;
            if (mapLJIIJJI != null) {
                EcomResourceBystander.LIZ.getClass();
                EcomResourceBystander.LJIILLIIL(mapLJIIJJI, "/api/v1/mall/homepage/bff/get", bool, null, null);
            }
        }
        if (z3) {
            n nVar = new n();
            nVar.LJJIII(Integer.valueOf(i), "request_occasion");
            if (mapLJIIJJI != null) {
                C2130208We.LIZLLL(C20466080a.LIZ(), "/api/v1/mall/homepage/bff/get", mapLJIIJJI, nVar, null, 8);
            }
        }
    }
}
