package com.ss.android.ugc.aweme.net.partner;

import X.C0CN5;
import X.C0X52;
import X.C0XM9;
import X.C1499330p7T;
import X.C1499720p86;
import X.C1499730p87;
import X.C1499780p8C;
import X.C20684815ws;
import X.C305670ByX;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes24.dex */
public final class PreloadCacheHandler implements NetworkPartner.ResponseHandler, NetworkPartner.Blocker, NetworkPartner.ExceptionHandler {
    public final Object LIZ;

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
    public final C0X52<?> LJFF(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        if (((Boolean) C305670ByX.LIZJ.getValue()).booleanValue()) {
            return C0CN5.LJII();
        }
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    public PreloadCacheHandler(Object obj) {
        this.LIZ = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ResponseHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C0XS7<?> r13, X.C1499330p7T r14) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.partner.PreloadCacheHandler.LIZ(X.0XS7, X.0p7T):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0X52<?> LIZJ(X.C0XM9 r13, X.C1499330p7T r14) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.partner.PreloadCacheHandler.LIZJ(X.0XM9, X.0p7T):X.0X52");
    }

    public static void LIZIZ(C0XM9 c0xm9, boolean z, boolean z2, long j) {
        Integer numValueOf;
        String str;
        String str2;
        Object obj;
        String str3;
        if (c0xm9.LIZLLL.LIZJ("check_preload") != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            PreloadExtraInfo preloadExtraInfo = (PreloadExtraInfo) ((LinkedHashMap) C1499730p87.LJIIIIZZ).get(c0xm9.LIZJ.LJFF.LIZ());
            linkedHashMap.put("url", c0xm9.LIZJ.LJFF.LIZ());
            if (preloadExtraInfo != null) {
                numValueOf = Integer.valueOf(preloadExtraInfo.strategyId);
            } else {
                numValueOf = null;
            }
            linkedHashMap.put("strategy_id", String.valueOf(numValueOf));
            String str4 = "";
            if (preloadExtraInfo == null || (str = preloadExtraInfo.previousPage) == null) {
                str = "";
            }
            linkedHashMap.put("previous_page", str);
            if (preloadExtraInfo == null || (str2 = preloadExtraInfo.enterFrom) == null) {
                str2 = "";
            }
            linkedHashMap.put("enter_from", str2);
            String str5 = "1";
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_preload", obj);
            if (!z2) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_preload_req", str5);
            linkedHashMap.put("handle_req_duration", String.valueOf(j));
            if (preloadExtraInfo != null && (str3 = preloadExtraInfo.bizTag) != null) {
                str4 = str3;
            }
            linkedHashMap.put("biz_tag", str4);
            C20684815ws.LJIILLIIL("preload_network_result", linkedHashMap);
        }
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ExceptionHandler
    public final boolean LJIIIZ(C0XM9 c0xm9, C1499330p7T c1499330p7T, Throwable th, int i, boolean z) {
        C1499730p87 c1499730p87;
        String str;
        PreloadExtraInfo preloadExtraInfo;
        Object objLIZ = c1499330p7T.LIZ(this);
        C1499720p86 c1499720p86 = null;
        if (objLIZ instanceof C1499730p87) {
            c1499730p87 = (C1499730p87) objLIZ;
            if (c1499730p87 != null && (preloadExtraInfo = c1499730p87.LIZIZ) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", preloadExtraInfo.enterFrom);
                String str2 = preloadExtraInfo.previousPage;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put("previous_page", str2);
                linkedHashMap.put("url", preloadExtraInfo.url);
                linkedHashMap.put("strategy_id", String.valueOf(preloadExtraInfo.strategyId));
                String str4 = preloadExtraInfo.bizTag;
                if (str4 != null) {
                    str3 = str4;
                }
                linkedHashMap.put("biz_tag", str3);
                C20684815ws.LJIILLIIL("preload_fail", linkedHashMap);
            }
        } else {
            c1499730p87 = null;
        }
        if (c1499730p87 != null) {
            c1499720p86 = c1499730p87.LIZ;
        }
        if (c1499720p86 != null && (str = c1499720p86.LIZIZ) != null) {
            C1499780p8C.LIZ(str);
            return false;
        }
        return false;
    }
}
