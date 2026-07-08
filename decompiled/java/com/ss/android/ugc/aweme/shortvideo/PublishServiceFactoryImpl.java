package com.ss.android.ugc.aweme.shortvideo;

import X.C1439630nZB;
import com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishServiceFactoryImpl implements IPublishServiceFactory {
    @Override // com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory
    public final C1439630nZB LIZ(int i, BaseShortVideoContext baseShortVideoContext) {
        if (i != 0 && i != 11) {
            return null;
        }
        return new C1439630nZB(i, baseShortVideoContext);
    }
}
