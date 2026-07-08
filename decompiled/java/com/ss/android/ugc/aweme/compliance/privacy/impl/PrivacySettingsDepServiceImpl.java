package com.ss.android.ugc.aweme.compliance.privacy.impl;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.AnonymousClass1031;
import X.AnonymousClass1037;
import X.C03IT;
import X.C05RV;
import X.C0TN7;
import X.C0TN8;
import X.C0XQ7;
import X.C103G;
import X.C103J;
import X.C103X;
import X.C103Y;
import X.C109K;
import X.C10AP;
import X.C10FC;
import X.C11S5;
import X.C1258004w6;
import X.C1258310iqj;
import X.C1336205Ku;
import X.C1383760m74;
import X.C1440005kM;
import X.C1518550pcT;
import X.C1668706g9;
import X.C1693106k5;
import X.C1701940uOG;
import X.C1867580yhQ;
import X.C1906580ziK;
import X.C1916980zz6;
import X.C191819102n;
import X.C191821102p;
import X.C191825102t;
import X.C191826102u;
import X.C191828102w;
import X.C191839103h;
import X.C191974108m;
import X.C19212010Ec;
import X.C2277881EDy;
import X.C291050Bax;
import X.C427660Gpo;
import X.C461720I8s;
import X.C712300Rwq;
import X.C746350TPl;
import X.C747310TTd;
import X.C896370ZEl;
import X.C897370ZIh;
import X.EnumC898380ZMe;
import X.InterfaceC897380ZIi;
import Y.ACListenerS130S0200000_28;
import Y.AObserverS230S0100000_28;
import Y.AfS181S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.ad.comment.IAdCommentService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.compliance.privacy.pauseinteraction.vm.PauseInteractionsVM;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.inbox.service.IInboxService;
import com.ss.android.ugc.aweme.internal.IPrivacyService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel;
import com.ss.android.ugc.aweme.privacy.setting.tpsc.account.ui.privateaccount.QuitBaAccountProcessor;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformTokenStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS134S0101000_28;
import kotlin.jvm.internal.AwS237S0300000_28;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacySettingsDepServiceImpl implements IPrivacySettingsDepService {
    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final void LIZ() {
        C1336205Ku.LIZ(false).getImChatService().LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final boolean LJ() {
        return C1336205Ku.LIZ(false).getImPrivacySettings().LJ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final boolean LIZJ() {
        CommentService commentService = (CommentService) PluggableExtentionKt.pluggableSpi$default(CommentService.class, false, false, false, 14, null);
        return commentService != null && commentService.LIZJ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final boolean LIZLLL() {
        IInboxService iInboxService = (IInboxService) PluggableExtentionKt.pluggableSpi$default(IInboxService.class, false, false, false, 14, null);
        return (iInboxService != null ? iInboxService.LIZJ() : null) == C05RV.BUSINESS_INBOX;
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final boolean LJFF() {
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        if (iAccountUserService != null) {
            return Intrinsics.LJFF(iAccountUserService.LJFF(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final int LJI() {
        C191819102n.LIZ.getClass();
        return C191819102n.LIZ().getFriendCount();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final boolean LJII() {
        IStoryService iStoryService = (IStoryService) PluggableExtentionKt.pluggableSpi$default(IStoryService.class, false, false, false, 14, null);
        return iStoryService != null && iStoryService.LJII();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final boolean LJIIIIZZ() {
        return C1383760m74.LIZIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final String LJIIIZ() {
        C05RV c05rvLIZJ;
        String mobValue;
        INoticeService iNoticeService = (INoticeService) PluggableExtentionKt.pluggableSpi$default(INoticeService.class, false, false, false, 14, null);
        return (iNoticeService == null || (c05rvLIZJ = iNoticeService.LIZJ()) == null || (mobValue = c05rvLIZJ.getMobValue()) == null) ? "" : mobValue;
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final boolean LJIIJJI() {
        C1258004w6.LIZ.getClass();
        return C1258004w6.LIZ() == 1 || C1258004w6.LIZ() == 3;
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final String LJIILLIIL() {
        return C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJIILJJIL().LIZIZ(C461720I8s.LIZJ());
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final void LJIJJ() {
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIIIZ(EnumC898380ZMe.ACTIVITY_STATUS_SETTING_CHANGED);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final void LJIL() {
        C746350TPl.LIZ.LJIIIIZZ().LJ(Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final void LJJ() {
        PopupManager.LIZJ(C0TN7.class);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final void LJJIFFI() {
        PopupManager.LIZJ(C1916980zz6.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.tiktok.pns.model.DMPrivacySettingTextInfo LJJIJIIJI() {
        /*
            r12 = this;
            java.lang.Class<com.ss.android.ugc.aweme.im.contacts.api.IMContactApi> r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = (com.ss.android.ugc.aweme.im.contacts.api.IMContactApi) r0
            r3 = 0
            if (r0 == 0) goto L44
            X.065q r6 = r0.LIZJ()
            if (r6 == 0) goto L44
            X.06pK r7 = X.EnumC1725606pK.COMMENT_TO_DM
            boolean r10 = r7.getAllowUsingLocalStaleValue()
            r11 = 1
            r8 = r5
            r9 = r5
            java.lang.Object r0 = r6.LJFF(r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.im.contacts.api.model.CommentToDmSetting r0 = (com.ss.android.ugc.aweme.im.contacts.api.model.CommentToDmSetting) r0
            if (r0 == 0) goto L44
            int r0 = r0.commentToDmSetting
            if (r0 != r11) goto L44
            r3 = 2131827476(0x7f111b14, float:1.9287866E38)
        L2f:
            android.content.Context r1 = X.C1383370m6R.LIZ
            r0 = 2131827477(0x7f111b15, float:1.9287868E38)
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r1 = r1.getString(r3)
            com.ss.android.ugc.tiktok.pns.model.DMPrivacySettingTextInfo r3 = new com.ss.android.ugc.tiktok.pns.model.DMPrivacySettingTextInfo
            java.lang.String r0 = "https://support.tiktok.com/en/account-and-privacy/account-privacy-settings/direct-message"
            r3.<init>(r2, r1, r0)
        L43:
            return r3
        L44:
            boolean r0 = X.C1635006ai.LIZ()
            if (r0 == 0) goto L43
            r3 = 2131827475(0x7f111b13, float:1.9287864E38)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacySettingsDepServiceImpl.LJJIJIIJI():com.ss.android.ugc.tiktok.pns.model.DMPrivacySettingTextInfo");
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final void LJJIJIL() {
        PopupManager.LIZJ(C0TN8.class);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final String getUserId() {
        C191819102n.LIZ.getClass();
        return C191819102n.LIZIZ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final boolean isLogin() {
        C191819102n.LIZ.getClass();
        return C191819102n.LIZJ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final boolean isProfileViewersEnable() {
        return C2277881EDy.LIZIZ.isProfileViewersEnable();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final Integer LIZIZ() {
        return Integer.valueOf(ComplianceServiceProvider.LJIJJLI().LIZIZ());
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final Map<String, Integer> LJIIJ() {
        ComplianceSetting complianceSettingLJIILLIIL = ComplianceServiceProvider.LJJI().LJIILLIIL();
        if (complianceSettingLJIILLIIL != null) {
            return complianceSettingLJIILLIIL.getAgeGraduationScenes();
        }
        return null;
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final Fragment LJIIL() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            return abstractC1387200mCcLIZIZ.LIZLLL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final boolean LJIILJJIL() {
        return C291050Bax.LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final void LJIILL() {
        ComplianceSetting complianceSetting;
        IComplianceSettingsService iComplianceSettingsServiceLJJI = ComplianceServiceProvider.LJJI();
        ComplianceSetting complianceSettingLJIILLIIL = ComplianceServiceProvider.LJJI().LJIILLIIL();
        if (complianceSettingLJIILLIIL == null || (complianceSetting = complianceSettingLJIILLIIL.copy(complianceSettingLJIILLIIL.blackSetting, complianceSettingLJIILLIIL.enableImpressum, complianceSettingLJIILLIIL.impressumUrl, complianceSettingLJIILLIIL.privacyPolicyUrl, complianceSettingLJIILLIIL.adPersonalitySettings, complianceSettingLJIILLIIL.notifyPrivateAccount, complianceSettingLJIILLIIL.forcePrivateAccount, complianceSettingLJIILLIIL.addTermsConsentForRegister, complianceSettingLJIILLIIL.enableTermsConsentPopup, complianceSettingLJIILLIIL.termsConsentInfo, complianceSettingLJIILLIIL.termConsentInfoNewUsers, complianceSettingLJIILLIIL.complianceEncrypt, complianceSettingLJIILLIIL.ageGateInfo, complianceSettingLJIILLIIL.logPb, complianceSettingLJIILLIIL.legalEntityChangeInfo, complianceSettingLJIILLIIL.afSharingBlock, complianceSettingLJIILLIIL.interfaceControlSettingsString, complianceSettingLJIILLIIL.deviceLimitRegisterExpiredTime, complianceSettingLJIILLIIL.privacyHighlightsForTeensLink, complianceSettingLJIILLIIL.privacyHighlightsType, 0, 0, complianceSettingLJIILLIIL.isMixedAge, complianceSettingLJIILLIIL.preferenceSettings, complianceSettingLJIILLIIL.ageVerificationAction, complianceSettingLJIILLIIL.notifyParentsWithEmail, complianceSettingLJIILLIIL.ageGraduationScenes, complianceSettingLJIILLIIL.stopAutoPlayTimesThreshold)) == null) {
            complianceSetting = new ComplianceSetting(null, 0, null, null, null, 0, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, Boolean.FALSE, null, 0L, "", 0, 0, 0, 0, null, false, false, new LinkedHashMap(), 0);
        }
        iComplianceSettingsServiceLJJI.LJJIIJ(complianceSetting);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final int LJJI() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("pns_display_number_of_friends_account", 2);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final Integer LJJIII() {
        return Integer.valueOf(ComplianceServiceProvider.LJIJJLI().LJ());
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final boolean LJJIIJ() {
        return C896370ZEl.LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final boolean LJJIIZ() {
        return C1693106k5.LIZIZ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final boolean LJJIJ() {
        return C1336205Ku.LIZJ().LIZJ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final void LJJIJIIJIL() {
        C191821102p.LIZ();
        C191825102t c191825102t = new AnonymousClass1031() { // from class: X.102t
            @Override // X.AnonymousClass1031
            public final AbstractC191843103l LIZ(final C191848103q c191848103q, C104A c104a) {
                if (!(c104a instanceof C107P) || c104a == null) {
                    return null;
                }
                String str = c104a.LIZ;
                if (Intrinsics.LJFF(str, "location_service_entrance")) {
                    final C107P c107p = (C107P) c104a;
                    return new C191962108a(c191848103q, c107p) { // from class: X.1059
                        @Override // X.AbstractC191963108b
                        public final boolean LJIJI(boolean z) {
                            C1208440hYI.LIZ.getClass();
                            return C1208440hYI.LIZIZ.LJIIJ();
                        }

                        @Override // X.C191962108a
                        public final void LJJII(int i, View view) {
                            super.LJJII(0, view);
                            C20684815ws.LJIILLIIL("enter_location_services_setting", C2097908Jt.LIZJ(new Pair("enter_from", "privacy_setting")));
                        }
                    };
                }
                if (!Intrinsics.LJFF(str, "unlogin_location_service_entrance")) {
                    return null;
                }
                final C107P c107p2 = (C107P) c104a;
                return new C191962108a(c191848103q, c107p2) { // from class: X.1039
                    @Override // X.AbstractC191963108b
                    public final boolean LJIJI(boolean z) {
                        C1207340hWW.LIZ.getClass();
                        return !C1207340hWW.LJIIJJI();
                    }

                    @Override // X.C191962108a
                    public final void LJJII(int i, View view) {
                        super.LJJII(0, view);
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", "privacy_setting");
                        C20684815ws.LJIILLIIL("enter_location_services_setting", c2344009Gk.LIZ);
                    }
                };
            }
        };
        C103G.LIZ("unlogin_location_service_entrance", c191825102t);
        C103G.LIZ("location_service_entrance", c191825102t);
        C191826102u c191826102u = new AnonymousClass1031() { // from class: X.102u
            @Override // X.AnonymousClass1031
            public final AbstractC191843103l LIZ(final C191848103q c191848103q, C104A c104a) {
                if (!(c104a instanceof C107O) || c104a == null) {
                    return null;
                }
                String str = c104a.LIZ;
                int iHashCode = str.hashCode();
                if (iHashCode != -1593374515) {
                    if (iHashCode != 1648438422) {
                        if (iHashCode != 1779684213 || !str.equals("sug_to_contacts_item")) {
                            return null;
                        }
                        final C107O c107o = (C107O) c104a;
                        return new AnonymousClass1033(c191848103q, c107o) { // from class: X.1035
                            @Override // X.AnonymousClass1033
                            public final String LJJIIJ() {
                                return "contact";
                            }

                            @Override // X.AbstractC191963108b
                            public final boolean LJIJI(boolean z) {
                                IPrivacySettingsDepService iPrivacySettingsDepService;
                                if (!z || ((iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null)) != null && iPrivacySettingsDepService.LJFF())) {
                                    return false;
                                }
                                return true;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.AbstractC191963108b
                            public final CharSequence LJIIZILJ(Context context, CharSequence charSequence) {
                                CharSequence text;
                                AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 1032);
                                C1076780e7w.LIZ.getClass();
                                C191819102n.LIZ.getClass();
                                boolean z = !TextUtils.isEmpty(C191819102n.LIZ().getBindPhone());
                                C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
                                if (!c1076010e6h.LJIJI()) {
                                    text = context.getText(2131838940);
                                    if (!z) {
                                        C444940Hca c444940Hca = new C444940Hca();
                                        c444940Hca.LIZJ = context.getString(2131838942);
                                        c444940Hca.LIZLLL(1);
                                        c444940Hca.LIZIZ = false;
                                        c444940Hca.LIZIZ(62);
                                        c444940Hca.LJIIIIZZ = new AwS429S0200000_28(context, awS572S0100000_28, 150);
                                        Spanned spannedLIZJ = C20588115hH.LIZJ(context, 2131838941, c444940Hca.LIZ(context));
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                        spannableStringBuilder.append(text);
                                        spannableStringBuilder.append((CharSequence) spannedLIZJ);
                                        return spannableStringBuilder;
                                    }
                                } else if (!C0BU9.LIZ()) {
                                    boolean zLIZJ = c1076010e6h.LJIIJ().LIZJ();
                                    C444940Hca c444940Hca2 = new C444940Hca();
                                    c444940Hca2.LIZJ = context.getString(2131847803);
                                    c444940Hca2.LIZIZ = false;
                                    c444940Hca2.LIZIZ(62);
                                    if (!z) {
                                        c444940Hca2.LIZLLL(1);
                                        c444940Hca2.LJIIIIZZ = new AwS429S0200000_28(context, awS572S0100000_28, 148);
                                    }
                                    C444940Hca c444940Hca3 = new C444940Hca();
                                    c444940Hca3.LIZJ = context.getString(2131847806);
                                    c444940Hca3.LIZIZ = false;
                                    c444940Hca3.LIZIZ(62);
                                    if (!zLIZJ) {
                                        c444940Hca3.LIZLLL(1);
                                        c444940Hca3.LJIIIIZZ = new AwS429S0200000_28(context, awS572S0100000_28, 149);
                                    }
                                    if (z && zLIZJ) {
                                        text = context.getString(2131847805);
                                    } else {
                                        text = C20588115hH.LIZJ(context, 2131847804, c444940Hca2.LIZ(context), c444940Hca3.LIZ(context));
                                    }
                                } else {
                                    boolean zIsHasEmail = C191819102n.LIZ().isHasEmail();
                                    boolean zLIZJ2 = c1076010e6h.LJIIJ().LIZJ();
                                    C444940Hca c444940Hca4 = new C444940Hca();
                                    c444940Hca4.LIZJ = context.getString(2131849430);
                                    c444940Hca4.LIZLLL(1);
                                    c444940Hca4.LIZIZ = false;
                                    c444940Hca4.LIZIZ(62);
                                    c444940Hca4.LJIIIIZZ = new AwS429S0200000_28(context, awS572S0100000_28, 146);
                                    CharSequence charSequenceLIZ = c444940Hca4.LIZ(context);
                                    C444940Hca c444940Hca5 = new C444940Hca();
                                    c444940Hca5.LIZJ = context.getString(2131849431);
                                    c444940Hca5.LIZLLL(1);
                                    c444940Hca5.LIZIZ = false;
                                    c444940Hca5.LIZIZ(62);
                                    c444940Hca5.LJIIIIZZ = new AwS429S0200000_28(context, awS572S0100000_28, 145);
                                    CharSequence charSequenceLIZ2 = c444940Hca5.LIZ(context);
                                    C444940Hca c444940Hca6 = new C444940Hca();
                                    c444940Hca6.LIZJ = context.getString(2131849432);
                                    c444940Hca6.LIZLLL(1);
                                    c444940Hca6.LIZIZ = false;
                                    c444940Hca6.LIZIZ(62);
                                    c444940Hca6.LJIIIIZZ = new AwS429S0200000_28(context, awS572S0100000_28, 147);
                                    CharSequence charSequenceLIZ3 = c444940Hca6.LIZ(context);
                                    if (!z) {
                                        if (!zIsHasEmail) {
                                            if (!zLIZJ2) {
                                                text = C20588115hH.LIZJ(context, 2131849429, charSequenceLIZ, charSequenceLIZ2, charSequenceLIZ3);
                                            } else {
                                                text = C20588115hH.LIZJ(context, 2131849433, charSequenceLIZ, charSequenceLIZ2);
                                            }
                                        } else if (!zLIZJ2) {
                                            text = C20588115hH.LIZJ(context, 2131849434, charSequenceLIZ, charSequenceLIZ3);
                                        } else {
                                            text = C20588115hH.LIZJ(context, 2131849436, charSequenceLIZ);
                                        }
                                    } else if (!zIsHasEmail) {
                                        if (!zLIZJ2) {
                                            text = C20588115hH.LIZJ(context, 2131849435, charSequenceLIZ2, charSequenceLIZ3);
                                        } else {
                                            text = C20588115hH.LIZJ(context, 2131849437, charSequenceLIZ2);
                                        }
                                    } else if (!zLIZJ2) {
                                        text = C20588115hH.LIZJ(context, 2131849438, charSequenceLIZ3);
                                    } else {
                                        text = context.getText(2131847805);
                                    }
                                }
                                if (text == null) {
                                    return context.getString(2131847805);
                                }
                                return text;
                            }

                            @Override // X.AnonymousClass1033, X.AbstractC191963108b
                            public final boolean LJIL(int i, View view) {
                                IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
                                if ((iPrivacySettingsDepService == null || !iPrivacySettingsDepService.LJIJI("privacy_settings_sug_to_others")) && !super.LJIL(i, view)) {
                                    return false;
                                }
                                return true;
                            }
                        };
                    }
                    if (!str.equals("sug_to_fb_friends_item")) {
                        return null;
                    }
                    final C107O c107o2 = (C107O) c104a;
                    return new AnonymousClass1033(c191848103q, c107o2) { // from class: X.1032
                        @Override // X.AnonymousClass1033
                        public final String LJJIIJ() {
                            return "fb";
                        }

                        @Override // X.AbstractC191963108b
                        public final boolean LJIJI(boolean z) {
                            boolean zLJFF;
                            C191819102n.LIZ.getClass();
                            boolean zIsPlatformBound = C191819102n.LJ().LJII().isPlatformBound("facebook");
                            boolean zLIZ = C1E7I.LIZ();
                            IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
                            if (iAccountUserService != null) {
                                zLJFF = Intrinsics.LJFF(iAccountUserService.LJFF(), Boolean.TRUE);
                            } else {
                                zLJFF = false;
                            }
                            if ((!zIsPlatformBound && !zLIZ) || zLJFF) {
                                return false;
                            }
                            return z;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r7v0, types: [X.1B0c] */
                        @Override // X.AbstractC191963108b
                        public final CharSequence LJIIZILJ(Context context, CharSequence charSequence) {
                            final AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 1033);
                            CharSequence text = context.getText(2131838937);
                            final Activity activityLIZ = C06MM.LIZ(context);
                            if (activityLIZ != null) {
                                C1076780e7w.LIZ.getClass();
                                final C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(283));
                                ?? r7 = new InterfaceC21614319iP() { // from class: X.1B0c
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r7v0, types: [X.0XaP] */
                                    @Override // X.InterfaceC21614319iP
                                    public final void LLLLJ(AuthResult authResult) {
                                        if (authResult.mIsSuccessful) {
                                            String str2 = authResult.mToken;
                                            long j = authResult.mExpiryDateInMillis / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                                            InterfaceC2204941BRk value = c01gwLIZIZ.getValue();
                                            Map mapLJ = C2097608Jq.LJ();
                                            final Activity activity = activityLIZ;
                                            final Function0<Unit> function0 = awS572S0100000_28;
                                            value.LJ(str2, j, mapLJ, new C0XZT() { // from class: X.0XaP
                                                @Override // X.C0XZT
                                                public final void LIZIZ(C0XZV c0xzv) {
                                                    C1389890mGx c1389890mGx = new C1389890mGx(activity);
                                                    c1389890mGx.LJIIIZ(2131838813);
                                                    c1389890mGx.LJIIJJI();
                                                }

                                                @Override // X.C0XZT
                                                public final void LIZLLL(C0XZV c0xzv) {
                                                    function0.invoke();
                                                    if (c0xzv != null) {
                                                        C0XO3 c0xo3 = c0xzv.LJIIIZ;
                                                        C191819102n.LIZ.getClass();
                                                        C191819102n.LJ().LJIIJ().LJJLL(c0xo3, null, false);
                                                    }
                                                }

                                                @Override // X.C0XZT
                                                public final void LIZJ(C0XZV c0xzv, String str3, String str4) {
                                                    if (str3 == null || str3.length() == 0) {
                                                        str3 = activity.getString(2131838813);
                                                    }
                                                    C1389890mGx c1389890mGx = new C1389890mGx(activity);
                                                    c1389890mGx.LJIIJ(str3);
                                                    c1389890mGx.LJIIJJI();
                                                }
                                            });
                                            return;
                                        }
                                        if (authResult.mErrorCause == null) {
                                        }
                                    }
                                };
                                C191819102n.LIZ.getClass();
                                boolean zIsPlatformBound = C191819102n.LJ().LJII().isPlatformBound("facebook");
                                CharSequence text2 = activityLIZ.getText(2131838937);
                                if (!zIsPlatformBound && C1E7I.LIZ()) {
                                    C444940Hca c444940Hca = new C444940Hca();
                                    c444940Hca.LIZJ = activityLIZ.getString(2131838939);
                                    c444940Hca.LIZLLL(1);
                                    c444940Hca.LIZIZ = false;
                                    c444940Hca.LIZIZ(62);
                                    c444940Hca.LJIIIIZZ = new AwS417S0200000_16(activityLIZ, (C2197841B0c) r7, 105);
                                    Spanned spannedLIZJ = C20588115hH.LIZJ(activityLIZ, 2131838938, c444940Hca.LIZ(activityLIZ));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    spannableStringBuilder.append(text2);
                                    spannableStringBuilder.append((CharSequence) " ");
                                    spannableStringBuilder.append((CharSequence) spannedLIZJ);
                                    return spannableStringBuilder;
                                }
                                if (text2 == null) {
                                    return text;
                                }
                                return text2;
                            }
                            return text;
                        }

                        @Override // X.AnonymousClass1033, X.AbstractC191963108b
                        public final boolean LJIL(int i, View view) {
                            IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
                            if ((iPrivacySettingsDepService == null || !iPrivacySettingsDepService.LJIJI("privacy_settings_sug_to_others")) && !super.LJIL(i, view)) {
                                return false;
                            }
                            return true;
                        }
                    };
                }
                if (!str.equals("sug_to_who_share_link_item")) {
                    return null;
                }
                final C107O c107o3 = (C107O) c104a;
                return new AnonymousClass1033(c191848103q, c107o3) { // from class: X.102v
                    @Override // X.AnonymousClass1033
                    public final String LJJIIJ() {
                        return "link";
                    }
                };
            }
        };
        C103G.LIZ("sug_to_contacts_item", c191826102u);
        C103G.LIZ("sug_to_fb_friends_item", c191826102u);
        C103G.LIZ("sug_to_who_share_link_item", c191826102u);
        TPSCRenderManager tPSCRenderManager = TPSCRenderManager.LIZ;
        C103X c103x = new C191839103h() { // from class: X.103X
            @Override // X.C191839103h, X.InterfaceC191837103f
            public final void LIZIZ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g) {
                C103Y c103y;
                TextView textView;
                if ((abstractC191840103i instanceof C103Y) && (c103y = (C103Y) abstractC191840103i) != null && (textView = (TextView) c191838103g.itemView.findViewById(R.id.f5y)) != null) {
                    textView.setText(c103y.LIZJ);
                }
            }
        };
        tPSCRenderManager.getClass();
        TPSCRenderManager.LJII(C103Y.class, c103x);
        TPSCRenderManager.LJII(C10AP.class, new C10FC() { // from class: X.10F9
            @Override // X.C191839103h, X.InterfaceC191837103f
            public final void LIZIZ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g) {
                C10FB c10fb;
                C419910GdJ c419910GdJ;
                C11G4 c11g4;
                C419910GdJ c419910GdJ2;
                C11G4 c11g42;
                if (!(abstractC191840103i instanceof C10AP)) {
                    return;
                }
                CharSequence charSequenceInvoke = null;
                if (abstractC191840103i instanceof C10FB) {
                    c10fb = (C10FB) abstractC191840103i;
                } else {
                    c10fb = null;
                }
                if (c10fb != null) {
                    C127K c127k = (C127K) c191838103g.itemView.findViewById(R.id.l1c);
                    Integer num = c10fb.LIZJ;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZ = iIntValue;
                        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1p);
                    } else {
                        c419910GdJ2 = null;
                    }
                    c127k.setIcon(c419910GdJ2);
                    c127k.setTitle(c10fb.LIZLLL);
                    c127k.setSubtitle(c10fb.LJ);
                    if (!(c127k.getAccessory() instanceof C11G4)) {
                        c127k.setAccessory(new C11G4(c127k.getContext(), null));
                    }
                    C127M accessory = c127k.getAccessory();
                    if ((accessory instanceof C11G4) && (c11g42 = (C11G4) accessory) != null) {
                        c11g42.LJIILJJIL(c10fb.LJFF);
                        c11g42.LJIILLIIL(c10fb.LJIIIZ);
                        if (c10fb.LJIIJ) {
                            c127k.setVariant(EnumC1216700hlc.DESTRUCTIVE);
                        }
                        c11g42.LJI(new AwS429S0200000_28(c127k, c10fb, 165));
                        c11g42.LJIILL(new ACListenerS130S0200000_28(c127k, c10fb, 68));
                    }
                    c127k.setCellEnabled(c10fb.LJIIIIZZ);
                    c127k.LJ(c10fb.LJIIL, c10fb.LJIILIIL);
                }
                C127K c127k2 = (C127K) c191838103g.itemView.findViewById(R.id.l1c);
                if (c127k2 != null) {
                    C10AP c10ap = (C10AP) abstractC191840103i;
                    Integer num2 = c10ap.LIZJ;
                    if (num2 != null) {
                        int iIntValue2 = num2.intValue();
                        c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = iIntValue2;
                        c419910GdJ.LJ = Integer.valueOf(c10ap.LJIILJJIL);
                    } else {
                        c419910GdJ = null;
                    }
                    c127k2.setIcon(c419910GdJ);
                    C426750GoL.LJIIL(c127k2.findViewById(R.id.k1_), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), null, null, null, 30);
                    TuxTextView tuxTextView = (TuxTextView) c127k2.findViewById(R.id.y3j);
                    tuxTextView.setTuxFont(101);
                    tuxTextView.setTextColorRes(R.attr.a1h);
                    C127M accessory2 = c127k2.getAccessory();
                    if ((accessory2 instanceof C11G4) && (c11g4 = (C11G4) accessory2) != null) {
                        Function0<CharSequence> function0 = c10ap.LJIILL;
                        if (function0 != null) {
                            charSequenceInvoke = function0.invoke();
                        }
                        c11g4.LJIILJJIL(charSequenceInvoke);
                    }
                }
            }
        });
        C103J c103j = new AnonymousClass1031() { // from class: X.103J
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.AnonymousClass1031
            public final AbstractC191843103l LIZ(final C191848103q c191848103q, C104A c104a) {
                final C107O c107o;
                final C107O c107o2;
                C107N c107n;
                final C107O c107o3;
                if (!Intrinsics.LJFF(c191848103q.LIZLLL, "post_process")) {
                    return null;
                }
                String str = c104a.LIZ;
                switch (str.hashCode()) {
                    case -214295804:
                        if (str.equals("post_comment_permission_item") && (c104a instanceof C107O) && (c107o3 = (C107O) c104a) != null) {
                            return new C109X(c191848103q, c107o3) { // from class: X.109a
                                @Override // X.C109X
                                public final Integer LJJ() {
                                    return Integer.valueOf(R.raw.icon_bubble_left_ltr);
                                }

                                @Override // X.C109Y
                                public final boolean LJIILL(boolean z) {
                                    if (!z) {
                                        return false;
                                    }
                                    C191821102p.LIZIZ().getClass();
                                    if (C105F.LIZ(C191880104w.LJIIL(), "comment", 0) == 3) {
                                        return false;
                                    }
                                    return true;
                                }

                                @Override // X.C109Y
                                public final CharSequence LJIIZILJ(Context context, CharSequence charSequence) {
                                    int i;
                                    if (C1383760m74.LIZIZ.LJIIIIZZ()) {
                                        i = 2131827586;
                                    } else {
                                        i = 2131826413;
                                    }
                                    return context.getString(i);
                                }

                                @Override // X.C109Y
                                public final void LJIJJ(int i, View view) {
                                    int i2;
                                    InterfaceC192004109q interfaceC192004109q = this.LLILZLL;
                                    VideoPublishEditModel videoPublishEditModelLIZIZ = null;
                                    if (interfaceC192004109q != null) {
                                        videoPublishEditModelLIZIZ = interfaceC192004109q.LIZIZ();
                                    }
                                    if ((videoPublishEditModelLIZIZ instanceof VideoPublishEditModel) && videoPublishEditModelLIZIZ != null) {
                                        HashMap<String, String> mapLIZ = C0L49.LIZ(videoPublishEditModelLIZIZ);
                                        mapLIZ.put("to_status", "disabled");
                                        C20684815ws.LJIILLIIL("disable_comment", mapLIZ);
                                    }
                                    C191821102p.LIZIZ().getClass();
                                    if (C105F.LIZ(C191880104w.LJIIL(), "comment", 0) == 3) {
                                        if (C1383760m74.LIZIZ.LJIIIIZZ()) {
                                            i2 = 2131827585;
                                        } else {
                                            i2 = 2131858160;
                                        }
                                        C191960107y.LIZIZ(i2, view);
                                    }
                                    super.LJIJJ(i, view);
                                }

                                @Override // X.C109Y
                                public final void LJIJJLI(int i, View view) {
                                    String str2;
                                    super.LJIJJLI(i, view);
                                    InterfaceC192004109q interfaceC192004109q = this.LLILZLL;
                                    VideoPublishEditModel videoPublishEditModelLIZIZ = null;
                                    if (interfaceC192004109q != null) {
                                        videoPublishEditModelLIZIZ = interfaceC192004109q.LIZIZ();
                                    }
                                    if ((videoPublishEditModelLIZIZ instanceof VideoPublishEditModel) && videoPublishEditModelLIZIZ != null) {
                                        HashMap<String, String> mapLIZ = C0L49.LIZ(videoPublishEditModelLIZIZ);
                                        if (i == 0) {
                                            str2 = "on";
                                        } else {
                                            str2 = "off";
                                        }
                                        mapLIZ.put("to_status", str2);
                                        C20684815ws.LJIILLIIL("disable_comment", mapLIZ);
                                    }
                                }
                            };
                        }
                        return null;
                    case 1031669872:
                        if (str.equals("post_visibility_options") && (c104a instanceof C107N) && (c107n = (C107N) c104a) != null) {
                            return new C10BU(c191848103q, c107n);
                        }
                        return null;
                    case 1281658997:
                        if (str.equals("post_ai_remix_permission_item") && (c104a instanceof C107O) && (c107o2 = (C107O) c104a) != null) {
                            return new C109X(c191848103q, c107o2) { // from class: X.10AB
                                public final VideoPublishEditModel LJJI() {
                                    InterfaceC192004109q interfaceC192004109q = this.LLILZLL;
                                    VideoPublishEditModel videoPublishEditModelLIZIZ = interfaceC192004109q != null ? interfaceC192004109q.LIZIZ() : null;
                                    if (videoPublishEditModelLIZIZ instanceof VideoPublishEditModel) {
                                        return videoPublishEditModelLIZIZ;
                                    }
                                    return null;
                                }

                                @Override // X.C109X
                                public final Integer LJJ() {
                                    return Integer.valueOf(R.raw.icon_ai_remix);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
                                @Override // X.C109Y
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final boolean LJIILL(boolean r10) {
                                    /*
                                        r9 = this;
                                        com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem r0 = r9.LJIJ()
                                        int r0 = r0.showType
                                        r4 = 0
                                        r2 = 1
                                        if (r0 != r2) goto Lb
                                        return r4
                                    Lb:
                                        com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.LJJI()
                                        if (r0 == 0) goto L18
                                        boolean r0 = X.C857680Xkk.LIZIZ(r0)
                                        if (r0 != r2) goto L18
                                        return r4
                                    L18:
                                        java.lang.Class<com.ss.android.ugc.aweme.services.IExternalService> r3 = com.ss.android.ugc.aweme.services.IExternalService.class
                                        r7 = 14
                                        r8 = 0
                                        r5 = r4
                                        r6 = r4
                                        java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
                                        com.ss.android.ugc.aweme.services.IExternalService r0 = (com.ss.android.ugc.aweme.services.IExternalService) r0
                                        if (r0 == 0) goto L40
                                        com.ss.android.ugc.aweme.services.video.IAVPublishService r1 = r0.publishService()
                                        if (r1 == 0) goto L40
                                        com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.LJJI()
                                        if (r0 == 0) goto L3e
                                        int r0 = r0.getVideoLength()
                                    L37:
                                        boolean r0 = r1.shouldDisableDuetOrStitch(r0)
                                        if (r0 != r2) goto L40
                                    L3d:
                                        return r4
                                    L3e:
                                        r0 = 0
                                        goto L37
                                    L40:
                                        if (r10 == 0) goto L3d
                                        r4 = 1
                                        return r4
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C10AB.LJIILL(boolean):boolean");
                                }

                                @Override // X.C109Y
                                public final CharSequence LJIILLIIL(Context context, CharSequence charSequence) {
                                    C19210410Dm.LIZ.getClass();
                                    return C19210410Dm.LIZ(context, charSequence);
                                }

                                @Override // X.C109Y
                                public final void LJIJJ(int i, View view) {
                                    IAVPublishService iAVPublishServicePublishService;
                                    IAVPublishService iAVPublishServicePublishService2;
                                    String errorHintWhenDisableDuetOrStitch;
                                    VideoPublishEditModel videoPublishEditModelLJJI = LJJI();
                                    int videoLength = 0;
                                    IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                                    if (iExternalService != null && (iAVPublishServicePublishService = iExternalService.publishService()) != null) {
                                        if (videoPublishEditModelLJJI != null) {
                                            videoLength = videoPublishEditModelLJJI.getVideoLength();
                                        }
                                        if (iAVPublishServicePublishService.shouldDisableDuetOrStitch(videoLength)) {
                                            IExternalService iExternalService2 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                                            if (iExternalService2 != null && (iAVPublishServicePublishService2 = iExternalService2.publishService()) != null && (errorHintWhenDisableDuetOrStitch = iAVPublishServicePublishService2.getErrorHintWhenDisableDuetOrStitch(6)) != null) {
                                                C191960107y.LIZJ(view, errorHintWhenDisableDuetOrStitch);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    if (videoPublishEditModelLJJI != null && C857680Xkk.LIZIZ(videoPublishEditModelLJJI)) {
                                        C191960107y.LIZIZ(2131846008, view);
                                    } else {
                                        super.LJIJJ(i, view);
                                    }
                                }

                                @Override // X.C109Y
                                public final void LJIJJLI(int i, View view) {
                                    String str2;
                                    super.LJIJJLI(i, view);
                                    VideoPublishEditModel videoPublishEditModelLJJI = LJJI();
                                    if (videoPublishEditModelLJJI != null) {
                                        boolean z = true;
                                        if (i != 1) {
                                            z = false;
                                        }
                                        String str3 = "on";
                                        if (z) {
                                            str2 = "on";
                                            str3 = "off";
                                        } else {
                                            str2 = "off";
                                        }
                                        C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().getClass();
                                        C1403840mdS.LJ(videoPublishEditModelLJJI, "video_post_page", str3, str2);
                                    }
                                }
                            };
                        }
                        return null;
                    case 2116952339:
                        if (str.equals("post_content_reuse_permission_item") && (c104a instanceof C107O) && (c107o = (C107O) c104a) != null) {
                            return new C109X(c191848103q, c107o) { // from class: X.10A9
                                public final VideoPublishEditModel LJJI() {
                                    InterfaceC192004109q interfaceC192004109q = this.LLILZLL;
                                    VideoPublishEditModel videoPublishEditModelLIZIZ = interfaceC192004109q != null ? interfaceC192004109q.LIZIZ() : null;
                                    if (videoPublishEditModelLIZIZ instanceof VideoPublishEditModel) {
                                        return videoPublishEditModelLIZIZ;
                                    }
                                    return null;
                                }

                                @Override // X.C109X
                                public final Integer LJJ() {
                                    return Integer.valueOf(R.raw.icon_playlist_2);
                                }

                                @Override // X.C109Y
                                public final boolean LJIILL(boolean z) {
                                    IAVPublishService iAVPublishServicePublishService;
                                    int videoLength;
                                    if (!z) {
                                        return false;
                                    }
                                    VideoPublishEditModel videoPublishEditModelLJJI = LJJI();
                                    if (videoPublishEditModelLJJI != null) {
                                        C548590LfN.LIZ.getClass();
                                        if (!C548590LfN.LIZIZ().LJIIJ(videoPublishEditModelLJJI.creativeModel)) {
                                            return false;
                                        }
                                    }
                                    C191880104w.LIZ.getClass();
                                    if (C105F.LIZ(C191880104w.LJIIL(), "content_reuse_permission", 0) == 5) {
                                        return false;
                                    }
                                    IPrivacyService iPrivacyService = (IPrivacyService) PluggableExtentionKt.pluggableSpi$default(IPrivacyService.class, false, false, false, 14, null);
                                    if (iPrivacyService != null && iPrivacyService.LIZJ()) {
                                        return false;
                                    }
                                    IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                                    if (iExternalService != null && (iAVPublishServicePublishService = iExternalService.publishService()) != null) {
                                        if (videoPublishEditModelLJJI != null) {
                                            videoLength = videoPublishEditModelLJJI.getVideoLength();
                                        } else {
                                            videoLength = 0;
                                        }
                                        if (iAVPublishServicePublishService.shouldDisableDuetOrStitch(videoLength)) {
                                            return false;
                                        }
                                    }
                                    if (videoPublishEditModelLJJI != null && C857680Xkk.LIZIZ(videoPublishEditModelLJJI)) {
                                        return false;
                                    }
                                    return true;
                                }

                                @Override // X.C109Y
                                public final void LJIJJ(int i, View view) {
                                    Boolean boolValueOf;
                                    IAVPublishService iAVPublishServicePublishService;
                                    String errorHintWhenDisableDuetOrStitch;
                                    IAVPublishService iAVPublishServicePublishService2;
                                    int videoLength;
                                    Integer numLIZ;
                                    VideoPublishEditModel videoPublishEditModelLJJI = LJJI();
                                    if (videoPublishEditModelLJJI != null) {
                                        C0L49.LIZIZ(videoPublishEditModelLJJI, "disabled");
                                    }
                                    if (LJIJ().resType == 1) {
                                        C191960107y.LIZIZ(2131847649, view);
                                        return;
                                    }
                                    C191821102p.LIZIZ().getClass();
                                    PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
                                    if (privacyUserSettingsV2LJIIL != null && C103K.LIZ(privacyUserSettingsV2LJIIL)) {
                                        C191960107y.LIZIZ(2131845578, view);
                                        return;
                                    }
                                    C191821102p.LIZIZ().getClass();
                                    PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL2 = C191880104w.LJIIL();
                                    if (privacyUserSettingsV2LJIIL2 != null && (numLIZ = privacyUserSettingsV2LJIIL2.LIZ("content_reuse_permission")) != null && numLIZ.intValue() == 5) {
                                        C191960107y.LIZIZ(2131845574, view);
                                        return;
                                    }
                                    IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                                    if (iExternalService != null && (iAVPublishServicePublishService2 = iExternalService.publishService()) != null) {
                                        if (videoPublishEditModelLJJI != null) {
                                            videoLength = videoPublishEditModelLJJI.getVideoLength();
                                        } else {
                                            videoLength = 0;
                                        }
                                        boolValueOf = Boolean.valueOf(iAVPublishServicePublishService2.shouldDisableDuetOrStitch(videoLength));
                                    } else {
                                        boolValueOf = null;
                                    }
                                    if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                                        IExternalService iExternalService2 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                                        if (iExternalService2 != null && (iAVPublishServicePublishService = iExternalService2.publishService()) != null && (errorHintWhenDisableDuetOrStitch = iAVPublishServicePublishService.getErrorHintWhenDisableDuetOrStitch(5)) != null) {
                                            C191960107y.LIZJ(view, errorHintWhenDisableDuetOrStitch);
                                            return;
                                        }
                                        return;
                                    }
                                    if (videoPublishEditModelLJJI != null && C857680Xkk.LIZIZ(videoPublishEditModelLJJI)) {
                                        C191960107y.LIZIZ(2131845575, view);
                                    } else {
                                        super.LJIJJ(i, view);
                                    }
                                }

                                @Override // X.C109Y
                                public final void LJIJJLI(int i, View view) {
                                    String str2;
                                    super.LJIJJLI(i, view);
                                    VideoPublishEditModel videoPublishEditModelLJJI = LJJI();
                                    if (videoPublishEditModelLJJI != null) {
                                        if (i == 1) {
                                            str2 = "on";
                                        } else {
                                            str2 = "off";
                                        }
                                        C0L49.LIZIZ(videoPublishEditModelLJJI, str2);
                                    }
                                }
                            };
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        C103G.LIZ("post_visibility_options", c103j);
        C103G.LIZ("post_comment_permission_item", c103j);
        C103G.LIZ("post_content_reuse_permission_item", c103j);
        C103G.LIZ("post_ai_remix_permission_item", c103j);
        C109K c109k = new AnonymousClass1031() { // from class: X.109K
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.AnonymousClass1031
            public final AbstractC191843103l LIZ(final C191848103q c191848103q, C104A c104a) {
                final C107O c107o;
                C107N c107n;
                final C107P c107p;
                final C107O c107o2;
                final C107O c107o3;
                String str = c104a.LIZ;
                switch (str.hashCode()) {
                    case -1002265289:
                        if (str.equals("video_privacy_content_reuse_permission_item") && (c104a instanceof C107O) && (c107o3 = (C107O) c104a) != null) {
                            return new C109O(c191848103q, c107o3) { // from class: X.109x
                                public static final /* synthetic */ int LLJILJILJ = 0;
                                public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 673));

                                @Override // X.C109N
                                public final int LJIJI() {
                                    return 2131845574;
                                }

                                @Override // X.C109N
                                public final int LJJ() {
                                    return 2131845578;
                                }

                                public final Aweme LJJIJIIJIL() {
                                    return (Aweme) this.LLJILJIL.getValue();
                                }

                                @Override // X.C109N
                                public final boolean LJIILL(boolean z) {
                                    if (z && !C10AA.LIZJ(LJJIJIIJIL()) && !C10AA.LIZ(LJJIJIIJIL())) {
                                        return true;
                                    }
                                    return false;
                                }

                                @Override // X.C109N
                                public final boolean LJIJ(boolean z) {
                                    Aweme awemeLJJIJIIJIL;
                                    if (!z || (awemeLJJIJIIJIL = LJJIJIIJIL()) == null) {
                                        return false;
                                    }
                                    Type type = C10AA.LIZ;
                                    if (C729510SjV.LJJIJIL(awemeLJJIJIIJIL) || awemeLJJIJIIJIL.getIsCommentPostVideo()) {
                                        return false;
                                    }
                                    return true;
                                }

                                @Override // X.C109N
                                public final CharSequence LJIILLIIL(Context context, CharSequence charSequence) {
                                    return new C103N(2131845572).LIZ(context);
                                }

                                @Override // X.C109N
                                public final boolean LJJIII(int i, View view) {
                                    String aid;
                                    IAVPublishService iAVPublishServicePublishService;
                                    String errorHintWhenDisableDuetOrStitch;
                                    Long lValueOf;
                                    AwemeCommerceStruct commerceVideoAuthInfo;
                                    String aid2;
                                    AwemeCommerceStruct commerceVideoAuthInfo2;
                                    C10A4 c10a4 = C10A4.LIZ;
                                    Aweme awemeLJJIJIIJIL = LJJIJIIJIL();
                                    String str2 = "";
                                    if (awemeLJJIJIIJIL == null || (aid = awemeLJJIJIIJIL.getAid()) == null) {
                                        aid = "";
                                    }
                                    c10a4.getClass();
                                    C10A4.LIZLLL(i, aid, true);
                                    if (super.LJJIII(i, view)) {
                                        return true;
                                    }
                                    PrivacySettingsRestrictionItem privacySettingsRestrictionItem = LJIL().LLILLL.get(this.LLJIJIL.LJIIIIZZ);
                                    boolean zIsPreventMissionDuetPrivate = false;
                                    if (privacySettingsRestrictionItem != null && privacySettingsRestrictionItem.resType == 13) {
                                        C11BY c11by = new C11BY();
                                        Aweme awemeLJJIJIIJIL2 = LJJIJIIJIL();
                                        String str3 = null;
                                        if (awemeLJJIJIIJIL2 != null && (commerceVideoAuthInfo2 = awemeLJJIJIIJIL2.getCommerceVideoAuthInfo()) != null) {
                                            lValueOf = Long.valueOf(commerceVideoAuthInfo2.getMissionId());
                                        } else {
                                            lValueOf = null;
                                        }
                                        Aweme awemeLJJIJIIJIL3 = LJJIJIIJIL();
                                        if (awemeLJJIJIIJIL3 != null && (aid2 = awemeLJJIJIIJIL3.getAid()) != null) {
                                            str2 = aid2;
                                        }
                                        Aweme awemeLJJIJIIJIL4 = LJJIJIIJIL();
                                        Type type = C10AA.LIZ;
                                        if (awemeLJJIJIIJIL4 != null && (commerceVideoAuthInfo = awemeLJJIJIIJIL4.getCommerceVideoAuthInfo()) != null) {
                                            zIsPreventMissionDuetPrivate = commerceVideoAuthInfo.isPreventMissionDuetPrivate();
                                        }
                                        c11by.LJIILJJIL(lValueOf, str2, zIsPreventMissionDuetPrivate, EnumC1779340wP6.VIDEO_CONTENT_REUSE);
                                        if (privacySettingsRestrictionItem != null) {
                                            str3 = privacySettingsRestrictionItem.disabledToast;
                                        }
                                        LJJIJ(2131846582, str3);
                                        return true;
                                    }
                                    Aweme awemeLJJIJIIJIL5 = LJJIJIIJIL();
                                    if (awemeLJJIJIIJIL5 != null && awemeLJJIJIIJIL5.isSubOnlyVideo()) {
                                        LJJIIZI(2131845575);
                                        return true;
                                    }
                                    Aweme awemeLJJIJIIJIL6 = LJJIJIIJIL();
                                    Type type2 = C10AA.LIZ;
                                    if (awemeLJJIJIIJIL6 != null && AwemeExtKt.isPhotoMode(awemeLJJIJIIJIL6)) {
                                        LJJIIZI(2131845574);
                                        return true;
                                    }
                                    if (!C10AA.LIZ(LJJIJIIJIL())) {
                                        return false;
                                    }
                                    IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                                    if (iExternalService != null && (iAVPublishServicePublishService = iExternalService.publishService()) != null && (errorHintWhenDisableDuetOrStitch = iAVPublishServicePublishService.getErrorHintWhenDisableDuetOrStitch(2)) != null) {
                                        bu(errorHintWhenDisableDuetOrStitch);
                                    }
                                    return true;
                                }

                                @Override // X.C109N
                                public final void LJJIIJ(int i, View view) {
                                    String aid;
                                    C10A4 c10a4 = C10A4.LIZ;
                                    Aweme awemeLJJIJIIJIL = LJJIJIIJIL();
                                    if (awemeLJJIJIIJIL == null || (aid = awemeLJJIJIIJIL.getAid()) == null) {
                                        aid = "";
                                    }
                                    c10a4.getClass();
                                    C10A4.LIZLLL(i, aid, false);
                                    super.LJJIIJ(i, view);
                                }

                                @Override // X.C109N
                                public final void LJJIIZ(int i, int i2, BaseResponse baseResponse) {
                                    String aid;
                                    int i3;
                                    int i4;
                                    int i5;
                                    super.LJJIIZ(i, i2, baseResponse);
                                    Aweme awemeLJJIJIIJIL = LJJIJIIJIL();
                                    if (awemeLJJIJIIJIL != null) {
                                        if (i2 == 1) {
                                            i5 = 0;
                                        } else {
                                            i5 = 1;
                                        }
                                        awemeLJJIJIIJIL.setDuetSetting(i5);
                                    }
                                    Aweme awemeLJJIJIIJIL2 = LJJIJIIJIL();
                                    if (awemeLJJIJIIJIL2 != null) {
                                        if (i2 == 1) {
                                            i4 = 0;
                                        } else {
                                            i4 = 1;
                                        }
                                        awemeLJJIJIIJIL2.setReactSetting(i4);
                                    }
                                    Aweme awemeLJJIJIIJIL3 = LJJIJIIJIL();
                                    if (awemeLJJIJIIJIL3 != null) {
                                        if (i2 == 1) {
                                            i3 = 0;
                                        } else {
                                            i3 = 1;
                                        }
                                        awemeLJJIJIIJIL3.setStitchSetting(i3);
                                    }
                                    IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                                    if (iAwemeService != null) {
                                        iAwemeService.LLILLL(LJJIJIIJIL());
                                    }
                                    long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                                    new C1061730djf();
                                    Pair[] pairArr = new Pair[2];
                                    Aweme awemeLJJIJIIJIL4 = LJJIJIIJIL();
                                    if (awemeLJJIJIIJIL4 != null) {
                                        aid = awemeLJJIJIIJIL4.getAid();
                                    } else {
                                        aid = null;
                                    }
                                    pairArr[0] = new Pair("aweme_id", aid);
                                    pairArr[1] = new Pair("content_reuse_permission", C2097608Jq.LJIIIIZZ(new Pair("from", LJJI().LLILLJJLI), new Pair("to", Integer.valueOf(i2))));
                                    C1548820qPI.LIZIZ(new C397901gf(jCurrentThreadTimeMillis, C1061730djf.LIZLLL(C2097908Jt.LIZJ(new Pair("changeset", Collections.singletonList(C2097608Jq.LJIIIIZZ(pairArr))))), "aweme_struct_field_change"));
                                }
                            };
                        }
                        return null;
                    case -728824367:
                        if (str.equals("video_privacy_ai_remix_permission_item") && (c104a instanceof C107O) && (c107o2 = (C107O) c104a) != null) {
                            return new C109O(c191848103q, c107o2) { // from class: X.109y
                                public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 670));

                                @Override // X.C109N
                                public final int LJJ() {
                                    return 2131846007;
                                }

                                public final Aweme LJJIJIIJIL() {
                                    return (Aweme) this.LLJILJIL.getValue();
                                }

                                @Override // X.C109N
                                public final boolean LJIILL(boolean z) {
                                    if (z && !C10AA.LIZJ(LJJIJIIJIL()) && !C10AA.LIZ(LJJIJIIJIL())) {
                                        return true;
                                    }
                                    return false;
                                }

                                @Override // X.C109N
                                public final CharSequence LJIILLIIL(Context context, CharSequence charSequence) {
                                    C19210410Dm.LIZ.getClass();
                                    return C19210410Dm.LIZ(context, charSequence);
                                }

                                @Override // X.C109N
                                public final boolean LJJIII(int i, View view) {
                                    IAVPublishService iAVPublishServicePublishService;
                                    String errorHintWhenDisableDuetOrStitch;
                                    Aweme awemeLJJIJIIJIL = LJJIJIIJIL();
                                    if (awemeLJJIJIIJIL != null && awemeLJJIJIIJIL.isSubOnlyVideo()) {
                                        LJJIIZI(2131846008);
                                        return true;
                                    }
                                    if (C10AA.LIZ(LJJIJIIJIL())) {
                                        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                                        if (iExternalService != null && (iAVPublishServicePublishService = iExternalService.publishService()) != null && (errorHintWhenDisableDuetOrStitch = iAVPublishServicePublishService.getErrorHintWhenDisableDuetOrStitch(6)) != null) {
                                            bu(errorHintWhenDisableDuetOrStitch);
                                        }
                                        return true;
                                    }
                                    return super.LJJIII(i, view);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:35:0x011e  */
                                @Override // X.C109N
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void LJJIIZ(int r20, int r21, com.ss.android.ugc.aweme.network.model.BaseResponse r22) {
                                    /*
                                        Method dump skipped, instruction units count: 292
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C192012109y.LJJIIZ(int, int, com.ss.android.ugc.aweme.network.model.BaseResponse):void");
                                }
                            };
                        }
                        return null;
                    case -341191443:
                        if (str.equals("video_privacy_target_location_entrance") && (c104a instanceof C107P) && (c107p = (C107P) c104a) != null) {
                            return new C191964108c(c191848103q, c107p) { // from class: X.109L
                                public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 674));
                                public final MutableLiveData<List<String>> LLJILJILJ = new MutableLiveData<>();

                                @Override // X.C191964108c
                                public final String LJJIJIIJIL() {
                                    int size;
                                    List<String> value = this.LLJILJILJ.getValue();
                                    return (value == null || (size = value.size()) == 0) ? "" : size != 1 ? this.LLJI.LIZ.getString(2131835570, C13LP.LJJJJZI(value), Integer.valueOf(value.size() - 1)) : (String) C13LP.LJJJJZI(value);
                                }

                                @Override // X.C109N, X.AbstractC191843103l
                                public final void LJII() {
                                    super.LJII();
                                    this.LLJILJILJ.observe(this.LLJI.LIZJ, new AObserverS230S0100000_28(this, 59));
                                    MutableLiveData<List<String>> mutableLiveData = this.LLJILJILJ;
                                    Aweme aweme = (Aweme) this.LLJILJIL.getValue();
                                    mutableLiveData.postValue(aweme != null ? aweme.getGeofencingRegions() : null);
                                }

                                @Override // X.C109N
                                public final boolean LJIJ(boolean z) {
                                    if (C0CHQ.LIZ().getAccountService().LJIILIIL() && z) {
                                        return true;
                                    }
                                    return false;
                                }

                                @Override // X.C191964108c, X.C109N
                                public final void LJJIIJ(int i, View view) {
                                    C20684815ws.onEventV3("click_target_location_entrance");
                                    super.LJJIIJ(0, view);
                                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLJI.LIZ, "//studio/targeted_region/");
                                    smartRouteBuildRoute.withParam("isEditable", CardStruct.IStatusCode.DEFAULT);
                                    C1227904rF c1227904rF = C1227904rF.LIZ;
                                    List<String> value = this.LLJILJILJ.getValue();
                                    c1227904rF.getClass();
                                    smartRouteBuildRoute.withParam("selectedRegionListString", C1227904rF.LJI(value));
                                    smartRouteBuildRoute.open();
                                }
                            };
                        }
                        return null;
                    case -23940404:
                        if (str.equals("video_privacy_visibility_options") && (c104a instanceof C107N) && (c107n = (C107N) c104a) != null) {
                            return new C10A6(c191848103q, c107n);
                        }
                        return null;
                    case 1937607208:
                        if (str.equals("video_privacy_comment_permission_item") && (c104a instanceof C107O) && (c107o = (C107O) c104a) != null) {
                            return new C109O(c191848103q, c107o) { // from class: X.109w
                                public final C01GW LLJILJIL;
                                public final C01GW LLJILJILJ;
                                public final AFwS271S0000000_28 LLJILLL;

                                public static int LJJIJIL(int i) {
                                    if (i == 1) {
                                        return 0;
                                    }
                                    if (i == 2) {
                                        return 3;
                                    }
                                    return i;
                                }

                                public final Aweme LJJIJIIJIL() {
                                    return (Aweme) this.LLJILJILJ.getValue();
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r0v2, types: [X.10A0] */
                                @Override // X.C109N, X.AbstractC191843103l
                                public final void LJII() {
                                    String aid;
                                    super.LJII();
                                    String str2 = "";
                                    this.LLJIJIL.LJFF = new C103N("");
                                    IAdCommentService iAdCommentService = (IAdCommentService) PluggableExtentionKt.pluggableSpi$default(IAdCommentService.class, false, false, false, 14, null);
                                    if (iAdCommentService != 0) {
                                        Aweme awemeLJJIJIIJIL = LJJIJIIJIL();
                                        if (awemeLJJIJIIJIL != null && (aid = awemeLJJIJIIJIL.getAid()) != null) {
                                            str2 = aid;
                                        }
                                        iAdCommentService.LIZ(str2, new InterfaceC19212710Ej() { // from class: X.10A0
                                            @Override // X.InterfaceC19212710Ej
                                            public final void call() {
                                                this.LIZ.LLJIJIL.LJFF = new C103N(2131829125);
                                                LJIIL();
                                            }
                                        });
                                    }
                                }

                                @Override // X.C109N
                                public final int LJIJI() {
                                    Aweme awemeLJJIJIIJIL = LJJIJIIJIL();
                                    return (awemeLJJIJIIJIL == null || !((Boolean) this.LLJILLL.invoke(awemeLJJIJIIJIL)).booleanValue()) ? 2131858161 : 2131827585;
                                }

                                @Override // X.C109N
                                public final C11NZ<? extends BaseResponse> LJIILJJIL(int i) {
                                    C10A1 c10a1LJFF = C191871104n.LJFF();
                                    String str2 = LJIL().LLILLJJLI;
                                    String str3 = this.LLJIJIL.LJIIIZ;
                                    Integer numValueOf = Integer.valueOf(LJJIJIL(i));
                                    c10a1LJFF.getClass();
                                    return C1888930zFr.LIZIZ(((InterfaceC192013109z) C10A1.LIZIZ.getValue()).LIZ(str2, str3, numValueOf), "/tiktok/privacy/item/settings/update/v1", C2097908Jt.LIZJ(new Pair("report_to_tea", "true")));
                                }

                                @Override // X.C109N
                                public final boolean LJIJ(boolean z) {
                                    Aweme awemeLJJIJIIJIL;
                                    Story story;
                                    Aweme awemeLJJIJIIJIL2 = LJJIJIIJIL();
                                    Type type = C10AA.LIZ;
                                    if (C729510SjV.LJJIJIL(awemeLJJIJIIJIL2) && (C281310B0v.LIZ() || ((awemeLJJIJIIJIL = LJJIJIIJIL()) != null && (story = awemeLJJIJIIJIL.getStory()) != null && StoryKt.isStoryV2(story)))) {
                                        return false;
                                    }
                                    return z;
                                }

                                {
                                    super(c191848103q, c107o);
                                    this.LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(c191848103q, 672));
                                    this.LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 671));
                                    this.LLJILLL = AFwS271S0000000_28.get$arr$(246);
                                }

                                @Override // X.C109N
                                public final CharSequence LJIIZILJ(Context context, CharSequence charSequence) {
                                    int i;
                                    Aweme awemeLJJIJIIJIL = LJJIJIIJIL();
                                    if (awemeLJJIJIIJIL != null && ((Boolean) this.LLJILLL.invoke(awemeLJJIJIIJIL)).booleanValue()) {
                                        i = 2131827582;
                                    } else {
                                        i = 2131826413;
                                    }
                                    return new C103N(i).LIZ(context);
                                }

                                @Override // X.C109N
                                public final boolean LJJIII(int i, View view) {
                                    String aid;
                                    String str2;
                                    C10A4 c10a4 = C10A4.LIZ;
                                    int iLJJIJIL = LJJIJIL(i);
                                    Aweme awemeLJJIJIIJIL = LJJIJIIJIL();
                                    if (awemeLJJIJIIJIL == null || (aid = awemeLJJIJIIJIL.getAid()) == null) {
                                        aid = "";
                                    }
                                    if (C729510SjV.LJJIJIL(LJJIJIIJIL())) {
                                        str2 = "story";
                                    } else {
                                        str2 = "post";
                                    }
                                    this.LLJILJIL.getValue().getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis() - 0;
                                    c10a4.getClass();
                                    C10A4.LIZJ(jCurrentTimeMillis, iLJJIJIL, aid, str2, true);
                                    return super.LJJIII(i, view);
                                }

                                @Override // X.C109N
                                public final void LJJIIJ(int i, View view) {
                                    String aid;
                                    String str2;
                                    if (C1017070cZd.LJJLIL(LJJIJIIJIL())) {
                                        LJJIIZI(2131824739);
                                    }
                                    C10A4 c10a4 = C10A4.LIZ;
                                    int iLJJIJIL = LJJIJIL(i);
                                    Aweme awemeLJJIJIIJIL = LJJIJIIJIL();
                                    if (awemeLJJIJIIJIL == null || (aid = awemeLJJIJIIJIL.getAid()) == null) {
                                        aid = "";
                                    }
                                    if (C729510SjV.LJJIJIL(LJJIJIIJIL())) {
                                        str2 = "story";
                                    } else {
                                        str2 = "post";
                                    }
                                    this.LLJILJIL.getValue().getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis() - 0;
                                    c10a4.getClass();
                                    C10A4.LIZJ(jCurrentTimeMillis, iLJJIJIL, aid, str2, false);
                                    super.LJJIIJ(i, view);
                                }

                                @Override // X.C109N
                                public final void LJJIIZ(int i, int i2, BaseResponse baseResponse) {
                                    String aid;
                                    String aid2;
                                    super.LJJIIZ(i, i2, baseResponse);
                                    Aweme awemeLJJIJIIJIL = LJJIJIIJIL();
                                    if (awemeLJJIJIIJIL != null) {
                                        awemeLJJIJIIJIL.setCommentSetting(LJJIJIL(i2));
                                    }
                                    String aid3 = null;
                                    IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                                    if (iAwemeService != null) {
                                        iAwemeService.LLILLL(LJJIJIIJIL());
                                    }
                                    CommentService commentService = (CommentService) PluggableExtentionKt.pluggableSpi$default(CommentService.class, false, false, false, 14, null);
                                    Integer numValueOf = null;
                                    if (commentService != null) {
                                        Aweme awemeLJJIJIIJIL2 = LJJIJIIJIL();
                                        if (awemeLJJIJIIJIL2 != null) {
                                            aid2 = awemeLJJIJIIJIL2.getAid();
                                        } else {
                                            aid2 = null;
                                        }
                                        commentService.LJJZZIII(aid2);
                                    }
                                    Aweme awemeLJJIJIIJIL3 = LJJIJIIJIL();
                                    if (awemeLJJIJIIJIL3 == null || (aid = awemeLJJIJIIJIL3.getAid()) == null) {
                                        aid = "";
                                    }
                                    C1209980ham c1209980ham = new C1209980ham(8, aid);
                                    Bundle bundle = LJIL().LLILZIL;
                                    if (bundle != null) {
                                        c1209980ham.LIZLLL = Integer.valueOf(bundle.getInt("sender_hashcode"));
                                    }
                                    c1209980ham.LIZJ = LJJIJIIJIL();
                                    C1440005kM.LIZ(c1209980ham);
                                    long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                                    new C1061730djf();
                                    Pair[] pairArr = new Pair[2];
                                    Aweme awemeLJJIJIIJIL4 = LJJIJIIJIL();
                                    if (awemeLJJIJIIJIL4 != null) {
                                        aid3 = awemeLJJIJIIJIL4.getAid();
                                    }
                                    pairArr[0] = new Pair("aweme_id", aid3);
                                    Pair[] pairArr2 = new Pair[2];
                                    Integer num = LJJI().LLILLJJLI;
                                    if (num != null) {
                                        numValueOf = Integer.valueOf(LJJIJIL(num.intValue()));
                                    }
                                    pairArr2[0] = new Pair("from", numValueOf);
                                    pairArr2[1] = new Pair("to", Integer.valueOf(LJJIJIL(i2)));
                                    pairArr[1] = new Pair("comment_status", C2097608Jq.LJIIIIZZ(pairArr2));
                                    C1548820qPI.LIZIZ(new C397901gf(jCurrentThreadTimeMillis, C1061730djf.LIZLLL(C2097908Jt.LIZJ(new Pair("changeset", Collections.singletonList(C2097608Jq.LJIIIIZZ(pairArr))))), "aweme_struct_field_change"));
                                }
                            };
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        C103G.LIZ("video_privacy_visibility_options", c109k);
        C103G.LIZ("video_privacy_target_location_entrance", c109k);
        C103G.LIZ("video_privacy_comment_permission_item", c109k);
        C103G.LIZ("video_privacy_content_reuse_permission_item", c109k);
        C103G.LIZ("video_privacy_ai_remix_permission_item", c109k);
        C191828102w c191828102w = new AnonymousClass1031() { // from class: X.102w
            @Override // X.AnonymousClass1031
            public final AbstractC191843103l LIZ(final C191848103q c191848103q, C104A c104a) {
                if (c104a instanceof C107N) {
                    String str = c104a.LIZ;
                    if (Intrinsics.LJFF(str, "pause_interaction_from_options")) {
                        final C107N c107n = (C107N) c104a;
                        return new C191977108p(c191848103q, c107n) { // from class: X.1082
                            public final PauseInteractionsVM LLJILJILJ;
                            public Integer LLJILLL;
                            public Integer LLJJ;
                            public Integer LLJJI;

                            @Override // X.AbstractC191963108b, X.AbstractC191843103l
                            public final void LJII() {
                                super.LJII();
                                this.LLJILJILJ.LL.observe(this.LLJ.LIZJ, new AObserverS230S0100000_28(this, 3));
                            }

                            @Override // X.AbstractC191963108b, X.AbstractC191843103l
                            public final void LJIIIIZZ() {
                                super.LJIIIIZZ();
                                long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                                new C1061730djf();
                                Pair[] pairArr = new Pair[2];
                                pairArr[0] = new Pair("permission_key", this.LLIZ.LLILZLL);
                                Integer numLJIJJ = LJIJJ();
                                pairArr[1] = new Pair("permission_value", Integer.valueOf(numLJIJJ != null ? numLJIJJ.intValue() : 0));
                                C1548820qPI.LIZIZ(new C397901gf(jCurrentThreadTimeMillis, C1061730djf.LIZLLL(C2097608Jq.LJIIIIZZ(pairArr)), "privacy_permission_change"));
                            }

                            @Override // X.AbstractC191963108b
                            public final C11NZ<? extends BaseResponse> LJIILJJIL(int i) {
                                C191880104w c191880104w = C191880104w.LIZ;
                                Map mapLIZJ = C2097908Jt.LIZJ(new Pair(this.LLIZ.LLILZLL, Integer.valueOf(i)));
                                c191880104w.getClass();
                                return C191880104w.LIZ(mapLIZJ);
                            }

                            {
                                super(c191848103q, c107n);
                                this.LLJILJILJ = (PauseInteractionsVM) new ViewModelProvider(c191848103q.LIZIZ).get(PauseInteractionsVM.class);
                            }

                            @Override // X.C191977108p
                            public final boolean LJJI(int i, boolean z) {
                                if (AnonymousClass1084.LIZIZ()) {
                                    return z;
                                }
                                Integer value = this.LLJILJILJ.LL.getValue();
                                if (value != null && value.intValue() == i) {
                                    return true;
                                }
                                return false;
                            }

                            @Override // X.C191977108p
                            public final void LJJIJIIJI(int i, View view) {
                                String string;
                                String str2;
                                int iIntValue;
                                this.LLJILLL = this.LLJILJILJ.LL.getValue();
                                this.LLJJ = this.LLJILJILJ.LLILLJJLI.getValue();
                                this.LLJJI = Integer.valueOf(AnonymousClass1084.LIZ());
                                if (AnonymousClass1084.LIZIZ()) {
                                    super.LJJIJIIJI(i, view);
                                    return;
                                }
                                this.LLJILJILJ.LL.setValue(Integer.valueOf(i));
                                AnonymousClass1086 anonymousClass1086 = AnonymousClass1086.LIZ;
                                Bundle bundle = this.LLJ.LJ;
                                if (bundle != null) {
                                    string = bundle.getString("enter_from");
                                } else {
                                    string = null;
                                }
                                if (i == 1) {
                                    str2 = "click_everyone_except_friends";
                                } else {
                                    str2 = "click_everyone";
                                }
                                Integer numValueOf = Integer.valueOf(i);
                                Integer value = this.LLJILJILJ.LLILLJJLI.getValue();
                                int iLIZ = AnonymousClass1084.LIZ();
                                Integer num = this.LLJILLL;
                                Integer num2 = this.LLJJ;
                                Integer num3 = this.LLJJI;
                                if (num3 != null) {
                                    iIntValue = num3.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                anonymousClass1086.getClass();
                                AnonymousClass1086.LIZJ(string, str2, numValueOf, value, iLIZ, num, num2, iIntValue);
                            }

                            @Override // X.C191977108p
                            public final void LJJIJIIJIL(int i, int i2, BaseResponse baseResponse) {
                                String string;
                                String str2;
                                int iIntValue;
                                this.LLJILJILJ.LL.postValue(Integer.valueOf(i2));
                                C191848103q c191848103q2 = this.LLJ;
                                C191958107w.LIZ().LIZJ(c191848103q2, c191848103q2.LIZ.getString(2131839156));
                                AnonymousClass1086 anonymousClass1086 = AnonymousClass1086.LIZ;
                                Bundle bundle = this.LLJ.LJ;
                                if (bundle != null) {
                                    string = bundle.getString("enter_from");
                                } else {
                                    string = null;
                                }
                                if (i2 == 1) {
                                    str2 = "click_everyone_except_friends";
                                } else {
                                    str2 = "click_everyone";
                                }
                                Integer numValueOf = Integer.valueOf(i2);
                                Integer value = this.LLJILJILJ.LLILLJJLI.getValue();
                                int iLIZ = AnonymousClass1084.LIZ();
                                Integer num = this.LLJILLL;
                                Integer num2 = this.LLJJ;
                                Integer num3 = this.LLJJI;
                                if (num3 != null) {
                                    iIntValue = num3.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                anonymousClass1086.getClass();
                                AnonymousClass1086.LIZJ(string, str2, numValueOf, value, iLIZ, num, num2, iIntValue);
                            }
                        };
                    }
                    if (Intrinsics.LJFF(str, "pause_interaction_for_options")) {
                        final C107N c107n2 = (C107N) c104a;
                        return new C191977108p(c191848103q, c107n2) { // from class: X.1083
                            public final PauseInteractionsVM LLJILJILJ;
                            public Integer LLJILLL;
                            public Integer LLJJ;
                            public Integer LLJJI;

                            @Override // X.AbstractC191963108b, X.AbstractC191843103l
                            public final void LJII() {
                                super.LJII();
                                this.LLJILJILJ.LLILLJJLI.observe(this.LLJ.LIZJ, new AObserverS230S0100000_28(this, 2));
                            }

                            @Override // X.AbstractC191963108b
                            public final C11NZ<? extends BaseResponse> LJIILJJIL(int i) {
                                C191880104w c191880104w = C191880104w.LIZ;
                                Map mapLIZJ = C2097908Jt.LIZJ(new Pair(this.LLIZ.LLILZLL, Integer.valueOf(i)));
                                c191880104w.getClass();
                                return C191880104w.LIZ(mapLIZJ);
                            }

                            {
                                super(c191848103q, c107n2);
                                this.LLJILJILJ = (PauseInteractionsVM) new ViewModelProvider(c191848103q.LIZIZ).get(PauseInteractionsVM.class);
                            }

                            @Override // X.AbstractC191963108b, X.InterfaceC191831102z
                            public final CharSequence LIZJ(Context context, CharSequence charSequence) {
                                Integer num;
                                C191880104w.LIZ.getClass();
                                PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
                                if (C105F.LIZ(privacyUserSettingsV2LJIIL, "pause_interaction_from", 0) != 0) {
                                    return null;
                                }
                                if (privacyUserSettingsV2LJIIL != null && C103K.LIZ(privacyUserSettingsV2LJIIL)) {
                                    return context.getString(2131839153);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (C105F.LIZ(privacyUserSettingsV2LJIIL, "comment", 0) == 3) {
                                    arrayList.add(2131839141);
                                }
                                if (C105F.LIZ(privacyUserSettingsV2LJIIL, "mention", 0) == 5) {
                                    arrayList.add(2131839143);
                                }
                                if (C105F.LIZ(privacyUserSettingsV2LJIIL, "content_reuse_permission", 0) == 5) {
                                    arrayList.add(2131839144);
                                }
                                if (C105F.LIZ(privacyUserSettingsV2LJIIL, "dm_setting_friends", 0) == 3) {
                                    arrayList.add(2131839142);
                                }
                                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(context.getString(((Number) it2.next()).intValue()));
                                }
                                String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                                int size = arrayList.size();
                                if (size != 1) {
                                    if (size != 2) {
                                        if (size != 3) {
                                            if (size != 4) {
                                                return null;
                                            }
                                            num = 2131839168;
                                        } else {
                                            num = 2131839139;
                                        }
                                    } else {
                                        num = 2131839138;
                                    }
                                } else {
                                    num = 2131839137;
                                }
                                if (num == null) {
                                    return null;
                                }
                                num.intValue();
                                return context.getString(num.intValue(), Arrays.copyOf(strArr, strArr.length));
                            }

                            @Override // X.C191977108p
                            public final boolean LJJI(int i, boolean z) {
                                if (AnonymousClass1084.LIZIZ()) {
                                    return z;
                                }
                                Integer value = this.LLJILJILJ.LLILLJJLI.getValue();
                                if (value != null && value.intValue() == i) {
                                    return true;
                                }
                                return false;
                            }

                            @Override // X.C191977108p
                            public final void LJJIJIIJI(int i, View view) {
                                String string;
                                String str2;
                                int iIntValue;
                                this.LLJILLL = this.LLJILJILJ.LL.getValue();
                                this.LLJJ = this.LLJILJILJ.LLILLJJLI.getValue();
                                this.LLJJI = Integer.valueOf(AnonymousClass1084.LIZ());
                                if (AnonymousClass1084.LIZIZ()) {
                                    super.LJJIJIIJI(i, view);
                                    return;
                                }
                                this.LLJILJILJ.LLILLJJLI.setValue(Integer.valueOf(i));
                                AnonymousClass1086 anonymousClass1086 = AnonymousClass1086.LIZ;
                                Bundle bundle = this.LLJ.LJ;
                                if (bundle != null) {
                                    string = bundle.getString("enter_from");
                                } else {
                                    string = null;
                                }
                                if (i != 1) {
                                    if (i != 3) {
                                        if (i != 7) {
                                            str2 = "";
                                        } else {
                                            str2 = "click_1_week";
                                        }
                                    } else {
                                        str2 = "click_3_days";
                                    }
                                } else {
                                    str2 = "click_1_day";
                                }
                                Integer value = this.LLJILJILJ.LL.getValue();
                                Integer numValueOf = Integer.valueOf(i);
                                int iLIZ = AnonymousClass1084.LIZ();
                                Integer num = this.LLJILLL;
                                Integer num2 = this.LLJJ;
                                Integer num3 = this.LLJJI;
                                if (num3 != null) {
                                    iIntValue = num3.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                anonymousClass1086.getClass();
                                AnonymousClass1086.LIZJ(string, str2, value, numValueOf, iLIZ, num, num2, iIntValue);
                            }

                            @Override // X.C191977108p
                            public final void LJJIJIIJIL(int i, int i2, BaseResponse baseResponse) {
                                String string;
                                String str2;
                                int iIntValue;
                                this.LLJILJILJ.LLILLJJLI.postValue(Integer.valueOf(i2));
                                C191848103q c191848103q2 = this.LLJ;
                                C191958107w.LIZ().LIZJ(c191848103q2, c191848103q2.LIZ.getString(2131839156));
                                AnonymousClass1086 anonymousClass1086 = AnonymousClass1086.LIZ;
                                Bundle bundle = this.LLJ.LJ;
                                if (bundle != null) {
                                    string = bundle.getString("enter_from");
                                } else {
                                    string = null;
                                }
                                if (i2 != 1) {
                                    if (i2 != 3) {
                                        if (i2 != 7) {
                                            str2 = "";
                                        } else {
                                            str2 = "click_1_week";
                                        }
                                    } else {
                                        str2 = "click_3_days";
                                    }
                                } else {
                                    str2 = "click_1_day";
                                }
                                Integer value = this.LLJILJILJ.LL.getValue();
                                Integer numValueOf = Integer.valueOf(i2);
                                int iLIZ = AnonymousClass1084.LIZ();
                                Integer num = this.LLJILLL;
                                Integer num2 = this.LLJJ;
                                Integer num3 = this.LLJJI;
                                if (num3 != null) {
                                    iIntValue = num3.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                anonymousClass1086.getClass();
                                AnonymousClass1086.LIZJ(string, str2, value, numValueOf, iLIZ, num, num2, iIntValue);
                            }
                        };
                    }
                    return null;
                }
                return null;
            }
        };
        C103G.LIZ("pause_interaction_from_options", c191828102w);
        C103G.LIZ("pause_interaction_for_options", c191828102w);
        AnonymousClass1037 anonymousClass1037 = new AnonymousClass1031() { // from class: X.1037
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.AnonymousClass1031
            public final AbstractC191843103l LIZ(final C191848103q c191848103q, C104A c104a) {
                if (c104a instanceof C107O) {
                    String str = c104a.LIZ;
                    switch (str.hashCode()) {
                        case -1652371313:
                            if (str.equals("sync_mlbb_item")) {
                                final C107O c107o = (C107O) c104a;
                                return new C109D(c191848103q, c107o) { // from class: X.105c
                                    public final C191848103q LLILZLL;

                                    @Override // X.C109D, X.AbstractC191843103l
                                    public final void LJII() {
                                        super.LJII();
                                        IFindCtxSettingService iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null);
                                        if (iFindCtxSettingService != null) {
                                            iFindCtxSettingService.LJFF(this.LLILZLL.LIZJ, new AwS607S0100000_28(this, 286));
                                        }
                                    }

                                    @Override // X.C109D
                                    public final boolean LJIILIIL(boolean z) {
                                        int i;
                                        boolean zLJ = C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.MLBB).LJ();
                                        if (zLJ != z) {
                                            MutableLiveData<Integer> mutableLiveData = LJIJI().LL;
                                            if (zLJ) {
                                                i = 1;
                                            } else {
                                                i = 2;
                                            }
                                            mutableLiveData.postValue(Integer.valueOf(i));
                                        }
                                        return zLJ;
                                    }

                                    @Override // X.C109D
                                    public final boolean LJIIZILJ(boolean z) {
                                        IFindCtxSettingService iFindCtxSettingService;
                                        if (!C0XQ7.LJFF().isLogin() || (iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null)) == null || !iFindCtxSettingService.LJIILLIIL() || !z) {
                                            return false;
                                        }
                                        return true;
                                    }

                                    {
                                        super(C105K.LIZ(c107o.LIZ, new AwS607S0100000_28(c107o, 285)), c191848103q);
                                        this.LLILZLL = c191848103q;
                                    }

                                    @Override // X.C109D
                                    public final boolean LJIJJ(int i, View view) {
                                        boolean z;
                                        IFindCtxSettingService iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null);
                                        if (iFindCtxSettingService != null) {
                                            C191848103q c191848103q2 = this.LLILZLL;
                                            Context context = c191848103q2.LIZ;
                                            LifecycleOwner lifecycleOwner = c191848103q2.LIZJ;
                                            if (LJIJ() == 1) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            iFindCtxSettingService.LJIIJ(context, lifecycleOwner, z);
                                        }
                                        return true;
                                    }
                                };
                            }
                            return null;
                        case -167632049:
                            if (str.equals("message_read_status_item")) {
                                return new C191981108t(c191848103q, (C107O) c104a) { // from class: X.0y0F
                                    @Override // X.AbstractC191963108b
                                    public final CharSequence LJIIZILJ(Context context, CharSequence charSequence) {
                                        String string = context.getString(2131848790);
                                        String string2 = context.getString(2131848791);
                                        int iIntValue = 0;
                                        String strJ4 = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{string2}, 1));
                                        SpannableString spannableString = new SpannableString(strJ4);
                                        int iLJJJ = a0.LJJJ(strJ4, string2, 0, false, 6);
                                        int length = string2.length() + iLJJJ;
                                        C786410Ut5.p2(spannableString, new C521550Kcr(context, 8), iLJJJ, length, 33);
                                        C786410Ut5.p2(spannableString, new C444920HcY(52, false), iLJJJ, length, 33);
                                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context);
                                        if (numLIZJ != null) {
                                            iIntValue = numLIZJ.intValue();
                                        }
                                        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), iLJJJ, length, 33);
                                        return spannableString;
                                    }

                                    @Override // X.C191981108t
                                    public final void LJJIII(int i, int i2, BaseResponse baseResponse) {
                                        String str2;
                                        C1840820y0G.LIZ.getClass();
                                        if (i2 != 1) {
                                            if (i2 != 2) {
                                                str2 = "";
                                            } else {
                                                str2 = "off";
                                            }
                                        } else {
                                            str2 = "on";
                                        }
                                        C2344009Gk c2344009Gk = new C2344009Gk();
                                        c2344009Gk.LJIIIIZZ("enter_from", "privacy_and_safety_settings");
                                        c2344009Gk.LJIIIIZZ("to_status", str2);
                                        c2344009Gk.LJIIIIZZ("target", "read_receipt");
                                        if (!Intrinsics.LJFF("read_receipt", "business_allowance")) {
                                            c2344009Gk.LJFF("action_source", "user");
                                        }
                                        C20684815ws.LJIILLIIL("change_message_preference_permission", c2344009Gk.LIZ);
                                        C054G c054gLIZ = C2296808zG.LIZ(new C639060P4u(CoroutineExceptionHandler.LJJLIL, 15).plus(C2296908zH.LIZ()));
                                        C11NZ.LJIJJLI(new C1769906wT(c054gLIZ, 3)).LJJIIZ(new C1339290kxL(c054gLIZ, 1)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.00Nf
                                            @Override // X.C09JN
                                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                                C1C7U.LIZ("ReadReceiptHelper@c6f4.acknowledgeNoticeRead$3");
                                                C1C7U.LIZIZ("ReadReceiptHelper@c6f4.acknowledgeNoticeRead$3");
                                            }
                                        }, new C09JN() { // from class: X.00Ng
                                            @Override // X.C09JN
                                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                                C1C7U.LIZ("ReadReceiptHelper@c6f4.acknowledgeNoticeRead$4");
                                                C1C7U.LIZIZ("ReadReceiptHelper@c6f4.acknowledgeNoticeRead$4");
                                            }
                                        });
                                    }
                                };
                            }
                            return null;
                        case 362182265:
                            if (str.equals("precise_location_item")) {
                                final C107O c107o2 = (C107O) c104a;
                                return new C109D(c191848103q, c107o2) { // from class: X.105G
                                    public final C191848103q LLILZLL;
                                    public CharSequence LLIZ;
                                    public CharSequence LLIZLLLIL;
                                    public boolean LLJ;

                                    @Override // X.AbstractC191843103l
                                    public final void LJIIIZ() {
                                        if (LJIIZILJ(true)) {
                                            LJIJJLI();
                                        }
                                    }

                                    public final void LJIJJLI() {
                                        CharSequence charSequenceLJIJJ;
                                        CharSequence charSequenceLJJI;
                                        boolean z;
                                        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                                        if (iLocationBaseServiceForMT != null) {
                                            iLocationBaseServiceForMT.LJJIJIIJIL(this.LLILZLL.LIZ);
                                        }
                                        ILocationBaseServiceForMT iLocationBaseServiceForMT2 = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                                        if (iLocationBaseServiceForMT2 == null || (charSequenceLJIJJ = iLocationBaseServiceForMT2.LJIJJ(this.LLILZLL.LIZ)) == null) {
                                            charSequenceLJIJJ = this.LLIZ;
                                        }
                                        ILocationBaseServiceForMT iLocationBaseServiceForMT3 = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                                        if (iLocationBaseServiceForMT3 == null || (charSequenceLJJI = iLocationBaseServiceForMT3.LJJI(this.LLILZLL.LIZ)) == null) {
                                            charSequenceLJJI = "";
                                        }
                                        ILocationBaseServiceForMT iLocationBaseServiceForMT4 = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                                        boolean zLJI = iLocationBaseServiceForMT4 != null ? iLocationBaseServiceForMT4.LJI(this.LLILZLL.LIZ) : false;
                                        ILocationBaseServiceForMT iLocationBaseServiceForMT5 = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                                        boolean z2 = true;
                                        int i = iLocationBaseServiceForMT5 != null ? iLocationBaseServiceForMT5.LJFF(this.LLILZLL.LIZ) : false ? 1 : 2;
                                        if (Intrinsics.LJFF(this.LLIZ, charSequenceLJIJJ)) {
                                            z = false;
                                        } else {
                                            this.LLIZ = charSequenceLJIJJ;
                                            z = true;
                                        }
                                        if (this.LLJ != zLJI) {
                                            this.LLJ = zLJI;
                                            z = true;
                                        }
                                        if (Intrinsics.LJFF(this.LLIZLLLIL, charSequenceLJJI)) {
                                            z2 = z;
                                        } else {
                                            this.LLIZLLLIL = charSequenceLJJI;
                                        }
                                        if (i != LJIJ()) {
                                            LJIJI().LL.postValue(Integer.valueOf(i));
                                        } else if (z2) {
                                            LJIIL();
                                        }
                                    }

                                    @Override // X.C109D
                                    public final boolean LJIILJJIL(boolean z) {
                                        return this.LLJ;
                                    }

                                    @Override // X.C109D
                                    public final boolean LJIIZILJ(boolean z) {
                                        C1208440hYI.LIZ.getClass();
                                        if (C1208440hYI.LIZIZ.LJIIJ() && !C294550Bgb.LIZ()) {
                                            LocationServicesManager locationServicesManager = LocationServicesManager.LIZ;
                                            Context context = this.LLILZLL.LIZ;
                                            locationServicesManager.getClass();
                                            if (LocationServicesManager.LJIIIZ(context)) {
                                                return true;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }

                                    {
                                        super(C105K.LIZ(c107o2.LIZ, new AwS607S0100000_28(c107o2, 295)), c191848103q);
                                        this.LLILZLL = c191848103q;
                                    }

                                    @Override // X.C109D
                                    public final CharSequence LJIILL(Context context, CharSequence charSequence) {
                                        CharSequence charSequence2 = this.LLIZLLLIL;
                                        if (charSequence2 == null) {
                                            return "";
                                        }
                                        return charSequence2;
                                    }

                                    @Override // X.C109D
                                    public final CharSequence LJIILLIIL(Context context, CharSequence charSequence) {
                                        CharSequence charSequence2 = this.LLIZ;
                                        if (charSequence2 != null) {
                                            return charSequence2;
                                        }
                                        return charSequence;
                                    }

                                    @Override // X.C109D
                                    public final boolean LJIJJ(int i, View view) {
                                        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                                        if (iLocationBaseServiceForMT != null) {
                                            iLocationBaseServiceForMT.LJJIIZI(view);
                                        }
                                        LJIJJLI();
                                        return true;
                                    }
                                };
                            }
                            return null;
                        case 1172623579:
                            if (str.equals("sync_contacts_item")) {
                                final C107O c107o3 = (C107O) c104a;
                                return new C109D(c191848103q, c107o3) { // from class: X.105I
                                    public final C191848103q LLILZLL;

                                    @Override // X.C109D, X.AbstractC191843103l
                                    public final void LJII() {
                                        super.LJII();
                                        IFindCtxSettingService iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null);
                                        if (iFindCtxSettingService != null) {
                                            iFindCtxSettingService.LIZJ(this.LLILZLL.LIZJ, new AwS607S0100000_28(this, 282));
                                        }
                                    }

                                    @Override // X.C109D
                                    public final boolean LJIILIIL(boolean z) {
                                        int i;
                                        boolean zLIZJ = C1076010e6h.LIZJ.LJIIJ().LIZJ();
                                        if (zLIZJ != z) {
                                            MutableLiveData<Integer> mutableLiveData = LJIJI().LL;
                                            if (zLIZJ) {
                                                i = 1;
                                            } else {
                                                i = 2;
                                            }
                                            mutableLiveData.postValue(Integer.valueOf(i));
                                        }
                                        return zLIZJ;
                                    }

                                    @Override // X.C109D
                                    public final boolean LJIIZILJ(boolean z) {
                                        if (C0XQ7.LJFF().isLogin() && z) {
                                            return true;
                                        }
                                        return false;
                                    }

                                    {
                                        super(C105K.LIZ(c107o3.LIZ, new AwS607S0100000_28(c107o3, 281)), c191848103q);
                                        this.LLILZLL = c191848103q;
                                    }

                                    @Override // X.C109D
                                    public final CharSequence LJIILL(Context context, CharSequence charSequence) {
                                        CharSequence charSequenceLIZLLL;
                                        IFindCtxSettingService iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null);
                                        if (iFindCtxSettingService != null && (charSequenceLIZLLL = iFindCtxSettingService.LIZLLL(context)) != null) {
                                            return charSequenceLIZLLL;
                                        }
                                        return charSequence;
                                    }

                                    @Override // X.C109D
                                    public final boolean LJIJJ(int i, View view) {
                                        boolean z;
                                        IFindCtxSettingService iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null);
                                        if (iFindCtxSettingService != null) {
                                            C191848103q c191848103q2 = this.LLILZLL;
                                            Context context = c191848103q2.LIZ;
                                            LifecycleOwner lifecycleOwner = c191848103q2.LIZJ;
                                            if (LJIJ() == 1) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            iFindCtxSettingService.LJIIIZ(context, lifecycleOwner, z);
                                        }
                                        return true;
                                    }
                                };
                            }
                            return null;
                        case 1279403592:
                            if (str.equals("sync_facebook_item")) {
                                final C107O c107o4 = (C107O) c104a;
                                return new C109D(c191848103q, c107o4) { // from class: X.105J
                                    public final C191848103q LLILZLL;

                                    @Override // X.C109D, X.AbstractC191843103l
                                    public final void LJII() {
                                        super.LJII();
                                        IFindCtxSettingService iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null);
                                        if (iFindCtxSettingService != null) {
                                            iFindCtxSettingService.LJIIL(this.LLILZLL.LIZJ, new AwS607S0100000_28(this, 284));
                                        }
                                    }

                                    @Override // X.C109D
                                    public final boolean LJIILIIL(boolean z) {
                                        int i;
                                        boolean zLIZJ = C1076010e6h.LIZJ.LJII().LIZJ();
                                        if (zLIZJ != z) {
                                            MutableLiveData<Integer> mutableLiveData = LJIJI().LL;
                                            if (zLIZJ) {
                                                i = 1;
                                            } else {
                                                i = 2;
                                            }
                                            mutableLiveData.postValue(Integer.valueOf(i));
                                        }
                                        return zLIZJ;
                                    }

                                    @Override // X.C109D
                                    public final boolean LJIIZILJ(boolean z) {
                                        if (C0XQ7.LJFF().isLogin() && z) {
                                            return true;
                                        }
                                        return false;
                                    }

                                    {
                                        super(C105K.LIZ(c107o4.LIZ, new AwS607S0100000_28(c107o4, 283)), c191848103q);
                                        this.LLILZLL = c191848103q;
                                    }

                                    @Override // X.C109D
                                    public final boolean LJIJJ(int i, View view) {
                                        boolean z;
                                        IFindCtxSettingService iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null);
                                        if (iFindCtxSettingService != null) {
                                            C191848103q c191848103q2 = this.LLILZLL;
                                            Context context = c191848103q2.LIZ;
                                            LifecycleOwner lifecycleOwner = c191848103q2.LIZJ;
                                            if (LJIJ() == 1) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            iFindCtxSettingService.LJII(context, lifecycleOwner, z);
                                        }
                                        return true;
                                    }
                                };
                            }
                            return null;
                        default:
                            return null;
                    }
                }
                if (c104a instanceof C107P) {
                    String str2 = c104a.LIZ;
                    switch (str2.hashCode()) {
                        case -1858369970:
                            if (str2.equals("to_others_entrance")) {
                                return new C191962108a(c191848103q, (C107P) c104a) { // from class: X.1036
                                    @Override // X.AbstractC191963108b
                                    public final boolean LJIJI(boolean z) {
                                        IPrivacySettingsDepService iPrivacySettingsDepService;
                                        if (!z || ((iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null)) != null && iPrivacySettingsDepService.LJFF())) {
                                            return false;
                                        }
                                        return true;
                                    }

                                    @Override // X.C191962108a
                                    public final void LJJII(int i, View view) {
                                        super.LJJII(0, view);
                                        C1076800e7y.LIZ.getClass();
                                        C20684815ws.LJIILLIIL("click_suggest_accounts", C2097908Jt.LIZJ(new Pair("enter_from", "privacy_and_safety_settings")));
                                    }
                                };
                            }
                            return null;
                        case -1467645540:
                            if (str2.equals("grant_contacts_item")) {
                                final C107P c107p = (C107P) c104a;
                                return new C104X(c191848103q, c107p) { // from class: X.103O
                                    @Override // X.C104X
                                    public final boolean LJIIZILJ(boolean z) {
                                        return false;
                                    }

                                    {
                                        C104Z c104zLIZ = C104Y.LIZ(c107p.LIZ, new AwS607S0100000_28(c107p, 277));
                                    }
                                };
                            }
                            return null;
                        case -438999654:
                            if (str2.equals("dm_filter_keywords_entrance")) {
                                final C107P c107p2 = (C107P) c104a;
                                return new C191962108a(c191848103q, c107p2) { // from class: X.1038
                                    @Override // X.C191962108a
                                    public final void LJJII(int i, View view) {
                                        SmartRouter.buildRoute(view.getContext(), "aweme://chatcontrol/setting/keywords").open();
                                    }
                                };
                            }
                            return null;
                        case -292835926:
                            if (str2.equals("remove_sync_mlbb_item")) {
                                return new C191891105h(c191848103q, (C107P) c104a);
                            }
                            return null;
                        case -21780362:
                            if (str2.equals("remove_sync_contacts_item")) {
                                return new C191904105u(c191848103q, (C107P) c104a);
                            }
                            return null;
                        case 84999651:
                            if (str2.equals("remove_sync_facebook_item")) {
                                return new C191905105v(c191848103q, (C107P) c104a);
                            }
                            return null;
                        case 1876733385:
                            if (str2.equals("delete_location_item")) {
                                return new AnonymousClass1058(c191848103q, (C107P) c104a);
                            }
                            return null;
                        case 1882045566:
                            if (str2.equals("sync_contacts_entrance")) {
                                final C107P c107p3 = (C107P) c104a;
                                return new C191962108a(c191848103q, c107p3) { // from class: X.105d
                                    @Override // X.AbstractC191963108b
                                    public final boolean LJIJI(boolean z) {
                                        if (!z) {
                                            return false;
                                        }
                                        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
                                        if (iAccountUserService != null && Intrinsics.LJFF(iAccountUserService.LJFF(), Boolean.TRUE)) {
                                            return false;
                                        }
                                        return true;
                                    }

                                    @Override // X.AbstractC191963108b
                                    public final CharSequence LJIJ(Context context, CharSequence charSequence) {
                                        int i;
                                        Integer numLIZLLL = C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.MLBB).LIZLLL();
                                        if (numLIZLLL != null && numLIZLLL.intValue() != SocialPlatformTokenStatus.STATUS_UNKNOWN.getValue()) {
                                            numLIZLLL.intValue();
                                            i = 2131837430;
                                        } else if (C1E7I.LIZ()) {
                                            i = 2131822137;
                                        } else {
                                            i = 2131849485;
                                        }
                                        return context.getString(i);
                                    }
                                };
                            }
                            return null;
                        default:
                            return null;
                    }
                }
                if (!(c104a instanceof C107N) || !Intrinsics.LJFF(c104a.LIZ, "location_options")) {
                    return null;
                }
                return new C105H(c191848103q, (C107N) c104a);
            }
        };
        C103G.LIZ("sync_contacts_entrance", anonymousClass1037);
        C103G.LIZ("dm_filter_keywords_entrance", anonymousClass1037);
        C103G.LIZ("message_read_status_item", anonymousClass1037);
        C103G.LIZ("to_others_entrance", anonymousClass1037);
        C103G.LIZ("sync_contacts_item", anonymousClass1037);
        C103G.LIZ("grant_contacts_item", anonymousClass1037);
        C103G.LIZ("remove_sync_contacts_item", anonymousClass1037);
        C103G.LIZ("sync_facebook_item", anonymousClass1037);
        C103G.LIZ("remove_sync_facebook_item", anonymousClass1037);
        C103G.LIZ("sync_mlbb_item", anonymousClass1037);
        C103G.LIZ("remove_sync_mlbb_item", anonymousClass1037);
        C103G.LIZ("location_options", anonymousClass1037);
        C103G.LIZ("delete_location_item", anonymousClass1037);
        C103G.LIZ("precise_location_item", anonymousClass1037);
        TPSCRenderManager.LJI(C191974108m.class, new AnonymousClass1031() { // from class: X.107z
            @Override // X.AnonymousClass1031
            public final AbstractC191843103l LIZ(final C191848103q c191848103q, C104A c104a) {
                if (c104a instanceof C191974108m) {
                    final C191989109b c191989109b = ((C191974108m) c104a).LIZLLL;
                    return new C109V(c191848103q, c191989109b) { // from class: X.108z
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.C109V, com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.ValuedAccountPrivacySettingItemModel, X.InterfaceC192001109n
                        public final void LIZ(int i, Throwable th) {
                            C632200Oqw c632200Oqw;
                            Integer numValueOf;
                            int i2;
                            Context context = this.LLJILJILJ.LIZ;
                            if ((th instanceof C632200Oqw) && (c632200Oqw = (C632200Oqw) th) != null && (numValueOf = Integer.valueOf(c632200Oqw.getErrorCode())) != null) {
                                if (numValueOf.intValue() == -5002) {
                                    C1397580mTM c1397580mTM = new C1397580mTM(context);
                                    c1397580mTM.LJFF(2131824516);
                                    c1397580mTM.LIZ(2131824528);
                                    C985403tE.LIZ(c1397580mTM, new AwS134S0101000_28(i, this, 22));
                                    c1397580mTM.LJII = false;
                                    new C1397510mTF(c1397580mTM).LIZLLL();
                                    return;
                                }
                                if (numValueOf.intValue() == -5007) {
                                    C1397580mTM c1397580mTM2 = new C1397580mTM(context);
                                    c1397580mTM2.LIZIZ(((C632200Oqw) th).getErrorMsg());
                                    C985403tE.LIZ(c1397580mTM2, AFwS271S0000000_28.get$arr$(302));
                                    c1397580mTM2.LJII = false;
                                    new C1397510mTF(c1397580mTM2).LIZLLL();
                                    return;
                                }
                                if (numValueOf != null) {
                                    if (numValueOf.intValue() == 3026002) {
                                        C1397580mTM c1397580mTM3 = new C1397580mTM(context);
                                        c1397580mTM3.LJFF(2131827269);
                                        C444940Hca c444940Hca = new C444940Hca();
                                        c444940Hca.LIZJ(2131827268);
                                        c444940Hca.LIZLLL(2);
                                        c444940Hca.LIZIZ = false;
                                        c444940Hca.LIZIZ(42);
                                        c444940Hca.LJIIIIZZ = new AwS572S0100000_28(context, 802);
                                        c1397580mTM3.LIZIZ(C20588115hH.LIZJ(context, 2131827267, c444940Hca.LIZ(context)));
                                        C985403tE.LIZ(c1397580mTM3, AFwS271S0000000_28.get$arr$(303));
                                        new C1397510mTF(c1397580mTM3).LIZLLL();
                                        return;
                                    }
                                    if (numValueOf.intValue() == 3026006) {
                                        if (i == 1) {
                                            i2 = 2131830673;
                                        } else {
                                            i2 = 2131830674;
                                        }
                                        String string = context.getString(i2);
                                        C1397580mTM c1397580mTM4 = new C1397580mTM(context);
                                        c1397580mTM4.LJI(context.getString(2131830675, string));
                                        c1397580mTM4.LIZIZ(context.getString(2131830672, string));
                                        C985403tE.LIZ(c1397580mTM4, new AwS134S0101000_28(i, this, 23));
                                        c1397580mTM4.LJII = false;
                                        new C1397510mTF(c1397580mTM4).LIZLLL();
                                        AnonymousClass1090.LIZ.getClass();
                                        C2344009Gk c2344009Gk = new C2344009Gk();
                                        c2344009Gk.LJIIIIZZ("enter_from", "privacy_and_safety_settings");
                                        C20684815ws.LJIILLIIL("show_live_change_privacy_account_popup", c2344009Gk.LIZ);
                                        return;
                                    }
                                }
                            }
                            super.LIZ(i, th);
                        }

                        @Override // X.C109V, com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.ValuedAccountPrivacySettingItemModel, X.InterfaceC192001109n
                        public final void LIZIZ(int i, BaseResponse baseResponse) {
                            super.LIZIZ(i, baseResponse);
                            IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
                            if (iPrivacySettingsDepService != null) {
                                iPrivacySettingsDepService.LJIJJLI(i);
                            }
                        }

                        @Override // X.C109T
                        public final boolean LJIIZILJ(int i, View view) {
                            IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
                            if (iPrivacySettingsDepService != null && iPrivacySettingsDepService.LJJIIZI(i, view)) {
                                return true;
                            }
                            return super.LJIIZILJ(i, view);
                        }
                    };
                }
                return null;
            }
        });
        TPSCRenderManager.LIZ("pause_interactions", AFwS217S0000000_28.get$arr$(613));
        C1867580yhQ.LIZ("sug_to_others", AFwS217S0000000_28.get$arr$(614));
        C1867580yhQ.LIZ("contacts_and_location", AFwS206S0000000_18.get$arr$(711));
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final void LJIILIIL(String str) {
        ComplianceSetting complianceSettingLJIILLIIL = ComplianceServiceProvider.LJJI().LJIILLIIL();
        if (complianceSettingLJIILLIIL == null) {
            complianceSettingLJIILLIIL = new ComplianceSetting(null, 0, null, null, null, 0, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, Boolean.FALSE, null, 0L, "", 0, 0, 0, 0, null, false, false, new LinkedHashMap(), 0);
        }
        Map<String, Integer> ageGraduationScenes = complianceSettingLJIILLIIL.getAgeGraduationScenes();
        ageGraduationScenes.put(str, 0);
        ComplianceServiceProvider.LJJI().LJJIIJ(complianceSettingLJIILLIIL.copy(complianceSettingLJIILLIIL.blackSetting, complianceSettingLJIILLIIL.enableImpressum, complianceSettingLJIILLIIL.impressumUrl, complianceSettingLJIILLIIL.privacyPolicyUrl, complianceSettingLJIILLIIL.adPersonalitySettings, complianceSettingLJIILLIIL.notifyPrivateAccount, complianceSettingLJIILLIIL.forcePrivateAccount, complianceSettingLJIILLIIL.addTermsConsentForRegister, complianceSettingLJIILLIIL.enableTermsConsentPopup, complianceSettingLJIILLIIL.termsConsentInfo, complianceSettingLJIILLIIL.termConsentInfoNewUsers, complianceSettingLJIILLIIL.complianceEncrypt, complianceSettingLJIILLIIL.ageGateInfo, complianceSettingLJIILLIIL.logPb, complianceSettingLJIILLIIL.legalEntityChangeInfo, complianceSettingLJIILLIIL.afSharingBlock, complianceSettingLJIILLIIL.interfaceControlSettingsString, complianceSettingLJIILLIIL.deviceLimitRegisterExpiredTime, complianceSettingLJIILLIIL.privacyHighlightsForTeensLink, complianceSettingLJIILLIIL.privacyHighlightsType, complianceSettingLJIILLIIL.privateAccountPrompt, complianceSettingLJIILLIIL.privateAccountPromptType, complianceSettingLJIILLIIL.isMixedAge, complianceSettingLJIILLIIL.preferenceSettings, complianceSettingLJIILLIIL.ageVerificationAction, complianceSettingLJIILLIIL.notifyParentsWithEmail, ageGraduationScenes, complianceSettingLJIILLIIL.stopAutoPlayTimesThreshold));
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final void LJIIZILJ(int i) {
        C746350TPl.LIZ.LJIIJJI().LJ(Integer.valueOf(i));
        C1440005kM.LIZ(new C1258310iqj());
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final C427660Gpo LJIJ(Context context) {
        User curUser;
        UrlModel avatarMedium;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        AttributeSet attributeSet = null;
        if (iAccountUserServiceLJFF == null || (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) == null || ((avatarMedium = curUser.getAvatarMedium()) == null && (avatarMedium = curUser.getAvatarThumb()) == null && (curUser == null || (avatarMedium = curUser.getAvatarLarger()) == null))) {
            return null;
        }
        C427660Gpo c427660Gpo = new C427660Gpo(context, attributeSet, 6, 0);
        C427660Gpo.LJIIJJI(c427660Gpo, new C03IT(avatarMedium.getUrlList()), false, null, null, false, false, null, null, false, null, 1022);
        c427660Gpo.setSize(96);
        return c427660Gpo;
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final boolean LJIJI(String str) {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        C1518550pcT c1518550pcTLJI;
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService != null && (eligibilityModelLIZ = iGatekeeperService.LIZ(str)) != null) {
            for (DecisionMakerNetworkApi.PPFActionModel pPFActionModel : eligibilityModelLIZ.actionList) {
                if (Intrinsics.LJFF(pPFActionModel.actionId, "PopupAPIProcessor")) {
                    TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null);
                    if (tTKUserCommunicationService != null && (c1518550pcTLJI = tTKUserCommunicationService.LJI()) != null) {
                        UserCommunicationProcessorModel userCommunicationProcessorModel = new UserCommunicationProcessorModel(pPFActionModel.actionId, pPFActionModel.actionParams, null);
                        c1518550pcTLJI.getClass();
                        C1518550pcT.LJI(userCommunicationProcessorModel, null, null);
                        return true;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final void LJIJJLI(int i) {
        boolean z;
        C191819102n.LIZ.getClass();
        AccountUserService accountUserServiceLJIIJ = C191819102n.LJ().LJIIJ();
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        accountUserServiceLJIIJ.LJJJLIIL(z);
        if (i == 1) {
            ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LJJJJIZL(false);
        }
        C1440005kM.LIZ(new C712300Rwq(null));
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final void LJJII(AwS237S0300000_28 awS237S0300000_28) {
        C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
        c19212010Ec.LJZI(c19212010Ec.LJJJJ(), "permission_change_popup_click", awS237S0300000_28);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final void LJJIIJZLJL(int i) {
        C191819102n.LIZ.getClass();
        User userLIZ = C191819102n.LIZ();
        userLIZ.setCommentSetting(i);
        C191819102n.LJ().LJIIJ().LJIL(userLIZ);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    public final boolean LJJIIZI(int i, View view) {
        C191819102n.LIZ.getClass();
        if (C191819102n.LIZ().getAccountType() == 3 && i == 1) {
            QuitBaAccountProcessor quitBaAccountProcessor = new QuitBaAccountProcessor(view.getContext(), new AwS591S0100000_12(view, 603));
            QuitBaAccountProcessor.CanQuitBusinessAccountApi.LIZ.getClass();
            C747310TTd.LIZIZ.check().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(quitBaAccountProcessor, 287), new AfS181S0100000_12(quitBaAccountProcessor, 288));
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJL(java.lang.String r7, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C754170TiB
            if (r0 == 0) goto L82
            r4 = r8
            X.0TiB r4 = (X.C754170TiB) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L3f
            if (r0 != r3) goto L88
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r1
            X.06g9 r0 = com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService.LIZ
            com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService r0 = X.C1668706g9.LIZ(r0)
            X.06nD r0 = r0.LJFF()
            java.lang.Boolean r1 = r0.LJ(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L3f:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = "dm_setting_potential_connection"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 != 0) goto L58
            java.lang.String r0 = "dm_setting_others"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 != 0) goto L58
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L58:
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r2 = r0.LJ()
            X.C0XQ7.LJ()
            com.ss.android.ugc.aweme.IAccountService r0 = X.C0XQ7.LIZ
            r1 = 0
            if (r0 == 0) goto L80
            com.ss.android.ugc.aweme.AccountUserService r0 = r0.LJIIJ()
            if (r0 == 0) goto L80
            java.lang.String r0 = r0.getCurUserId()
        L77:
            r4.LLILLL = r3
            java.lang.Object r1 = r2.LJIJ(r0, r1, r4)
            if (r1 != r5) goto L22
            return r5
        L80:
            r0 = r1
            goto L77
        L82:
            X.0TiB r4 = new X.0TiB
            r4.<init>(r6, r8)
            goto L12
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacySettingsDepServiceImpl.LJJIJL(java.lang.String, X.05Vn):java.lang.Object");
    }
}
