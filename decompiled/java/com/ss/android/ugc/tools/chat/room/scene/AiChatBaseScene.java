package com.ss.android.ugc.tools.chat.room.scene;

import X.AbstractC214814194y;
import X.C0MGE;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C201955140j;
import X.C21298618Wq;
import X.C560380LyO;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AiChatBaseScene extends AbstractC214814194y implements C0MGE {
    @Override // X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "AiChatBaseScene onDestroyView");
        C560380LyO.LIZ.getClass();
        if (!Intrinsics.LJFF(C560380LyO.LJIILIIL.LJIIIZ, "publish")) {
            C560380LyO.LIZJ = C560380LyO.LJ;
        }
        super.onDestroyView();
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1664590tQ1.LIZLLL(this, null, false, new C21298618Wq(this), 3);
        C1664600tQ2.LIZ(this, null, new AwS611S0100000_32(this, 217));
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "AiChatBaseScene onViewCreated");
        C560380LyO.LIZ.getClass();
        C560380LyO.LJ = C560380LyO.LIZJ;
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.en_, viewGroup, false);
    }
}
