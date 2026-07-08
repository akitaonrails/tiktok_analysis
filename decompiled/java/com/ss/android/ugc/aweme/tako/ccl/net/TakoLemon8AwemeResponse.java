package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoLemon8AwemeResponse extends TakoBaseResponse {

    @C09CT("aweme_info")
    public final Map<String, Aweme> awemes;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakoLemon8AwemeResponse) && Intrinsics.LJFF(this.awemes, ((TakoLemon8AwemeResponse) obj).awemes);
    }

    public final int hashCode() {
        Map<String, Aweme> map = this.awemes;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoLemon8AwemeResponse(awemes=");
        sbLIZ.append(this.awemes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoLemon8AwemeResponse() {
        this(C2097608Jq.LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TakoLemon8AwemeResponse(Map<String, ? extends Aweme> map) {
        super(null, 0, "");
        this.awemes = map;
    }
}
