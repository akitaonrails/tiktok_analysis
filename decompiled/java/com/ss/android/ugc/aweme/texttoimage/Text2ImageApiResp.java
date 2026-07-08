package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageApiResp {

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("title_of_preview")
    public final String hintByAi;

    @C09CT("is_help_text")
    public final Boolean isHelpText;

    @C09CT("keywords_list")
    public final List<String> keywordsList;

    @C09CT("need_return_line")
    public final Boolean needReturnLine;

    @C09CT("quota")
    public final Integer quota;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("text2image_info_list")
    public List<Text2ImageInfo> text2imageInfoList;

    @C09CT("text2image_show_list")
    public List<Text2ImageShowInfo> text2imageShowList;

    @C09CT("text_refined_by_ai")
    public final String textByAi;

    public Text2ImageApiResp(Integer num, String str, List<String> list, List<Text2ImageInfo> list2, List<Text2ImageShowInfo> list3, Boolean bool, Boolean bool2, Integer num2, Boolean bool3, String str2, String str3) {
        this.statusCode = num;
        this.statusMsg = str;
        this.keywordsList = list;
        this.text2imageInfoList = list2;
        this.text2imageShowList = list3;
        this.needReturnLine = bool;
        this.hasMore = bool2;
        this.quota = num2;
        this.isHelpText = bool3;
        this.hintByAi = str2;
        this.textByAi = str3;
    }

    public /* synthetic */ Text2ImageApiResp(Integer num, String str, List list, List list2, List list3, Boolean bool, Boolean bool2, Integer num2, Boolean bool3, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, list, list2, list3, bool, bool2, num2, (i & 256) != 0 ? null : bool3, (i & 512) != 0 ? null : str2, (i & 1024) == 0 ? str3 : null);
    }
}
