package com.ss.android.ugc.aweme.feed.model.bottom.banner;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public interface FeedBottomBannerUIProps {

    public static final class Icon implements FeedBottomBannerUIProps {
        public final String url;

        public Icon() {
            this(null);
        }

        public final Icon copy(String str) {
            return new Icon(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Icon) && Intrinsics.LJFF(this.url, ((Icon) obj).url);
        }

        public int hashCode() {
            String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Icon(url=");
            sbLIZ.append(this.url);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final String getUrl() {
            return this.url;
        }

        public Icon(String str) {
            this.url = str;
        }
    }

    public static final class Title implements FeedBottomBannerUIProps {
        public final CharSequence content;

        public final Title copy(CharSequence charSequence) {
            return new Title(charSequence);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Title) && Intrinsics.LJFF(this.content, ((Title) obj).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Title(content=");
            sbLIZ.append((Object) this.content);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final CharSequence getContent() {
            return this.content;
        }

        public Title(CharSequence charSequence) {
            this.content = charSequence;
        }
    }
}
