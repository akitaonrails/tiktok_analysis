package com.ss.android.ugc.profile.platform.business.header.business.bio.base;

import X.C01GW;
import X.C1250210idf;
import X.C1558520qew;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS154S0100000_19;
import android.view.View;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BioBaseUIComponent<T extends BizBaseData> extends BaseUIComponent {
    public T LLJJLIIIJLLLLLLLZ;
    public boolean LLJLIL;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS563S0100000_19((BioBaseUIComponent) this, 2488));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS563S0100000_19((BioBaseUIComponent) this, 2489));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void Oo() {
    }

    public abstract void up(View view);

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        up(this.LLJJ);
    }

    public final ProfilePlatformViewModel yp() {
        return (ProfilePlatformViewModel) this.LLJL.getValue();
    }

    public final String getEnterFrom() {
        return q1() ? "personal_homepage" : "others_homepage";
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        Integer numValueOf = Integer.valueOf(this.LLJILLL);
        if (numValueOf.intValue() == -1 || 1 == 0) {
            return;
        }
        numValueOf.intValue();
        IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
        if (iHeaderBioAbility != null) {
            iHeaderBioAbility.Xu1(this.LLJJ);
        }
    }

    public final boolean q1() {
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null) {
            return profileBaseAbility.q1();
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public void Hj(ProfileComponents profileComponents) {
        Integer numValueOf = Integer.valueOf(this.LLJILLL);
        if (numValueOf.intValue() != -1 && 1 != 0) {
            numValueOf.intValue();
            IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
            if (iHeaderBioAbility != null) {
                iHeaderBioAbility.eq2(this.LLJJ);
            }
        }
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            ep(nVar);
        }
        tp();
        View view = this.LLJJ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS154S0100000_19(this, 187), view);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C1250210idf.LIZ(nVar.toString(), BizBaseData.class);
    }
}
