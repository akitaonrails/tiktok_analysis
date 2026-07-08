package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem;

import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C622680Oba;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C7835034f;
import X.DialogC1390150mHN;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist.ImageCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes27.dex */
public final class ImageListAssem extends UIListContentAssem<ImageListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 693));
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public DialogC1390150mHN LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ImageListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/ImageListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ImageListAssem.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public ImageListAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ImageListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 694), AFwS268S0000000_26.get$arr$(353), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BillboardGlobalViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 695), AFwS268S0000000_26.get$arr$(354), null, true);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 2;
        c20603715jn.LIZJ = true;
        c20603715jn.LJIIJ = true;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final ImageListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (ImageListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @C14EU(sticky = true)
    public final void onBillboardChangeEvent(C7835034f c7835034f) {
        ip().manualListRefresh();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C622680Oba.LIZJ(this);
        ImageListViewModel imageListViewModelIp = ip();
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        imageListViewModelIp.LLILZIL = (BillboardGlobalViewModel) assemVMLazy.getValue();
        Go().LJIILJJIL(ImageCell.class);
        Go().setLayoutManager(new GridLayoutManager(view.getContext(), 2));
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0v7H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1729860v7I) obj).LLILZ;
            }
        }, this, C736820SvI.LIZJ(), new AwS605S0100000_26(this, 325), null, new AwS605S0100000_26(this, 326), 16, null);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0v7G
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1729860v7I) obj).LLILZIL);
            }
        }, null, new AwS635S0100000_21(this, 68), 6);
    }
}
