package com.ss.android.ugc.tiktok.tpsc.model;

import X.C09CT;
import X.C2097608Jq;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoItemRestriction implements Serializable {

    @C09CT("allow_ai_remix")
    public final PrivacySettingsRestrictionItem aiRemix;

    @C09CT("comment")
    public final PrivacySettingsRestrictionItem comment;

    @C09CT("content_reuse_permission")
    public final PrivacySettingsRestrictionItem contentReuse;

    @C09CT("duet")
    public final PrivacySettingsRestrictionItem duet;

    @C09CT("geofencing")
    public final PrivacySettingsRestrictionItem geofencing;

    @C09CT("share_to_story")
    public final PrivacySettingsRestrictionItem shareToStory;

    @C09CT("create_sticker")
    public final PrivacySettingsRestrictionItem sticker;

    @C09CT("stitch")
    public final PrivacySettingsRestrictionItem stitch;

    @C09CT("visibility")
    public final PrivacySettingsRestrictionItem visibility;

    public VideoItemRestriction() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoItemRestriction)) {
            return false;
        }
        VideoItemRestriction videoItemRestriction = (VideoItemRestriction) obj;
        return Intrinsics.LJFF(this.duet, videoItemRestriction.duet) && Intrinsics.LJFF(this.stitch, videoItemRestriction.stitch) && Intrinsics.LJFF(this.comment, videoItemRestriction.comment) && Intrinsics.LJFF(this.sticker, videoItemRestriction.sticker) && Intrinsics.LJFF(this.shareToStory, videoItemRestriction.shareToStory) && Intrinsics.LJFF(this.contentReuse, videoItemRestriction.contentReuse) && Intrinsics.LJFF(this.visibility, videoItemRestriction.visibility) && Intrinsics.LJFF(this.geofencing, videoItemRestriction.geofencing) && Intrinsics.LJFF(this.aiRemix, videoItemRestriction.aiRemix);
    }

    public final Map<String, PrivacySettingsRestrictionItem> getRestrictionMap() {
        return C2097608Jq.LJIIIIZZ(new Pair("duet", this.duet), new Pair("stitch", this.stitch), new Pair("comment", this.comment), new Pair("create_sticker", this.sticker), new Pair("share_to_story", this.shareToStory), new Pair("content_reuse_permission", this.contentReuse), new Pair("visibility", this.visibility), new Pair("geofencing", this.geofencing), new Pair("allow_ai_remix", this.aiRemix));
    }

    public VideoItemRestriction(PrivacySettingsRestrictionItem privacySettingsRestrictionItem, PrivacySettingsRestrictionItem privacySettingsRestrictionItem2, PrivacySettingsRestrictionItem privacySettingsRestrictionItem3, PrivacySettingsRestrictionItem privacySettingsRestrictionItem4, PrivacySettingsRestrictionItem privacySettingsRestrictionItem5, PrivacySettingsRestrictionItem privacySettingsRestrictionItem6, PrivacySettingsRestrictionItem privacySettingsRestrictionItem7, PrivacySettingsRestrictionItem privacySettingsRestrictionItem8, PrivacySettingsRestrictionItem privacySettingsRestrictionItem9) {
        this.duet = privacySettingsRestrictionItem;
        this.stitch = privacySettingsRestrictionItem2;
        this.comment = privacySettingsRestrictionItem3;
        this.sticker = privacySettingsRestrictionItem4;
        this.shareToStory = privacySettingsRestrictionItem5;
        this.contentReuse = privacySettingsRestrictionItem6;
        this.visibility = privacySettingsRestrictionItem7;
        this.geofencing = privacySettingsRestrictionItem8;
        this.aiRemix = privacySettingsRestrictionItem9;
    }
}
