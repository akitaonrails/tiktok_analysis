package com.ss.android.ugc.gamora.editor.audio.tts.network;

import X.C01GW;
import X.C09CT;
import X.C11NZ;
import X.C452501pT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501170pAR;
import X.InterfaceC2177008fw;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class TextToSpeechApi {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(586));

    public interface Api {
        @InterfaceC1501170pAR("/media/api/text/speech/invoke/")
        C11NZ<FetchTextAudioResponse> requestAudio(@InterfaceC1501070pAH("req_text") String str, @InterfaceC1501070pAH("speaker_map_type") int i, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2177008fw Object obj);
    }

    public static final class FetchTextAudioResponse extends BaseNetResponse {
        public final TextAudioData data;
        public TextAudioExtra extra;

        @C09CT("status_msg")
        public String statusMsg;

        public final TextAudioData getData() {
            return this.data;
        }

        public final TextAudioExtra getExtra() {
            return this.extra;
        }

        public final String getStatusMsg() {
            return this.statusMsg;
        }

        public final void setExtra(TextAudioExtra textAudioExtra) {
            this.extra = textAudioExtra;
        }

        public final void setStatusMsg(String str) {
            this.statusMsg = str;
        }
    }

    public static final class TextAudioExtra {

        @C09CT("log_id")
        public final String logId;

        public TextAudioExtra() {
            this(null);
        }

        public TextAudioExtra(String str) {
            this.logId = str;
        }
    }

    public static final class TextAudioData {

        @C09CT("v_str")
        public final String audio;

        @C09CT("s_key")
        public final String key;

        public TextAudioData() {
            this(null, null);
        }

        public TextAudioData(String str, String str2) {
            this.key = str;
            this.audio = str2;
        }
    }
}
