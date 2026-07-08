package com.ss.android.ugc.aweme.slash.component.compose;

import X.AbstractC19486711Lt;
import X.C01GW;
import X.C1173980gei;
import X.C1174200gf4;
import X.C1174850gg7;
import X.C1175970ghv;
import X.C1181030gq5;
import X.C1181930grX;
import X.C1186840gzS;
import X.C11S5;
import X.C1208870hYz;
import X.C2097608Jq;
import X.C295220Bhg;
import X.InterfaceC1181010gq3;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.slash.cell.arc.ComposeConfig;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashComposeComponent extends BaseSlashGlueSlotAssemComponent<SlashComposeComponentModel> {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.f94;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173990gej
    public final Map<String, String> vt() {
        Pair[] pairArr = new Pair[1];
        String strLIZ = C1173980gei.LIZ(this);
        if (strLIZ == null) {
            strLIZ = "";
        }
        pairArr[0] = new Pair("from_instance_id", strLIZ);
        return C2097608Jq.LJIIJ(pairArr);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173990gej
    public final void fm1() {
        C1186840gzS c1186840gzSLw1;
        C1174850gg7.LJII(this);
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ == null || (c1186840gzSLw1 = interfaceC1181010gq3LIZ.lw1()) == null) {
            return;
        }
        String strLJFF = C1174850gg7.LJFF(this);
        if (strLJFF == null) {
            strLJFF = C1173980gei.LIZ(this);
        }
        c1186840gzSLw1.LIZ(new C1174200gf4(strLJFF, C1173980gei.LIZ(this)));
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        boolean z;
        ComposeConfig composeConfig;
        List<SlashCellModel> list;
        SlashComposeComponentModel slashComposeComponentModel = (SlashComposeComponentModel) baseComponentData;
        super.CG1(slashComposeComponentModel);
        if (C295220Bhg.LIZ() >= 1) {
            z = true;
        } else {
            z = false;
        }
        List<SlashCellModel> list2 = null;
        if (z) {
            AbstractC19486711Lt.LJIIJJI(new C1208870hYz(this, slashComposeComponentModel, 2)).LJIJJLI(C11S5.LIZIZ).LJIILL().LJIIZILJ();
        } else {
            ComposeConfig composeConfig2 = slashComposeComponentModel.composeConfig;
            if (composeConfig2 != null) {
                list2 = composeConfig2.cells;
            }
            lp(list2);
        }
        SlashComposeComponentModel slashComposeComponentModel2 = (SlashComposeComponentModel) C1174850gg7.LIZJ(this);
        if (slashComposeComponentModel2 != null && (composeConfig = slashComposeComponentModel2.composeConfig) != null && (list = composeConfig.cells) != null && (!list.isEmpty())) {
            C1175970ghv.LIZ(this, list, (ViewGroup) getContentView());
        }
    }

    public final void lp(List<SlashCellModel> list) {
        String str;
        C1181930grX c1181930grXPu2;
        if (list != null) {
            for (SlashCellModel slashCellModel : list) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("key", "slash_cell_parse_done");
                InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
                String str2 = null;
                if (interfaceC1181010gq3LIZ != null && (c1181930grXPu2 = interfaceC1181010gq3LIZ.Pu2()) != null) {
                    str2 = c1181930grXPu2.LIZJ;
                }
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put("biz", str2);
                if (slashCellModel != null && (str = slashCellModel.cellId) != null) {
                    str3 = str;
                }
                linkedHashMap.put("cell_id", str3);
                C01GW c01gw = C1181030gq5.LIZ;
                C1181030gq5.LIZIZ(this, BK2(), "local_service_slash_track", linkedHashMap);
                lp(slashCellModel.cells);
            }
        }
    }
}
