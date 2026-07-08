package com.ss.android.ugc.aweme.im.common.experiment;

import X.C01GW;
import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C452501pT;
import X.EnumC451180Hme;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class IMStickerFavSenderConfig {
    public static final IMStickerFavSenderDataConfig LIZ = new IMStickerFavSenderDataConfig(C1697810uHb.LJIIJJI(Integer.valueOf(EnumC451180Hme.STATIC.getType()), Integer.valueOf(EnumC451180Hme.ANIMATED.getType()), Integer.valueOf(EnumC451180Hme.AIMOJI_STICKER_STATIC.getType()), Integer.valueOf(EnumC451180Hme.AISELF_STICKER.getType()), Integer.valueOf(EnumC451180Hme.STREAK_STICKER.getType())));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(497));

    public static final class IMStickerFavSenderDataConfig {

        @C09CT("filter_types")
        public final List<Integer> filterTypes;

        public IMStickerFavSenderDataConfig() {
            this(C1697810uHb.LJIIJJI(Integer.valueOf(EnumC451180Hme.STATIC.getType()), Integer.valueOf(EnumC451180Hme.ANIMATED.getType()), Integer.valueOf(EnumC451180Hme.AIMOJI_STICKER_STATIC.getType()), Integer.valueOf(EnumC451180Hme.AISELF_STICKER.getType()), Integer.valueOf(EnumC451180Hme.STREAK_STICKER.getType())));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IMStickerFavSenderDataConfig) && Intrinsics.LJFF(this.filterTypes, ((IMStickerFavSenderDataConfig) obj).filterTypes);
        }

        public final int hashCode() {
            return this.filterTypes.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMStickerFavSenderDataConfig(filterTypes=");
            sbLIZ.append(this.filterTypes);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public IMStickerFavSenderDataConfig(List<Integer> list) {
            this.filterTypes = list;
        }
    }
}
