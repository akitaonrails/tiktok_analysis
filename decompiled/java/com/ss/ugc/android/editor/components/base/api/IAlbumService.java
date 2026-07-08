package com.ss.ugc.android.editor.components.base.api;

import X.C0E48;
import X.C0LJQ;
import X.C19EG;
import android.content.Intent;
import com.bytedance.news.common.service.manager.IService;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public interface IAlbumService extends IService {
    int getResultCode();

    List<EditMedia> parseIntentData(C19EG c19eg, Intent intent, Integer num);

    void startSelectMedia(C19EG c19eg, C0E48 c0e48, int i, C0LJQ c0ljq, Function0<Unit> function0);

    void startSelectMediaWithInsertIndex(C19EG c19eg, C0E48 c0e48, int i, C0LJQ c0ljq, Integer num, Function0<Unit> function0);
}
