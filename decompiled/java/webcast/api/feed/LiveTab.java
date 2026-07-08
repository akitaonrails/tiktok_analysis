package webcast.api.feed;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class LiveTab {

    @C09CT("live_tab_mg")
    public LiveTabMG liveTabMg;

    @C09CT("type")
    public int type;

    @C09CT("name")
    public String name = "";

    @C09CT("content")
    public String content = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveTab(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", name='");
        sbLIZ.append(this.name);
        sbLIZ.append("', content='");
        sbLIZ.append(this.content);
        sbLIZ.append("', liveTabMg=");
        sbLIZ.append(this.liveTabMg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
