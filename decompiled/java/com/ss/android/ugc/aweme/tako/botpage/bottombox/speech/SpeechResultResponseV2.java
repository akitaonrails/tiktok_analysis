package com.ss.android.ugc.aweme.tako.botpage.bottombox.speech;

import X.C09CT;
import X.C13BV;
import X.C15438062q;
import X.C2188811AlT;
import X.InterfaceC0189004d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SpeechResultResponseV2 implements InterfaceC0189004d {

    @C09CT("audio_info")
    public final SpeechAudioInfo audioInfo;

    @C09CT("result")
    public final SpeechResultBody result;

    public SpeechResultResponseV2() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeechResultResponseV2)) {
            return false;
        }
        SpeechResultResponseV2 speechResultResponseV2 = (SpeechResultResponseV2) obj;
        return Intrinsics.LJFF(this.audioInfo, speechResultResponseV2.audioInfo) && Intrinsics.LJFF(this.result, speechResultResponseV2.result);
    }

    public final int hashCode() {
        SpeechAudioInfo speechAudioInfo = this.audioInfo;
        int iHashCode = (speechAudioInfo == null ? 0 : speechAudioInfo.hashCode()) * 31;
        SpeechResultBody speechResultBody = this.result;
        return iHashCode + (speechResultBody != null ? speechResultBody.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpeechResultResponseV2(audioInfo=");
        sbLIZ.append(this.audioInfo);
        sbLIZ.append(", result=");
        sbLIZ.append(this.result);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC0189004d
    public final String getRequestId() {
        SpeechResultAddition speechResultAddition;
        String str;
        SpeechResultBody speechResultBody = this.result;
        return (speechResultBody == null || (speechResultAddition = speechResultBody.additions) == null || (str = speechResultAddition.logId) == null) ? "" : str;
    }

    @Override // X.InterfaceC0189004d
    public final List<SpeechResult> getResultList() {
        List<SpeechUtterance> list;
        SpeechResultBody speechResultBody = this.result;
        String str = speechResultBody != null ? speechResultBody.text : null;
        if (str != null && str.length() != 0) {
            return Collections.singletonList(new SpeechResult(str));
        }
        SpeechResultBody speechResultBody2 = this.result;
        if (speechResultBody2 != null && (list = speechResultBody2.utterances) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<SpeechUtterance> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new SpeechResult(it2.next().text));
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return C13BV.INSTANCE;
    }

    public SpeechResultResponseV2(SpeechAudioInfo speechAudioInfo, SpeechResultBody speechResultBody) {
        this.audioInfo = speechAudioInfo;
        this.result = speechResultBody;
    }
}
