package com.orbu.core.init;

import X.C13LP;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import ttp.orbu.sdk.Channel;

/* JADX INFO: loaded from: classes14.dex */
public final class HardBlockConfigManager {
    public static final HardBlockConfigManager INSTANCE = new HardBlockConfigManager();
    public static String currentRuleGroup;
    public static volatile HardBlockConfig hardBlockConfig;
    public static boolean isTargetRuleGroup;

    public final boolean enableCleanupOnRuleMismatch() {
        HardBlockConfig hardBlockConfig2 = hardBlockConfig;
        return hardBlockConfig2 != null && hardBlockConfig2.enableCleanupOnRuleMismatch;
    }

    public final void injectNativeConfig() {
        boolean zIsChannelNeedHardBlock = isChannelNeedHardBlock(Channel.NETWORK);
        boolean z = isTargetRuleGroup;
        HardBlockConfig hardBlockConfig2 = hardBlockConfig;
        boolean z2 = false;
        if (hardBlockConfig2 != null && hardBlockConfig2.enableUnBlockOnRuleMismatch) {
            z2 = true;
        }
        HardBlockConfig hardBlockConfig3 = hardBlockConfig;
        List<Integer> list = hardBlockConfig3 != null ? hardBlockConfig3.allowedCodeList : null;
        HardBlockConfig hardBlockConfig4 = hardBlockConfig;
        TTKNativeNetworkManager.setNativeHardBlockConfig(zIsChannelNeedHardBlock, z, z2, list, hardBlockConfig4 != null ? hardBlockConfig4.allowedDFIDList : null);
    }

    public final boolean isTargetRuleGroup() {
        List<String> list;
        List<String> list2;
        List<String> list3;
        HardBlockConfig hardBlockConfig2 = hardBlockConfig;
        if (hardBlockConfig2 != null && (list2 = hardBlockConfig2.targetRuleGroupList) != null && list2.size() == 1) {
            HardBlockConfig hardBlockConfig3 = hardBlockConfig;
            if (Intrinsics.LJFF((hardBlockConfig3 == null || (list3 = hardBlockConfig3.targetRuleGroupList) == null) ? null : ListProtector.get(list3, 0), "*")) {
                return true;
            }
        }
        HardBlockConfig hardBlockConfig4 = hardBlockConfig;
        return (hardBlockConfig4 == null || (list = hardBlockConfig4.targetRuleGroupList) == null || !C13LP.LJJJJ(currentRuleGroup, list)) ? false : true;
    }

    private final void updateConfig() {
        isTargetRuleGroup = isTargetRuleGroup();
        injectNativeConfig();
    }

    public final boolean inTargetBlockRuleHashList(String str) {
        HardBlockConfig hardBlockConfig2;
        List<String> list;
        if (str == null || str.length() == 0 || (hardBlockConfig2 = hardBlockConfig) == null || (list = hardBlockConfig2.targetBlockRuleHashList) == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public final boolean isChannelNeedHardBlock(Channel channel) {
        List<String> list;
        HardBlockConfig hardBlockConfig2 = hardBlockConfig;
        if (hardBlockConfig2 == null || (list = hardBlockConfig2.blockChannelList) == null || !list.contains(channel.name())) {
            return false;
        }
        return true;
    }

    public final void setConfig(HardBlockConfig hardBlockConfig2) {
        hardBlockConfig = hardBlockConfig2;
        updateConfig();
    }

    public final void setCurrentRuleGroup(String str) {
        currentRuleGroup = str;
        updateConfig();
    }

    public final boolean isResultNeedHardBlock(Channel channel, String str, int i) {
        boolean z;
        HardBlockConfig hardBlockConfig2;
        List<Integer> list;
        HardBlockConfig hardBlockConfig3;
        List<Integer> list2;
        List<String> list3;
        if (isChannelNeedHardBlock(channel) && isTargetRuleGroup && (hardBlockConfig2 = hardBlockConfig) != null && (list = hardBlockConfig2.allowedCodeList) != null && (!list.isEmpty()) && (hardBlockConfig3 = hardBlockConfig) != null && (list2 = hardBlockConfig3.allowedCodeList) != null && !list2.contains(Integer.valueOf(i))) {
            HardBlockConfig hardBlockConfig4 = hardBlockConfig;
            if (hardBlockConfig4 != null && (list3 = hardBlockConfig4.allowedDFIDList) != null && !list3.isEmpty()) {
                Iterator<String> it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (u.LJIJI(it2.next(), str, true)) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
        } else {
            z = false;
            break;
        }
        HardBlockConfig hardBlockConfig5 = hardBlockConfig;
        if (hardBlockConfig5 != null && hardBlockConfig5.enableUnBlockOnRuleMismatch) {
            if (z && TTKNativeNetworkManager.inTargetBlockRuleHashList()) {
                return true;
            }
            return false;
        }
        return z;
    }
}
