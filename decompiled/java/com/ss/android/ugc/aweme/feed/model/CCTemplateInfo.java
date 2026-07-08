package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class CCTemplateInfo implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("author_name")
    public String authorName;

    @C09CT("clip_count")
    public int clip_count;

    @C09CT("duration_milliseconds")
    public int duration;

    @C09CT("match_type")
    public String match_type;

    @C09CT("music_copyright")
    public boolean music_copyright;

    @C09CT("onelink")
    public String onelink;

    @C09CT("schema_extra")
    public String schemaExtraJsonStr;

    @C09CT("style_type")
    public int style_type;
    public int templateOrder = -1;

    @C09CT("desc")
    public String template_desc;

    @C09CT("template_id")
    public String template_id;

    @C09CT("related_music_id")
    public String template_music_id;

    @C09CT("usage")
    public int usage;

    public final String getMusicCopyrightStr() {
        return this.music_copyright ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public final boolean isMatchThePolicy() {
        return !TextUtils.isEmpty(this.match_type);
    }

    public final boolean isTemplateBottomStyleDoubleBtn() {
        return this.style_type == 2;
    }

    public final boolean isTemplateBottomStyleSingleBtn() {
        return this.style_type == 1;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final int getClip_count() {
        return this.clip_count;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getMatch_type() {
        return this.match_type;
    }

    public final boolean getMusic_copyright() {
        return this.music_copyright;
    }

    public final String getOnelink() {
        return this.onelink;
    }

    public final String getSchemaExtraJsonStr() {
        return this.schemaExtraJsonStr;
    }

    public final int getStyle_type() {
        return this.style_type;
    }

    public final int getTemplateOrder() {
        return this.templateOrder;
    }

    public final String getTemplate_desc() {
        return this.template_desc;
    }

    public final String getTemplate_id() {
        return this.template_id;
    }

    public final String getTemplate_music_id() {
        return this.template_music_id;
    }

    public final int getUsage() {
        return this.usage;
    }

    public final void appendQueryParameter(Uri.Builder builder) {
        Companion companion = Companion;
        String str = this.schemaExtraJsonStr;
        if (str == null) {
            str = "";
        }
        companion.appendQueryParameter(builder, str);
    }

    public final void setAuthorName(String str) {
        this.authorName = str;
    }

    public final void setClip_count(int i) {
        this.clip_count = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setMatch_type(String str) {
        this.match_type = str;
    }

    public final void setMusic_copyright(boolean z) {
        this.music_copyright = z;
    }

    public final void setOnelink(String str) {
        this.onelink = str;
    }

    public final void setSchemaExtraJsonStr(String str) {
        this.schemaExtraJsonStr = str;
    }

    public final void setStyle_type(int i) {
        this.style_type = i;
    }

    public final void setTemplateOrder(int i) {
        this.templateOrder = i;
    }

    public final void setTemplate_desc(String str) {
        this.template_desc = str;
    }

    public final void setTemplate_id(String str) {
        this.template_id = str;
    }

    public final void setTemplate_music_id(String str) {
        this.template_music_id = str;
    }

    public final void setUsage(int i) {
        this.usage = i;
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Companion {
        public final void appendQueryParameter(Uri.Builder builder, String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (next != null && !Intrinsics.LJFF(next, "scheme")) {
                            builder.appendQueryParameter(next, jSONObject.optString(next));
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public CCTemplateInfo(String str, String str2, String str3, int i, int i2, String str4, int i3, boolean z, int i4, String str5, String str6, String str7) {
        this.template_id = str;
        this.template_desc = str2;
        this.authorName = str3;
        this.clip_count = i;
        this.duration = i2;
        this.template_music_id = str4;
        this.usage = i3;
        this.music_copyright = z;
        this.style_type = i4;
        this.onelink = str5;
        this.match_type = str6;
        this.schemaExtraJsonStr = str7;
    }
}
