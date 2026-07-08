package com.ss.android.ugc.aweme.slash.cell.arc;

import X.C0Q4Y;
import X.C1175980ghw;
import X.C1176000ghy;
import X.C1176010ghz;
import X.C15438062q;
import X.C1697810uHb;
import X.C1723500ux2;
import X.C20600815jK;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.ss.android.ugc.aweme.slash.cell.arc.BaseSlashCellData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BasePowerListSlashCellGroup<T extends BaseSlashCellData> extends SlashCellGroup<T> {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJIIJIL;
    public final Set<String> LLJJIJIL = new LinkedHashSet();

    public int Ip() {
        return 1;
    }

    public void Fp() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        SlashCellModel slashCellModelLp = lp();
        List listGp = Gp(slashCellModelLp != null ? slashCellModelLp.cells : null);
        if (listGp == null || (viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL) == null || (state = viewOnAttachStateChangeListenerC20604515jv.getState()) == null) {
            return;
        }
        state.LJIILL(listGp, null);
    }

    public static List Gp(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C1175980ghw((SlashCellModel) obj, null, null, 14));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        C20600815jK<InterfaceC1891350zJl> state;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        this.LLJJIJIIJIL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIJIIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setOrientation(Ip());
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJIJIIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null) {
            state.LIZLLL = C0Q4Y.BUFFER;
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    public void zp(SlashCellModel slashCellModel) {
        List<SlashCellModel> list = slashCellModel.cells;
        int i = 0;
        if (list != null) {
            for (SlashCellModel slashCellModel2 : list) {
                String str = slashCellModel2.cellId;
                if (str != null && str.length() != 0 && !this.LLJJIJIL.contains(slashCellModel2.cellId)) {
                    int iLIZ = C1176010ghz.LIZ(C1176000ghy.LIZ, slashCellModel2.cellId);
                    if (Ip() == 0) {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL;
                        if (viewOnAttachStateChangeListenerC20604515jv != null) {
                            viewOnAttachStateChangeListenerC20604515jv.LJIJ(new C1723500ux2(iLIZ, SlashPowerListCellGroupHorizontalCell.class));
                        }
                    } else {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIJIIJIL;
                        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                            viewOnAttachStateChangeListenerC20604515jv2.LJIJ(new C1723500ux2(iLIZ, SlashPowerListCellGroupVerticalCell.class));
                        }
                    }
                    this.LLJJIJIL.add(slashCellModel2.cellId);
                }
            }
        }
        List<SlashCellModel> list2 = slashCellModel.cells;
        if (list2 != null) {
            for (SlashCellModel slashCellModel3 : list2) {
                int i2 = i + 1;
                if (i >= 0) {
                    slashCellModel3.LL = i;
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        Fp();
    }
}
