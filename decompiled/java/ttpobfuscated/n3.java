package ttpobfuscated;

import java.util.Date;

/* JADX INFO: loaded from: classes14.dex */
public final class n3 {
    public final Date a(Long l) {
        if (l != null) {
            return new Date(l.longValue());
        }
        return null;
    }

    public final Long a(Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }
}
