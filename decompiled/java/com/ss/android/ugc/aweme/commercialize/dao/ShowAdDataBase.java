package com.ss.android.ugc.aweme.commercialize.dao;

import X.AbstractC796510VMj;
import X.AbstractC796540VMm;
import X.C0VL7;
import X.C2275561E5a;

/* JADX INFO: loaded from: classes30.dex */
public abstract class ShowAdDataBase extends AbstractC796540VMm {
    public static final C2275561E5a LL = new AbstractC796510VMj() { // from class: X.1E5a
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("ALTER TABLE showAd ADD COLUMN 'cid' VARCHAR(255)");
        }
    };

    public abstract C0VL7 LIZ();
}
