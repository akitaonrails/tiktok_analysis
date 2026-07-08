package com.ss.android.ugc.aweme.effectplatform;

import X.C01GW;
import X.C1416390mxh;
import X.C452501pT;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class AssetCategoryResponseDeserializer implements j<AssetCategoryResponse> {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(52));

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse, java.lang.Object] */
    @Override // com.google.gson.j
    public final AssetCategoryResponse deserialize(k kVar, Type type, i iVar) {
        h hVarLJJIIZI;
        n nVarLJIILIIL = kVar.LJIILIIL();
        n nVarLJJIJ = nVarLJIILIIL.LJJIJ("data");
        if (nVarLJJIJ != null && (hVarLJJIIZI = nVarLJJIJ.LJJIIZI("asset_list")) != null) {
            for (k kVar2 : hVarLJJIIZI) {
                kVar2.getClass();
                if (kVar2 instanceof n) {
                    C1416390mxh.LJ(kVar2.LJIILIIL());
                }
            }
        }
        return GsonProtectorUtils.fromJson((Gson) this.LIZ.getValue(), (k) nVarLJIILIIL, AssetCategoryResponse.class);
    }
}
