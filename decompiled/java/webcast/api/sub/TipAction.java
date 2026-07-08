package webcast.api.sub;

import X.C09CT;
import X.C2095008Iq;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class TipAction {

    @C09CT("action_type")
    public int actionType;

    @C09CT("display_type")
    public int displayType;

    @C09CT("title")
    public String title = "";

    @C09CT("action_url")
    public String actionUrl = "";

    @C09CT("action_extra_info")
    public Map<String, String> actionExtraInfo = new LinkedHashMap();

    public final String LIZ() {
        String str = this.actionExtraInfo.get("perkID");
        return str == null ? "" : str;
    }

    public final long LIZIZ() {
        Long lLJIILIIL;
        String str = this.actionExtraInfo.get("pinID");
        if (str == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str)) == null) {
            return 0L;
        }
        return lLJIILIIL.longValue();
    }

    public final int LIZJ() {
        Integer numLJIIJJI;
        String str = this.actionExtraInfo.get("pinCardType");
        if (str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null) {
            return 0;
        }
        return numLJIIJJI.intValue();
    }

    public final String LIZLLL() {
        String str = this.actionExtraInfo.get("templateID");
        return str == null ? "" : str;
    }
}
