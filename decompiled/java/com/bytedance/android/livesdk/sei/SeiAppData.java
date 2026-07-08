package com.bytedance.android.livesdk.sei;

import X.C09CT;
import X.C2188811AlT;
import X.C940690aaR;
import X.InterfaceC940430aa1;
import android.os.Build;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes16.dex */
public class SeiAppData implements InterfaceC940430aa1 {
    public List<PosIdentity> LIZ;

    @C09CT("anchor_link_mic_id")
    public String anchorLinkMicId;

    @C09CT("business_extra_info")
    public Map<String, Map<String, String>> businessExtraInfo;

    @C09CT("canvas")
    public SeiCanvas canvas;

    @C09CT("channel_id")
    public String channelId;

    @C09CT("DSLData")
    public SeiDsl dsl;

    @C09CT("e_grids")
    public List<SeiEmptyRegion> emptyGrids;

    @C09CT("grids")
    public List<SeiRegion> grids;

    @C09CT("group_channel_id")
    public String groupChannelId;

    @C09CT("link_condition")
    public int linkCondition;

    @C09CT("container")
    public SeiContainerInfo linkMicContainer;

    @C09CT("linker_arch_type")
    public int linkerArchType;

    @C09CT("linker_mode")
    public int linkerMode;

    @C09CT("local_change_linkmic_ids")
    public List<String> localChangeLinkMicIds;

    @C09CT("ui_pos")
    public List<SeiSpotInfo> spotInfos;

    @C09CT("timestamp")
    public long timestamp;

    @C09CT("zoomed_linkmic_id")
    public String zoomedLinkmicId;

    @C09CT("zoomed_position")
    public String zoomedPosition;

    @C09CT("zps")
    public List<PosIdentity> zoomedPositions;

    @C09CT("ver")
    public int version = -1;

    @C09CT("arch_ver")
    public int archVersion = -1;

    @C09CT("link_condition_v2")
    public int linkConditionV2 = -1;

    @C09CT("battle_id")
    public long battleId = -1;

    @C09CT("container_offset_y")
    public float containerOffsetY = -1.0f;

    @Override // X.InterfaceC940430aa1
    public final SeiAppData LIZ() {
        return this;
    }

    public final int LJIIJ() {
        SeiDsl seiDsl = this.dsl;
        if (seiDsl != null) {
            return seiDsl.scene;
        }
        return 0;
    }

    public final List<SeiSpotInfo> LJIIL() {
        List<SeiSpotInfo> list = this.spotInfos;
        return list == null ? new ArrayList() : list;
    }

    public final List<PosIdentity> LJIILIIL() {
        if (this.spotInfos == null) {
            return new ArrayList();
        }
        List<PosIdentity> list = this.LIZ;
        if (list != null) {
            return list;
        }
        this.LIZ = new ArrayList();
        for (SeiSpotInfo seiSpotInfo : this.spotInfos) {
            List<PosIdentity> list2 = this.LIZ;
            seiSpotInfo.getClass();
            PosIdentity posIdentity = new PosIdentity();
            posIdentity.type = seiSpotInfo.type;
            posIdentity.value = seiSpotInfo.value;
            ((ArrayList) list2).add(posIdentity);
        }
        return this.LIZ;
    }

    public final String LJIILJJIL() {
        if (this.zoomedPosition == null) {
            this.zoomedPosition = "";
        }
        return this.zoomedPosition;
    }

