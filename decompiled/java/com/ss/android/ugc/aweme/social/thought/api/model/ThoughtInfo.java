package com.ss.android.ugc.aweme.social.thought.api.model;

import X.C09CT;
import X.C2188811AlT;
import X.C341230DZh;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ThoughtInfo implements Serializable {
    public static final C341230DZh Companion = new Object() { // from class: X.0DZh
    };

    @C09CT("author_uid")
    public final String authorUid;

    @C09CT("create_time_ms")
    public final Long createTimeMs;

    @C09CT("interaction_preview")
    public final ThoughtInteractionPreview interactionPreview;
    public final transient boolean isPublishing;

    @C09CT("privacy_setting")
    public final Integer privacySetting;

    @C09CT("text_content")
    public final String textContent;

    @C09CT("thought_id")
    public final String thoughtId;

    @C09CT("viewer_interaction")
    public final ThoughtInteractionInfo viewerInteraction;

    public ThoughtInfo() {
        this(null, null, null, null, null, null, null, false);
    }

    public final ThoughtInfo copy(String str, String str2, Long l, Integer num, ThoughtInteractionPreview thoughtInteractionPreview, ThoughtInteractionInfo thoughtInteractionInfo, String str3, boolean z) {
        return new ThoughtInfo(str, str2, l, num, thoughtInteractionPreview, thoughtInteractionInfo, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThoughtInfo)) {
            return false;
        }
        ThoughtInfo thoughtInfo = (ThoughtInfo) obj;
        return Intrinsics.LJFF(this.thoughtId, thoughtInfo.thoughtId) && Intrinsics.LJFF(this.textContent, thoughtInfo.textContent) && Intrinsics.LJFF(this.createTimeMs, thoughtInfo.createTimeMs) && Intrinsics.LJFF(this.privacySetting, thoughtInfo.privacySetting) && Intrinsics.LJFF(this.interactionPreview, thoughtInfo.interactionPreview) && Intrinsics.LJFF(this.viewerInteraction, thoughtInfo.viewerInteraction) && Intrinsics.LJFF(this.authorUid, thoughtInfo.authorUid) && this.isPublishing == thoughtInfo.isPublishing;
    }

    public int hashCode() {
        String str = this.thoughtId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.textContent;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.createTimeMs;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.privacySetting;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        ThoughtInteractionPreview thoughtInteractionPreview = this.interactionPreview;
        int iHashCode5 = (iHashCode4 + (thoughtInteractionPreview == null ? 0 : thoughtInteractionPreview.hashCode())) * 31;
        ThoughtInteractionInfo thoughtInteractionInfo = this.viewerInteraction;
        int iHashCode6 = (iHashCode5 + (thoughtInteractionInfo == null ? 0 : thoughtInteractionInfo.hashCode())) * 31;
        String str3 = this.authorUid;
        return ((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isPublishing);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThoughtInfo(thoughtId=");
        sbLIZ.append(this.thoughtId);
        sbLIZ.append(", textContent=");
        sbLIZ.append(this.textContent);
        sbLIZ.append(", createTimeMs=");
        sbLIZ.append(this.createTimeMs);
        sbLIZ.append(", privacySetting=");
        sbLIZ.append(this.privacySetting);
        sbLIZ.append(", interactionPreview=");
        sbLIZ.append(this.interactionPreview);
        sbLIZ.append(", viewerInteraction=");
        sbLIZ.append(this.viewerInteraction);
        sbLIZ.append(", authorUid=");
        sbLIZ.append(this.authorUid);
        sbLIZ.append(", isPublishing=");
        sbLIZ.append(this.isPublishing);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isExpired() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = this.createTimeMs;
        return jCurrentTimeMillis - (l != null ? l.longValue() : 0L) >= 86400000;
    }

    public final boolean isPublishing() {
        return this.isPublishing;
    }

    public ThoughtInfo(String str, String str2, Long l, Integer num, ThoughtInteractionPreview thoughtInteractionPreview, ThoughtInteractionInfo thoughtInteractionInfo, String str3, boolean z) {
        this.thoughtId = str;
        this.textContent = str2;
        this.createTimeMs = l;
        this.privacySetting = num;
        this.interactionPreview = thoughtInteractionPreview;
        this.viewerInteraction = thoughtInteractionInfo;
        this.authorUid = str3;
        this.isPublishing = z;
    }
}
