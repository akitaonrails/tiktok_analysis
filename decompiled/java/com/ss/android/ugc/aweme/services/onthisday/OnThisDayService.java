package com.ss.android.ugc.aweme.services.onthisday;

import X.C0MMK;
import X.C19EG;
import X.InterfaceC522520KeQ;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public interface OnThisDayService {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    void cleanUpMaterialSelectScene(Scene scene);

    Object createShortVideoContext(Bundle bundle);

    Class<?> getMaterialSelectSceneClass();

    InterfaceC522520KeQ getMediaChosenResultProcess(int i, C19EG c19eg, Object obj, long j, long j2);

    Pair<Integer, Integer> getOutVideoSize(Object obj);

    void insertChallengeIfNeed(Intent intent, CreativeModel creativeModel, Context context);

    void startMaterialSelectScene(Scene scene, Bundle bundle, C0MMK c0mmk, Object obj, int i, Integer num, int i2);

    void startMaterialSelectScene(Scene scene, List<ForwardMedia> list, List<ForwardMedia> list2, C0MMK c0mmk, Object obj, int i, Integer num, int i2);

    public static final class DefaultImpls {
        public static /* synthetic */ void startMaterialSelectScene$default(OnThisDayService onThisDayService, Scene scene, List list, List list2, C0MMK c0mmk, Object obj, int i, Integer num, int i2, int i3, Object obj2) {
            if (obj2 == null) {
                if ((i3 & 64) != 0) {
                    num = null;
                }
                onThisDayService.startMaterialSelectScene(scene, list, list2, c0mmk, obj, i, num, i2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startMaterialSelectScene");
        }
    }
}
