package com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui;

import X.C1559260qg8;
import X.C654550Plt;
import X.C655100Pmm;
import X.C657280PqI;
import X.C723580SZw;
import X.C786410Ut5;
import X.EnumC657370PqR;
import X.InterfaceC1587906Jp;
import X.InterfaceC655080Pmk;
import X.InterfaceC655730Pnn;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLiveGameAnchorAssem extends ReusedUISlotAssem<SearchLiveGameAnchorAssem> implements InterfaceC712990Rxx<InterfaceC655730Pnn> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL = new C1559260qg8(new C723580SZw(this, C657280PqI.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJLIL = new C1559260qg8(new C723580SZw(this, C654550Plt.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f38;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public static boolean op(InterfaceC655730Pnn interfaceC655730Pnn) {
        InterfaceC655080Pmk anchorType = interfaceC655730Pnn.getAnchorType();
        if ((anchorType instanceof C655100Pmm) && ((C655100Pmm) anchorType).LIZ.showDropsTag) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.ua9);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC655730Pnn interfaceC655730Pnn) {
        String string;
        EnumC657370PqR enumC657370PqR;
        C654550Plt c654550Plt;
        String string2;
        InterfaceC655730Pnn interfaceC655730Pnn2 = interfaceC655730Pnn;
        String str = "";
        if (this.LLJLIL.getValue() != null) {
            C657280PqI c657280PqI = (C657280PqI) this.LLJL.getValue();
            if (c657280PqI != null) {
                enumC657370PqR = c657280PqI.LLILLL;
            } else {
                enumC657370PqR = null;
            }
            if (enumC657370PqR == EnumC657370PqR.LIVE && (c654550Plt = (C654550Plt) this.LLJLIL.getValue()) != null && c654550Plt.LLJILJIL && op(interfaceC655730Pnn2)) {
                TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
                TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxTextView2 != null) {
                    Context context = getContext();
                    if (context != null && (string2 = context.getString(2131852525)) != null) {
                        str = string2;
                    }
                    tuxTextView2.setText(str);
                    return;
                }
                return;
            }
            return;
        }
        if (!op(interfaceC655730Pnn2)) {
            return;
        }
        TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 0);
        }
        TuxTextView tuxTextView4 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView4 == null) {
            return;
        }
        Context context2 = getContext();
        if (context2 != null && (string = context2.getString(2131852525)) != null) {
            str = string;
        }
        tuxTextView4.setText(str);
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(InterfaceC655730Pnn interfaceC655730Pnn) {
        return op(interfaceC655730Pnn);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC655730Pnn interfaceC655730Pnn) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
