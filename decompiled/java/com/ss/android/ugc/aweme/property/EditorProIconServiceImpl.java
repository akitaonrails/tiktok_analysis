package com.ss.android.ugc.aweme.property;

import X.C0C64;
import com.ss.android.ugc.aweme.services.IEditorProIconService;

/* JADX INFO: loaded from: classes3.dex */
public final class EditorProIconServiceImpl implements IEditorProIconService {
    @Override // com.ss.android.ugc.aweme.services.IEditorProIconService
    public final boolean enableNewEditorProIcon() {
        return C0C64.LJIILLIIL().LJIJ(31744, 2, "studio_change_editor_pro_icon", true) != 0;
    }

    @Override // com.ss.android.ugc.aweme.services.IEditorProIconService
    public final String getTransparentEditorProIconUrl() {
        return C0C64.LJIILLIIL().LJJ(31744, "studio_transparent_editor_pro_icon_url", "https://p16-sg.tiktokcdn.com/obj/tiktok-obj/Video_Play_Split_Fill.png", true);
    }
}
