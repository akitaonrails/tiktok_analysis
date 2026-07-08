package com.ss.android.ugc.profile.platform.business.header.business.recommend.assemble;

import X.C1248950ibd;
import X.C1259350isP;
import X.C1260280itu;
import X.C1558360qeg;
import X.C1558520qew;
import X.C724240Sb0;
import X.C786410Ut5;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.recommend.base.IHeaderRecommendAbility;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileHeaderRecommendBaseComponent extends HeaderBaseContainerComponent implements IHeaderRecommendAbility {
    public C1259350isP LLJJLIIIJLLLLLLLZ;
    public C1260280itu LLJL;

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
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderRecommendAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IHeaderRecommendAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        dp(profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        Context context = getContext();
        if (context != null) {
            FrameLayout frameLayout = new FrameLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            C786410Ut5.a6(frameLayout, layoutParams);
            this.LLJJIJIIJIL = frameLayout;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.recommend.base.IHeaderRecommendAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(int r13, android.view.View r14, java.lang.String r15) {
        /*
            r12 = this;
            X.10Tv r0 = X.C19252910Tv.LIZIZ
            X.0sAf r0 = r0.LIZLLL()
            X.0ic4 r0 = r0.LJI()
            boolean r0 = r0.LJI()
            r5 = r15
            r7 = r14
            r6 = r13
            r4 = r12
            if (r0 == 0) goto L6e
            X.0Q7z r1 = X.C1558520qew.LJIIL(r4)
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility> r0 = com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility.class
            r3 = 0
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r3)
            com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility r0 = (com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility) r0
            r10 = 0
            if (r0 == 0) goto L6c
            boolean r1 = r0.q1()
            r0 = 1
            if (r1 != r0) goto L6c
        L2b:
            r2 = 2131389442(0x7f0a6c02, float:1.8399427E38)
            if (r0 == 0) goto L57
            X.0isP r1 = r4.LLJJLIIIJLLLLLLLZ
            if (r1 != 0) goto L44
            android.view.View r0 = r4.LJJIJL()
            if (r0 == 0) goto L3e
            android.view.View r3 = r0.findViewById(r2)
        L3e:
            r0 = r3
            X.0isP r0 = (X.C1259350isP) r0
            r4.LLJJLIIIJLLLLLLLZ = r0
            r1 = r3
        L44:
            r0 = 2131383786(0x7f0a55ea, float:1.8387955E38)
            android.view.View r8 = r1.findViewById(r0)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r9 = 0
            r11 = 48
            com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent.bp(r4, r5, r6, r7, r8, r9, r10, r11)
            X.C786410Ut5.LJZL(r10, r8)
            return
        L57:
            X.0itu r1 = r4.LLJL
            if (r1 != 0) goto L44
            android.view.View r0 = r4.LJJIJL()
            if (r0 == 0) goto L65
            android.view.View r3 = r0.findViewById(r2)
        L65:
            r0 = r3
            X.0itu r0 = (X.C1260280itu) r0
            r4.LLJL = r0
            r1 = r3
            goto L44
        L6c:
            r0 = 0
            goto L2b
        L6e:
            r8 = 0
            r10 = 0
            r11 = 56
            r9 = r8
            com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent.bp(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.recommend.assemble.ProfileHeaderRecommendBaseComponent.LJIIIZ(int, android.view.View, java.lang.String):void");
    }
}
