package com.ss.android.ugc.aweme.share.viewmodel;

import X.C0SHT;
import X.C1620050sGB;
import X.C19EG;
import android.content.Context;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.main.service.IFeedPanelStateVMService;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedStateVMServiceImpl implements IFeedPanelStateVMService {
    @Override // com.ss.android.ugc.aweme.main.service.IFeedPanelStateVMService
    public final C0SHT LIZ(Context context) {
        if (context instanceof C19EG) {
            return (C0SHT) ViewModelProviders.of((C19EG) context, C1620050sGB.LIZLLL).get(FeedPanelStateViewModel.class);
        }
        return null;
    }
}
