package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AuthorizationNotifyMessage extends AbstractC1136060ffY {

    @C09CT("content")
    public String content;

    @C09CT("from")
    public String from;

    @C09CT("style")
    public String style;

    @C09CT("user_content")
    public ContentBlock userContent;

    @C09CT("user_relation")
    public RelationBlock userRelation;

    public static final class ContentBlock {

        @C09CT("content")
        public String content;

        @C09CT("detail")
        public String detail;

        @C09CT("is_authorized")
        public Boolean isAuthorized;

        @C09CT("show")
        public Boolean show;

        @C09CT("title")
        public String title;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.show != null) {
                sb.append(", show=");
                sb.append(this.show);
            }
            if (this.isAuthorized != null) {
                sb.append(", is_authorized=");
                sb.append(this.isAuthorized);
            }
            if (this.title != null) {
                sb.append(", title=");
                sb.append(this.title);
            }
            if (this.content != null) {
                sb.append(", content=");
                sb.append(this.content);
            }
            if (this.detail != null) {
                sb.append(", detail=");
                sb.append(this.detail);
            }
            sb.replace(0, 2, "ContentBlock{");
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class RelationBlock {

        @C09CT("content")
        public String content;

        @C09CT("detail")
        public String detail;

        @C09CT("is_authorized")
        public Boolean isAuthorized;

        @C09CT("show")
        public Boolean show;

        @C09CT("title")
        public String title;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.show != null) {
                sb.append(", show=");
                sb.append(this.show);
            }
            if (this.isAuthorized != null) {
                sb.append(", is_authorized=");
                sb.append(this.isAuthorized);
            }
            if (this.title != null) {
                sb.append(", title=");
                sb.append(this.title);
            }
            if (this.content != null) {
                sb.append(", content=");
                sb.append(this.content);
            }
            if (this.detail != null) {
                sb.append(", detail=");
                sb.append(this.detail);
            }
            sb.replace(0, 2, "RelationBlock{");
            sb.append('}');
            return sb.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.from != null) {
            sb.append(", from=");
            sb.append(this.from);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.style != null) {
            sb.append(", style=");
            sb.append(this.style);
        }
        if (this.userContent != null) {
            sb.append(", user_content=");
            sb.append(this.userContent);
        }
        if (this.userRelation != null) {
            sb.append(", user_relation=");
            sb.append(this.userRelation);
        }
        sb.replace(0, 2, "AuthorizationNotifyMessage{");
        sb.append('}');
        return sb.toString();
    }

    public AuthorizationNotifyMessage() {
        this.type = C001A.AUTHORIZATION_NOTIFY_MESSAGE;
    }
}
