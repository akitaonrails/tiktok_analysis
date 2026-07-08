package com.ss.android.ugc.tools.infosticker.repository.internal.recent;

import X.AbstractC796510VMj;
import X.AbstractC796540VMm;
import X.C01GW;
import X.C1E5Y;
import X.C1E5Z;
import X.C452501pT;
import X.EnumC452301pR;
import X.InterfaceC1634800sdy;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public abstract class RecentUsedStickerDataBase extends AbstractC796540VMm {
    public static final C1E5Y LL = new AbstractC796510VMj() { // from class: X.1E5Y
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("ALTER TABLE 'stickers' ADD COLUMN 'stickerId' TEXT");
            c0vlf.LJIILJJIL("ALTER TABLE 'stickers' ADD COLUMN 'thirdPartyUrl' TEXT");
        }
    };
    public static final C1E5Z LLILLJJLI = new AbstractC796510VMj() { // from class: X.1E5Z
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("ALTER TABLE 'stickers' ADD COLUMN 'imageLocalPath' TEXT NOT NULL DEFAULT ''");
        }
    };
    public static final C01GW<RecentUsedStickerDataBase> LLILLL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS226S0000000_35.get$arr$(351));

    public abstract InterfaceC1634800sdy LIZ();
}
