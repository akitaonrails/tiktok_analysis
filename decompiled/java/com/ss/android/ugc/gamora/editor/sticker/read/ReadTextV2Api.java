package com.ss.android.ugc.gamora.editor.sticker.read;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501240pAY;
import X.InterfaceC2177008fw;
import com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi;

/* JADX INFO: loaded from: classes4.dex */
public final class ReadTextV2Api {
    public static final /* synthetic */ int LIZ = 0;

    public interface Api {
        @InterfaceC1501240pAY("/media/api/text/speech/invoke/")
        C0X9S<TextToSpeechApi.FetchTextAudioResponse> get(@InterfaceC1501070pAH("req_text") String str, @InterfaceC1501070pAH("text_speaker") String str2, @InterfaceC1501070pAH("speaker_map_type") int i, @InterfaceC1501070pAH("namespace") String str3, @InterfaceC2177008fw Object obj);
    }
}
