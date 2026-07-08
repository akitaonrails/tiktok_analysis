package com.ss.android.ugc.aweme.feed.collection.collection.component;

import X.C01GW;
import X.C13LE;
import X.C2217381BqS;
import X.C736680Sv4;
import X.C737910Sx3;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class CollectionDownloadPlaceHolderComponent extends BaseCellPlaceHolderComponent {
    public final C01GW LLJJL;

    public CollectionDownloadPlaceHolderComponent() {
        super(0);
        this.LLJJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(106));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0R7y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJJ;
            }
        }, null, new AwS625S0100000_11(this, 22), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0R7x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJJIL;
            }
        }, null, new AwS625S0100000_11(this, 23), 6);
    }
}
