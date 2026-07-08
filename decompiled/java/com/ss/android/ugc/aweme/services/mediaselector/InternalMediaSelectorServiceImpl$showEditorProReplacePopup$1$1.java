package com.ss.android.ugc.aweme.services.mediaselector;

import X.C09AY;
import X.C0LAB;
import X.C1397660mTU;
import X.C20684815ws;
import X.C375070EnB;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class InternalMediaSelectorServiceImpl$showEditorProReplacePopup$1$1 extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ Bundle $bundle;
    public final /* synthetic */ long $clipDuration;
    public final /* synthetic */ Function0<Unit> $confirmSelectVideo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalMediaSelectorServiceImpl$showEditorProReplacePopup$1$1(Function0<Unit> function0, Bundle bundle, long j) {
        super(1);
        this.$confirmSelectVideo = function0;
        this.$bundle = bundle;
        this.$clipDuration = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C1397660mTU c1397660mTU) {
        this.$confirmSelectVideo.invoke();
        C0LAB c0labLIZ = C375070EnB.LIZ(this.$bundle, String.valueOf(this.$clipDuration));
        if (c0labLIZ != null) {
            C20684815ws.LJIILLIIL("choose_shorter_video_popup_continue", c0labLIZ.LIZ);
        }
        return Unit.LIZ;
    }
}
