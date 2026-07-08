package com.ss.android.ugc.aweme.share.utils;

import X.AbstractC19483511Kn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.share.model.MultiShortenModel;
import com.ss.android.ugc.aweme.share.model.MultiShortenShareRequest;

/* JADX INFO: loaded from: classes5.dex */
public interface IMultiShortenUrlApi {
    @InterfaceC1501240pAY("/tiktok/share/link/shorten/multi/v1/")
    AbstractC19483511Kn<MultiShortenModel> getPreShareLinkShortenUrl(@InterfaceC1485405rg MultiShortenShareRequest multiShortenShareRequest);
}
