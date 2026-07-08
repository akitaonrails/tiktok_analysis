package com.ss.android.ugc.aweme.im.sdk.chat.viewmodel;

import X.AnonymousClass0951;
import X.C01GW;
import X.C069P;
import X.C09IC;
import X.C0I0B;
import X.C0I20;
import X.C0Y8T;
import X.C0Y8Y;
import X.C0YNP;
import X.C0YSQ;
import X.C0Z1S;
import X.C1626606Ym;
import X.C1640006bW;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C270320Aic;
import X.C452501pT;
import X.C456410Hv5;
import X.C456420Hv6;
import X.C456450Hv9;
import X.C456480HvC;
import X.C456720Hva;
import X.C458200Hxy;
import X.C461720I8s;
import X.C463090IDz;
import X.C882340YjQ;
import X.C894660Z7w;
import X.EnumC430090Gtj;
import X.EnumC899370ZPz;
import X.InterfaceC0148002o;
import X.InterfaceC441960HUs;
import X.InterfaceC456460HvA;
import X.InterfaceC456500HvE;
import X.InterfaceC456680HvW;
import X.InterfaceC456690HvX;
import X.InterfaceC458260Hy4;
import X.InterfaceC458280Hy6;
import X.InterfaceC497601wk;
import X.InterfaceC876950Yaj;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.Map;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class SingleChatInputViewModel extends AssemViewModel<InterfaceC0148002o> {
    public final IInputFieldAbility LL;
    public final InterfaceC456460HvA LLILLJJLI;
    public final C0I20 LLILLL;
    public final InterfaceC456500HvE LLILZ;
    public final SessionInfo LLILZIL;
    public final InterfaceC441960HUs LLILZLL;
    public final InterfaceC456680HvW LLIZ;
    public final InterfaceC456690HvX LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 344));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 343));
    public final C2252321DDq LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public final AnonymousClass0951 LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C456480HvC LLJJIJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(15);
    }

    public final C456720Hva wQ2() {
        return (C456720Hva) this.LLJI.getValue();
    }

    public final C458200Hxy xQ2() {
        return (C458200Hxy) this.LLJ.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (yQ2().LIZ()) {
            if (this.LLILZIL.isReportPage() && ((Boolean) C270320Aic.LIZ.getValue()).booleanValue()) {
                return;
            }
            C458200Hxy c458200HxyXQ2 = xQ2();
            C0I0B.LJFF.LIZJ();
            c458200HxyXQ2.LJIIJ(C894660Z7w.LIZ(), false);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C23250099c.LIZLLL(viewModelScope, null, null, new C456420Hv6(this, null), 3);
        C23250099c.LIZLLL(viewModelScope, null, null, new C456410Hv5(this, null), 3);
        if (yQ2().LIZ()) {
            xQ2().LIZLLL(ViewModelKt.getViewModelScope(this), this.LLJIJIL);
        }
    }

    public final InterfaceC458280Hy6 yQ2() {
        return xQ2().LJII;
    }

    public static boolean vQ2(String str) {
        boolean zIsBlock;
        Map<String, String> ext;
        IMContactApi.LIZ.getClass();
        String str2 = null;
        IMUser iMUserLJ = C069P.LIZ().LJ().LJ(String.valueOf(C0YNP.LJII(str)), null);
        if (iMUserLJ != null) {
            zIsBlock = iMUserLJ.isBlock();
        } else {
            zIsBlock = false;
        }
        if (zIsBlock) {
            return true;
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ != null && C882340YjQ.LJ(c0y8tLIZ)) {
            C0Y8Y coreInfo = c0y8tLIZ.getCoreInfo();
            if (coreInfo != null && (ext = coreInfo.getExt()) != null) {
                str2 = ext.get("stranger");
            }
            if (Intrinsics.LJFF(str2, C461720I8s.LIZIZ())) {
                if (C0Z1S.LIZ() && C069P.LIZ().LIZ().LJJIII() == EnumC899370ZPz.DISABLED) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C456430Hv7
            if (r0 == 0) goto L2a
            r6 = r8
            X.0Hv7 r6 = (X.C456430Hv7) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 == r4) goto L59
            if (r0 == r3) goto L71
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2a:
            X.0Hv7 r6 = new X.0Hv7
            r6.<init>(r7, r8)
            goto L12
        L30:
            X.C155000ia.LIZIZ(r1)
            X.0Hy6 r0 = r7.yQ2()
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L5f
            X.1DDq r3 = r7.LLJIJIL
            X.0Hxy r0 = r7.xQ2()
            X.1DDq r2 = r0.LJIILIIL
            X.0Hv4 r1 = new X.0Hv4
            r0 = 0
            r1.<init>(r7, r0)
            X.01jJ r0 = new X.01jJ
            r0.<init>(r3, r2, r1)
            r6.LLILLL = r4
            java.lang.Object r0 = X.C09IC.LJI(r0, r6)
            if (r0 != r5) goto L5c
            return r5
        L59:
            X.C155000ia.LIZIZ(r1)
        L5c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5f:
            X.1DDq r2 = r7.LLJIJIL
            Y.AgS287S0100000_6 r1 = new Y.AgS287S0100000_6
            r0 = 75
            r1.<init>(r7, r0)
            r6.LLILLL = r3
            java.lang.Object r0 = r2.collect(r1, r6)
            if (r0 != r5) goto L74
            return r5
        L71:
            X.C155000ia.LIZIZ(r1)
        L74:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel.AQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C456440Hv8
            if (r0 == 0) goto L27
            r5 = r7
            X.0Hv8 r5 = (X.C456440Hv8) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 == r3) goto L46
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L27:
            X.0Hv8 r5 = new X.0Hv8
            r5.<init>(r6, r7)
            goto L12
        L2d:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility r0 = r6.LL
            X.0951 r2 = r0.Kv()
            Y.AgS287S0100000_6 r1 = new Y.AgS287S0100000_6
            r0 = 76
            r1.<init>(r6, r0)
            r5.LLILLL = r3
            java.lang.Object r0 = r2.collect(r1, r5)
            if (r0 != r4) goto L49
            return r4
        L46:
            X.C155000ia.LIZIZ(r1)
        L49:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel.BQ2(X.05Vn):java.lang.Object");
    }

    public final void zQ2(Context context) {
        if (yQ2().LIZ() && (xQ2().LJIILIIL.getValue() == EnumC430090Gtj.RECORD_FINISHED || xQ2().LJIILIIL.getValue() == EnumC430090Gtj.LOCKED)) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C456450Hv9(this, context, null), 3);
        } else {
            this.LLILLJJLI.cy2();
        }
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [X.0HvC] */
    public SingleChatInputViewModel(IInputFieldAbility iInputFieldAbility, InterfaceC456460HvA interfaceC456460HvA, C0I20 c0i20, InterfaceC456500HvE interfaceC456500HvE, SessionInfo sessionInfo, InterfaceC441960HUs interfaceC441960HUs, InterfaceC456680HvW interfaceC456680HvW, InterfaceC456690HvX interfaceC456690HvX) {
        boolean z;
        boolean z2;
        this.LL = iInputFieldAbility;
        this.LLILLJJLI = interfaceC456460HvA;
        this.LLILLL = c0i20;
        this.LLILZ = interfaceC456500HvE;
        this.LLILZIL = sessionInfo;
        this.LLILZLL = interfaceC441960HUs;
        this.LLIZ = interfaceC456680HvW;
        this.LLIZLLLIL = interfaceC456690HvX;
        String str = ((C1640006bW) iInputFieldAbility.Kv().getValue()).LIZIZ;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        this.LLJIJIL = C1BNE.LIZ(Boolean.valueOf(z));
        String str2 = ((C1640006bW) iInputFieldAbility.Kv().getValue()).LIZIZ;
        if (str2 != null && !a0.LJJJIL(str2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1626606Ym(!z2, false));
        this.LLJILJIL = c2252321DDqLIZ;
        this.LLJILJILJ = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLJILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(92));
        this.LLJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(93));
        this.LLJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 346));
        this.LLJJIII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 345));
        this.LLJJIJI = new InterfaceC458260Hy4() { // from class: X.0HvC
            @Override // X.InterfaceC458260Hy4
            public final void LIZJ() {
                this.LIZ.LL.setVisibility(false);
                this.LIZ.LLILLL.aS0(false);
                this.LIZ.LLILZ.MA1(new C908520ZkY(new C456490HvD(200L), C456510HvF.LIZ), false);
            }

            @Override // X.InterfaceC458260Hy4
            public final void LIZLLL() {
                this.LIZ.LL.setVisibility(true);
                this.LIZ.LLILLL.aS0(true);
                this.LIZ.LLILZ.MA1(new C908520ZkY(new C456490HvD(200L), C456510HvF.LIZ), true);
            }

            @Override // X.InterfaceC458260Hy4
            public final void LIZ() {
                LIZJ();
            }

            @Override // X.InterfaceC458260Hy4
            public final void LIZIZ(Context context, C458370HyF c458370HyF, C0HVB c0hvb) {
                Activity activityLIZ;
                Window window;
                View decorView;
                this.LIZ.LLILLJJLI.pP(new C454120HrO(c458370HyF.LIZ, c458370HyF.LIZIZ, c458370HyF.LIZLLL, C13LP.LLIIII(c458370HyF.LIZJ), c0hvb));
                if (C298300Bme.LIZ() && (activityLIZ = C1388190mED.LIZ(context)) != null && (window = activityLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    decorView.performHapticFeedback(3);
                }
            }
        };
    }
}
