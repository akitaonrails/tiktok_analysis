package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ImChatNoticeModel extends BaseResponse {

    @C09CT("data")
    public IMNoticeMsgStruct noticeMsgStruct;

    @C09CT("data_arr")
    public List<IMNoticeMsgStruct> noticeMsgStructArr;
}
