package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.AbstractC813200VvC;
import X.C01GW;
import X.C13LE;
import X.C19EG;
import X.C2217381BqS;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryScreenRecordingPreventionComponent extends BaseCellContentComponent<StoryScreenRecordingPreventionComponent> {
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 717));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 718));
    public final C01GW LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(387));

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        FragmentManager supportFragmentManager;
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0RDT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(123), 4);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C19EG activity = fragmentLJI != null ? fragmentLJI.getActivity() : null;
        if (!(activity instanceof C19EG) || activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.LJZL((AbstractC813200VvC) this.LLJJL.getValue(), true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        FragmentManager supportFragmentManager;
        C19EG activity;
        Window window;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (activity = fragmentLJI.getActivity()) != null && (window = activity.getWindow()) != null) {
            window.clearFlags(8192);
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        C19EG activity2 = fragmentLJI2 != null ? fragmentLJI2.getActivity() : null;
        if (!(activity2 instanceof C19EG) || activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.LLIILZL((AbstractC813200VvC) this.LLJJL.getValue());
    }

    public static boolean ep(Fragment fragment) {
        return a0.LJJIIZI(fragment.getClass().getName(), "SubPackagePageSheet", false);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
