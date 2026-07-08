package com.ss.android.ugc.aweme.innerpush.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class InnerPushConfig {
    public static final MetaData LIZ = new MetaData(50, 50, 50);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(227));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(229));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(226));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(228));

    public static final class MetaData {

        @C09CT("ban_max_records")
        public final int banMaxRecords;

        @C09CT("display_id_max_records")
        public final int displayIdMaxRecord;

        @C09CT("popup_max_records")
        public final int popupMaxRecords;

        public MetaData() {
            this(50, 50, 50);
        }

        public MetaData(int i, int i2, int i3) {
            this.popupMaxRecords = i;
            this.banMaxRecords = i2;
            this.displayIdMaxRecord = i3;
        }
    }
}
