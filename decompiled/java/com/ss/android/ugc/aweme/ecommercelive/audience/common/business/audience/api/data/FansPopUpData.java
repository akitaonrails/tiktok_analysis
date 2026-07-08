package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class FansPopUpData {

    @C09CT("buttons")
    public List<Button> buttons;

    @C09CT("content")
    public String content;

    @C09CT("from_price")
    public String fromPrice;

    @C09CT("image")
    public final GImage image;

    @C09CT("schema")
    public String schema;

    @C09CT("title")
    public String title;

    @C09CT("to_price")
    public String toPrice;

    @C09CT("type")
    public Integer type;

    public FansPopUpData(Integer num, String str, String str2, String str3, String str4, List<Button> list, String str5, GImage gImage) {
        this.type = num;
        this.title = str;
        this.content = str2;
        this.fromPrice = str3;
        this.toPrice = str4;
        this.buttons = list;
        this.schema = str5;
        this.image = gImage;
    }
}
