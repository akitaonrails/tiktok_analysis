package com.ss.android.ugc.aweme.tako.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TakoBottomDisclaimerContentConfig {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(620));

    public static final class BottomDisclaimerContent {

        @C09CT("content_learn_more")
        public final String contentLearnMore;

        @C09CT("placeholders")
        public final Map<String, Placeholder> placeholders;

        public BottomDisclaimerContent() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomDisclaimerContent)) {
                return false;
            }
            BottomDisclaimerContent bottomDisclaimerContent = (BottomDisclaimerContent) obj;
            return Intrinsics.LJFF(this.contentLearnMore, bottomDisclaimerContent.contentLearnMore) && Intrinsics.LJFF(this.placeholders, bottomDisclaimerContent.placeholders);
        }

        public final int hashCode() {
            String str = this.contentLearnMore;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Map<String, Placeholder> map = this.placeholders;
            return iHashCode + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BottomDisclaimerContent(contentLearnMore=");
            sbLIZ.append(this.contentLearnMore);
            sbLIZ.append(", placeholders=");
            sbLIZ.append(this.placeholders);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public BottomDisclaimerContent(String str, Map<String, Placeholder> map) {
            this.contentLearnMore = str;
            this.placeholders = map;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Placeholder {

        @C09CT("trans_value")
        public final String transValue;

        @C09CT("url")
        public final String url;

        public Placeholder() {
            this("", null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Placeholder)) {
                return false;
            }
            Placeholder placeholder = (Placeholder) obj;
            return Intrinsics.LJFF(this.transValue, placeholder.transValue) && Intrinsics.LJFF(this.url, placeholder.url);
        }

        public final int hashCode() {
            int iHashCode = this.transValue.hashCode() * 31;
            String str = this.url;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Placeholder(transValue=");
            sbLIZ.append(this.transValue);
            sbLIZ.append(", url=");
            sbLIZ.append(this.url);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Placeholder(String str, String str2) {
            this.transValue = str;
            this.url = str2;
        }
    }
}
