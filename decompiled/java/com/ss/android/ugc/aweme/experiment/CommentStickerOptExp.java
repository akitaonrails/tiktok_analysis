package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CommentStickerOptExp {
    public static final CommentStickerOptConfig LIZ = new CommentStickerOptConfig(null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(392));

    public static final class CommentStickerOptConfig {

        @C09CT("comment_sticker_downgrade_device_score")
        public final Float downgradeDeviceScore;

        @C09CT("comment_sticker_downgrade_net_level")
        public final Integer downgradeNetLevel;

        public CommentStickerOptConfig() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommentStickerOptConfig)) {
                return false;
            }
            CommentStickerOptConfig commentStickerOptConfig = (CommentStickerOptConfig) obj;
            return Intrinsics.LJFF(this.downgradeNetLevel, commentStickerOptConfig.downgradeNetLevel) && Intrinsics.LJFF(this.downgradeDeviceScore, commentStickerOptConfig.downgradeDeviceScore);
        }

        public final int hashCode() {
            Integer num = this.downgradeNetLevel;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Float f = this.downgradeDeviceScore;
            return iHashCode + (f != null ? f.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CommentStickerOptConfig(downgradeNetLevel=");
            sbLIZ.append(this.downgradeNetLevel);
            sbLIZ.append(", downgradeDeviceScore=");
            sbLIZ.append(this.downgradeDeviceScore);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CommentStickerOptConfig(Integer num, Float f) {
            this.downgradeNetLevel = num;
            this.downgradeDeviceScore = f;
        }
    }
}
