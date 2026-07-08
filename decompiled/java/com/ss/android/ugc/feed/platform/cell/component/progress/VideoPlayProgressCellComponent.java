package com.ss.android.ugc.feed.platform.cell.component.progress;

import X.C01GW;
import X.C13LE;
import X.C1558520qew;
import X.C1A2S;
import X.C1A2T;
import X.C1A2U;
import X.C1A2V;
import X.C1A2W;
import X.C2217381BqS;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class VideoPlayProgressCellComponent extends BaseCellContentComponent<VideoPlayProgressCellComponent> implements IVideoPlayProgressAbility, InterfaceC1554640qYg {
    public final C1A2T LLJJJJLIIL = new C1A2T();
    public final C01GW LLJJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), new C1A2V());

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 590769579) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0RmE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIJI;
            }
        }, C736820SvI.LJ(), new C1A2S(), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.progress.IVideoPlayProgressAbility
    public final void l50(long j, C1A2W c1a2w) {
        List<C1A2U> list = this.LLJJJJLIIL.LIZ.get(Long.valueOf(j));
        if (list != null) {
            Iterator<C1A2U> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().LIZ, c1a2w)) {
                    it2.remove();
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.progress.IVideoPlayProgressAbility
    public final void iD1(long j, boolean z, C1A2W c1a2w) {
        C1A2T c1a2t = this.LLJJJJLIIL;
        if (c1a2t.LIZ.get(Long.valueOf(j)) == null) {
            ArrayList arrayList = new ArrayList();
            c1a2t.LIZ.put(Long.valueOf(j), arrayList);
        }
        List<C1A2U> list = c1a2t.LIZ.get(Long.valueOf(j));
        if (list != null) {
            list.add(new C1A2U(c1a2w, z));
        }
    }
}
