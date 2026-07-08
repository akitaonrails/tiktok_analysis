package com.ss.android.ugc.aweme.emoji.common.emojichoose.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ResourcesResponse extends BaseResponse {

    @C09CT("navi_stickers")
    public final List<Resources> naviStickers;

    @C09CT("resources")
    public final List<Resources> resources;

    public final List<Resources> getNaviStickers() {
        return this.naviStickers;
    }

    public final List<Resources> getResources() {
        return this.resources;
    }
}
