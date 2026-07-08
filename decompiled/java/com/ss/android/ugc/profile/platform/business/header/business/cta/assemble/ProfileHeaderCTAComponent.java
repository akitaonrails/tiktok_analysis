package com.ss.android.ugc.profile.platform.business.header.business.cta.assemble;

import X.C1248950ibd;
import X.C2537109wv;
import X.EnumC1249890id9;
import android.view.View;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS263S0300000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderCTAComponent extends ProfileHeaderCTABaseComponent {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Lo() {
        if (!this.LLJILLL || C2537109wv.LJ()) {
            return;
        }
        ((ArrayList) this.LLJI).add("cta_edit_profile");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.assemble.ProfileHeaderCTABaseComponent, com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        ProfileComponents profileComponents;
        super.onCreate();
        EnumC1249890id9 enumC1249890id9 = EnumC1249890id9.ICON;
        EnumC1249890id9 enumC1249890id92 = EnumC1249890id9.TEXT;
        new AwS263S0300000_19(this, enumC1249890id9, enumC1249890id92, 15).invoke();
        C1248950ibd c1248950ibdMp = mp();
        dp((c1248950ibdMp == null || (profileComponents = c1248950ibdMp.LLILLJJLI) == null) ? null : profileComponents.components);
        this.LLJJLIIIJLLLLLLLZ.put("cta_social_interaction_follow", enumC1249890id92);
        this.LLJJLIIIJLLLLLLLZ.put("cta_social_interaction_message", enumC1249890id92);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final View dm1() {
        return this.LLJJIJIIJIL;
    }
}
