package com.ss.ugc.android.editor.components.base.api;

import X.C19EG;
import X.C355130Dw7;
import androidx.fragment.app.Fragment;
import com.bytedance.news.common.service.manager.IService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public interface ISoundRecordService extends IService {
    void recordStateChanged(C19EG c19eg, Function1<? super C355130Dw7, Unit> function1);

    void recordWavePointsChanged(C19EG c19eg, Function1<? super List<Float>, Unit> function1);

    Fragment showAudioRecordFragment();
}
