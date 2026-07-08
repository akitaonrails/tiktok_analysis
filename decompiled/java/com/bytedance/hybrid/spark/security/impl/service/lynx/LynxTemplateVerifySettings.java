package com.bytedance.hybrid.spark.security.impl.service.lynx;

import X.C09CT;
import X.C13BV;
import X.EnumC843650X7r;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class LynxTemplateVerifySettings {

    @C09CT("allow_bucket_list")
    public final List<String> allowBucketList;

    @C09CT("allow_channel_list")
    public final List<String> allowChannelList;

    @C09CT("allow_domain_list")
    public final List<String> allowDomainList;

    @C09CT("allow_no_sign")
    public final boolean allowNoSign;

    @C09CT("block_url_list")
    public final List<String> blockUrlList;

    @C09CT("public_key")
    public final String publicKey;

    @C09CT("sign_verify_mode")
    public final int signVerifyMode;

    public LynxTemplateVerifySettings() {
        this(false, 0, null, null, null, null, null, 127, null);
    }

    public LynxTemplateVerifySettings(boolean z, int i, List<String> list, List<String> list2, List<String> list3, List<String> list4, String str) {
        this.allowNoSign = z;
        this.signVerifyMode = i;
        this.blockUrlList = list;
        this.allowChannelList = list2;
        this.allowDomainList = list3;
        this.allowBucketList = list4;
        this.publicKey = str;
    }

    public LynxTemplateVerifySettings(boolean z, int i, List list, List list2, List list3, List list4, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? EnumC843650X7r.ONLY_REPORT.getCode() : i, (i2 & 4) != 0 ? C13BV.INSTANCE : list, (i2 & 8) != 0 ? C13BV.INSTANCE : list2, (i2 & 16) != 0 ? C13BV.INSTANCE : list3, (i2 & 32) != 0 ? C13BV.INSTANCE : list4, (i2 & 64) != 0 ? "{\"0\":\"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvekhb6Oaujs72xv5MW1iJqD17eE9dgUyEMPBa6RMu4yk8ByG7CeKRl4hFPa7NcF2U79EjKg4lXOh7mtoyPH87ZZSLzdPd3lk4o86saVwoNGNJDUJmYbGjj7331dJLtIw6SGbfHNUcWietWfkjA4nkw2an2d7adbHbDc3MB6G9kxtseUtlMRTYhfRBU9im3kicNv55fhFHbxfMtlaJQGMCiuP4q9ZiLp6+1JQql0UnlZXIN/GZB+/htlh9BRRZfL0bsRpXfVenzM88wB3DUmeTLBy/tPbwzzJm0J1C+Bmf8HmCjJmKNij/bCAOC2L0mSck9OPTQMUoDqPwBgzsYZfnwIDAQAB\"}" : str);
    }
}
