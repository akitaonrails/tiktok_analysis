package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.model.Board;

/* JADX INFO: loaded from: classes28.dex */
public final class UpsertBoardReq {

    @C09CT("board")
    public Board board;

    @C09CT("force_upsert")
    public boolean forceUpsert;

    @C09CT("supported_dsl_version")
    public long supportedDslVersion;
}