    public final boolean LJIJ() {
        return this.archVersion == 1;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.version), this.channelId, this.zoomedPositions, this.grids, this.canvas, this.dsl, this.anchorLinkMicId, this.zoomedLinkmicId, LJIILJJIL());
    }

    @Override // X.InterfaceC940430aa1
    public final Map<String, Integer> LIZJ() {
        return Collections.emptyMap();
    }

    @Override // X.InterfaceC940430aa1
    public final List<String> LJ() {
        return Collections.emptyList();
    }

    @Override // X.InterfaceC940430aa1
    public final Map<String, C940690aaR> LJI() {
        return Collections.emptyMap();
    }

    public final int LJIIIZ() {
        int iLJIIJ = LJIIJ();
        if (!LJIJ()) {
            return iLJIIJ;
        }
        if (LJIILL()) {
            return 2;
        }
        if (LJIILLIIL()) {
            return 4;
        }
        return iLJIIJ;
    }

    public final boolean LJIILL() {
        return LJIJ() ? this.linkerArchType == 2 : LJIIJ() == 2;
    }

    public final boolean LJIILLIIL() {
        return LJIJ() ? this.linkerArchType == 1 : LJIIJ() == 4;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeiAppData{version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(", channelId='");
        sbLIZ.append(this.channelId);
        sbLIZ.append('\'');
        sbLIZ.append(", groupChannelId='");
        sbLIZ.append(this.groupChannelId);
        sbLIZ.append('\'');
        sbLIZ.append(", grids=");
        sbLIZ.append(this.grids);
        sbLIZ.append(", canvas=");
        sbLIZ.append(this.canvas);
        sbLIZ.append(", linkCondition=");
        sbLIZ.append(this.linkCondition);
        sbLIZ.append(", linkConditionV2=");
        sbLIZ.append(this.linkConditionV2);
        sbLIZ.append(", battleId=");
        sbLIZ.append(this.battleId);
        sbLIZ.append(", dsl=");
        sbLIZ.append(this.dsl);
        sbLIZ.append(", anchorLinkMicId='");
        sbLIZ.append(this.anchorLinkMicId);
        sbLIZ.append('\'');
        sbLIZ.append(", zoomedLinkmicId='");
        sbLIZ.append(this.zoomedLinkmicId);
        sbLIZ.append('\'');
        sbLIZ.append(", zoomedPosition='");
        sbLIZ.append(this.zoomedPosition);
        sbLIZ.append('\'');
        sbLIZ.append(", zoomedPositions=");
        sbLIZ.append(this.zoomedPositions);
        sbLIZ.append(", uiPos=");
        sbLIZ.append(this.spotInfos);
        sbLIZ.append(", linkerArchType=");
        sbLIZ.append(this.linkerArchType);
        sbLIZ.append(", localChangeLinkMicIds=");
        sbLIZ.append(this.localChangeLinkMicIds);
        sbLIZ.append(", containerOffsetY=");
        sbLIZ.append(this.containerOffsetY);
        sbLIZ.append(", businessExtraInfo=");
        sbLIZ.append(this.businessExtraInfo);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC940430aa1
    public final String LIZIZ() {
        return this.anchorLinkMicId;
    }

    @Override // X.InterfaceC940430aa1
    public final String LIZLLL() {
        return this.groupChannelId;
    }

    @Override // X.InterfaceC940430aa1
    public final Map<String, Map<String, String>> LJFF() {
        return this.businessExtraInfo;
    }

    @Override // X.InterfaceC940430aa1
    public final SeiDsl LJII() {
        return this.dsl;
    }

    @Override // X.InterfaceC940430aa1
    public final String U3() {
        return this.channelId;
    }

    @Override // X.InterfaceC940430aa1
    public final long timestamp() {
        return this.timestamp;
    }

    @Override // X.InterfaceC940430aa1
    public final int version() {
        return this.version;
    }

    public static List LJIIJJI(List list) {
        if (SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_sei_list_equal_opt", false) && list != null && !list.isEmpty() && Build.VERSION.SDK_INT >= 24) {
            return (List) list.stream().sorted().collect(Collectors.toList());
        }
        return list;
    }

    public final boolean LJIIIIZZ(SeiAppData seiAppData) {
        if (this == seiAppData) {
            return true;
        }
        if ((seiAppData instanceof SeiAppData) && this.linkConditionV2 == seiAppData.linkConditionV2 && this.linkCondition == seiAppData.linkCondition && this.version == seiAppData.version && Objects.equals(this.channelId, seiAppData.channelId) && Objects.equals(this.zoomedPositions, seiAppData.zoomedPositions) && Objects.equals(this.canvas, seiAppData.canvas) && Objects.equals(this.dsl, seiAppData.dsl) && Objects.equals(this.anchorLinkMicId, seiAppData.anchorLinkMicId) && this.battleId == seiAppData.battleId && this.containerOffsetY == seiAppData.containerOffsetY && this.linkerArchType == seiAppData.linkerArchType && Objects.equals(this.businessExtraInfo, seiAppData.businessExtraInfo) && Objects.equals(this.zoomedLinkmicId, seiAppData.zoomedLinkmicId) && Objects.equals(LJIIJJI(this.localChangeLinkMicIds), LJIIJJI(seiAppData.localChangeLinkMicIds)) && Objects.equals(this.spotInfos, seiAppData.spotInfos) && Objects.equals(LJIILJJIL(), seiAppData.LJIILJJIL())) {
            List listLJIIJJI = LJIIJJI(this.grids);
            List listLJIIJJI2 = LJIIJJI(seiAppData.grids);
            if (listLJIIJJI != null && listLJIIJJI2 != null && listLJIIJJI.size() == listLJIIJJI2.size()) {
                for (int i = 0; i < listLJIIJJI.size(); i++) {
                    SeiRegion seiRegion = (SeiRegion) ListProtector.get(listLJIIJJI, i);
                    SeiRegion seiRegion2 = (SeiRegion) ListProtector.get(listLJIIJJI2, i);
                    if (seiRegion != null && seiRegion2 != null && Double.compare(seiRegion.width, seiRegion2.width) == 0 && Double.compare(seiRegion.height, seiRegion2.height) == 0 && Double.compare(seiRegion.x, seiRegion2.x) == 0 && Double.compare(seiRegion.y, seiRegion2.y) == 0 && seiRegion2.position == seiRegion.position && seiRegion2.muteVideoBool == seiRegion.muteVideoBool && seiRegion2.muteAudioBool == seiRegion.muteAudioBool && Objects.equals(seiRegion2.uidStr, seiRegion.uidStr) && seiRegion2.onlineUserState == seiRegion.onlineUserState && seiRegion2.audioOccupied == seiRegion.audioOccupied && Objects.equals(seiRegion2.extraInfo, seiRegion.extraInfo)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean LJIIZILJ(SeiAppData seiAppData) {
        if (seiAppData == null) {
            return true;
        }
        boolean zLJIJ = LJIJ();
        int iLJIIJ = seiAppData.LJIIJ();
        if (!zLJIJ || (iLJIIJ != 2 && iLJIIJ != 4 && iLJIIJ != 0)) {
            if (iLJIIJ != LJIIJ()) {
                return true;
            }
            return false;
        }
        if (seiAppData.linkerMode != this.linkerMode) {
            return true;
        }
        return false;
    }

    public final void LJIJI(List<SeiSpotInfo> list) {
        this.spotInfos = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeiAppData)) {
            return false;
        }
        SeiAppData seiAppData = (SeiAppData) obj;
        if (this.linkConditionV2 == seiAppData.linkConditionV2 && this.linkCondition == seiAppData.linkCondition && this.version == seiAppData.version && Objects.equals(this.channelId, seiAppData.channelId) && Objects.equals(this.zoomedPositions, seiAppData.zoomedPositions) && Objects.equals(LJIIJJI(this.grids), LJIIJJI(seiAppData.grids)) && Objects.equals(this.canvas, seiAppData.canvas) && Objects.equals(this.dsl, seiAppData.dsl) && Objects.equals(this.anchorLinkMicId, seiAppData.anchorLinkMicId) && this.battleId == seiAppData.battleId && this.containerOffsetY == seiAppData.containerOffsetY && this.linkerArchType == seiAppData.linkerArchType && Objects.equals(this.businessExtraInfo, seiAppData.businessExtraInfo) && Objects.equals(this.zoomedLinkmicId, seiAppData.zoomedLinkmicId) && Objects.equals(LJIIJJI(this.localChangeLinkMicIds), LJIIJJI(seiAppData.localChangeLinkMicIds)) && Objects.equals(this.spotInfos, seiAppData.spotInfos) && Objects.equals(LJIILJJIL(), seiAppData.LJIILJJIL())) {
            return true;
        }
        return false;
    }
}
