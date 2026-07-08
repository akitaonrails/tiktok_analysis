package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes32.dex */
public final class AmberAlertCardInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("amber_alert_id")
    public final String alertId;

    @C09CT("amber_alert_link")
    public final String amberAlertLink;

    @C09CT("amber_alert_version")
    public final Integer amberAlertVersion;

    @C09CT("call_text")
    public final String callText;

    @C09CT("children")
    public final List<PersonInfo> children;

    @C09CT("contact")
    public final ContactInfo contact;

    @C09CT("share_content_pb")
    public final String contentPb;

    @C09CT("country")
    public final String country;

    @C09CT("descriptions")
    public final List<TextWithInlineLink> descriptions;

    @C09CT("detail_page_link")
    public final String detailPageLink;

    @C09CT("disclaimer")
    public final String disclaimer;

    @C09CT("geo_type")
    public final String geoType;

    @C09CT("incident")
    public final IncidentInfo incident;

    @C09CT("last_seen_desc")
    public final String lastSeenDesc;

    @C09CT("last_update_time")
    public final Long lastUpdateTime;

    @C09CT("message_timestamp")
    public final String messageTimeStamp;

    @C09CT("more_details_text")
    public final String moreDetailsText;

    @C09CT("pictures")
    public final List<PictureInfo> pictures;

    @C09CT("source")
    public final String source;

    @C09CT("summary")
    public final String summary;

    @C09CT("suspects")
    public final List<PersonInfo> suspects;

    @C09CT("amber_alert_title")
    public final String title;

    @C09CT("ui_version")
    public final Integer uiVersion;

    @C09CT("vehicles")
    public final List<Object> vehicles;

    public AmberAlertCardInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
    }

    public AmberAlertCardInfo(String str, String str2, List<PictureInfo> list, List<TextWithInlineLink> list2, String str3, String str4, String str5, String str6, Long l, Integer num, String str7, Integer num2, String str8, String str9, String str10, List<PersonInfo> list3, List<PersonInfo> list4, List<Object> list5, IncidentInfo incidentInfo, ContactInfo contactInfo, String str11, String str12, String str13, String str14) {
        this.alertId = str;
        this.title = str2;
        this.pictures = list;
        this.descriptions = list2;
        this.disclaimer = str3;
        this.amberAlertLink = str4;
        this.moreDetailsText = str5;
        this.callText = str6;
        this.lastUpdateTime = l;
        this.amberAlertVersion = num;
        this.messageTimeStamp = str7;
        this.uiVersion = num2;
        this.country = str8;
        this.source = str9;
        this.summary = str10;
        this.children = list3;
        this.suspects = list4;
        this.vehicles = list5;
        this.incident = incidentInfo;
        this.contact = contactInfo;
        this.lastSeenDesc = str11;
        this.detailPageLink = str12;
        this.contentPb = str13;
        this.geoType = str14;
    }

    public AmberAlertCardInfo(String str, String str2, List list, List list2, String str3, String str4, String str5, String str6, Long l, Integer num, String str7, Integer num2, String str8, String str9, String str10, List list3, List list4, List list5, IncidentInfo incidentInfo, ContactInfo contactInfo, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? 0L : l, (i & 512) != 0 ? 0 : num, (i & 1024) != 0 ? "" : str7, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? -1 : num2, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str8, (i & 8192) != 0 ? "" : str9, (i & 16384) != 0 ? "" : str10, (32768 & i) != 0 ? C13BV.INSTANCE : list3, (65536 & i) != 0 ? C13BV.INSTANCE : list4, (131072 & i) != 0 ? C13BV.INSTANCE : list5, (262144 & i) != 0 ? null : incidentInfo, (524288 & i) == 0 ? contactInfo : null, (1048576 & i) != 0 ? "" : str11, (2097152 & i) != 0 ? "" : str12, (4194304 & i) != 0 ? "" : str13, (i & 8388608) == 0 ? str14 : "");
    }
}
