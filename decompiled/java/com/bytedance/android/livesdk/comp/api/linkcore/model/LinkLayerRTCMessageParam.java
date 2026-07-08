package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkLayerRTCMessageParam {

    @C09CT("content_positions")
    public ArrayList<LinkLayerRTCMessageContent> contentList;

    @C09CT("support_state_consistency")
    public final boolean is_state_supported;

    @C09CT("layout_id")
    public String layoutId;

    @C09CT("layout_scene")
    public int layoutScene;

    @C09CT("scene_version")
    public int sceneVersion;

    @C09CT("users")
    public final ArrayList<LinkLayerRTCMessageUser> users;

    @C09CT("zoomed_linkmic_id")
    public String zoomLinkMicId;

    public LinkLayerRTCMessageParam() {
        this("", 4, 1, new ArrayList(), null, "", false);
    }

    public final boolean is_state_supported() {
        return this.is_state_supported;
    }

    public final void setContentList(ArrayList<LinkLayerRTCMessageContent> arrayList) {
        this.contentList = arrayList;
    }

    public final void setLayoutId(String str) {
        this.layoutId = str;
    }

    public final void setLayoutScene(int i) {
        this.layoutScene = i;
    }

    public final void setSceneVersion(int i) {
        this.sceneVersion = i;
    }

    public final void setZoomLinkMicId(String str) {
        this.zoomLinkMicId = str;
    }

    public LinkLayerRTCMessageParam(String str, int i, int i2, ArrayList<LinkLayerRTCMessageUser> arrayList, ArrayList<LinkLayerRTCMessageContent> arrayList2, String str2, boolean z) {
        this.layoutId = str;
        this.layoutScene = i;
        this.sceneVersion = i2;
        this.users = arrayList;
        this.contentList = arrayList2;
        this.zoomLinkMicId = str2;
        this.is_state_supported = z;
    }
}
