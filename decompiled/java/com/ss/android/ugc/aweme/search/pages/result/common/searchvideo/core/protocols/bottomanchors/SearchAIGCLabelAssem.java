package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors;

import X.C07GJ;
import X.C0SD5;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC712990Rxx;
import Y.ACListenerS146S0100000_11;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAIGCLabelAssem extends ReusedUIContentAssem<SearchAIGCLabelAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s> {
    public LinearLayout LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public Aweme LLJJJJLIIL;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById;
        int i;
        this.LLJJJJ = (LinearLayout) view.findViewById(R.id.u6p);
        this.LLJJJJJIL = (TuxTextView) view.findViewById(R.id.u6r);
        LinearLayout linearLayout = this.LLJJJJ;
        if (linearLayout != null && (viewFindViewById = linearLayout.findViewById(R.id.u6q)) != null) {
            if (C07GJ.LIZIZ()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC435460H5s interfaceC435460H5s) {
        boolean zLIZIZ;
        int i;
        int i2;
        Aweme aweme = interfaceC435460H5s.getAweme();
        this.LLJJJJLIIL = aweme;
        if (aweme != null) {
            zLIZIZ = C0SD5.LIZIZ(aweme);
        } else {
            zLIZIZ = false;
        }
        LinearLayout linearLayout = this.LLJJJJ;
        if (linearLayout != null) {
            if (zLIZIZ) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJZL(i2, linearLayout);
        }
        LinearLayout linearLayout2 = this.LLJJJJ;
        String aid = null;
        if (linearLayout2 != null) {
            C786410Ut5.R7(linearLayout2, null);
        }
        LinearLayout linearLayout3 = this.LLJJJJ;
        if (linearLayout3 != null) {
            linearLayout3.setClickable(false);
        }
        if (zLIZIZ) {
            if (C07GJ.LIZ() != 1 && C07GJ.LIZ() != 2 && C07GJ.LIZ() == 3) {
                i = 2131847182;
            } else {
                i = 2131847181;
            }
            TuxTextView tuxTextView = this.LLJJJJJIL;
            if (tuxTextView != null) {
                tuxTextView.setText(i);
            }
            if (C07GJ.LIZIZ()) {
                LinearLayout linearLayout4 = this.LLJJJJ;
                if (linearLayout4 != null) {
                    linearLayout4.setClickable(true);
                }
                LinearLayout linearLayout5 = this.LLJJJJ;
                if (linearLayout5 != null) {
                    C786410Ut5.R7(linearLayout5, new ACListenerS146S0100000_11(this, 69));
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind label: aid=");
        if (aweme != null) {
            aid = aweme.getAid();
        }
        sbLIZ.append(aid);
        sbLIZ.append(", shouldShow=");
        sbLIZ.append(zLIZIZ);
        sbLIZ.append(", style=");
        sbLIZ.append(C07GJ.LIZ());
        sbLIZ.append(", clickable=");
        sbLIZ.append(C07GJ.LIZIZ());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
