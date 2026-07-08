package com.bytedance.geckox.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class CleanPolicyModel {

    @C09CT("group_clean")
    public GroupCleanPolicy groupClean;

    @C09CT("specified_clean")
    public List<ChannelCleanPolicy> specifiedClean;

    public static class GroupCleanPolicy {

        @C09CT("limit")
        public int limit;

        @C09CT("policy")
        public int policy;

        @C09CT("rule")
        public int rule;
    }

    public class ChannelCleanPolicy {

        @C09CT("c")
        public String channel;

        @C09CT("clean_type")
        public int cleanType;

        @C09CT("err_code")
        public int errCode;

        @C09CT("err_msg")
        public String errMsg;

        @C09CT("pkg_id")
        public int pkgId;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("version")
        public List<Long> versions;

        public ChannelCleanPolicy(CleanPolicyModel cleanPolicyModel) {
        }
    }
}
