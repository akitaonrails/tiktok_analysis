package webcast.api.game;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TnsPiracyInfoRequest {

    @C09CT("details")
    public List<TnsPiracyDetail> details;

    @C09CT("operation_info")
    public OperationInfo operationInfo;

    @C09CT("room_id")
    public long roomId;

    @C09CT("user_id")
    public long userId;
}
