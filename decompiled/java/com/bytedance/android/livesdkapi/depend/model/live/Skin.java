package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class Skin {

    @C09CT("account")
    public SkinHostAccount account;

    @C09CT("drawer_entrance")
    public SkinDrawerEntrance drawerEntrance;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    public Skin() {
        this(null, null, "");
    }

    public Skin(SkinHostAccount skinHostAccount, SkinDrawerEntrance skinDrawerEntrance, String str) {
        this.account = skinHostAccount;
        this.drawerEntrance = skinDrawerEntrance;
        this.scene = str;
    }
}
