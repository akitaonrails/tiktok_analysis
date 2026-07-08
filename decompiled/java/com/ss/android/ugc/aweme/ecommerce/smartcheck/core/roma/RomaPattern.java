package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class RomaPattern {

    @C09CT("auth")
    public final String auth;

    @C09CT("bizLineName")
    public final String bizLineName;

    @C09CT("patternId")
    public final int id = -1;

    @C09CT("patternKey")
    public final List<RomaPatternKey> keys;

    @C09CT("linkList")
    public final List<String> linkList;

    @C09CT("osList")
    public final List<Integer> osList;

    @C09CT("ownerList")
    public final List<String> ownerList;

    @C09CT("pattern")
    public final String pattern;

    @C09CT("protocolList")
    public final List<String> protocolList;

    @C09CT("routerHost")
    public final String routerHost;

    @C09CT("title")
    public final String title;

    public final String getAuth() {
        return this.auth;
    }

    public final String getBizLineName() {
        return this.bizLineName;
    }

    public final int getId() {
        return this.id;
    }

    public final List<RomaPatternKey> getKeys() {
        return this.keys;
    }

    public final List<String> getLinkList() {
        return this.linkList;
    }

    public final List<Integer> getOsList() {
        return this.osList;
    }

    public final List<String> getOwnerList() {
        return this.ownerList;
    }

    public final String getPattern() {
        return this.pattern;
    }

    public final List<String> getProtocolList() {
        return this.protocolList;
    }

    public final String getRouterHost() {
        return this.routerHost;
    }

    public final String getTitle() {
        return this.title;
    }
}
