package com.ss.android.ugc.aweme.poi.detail.cells;

import X.C041J;
import X.C19M4;
import X.C2097608Jq;
import X.C426750GoL;
import X.C430000Gta;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashTrackConfig;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCommonCardCell extends PoiBaseCardCell {
    public SmartImageView LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public C19M4 LLJJL;
    public C430000Gta LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public View LLJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dz0;
    }

    public final boolean Wp() {
        TuxTextView tuxTextView = this.LLJJJJ;
        if (tuxTextView == null || tuxTextView.getVisibility() != 0) {
            return false;
        }
        TuxTextView tuxTextView2 = this.LLJJJJ;
        return C041J.LIZ(tuxTextView2 != null ? tuxTextView2.getText() : null);
    }

    public final void Xp(PoiCardCellData poiCardCellData) {
        String str;
        SlashTrackConfig slashTrackConfigEp = Ep("product_click");
        if (slashTrackConfigEp != null) {
            String str2 = slashTrackConfigEp.eventName;
            Pair[] pairArr = new Pair[2];
            String strHp = hp();
            String str3 = "";
            if (strHp == null) {
                strHp = "";
            }
            pairArr[0] = new Pair("ttls_poi_component", strHp);
            if (poiCardCellData != null && (str = poiCardCellData.keyCategory) != null) {
                str3 = str;
            }
            pairArr[1] = new Pair("target_local_service_key_category", str3);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            Map<String, String> map = slashTrackConfigEp.params;
            if (map != null) {
                mapLJIIJ.putAll(map);
            }
            up(new SlashTrackConfig(str2, mapLJIIJ, null));
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJJ = (SmartImageView) view.findViewById(R.id.f58);
        this.LLJJJIL = (TuxTextView) view.findViewById(R.id.r4z);
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.raq);
        this.LLJJJJJIL = (TuxTextView) view.findViewById(R.id.qw2);
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.r1w);
        this.LLJJL = (C19M4) view.findViewById(R.id.re8);
        this.LLJJLIIIJLLLLLLLZ = (C430000Gta) view.findViewById(R.id.x2s);
        this.LLJL = (TuxTextView) view.findViewById(R.id.r8a);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.r8_);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.qy5);
        if (C426750GoL.LIZLLL(view.getContext())) {
            TuxTextView tuxTextView = this.LLJJJIL;
            if (tuxTextView != null) {
                tuxTextView.setTextDirection(4);
            }
            TuxTextView tuxTextView2 = this.LLJL;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextDirection(4);
            }
        } else {
            TuxTextView tuxTextView3 = this.LLJJJIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setTextDirection(3);
            }
            TuxTextView tuxTextView4 = this.LLJL;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextDirection(3);
            }
        }
        this.LLJLL = (TuxTextView) view.findViewById(R.id.zhm);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.zhn);
        this.LLJLLL = view.findViewById(R.id.fkf);
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0147  */
    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zp(com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel r9) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.cells.PoiCommonCardCell.zp(com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel):void");
    }
}
