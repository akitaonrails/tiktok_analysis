package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;

/* JADX INFO: loaded from: classes32.dex */
public class MusicCollectionItem {

    @C09CT("aweme_cover")
    public UrlModel awemeCover;

    @C09CT("cover")
    public UrlModel cover;

    @C09CT("is_hot")
    public boolean isHot;

    @C09CT("level")
    public int level;

    @C09CT("id_str")
    public String mcId;

    @C09CT("name")
    public String mcName;

    @C09CT("playlist_order")
    public Integer playlistOrder;

    @C09CT("share_info")
    public ShareInfo shareInfo;

    public UrlModel getAwemeCover() {
        return this.awemeCover;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public int getLevel() {
        return this.level;
    }

    public String getMcId() {
        return this.mcId;
    }

    public String getMcName() {
        return this.mcName;
    }

    public Integer getPlaylistOrder() {
        return this.playlistOrder;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public boolean isHot() {
        return this.isHot;
    }

    public void setAwemeCover(UrlModel urlModel) {
        this.awemeCover = urlModel;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setHot(boolean z) {
        this.isHot = z;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setMcId(String str) {
        this.mcId = str;
    }

    public void setMcName(String str) {
        this.mcName = str;
    }

    public void setPlaylistOrder(int i) {
        this.playlistOrder = Integer.valueOf(i);
    }

    public void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }
}
