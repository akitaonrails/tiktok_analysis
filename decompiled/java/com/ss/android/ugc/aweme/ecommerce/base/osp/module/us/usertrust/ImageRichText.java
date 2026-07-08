package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageRichText {

    @C09CT("icons")
    public List<Icon> icons;

    @C09CT("text")
    public String text;

    public ImageRichText() {
        this(null, null);
    }

    public ImageRichText(String str, List<Icon> list) {
        this.text = str;
        this.icons = list;
    }
}
