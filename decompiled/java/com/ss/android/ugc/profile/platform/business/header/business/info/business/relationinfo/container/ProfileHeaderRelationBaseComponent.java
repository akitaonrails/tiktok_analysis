package com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.container;

import X.AbstractC738140SxQ;
import X.C1076010e6h;
import X.C1248950ibd;
import X.C1308910kAL;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C19EG;
import X.C418440Gaw;
import X.C487280J9a;
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
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.assemble.base.IHeaderInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.IHeaderRelationInfoAbility;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileHeaderRelationBaseComponent extends HeaderBaseContainerComponent implements IHeaderRelationInfoAbility, InterfaceC487330J9f {
    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void cp() {
        IHeaderInfoAbility iHeaderInfoAbility;
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup == null || (iHeaderInfoAbility = (IHeaderInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderInfoAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderInfoAbility.LJIIIZ(this.LLJJ, viewGroup, str);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1248950ibd c1248950ibdMp = mp();
        dp((c1248950ibdMp == null || (profileComponents = c1248950ibdMp.LLILLJJLI) == null) ? null : profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        C19EG c19egLIZ;
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderRelationInfoAbility.class, null, null);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI() && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            C487280J9a.LIZ(c19egLIZ.hashCode(), this);
        }
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(this, new AObserverS223S0100000_19(this, 51));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hp(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig r13) {
        /*
            r12 = this;
            X.0iae r2 = new X.0iae
            android.content.Context r0 = r12.getContext()
            r2.<init>(r0)
            r12.LLJJIJIIJIL = r2
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r0 = -2
            r5.<init>(r1, r0)
            boolean r0 = X.C268330AfP.LJIIIZ()
            r3 = 16
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L99
            r0 = 4
        L1f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
        L27:
            int r1 = X.C814420VxA.LIZIZ(r0)
            android.content.Context r6 = r2.getContext()
            float r0 = X.C418440Gaw.LIZIZ(r4)
            int r0 = X.C814420VxA.LIZIZ(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            float r0 = X.C418440Gaw.LIZIZ(r4)
            int r0 = X.C814420VxA.LIZIZ(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r11 = 1
            X.C426750GoL.LJIIIIZZ(r5, r6, r7, r8, r9, r10, r11)
            r2.setOrientation(r1)
            X.C786410Ut5.d6(r2, r5)
            boolean r0 = X.C268330AfP.LJIIIZ()
            if (r0 != 0) goto L6e
            r3 = 17
        L6e:
            r2.setGravity(r3)
            r2.setClipChildren(r1)
            boolean r0 = X.C0C38.LIZ()
            if (r0 == 0) goto L7d
            r2.setClipToPadding(r1)
        L7d:
            android.view.ViewGroup r0 = r12.LLJJIJIIJIL
            X.C1248870ibV.LIZJ(r0, r13, r11, r1)
            android.content.Context r3 = r12.getContext()
            if (r3 == 0) goto L98
            X.10Tv r0 = X.C19252910Tv.LIZIZ
            X.0sAf r0 = r0.LIZLLL()
            X.0ic4 r2 = r0.LJI()
            android.view.ViewGroup r1 = r12.LLJJIJIIJIL
            r0 = 0
            r2.LJJLIIIJJI(r1, r3, r0, r0)
        L98:
            return
        L99:
            boolean r0 = X.C2537109wv.LIZ()
            if (r0 == 0) goto La3
            r0 = 10
            goto L1f
        La3:
            float r0 = X.C418440Gaw.LIZIZ(r4)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.container.ProfileHeaderRelationBaseComponent.hp(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig):void");
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        Context context = getContext();
        if (context != null) {
            C19252910Tv.LIZIZ.LIZLLL().LJI().LJJLIIIJJI(this.LLJJIJIIJIL, context, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.IHeaderRelationInfoAbility
    public final void LJIIIZ(int i, View view, String str) {
        if (i < 2) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            layoutParams.gravity = 16;
            View view2 = new View(getContext());
            C786410Ut5.W5(view2, layoutParams);
            view2.setBackground(C1308910kAL.LJ(R.attr.ng, view2.getContext()));
            C786410Ut5.W5(view2, layoutParams);
            HeaderBaseContainerComponent.bp(this, str, i, view, null, view2, false, 40);
            return;
        }
        HeaderBaseContainerComponent.bp(this, str, i, view, null, null, false, 56);
    }
}
