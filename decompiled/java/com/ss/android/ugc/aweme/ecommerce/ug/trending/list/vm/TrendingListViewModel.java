package com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm;

import X.C01GW;
import X.C051M;
import X.C098200Yq;
import X.C09YA;
import X.C0IR0;
import X.C0IS1;
import X.C1309620kBU;
import X.C1484770ojz;
import X.C1484920okE;
import X.C15438062q;
import X.C1742590vRp;
import X.C1742800vSA;
import X.C1742820vSC;
import X.C1742870vSH;
import X.C1742890vSJ;
import X.C1742910vSL;
import X.C1742930vSN;
import X.C189200o6;
import X.C1AF0;
import X.C2126308Ur;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C626080Oh4;
import X.EnumC1742610vRr;
import X.InterfaceC0148002o;
import X.InterfaceC1479620obg;
import X.InterfaceC1484830ok5;
import X.InterfaceC1742900vSK;
import X.InterfaceC676420Qg4;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.FeedExtra;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.Live;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.Video;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.WesternProduct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class TrendingListViewModel extends AssemViewModel<C1742800vSA> {
    public C1742820vSC LL;
    public final C1742590vRp LLILLJJLI = new C1742590vRp();
    public final C09YA LLILLL = new C09YA(this, AFwS215S0000000_26.get$arr$(184));
    public final MutableLiveData<Integer> LLILZ = new MutableLiveData<>(0);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS567S0100000_23(this, 95));
    public PageFinder LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1742800vSA(C626080Oh4.LIZIZ, 991);
    }

    public final InterfaceC1484830ok5 wQ2() {
        return (InterfaceC1484830ok5) this.LLILZIL.getValue();
    }

    public final void vQ2() {
        EnumC1742610vRr enumC1742610vRr = getState().LLIZ;
        EnumC1742610vRr enumC1742610vRr2 = EnumC1742610vRr.REFRESH;
        if (enumC1742610vRr == enumC1742610vRr2) {
            return;
        }
        AQ2(enumC1742610vRr2);
        C23250099c.LIZLLL(getAssemVMScope(), C2126308Ur.LIZIZ, null, new C1742930vSN(this, null), 2);
    }

    public final void AQ2(EnumC1742610vRr enumC1742610vRr) {
        if (getState().LLIZ == enumC1742610vRr) {
            return;
        }
        setState(new AwS605S0100000_26(enumC1742610vRr, 296));
    }

    public final void yQ2(List<? extends C1742910vSL> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (C1742910vSL c1742910vSL : list) {
                if (c1742910vSL instanceof C1742870vSH) {
                    arrayList2.add(c1742910vSL);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Aweme aweme = ((C1742870vSH) it2.next()).LLILLJJLI;
                if (aweme != null) {
                    arrayList.add(aweme);
                }
            }
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<InterfaceC1479620obg>> concurrentHashMap = C1484920okE.LIZIZ;
        CopyOnWriteArrayList<InterfaceC1479620obg> copyOnWriteArrayList = concurrentHashMap.get("trending_page_list");
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            CopyOnWriteArrayList<InterfaceC1479620obg> copyOnWriteArrayListPutIfAbsent = concurrentHashMap.putIfAbsent("trending_page_list", copyOnWriteArrayList);
            if (copyOnWriteArrayListPutIfAbsent != null) {
                copyOnWriteArrayList = copyOnWriteArrayListPutIfAbsent;
            }
        }
        CopyOnWriteArrayList<InterfaceC1479620obg> copyOnWriteArrayList2 = copyOnWriteArrayList;
        C0IS1<C0IR0> c0is1 = C1484920okE.LIZ.get("trending_page_list");
        if (c0is1 != null) {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(C1484770ojz.LIZ((Aweme) it3.next(), C626080Oh4.LIZIZ, this));
            }
            copyOnWriteArrayList2.addAll(arrayList3);
            ((InterfaceC676420Qg4) c0is1.LIZLLL()).LJIIIIZZ("trending_page_list", arrayList3);
        }
    }

    public static void BQ2(String str, List list) {
        int i;
        int i2 = 1;
        for (C1742910vSL c1742910vSL : (ArrayList) list) {
            if (c1742910vSL instanceof C1742870vSH) {
                C1742870vSH c1742870vSH = (C1742870vSH) c1742910vSL;
                Map<String, Object> map = c1742870vSH.LLILZIL;
                if (map != null) {
                    map.put("item_order", Integer.valueOf(i2));
                }
                Map<String, Object> map2 = c1742870vSH.LLILZIL;
                if (map2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append('_');
                    i = i2 + 1;
                    sbLIZ.append(i2);
                    map2.put("track_id", C2188811AlT.LIZIZ(sbLIZ));
                    i2 = i;
                }
            } else if (c1742910vSL instanceof C1742890vSJ) {
                C1742890vSJ c1742890vSJ = (C1742890vSJ) c1742910vSL;
                Map<String, Object> map3 = c1742890vSJ.LLIZ;
                if (map3 != null) {
                    map3.put("item_order", Integer.valueOf(i2));
                }
                Map<String, Object> map4 = c1742890vSJ.LLIZ;
                if (map4 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append('_');
                    i = i2 + 1;
                    sbLIZ2.append(i2);
                    map4.put("track_id", C2188811AlT.LIZIZ(sbLIZ2));
                    i2 = i;
                }
            }
        }
    }

    public static C1742910vSL xQ2(Feed feed, String str) {
        Object c098200Yq;
        String str2;
        Live live;
        Object c098200Yq2;
        long jLongValue;
        long jLongValue2;
        Video video;
        Object c098200Yq3;
        try {
            Map map = (Map) C051M.LIZJ(feed.trackParams, new TypeToken<Map<String, ? extends Object>>() { // from class: X.0vSI
            }.getType());
            if (map != null) {
                c098200Yq = new LinkedHashMap(map);
            } else {
                c098200Yq = new LinkedHashMap();
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = new LinkedHashMap();
        }
        Map map2 = (Map) c098200Yq;
        FeedExtra feedExtra = feed.extra;
        String str3 = "";
        if (feedExtra == null || (str2 = feedExtra.recommendInfo) == null) {
            str2 = "";
        }
        map2.put("rec_params", str2);
        map2.put("request_id", str);
        Integer num = feed.type;
        if (num != null && num.intValue() == 3 && (video = feed.video) != null) {
            try {
                c098200Yq3 = (Aweme) C051M.LIZIZ(Aweme.class, video.awemeStruct);
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq3 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                c098200Yq3 = null;
            }
            Aweme aweme = (Aweme) c098200Yq3;
            if (aweme == null) {
                return null;
            }
            String str4 = feed.id;
            if (str4 != null) {
                str3 = str4;
            }
            return new C1742870vSH(str3, aweme, feed.schema, feed.video.productV3, map2);
        }
        Integer num2 = feed.type;
        if (num2 != null && num2.intValue() == 2 && (live = feed.live) != null) {
            try {
                c098200Yq2 = (Aweme) C051M.LIZIZ(Aweme.class, live.awemeStruct);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq2 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            Aweme aweme2 = (Aweme) c098200Yq2;
            if (aweme2 == null) {
                return null;
            }
            String str5 = feed.id;
            if (str5 != null) {
                str3 = str5;
            }
            Live live2 = feed.live;
            List<WesternProduct> list = live2.productV3;
            String str6 = feed.schema;
            Long l = live2.number;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Long l2 = feed.live.likeCount;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = 0;
            }
            return new C1742890vSJ(str3, aweme2, str6, jLongValue, jLongValue2, list, map2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Un support type ");
        sbLIZ.append(feed.type);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("trending list un support type ");
        sbLIZ2.append(feed.type);
        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        return null;
    }

    public final void zQ2(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1309620kBU.LIZ("expose");
        ((InterfaceC1742900vSK) this.LLILLL.getValue().getOperator()).LLLLLZ(new Feed(str, Integer.valueOf(i), null, null, "", null, null));
    }
}
