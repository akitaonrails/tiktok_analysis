package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C0OM7;
import X.C123100dR;
import X.C617100OIi;
import X.EnumC311470CIv;
import X.EnumC618000OLu;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBarEntrance {

    @C09CT("bg_color")
    public final String bgColor;

    @C09CT("bubble_struct")
    public final BulletinBubbleStruct bubbleStruct;

    @C09CT("event_tracking_fields")
    public final List<BulletinKeyValueStruct> eventTrackingFields;

    @C09CT("icon_url")
    public final TuxImageModel iconUrlModel;

    @C09CT("object_id")
    public final String objectId;

    @C09CT("reddot_struct")
    public final BulletinReddotStruct reddotStruct;

    @C09CT("refresh_type")
    public final int refreshType;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("show_type")
    public final int showType;

    @C09CT("text")
    public final InboxTextStruct text;

    @C09CT("type")
    public final int type;

    public BulletinBarEntrance() {
        this(EnumC618000OLu.BAR_ENTRANCE_TYPE_UNKNOWN.getType(), null, C0OM7.BAR_ENTRANCE_SHOW_TYPE_UNKNOWN.getType(), EnumC311470CIv.BAR_ENTRANCE_REFRESH_TYPE_NONE.getType(), null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinBarEntrance)) {
            return false;
        }
        BulletinBarEntrance bulletinBarEntrance = (BulletinBarEntrance) obj;
        return this.type == bulletinBarEntrance.type && Intrinsics.LJFF(this.objectId, bulletinBarEntrance.objectId) && this.showType == bulletinBarEntrance.showType && this.refreshType == bulletinBarEntrance.refreshType && Intrinsics.LJFF(this.text, bulletinBarEntrance.text) && Intrinsics.LJFF(this.iconUrlModel, bulletinBarEntrance.iconUrlModel) && Intrinsics.LJFF(this.schemaUrl, bulletinBarEntrance.schemaUrl) && Intrinsics.LJFF(this.bgColor, bulletinBarEntrance.bgColor) && Intrinsics.LJFF(this.eventTrackingFields, bulletinBarEntrance.eventTrackingFields) && Intrinsics.LJFF(this.reddotStruct, bulletinBarEntrance.reddotStruct) && Intrinsics.LJFF(this.bubbleStruct, bulletinBarEntrance.bubbleStruct);
    }

    public String toString() {
        return "BulletinBarEntrance(type=" + this.type + ", objectId=" + this.objectId + ", showType=" + this.showType + ", refreshType=" + this.refreshType + ", text=" + this.text + ", iconUrlModel=" + this.iconUrlModel + ", schemaUrl=" + this.schemaUrl + ", bgColor=" + this.bgColor + ", eventTrackingFields=" + this.eventTrackingFields + ", reddotStruct=" + this.reddotStruct + ", bubbleStruct=" + this.bubbleStruct + ')';
    }

    public final Map<String, String> getTrackingMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<BulletinKeyValueStruct> list = this.eventTrackingFields;
        if (list != null) {
            for (BulletinKeyValueStruct bulletinKeyValueStruct : list) {
                if (bulletinKeyValueStruct != null && C123100dR.LIZ(bulletinKeyValueStruct.key) && C123100dR.LIZ(bulletinKeyValueStruct.value)) {
                    linkedHashMap.put(bulletinKeyValueStruct.key, bulletinKeyValueStruct.value);
                }
            }
        }
        return linkedHashMap;
    }

    public final boolean isLivingEntrance() {
        return this.type == EnumC618000OLu.BAR_ENTRANCE_TYPE_LIVE.getType() && this.showType == C0OM7.BAR_ENTRANCE_SHOW_TYPE_LIVE.getType() && C617100OIi.LJFF(this.objectId) != null;
    }

    public BulletinBarEntrance(int i, String str, int i2, int i3, InboxTextStruct inboxTextStruct, TuxImageModel tuxImageModel, String str2, String str3, List<BulletinKeyValueStruct> list, BulletinReddotStruct bulletinReddotStruct, BulletinBubbleStruct bulletinBubbleStruct) {
        this.type = i;
        this.objectId = str;
        this.showType = i2;
        this.refreshType = i3;
        this.text = inboxTextStruct;
        this.iconUrlModel = tuxImageModel;
        this.schemaUrl = str2;
        this.bgColor = str3;
        this.eventTrackingFields = list;
        this.reddotStruct = bulletinReddotStruct;
        this.bubbleStruct = bulletinBubbleStruct;
    }
}
