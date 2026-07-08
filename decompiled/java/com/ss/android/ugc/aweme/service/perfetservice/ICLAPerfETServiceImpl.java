package com.ss.android.ugc.aweme.service.perfetservice;

import X.AnonymousClass0175;
import X.AnonymousClass1621;
import X.AnonymousClass1623;
import X.AnonymousClass1629;
import X.C00I7;
import X.C00YD;
import X.C014S;
import X.C016B;
import X.C016X;
import X.C017C;
import X.C0186004a;
import X.C01GW;
import X.C0278007o;
import X.C0BKU;
import X.C0BKV;
import X.C0BTT;
import X.C0Q5X;
import X.C0Q69;
import X.C0SCU;
import X.C0SKF;
import X.C0SQQ;
import X.C0SXF;
import X.C13LP;
import X.C1483410ohn;
import X.C160B;
import X.C160X;
import X.C161F;
import X.C161N;
import X.C162C;
import X.C162D;
import X.C162F;
import X.C162G;
import X.C162H;
import X.C162I;
import X.C162L;
import X.C162N;
import X.C162V;
import X.C1697810uHb;
import X.C1906580ziK;
import X.C20702515zj;
import X.C20703515zt;
import X.C207069161b;
import X.C207071161d;
import X.C207093161z;
import X.C2188811AlT;
import X.C225600ty;
import X.C277370Atz;
import X.C2791016f;
import X.C2802016q;
import X.C2807016v;
import X.C2808016w;
import X.C293250BeV;
import X.C295300Bho;
import X.C452501pT;
import X.C581750Mrl;
import X.C586120Myo;
import X.C715730S5r;
import X.C746760TRa;
import X.C7740030o;
import X.C786410Ut5;
import X.EnumC1782680wUU;
import X.EnumC20038913at;
import X.InterfaceC0241006d;
import X.InterfaceC715720S5q;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS11S2100000_23;
import Y.ARunnableS27S1200000_23;
import Y.ARunnableS28S1100000_23;
import Y.AfS200S0100000_31;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cla.et.newet.ClaPerfCaptionFirstDisplayEvent;
import com.ss.android.ugc.aweme.cla.et.newet.ClaPerfCaptionLoadStartEvent;
import com.ss.android.ugc.aweme.cla.et.newet.ClaPerfDescFirstRealDisplayEvent;
import com.ss.android.ugc.aweme.cla.et.newet.VideoPlayClaRelatedEvent;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.service.ICLAPerfETService;
import com.ss.android.ugc.aweme.service.perfetservice.CaptionLangSwitchRecord;
import com.ss.android.ugc.aweme.service.perfetservice.ICLAPerfETServiceImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes32.dex */
public final class ICLAPerfETServiceImpl implements ICLAPerfETService {
    public static final C01GW<ConcurrentHashMap<String, C160X>> LJJII = C452501pT.LIZIZ(new C162H());
    public C00I7 LIZIZ;
    public C162D LIZJ;
    public boolean LIZLLL;
    public boolean LJFF;
    public C207093161z LJI;
    public volatile String LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ;
    public volatile String LJIIJJI;
    public volatile Long LJIIL;
    public String LJIILIIL;
    public C2807016v LJIL;
    public final C01GW LIZ = C452501pT.LIZIZ(new C162L());
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final Handler LJIILJJIL = C161N.LIZIZ.LLIILII();
    public final ConcurrentHashMap<String, AnonymousClass1621> LJIILL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C207093161z> LJIILLIIL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C00YD> LJIIZILJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LJIJ = new ConcurrentHashMap<>();
    public LinkedHashMap<String, C162F> LJIJI = new LinkedHashMap<>();
    public HashMap<String, C207093161z> LJIJJ = new LinkedHashMap();
    public final C162I LJIJJLI = new C162I();
    public final Set<Pair<String, String>> LJJ = Collections.newSetFromMap(new ConcurrentHashMap());
    public final C01GW LJJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1004));
    public final C162G LJJIFFI = new C162G();

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void onDestroy() {
        this.LIZJ = null;
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new ARunnableS104S0100000_4(this, 38));
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJIIJ() {
        C162I c162i = this.LJIJJLI;
        c162i.getClass();
        if (C0BTT.LIZ()) {
            Iterator<T> it2 = c162i.LIZ.entrySet().iterator();
            while (it2.hasNext()) {
                C014S c014s = (C014S) ((Map.Entry) it2.next()).getValue();
                c014s.LLILLL = 1;
                c014s.LL = Integer.valueOf(EnumC1782680wUU.NOT_PREDICTED.getValue());
            }
        }
    }

    public final C00I7 LJJII() {
        if (this.LIZIZ == null) {
            C162D c162d = this.LIZJ;
            this.LIZIZ = c162d != null ? (C00I7) c162d.invoke() : null;
        }
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void clear() {
        this.LJIILL.clear();
    }

    public ICLAPerfETServiceImpl() {
        C1906580ziK.LIZJ().LIZJ().LJJLJLI(new AfS200S0100000_31(this, 12));
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final String LIZ(String str) {
        boolean z;
        AnonymousClass1621 anonymousClass1621Remove;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String strLIZIZ = "";
        if (z || (anonymousClass1621Remove = this.LJIILL.remove(str)) == null) {
            return "";
        }
        if (str == null || !Intrinsics.LJFF(str, anonymousClass1621Remove.LIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sourceId doesn't match current awemeid; aid - ");
            sbLIZ.append(anonymousClass1621Remove.LIZ);
            sbLIZ.append("; sourceId - ");
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        CaptionBehaviorInfo captionBehaviorInfo = anonymousClass1621Remove.LIZIZ;
        Collection<CaptionLoadInfo> collectionValues = anonymousClass1621Remove.LJ.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (Intrinsics.LJFF(((CaptionLoadInfo) obj).type, EnumC20038913at.REALTIME.getValue())) {
                arrayList.add(obj);
            }
        }
        anonymousClass1621Remove.LIZIZ = captionBehaviorInfo.copy(captionBehaviorInfo.awemeId, captionBehaviorInfo.originalLangName, captionBehaviorInfo.offlineCaptionsInfo, captionBehaviorInfo.offlineCaptionHitLazyLoad, captionBehaviorInfo.offlineCaptionHitPreload, arrayList.size(), C13LP.LLIIII(anonymousClass1621Remove.LJ.values()), anonymousClass1621Remove.LIZJ, anonymousClass1621Remove.LIZLLL, strLIZIZ, captionBehaviorInfo.firstFrameRenderedTimestamp);
        return GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), anonymousClass1621Remove.LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJIIJJI(String str) {
        if (str.length() == 0) {
            return;
        }
        if (C0BKU.LIZIZ()) {
            this.LJIJ.remove(str);
        }
        for (C207093161z c207093161z : this.LJIILLIIL.values()) {
            if (Intrinsics.LJFF(c207093161z.LIZ(), str)) {
                c207093161z.LJIIJJI = null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJIJJLI(String str) {
        if (C295300Bho.LIZ()) {
            long jLongValue = ((Number) this.LJJIFFI.invoke()).longValue();
            this.LJIIJJI = str;
            this.LJIIL = Long.valueOf(System.currentTimeMillis());
            if (C0BKV.LIZJ() && str != null && str.length() != 0) {
                Collection<C207093161z> collectionValues = this.LJIILLIIL.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    if (Intrinsics.LJFF(((C207093161z) obj).LIZ(), str)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((C207093161z) it2.next()).LJIIIIZZ = Long.valueOf(jLongValue);
                }
            } else {
                Iterator<T> it3 = this.LJIILLIIL.values().iterator();
                while (it3.hasNext()) {
                    ((C207093161z) it3.next()).LJIIIIZZ = Long.valueOf(jLongValue);
                }
            }
            C786410Ut5.LJJZZIII(this.LJIILJJIL, new ARunnableS28S1100000_23(this, str, 6));
            return;
        }
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new ARunnableS28S1100000_23(this, str, 7));
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJJ(String str) {
        if (str == null || Intrinsics.LJFF(this.LJIILIIL, str)) {
            return;
        }
        this.LJIILIIL = str;
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final String LJJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realtime_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ce A[PHI: r6
      0x03ce: PHI (r6v3 long) = (r6v2 long), (r6v12 long) binds: [B:154:0x03ca, B:76:0x01b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(long r23) {
        /*
            Method dump skipped, instruction units count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.perfetservice.ICLAPerfETServiceImpl.LJJIIJ(long):void");
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LIZIZ(Aweme aweme, C0Q5X c0q5x) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        String str;
        String strLJJIFFI;
        int i5;
        String str2;
        if (aweme != null && C20703515zt.LJIIIIZZ(aweme) != null) {
            this.LIZ.getValue().getClass();
            if (aweme != null) {
                C017C c017c = new C017C();
                C161N c161n = C161N.LIZIZ;
                int i6 = 2;
                List listLJIIJJI = C1697810uHb.LJIIJJI(c161n.LJJIJIIJIL(null, aweme, c0q5x.LIZJ), c0q5x.LIZIZ, new C225600ty(0, C293250BeV.LIZ(), null, null));
                if (C20703515zt.LJIIIIZZ(aweme) != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (C20703515zt.LJI(aweme) != null && (!r4.isEmpty())) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                C20703515zt.LIZ.getClass();
                if (C20703515zt.LJJIFFI(aweme, false) && !C20703515zt.LJJIIJZLJL(aweme)) {
                    z = true;
                } else {
                    z = false;
                }
                if ((!C20703515zt.LIZIZ.LJIILL(aweme, null, null) || !C746760TRa.LIZ().LJLILLLLZI()) && !z) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                if (!C20702515zj.LIZIZ(aweme) && i3 == 0) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                boolean zLJJIIZI = C20703515zt.LJJIIZI(aweme, null);
                boolean zLJIL = C20703515zt.LJIL(aweme);
                if (!z && !C20703515zt.LJJIFFI(aweme, true)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                InterfaceC0241006d[] interfaceC0241006dArr = new InterfaceC0241006d[2];
                String strLJIIJJI = C20703515zt.LJIIJJI(aweme);
                if (i2 != 0) {
                    if (zLJJIIZI || !zLJIL) {
                        i6 = 1;
                    }
                } else {
                    i6 = 0;
                }
                Integer numValueOf = Integer.valueOf(i6);
                if (!c0q5x.LIZ && !z2) {
                    str = "hidden";
                } else {
                    str = "captions";
                }
                String strLJIILIIL = C20703515zt.LJIILIIL(aweme);
                Integer numValueOf2 = Integer.valueOf(i4);
                Integer numValueOf3 = Integer.valueOf(i3);
                Integer numValueOf4 = Integer.valueOf(i2);
                if (i2 != 0) {
                    strLJJIFFI = u.LJJIFFI(u.LJJIFFI(String.valueOf(C20703515zt.LJI(aweme)), e3.e, "", false), e3.f, "", false);
                } else {
                    strLJJIFFI = null;
                }
                if (zLJJIIZI && zLJIL) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                interfaceC0241006dArr[0] = new C016X(i, strLJIIJJI, numValueOf, str, strLJIILIIL, null, numValueOf2, numValueOf3, null, null, numValueOf4, strLJJIFFI, Integer.valueOf(i5), 800);
                Integer numValueOf5 = Integer.valueOf(c161n.LJJJJI(aweme));
                CaptionItemModel captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme);
                if (captionItemModelLJIIIIZZ != null) {
                    str2 = captionItemModelLJIIIIZZ.variant;
                } else {
                    str2 = null;
                }
                interfaceC0241006dArr[1] = new C2791016f(numValueOf5, str2, 237);
                ((ArrayList) c017c.LIZ).addAll(C13LP.LJJJJLI(C13LP.LJLIL(C1697810uHb.LJIIJJI(interfaceC0241006dArr), listLJIIJJI)));
                C207069161b.LJ(VideoPlayClaRelatedEvent.class, c017c, new C207071161d(null, false, 13), null, 24);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJ(String str, String str2) {
        if (str.length() == 0) {
            return;
        }
        if (C0BKU.LIZIZ()) {
            this.LJIJ.put(str, str2);
        }
        for (C207093161z c207093161z : this.LJIILLIIL.values()) {
            if (Intrinsics.LJFF(c207093161z.LIZ(), str) && (!C0BKU.LIZIZ() || !Intrinsics.LJFF(str2, "foreign_original_hidden") || !Intrinsics.LJFF(c207093161z.LIZIZ.LLILZIL, EnumC20038913at.REALTIME.getValue()))) {
                c207093161z.LJIIJJI = str2;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final C160X LJFF(Aweme aweme, String str) {
        ConcurrentHashMap<String, C160X> value = LJJII.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(str);
        return value.remove(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJI(Aweme aweme, C581750Mrl c581750Mrl) {
        CaptionModel captionModel;
        List<CaptionItemModel> list;
        EnumC1782680wUU enumC1782680wUU;
        Integer numValueOf;
        C014S c014sPutIfAbsent;
        C162I c162i = this.LJIJJLI;
        c162i.getClass();
        if (C0BTT.LIZ() && aweme != null) {
            Video video = aweme.getVideo();
            Integer numValueOf2 = null;
            if (video != null && (captionModel = video.getCaptionModel()) != null && (list = captionModel.captionList) != null && !list.isEmpty()) {
                ConcurrentHashMap<String, C014S> concurrentHashMap = c162i.LIZ;
                String aid = aweme.getAid();
                C014S c014s = concurrentHashMap.get(aid);
                if (c014s == null && (c014sPutIfAbsent = concurrentHashMap.putIfAbsent(aid, (c014s = new C014S(Integer.valueOf(EnumC1782680wUU.NOT_PREDICTED.getValue()), 126)))) != null) {
                    c014s = c014sPutIfAbsent;
                }
                C014S c014s2 = c014s;
                if (c581750Mrl.LIZLLL) {
                    enumC1782680wUU = EnumC1782680wUU.DO_NOT_LOAD;
                } else {
                    CaptionItemModel captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme);
                    if (captionItemModelLJIIIIZZ != null && c581750Mrl.LIZIZ == captionItemModelLJIIIIZZ.subId) {
                        enumC1782680wUU = EnumC1782680wUU.ORIGINAL;
                    } else {
                        CaptionItemModel captionItemModelLIZLLL = C20702515zj.LIZLLL(aweme);
                        if (captionItemModelLIZLLL != null && c581750Mrl.LIZIZ == captionItemModelLIZLLL.subId) {
                            enumC1782680wUU = EnumC1782680wUU.TRANSLATED;
                        } else {
                            enumC1782680wUU = EnumC1782680wUU.DO_NOT_LOAD;
                        }
                    }
                }
                c014s2.LLILZ = Integer.valueOf(enumC1782680wUU.getValue());
                Long l = c014s2.LLIZ;
                if (l != null) {
                    numValueOf = Integer.valueOf((int) (System.currentTimeMillis() - l.longValue()));
                } else {
                    numValueOf = null;
                }
                c014s2.LLILLJJLI = numValueOf;
                c014s2.LLILZIL = Intrinsics.LJFF(c014s2.LL, c014s2.LLILZ) ? 1 : 0;
                Long lLJIILLIIL = C20703515zt.LJIILLIIL(aweme);
                if (lLJIILLIIL != null) {
                    numValueOf2 = Integer.valueOf((int) lLJIILLIIL.longValue());
                }
                c014s2.LLILZLL = numValueOf2;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJIIIIZZ(String str, C160B c160b) {
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new ARunnableS27S1200000_23(this, c160b, str, 6));
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJIILIIL(C0Q69 c0q69, final boolean z) {
        final String string;
        final String str = c0q69.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Integer num = c0q69.LIZLLL;
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        String str3 = c0q69.LIZJ;
        if (str3 != null) {
            str2 = str3;
        }
        int i = c0q69.LIZIZ;
        int i2 = c0q69.LJ;
        if (str2.length() == 0 || this.LJFF) {
            return;
        }
        final C162N c162n = new C162N(i, i2, Intrinsics.LJFF(this.LJIILIIL, str));
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new Runnable() { // from class: X.1622
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v2 */
            /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r7v4 */
            public final void LIZ() {
                boolean z2;
                String str4;
                Integer num2;
                Long l;
                ConcurrentHashMap<String, C207093161z> concurrentHashMap = this.LJIILLIIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(string);
                C207093161z c207093161z = concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
                if (c207093161z != null) {
                    ICLAPerfETServiceImpl iCLAPerfETServiceImpl = this;
                    C162N c162n2 = c162n;
                    boolean z3 = z;
                    iCLAPerfETServiceImpl.LJFF = true;
                    if (iCLAPerfETServiceImpl.LIZLLL) {
                        z2 = false;
                    } else {
                        iCLAPerfETServiceImpl.LIZLLL = true;
                        z2 = true;
                    }
                    int iLIZIZ = c207093161z.LIZIZ();
                    C00I7 c00i7 = c207093161z.LIZ;
                    if (c00i7 == null || (str4 = c00i7.LL) == null) {
                        str4 = "";
                    }
                    if (!c207093161z.LJI) {
                        c207093161z.LIZLLL(new C162F(new C016B(AnonymousClass1623.SUCCESS.getValue(), 0, null, null, null, null, "receive first caption but no receive load end callback", null, null, 65404), Boolean.TRUE, Intrinsics.LJFF(c207093161z.LIZIZ.LLILZLL, AnonymousClass1629.LAND_ON_ITEM.getValue()) ? Long.valueOf(C1483410ohn.LJLJJI().getCurrentPosition()) : null, null, 8));
                        C162K c162k = c207093161z.LJIIL;
                        if (c162k != null) {
                            c162k.LIZ(str4, c207093161z.LIZIZ, iLIZIZ);
                        }
                    }
                    if (!z2) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onFirstCaptionDisplay: index=");
                        sbLIZ2.append(c162n2.LIZIZ);
                        sbLIZ2.append("; firstPts=");
                        sbLIZ2.append(c207093161z.LJIILIIL);
                        sbLIZ2.append("; pts=");
                        sbLIZ2.append(c162n2.LIZ);
                        sbLIZ2.append("; duration=");
                        sbLIZ2.append(c207093161z.LIZIZ());
                        sbLIZ2.append("; curPos=");
                        sbLIZ2.append((int) C1483410ohn.LJLJJI().getCurrentPosition());
                        sbLIZ2.append("; shouldReport=false; aid=");
                        sbLIZ2.append(str4);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        return;
                    }
                    ?? r7 = c162n2.LIZIZ == 1 ? 1 : 0;
                    long currentPosition = ((long) ((int) C1483410ohn.LJLJJI().getCurrentPosition())) - c207093161z.LJIILIIL;
                    C017C c017c = c207093161z.LJIILL;
                    int i3 = c162n2.LIZ;
                    int i4 = c162n2.LIZIZ;
                    int i5 = (int) currentPosition;
                    boolean z4 = c162n2.LIZJ;
                    C016B c016b = c207093161z.LJIILJJIL;
                    if (c016b != null) {
                        num2 = c016b.LLJ;
                        l = c016b.LLJILLL;
                    } else {
                        num2 = null;
                        l = null;
                    }
                    c017c.LIZIZ(new AnonymousClass0167(Integer.valueOf(iLIZIZ), Integer.valueOf((int) r7), Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(z4 ? 1 : 0), num2, l, c207093161z.LJFF, 192));
                    c207093161z.LIZIZ.LLJI = Integer.valueOf(z3 ? 1 : 0);
                    C207069161b.LJ(ClaPerfCaptionFirstDisplayEvent.class, c207093161z.LJIILL, new AnonymousClass0174(), null, 24);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onFirstCaptionDisplay: index=");
                    sbLIZ3.append(c162n2.LIZIZ);
                    sbLIZ3.append("; firstPts=");
                    sbLIZ3.append(c207093161z.LJIILIIL);
                    sbLIZ3.append("; pts=");
                    sbLIZ3.append(c162n2.LIZ);
                    sbLIZ3.append("; duration=");
                    sbLIZ3.append(c207093161z.LIZIZ());
                    sbLIZ3.append("; curPos=");
                    sbLIZ3.append((int) C1483410ohn.LJLJJI().getCurrentPosition());
                    sbLIZ3.append("; isFirstCaption=");
                    sbLIZ3.append((boolean) r7);
                    sbLIZ3.append("; aid=");
                    sbLIZ3.append(str4);
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ICLAPerfETServiceImpl@5c43.onCaptionDisplay$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ICLAPerfETServiceImpl@5c43.onCaptionDisplay$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJIILLIIL(String str, String str2) {
        if (!C277370Atz.LIZ()) {
            return;
        }
        this.LJJ.add(new Pair<>(str, str2));
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJIIZILJ(C0Q69 c0q69, String str) {
        String string;
        Object next;
        String str2 = c0q69.LIZ;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        Integer num = c0q69.LIZLLL;
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        String str4 = c0q69.LIZJ;
        if (str4 != null) {
            str3 = str4;
        }
        if (str3.length() == 0) {
            return;
        }
        ((C162C) this.LJJI.getValue()).LJFF = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(string);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C295300Bho.LIZ()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C207093161z c207093161z = this.LJIILLIIL.get(strLIZIZ);
            if (c207093161z == null) {
                Iterator<T> it2 = this.LJIILLIIL.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((C207093161z) next).LIZ(), str2)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                c207093161z = (C207093161z) next;
                if (c207093161z == null) {
                    if (str2.length() > 0 && !this.LJIIZILJ.containsKey(str2)) {
                        this.LJIIZILJ.put(str2, new C00YD(jElapsedRealtime, str));
                        return;
                    }
                    return;
                }
            }
            c207093161z.LIZJ(jElapsedRealtime, null, str, this.LJ.compareAndSet(false, true));
            return;
        }
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new ARunnableS11S2100000_23(this, strLIZIZ, str, 4));
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJIJ(String str, String str2) {
        C162V c162v;
        String str3;
        C2807016v c2807016v = this.LJIL;
        if (c2807016v != null) {
            int iElapsedRealtime = 0;
            if (c2807016v.LJFF != null) {
                if (str != null) {
                    C00I7 c00i7 = c2807016v.LIZ;
                    if (c00i7 != null) {
                        str3 = c00i7.LL;
                    } else {
                        str3 = null;
                    }
                    if (!Intrinsics.LJFF(str3, str)) {
                        return;
                    }
                }
                Long l = c2807016v.LJFF;
                if (l != null) {
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - l.longValue());
                }
                C017C c017c = c2807016v.LJI;
                if (Intrinsics.LJFF(str2, "SUCCESS")) {
                    c162v = C162V.SUCCESS;
                } else {
                    c162v = C162V.FAILURE;
                }
                c017c.LIZIZ(new C0186004a(Integer.valueOf(iElapsedRealtime), str2, Integer.valueOf(c162v.getValue())));
                C207069161b.LJ(ClaPerfDescFirstRealDisplayEvent.class, c2807016v.LJI, new AnonymousClass0175(), null, 24);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJIJI(final long j, final String str) {
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new Runnable() { // from class: X.0hag
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ICLAPerfETServiceImpl@5c43.onHolderUnSelected$1");
                try {
                    this.LL.LJJIIJ(j);
                    if (C295750BiX.LIZ()) {
                        C162B.LIZIZ.Zg(j, str);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ICLAPerfETServiceImpl@5c43.onHolderUnSelected$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJIL(String str, EnumC1782680wUU enumC1782680wUU) {
        C014S c014sPutIfAbsent;
        C162I c162i = this.LJIJJLI;
        c162i.getClass();
        if (C0BTT.LIZ()) {
            ConcurrentHashMap<String, C014S> concurrentHashMap = c162i.LIZ;
            C014S c014s = concurrentHashMap.get(str);
            if (c014s == null && (c014sPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c014s = new C014S(null, 127)))) != null) {
                c014s = c014sPutIfAbsent;
            }
            C014S c014s2 = c014s;
            c014s2.LL = Integer.valueOf(enumC1782680wUU.getValue());
            c014s2.LLIZ = Long.valueOf(System.currentTimeMillis());
        }
    }

    public static C162F LJJIIZ(C162F c162f, String str, Long l) {
        long currentPosition;
        if (!Intrinsics.LJFF(C1483410ohn.LJLJJI().LJJJLIIL(), str)) {
            return c162f;
        }
        if (l != null) {
            currentPosition = l.longValue();
        } else {
            currentPosition = C1483410ohn.LJLJJI().getCurrentPosition();
        }
        return C162F.LIZ(c162f, Long.valueOf(currentPosition));
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJIIL(final String str, final String str2, final String str3) {
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new Runnable() { // from class: X.0ona
            public final void LIZ() {
                AnonymousClass1621 anonymousClass1621;
                if (str.length() <= 0 || (anonymousClass1621 = this.LJIILL.get(str)) == null) {
                    return;
                }
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                if (!Intrinsics.LJFF(anonymousClass1621.LIZ, str4) || Intrinsics.LJFF(str5, anonymousClass1621.LJFF)) {
                    return;
                }
                anonymousClass1621.LJFF = str5;
                anonymousClass1621.LIZLLL.add(new CaptionLangSwitchRecord(System.currentTimeMillis(), str5, str6));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ICLAPerfETServiceImpl@5c43.onTriggerCaptionSwitch$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ICLAPerfETServiceImpl@5c43.onTriggerCaptionSwitch$1");
            }
        });
    }

    public static C162F LJJIIJZLJL(C162F c162f, String str, String str2, Long l) {
        if (Intrinsics.LJFF(str2, AnonymousClass1629.LAND_ON_ITEM.getValue())) {
            return LJJIIZ(c162f, str, l);
        }
        return C162F.LIZ(c162f, null);
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final C2808016w LJIIIZ(C00I7 c00i7, String str, String str2, String str3) {
        C2808016w c2808016w = new C2808016w(c00i7, str, str2, str3);
        ConcurrentHashMap<String, C160X> value = LJJII.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c00i7.LL);
        sbLIZ.append(str3);
        value.put(C2188811AlT.LIZIZ(sbLIZ), new C160X(c2808016w.LIZ, str2));
        return c2808016w;
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJIILJJIL(WeakReference<Context> weakReference, Aweme aweme, String str, boolean z) {
        boolean z2;
        C586120Myo c586120Myo = null;
        if (aweme != null) {
            if (C20703515zt.LJIIIIZZ(aweme) != null || C0SKF.LIZ(aweme) || C161F.LIZLLL(aweme.getInteractStickerStructs()) || C0SCU.LIZ().LJJJJZ(aweme) || (!C0SQQ.LIZ.LJIILL(aweme).isEmpty()) || C161N.LIZIZ.LLD(aweme, null)) {
                C715730S5r c715730S5r = (C715730S5r) this.LIZ.getValue();
                c715730S5r.getClass();
                if (aweme != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Context context = weakReference.get();
                    if (context != null && C0SXF.LJIL(context)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C017C c017c = new C017C();
                    Iterator<InterfaceC715720S5q> it2 = c715730S5r.LIZ.iterator();
                    while (it2.hasNext()) {
                        ((ArrayList) c017c.LIZ).addAll(C13LP.LJJJJLI(it2.next().LIZ(weakReference, aweme, str, jElapsedRealtime)));
                    }
                    C207071161d c207071161d = new C207071161d(null, z, 13);
                    Context context2 = weakReference.get();
                    if (context2 != null) {
                        c586120Myo = new C586120Myo(aweme, str, null, 0, context2, 12);
                    }
                    C207069161b.LIZLLL(c207071161d, c017c, VideoPlayClaRelatedEvent.class, Collections.singletonList(c586120Myo), new C2802016q(z2));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJJIFFI(final String str, final String str2, final String str3, final String str4) {
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new Runnable() { // from class: X.0ooM
            public final void LIZ() {
                Integer num;
                ICLAPerfETServiceImpl iCLAPerfETServiceImpl = this.LL;
                String str5 = str;
                String str6 = str2;
                String str7 = str3;
                String str8 = str4;
                if (iCLAPerfETServiceImpl.LJIILLIIL.isEmpty()) {
                    return;
                }
                HashMap map = new HashMap();
                Iterator<T> it2 = iCLAPerfETServiceImpl.LJIILLIIL.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    C207093161z c207093161z = (C207093161z) entry.getValue();
                    C00I7 c00i7 = c207093161z.LIZ;
                    if (Intrinsics.LJFF(c00i7 != null ? c00i7.LL : null, str5) && Intrinsics.LJFF(c207093161z.LIZIZ.LLILLL, str6) && (num = c207093161z.LIZIZ.LLJ) != null && num.intValue() == 1) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                iCLAPerfETServiceImpl.LJIILLIIL.entrySet().removeAll(map.entrySet());
                C207093161z c207093161z2 = (C207093161z) C13LP.LJJJJZ(map.values());
                c207093161z2.getClass();
                if (str8 != null && str8.length() != 0) {
                    c207093161z2.LJFF = str8;
                }
                c207093161z2.LJII = true;
                ConcurrentHashMap<String, C207093161z> concurrentHashMap = iCLAPerfETServiceImpl.LJIILLIIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str5);
                sbLIZ.append('_');
                sbLIZ.append(str7);
                concurrentHashMap.put(C2188811AlT.LIZIZ(sbLIZ), c207093161z2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ICLAPerfETServiceImpl@5c43.onRealtimeSubIdSlot$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ICLAPerfETServiceImpl@5c43.onRealtimeSubIdSlot$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final C2807016v LIZLLL(C00I7 c00i7, String str, String str2, Function0 function0, Function1 function1) {
        C2807016v c2807016v = new C2807016v(c00i7, new C0278007o(str, str2), this.LJJIFFI, function0, function1);
        this.LJIL = c2807016v;
        return c2807016v;
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJIJJ(final Aweme aweme, final C160B c160b, final boolean z, final WeakReference<Context> weakReference, final String str) {
        if (!Intrinsics.LJFF(this.LJIILIIL, aweme.getAid())) {
            this.LJIILIIL = null;
        }
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new Runnable() { // from class: X.1620
            /* JADX WARN: Removed duplicated region for block: B:65:0x017b  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0184  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 396
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1620.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ICLAPerfETServiceImpl@5c43.onNewVideo$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ICLAPerfETServiceImpl@5c43.onNewVideo$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LIZJ(final int i, final Integer num, final String str, final String str2, final boolean z, final boolean z2) {
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new Runnable() { // from class: X.0ola
            public final void LIZ() {
                String string;
                String string2;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                AnonymousClass1623 anonymousClass1623 = i == 1 ? AnonymousClass1623.SUCCESS : AnonymousClass1623.FAILURE;
                Integer num2 = num;
                string = "";
                if (num2 == null || (string2 = num2.toString()) == null) {
                    string2 = "";
                }
                int i8 = -1;
                if (C123100dR.LIZ(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        i6 = jSONObject.has("code") ? JSONObjectProtectorUtils.getInt(jSONObject, "code") : 0;
                        try {
                            i5 = jSONObject.has("cache_hit") ? JSONObjectProtectorUtils.getInt(jSONObject, "cache_hit") : -1;
                            try {
                                i4 = jSONObject.has("download_duration") ? JSONObjectProtectorUtils.getInt(jSONObject, "download_duration") : -1;
                                try {
                                    i3 = jSONObject.has("file_size") ? JSONObjectProtectorUtils.getInt(jSONObject, "file_size") : -1;
                                    try {
                                        string = jSONObject.has("player_error_msg") ? JSONObjectProtectorUtils.getString(jSONObject, "player_error_msg") : "";
                                        if (jSONObject.has("sub_id")) {
                                            string2 = JSONObjectProtectorUtils.getString(jSONObject, "sub_id");
                                        }
                                        i2 = jSONObject.has("first_pts") ? JSONObjectProtectorUtils.getInt(jSONObject, "first_pts") : -1;
                                        try {
                                            if (jSONObject.has("cache_size")) {
                                                i8 = JSONObjectProtectorUtils.getInt(jSONObject, "cache_size");
                                            }
                                        } catch (JSONException e) {
                                            e = e;
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    } catch (JSONException e2) {
                                        e = e2;
                                        i2 = -1;
                                    }
                                } catch (JSONException e3) {
                                    e = e3;
                                    i2 = -1;
                                    i3 = -1;
                                }
                            } catch (JSONException e4) {
                                e = e4;
                                i2 = -1;
                                i3 = -1;
                                i4 = -1;
                            }
                        } catch (JSONException e5) {
                            e = e5;
                            i2 = -1;
                            i3 = -1;
                            i4 = -1;
                            i5 = -1;
                        }
                    } catch (JSONException e6) {
                        e = e6;
                        i2 = -1;
                        i3 = -1;
                        i4 = -1;
                        i5 = -1;
                        i6 = 0;
                    }
                    i7 = i8;
                    i8 = i5;
                } else {
                    i7 = -1;
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                    i6 = 0;
                }
                ICLAPerfETServiceImpl iCLAPerfETServiceImpl = this;
                String str3 = str2;
                Integer numValueOf = Integer.valueOf(i6);
                Integer numValueOf2 = Integer.valueOf(i8);
                Integer numValueOf3 = Integer.valueOf(i4);
                Integer numValueOf4 = Integer.valueOf(i3);
                Boolean boolValueOf = null;
                String str4 = z ? "load_fail_due_to_lose_reference" : null;
                Boolean boolValueOf2 = Boolean.valueOf(z2);
                if (z2) {
                    boolValueOf = Boolean.valueOf(i7 > 0);
                }
                iCLAPerfETServiceImpl.LJJIII(str3, string2, anonymousClass1623, 1, i2, numValueOf, numValueOf2, numValueOf3, numValueOf4, string, str4, boolValueOf2, boolValueOf);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ICLAPerfETServiceImpl@5c43.onCaptionLoadEndRaw$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ICLAPerfETServiceImpl@5c43.onCaptionLoadEndRaw$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJII(final String str, final String str2, final AnonymousClass1623 anonymousClass1623, final int i, final Integer num, final Integer num2, final Integer num3, final Integer num4, final String str3, final String str4, final Boolean bool) {
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new Runnable() { // from class: X.0hah
            public final /* synthetic */ int LLILZIL = 0;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ICLAPerfETServiceImpl@5c43.onCaptionLoadEnd$1");
                try {
                    this.LL.LJJIII(str, str2, anonymousClass1623, this.LLILZIL, i, num, num2, num3, num4, str3, str4, bool, null);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ICLAPerfETServiceImpl@5c43.onCaptionLoadEnd$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJIILL(final Aweme aweme, final String str, final String str2, final String str3, final String str4, final EnumC20038913at enumC20038913at, final AnonymousClass1629 anonymousClass1629, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5) {
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new Runnable() { // from class: X.161y
            public final void LIZ() {
                String value;
                String str5;
                CaptionItemModel captionItemModelLIZLLL;
                char c;
                String str6;
                Integer num;
                C00YD c00ydRemove;
                boolean z6;
                String str7;
                CaptionItemModel captionItemModelLIZLLL2;
                String str8;
                C162M c162mLJLJJI;
                EnumC20181313xr enumC20181313xrLJI;
                ICLAPerfETServiceImpl iCLAPerfETServiceImpl = this.LL;
                Aweme aweme2 = aweme;
                String str9 = str;
                String str10 = str2;
                String str11 = str3;
                String str12 = str4;
                EnumC20038913at enumC20038913at2 = enumC20038913at;
                AnonymousClass1629 anonymousClass16292 = anonymousClass1629;
                boolean z7 = z;
                boolean z8 = z3;
                boolean z9 = z4;
                boolean z10 = z2;
                boolean z11 = z5;
                iCLAPerfETServiceImpl.getClass();
                String aid = aweme2.getAid();
                C00I7 c00i7LJJII = iCLAPerfETServiceImpl.LJJII();
                if (Intrinsics.LJFF(aid, c00i7LJJII != null ? c00i7LJJII.LL : null)) {
                    int i = C162E.LIZ[anonymousClass16292.ordinal()];
                    int i2 = (i == 1 || i == 2) ? 1 : 0;
                    String strLJJI = (str9.length() == 0 && enumC20038913at2 == EnumC20038913at.REALTIME) ? iCLAPerfETServiceImpl.LJJI(str11) : str9;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(aid);
                    sbLIZ.append('_');
                    sbLIZ.append(strLJJI);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (Intrinsics.LJFF(iCLAPerfETServiceImpl.LJIIJ, strLIZIZ) && iCLAPerfETServiceImpl.LJIIIZ) {
                        return;
                    }
                    iCLAPerfETServiceImpl.LJIIJ = strLIZIZ;
                    int i3 = !Intrinsics.LJFF(str12, str11) ? 1 : 0;
                    if (C294250Bg7.LIZ() == 0 || !C0SKG.LIZ.enableEtPrefetchStatus) {
                        value = null;
                    } else {
                        C00I7 c00i7LJJII2 = iCLAPerfETServiceImpl.LJJII();
                        if (c00i7LJJII2 == null || (str8 = c00i7LJJII2.LLILZ) == null || (c162mLJLJJI = C161N.LIZIZ.LJLJJI(EnumC634640Ous.FEED, str8)) == null || (enumC20181313xrLJI = c162mLJLJJI.LJI(aid)) == null || (value = enumC20181313xrLJI.getValue()) == null) {
                            value = "not_started";
                        }
                    }
                    C00I7 c00i7LJJII3 = iCLAPerfETServiceImpl.LJJII();
                    String value2 = enumC20038913at2.getValue();
                    String value3 = anonymousClass16292.getValue();
                    Integer numValueOf = Integer.valueOf(z7 ? 1 : 0);
                    Integer numValueOf2 = Integer.valueOf(i3);
                    Integer numValueOf3 = Integer.valueOf(z9 ? 1 : 0);
                    Long lLJIILLIIL = C20703515zt.LJIILLIIL(aweme2);
                    String value4 = enumC20038913at2.getValue();
                    if (i3 == 0) {
                        CaptionItemModel captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme2);
                        str5 = captionItemModelLJIIIIZZ != null ? captionItemModelLJIIIIZZ.sourceTag : null;
                    } else {
                        str5 = (Intrinsics.LJFF(value4, "realtime") || (captionItemModelLIZLLL = C20702515zj.LIZLLL(aweme2)) == null) ? null : captionItemModelLIZLLL.sourceTag;
                    }
                    CaptionItemModel captionItemModelLJIIIIZZ2 = C20703515zt.LJIIIIZZ(aweme2);
                    C016C c016c = new C016C(str9, str10, str11, str12, value2, value3, i2, numValueOf, numValueOf2, numValueOf3, lLJIILLIIL, str5, captionItemModelLJIIIIZZ2 != null ? captionItemModelLJIIIIZZ2.sourceTag : null, Integer.valueOf(z11 ? 1 : 0));
                    boolean zLJFF = Intrinsics.LJFF(iCLAPerfETServiceImpl.LJIIJJI, aid);
                    C162G c162g = iCLAPerfETServiceImpl.LJJIFFI;
                    C207093161z c207093161z = new C207093161z(c00i7LJJII3, c016c, zLJFF, c162g, z8, value, (i3 == 0 || Intrinsics.LJFF(enumC20038913at2.getValue(), "realtime") || (captionItemModelLIZLLL2 = C20702515zj.LIZLLL(aweme2)) == null) ? null : captionItemModelLIZLLL2.variant);
                    if (aid.length() > 0) {
                        if (!iCLAPerfETServiceImpl.LJIILL.containsKey(aid)) {
                            iCLAPerfETServiceImpl.LJIILL.put(aid, new AnonymousClass1621(aid));
                        }
                        c207093161z.LJIIL = iCLAPerfETServiceImpl.LJIILL.get(aid);
                    }
                    iCLAPerfETServiceImpl.LJFF = false;
                    if (z10) {
                        c = '_';
                    } else {
                        LinkedHashMap<String, C162F> linkedHashMap = iCLAPerfETServiceImpl.LJIJI;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(aid);
                        c = '_';
                        sbLIZ2.append('_');
                        sbLIZ2.append(str9);
                        if (!linkedHashMap.containsKey(C2188811AlT.LIZIZ(sbLIZ2))) {
                            iCLAPerfETServiceImpl.LJIJJ.put(strLIZIZ, c207093161z);
                            return;
                        }
                    }
                    iCLAPerfETServiceImpl.LJIILLIIL.put(strLIZIZ, c207093161z);
                    if (C0BKU.LIZIZ() && (str7 = iCLAPerfETServiceImpl.LJIJ.get(aid)) != null && (!Intrinsics.LJFF(str7, "foreign_original_hidden") || !Intrinsics.LJFF(value2, EnumC20038913at.REALTIME.getValue()))) {
                        c207093161z.LJIIJJI = str7;
                    }
                    c207093161z.LJIIJ = true;
                    long jLongValue = ((Number) c162g.invoke()).longValue();
                    c207093161z.LJIIIZ = Long.valueOf(jLongValue);
                    if (zLJFF) {
                        c207093161z.LJIIIIZZ = Long.valueOf(jLongValue);
                    }
                    C207069161b.LJ(ClaPerfCaptionLoadStartEvent.class, c207093161z.LJIILL, new AnonymousClass0174(), null, 24);
                    C01GW<AbstractC1604130rqV> c01gw = C207128163i.LJ;
                    if (c00i7LJJII3 == null || (str6 = c00i7LJJII3.LL) == null) {
                        str6 = "";
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onLoadStart, awemeId: ");
                    sbLIZ3.append(c00i7LJJII3 != null ? c00i7LJJII3.LL : null);
                    sbLIZ3.append(", commonParams: ");
                    sbLIZ3.append(c00i7LJJII3);
                    sbLIZ3.append(", startParams: ");
                    sbLIZ3.append(c016c);
                    C0SZC.LIZJ(str6, "caption_load_start", C2188811AlT.LIZIZ(sbLIZ3));
                    if (C295300Bho.LIZ() && (c00ydRemove = iCLAPerfETServiceImpl.LJIIZILJ.remove(aid)) != null && SystemClock.elapsedRealtime() - c00ydRemove.LIZ <= Mp4ScreenVideoLoadTimeout.CONTROL) {
                        if (iCLAPerfETServiceImpl.LJ.compareAndSet(false, true)) {
                            z6 = true;
                        } else {
                            z6 = false;
                            if (0 == 0) {
                            }
                        }
                        c207093161z.LIZJ(c00ydRemove.LIZ, null, c00ydRemove.LIZIZ, z6);
                    }
                    C162F c162fRemove = iCLAPerfETServiceImpl.LJIJI.remove(aid + c + str9);
                    if (c162fRemove != null) {
                        Long l = c162fRemove.LIZJ;
                        c207093161z.LIZLLL(ICLAPerfETServiceImpl.LJJIIJZLJL(c162fRemove, aid, value3, Long.valueOf(l != null ? l.longValue() : 0L)));
                        C016B c016b = c207093161z.LJIILJJIL;
                        if (c016b != null && (num = c016b.LLJILJIL) != null && num.equals(0)) {
                            iCLAPerfETServiceImpl.LJI = c207093161z;
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("onCaptionLoadStart: trigger pending load end; subid: ");
                        sbLIZ4.append(str9);
                        C2188811AlT.LIZIZ(sbLIZ4);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ICLAPerfETServiceImpl@5c43.onCaptionLoadStart$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ICLAPerfETServiceImpl@5c43.onCaptionLoadStart$1");
            }
        });
    }

    public final void LJJIII(String str, String str2, AnonymousClass1623 anonymousClass1623, int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, String str3, String str4, Boolean bool, Boolean bool2) {
        boolean z;
        Integer num5;
        Object objLJJJLIIL;
        String str5 = str4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C207093161z c207093161z = this.LJIILLIIL.get(strLIZIZ);
        if (c207093161z == null) {
            c207093161z = this.LJIJJ.get(strLIZIZ);
        }
        C016B c016b = new C016B(anonymousClass1623.getValue(), i, num, num2, num3, num4, str3, Integer.valueOf(i2), str5, 63744);
        if ((!this.LJIJI.isEmpty()) && this.LJIJI.size() >= 10 && (objLJJJLIIL = C13LP.LJJJLIIL(this.LJIJI.keySet())) != null) {
            this.LJIJI.remove(objLJJJLIIL);
        }
        Integer numValueOf = null;
        C162F c162f = new C162F(c016b, bool, null, bool2, 4);
        if (c207093161z == null) {
            this.LJIJI.put(strLIZIZ, LJJIIZ(c162f, str, null));
            return;
        }
        c207093161z.LIZLLL(LJJIIJZLJL(c162f, str, c207093161z.LIZIZ.LLILZLL, null));
        C016B c016b2 = c207093161z.LJIILJJIL;
        if (c016b2 != null && (num5 = c016b2.LLJILJIL) != null && num5.equals(0)) {
            this.LJI = c207093161z;
        }
        if (C0BKU.LIZJ() && str5 == null) {
            str5 = (!(a0.LJJJIL(str3) ^ true) || str3 == null) ? null : "player_load_error";
        }
        if (anonymousClass1623 == AnonymousClass1623.RT_TRANSLATION_UNSUPPORTED_LANGUAGE) {
            z = true;
        } else {
            z = false;
        }
        if ((anonymousClass1623 != AnonymousClass1623.FAILURE && !z) || !C277370Atz.LIZ() || !this.LJ.compareAndSet(false, true)) {
            return;
        }
        if (str5 == null) {
            str5 = "unknown";
        }
        if (z) {
            numValueOf = Integer.valueOf(anonymousClass1623.getValue());
        }
        c207093161z.LIZJ(SystemClock.elapsedRealtime(), numValueOf, str5, true);
    }
}
