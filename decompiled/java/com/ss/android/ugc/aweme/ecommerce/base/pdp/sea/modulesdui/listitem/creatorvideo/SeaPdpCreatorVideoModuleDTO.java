package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo;

import X.C09CT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpCreatorVideoModuleDTO {

    @C09CT("da_info")
    public final Map<String, Object> daInfo;

    @C09CT("recommend_scene")
    public final String recommendScene;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("module_title")
    public final String title;

    @C09CT("video_ids")
    public final String videoIds;

    @C09CT("videos")
    public final List<SeaPdpCreatorVideoCardDTO> videos;

    public SeaPdpCreatorVideoModuleDTO() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpCreatorVideoModuleDTO)) {
            return false;
        }
        SeaPdpCreatorVideoModuleDTO seaPdpCreatorVideoModuleDTO = (SeaPdpCreatorVideoModuleDTO) obj;
        return Intrinsics.LJFF(this.title, seaPdpCreatorVideoModuleDTO.title) && Intrinsics.LJFF(this.videoIds, seaPdpCreatorVideoModuleDTO.videoIds) && Intrinsics.LJFF(this.videos, seaPdpCreatorVideoModuleDTO.videos) && Intrinsics.LJFF(this.daInfo, seaPdpCreatorVideoModuleDTO.daInfo) && Intrinsics.LJFF(this.sessionId, seaPdpCreatorVideoModuleDTO.sessionId) && Intrinsics.LJFF(this.recommendScene, seaPdpCreatorVideoModuleDTO.recommendScene);
    }

    public SeaPdpCreatorVideoModuleDTO(String str, String str2, List<SeaPdpCreatorVideoCardDTO> list, Map<String, ? extends Object> map, String str3, String str4) {
        this.title = str;
        this.videoIds = str2;
        this.videos = list;
        this.daInfo = map;
        this.sessionId = str3;
        this.recommendScene = str4;
    }
}
