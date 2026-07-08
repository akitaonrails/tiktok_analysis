package com.ss.android.ugc.aweme.series.vip.serviceimpl;

import X.AbstractC1614570s7L;
import X.AbstractC1614600s7O;
import X.AbstractC19484711Kz;
import X.AbstractC19486711Lt;
import X.C098200Yq;
import X.C0KPG;
import X.C11HU;
import X.C11MV;
import X.C11NZ;
import X.C11PQ;
import X.C11QI;
import X.C11QJ;
import X.C11RK;
import X.C11S5;
import X.C13LP;
import X.C1614530s7H;
import X.C1614550s7J;
import X.C1614610s7P;
import X.C1701940uOG;
import X.C1789940wgC;
import X.C1808870xAj;
import X.C189200o6;
import X.C19475111Hh;
import X.C19475711Hn;
import X.C19477211Ic;
import X.C19482011Jy;
import X.C19488511Ml;
import X.C19489311Mt;
import X.C1D18;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2536509wp;
import X.C280320Ayk;
import X.C517630KRt;
import X.EnumC1614520s7G;
import X.InterfaceC1487280oo2;
import X.InterfaceC1791930wjP;
import X.InterfaceC19483011Ki;
import X.InterfaceC20673515v3;
import X.InterfaceC518100KTo;
import Y.AfS203S0100000_34;
import Y.AkS109S1100000_34;
import Y.AkS488S0100000_27;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse;
import com.ss.android.ugc.aweme.series.vip.api.SeriesSubscriptionAPI;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$CancelContractRequest;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$CancelContractResponse;
import com.ss.android.ugc.aweme.series.vip.service.SeriesSubscriptionService;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes35.dex */
public final class SeriesSubscriptionServiceImpl implements SeriesSubscriptionService {
    public final C11PQ<AbstractC1614600s7O> LIZ = C11PQ.LJLLLLLL(C1614610s7P.LIZ);
    public final C11RK<AbstractC1614600s7O> LIZIZ = new C11RK<>();
    public EnumC1614520s7G LIZJ = EnumC1614520s7G.UNKNOWN;
    public volatile Map<String, C517630KRt> LIZLLL = C2097608Jq.LJ();
    public volatile C19489311Mt<Map<String, C517630KRt>> LJ;
    public volatile long LJFF;

    public static String LJIIIZ() {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC1791930wjP interfaceC1791930wjPLLFZ;
        String billingCountryCode;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        return (iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null || (interfaceC1791930wjPLLFZ = interfaceC20673515v3K4.LLFZ()) == null || (billingCountryCode = interfaceC1791930wjPLLFZ.getBillingCountryCode()) == null) ? "" : billingCountryCode;
    }

    @Override // com.ss.android.ugc.aweme.series.vip.service.SeriesSubscriptionService
    public final C11NZ<AbstractC1614600s7O> LIZ() {
        C11PQ<AbstractC1614600s7O> c11pq = this.LIZ;
        c11pq.getClass();
        C19488511Ml c19488511MlLJJIFFI = new C19475711Hn(c11pq).LJJIFFI();
        C11RK<AbstractC1614600s7O> c11rk = this.LIZIZ;
        c11rk.getClass();
        return C11NZ.LJJJLL(c19488511MlLJJIFFI, new C19475711Hn(c11rk));
    }

