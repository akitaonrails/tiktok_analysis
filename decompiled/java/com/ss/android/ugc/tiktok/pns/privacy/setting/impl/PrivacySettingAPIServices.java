package com.ss.android.ugc.tiktok.pns.privacy.setting.impl;

import X.AnonymousClass1087;
import X.C05ON;
import X.C0JBV;
import X.C103A;
import X.C103L;
import X.C104A;
import X.C105F;
import X.C106R;
import X.C106T;
import X.C106V;
import X.C107P;
import X.C108C;
import X.C108E;
import X.C108F;
import X.C108G;
import X.C108N;
import X.C108O;
import X.C108P;
import X.C10BK;
import X.C10BN;
import X.C10CO;
import X.C1163504gr;
import X.C1207604ny;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C1308910kAL;
import X.C13BV;
import X.C1701550uNd;
import X.C1888960zFu;
import X.C191852103u;
import X.C191870104m;
import X.C191871104n;
import X.C191880104w;
import X.C191985108x;
import X.C19719612Di;
import X.C19EG;
import X.C2097608Jq;
import X.C21415018rM;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C444830HcP;
import X.C444840HcQ;
import X.C770750ULh;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC191875104r;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.tiktok.pns.privacy.setting.agechange.AgeDownReminderInfo;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IAgeGradService;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptProcessFragment;
import com.ss.android.ugc.tiktok.pns.props.RemoveOffProps;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.ss.android.ugc.tiktok.tpsc.model.PopupExtra;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.ViewerHistoryExtra;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS34S2000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS8S0020000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacySettingAPIServices implements IPrivacySettingAPIService {
    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final boolean LIZJ() {
        C108F.LIZ.getClass();
        C191880104w.LIZ.getClass();
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJI = C191880104w.LJI("viewer_history");
        return privacySettingsAgreementRecordLJI != null && privacySettingsAgreementRecordLJI.status == 1 && (privacySettingsAgreementRecordLJI.popupExtra instanceof ViewerHistoryExtra);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final boolean LJ() {
        C108P.LIZ.getClass();
        C191880104w.LIZ.getClass();
        Integer numLJIIIIZZ = C191880104w.LJIIIIZZ("account_level_off", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        return numLJIIIIZZ != null && numLJIIIIZZ.intValue() == 1;
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final C1701550uNd LJIIJ() {
        C108N.LIZ.getClass();
        AgeDownReminderInfo ageDownReminderInfoLIZ = C108N.LIZ();
        if (ageDownReminderInfoLIZ == null) {
            return null;
        }
        return new C1701550uNd(new AwS607S0100000_28(ageDownReminderInfoLIZ, 229), AFwS231S0000000_3.get$arr$(156), new AwS607S0100000_28(ageDownReminderInfoLIZ, 230), new AwS607S0100000_28(ageDownReminderInfoLIZ, 231), new AwS607S0100000_28(ageDownReminderInfoLIZ, 232));
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final boolean LJIIL() {
        C108G.LIZ.getClass();
        IAgeGradService iAgeGradService = (IAgeGradService) PluggableExtentionKt.pluggableSpi$default(IAgeGradService.class, false, false, false, 14, null);
        return iAgeGradService != null && iAgeGradService.LIZIZ("privacy_settings") == 1;
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final C1701550uNd LJIILIIL() {
        AFwS236S0000000_6 aFwS236S0000000_6;
        AnonymousClass1087.LIZ.getClass();
        C191880104w.LIZ.getClass();
        int iLIZ = C105F.LIZ(C191880104w.LJIIL(), "pause_interaction_from", 0);
        if (iLIZ == 1) {
            aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(471);
        } else {
            if (iLIZ != 2) {
                return null;
            }
            aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(470);
        }
        return new C1701550uNd(aFwS236S0000000_6, AFwS231S0000000_3.get$arr$(201), AFwS271S0000000_28.get$arr$(376), AFwS271S0000000_28.get$arr$(377), AFwS271S0000000_28.get$arr$(378));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final List LJIIZILJ() {
        List<? extends C104A> list;
        ?? SingletonList;
        C107P c107p;
        String str;
        C106V.LIZ.getClass();
        C106V.LIZJ().getClass();
        C103L c103lLJ = TPSCRenderManager.LJ("settings");
        if (c103lLJ == null || (list = c103lLJ.LJ) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (C104A c104a : list) {
            if (c104a instanceof C191852103u) {
                List<C104A> list2 = ((C191852103u) c104a).LJ;
                SingletonList = new ArrayList();
                for (C104A c104a2 : (ArrayList) list2) {
                    String str2 = c104a2.LIZ;
                    if ((c104a2 instanceof C107P) && (c107p = (C107P) c104a2) != null && (str = c107p.LJIIIIZZ) != null && LJIL(str2, str) && str2 != null) {
                        SingletonList.add(str2);
                    }
                }
            } else if (c104a instanceof C107P) {
                String str3 = c104a.LIZ;
                if (!LJIL(str3, ((C107P) c104a).LJIIIIZZ) || str3 == null || (SingletonList = Collections.singletonList(str3)) == 0) {
                    SingletonList = C13BV.INSTANCE;
                }
            } else {
                SingletonList = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(SingletonList, arrayList);
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final TPSCRenderManager LJIJ() {
        C106V.LIZ.getClass();
        return C106V.LIZJ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final void LJIJI() {
        C106R.LIZ.getClass();
        C1163504gr.LIZIZ.onEventV3("privacy_center_exit", C106R.LIZIZ());
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final RemoveOffProps LJIJJ() {
        C108O.LIZ.getClass();
        return C108O.LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final boolean LJIJJLI() {
        C108N.LIZ.getClass();
        C106V.LIZ.getClass();
        C106V.LIZIZ().getClass();
        Integer numLJIIIIZZ = C191880104w.LJIIIIZZ("age_down_reminder", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        return numLJIIIIZZ != null && numLJIIIIZZ.intValue() == 1;
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final void LIZLLL(final C19EG c19eg) {
        PopupExtra popupExtra;
        ViewerHistoryExtra viewerHistoryExtra;
        final boolean z;
        final boolean z2;
        boolean z3;
        int i;
        C127A c127a;
        int marginStart;
        int marginStart2;
        int iIntValue;
        int iIntValue2;
        boolean z4;
        boolean z5;
        Object obj;
        C108F.LIZ.getClass();
        C191880104w.LIZ.getClass();
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJI = C191880104w.LJI("viewer_history");
        if (privacySettingsAgreementRecordLJI != null) {
            popupExtra = privacySettingsAgreementRecordLJI.popupExtra;
        } else {
            popupExtra = null;
        }
        if ((popupExtra instanceof ViewerHistoryExtra) && (viewerHistoryExtra = (ViewerHistoryExtra) popupExtra) != null) {
            if (viewerHistoryExtra.profileViewHistory == 1) {
                z = true;
            } else {
                z = false;
            }
            if (viewerHistoryExtra.videoViewHistory == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (viewerHistoryExtra.type == 6) {
                z3 = true;
            } else {
                z3 = false;
            }
            View viewLJLLJ = C786410Ut5.LJLLJ(c19eg, R.layout.bes, null);
            View viewFindViewById = viewLJLLJ.findViewById(R.id.fc9);
            boolean zLIZIZ = C960203pA.LIZIZ(c19eg);
            C384050F3z c384050F3z = new C384050F3z();
            if (zLIZIZ) {
                i = R.attr.zo;
            } else {
                i = R.attr.zn;
            }
            c384050F3z.LIZIZ = Integer.valueOf(i);
            c384050F3z.LIZJ = Float.valueOf(c19eg.getResources().getDimension(R.dimen.b5));
            viewFindViewById.setBackground(c384050F3z.LIZ(c19eg));
            TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.s7r);
            C108F.LIZ(tuxIconView, c19eg, 2131837187, new AwS8S0020000_28(z, z2, 0));
            C108F.LIZ((TuxIconView) viewLJLLJ.findViewById(R.id.video_viewers_icon), c19eg, 2131837186, new AwS8S0020000_28(z, z2, 1));
            C127M accessory = ((C127K) viewLJLLJ.findViewById(R.id.viewer_history_switch)).getAccessory();
            if ((accessory instanceof C127A) && (c127a = (C127A) accessory) != null) {
                c127a.LJIILJJIL(true);
                final TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.s7s);
                tuxTextView.setText(C108F.LIZIZ(c19eg, Boolean.valueOf(z), Boolean.valueOf(c127a.LJIILIIL())));
                final TuxTextView tuxTextView2 = (TuxTextView) viewLJLLJ.findViewById(R.id.video_viewers_right_label);
                tuxTextView2.setText(C108F.LIZIZ(c19eg, Boolean.valueOf(z2), Boolean.valueOf(c127a.LJIILIIL())));
                final boolean z6 = z2;
                final boolean z7 = z;
                c127a.LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.108J
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                        C108F c108f = C108F.LIZ;
                        C108I c108i = C108I.LLILLL;
                        boolean z9 = z7;
                        boolean z10 = z6;
                        c108f.getClass();
                        C108F.LIZJ(c108i, z9, z10, null);
                        tuxTextView.setText(C108F.LIZIZ(c19eg, Boolean.valueOf(z7), Boolean.valueOf(z8)));
                        tuxTextView2.setText(C108F.LIZIZ(c19eg, Boolean.valueOf(z6), Boolean.valueOf(z8)));
                    }
                });
                int paddingStart = c19eg.getResources().getDisplayMetrics().widthPixels - (viewLJLLJ.findViewById(R.id.s7q).getPaddingStart() * 2);
                ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                } else {
                    marginStart = 0;
                }
                int width = (paddingStart - marginStart) - tuxIconView.getWidth();
                ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginStart2 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
                } else {
                    marginStart2 = 0;
                }
                int iLIZIZ = (width - marginStart2) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) * 2);
                int i2 = (iLIZIZ * 3) / 5;
                C444830HcP c444830HcP = new C444830HcP();
                c444830HcP.LIZLLL = false;
                c444830HcP.LJIILIIL(c19eg.getString(2131845517));
                c444830HcP.LJII(101);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c19eg);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                c444830HcP.LJIILJJIL(iIntValue);
                c444830HcP.LJIIIZ(2);
                C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
                c444840HcQ.LJ = i2;
                c444840HcQ.LJII = TextUtils.TruncateAt.END;
                c444830HcP.LJIILL(0);
                ((C21415018rM) viewLJLLJ.findViewById(R.id.s7t)).setTextLayout(C444830HcP.LIZJ(c444830HcP, 0.0f, true, null, 29));
                C444830HcP c444830HcP2 = new C444830HcP();
                c444830HcP2.LIZLLL = false;
                c444830HcP2.LJIILIIL(c19eg.getString(2131858195));
                c444830HcP2.LJII(101);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, c19eg);
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                c444830HcP2.LJIILJJIL(iIntValue2);
                c444830HcP2.LJIIIZ(2);
                C444840HcQ c444840HcQ2 = c444830HcP2.LIZIZ;
                c444840HcQ2.LJ = i2;
                c444840HcQ2.LJII = TextUtils.TruncateAt.END;
                c444830HcP2.LJIILL(0);
                ((C21415018rM) viewLJLLJ.findViewById(R.id.video_viewers_title)).setTextLayout(C444830HcP.LIZJ(c444830HcP2, 0.0f, true, null, 29));
                int i3 = iLIZIZ - i2;
                tuxTextView.setMaxWidth(i3);
                tuxTextView2.setMaxWidth(i3);
                C770750ULh c770750ULh = new C770750ULh();
                c770750ULh.LJ = c19eg.getString(2131837213);
                c770750ULh.LJFF = c19eg.getString(2131837184);
                c770750ULh.LJIILIIL = viewLJLLJ;
                c770750ULh.LJIILJJIL = true;
                c770750ULh.LJIILLIIL = z3;
                c770750ULh.LJI(c19eg.getString(2131837185), new C108E(c127a, z, z2));
                TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
                tuxSheet.LLJLLL = z3;
                tuxSheet.LLJLLIL = z3;
                tuxSheet.LLILLL = z3;
                tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.108H
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C108F c108f = C108F.LIZ;
                        boolean z8 = z;
                        boolean z9 = z2;
                        c108f.getClass();
                        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
                        if (iPrivacySettingsDepService != null) {
                            iPrivacySettingsDepService.LJJIJIL();
                        }
                        String str = TuxSheet._pnsPageId;
                        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
                        if (!(abstractC343940De4LJIIJJI instanceof C343950De5)) {
                            if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343980De8.LIZ)) {
                                C108F.LIZJ(C108I.LLILLJJLI, z8, z9, null);
                            }
                            C191880104w.LIZ.getClass();
                            C191880104w.LJIJ(1, "viewer_history");
                            C191880104w.LJIILL(2, "viewer_history");
                        }
                    }
                };
                tuxSheet.show(c19eg.getSupportFragmentManager(), "viewer_history_popup");
                if (viewerHistoryExtra.profileViewHistory == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (viewerHistoryExtra.videoViewHistory == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                C1163504gr c1163504gr = C1163504gr.LIZIZ;
                Pair[] pairArr = new Pair[4];
                pairArr[0] = new Pair("enter_from", "personal_homepage");
                String str = "on";
                if (z5) {
                    obj = "on";
                } else {
                    obj = "off";
                }
                pairArr[1] = new Pair("post_view_status", obj);
                if (!z4) {
                    str = "off";
                }
                pairArr[2] = new Pair("profile_view_status", str);
                pairArr[3] = new Pair("pop_up_type", "one_button");
                c1163504gr.onEventV3("viewer_history_pop_up_show", C2097608Jq.LJIIIIZZ(pairArr));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJII(java.lang.String r5) {
        /*
            r4 = this;
            X.106V r0 = X.C106V.LIZ
            r0.getClass()
            com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager r0 = X.C106V.LIZJ()
            r0.getClass()
            java.lang.String r0 = "settings"
            X.103L r0 = com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager.LJ(r0)
            if (r0 == 0) goto L8a
            java.util.List<? extends X.104A> r0 = r0.LJ
            if (r0 == 0) goto L8a
            java.util.Iterator r3 = r0.iterator()
        L1c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r2 = r3.next()
            X.104A r2 = (X.C104A) r2
            boolean r0 = r2 instanceof X.C191852103u
            if (r0 == 0) goto L8d
            X.103u r2 = (X.C191852103u) r2
            java.util.List<X.104A> r0 = r2.LJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L36:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r2 = r1.next()
            X.104A r2 = (X.C104A) r2
            boolean r0 = r2 instanceof X.C107P
            if (r0 == 0) goto L36
            java.lang.String r0 = r2.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L36
            X.107P r2 = (X.C107P) r2
        L50:
            if (r2 == 0) goto L8a
            X.106V r0 = X.C106V.LIZ
            r0.getClass()
            X.104w r0 = X.C106V.LIZIZ()
            r0.getClass()
            com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2 r1 = X.C191880104w.LJIIL()
            if (r1 == 0) goto L8a
            java.lang.String r0 = r2.LJIIIZ
            java.lang.Integer r0 = r1.LIZ(r0)
            if (r0 == 0) goto L8a
            int r3 = r0.intValue()
            java.util.List<com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyLabelConfigModel> r2 = r2.LJIIJJI
            if (r2 == 0) goto L8a
            X.108Z r0 = X.C103G.LIZIZ
            if (r0 == 0) goto L8a
            kotlin.jvm.internal.AFwS315S0000000_28 r1 = r0.LIZ()
            if (r1 == 0) goto L8a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r1.invoke(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L8c
        L8a:
            java.lang.String r0 = ""
        L8c:
            return r0
        L8d:
            boolean r0 = r2 instanceof X.C107P
            if (r0 == 0) goto L1c
            java.lang.String r0 = r2.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L1c
            X.107P r2 = (X.C107P) r2
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.privacy.setting.impl.PrivacySettingAPIServices.LJII(java.lang.String):java.lang.String");
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final PaPromptProcessFragment LJIIIZ(int i) {
        return C0JBV.LIZ(i, 0, "register_flow");
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final void LJIILJJIL(AwS605S0100000_26 awS605S0100000_26) {
        C108G.LIZ.getClass();
        IAgeGradService iAgeGradService = (IAgeGradService) PluggableExtentionKt.pluggableSpi$default(IAgeGradService.class, false, false, false, 14, null);
        if (iAgeGradService != null) {
            iAgeGradService.LIZJ(new AwS640S0100000_26(awS605S0100000_26, 98));
        }
    }

    public static boolean LJIL(String str, String str2) {
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI;
        if (str2.length() == 0) {
            privacySettingsRestrictionItemLJIIJJI = new PrivacySettingsRestrictionItem(0, 0, null, 0, -1, null);
        } else {
            C106V.LIZ.getClass();
            C106V.LIZIZ().getClass();
            privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, str2);
        }
        if (C191985108x.LIZLLL(privacySettingsRestrictionItemLJIIJJI).LIZIZ) {
            if (Intrinsics.LJFF(str, "direct_message_entrance")) {
                C106T.LIZ.getClass();
                if (!C106T.LIZ()) {
                    return false;
                }
            } else if (Intrinsics.LJFF(str, "activity_status_entrance")) {
                IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
                if (iPrivacySettingsDepService != null && iPrivacySettingsDepService.LJJIIJ()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final void LJIIIIZZ(Context context, Fragment fragment) {
        C108C c108c = C108C.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c108c.getClass();
        C108C.LIZIZ = jCurrentTimeMillis;
        C10BK c10bk = C10BK.LIZ;
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        c10bk.getClass();
        C10BK.LIZIZ(context, childFragmentManager, "settings", null);
        C108P.LIZ.getClass();
        C108P.LIZLLL(fragment);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final void LJIIJJI(LifecycleOwner lifecycleOwner, String str) {
        LifecycleCoroutineScope lifecycleScope;
        if (!Intrinsics.LJFF("settings", "settings") && !Intrinsics.LJFF("settings", "main")) {
            C106V.LIZ.getClass();
            C106V.LIZIZ().getClass();
            C191880104w.LIZLLL(str, null, false);
        } else {
            if (C1207604ny.LIZ()) {
                C106V.LIZ.getClass();
                C191880104w c191880104wLIZIZ = C106V.LIZIZ();
                AwS34S2000000_28 awS34S2000000_28 = new AwS34S2000000_28(str, 0);
                c191880104wLIZIZ.getClass();
                C191870104m c191870104mLIZLLL = C191871104n.LIZLLL();
                EnumC191875104r enumC191875104r = EnumC191875104r.ALL;
                c191870104mLIZLLL.getClass();
                C191870104m.LIZIZ(enumC191875104r, str, false, awS34S2000000_28);
            } else {
                C106V.LIZ.getClass();
                C191880104w c191880104wLIZIZ2 = C106V.LIZIZ();
                AwS34S2000000_28 awS34S2000000_282 = new AwS34S2000000_28(str, 1);
                c191880104wLIZIZ2.getClass();
                C191880104w.LIZLLL(str, awS34S2000000_282, true);
                C106V.LIZIZ().getClass();
                C191880104w.LIZIZ(str, null);
            }
            C106V.LIZ.getClass();
            C106V.LIZIZ().getClass();
            C191871104n.LIZ().getClass();
            C1888960zFu.LIZ();
            if (Intrinsics.LJFF(str, "settings") && lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                C23250099c.LIZLLL(lifecycleScope, null, null, new C05ON(null), 3);
            }
        }
        C106V.LIZ.getClass();
        C106V.LIZJ().getClass();
        if (TPSCRenderManager.LJ("settings") == null) {
            C103A.LIZJ(null, str, null, null);
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final void LJIILLIIL(C19EG c19eg, AwS572S0100000_28 awS572S0100000_28) {
        C108C c108c = C108C.LIZ;
        AwS572S0100000_28 awS572S0100000_282 = new AwS572S0100000_28(awS572S0100000_28, 962);
        c108c.getClass();
        C108C.LIZ(c19eg, c19eg, awS572S0100000_282);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final void LIZ(Context context, FragmentManager fragmentManager, String str) {
        C10BK.LIZ.getClass();
        C10BK.LIZ(context, fragmentManager, str);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final void LJFF(View view, boolean z, boolean z2) {
        C10CO.LIZ(view, z, z2);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final void LJI(C19EG c19eg, RemoveOffProps removeOffProps, String str) {
        C108P.LIZ.getClass();
        C108P.LIZIZ(c19eg, removeOffProps, str);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService
    public final void LJIILL(C19EG c19eg, FragmentManager fragmentManager, C10BN c10bn) {
        C10BK.LIZ.getClass();
        C10BK.LIZIZ(c19eg, fragmentManager, "post", c10bn);
    }
}
