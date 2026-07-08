package com.orbu.core.init;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class HardBlockConfig {

    @C09CT("allowed_code_list")
    public final List<Integer> allowedCodeList;

    @C09CT("allowed_dfid_list")
    public final List<String> allowedDFIDList;

    @C09CT("block_channel_list")
    public final List<String> blockChannelList;

    @C09CT("enable_cleanup_on_rule_mismatch")
    public final boolean enableCleanupOnRuleMismatch;

    @C09CT("enable_unblock_on_rule_mismatch")
    public final boolean enableUnBlockOnRuleMismatch;

    @C09CT("target_rule_hash_list")
    public final List<String> targetBlockRuleHashList;

    @C09CT("target_rule_group_list")
    public final List<String> targetRuleGroupList;

    public HardBlockConfig(List<String> list, List<Integer> list2, List<String> list3, List<String> list4, List<String> list5, boolean z, boolean z2) {
        this.blockChannelList = list;
        this.allowedCodeList = list2;
        this.allowedDFIDList = list3;
        this.targetRuleGroupList = list4;
        this.targetBlockRuleHashList = list5;
        this.enableCleanupOnRuleMismatch = z;
        this.enableUnBlockOnRuleMismatch = z2;
    }
}
