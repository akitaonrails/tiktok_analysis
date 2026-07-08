package com.ss.android.ugc.profile.business.profile.loading;

import X.C1260280itu;
import X.C1390410mHn;
import X.C1558360qeg;
import X.C1558520qew;
import X.C16FB;
import X.C497820Jfg;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC19356710o9;
import X.EnumC481060Itk;
import Y.ARunnableS119S0100000_19;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class UserPageLoadingAssem extends BaseContainerComponent implements IUserPageLoadingAbility {
    public ViewGroup LLJJIJI;
    public C1390410mHn LLJJIJIIJIL;
    public C1260280itu LLJJIJIL;
    public C16FB LLJJJ;
    public final BPEAHandler LLJJJIL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLJJJJ = true;
    public final ARunnableS119S0100000_19 LLJJJJJIL = new ARunnableS119S0100000_19(this, 102);

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
    }

    @Override // com.ss.android.ugc.profile.business.profile.loading.IUserPageLoadingAbility
    public final void lh0() {
        this.LLJJJJ = true;
    }

    @Override // com.ss.android.ugc.profile.business.profile.loading.IUserPageLoadingAbility
    public final void LJIIL() {
        ViewGroup viewGroup = this.LLJJIJI;
        if (viewGroup == null || !isLoading()) {
            return;
        }
        C786410Ut5.LJLZ(8, viewGroup);
        C1390410mHn c1390410mHn = this.LLJJIJIIJIL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        ap(true);
        this.LLJJJIL.removeCallbacks(this.LLJJJJJIL);
        this.LLJJJJ = false;
    }

    @Override // com.ss.android.ugc.profile.business.profile.loading.IUserPageLoadingAbility
    public final boolean isLoading() {
        ViewGroup viewGroup = this.LLJJIJI;
        return viewGroup != null && viewGroup.getVisibility() == 0;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IUserPageLoadingAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1390410mHn c1390410mHn = this.LLJJIJIIJIL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IUserPageLoadingAbility.class, null);
        }
        this.LLJJJIL.removeCallbacks(this.LLJJJJJIL);
    }

    @Override // com.ss.android.ugc.profile.business.profile.loading.IUserPageLoadingAbility
    public final boolean Mr() {
        return this.LLJJJJ;
    }

    @Override // com.ss.android.ugc.profile.business.profile.loading.IUserPageLoadingAbility
    public final void Gz1(float f) {
        Float fValueOf;
        ViewGroup viewGroup;
        Context context;
        ViewGroup viewGroup2 = this.LLJJIJI;
        if (viewGroup2 != null) {
            fValueOf = Float.valueOf(viewGroup2.getY());
        } else {
            fValueOf = null;
        }
        if (!Intrinsics.LIZLLL(fValueOf, f) && (viewGroup = this.LLJJIJI) != null && (context = viewGroup.getContext()) != null) {
            int iLIZ = C497820Jfg.LIZ(context);
            C786410Ut5.Kd(f, viewGroup);
            viewGroup.getLayoutParams().height = iLIZ;
        }
    }

    public final void ap(boolean z) {
        if (z) {
            C1260280itu c1260280itu = this.LLJJIJIL;
            if (c1260280itu != null) {
                c1260280itu.setGestureBlock(false);
            }
            C16FB c16fb = this.LLJJJ;
            if (c16fb != null) {
                c16fb.setScrollMode(EnumC481060Itk.REFRESH);
            }
            C16FB c16fb2 = this.LLJJJ;
            if (c16fb2 != null) {
                c16fb2.setOverScrollMode(EnumC19356710o9.ONLY_TOP);
                return;
            }
            return;
        }
        C1260280itu c1260280itu2 = this.LLJJIJIL;
        if (c1260280itu2 != null) {
            c1260280itu2.setGestureBlock(true);
        }
        C16FB c16fb3 = this.LLJJJ;
        if (c16fb3 != null) {
            c16fb3.setScrollMode(EnumC481060Itk.NONE);
        }
        C16FB c16fb4 = this.LLJJJ;
        if (c16fb4 == null) {
            return;
        }
        c16fb4.setOverScrollMode(EnumC19356710o9.NONE);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) view.findViewById(R.id.s7g));
        if (viewLJLLLL != null) {
            this.LLJJIJI = (ViewGroup) viewLJLLLL.findViewById(R.id.s7f);
            this.LLJJIJIIJIL = (C1390410mHn) viewLJLLLL.findViewById(R.id.s7e);
        }
        this.LLJJIJIL = (C1260280itu) view.findViewById(R.id.u30);
        this.LLJJJ = (C16FB) view.findViewById(R.id.t25);
    }

    @Override // com.ss.android.ugc.profile.business.profile.loading.IUserPageLoadingAbility
    public final void wp2(float f) {
        Context context;
        ViewGroup viewGroup = this.LLJJIJI;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            int iLIZ = C497820Jfg.LIZ(context);
            ap(false);
            C786410Ut5.Kd(f, viewGroup);
            viewGroup.getLayoutParams().height = iLIZ;
            C786410Ut5.LJLZ(0, viewGroup);
            C1390410mHn c1390410mHn = this.LLJJIJIIJIL;
            if (c1390410mHn != null) {
                c1390410mHn.LIZJ();
            }
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, this.LLJJJIL, this.LLJJJJJIL);
        }
    }
}
