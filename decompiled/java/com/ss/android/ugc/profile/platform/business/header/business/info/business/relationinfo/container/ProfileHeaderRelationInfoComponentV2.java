package com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.container;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1076010e6h;
import X.C1248230iaT;
import X.C1248870ibV;
import X.C1248950ibd;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C2537109wv;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC487330J9f;
import X.InterfaceC665370Q7z;
import Y.AObserverS223S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.profile.business.ur.platform.business.abiltiy.ResetDataAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.IHeaderRelationInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IHeaderAccountInfoAbility;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderRelationInfoComponentV2 extends HeaderBaseContainerComponent implements IHeaderRelationInfoAbility, InterfaceC487330J9f {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2520));

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("relation_info_base_item", C13LE.LIZ(RelationInfoBaseUIComponent.class), null, -1, false);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Lo() {
        if (this.LLJILLL && C2537109wv.LJII()) {
            ((ArrayList) this.LLJI).add("user_info_manage");
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void cp() {
        IHeaderAccountInfoAbility iHeaderAccountInfoAbility;
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup == null || (iHeaderAccountInfoAbility = (IHeaderAccountInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAccountInfoAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderAccountInfoAbility.LJIIIZ(this.LLJJ, viewGroup, str);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1248950ibd c1248950ibdMp = mp();
        dp((c1248950ibdMp == null || (profileComponents = c1248950ibdMp.LLILLJJLI) == null) ? null : profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderRelationInfoAbility.class, null, null);
        }
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(this, new AObserverS223S0100000_19(this, 52));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.IHeaderRelationInfoAbility
    public final void yi1() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        for (InterfaceC665370Q7z interfaceC665370Q7z : copyOnWriteArrayList) {
            if (interfaceC665370Q7z instanceof ResetDataAbility) {
                ((ResetDataAbility) interfaceC665370Q7z).tG0();
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        int i;
        LinearLayout linearLayout = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Context context = linearLayout.getContext();
        Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        if (((C1248230iaT) this.LLJJLIIIJLLLLLLLZ.getValue()).LIZIZ) {
            i = 18;
        } else {
            i = 14;
        }
        C426750GoL.LJIIIIZZ(layoutParams, context, numValueOf, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), true);
        linearLayout.setOrientation(0);
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setGravity(16);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        this.LLJJIJIIJIL = linearLayout;
        C1248870ibV.LIZJ(linearLayout, profileComponentUIConfig, true, false);
        Context context2 = getContext();
        if (context2 != null) {
            C19252910Tv.LIZIZ.LIZLLL().LJI().LJJLIIIJJI(this.LLJJIJIIJIL, context2, null, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.IHeaderRelationInfoAbility
    public final void LJIIIZ(int i, View view, String str) {
        HeaderBaseContainerComponent.bp(this, str, i, view, null, null, false, 56);
    }
}
