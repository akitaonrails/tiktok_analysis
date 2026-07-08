package com.ss.android.ugc.aweme.aigc.aiplayground;

import X.InterfaceC1364105Vn;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public interface IAIPlaygroundDraftService {
    Object LIZ(String str, String str2, String str3, CreativeModel creativeModel, String str4, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LIZIZ(EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, List list);

    void LIZJ(VideoPublishEditModel videoPublishEditModel, NLETrackSlot nLETrackSlot);
}
