package com.ss.android.ugc.aweme.inbox.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1598660rhg;
import X.C1620910sHZ;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import Y.AsS50S0100000_24;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SwitchInboxToReportStoryNegativeFeedbackAssem extends AbstractC738140SxQ {
    public final C630740Ooa LL = C628500Oky.LIZ(new AwS568S0100000_24(this, 650));
    public final C1620910sHZ LLILLJJLI = new C1620910sHZ(this, 15);
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(205));
    public boolean LLILZ;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LL.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.UC1(this.LLILLJJLI);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LL.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.Ik0(this.LLILLJJLI);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        Context context;
        super.onResume();
        if (this.LLILZ || (context = getContext()) == null) {
            return;
        }
        C1598660rhg c1598660rhg = C1598660rhg.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        c1598660rhg.getClass();
        C1598660rhg.LJ(context, fragmentLJI).LLZZJLIL().addOnScrollListener(new AsS50S0100000_24(this, 11));
        this.LLILZ = true;
    }
}
