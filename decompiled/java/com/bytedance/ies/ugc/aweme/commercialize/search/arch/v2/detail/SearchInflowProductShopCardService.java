package com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.detail;

import X.C01GW;
import X.C04TD;
import X.C1009980cOC;
import X.C1010120cOQ;
import X.C1017180cZo;
import X.C1227904rF;
import X.C1697810uHb;
import X.C1AF0;
import X.C2188811AlT;
import X.C2510609se;
import X.C443120HZe;
import X.C452501pT;
import X.C587350N1x;
import X.InterfaceC1023400cjq;
import X.InterfaceC1483820oiS;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.item.ISearchInflowProductShopCardService;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.player.AudioPlayerController;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.search.SearchInflowMultiAdCardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS101S0201000_16;
import kotlin.jvm.internal.AwS50S0100100_16;
import kotlin.jvm.internal.AwS9S0101100_16;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchInflowProductShopCardService implements ISearchInflowProductShopCardService {
    public static final /* synthetic */ int LJI = 0;
    public long LIZIZ;
    public Aweme LIZLLL;
    public List<? extends Aweme> LJ;
    public String LIZ = "";
    public final C1227904rF LIZJ = C1227904rF.LIZ;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(35));

    public static ISearchInflowProductShopCardService LJII() {
        Object objLIZ = C04TD.LIZ(ISearchInflowProductShopCardService.class, false);
        if (objLIZ != null) {
            return (ISearchInflowProductShopCardService) objLIZ;
        }
        if (C04TD.LJJIIZ == null) {
            synchronized (ISearchInflowProductShopCardService.class) {
                if (C04TD.LJJIIZ == null) {
                    C04TD.LJJIIZ = new SearchInflowProductShopCardService();
                }
            }
        }
        return C04TD.LJJIIZ;
    }

    public final AudioPlayerController LJIIIIZZ() {
        return (AudioPlayerController) this.LJFF.getValue();
    }

    public final void LJIIIZ() {
        AwemeRawAd awemeRawAd;
        if (LJI(this.LIZLLL, this.LIZ)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
            Aweme aweme = this.LIZLLL;
            int i = 0;
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && C1017180cZo.LJIJJLI(awemeRawAd)) {
                SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger();
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LIZLLL.getValue(), new AwS50S0100100_16(this, jCurrentTimeMillis, 11));
                return;
            }
            List<? extends Aweme> list = this.LJ;
            if (list != null) {
                for (Aweme aweme2 : list) {
                    int i2 = i + 1;
                    Long creativeId = null;
                    if (i < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    Aweme aweme3 = aweme2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("logMultiAdShowOver aid: ");
                    sbLIZ.append(aweme3.getAid());
                    sbLIZ.append(", cid: ");
                    AwemeRawAd awemeRawAd2 = aweme3.getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        creativeId = awemeRawAd2.getCreativeId();
                    }
                    sbLIZ.append(creativeId);
                    C2188811AlT.LIZIZ(sbLIZ);
                    int i3 = C2510609se.LIZ;
                    SearchAdEventLogger searchAdEventLogger2 = new SearchAdEventLogger();
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger2.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LJ.getValue(), new AwS9S0101100_16(i, jCurrentTimeMillis, aweme3, 6));
                    i = i2;
                }
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.item.ISearchInflowProductShopCardService
    public final void LJJIII() {
        int i = C2510609se.LIZ;
        LJIIIIZZ().stop();
        LJIIIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.item.ISearchInflowProductShopCardService
    public final void onDestroyView() {
        int i = C2510609se.LIZ;
        LJIIIIZZ().release();
        LJIIIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.item.ISearchInflowProductShopCardService
    public final AudioPlayerController LJFF() {
        return LJIIIIZZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.item.ISearchInflowProductShopCardService
    public final List<Aweme> LJ() {
        return this.LJ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.item.ISearchInflowProductShopCardService
    public final void LIZ(String str) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewHolderSelected, aid: ");
        Aweme aweme = this.LIZLLL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        if (str == null) {
            str = "";
        }
        this.LIZ = str;
        LJIIIIZZ().play(this.LIZLLL);
        this.LIZIZ = System.currentTimeMillis();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.item.ISearchInflowProductShopCardService
    public final void LIZIZ(AwemeRawAd awemeRawAd) {
        List<? extends Aweme> list = this.LJ;
        if (list != null) {
            int i = 0;
            for (Aweme aweme : list) {
                int i2 = i + 1;
                Long creativeId = null;
                if (i >= 0) {
                    Aweme aweme2 = aweme;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("logMultiAdShowEvent aid: ");
                    sbLIZ.append(aweme2.getAid());
                    sbLIZ.append(", cid: ");
                    AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        creativeId = awemeRawAd2.getCreativeId();
                    }
                    sbLIZ.append(creativeId);
                    C2188811AlT.LIZIZ(sbLIZ);
                    int i3 = C2510609se.LIZ;
                    SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger();
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LJFF.getValue(), new AwS101S0201000_16(i, aweme2, awemeRawAd, 1));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.item.ISearchInflowProductShopCardService
    public final Aweme LIZJ(SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String aid;
        Map<String, AnoleComponentModel> map;
        LinkedHashMap linkedHashMap;
        List<? extends Map<?, ?>> list;
        Aweme aweme;
        List<? extends Map<?, ?>> list2;
        Video video = null;
        if (searchInflowMultiAdCardStruct != null && (list2 = searchInflowMultiAdCardStruct.awemeListRaw) != null) {
            try {
                arrayList = new ArrayList();
                for (Map<?, ?> map2 : list2) {
                    this.LIZJ.getClass();
                    arrayList.add((Aweme) C1227904rF.LIZIZ(C1227904rF.LJI(map2), Aweme.class));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                arrayList = null;
            }
        } else {
            arrayList = null;
        }
        this.LJ = arrayList;
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String strLIZ = C587350N1x.LIZ((Aweme) it2.next());
                if (strLIZ != null) {
                    arrayList2.add(strLIZ);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (searchInflowMultiAdCardStruct != null && (str = searchInflowMultiAdCardStruct.awemeRawAd) != null) {
            try {
                this.LIZJ.getClass();
                AwemeRawAd awemeRawAd = (AwemeRawAd) C1227904rF.LIZIZ(str, AwemeRawAd.class);
                if (awemeRawAd != null) {
                    Aweme aweme2 = new Aweme();
                    List<? extends Aweme> list3 = this.LJ;
                    if (list3 != null && (aweme = (Aweme) ListProtector.get(list3, 0)) != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    aweme2.setAid(aid);
                    aweme2.setAd(true);
                    aweme2.setAwemeType(104);
                    aweme2.setAwemeRawAd(awemeRawAd);
                    AnoleModel anoleModel = awemeRawAd.getAnoleModel();
                    if (anoleModel != null && (map = anoleModel.components) != null) {
                        Iterator<Map.Entry<String, AnoleComponentModel>> it3 = map.entrySet().iterator();
                        while (it3.hasNext()) {
                            AnoleComponentModel value = it3.next().getValue();
                            Map<String, ? extends Object> map3 = value.data;
                            if (map3 != null) {
                                linkedHashMap = new LinkedHashMap(map3);
                            } else {
                                linkedHashMap = null;
                            }
                            if (searchInflowMultiAdCardStruct != null && (list = searchInflowMultiAdCardStruct.awemeListRaw) != null && linkedHashMap != null) {
                                linkedHashMap.put("aweme_list", list);
                            }
                            value.setData(linkedHashMap);
                        }
                    }
                    if (searchInflowMultiAdCardStruct != null) {
                        video = searchInflowMultiAdCardStruct.video;
                    }
                    aweme2.setVideo(video);
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        C1227904rF.LIZ.getClass();
                        String strLJI = C1227904rF.LJI(arrayList2);
                        if (strLJI == null) {
                            strLJI = "";
                        }
                        AwemeExtKt.appendExtraParamUseInSearch(aweme2, "search_inflow_aweme_cid_list", strLJI);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("buildAwemeForSearchInflowMultiAd aid: ");
                    sbLIZ.append(aweme2.getAid());
                    C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2510609se.LIZ;
                    return aweme2;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJ(e2);
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.item.ISearchInflowProductShopCardService
    public final void LIZLLL(Aweme aweme, InterfaceC1483820oiS interfaceC1483820oiS) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind, aid: ");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        this.LIZLLL = aweme;
        LJIIIIZZ().attach(interfaceC1483820oiS);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.item.ISearchInflowProductShopCardService
    public final boolean LJI(Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        if (str == null) {
            str = this.LIZ;
        }
        if (!C1010120cOQ.LJIJI(aweme) || aweme.getAwemeType() != 104 || !TextUtils.equals(str, "general_search") || (awemeRawAd = aweme.getAwemeRawAd()) == null || !C1017180cZo.LJIJI(awemeRawAd)) {
            return false;
        }
        return true;
    }
}
