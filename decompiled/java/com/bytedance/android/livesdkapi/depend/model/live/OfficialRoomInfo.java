package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class OfficialRoomInfo {

    @C09CT("is_show_more_anchor")
    public Boolean isShowMoreAnchor;

    @C09CT("is_use_server_subtitle")
    public Boolean isUseServerSubtitle;

    @C09CT("server_subtitle")
    public String serverSubtitle;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.isShowMoreAnchor != null) {
            sb.append(", is_show_more_anchor=");
            sb.append(this.isShowMoreAnchor);
        }
        if (this.isUseServerSubtitle != null) {
            sb.append(", is_use_server_subtitle=");
            sb.append(this.isUseServerSubtitle);
        }
        if (this.serverSubtitle != null) {
            sb.append(", server_subtitle=");
            sb.append(this.serverSubtitle);
        }
        sb.replace(0, 2, "OfficialRoomInfo{");
        sb.append('}');
        return sb.toString();
    }
}
