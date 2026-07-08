package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.image;

import X.C1320310kSj;
import X.C1331670kl3;
import X.C1763050vyp;
import X.C1763240vz8;
import X.C1763410vzP;
import X.C1763440vzS;
import X.C1764060w0S;
import X.C7726030a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderDisplayImageOpt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.AwS104S0210000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaGoda1ImageHelper implements ISeaHeadImageHelper {
    public final SeaPdpViewModel LL;
    public final HeaderDisplayImageOpt LLILLJJLI;
    public final C1763050vyp LLILLL = new C1763050vyp();

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.image.ISeaHeadImageHelper
    public final C1763050vyp rZ1() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.image.ISeaHeadImageHelper
    public final void Np(String str) {
        C1763410vzP c1763410vzP;
        C1763440vzS c1763440vzSMR2 = this.LL.MR2();
        if (c1763440vzSMR2 != null && str != null && (c1763410vzP = (C1763410vzP) C7726030a.LIZ(str, c1763440vzSMR2.LIZJ)) != null) {
            c1763410vzP.LIZIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.image.ISeaHeadImageHelper
    public final void Qe(String str) {
        C1763440vzS c1763440vzSMR2 = this.LL.MR2();
        if (c1763440vzSMR2 != null) {
            c1763440vzSMR2.LIZ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.image.ISeaHeadImageHelper
    public final void dW(Image image) {
        ((C1763240vz8) this.LL.LLLLILI.getValue()).LIZ.LIZIZ(image);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.image.ISeaHeadImageHelper
    public final void et(String str) {
        C1763410vzP c1763410vzP;
        C1763440vzS c1763440vzSMR2 = this.LL.MR2();
        if (c1763440vzSMR2 != null && str != null && (c1763410vzP = (C1763410vzP) C7726030a.LIZ(str, c1763440vzSMR2.LIZJ)) != null) {
            c1763410vzP.LIZ = true;
        }
    }

    public SeaGoda1ImageHelper(SeaPdpViewModel seaPdpViewModel, Lifecycle lifecycle) {
        this.LL = seaPdpViewModel;
        this.LLILLJJLI = new HeaderDisplayImageOpt(ViewModelKt.getViewModelScope(seaPdpViewModel), seaPdpViewModel.getProductId(), lifecycle);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.image.ISeaHeadImageHelper
    public final void mY0(Image image, boolean z, boolean z2) {
        ((C1763240vz8) this.LL.LLLLILI.getValue()).LIZ.LIZ(image, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.image.ISeaHeadImageHelper
    public final void P00(SmartImageView smartImageView, Image image, int i, String str, C1320310kSj c1320310kSj, AwS104S0210000_26 awS104S0210000_26, C1331670kl3 c1331670kl3, C1764060w0S c1764060w0S) {
        this.LLILLJJLI.LIZ(smartImageView, image, i, str, true, c1320310kSj, awS104S0210000_26, c1331670kl3, c1764060w0S, false, false);
    }
}
