package com.ss.android.ugc.aweme.vibefeed.database;

import X.AbstractC796540VMm;
import X.C0Z7U;
import X.C882400YjW;
import X.C883250Ykt;
import X.C883460YlE;
import X.EnumC883280Ykw;
import X.InterfaceC883330Yl1;

/* JADX INFO: loaded from: classes15.dex */
public abstract class SharedFeedDatabase extends AbstractC796540VMm implements InterfaceC883330Yl1 {
    public static SharedFeedDatabase LL;
    public static final Object LLILLJJLI = new Object();

    public abstract C0Z7U LIZ();

    public SharedFeedDatabase() {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        C883250Ykt.LIZIZ(this);
    }

    @Override // X.InterfaceC883330Yl1
    public final void LJII(EnumC883280Ykw enumC883280Ykw, C883460YlE c883460YlE) {
        if (enumC883280Ykw != EnumC883280Ykw.UNKNOWN) {
            LL = null;
        }
    }
}
