package com.ss.android.ugc.aweme.ecommerce.base.pdp.starter;

import X.C1013003xg;
import X.C1018703yb;
import X.C1120604Zw;
import X.C1121904a9;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C1741890vQh;
import X.C2097608Jq;
import X.C2371409Qy;
import X.C958103op;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes27.dex */
public interface IPdpStarter {
    public static final C1013003xg LIZ = C1013003xg.LIZ;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class PdpEnterParam implements Serializable {
        public static final int $stable = 8;
        public final Integer autoAddToCart;
        public final boolean autoOpenSku;
        public final Integer autoOpenSkuPanelClickFrom;
        public String awemeId;
        public Integer bizType;
        public final String btmToken;
        public String chainKey;
        public List<String> checkedSkuIds;
        public String clickFrom;
        public final Float collapsedHeight;
        public final boolean collapsible;
        public final List<String> containerParams;
        public final String enterViewName;
        public final float expandHeight;
        public final boolean expandOnShow;
        public boolean fullScreen;
        public boolean isFromPdpAddCartAfterToastEntrance;
        public final boolean isPromotionPage;
        public OneClickPayContext ocpContext;
        public Integer ocpFlag;
        public String ocpOrderId;
        public final Map<String, Object> orderRequestParams;
        public final Integer pageExpressionType;
        public String pdpCacheKey;
        public Map<String, String> pdpPreParam;
        public final String pdpPreviousPageId;
        public final String pipeParams;
        public final boolean playerControl;
        public String preTrackNodeId;
        public final Map<String, Object> productEnterContext;
        public final String recipientInfoId;
        public final Map<String, Object> requestParams;
        public final String route;
        public final String schemaChainKey;
        public final String selectedAddressId;
        public String sourceInfo;
        public final String trackId;
        public final Map<String, Object> trackParams;
        public final Map<String, Object> visitReportParams;

        public PdpEnterParam() {
            this(new ConcurrentHashMap(), null, null, null, null, false, null, C958103op.LIZJ(), null, true, true, false, null, null, new ConcurrentHashMap(), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, 0, null, null, null, false, null);
        }

        public final PdpEnterParam copy(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, String str, Map<String, Object> map4, boolean z, List<String> list, float f, Float f2, boolean z2, boolean z3, boolean z4, Map<String, Object> map5, String str2, Map<String, String> map6, String str3, String str4, String str5, Integer num, String str6, OneClickPayContext oneClickPayContext, Integer num2, String str7, String str8, String str9, String str10, String str11, boolean z5, Integer num3, List<String> list2, boolean z6, Integer num4, String str12, String str13, String str14, boolean z7, Integer num5) {
            return new PdpEnterParam(map, map2, map3, str, map4, z, list, f, f2, z2, z3, z4, map5, str2, map6, str3, str4, str5, num, str6, oneClickPayContext, num2, str7, str8, str9, str10, str11, z5, num3, list2, z6, num4, str12, str13, str14, z7, num5);
        }

        public final PdpEnterParam clone() {
            HashMap map = new HashMap(this.requestParams);
            Map<String, Object> mapLJ = this.orderRequestParams;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            HashMap map2 = new HashMap(mapLJ);
            Map<String, Object> mapLJ2 = this.trackParams;
            if (mapLJ2 == null) {
                mapLJ2 = C2097608Jq.LJ();
            }
            HashMap map3 = new HashMap(mapLJ2);
            String str = this.pipeParams;
            Map<String, Object> mapLJ3 = this.visitReportParams;
            if (mapLJ3 == null) {
                mapLJ3 = C2097608Jq.LJ();
            }
            HashMap map4 = new HashMap(mapLJ3);
            Map<String, Object> mapLJ4 = this.productEnterContext;
            if (mapLJ4 == null) {
                mapLJ4 = C2097608Jq.LJ();
            }
            return copy(map, map2, map3, str, map4, this.fullScreen, this.checkedSkuIds, this.expandHeight, this.collapsedHeight, this.collapsible, this.playerControl, this.isPromotionPage, new HashMap(mapLJ4), this.pdpCacheKey, new HashMap(this.pdpPreParam), this.preTrackNodeId, this.awemeId, this.clickFrom, this.bizType, this.enterViewName, this.ocpContext, this.ocpFlag, this.ocpOrderId, this.selectedAddressId, this.btmToken, this.route, this.schemaChainKey, this.autoOpenSku, this.autoOpenSkuPanelClickFrom, this.containerParams, this.isFromPdpAddCartAfterToastEntrance, this.autoAddToCart, this.pdpPreviousPageId, this.trackId, this.recipientInfoId, this.expandOnShow, this.pageExpressionType);
        }

        public final String getProductId() {
            try {
                return (String) ((List) this.requestParams.get("product_id")).get(0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return "";
            }
        }

        public final void logChainKeySource() {
            String str;
            if (this.schemaChainKey != null) {
                str = "schema";
            } else {
                Map<String, Object> map = this.visitReportParams;
                Object obj = map != null ? map.get("chain_key") : null;
                if (!(obj instanceof String) || obj == null) {
                    return;
                } else {
                    str = "visit_report";
                }
            }
            C1018703yb.LIZLLL("tiktokec_pdp_chainkey_source", new AwS52S1000000_1(str, 16));
        }

        public final boolean isFromPdpAddCartAfterToastEntrance() {
            return this.isFromPdpAddCartAfterToastEntrance;
        }

        public final boolean isPromotionPage() {
            return this.isPromotionPage;
        }

        public final void setAwemeId(String str) {
            this.awemeId = str;
        }

        public final void setBizType(Integer num) {
            this.bizType = num;
        }

        public final void setChainKey(String str) {
            this.chainKey = str;
        }

        public final void setCheckedSkuIds(List<String> list) {
            this.checkedSkuIds = list;
        }

        public final void setClickFrom(String str) {
            this.clickFrom = str;
        }

        public final void setFromPdpAddCartAfterToastEntrance(boolean z) {
            this.isFromPdpAddCartAfterToastEntrance = z;
        }

        public final void setFullScreen(boolean z) {
            this.fullScreen = z;
        }

        public final void setOcpContext(OneClickPayContext oneClickPayContext) {
            this.ocpContext = oneClickPayContext;
        }

        public final void setOcpFlag(Integer num) {
            this.ocpFlag = num;
        }

        public final void setOcpOrderId(String str) {
            this.ocpOrderId = str;
        }

        public final void setPdpCacheKey(String str) {
            this.pdpCacheKey = str;
        }

        public final void setPdpPreParam(Map<String, String> map) {
            this.pdpPreParam = map;
        }

        public final void setPreTrackNodeId(String str) {
            this.preTrackNodeId = str;
        }

        public final void setSourceInfo(String str) {
            this.sourceInfo = str;
        }

        public final void updateEntranceInfo(String str, Object obj) {
            Object obj2;
            String str2;
            Type type;
            Map<String, Object> map = this.trackParams;
            if (map != null) {
                obj2 = map.get("entrance_info");
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof String) && (str2 = (String) obj2) != null) {
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        C13JX c13jx = KTypeProjection.LIZJ;
                        C13JW c13jwLJII = C13LE.LJII(String.class);
                        c13jx.getClass();
                        type = C2371409Qy.LIZJ(C13LE.LJIIIZ(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(Object.class))));
                    } else {
                        type = new TypeToken<HashMap<String, Object>>() { // from class: X.049P
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                    if (!(objFromJson instanceof HashMap)) {
                        objFromJson = null;
                    }
                    HashMap map2 = (HashMap) objFromJson;
                    if (map2 != null) {
                        map2.put(str, obj);
                        Map<String, Object> map3 = this.trackParams;
                        if (map3 != null) {
                            map3.put("entrance_info", C1741890vQh.LJIIIIZZ(map2));
                        }
                    }
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c5 A[PHI: r3
          0x00c5: PHI (r3v6 java.lang.Object) = (r3v5 java.lang.Object), (r3v7 java.lang.Object) binds: [B:41:0x00f1, B:24:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PdpEnterParam(java.util.Map<java.lang.String, java.lang.Object> r7, java.util.Map<java.lang.String, java.lang.Object> r8, java.util.Map<java.lang.String, java.lang.Object> r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.Object> r11, boolean r12, java.util.List<java.lang.String> r13, float r14, java.lang.Float r15, boolean r16, boolean r17, boolean r18, java.util.Map<java.lang.String, java.lang.Object> r19, java.lang.String r20, java.util.Map<java.lang.String, java.lang.String> r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.Integer r25, java.lang.String r26, com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext r27, java.lang.Integer r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, boolean r34, java.lang.Integer r35, java.util.List<java.lang.String> r36, boolean r37, java.lang.Integer r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, boolean r42, java.lang.Integer r43) {
            /*
                Method dump skipped, instruction units count: 289
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam.<init>(java.util.Map, java.util.Map, java.util.Map, java.lang.String, java.util.Map, boolean, java.util.List, float, java.lang.Float, boolean, boolean, boolean, java.util.Map, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.util.List, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer):void");
        }
    }
}
