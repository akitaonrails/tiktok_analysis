package com.ss.android.ugc.aweme.nimblecard.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class Component {

    @C09CT("abilities")
    public final List<Ability> abilities;

    @C09CT("children")
    public final List<Child> children;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("padding")
    public final List<Integer> padding;

    public Component(String str, List<Ability> list, List<Integer> list2, List<Child> list3) {
        this.id = str;
        this.abilities = list;
        this.padding = list2;
        this.children = list3;
    }
}
