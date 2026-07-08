package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C418440Gaw;
import X.C426750GoL;
import X.C632090Oql;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultPaddingAssem extends ReusedUIContentAssem<DefaultPaddingAssem> implements InterfaceC712990Rxx<C632090Oql> {
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C632090Oql c632090Oql) {
        C632090Oql c632090Oql2 = c632090Oql;
        boolean zIsSimilarMusic = c632090Oql2.getMusicItemModel().isSimilarMusic();
        boolean zIsFirstSimilarMusic = c632090Oql2.getMusicItemModel().isFirstSimilarMusic();
        boolean zIsLastSimilarMusic = c632090Oql2.getMusicItemModel().isLastSimilarMusic();
        if (c632090Oql2.getMusicItemModel().isHighlightedSimilarMusic()) {
            C426750GoL.LJIIL(LJJIJL(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 21);
            return;
        }
        if (zIsSimilarMusic) {
            if (zIsFirstSimilarMusic) {
                if (zIsLastSimilarMusic) {
                    C426750GoL.LJIIL(LJJIJL(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 21);
                    return;
                } else {
                    C426750GoL.LJIIL(LJJIJL(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 21);
                    return;
                }
            }
            if (zIsLastSimilarMusic) {
                C426750GoL.LJIIL(LJJIJL(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 21);
                return;
            }
        }
        C426750GoL.LJIIL(LJJIJL(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 21);
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
