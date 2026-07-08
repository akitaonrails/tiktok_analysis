package com.ss.android.ugc.aweme.tools.sticker.core.text.util;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Bloom {

    @C09CT("blurDegree")
    public Float blurDegree;

    @C09CT("color")
    public List<Float> color;

    @C09CT("colorCustomized")
    public Boolean colorCustomized;

    @C09CT("dirX")
    public Float dirX;

    @C09CT("dirY")
    public Float dirY;

    @C09CT("enable")
    public Boolean enable;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("path")
    public String path;

    @C09CT("range")
    public Integer range;

    @C09CT("strength")
    public Integer strength;

    public Bloom() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public Bloom(Float f, List<Float> list, Boolean bool, Float f2, Float f3, Boolean bool2, String str, String str2, Integer num, Integer num2) {
        this.blurDegree = f;
        this.color = list;
        this.colorCustomized = bool;
        this.dirX = f2;
        this.dirY = f3;
        this.enable = bool2;
        this.id = str;
        this.path = str2;
        this.range = num;
        this.strength = num2;
    }
}
