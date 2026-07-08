package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class ModificationUploadReqMessage {

    @C09CT("modifications")
    public List<Modification> modifications = new ArrayList();

    @C09CT("room_id")
    public long roomId;
}
