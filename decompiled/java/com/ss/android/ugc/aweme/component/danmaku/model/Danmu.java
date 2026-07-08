package com.ss.android.ugc.aweme.component.danmaku.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.feed.model.BotConfig;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class Danmu implements Serializable {
    public static final int $stable = 8;

    @C09CT("danmaku_id")
    public final int bizId;

    @C09CT("bot_config")
    public final BotConfig botConfig;

    @C09CT("ec_agent_schema")
    public final String ecAgentSchema;

    @C09CT("jump_model")
    public final CRouterCoreModel jumpModel;

    @C09CT("offset_time")
    public final Long offsetTime;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final int type;

    public Danmu() {
        this(0, "", 0, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Danmu)) {
            return false;
        }
        Danmu danmu = (Danmu) obj;
        return this.bizId == danmu.bizId && Intrinsics.LJFF(this.text, danmu.text) && this.type == danmu.type && Intrinsics.LJFF(this.botConfig, danmu.botConfig) && Intrinsics.LJFF(this.jumpModel, danmu.jumpModel) && Intrinsics.LJFF(this.ecAgentSchema, danmu.ecAgentSchema) && Intrinsics.LJFF(this.offsetTime, danmu.offsetTime);
    }

    public int hashCode() {
        int i = this.bizId * 31;
        String str = this.text;
        int iHashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.type) * 31;
        BotConfig botConfig = this.botConfig;
        int iHashCode2 = (iHashCode + (botConfig == null ? 0 : botConfig.hashCode())) * 31;
        CRouterCoreModel cRouterCoreModel = this.jumpModel;
        int iHashCode3 = (iHashCode2 + (cRouterCoreModel == null ? 0 : cRouterCoreModel.hashCode())) * 31;
        String str2 = this.ecAgentSchema;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.offsetTime;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Danmu(bizId=");
        sbLIZ.append(this.bizId);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", botConfig=");
        sbLIZ.append(this.botConfig);
        sbLIZ.append(", jumpModel=");
        sbLIZ.append(this.jumpModel);
        sbLIZ.append(", ecAgentSchema=");
        sbLIZ.append(this.ecAgentSchema);
        sbLIZ.append(", offsetTime=");
        sbLIZ.append(this.offsetTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getStableIdentity() {
        int i = this.bizId;
        if (i != 0) {
            return String.valueOf(i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.type);
        sbLIZ.append('#');
        String str = this.text;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isTimed() {
        Long l = this.offsetTime;
        return l != null && l.longValue() >= 0;
    }

    public Danmu(int i, String str, int i2, BotConfig botConfig, CRouterCoreModel cRouterCoreModel, String str2, Long l) {
        this.bizId = i;
        this.text = str;
        this.type = i2;
        this.botConfig = botConfig;
        this.jumpModel = cRouterCoreModel;
        this.ecAgentSchema = str2;
        this.offsetTime = l;
    }
}
