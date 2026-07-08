package com.ss.ugc.android.editor.components.base.api;

import X.C0E48;
import X.C19EG;
import X.C363110ELl;
import android.content.Intent;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.news.common.service.manager.IService;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public interface IVideoCropService extends IService {
    void processCropResult(C19EG c19eg, Intent intent);

    void startCrop(C19EG c19eg, NLETrackSlot nLETrackSlot);

    void startCrop(NavigationScene navigationScene, Scene scene, C19EG c19eg, NLETrackSlot nLETrackSlot, C0E48 c0e48, Function2<? super C363110ELl, ? super Function1<? super NLETrackSlot, Unit>, Unit> function2);
}
