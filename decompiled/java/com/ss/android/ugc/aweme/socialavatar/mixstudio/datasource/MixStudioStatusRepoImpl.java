package com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource;

import X.AbstractC440540HPg;
import X.AbstractC440840HQk;
import X.AbstractC848400XPy;
import X.AnonymousClass0956;
import X.C01GW;
import X.C054G;
import X.C05YD;
import X.C099R;
import X.C09IC;
import X.C0HGK;
import X.C0HSG;
import X.C0PEM;
import X.C0XQ7;
import X.C13BV;
import X.C13IQ;
import X.C13LP;
import X.C1910890zpH;
import X.C1BNE;
import X.C2252321DDq;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C435610H6h;
import X.C435750H6v;
import X.C439330HKp;
import X.C440070HNl;
import X.C440100HNo;
import X.C440530HPf;
import X.C440600HPm;
import X.C440620HPo;
import X.C440660HPs;
import X.C440790HQf;
import X.C440800HQg;
import X.C440830HQj;
import X.C440850HQl;
import X.C441120HRm;
import X.C441320HSg;
import X.C441340HSi;
import X.C441350HSj;
import X.C441470HSv;
import X.C441500HSy;
import X.C452501pT;
import X.C823170WQx;
import X.EnumC439340HKq;
import X.EnumC441390HSn;
import X.EnumC441430HSr;
import X.InterfaceC1364105Vn;
import X.InterfaceC332260D0u;
import X.InterfaceC440090HNn;
import X.InterfaceC441440HSs;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioBaseModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioNetworkElement;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioSticker;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioStickerProgress;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioStatusRepoImpl implements MixStudioStatusRepository {
    public static final /* synthetic */ int LJIJJLI = 0;
    public AnonymousClass0956 LJIIJJI;
    public C441500HSy LJIIL;
    public boolean LJIILIIL;
    public String LJIIZILJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(134));
    public final AtomicInteger LIZIZ = new AtomicInteger(0);
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final ConcurrentMap<String, InterfaceC332260D0u<AbstractC440540HPg>> LIZLLL = new ConcurrentHashMap();
    public final ConcurrentMap<String, InterfaceC332260D0u<List<C440830HQj>>> LJ = new ConcurrentHashMap();
    public final ConcurrentMap<String, InterfaceC332260D0u<List<Long>>> LJFF = new ConcurrentHashMap();
    public final ConcurrentMap<String, InterfaceC332260D0u<Boolean>> LJI = new ConcurrentHashMap();
    public final ConcurrentMap<String, InterfaceC332260D0u<StickerItem>> LJII = new ConcurrentHashMap();
    public final ConcurrentHashMap<String, C823170WQx<String>> LJIIIIZZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Boolean> LJIIIZ = new ConcurrentHashMap<>();
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(133));
    public final C2252321DDq LJIILJJIL = C1BNE.LIZ(Double.valueOf(Double.MAX_VALUE));
    public final C2252321DDq LJIILL = C1BNE.LIZ(null);
    public final C2252321DDq LJIILLIIL = C1BNE.LIZ(C13BV.INSTANCE);
    public final C01GW LJIJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(135));
    public final Map<String, List<String>> LJIJI = new LinkedHashMap();
    public final Map<String, C13IQ<? extends Object>> LJIJJ = new LinkedHashMap();

    public static C054G LJJ() {
        return C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C05YD<InterfaceC440090HNn> LIZ() {
        return C09IC.LIZIZ(this.LJIILL);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final boolean LIZJ() {
        Boolean boolPutIfAbsent;
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.LJIIIZ;
        String strLJIJI = LJIJI();
        Boolean bool = concurrentHashMap.get(strLJIJI);
        if (bool == null && (boolPutIfAbsent = concurrentHashMap.putIfAbsent(strLJIJI, (bool = Boolean.FALSE))) != null) {
            bool = boolPutIfAbsent;
        }
        return bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C823170WQx<String> LIZLLL() {
        C823170WQx<String> c823170WQxPutIfAbsent;
        ConcurrentHashMap<String, C823170WQx<String>> concurrentHashMap = this.LJIIIIZZ;
        String strLJIJI = LJIJI();
        C823170WQx<String> c823170WQx = concurrentHashMap.get(strLJIJI);
        if (c823170WQx == null && (c823170WQxPutIfAbsent = concurrentHashMap.putIfAbsent(strLJIJI, (c823170WQx = new C823170WQx<>()))) != null) {
            c823170WQx = c823170WQxPutIfAbsent;
        }
        return c823170WQx;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C05YD<List<Pair<Integer, String>>> LJIIL() {
        return C09IC.LIZIZ(this.LJIILLIIL);
    }

    public final C1910890zpH LJIJJLI() {
        return (C1910890zpH) this.LIZ.getValue();
    }

    public final InterfaceC441440HSs LJIL() {
        return (InterfaceC441440HSs) this.LJIJ.getValue();
    }

    public final InterfaceC332260D0u<Boolean> LJJI() {
        Object objPutIfAbsent;
        ConcurrentMap<String, InterfaceC332260D0u<Boolean>> concurrentMap = this.LJI;
        String strLJIJI = LJIJI();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) concurrentMap;
        Object objLIZ = concurrentHashMap.get(strLJIJI);
        if (objLIZ == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(strLJIJI, (objLIZ = C1BNE.LIZ(Boolean.FALSE)))) != null) {
            objLIZ = objPutIfAbsent;
        }
        return (InterfaceC332260D0u) objLIZ;
    }

    public final InterfaceC332260D0u<StickerItem> LJJIFFI() {
        Object objPutIfAbsent;
        ConcurrentMap<String, InterfaceC332260D0u<StickerItem>> concurrentMap = this.LJII;
        String strLJIJI = LJIJI();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) concurrentMap;
        Object objLIZ = concurrentHashMap.get(strLJIJI);
        if (objLIZ == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(strLJIJI, (objLIZ = C1BNE.LIZ(null)))) != null) {
            objLIZ = objPutIfAbsent;
        }
        return (InterfaceC332260D0u) objLIZ;
    }

    public final InterfaceC332260D0u<List<C440830HQj>> LJJII() {
        Object objPutIfAbsent;
        ConcurrentMap<String, InterfaceC332260D0u<List<C440830HQj>>> concurrentMap = this.LJ;
        String strLJIJI = LJIJI();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) concurrentMap;
        Object objLIZ = concurrentHashMap.get(strLJIJI);
        if (objLIZ == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(strLJIJI, (objLIZ = C1BNE.LIZ(C13BV.INSTANCE)))) != null) {
            objLIZ = objPutIfAbsent;
        }
        return (InterfaceC332260D0u) objLIZ;
    }

    public final InterfaceC332260D0u<List<Long>> LJJIII() {
        Object objPutIfAbsent;
        ConcurrentMap<String, InterfaceC332260D0u<List<Long>>> concurrentMap = this.LJFF;
        String strLJIJI = LJIJI();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) concurrentMap;
        Object objLIZ = concurrentHashMap.get(strLJIJI);
        if (objLIZ == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(strLJIJI, (objLIZ = C1BNE.LIZ(C13BV.INSTANCE)))) != null) {
            objLIZ = objPutIfAbsent;
        }
        return (InterfaceC332260D0u) objLIZ;
    }

    public final InterfaceC332260D0u<AbstractC440540HPg> LJJIIJ() {
        Object objPutIfAbsent;
        ConcurrentMap<String, InterfaceC332260D0u<AbstractC440540HPg>> concurrentMap = this.LIZLLL;
        String strLJIJI = LJIJI();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) concurrentMap;
        Object objLIZ = concurrentHashMap.get(strLJIJI);
        if (objLIZ == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(strLJIJI, (objLIZ = C1BNE.LIZ(C440620HPo.LIZ)))) != null) {
            objLIZ = objPutIfAbsent;
        }
        return (InterfaceC332260D0u) objLIZ;
    }

    public static String LJIJI() {
        return ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C05YD<List<C440830HQj>> LJFF() {
        return LJJII();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final void LJIIIIZZ() {
        C23250099c.LIZLLL(LJJ(), null, null, new C441350HSj(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C05YD<Boolean> LJIIJ() {
        return LJJI();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C05YD<StickerItem> LJIILLIIL() {
        return LJJIFFI();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final void LJIIZILJ() {
        LJJIIJ().setValue(C440530HPf.LIZ);
    }

    public final void LJJIIZI() {
        LJIJJLI().LIZ("TaskStatusRepo", "[network] polling stopped");
        this.LIZIZ.set(0);
        AnonymousClass0956 anonymousClass0956 = this.LJIIJJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIIJJI = null;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C05YD<AbstractC440540HPg> getTaskStatus() {
        return LJJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final Map<String, C13IQ<? extends Object>> LJ() {
        return this.LJIJJ;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C2252321DDq LJIIJJI() {
        return this.LJIILJJIL;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final Map<String, List<String>> LJIILL() {
        return this.LJIJI;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C441500HSy getErrorInfo() {
        return this.LJIIL;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final String getTaskId() {
        return this.LJIIZILJ;
    }

    public static AbstractC440840HQk LJIJ(MixStudioSticker mixStudioSticker) {
        Double d;
        Integer num = mixStudioSticker.animationTaskStatus;
        if (num != null && num.intValue() != 3 && num.intValue() != 0 && num.intValue() != 4) {
            if (num.intValue() == 1) {
                MixStudioStickerProgress mixStudioStickerProgress = mixStudioSticker.generationProgress;
                Double dValueOf = null;
                if (mixStudioStickerProgress != null && (d = mixStudioStickerProgress.timeRemainingMS) != null) {
                    d.doubleValue();
                    dValueOf = Double.valueOf(SystemClock.uptimeMillis() + d.doubleValue() + ((double) 4000));
                }
                return new C440800HQg(mixStudioSticker.animatedTaskId, dValueOf);
            }
            if (num.intValue() == 2) {
                return new C440790HQf(true);
            }
            return C440850HQl.LIZ;
        }
        return C440850HQl.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final Object LJII(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0HSG.LIZ.getClass();
        C0HSG.LIZIZ().storeBoolean("result_reviewed", true);
        LJJIIJ().setValue(new C440600HPm(LJJIIJ().getValue().LIZ()));
        Object objLIZJ = LJIL().LIZJ(4, interfaceC1364105Vn);
        if (objLIZJ == C099R.LJFF()) {
            return objLIZJ;
        }
        return Unit.LIZ;
    }

    public final void LJJIIJZLJL(C439330HKp c439330HKp) {
        if (c439330HKp.getReason() == EnumC439340HKq.IMAGE_X_AUTH_KEY) {
            if (c439330HKp.getCause() instanceof UnknownHostException) {
                this.LJIIL = new C441500HSy(EnumC441390HSn.IMAGE_UPLOAD_KEY, EnumC441430HSr.NETWORK_EXCEPTION);
                return;
            } else if (c439330HKp.getCause() instanceof SocketTimeoutException) {
                this.LJIIL = new C441500HSy(EnumC441390HSn.IMAGE_UPLOAD_KEY, EnumC441430HSr.TIMEOUT);
                return;
            } else {
                this.LJIIL = new C441500HSy(EnumC441390HSn.IMAGE_UPLOAD_KEY, EnumC441430HSr.SERVER_ERROR);
                return;
            }
        }
        if (c439330HKp.getCause() instanceof SocketTimeoutException) {
            this.LJIIL = new C441500HSy(EnumC441390HSn.UPLOAD_IMAGE, EnumC441430HSr.TIMEOUT);
        } else {
            this.LJIIL = new C441500HSy(EnumC441390HSn.UPLOAD_IMAGE, EnumC441430HSr.UPLOAD_FAIL);
        }
    }

    public final void LJJIIZ(boolean z) {
        if (this.LJIIJJI != null) {
            return;
        }
        int size = LJJII().getValue().size();
        LJJIFFI().setValue(null);
        if (!(LJJIIJ().getValue() instanceof C441120HRm)) {
            return;
        }
        this.LJIIJJI = C23250099c.LIZLLL(LJJ(), null, null, new C441340HSi(this, size, z, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[EDGE_INSN: B:22:0x0041->B:23:0x0042 BREAK  A[LOOP:0: B:18:0x0031->B:98:?], PHI: r6
      0x0042: PHI (r6v3 boolean) = (r6v1 boolean), (r6v4 boolean) binds: [B:37:0x006d, B:22:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioStatusResponse r10) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl.LJJIJIIJIL(com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioStatusResponse):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.Integer r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl.LJI(java.lang.Integer, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(long r46, X.AbstractC440840HQk r48) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl.LJIIIZ(long, X.0HQk):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.lang.String r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl.LJIILIIL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r7 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJ(X.InterfaceC440090HNn r15, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioNetworkElement>> r16) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl.LJIJJ(X.0HNn, X.05Vn):java.lang.Object");
    }

    public final void LJJIJ(MixStudioNetworkElement mixStudioNetworkElement, int i, int i2) {
        Integer num;
        C2252321DDq c2252321DDq = this.LJIILL;
        InterfaceC440090HNn c440660HPs = null;
        if (mixStudioNetworkElement.data != null && (num = mixStudioNetworkElement.type) != null) {
            if (num.intValue() == 3) {
                c440660HPs = new C435610H6h(new Emoji(mixStudioNetworkElement.data), i2);
            } else if (num.intValue() == 2) {
                c440660HPs = i == 0 ? new C0HGK(mixStudioNetworkElement.data) : new C440100HNo(mixStudioNetworkElement.data, null, null);
            } else if (num.intValue() == 1) {
                c440660HPs = new C440070HNl(null, null, mixStudioNetworkElement.data, null, 8);
            } else if (num.intValue() == 4) {
                String str = mixStudioNetworkElement.url;
                String str2 = mixStudioNetworkElement.id;
                if (str != null && str2 != null) {
                    c440660HPs = new C435750H6v(mixStudioNetworkElement.data, str, str2, i2);
                }
            } else if (num.intValue() == 5) {
                String str3 = mixStudioNetworkElement.url;
                String str4 = mixStudioNetworkElement.id;
                Integer num2 = mixStudioNetworkElement.stickerType;
                if (str3 != null && str4 != null && num2 != null) {
                    c440660HPs = new C440660HPs(mixStudioNetworkElement.data, str3, str4, num2.intValue());
                }
            }
        }
        c2252321DDq.setValue(c440660HPs);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final void LJIILJJIL(List<MixStudioBaseModel> list, InterfaceC440090HNn interfaceC440090HNn, C441470HSv c441470HSv, String str, Integer num) {
        if (LJJIIJ().getValue() instanceof C441120HRm) {
            return;
        }
        SystemClock.uptimeMillis();
        this.LJIIZILJ = null;
        InterfaceC332260D0u<List<C440830HQj>> interfaceC332260D0uLJJII = LJJII();
        C13BV c13bv = C13BV.INSTANCE;
        interfaceC332260D0uLJJII.setValue(c13bv);
        LJJIII().setValue(c13bv);
        this.LJIILJJIL.setValue(Double.valueOf(Double.MAX_VALUE));
        LJJI().setValue(Boolean.TRUE);
        this.LJIIL = null;
        this.LJIILIIL = false;
        this.LJIIIZ.put(LJIJI(), Boolean.FALSE);
        C0HSG.LIZ.getClass();
        C0HSG.LIZIZ().storeBoolean("result_reviewed", false);
        C0HSG.LIZIZ().storeBoolean("typing_box_check_clicked", false);
        this.LJIILL.setValue(interfaceC440090HNn);
        C2252321DDq c2252321DDq = this.LJIILLIIL;
        ArrayList arrayList = new ArrayList();
        for (MixStudioBaseModel mixStudioBaseModel : (ArrayList) list) {
            int i = mixStudioBaseModel.idType;
            Long l = mixStudioBaseModel.uid;
            if (l != null) {
                arrayList.add(new Pair(Integer.valueOf(i), String.valueOf(l.longValue())));
            }
        }
        c2252321DDq.setValue(arrayList);
        LJJIIJ().setValue(new C441120HRm(true, false, ((MixStudioBaseModel) C13LP.LJJJJZI(list)).idType));
        C23250099c.LIZLLL(LJJ(), null, null, new C441320HSg(this, interfaceC440090HNn, c441470HSv, num, list, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0009 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(X.InterfaceC497601wk r22, int r23, java.util.List<com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioSticker> r24, int r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl.LJJIJIIJI(X.01wk, int, java.util.List, int, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [X.0HQj] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r28, java.lang.String r29, int r30, X.InterfaceC440090HNn r31, X.C441470HSv r32, int r33, X.InterfaceC1364105Vn<? super java.lang.Boolean> r34) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl.LIZIZ(java.lang.String, java.lang.String, int, X.0HNn, X.0HSv, int, X.05Vn):java.lang.Object");
    }
}
