package com.ss.android.ugc.aweme.editpost;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class ClientText implements Serializable {

    @C09CT("markup_extra")
    public List<TextExtraStruct> markupExtra;

    @C09CT("markup_text")
    public String markupText;

    @C09CT("text_extra")
    public List<TextExtraStruct> textExtra;

    public ClientText() {
        this("", null, null);
    }

    public final ClientText copy(String str, List<? extends TextExtraStruct> list, List<? extends TextExtraStruct> list2) {
        return new ClientText(str, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientText)) {
            return false;
        }
        ClientText clientText = (ClientText) obj;
        return Intrinsics.LJFF(this.markupText, clientText.markupText) && Intrinsics.LJFF(this.textExtra, clientText.textExtra) && Intrinsics.LJFF(this.markupExtra, clientText.markupExtra);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClientText(markupText=");
        sbLIZ.append(this.markupText);
        sbLIZ.append(", textExtra=");
        sbLIZ.append(this.textExtra);
        sbLIZ.append(", markupExtra=");
        sbLIZ.append(this.markupExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClientText(String str, List<? extends TextExtraStruct> list, List<? extends TextExtraStruct> list2) {
        this.markupText = str;
        this.textExtra = list;
        this.markupExtra = list2;
    }
}
