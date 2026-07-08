package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TtsVoiceInfo implements Serializable {

    @C09CT("tts_voice_reuse_params_obj")
    public List<TtsReuseModel> ttsReuseParams;

    @C09CT("tts_voice_reuse_params_origin_obj")
    public List<TtsReuseModel> ttsReuseParamsOrigin;

    @C09CT("tts_voice_reuse_params")
    public String ttsReuseParamsString;

    @C09CT("tts_voice_attr_obj")
    public List<TtsVoiceAttr> ttsVoiceAttr;

    @C09CT("tts_voice_attr")
    public String ttsVoiceAttrString;

    public TtsVoiceInfo() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TtsVoiceInfo)) {
            return false;
        }
        TtsVoiceInfo ttsVoiceInfo = (TtsVoiceInfo) obj;
        return Intrinsics.LJFF(this.ttsVoiceAttrString, ttsVoiceInfo.ttsVoiceAttrString) && Intrinsics.LJFF(this.ttsReuseParamsString, ttsVoiceInfo.ttsReuseParamsString) && Intrinsics.LJFF(this.ttsVoiceAttr, ttsVoiceInfo.ttsVoiceAttr) && Intrinsics.LJFF(this.ttsReuseParams, ttsVoiceInfo.ttsReuseParams) && Intrinsics.LJFF(this.ttsReuseParamsOrigin, ttsVoiceInfo.ttsReuseParamsOrigin);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TtsVoiceInfo(ttsVoiceAttrString=");
        sbLIZ.append(this.ttsVoiceAttrString);
        sbLIZ.append(", ttsReuseParamsString=");
        sbLIZ.append(this.ttsReuseParamsString);
        sbLIZ.append(", ttsVoiceAttr=");
        sbLIZ.append(this.ttsVoiceAttr);
        sbLIZ.append(", ttsReuseParams=");
        sbLIZ.append(this.ttsReuseParams);
        sbLIZ.append(", ttsReuseParamsOrigin=");
        sbLIZ.append(this.ttsReuseParamsOrigin);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setTtsReuseParams(List<TtsReuseModel> list) {
        this.ttsReuseParams = list;
    }

    public final void setTtsReuseParamsOrigin(List<TtsReuseModel> list) {
        this.ttsReuseParamsOrigin = list;
    }

    public final void setTtsReuseParamsString(String str) {
        this.ttsReuseParamsString = str;
    }

    public final void setTtsVoiceAttr(List<TtsVoiceAttr> list) {
        this.ttsVoiceAttr = list;
    }

    public final void setTtsVoiceAttrString(String str) {
        this.ttsVoiceAttrString = str;
    }

    public TtsVoiceInfo(String str, String str2, List<TtsVoiceAttr> list, List<TtsReuseModel> list2, List<TtsReuseModel> list3) {
        this.ttsVoiceAttrString = str;
        this.ttsReuseParamsString = str2;
        this.ttsVoiceAttr = list;
        this.ttsReuseParams = list2;
        this.ttsReuseParamsOrigin = list3;
    }
}
