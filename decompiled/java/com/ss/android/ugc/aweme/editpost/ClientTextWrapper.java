package com.ss.android.ugc.aweme.editpost;

import X.C09CT;
import X.C163V;
import X.C207139163t;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class ClientTextWrapper implements Serializable {

    @C09CT("client_text_v2")
    public final ClientText clientText;

    @C09CT("translation_protocol")
    public final int translationProtocol;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClientTextWrapper(translationProtocol=");
        sbLIZ.append(this.translationProtocol);
        sbLIZ.append(", clientText=");
        sbLIZ.append(this.clientText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C163V getTranslationProtocol() {
        C207139163t c207139163t = C163V.Companion;
        int i = this.translationProtocol;
        c207139163t.getClass();
        return C207139163t.LIZ(i);
    }

    public ClientTextWrapper(int i, ClientText clientText) {
        this.translationProtocol = i;
        this.clientText = clientText;
    }
}
