package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C1308910kAL;
import X.C426750GoL;
import X.C631230OpN;
import X.C631940OqW;
import X.C632090Oql;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultBackgroundAssem extends ReusedUISlotAssem<DefaultBackgroundAssem> implements InterfaceC712990Rxx<C632090Oql> {
    public View LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int Oo() {
        return R.layout.eft;
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
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.ot0);
    }

    public void op(C631940OqW c631940OqW) {
        Integer numLIZJ;
        if (c631940OqW.isSimilarMusic()) {
            C631230OpN.LIZJ(getContentView());
            int iIntValue = 0;
            C426750GoL.LJIIIZ(getContentView(), 0, 0, 0, 0, false, 16);
            View view = this.LLJJLIIIJLLLLLLLZ;
            if (view != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                Context context = getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c7, context)) != null) {
                    iIntValue = numLIZJ.intValue();
                }
                gradientDrawable.setColor(iIntValue);
                view.setBackground(gradientDrawable);
                return;
            }
            return;
        }
        C631230OpN.LIZ(getContentView());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C632090Oql c632090Oql) {
        op(c632090Oql.getMusicItemModel());
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
