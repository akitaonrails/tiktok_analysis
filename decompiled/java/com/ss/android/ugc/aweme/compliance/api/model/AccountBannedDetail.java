package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AccountBannedDetail extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("ban_infos")
    public final List<BanInfo> banInfos;

    public final AccountBannedDetail copy(List<BanInfo> list) {
        return new AccountBannedDetail(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountBannedDetail) && Intrinsics.LJFF(this.banInfos, ((AccountBannedDetail) obj).banInfos);
    }

    public int hashCode() {
        List<BanInfo> list = this.banInfos;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AccountBannedDetail(banInfos=");
        sbLIZ.append(this.banInfos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AccountBannedDetail() {
        this(new ArrayList());
    }

    public final List<BanInfo> getBanInfos() {
        return this.banInfos;
    }

    public AccountBannedDetail(List<BanInfo> list) {
        this.banInfos = list;
    }
}
