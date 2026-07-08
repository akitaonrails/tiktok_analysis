package com.ss.android.ugc.aweme.preview.api;

import X.AbstractC19484711Kz;
import X.C197092129i;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.preview.model.WebPreviewVerifyModel;

/* JADX INFO: loaded from: classes30.dex */
public interface WebPreviewVerifyApi {
    public static final C197092129i LIZ = C197092129i.LIZ;

    @InterfaceC1501160pAQ("/tiktok_creator/editor_tool/api/v1/post_draft/app_editor_preview_result")
    AbstractC19484711Kz<WebPreviewVerifyModel> getVerifyResult(@InterfaceC1501070pAH("editor_draft_id") String str);
}
