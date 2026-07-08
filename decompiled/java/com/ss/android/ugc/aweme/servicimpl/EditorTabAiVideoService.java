package com.ss.android.ugc.aweme.servicimpl;

import X.C0MUK;
import X.C0MWH;
import X.C19A3;
import X.C1DRG;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.AlbumModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tiktok.IEditorTabAiVideoService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class EditorTabAiVideoService implements IEditorTabAiVideoService {
    @Override // com.ss.android.ugc.tiktok.IEditorTabAiVideoService
    public final void LIZ(C1DRG c1drg, C19A3 c19a3) {
        Bundle bundle = new Bundle();
        ShortVideoContext shortVideoContext = (ShortVideoContext) c1drg.LJII(ShortVideoContext.class, null);
        CreativeModel creativeModelLIZIZ = CreativeModel.LIZIZ(shortVideoContext.creativeModel, null, null, null, null, -1, -1, -1, 2097151);
        creativeModelLIZIZ.eventData.shootEnterMethod = shortVideoContext.enterMethod;
        creativeModelLIZIZ.recordData.shootMode = shortVideoContext.shootMode;
        creativeModelLIZIZ.editStickerModel.commentVideoModel = shortVideoContext.LJFF();
        creativeModelLIZIZ.microAppModel = shortVideoContext.microAppModel;
        creativeModelLIZIZ.creativeFlowData = shortVideoContext.creativeFlowData;
        if (TextUtils.equals(shortVideoContext.enterFrom, "douplus")) {
            creativeModelLIZIZ.initialModel.mentionUserModel = shortVideoContext.mentionUserModel;
            creativeModelLIZIZ.eventData.enterFrom = "douplus";
        } else if (!TextUtils.isEmpty(shortVideoContext.enterFrom)) {
            creativeModelLIZIZ.eventData.enterFrom = shortVideoContext.enterFrom;
        }
        AlbumModel albumModel = creativeModelLIZIZ.albumModel;
        albumModel.uploadMethod = shortVideoContext.uploadMethod;
        List<String> list = shortVideoContext.uploadTabNameList;
        if (list != null) {
            albumModel.uploadTabNameList = new ArrayList(list);
        }
        C0MUK.LJIIJ(bundle, creativeModelLIZIZ);
        C786410Ut5.LJJJI("extra_ai_playground_create_from", "create_tab", bundle);
        C786410Ut5.LJJJI("enter_from", shortVideoContext.enterFrom, bundle);
        C786410Ut5.LJJJI("enter_method", shortVideoContext.enterMethod, bundle);
        C786410Ut5.LJJJI("shoot_from", shortVideoContext.mShootFrom, bundle);
        C786410Ut5.LJJJI("shoot_way", shortVideoContext.shootWay, bundle);
        Context sceneContext = c19a3.getSceneContext();
        if (sceneContext != null) {
            C0MWH.LJIIL(sceneContext, bundle, "AIPlaygroundBaseScene", null, null, null, false, 120);
        }
    }
}
