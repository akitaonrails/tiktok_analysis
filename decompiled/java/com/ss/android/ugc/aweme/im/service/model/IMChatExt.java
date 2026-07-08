package com.ss.android.ugc.aweme.im.service.model;

import X.C09CT;
import java.io.Serializable;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes15.dex */
public class IMChatExt implements Serializable {
    public static final DecimalFormat FMT = new DecimalFormat("##0.000000");

    @C09CT("ext")
    public String ext = "";

    @C09CT("commerce_scene")
    public String commerceScene = "";

    @C09CT("object_id")
    public String objectId = "";
}
