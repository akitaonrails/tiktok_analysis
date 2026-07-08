package com.ss.android.ugc.nearby.container.vm;

import X.AbstractC1204360hRi;
import X.AnonymousClass0956;
import X.C036E;
import X.C099R;
import X.C09R9;
import X.C0B91;
import X.C0PEM;
import X.C0XIR;
import X.C1153860g8G;
import X.C1160330gIh;
import X.C1201620hNI;
import X.C1203730hQh;
import X.C1203850hQt;
import X.C1203930hR1;
import X.C1203960hR4;
import X.C1204080hRG;
import X.C1204120hRK;
import X.C1204130hRL;
import X.C1204160hRO;
import X.C1204180hRQ;
import X.C1204190hRR;
import X.C1204470hRt;
import X.C1204520hRy;
import X.C1204900hSa;
import X.C1204940hSe;
import X.C13BV;
import X.C13DV;
import X.C13LE;
import X.C13LP;
import X.C1494450ozb;
import X.C1494690ozz;
import X.C15438062q;
import X.C1697810uHb;
import X.C1697820uHc;
import X.C19719612Di;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23112093u;
import X.C23250099c;
import X.C844470XAv;
import X.EnumC1201640hNK;
import X.EnumC1204030hRB;
import X.EnumC1204140hRM;
import X.EnumC1204260hRY;
import X.EnumC1204410hRn;
import X.InterfaceC0148002o;
import X.InterfaceC1204490hRv;
import X.InterfaceC1364105Vn;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.nearby.container.model.NearbyRevampResponse;
import com.ss.android.ugc.nearby.container.model.NearbyTool;
import com.ss.android.ugc.nearby.container.model.NearbyToolZoneModel;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyContainerViewModel extends AssemViewModel<C1204130hRL> {
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C1203850hQt.class));
    public RoamingLocationInfo LLILLJJLI;
    public AnonymousClass0956 LLILLL;
    public boolean LLILZ;
    public PageFinder LLILZIL;
    public volatile List<? extends InterfaceC1204490hRv> LLILZLL;
    public volatile NearbyRevampResponse LLIZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1204130hRL(0);
    }

    public final void wQ2() {
        AnonymousClass0956 anonymousClass0956;
        if (((Boolean) C0B91.LIZ.getValue()).booleanValue() || (anonymousClass0956 = this.LLILLL) == null || !anonymousClass0956.isActive()) {
            return;
        }
        AnonymousClass0956 anonymousClass09562 = this.LLILLL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLILLL = null;
    }

    public NearbyContainerViewModel() {
        C1203730hQh.LIZ.getClass();
        this.LLILLJJLI = C1203730hQh.LIZ();
        this.LLILZLL = C13BV.INSTANCE;
    }

    public final void C51(C1203960hR4 c1203960hR4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pullRefresh loadTracker = ");
        sbLIZ.append(c1203960hR4);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1204190hRR(this, c1203960hR4, null), 2);
    }

    public final AnonymousClass0956 DQ2(C1203960hR4 c1203960hR4) {
        return C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1204180hRQ(this, c1203960hR4, null), 2);
    }

    public final void AQ2(int i, String str) {
        int i2;
        C1153860g8G c1153860g8G;
        List<? extends InterfaceC1204490hRv> list = this.LLILZLL;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1204490hRv interfaceC1204490hRv : list) {
            if (interfaceC1204490hRv instanceof C1204470hRt) {
                arrayList.add(interfaceC1204490hRv);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        String str2 = null;
        if (arrayList2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it2 = arrayList2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (((C1204470hRt) it2.next()).LLJI && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        if (i2 == 0) {
            c1153860g8G = new C1153860g8G(list, 0);
        } else {
            C19719612Di.LJJIIJ(arrayList2, AFwS256S0000000_18.get$arr$(951), true);
            c1153860g8G = new C1153860g8G(C1160330gIh.LIZ(list, arrayList2), i2);
        }
        if (c1153860g8G.LIZIZ > 0) {
            this.LLILZLL = c1153860g8G.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleChunkStreamComplete purged remaining preview=");
            sbLIZ.append(c1153860g8G.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            setState(new AwS597S0100000_18(c1153860g8G, 599));
        }
        NearbyRevampResponse nearbyRevampResponse = this.LLIZ;
        if (nearbyRevampResponse != null) {
            List<? extends InterfaceC1204490hRv> list2 = this.LLILZLL;
            ArrayList arrayList3 = new ArrayList();
            for (InterfaceC1204490hRv interfaceC1204490hRv2 : list2) {
                if (interfaceC1204490hRv2 instanceof C1204470hRt) {
                    arrayList3.add(interfaceC1204490hRv2);
                }
            }
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((C1204470hRt) it3.next()).LL);
            }
            NearbyRevampResponse nearbyRevampResponseLJ = NearbyRevampResponse.LJ(nearbyRevampResponse, arrayList4, null, null, 8190);
            RoamingLocationInfo roamingLocationInfo = this.LLILLJJLI;
            if (roamingLocationInfo != null) {
                str2 = roamingLocationInfo.manualRegion;
            }
            C1203930hR1.LIZ.getClass();
            C1203930hR1.LIZIZ(nearbyRevampResponseLJ, str2, true);
            C1203730hQh c1203730hQh = C1203730hQh.LIZ;
            LocationRegion locationRegion = nearbyRevampResponse.manualRegion;
            c1203730hQh.getClass();
            C1203730hQh.LIZJ(locationRegion);
            C1201620hNI c1201620hNI = C1201620hNI.LIZ;
            EnumC1201640hNK enumC1201640hNK = EnumC1201640hNK.SUCCESS;
            int i3 = nearbyRevampResponse.error_code;
            int i4 = i - 1;
            if (i4 < 0) {
                i4 = 0;
            }
            c1201620hNI.LIZLLL(enumC1201640hNK, i3, i4, arrayList4.size(), str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0 A[Catch: Exception -> 0x01f2, TryCatch #4 {Exception -> 0x01f2, blocks: (B:40:0x00c5, B:42:0x00e0, B:44:0x00ee, B:45:0x00f4, B:47:0x00fc, B:49:0x012c, B:50:0x0130, B:52:0x014e, B:55:0x0166, B:59:0x0177, B:63:0x018e, B:65:0x019a, B:66:0x019e, B:68:0x01a8, B:69:0x01aa), top: B:89:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc A[Catch: Exception -> 0x01f2, TryCatch #4 {Exception -> 0x01f2, blocks: (B:40:0x00c5, B:42:0x00e0, B:44:0x00ee, B:45:0x00f4, B:47:0x00fc, B:49:0x012c, B:50:0x0130, B:52:0x014e, B:55:0x0166, B:59:0x0177, B:63:0x018e, B:65:0x019a, B:66:0x019e, B:68:0x01a8, B:69:0x01aa), top: B:89:0x00c5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(X.C1203960hR4 r21, X.InterfaceC1364105Vn<? super kotlin.Pair<? extends X.EnumC1204140hRM, X.C1204080hRG>> r22) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel.zQ2(X.0hR4, X.05Vn):java.lang.Object");
    }

    public static Pair BQ2(Exception exc, C1203960hR4 c1203960hR4, Integer num) {
        String strLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchDataChunk exception: ");
        sbLIZ.append(exc);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1203960hR4 == null || (strLIZJ = c1203960hR4.LIZJ()) == null) {
            strLIZJ = "unknown";
        }
        boolean z = exc instanceof C0XIR;
        if (z) {
            C23112093u c23112093u = (C23112093u) exc;
            if (c23112093u.getErrorCode() == 50001) {
                C1203930hR1.LIZ.getClass();
                C1203930hR1.LIZJ();
                EnumC1201640hNK enumC1201640hNK = EnumC1201640hNK.LOC_ERR;
                FQ2(c23112093u.getErrorCode(), enumC1201640hNK, num, strLIZJ);
                if (c1203960hR4 != null) {
                    c1203960hR4.LJIIJ = enumC1201640hNK.getTypeStr();
                }
                return new Pair(EnumC1204140hRM.LOC_UNAVAILABLE, null);
            }
        }
        if (!(exc instanceof C1494450ozb) && !(exc instanceof C1494690ozz) && !(exc instanceof TimeoutException)) {
            if (z) {
                EnumC1201640hNK enumC1201640hNK2 = EnumC1201640hNK.UNKNOWN_ERR;
                FQ2(((C23112093u) exc).getErrorCode(), enumC1201640hNK2, num, strLIZJ);
                if (c1203960hR4 != null) {
                    c1203960hR4.LJIIJ = enumC1201640hNK2.getTypeStr();
                }
                return new Pair(EnumC1204140hRM.OTHER_EXCEPTION, null);
            }
            if (exc instanceof CancellationException) {
                EnumC1201640hNK enumC1201640hNK3 = EnumC1201640hNK.CANCELLED_ERR;
                FQ2(0, enumC1201640hNK3, num, strLIZJ);
                if (c1203960hR4 != null) {
                    c1203960hR4.LJIIJ = enumC1201640hNK3.getTypeStr();
                }
                return new Pair(EnumC1204140hRM.MANUAL_CANCEL, null);
            }
            EnumC1201640hNK enumC1201640hNK4 = EnumC1201640hNK.UNKNOWN_ERR;
            FQ2(0, enumC1201640hNK4, num, strLIZJ);
            if (c1203960hR4 != null) {
                c1203960hR4.LJIIJ = enumC1201640hNK4.getTypeStr();
            }
            return new Pair(EnumC1204140hRM.OTHER_EXCEPTION, null);
        }
        EnumC1201640hNK enumC1201640hNK5 = EnumC1201640hNK.NETWORK_ERR;
        FQ2(0, enumC1201640hNK5, num, strLIZJ);
        if (c1203960hR4 != null) {
            c1203960hR4.LJIIJ = enumC1201640hNK5.getTypeStr();
        }
        return new Pair(EnumC1204140hRM.NO_NETWORK, null);
    }

    public static EnumC1204140hRM HQ2(NearbyRevampResponse nearbyRevampResponse, C1203960hR4 c1203960hR4, Integer num) {
        String strLIZJ;
        List<Aweme> list = nearbyRevampResponse.awemeList;
        int size = 0;
        if (list != null && !list.isEmpty()) {
            return null;
        }
        if (c1203960hR4 == null || (strLIZJ = c1203960hR4.LIZJ()) == null) {
            strLIZJ = "unknown";
        }
        List<Aweme> list2 = nearbyRevampResponse.awemeList;
        if (list2 != null) {
            size = list2.size();
        }
        if (num != null) {
            C1201620hNI.LIZ.LIZLLL(EnumC1201640hNK.EMPTY_ERR, nearbyRevampResponse.error_code, num.intValue(), size, strLIZJ);
        } else {
            C1201620hNI.LIZ.LJI(EnumC1201640hNK.EMPTY_ERR, nearbyRevampResponse.error_code, size, strLIZJ);
        }
        if (c1203960hR4 != null) {
            c1203960hR4.LJIIJ = EnumC1201640hNK.EMPTY_ERR.getTypeStr();
        }
        return EnumC1204140hRM.EMPTY_DATA;
    }

    public final void CQ2(int i, NearbyRevampResponse nearbyRevampResponse, C1203960hR4 c1203960hR4) {
        String imprId;
        C1153860g8G c1153860g8G;
        String str;
        LogPbBean logPbBean;
        List<Aweme> list = nearbyRevampResponse.awemeList;
        if (list != null && !list.isEmpty()) {
            List<? extends InterfaceC1204490hRv> list2 = this.LLILZLL;
            List<Aweme> list3 = nearbyRevampResponse.awemeList;
            NearbyRevampResponse nearbyRevampResponse2 = this.LLIZ;
            if (nearbyRevampResponse2 != null && (logPbBean = nearbyRevampResponse2.logPb) != null) {
                imprId = logPbBean.getImprId();
            } else {
                imprId = null;
            }
            String str2 = nearbyRevampResponse.dataType;
            if (!list3.isEmpty() && !Intrinsics.LJFF(str2, "preview")) {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC1204490hRv interfaceC1204490hRv : list2) {
                    if (interfaceC1204490hRv instanceof C1204470hRt) {
                        arrayList.add(interfaceC1204490hRv);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list3, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (Aweme aweme : list3) {
                    linkedHashMap.put(aweme.getAid(), aweme);
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((C1204470hRt) it2.next()).LL.getAid());
                }
                Set setLLIIIZ = C13LP.LLIIIZ(arrayList3);
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C1204470hRt c1204470hRt = (C1204470hRt) ListProtector.get(arrayList2, i2);
                    Aweme aweme2 = (Aweme) linkedHashMap.get(c1204470hRt.LL.getAid());
                    if (aweme2 != null) {
                        EnumC1204410hRn enumC1204410hRn = EnumC1204410hRn.REFRESH;
                        if (str2 == null) {
                            str = c1204470hRt.LLJIJIL;
                        } else {
                            str = str2;
                        }
                        ListProtector.set(arrayList2, i2, C1204470hRt.LIZ(c1204470hRt, aweme2, aweme2.isLike(), enumC1204410hRn, str, 252));
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Aweme aweme3 : list3) {
                    if (!setLLIIIZ.contains(aweme3.getAid())) {
                        arrayList4.add(new C1204470hRt(aweme3, aweme3.isLike(), imprId, 0, null, null, EnumC1204410hRn.REFRESH, false, str2, 248));
                        setLLIIIZ.add(aweme3.getAid());
                    }
                }
                arrayList2.addAll(arrayList4);
                List listLIZ = C1160330gIh.LIZ(list2, arrayList2);
                list3.size();
                arrayList4.size();
                c1153860g8G = new C1153860g8G(listLIZ, 0);
            } else {
                c1153860g8G = new C1153860g8G(list2, 0);
            }
            this.LLILZLL = c1153860g8G.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleSubsequentChunk chunkIndex=");
            sbLIZ.append(i);
            sbLIZ.append(", merged=");
            sbLIZ.append(nearbyRevampResponse.awemeList.size());
            C2188811AlT.LIZIZ(sbLIZ);
            setState(new AwS384S0200000_18(c1153860g8G, c1203960hR4, 161));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object EQ2(long r8, X.C1203960hR4 r10, X.InterfaceC1364105Vn<? super kotlin.Pair<? extends X.EnumC1204140hRM, X.C1204080hRG>> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C1204110hRJ
            if (r0 == 0) goto L91
            r5 = r11
            X.0hRJ r5 = (X.C1204110hRJ) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L91
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r6 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L40
            if (r0 != r2) goto L98
            X.0hR4 r10 = r5.LL
            X.C155000ia.LIZIZ(r6)
        L25:
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r1 = r6.getFirst()
            if (r1 == 0) goto L3e
            X.0hRM r0 = X.EnumC1204140hRM.LOC_UNAVAILABLE
            if (r1 != r0) goto L3e
        L31:
            if (r2 == 0) goto L3d
            kotlin.jvm.internal.AwS227S0300000_18 r1 = new kotlin.jvm.internal.AwS227S0300000_18
            r0 = 35
            r1.<init>(r7, r6, r10, r0)
            r7.setState(r1)
        L3d:
            return r6
        L3e:
            r2 = 0
            goto L31
        L40:
            X.C155000ia.LIZIZ(r6)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            X.0Vh4 r0 = X.C036E.LIZ     // Catch: java.lang.Exception -> L52
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L52
            goto L57
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
        L57:
            if (r0 != 0) goto L7b
            X.0hNI r2 = X.C1201620hNI.LIZ
            X.0hNK r1 = X.EnumC1201640hNK.NETWORK_ERR
            if (r10 == 0) goto L65
            java.lang.String r0 = r10.LIZJ()
            if (r0 != 0) goto L67
        L65:
            java.lang.String r0 = "unknown"
        L67:
            r2.LJI(r1, r3, r3, r0)
            if (r10 == 0) goto L72
            java.lang.String r0 = r1.getTypeStr()
            r10.LJIIJ = r0
        L72:
            X.0hRM r2 = X.EnumC1204140hRM.NO_NETWORK
            kotlin.Pair r1 = new kotlin.Pair
            r0 = 0
            r1.<init>(r2, r0)
            return r1
        L7b:
            if (r10 != 0) goto L8f
            X.0hR4 r1 = new X.0hR4
            X.0hRB r0 = X.EnumC1204030hRB.LOAD_MORE
            r1.<init>(r0)
        L84:
            r5.LL = r10
            r5.LLILZ = r2
            java.lang.Object r6 = r7.yQ2(r8, r1, r5)
            if (r6 != r4) goto L25
            return r4
        L8f:
            r1 = r10
            goto L84
        L91:
            X.0hRJ r5 = new X.0hRJ
            r5.<init>(r7, r11)
            goto L12
        L98:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel.EQ2(long, X.0hR4, X.05Vn):java.lang.Object");
    }

    public final AbstractC1204360hRi<C1204080hRG> xQ2(EnumC1204260hRY enumC1204260hRY, Pair<? extends EnumC1204140hRM, C1204080hRG> pair, C1204080hRG c1204080hRG) {
        EnumC1204140hRM first = pair.getFirst();
        C1204080hRG second = pair.getSecond();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkResponse scene=");
        sbLIZ.append(enumC1204260hRY);
        sbLIZ.append(", reason=");
        sbLIZ.append(first);
        C2188811AlT.LIZIZ(sbLIZ);
        if (first != null) {
            setState(AFwS256S0000000_18.get$arr$(794));
            return new C1204160hRO(enumC1204260hRY, first, c1204080hRG);
        }
        setState(AFwS256S0000000_18.get$arr$(795));
        return new C1204120hRK(second);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076 A[Catch: Exception -> 0x00b3, TryCatch #4 {Exception -> 0x00b3, blocks: (B:13:0x003b, B:21:0x0055, B:26:0x0066, B:27:0x006a, B:33:0x0076, B:45:0x00a2, B:47:0x00a9, B:49:0x00ac), top: B:104:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3 A[Catch: Exception -> 0x0167, TryCatch #2 {Exception -> 0x0167, blocks: (B:58:0x00cb, B:62:0x00e3, B:63:0x00e7, B:65:0x00f3, B:66:0x00fb, B:68:0x0113, B:71:0x011c, B:73:0x0126, B:75:0x012c, B:78:0x0133, B:80:0x013a, B:82:0x013e, B:83:0x0140), top: B:101:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0113 A[Catch: Exception -> 0x0167, TryCatch #2 {Exception -> 0x0167, blocks: (B:58:0x00cb, B:62:0x00e3, B:63:0x00e7, B:65:0x00f3, B:66:0x00fb, B:68:0x0113, B:71:0x011c, B:73:0x0126, B:75:0x012c, B:78:0x0133, B:80:0x013a, B:82:0x013e, B:83:0x0140), top: B:101:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011c A[Catch: Exception -> 0x0167, TryCatch #2 {Exception -> 0x0167, blocks: (B:58:0x00cb, B:62:0x00e3, B:63:0x00e7, B:65:0x00f3, B:66:0x00fb, B:68:0x0113, B:71:0x011c, B:73:0x0126, B:75:0x012c, B:78:0x0133, B:80:0x013a, B:82:0x013e, B:83:0x0140), top: B:101:0x00cb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(long r23, X.C1203960hR4 r25, X.InterfaceC1364105Vn<? super kotlin.Pair<? extends X.EnumC1204140hRM, X.C1204080hRG>> r26) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel.yQ2(long, X.0hR4, X.05Vn):java.lang.Object");
    }

    public static void FQ2(int i, EnumC1201640hNK enumC1201640hNK, Integer num, String str) {
        if (num != null) {
            C1201620hNI.LIZ.LIZLLL(enumC1201640hNK, i, num.intValue(), 0, str);
        } else {
            C1201620hNI.LIZ.LJI(enumC1201640hNK, i, 0, str);
        }
    }

    public final Object GQ2(EnumC1204260hRY enumC1204260hRY, C1204080hRG c1204080hRG, C1203960hR4 c1203960hR4, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        boolean zLIZIZ;
        String strLIZJ;
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setNetworkState scene=");
        sbLIZ.append(enumC1204260hRY);
        sbLIZ.append(", isNetworkAvailable=");
        sbLIZ.append(zLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!zLIZIZ) {
            if (c1203960hR4 != null) {
                c1203960hR4.LJIIJ = EnumC1201640hNK.NETWORK_ERR.getTypeStr();
            }
            setState(new AwS227S0300000_18(enumC1204260hRY, c1204080hRG, c1203960hR4, 36));
            C1201620hNI c1201620hNI = C1201620hNI.LIZ;
            EnumC1201640hNK enumC1201640hNK = EnumC1201640hNK.NETWORK_ERR;
            if (c1203960hR4 == null || (strLIZJ = c1203960hR4.LIZJ()) == null) {
                strLIZJ = "unknown";
            }
            c1201620hNI.LJI(enumC1201640hNK, 0, 0, strLIZJ);
            return Unit.LIZ;
        }
        Object objInvoke = function1.invoke(interfaceC1364105Vn);
        if (objInvoke == C099R.LJFF()) {
            return objInvoke;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    public final C1204080hRG vQ2(NearbyRevampResponse nearbyRevampResponse, long j, C1203960hR4 c1203960hR4, boolean z, boolean z2) {
        String str;
        String imprId;
        EnumC1204030hRB enumC1204030hRB;
        int size;
        int i;
        ?? arrayList;
        String str2 = nearbyRevampResponse.geoExpansionType;
        boolean z3 = true;
        if (str2 != null && str2.length() > 0) {
            C1204940hSe c1204940hSe = C1204940hSe.LIZ;
            PageFinder pageFinder = this.LLILZIL;
            c1204940hSe.getClass();
            C1204940hSe.LIZ(str2, j, pageFinder);
        }
        Integer num = nearbyRevampResponse.isNearbyCurrentRegion;
        if (num != null && num.intValue() == 0) {
            C1204940hSe c1204940hSe2 = C1204940hSe.LIZ;
            String str3 = nearbyRevampResponse.fallbackContentType;
            PageFinder pageFinder2 = this.LLILZIL;
            c1204940hSe2.getClass();
            C1204940hSe.LIZJ(str3, pageFinder2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z2) {
            str = nearbyRevampResponse.dataType;
        } else {
            str = null;
        }
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        List listLIZ = C1204520hRy.LIZ(nearbyRevampResponse.guideEntry, j, false);
        if (listLIZ != null) {
            c13dvLIZIZ.addAll(listLIZ);
        }
        NearbyToolZoneModel nearbyToolZoneModel = nearbyRevampResponse.toolZone;
        if (nearbyToolZoneModel != null) {
            C1204900hSa c1204900hSa = C1204900hSa.LIZ;
            String strLIZ = nearbyToolZoneModel.LIZ();
            c1204900hSa.getClass();
            C1204900hSa.LIZIZ = strLIZ;
            List<NearbyTool> list = nearbyToolZoneModel.tools;
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            if (size != 2) {
                if (size != 3) {
                    i = 50003;
                } else {
                    i = 50002;
                }
            } else {
                i = 50001;
            }
            List<NearbyTool> list2 = nearbyToolZoneModel.tools;
            if (list2 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (NearbyTool nearbyTool : list2) {
                    arrayList.add(nearbyTool.copy(nearbyTool.componentKey, nearbyTool.icon, nearbyTool.iconDark, nearbyTool.title, nearbyTool.schema, nearbyTool.priority, nearbyRevampResponse.logPb, false, i));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            if (arrayList.size() >= 2) {
                c13dvLIZIZ.add(new NearbyToolZoneModel(arrayList, false));
            }
        }
        List<Aweme> list3 = nearbyRevampResponse.awemeList;
        if (list3 != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            for (Aweme aweme : list3) {
                boolean zIsLike = aweme.isLike();
                LogPbBean logPbBean = nearbyRevampResponse.logPb;
                if (logPbBean != null) {
                    imprId = logPbBean.getImprId();
                } else {
                    imprId = null;
                }
                if (c1203960hR4 != null) {
                    enumC1204030hRB = c1203960hR4.LIZ;
                } else {
                    enumC1204030hRB = null;
                }
                arrayList2.add(new C1204470hRt(aweme, zIsLike, imprId, 0, enumC1204030hRB, Long.valueOf(jCurrentTimeMillis), EnumC1204410hRn.REFRESH, z, str, 152));
            }
            c13dvLIZIZ.addAll(arrayList2);
        }
        List listLIZ2 = C1697820uHc.LIZ(c13dvLIZIZ);
        Integer num2 = nearbyRevampResponse.hasMore;
        if (num2 == null || num2.intValue() != 1) {
            z3 = false;
        }
        return new C1204080hRG(listLIZ2, Boolean.valueOf(z3), false, (Long) null, (Boolean) null, nearbyRevampResponse.geoExpansionType, nearbyRevampResponse.isNearbyCurrentRegion, z, 152);
    }
}
