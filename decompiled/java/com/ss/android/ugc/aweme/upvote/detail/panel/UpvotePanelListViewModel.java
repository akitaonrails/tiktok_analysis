package com.ss.android.ugc.aweme.upvote.detail.panel;

import X.C01GW;
import X.C08JS;
import X.C09JN;
import X.C11NJ;
import X.C11O8;
import X.C11S5;
import X.C1358120lRi;
import X.C1358520lSM;
import X.C1358870lSv;
import X.C1358880lSw;
import X.C1358940lT2;
import X.C1358950lT3;
import X.C1359000lT8;
import X.C1701940uOG;
import X.C2097908Jt;
import X.C452501pT;
import X.EnumC1359020lTA;
import X.InterfaceC1358860lSu;
import X.InterfaceC1359100lTI;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.upvote.api.UpvoteApi;
import com.ss.android.ugc.aweme.upvote.model.UpvoteBatchListResponse;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvotePanelListViewModel extends ViewModel implements InterfaceC1359100lTI {
    public static final C1358120lRi LLJJIJI = new C1358120lRi();
    public String LL;
    public boolean LLIZLLLIL;
    public VideoItemParams LLJI;
    public Aweme LLJIJIL;
    public String LLJILJIL;
    public List<String> LLJILJILJ;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(362));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(361));
    public boolean LLILZ = true;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(360));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(359));
    public String LLIZ = "unknown";
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(363));
    public final Map<String, Integer> LLJILLL = new LinkedHashMap();
    public final Map<String, Set<String>> LLJJ = new LinkedHashMap();
    public final Map<String, Set<String>> LLJJI = new LinkedHashMap();
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 937));

    public final MutableLiveData<C1358520lSM> vQ2() {
        return (MutableLiveData) this.LLILLL.getValue();
    }

    public final MutableLiveData<UpvoteList> wQ2() {
        return (MutableLiveData) this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04df  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v9, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r33, java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListViewModel.yQ2(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void xQ2(final InterfaceC1358860lSu interfaceC1358860lSu, String str, final long j) {
        Aweme aweme;
        final String aid;
        EnumC1359020lTA enumC1359020lTALJI;
        boolean zBooleanValue;
        Map mapLIZJ;
        Map mapLIZJ2;
        String strLIZLLL;
        String strLIZLLL2;
        final boolean z;
        final boolean z2;
        String strLIZLLL3;
        Integer numValueOf;
        String str2;
        if (interfaceC1358860lSu != null && (aweme = this.LLJIJIL) != null && (aid = aweme.getAid()) != null) {
            if (str == null || str.length() == 0) {
                C1358880lSw.LIZ.getClass();
                ((ConcurrentHashMap) C1358880lSw.LIZIZ.getValue()).get(aid);
            }
            VideoItemParams videoItemParams = this.LLJI;
            if (videoItemParams == null || (str2 = videoItemParams.mEventType) == null || (enumC1359020lTALJI = C1358940lT2.LJI(str2)) == null) {
                enumC1359020lTALJI = EnumC1359020lTA.OTHERS;
            }
            C1358950lT3 c1358950lT3 = C1358950lT3.LIZ;
            String strLJII = C1358940lT2.LJII(this.LLJIJIL);
            c1358950lT3.getClass();
            final C1358870lSv c1358870lSv = new C1358870lSv(false, "fetch_new", 5);
            c1358870lSv.LIZJ = System.currentTimeMillis();
            Boolean bool = (Boolean) ComplianceServiceProvider.LJI().LJJIII().getValue();
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            C1358880lSw.LIZ.getClass();
            final String strLIZLLL4 = C1358880lSw.LIZLLL(aid);
            Object obj = ((LinkedHashMap) C1358880lSw.LIZJ).get(aid);
            if (str != null || obj != null) {
                mapLIZJ = C2097908Jt.LIZJ(new Pair(aid, obj));
            } else {
                mapLIZJ = null;
            }
            if (strLIZLLL4 != null && strLIZLLL4.length() != 0) {
                mapLIZJ2 = C2097908Jt.LIZJ(new Pair(aid, strLIZLLL4));
            } else {
                mapLIZJ2 = null;
            }
            if (mapLIZJ != null) {
                strLIZLLL = C08JS.LIZLLL(mapLIZJ);
            } else {
                strLIZLLL = null;
            }
            if (mapLIZJ2 != null) {
                strLIZLLL2 = C08JS.LIZLLL(mapLIZJ2);
            } else {
                strLIZLLL2 = null;
            }
            String strLIZLLL5 = C08JS.LIZLLL(C2097908Jt.LIZJ(new Pair(aid, Long.valueOf(j))));
            if ((mapLIZJ != null && (!mapLIZJ.isEmpty())) || (strLIZLLL2 != null && strLIZLLL2.length() > 0)) {
                z = true;
            } else {
                z = false;
            }
            if (j == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str3 = (String) ((LinkedHashMap) C1358880lSw.LJFF).get(aid);
            if (str3 != null && str3.length() > 0) {
                strLIZLLL3 = C08JS.LIZLLL(C2097908Jt.LIZJ(new Pair(aid, str3)));
            } else {
                strLIZLLL3 = null;
            }
            C1359000lT8.LIZIZ();
            if (!C1359000lT8.LIZ(aid, strLIZLLL4, enumC1359020lTALJI)) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                UpvoteApi upvoteApi = UpvoteApi.LIZIZ;
                String strLIZLLL6 = C08JS.LIZLLL(Collections.singletonList(aid));
                if (j != 0) {
                    strLIZLLL = null;
                    strLIZLLL2 = null;
                }
                if (enumC1359020lTALJI != null) {
                    numValueOf = Integer.valueOf(enumC1359020lTALJI.getValue());
                } else {
                    numValueOf = null;
                }
                C11O8 c11o8LJJJLZIJ = upvoteApi.getUpvoteBatchList(strLIZLLL6, "", numValueOf, strLIZLLL, strLIZLLL2, zBooleanValue, strLIZLLL5, (String) C1358950lT3.LIZLLL.getValue(), strLJII, null, C1358950lT3.LIZIZ(), null, strLIZLLL3).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                final EnumC1359020lTA enumC1359020lTA = enumC1359020lTALJI;
                final String str4 = strLIZLLL3;
                C09JN c09jn = new C09JN(jCurrentTimeMillis, c1358870lSv, z, z2, aid, strLIZLLL4, str4, interfaceC1358860lSu, j) { // from class: X.0lSt
                    public final /* synthetic */ long LLILLJJLI;
                    public final /* synthetic */ C1358870lSv LLILLL;
                    public final /* synthetic */ boolean LLILZ;
                    public final /* synthetic */ boolean LLILZIL;
                    public final /* synthetic */ String LLILZLL;
                    public final /* synthetic */ String LLIZ;
                    public final /* synthetic */ String LLIZLLLIL;
                    public final /* synthetic */ InterfaceC1358860lSu LLJ;

                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        String str5;
                        C1C7U.LIZ("UpvoteListDataCenter@8fc.fetchUpvoteListNew$1");
                        UpvoteBatchListResponse upvoteBatchListResponse = (UpvoteBatchListResponse) obj2;
                        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                        EnumC1359020lTA enumC1359020lTA2 = this.LL;
                        if (enumC1359020lTA2 == null) {
                            enumC1359020lTA2 = EnumC1359020lTA.OTHERS;
                        }
                        int value = enumC1359020lTA2.getValue();
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        long j2 = this.LLILLJJLI;
                        long j3 = jCurrentTimeMillis2 - j2;
                        C1358870lSv c1358870lSv2 = this.LLILLL;
                        long j4 = j2 - c1358870lSv2.LIZJ;
                        boolean z3 = this.LLILZ;
                        boolean z4 = this.LLILZIL;
                        c1358550lSP.getClass();
                        C1358550lSP.LJIL(1, value, j3, j4, z3, z4, c1358870lSv2, 1);
                        C1358950lT3 c1358950lT32 = C1358950lT3.LIZ;
                        UpvoteList upvoteList = (UpvoteList) ListProtector.get(upvoteBatchListResponse.upvoteLists, 0);
                        c1358950lT32.getClass();
                        UpvoteList upvoteListLJIIIZ = C1358950lT3.LJIIIZ(upvoteList);
                        C1358950lT3.LJII(c1358950lT32, this.LLILZLL, upvoteListLJIIIZ, this.LLIZ, this.LLILZIL, 0, C703302op.LIZ(this.LLIZLLLIL), 16);
                        if (this.LLILZIL) {
                            C1358880lSw c1358880lSw = C1358880lSw.LIZ;
                            String str6 = this.LLILZLL;
                            c1358880lSw.getClass();
                            UpvoteList upvoteListLJFF = C1358880lSw.LJFF(str6);
                            if (upvoteListLJFF != null) {
                                upvoteListLJIIIZ = upvoteListLJFF;
                            }
                        }
                        InterfaceC1358860lSu interfaceC1358860lSu2 = this.LLJ;
                        if (interfaceC1358860lSu2 != null) {
                            interfaceC1358860lSu2.LIZIZ(upvoteListLJIIIZ);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetchUpvoteListNew success, upvoteLists.size: ");
                        sbLIZ.append(upvoteBatchListResponse.upvoteLists.size());
                        sbLIZ.append(" logId: ");
                        BaseResponse.ServerTimeExtra serverTimeExtra = upvoteBatchListResponse.extra;
                        if (serverTimeExtra != null) {
                            str5 = serverTimeExtra.logid;
                        } else {
                            str5 = null;
                        }
                        sbLIZ.append(str5);
                        C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ));
                        C1C7U.LIZIZ("UpvoteListDataCenter@8fc.fetchUpvoteListNew$1");
                    }
                };
                final EnumC1359020lTA enumC1359020lTA2 = enumC1359020lTALJI;
                ((C11NJ) C1358950lT3.LIZJ.getValue()).LIZ(c11o8LJJJLZIJ.LJJLL(c09jn, new C09JN(jCurrentTimeMillis, c1358870lSv, z, z2, interfaceC1358860lSu, j) { // from class: X.0lSr
                    public final /* synthetic */ long LLILLJJLI;
                    public final /* synthetic */ C1358870lSv LLILLL;
                    public final /* synthetic */ boolean LLILZ;
                    public final /* synthetic */ boolean LLILZIL;
                    public final /* synthetic */ InterfaceC1358860lSu LLILZLL;

                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("UpvoteListDataCenter@8fc.fetchUpvoteListNew$2");
                        Throwable th = (Throwable) obj2;
                        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                        EnumC1359020lTA enumC1359020lTA3 = this.LL;
                        if (enumC1359020lTA3 == null) {
                            enumC1359020lTA3 = EnumC1359020lTA.OTHERS;
                        }
                        int value = enumC1359020lTA3.getValue();
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        long j2 = this.LLILLJJLI;
                        long j3 = jCurrentTimeMillis2 - j2;
                        C1358870lSv c1358870lSv2 = this.LLILLL;
                        long j4 = j2 - c1358870lSv2.LIZJ;
                        boolean z3 = this.LLILZ;
                        boolean z4 = this.LLILZIL;
                        c1358550lSP.getClass();
                        C1358550lSP.LJIL(0, value, j3, j4, z3, z4, c1358870lSv2, 1);
                        InterfaceC1358860lSu interfaceC1358860lSu2 = this.LLILZLL;
                        if (interfaceC1358860lSu2 != null) {
                            interfaceC1358860lSu2.LIZ(th);
                        }
                        C429430Gsf.LIZ("RepostTagMonitor", "fetchUpvoteListNew fail");
                        C1C7U.LIZIZ("UpvoteListDataCenter@8fc.fetchUpvoteListNew$2");
                    }
                }));
            }
        }
    }

    @Override // X.InterfaceC1359100lTI
    public final void P12(String str, UpvoteList upvoteList, String str2, boolean z) {
        this.LLIZLLLIL = z;
        yQ2(upvoteList, str2);
    }
}
