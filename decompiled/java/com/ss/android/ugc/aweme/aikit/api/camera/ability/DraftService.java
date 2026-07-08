package com.ss.android.ugc.aweme.aikit.api.camera.ability;

import X.AbstractC23140094w;
import X.C09JC;
import X.C0LOJ;
import X.C0LOK;
import X.C546410Lbr;
import X.C546560Lc6;
import X.InterfaceC1364105Vn;
import X.InterfaceC546090LbL;
import X.InterfaceC546480Lby;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public interface DraftService<VIDEO_PUBLISH_EDIT_MODEL, AWEME_DRAFT> {
    void LIZ(Context context, VideoPublishEditModel videoPublishEditModel);

    Object LIZIZ(CreativeModel creativeModel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object LIZJ(AwemeDraft awemeDraft, InterfaceC1364105Vn interfaceC1364105Vn);

    boolean LIZLLL(CreativeModel creativeModel);

    Object LJ(C09JC c09jc, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    boolean LJFF(AWEME_DRAFT aweme_draft);

    boolean LJI(CreativeModel creativeModel);

    Object LJII(InterfaceC546090LbL interfaceC546090LbL, String str, C0LOJ c0loj, InterfaceC1364105Vn<? super AWEME_DRAFT> interfaceC1364105Vn);

    boolean LJIIIIZZ(CreativeModel creativeModel);

    void LJIIIZ(CreativeModel creativeModel);

    boolean LJIIJ(CreativeModel creativeModel);

    InterfaceC546480Lby LJIIJJI(C0LOK c0lok, AwS409S0200000_8 awS409S0200000_8, AwS409S0200000_8 awS409S0200000_82, AwS587S0100000_8 awS587S0100000_8, AwS622S0100000_8 awS622S0100000_8, AwS622S0100000_8 awS622S0100000_82, AwS587S0100000_8 awS587S0100000_82, C546560Lc6 c546560Lc6);

    Object LJIIL(C546410Lbr c546410Lbr, AbstractC23140094w abstractC23140094w);

    boolean LJIILIIL(CreativeModel creativeModel);

    void LJIILJJIL(CreativeModel creativeModel, Map<String, String> map);
}
