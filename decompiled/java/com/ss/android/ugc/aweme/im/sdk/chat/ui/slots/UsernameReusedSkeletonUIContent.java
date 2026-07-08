package com.ss.android.ugc.aweme.im.sdk.chat.ui.slots;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0ZDX;
import X.C0ZOI;
import X.C0ZOS;
import X.C1509305vX;
import X.C1559260qg8;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C457780HxI;
import X.C462190IAn;
import X.C497820Jfg;
import X.C723590SZx;
import X.C786410Ut5;
import X.C814420VxA;
import X.C866950Xzh;
import X.C869590Y9l;
import X.InterfaceC462200IAo;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.messagelist.api.model.SkeletonLayoutCellAbility;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public class UsernameReusedSkeletonUIContent extends ReusedSkeletonUIContentAssem<UsernameReusedSkeletonUIContent, C0ZOS> {
    public final C1559260qg8 LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public AnonymousClass0956 LLJJLIIIJLLLLLLLZ;

    public UsernameReusedSkeletonUIContent() {
        super(C0ZOI.LIZ);
        this.LLJJJJJIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJJJJLIIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 889));
        this.LLJJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 890));
    }

    public final TuxTextView ip() {
        return (TuxTextView) this.LLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        AnonymousClass0956 anonymousClass0956 = this.LLJJLIIIJLLLLLLLZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        super.Eo(view);
        SkeletonLayoutCellAbility skeletonLayoutCellAbility = (SkeletonLayoutCellAbility) this.LLJJJJLIIL.getValue();
        if (skeletonLayoutCellAbility != null) {
            skeletonLayoutCellAbility.dM(view);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem
    public final void ep(C869590Y9l c869590Y9l, C0ZOS c0zos) {
        int i;
        int i2;
        C0ZOS c0zos2 = c0zos;
        if (!c0zos2.LIZ) {
            C786410Ut5.LLLLZLL(ip(), 8);
            return;
        }
        ip().setMaxWidth(((int) ((C497820Jfg.LIZIZ(LJJIJL().getContext()) / 375) * 239)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        TuxTextView tuxTextViewIp = ip();
        if (C0ZDX.LJJJJIZL(c869590Y9l)) {
            i = 0;
        } else {
            i = 4;
        }
        Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i)));
        if (C0ZDX.LJJJJIZL(c869590Y9l)) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        C426750GoL.LJIIL(tuxTextViewIp, numValueOf, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2))), null, 26);
        if (C866950Xzh.LIZ(c0zos2.LIZIZ)) {
            ip().setText(c0zos2.LIZIZ);
            C786410Ut5.LLLLZLL(ip(), 0);
            return;
        }
        InterfaceC462200IAo interfaceC462200IAo = new InterfaceC462200IAo() { // from class: X.0ZOg
            @Override // X.InterfaceC462200IAo
            public final void LIZ() {
                this.LIZ.ip().setText(this.LIZ.LJJIJL().getContext().getString(2131831188));
            }

            @Override // X.InterfaceC462200IAo
            public final void LIZIZ(IMContact iMContact) {
                String displayName;
                TuxTextView tuxTextViewIp2 = this.LIZ.ip();
                IMHostApi.LIZ.getClass();
                IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
                if ((iMHostApiLIZ == null || (displayName = iMHostApiLIZ.LJIIIZ(iMContact.getUid())) == null) && (displayName = iMContact.getDisplayName()) == null) {
                    displayName = this.LIZ.LJJIJL().getContext().getString(2131831188);
                }
                tuxTextViewIp2.setText(displayName);
            }
        };
        AnonymousClass0956 anonymousClass0956 = this.LLJJLIIIJLLLLLLLZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJLIIIJLLLLLLLZ = C462190IAn.LIZ(((C457780HxI) this.LLJJJJJIL.getValue()).LL, c869590Y9l, interfaceC462200IAo, LifecycleOwnerKt.getLifecycleScope(this));
        C786410Ut5.LLLLZLL(ip(), 0);
    }
}