    @Override // com.ss.android.ugc.aweme.series.vip.service.SeriesSubscriptionService
    public final C11HU LIZIZ() {
        AbstractC19484711Kz<n> subscriptionDetail;
        C1808870xAj c1808870xAj = SeriesSubscriptionAPI.LIZ;
        String strLJIIIZ = LJIIIZ();
        c1808870xAj.getClass();
        SeriesSubscriptionAPI.SubscriptionRetrofitApi subscriptionRetrofitApiLIZ = C1808870xAj.LIZ();
        return ((subscriptionRetrofitApiLIZ == null || (subscriptionDetail = subscriptionRetrofitApiLIZ.getSubscriptionDetail(strLJIIIZ)) == null) ? AbstractC19484711Kz.LJIJJLI(new VipSubscriptionDetailResponse(null, null, null, null, null, 31, null)) : subscriptionDetail.LJIL(new InterfaceC1487280oo2() { // from class: X.00ig
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Object c098200Yq;
                k kVar = (k) obj;
                C150700ht.LIZ.getClass();
                try {
                    c098200Yq = (VipSubscriptionDetailResponse) C150700ht.LIZ().LIZJ(kVar, VipSubscriptionDetailResponse.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null) {
                    return new VipSubscriptionDetailResponse(null, null, null, null, null, 31, null);
                }
                return c098200Yq;
            }
        })).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ());
    }

    public static boolean LJIIJJI(Throwable th) {
        if (!(th instanceof TimeoutException) && !(th instanceof SocketTimeoutException)) {
            Throwable cause = th.getCause();
            if (cause != null) {
                if (!(cause instanceof TimeoutException) && !(cause instanceof SocketTimeoutException)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static C19482011Jy LJIILJJIL(final String str) {
        return new C19475111Hh(C11NZ.LJJLIIIJILLIZJL(0, 40).LJIJJ(new InterfaceC1487280oo2() { // from class: X.0xAl
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return C1808870xAj.LIZIZ(SeriesSubscriptionAPI.LIZ, str, null, 2).LJJIJIIJI(C11S5.LIZ()).LJIL(new InterfaceC1487280oo2() { // from class: X.0xAh
                    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
                    @Override // X.InterfaceC1487280oo2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object apply(java.lang.Object r3) {
                        /*
                            r2 = this;
                            com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$OrderStatusResponse r3 = (com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$OrderStatusResponse) r3
                            com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$OrderStatus r0 = r3.order
                            if (r0 == 0) goto L1a
                            com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$ShopOrderStatus r0 = r0.status
                            if (r0 == 0) goto L1a
                            int[] r1 = X.C1808840xAg.LIZ
                            int r0 = r0.ordinal()
                            r0 = r1[r0]
                            r1 = 1
                            if (r0 != r1) goto L1a
                        L15:
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                            return r0
                        L1a:
                            r1 = 0
                            goto L15
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1808850xAh.apply(java.lang.Object):java.lang.Object");
                    }
                }).LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.01GA
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj2) {
                        if (((Boolean) obj2).booleanValue()) {
                            return AbstractC19484711Kz.LJIJJLI(Boolean.TRUE);
                        }
                        return AbstractC19484711Kz.LJJIJL(2000L, TimeUnit.MILLISECONDS).LJIL(new InterfaceC1487280oo2() { // from class: X.00Dd
                            @Override // X.InterfaceC1487280oo2
                            public final Object apply(Object obj3) {
                                return Boolean.FALSE;
                            }
                        });
                    }
                });
            }
        }).LJJIL(new InterfaceC19483011Ki() { // from class: X.08BK
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return ((Boolean) obj).booleanValue();
            }
        })).LJIL(new InterfaceC1487280oo2() { // from class: X.00Xn
            @Override // X.InterfaceC1487280oo2
            public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                return Unit.LIZ;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.series.vip.service.SeriesSubscriptionService
    public final AbstractC19486711Lt LIZJ(List<String> list) {
        Object c098200Yq;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC1791930wjP interfaceC1791930wjPLLFZ;
        long jLongValue;
        if (((Number) C280320Ayk.LIZ.getValue()).intValue() == 1) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (str.length() > 0) {
                    arrayList.add(str);
                }
            }
            List listLJLLJ = C13LP.LJLLJ(C13LP.LJJJJI(arrayList));
            if (listLJLLJ.isEmpty()) {
                return C11QJ.LL;
            }
            try {
                IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
                if (iUserService != null) {
                    c098200Yq = iUserService.getCurrentUserID();
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str2 = (String) c098200Yq;
            if (str2 == null) {
                str2 = "";
            }
            C19489311Mt<Map<String, C517630KRt>> c19489311Mt = this.LJ;
            if (c19489311Mt != null) {
                return new C11QI(c19489311Mt);
            }
            final C19489311Mt<Map<String, C517630KRt>> c19489311Mt2 = new C19489311Mt<>();
            this.LJ = c19489311Mt2;
            this.LJFF = System.currentTimeMillis();
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (interfaceC1791930wjPLLFZ = interfaceC20673515v3K4.LLFZ()) != null) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(str2);
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                interfaceC1791930wjPLLFZ.LIZJ(new InterfaceC518100KTo() { // from class: X.11Sd
                    @Override // X.InterfaceC518100KTo
                    public final void LIZ(Map<String, C517630KRt> map) {
                        this.LIZ.LIZLLL = map;
                        this.LIZ.LJ = null;
                        c19489311Mt2.onSuccess(map);
                    }
                }, new C1789940wgC(jLongValue, C2536509wp.LIZ(), listLJLLJ, null, 0L, 40));
            } else {
                this.LJ = null;
                c19489311Mt2.onSuccess(C2097608Jq.LJ());
            }
            return new C11QI(c19489311Mt2);
        }
        return C11QJ.LL;
    }

    @Override // com.ss.android.ugc.aweme.series.vip.service.SeriesSubscriptionService
    public final void LJ(EnumC1614520s7G enumC1614520s7G) {
        this.LIZJ = enumC1614520s7G;
    }

    public final void LJIIIIZZ(AbstractC1614600s7O abstractC1614600s7O) {
        this.LIZIZ.onNext(abstractC1614600s7O);
    }

    public final AbstractC1614570s7L LJIIL(String str) {
        if (str != null && (!a0.LJJJIL(str))) {
            return new C1614550s7J(this.LIZJ, str);
        }
        return new C1614530s7H(this.LIZJ, 2131835079);
    }

    @Override // com.ss.android.ugc.aweme.series.vip.service.SeriesSubscriptionService
    public final C19477211Ic LJJIIJ(String str) {
        Object c098200Yq;
        C11NZ<n> c11nzCancelContract;
        C1808870xAj c1808870xAj = SeriesSubscriptionAPI.LIZ;
        SeriesSubscriptionModels$CancelContractRequest seriesSubscriptionModels$CancelContractRequest = new SeriesSubscriptionModels$CancelContractRequest(str);
        c1808870xAj.getClass();
        try {
            SeriesSubscriptionAPI.SubscriptionRetrofitApi subscriptionRetrofitApiLIZ = C1808870xAj.LIZ();
            if (subscriptionRetrofitApiLIZ != null && (c11nzCancelContract = subscriptionRetrofitApiLIZ.cancelContract(seriesSubscriptionModels$CancelContractRequest.contractId)) != null) {
                c098200Yq = c11nzCancelContract.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.00hs
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        Object c098200Yq2;
                        k kVar = (k) obj;
                        C150700ht.LIZ.getClass();
                        try {
                            c098200Yq2 = (SeriesSubscriptionModels$CancelContractResponse) C150700ht.LIZ().LIZJ(kVar, SeriesSubscriptionModels$CancelContractResponse.class);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq2 = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq2) || c098200Yq2 == null) {
                            return new SeriesSubscriptionModels$CancelContractResponse(0, null, null);
                        }
                        return c098200Yq2;
                    }
                });
            } else {
                c098200Yq = C11NZ.LJJJJZ(new SeriesSubscriptionModels$CancelContractResponse(0, null, null));
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = C11NZ.LJJJJZ(new SeriesSubscriptionModels$CancelContractResponse(0, null, null));
        }
        return new C11MV(((C11NZ) c098200Yq).LJL(C11S5.LIZ()).LJJIJIL(new AfS203S0100000_34(this, 13)), new AkS109S1100000_34(this, str, 2)).LJI(new C1D18(this, 0)).LJIILJJIL(C1701940uOG.LIZIZ());
    }

    public static C19482011Jy LJIILIIL(final String str, final Function1 function1) {
        return new C19475111Hh(C11NZ.LJJLIIIJILLIZJL(0, 40).LJIJJ(new InterfaceC1487280oo2() { // from class: X.0xAk
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return C1808870xAj.LIZIZ(SeriesSubscriptionAPI.LIZ, null, str, 1).LJJIJIIJI(C11S5.LIZ()).LJIL(new AkS488S0100000_27(function1, 1)).LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.01G9
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj2) {
                        if (((Boolean) obj2).booleanValue()) {
                            return AbstractC19484711Kz.LJIJJLI(Boolean.TRUE);
                        }
                        return AbstractC19484711Kz.LJJIJL(2000L, TimeUnit.MILLISECONDS).LJIL(new InterfaceC1487280oo2() { // from class: X.00Dc
                            @Override // X.InterfaceC1487280oo2
                            public final Object apply(Object obj3) {
                                return Boolean.FALSE;
                            }
                        });
                    }
                });
            }
        }).LJJIL(new InterfaceC19483011Ki() { // from class: X.08BJ
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return ((Boolean) obj).booleanValue();
            }
        })).LJIL(new InterfaceC1487280oo2() { // from class: X.00Xm
            @Override // X.InterfaceC1487280oo2
            public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                return Unit.LIZ;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.series.vip.service.SeriesSubscriptionService
    public final void LIZLLL(Context context, C0KPG c0kpg) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC1791930wjP interfaceC1791930wjPLLFZ;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (interfaceC1791930wjPLLFZ = interfaceC20673515v3K4.LLFZ()) != null) {
            interfaceC1791930wjPLLFZ.LJFF(context, c0kpg, C2536509wp.LIZ(), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[PHI: r1
      0x0039: PHI (r1v5 X.1B0z) = (r1v1 X.1B0z), (r1v6 X.1B0z) binds: [B:14:0x0037, B:12:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[PHI: r1
      0x003d: PHI (r1v4 X.1B0z) = (r1v1 X.1B0z), (r1v5 X.1B0z) binds: [B:14:0x0037, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC19484711Kz<X.C0KPG> LJIIJ(android.content.Context r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.Class<com.ss.android.ugc.aweme.service.MiniDramaPaymentService> r0 = com.ss.android.ugc.aweme.service.MiniDramaPaymentService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r5 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.service.MiniDramaPaymentService r5 = (com.ss.android.ugc.aweme.service.MiniDramaPaymentService) r5
            if (r5 != 0) goto L1c
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "MiniDramaPaymentService not found"
            r1.<init>(r0)
            X.11Is r0 = X.AbstractC19484711Kz.LJIILLIIL(r1)
            return r0
        L1c:
            X.11Mt r4 = new X.11Mt
            r4.<init>()
            X.11PQ<X.0s7O> r0 = r6.LIZ
            java.lang.Object r3 = r0.LJLZ()
            boolean r0 = r3 instanceof X.C1614630s7R
            if (r0 == 0) goto L53
            X.0s7R r3 = (X.C1614630s7R) r3
        L2d:
            X.0s7M r2 = new X.0s7M
            if (r3 == 0) goto L35
            X.1B0z r1 = r3.LIZ
            if (r1 != 0) goto L39
        L35:
            X.1B0z r1 = X.EnumC2198071B0z.SUBSCRIBE
            if (r3 == 0) goto L3d
        L39:
            X.0s7G r0 = r3.LIZIZ
            if (r0 != 0) goto L3f
        L3d:
            X.0s7G r0 = X.EnumC1614520s7G.UNKNOWN
        L3f:
            r2.<init>(r1, r0)
            r6.LJIIIIZZ(r2)
            java.util.Map r2 = X.C2097608Jq.LJ()
            kotlin.jvm.internal.AwS400S0200000_34 r1 = new kotlin.jvm.internal.AwS400S0200000_34
            r0 = 7
            r1.<init>(r6, r4, r0)
            r5.LJIIIIZZ(r7, r8, r2, r1)
            return r4
        L53:
            r3 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.vip.serviceimpl.SeriesSubscriptionServiceImpl.LJIIJ(android.content.Context, java.lang.String):X.11Kz");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:3:0x001c, B:5:0x0022, B:7:0x0028, B:8:0x002e, B:10:0x0032, B:11:0x0038, B:13:0x003e, B:14:0x0044, B:17:0x004e), top: B:25:0x001c }] */
    @Override // com.ss.android.ugc.aweme.series.vip.service.SeriesSubscriptionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19477211Ic LJII(android.content.Context r17, java.lang.String r18, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeETInfo r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.vip.serviceimpl.SeriesSubscriptionServiceImpl.LJII(android.content.Context, java.lang.String, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeETInfo, java.lang.String):X.11Ic");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:3:0x001e, B:5:0x0024, B:7:0x0028, B:8:0x002c, B:10:0x0030, B:11:0x0036, B:13:0x003a, B:14:0x0040, B:16:0x0044, B:17:0x004c, B:19:0x0054, B:20:0x005a, B:25:0x006b), top: B:33:0x001e }] */
    @Override // com.ss.android.ugc.aweme.series.vip.service.SeriesSubscriptionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19477211Ic LJFF(android.content.Context r19, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeProductInfo r20, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeBizLine r21, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeETInfo r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.vip.serviceimpl.SeriesSubscriptionServiceImpl.LJFF(android.content.Context, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeProductInfo, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeBizLine, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeETInfo, java.lang.String, java.lang.String):X.11Ic");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0020, B:5:0x0026, B:7:0x002a, B:8:0x002e, B:10:0x0032, B:11:0x0038, B:13:0x003c, B:14:0x0042, B:16:0x0046, B:17:0x004e, B:19:0x0052, B:20:0x0054, B:22:0x005c, B:23:0x0062, B:29:0x0075), top: B:37:0x0020 }] */
    @Override // com.ss.android.ugc.aweme.series.vip.service.SeriesSubscriptionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19477211Ic LJI(android.content.Context r21, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeProductInfo r22, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeBizLine r23, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$MarketInfo r24, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeETInfo r25, java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.vip.serviceimpl.SeriesSubscriptionServiceImpl.LJI(android.content.Context, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeProductInfo, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeBizLine, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$MarketInfo, com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeETInfo, java.lang.String, java.lang.String):X.11Ic");
    }
}
