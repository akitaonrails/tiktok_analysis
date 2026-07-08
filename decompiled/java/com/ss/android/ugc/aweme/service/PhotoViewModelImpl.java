package com.ss.android.ugc.aweme.service;

import X.C01GW;
import X.C13LE;
import X.C2217381BqS;
import X.C736680Sv4;
import X.C737910Sx3;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoViewModelImpl implements IPhotoViewModel {
    @Override // com.ss.android.ugc.aweme.service.IPhotoViewModel
    public final void LIZ(ReusedUIAssem reusedUIAssem, AwS635S0100000_21 awS635S0100000_21) {
        C01GW c01gwLIZJ = C737910Sx3.LIZJ(reusedUIAssem, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(629));
        C736680Sv4.LJIIIIZZ(reusedUIAssem, (AssemViewModel) c01gwLIZJ.getValue(), new C2217381BqS() { // from class: X.0RHI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0S9P) obj).LL);
            }
        }, null, new AwS447S0200000_11(awS635S0100000_21, c01gwLIZJ, 16), 6);
    }
}
