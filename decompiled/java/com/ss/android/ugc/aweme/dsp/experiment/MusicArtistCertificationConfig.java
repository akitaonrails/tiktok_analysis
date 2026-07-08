package com.ss.android.ugc.aweme.dsp.experiment;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicArtistCertificationConfig {

    @C09CT("artist_certification_landing_url")
    public final String landingUrl;

    @C09CT("artist_certification_lynx_preload_channels")
    public final List<String> preloadChannels;

    @C09CT("artist_certification_search_input_url")
    public final String searchInputUrl;

    @C09CT("artist_certification_status_url")
    public final String statusUrl;

    public MusicArtistCertificationConfig() {
        this(null, null, null, null, 15, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicArtistCertificationConfig(landingUrl=");
        sbLIZ.append(this.landingUrl);
        sbLIZ.append(", statusUrl=");
        sbLIZ.append(this.statusUrl);
        sbLIZ.append(", searchInputUrl=");
        sbLIZ.append(this.searchInputUrl);
        sbLIZ.append(", preloadChannels=");
        sbLIZ.append(this.preloadChannels);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MusicArtistCertificationConfig(String str, String str2, String str3, List<String> list) {
        this.landingUrl = str;
        this.statusUrl = str2;
        this.searchInputUrl = str3;
        this.preloadChannels = list;
    }

    public MusicArtistCertificationConfig(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
