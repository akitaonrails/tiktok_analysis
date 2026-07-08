package com.ss.android.ugc.aweme.frequency.repository;

import X.AbstractC796510VMj;
import X.AbstractC796540VMm;
import X.C0VKE;
import X.InterfaceC808060Vmu;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS247S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public abstract class OutreachRecordDatabase extends AbstractC796540VMm {
    public static final C0VKE LL = new Object() { // from class: X.0VKE
    };
    public static volatile OutreachRecordDatabase LLILLJJLI;
    public static final List<AbstractC796510VMj> LLILLL;

    public abstract InterfaceC808060Vmu LIZ();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0VKE] */
    static {
        final AFwS247S0000000_13 aFwS247S0000000_13 = AFwS247S0000000_13.get$arr$(22);
        LLILLL = Collections.singletonList(new AbstractC796510VMj(aFwS247S0000000_13) { // from class: X.0VKD
            public final Function1<C0VLF, Unit> LIZ;

            {
                super(1, 2);
                this.LIZ = aFwS247S0000000_13;
            }

            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                this.LIZ.invoke(c0vlf);
            }
        });
    }
}
