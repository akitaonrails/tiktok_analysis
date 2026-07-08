package com.ss.android.ugc.aweme.slash.cell.card;

import X.C1157940gEq;
import X.C1178990gmn;
import X.C1186840gzS;
import X.C419910GdJ;
import X.InterfaceC1181010gq3;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCell;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashImgCardCell extends SlashCell<SlashImgCardCellModel> {
    public SmartImageView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxIconView LLJJJ;
    public Pair<String, C419910GdJ> LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public TextView LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.f97;
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    public final Map<String, String> mp() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap(super.mp());
        SlashImgCardCellModel slashImgCardCellModel = (SlashImgCardCellModel) this.LLJJIII;
        if (slashImgCardCellModel == null || (str = slashImgCardCellModel.contentId) == null) {
            str = "";
        }
        linkedHashMap.put("content_id", str);
        SlashCellModel slashCellModelLp = lp();
        linkedHashMap.put("order", String.valueOf(slashCellModelLp != null ? slashCellModelLp.LL : 0));
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJIIJIL = (SmartImageView) view.findViewById(R.id.df2);
        this.LLJJIJIL = (TuxTextView) view.findViewById(R.id.dek);
        this.LLJJJ = (TuxIconView) view.findViewById(R.id.df0);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.cha);
        this.LLJJJJ = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setMinTextSize(10.0f);
        }
        this.LLJJJJJIL = (TuxIconView) view.findViewById(R.id.chb);
        this.LLJJJJLIIL = (FrameLayout) view.findViewById(R.id.sqe);
        this.LLJJL = (TextView) view.findViewById(R.id.sqf);
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    public final void yp(View view) {
        int i;
        String str;
        C1186840gzS c1186840gzSLw1;
        super.yp(view);
        if (!sp()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("img_card_view", view);
            SlashCellModel slashCellModelLp = lp();
            if (slashCellModelLp != null) {
                i = slashCellModelLp.LL;
            } else {
                i = 0;
            }
            linkedHashMap.put("index", Integer.valueOf(i));
            SlashImgCardCellModel slashImgCardCellModel = (SlashImgCardCellModel) this.LLJJIII;
            if (slashImgCardCellModel != null) {
                str = slashImgCardCellModel.contentId;
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("content_id", str);
            InterfaceC1181010gq3 interfaceC1181010gq3LIZIZ = C1178990gmn.LIZIZ(this);
            if (interfaceC1181010gq3LIZIZ != null && (c1186840gzSLw1 = interfaceC1181010gq3LIZIZ.lw1()) != null) {
                String strIp = ip();
                if (strIp != null) {
                    str2 = strIp;
                }
                c1186840gzSLw1.LIZ(new C1157940gEq(str2, linkedHashMap));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0199  */
    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zp(com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel r18) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.slash.cell.card.SlashImgCardCell.zp(com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel):void");
    }
}
