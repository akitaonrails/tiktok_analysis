package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo;

import X.C098200Yq;
import X.C09CT;
import X.C1741890vQh;
import X.C189200o6;
import X.C2097608Jq;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpCreatorVideoCardDTO {

    @C09CT("creator_avatar")
    public final Image creatorAvatar;

    @C09CT("creator_name")
    public final String creatorName;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("thumbnail")
    public final Image poster;

    @C09CT("video_schema")
    public final String schema;

    @C09CT("aweme_id")
    public final String vid;

    @C09CT("video_title")
    public final String videoTitle;

    public SeaPdpCreatorVideoCardDTO() {
        this(null, null, null, null, null, null, null);
    }

    public final Map<String, Object> LIZ() {
        Object c098200Yq;
        try {
            String str = this.daInfo;
            c098200Yq = str != null ? C1741890vQh.LJIIJ(str) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        HashMap map = (HashMap) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        return map == null ? C2097608Jq.LJ() : map;
    }

    public SeaPdpCreatorVideoCardDTO(String str, String str2, String str3, Image image, Image image2, String str4, String str5) {
        this.schema = str;
        this.vid = str2;
        this.creatorName = str3;
        this.creatorAvatar = image;
        this.poster = image2;
        this.videoTitle = str4;
        this.daInfo = str5;
    }
}
