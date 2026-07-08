package com.ss.android.ugc.aweme.slash.cell.title;

import X.C1157910gEn;
import X.C1174900ggC;
import X.C1178990gmn;
import X.C1186840gzS;
import X.C1195630hDd;
import X.C2097608Jq;
import X.C337180DJs;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1181010gq3;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.slash.cell.arc.Padding;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCell;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCommonAction;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCommonEvent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS330S0300000_18;
import wh6.AbS508S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashTitleCell extends SlashCell<SlashTitleCellModel> {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.f9e;
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    public final void Bp() {
        if (Ap() != null) {
            super.Bp();
            return;
        }
        Padding padding = new Padding(16, 8, 16, 16);
        if (C426750GoL.LIZLLL(getContentView().getContext())) {
            getContentView().setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(padding.right))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(padding.top))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(padding.left))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(padding.bottom))));
        } else {
            getContentView().setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(padding.left))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(padding.top))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(padding.right))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(padding.bottom))));
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1195630hDd c1195630hDd = (C1195630hDd) getContentView().findViewById(R.id.tv_view_all);
        if (c1195630hDd != null) {
            c1195630hDd.setTrackParams(new C1174900ggC("poi_detail_page", "poi_detail_section_header", null));
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    public final void zp(SlashCellModel slashCellModel) {
        String str;
        String str2;
        SlashTitleCellModel slashTitleCellModel = (SlashTitleCellModel) this.LLJJIII;
        TextView textView = (TextView) getContentView().findViewById(R.id.y3j);
        if (slashTitleCellModel != null) {
            str = slashTitleCellModel.title;
        } else {
            str = null;
        }
        textView.setText(str);
        View viewFindViewById = getContentView().findViewById(R.id.rdg);
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(0, 0, 0, 0);
        }
        View viewFindViewById2 = getContentView().findViewById(R.id.rdf);
        C1195630hDd c1195630hDd = (C1195630hDd) getContentView().findViewById(R.id.tv_view_all);
        if (slashTitleCellModel != null && (str2 = slashTitleCellModel.moreButtonText) != null && str2.length() != 0) {
            C337180DJs.LIZJ(c1195630hDd);
            c1195630hDd.LIZLLL(slashTitleCellModel.moreButtonText);
            Pair[] pairArr = new Pair[2];
            String strIp = ip();
            if (strIp == null) {
                strIp = "";
            }
            pairArr[0] = new Pair("ttls_module_name", strIp);
            pairArr[1] = new Pair("ttls_btn_location", "top_right");
            c1195630hDd.setTrackParams(new C1174900ggC("poi_detail_page", "poi_detail_section_header", C2097608Jq.LJIIIIZZ(pairArr)));
            C786410Ut5.I7(new AbS330S0300000_18(c1195630hDd, this, slashTitleCellModel, 2), viewFindViewById2);
            C786410Ut5.I7(new AbS508S0200000_18(this, slashTitleCellModel, 20, 42), c1195630hDd);
            return;
        }
        C337180DJs.LIZ(c1195630hDd);
        C786410Ut5.Ha(c1195630hDd);
        C786410Ut5.I7(null, viewFindViewById2);
    }

    public final void Fp(View view, SlashTitleCellModel slashTitleCellModel) {
        List<SlashCommonEvent> list;
        SlashCommonEvent next;
        List<SlashCommonAction> list2;
        C1186840gzS c1186840gzSLw1;
        SlashCellModel slashCellModelLp = lp();
        if (slashCellModelLp != null && (list = slashCellModelLp.events) != null) {
            Iterator<SlashCommonEvent> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.name, slashTitleCellModel.moreButtonClickEvent)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SlashCommonEvent slashCommonEvent = next;
            if (slashCommonEvent != null && (list2 = slashCommonEvent.actions) != null) {
                for (SlashCommonAction slashCommonAction : list2) {
                    if (slashCommonAction.isTrackEvent()) {
                        op(slashCommonAction);
                    } else {
                        InterfaceC1181010gq3 interfaceC1181010gq3LIZIZ = C1178990gmn.LIZIZ(this);
                        if (interfaceC1181010gq3LIZIZ != null && (c1186840gzSLw1 = interfaceC1181010gq3LIZIZ.lw1()) != null) {
                            String strIp = ip();
                            if (strIp == null) {
                                strIp = "";
                            }
                            c1186840gzSLw1.LIZ(C1157910gEn.LIZ(slashCommonAction, view, strIp));
                        }
                    }
                }
            }
        }
    }
}
