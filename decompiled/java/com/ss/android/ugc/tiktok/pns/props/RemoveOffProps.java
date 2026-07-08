package com.ss.android.ugc.tiktok.pns.props;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class RemoveOffProps {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;

    @C09CT("ab_group")
    public final Integer abGroup;

    @C09CT("confirm_action_records")
    public final String confirmActionRecords;

    public RemoveOffProps() {
        this(null, "");
    }

    public RemoveOffProps(Integer num, String str) {
        this.abGroup = num;
        this.confirmActionRecords = str;
        this.LIZIZ = true;
    }
}
