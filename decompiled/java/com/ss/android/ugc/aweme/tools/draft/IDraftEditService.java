package com.ss.android.ugc.aweme.tools.draft;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS212S0300000_3;

/* JADX INFO: loaded from: classes4.dex */
public interface IDraftEditService {
    void LIZ(Activity activity, AwemeDraft awemeDraft, int i, long j);

    void LIZIZ(AwemeDraft awemeDraft, Context context, LifecycleOwner lifecycleOwner, AwS212S0300000_3 awS212S0300000_3);

    void LIZJ(Context context, AwemeDraft awemeDraft, VideoPublishEditModel videoPublishEditModel, long j, String str);
}
