package com.ss.android.ugc.gamora.editor.sticker.read.voiceclone;

import X.C040I;
import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501240pAY;
import X.InterfaceC2177008fw;
import com.google.gson.n;

/* JADX INFO: loaded from: classes4.dex */
public final class VoiceCloneTTSApi {
    public static final /* synthetic */ int LIZ = 0;

    public interface Api {
        @InterfaceC1501240pAY("/internal/api/v1/invoke")
        C0X9S<TTSLokiInfoResponse> getLokiInfoFromSpeakerId(@InterfaceC1501070pAH("appkey") String str, @InterfaceC1501070pAH("namespace") String str2, @C040I n nVar, @InterfaceC2177008fw Object obj);

        @InterfaceC1501240pAY("/internal/api/v1/invoke")
        C0X9S<TTSSpeakerInfoResponse> getSpeakerInfoFromUid(@InterfaceC1501070pAH("appkey") String str, @InterfaceC1501070pAH("namespace") String str2, @C040I n nVar, @InterfaceC2177008fw Object obj);
    }
}
