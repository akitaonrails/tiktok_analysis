package com.ss.android.ugc.aweme.multi.maker;

import X.AbstractC1066890drz;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C1024380clQ;
import X.C1052170dUF;
import X.C1052180dUG;
import X.C1052220dUK;
import X.C1065100dp6;
import X.C1120604Zw;
import X.C1121904a9;
import X.C13BV;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C13LP;
import X.C1400390mXt;
import X.C14EU;
import X.C1554610qYd;
import X.C1687430u0r;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2371409Qy;
import X.C452501pT;
import X.C585740MyC;
import X.C703302op;
import X.C712520RxC;
import X.C844470XAv;
import X.EnumC1050190dR3;
import X.InterfaceC1050330dRH;
import X.InterfaceC1392640mLO;
import X.InterfaceC1393560mMs;
import X.InterfaceC665370Q7z;
import X.InterfaceC705550Rlx;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.feed.flexible.preload.FlexibleSparkPreloadProtocol;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes17.dex */
public class CommonAnchorMaker extends AbstractC1066890drz implements FlexibleSparkPreloadProtocol {
    public C2344009Gk LLJ;
    public boolean LLJI;
    public final boolean LLJIJIL = true;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C1052170dUF());
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C1052220dUK());

    public Map<String, String> LJJIJIIJIL() {
        return null;
    }

    @Override // X.AbstractC1066890drz
    public C1400390mXt LJIILL() {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (!Intrinsics.LJFF(anchorCommonStruct != null ? anchorCommonStruct.getComponentKey() : null, "anchor_live_highlight_fragment")) {
            return null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("fragment_id", ((C1065100dp6) LJJJJJL()).LJIIIIZZ("fragment_id"));
        c2344009Gk.LJIIIIZZ("fragment_type", ((C1065100dp6) LJJJJJL()).LJIIIIZZ("fragment_type"));
        return new C1400390mXt(null, null, null, null, new AwS547S0100000_3(c2344009Gk.LIZ, (Map<String, String>) 103), 15);
    }

    @Override // X.AbstractC1066890drz
    public final boolean LJIL() {
        Set set = (Set) this.LLJILJIL.getValue();
        return !C13LP.LJJJJ(this.LLIZ != null ? Integer.valueOf(r0.getType()) : null, set);
    }

    public final List<String> LJJIJIIJI() {
        List<String> list;
        Type type;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        String extra = anchorCommonStruct != null ? anchorCommonStruct.getExtra() : null;
        if (extra == null || extra.length() == 0) {
            return null;
        }
        p pVar = new p();
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        k kVar = GsonProtectorUtils.parse(pVar, anchorCommonStruct2 != null ? anchorCommonStruct2.getExtra() : null);
        if (!(kVar instanceof n)) {
            return null;
        }
        k kVarLJJIIZ = kVar.LJIILIIL().LJJIIZ("gecko_channel");
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                C13JX c13jx = KTypeProjection.LIZJ;
                C13JW c13jwLJII = C13LE.LJII(String.class);
                c13jx.getClass();
                type = C2371409Qy.LIZJ(C13LE.LJFF(List.class, C13JX.LIZ(c13jwLJII)));
            } else {
                type = new TypeToken<List<? extends String>>() { // from class: X.0dUH
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, kVarLJJIIZ, type);
            if (!(objFromJson instanceof List)) {
                objFromJson = null;
            }
            list = (List) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    public final boolean LJJIJIL() {
        List<String> listLJJIJIIJI;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        Object obj = null;
        String extra = anchorCommonStruct != null ? anchorCommonStruct.getExtra() : null;
        if (extra == null || extra.length() == 0) {
            return false;
        }
        p pVar = new p();
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        k kVar = GsonProtectorUtils.parse(pVar, anchorCommonStruct2 != null ? anchorCommonStruct2.getExtra() : null);
        if (!(kVar instanceof n)) {
            return false;
        }
        k kVarLJJIIZ = kVar.LJIILIIL().LJJIIZ("is_schema_lynx");
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, kVarLJJIIZ, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<Boolean>() { // from class: X.0dUJ
            }.getType() : C2371409Qy.LIZJ(C13LE.LJ(Boolean.class)));
            if (!(objFromJson instanceof Boolean)) {
                objFromJson = null;
            }
            obj = objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return (!Intrinsics.LJFF(obj, Boolean.TRUE) || (listLJJIJIIJI = LJJIJIIJI()) == null || listLJJIJIIJI.isEmpty()) ? false : true;
    }

    @Override // X.InterfaceC1393560mMs
    public InterfaceC1393560mMs clone() {
        return new CommonAnchorMaker();
    }

    @Override // com.ss.android.ugc.aweme.feed.flexible.preload.FlexibleSparkPreloadProtocol
    public final List<String> e51() {
        String schema;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        return (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null) ? C13BV.INSTANCE : C1697810uHb.LJIILJJIL(schema);
    }

    @Override // com.ss.android.ugc.aweme.feed.flexible.preload.FlexibleSparkPreloadProtocol
    public final String o7() {
        String componentKey;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        return (anchorCommonStruct == null || (componentKey = anchorCommonStruct.getComponentKey()) == null) ? "" : componentKey;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public int type() {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        return anchorCommonStruct != null ? anchorCommonStruct.getType() : super.type();
    }

    public final void LJJIJL() {
        try {
            if (LJJIJIL()) {
                ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).G0();
                List<String> listLJJIJIIJI = LJJIJIIJI();
                C1024380clQ.LJIILJJIL(null, listLJJIJIIJI != null ? C1687430u0r.LIZ(listLJJIJIIJI) : null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        Type type;
        WikipediaExtra wikipediaExtra;
        Integer status;
        ArrayList arrayList = new ArrayList();
        String string = "";
        boolean z = false;
        String warningMsg = "";
        for (AnchorCommonStruct anchorCommonStruct : list) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            String extra = anchorCommonStruct2.getExtra();
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(WikipediaExtra.class));
                } else {
                    type = new TypeToken<WikipediaExtra>() { // from class: X.0dUI
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, extra, type);
                if (!(objFromJson instanceof WikipediaExtra)) {
                    objFromJson = null;
                }
                wikipediaExtra = (WikipediaExtra) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (wikipediaExtra == null) {
                if (C703302op.LIZ(anchorCommonStruct2.getSchema()) && C703302op.LIZ(anchorCommonStruct2.getKeyword()) && anchorCommonStruct2.getGeneralType() == 1) {
                    arrayList.add(anchorCommonStruct);
                }
            } else {
                Integer status2 = wikipediaExtra.getStatus();
                if (status2 != null && status2.intValue() == 2 && Intrinsics.LJFF(AwemeExtKt.getAuthorUid(LJIIZILJ()), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                    String id = anchorCommonStruct2.getId();
                    Keva keva = (Keva) this.LLJILJILJ.getValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(id);
                    sbLIZ.append('@');
                    sbLIZ.append(LJIIZILJ().getAid());
                    if (!keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                        String id2 = anchorCommonStruct2.getId();
                        Keva keva2 = (Keva) this.LLJILJILJ.getValue();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(id2);
                        sbLIZ2.append('@');
                        sbLIZ2.append(LJIIZILJ().getAid());
                        keva2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
                        warningMsg = wikipediaExtra.getWarningMsg();
                        z = true;
                    }
                }
                if (C703302op.LIZ(anchorCommonStruct2.getSchema()) && C703302op.LIZ(anchorCommonStruct2.getKeyword()) && anchorCommonStruct2.getGeneralType() == 1 && ((status = wikipediaExtra.getStatus()) == null || status.intValue() != 2)) {
                    arrayList.add(anchorCommonStruct);
                }
            }
        }
        if (z) {
            Aweme awemeLJIIZILJ = LJIIZILJ();
            if (TextUtils.isEmpty(warningMsg)) {
                C844470XAv.LIZ.getClass();
                string = C844470XAv.LIZ().getString(2131858542);
            } else if (warningMsg != null) {
                string = warningMsg;
            }
            AwemeBizExtKt.setAnchorWikiOfflineText(awemeLJIIZILJ, string);
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct3 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        list.remove(anchorCommonStruct3);
        LJIILIIL(anchorCommonStruct3);
        this.LLIZ = anchorCommonStruct3;
        if (arrayList.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public void LLLIZZ(Aweme aweme) {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zK0 = interfaceC1392640mLO.k0();
        if (interfaceC665370Q7zK0 != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7zK0, FlexibleSparkPreloadProtocol.class, this);
        }
    }

    @C14EU
    public final void onWebViewFinish(C585740MyC c585740MyC) {
        Map<String, String> mapEmptyMap;
        if (LJIL()) {
            C2344009Gk c2344009GkLJJ = LJJ();
            c2344009GkLJJ.LIZLLL(c585740MyC.LIZ, "duration");
            C20684815ws.LJIILLIIL("anchor_stay_time", c2344009GkLJJ.LIZ);
        }
        C2344009Gk c2344009GkLJJ2 = LJJ();
        C2344009Gk c2344009Gk = this.LLJ;
        if (c2344009Gk == null || (mapEmptyMap = c2344009Gk.LIZ) == null) {
            mapEmptyMap = Collections.emptyMap();
        }
        c2344009GkLJJ2.LJI(new HashMap(mapEmptyMap));
        c2344009GkLJJ2.LIZLLL(c585740MyC.LIZ, "duration");
        C20684815ws.LJIILLIIL("multi_anchor_stay_time", c2344009GkLJJ2.LIZ);
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public void p1(C2344009Gk c2344009Gk) {
        String schema;
        this.LLJI = true;
        LJJIJL();
        super.p1(c2344009Gk);
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = null;
        if (anchorCommonStruct != null) {
            schema = anchorCommonStruct.getSchema();
        } else {
            schema = null;
        }
        if (C1052180dUG.LIZ(schema)) {
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
            if (interfaceC1392640mLO2 != null) {
                interfaceC1392640mLO = interfaceC1392640mLO2;
            }
            InterfaceC665370Q7z interfaceC665370Q7zK0 = interfaceC1392640mLO.k0();
            if (interfaceC665370Q7zK0 != null) {
                C1554610qYd.LIZJ(interfaceC665370Q7zK0, FlexibleSparkPreloadProtocol.class, C1697810uHb.LJIILJJIL(this));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x03b7  */
    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJJLL(android.view.View r25, X.C2344009Gk r26) {
        /*
            Method dump skipped, instruction units count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker.LJJJLL(android.view.View, X.09Gk):void");
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJIL(C712520RxC c712520RxC, InterfaceC705550Rlx interfaceC705550Rlx, InterfaceC1050330dRH interfaceC1050330dRH) {
        if (!this.LLJI) {
            LJJIJL();
        }
    }
}
