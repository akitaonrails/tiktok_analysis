package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class Preload implements Serializable {

    @C09CT("comment_median_time")
    public long commentMedianTime;

    @C09CT("comment_pro")
    public double commentPro;

    @C09CT("comment_thres")
    public double commentThres;

    @C09CT("model_v2")
    public int modelV2;

    @C09CT("predict_config")
    public String predictConfig;

    @C09CT("profile_median_time")
    public long profileMedianTime;

    @C09CT("profile_pro")
    public double profilePro;

    @C09CT("profile_thres")
    public double profileThres;

    @C09CT("comment")
    public int commentPreload = -1;

    @C09CT("profile")
    public int profilePreload = -1;
}
