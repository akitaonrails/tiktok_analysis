package com.ss.android.ugc.aweme.ogc.sport.anchor;

import X.AbstractC1539010q9T;
import X.C00ZA;
import X.C04TD;
import X.C0OU4;
import X.C1067160dsQ;
import X.C1537050q6J;
import X.C1541950qED;
import X.C1551950qUL;
import X.C1AF0;
import X.C2097908Jt;
import X.C2344009Gk;
import android.app.Activity;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.utils.ISportAnchorProviderService;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class SportAnchorServiceImpl implements ISportAnchorBusinessService, ISportAnchorProviderService {
    public static ISportAnchorBusinessService LIZJ() {
        Object objLIZ = C04TD.LIZ(ISportAnchorBusinessService.class, false);
        if (objLIZ != null) {
            return (ISportAnchorBusinessService) objLIZ;
        }
        if (C04TD.T2 == null) {
            synchronized (ISportAnchorBusinessService.class) {
                if (C04TD.T2 == null) {
                    C04TD.T2 = new SportAnchorServiceImpl();
                }
            }
        }
        return C04TD.T2;
    }

    @Override // com.ss.android.ugc.aweme.utils.ISportAnchorProviderService
    public final C1067160dsQ LIZIZ() {
        return new C1067160dsQ();
    }

    @Override // X.InterfaceC1067170dsR
    public final void LJII(AnchorCommonStruct anchorCommonStruct) {
        try {
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setLazyUpdate(true);
            String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
            C1537050q6J.LIZ.getClass();
            C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
            if (c1551950qULLIZ != null) {
                c1551950qULLIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(accessKey, Collections.singletonList(new CheckRequestBodyModel.TargetChannel("tiktok_ogc_promotion_lynx")))), optionCheckUpdateParams);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.ogc.sport.anchor.ISportAnchorBusinessService
    public final void LJIIIZ(Activity activity, AnchorCommonStruct anchorCommonStruct, String str, String str2, C2344009Gk c2344009Gk, final String str3) {
        String schema;
        String str4;
        String str5;
        String str6;
        int i;
        String str7;
        String str8;
        String str9;
        if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null && schema.length() != 0 && schema != null) {
            try {
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(schema);
                Map<String, String> map = c2344009Gk.LIZ;
                String str10 = "";
                if (map == null || (str4 = (String) ((HashMap) map).get("anchor_id")) == null) {
                    str4 = "";
                }
                sparkContext.LJJJZ("anchor_id", str4);
                sparkContext.LJJJZ("enter_from", str);
                Map<String, String> map2 = c2344009Gk.LIZ;
                if (map2 == null || (str5 = (String) ((HashMap) map2).get("author_id")) == null) {
                    str5 = "";
                }
                sparkContext.LJJJZ("author_id", str5);
                Map<String, String> map3 = c2344009Gk.LIZ;
                if (map3 == null || (str6 = (String) ((HashMap) map3).get("multi_anchor")) == null) {
                    i = 0;
                } else {
                    i = CastIntegerProtector.parseInt(str6);
                }
                sparkContext.LJJJLZIJ(i, "multi_anchor");
                Map<String, String> map4 = c2344009Gk.LIZ;
                if (map4 == null || (str7 = (String) ((HashMap) map4).get("click_method")) == null) {
                    str7 = "";
                }
                sparkContext.LJJJZ("click_method", str7);
                Map<String, String> map5 = c2344009Gk.LIZ;
                if (map5 == null || (str8 = (String) ((HashMap) map5).get("group_id")) == null) {
                    str8 = "";
                }
                sparkContext.LJJJZ("from_group_id", str8);
                Map<String, String> map6 = c2344009Gk.LIZ;
                if (map6 != null && (str9 = (String) ((HashMap) map6).get("request_id")) != null) {
                    if (str9.length() != 0) {
                        str2 = str9;
                    }
                    str10 = str2;
                }
                sparkContext.LJJJZ("request_id", str10);
                sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0O4n
                    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                        HashMap map7 = new HashMap();
                        map7.put("copyright_promotion_entity_info", str3);
                        interfaceC1531560pxS.LIZLLL(map7);
                    }
                });
                if (C0OU4.LIZ(schema)) {
                    sparkContext.LJJJZ("roma_enable_with_param", "1");
                }
                C00ZA.LIZ.getClass();
                if (C00ZA.LIZ() && Intrinsics.LJFF(str, "homepage_hot")) {
                    sparkContext.LJJJZ("enable_saf", "1");
                    sparkContext.LJJJZ("use_video_engine", "1");
                }
                C1541950qED.LIZJ.getClass();
                new C1541950qED(activity, sparkContext).LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJFF(th, "spark navigate failed");
            }
        }
    }
}
