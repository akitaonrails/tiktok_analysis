package com.ss.android.ugc.aweme.feed.api;

import X.C01GW;
import X.C08I9;
import X.C09S2;
import X.C0CNO;
import X.C0CQT;
import X.C0LAB;
import X.C0O8X;
import X.C0WIY;
import X.C0XIR;
import X.C105700ad;
import X.C1498560p6E;
import X.C15O7;
import X.C1849600yEQ;
import X.C1849620yES;
import X.C1849640yEU;
import X.C1849660yEW;
import X.C20684815ws;
import X.C2188811AlT;
import X.C734440SrS;
import X.C823050WQl;
import X.C844470XAv;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501260pAa;
import X.InterfaceC2177008fw;
import Y.ARunnableS103S0100000_3;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.ab.FeedDiggNoNetExp;
import com.ss.android.ugc.aweme.feed.experiment.DiggRetryConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class FeedActionApi {
    public static final C0O8X LIZ = new C0O8X();
    public static final RetrofitApi LIZIZ = (RetrofitApi) C09S2.LIZJ(RetrofitApi.class, C0CQT.LIZJ);

    public interface RetrofitApi {
        @InterfaceC1501200pAU("/aweme/v1/schedule/aweme/delete/")
        ListenableFuture<BaseResponse> LIZ(@InterfaceC1501120pAM("aweme_id") String str);

        @InterfaceC1501240pAY("/aweme/v1/commit/item/digg/")
        ListenableFuture<BaseResponse> LIZIZ(@InterfaceC1501260pAa Map<String, String> map);

        @InterfaceC1501240pAY("/aweme/v1/aweme/delete/")
        ListenableFuture<BaseResponse> LIZJ(@InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("delete_type") int i);

        @InterfaceC1501240pAY("/aweme/v1/aweme/delete/")
        ListenableFuture<BaseResponse> deleteItem(@InterfaceC1501120pAM("aweme_id") String str);

        @InterfaceC1501240pAY("/aweme/v1/commit/item/digg/")
        ListenableFuture<BaseResponse> diggItemWithTimeout(@InterfaceC1501260pAa Map<String, String> map, @InterfaceC2177008fw Object obj);
    }

    public static void LIZ(String str) {
        LIZIZ.deleteItem(str).get();
    }

    public static void LIZJ(String str) {
        LIZIZ.LIZ(str).get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0WIY<String, Integer> LIZLLL(Map<String, String> map) throws Throwable {
        boolean z;
        Boolean boolValueOf;
        C1849600yEQ c1849600yEQ;
        long j;
        boolean zLJI = MethodIDManager.LJI(196646);
        C01GW c01gw = C1849660yEW.LIZ;
        int i = 0;
        if (c01gw.getValue() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DiggRetryConfig diggRetryConfig = (DiggRetryConfig) c01gw.getValue();
            if (diggRetryConfig != null) {
                i = diggRetryConfig.retryCount;
            }
            DiggRetryConfig diggRetryConfig2 = (DiggRetryConfig) c01gw.getValue();
            if (diggRetryConfig2 != null) {
                j = diggRetryConfig2.timeoutSecond * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            } else {
                j = -1;
            }
            C0WIY<String, Integer> c0wiyLJ = LJ(map, i, Long.valueOf(j));
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c0wiyLJ;
        }
        LJIIIIZZ(map);
        try {
            LJII(map, LIZIZ.LIZIZ(map).get());
            C0WIY<String, Integer> c0wiy = new C0WIY<>(map.get("aweme_id"), Integer.valueOf(CastIntegerProtector.parseInt(map.get("type"))));
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c0wiy;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJI(th, map, true);
            FeedDiggNoNetExp.DiggNoNetConfig diggNoNetConfigLIZ = FeedDiggNoNetExp.LIZ();
            if (diggNoNetConfigLIZ != null && diggNoNetConfigLIZ.enable == 1) {
                i = 1;
            }
            if (i == 0) {
                boolValueOf = Boolean.FALSE;
            } else {
                boolValueOf = Boolean.valueOf(!(th.getCause() instanceof C0XIR));
            }
            if (boolValueOf.booleanValue()) {
                String str = map.get("aweme_id");
                String str2 = map.get("type");
                if (str != null && str2 != null) {
                    String strLIZIZ = C105700ad.LIZIZ(map);
                    if (strLIZIZ == null) {
                        c1849600yEQ = null;
                    } else {
                        c1849600yEQ = new C1849600yEQ(str, str2, strLIZIZ);
                    }
                    if (c1849600yEQ != null) {
                        C08I9 c08i9 = (C08I9) C1849620yES.LIZ.getValue();
                        c08i9.getClass();
                        try {
                            c08i9.LIZ.lock();
                            C1849600yEQ c1849600yEQ2 = (C1849600yEQ) c08i9.LIZJ.get(str);
                            if (c1849600yEQ2 != null && !Intrinsics.LJFF(c1849600yEQ2.LIZIZ, c1849600yEQ.LIZIZ)) {
                                c08i9.LIZJ.remove(str);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("already has one, remove it aid:");
                                sbLIZ.append(str);
                                sbLIZ.append(", now cache: ");
                                sbLIZ.append(c08i9.LIZJ);
                                C2188811AlT.LIZIZ(sbLIZ);
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("put new:");
                                sbLIZ2.append(c1849600yEQ);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                c08i9.LIZJ.put(str, c1849600yEQ);
                            }
                            C823050WQl.LIZIZ().submit(new ARunnableS103S0100000_3(c08i9, 123));
                            c08i9.LIZ.unlock();
                            C0CNO.LIZ(C15O7.LJI, new C1849640yEU());
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c08i9.LIZ.unlock();
                            throw th2;
                        }
                    }
                    C0WIY<String, Integer> c0wiy2 = new C0WIY<>(str, Integer.valueOf(CastIntegerProtector.parseInt(str2)));
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    return c0wiy2;
                }
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
            throw th;
        }
    }

    public static void LJIIIIZZ(Map<String, String> map) {
        C0O8X c0o8x = LIZ;
        c0o8x.LJ();
        c0o8x.LIZLLL = "ttk_aweme_digg_api_monitor";
        String str = map.get("enter_from");
        if (!TextUtils.isEmpty(str)) {
            c0o8x.LIZIZ(str, "enter_from");
        }
        String str2 = map.get("type");
        if (!TextUtils.isEmpty(str2)) {
            c0o8x.LIZIZ(str2, "digg_type");
        }
    }

    public static void LIZIZ(String str, boolean z) {
        if (z) {
            LIZIZ.LIZJ(str, 1).get();
        } else {
            LIZIZ.deleteItem(str).get();
        }
    }

    public static void LJII(Map<String, String> map, BaseResponse baseResponse) {
        C0O8X c0o8x = LIZ;
        c0o8x.LIZIZ("1", "is_final_request");
        c0o8x.LIZ();
        c0o8x.LIZLLL(baseResponse);
        c0o8x.LJFF();
        String str = map.get("aweme_id");
        String str2 = map.get("type");
        C734440SrS c734440SrS = C734440SrS.LIZ;
        int i = CastIntegerProtector.parseInt(str2);
        c734440SrS.getClass();
        C734440SrS.LIZLLL(i, baseResponse, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0WIY<java.lang.String, java.lang.Integer> LJ(java.util.Map<java.lang.String, java.lang.String> r26, int r27, java.lang.Long r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.api.FeedActionApi.LJ(java.util.Map, int, java.lang.Long):X.0WIY");
    }

    public static void LJI(Throwable th, Map map, boolean z) {
        String str;
        C0O8X c0o8x = LIZ;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0o8x.LIZIZ(str, "is_final_request");
        C844470XAv.LIZ.getClass();
        c0o8x.LJI(C1498560p6E.LIZ(C844470XAv.LIZ(), th));
        String str2 = (String) map.get("aweme_id");
        String str3 = (String) map.get("type");
        C734440SrS c734440SrS = C734440SrS.LIZ;
        int i = CastIntegerProtector.parseInt(str3);
        Throwable cause = th.getCause();
        c734440SrS.getClass();
        C734440SrS.LIZ(i, str2, cause);
    }

    public static void LJFF(Map<String, String> map, int i, boolean z, int i2, long j, long j2) {
        String str;
        C0LAB c0lab = new C0LAB();
        String str2 = map.get("enter_from");
        if (!TextUtils.isEmpty(str2)) {
            c0lab.LJ("enter_from", str2);
        }
        String str3 = map.get("type");
        if (!TextUtils.isEmpty(str3)) {
            c0lab.LJ("digg_type", str3);
        }
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_final_request", str);
        c0lab.LIZ(i2, "retry_count");
        c0lab.LIZIZ(j, "timeout_second");
        c0lab.LIZIZ(j2, "duration_network");
        C20684815ws.LJIILLIIL("feed_digg_api_monitor", c0lab.LIZ);
    }
}
