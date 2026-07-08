package com.ss.android.ugc.aweme.business.live.assem;

import X.AbstractC738140SxQ;
import X.C01D1;
import X.C0IVH;
import X.C0T3R;
import X.C11JF;
import X.C13LE;
import X.C1440005kM;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C1587800rQA;
import X.C1597740rgC;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.EnumC1588650rRX;
import X.InterfaceC1055110dYz;
import X.InterfaceC2217461Bqa;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.follow.spi.FollowTabAbility;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowSkylightLifecycleAssem extends AbstractC738140SxQ implements InterfaceC1055110dYz {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    public final C630740Ooa LLILLJJLI = C628500Oky.LIZ(new AwS568S0100000_24(this, 132));
    public final AssemVMLazy LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FollowSkylightLifecycleAssem.class, "containerVM", "getContainerVM()Lcom/ss/android/ugc/aweme/base/vm/FeedSkylightContainerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FollowSkylightLifecycleAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightContainerViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 131);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, awS568S0100000_24, AFwS264S0000000_24.get$arr$(42), null, true);
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Hox.LLJILJIL.LIZ(c19egLIZ).wQ2("Following", this);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Hox.LLJILJIL.LIZ(c19egLIZ).PQ2("Following", this);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C1597740rgC c1597740rgC = C1597740rgC.LIZ;
        if (C1597740rgC.LJFF) {
            c1597740rgC.getClass();
            C1597740rgC.LIZJ = System.currentTimeMillis();
        }
        c1597740rgC.getClass();
        if (C0IVH.LIZIZ()) {
            C1597740rgC.LJIIL = false;
            C11JF c11jf = C1597740rgC.LJIILIIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        InsertStory insertStoryLIZ = C1587800rQA.LIZ(c19egLIZ != null ? c19egLIZ.getIntent() : null);
        C1597740rgC c1597740rgC = C1597740rgC.LIZ;
        c1597740rgC.getClass();
        if (C1597740rgC.LJFF) {
            C1597740rgC.LIZ(c1597740rgC, insertStoryLIZ, null, 2);
            C1597740rgC.LJIIIIZZ();
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        C1597740rgC.LIZ.getClass();
        C1597740rgC.LJFF = false;
        C1597740rgC.LIZJ = System.currentTimeMillis();
        C1597740rgC.LJIIIZ = C1597740rgC.LJIIIIZZ;
        if (C0IVH.LIZIZ()) {
            C1597740rgC.LJIIL = false;
            C11JF c11jf = C1597740rgC.LJIILIIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
        }
        C1440005kM.LIZ(new C0T3R(false));
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        EnumC1588650rRX enumC1588650rRXBT0;
        boolean z;
        FollowTabAbility followTabAbility;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (followTabAbility = (FollowTabAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), FollowTabAbility.class, null)) == null || (enumC1588650rRXBT0 = followTabAbility.bT0()) == null) {
            enumC1588650rRXBT0 = EnumC1588650rRX.NONE;
        }
        if (enumC1588650rRXBT0 != EnumC1588650rRX.NONE) {
            z = true;
        } else {
            z = false;
        }
        C1597740rgC.LIZ(C1597740rgC.LIZ, null, Boolean.valueOf(z), 1);
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        if (((FeedSkylightContainerViewModel) assemVMLazy.getValue()).xQ2()) {
            C1440005kM.LIZ(new C0T3R(true));
        }
    }
}
