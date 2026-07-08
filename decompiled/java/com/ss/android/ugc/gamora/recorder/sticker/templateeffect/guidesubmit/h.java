package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.guidesubmit;

import X.AbstractC1664490tPr;
import X.C0BMP;
import X.C1415090mvb;
import X.C1448890no7;
import X.C2217381BqS;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class h extends AbstractC1664490tPr<C1415090mvb, C1448890no7> {
    public final ShortVideoContext LLLLLJIL() {
        return (ShortVideoContext) LLLLILI().LIZ(new C2217381BqS() { // from class: X.0mva
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1415090mvb) obj).LIZ;
            }
        }).LIZJ();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0mvc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1415090mvb) obj).LIZIZ;
            }
        }, new AwS601S0100000_22(this, 621));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (C0BMP.LIZ()) {
            FrameLayout frameLayout = new FrameLayout(requireSceneContext());
            C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            C786410Ut5.LJZ(8, frameLayout);
            return frameLayout;
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.doh, viewGroup, false);
    }
}
