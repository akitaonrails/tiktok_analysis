package com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component;

import X.C0PCY;
import X.C0PM7;
import X.C0PRC;
import X.C13BV;
import X.C1558520qew;
import X.C2188811AlT;
import X.C646370PWx;
import X.C656600PpC;
import X.C683220Qr2;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSingleFeedbackNimbleAssem extends SearchCardFeedbackAssem<C656600PpC> {
    public View LLJJJJLIIL;
    public final int LLJJL = R.id.ud2;
    public final C13BV LLJJLIIIJLLLLLLLZ;
    public final C13BV LLJL;
    public final AwS547S0100000_3 LLJLIL;

    public SearchSingleFeedbackNimbleAssem() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJJLIIIJLLLLLLLZ = c13bv;
        this.LLJL = c13bv;
        this.LLJLIL = new AwS547S0100000_3(this, 51);
    }

    @Override // X.InterfaceC685830QvF
    public final String getFeedbackType() {
        C656600PpC c656600PpC;
        Object objBo = bo();
        if (!(objBo instanceof C656600PpC) || (c656600PpC = (C656600PpC) objBo) == null) {
            return null;
        }
        return c656600PpC.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
    public final Function0<List<View>> dp() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC685830QvF
    public final List<Integer> sf() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC685830QvF
    public final int ue() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC685830QvF
    public final List<Integer> ya() {
        return this.LLJL;
    }

    @Override // X.InterfaceC685830QvF
    public final void Mj(C683220Qr2 c683220Qr2) {
        C0PCY<C0PM7> c0pcyAk0;
        C0PM7 c0pm7;
        String string;
        C0PCY<C646370PWx> c0pcyWO2;
        C646370PWx c646370PWx;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        String str = ((C656600PpC) bo()).LL;
        Map<String, Object> map = ((C656600PpC) bo()).LLILLL;
        c683220Qr2.LIZJ = str;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchContextAbility.class, null);
        HashMap map2 = new HashMap();
        if (iSearchContextAbility != null && (c0pcyPh1 = iSearchContextAbility.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
            map2.put("search_id", c0prc.LLILLL);
            map2.put("search_keyword", c0prc.LLIZLLLIL);
            map2.put("search_type", c0prc.LLLF);
        }
        String str2 = "";
        if (iSearchContextAbility != null && (c0pcyWO2 = iSearchContextAbility.wO2()) != null && (c646370PWx = (C646370PWx) c0pcyWO2.LIZJ()) != null) {
            map2.put("enter_from", c646370PWx.LLILLL);
            map2.put("rank", String.valueOf(c646370PWx.LLILZLL));
            map2.put("universal_rank", String.valueOf(c646370PWx.LLJILJIL));
            String str3 = c646370PWx.LLJILJILJ;
            if (str3 == null) {
                str3 = "";
            }
            map2.put("insert_type", str3);
        }
        Map<String, String> mapXE0 = ((SearchServiceCenter$MobAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$MobAbility.class)).XE0();
        String str4 = mapXE0.get("search_result_id");
        if (str4 == null) {
            str4 = "";
        }
        map2.put("search_result_id", str4);
        String str5 = mapXE0.get("is_aladdin");
        if (str5 == null) {
            str5 = "";
        }
        map2.put("is_aladdin", str5);
        if (iSearchContextAbility != null && (c0pcyAk0 = iSearchContextAbility.ak0()) != null && (c0pm7 = (C0PM7) c0pcyAk0.LIZJ()) != null && (string = Long.valueOf(c0pm7.LLILLJJLI).toString()) != null) {
            str2 = string;
        }
        map2.put("end_to_end_search_session_id", str2);
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() != null && String.valueOf(entry.getValue()).length() > 0 && (!a0.LJJJIL(String.valueOf(entry.getValue())))) {
                    map2.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
        c683220Qr2.LJ = map2;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        boolean z;
        this.LLJJJJLIIL = view.findViewById(R.id.ud2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated: ");
        if (this.LLJJJJLIIL == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        super.onViewCreated(view);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void up(C656600PpC c656600PpC) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind: ");
        if (LJJIJL().findViewById(R.id.ud2) == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(((C656600PpC) bo()).LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        super.up(c656600PpC);
    }
}
