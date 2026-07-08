package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import X.C123100dR;
import X.C1ER1;
import X.C654080Pl8;
import X.EnumC654060Pl6;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class WikiResource implements Serializable {

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    @C09CT("abstract")
    public final String f76abstract;

    @C09CT("abstract_markdown")
    public final String abstractMarkdown;

    @C09CT("doc_id")
    public final String docId;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("image")
    public final String image;

    @C09CT("unique_key")
    public final String uniqueKey;

    @C09CT("url")
    public final String url;

    public WikiResource() {
        this("", null, null, null, null, null, null);
    }

    public final String getAbstract(boolean z) {
        if (z) {
            String str = this.abstractMarkdown;
            if (str == null) {
                return this.f76abstract;
            }
            return str;
        }
        return this.f76abstract;
    }

    public final C654080Pl8 toSearchHubMobParams(String str, int i, String str2) {
        String str3 = str;
        String str4 = this.id;
        String str5 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str6 = this.url;
        if (str6 != null) {
            str5 = str6;
        }
        return new C654080Pl8(str4, str3, str5, EnumC654060Pl6.WIKI, i, C123100dR.LIZ(getAbstract(C1ER1.LIZIZ.LJJIJIL())) ? 1 : 0, str2);
    }

    public WikiResource(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.id = str;
        this.image = str2;
        this.url = str3;
        this.f76abstract = str4;
        this.abstractMarkdown = str5;
        this.uniqueKey = str6;
        this.docId = str7;
    }
}
