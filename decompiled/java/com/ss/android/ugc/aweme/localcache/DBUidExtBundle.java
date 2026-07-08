package com.ss.android.ugc.aweme.localcache;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes10.dex */
public class DBUidExtBundle {

    @C09CT("cold_cache_aids")
    public String coldCacheAids;

    @C09CT("cur_uid_all_aids")
    public String curUidAllAids;

    @C09CT("eliminate_aids")
    public String eliminateAids;

    @C09CT("for_other_aids")
    public String forOtherAids;

    @C09CT("uid")
    public String uid;

    @C09CT("unconsumed_cache_aids")
    public String unconsumedCacheAids;

    @C09CT("version")
    public final int version;

    public DBUidExtBundle() {
        this(1, "", "", "", "", "", "");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uid='");
        sbLIZ.append(this.uid);
        sbLIZ.append("', curUidAllAids='");
        sbLIZ.append(this.curUidAllAids);
        sbLIZ.append("', \ncoldCacheAids='");
        sbLIZ.append(this.coldCacheAids);
        sbLIZ.append("', \nforOtherAids='");
        sbLIZ.append(this.forOtherAids);
        sbLIZ.append("', \nunconsumedCacheAids='");
        sbLIZ.append(this.unconsumedCacheAids);
        sbLIZ.append("', eliminateAids='");
        sbLIZ.append(this.eliminateAids);
        sbLIZ.append('\'');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DBUidExtBundle(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.version = i;
        this.uid = str;
        this.curUidAllAids = str2;
        this.forOtherAids = str3;
        this.coldCacheAids = str4;
        this.unconsumedCacheAids = str5;
        this.eliminateAids = str6;
    }
}
