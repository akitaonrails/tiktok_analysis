package com.ss.android.ugc.aweme.story.feed.common.sub.photo.base;

import X.C03H5;
import X.C0BNX;
import X.C1333930koh;
import X.C724270Sb3;
import X.InterfaceC658750Psf;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class StoryBasePhotoComponent<RECEIVER extends C03H5> extends BaseCellContentComponent<RECEIVER> implements InterfaceC658750Psf {
    @Override // X.InterfaceC658750Psf
    public final /* synthetic */ void Ck(JSONObject jSONObject) {
    }

    @Override // X.InterfaceC658750Psf
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
        Object obj;
        if (!z && C0BNX.LIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String aid = ((VideoItemParams) obj).getAweme().getAid();
            if (aid != null) {
                C1333930koh.LIZ(aid, jSONObject);
            }
        }
    }
}
