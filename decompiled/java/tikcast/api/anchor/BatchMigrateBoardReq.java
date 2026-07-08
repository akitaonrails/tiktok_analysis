package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.model.Board;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BatchMigrateBoardReq {

    @C09CT("boards")
    public List<Board> boards = new ArrayList();

    @C09CT("supported_dsl_version")
    public long supportedDslVersion;
}
