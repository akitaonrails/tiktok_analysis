package com.bytedance.helios.network.api.config;

import X.C08CX;
import X.C09CT;
import X.C13LQ;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class AgControlConfig {

    @C09CT("ag_control_enable")
    public boolean agControlEnable;

    @C09CT("ag_control_schema")
    public final NetworkCondition agControlList;

    @C09CT("ag_control_strategy")
    public Set<String> agControlStrategyEnable;

    @C09CT("ag_hybrid_allow_site")
    public final Set<String> agHybridAllowSite;

    @C09CT("all_block_list")
    public final NetworkCondition allBlockList;

    @C09CT("cdn_allow_list")
    public final NetworkCondition cdnAllowList;

    @C09CT("cdn_domain_allow_list")
    public final Set<String> cdnDomainAllowList;

    @C09CT("cdn_domain_list")
    public final Set<String> cdnDomainList;

    @C09CT("cookie_store_region_allow_list")
    public final NetworkCondition cookieStoreRegionAllowList;

    @C09CT("cookie_store_region_block_list")
    public final NetworkCondition cookieStoreRegionBlockList;

    @C09CT("hybrid_block_list")
    public final NetworkCondition hybridBlockList;

    @C09CT("is_block_bd_1st")
    public boolean isBlockBd1st;

    @C09CT("native_block_list")
    public final NetworkCondition nativeBlockList;

    @C09CT("report_only_when_block")
    public boolean reportOnlyWhenBlock;

    @C09CT("skip_for_special_ua")
    public boolean skipForSpecialUA;

    @C09CT("vgeo_domain_list")
    public final Set<String> vgeoDomainList;

    public AgControlConfig() {
        this(false, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgControlConfig)) {
            return false;
        }
        AgControlConfig agControlConfig = (AgControlConfig) obj;
        return this.agControlEnable == agControlConfig.agControlEnable && this.isBlockBd1st == agControlConfig.isBlockBd1st && this.reportOnlyWhenBlock == agControlConfig.reportOnlyWhenBlock && Intrinsics.LJFF(this.agControlStrategyEnable, agControlConfig.agControlStrategyEnable) && this.skipForSpecialUA == agControlConfig.skipForSpecialUA && Intrinsics.LJFF(this.agControlList, agControlConfig.agControlList) && Intrinsics.LJFF(this.cdnDomainList, agControlConfig.cdnDomainList) && Intrinsics.LJFF(this.cdnDomainAllowList, agControlConfig.cdnDomainAllowList) && Intrinsics.LJFF(this.cdnAllowList, agControlConfig.cdnAllowList) && Intrinsics.LJFF(this.cookieStoreRegionAllowList, agControlConfig.cookieStoreRegionAllowList) && Intrinsics.LJFF(this.cookieStoreRegionBlockList, agControlConfig.cookieStoreRegionBlockList) && Intrinsics.LJFF(this.vgeoDomainList, agControlConfig.vgeoDomainList) && Intrinsics.LJFF(this.agHybridAllowSite, agControlConfig.agHybridAllowSite) && Intrinsics.LJFF(this.allBlockList, agControlConfig.allBlockList) && Intrinsics.LJFF(this.hybridBlockList, agControlConfig.hybridBlockList) && Intrinsics.LJFF(this.nativeBlockList, agControlConfig.nativeBlockList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    public final int hashCode() {
        boolean z = this.agControlEnable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isBlockBd1st;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = (i + r02) * 31;
        boolean z3 = this.reportOnlyWhenBlock;
        ?? r03 = z3;
        if (z3) {
            r03 = 1;
        }
        int iHashCode = (((((((((((i2 + r03) * 31) + this.agControlStrategyEnable.hashCode()) * 31) + (this.skipForSpecialUA ? 1 : 0)) * 31) + this.agControlList.hashCode()) * 31) + this.cdnDomainList.hashCode()) * 31) + this.cdnDomainAllowList.hashCode()) * 31;
        NetworkCondition networkCondition = this.cdnAllowList;
        return ((((((((((((((iHashCode + (networkCondition == null ? 0 : networkCondition.hashCode())) * 31) + this.cookieStoreRegionAllowList.hashCode()) * 31) + this.cookieStoreRegionBlockList.hashCode()) * 31) + this.vgeoDomainList.hashCode()) * 31) + this.agHybridAllowSite.hashCode()) * 31) + this.allBlockList.hashCode()) * 31) + this.hybridBlockList.hashCode()) * 31) + this.nativeBlockList.hashCode();
    }

    public final String toString() {
        return "AgControlConfig(agControlEnable=" + this.agControlEnable + ", isBlockBd1st=" + this.isBlockBd1st + ", reportOnlyWhenBlock=" + this.reportOnlyWhenBlock + ", agControlStrategyEnable=" + this.agControlStrategyEnable + ", skipForSpecialUA=" + this.skipForSpecialUA + ", agControlList=" + this.agControlList + ", cdnDomainList=" + this.cdnDomainList + ", cdnDomainAllowList=" + this.cdnDomainAllowList + ", cdnAllowList=" + this.cdnAllowList + ", cookieStoreRegionAllowList=" + this.cookieStoreRegionAllowList + ", cookieStoreRegionBlockList=" + this.cookieStoreRegionBlockList + ", vgeoDomainList=" + this.vgeoDomainList + ", agHybridAllowSite=" + this.agHybridAllowSite + ", allBlockList=" + this.allBlockList + ", hybridBlockList=" + this.hybridBlockList + ", nativeBlockList=" + this.nativeBlockList + ')';
    }

    public AgControlConfig(boolean z, boolean z2, boolean z3, Set<String> set, boolean z4, NetworkCondition networkCondition, Set<String> set2, Set<String> set3, NetworkCondition networkCondition2, NetworkCondition networkCondition3, NetworkCondition networkCondition4, Set<String> set4, Set<String> set5, NetworkCondition networkCondition5, NetworkCondition networkCondition6, NetworkCondition networkCondition7) {
        this.agControlEnable = z;
        this.isBlockBd1st = z2;
        this.reportOnlyWhenBlock = z3;
        this.agControlStrategyEnable = set;
        this.skipForSpecialUA = z4;
        this.agControlList = networkCondition;
        this.cdnDomainList = set2;
        this.cdnDomainAllowList = set3;
        this.cdnAllowList = networkCondition2;
        this.cookieStoreRegionAllowList = networkCondition3;
        this.cookieStoreRegionBlockList = networkCondition4;
        this.vgeoDomainList = set4;
        this.agHybridAllowSite = set5;
        this.allBlockList = networkCondition5;
        this.hybridBlockList = networkCondition6;
        this.nativeBlockList = networkCondition7;
    }

    public AgControlConfig(boolean z, boolean z2, boolean z3, Set set, boolean z4, NetworkCondition networkCondition, Set set2, Set set3, NetworkCondition networkCondition2, NetworkCondition networkCondition3, NetworkCondition networkCondition4, Set set4, Set set5, NetworkCondition networkCondition5, NetworkCondition networkCondition6, NetworkCondition networkCondition7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? C13LQ.LJLIIL(new String[]{"1", "2", "3", "4", "5", "6", "8", "9", "10", "11"}) : set, (i & 16) == 0 ? z4 : false, (i & 32) != 0 ? new NetworkCondition(null, null, null, 7, null) : networkCondition, (i & 64) != 0 ? C13LQ.LJLIIL(new String[]{"tiktokcdn-us.com", "tiktokcdn.com", "tiktokcdn-eu.com", "oecstatic.com"}) : set2, (i & 128) != 0 ? C08CX.INSTANCE : set3, (i & 256) != 0 ? null : networkCondition2, (i & 512) != 0 ? new NetworkCondition(null, null, null, 7, null) : networkCondition3, (i & 1024) != 0 ? new NetworkCondition(null, null, null, 7, null) : networkCondition4, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? Collections.singleton("tiktokv.com") : set4, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? Collections.singleton("activity.tiktok.com") : set5, (i & 8192) != 0 ? new NetworkCondition(null, null, null, 7, null) : networkCondition5, (i & 16384) != 0 ? new NetworkCondition(null, null, null, 7, null) : networkCondition6, (i & 32768) != 0 ? new NetworkCondition(null, null, null, 7, null) : networkCondition7);
    }
}
