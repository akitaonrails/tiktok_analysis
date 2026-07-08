package webcast.api.feed;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TabMGTopLive {

    @C09CT("join_live_btn")
    public MGJoinLiveBtn joinLiveBtn;

    @C09CT("play_module")
    public List<MGModulePlay> playModule = new ArrayList();

    @C09CT("interaction_module")
    public List<MGModuleInteraction> interactionModule = new ArrayList();

    @C09CT("tab_module")
    public List<MGModuleTab> tabModule = new ArrayList();
}
