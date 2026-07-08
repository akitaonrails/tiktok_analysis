package com.ss.android.ugc.aweme.services.edit;

import X.InterfaceC20660715sz;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes20.dex */
public interface IMuteStripProfileBannerService {
    boolean shouldShowCopyrightViolationSnackBar(Aweme aweme);

    void showCopyrightViolationSnackBar(ViewGroup viewGroup, InterfaceC20660715sz interfaceC20660715sz, Aweme aweme);
}
