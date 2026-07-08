package com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0E1T;
import X.C0E48;
import X.C0E5S;
import X.C0EFX;
import X.C0EFY;
import X.C0EGY;
import X.C0EHD;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1DRG;
import X.C21567719at;
import X.C353850Du3;
import X.C361460EFc;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC359850E8x;
import X.InterfaceC362610EJn;
import X.InterfaceC524950KiL;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordFragmentViewModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.bottom.panel.EditorContextFragment;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioRecordFragment extends EditorContextFragment implements C0EHD {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KyQ8KC06HELIOSJCw4ICogZiQ5LSY8ZjcpKiAhLGs5IGESPSElJh02Kyo+LQkhKSIhLCEn";
    public ConstraintLayout LLILLL;
    public TuxTextView LLILZ;
    public C21567719at LLILZIL;
    public ViewGroup LLILZLL;
    public View LLIZ;
    public C0E5S LLJILJIL;
    public boolean LLJJIJI;
    public final long LLIZLLLIL = System.currentTimeMillis();
    public final String[] LLJ = {"android.permission.RECORD_AUDIO"};
    public final C0EFY LLJI = new InterfaceC362610EJn() { // from class: X.0EFY
        @Override // X.InterfaceC362610EJn
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            this.LL.MR();
            return true;
        }
    };
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 416));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 412));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 415));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 413));
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(304));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 411));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 414));

    @Override // X.C0EHD
    public final String getPanelName() {
        return "audio_record";
    }

    public final C21567719at OR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bap) : null;
            this.LLILZIL = (C21567719at) viewFindViewById;
        }
        return (C21567719at) viewFindViewById;
    }

    public final AudioRecordFragmentViewModel RR() {
        return (AudioRecordFragmentViewModel) this.LLJIJIL.getValue();
    }

    public final VideoPublishEditModel SR() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    public final void MR() {
        C0EGY c0egyLIZIZ;
        InterfaceC359850E8x interfaceC359850E8xB20;
        LiveState<TrackShowType> liveStateQ82;
        C0EGY c0egyLIZIZ2;
        InterfaceC359850E8x interfaceC359850E8xB202;
        if (OR().LLILLJJLI) {
            OR().LIZ();
        }
        this.LLJJIJI = true;
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            c0e48.S7().LIZIZ(Boolean.FALSE, "event_open_audio_record", false);
        }
        ((C0EFX) this.LLJJ.getValue()).LIZIZ();
        TrackShowType trackShowTypeLIZJ = null;
        if (RR().LLJJIJI) {
            C0E5S c0e5s = this.LLJILJIL;
            if (c0e5s != null) {
                c0e5s.da0(TrackShowType.AUDIO);
            }
            C1DRG c1drg = this.LLILLJJLI;
            if (c1drg != null && (c0egyLIZIZ2 = C361460EFc.LIZIZ(c1drg)) != null && (interfaceC359850E8xB202 = c0egyLIZIZ2.B20()) != null) {
                interfaceC359850E8xB202.LJIIL("bottom_item_root_sound");
            }
            VideoPublishEditModel videoPublishEditModelSR = SR();
            if (videoPublishEditModelSR != null) {
                ((AudioRecordActivityViewModel) this.LLJILJILJ.getValue()).AQ2(0L, videoPublishEditModelSR, this.LL);
                return;
            }
            return;
        }
        C0E5S c0e5s2 = this.LLJILJIL;
        if (c0e5s2 != null && (liveStateQ82 = c0e5s2.Q82()) != null) {
            trackShowTypeLIZJ = liveStateQ82.LIZJ();
        }
        TrackShowType trackShowType = TrackShowType.NORMAL;
        if (trackShowTypeLIZJ == trackShowType) {
            C0E5S c0e5s3 = this.LLJILJIL;
            if (c0e5s3 != null) {
                c0e5s3.da0(trackShowType);
                return;
            }
            return;
        }
        C0E5S c0e5s4 = this.LLJILJIL;
        if (c0e5s4 != null) {
            c0e5s4.da0(TrackShowType.AUDIO);
        }
        C1DRG c1drg2 = this.LLILLJJLI;
        if (c1drg2 == null || (c0egyLIZIZ = C361460EFc.LIZIZ(c1drg2)) == null || (interfaceC359850E8xB20 = c0egyLIZIZ.B20()) == null) {
            return;
        }
        interfaceC359850E8xB20.LJIIL("bottom_item_root_sound");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLJJIJI) {
            return;
        }
        this.LLJJIJI = true;
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            c0e48.S7().LIZIZ(Boolean.FALSE, "event_open_audio_record", false);
        }
        ((C0EFX) this.LLJJ.getValue()).LIZIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC524950KiL interfaceC524950KiL = (InterfaceC524950KiL) this.LLJJIII.getValue();
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.b8(this.LLJI);
        }
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (OR().LLILLJJLI) {
            OR().LIZ();
        }
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
    }

    public final Drawable PR(boolean z) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_voice_enhance;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(requireContext());
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c419910GdJ2.LIZ = R.raw.icon_color_right_bottom_checkbox;
        TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(requireContext());
        if (z) {
            if (C353850Du3.LIZ(null)) {
                C419910GdJ c419910GdJ3 = new C419910GdJ();
                c419910GdJ3.LIZ = R.raw.icon_color_reduce_noise_tick_green;
                c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                return c419910GdJ3.LIZ(requireContext());
            }
            return C426750GoL.LJIILIIL(tuxIconDrawableLIZ2, tuxIconDrawableLIZ);
        }
        return tuxIconDrawableLIZ;
    }

    public final void NR(ViewGroup viewGroup, boolean z) {
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            viewGroup.getChildAt(i2).setEnabled(z);
        }
        if (!z) {
            i = 4;
        }
        C786410Ut5.LJLZ(i, viewGroup);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[PHI: r3
      0x0037: PHI (r3v1 android.view.View) = (r3v0 android.view.View), (r3v19 android.view.View) binds: [B:6:0x0021, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.ugc.android.editor.bottom.panel.EditorContextFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.ui.AudioRecordFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.d3v, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
