package com.ss.android.ugc.aweme.mix.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MixStruct implements Serializable {

    @C09CT("author")
    public User author;

    @C09CT("creator_name")
    public String creatorName;

    @C09CT("extra")
    public String extra;

    @C09CT("icon")
    public UrlModel icon;

    @C09CT("last_add_video_timestamp")
    public Long lastAddVideoTimestamp;

    @C09CT("mix_id")
    public String mixId;

    @C09CT("mix_label")
    public int mixLabel;

    @C09CT("name")
    public String mixName;

    @C09CT("mix_type")
    public int mixType;

    @C09CT("moderated_rename_timestamp")
    public long moderatedRenameTimestamp;

    @C09CT("mix_name")
    public String name;

    @C09CT("share_info")
    public ShareInfo shareInfo;

    @C09CT("statistic")
    public MixStatisStruct statis;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public MixStatusStruct status;

    public final String getMixName() {
        String str = this.mixName;
        return (str == null || Intrinsics.LJFF(str, "")) ? this.name : this.mixName;
    }

    public final String getName() {
        String str = this.name;
        return (str == null || Intrinsics.LJFF(str, "")) ? this.mixName : this.name;
    }

    public final User getAuthor() {
        return this.author;
    }

    public final String getCreatorName() {
        return this.creatorName;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final Long getLastAddVideoTimestamp() {
        return this.lastAddVideoTimestamp;
    }

    public final int getMixLabel() {
        return this.mixLabel;
    }

    public final int getMixType() {
        return this.mixType;
    }

    public final long getModeratedRenameTimestamp() {
        return this.moderatedRenameTimestamp;
    }

    public final ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final MixStatisStruct getStatis() {
        return this.statis;
    }

    public final MixStatusStruct getStatus() {
        return this.status;
    }

    public final void setAuthor(User user) {
        this.author = user;
    }

    public final void setCreatorName(String str) {
        this.creatorName = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setLastAddVideoTimestamp(Long l) {
        this.lastAddVideoTimestamp = l;
    }

    public final void setMixLabel(int i) {
        this.mixLabel = i;
    }

    public final void setMixName(String str) {
        this.mixName = str;
    }

    public final void setMixType(int i) {
        this.mixType = i;
    }

    public final void setModeratedRenameTimestamp(long j) {
        this.moderatedRenameTimestamp = j;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }

    public final void setStatis(MixStatisStruct mixStatisStruct) {
        this.statis = mixStatisStruct;
    }

    public final void setStatus(MixStatusStruct mixStatusStruct) {
        this.status = mixStatusStruct;
    }
}
