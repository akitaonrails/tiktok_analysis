package com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C500260Jjc;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.viewmodel.PcsCourseVideoPlayerVM;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoPlayerBottomAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoPlayerBottomAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/viewmodel/PcsCourseVideoPlayerVM;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public VideoPlayerBottomAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCourseVideoPlayerVM.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 723), AFwS229S0000000_2.get$arr$(447), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C500260Jjc.LJIILIIL(LJJIJL());
    }
}
