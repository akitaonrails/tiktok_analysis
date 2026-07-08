package com.ss.android.ugc.aweme.tools.mvtemplate.magic;

import X.AbstractC214814194y;
import X.C0MUK;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C786410Ut5;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class MagicTaskLoadingContainerScene extends AbstractC214814194y implements InterfaceC524950KiL {
    public final List<InterfaceC362610EJn> LLJJIJIL = new ArrayList();

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
    }

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
        ListProtector.add(this.LLJJIJIL, 0, interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        ((ArrayList) this.LLJJIJIL).remove(interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        ((ArrayList) this.LLJJIJIL).add(interfaceC362610EJn);
    }

    @Override // X.AbstractC214814194y
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator it2 = ((ArrayList) this.LLJJIJIL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC362610EJn) it2.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        VideoPublishEditModel videoPublishEditModel;
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (videoPublishEditModel = (VideoPublishEditModel) bundle2.getSerializable("args")) != null) {
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                videoPublishEditModel.creativeModel = C0MUK.LIZJ(bundle3);
            }
            videoPublishEditModel.refreshOldFieldIfNeeded();
        } else {
            videoPublishEditModel = null;
        }
        C1664590tQ1.LIZLLL(this, "MagicTaskLoadingContainerScene", false, new AwS587S0100000_8(videoPublishEditModel, 765), 2);
        C1664600tQ2.LIZ(this, "MagicTaskLoadingContainerScene", new AwS587S0100000_8(this, 767));
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eq6, null, false);
    }
}
