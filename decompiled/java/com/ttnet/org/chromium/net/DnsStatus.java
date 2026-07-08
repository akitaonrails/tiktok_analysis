package com.ttnet.org.chromium.net;

import X.C0WZX;
import X.C2204961BRm;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.net.InetAddress;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class DnsStatus {
    public final List<InetAddress> LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public byte[][] getDnsServers() {
        byte[][] bArr = new byte[this.LIZ.size()][];
        for (int i = 0; i < this.LIZ.size(); i++) {
            bArr[i] = C2204961BRm.b0((InetAddress) ListProtector.get(this.LIZ, i), new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjmYRB6O5bhhjY", null));
        }
        return bArr;
    }

    public boolean getPrivateDnsActive() {
        return this.LIZIZ;
    }

    public String getPrivateDnsServerName() {
        return this.LIZJ;
    }

    public String getSearchDomains() {
        return this.LIZLLL;
    }

    public DnsStatus(String str, String str2, List list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = str == null ? "" : str;
        this.LIZLLL = str2 == null ? "" : str2;
    }
}
