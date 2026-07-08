package com.ss.android.ugc.aweme.share.shareprop;

import X.C1097704Rb;
import X.C1385160m9K;
import X.C19719612Di;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2344009Gk;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tiktok.kmp.shareprop.IKMPSharePropagationService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePropHelper {
    public static final SharePropHelper INSTANCE = new SharePropHelper();

    private final IKMPSharePropagationService kmpSharePropagationService() {
        return (IKMPSharePropagationService) PluggableExtentionKt.pluggableSpi$default(IKMPSharePropagationService.class, false, false, false, 14, null);
    }

    public static final String resolveSharePropItemIdFromUrl(String str) {
        boolean z;
        String lastPathSegment;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        try {
            lastPathSegment = UriProtector.parse(str).getLastPathSegment();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (lastPathSegment == null) {
            return "";
        }
        return lastPathSegment;
    }

    private final void trackNativeStorageDiff(long j) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "duration");
        C20684815ws.LJIILLIIL("share_prop_storage_diff", c2344009Gk.LIZ);
    }

    public static final Map<String, String> getSharePropInfo(String str, Integer num, Long l) {
        boolean z;
        Object next;
        IKMPSharePropagationService iKMPSharePropagationServiceKmpSharePropagationService;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        LinkedHashMap linkedHashMap = null;
        if (z || num == null || l == null || l.longValue() <= 0) {
            return null;
        }
        if (((Boolean) C1097704Rb.LIZ.getValue()).booleanValue() && (iKMPSharePropagationServiceKmpSharePropagationService = INSTANCE.kmpSharePropagationService()) != null) {
            return iKMPSharePropagationServiceKmpSharePropagationService.LIZ(str, num, l);
        }
        boolean z2 = C1385160m9K.LIZLLL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iIntValue = num.intValue();
        Iterator it2 = ((ArrayList) C1385160m9K.LIZ()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                SharePropCacheItem sharePropCacheItem = (SharePropCacheItem) next;
                if (Intrinsics.LJFF(sharePropCacheItem.itemId, str) && sharePropCacheItem.sceneType == iIntValue) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SharePropCacheItem sharePropCacheItem2 = (SharePropCacheItem) next;
        long jCurrentTimeMillis2 = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long jLongValue = l.longValue() * ((long) 60);
        if (sharePropCacheItem2 != null) {
            if (sharePropCacheItem2.timestamp + jLongValue < jCurrentTimeMillis2) {
                C1385160m9K.LIZIZ(jCurrentTimeMillis2 - jLongValue);
            } else {
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sp_root_d", sharePropCacheItem2.spRootD);
                String str2 = sharePropCacheItem2.spRootU;
                if (str2 != null) {
                    linkedHashMap.put("sp_root_u", str2);
                }
                String str3 = sharePropCacheItem2.spRootOd;
                if (str3 != null) {
                    linkedHashMap.put("sp_root_od", str3);
                }
                String str4 = sharePropCacheItem2.spSourceD;
                if (str4 != null) {
                    linkedHashMap.put("sp_source_d", str4);
                }
                String str5 = sharePropCacheItem2.spSourceOd;
                if (str5 != null) {
                    linkedHashMap.put("sp_source_od", str5);
                }
                String str6 = sharePropCacheItem2.spSourceU;
                if (str6 != null) {
                    linkedHashMap.put("sp_source_u", str6);
                }
                String str7 = sharePropCacheItem2.spSourceW;
                if (str7 != null) {
                    linkedHashMap.put("sp_source_w", str7);
                }
                linkedHashMap.put("sp_level", sharePropCacheItem2.spLevel);
                String str8 = sharePropCacheItem2.spRootShareLinkId;
                if (str8 != null) {
                    linkedHashMap.put("sp_root_share_link_id", str8);
                }
            }
        }
        INSTANCE.trackNativeDuration("read", !z2, System.currentTimeMillis() - jCurrentTimeMillis);
        return linkedHashMap;
    }

    private final void trackNativeDuration(String str, boolean z, long j) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", str);
        c2344009Gk.LIZJ(z ? 1 : 0, "cold_start_load");
        c2344009Gk.LIZLLL(j, "duration");
        C20684815ws.LJIILLIIL("share_prop_duration", c2344009Gk.LIZ);
    }

    public static final void recordShareReflowURL(String str, String str2, Integer num, Long l, Integer num2) {
        int iLIZIZ;
        int iMin;
        Integer numLJIIJJI;
        IKMPSharePropagationService iKMPSharePropagationServiceKmpSharePropagationService;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || num == null || l == null || num2 == null || num2.intValue() <= 0 || l.longValue() <= 0 || num.intValue() != 2) {
            return;
        }
        if (((Boolean) C1097704Rb.LIZ.getValue()).booleanValue() && (iKMPSharePropagationServiceKmpSharePropagationService = INSTANCE.kmpSharePropagationService()) != null) {
            iKMPSharePropagationServiceKmpSharePropagationService.LIZIZ(str, str2, num, l, num2);
            return;
        }
        boolean z = C1385160m9K.LIZLLL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Uri uri = UriProtector.parse(str);
            if (!Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_campaign"), "client_share")) {
                return;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sp_root_d");
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sp_level");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0 && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() != 0) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sp_root_u");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sp_root_od");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_d");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_oid");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "u_code");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 == null || ((numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7)) != null && numLJIIJJI.intValue() <= 0)) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = null;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sp_source_w");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sp_root_share_link_id");
                long jCurrentTimeMillis2 = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                long jLongValue = jCurrentTimeMillis2 - (l.longValue() * ((long) 60));
                if (((ArrayList) C1385160m9K.LIZ()).size() >= num2.intValue() && (iLIZIZ = C1385160m9K.LIZIZ(jLongValue)) >= num2.intValue()) {
                    int iIntValue = (iLIZIZ - num2.intValue()) + 1;
                    ArrayList arrayList = (ArrayList) C1385160m9K.LIZ();
                    if (!arrayList.isEmpty() && (iMin = Math.min(iIntValue, arrayList.size())) > 0) {
                        arrayList.subList(arrayList.size() - iMin, arrayList.size()).clear();
                        C1385160m9K.LIZJ(arrayList);
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZJ(iIntValue, "count");
                    C20684815ws.LJIILLIIL("share_prop_record_maxout", c2344009Gk.LIZ);
                }
                SharePropCacheItem sharePropCacheItem = new SharePropCacheItem(str2, num.intValue(), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9, jCurrentTimeMillis2);
                List listLIZ = C1385160m9K.LIZ();
                C19719612Di.LJJIIJ(listLIZ, new AwS600S0100000_21(sharePropCacheItem, 387), true);
                boolean z2 = false;
                ListProtector.add(listLIZ, 0, sharePropCacheItem);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                C1385160m9K.LIZJ(listLIZ);
                long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
                SharePropHelper sharePropHelper = INSTANCE;
                if (!z) {
                    z2 = true;
                }
                sharePropHelper.trackNativeDuration("write", z2, System.currentTimeMillis() - jCurrentTimeMillis);
                sharePropHelper.trackNativeStorageDiff(jCurrentTimeMillis4);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
