package com.ss.android.ugc.aweme.feed.assem.pugc;

import X.C0201004p;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes7.dex */
public final class VideoTemplateButtonViewModel extends FeedBaseViewModel<C0201004p> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0201004p(0);
    }

    public static boolean vQ2(Aweme aweme) {
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZLLL() || aweme == null || aweme.getTemplateButtonConfig() == null || aweme.getTemplateButtonConfig().buttonText == null || aweme.getTemplateButtonConfig().schemaUrl == null) {
            return false;
        }
        return true;
    }
}
