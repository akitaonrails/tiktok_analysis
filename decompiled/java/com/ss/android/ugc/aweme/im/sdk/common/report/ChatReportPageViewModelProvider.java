package com.ss.android.ugc.aweme.im.sdk.common.report;

import X.AbstractC903280Zc6;
import X.C738350Sxl;
import X.C913950ZtJ;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.im.chatroom.api.report.IChatReportPageViewModelProvider;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatReportPageViewModelProvider implements IChatReportPageViewModelProvider {
    public final C913950ZtJ LL = new C913950ZtJ(1);

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        return C738350Sxl.LIZ(this);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.LL;
    }
}
