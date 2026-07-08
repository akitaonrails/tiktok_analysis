package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class InteractionConflict {

    @C09CT("isConflict")
    public boolean isconflict;

    @C09CT("conflictList")
    public List<InteractionConflictItem> conflictlist = new ArrayList();

    @C09CT("prompts")
    public String prompts = "";
}
