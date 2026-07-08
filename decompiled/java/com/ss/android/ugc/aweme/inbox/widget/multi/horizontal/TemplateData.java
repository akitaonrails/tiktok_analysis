package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.C09CT;
import X.C0BV4;
import X.C1599520rj4;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class TemplateData implements Serializable {
    public static final C1599520rj4 Companion = new Object() { // from class: X.0rj4
    };

    @C09CT("actions")
    public final List<SkylightActionData> actionData;

    @C09CT("badge_url")
    public final UrlModel badgeUrl;

    @C09CT("extra_data")
    public final String extraData;

    @C09CT("icon_url")
    public final UrlModel iconUrl;

    @C09CT("image_url")
    public final UrlModel imageUrl;
    public final Object localBadgeUrl;
    public final Object localImageUrl;
    public final Object localTitle;

    @C09CT("out_line")
    public final String outLine;

    @C09CT("ring_color")
    public final RingColor ringColor;

    @C09CT("ring_width")
    public final Float ringWidth;

    @C09CT("scheme_url")
    public final String schemaUrl;

    @C09CT("title")
    public final String title;

    @C09CT("ui_type")
    public final int uiType;

    public String toString() {
        return "TemplateData(uiType=" + this.uiType + ", schemaUrl=" + this.schemaUrl + ", imageUrl=" + this.imageUrl + ", localImageUrl=" + this.localImageUrl + ", title=" + this.title + ", localTitle=" + this.localTitle + ", badgeUrl=" + this.badgeUrl + ", localBadgeUrl=" + this.localBadgeUrl + ", iconUrl=" + this.iconUrl + ", extraData=" + this.extraData + ", outLine=" + this.outLine + ", actionData=" + this.actionData + ", ringColor=" + this.ringColor + ", ringWidth=" + this.ringWidth + ')';
    }

    public boolean equals(Object obj) {
        if (!C0BV4.LIZ()) {
            return super.equals(obj);
        }
        if (!(obj instanceof TemplateData)) {
            return false;
        }
        TemplateData templateData = (TemplateData) obj;
        if (this.uiType != templateData.uiType || !Intrinsics.LJFF(this.title, templateData.title) || !Intrinsics.LJFF(this.schemaUrl, templateData.schemaUrl) || !Intrinsics.LJFF(this.actionData, templateData.actionData) || !Intrinsics.LJFF(this.imageUrl, templateData.imageUrl) || !Intrinsics.LJFF(this.ringColor, templateData.ringColor) || !Intrinsics.LJ(this.ringWidth, templateData.ringWidth)) {
            return false;
        }
        return true;
    }

    public TemplateData(int i, String str, UrlModel urlModel, Object obj, String str2, Object obj2, UrlModel urlModel2, Object obj3, UrlModel urlModel3, String str3, String str4, List<SkylightActionData> list, RingColor ringColor, Float f) {
        this.uiType = i;
        this.schemaUrl = str;
        this.imageUrl = urlModel;
        this.localImageUrl = obj;
        this.title = str2;
        this.localTitle = obj2;
        this.badgeUrl = urlModel2;
        this.localBadgeUrl = obj3;
        this.iconUrl = urlModel3;
        this.extraData = str3;
        this.outLine = str4;
        this.actionData = list;
        this.ringColor = ringColor;
        this.ringWidth = f;
    }
}
