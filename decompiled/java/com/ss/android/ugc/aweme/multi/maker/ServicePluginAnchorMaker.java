package com.ss.android.ugc.aweme.multi.maker;

import X.C04UD;
import X.C08JS;
import X.C09CT;
import X.C13LP;
import X.C1400390mXt;
import X.C1697810uHb;
import X.C20684815ws;
import X.C2344009Gk;
import X.C7740030o;
import X.EnumC1050190dR3;
import X.EnumC1430380nKG;
import X.InterfaceC1393560mMs;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes17.dex */
public final class ServicePluginAnchorMaker extends CommonAnchorMaker {
    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(this, 375);
        return new C1400390mXt(awS560S0100000_16, awS560S0100000_16, awS560S0100000_16, null, null, 24);
    }

    public final List<String> LJJLIIIJJI() {
        String keyword;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null) {
            keyword = "";
        }
        return a0.LJJLIIIJILLIZJL(u.LJJIFFI(keyword, "|", "·", false), new String[]{"·"}, 2, 2);
    }

    public final Extra LJJLIIIJJIZ() {
        String extra;
        Extra extra2;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct == null || (extra = anchorCommonStruct.getExtra()) == null || extra.length() == 0) {
            return null;
        }
        try {
            extra2 = (Extra) C08JS.LIZ(extra, Extra.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (extra2.title == null) {
            if (extra2.subtitle == null) {
                return null;
            }
        }
        return extra2;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new ServicePluginAnchorMaker();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.SERVICE_PLUGIN.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final String LIZLLL() {
        Extra extraLJJLIIIJJIZ = LJJLIIIJJIZ();
        if (extraLJJLIIIJJIZ != null) {
            String str = extraLJJLIIIJJIZ.title;
            return str != null ? str : "";
        }
        String str2 = (String) C13LP.LJJJLZIJ(0, LJJLIIIJJI());
        return str2 != null ? str2 : "";
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final CharSequence LJJIZ() {
        Extra extraLJJLIIIJJIZ = LJJLIIIJJIZ();
        if (extraLJJLIIIJJIZ == null) {
            return (CharSequence) C13LP.LJJJLZIJ(1, LJJLIIIJJI());
        }
        String str = extraLJJLIIIJJIZ.subtitle;
        return str == null ? "" : str;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            LJJIL(c2344009Gk);
        }
        LJJIIJ(c2344009Gk);
    }

    public final void LJJIL(C2344009Gk c2344009Gk) {
        String logExtra;
        Double d;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            c2344009Gk.LJFF("sub_type", anchorCommonStruct.subType());
        }
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 != null && (logExtra = anchorCommonStruct2.getLogExtra()) != null) {
            Map map = (Map) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), logExtra, Map.class);
            for (String str : C1697810uHb.LJIIJJI("anchor_type_int", "nearby_events_flag")) {
                Object obj = map.get(str);
                if (obj != null && (obj instanceof Double) && (d = (Double) obj) != null) {
                    c2344009Gk.LIZJ((int) d.doubleValue(), str);
                }
            }
            for (String str2 : C1697810uHb.LJIIJJI("anchor_type", "sub_type")) {
                Object obj2 = map.get(str2);
                if (obj2 != null) {
                    c2344009Gk.LJFF(str2, obj2.toString());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        list.remove(anchorCommonStruct2);
        LJIILIIL(anchorCommonStruct2);
        this.LLIZ = anchorCommonStruct2;
        if (arrayList.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            LJJIL(c2344009Gk);
        }
        C20684815ws.onEventV3("ttop_ticketing_preload");
        super.p1(c2344009Gk);
    }

    public static final class Extra {

        @C09CT("anchor_subtitle")
        public final String subtitle;

        @C09CT("anchor_title")
        public final String title;

        public Extra(String str, String str2) {
            this.title = str;
            this.subtitle = str2;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            LJJIL(c2344009Gk);
        }
        super.LJJJLL(view, c2344009Gk);
    }
}
