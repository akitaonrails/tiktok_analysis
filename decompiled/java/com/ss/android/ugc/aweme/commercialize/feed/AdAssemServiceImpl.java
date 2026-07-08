package com.ss.android.ugc.aweme.commercialize.feed;

import X.C13LE;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedCommerceAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.bottomlabel.AdAIGCBottomLabelTriggerAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.bottomlabel.AdBottomLabelTriggerAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.bottomlabel.PaidPartnershipBottomLabelTriggerAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.bottomlabel.PostRollCountDownLabelTriggerAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileTrigger;

/* JADX INFO: loaded from: classes12.dex */
public final class AdAssemServiceImpl implements IAdAssemService {
    @Override // com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService
    public final C19719912Dl LIZ() {
        return C13LE.LIZ(AdProductTileTrigger.class);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService
    public final C19719912Dl LIZIZ() {
        return C13LE.LIZ(FeedCommerceAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService
    public final C19719912Dl LJI() {
        return C13LE.LIZ(MidAdCellComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService
    public final PaidPartnershipBottomLabelTriggerAssem LIZJ() {
        return new PaidPartnershipBottomLabelTriggerAssem();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService
    public final PostRollCountDownLabelTriggerAssem LJ() {
        return new PostRollCountDownLabelTriggerAssem();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService
    public final AdBottomLabelTriggerAssem LJFF() {
        return new AdBottomLabelTriggerAssem();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService
    public final AdAIGCBottomLabelTriggerAssem LIZLLL(boolean z) {
        return new AdAIGCBottomLabelTriggerAssem(z);
    }
}
