package com.ss.android.ugc.aweme.contentlanguage.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ConfigListResponse extends BaseResponse {

    @C09CT("content_languages")
    public List<? extends ContentLanguage> contentLanguage;
}
