package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C1576570r83;
import X.C632090Oql;
import X.C786410Ut5;
import X.EnumC1563010qmB;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class DefaultFeaturedVideoIconAssem extends ReusedUISlotAssem<DefaultFeaturedVideoIconAssem> implements InterfaceC712990Rxx<C632090Oql> {
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.efw;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void Eo(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxIconView) view.findViewById(R.id.ot8);
        this.LLJL = (TuxIconView) view.findViewById(R.id.oth);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: op, reason: merged with bridge method [inline-methods] */
    public void up(C632090Oql c632090Oql) {
        sp(C1576570r83.LIZ(c632090Oql.getMusicModel().getPinnedVideoStatus()));
    }

    public final void sp(EnumC1563010qmB enumC1563010qmB) {
        if (enumC1563010qmB == EnumC1563010qmB.NOT_ALLOWED_SHOWN) {
            TuxIconView tuxIconView = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            TuxIconView tuxIconView2 = this.LLJL;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                return;
            }
            return;
        }
        if (enumC1563010qmB == EnumC1563010qmB.HAS_PINNED) {
            TuxIconView tuxIconView3 = this.LLJL;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
            }
        } else {
            TuxIconView tuxIconView4 = this.LLJL;
            if (tuxIconView4 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
            }
        }
        TuxIconView tuxIconView5 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxIconView5 == null) {
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView5, 0);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C632090Oql c632090Oql) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C632090Oql c632090Oql) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
