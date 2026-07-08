package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentMixFeed {
    public Boolean LIZ;

    @C09CT("action_button")
    public CommerceAgentActionButton actionButton;

    @C09CT("cache_sug")
    public CommerceAgentSug cacheSug;

    @C09CT("card_type")
    public int cardType;

    @C09CT("card")
    public CommerceLynxCard commerceLynxCard;

    @C09CT("ext")
    public CommerceAgentPassExt ext;

    @C09CT("hint")
    public String hint;

    @C09CT("hint_in_text")
    public String hintInText;

    @C09CT("msg_ext")
    public Map<String, String> msgExt;

    @C09CT("process_info")
    public List<CommerceAgentProcessInfo> processInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("sug")
    public CommerceAgentSug sug;

    @C09CT("text")
    public String text;

    public CommerceAgentMixFeed() {
        this(null, null, null, null, 0, null, 0, null, null, null, null, null, null, 8191, null);
    }

    public CommerceAgentMixFeed(String str, String str2, String str3, CommerceAgentActionButton commerceAgentActionButton, int i, CommerceAgentPassExt commerceAgentPassExt, int i2, List<CommerceAgentProcessInfo> list, CommerceAgentSug commerceAgentSug, Map<String, String> map, CommerceAgentSug commerceAgentSug2, CommerceLynxCard commerceLynxCard, Boolean bool) {
        this.text = str;
        this.hint = str2;
        this.hintInText = str3;
        this.actionButton = commerceAgentActionButton;
        this.cardType = i;
        this.ext = commerceAgentPassExt;
        this.status = i2;
        this.processInfo = list;
        this.sug = commerceAgentSug;
        this.msgExt = map;
        this.cacheSug = commerceAgentSug2;
        this.commerceLynxCard = commerceLynxCard;
        this.LIZ = bool;
    }

    public CommerceAgentMixFeed(String str, String str2, String str3, CommerceAgentActionButton commerceAgentActionButton, int i, CommerceAgentPassExt commerceAgentPassExt, int i2, List list, CommerceAgentSug commerceAgentSug, Map map, CommerceAgentSug commerceAgentSug2, CommerceLynxCard commerceLynxCard, Boolean bool, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) == 0 ? str3 : "", (i3 & 8) != 0 ? null : commerceAgentActionButton, (i3 & 16) != 0 ? -1 : i, (i3 & 32) != 0 ? new CommerceAgentPassExt(0, null, 0, null, null, null, 0, null, 0, null, 0, null, null, 8191, null) : commerceAgentPassExt, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? C13BV.INSTANCE : list, (i3 & 256) != 0 ? null : commerceAgentSug, (i3 & 512) != 0 ? new LinkedHashMap() : map, (i3 & 1024) != 0 ? null : commerceAgentSug2, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : commerceLynxCard, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? bool : null);
    }
}
