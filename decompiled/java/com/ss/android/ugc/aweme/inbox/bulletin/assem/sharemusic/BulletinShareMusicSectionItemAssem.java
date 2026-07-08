package com.ss.android.ugc.aweme.inbox.bulletin.assem.sharemusic;

import X.C07ZB;
import X.C1954807lC;
import X.C618870OPd;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinShareMusicSectionItemAssem extends ReusedUISlotAssem<BulletinShareMusicSectionItemAssem> implements InterfaceC712990Rxx<C07ZB> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.a8g;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.d56);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C07ZB c07zb) {
        int i;
        int i2 = C618870OPd.LIZ[c07zb.LL.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    i = 2131828013;
                } else {
                    throw new C1954807lC();
                }
            } else {
                i = 2131828016;
            }
        } else {
            i = 2131828022;
        }
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setText(i);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C07ZB c07zb) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C07ZB c07zb) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
