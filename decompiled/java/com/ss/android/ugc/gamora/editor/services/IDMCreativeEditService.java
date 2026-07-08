package com.ss.android.ugc.gamora.editor.services;

import X.InterfaceC1444170ngV;
import X.InterfaceC1446740nke;
import android.content.Context;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public interface IDMCreativeEditService {
    boolean LIZ(VideoPublishEditModel videoPublishEditModel);

    boolean LIZIZ(VideoPublishEditModel videoPublishEditModel);

    TuxSheet LIZJ(Context context, VideoPublishEditModel videoPublishEditModel, Function0 function0, Function0 function02, Function2 function2, Function1 function1);

    boolean LIZLLL(VideoPublishEditModel videoPublishEditModel, InterfaceC1444170ngV interfaceC1444170ngV, InterfaceC1446740nke interfaceC1446740nke);

    boolean LJ(VideoPublishEditModel videoPublishEditModel);

    void LJFF(VideoPublishEditModel videoPublishEditModel, Map<String, String> map);

    void LJI(int i, int i2, VideoPublishEditModel videoPublishEditModel, String str);

    boolean LJII(VideoPublishEditModel videoPublishEditModel);

    void LJIIIIZZ(int i, int i2, VideoPublishEditModel videoPublishEditModel);

    boolean LJIIIZ(VideoPublishEditModel videoPublishEditModel);

    void LJIIJ(VideoPublishEditModel videoPublishEditModel, Map<String, String> map);

    boolean LJIIJJI();

    void LJIIL(VideoPublishEditModel videoPublishEditModel, boolean z, Integer num, Integer num2);

    Map<String, String> LJIILIIL(VideoPublishEditModel videoPublishEditModel);
}
