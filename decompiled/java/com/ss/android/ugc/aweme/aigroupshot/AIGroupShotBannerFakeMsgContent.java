package com.ss.android.ugc.aweme.aigroupshot;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class AIGroupShotBannerFakeMsgContent implements FakeMsgContent {
    public final int LL;

    @C09CT("effect_id")
    public final String effectId;

    @C09CT("raw_server_data")
    public final String rawServerData;

    public AIGroupShotBannerFakeMsgContent() {
        this(null, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGroupShotBannerFakeMsgContent)) {
            return false;
        }
        AIGroupShotBannerFakeMsgContent aIGroupShotBannerFakeMsgContent = (AIGroupShotBannerFakeMsgContent) obj;
        return Intrinsics.LJFF(this.rawServerData, aIGroupShotBannerFakeMsgContent.rawServerData) && Intrinsics.LJFF(this.effectId, aIGroupShotBannerFakeMsgContent.effectId);
    }

    public final int hashCode() {
        String str = this.rawServerData;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.effectId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGroupShotBannerFakeMsgContent(rawServerData=");
        sbLIZ.append(this.rawServerData);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
    public final int getMsgType() {
        return this.LL;
    }

    public AIGroupShotBannerFakeMsgContent(String str, String str2) {
        this.rawServerData = str;
        this.effectId = str2;
        this.LL = 4048;
    }
}
