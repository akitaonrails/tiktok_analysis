package webcast.api.pgc_sub;

import X.C09CT;
import emotes.model.EmoteListResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCSubPackagePrivilege {

    @C09CT("customized_perks")
    public List<PerkItem> customizedPerks = new ArrayList();

    @C09CT("emote_details")
    public EmoteListResult emoteDetails;

    @C09CT("package_summary")
    public PGCSubPackageSummary packageSummary;
}
