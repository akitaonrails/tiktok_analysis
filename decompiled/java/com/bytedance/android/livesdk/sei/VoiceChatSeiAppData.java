package com.bytedance.android.livesdk.sei;

import X.C09CT;
import X.C15438062q;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C940690aaR;
import X.InterfaceC940430aa1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class VoiceChatSeiAppData implements InterfaceC940430aa1 {

    @C09CT("anchor_link_mic_id")
    public final String anchorLinkMicId;

    @C09CT("business_extra_info")
    public final Map<String, Map<String, String>> businessExtraInfo;

    @C09CT("channel_id")
    public final String channelId;

    @C09CT("DSLData")
    public final SeiDsl dsl;

    @C09CT("e_grids")
    public final List<SeiEmptyRegion> emptyGrids;

    @C09CT("grids")
    public final List<VoiceChatSeiRegion> grids;

    @C09CT("container")
    public final SeiContainerInfo linkMicContainer;

    @C09CT("ui_pos")
    public final List<SeiSpotInfo> spotInfos;

    @C09CT("timestamp")
    public final long timestamp;

    @C09CT("ver")
    public final int ver;

    public VoiceChatSeiAppData() {
        this(-1, -1L, null, new ArrayList(), null, null, null, null, null, null);
    }

    @Override // X.InterfaceC940430aa1
    public final SeiAppData LIZ() {
        return null;
    }

    @Override // X.InterfaceC940430aa1
    public final String LIZLLL() {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceChatSeiAppData(ver=");
        sbLIZ.append(this.ver);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.channelId);
        sbLIZ.append(", grids=");
        sbLIZ.append(this.grids);
        sbLIZ.append(", dsl=");
        sbLIZ.append(this.dsl);
        sbLIZ.append(", anchorLinkMicId=");
        sbLIZ.append(this.anchorLinkMicId);
        sbLIZ.append(", businessExtraInfo=");
        sbLIZ.append(this.businessExtraInfo);
        sbLIZ.append(", spotInfos=");
        sbLIZ.append(this.spotInfos);
        sbLIZ.append(", emptyGrids=");
        sbLIZ.append(this.emptyGrids);
        sbLIZ.append(", linkMicContainer=");
        sbLIZ.append(this.linkMicContainer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC940430aa1
    public final Map<String, Integer> LIZJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (VoiceChatSeiRegion voiceChatSeiRegion : this.grids) {
            String str = voiceChatSeiRegion.linkMicId;
            if (str != null) {
                linkedHashMap.put(str, Integer.valueOf(voiceChatSeiRegion.position));
            }
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC940430aa1
    public final List<String> LJ() {
        List<VoiceChatSeiRegion> list = this.grids;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<VoiceChatSeiRegion> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().linkMicId);
        }
        return arrayList;
    }

    @Override // X.InterfaceC940430aa1
    public final Map<String, C940690aaR> LJI() {
        HashMap map = new HashMap();
        for (VoiceChatSeiRegion voiceChatSeiRegion : this.grids) {
            String str = voiceChatSeiRegion.linkMicId;
            if (str != null) {
                map.put(str, new C940690aaR(voiceChatSeiRegion.isMuteAudio, voiceChatSeiRegion.isAudioOccupied, voiceChatSeiRegion.onLineUserState, voiceChatSeiRegion.talkVolume));
            }
        }
        return map;
    }

    public final int hashCode() {
        int iY2 = ((this.ver * 31) + C786410Ut5.Y2(this.timestamp)) * 31;
        String str = this.channelId;
        int iHashCode = (((iY2 + (str != null ? str.hashCode() : 0)) * 31) + this.grids.hashCode()) * 31;
        SeiDsl seiDsl = this.dsl;
        int iHashCode2 = (iHashCode + (seiDsl != null ? seiDsl.hashCode() : 0)) * 31;
        String str2 = this.anchorLinkMicId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.InterfaceC940430aa1
    public final String LIZIZ() {
        return this.anchorLinkMicId;
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
        return this.ver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceChatSeiAppData)) {
            return false;
        }
        VoiceChatSeiAppData voiceChatSeiAppData = (VoiceChatSeiAppData) obj;
        if (voiceChatSeiAppData.ver == this.ver && Intrinsics.LJFF(voiceChatSeiAppData.channelId, this.channelId) && Intrinsics.LJFF(voiceChatSeiAppData.anchorLinkMicId, this.anchorLinkMicId) && Objects.equals(voiceChatSeiAppData.dsl, this.dsl) && Objects.equals(voiceChatSeiAppData.grids, this.grids)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceChatSeiAppData(int i, long j, String str, List<VoiceChatSeiRegion> list, SeiDsl seiDsl, String str2, Map<String, ? extends Map<String, String>> map, List<SeiSpotInfo> list2, List<SeiEmptyRegion> list3, SeiContainerInfo seiContainerInfo) {
        this.ver = i;
        this.timestamp = j;
        this.channelId = str;
        this.grids = list;
        this.dsl = seiDsl;
        this.anchorLinkMicId = str2;
        this.businessExtraInfo = map;
        this.spotInfos = list2;
        this.emptyGrids = list3;
        this.linkMicContainer = seiContainerInfo;
    }
}
