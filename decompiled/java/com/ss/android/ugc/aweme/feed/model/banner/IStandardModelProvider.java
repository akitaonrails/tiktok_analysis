package com.ss.android.ugc.aweme.feed.model.banner;

import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes12.dex */
public interface IStandardModelProvider {
    Object provideItemPayload();

    Aweme providerAweme();

    InterfaceC497601wk providerCoroutineScope();

    AnchorCommonStruct providerDisplayAnchor();
}
