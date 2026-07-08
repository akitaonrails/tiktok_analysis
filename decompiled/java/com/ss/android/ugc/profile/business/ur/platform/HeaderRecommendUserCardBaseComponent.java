package com.ss.android.ugc.profile.business.ur.platform;

import X.C01GW;
import X.C1248950ibd;
import X.C1262780ixw;
import X.C1558520qew;
import X.C452501pT;
import X.C786410Ut5;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.business.header.business.recommend.base.IHeaderRecommendAbility;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public class HeaderRecommendUserCardBaseComponent extends BaseUIComponent {
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2399));
    public C1262780ixw LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
    }

    public final C1262780ixw zp() {
        C1262780ixw c1262780ixw = this.LLJJLIIIJLLLLLLLZ;
        if (c1262780ixw != null) {
            return c1262780ixw;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        if (this.LLJJLIIIJLLLLLLLZ != null) {
            ViewParent parent = zp().getParent();
            if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
                return;
            }
            C786410Ut5.LJJJLZIJ(zp(), viewGroup);
        }
    }

    public final void up() {
        IHeaderRecommendAbility iHeaderRecommendAbility = (IHeaderRecommendAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderRecommendAbility.class, null);
        if (iHeaderRecommendAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            C1248950ibd c1248950ibd = (C1248950ibd) this.LLJJL.getValue();
            iHeaderRecommendAbility.LJIIIZ(c1248950ibd != null ? c1248950ibd.LL : -1, zp(), str);
        }
    }

    public final void yp() {
        IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
        if (iHeaderBioAbility != null) {
            iHeaderBioAbility.clearAnimation();
        }
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            iHeaderAdvancedFeatureAbility.clearAnimation();
        }
    }

    public final void Ap(int i) {
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            iHeaderAdvancedFeatureAbility.bj(i);
        }
    }

    public final void Bp(float f) {
        IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
        if (iHeaderBioAbility != null) {
            iHeaderBioAbility.Sk(f);
        }
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            iHeaderAdvancedFeatureAbility.Sk(f);
        }
    }

    public final void Ep(int i) {
        IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
        if (iHeaderBioAbility != null) {
            iHeaderBioAbility.bj(i);
        }
    }
}
