package com.ss.android.ugc.aweme.config;

import X.C09CT;
import X.C1120604Zw;
import X.C1121904a9;
import X.C13LE;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C2371409Qy;
import X.C2399609ak;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.model.EcommerceDynamicData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final class EcommerceSearchIntermediateCardsConfig {
    public static final EcommerceSearchIntermediateCardsConfig LIZ = new EcommerceSearchIntermediateCardsConfig();
    public static final List<EcommerceDynamicData> LIZIZ;
    public static final n LIZJ;
    public static n LIZLLL;

    static {
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = "aweme://lynxview/?channel=fe_tiktok_ecommerce_search_transfer&bundle=pages/search-transfer-bk2/template.js&group=fe_tiktok_ecommerce_search_transfer&dynamic=1&surl=https%3A%2F%2Flf77-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_transfer%2Fpages%2Fsearch-transfer-bk2%2Ftemplate.js&ab_params=transfer_style_font,transfer_style_streaming,transfer_style_gs,sea_enable_new_user_block_auto_theme,ecom_search_transfer_enable_image_opt,ecom_middle_press_preload_result,ecom_search_recom_skeleton";
        LIZIZ = C1697810uHb.LJIILJJIL(new EcommerceDynamicData(1, dynamicPatch));
        n nVar = new n();
        h hVar = new h();
        n nVar2 = new n();
        C2399609ak.LJFF(nVar2, "card_type", 1);
        n nVar3 = new n();
        C2399609ak.LIZLLL(nVar3, "", "raw_data");
        C2399609ak.LIZLLL(nVar3, "aweme://lynxview/?channel=fe_tiktok_ecommerce_search_transfer&bundle=pages/search-transfer-bk2/template.js&group=fe_tiktok_ecommerce_search_transfer&dynamic=1&surl=https%3A%2F%2Flf77-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_transfer%2Fpages%2Fsearch-transfer-bk2%2Ftemplate.js&ab_params=transfer_style_font,transfer_style_streaming,transfer_style_gs,sea_enable_new_user_block_auto_theme,ecom_search_transfer_enable_image_opt,ecom_middle_press_preload_result,ecom_search_recom_skeleton", "schema");
        C2399609ak.LJ(nVar2, "dynamic_data", nVar3);
        hVar.LJJIFFI(nVar2);
        C2399609ak.LIZLLL(nVar, Unit.LIZ, "data_list");
        LIZJ = nVar;
    }

    public static List LIZ() {
        List<EcommerceDynamicData> defaultConfigs;
        List<EcommerceDynamicData> defaultConfigs2;
        try {
            LIZLLL = (n) SettingsManager.LIZLLL().LJIIIIZZ("ecom_search_intermediate_config", n.class, LIZJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        n nVar = LIZLLL;
        DynamicDataList dynamicDataList = null;
        if (nVar != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, nVar, c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII ? C2371409Qy.LIZJ(C13LE.LJII(DynamicDataList.class)) : new TypeToken<DynamicDataList>() { // from class: X.0Qc1
                }.getType());
                if (!(objFromJson instanceof DynamicDataList)) {
                    objFromJson = null;
                }
                dynamicDataList = (DynamicDataList) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return (dynamicDataList == null || (defaultConfigs2 = dynamicDataList.getDefaultConfigs()) == null || !defaultConfigs2.isEmpty()) ? false : true ? LIZIZ : (dynamicDataList == null || (defaultConfigs = dynamicDataList.getDefaultConfigs()) == null) ? LIZIZ : defaultConfigs;
    }

    public static final class DynamicDataList implements Serializable {

        @C09CT("data_list")
        public List<EcommerceDynamicData> defaultConfigs = new ArrayList();

        public final List<EcommerceDynamicData> getDefaultConfigs() {
            return this.defaultConfigs;
        }

        public final void setDefaultConfigs(List<EcommerceDynamicData> list) {
            this.defaultConfigs = list;
        }
    }
}
