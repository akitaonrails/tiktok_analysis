package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import X.C123100dR;
import X.C1ER1;
import X.C654080Pl8;
import X.EnumC654060Pl6;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class IMDBResource implements Serializable {

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    @C09CT("abstract")
    public final String f75abstract;

    @C09CT("abstract_markdown")
    public final String abstractMarkdown;

    @C09CT("cover")
    public final UrlModel cover;

    @C09CT("detail_url")
    public final String detailUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("rating")
    public final Float rating;

    @C09CT("rating_votes")
    public final Long ratingVotes;

    public IMDBResource() {
        this(null, null, "", null, null, null, null);
    }

    public final String getAbstract(boolean z) {
        if (z) {
            String str = this.abstractMarkdown;
            if (str == null) {
                return this.f75abstract;
            }
            return str;
        }
        return this.f75abstract;
    }

    public final C654080Pl8 toSearchHubMobParams(String str, int i, String str2) {
        String str3 = str;
        String str4 = this.id;
        String str5 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str6 = this.detailUrl;
        if (str6 != null) {
            str5 = str6;
        }
        return new C654080Pl8(str4, str3, str5, EnumC654060Pl6.IMDB, i, C123100dR.LIZ(getAbstract(C1ER1.LIZIZ.LJJIJIL())) ? 1 : 0, str2);
    }

    public IMDBResource(Float f, Long l, String str, UrlModel urlModel, String str2, String str3, String str4) {
        this.rating = f;
        this.ratingVotes = l;
        this.id = str;
        this.cover = urlModel;
        this.detailUrl = str2;
        this.f75abstract = str3;
        this.abstractMarkdown = str4;
    }
}
