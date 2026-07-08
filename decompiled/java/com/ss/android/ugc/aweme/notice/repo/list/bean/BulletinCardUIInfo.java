package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCardUIInfo {

    @C09CT("bulletin_card_type")
    public String bulletinCardType;

    @C09CT("bulletin_item_id")
    public String bulletinItemId;

    @C09CT("button_action")
    public final Long buttonAction;

    @C09CT("button_schema_url")
    public final String buttonSchemaUrl;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("content")
    public final String content;

    @C09CT("extra")
    public final List<BulletinCardKV> extra;

    @C09CT("image")
    public final List<BulletinImage> image;

    @C09CT("scene_badge_url")
    public final List<BulletinImage> sceneBadgeUrl;

    @C09CT("scene_title")
    public final String sceneTitle;

    @C09CT("title")
    public final String title;

    public BulletinCardUIInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinCardUIInfo)) {
            return false;
        }
        BulletinCardUIInfo bulletinCardUIInfo = (BulletinCardUIInfo) obj;
        return Intrinsics.LJFF(this.sceneBadgeUrl, bulletinCardUIInfo.sceneBadgeUrl) && Intrinsics.LJFF(this.sceneTitle, bulletinCardUIInfo.sceneTitle) && Intrinsics.LJFF(this.title, bulletinCardUIInfo.title) && Intrinsics.LJFF(this.content, bulletinCardUIInfo.content) && Intrinsics.LJFF(this.buttonText, bulletinCardUIInfo.buttonText) && Intrinsics.LJFF(this.buttonAction, bulletinCardUIInfo.buttonAction) && Intrinsics.LJFF(this.buttonSchemaUrl, bulletinCardUIInfo.buttonSchemaUrl) && Intrinsics.LJFF(this.image, bulletinCardUIInfo.image) && Intrinsics.LJFF(this.extra, bulletinCardUIInfo.extra) && Intrinsics.LJFF(this.bulletinItemId, bulletinCardUIInfo.bulletinItemId) && Intrinsics.LJFF(this.bulletinCardType, bulletinCardUIInfo.bulletinCardType);
    }

    public int hashCode() {
        List<BulletinImage> list = this.sceneBadgeUrl;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.sceneTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonText;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.buttonAction;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.buttonSchemaUrl;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<BulletinImage> list2 = this.image;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BulletinCardKV> list3 = this.extra;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str6 = this.bulletinItemId;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bulletinCardType;
        return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "BulletinCardUIInfo(sceneBadgeUrl=" + this.sceneBadgeUrl + ", sceneTitle=" + this.sceneTitle + ", title=" + this.title + ", content=" + this.content + ", buttonText=" + this.buttonText + ", buttonAction=" + this.buttonAction + ", buttonSchemaUrl=" + this.buttonSchemaUrl + ", image=" + this.image + ", extra=" + this.extra + ", bulletinItemId=" + this.bulletinItemId + ", bulletinCardType=" + this.bulletinCardType + ')';
    }

    public final void setBulletinCardType(String str) {
        this.bulletinCardType = str;
    }

    public final void setBulletinItemId(String str) {
        this.bulletinItemId = str;
    }

    public BulletinCardUIInfo(List<BulletinImage> list, String str, String str2, String str3, String str4, Long l, String str5, List<BulletinImage> list2, List<BulletinCardKV> list3, String str6, String str7) {
        this.sceneBadgeUrl = list;
        this.sceneTitle = str;
        this.title = str2;
        this.content = str3;
        this.buttonText = str4;
        this.buttonAction = l;
        this.buttonSchemaUrl = str5;
        this.image = list2;
        this.extra = list3;
        this.bulletinItemId = str6;
        this.bulletinCardType = str7;
    }
}
