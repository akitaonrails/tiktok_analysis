package com.ss.android.ugc.profile.business.profile.info.identifier.sheet;

import X.AnonymousClass0208;
import X.C01GW;
import X.C01XS;
import X.C09YG;
import X.C0H1U;
import X.C0OBG;
import X.C0PEM;
import X.C1005140cGO;
import X.C1005150cGP;
import X.C1005160cGQ;
import X.C1247840iZq;
import X.C1248950ibd;
import X.C1250210idf;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1720106oR;
import X.C19252910Tv;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2537109wv;
import X.C259800zU;
import X.C268330AfP;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1248260iaW;
import Y.ACListenerS122S0200000_19;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS73S0200000_4;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profile.org.AssociateAccountInfo;
import com.ss.android.ugc.aweme.profile.org.OrgIdentifierBizData;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountOrgIdentifierProtocol extends ProfilePlatformProtocol<OrgIdentifierBizData> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(365));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(366));
    public final String LLJJJJJIL = "user_account_org_identifier";
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2098));
    public final EnumC1248260iaW LLJJL = EnumC1248260iaW.TEXT;

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r7 = this;
            X.0ibd r0 = r7.LLIZ
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L17
            com.ss.android.ugc.profile.platform.base.data.ProfileComponents r0 = r0.LLILLJJLI
            if (r0 == 0) goto L17
            java.util.List<com.ss.android.ugc.profile.platform.base.data.Action> r0 = r0.actions
            if (r0 == 0) goto L17
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r5) goto L17
            return
        L17:
            ProfileOrgAccountTrialEntranceSettings$ProfileOrgAccountTrialEntranceModel r0 = defpackage.ProfileOrgAccountTrialEntranceSettings.LIZ()
            java.lang.Boolean r1 = r0.enable
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r2 = 0
            java.lang.String r4 = "org_identifier_show"
            if (r0 != 0) goto L2c
            r7.LJJZZI(r4, r2)
            return
        L2c:
            T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData r0 = r7.LLJILJIL
            com.ss.android.ugc.aweme.profile.org.OrgIdentifierBizData r0 = (com.ss.android.ugc.aweme.profile.org.OrgIdentifierBizData) r0
            if (r0 == 0) goto L36
            java.lang.Integer r2 = r0.getOrgAccountTrialTag()
        L36:
            r1 = 2
            if (r2 == 0) goto L6e
            int r0 = r2.intValue()
            if (r0 != r5) goto L65
            java.lang.String r2 = "complete"
        L41:
            kotlin.Pair[] r3 = new kotlin.Pair[r1]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "trial_button"
            r1.<init>(r0, r2)
            r3[r6] = r1
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            java.lang.String r2 = r0.getCurUserId()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "to_user_id"
            r1.<init>(r0, r2)
            r3[r5] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r3)
            r7.LJJZZI(r4, r0)
            return
        L65:
            int r0 = r2.intValue()
            if (r0 != r1) goto L6e
            java.lang.String r2 = "incomplete"
            goto L41
        L6e:
            java.lang.String r2 = "null"
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.info.identifier.sheet.AccountOrgIdentifierProtocol.LIZLLL():void");
    }

    public final int LJJLL() {
        return ((Number) this.LLJJJIL.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0ic4] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData, com.ss.android.ugc.profile.platform.base.data.BizBaseData] */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJIIJJI() {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.info.identifier.sheet.AccountOrgIdentifierProtocol.LJIIJJI():android.view.View");
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJ() {
        Context context = getContext();
        if (context != null) {
            return C1308910kAL.LIZJ(R.attr.a1j, context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJIIJ() {
        Context context = getContext();
        if (context != null) {
            return C1308910kAL.LIZJ(R.attr.a1j, context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJJJJ() {
        return Integer.valueOf(C268330AfP.LIZLLL() ? 72 : C2537109wv.LJI() ? 61 : 62);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final EnumC1248260iaW LJJIIZI() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final TextUtils.TruncateAt LJJJJ() {
        return TextUtils.TruncateAt.END;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return this.LLJJJJJIL;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        C19EG c19egLIZIZ;
        OrgIdentifierBizData orgIdentifierBizData;
        String str;
        View viewLJLLLL;
        ProfileComponents profileComponents;
        ProfileComponents profileComponents2;
        List<Action> list;
        String url;
        ProfileComponents profileComponents3;
        List<EventParams> list2;
        EventParams next;
        n nVar;
        if (C0OBG.LIZIZ(this.LLILZLL)) {
            return true;
        }
        C1248950ibd c1248950ibd = this.LLIZ;
        if (c1248950ibd != null && (profileComponents2 = c1248950ibd.LLILLJJLI) != null && (list = profileComponents2.actions) != null) {
            for (Action action : list) {
                if (Intrinsics.LJFF(action.getType(), "router")) {
                    Context context = getContext();
                    Action.RouterInfo router = action.getRouter();
                    if (router != null) {
                        url = router.getUrl();
                    } else {
                        url = null;
                    }
                    SmartRouter.buildRoute(context, url).open();
                    C1248950ibd c1248950ibd2 = this.LLIZ;
                    if (c1248950ibd2 != null && (profileComponents3 = c1248950ibd2.LLILLJJLI) != null && (list2 = profileComponents3.eventParams) != null) {
                        Iterator<EventParams> it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                EventParams eventParams = next;
                                if (eventParams != null) {
                                    Integer num = eventParams.type;
                                    int type = C09YG.TYPE_CLICK.getType();
                                    if (num != null && num.intValue() == type) {
                                        break;
                                    }
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        EventParams eventParams2 = next;
                        if (eventParams2 != null && (nVar = eventParams2.bizParams) != null) {
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01XS(nVar, null), 3);
                        }
                    }
                    return true;
                }
            }
        }
        Context context2 = getContext();
        if (context2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(context2)) != null && (orgIdentifierBizData = (OrgIdentifierBizData) this.LLJILJIL) != null) {
            String str2 = this.LLJJIJIL;
            C1248950ibd c1248950ibd3 = this.LLIZ;
            if (c1248950ibd3 != null && (profileComponents = c1248950ibd3.LLILLJJLI) != null) {
                str = profileComponents.componentId;
            } else {
                str = null;
            }
            C1005150cGP c1005150cGP = new C1005150cGP(orgIdentifierBizData, str2, str);
            C259800zU c259800zU = new C259800zU();
            C1247840iZq c1247840iZq = new C1247840iZq(c19egLIZIZ, orgIdentifierBizData, str2, str, new AwS556S0100000_12(c259800zU, (C259800zU<TuxSheet>) 1001), new AwS556S0100000_12(c259800zU, (C259800zU<TuxSheet>) 1002));
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19egLIZIZ), R.layout.eif, null, false);
            C786410Ut5.W5(viewTd, new FrameLayout.LayoutParams(-1, -2));
            TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.s5h);
            if (tuxIconView != null) {
                C786410Ut5.a9(tuxIconView, new ACListenerS154S0100000_19(c1247840iZq, 316));
            }
            C1247840iZq.LIZ(R.id.s5k, viewTd, orgIdentifierBizData.getPanelIcon(), new AwS633S0100000_19(c1247840iZq, 318));
            C1247840iZq.LIZ(R.id.s5j, viewTd, orgIdentifierBizData.getPanelHeader(), AnonymousClass0208.get$arr$(71));
            C1247840iZq.LIZ(R.id.s5i, viewTd, orgIdentifierBizData.getOrgAccountName(), AnonymousClass0208.get$arr$(72));
            C1247840iZq.LIZ(R.id.s5g, viewTd, orgIdentifierBizData.getOrgAccountCategory(), AnonymousClass0208.get$arr$(73));
            String associateAccountHeader = orgIdentifierBizData.getAssociateAccountHeader();
            AssociateAccountInfo associateAccountInfo = orgIdentifierBizData.getAssociateAccountInfo();
            if (associateAccountInfo != null && (viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) viewTd.findViewById(R.id.s5f))) != null) {
                C1247840iZq.LIZ(R.id.s5d, viewLJLLLL, associateAccountHeader, AnonymousClass0208.get$arr$(75));
                C1247840iZq.LIZ(R.id.s5c, viewLJLLLL, associateAccountInfo.avatarThumb, new AwS615S0100000_1(viewLJLLLL, 350));
                String str3 = associateAccountInfo.nickname;
                if (str3 == null || str3.length() == 0) {
                    str3 = associateAccountInfo.username;
                }
                C1247840iZq.LIZ(R.id.s5e, viewLJLLLL, str3, AnonymousClass0208.get$arr$(76));
                C786410Ut5.I7(new ACListenerS122S0200000_19(c1247840iZq, associateAccountInfo, 99), viewLJLLLL);
            }
            C1247840iZq.LIZ(R.id.s5l, viewTd, orgIdentifierBizData.getOrgAccountIllustration(), AnonymousClass0208.get$arr$(74));
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIII = viewTd;
            c1390920mIc.LJIIIIZZ(0);
            ?? r3 = c1390920mIc.LIZ;
            r3.LLJLILLLLZIIL = false;
            r3.LLILLL = true;
            r3.LLJLLIL = true;
            r3.LLJLLL = true;
            r3.LLJJIJIIJIL = true;
            r3.show(c19egLIZIZ.getSupportFragmentManager(), "AccountOrgIdentifierProtocol");
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1005140cGO("org_identifier_click", c1005150cGP, null), 3);
            c259800zU.element = r3;
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        OrgIdentifierBizData orgIdentifierBizData;
        try {
            orgIdentifierBizData = (OrgIdentifierBizData) C1250210idf.LIZ(nVar.toString(), OrgIdentifierBizData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            String tag = getTag();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseComponentBizData error:");
            sbLIZ.append(e);
            C1720106oR.LIZ(tag, C2188811AlT.LIZIZ(sbLIZ));
            orgIdentifierBizData = null;
        }
        this.LLJILJIL = orgIdentifierBizData;
    }

    public final void LJJLIIIJLJLI(View view) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(((Number) this.LLJJJJ.getValue()).intValue(), ((Number) this.LLJJJJ.getValue()).intValue());
        if (view != null) {
            view.setId(R.id.s0a);
        }
        if (!C268330AfP.LJIIJ()) {
            layoutParams.gravity = 17;
        } else {
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        }
        if (view != null) {
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public final void LJJZZI(String str, Map<String, String> map) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1005160cGQ(str, this, map, null), 3);
    }

    public static void LJJLJLI(int i, int i2, View view) {
        int iLIZIZ;
        int i3;
        TuxTextView tuxTextView;
        if (!C2537109wv.LJI() && !C268330AfP.LJIIJ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, iLIZIZ);
        if (view != null) {
            view.setId(R.id.s0b);
        }
        if (C268330AfP.LJIIJ()) {
            i3 = 8388627;
        } else {
            i3 = 17;
        }
        layoutParams.gravity = i3;
        if (view != null) {
            C786410Ut5.W5(view, layoutParams);
        }
        if ((view instanceof TuxTextView) && (tuxTextView = (TuxTextView) view) != null) {
            tuxTextView.setSingleLine(true);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            C0H1U.LJIIIIZZ(i, tuxTextView);
            C0H1U.LJIIIZ(i2, tuxTextView);
            tuxTextView.setGravity(17);
            HandlerHook.viewPost(tuxTextView, new ARunnableS73S0200000_4(tuxTextView, layoutParams, 56));
        }
        C19252910Tv.LIZIZ.LIZLLL().LJI().LLIZLLLIL(view, null, null, Boolean.TRUE);
    }
}
