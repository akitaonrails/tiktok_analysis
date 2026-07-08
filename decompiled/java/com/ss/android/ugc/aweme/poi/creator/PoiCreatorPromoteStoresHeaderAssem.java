package com.ss.android.ugc.aweme.poi.creator;

import X.AbstractC738140SxQ;
import X.C1189060h32;
import X.C1199020hJ6;
import X.C1220000hqw;
import X.C13LE;
import X.C20684815ws;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCreatorPromoteStoresHeaderAssem extends UIContentAssem {
    public ConstraintLayout LLIZLLLIL;
    public final C736950SvV LLJ;
    public boolean LLJI;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public PoiCreatorPromoteStoresHeaderAssem() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(311);
        this.LLJ = new C736950SvV(C13LE.LIZ(PoiCreatorVM.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(336), new AwS562S0100000_18((AbstractC738140SxQ) this, 985), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (this.LLJI) {
            return;
        }
        ConstraintLayout constraintLayout = this.LLIZLLLIL;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        if (constraintLayout.getVisibility() == 0) {
            this.LLJI = true;
            C1199020hJ6.LIZ.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1189060h32.LJIJI(linkedHashMap, "enter_from", "promote_stores");
            C20684815ws.LJIILLIIL("enter_ls_creator_center_banner_show", linkedHashMap);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLIZLLLIL = (ConstraintLayout) LJJIJL().findViewById(R.id.brb);
        LJJIJL().findViewById(R.id.za5);
        ConstraintLayout constraintLayout = this.LLIZLLLIL;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        C786410Ut5.I7(new AbS699S0100000_18(this, 17, 42), constraintLayout);
        C736680Sv4.LJIIIZ(this, (AssemViewModel) this.LLJ.getValue(), new C2217381BqS() { // from class: X.0hGN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1197360hGQ) obj).LLILLL);
            }
        }, new C2217381BqS() { // from class: X.0hGO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1197360hGQ) obj).LLJIJIL;
            }
        }, null, new AwS667S0100000_18(this, 11), 12);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJ.getValue(), new C2217381BqS() { // from class: X.0hGM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1197360hGQ) obj).LLJ;
            }
        }, null, new AwS632S0100000_18(this, 98), 6);
    }
}
