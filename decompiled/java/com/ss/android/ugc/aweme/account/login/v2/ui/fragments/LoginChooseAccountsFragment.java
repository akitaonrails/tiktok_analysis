package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC19483511Kn;
import X.C01GW;
import X.C0MXE;
import X.C0XZ4;
import X.C1237010iIN;
import X.C1239250iLz;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C13D2;
import X.C13FE;
import X.C13ZC;
import X.C1665930tSB;
import X.C1668040tVa;
import X.C1669050tXD;
import X.C1670400tZO;
import X.C1675980tiO;
import X.C1682520tsw;
import X.C1685190txF;
import X.C1685720ty6;
import X.C1685910tyP;
import X.C19EG;
import X.C20030013Ys;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C452501pT;
import X.C785410UrT;
import X.C786410Ut5;
import X.C852810Xct;
import X.C854460XfY;
import X.DialogC1389620mGW;
import X.EnumC852910Xd3;
import X.InterfaceC1254030ijp;
import X.InterfaceC1668050tVb;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import X.InterfaceC20053113dB;
import X.InterfaceC427710Gpt;
import Y.AfS149S0200000_13;
import Y.AfS182S0100000_13;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.ComposeView;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.chooseaccount.AccountSelectionData;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS7S0103000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import org.json.JSONObject;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public final class LoginChooseAccountsFragment extends BaseI18nLoginFragment implements InterfaceC427710Gpt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiP319HELIOSPSxiLz0yLygpJzsgZgkjLiY9Cy0jJjw2CSYvJjo9PDYKOy40JSAiPQ==";
    public DialogC1389620mGW LLLIILIL;
    public final C01GW LLLIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 78));
    public final C01GW LLLILZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 103));
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 106));
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 104));
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 105));
    public final C01GW LLLJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(81));
    public ComposeView LLLJIL;

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.xk;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        DialogC1389620mGW dialogC1389620mGW = this.LLLIILIL;
        if (dialogC1389620mGW != null) {
            C786410Ut5.J4(dialogC1389620mGW);
        }
    }

    public final AccountSelectionData VS() {
        return (AccountSelectionData) this.LLLILZ.getValue();
    }

    public final boolean XS() {
        return ((Boolean) this.LLLILZLLLI.getValue()).booleanValue();
    }

    public final int YS() {
        return ((Number) this.LLLILZJ.getValue()).intValue();
    }

    public final boolean ZS() {
        return this.LLLIL.getValue() == EnumC852910Xd3.EMAIL_OTP_LOGIN || this.LLLIL.getValue() == EnumC852910Xd3.EMAIL_LINK_LOGIN_OR_SIGNUP;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        DialogC1389620mGW dialogC1389620mGW = this.LLLIILIL;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        Context context = getContext();
        return new C1237010iIN(" ", null, false, null, null, false, null, false, false, null, false, null, null, null, context != null ? C1308910kAL.LIZJ(R.attr.zp, context) : null, 33546238);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLJIL = null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        AccountUserService accountUserServiceLJIIJ;
        super.onDestroy();
        IAccountService iAccountService = (IAccountService) this.LLLJ.getValue();
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return;
        }
        accountUserServiceLJIIJ.LJIILLIIL(this);
    }

    public final void eT(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
        c2344009Gk.LJIIIIZZ("enter_method", getEnterMethod());
        c2344009Gk.LIZJ(YS() + (XS() ? 1 : 0), "account_cnt");
        c2344009Gk.LIZJ(YS(), "org_account_cnt");
        c2344009Gk.LJIIIIZZ("btn_click", str);
        C20684815ws.LJIILLIIL("login_account_selection_click", c2344009Gk.LIZ);
    }

    public final void NS(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(254467838);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" • ");
            sbLIZ.append(getString(2131838949));
            C1685190txF.LIZ(C2188811AlT.LIZIZ(sbLIZ), null, C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIZILJ, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2034);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PS(X.InterfaceC1680500tpg r23, int r24) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.LoginChooseAccountsFragment.PS(X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009e A[PHI: r1
      0x009e: PHI (r1v12 android.view.View) = (r1v11 android.view.View), (r1v14 android.view.View) binds: [B:10:0x008b, B:15:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.LoginChooseAccountsFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        C1389890mGx c1389890mGx = new C1389890mGx(requireActivity());
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
    }

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        C19EG activity;
        if (i == 4 && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void QS(com.ss.android.ugc.aweme.account.login.chooseaccount.AuthorizedOrgAccountInfo r21, X.InterfaceC1680500tpg r22, int r23) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.LoginChooseAccountsFragment.QS(com.ss.android.ugc.aweme.account.login.chooseaccount.AuthorizedOrgAccountInfo, X.0tpg, int):void");
    }

    public final void US(int i, int i2, int i3, InterfaceC1680500tpg interfaceC1680500tpg) {
        int i4;
        int i5;
        int i6;
        boolean z;
        long j;
        long jW3;
        int i7 = i;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(138977856);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(i7)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i4 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i8 != 0) {
                i7 = 0;
            }
            if (i7 == 2) {
                z = true;
                c13zcLJIIJ.LJJIIJZLJL(413740367);
                j = ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).Q3).getValue()).LIZ;
            } else {
                z = false;
                c13zcLJIIJ.LJJIIJZLJL(413741548);
                j = ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).V2).getValue()).LIZ;
            }
            c13zcLJIIJ.LJJJJL(false);
            if (z) {
                c13zcLJIIJ.LJJIIJZLJL(413743796);
                jW3 = C1670400tZO.LIZIZ(c13zcLJIIJ).W3();
            } else {
                c13zcLJIIJ.LJJIIJZLJL(413745137);
                jW3 = ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).g4).getValue()).LIZ;
            }
            c13zcLJIIJ.LJJJJL(false);
            float f = 8;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJIJJ(C1675980tiO.LIZIZ(C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, 4, 0.0f, 0.0f, 0.0f, 14), j, C1669050tXD.LIZIZ(f)), null, 3), f, 0.0f, f, 0.0f, 10);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIL);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1685190txF.LIZ(getString(2131839039), null, jW3, C1670400tZO.LJ(c13zcLJIIJ).LJIJJ, 0L, 1, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2002);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS7S0103000_25(this, i7, i2, i3, 0);
        }
    }

    public final void fT(String str, String str2, String str3, boolean z) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putBoolean("is_account_selection_from_email", ZS());
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.putBoolean("is_org_account_selected", z);
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(C2097608Jq.LJIIIIZZ(new Pair("login_selection_ticket", str2), new Pair("user_id", str3), new Pair("domain", str)));
        if (ZS()) {
            C852810Xct.LIZ.getClass();
            final String strLJ = C852810Xct.LJ(getArguments());
            C0XZ4.LIZ.getClass();
            C1239250iLz.LIZIZ(this, this, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XWX
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(final C11KY c11ky) {
                    final C0XYD c0xyd = this;
                    AbstractC849290XTj abstractC849290XTj = new AbstractC849290XTj() { // from class: X.0XWY
                        @Override // X.C0XH7
                        public final void LJFF(C0XGA c0xga) {
                            C0XT7 c0xt7 = (C0XT7) c0xga;
                            C0XWW<C0XT7<C849260XTg>> c0xww = c11ky;
                            int i = c0xt7.LIZLLL;
                            String str4 = c0xt7.LJFF;
                            EnumC852660Xce enumC852660XceScene = c0xyd.scene();
                            EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
                            C0XZ4.LIZ.getClass();
                            ((C11KY) c0xww).onError(new C0XZJ(i, str4, enumC852660XceScene, enumC852910Xd3LLJJLIIIJLLLLLLLZ, C0XZ4.LJIIJJI(c0xt7), ""));
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                        public final void LJI(C0XT7<C849260XTg> c0xt7) {
                            ((C11KY) c11ky).onSuccess(c0xt7);
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                        public final void LJ(C0XT7<C849260XTg> c0xt7, int i) {
                            String str4;
                            C0XWW<C0XT7<C849260XTg>> c0xww = c11ky;
                            if (c0xt7 != null) {
                                str4 = c0xt7.LJFF;
                            } else {
                                str4 = null;
                            }
                            EnumC852660Xce enumC852660XceScene = c0xyd.scene();
                            EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
                            C0XZ4.LIZ.getClass();
                            ((C11KY) c0xww).onError(new C0XZJ(i, str4, enumC852660XceScene, enumC852910Xd3LLJJLIIIJLLLLLLLZ, C0XZ4.LJIIJJI(c0xt7), ""));
                        }
                    };
                    this.gk(abstractC849290XTj);
                    C849270XTh.LIZ(this.requireContext(), strLJ, "", linkedHashMap, abstractC849290XTj).LJIIIZ();
                }
            }).LJIIIIZZ(new AfS149S0200000_13(this, this, 8)).LJII(new AfS182S0100000_13(this, 30))).LJIILL();
            return;
        }
        C852810Xct.LIZ.getClass();
        final String strLIZ = PhoneNumberUtil.LIZ(C852810Xct.LJII(getArguments()));
        C854460XfY.LIZ.getClass();
        String strLJIIJ = C854460XfY.LJIIJ(this);
        if (strLJIIJ != null) {
            linkedHashMap.put("passport_ticket", strLJIIJ);
        }
        C0XZ4.LIZ.getClass();
        C1239250iLz.LIZIZ(this, this, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XY2
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                final C0XYD c0xyd = this;
                C0XY3 c0xy3 = new C0XY3() { // from class: X.0XXz
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, c0xyd.scene(), c0xyd.LLJJLIIIJLLLLLLLZ(), null, c0xga.LJFF));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C850340XXk> c0xt7) {
                        T t = c0xt7.LJIIIZ;
                        if (t != 0 && ((C850340XXk) t).LJIIIZ != null) {
                            ((C11KY) c11ky).onSuccess(t);
                            return;
                        }
                        ((C11KY) c11ky).onError(new C0XZJ(-1, "no data", c0xyd.scene(), c0xyd.LLJJLIIIJLLLLLLLZ(), null, "no data"));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<C850340XXk> c0xt7, int i) {
                        String str4;
                        String str5;
                        C0XWW<C850340XXk> c0xww = c11ky;
                        String str6 = null;
                        if (c0xt7 != null) {
                            str4 = c0xt7.LJFF;
                        } else {
                            str4 = null;
                        }
                        EnumC852660Xce enumC852660XceScene = c0xyd.scene();
                        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
                        C0XZ4.LIZ.getClass();
                        JSONObject jSONObjectLJIIJJI = C0XZ4.LJIIJJI(c0xt7);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        if (c0xt7 != null) {
                            str5 = c0xt7.LJFF;
                        } else {
                            str5 = null;
                        }
                        sbLIZ.append(str5);
                        sbLIZ.append('|');
                        if (c0xt7 != null) {
                            str6 = c0xt7.LJI;
                        }
                        sbLIZ.append(str6);
                        ((C11KY) c0xww).onError(new C0XZJ(i, str4, enumC852660XceScene, enumC852910Xd3LLJJLIIIJLLLLLLLZ, jSONObjectLJIIJJI, C2188811AlT.LIZIZ(sbLIZ)));
                    }
                };
                this.gk(c0xy3);
                this.m8().LJII(strLIZ, "", linkedHashMap, c0xy3);
            }
        }).LJIIIIZZ(new AfS149S0200000_13(this, this, 9)).LJII(new AfS182S0100000_13(this, 21))).LJIILL();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RS(java.lang.String r39, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r40, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r41, X.InterfaceC1680500tpg r42, int r43, int r44) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.LoginChooseAccountsFragment.RS(java.lang.String, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, X.0tpg, int, int):void");
    }
}
