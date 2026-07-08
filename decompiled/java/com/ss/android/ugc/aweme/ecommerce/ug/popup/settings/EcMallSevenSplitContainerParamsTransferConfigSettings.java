package com.ss.android.ugc.aweme.ecommerce.ug.popup.settings;

import X.C09CT;
import X.C1120604Zw;
import X.C1121904a9;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C2371409Qy;
import X.C2399609ak;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class EcMallSevenSplitContainerParamsTransferConfigSettings {
    public static final n LIZ;
    public static final Map<String, PathConfig> LIZIZ;

    static {
        Type type;
        n nVar = new n();
        n nVar2 = new n();
        C2399609ak.LJI(nVar2, "append", C1697810uHb.LJIIJJI("mall_extra_info", "diversion_params", "top_product_ids", "creative_id", "campaign_id"));
        nVar.LJJIFFI("default", nVar2);
        LIZ = nVar;
        try {
            n nVar3 = (n) SettingsManager.LIZLLL().LJIIIIZZ("ec_mall_seven_split_container_params_transfer_config", n.class, nVar);
            if (nVar3 != null) {
                nVar = nVar3;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            nVar = LIZ;
        }
        Map<String, PathConfig> map = null;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                type = new TypeToken<Map<String, ? extends PathConfig>>() { // from class: X.0QnP
                }.getType();
            } else {
                C13JX c13jx = KTypeProjection.LIZJ;
                C13JW c13jwLJII = C13LE.LJII(String.class);
                c13jx.getClass();
                type = C2371409Qy.LIZJ(C13LE.LJIIIZ(Map.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(PathConfig.class))));
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, nVar, type);
            if (!(objFromJson instanceof Map)) {
                objFromJson = null;
            }
            map = (Map) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZIZ = map;
    }

    public static PathConfig LIZ(String str) {
        Map<String, PathConfig> map = LIZIZ;
        if (map == null) {
            return null;
        }
        for (Map.Entry<String, PathConfig> entry : map.entrySet()) {
            if (!Intrinsics.LJFF(entry.getKey(), "default") && a0.LJJIIZI(str, entry.getKey(), false)) {
                return entry.getValue();
            }
        }
        return map.get("default");
    }

    public static final class PathConfig {

        @C09CT("append")
        public final List<String> append;

        @C09CT("overwrite")
        public final List<String> overwrite;

        public PathConfig(List<String> list, List<String> list2) {
            this.append = list;
            this.overwrite = list2;
        }
    }
}
