package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GeographicModule {

    @C09CT("cohost_country_count")
    public long cohostCountryCount;

    @C09CT("viewer_country_count")
    public long viewerCountryCount;

    @C09CT("top_viewer_countries")
    public List<String> topViewerCountries = new ArrayList();

    @C09CT("title_starling")
    public String titleStarling = "";
}
