package com.ss.android.ugc.profile.business.ur.editprofileviewmodel;

import X.C01GW;
import X.C23250099c;
import X.C342770DcB;
import X.C452501pT;
import X.C566270MIv;
import X.C566280MIw;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.aime.IAIMEServices;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class EditProfileAiMeViewModel extends AssemViewModel<C566280MIw> {
    public final C01GW LL;
    public final IAIMEServices LLILLJJLI;
    public final C01GW LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C566280MIw(null);
    }

    public final void wQ2() {
        if (this.LLILLJJLI == null) {
            return;
        }
        C23250099c.LIZLLL(getLifecycleScope(), null, null, new C566270MIv(this, null), 3);
    }

    public EditProfileAiMeViewModel() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(325));
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = ((Boolean) c01gwLIZIZ.getValue()).booleanValue() ? C342770DcB.LIZ() ? (IAIMEServices) PluggableExtentionKt.pluggableSpi$default(IAIMEServices.class, false, false, false, 14, null) : (IAIMEServices) ServiceManager.get().getService(IAIMEServices.class) : null;
        this.LLILLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(324));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(com.ss.android.ugc.aweme.aime.IAIMEServices r8, androidx.fragment.app.Fragment r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C566260MIu
            if (r0 == 0) goto L72
            r6 = r10
            X.0MIu r6 = (X.C566260MIu) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r1 = r6.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r4 = 1
            if (r0 == 0) goto L4d
            if (r0 != r4) goto L78
            androidx.fragment.app.Fragment r9 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.aime.IAIMEServices r8 = r6.LL
            X.C155000ia.LIZIZ(r1)
        L26:
            X.0DcA r1 = (X.InterfaceC342760DcA) r1
            X.0mIc r2 = new X.0mIc
            r3 = 0
            r2.<init>(r3, r3)
            android.content.Context r0 = r9.requireContext()
            androidx.compose.ui.platform.ComposeView r1 = r8.LJIIIIZZ(r1, r0)
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r2.LIZ
            r0.LLJJIII = r1
            r2.LJIIIIZZ(r4)
            com.bytedance.tux.sheet.sheet.TuxSheet r2 = r2.LIZ
            r2.LLJLILLLLZIIL = r3
            androidx.fragment.app.FragmentManager r1 = r9.getChildFragmentManager()
            java.lang.String r0 = "aime_tab_compatability"
            r2.show(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4d:
            X.C155000ia.LIZIZ(r1)
            kotlin.jvm.internal.AwS587S0100000_8 r3 = new kotlin.jvm.internal.AwS587S0100000_8
            r0 = 520(0x208, float:7.29E-43)
            r3.<init>(r9, r0)
            kotlin.jvm.internal.AwS552S0100000_8 r2 = new kotlin.jvm.internal.AwS552S0100000_8
            r0 = 798(0x31e, float:1.118E-42)
            r2.<init>(r7, r0)
            kotlin.jvm.internal.AwS552S0100000_8 r1 = new kotlin.jvm.internal.AwS552S0100000_8
            r0 = 799(0x31f, float:1.12E-42)
            r1.<init>(r7, r0)
            r6.LL = r8
            r6.LLILLJJLI = r9
            r6.LLILZIL = r4
            java.lang.Object r1 = r8.LJIJI(r3, r2, r1, r6)
            if (r1 != r5) goto L26
            return r5
        L72:
            X.0MIu r6 = new X.0MIu
            r6.<init>(r7, r10)
            goto L12
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileAiMeViewModel.vQ2(com.ss.android.ugc.aweme.aime.IAIMEServices, androidx.fragment.app.Fragment, X.05Vn):java.lang.Object");
    }
}
