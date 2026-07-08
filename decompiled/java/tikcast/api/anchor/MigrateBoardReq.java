package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.model.Board;

/* JADX INFO: loaded from: classes.dex */
public final class MigrateBoardReq {

    @C09CT("board")
    public Board board;

    @C09CT("supported_dsl_version")
    public long supportedDslVersion;
}
