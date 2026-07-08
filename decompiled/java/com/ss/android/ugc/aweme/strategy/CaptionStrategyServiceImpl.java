package com.ss.android.ugc.aweme.strategy;

import X.AnonymousClass0174;
import X.AnonymousClass0956;
import X.C00I7;
import X.C017C;
import X.C01S9;
import X.C05YD;
import X.C08IR;
import X.C0NK2;
import X.C161N;
import X.C161U;
import X.C161V;
import X.C161X;
import X.C161Z;
import X.C1699690uKd;
import X.C1BNE;
import X.C20703515zt;
import X.C207042160a;
import X.C207069161b;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2296808zG;
import X.C23250099c;
import X.C295750BiX;
import X.C587760N3m;
import X.C710850RuV;
import X.C715810S5z;
import X.C786410Ut5;
import X.InterfaceC0241006d;
import Y.ARunnableS78S0200000_9;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cla.et.newet.ClaPerfCaptionSmartSkipLoadEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.ICaptionStrategyService;
import com.ss.android.ugc.aweme.strategy.CaptionStrategyServiceImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class CaptionStrategyServiceImpl implements ICaptionStrategyService {
    public final Handler LIZ = C161N.LIZIZ.LLIILII();
    public final long LIZIZ = 3000;
    public final C161X LIZJ = new C161X(this);
    public final C2252321DDq LIZLLL;
    public final C2252321DDq LJ;

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final void Xg() {
        C786410Ut5.LJJZZIII(this.LIZ, new Runnable() { // from class: X.161W
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CaptionStrategyServiceImpl@9733.onScrollingStart$1");
                try {
                    this.LL.LIZLLL.setValue(Boolean.TRUE);
                    CaptionStrategyServiceImpl captionStrategyServiceImpl = this.LL;
                    captionStrategyServiceImpl.LIZ.removeCallbacks(captionStrategyServiceImpl.LIZJ);
                    CaptionStrategyServiceImpl captionStrategyServiceImpl2 = this.LL;
                    C786410Ut5.LJLIIL(captionStrategyServiceImpl2.LIZIZ, captionStrategyServiceImpl2.LIZ, captionStrategyServiceImpl2.LIZJ);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CaptionStrategyServiceImpl@9733.onScrollingStart$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final void Yg() {
        C786410Ut5.LJJZZIII(this.LIZ, new Runnable() { // from class: X.161Y
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CaptionStrategyServiceImpl@9733.onScrollingEnd$1");
                try {
                    this.LL.LIZJ.run();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CaptionStrategyServiceImpl@9733.onScrollingEnd$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final C01S9<C207042160a> dh() {
        C0NK2.LIZ.getClass();
        return C0NK2.LIZJ;
    }

    public CaptionStrategyServiceImpl() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        this.LIZLLL = c2252321DDqLIZ;
        this.LJ = c2252321DDqLIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final C05YD<Boolean> Ug() {
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final boolean Vg(Aweme aweme) {
        C587760N3m c587760N3m;
        C0NK2.LIZ.getClass();
        if (aweme == null) {
            return false;
        }
        if (C295750BiX.LIZ()) {
            C20703515zt.LIZ.getClass();
            if (!(!C20703515zt.LJJIJIIJIL(aweme, true))) {
                String aid = aweme.getAid();
                if (!C295750BiX.LIZ() || aid == null || (c587760N3m = (C587760N3m) C08IR.LIZ(C0NK2.LIZIZ, aid)) == null || !c587760N3m.LIZ) {
                    return false;
                }
            }
            return true;
        }
        C20703515zt.LIZ.getClass();
        return !C20703515zt.LJJIJIIJIL(aweme, true);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final void Wg(final int i) {
        C0NK2.LIZ.getClass();
        C786410Ut5.LJJZZIII(C161N.LIZIZ.LLIILII(), new Runnable() { // from class: X.0N3l
            public final void LIZ() {
                Integer num;
                Map<String, C587760N3m> mapLJIIIIZZ = C0NK2.LIZIZ.LJIIIIZZ();
                int i2 = i;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) mapLJIIIIZZ).entrySet()) {
                    C587760N3m c587760N3m = (C587760N3m) entry.getValue();
                    if (c587760N3m != null && (num = c587760N3m.LIZJ) != null && num.intValue() == i2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    C603820NmG<String, C587760N3m> c603820NmG = C0NK2.LIZIZ;
                    Object key = entry2.getKey();
                    if (key != null) {
                        try {
                            c603820NmG.LJ((String) key);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CaptionLazyLoadController@4d0a.clearDecisionsForDetailPage$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CaptionLazyLoadController@4d0a.clearDecisionsForDetailPage$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final int ch(Aweme aweme) {
        String aid;
        String aid2;
        Long lLJIILLIIL;
        C161V.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPreloadSubId aweme ");
        String strLJIIIZ = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme != null) {
            aid2 = aweme.getAid();
            lLJIILLIIL = C20703515zt.LJIILLIIL(aweme);
            strLJIIIZ = C20703515zt.LJIIIZ(aweme);
        } else {
            aid2 = null;
            lLJIILLIIL = null;
        }
        return C161V.LIZ(aweme, aid2, lLJIILLIIL, strLJIIIZ, new C710850RuV(aweme), new C715810S5z(aweme));
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final void Zg(long j, String str) {
        String str2;
        String str3;
        final Long lValueOf;
        long j2;
        C0NK2.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderUnselected with aid: ");
        sbLIZ.append(str);
        sbLIZ.append("; curAid: ");
        C161Z c161z = C0NK2.LJ;
        if (c161z != null) {
            str2 = c161z.LIZ.LL;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append("; swipePts: ");
        sbLIZ.append(j);
        sbLIZ.append(';');
        C2188811AlT.LIZIZ(sbLIZ);
        C161Z c161z2 = C0NK2.LJ;
        if (c161z2 != null) {
            str3 = c161z2.LIZ.LL;
        } else {
            str3 = null;
        }
        if (Intrinsics.LJFF(str, str3)) {
            C161Z c161z3 = C0NK2.LJ;
            if (c161z3 != null && !c161z3.LIZJ) {
                Long l = c161z3.LIZIZ.LLILLL;
                if (l != null) {
                    long jLongValue = l.longValue();
                    if (j < jLongValue) {
                        j2 = 0;
                    } else {
                        j2 = j - jLongValue;
                    }
                    lValueOf = Long.valueOf(j2);
                } else {
                    lValueOf = null;
                }
                C017C c017c = c161z3.LIZLLL;
                final Long lValueOf2 = Long.valueOf(j);
                c017c.LIZIZ(new InterfaceC0241006d(lValueOf, lValueOf2) { // from class: X.004c
                    public final Long LL;
                    public final Long LLILLJJLI;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0188004c)) {
                            return false;
                        }
                        C0188004c c0188004c = (C0188004c) obj;
                        return Intrinsics.LJFF(this.LL, c0188004c.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0188004c.LLILLJJLI);
                    }

                    public final int hashCode() {
                        Long l2 = this.LL;
                        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
                        Long l3 = this.LLILLJJLI;
                        return iHashCode + (l3 != null ? l3.hashCode() : 0);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("overdue_duration", this.LL);
                        linkedHashMap.put("swipe_pts", this.LLILLJJLI);
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("SmartLoadSkipLoadParams(overdueDuration=");
                        sbLIZ2.append(this.LL);
                        sbLIZ2.append(", swipePts=");
                        sbLIZ2.append(this.LLILLJJLI);
                        sbLIZ2.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ2);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = lValueOf;
                        this.LLILLJJLI = lValueOf2;
                    }
                });
                C207069161b.LJ(ClaPerfCaptionSmartSkipLoadEvent.class, c161z3.LIZLLL, new AnonymousClass0174(), null, 24);
            }
            C0NK2.LJ = null;
            AnonymousClass0956 anonymousClass0956 = C0NK2.LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final void ah(String str, String str2) {
        String str3;
        C161Z c161z;
        C0NK2.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCaptionLoadEnd with aid: ");
        sbLIZ.append(str);
        sbLIZ.append("; subId: ");
        sbLIZ.append(str2);
        sbLIZ.append("; curSmartLoadAid: ");
        C161Z c161z2 = C0NK2.LJ;
        String str4 = null;
        if (c161z2 != null) {
            str3 = c161z2.LIZ.LL;
        } else {
            str3 = null;
        }
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
        C161Z c161z3 = C0NK2.LJ;
        if (c161z3 != null) {
            str4 = c161z3.LIZ.LL;
        }
        if (Intrinsics.LJFF(str, str4) && (c161z = C0NK2.LJ) != null) {
            c161z.LIZJ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final void bh(Integer num, List list) {
        C0NK2 c0nk2 = C0NK2.LIZ;
        ArrayList arrayList = new ArrayList(list);
        c0nk2.getClass();
        C786410Ut5.LJJZZIII(C161N.LIZIZ.LLIILII(), new ARunnableS78S0200000_9(arrayList, num, 61));
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final void eh(Aweme aweme, C00I7 c00i7) {
        String aid;
        C587760N3m c587760N3m;
        Long l;
        C0NK2.LIZ.getClass();
        if (C295750BiX.LIZ()) {
            C20703515zt.LIZ.getClass();
            if (!(true ^ C20703515zt.LJJIJIIJIL(aweme, true)) && (aid = aweme.getAid()) != null && (c587760N3m = (C587760N3m) C08IR.LIZ(C0NK2.LIZIZ, aid)) != null && c587760N3m.LIZ && (l = c587760N3m.LIZIZ) != null) {
                long jLongValue = l.longValue();
                AnonymousClass0956 anonymousClass0956 = C0NK2.LIZLLL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                C0NK2.LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C1699690uKd.LIZ()), null, null, new C161U(jLongValue, aid, c00i7, aweme, null), 3);
            }
        }
    }
}
