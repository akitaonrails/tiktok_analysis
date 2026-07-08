package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core;

import X.C1558520qew;
import X.C659720PuE;
import X.C659750PuH;
import X.C659780PuK;
import X.EnumC659760PuI;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPhotoScreenEffectiveOptAssem extends ReusedUIContentAssem<SearchPhotoScreenEffectiveOptAssem> implements InterfaceC712990Rxx<C659750PuH> {
    public C659780PuK LLJJJJ;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C659720PuE c659720PuE = C659720PuE.LIZ;
        View viewLJJIJL = LJJIJL();
        EnumC659760PuI enumC659760PuI = EnumC659760PuI.PHOTO;
        c659720PuE.getClass();
        this.LLJJJJ = C659720PuE.LIZIZ(viewLJJIJL, enumC659760PuI);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659750PuH c659750PuH) {
        C659750PuH c659750PuH2 = c659750PuH;
        C659780PuK c659780PuK = this.LLJJJJ;
        if (c659780PuK != null) {
            c659780PuK.LIZ(C1558520qew.LJIIL(this), c659750PuH2.LL, null, c659750PuH2.LLIZLLLIL);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659750PuH c659750PuH) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659750PuH c659750PuH) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
