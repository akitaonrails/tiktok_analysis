package com.bytedance.android.sdk.ticketguard;

import X.C09CT;
import X.C0XNC;
import X.C0XNK;
import X.C0XNP;
import java.util.Date;

/* JADX INFO: loaded from: classes14.dex */
public class LocalSnapshot {

    @C09CT("create_at")
    public final String create_at;

    @C09CT("local_public_key_ree")
    public final String local_public_key_ree;

    @C09CT("timestamp")
    public final long timestamp;

    public LocalSnapshot() {
        String base64ReePub;
        String strLIZ;
        C0XNK c0xnk = C0XNC.LIZ;
        this.local_public_key_ree = (c0xnk == null || (base64ReePub = c0xnk.getBase64ReePub()) == null || (strLIZ = C0XNP.LIZ(base64ReePub)) == null) ? "" : strLIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.timestamp = jCurrentTimeMillis;
        this.create_at = C0XNP.LIZ.format(new Date(jCurrentTimeMillis));
    }
}
