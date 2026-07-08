package com.ss.android.ugc.gamora.editor.services;

import X.C1459590o5N;
import X.C1459920o5u;
import X.C1459930o5v;
import X.C1461010o7f;
import X.C19A3;
import X.C19EG;
import X.C348100Dkm;
import X.InterfaceC1455610nyx;
import X.InterfaceC1455860nzM;
import android.content.Context;
import android.util.Size;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS128S1100000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.AwS678S0100000_29;

/* JADX INFO: loaded from: classes23.dex */
public interface IMusicEditService {
    C1459930o5v LIZ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, AwS566S0100000_22 awS566S0100000_22);

    C1461010o7f LIZIZ(long j, NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel);

    C1459590o5N LIZJ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, C19A3 c19a3, InterfaceC1455610nyx interfaceC1455610nyx);

    C1459930o5v LIZLLL();

    NLEModel LJ(NLEModel nLEModel);

    boolean LJFF(C348100Dkm c348100Dkm);

    boolean LJI(VideoPublishEditModel videoPublishEditModel);

    boolean LJII();

    C1459920o5u LJIIIIZZ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, AwS558S0100000_14 awS558S0100000_14);

    void LJIIIZ();

    void LJIIJ(VideoPublishEditModel videoPublishEditModel, SrcImageInfo srcImageInfo, Size size, String str, AwS643S0100000_29 awS643S0100000_29, AwS678S0100000_29 awS678S0100000_29, AFwS261S0000000_22 aFwS261S0000000_22, AFwS261S0000000_22 aFwS261S0000000_222);

    void LJIIJJI(VideoPublishEditModel videoPublishEditModel);

    boolean LJIIL(VideoPublishEditModel videoPublishEditModel);

    boolean LJIILIIL(InterfaceC1455860nzM interfaceC1455860nzM);

    TuxPanel LJIILJJIL(FragmentManager fragmentManager, Context context, PreCheckResult preCheckResult, VideoPublishEditModel videoPublishEditModel, String str, String str2, int i, Integer num, AwS128S1100000_14 awS128S1100000_14);

    boolean LJIILL(NLEModel nLEModel);

    void LJIILLIIL(VideoPublishEditModel videoPublishEditModel, boolean z);

    void LJIIZILJ(Long l, String str, String str2);

    boolean LJIJ(VideoPublishEditModel videoPublishEditModel);

    boolean LJIJI(VideoPublishEditModel videoPublishEditModel, boolean z);
}
