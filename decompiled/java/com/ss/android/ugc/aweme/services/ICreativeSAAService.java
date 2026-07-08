package com.ss.android.ugc.aweme.services;

import X.AbstractC1387200mCc;
import X.C19EG;
import X.InterfaceC524950KiL;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public interface ICreativeSAAService {

    public static final class DefaultImpls {
    }

    Lifecycle activityGetLifecycleSafely(C19EG c19eg);

    void finishActivitySafely(Activity activity);

    void finishCurrentPage(Activity activity);

    void finishSAAActivitySafely(Activity activity);

    InterfaceC524950KiL getAVListenableActivityRegistry(Activity activity);

    LifecycleOwner getCreativeLifecycleOwner(Activity activity);

    Scene getCurrentScene(Activity activity);

    Scene getSecondScene(Activity activity);

    boolean hasCreativeToolContainerScene();

    void invokeMethodsSafely(Activity activity, Function0<Unit> function0);

    boolean isCreativePage(AbstractC1387200mCc abstractC1387200mCc);

    boolean isEditScene(Activity activity);

    boolean isEditSceneInStory(Activity activity);

    boolean isPublishEditScene(Activity activity);

    boolean isPublishScene(Activity activity);

    boolean isSAAActivity(Activity activity);

    boolean isShootScene(Activity activity);

    void openPublishPage(Context context, Intent intent);

    void setResult(Activity activity, int i, Intent intent);
}
