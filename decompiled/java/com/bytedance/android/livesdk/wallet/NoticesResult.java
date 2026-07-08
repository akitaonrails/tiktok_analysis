package com.bytedance.android.livesdk.wallet;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class NoticesResult {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("notices")
        public List<Notice> notices;

        @C09CT("supplementary_notices")
        public List<Notice> supplementaryNotices;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            List<Notice> list = this.notices;
            if (list != null && !list.isEmpty()) {
                sb.append(", notices=");
                sb.append(this.notices);
            }
            sb.replace(0, 2, "Data{");
            sb.append('}');
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class Notice {

        @C09CT("closable")
        public Boolean closable;

        @C09CT("content")
        public String content;

        @C09CT("day_limit")
        public int dayLimit;

        @C09CT("extra")
        public Map<String, String> extra;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public String id;

        @C09CT("max_view_count")
        public int maxViewCount;

        @C09CT("priority")
        public int priority;

        @C09CT("schema_text")
        public String schemaText;

        @C09CT("schema_url")
        public String schemaUrl;

        @C09CT("style")
        public Style style;

        @C09CT("title")
        public String title;

        @C09CT("type")
        public int type;

        @C09CT("visibility_check")
        public VisibilityCheck visibilityCheck;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.id != null) {
                sb.append(", id=");
                sb.append(this.id);
            }
            if (this.title != null) {
                sb.append(", title=");
                sb.append(this.title);
            }
            if (this.content != null) {
                sb.append(", content=");
                sb.append(this.content);
            }
            sb.append(", priority=");
            sb.append(this.priority);
            if (this.style != null) {
                sb.append(", style=");
                sb.append(this.style);
            }
            if (this.schemaText != null) {
                sb.append(", schema_text=");
                sb.append(this.schemaText);
            }
            if (this.schemaUrl != null) {
                sb.append(", schema_url=");
                sb.append(this.schemaUrl);
            }
            if (this.closable != null) {
                sb.append(", closable=");
                sb.append(this.closable);
            }
            sb.replace(0, 2, "Notice{");
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class Style {

        @C09CT("background_color_code")
        public String backgroundColorCode;

        @C09CT("banner_icon")
        public String bannerIcon = "";

        @C09CT("icon")
        public int icon;

        @C09CT("notification_style")
        public int notificationStyle;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.backgroundColorCode != null) {
                sb.append(", background_color_code=");
                sb.append(this.backgroundColorCode);
            }
            sb.append(", icon=");
            sb.append(this.icon);
            sb.replace(0, 2, "Style{");
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class VisibilityCheck {

        @C09CT("info")
        public String info = "";

        @C09CT("type")
        public int type;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "NoticesResult{");
        sb.append('}');
        return sb.toString();
    }
}
