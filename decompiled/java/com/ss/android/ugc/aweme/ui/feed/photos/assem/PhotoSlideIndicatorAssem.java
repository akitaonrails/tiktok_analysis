package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C01GW;
import X.C03H5;
import X.C13LE;
import X.C2217381BqS;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class PhotoSlideIndicatorAssem<RECEIVER extends C03H5> extends BaseCellSlotComponent<RECEIVER> {
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(527));

    public void Fp(int i) {
    }

    public abstract void Gp(int i);

    public final PhotoViewModelV2 Bp() {
        return (PhotoViewModelV2) this.LLJLLIL.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ep, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
        Integer numValueOf = Integer.valueOf(Bp().zQ2());
        if (numValueOf != null) {
            Gp(numValueOf.intValue());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        C736680Sv4.LJIJJ(Bp(), new AwS590S0100000_11((PhotoSlideIndicatorAssem) this, 292));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0RUt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0S9P) obj).LL);
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 82), 4);
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0RV2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 83), 4);
        super.onViewCreated(view);
    }
}
