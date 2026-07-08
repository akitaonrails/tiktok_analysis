package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class NativeCardInfo implements Serializable {

    @C09CT("feature_lable")
    public String featureLabel;

    @C09CT("feedback_rate")
    public int feedbackRate = -1;

    @C09CT("image")
    public UrlModel image;

    @C09CT("image_url")
    public String imageUrl;

    @C09CT("origin_price")
    public String originPrice;

    @C09CT("prompt_text")
    public String service;

    @C09CT("title")
    public String title;
}
