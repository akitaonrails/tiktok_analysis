package com.ss.android.ugc.aweme.ecommerce.video.dto;

import X.C09CT;
import X.C13BV;
import com.bytedance.scene.Scene;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class CommonFeedRequest {

    @C09CT("context_product_ids")
    public final List<Long> contextProductIDS;

    @C09CT("cursor")
    public final int cursor;

    @C09CT("exposure_item_list")
    public final List<RecommendFeedModel> exposureItemList;

    @C09CT("page_name")
    public final String pageName;

    @C09CT("related_gid")
    public final long relatedGID;

    @C09CT("request_type")
    public final int request_type;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("size")
    public final int size;

    public final List<Long> getContextProductIDS() {
        return this.contextProductIDS;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final List<RecommendFeedModel> getExposureItemList() {
        return this.exposureItemList;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final long getRelatedGID() {
        return this.relatedGID;
    }

    public final int getRequest_type() {
        return this.request_type;
    }

    public final String getScene() {
        return this.scene;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSize() {
        return this.size;
    }

    public CommonFeedRequest(String str, int i, int i2, int i3, String str2, long j, List<Long> list, List<RecommendFeedModel> list2, String str3) {
        this.scene = str;
        this.request_type = i;
        this.size = i2;
        this.cursor = i3;
        this.sessionId = str2;
        this.relatedGID = j;
        this.contextProductIDS = list;
        this.exposureItemList = list2;
        this.pageName = str3;
    }

    public CommonFeedRequest(String str, int i, int i2, int i3, String str2, long j, List list, List list2, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, (i4 & 16) != 0 ? null : str2, (i4 & 32) != 0 ? 0L : j, (i4 & 64) != 0 ? C13BV.INSTANCE : list, (i4 & 128) != 0 ? C13BV.INSTANCE : list2, (i4 & 256) == 0 ? str3 : null);
    }
}
