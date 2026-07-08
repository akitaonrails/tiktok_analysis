package com.ss.android.ugc.aweme.series.payment.serviceimpl;

import X.AbstractC1159090gGh;
import X.AbstractC19484711Kz;
import X.AbstractC19486711Lt;
import X.AbstractC2126608Uu;
import X.C01GW;
import X.C09JN;
import X.C0CQT;
import X.C0KPG;
import X.C1155860gBU;
import X.C11IR;
import X.C11JF;
import X.C11JV;
import X.C11MT;
import X.C11NZ;
import X.C11RK;
import X.C11S5;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397720mTa;
import X.C1612570s47;
import X.C1612600s4A;
import X.C1613010s4p;
import X.C1613360s5O;
import X.C1613450s5X;
import X.C1613540s5g;
import X.C1614240s6o;
import X.C1701940uOG;
import X.C1789970wgF;
import X.C19475211Hi;
import X.C19489111Mr;
import X.C452501pT;
import X.C517260KQi;
import X.C757070Tmr;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC1612690s4J;
import X.EnumC1613440s5W;
import X.InterfaceC1487280oo2;
import X.InterfaceC1614200s6k;
import X.InterfaceC1614350s6z;
import X.InterfaceC1791930wjP;
import X.InterfaceC518120KTq;
import X.InterfaceC781210Ukh;
import Y.ARunnableS43S0110000_24;
import Y.ARunnableS93S0200000_24;
import Y.AfS0S2600100_24;
import Y.AfS172S0100000_3;
import Y.AfS178S0100000_9;
import Y.AfS188S0100000_19;
import Y.AfS193S0100000_24;
import Y.AfS1S1400100_24;
import Y.AfS6S0200100_18;
import Y.AkS485S0100000_24;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionRefundResponse;
import com.ss.android.ugc.aweme.model.VideoPurchaseConfirmationResponse;
import com.ss.android.ugc.aweme.payment.MarketplaceCreateOrderResponse;
import com.ss.android.ugc.aweme.series.payment.api.SeriesPaymentApi;
import com.ss.android.ugc.aweme.series.payment.fragment.SeriesRefundFragment;
import com.ss.android.ugc.aweme.series.payment.serviceimpl.SeriesPaymentServiceImpl;
import com.ss.android.ugc.aweme.service.MiniDramaPaymentService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS138S1100000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS69S1000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesPaymentServiceImpl implements MiniDramaPaymentService {
    public final List<InterfaceC1614200s6k> LIZ;
    public final List<String> LIZIZ;
    public final Set<InterfaceC1614350s6z> LIZJ;
    public final BPEAHandler LIZLLL;
    public final String LJ;
    public final C11RK<C0KPG> LJFF;
    public final InterfaceC1791930wjP LJI;
    public final C01GW LJII;

    @Override // com.ss.android.ugc.aweme.service.MiniDramaPaymentService
    public final void LIZJ() {
    }

    public SeriesPaymentServiceImpl() {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        this.LIZIZ = new ArrayList();
        this.LIZJ = new LinkedHashSet();
        this.LIZLLL = new BPEAHandler(Looper.getMainLooper());
        arrayList.add(new InterfaceC1614200s6k() { // from class: X.0s5V
            public long LIZ;
            public long LIZIZ;
            public long LIZJ;
            public C1613360s5O LIZLLL;
            public C1613360s5O LJ;

            @Override // X.InterfaceC1614200s6k
            public final void LIZ(C1613360s5O c1613360s5O) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.LIZIZ;
                long j2 = jElapsedRealtime - this.LIZ;
                C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                EnumC1613440s5W enumC1613440s5W = EnumC1613440s5W.MP_PAYMENT_SUCCESS;
                Boolean bool = c1613360s5O.LIZJ;
                Long lValueOf = Long.valueOf(j2);
                c1611790s2r.getClass();
                C1611790s2r.LJIIJ(enumC1613440s5W, c1613360s5O, bool, null, null, lValueOf, j);
                this.LJ = c1613360s5O;
                C1612830s4X c1612830s4X = c1613360s5O.LIZIZ;
                if (c1612830s4X != null && c1612830s4X.isInLockVideo()) {
                    this.LIZJ = jElapsedRealtime;
                    this.LIZLLL = c1613360s5O;
                } else {
                    this.LIZJ = 0L;
                    this.LIZLLL = null;
                }
            }

            @Override // X.InterfaceC1614200s6k
            public final void LIZIZ(C1613360s5O c1613360s5O) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.LIZIZ;
                long j2 = jElapsedRealtime - this.LIZ;
                this.LIZIZ = jElapsedRealtime;
                C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                EnumC1613440s5W enumC1613440s5W = EnumC1613440s5W.MP_PAYMENT_START;
                Boolean bool = c1613360s5O.LIZJ;
                Long lValueOf = Long.valueOf(j2);
                c1611790s2r.getClass();
                C1611790s2r.LJIIJ(enumC1613440s5W, c1613360s5O, bool, null, null, lValueOf, j);
            }

            @Override // X.InterfaceC1614200s6k
            public final void LIZJ(C1613360s5O c1613360s5O) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.LIZ = jElapsedRealtime;
                this.LIZIZ = jElapsedRealtime;
                C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                EnumC1613440s5W enumC1613440s5W = EnumC1613440s5W.CLICK_PURCHASE;
                Boolean bool = c1613360s5O.LIZJ;
                c1611790s2r.getClass();
                C1611790s2r.LJIIJ(enumC1613440s5W, c1613360s5O, bool, null, null, 0L, 0L);
            }

            @Override // X.InterfaceC1614200s6k
            public final void LIZLLL(C1613360s5O c1613360s5O) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.LIZIZ;
                long j2 = jElapsedRealtime - this.LIZ;
                this.LIZIZ = jElapsedRealtime;
                C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                EnumC1613440s5W enumC1613440s5W = EnumC1613440s5W.CONFIRM_PURCHASE_START;
                Boolean bool = c1613360s5O.LIZJ;
                Long lValueOf = Long.valueOf(j2);
                c1611790s2r.getClass();
                C1611790s2r.LJIIJ(enumC1613440s5W, c1613360s5O, bool, null, null, lValueOf, j);
            }

            @Override // X.InterfaceC1614200s6k
            public final void LJII(C1613360s5O c1613360s5O) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.LIZIZ;
                long j2 = jElapsedRealtime - this.LIZ;
                this.LIZIZ = jElapsedRealtime;
                C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                EnumC1613440s5W enumC1613440s5W = EnumC1613440s5W.CREATE_ORDER_SUCCESS;
                Boolean bool = c1613360s5O.LIZJ;
                Long lValueOf = Long.valueOf(j2);
                c1611790s2r.getClass();
                C1611790s2r.LJIIJ(enumC1613440s5W, c1613360s5O, bool, CardStruct.IStatusCode.DEFAULT, null, lValueOf, j);
            }

            @Override // X.InterfaceC1614200s6k
            public final void LJIIIIZZ(Aweme aweme) {
                Long lValueOf;
                Long lValueOf2;
                PaidContentInfo paidContentInfo;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null) {
                    lValueOf = Long.valueOf(paidContentInfo.getPaidCollectionId());
                } else {
                    lValueOf = null;
                }
                C1613360s5O c1613360s5O = this.LIZLLL;
                if (c1613360s5O != null && this.LIZJ != 0 && lValueOf != null) {
                    CollectionDetailModel collectionDetailModel = c1613360s5O.LIZ;
                    if (collectionDetailModel != null) {
                        lValueOf2 = Long.valueOf(collectionDetailModel.collectionId);
                    } else {
                        lValueOf2 = null;
                    }
                    if (Intrinsics.LJFF(lValueOf2, lValueOf)) {
                        long j = jElapsedRealtime - this.LIZ;
                        long j2 = jElapsedRealtime - this.LIZJ;
                        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                        EnumC1613440s5W enumC1613440s5W = EnumC1613440s5W.FIRST_FRAME_RENDER;
                        C1613360s5O c1613360s5O2 = this.LIZLLL;
                        Boolean bool = c1613360s5O.LIZJ;
                        Long lValueOf3 = Long.valueOf(j);
                        c1611790s2r.getClass();
                        C1611790s2r.LJIIJ(enumC1613440s5W, c1613360s5O2, bool, null, null, lValueOf3, j2);
                        this.LIZJ = 0L;
                        this.LIZLLL = null;
                    }
                }
            }

            @Override // X.InterfaceC1614200s6k
            public final void LJIIIZ(C1613360s5O c1613360s5O) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.LIZIZ;
                long j2 = jElapsedRealtime - this.LIZ;
                this.LIZIZ = jElapsedRealtime;
                C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                EnumC1613440s5W enumC1613440s5W = EnumC1613440s5W.CONFIRM_PURCHASE_SUCCESS;
                Boolean bool = c1613360s5O.LIZJ;
                Long lValueOf = Long.valueOf(j2);
                c1611790s2r.getClass();
                C1611790s2r.LJIIJ(enumC1613440s5W, c1613360s5O, bool, null, null, lValueOf, j);
            }

            @Override // X.InterfaceC1614200s6k
            public final void LJIIJ(Long l) {
                Long lValueOf;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.LIZIZ;
                long j2 = jElapsedRealtime - this.LIZ;
                C1613360s5O c1613360s5O = this.LJ;
                if (c1613360s5O != null && l != null) {
                    CollectionDetailModel collectionDetailModel = c1613360s5O.LIZ;
                    Boolean bool = null;
                    if (collectionDetailModel != null) {
                        lValueOf = Long.valueOf(collectionDetailModel.collectionId);
                    } else {
                        lValueOf = null;
                    }
                    if (Intrinsics.LJFF(lValueOf, l)) {
                        this.LIZIZ = jElapsedRealtime;
                        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                        EnumC1613440s5W enumC1613440s5W = EnumC1613440s5W.URL_LESS_REQUEST_START;
                        C1613360s5O c1613360s5O2 = this.LJ;
                        if (c1613360s5O2 != null) {
                            bool = c1613360s5O2.LIZJ;
                        }
                        Long lValueOf2 = Long.valueOf(j2);
                        c1611790s2r.getClass();
                        C1611790s2r.LJIIJ(enumC1613440s5W, c1613360s5O2, bool, null, null, lValueOf2, j);
                    }
                }
            }

            @Override // X.InterfaceC1614200s6k
            public final void LJIIJJI(Long l) {
                Long lValueOf;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.LIZIZ;
                long j2 = jElapsedRealtime - this.LIZ;
                C1613360s5O c1613360s5O = this.LJ;
                if (c1613360s5O != null && l != null) {
                    CollectionDetailModel collectionDetailModel = c1613360s5O.LIZ;
                    Boolean bool = null;
                    if (collectionDetailModel != null) {
                        lValueOf = Long.valueOf(collectionDetailModel.collectionId);
                    } else {
                        lValueOf = null;
                    }
                    if (Intrinsics.LJFF(lValueOf, l)) {
                        this.LIZIZ = jElapsedRealtime;
                        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                        EnumC1613440s5W enumC1613440s5W = EnumC1613440s5W.URL_LESS_REQUEST_SUCCESS;
                        C1613360s5O c1613360s5O2 = this.LJ;
                        if (c1613360s5O2 != null) {
                            bool = c1613360s5O2.LIZJ;
                        }
                        Long lValueOf2 = Long.valueOf(j2);
                        c1611790s2r.getClass();
                        C1611790s2r.LJIIJ(enumC1613440s5W, c1613360s5O2, bool, null, null, lValueOf2, j);
                    }
                }
            }

            @Override // X.InterfaceC1614200s6k
            public final void LJIILIIL(C1613360s5O c1613360s5O) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.LIZIZ;
                long j2 = jElapsedRealtime - this.LIZ;
                this.LIZIZ = jElapsedRealtime;
                C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                EnumC1613440s5W enumC1613440s5W = EnumC1613440s5W.CREATE_ORDER;
                Boolean bool = c1613360s5O.LIZJ;
                Long lValueOf = Long.valueOf(j2);
                c1611790s2r.getClass();
                C1611790s2r.LJIIJ(enumC1613440s5W, c1613360s5O, bool, null, null, lValueOf, j);
            }

            @Override // X.InterfaceC1614200s6k
            public final void LJ(C1613360s5O c1613360s5O, String str, String str2) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.LIZIZ;
                long j2 = jElapsedRealtime - this.LIZ;
                C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                EnumC1613440s5W enumC1613440s5W = EnumC1613440s5W.CREATE_ORDER_FAILED;
                Boolean bool = c1613360s5O.LIZJ;
                Long lValueOf = Long.valueOf(j2);
                c1611790s2r.getClass();
                C1611790s2r.LJIIJ(enumC1613440s5W, c1613360s5O, bool, str, str2, lValueOf, j);
            }

            @Override // X.InterfaceC1614200s6k
            public final void LJFF(Long l, String str, String str2) {
                Long lValueOf;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.LIZIZ;
                long j2 = jElapsedRealtime - this.LIZ;
                C1613360s5O c1613360s5O = this.LJ;
                if (c1613360s5O != null && l != null) {
                    CollectionDetailModel collectionDetailModel = c1613360s5O.LIZ;
                    Boolean bool = null;
                    if (collectionDetailModel != null) {
                        lValueOf = Long.valueOf(collectionDetailModel.collectionId);
                    } else {
                        lValueOf = null;
                    }
                    if (Intrinsics.LJFF(lValueOf, l)) {
                        this.LIZIZ = jElapsedRealtime;
                        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                        EnumC1613440s5W enumC1613440s5W = EnumC1613440s5W.URL_LESS_REQUEST_FAILED;
                        C1613360s5O c1613360s5O2 = this.LJ;
                        if (c1613360s5O2 != null) {
                            bool = c1613360s5O2.LIZJ;
                        }
                        Long lValueOf2 = Long.valueOf(j2);
                        c1611790s2r.getClass();
                        C1611790s2r.LJIIJ(enumC1613440s5W, c1613360s5O2, bool, str, str2, lValueOf2, j);
                    }
                }
            }

            @Override // X.InterfaceC1614200s6k
            public final void LJI(C1613360s5O c1613360s5O, String str, String str2) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.LIZIZ;
                long j2 = jElapsedRealtime - this.LIZ;
                C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                EnumC1613440s5W enumC1613440s5W = EnumC1613440s5W.MP_PAYMENT_FAILED;
                Boolean bool = c1613360s5O.LIZJ;
                Long lValueOf = Long.valueOf(j2);
                c1611790s2r.getClass();
                C1611790s2r.LJIIJ(enumC1613440s5W, c1613360s5O, bool, str, str2, lValueOf, j);
            }

            @Override // X.InterfaceC1614200s6k
            public final void LJIIL(C1613360s5O c1613360s5O, String str, String str2) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.LIZIZ;
                long j2 = jElapsedRealtime - this.LIZ;
                this.LIZIZ = jElapsedRealtime;
                C1611790s2r c1611790s2r = C1611790s2r.LIZ;
                EnumC1613440s5W enumC1613440s5W = EnumC1613440s5W.CONFIRM_PURCHASE_FAILED;
                Boolean bool = c1613360s5O.LIZJ;
                Long lValueOf = Long.valueOf(j2);
                c1611790s2r.getClass();
                C1611790s2r.LJIIJ(enumC1613440s5W, c1613360s5O, bool, str, str2, lValueOf, j);
            }
        });
        if (C517260KQi.LIZ()) {
            arrayList.add(new InterfaceC1614200s6k() { // from class: X.0s4S
                @Override // X.InterfaceC1614200s6k
                public final void LIZ(C1613360s5O c1613360s5O) {
                }

                @Override // X.InterfaceC1614200s6k
                public final void LIZIZ(C1613360s5O c1613360s5O) {
                }

                @Override // X.InterfaceC1614200s6k
                public final void LIZJ(C1613360s5O c1613360s5O) {
                }

                @Override // X.InterfaceC1614200s6k
                public final void LIZLLL(C1613360s5O c1613360s5O) {
                }

                @Override // X.InterfaceC1614200s6k
                public final void LJFF(Long l, String str, String str2) {
                }

                @Override // X.InterfaceC1614200s6k
                public final void LJI(C1613360s5O c1613360s5O, String str, String str2) {
                }

                @Override // X.InterfaceC1614200s6k
                public final void LJII(C1613360s5O c1613360s5O) {
                }

                @Override // X.InterfaceC1614200s6k
                public final void LJIIIIZZ(Aweme aweme) {
                }

                @Override // X.InterfaceC1614200s6k
                public final void LJIIIZ(C1613360s5O c1613360s5O) {
                }

                @Override // X.InterfaceC1614200s6k
                public final void LJIIJ(Long l) {
                }

                @Override // X.InterfaceC1614200s6k
                public final void LJIIJJI(Long l) {
                }

                @Override // X.InterfaceC1614200s6k
                public final void LJIIL(C1613360s5O c1613360s5O, String str, String str2) {
                }

                @Override // X.InterfaceC1614200s6k
                public final void LJIILIIL(C1613360s5O c1613360s5O) {
                }

                @Override // X.InterfaceC1614200s6k
                public final void LJ(C1613360s5O c1613360s5O, String str, String str2) {
                    Activity activityLIZIZ;
                    Map<String, Object> map;
                    C1612560s46 c1612560s46;
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                        C0KVI c0kvi = C0KVI.LIZ;
                        String string = activityLIZIZ.getString(2131848126);
                        String string2 = activityLIZIZ.getString(2131848125);
                        String string3 = activityLIZIZ.getString(2131822144);
                        C1612830s4X c1612830s4X = c1613360s5O.LIZIZ;
                        if (c1612830s4X != null && (c1612560s46 = c1612830s4X.iapETParams) != null) {
                            map = c1612560s46.iapTrackingData;
                        } else {
                            map = null;
                        }
                        C0KVI.LIZIZ(c0kvi, activityLIZIZ, string, str2, string2, string3, map, C2095008Iq.LJIIJJI(str), 768);
                    }
                }
            });
        }
        this.LJ = "8026BWJ41401";
        this.LJFF = new C11RK<>();
        this.LJI = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLFZ();
        this.LJII = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(626));
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaPaymentService
    public final boolean LJI() {
        return C757070Tmr.LIZ();
    }

    public static void LJIILJJIL(Context context) {
        String string = context.getString(2131835147);
        String string2 = context.getString(2131835145);
        String string3 = context.getString(2131835144);
        String string4 = context.getString(2131835146);
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJI(string);
        c1397580mTM.LIZIZ(string2);
        C1397720mTa.LIZ(c1397580mTM, string3, new AwS597S0100000_18(context, 558));
        C985403tE.LIZ(c1397580mTM, new AwS69S1000000_18(string4, 3));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaPaymentService
    public final void LIZ(InterfaceC1614350s6z interfaceC1614350s6z) {
        this.LIZJ.remove(interfaceC1614350s6z);
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaPaymentService
    public final void LIZLLL(Aweme aweme) {
        Iterator<InterfaceC1614200s6k> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaPaymentService
    public final void LJIIJ(InterfaceC1614350s6z interfaceC1614350s6z) {
        this.LIZJ.add(interfaceC1614350s6z);
    }

    public final void LJIILIIL(AbstractC1159090gGh abstractC1159090gGh) {
        ARunnableS93S0200000_24 aRunnableS93S0200000_24 = new ARunnableS93S0200000_24(this, abstractC1159090gGh, 26);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            aRunnableS93S0200000_24.run();
        } else {
            C786410Ut5.LJJZZIII(this.LIZLLL, aRunnableS93S0200000_24);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaPaymentService
    public final void LJ(EnumC1613440s5W enumC1613440s5W, Long l) {
        int i = C1613450s5X.LIZ[enumC1613440s5W.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Iterator it2 = ((ArrayList) this.LIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1614200s6k) it2.next()).LJFF(l, "", "");
                }
                return;
            }
            Iterator it3 = ((ArrayList) this.LIZ).iterator();
            while (it3.hasNext()) {
                ((InterfaceC1614200s6k) it3.next()).LJIIJJI(l);
            }
            return;
        }
        Iterator it4 = ((ArrayList) this.LIZ).iterator();
        while (it4.hasNext()) {
            ((InterfaceC1614200s6k) it4.next()).LJIIJ(l);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaPaymentService
    public final SeriesRefundFragment LJIIJJI(CollectionDetailModel collectionDetailModel, Bundle bundle) {
        SeriesRefundFragment seriesRefundFragment = new SeriesRefundFragment(collectionDetailModel);
        seriesRefundFragment.setArguments(bundle);
        return seriesRefundFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    @Override // com.ss.android.ugc.aweme.service.MiniDramaPaymentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.tux.sheet.sheet.TuxSheet LIZIZ(androidx.fragment.app.FragmentManager r9, X.C1612700s4K r10, com.ss.android.ugc.aweme.model.CollectionDetailModel r11, kotlin.jvm.functions.Function0 r12) {
        /*
            r8 = this;
            boolean r0 = X.C757070Tmr.LIZ()
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L5d
            X.0s3a r1 = r10.fullSeriesPurchaseSheetModel
            X.0mIc r6 = new X.0mIc
            r6.<init>(r5, r5)
            java.lang.String r0 = com.ss.android.ugc.aweme.series.payment.fragment.SeriesPurchaseBlockFragment._pnsPageId
            r7 = 0
            if (r1 == 0) goto L58
            com.ss.android.ugc.aweme.model.UrlModel r0 = r1.collectionCover
            if (r0 == 0) goto L58
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L58
            java.lang.Object r3 = X.C13LP.LJJJLL(r0)
            java.lang.String r3 = (java.lang.String) r3
        L24:
            java.lang.String r2 = r1.collectionName
        L26:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "collection_cover_url"
            X.C786410Ut5.LJJJI(r0, r3, r1)
            java.lang.String r0 = "collection_name"
            X.C786410Ut5.LJJJI(r0, r2, r1)
            com.ss.android.ugc.aweme.series.payment.fragment.SeriesPurchaseBlockFragment r0 = new com.ss.android.ugc.aweme.series.payment.fragment.SeriesPurchaseBlockFragment
            r0.<init>(r7)
            r0.setArguments(r1)
            com.bytedance.tux.sheet.sheet.TuxSheet r2 = r6.LIZ
            r2.LLJJIJI = r0
            if (r12 == 0) goto L4b
            X.0sHK r1 = new X.0sHK
            r0 = 6
            r1.<init>(r12, r0)
            r2.LLILLJJLI = r1
        L4b:
            r6.LJIIIIZZ(r5)
            com.bytedance.tux.sheet.sheet.TuxSheet r1 = r6.LIZ
            r1.LLJJIJIIJIL = r4
            java.lang.String r0 = "purchase_option_sheet"
            r1.show(r9, r0)
            return r1
        L58:
            r3 = r7
            if (r1 != 0) goto L24
            r2 = r7
            goto L26
        L5d:
            X.0mIc r3 = new X.0mIc
            r3.<init>(r5, r5)
            X.0s5q r0 = com.ss.android.ugc.aweme.series.payment.fragment.SeriesPurchaseSummaryFragment.LLJJJJJIL
            r0.getClass()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r0 = "purchase_summary_sheet_params"
            X.C786410Ut5.LJJIZ(r2, r0, r10)
            java.lang.String r0 = "purchase_summary_sheet_collection_detail"
            X.C786410Ut5.LJJIZ(r2, r0, r11)
            com.ss.android.ugc.aweme.series.payment.fragment.SeriesPurchaseSummaryFragment r1 = new com.ss.android.ugc.aweme.series.payment.fragment.SeriesPurchaseSummaryFragment
            r1.<init>()
            r1.setArguments(r2)
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r3.LIZ
            r0.LLJJIJI = r1
            r0.LLJLILLLLZIIL = r5
            r3.LJIIIIZZ(r5)
            com.bytedance.tux.sheet.sheet.TuxSheet r2 = r3.LIZ
            r2.LLJJIJIIJIL = r4
            X.0sHK r1 = new X.0sHK
            r0 = 7
            r1.<init>(r12, r0)
            r2.LLILLJJLI = r1
            X.0sHJ r1 = new X.0sHJ
            r0 = 1
            r1.<init>(r12, r0)
            r2.LL = r1
            java.lang.String r0 = "purchase_summary_sheet"
            r2.show(r9, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.payment.serviceimpl.SeriesPaymentServiceImpl.LIZIZ(androidx.fragment.app.FragmentManager, X.0s4K, com.ss.android.ugc.aweme.model.CollectionDetailModel, kotlin.jvm.functions.Function0):com.bytedance.tux.sheet.sheet.TuxSheet");
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaPaymentService
    public final void LJIIIIZZ(Context context, String str, Map<String, ? extends Object> map, final Function1<? super C1155860gBU, Unit> function1) {
        InterfaceC1791930wjP interfaceC1791930wjP = this.LJI;
        if (interfaceC1791930wjP != null) {
            interfaceC1791930wjP.LIZIZ(C1388190mED.LIZ(context), new C1789970wgF(str, new HashMap(map)), new InterfaceC518120KTq() { // from class: X.0s6l
                @Override // X.InterfaceC518120KTq
                public final void LIZ(C0KPG c0kpg) {
                    function1.invoke(new C1155860gBU(c0kpg.LIZ.getValue(), c0kpg));
                }
            });
        }
    }

    public final C19489111Mr LJIILLIIL(final long j, final String str, final String str2, final C1613360s5O c1613360s5O) {
        AbstractC19484711Kz<VideoPurchaseConfirmationResponse> abstractC19484711KzConfirmPurchase;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1614200s6k) it2.next()).LIZLLL(c1613360s5O);
        }
        SeriesPaymentApi.CreateOrderApi createOrderApiLIZ = C1614240s6o.LIZ();
        if (createOrderApiLIZ == null || (abstractC19484711KzConfirmPurchase = createOrderApiLIZ.confirmPurchase(j, str)) == null) {
            abstractC19484711KzConfirmPurchase = C19475211Hi.LL;
        }
        AbstractC19486711Lt abstractC19486711LtLJIJ = abstractC19484711KzConfirmPurchase.LJIILJJIL(new AfS193S0100000_24(this, 53)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIJ(new InterfaceC1487280oo2() { // from class: X.0s6c
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) throws C1169930gYB {
                VideoPurchaseConfirmationResponse videoPurchaseConfirmationResponse = (VideoPurchaseConfirmationResponse) obj;
                if (videoPurchaseConfirmationResponse.hasConfirmedPurchase) {
                    List<InterfaceC1614200s6k> list = this.LL.LIZ;
                    C1613360s5O c1613360s5O2 = c1613360s5O;
                    Iterator it3 = ((ArrayList) list).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC1614200s6k) it3.next()).LJIIIZ(c1613360s5O2);
                    }
                    SeriesPaymentServiceImpl seriesPaymentServiceImpl = this.LL;
                    List list2 = videoPurchaseConfirmationResponse.videoIds;
                    if (list2 == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    seriesPaymentServiceImpl.LJIILIIL(new C1159260gGy(str, list2, videoPurchaseConfirmationResponse.purchaseOptions, videoPurchaseConfirmationResponse.firstUnpurchasedSeqId, videoPurchaseConfirmationResponse.preselectIndex, j));
                    return C11QJ.LL;
                }
                throw C1169930gYB.INSTANCE;
            }
        });
        SettingsManager.LIZLLL().getClass();
        return abstractC19486711LtLJIJ.LJIILLIIL(new C11MT(SettingsManager.LJ("paid_content_retry_times_after_purchase", 6))).LJII(new InterfaceC781210Ukh() { // from class: X.0s6j
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                SeriesPaymentServiceImpl seriesPaymentServiceImpl = this.LIZ;
                seriesPaymentServiceImpl.getClass();
                ARunnableS43S0110000_24 aRunnableS43S0110000_24 = new ARunnableS43S0110000_24(seriesPaymentServiceImpl, false, 4);
                if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                    aRunnableS43S0110000_24.run();
                } else {
                    C786410Ut5.LJJZZIII(seriesPaymentServiceImpl.LIZLLL, aRunnableS43S0110000_24);
                }
                C1612490s3z c1612490s3z = C1612490s3z.LJI;
                String str3 = str2;
                String strValueOf = String.valueOf(j);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c1612490s3z.getClass();
                C1612490s3z.LJJJJZI(jCurrentTimeMillis2, true, str3, strValueOf, null, true);
            }
        }).LJIIIIZZ(new C09JN() { // from class: X.0s6f
            @Override // X.C09JN
            public final void accept(Object obj) {
                String strValueOf;
                String strValueOf2;
                C1C7U.LIZ("SeriesPaymentServiceImpl@a944.pollPurchaseConfirmation$6");
                Throwable th = (Throwable) obj;
                List<InterfaceC1614200s6k> list = this.LL.LIZ;
                C1613360s5O c1613360s5O2 = c1613360s5O;
                for (InterfaceC1614200s6k interfaceC1614200s6k : (ArrayList) list) {
                    String str3 = "";
                    if (!(th instanceof C0XIR)) {
                        strValueOf2 = "";
                    } else {
                        strValueOf2 = String.valueOf(((C23112093u) th).getErrorCode());
                    }
                    String message = th.getMessage();
                    if (message != null) {
                        str3 = message;
                    }
                    interfaceC1614200s6k.LJIIL(c1613360s5O2, strValueOf2, str3);
                }
                SeriesPaymentServiceImpl seriesPaymentServiceImpl = this.LL;
                seriesPaymentServiceImpl.getClass();
                ARunnableS43S0110000_24 aRunnableS43S0110000_24 = new ARunnableS43S0110000_24(seriesPaymentServiceImpl, false, 4);
                if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                    aRunnableS43S0110000_24.run();
                } else {
                    C786410Ut5.LJJZZIII(seriesPaymentServiceImpl.LIZLLL, aRunnableS43S0110000_24);
                }
                C1612490s3z c1612490s3z = C1612490s3z.LJI;
                String str4 = str2;
                String strValueOf3 = String.valueOf(j);
                boolean z = th instanceof C1169930gYB;
                if (th instanceof C0XIR) {
                    strValueOf = String.valueOf(((C23112093u) th).getErrorCode());
                } else {
                    strValueOf = null;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c1612490s3z.getClass();
                C1612490s3z.LJJJJZI(jCurrentTimeMillis2, false, str4, strValueOf3, strValueOf, z);
                C1C7U.LIZIZ("SeriesPaymentServiceImpl@a944.pollPurchaseConfirmation$6");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    @Override // com.ss.android.ugc.aweme.service.MiniDramaPaymentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.tux.sheet.sheet.TuxSheet LJII(androidx.fragment.app.FragmentManager r9, X.C1614180s6i r10, X.C1612200s3W r11, kotlin.jvm.functions.Function0 r12, kotlin.jvm.functions.Function0 r13) {
        /*
            r8 = this;
            boolean r0 = X.C757070Tmr.LIZ()
            java.lang.String r5 = "purchase_option_sheet"
            r4 = 1
            r6 = 0
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.model.CollectionDetailModel r1 = r10.collectionDetailModel
            X.0mIc r3 = new X.0mIc
            r3.<init>(r6, r6)
            java.lang.String r0 = com.ss.android.ugc.aweme.series.payment.fragment.SeriesPurchaseBlockFragment._pnsPageId
            r7 = 0
            if (r1 == 0) goto L59
            com.ss.android.ugc.aweme.model.UrlModel r0 = r1.collectionCover
            if (r0 == 0) goto L59
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L59
            java.lang.Object r2 = X.C13LP.LJJJLL(r0)
            java.lang.String r2 = (java.lang.String) r2
        L26:
            java.lang.String r7 = r1.collectionName
        L28:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "collection_cover_url"
            X.C786410Ut5.LJJJI(r0, r2, r1)
            java.lang.String r0 = "collection_name"
            X.C786410Ut5.LJJJI(r0, r7, r1)
            com.ss.android.ugc.aweme.series.payment.fragment.SeriesPurchaseBlockFragment r0 = new com.ss.android.ugc.aweme.series.payment.fragment.SeriesPurchaseBlockFragment
            r0.<init>(r13)
            r0.setArguments(r1)
            com.bytedance.tux.sheet.sheet.TuxSheet r2 = r3.LIZ
            r2.LLJJIJI = r0
            if (r12 == 0) goto L4e
            X.0sHK r1 = new X.0sHK
            r0 = 8
            r1.<init>(r12, r0)
            r2.LLILLJJLI = r1
        L4e:
            r3.LJIIIIZZ(r6)
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r3.LIZ
            r0.LLJJIJIIJIL = r4
            r0.show(r9, r5)
            return r0
        L59:
            r2 = r7
            if (r1 == 0) goto L28
            goto L26
        L5d:
            X.0mIc r3 = new X.0mIc
            r3.<init>(r6, r6)
            java.lang.String r0 = com.ss.android.ugc.aweme.series.singleepisode.fragment.SeriesPurchaseOptionFragment._pnsPageId
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "purchase_option_sheet_params"
            X.C786410Ut5.LJJIZ(r1, r0, r10)
            com.ss.android.ugc.aweme.series.singleepisode.fragment.SeriesPurchaseOptionFragment r0 = new com.ss.android.ugc.aweme.series.singleepisode.fragment.SeriesPurchaseOptionFragment
            r0.<init>(r11, r13)
            r0.setArguments(r1)
            com.bytedance.tux.sheet.sheet.TuxSheet r2 = r3.LIZ
            r2.LLJJIJI = r0
            if (r12 == 0) goto L85
            X.0sHK r1 = new X.0sHK
            r0 = 9
            r1.<init>(r12, r0)
            r2.LLILLJJLI = r1
        L85:
            r3.LJIIIIZZ(r6)
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r3.LIZ
            r0.LLJJIJIIJIL = r4
            r0.show(r9, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.payment.serviceimpl.SeriesPaymentServiceImpl.LJII(androidx.fragment.app.FragmentManager, X.0s6i, X.0s3W, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):com.bytedance.tux.sheet.sheet.TuxSheet");
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaPaymentService
    public final C11JF LJIIL(long j, int i, String str, AwS568S0100000_24 awS568S0100000_24, AwS138S1100000_24 awS138S1100000_24, AwS138S1100000_24 awS138S1100000_242) {
        C11NZ<PaidCollectionRefundResponse> c11nzSubmitRefund;
        SeriesPaymentApi.SubmitRefundApi submitRefundApi;
        try {
            if (SeriesPaymentApi.LIZIZ == null) {
                SeriesPaymentApi.LIZIZ = (SeriesPaymentApi.SubmitRefundApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(SeriesPaymentApi.SubmitRefundApi.class);
            }
            submitRefundApi = SeriesPaymentApi.LIZIZ;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
        }
        if (submitRefundApi != null) {
            c11nzSubmitRefund = submitRefundApi.submitRefund(1, j, "", i, str);
        } else {
            c11nzSubmitRefund = C11IR.LL;
        }
        return (C11JF) c11nzSubmitRefund.LJJIJIL(new AfS178S0100000_9(awS568S0100000_24, 83)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS188S0100000_19(awS138S1100000_24, 88), new AfS172S0100000_3((Object) awS138S1100000_242, 113));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e1 A[PHI: r9
      0x01e1: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String), (r9v3 java.lang.String) binds: [B:105:0x01dd, B:68:0x0105, B:70:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fa A[PHI: r15
      0x01fa: PHI (r15v1 java.lang.String) = (r15v0 java.lang.String), (r15v5 java.lang.String) binds: [B:113:0x01f6, B:43:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0202 A[PHI: r13 r14 r15 r52 r53
      0x0202: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v3 java.lang.String) binds: [B:117:0x01fe, B:46:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r14v1 java.lang.Integer) = (r14v0 java.lang.Integer), (r14v3 java.lang.Integer) binds: [B:117:0x01fe, B:46:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r15v2 java.lang.String) = (r15v1 java.lang.String), (r15v4 java.lang.String) binds: [B:117:0x01fe, B:46:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r52v1 java.lang.Integer) = (r52v0 java.lang.Integer), (r52v3 java.lang.Integer) binds: [B:117:0x01fe, B:46:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r53v1 java.lang.Boolean) = (r53v0 java.lang.Boolean), (r53v3 java.lang.Boolean) binds: [B:117:0x01fe, B:46:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c4 A[LOOP:0: B:97:0x01be->B:99:0x01c4, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.lang.String r88, java.lang.String r89, com.ss.android.ugc.aweme.feed.model.SeriesCategory r90, X.EnumC1612690s4J r91, android.content.Context r92, X.C1613010s4p r93, java.lang.String r94, java.lang.String r95, java.lang.String r96, X.C1613360s5O r97, long r98) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.payment.serviceimpl.SeriesPaymentServiceImpl.LJIILL(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.SeriesCategory, X.0s4J, android.content.Context, X.0s4p, java.lang.String, java.lang.String, java.lang.String, X.0s5O, long):void");
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaPaymentService
    public final C1613540s5g LJIIIZ(final Context context, final long j, Map map, String str, final EnumC1612690s4J enumC1612690s4J, final SeriesCategory seriesCategory, String str2, final String str3, final C1613010s4p c1613010s4p, String str4, final C1613360s5O c1613360s5O, final C1612600s4A c1612600s4A, final C1612570s47 c1612570s47) {
        C11NZ<MarketplaceCreateOrderResponse> c11nzLIZ;
        SeriesPaymentApi.CreateOrderApi createOrderApiLIZ;
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1614200s6k) it2.next()).LIZJ(c1613360s5O);
        }
        if (map.isEmpty()) {
            c11nzLIZ = C11IR.LL;
        } else {
            try {
                createOrderApiLIZ = C1614240s6o.LIZ();
            } catch (ExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
                AbstractC2126608Uu.getCompatibleException(e);
            }
            if (createOrderApiLIZ != null) {
                c11nzLIZ = createOrderApiLIZ.LIZ(map);
            } else {
                c11nzLIZ = C11IR.LL;
            }
        }
        return new C1613540s5g(new C11JV(c11nzLIZ.LJJIJIL(new AfS1S1400100_24(j, seriesCategory, c1613010s4p, c1613360s5O, this, str4, 4)).LJJIJIIJIL(new AfS1S1400100_24(j, seriesCategory, c1613010s4p, c1613360s5O, this, str4, 5)).LJJIJIIJI(new AfS1S1400100_24(j, seriesCategory, c1613010s4p, c1613360s5O, this, str4, 0)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS0S2600100_24(this, j, seriesCategory, enumC1612690s4J, context, c1613010s4p, str, str2, c1613360s5O, 0)).LJLIIIL(new AkS485S0100000_24(this, 11)).LJLIIL(1L), new InterfaceC1487280oo2() { // from class: X.0s6e
            /* JADX WARN: Removed duplicated region for block: B:104:0x0159  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x0169  */
            /* JADX WARN: Removed duplicated region for block: B:114:0x0175  */
            /* JADX WARN: Removed duplicated region for block: B:119:0x0181  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x018b  */
            /* JADX WARN: Removed duplicated region for block: B:127:0x0191  */
            /* JADX WARN: Removed duplicated region for block: B:130:0x020e  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x021c  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x021f  */
            /* JADX WARN: Removed duplicated region for block: B:137:0x0224 A[PHI: r9
              0x0224: PHI (r9v8 java.lang.String) = (r9v7 java.lang.String), (r9v10 java.lang.String) binds: [B:135:0x0220, B:123:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:138:0x0227  */
            /* JADX WARN: Removed duplicated region for block: B:139:0x022b  */
            /* JADX WARN: Removed duplicated region for block: B:140:0x022f  */
            /* JADX WARN: Removed duplicated region for block: B:141:0x0233  */
            /* JADX WARN: Removed duplicated region for block: B:144:0x0238 A[PHI: r11
              0x0238: PHI (r11v10 java.lang.String) = (r11v9 java.lang.String), (r11v13 java.lang.String), (r11v13 java.lang.String) binds: [B:142:0x0234, B:98:0x014d, B:100:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:145:0x023b  */
            /* JADX WARN: Removed duplicated region for block: B:146:0x023f  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x0242  */
            /* JADX WARN: Removed duplicated region for block: B:148:0x0246  */
            /* JADX WARN: Removed duplicated region for block: B:150:0x024b  */
            /* JADX WARN: Removed duplicated region for block: B:151:0x024f  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x0254 A[PHI: r15
              0x0254: PHI (r15v12 java.lang.String) = (r15v11 java.lang.String), (r15v14 java.lang.String) binds: [B:152:0x0250, B:67:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:155:0x0258  */
            /* JADX WARN: Removed duplicated region for block: B:156:0x025c  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x0262 A[PHI: r26
              0x0262: PHI (r26v2 java.lang.String) = (r26v1 java.lang.String), (r26v11 java.lang.String), (r26v11 java.lang.String) binds: [B:157:0x025e, B:33:0x00af, B:35:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:162:0x0268 A[PHI: r25 r26
              0x0268: PHI (r25v2 java.lang.String) = (r25v1 java.lang.String), (r25v9 java.lang.String), (r25v9 java.lang.String) binds: [B:160:0x0264, B:38:0x00bb, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]
              0x0268: PHI (r26v3 java.lang.String) = (r26v2 java.lang.String), (r26v10 java.lang.String), (r26v10 java.lang.String) binds: [B:160:0x0264, B:38:0x00bb, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:165:0x026e A[PHI: r21 r25 r26
              0x026e: PHI (r21v6 java.lang.String) = (r21v5 java.lang.String), (r21v10 java.lang.String) binds: [B:163:0x026a, B:43:0x00c7] A[DONT_GENERATE, DONT_INLINE]
              0x026e: PHI (r25v3 java.lang.String) = (r25v2 java.lang.String), (r25v8 java.lang.String) binds: [B:163:0x026a, B:43:0x00c7] A[DONT_GENERATE, DONT_INLINE]
              0x026e: PHI (r26v4 java.lang.String) = (r26v3 java.lang.String), (r26v9 java.lang.String) binds: [B:163:0x026a, B:43:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:168:0x0274 A[PHI: r20 r21 r25 r26
              0x0274: PHI (r20v4 java.lang.Integer) = (r20v3 java.lang.Integer), (r20v6 java.lang.Integer), (r20v6 java.lang.Integer), (r20v6 java.lang.Integer) binds: [B:166:0x0270, B:46:0x00cf, B:48:0x00d3, B:50:0x00d9] A[DONT_GENERATE, DONT_INLINE]
              0x0274: PHI (r21v7 java.lang.String) = (r21v6 java.lang.String), (r21v9 java.lang.String), (r21v9 java.lang.String), (r21v9 java.lang.String) binds: [B:166:0x0270, B:46:0x00cf, B:48:0x00d3, B:50:0x00d9] A[DONT_GENERATE, DONT_INLINE]
              0x0274: PHI (r25v4 java.lang.String) = (r25v3 java.lang.String), (r25v7 java.lang.String), (r25v7 java.lang.String), (r25v7 java.lang.String) binds: [B:166:0x0270, B:46:0x00cf, B:48:0x00d3, B:50:0x00d9] A[DONT_GENERATE, DONT_INLINE]
              0x0274: PHI (r26v5 java.lang.String) = (r26v4 java.lang.String), (r26v8 java.lang.String), (r26v8 java.lang.String), (r26v8 java.lang.String) binds: [B:166:0x0270, B:46:0x00cf, B:48:0x00d3, B:50:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:172:0x027e A[PHI: r35
              0x027e: PHI (r35v5 java.lang.Long) = (r35v4 java.lang.Long), (r35v8 java.lang.Long) binds: [B:170:0x027a, B:25:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:221:0x034c A[PHI: r14 r15
              0x034c: PHI (r14v7 java.lang.String) = (r14v0 java.lang.String), (r14v8 java.lang.String) binds: [B:355:0x0533, B:220:0x034a] A[DONT_GENERATE, DONT_INLINE]
              0x034c: PHI (r15v8 java.lang.String) = (r15v1 java.lang.String), (r15v9 java.lang.String) binds: [B:355:0x0533, B:220:0x034a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:228:0x035a  */
            /* JADX WARN: Removed duplicated region for block: B:231:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:238:0x0370  */
            /* JADX WARN: Removed duplicated region for block: B:245:0x0380  */
            /* JADX WARN: Removed duplicated region for block: B:252:0x038e  */
            /* JADX WARN: Removed duplicated region for block: B:255:0x0398  */
            /* JADX WARN: Removed duplicated region for block: B:258:0x03a0  */
            /* JADX WARN: Removed duplicated region for block: B:263:0x03ae  */
            /* JADX WARN: Removed duplicated region for block: B:266:0x03b6  */
            /* JADX WARN: Removed duplicated region for block: B:268:0x03ba  */
            /* JADX WARN: Removed duplicated region for block: B:278:0x03d4  */
            /* JADX WARN: Removed duplicated region for block: B:288:0x03e8  */
            /* JADX WARN: Removed duplicated region for block: B:293:0x03f8  */
            /* JADX WARN: Removed duplicated region for block: B:298:0x0404  */
            /* JADX WARN: Removed duplicated region for block: B:303:0x0410  */
            /* JADX WARN: Removed duplicated region for block: B:308:0x041a  */
            /* JADX WARN: Removed duplicated region for block: B:311:0x0420  */
            /* JADX WARN: Removed duplicated region for block: B:315:0x04ac  */
            /* JADX WARN: Removed duplicated region for block: B:328:0x04ed  */
            /* JADX WARN: Removed duplicated region for block: B:329:0x04f0  */
            /* JADX WARN: Removed duplicated region for block: B:332:0x04f5 A[PHI: r5
              0x04f5: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v8 java.lang.String) binds: [B:330:0x04f1, B:307:0x0418] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:333:0x04f8  */
            /* JADX WARN: Removed duplicated region for block: B:334:0x04fc  */
            /* JADX WARN: Removed duplicated region for block: B:335:0x0500  */
            /* JADX WARN: Removed duplicated region for block: B:336:0x0504  */
            /* JADX WARN: Removed duplicated region for block: B:339:0x0509 A[PHI: r7
              0x0509: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v4 java.lang.String), (r7v4 java.lang.String) binds: [B:337:0x0505, B:282:0x03dc, B:284:0x03e0] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:340:0x050c  */
            /* JADX WARN: Removed duplicated region for block: B:341:0x0510  */
            /* JADX WARN: Removed duplicated region for block: B:342:0x0513  */
            /* JADX WARN: Removed duplicated region for block: B:343:0x0517  */
            /* JADX WARN: Removed duplicated region for block: B:345:0x051c  */
            /* JADX WARN: Removed duplicated region for block: B:346:0x0520  */
            /* JADX WARN: Removed duplicated region for block: B:349:0x0525 A[PHI: r11
              0x0525: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v5 java.lang.String) binds: [B:347:0x0521, B:251:0x038c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:350:0x0529  */
            /* JADX WARN: Removed duplicated region for block: B:351:0x052d  */
            /* JADX WARN: Removed duplicated region for block: B:354:0x0532 A[PHI: r15
              0x0532: PHI (r15v1 java.lang.String) = (r15v0 java.lang.String), (r15v9 java.lang.String), (r15v9 java.lang.String) binds: [B:352:0x052e, B:217:0x0344, B:219:0x0348] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:357:0x0537 A[PHI: r14 r15
              0x0537: PHI (r14v1 java.lang.String) = (r14v0 java.lang.String), (r14v7 java.lang.String), (r14v7 java.lang.String) binds: [B:355:0x0533, B:222:0x034e, B:224:0x0352] A[DONT_GENERATE, DONT_INLINE]
              0x0537: PHI (r15v2 java.lang.String) = (r15v1 java.lang.String), (r15v8 java.lang.String), (r15v8 java.lang.String) binds: [B:355:0x0533, B:222:0x034e, B:224:0x0352] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:360:0x053c A[PHI: r13 r14 r15
              0x053c: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v6 java.lang.String) binds: [B:358:0x0538, B:227:0x0358] A[DONT_GENERATE, DONT_INLINE]
              0x053c: PHI (r14v2 java.lang.String) = (r14v1 java.lang.String), (r14v6 java.lang.String) binds: [B:358:0x0538, B:227:0x0358] A[DONT_GENERATE, DONT_INLINE]
              0x053c: PHI (r15v3 java.lang.String) = (r15v2 java.lang.String), (r15v7 java.lang.String) binds: [B:358:0x0538, B:227:0x0358] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:363:0x0541 A[PHI: r12 r13 r14 r15
              0x0541: PHI (r12v2 java.lang.Integer) = (r12v1 java.lang.Integer), (r12v4 java.lang.Integer), (r12v4 java.lang.Integer), (r12v4 java.lang.Integer) binds: [B:361:0x053d, B:230:0x035e, B:232:0x0362, B:234:0x0368] A[DONT_GENERATE, DONT_INLINE]
              0x0541: PHI (r13v3 java.lang.String) = (r13v2 java.lang.String), (r13v5 java.lang.String), (r13v5 java.lang.String), (r13v5 java.lang.String) binds: [B:361:0x053d, B:230:0x035e, B:232:0x0362, B:234:0x0368] A[DONT_GENERATE, DONT_INLINE]
              0x0541: PHI (r14v3 java.lang.String) = (r14v2 java.lang.String), (r14v5 java.lang.String), (r14v5 java.lang.String), (r14v5 java.lang.String) binds: [B:361:0x053d, B:230:0x035e, B:232:0x0362, B:234:0x0368] A[DONT_GENERATE, DONT_INLINE]
              0x0541: PHI (r15v4 java.lang.String) = (r15v3 java.lang.String), (r15v6 java.lang.String), (r15v6 java.lang.String), (r15v6 java.lang.String) binds: [B:361:0x053d, B:230:0x035e, B:232:0x0362, B:234:0x0368] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:367:0x054b A[PHI: r21
              0x054b: PHI (r21v1 java.lang.Long) = (r21v0 java.lang.Long), (r21v3 java.lang.Long) binds: [B:365:0x0547, B:209:0x0328] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[PHI: r25 r26
              0x00b9: PHI (r25v9 java.lang.String) = (r25v1 java.lang.String), (r25v10 java.lang.String) binds: [B:160:0x0264, B:36:0x00b5] A[DONT_GENERATE, DONT_INLINE]
              0x00b9: PHI (r26v10 java.lang.String) = (r26v2 java.lang.String), (r26v11 java.lang.String) binds: [B:160:0x0264, B:36:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0109  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0111  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x011f  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x0127  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x012b  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x0145  */
            @Override // X.InterfaceC1487280oo2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r85) {
                /*
                    Method dump skipped, instruction units count: 1382
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1614140s6e.apply(java.lang.Object):java.lang.Object");
            }
        }).LJIIIIZZ(new AfS6S0200100_18(this, context, j, 0)).LJIILL().LJIIZILJ());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(2:5|3)|74|6|(2:8|(2:10|(1:12)))|13|(9:15|(1:17)|18|(1:20)(1:25)|72|26|(14:28|(1:30)|31|32|(1:39)|40|(1:47)|48|(1:55)|56|(1:60)|61|(1:65)|66)(1:69)|70|71)(1:21)|22|(2:18|(0)(0))(0)|72|26|(0)(0)|70|71) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010c, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010d, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
        X.AbstractC2126608Uu.getCompatibleException(r2);
        r0 = r0;
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[PHI: r0 r23 r24
      0x006e: PHI (r0v9 java.lang.Object) = (r0v38 java.lang.Object), (r0v39 java.lang.Object) binds: [B:23:0x006b, B:19:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x006e: PHI (r23v2 java.lang.Integer) = (r23v1 java.lang.Integer), (r23v7 java.lang.Integer) binds: [B:23:0x006b, B:19:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x006e: PHI (r24v1 java.lang.Integer) = (r24v0 java.lang.Integer), (r24v5 java.lang.Integer) binds: [B:23:0x006b, B:19:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[Catch: ExecutionException -> 0x010c, TryCatch #0 {ExecutionException -> 0x010c, blocks: (B:26:0x0070, B:28:0x007e, B:30:0x0086, B:31:0x008e, B:34:0x0097, B:40:0x00a2, B:42:0x00ad, B:48:0x00b8, B:50:0x00c4, B:56:0x00cf, B:58:0x00db, B:61:0x00e0, B:63:0x00ec, B:66:0x00f1, B:53:0x00ca, B:45:0x00b3, B:37:0x009d), top: B:72:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0113 A[PHI: r0 r1
      0x0113: PHI (r0v12 ??) = (r0v36 ??), (r0v37 ??) binds: [B:68:0x010d, B:27:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0113: PHI (r1v4 ??) = (r1v11 ??), (r1v12 ??) binds: [B:68:0x010d, B:27:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0s47] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r17v3, types: [X.0s4A] */
    /* JADX WARN: Type inference failed for: r18v3, types: [X.0s47] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.MutableLiveData] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.0s4A] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // com.ss.android.ugc.aweme.service.MiniDramaPaymentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1613540s5g LJFF(final android.content.Context r33, final long r34, java.lang.Long r36, java.lang.String r37, X.EnumC1612760s4Q r38, final X.EnumC1612690s4J r39, final com.ss.android.ugc.aweme.feed.model.SeriesCategory r40, java.lang.String r41, final java.lang.String r42, final X.C1613010s4p r43, java.lang.String r44, final X.C1613360s5O r45, X.C1612600s4A r46, X.C1612570s47 r47) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.payment.serviceimpl.SeriesPaymentServiceImpl.LJFF(android.content.Context, long, java.lang.Long, java.lang.String, X.0s4Q, X.0s4J, com.ss.android.ugc.aweme.feed.model.SeriesCategory, java.lang.String, java.lang.String, X.0s4p, java.lang.String, X.0s5O, X.0s4A, X.0s47):X.0s5g");
    }
}
