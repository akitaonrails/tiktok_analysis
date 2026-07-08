package com.ss.android.ugc.aweme.translation.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class TranslationResult extends BaseResponse {

    @C09CT("content_id")
    public String contentId;

    @C09CT("src_content")
    public String srcContent;

    @C09CT("src_lang")
    public String srcLang;

    @C09CT("text_extra_list")
    public List<TextExtraStruct> textExtra;

    @C09CT("text_units")
    public List<Object> textUnits;

    @C09CT("translated_content")
    public String translatedContent;

    @C09CT("translation_status_code")
    public int translationStatusCode;

    @C09CT("variant")
    public String variant;
}
