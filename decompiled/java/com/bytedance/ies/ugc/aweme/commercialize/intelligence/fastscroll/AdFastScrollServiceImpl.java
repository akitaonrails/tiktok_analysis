package com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll;

import X.AnonymousClass1455;
import X.C01GW;
import X.C0CM3;
import X.C0CMJ;
import X.C1017070cZd;
import X.C1022620cia;
import X.C13LP;
import X.C1609880rzm;
import X.C1617880sCg;
import X.C1697810uHb;
import X.C1843590y4j;
import X.C1843610y4l;
import X.C1949507kL;
import X.C2188811AlT;
import X.C2232408os;
import X.C2279751ELd;
import X.C2279761ELe;
import X.C2279771ELf;
import X.C2279781ELg;
import X.C2279791ELh;
import X.C2279801ELi;
import X.C2279811ELj;
import X.C2279821ELk;
import X.C2279831ELl;
import X.C2296808zG;
import X.C23250099c;
import X.C2487409ou;
import X.C312240CLu;
import X.C452501pT;
import X.C823050WQl;
import X.C844470XAv;
import X.EnumC1843560y4g;
import X.EnumC1843600y4k;
import X.InterfaceC1609890rzn;
import Y.ARunnableS127S0100000_27;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.model.AdFastScrollConfigParam;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.model.AdFastScrollDataParam;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.model.AdFastScrollInput;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS148S0201000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class AdFastScrollServiceImpl implements IAdFastScrollService {
    public InterfaceC1609890rzn LIZ;
    public final String LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public final C1949507kL LJIIL;
    public int LJIILIIL;
    public Aweme LJIILJJIL;
    public int LJIILL;
    public long LJIILLIIL;

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.IAdFastScrollService
    public final void LIZ() {
        this.LIZ = null;
        this.LJIIL.LIZ.clear();
        this.LJIILLIIL = -1L;
        this.LJIILL = -1;
        this.LJIILIIL = -1;
        this.LJIILJJIL = null;
    }

    public final boolean LJIIIIZZ() {
        return ((Boolean) this.LJII.getValue()).booleanValue();
    }

    public final boolean LJIIIZ() {
        return ((Boolean) this.LJI.getValue()).booleanValue();
    }

    public AdFastScrollServiceImpl() {
        C844470XAv.LIZ.getClass();
        this.LIZIZ = String.valueOf(C844470XAv.LJIIJ);
        this.LIZJ = C452501pT.LIZIZ(new C2279751ELd());
        this.LIZLLL = C452501pT.LIZIZ(new C2279781ELg());
        this.LJ = C452501pT.LIZIZ(new C2279831ELl());
        this.LJFF = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(103));
        this.LJI = C452501pT.LIZIZ(new C2279771ELf());
        this.LJII = C452501pT.LIZIZ(new C2279761ELe());
        this.LJIIIIZZ = C452501pT.LIZIZ(new C2279801ELi());
        this.LJIIIZ = C452501pT.LIZIZ(new C2279811ELj());
        this.LJIIJ = C452501pT.LIZIZ(new C2279821ELk());
        this.LJIIJJI = C452501pT.LIZIZ(new C2279791ELh());
        this.LJIIL = new C1949507kL();
        this.LJIILIIL = -1;
        this.LJIILL = -1;
        this.LJIILLIIL = -1L;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.IAdFastScrollService
    public final boolean LIZIZ() {
        return LJIIIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.IAdFastScrollService
    public final void LIZLLL() {
        if (!LJIIIIZZ()) {
            LJIIL(EnumC1843600y4k.ON_RERANK);
            return;
        }
        C0CM3 c0cm3 = new C0CM3();
        c0cm3.LIZIZ = true;
        c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
        c0cm3.LJI = new AwS571S0100000_27(this, 199);
        C312240CLu.LIZ(c0cm3);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.IAdFastScrollService
    public final void LJFF() {
        if (LJIIIZ()) {
            return;
        }
        LJIIL(EnumC1843600y4k.ON_SELECTED);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.IAdFastScrollService
    public final void LJJIIJ() {
        if (!LJIIIIZZ()) {
            LJIIL(EnumC1843600y4k.ON_LOAD_MORE);
            return;
        }
        C0CM3 c0cm3 = new C0CM3();
        c0cm3.LIZIZ = true;
        c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
        c0cm3.LJI = new AwS571S0100000_27(this, 200);
        C312240CLu.LIZ(c0cm3);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.IAdFastScrollService
    public final void I4(C1609880rzm c1609880rzm) {
        this.LIZ = c1609880rzm;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[bind] featureEnable=");
        sbLIZ.append(((Boolean) this.LIZJ.getValue()).booleanValue());
        sbLIZ.append(", triggerAheadNumber=");
        sbLIZ.append(((Number) this.LJ.getValue()).intValue());
        sbLIZ.append(", labelUploadEnable=");
        sbLIZ.append(((Boolean) this.LIZLLL.getValue()).booleanValue());
        C1022620cia.LIZ("AdFastScrollServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.IAdFastScrollService
    public final EnumC1843560y4g LIZJ(String str) {
        C1949507kL c1949507kL = this.LJIIL;
        c1949507kL.getClass();
        if (str != null && str.length() != 0) {
            EnumC1843560y4g enumC1843560y4g = c1949507kL.LIZ.get(str);
            if (enumC1843560y4g == null) {
                return EnumC1843560y4g.UNKNOWN;
            }
            return enumC1843560y4g;
        }
        return EnumC1843560y4g.UNKNOWN;
    }

    public final void LJIIL(EnumC1843600y4k enumC1843600y4k) {
        InterfaceC1609890rzn interfaceC1609890rzn;
        int iLIZ;
        if (!((Boolean) this.LIZJ.getValue()).booleanValue()) {
            C1022620cia.LIZIZ("AdFastScrollServiceImpl", "[predictIfNeed] feature disabled, return.");
            return;
        }
        AnonymousClass1455.LIZ.getClass();
        if (!AnonymousClass1455.LJII()) {
            C1022620cia.LIZIZ("AdFastScrollServiceImpl", "[predictIfNeed] pitaya not ready, return.");
            return;
        }
        Gson gson = C1617880sCg.LIZ;
        List listLLIIII = C13LP.LLIIII(C1617880sCg.LIZ(this.LIZ));
        if (listLLIIII != null && !listLLIIII.isEmpty() && (interfaceC1609890rzn = this.LIZ) != null && (iLIZ = ((C1609880rzm) interfaceC1609890rzn).LIZ()) >= 0 && iLIZ < listLLIIII.size() - 1) {
            C23250099c.LIZLLL(C2296808zG.LIZ(new C2232408os(C823050WQl.LJFF())), null, null, new C1843590y4j(this, listLLIIII, iLIZ, enumC1843600y4k, null), 3);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.IAdFastScrollService
    public final void H4(int i, Aweme aweme) {
        if (LJIIIZ()) {
            if (LJIIIIZZ()) {
                C0CM3 c0cm3 = new C0CM3();
                c0cm3.LIZIZ = true;
                c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
                c0cm3.LJI = new AwS148S0201000_27(this, i, aweme, 0);
                C312240CLu.LIZ(c0cm3);
                return;
            }
            LJIIJ(i, aweme);
            return;
        }
        LJIIL(EnumC1843600y4k.ON_SELECTED);
    }

    public final JSONObject LJI(ArrayList<Aweme> arrayList, boolean z) {
        Long creativeId;
        String type;
        Integer num;
        Integer num2;
        Double d;
        Double d2;
        Double d3;
        Double d4;
        Long l;
        Integer numValueOf;
        Long l2;
        FeatureCenterModel feature;
        FeatureCenterModel feature2;
        FeatureCenterModel feature3;
        FeatureCenterModel feature4;
        FeatureCenterModel feature5;
        FeatureCenterModel feature6;
        AdFastScrollInput adFastScrollInput = new AdFastScrollInput(new ArrayList(), null);
        boolean z2 = true;
        int i = 0;
        for (Aweme aweme : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                Aweme aweme2 = aweme;
                String aid = aweme2.getAid();
                if (aid != null && !a0.LJJJIL(aid)) {
                    AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme2);
                    if (awemeRawAdLJJIJLIJ != null) {
                        creativeId = awemeRawAdLJJIJLIJ.getCreativeId();
                    } else {
                        creativeId = null;
                    }
                    String strValueOf = String.valueOf(creativeId);
                    AwemeRawAd awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme2);
                    if (awemeRawAdLJJIJLIJ2 == null || (type = awemeRawAdLJJIJLIJ2.getType()) == null) {
                        type = null;
                    }
                    if (!C1017070cZd.LL(aweme2)) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    AwemeRawAd awemeRawAdLJJIJLIJ3 = C1017070cZd.LJJIJLIJ(aweme2);
                    if (awemeRawAdLJJIJLIJ3 != null && awemeRawAdLJJIJLIJ3.getSystemOrigin() == 51) {
                        num2 = 1;
                    } else {
                        num2 = null;
                    }
                    AwemeRawAd awemeRawAdLJJIJLIJ4 = C1017070cZd.LJJIJLIJ(aweme2);
                    if (awemeRawAdLJJIJLIJ4 == null || (feature6 = awemeRawAdLJJIJLIJ4.getFeature()) == null || (d = feature6.ctr) == null) {
                        d = null;
                    }
                    AwemeRawAd awemeRawAdLJJIJLIJ5 = C1017070cZd.LJJIJLIJ(aweme2);
                    if (awemeRawAdLJJIJLIJ5 == null || (feature5 = awemeRawAdLJJIJLIJ5.getFeature()) == null || (d2 = feature5.pctr) == null) {
                        d2 = null;
                    }
                    AwemeRawAd awemeRawAdLJJIJLIJ6 = C1017070cZd.LJJIJLIJ(aweme2);
                    if (awemeRawAdLJJIJLIJ6 == null || (feature4 = awemeRawAdLJJIJLIJ6.getFeature()) == null || (d3 = feature4.cvr) == null) {
                        d3 = null;
                    }
                    AwemeRawAd awemeRawAdLJJIJLIJ7 = C1017070cZd.LJJIJLIJ(aweme2);
                    if (awemeRawAdLJJIJLIJ7 == null || (feature3 = awemeRawAdLJJIJLIJ7.getFeature()) == null || (d4 = feature3.pcvr) == null) {
                        d4 = null;
                    }
                    AwemeRawAd awemeRawAdLJJIJLIJ8 = C1017070cZd.LJJIJLIJ(aweme2);
                    if (awemeRawAdLJJIJLIJ8 == null || (feature2 = awemeRawAdLJJIJLIJ8.getFeature()) == null || (l = feature2.ecpm) == null) {
                        l = null;
                    }
                    Video video = aweme2.getVideo();
                    if (video != null) {
                        numValueOf = Integer.valueOf(video.getVideoLength());
                    } else {
                        numValueOf = null;
                    }
                    AwemeRawAd awemeRawAdLJJIJLIJ9 = C1017070cZd.LJJIJLIJ(aweme2);
                    if (awemeRawAdLJJIJLIJ9 == null || (feature = awemeRawAdLJJIJLIJ9.getFeature()) == null || (l2 = feature.pricingType) == null) {
                        l2 = null;
                    }
                    AdFastScrollDataParam adFastScrollDataParam = new AdFastScrollDataParam(aid, strValueOf, type, num, num2, null, d, d2, d3, d4, l, numValueOf, l2, null, null, null, null, null, null, null, null, null);
                    ArrayList<AdFastScrollDataParam> datas = adFastScrollInput.getDatas();
                    if (datas != null) {
                        datas.add(adFastScrollDataParam);
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[constructParams] skip aweme with blank aid, index=");
                    sbLIZ.append(i);
                    C1022620cia.LIZIZ("AdFastScrollServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (!z || !((Boolean) this.LIZLLL.getValue()).booleanValue()) {
            z2 = false;
        }
        adFastScrollInput.setConfig(new AdFastScrollConfigParam(z2));
        return new JSONObject(GsonProtectorUtils.toJson(C1617880sCg.LIZ, adFastScrollInput));
    }

    public final void LJIIJ(int i, Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        int i2;
        if (i == 0) {
            LJIIJJI(aweme, i, false);
        }
        if (this.LJIILIIL == i || aweme == null) {
            return;
        }
        if (!LJIIIIZZ() && (i2 = this.LJIILIIL) >= 0 && i2 > this.LJIILL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[onViewHolderSelectedV2] fast slide, manual called, position=");
            sbLIZ.append(this.LJIILIIL);
            C1022620cia.LIZ("AdFastScrollServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            LJ(this.LJIILJJIL, this.LJIILIIL, true);
        }
        this.LJIILIIL = i;
        this.LJIILJJIL = aweme;
        if (aweme.isAd() && C1017070cZd.LJJIJLIJ(aweme) != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null) {
            this.LJIILLIIL = awemeRawAdLJJIJLIJ.getCreativeId().longValue();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.IAdFastScrollService
    public final void LJ(Aweme aweme, int i, boolean z) {
        if (LJIIIIZZ()) {
            C0CM3 c0cm3 = new C0CM3();
            c0cm3.LIZIZ = true;
            c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
            c0cm3.LJI = new C1843610y4l(this, i, aweme, z);
            C312240CLu.LIZ(c0cm3);
            return;
        }
        LJIIJJI(aweme, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJII(java.util.LinkedHashMap<java.lang.Integer, com.ss.android.ugc.aweme.feed.model.Aweme> r51, int r52, boolean r53) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.AdFastScrollServiceImpl.LJII(java.util.LinkedHashMap, int, boolean):org.json.JSONObject");
    }

    public final void LJIIJJI(Aweme aweme, int i, boolean z) {
        long jLongValue;
        if (!LJIIIZ()) {
            return;
        }
        AnonymousClass1455.LIZ.getClass();
        if (!AnonymousClass1455.LJII()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[onViewHolderSelectedV2Internal] pitaya not ready, return. position=");
            sbLIZ.append(i);
            C1022620cia.LIZIZ("AdFastScrollServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (this.LJIILL == i || aweme == null) {
            return;
        }
        this.LJIILL = i;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[onViewHolderSelectedV2] position=");
        sbLIZ2.append(i);
        sbLIZ2.append(", aid=");
        sbLIZ2.append(aweme.getAid());
        sbLIZ2.append(", hasPlayStarted=");
        sbLIZ2.append(z);
        C1022620cia.LIZ("AdFastScrollServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = new ARunnableS127S0100000_27(this, 14);
        if (z) {
            jLongValue = ((Number) this.LJIIIZ.getValue()).longValue();
        } else {
            jLongValue = ((Number) this.LJIIIIZZ.getValue()).longValue();
        }
        C2487409ou.LIZLLL(jLongValue, aRunnableS127S0100000_27);
    }
}
