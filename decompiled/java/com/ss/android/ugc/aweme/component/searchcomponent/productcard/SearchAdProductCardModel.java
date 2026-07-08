package com.ss.android.ugc.aweme.component.searchcomponent.productcard;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.model.JumpData;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdProductCardModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("button_background_color")
    public final String buttonBackgroundColor;

    @C09CT("button_show_color_seconds")
    public final Float buttonShowColorSeconds;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("jump_data")
    public final JumpData jump_data;

    @C09CT("products")
    public final List<ProductInfo> productList;

    @C09CT("view_more_button_title")
    public final String viewMoreBtnTitle;

    @C09CT("view_more_jump_data")
    public final JumpData viewMoreJumpData;

    public SearchAdProductCardModel(JumpData jumpData, List<ProductInfo> list, String str, JumpData jumpData2, Float f, String str2, String str3) {
        this.jump_data = jumpData;
        this.productList = list;
        this.viewMoreBtnTitle = str;
        this.viewMoreJumpData = jumpData2;
        this.buttonShowColorSeconds = f;
        this.buttonBackgroundColor = str2;
        this.buttonText = str3;
    }
}
