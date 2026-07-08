package com.ss.android.ugc.aweme.game;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.im.creative.common.api.analytics.GameMainFlowEventParameters;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class GameChallengeBannerContent implements FakeMsgContent, Serializable, InterfaceC1891350zJl {
    public static final int $stable = 8;
    public final int LL;

    @C09CT("effect_id")
    public final String effectId;

    @C09CT("effect_name")
    public final String effectName;

    @C09CT("main_flow_parameters")
    public final GameMainFlowEventParameters mainFlowEventParameters;

    @C09CT("resource_id")
    public final String resId;

    @C09CT("thumbnails")
    public final List<String> thumbnails;

    public final GameChallengeBannerContent copy(int i, String str, String str2, String str3, List<String> list, GameMainFlowEventParameters gameMainFlowEventParameters) {
        return new GameChallengeBannerContent(i, str, str2, str3, list, gameMainFlowEventParameters);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameChallengeBannerContent)) {
            return false;
        }
        GameChallengeBannerContent gameChallengeBannerContent = (GameChallengeBannerContent) obj;
        return this.LL == gameChallengeBannerContent.LL && Intrinsics.LJFF(this.effectName, gameChallengeBannerContent.effectName) && Intrinsics.LJFF(this.effectId, gameChallengeBannerContent.effectId) && Intrinsics.LJFF(this.resId, gameChallengeBannerContent.resId) && Intrinsics.LJFF(this.thumbnails, gameChallengeBannerContent.thumbnails) && Intrinsics.LJFF(this.mainFlowEventParameters, gameChallengeBannerContent.mainFlowEventParameters);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        return (((((((((this.LL * 31) + this.effectName.hashCode()) * 31) + this.effectId.hashCode()) * 31) + this.resId.hashCode()) * 31) + this.thumbnails.hashCode()) * 31) + this.mainFlowEventParameters.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameChallengeBannerContent(msgType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", effectName=");
        sbLIZ.append(this.effectName);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(", resId=");
        sbLIZ.append(this.resId);
        sbLIZ.append(", thumbnails=");
        sbLIZ.append(this.thumbnails);
        sbLIZ.append(", mainFlowEventParameters=");
        sbLIZ.append(this.mainFlowEventParameters);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getEffectName() {
        return this.effectName;
    }

    public final GameMainFlowEventParameters getMainFlowEventParameters() {
        return this.mainFlowEventParameters;
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
    public int getMsgType() {
        return this.LL;
    }

    public final String getResId() {
        return this.resId;
    }

    public final List<String> getThumbnails() {
        return this.thumbnails;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public GameChallengeBannerContent(int i, String str, String str2, String str3, List<String> list, GameMainFlowEventParameters gameMainFlowEventParameters) {
        this.LL = i;
        this.effectName = str;
        this.effectId = str2;
        this.resId = str3;
        this.thumbnails = list;
        this.mainFlowEventParameters = gameMainFlowEventParameters;
    }
}
