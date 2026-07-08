package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BulletinNewsAllowlistResponse extends BaseResponse implements Serializable {

    @C09CT("domain_allowlist")
    public final List<String> domainAllowlist;

    public BulletinNewsAllowlistResponse() {
        this(null);
    }

    public final BulletinNewsAllowlistResponse copy(List<String> list) {
        return new BulletinNewsAllowlistResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BulletinNewsAllowlistResponse) && Intrinsics.LJFF(this.domainAllowlist, ((BulletinNewsAllowlistResponse) obj).domainAllowlist);
    }

    public int hashCode() {
        List<String> list = this.domainAllowlist;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinNewsAllowlistResponse(domainAllowlist=");
        sbLIZ.append(this.domainAllowlist);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<String> getDomainAllowlist() {
        return this.domainAllowlist;
    }

    public BulletinNewsAllowlistResponse(List<String> list) {
        this.domainAllowlist = list;
    }
}
