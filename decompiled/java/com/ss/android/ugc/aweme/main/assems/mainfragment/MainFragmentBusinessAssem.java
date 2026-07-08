package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.C1150504el;
import X.C1558520qew;
import X.C296200BjG;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.MainFragmentBusinessAbility;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.feed.experiment.FeedTouchProtectionExperiment;
import com.ss.android.ugc.aweme.scope.MainFragmentScope;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
@InterfaceC1294060jmO
public final class MainFragmentBusinessAssem extends BaseMainContainerAssem implements MainFragmentBusinessAbility, InterfaceC1554640qYg, InterfaceC737790Swr {
    public final MainFragmentBusinessAssem LL = this;

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        Fragment fragmentLJI;
        View view;
        View viewFindViewById;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"MainFragmentBusinessAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        if (FeedTouchProtectionExperiment.LIZ() && (fragmentLJI = C724240Sb0.LJI(this)) != null && (view = fragmentLJI.getView()) != null && (viewFindViewById = view.findViewById(R.id.tpm)) != null) {
            viewFindViewById.setClickable(true);
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1875681240) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        if (C296200BjG.LIZ()) {
            return;
        }
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainFragmentScope.class}).unbindAbility(this.LL, MainFragmentBusinessAbility.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainFragmentScope.class}).bindAbility(this.LL, MainFragmentBusinessAbility.class);
    }
}
