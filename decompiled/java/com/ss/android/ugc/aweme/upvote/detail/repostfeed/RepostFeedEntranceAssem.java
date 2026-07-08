package com.ss.android.ugc.aweme.upvote.detail.repostfeed;

import X.C019F;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C626620Ohw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.ViewTreeObserverOnGlobalLayoutListenerC1402100mae;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import defpackage.IButtonEntranceView;
import defpackage.RepostFeedEntranceVM;
import defpackage.b8;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostFeedEntranceAssem extends UISlotAssem implements IButtonEntranceView {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final int LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public C626620Ohw LLJJI;
    public final AssemVMLazy LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostFeedEntranceAssem.class, "entranceVM", "getEntranceVM()LRepostFeedEntranceVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    public RepostFeedEntranceAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostFeedEntranceVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 1028), AFwS259S0000000_21.get$arr$(271), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.i6y;
    }

    @Override // defpackage.IButtonEntranceView
    public final int[] Ni() {
        int[] iArr = new int[2];
        C626620Ohw c626620Ohw = this.LLJJI;
        if (c626620Ohw != null) {
            c626620Ohw.getLocationInWindow(iArr);
        }
        return iArr;
    }

    public final RepostFeedEntranceVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (RepostFeedEntranceVM) assemVMLazy.getValue();
    }

    @Override // defpackage.IButtonEntranceView
    public final void br2(boolean z) {
        int i;
        C626620Ohw c626620Ohw = this.LLJJI;
        if (c626620Ohw != null) {
            if (z) {
                i = 0;
            } else {
                i = LLJJIJIL;
            }
            C426750GoL.LJIIIZ(c626620Ohw, null, null, null, Integer.valueOf(i), false, 23);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C426750GoL.LJIIIZ(view, null, null, null, Integer.valueOf(LLJJIJIIJIL), false, 23);
        C626620Ohw c626620Ohw = (C626620Ohw) view.findViewById(R.id.t_8);
        this.LLJJI = c626620Ohw;
        if (c626620Ohw != null) {
            C426750GoL.LJIIIZ(c626620Ohw, null, null, null, Integer.valueOf(LLJJIJIL), false, 23);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IButtonEntranceView.class, null, null);
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0lWx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((b8) obj).LLILLJJLI;
            }
        }, null, new AwS635S0100000_21(this, 101), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0lWw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((b8) obj).LL;
            }
        }, null, new AwS635S0100000_21(this, 102), 6);
        C786410Ut5.x3(LJJIJL().getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1402100mae(this, 5));
    }
}
