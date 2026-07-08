package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.net.URLDecoder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareLiveEventContent extends BaseContent {

    @C09CT("event_id")
    public String eventId;

    @C09CT("event_type")
    public String eventType;

    @C09CT("link_url")
    public String linkUrl;

    @C09CT("organizer_avatar")
    public UrlModel organizerAvatar;

    @C09CT("organizer_enterprise")
    public String organizerEnterprise;

    @C09CT("organizer_name")
    public String organizerName;

    @C09CT("organizer_verify_reason")
    public String organizerVerifyReason;

    @C09CT("organizer_id")
    public String organizerd;

    @C09CT("start_time")
    public String startTime;

    @C09CT("title")
    public String title;

    public final boolean isPaidEvent() {
        String strDecode;
        Uri uri;
        try {
            String str = this.linkUrl;
            if (str == null || (strDecode = URLDecoder.decode(str)) == null || (uri = UriProtector.parse(strDecode)) == null) {
                return false;
            }
            String strDecode2 = URLDecoder.decode(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_paid_event"), "UTF-8");
            if (!Intrinsics.LJFF("1", strDecode2)) {
                if (!Intrinsics.LJFF("true", strDecode2)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final UrlModel getOrganizerAvatar() {
        return this.organizerAvatar;
    }

    public final String getOrganizerEnterprise() {
        return this.organizerEnterprise;
    }

    public final String getOrganizerName() {
        return this.organizerName;
    }

    public final String getOrganizerVerifyReason() {
        return this.organizerVerifyReason;
    }

    public final String getOrganizerd() {
        return this.organizerd;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setEventType(String str) {
        this.eventType = str;
    }

    public final void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public final void setOrganizerAvatar(UrlModel urlModel) {
        this.organizerAvatar = urlModel;
    }

    public final void setOrganizerEnterprise(String str) {
        this.organizerEnterprise = str;
    }

    public final void setOrganizerName(String str) {
        this.organizerName = str;
    }

    public final void setOrganizerVerifyReason(String str) {
        this.organizerVerifyReason = str;
    }

    public final void setOrganizerd(String str) {
        this.organizerd = str;
    }

    public final void setStartTime(String str) {
        this.startTime = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
