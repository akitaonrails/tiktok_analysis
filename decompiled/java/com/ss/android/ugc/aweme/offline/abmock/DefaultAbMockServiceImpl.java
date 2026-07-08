package com.ss.android.ugc.aweme.offline.abmock;

import X.C0C5H;
import X.C311960CKs;
import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class DefaultAbMockServiceImpl implements IAbMockService {
    @Override // com.ss.android.ugc.aweme.offline.abmock.IAbMockService
    public final void init() {
    }

    @Override // com.ss.android.ugc.aweme.offline.abmock.IAbMockService
    public final void isOpen() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0CKs] */
    @Override // com.ss.android.ugc.aweme.offline.abmock.IAbMockService
    public final C311960CKs LIZ() {
        return new C0C5H() { // from class: X.0CKs
            @Override // X.C0C5H
            public final boolean enable() {
                return false;
            }

            @Override // X.C0C5H
            public final Object get(String str) {
                return null;
            }

            @Override // X.C0C5H
            public final void init(Context context) {
            }
        };
    }
}
