package com.ss.android.ugc.aweme.share.qrcode.util;

import X.AbstractC848400XPy;
import X.C04TD;
import X.C0XQ7;
import X.C1308910kAL;
import X.C1369870lkf;
import X.C1370940lmO;
import X.C1371430lnB;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1374850lsh;
import X.C1374900lsm;
import X.C1377850lxX;
import X.C1390920mIc;
import X.C19EG;
import X.C2082308Dt;
import X.C2188811AlT;
import X.C259800zU;
import X.C735800Ste;
import X.C786410Ut5;
import X.InterfaceC1210900hcG;
import X.InterfaceC1375180ltE;
import Y.ACListenerS151S0100000_16;
import Y.ARunnableS119S0100000_19;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.IShareLinkService;
import com.ss.android.ugc.aweme.qrcode.CopyLinkChannelWithBPEA;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareLinkServiceImpl implements IShareLinkService {
    public volatile boolean LIZ;

    public static IShareLinkService LJFF() {
        Object objLIZ = C04TD.LIZ(IShareLinkService.class, false);
        return objLIZ != null ? (IShareLinkService) objLIZ : new ShareLinkServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IShareLinkService
    public final CopyLinkChannelWithBPEA LIZJ(Cert cert, boolean z) {
        return new CopyLinkChannelWithBPEA(cert, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    @Override // com.ss.android.ugc.aweme.profile.util.IShareLinkService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1369790lkX r11, java.util.Map<java.lang.String, java.lang.String> r12, X.InterfaceC1364105Vn<? super X.C1371430lnB> r13) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.qrcode.util.ShareLinkServiceImpl.LIZLLL(X.0lkX, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[Catch: all -> 0x00df, TryCatch #2 {all -> 0x00df, blocks: (B:30:0x009f, B:31:0x00a2, B:33:0x00aa, B:35:0x00b2, B:36:0x00c0), top: B:62:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2 A[Catch: all -> 0x00df, TryCatch #2 {all -> 0x00df, blocks: (B:30:0x009f, B:31:0x00a2, B:33:0x00aa, B:35:0x00b2, B:36:0x00c0), top: B:62:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0 A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #2 {all -> 0x00df, blocks: (B:30:0x009f, B:31:0x00a2, B:33:0x00aa, B:35:0x00b2, B:36:0x00c0), top: B:62:0x009f }] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.app.Dialog] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.app.Dialog] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.0mGW] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC1369790lkX r20, X.C19EG r21, X.InterfaceC1364105Vn<? super kotlin.Unit> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.qrcode.util.ShareLinkServiceImpl.LJI(X.0lkX, X.19EG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    @Override // com.ss.android.ugc.aweme.profile.util.IShareLinkService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C19EG r6, com.ss.android.ugc.aweme.qrcode.CopyLinkChannelWithBPEA r7, java.lang.Integer r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C1375290ltP
            if (r0 == 0) goto L7d
            r4 = r9
            X.0ltP r4 = (X.C1375290ltP) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r3 = r4.LLILZ
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZLL
            r0 = 1
            if (r1 == 0) goto L6a
            if (r1 != r0) goto L83
            java.lang.Object r8 = r4.LLILLL
            java.lang.Integer r8 = (java.lang.Integer) r8
            com.ss.android.ugc.aweme.qrcode.CopyLinkChannelWithBPEA r7 = r4.LLILLJJLI
            X.19EG r6 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L2a:
            X.0lnB r3 = (X.C1371430lnB) r3
            X.0lmP r1 = com.ss.android.ugc.aweme.sharer.model.SharePackage.Companion
            java.lang.String r0 = r3.LIZLLL
            r1.getClass()
            int r0 = r0.length()
            r1 = 0
            if (r0 <= 0) goto L5b
            com.bytedance.bpea.basics.Cert r0 = r7.LLILLJJLI
            r5.LJ(r3, r6, r1, r0)
            X.0mGx r1 = new X.0mGx
            r1.<init>(r6)
            if (r8 == 0) goto L57
            int r0 = r8.intValue()
        L4a:
            java.lang.String r0 = r6.getString(r0)
            r1.LJIIJ(r0)
            r1.LJIIJJI()
        L54:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L57:
            r0 = 2131839087(0x7f11486f, float:1.9311416E38)
            goto L4a
        L5b:
            X.0mGx r1 = new X.0mGx
            r1.<init>(r6)
            r0 = 2131848062(0x7f116b7e, float:1.932962E38)
            r1.LJIIIZ(r0)
            r1.LJIIJJI()
            goto L54
        L6a:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r6
            r4.LLILLJJLI = r7
            r4.LLILLL = r8
            r4.LLILZLL = r0
            r0 = 0
            java.lang.Object r3 = r5.LIZLLL(r7, r0, r4)
            if (r3 != r2) goto L2a
            return r2
        L7d:
            X.0ltP r4 = new X.0ltP
            r4.<init>(r5, r9)
            goto L12
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.qrcode.util.ShareLinkServiceImpl.LIZ(X.19EG, com.ss.android.ugc.aweme.qrcode.CopyLinkChannelWithBPEA, java.lang.Integer, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IShareLinkService
    public final boolean LJ(C1371430lnB c1371430lnB, Context context, boolean z, Cert cert) {
        String strLIZIZ;
        if (c1371430lnB.LIZLLL.length() == 0) {
            return false;
        }
        C735800Ste c735800Ste = new C735800Ste("share_person");
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c735800Ste.LJFF("platform", "copy", c2082308Dt);
        c735800Ste.LJFF("enter_from", "personal_homepage", c2082308Dt);
        c735800Ste.LJFF("enter_method", "qr_code_share", c2082308Dt);
        c735800Ste.LJFF("item_author_type", "1", c2082308Dt);
        c735800Ste.LJIILJJIL();
        String str = c1371430lnB.LIZJ;
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1371430lnB.LIZJ);
            sbLIZ.append(' ');
            sbLIZ.append(c1371430lnB.LIZLLL);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = c1371430lnB.LIZLLL;
        }
        C1377850lxX c1377850lxX = new C1377850lxX(null, z, 3);
        if (cert == null) {
            cert = CertProviderManagerKt.findCert("bpea-qr_code_copy_link", 1476399133);
        }
        c1377850lxX.LIZ(strLIZIZ, context, cert, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    @Override // com.ss.android.ugc.aweme.profile.util.IShareLinkService
    public final void LIZIZ(final C19EG c19eg, String str, String str2, String str3, boolean z) {
        String uid;
        int iIntValue;
        DialogFragment dialogFragment;
        User curUser;
        TextView textView;
        if (str2 == null) {
            str2 = "personal_homepage";
        }
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJII(true);
        final View viewLJLLJ = C786410Ut5.LJLLJ(c19eg, R.layout.f8k, null);
        if (viewLJLLJ != null) {
            if (str != null && (textView = (TextView) viewLJLLJ.findViewById(R.id.uza)) != null) {
                textView.setText(str);
            }
            List listLIZ = C1374850lsh.LIZ(c19eg, z);
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF == null || (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) == null || (uid = curUser.getUid()) == null) {
                uid = "";
            }
            C1370940lmO c1370940lmO = new C1370940lmO();
            c1370940lmO.LIZ = "user";
            if (uid.length() > 0) {
                c1370940lmO.LIZIZ = uid;
            }
            c1370940lmO.LIZIZ("enter_from", str2);
            c1370940lmO.LIZIZ("enter_method", "qr_code_share");
            c1370940lmO.LIZIZ("panel_source", "share_panel");
            c1370940lmO.LIZIZ("item_author_type", "1");
            if (str3 != null && str3.length() > 0) {
                c1370940lmO.LIZIZ("series_category", str3);
            }
            SharePackage sharePackage = new SharePackage(c1370940lmO);
            C1371600lnS c1371600lnS = new C1371600lnS();
            c1371600lnS.LJJIIJ = sharePackage;
            c1371600lnS.LIZ.addAll(listLIZ);
            c1371600lnS.LJJIIJZLJL = false;
            c1371600lnS.LJIIZILJ = false;
            final C1371590lnR c1371590lnR = new C1371590lnR(c1371600lnS);
            final int navigationBarColor = c19eg.getWindow().getNavigationBarColor();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, c19eg);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = navigationBarColor;
            }
            c19eg.getWindow().setNavigationBarColor(iIntValue);
            final C259800zU c259800zU = new C259800zU();
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIII = viewLJLLJ;
            Integer numValueOf = Integer.valueOf(iIntValue);
            ?? r1 = c1390920mIc.LIZ;
            r1.LLJI = numValueOf;
            r1.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0hun
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    TuxSheet tuxSheet;
                    c19eg.getWindow().setNavigationBarColor(navigationBarColor);
                    ArrayList<JSONObject> arrayList2 = C1369870lkf.LIZ;
                    TuxSheet tuxSheet2 = c259800zU.element;
                    if (tuxSheet2 == null) {
                        tuxSheet = null;
                    } else {
                        tuxSheet = tuxSheet2;
                    }
                    C1369870lkf.LJ(tuxSheet, c1371590lnR);
                }
            };
            c259800zU.element = r1;
            C1369870lkf.LJIJI(r1);
            C1374900lsm c1374900lsm = (C1374900lsm) viewLJLLJ.findViewById(R.id.sjs);
            if (c1374900lsm != null) {
                c1374900lsm.setSharePersonEnterFrom(str2);
                c1374900lsm.setEnableInstagramStory(z);
                c1374900lsm.setCallback(new InterfaceC1375180ltE() { // from class: X.0e4y
                    @Override // X.InterfaceC1375180ltE
                    public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX) {
                        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19eg), null, null, new C1074930e4x(viewLJLLJ, interfaceC1369790lkX, this, c19eg, null), 3);
                    }
                });
            }
            TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.v0t);
            if (tuxIconView != null) {
                C786410Ut5.a9(tuxIconView, new ACListenerS151S0100000_16(c259800zU, 51));
            }
            T t = c259800zU.element;
            if (t == 0) {
                dialogFragment = null;
            } else {
                dialogFragment = (DialogFragment) t;
            }
            dialogFragment.show(c19eg.getSupportFragmentManager(), (String) null);
            HandlerHook.viewPost(viewLJLLJ, new ARunnableS119S0100000_19(c1371590lnR, 87));
        }
    }
}
