package com.ss.android.ugc.aweme.services;

import X.AbstractC343940De4;
import X.C09AY;
import X.C09UZ;
import X.C0I7D;
import X.C0WQI;
import X.C0XGI;
import X.C0XGR;
import X.C0XO3;
import X.C0XPY;
import X.C0XQ5;
import X.C0XTR;
import X.C0XUD;
import X.C0XWD;
import X.C1235760iGM;
import X.C1237780iJc;
import X.C1238130iKB;
import X.C1238240iKM;
import X.C1239020iLc;
import X.C1390920mIc;
import X.C1391190mJ3;
import X.C1391850mK7;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C1397630mTR;
import X.C1397660mTU;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C15O7;
import X.C1697810uHb;
import X.C19314110hH;
import X.C1948707kD;
import X.C197039127h;
import X.C19EG;
import X.C1C7U;
import X.C20656615sK;
import X.C20684815ws;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C343960De6;
import X.C343970De7;
import X.C343980De8;
import X.C384000F3u;
import X.C703302op;
import X.C7740030o;
import X.C786410Ut5;
import X.C849850XVn;
import X.C852610XcZ;
import X.C852810Xct;
import X.C854460XfY;
import X.C985403tE;
import X.EnumC1237790iJd;
import X.EnumC1237800iJe;
import X.EnumC1237860iJk;
import X.EnumC1239210iLv;
import X.EnumC589810NBj;
import X.EnumC852630Xcb;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC1237760iJa;
import X.InterfaceC2385309Wh;
import X.InterfaceC586170Myt;
import X.InterfaceC852600XcY;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.IForceBindingAccountService;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.CloseEmailBindingShowEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ClosePhoneBindingShowEvent;
import com.ss.android.ugc.aweme.account.experiment.DeprecationEnhancementExperiment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailBindSheetFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneBindSheetFragment;
import com.ss.android.ugc.aweme.account.model.SafeEnvData;
import com.ss.android.ugc.aweme.account.model.SafeEnvV2Response;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.loginplatform.LoginSignupConfig;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS0S4511000_19;
import kotlin.jvm.internal.AwS106S0110000_19;
import kotlin.jvm.internal.AwS15S2300000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class ForceBindingAccountService implements IForceBindingAccountService {
    public EnumC589810NBj closeBtnScene = EnumC589810NBj.IS_NOT_VISIBLE;
    public EnumC1237800iJe safeEnvCheckButtonStatus;
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;
    public static final Keva keva = Keva.getRepo("force_binding_repo");

    public static final class Companion {
    }

    private final String getLang() {
        if (PluggableExtentionKt.pluggableSpi$default(ILanguageService.class, false, false, false, 14, null) == null) {
            return C786410Ut5.t2(Locale.getDefault());
        }
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        return ((ILanguageService) C0XPY.LIZIZ(ILanguageService.class)).getAppLanguage();
    }

    public Set<EnumC1237860iJk> getCurrentDisable3pPlatform() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C19314110hH.LIZ.getClass();
        LoginSignupConfig loginSignupConfig = C19314110hH.LIZ().loginConfig;
        if (loginSignupConfig != null) {
            linkedHashSet.addAll(toLoginTypeList(loginSignupConfig.LIZ()));
        }
        LoginSignupConfig loginSignupConfig2 = C19314110hH.LIZ().signupConfig;
        if (loginSignupConfig2 != null) {
            linkedHashSet.addAll(toLoginTypeList(loginSignupConfig2.LIZ()));
        }
        return linkedHashSet;
    }

    @Override // com.ss.android.ugc.aweme.IForceBindingAccountService
    public boolean isEmailForceBinded() {
        return keva.getBoolean(getIsEmailForceBindedCacheKey(), false);
    }

    @Override // com.ss.android.ugc.aweme.IForceBindingAccountService
    public boolean isFBDeprecationTransitionExpired() {
        DeprecationEnhancementExperiment.LIZ.getClass();
        int i = DeprecationEnhancementExperiment.LIZ().fbDeprecationTransitionDuration;
        if (i < 0) {
            return false;
        }
        IForceBindingAccountService.FrequencyConfigCache localFrequencyCacheConfig = getLocalFrequencyCacheConfig(getFBDeprecationFreqCacheKey());
        return localFrequencyCacheConfig.lastShowTime > 0 && System.currentTimeMillis() - localFrequencyCacheConfig.lastShowTime >= ((long) i) * 86400000;
    }

    private final String getConfigCacheKey() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0XQ5.LIZLLL());
        sbLIZ.append('_');
        sbLIZ.append(getLang());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final String getFBDeprecationFreqCacheKey() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0XQ5.LIZLLL());
        sbLIZ.append("_3P_prompt_popup_fb_deprecation");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final String getIsEmailForceBindedCacheKey() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0XQ5.LIZLLL());
        sbLIZ.append("_is_email_filtered");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final String getUserId() {
        return C0XQ5.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.IForceBindingAccountService
    public void clearCurrentCacheConfig() {
        updateCacheConfig(getConfigCacheKey(), null);
    }

    @Override // com.ss.android.ugc.aweme.IForceBindingAccountService
    public EnumC1237860iJk getCurrentLoginUser3pPlatform() {
        JSONObject jSONObject;
        JSONArray jSONArrayOptJSONArray;
        C0XO3 c0xo3LIZIZ = C0XGI.LIZIZ();
        if (c0xo3LIZIZ == null || (jSONObject = c0xo3LIZIZ.LJJII) == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("connects")) == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        return toLoginType(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, 0).optString("platform").toUpperCase(Locale.ROOT));
    }

    @Override // com.ss.android.ugc.aweme.IForceBindingAccountService
    public boolean hasBindPhoneNumber() {
        return C0XQ5.LIZJ().isPhoneBinded();
    }

    @Override // com.ss.android.ugc.aweme.IForceBindingAccountService
    public boolean isCurrentLoginUser3pPlatformDisable() {
        return C13LP.LJJJJ(getCurrentLoginUser3pPlatform(), getCurrentDisable3pPlatform());
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.ForceBindingAccountService$showDialogInner$5, reason: invalid class name */
    public final class AnonymousClass5 extends C09AY implements Function1<C1397620mTQ, Unit> {
        public final /* synthetic */ Activity $activity;
        public final /* synthetic */ List<IForceBindingAccountService.BindPromptButtonConfig> $buttonsConfig;
        public final /* synthetic */ InterfaceC1237760iJa $callback;
        public final /* synthetic */ int $configKey;
        public final /* synthetic */ String $enterFrom;
        public final /* synthetic */ String $enterMethod;
        public final /* synthetic */ boolean $isSkippable;
        public final /* synthetic */ String $projectTag;
        public final /* synthetic */ ForceBindingAccountService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(List<IForceBindingAccountService.BindPromptButtonConfig> list, ForceBindingAccountService forceBindingAccountService, Activity activity, boolean z, String str, String str2, int i, InterfaceC1237760iJa interfaceC1237760iJa, String str3) {
            super(1);
            this.$buttonsConfig = list;
            this.this$0 = forceBindingAccountService;
            this.$activity = activity;
            this.$isSkippable = z;
            this.$enterFrom = str;
            this.$enterMethod = str2;
            this.$configKey = i;
            this.$callback = interfaceC1237760iJa;
            this.$projectTag = str3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C1397620mTQ c1397620mTQ) {
            C1397620mTQ c1397620mTQ2 = c1397620mTQ;
            c1397620mTQ2.LJFF = true;
            List<IForceBindingAccountService.BindPromptButtonConfig> list = this.$buttonsConfig;
            ForceBindingAccountService forceBindingAccountService = this.this$0;
            Activity activity = this.$activity;
            boolean z = this.$isSkippable;
            String str = this.$enterFrom;
            String str2 = this.$enterMethod;
            int i = this.$configKey;
            InterfaceC1237760iJa interfaceC1237760iJa = this.$callback;
            String str3 = this.$projectTag;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<IForceBindingAccountService.BindPromptButtonConfig> it2 = list.iterator();
            while (it2.hasNext()) {
                String str4 = str2;
                String str5 = str;
                forceBindingAccountService.getAction(c1397620mTQ2, activity, z, it2.next(), str5, str4, i, interfaceC1237760iJa, str3);
                arrayList.add(Unit.LIZ);
                str2 = str4;
                str = str5;
            }
            return Unit.LIZ;
        }
    }

    private final IForceBindingAccountService.BindPromptButtonConfig getFirstButtonConfig(List<IForceBindingAccountService.BindPromptButtonConfig> list) {
        if (!list.isEmpty()) {
            return (IForceBindingAccountService.BindPromptButtonConfig) ListProtector.get(list, 0);
        }
        C0WQI.LIZ(6, "ForceBindingAccService", "Error getting first button action type!");
        return new IForceBindingAccountService.BindPromptButtonConfig("", "", "", "", null);
    }

    private final String getFrequencyGroupCacheKey(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0XQ5.LIZLLL());
        sbLIZ.append("_3P_prompt_popup_fg_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final IForceBindingAccountService.FrequencyConfigCache getLocalFrequencyCacheConfig(String str) {
        boolean z;
        String string = keva.getString(str, "");
        if (string != null && string.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                return (IForceBindingAccountService.FrequencyConfigCache) C7740030o.LIZ().getGson().LJII(string, IForceBindingAccountService.FrequencyConfigCache.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                updateLocalFrequencyCacheConfig(str, null);
            }
        }
        if (!u.LJIIZILJ(str, "3P_prompt_popup", false)) {
            return new IForceBindingAccountService.FrequencyConfigCache(-1L, 0);
        }
        String frequencyCacheKey = getFrequencyCacheKey("homepage_hot", "3p_bind_fyp_coldstart");
        String string2 = keva.getString(frequencyCacheKey, "");
        if (string2 != null && string2.length() != 0) {
            updateLocalFrequencyCacheConfig(frequencyCacheKey, null);
            try {
                IForceBindingAccountService.FrequencyConfigCache frequencyConfigCache = (IForceBindingAccountService.FrequencyConfigCache) C7740030o.LIZ().getGson().LJII(string2, IForceBindingAccountService.FrequencyConfigCache.class);
                updateLocalFrequencyCacheConfig(str, frequencyConfigCache);
                return frequencyConfigCache;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return new IForceBindingAccountService.FrequencyConfigCache(-1L, 0);
            }
        }
        return new IForceBindingAccountService.FrequencyConfigCache(-1L, 0);
    }

    private final EnumC1237860iJk toLoginType(String str) {
        try {
            return EnumC1237860iJk.valueOf(str.toUpperCase(Locale.ROOT));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final List<EnumC1237860iJk> toLoginTypeList(Collection<? extends EnumC1239210iLv> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            EnumC1237860iJk loginType = toLoginType(((EnumC1239210iLv) it2.next()).getPassportName());
            if (loginType != null) {
                arrayList.add(loginType);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.IForceBindingAccountService
    public IForceBindingAccountService.BindPromptConfig getCacheOrDefaultConfig(Context context) {
        String string = keva.getString(getConfigCacheKey(), "");
        if (C703302op.LIZ(string)) {
            return (IForceBindingAccountService.BindPromptConfig) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), string, IForceBindingAccountService.BindPromptConfig.class);
        }
        return new IForceBindingAccountService.BindPromptConfig(0, null, null, context.getString(2131850223), context.getString(2131850222), C13BV.INSTANCE, C1697810uHb.LJIIJJI(new IForceBindingAccountService.BindPromptButtonConfig(context.getString(2131850224), "phone_binding", "button", "primary", null), new IForceBindingAccountService.BindPromptButtonConfig(context.getString(2131850221), "dismiss", "button", "secondary", null)), true, null, null, null, null, false, 0, null, null, false, null, null, 523783, null);
    }

    public final String getFirstButtonActionType(List<IForceBindingAccountService.BindPromptButtonConfig> list) {
        if (!list.isEmpty()) {
            return ((IForceBindingAccountService.BindPromptButtonConfig) ListProtector.get(list, 0)).actionType;
        }
        C0WQI.LIZ(6, "ForceBindingAccService", "Error getting first button action type!");
        return "";
    }

    public final String getFrequencyCacheKey(Integer num) {
        if (num != null && num.intValue() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C0XQ5.LIZLLL());
            sbLIZ.append("_3P_prompt_popup_");
            sbLIZ.append(num);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C0XQ5.LIZLLL());
        sbLIZ2.append("_3P_prompt_popup");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final int getPopupFreq(Integer num) {
        return getLocalFrequencyCacheConfig(getFrequencyCacheKey(num)).showCount;
    }

    public final boolean is1PSheet(IForceBindingAccountService.BindPromptConfig bindPromptConfig) {
        if (bindPromptConfig != null) {
            String str = bindPromptConfig.style;
            if (str == null || !str.equals("half_sheet")) {
                List<IForceBindingAccountService.BindPromptButtonConfig> list = bindPromptConfig.buttons;
                if (list != null) {
                    String str2 = getFirstButtonConfig(list).actionType;
                    if (Intrinsics.LJFF(str2, "phone_binding_in_sheet") || Intrinsics.LJFF(str2, "phone_binding_in_sheet_full_screen") || Intrinsics.LJFF(str2, "email_binding_in_sheet") || Intrinsics.LJFF(str2, "email_binding_in_sheet_full_screen")) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IForceBindingAccountService
    public void setIsEmailForceBinded(boolean z) {
        keva.storeBoolean(getIsEmailForceBindedCacheKey(), z);
    }

    @Override // com.ss.android.ugc.aweme.IForceBindingAccountService
    public void updateFrequencyGroupCacheAfterShow(String str) {
        String string = a0.LJLIIIL(str).toString();
        if (string.length() == 0) {
            return;
        }
        String frequencyGroupCacheKey = getFrequencyGroupCacheKey(string);
        updateLocalFrequencyCacheConfig(frequencyGroupCacheKey, new IForceBindingAccountService.FrequencyConfigCache(System.currentTimeMillis(), getLocalFrequencyCacheConfig(frequencyGroupCacheKey).showCount + 1));
    }

    private final String getFrequencyCacheKey(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0XQ5.LIZLLL());
        sbLIZ.append('_');
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final void performMaxCountBehavior(Activity activity, IForceBindingAccountService.BindPromptConfig bindPromptConfig) {
        String str = bindPromptConfig.freqControlMaxCountBehavior;
        if (str != null) {
            SmartRouter.buildRoute(activity, str).open();
        }
    }

    private final void updateCacheConfig(String str, IForceBindingAccountService.BindPromptConfig bindPromptConfig) {
        if (bindPromptConfig == null) {
            keva.erase(str);
        } else {
            keva.storeString(str, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), bindPromptConfig));
        }
    }

    private final void updateLocalFrequencyCacheConfig(String str, IForceBindingAccountService.FrequencyConfigCache frequencyConfigCache) {
        if (frequencyConfigCache == null) {
            keva.erase(str);
        } else {
            keva.storeString(str, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), frequencyConfigCache));
        }
    }

    public final String getPageValue(String str, String str2) {
        if (Intrinsics.LJFF(str2, "fb_deprecation")) {
            return "facebook_offline";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.IForceBindingAccountService
    public void showDialogAsColdStartPopupTask(C19EG c19eg, IForceBindingAccountService.BindPromptConfig bindPromptConfig) {
        updateCacheConfig(getConfigCacheKey(), bindPromptConfig);
        if (!shouldShow3PDialog(c19eg, "homepage_hot", "3p_bind_fyp_coldstart", bindPromptConfig, true)) {
            return;
        }
        showDialogAsPopupTask(c19eg, "homepage_hot", "3p_bind_fyp_coldstart", bindPromptConfig);
    }

    public final void updateSkippableFrequencyCachesAfterShow(IForceBindingAccountService.BindPromptConfig bindPromptConfig, String str) {
        String str2;
        updateLocalFrequencyCacheConfig(str, new IForceBindingAccountService.FrequencyConfigCache(System.currentTimeMillis(), getLocalFrequencyCacheConfig(str).showCount + 1));
        IForceBindingAccountService.FrequencyGroup frequencyGroup = bindPromptConfig.frequencyGroup;
        if (frequencyGroup != null && (str2 = frequencyGroup.id) != null) {
            updateFrequencyGroupCacheAfterShow(str2);
        }
        if (Intrinsics.LJFF(bindPromptConfig.projectTag, "fb_deprecation")) {
            String fBDeprecationFreqCacheKey = getFBDeprecationFreqCacheKey();
            IForceBindingAccountService.FrequencyConfigCache localFrequencyCacheConfig = getLocalFrequencyCacheConfig(fBDeprecationFreqCacheKey);
            if (localFrequencyCacheConfig.lastShowTime <= 0) {
                updateLocalFrequencyCacheConfig(fBDeprecationFreqCacheKey, new IForceBindingAccountService.FrequencyConfigCache(System.currentTimeMillis(), localFrequencyCacheConfig.showCount));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r4.equals("email_binding") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r4.equals("email_binding_in_sheet_full_screen") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r4.equals("email_binding_in_sheet") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r3 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        return X.EnumC1237810iJf.GENERAL_POPUP_OPTIONAL.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        return X.EnumC1237810iJf.GENERAL_POPUP_FORCE.getValue();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int getEmailBindSource(java.lang.String r2, boolean r3, java.lang.String r4) {
        /*
            r1 = this;
            int r0 = r4.hashCode()
            switch(r0) {
                case -1581024305: goto L18;
                case 269960418: goto L27;
                case 271137200: goto L30;
                case 490209247: goto L3f;
                case 1224403074: goto L48;
                default: goto L7;
            }
        L7:
            java.lang.String r0 = "3p_bind_logout"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L58
            if (r3 == 0) goto L51
            X.0iJf r0 = X.EnumC1237810iJf.ACE_LOGOUT_POPUP_OPTIONAL
            int r0 = r0.getValue()
            return r0
        L18:
            java.lang.String r0 = "non1p_email_binding"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            X.0iJf r0 = X.EnumC1237810iJf.VERIFY_NON_1P_EMAIL
            int r0 = r0.getValue()
            return r0
        L27:
            java.lang.String r0 = "email_binding"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L80
            goto L7
        L30:
            java.lang.String r0 = "email_changing"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            X.0iJf r0 = X.EnumC1237810iJf.GENERAL_POPUP_OPTIONAL
            int r0 = r0.getValue()
            return r0
        L3f:
            java.lang.String r0 = "email_binding_in_sheet_full_screen"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L80
            goto L7
        L48:
            java.lang.String r0 = "email_binding_in_sheet"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L80
            goto L7
        L51:
            X.0iJf r0 = X.EnumC1237810iJf.ACE_LOGOUT_POPUP_FORCE
            int r0 = r0.getValue()
            return r0
        L58:
            java.lang.String r0 = "3p_bind_fyp_coldstart"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L70
            if (r3 == 0) goto L69
            X.0iJf r0 = X.EnumC1237810iJf.ACE_COLDSTART_POPUP_OPTIONAL
            int r0 = r0.getValue()
            return r0
        L69:
            X.0iJf r0 = X.EnumC1237810iJf.ACE_COLDSTART_POPUP_FORCE
            int r0 = r0.getValue()
            return r0
        L70:
            if (r3 == 0) goto L79
            X.0iJf r0 = X.EnumC1237810iJf.GENERAL_POPUP_OPTIONAL
            int r0 = r0.getValue()
            return r0
        L79:
            X.0iJf r0 = X.EnumC1237810iJf.GENERAL_POPUP_FORCE
            int r0 = r0.getValue()
            return r0
        L80:
            if (r3 == 0) goto L89
            X.0iJf r0 = X.EnumC1237810iJf.GENERAL_POPUP_OPTIONAL
            int r0 = r0.getValue()
            return r0
        L89:
            X.0iJf r0 = X.EnumC1237810iJf.GENERAL_POPUP_FORCE
            int r0 = r0.getValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.ForceBindingAccountService.getEmailBindSource(java.lang.String, boolean, java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r4.equals("phone_binding") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r4.equals("phone_binding_in_sheet_full_screen") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r4.equals("phone_binding_in_sheet") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r3 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        return X.EnumC1237820iJg.GENERAL_POPUP_OPTIONAL.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        return X.EnumC1237820iJg.GENERAL_POPUP_FORCE.getValue();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int getMobileBindSource(java.lang.String r2, boolean r3, java.lang.String r4) {
        /*
            r1 = this;
            int r0 = r4.hashCode()
            switch(r0) {
                case -1761707103: goto L18;
                case -1035062242: goto L27;
                case 89277620: goto L36;
                case 517306189: goto L3f;
                case 552441072: goto L48;
                default: goto L7;
            }
        L7:
            java.lang.String r0 = "3p_bind_logout"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L58
            if (r3 == 0) goto L51
            X.0iJg r0 = X.EnumC1237820iJg.ACE_LOGOUT_POPUP_OPTIONAL
            int r0 = r0.getValue()
            return r0
        L18:
            java.lang.String r0 = "non1p_phone_binding"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            X.0iJg r0 = X.EnumC1237820iJg.VERIFY_NON_1P_MOBILE
            int r0 = r0.getValue()
            return r0
        L27:
            java.lang.String r0 = "phone_changing"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            X.0iJg r0 = X.EnumC1237820iJg.GENERAL_POPUP_OPTIONAL
            int r0 = r0.getValue()
            return r0
        L36:
            java.lang.String r0 = "phone_binding"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L80
            goto L7
        L3f:
            java.lang.String r0 = "phone_binding_in_sheet_full_screen"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L80
            goto L7
        L48:
            java.lang.String r0 = "phone_binding_in_sheet"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L80
            goto L7
        L51:
            X.0iJg r0 = X.EnumC1237820iJg.ACE_LOGOUT_POPUP_FORCE
            int r0 = r0.getValue()
            return r0
        L58:
            java.lang.String r0 = "3p_bind_fyp_coldstart"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L70
            if (r3 == 0) goto L69
            X.0iJg r0 = X.EnumC1237820iJg.ACE_COLDSTART_POPUP_OPTIONAL
            int r0 = r0.getValue()
            return r0
        L69:
            X.0iJg r0 = X.EnumC1237820iJg.ACE_COLDSTART_POPUP_FORCE
            int r0 = r0.getValue()
            return r0
        L70:
            if (r3 == 0) goto L79
            X.0iJg r0 = X.EnumC1237820iJg.GENERAL_POPUP_OPTIONAL
            int r0 = r0.getValue()
            return r0
        L79:
            X.0iJg r0 = X.EnumC1237820iJg.GENERAL_POPUP_FORCE
            int r0 = r0.getValue()
            return r0
        L80:
            if (r3 == 0) goto L89
            X.0iJg r0 = X.EnumC1237820iJg.GENERAL_POPUP_OPTIONAL
            int r0 = r0.getValue()
            return r0
        L89:
            X.0iJg r0 = X.EnumC1237820iJg.GENERAL_POPUP_FORCE
            int r0 = r0.getValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.ForceBindingAccountService.getMobileBindSource(java.lang.String, boolean, java.lang.String):int");
    }

    public final InterfaceC1237760iJa getShowDialogCallback(final String str, final String str2, final IForceBindingAccountService.BindPromptConfig bindPromptConfig) {
        final String firstButtonActionType = getFirstButtonActionType(bindPromptConfig.buttons);
        final EnumC1237860iJk currentLoginUser3pPlatform = getCurrentLoginUser3pPlatform();
        final String pageValue = getPageValue("", bindPromptConfig.projectTag);
        if (pageValue.length() <= 0) {
            pageValue = null;
        }
        return new InterfaceC1237760iJa() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$getShowDialogCallback$1$1
            @Override // X.InterfaceC1237760iJa
            public void onPhoneBindResult(boolean z) {
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC1237760iJa
            public void onButtonClick(String str3) {
                switch (str3.hashCode()) {
                    case -1761707103:
                        if (str3.equals("non1p_phone_binding")) {
                            C1237780iJc c1237780iJc = C1237780iJc.LIZ;
                            String str4 = firstButtonActionType;
                            String str5 = str;
                            String str6 = str2;
                            IForceBindingAccountService.BindPromptConfig bindPromptConfig2 = bindPromptConfig;
                            int i = bindPromptConfig2.groupId;
                            EnumC1237790iJd enumC1237790iJd = EnumC1237790iJd.BIND_PHONE;
                            Integer num = bindPromptConfig2.non1PBindingType;
                            String str7 = pageValue;
                            c1237780iJc.getClass();
                            C1237780iJc.LIZ(str4, str5, str6, i, enumC1237790iJd, num, null, null, str7);
                            C849850XVn.LIZIZ.LIZJ().LJIJI("93", "positive", true);
                        }
                        break;
                    case -1581024305:
                        if (str3.equals("non1p_email_binding")) {
                            C1237780iJc c1237780iJc2 = C1237780iJc.LIZ;
                            String str8 = firstButtonActionType;
                            String str9 = str;
                            String str10 = str2;
                            IForceBindingAccountService.BindPromptConfig bindPromptConfig3 = bindPromptConfig;
                            int i2 = bindPromptConfig3.groupId;
                            EnumC1237790iJd enumC1237790iJd2 = EnumC1237790iJd.LINK_EMAIL;
                            Integer num2 = bindPromptConfig3.non1PBindingType;
                            String str11 = pageValue;
                            c1237780iJc2.getClass();
                            C1237780iJc.LIZ(str8, str9, str10, i2, enumC1237790iJd2, num2, null, null, str11);
                            C849850XVn.LIZIZ.LIZJ().LJIJI("93", "positive", true);
                        }
                        break;
                    case -1035062242:
                        if (str3.equals("phone_changing")) {
                            C1237780iJc c1237780iJc3 = C1237780iJc.LIZ;
                            String str12 = firstButtonActionType;
                            String str13 = str;
                            String str14 = str2;
                            IForceBindingAccountService.BindPromptConfig bindPromptConfig4 = bindPromptConfig;
                            int i3 = bindPromptConfig4.groupId;
                            EnumC1237790iJd enumC1237790iJd3 = EnumC1237790iJd.CHANGE_PHONE;
                            Integer num3 = bindPromptConfig4.non1PBindingType;
                            String str15 = pageValue;
                            c1237780iJc3.getClass();
                            C1237780iJc.LIZ(str12, str13, str14, i3, enumC1237790iJd3, num3, null, null, str15);
                            C849850XVn.LIZIZ.LIZJ().LJIJI("93", "negative", false);
                        }
                        break;
                    case -495824123:
                        if (str3.equals("verify_email_v2")) {
                            C1237780iJc c1237780iJc4 = C1237780iJc.LIZ;
                            String str16 = firstButtonActionType;
                            String str17 = str;
                            String str18 = str2;
                            IForceBindingAccountService.BindPromptConfig bindPromptConfig5 = bindPromptConfig;
                            int i4 = bindPromptConfig5.groupId;
                            EnumC1237790iJd enumC1237790iJd4 = EnumC1237790iJd.VERIFY_EMAIL;
                            Integer num4 = bindPromptConfig5.non1PBindingType;
                            Integer numValueOf = Integer.valueOf(this.getPopupFreq(bindPromptConfig5.projectId));
                            EnumC1237800iJe enumC1237800iJe = this.safeEnvCheckButtonStatus;
                            String str19 = pageValue;
                            c1237780iJc4.getClass();
                            C1237780iJc.LIZ(str16, str17, str18, i4, enumC1237790iJd4, num4, numValueOf, enumC1237800iJe, str19);
                            C849850XVn.LIZIZ.LIZJ().LJIJI("93", "positive", true);
                        }
                        break;
                    case -280283050:
                        if (str3.equals("verify_email")) {
                            C1237780iJc c1237780iJc5 = C1237780iJc.LIZ;
                            String str20 = firstButtonActionType;
                            String str21 = str;
                            String str22 = str2;
                            IForceBindingAccountService.BindPromptConfig bindPromptConfig6 = bindPromptConfig;
                            int i5 = bindPromptConfig6.groupId;
                            EnumC1237790iJd enumC1237790iJd5 = EnumC1237790iJd.VERIFY_EMAIL;
                            Integer num5 = bindPromptConfig6.non1PBindingType;
                            Integer numValueOf2 = Integer.valueOf(this.getPopupFreq(bindPromptConfig6.projectId));
                            String str23 = pageValue;
                            c1237780iJc5.getClass();
                            C1237780iJc.LIZ(str20, str21, str22, i5, enumC1237790iJd5, num5, numValueOf2, null, str23);
                            C849850XVn.LIZIZ.LIZJ().LJIJI("93", "positive", true);
                        }
                        break;
                    case 67608465:
                        if (str3.equals("phone_binding_unsafe")) {
                            C1237780iJc c1237780iJc6 = C1237780iJc.LIZ;
                            String str24 = firstButtonActionType;
                            String str25 = str;
                            String str26 = str2;
                            IForceBindingAccountService.BindPromptConfig bindPromptConfig7 = bindPromptConfig;
                            int i6 = bindPromptConfig7.groupId;
                            EnumC1237790iJd enumC1237790iJd6 = EnumC1237790iJd.BIND_PHONE;
                            Integer num6 = bindPromptConfig7.non1PBindingType;
                            Integer numValueOf3 = Integer.valueOf(this.getPopupFreq(bindPromptConfig7.projectId));
                            EnumC1237800iJe enumC1237800iJe2 = this.safeEnvCheckButtonStatus;
                            String str27 = pageValue;
                            c1237780iJc6.getClass();
                            C1237780iJc.LIZ(str24, str25, str26, i6, enumC1237790iJd6, num6, numValueOf3, enumC1237800iJe2, str27);
                            C849850XVn.LIZIZ.LIZJ().LJIJI("93", "positive", true);
                        }
                        break;
                    case 89277620:
                        if (str3.equals("phone_binding")) {
                            C1237780iJc c1237780iJc7 = C1237780iJc.LIZ;
                            String str28 = firstButtonActionType;
                            String str29 = str;
                            String str30 = str2;
                            int i7 = bindPromptConfig.groupId;
                            EnumC1237790iJd enumC1237790iJd7 = EnumC1237790iJd.BIND_PHONE;
                            String str31 = pageValue;
                            c1237780iJc7.getClass();
                            C1237780iJc.LIZ(str28, str29, str30, i7, enumC1237790iJd7, null, null, null, str31);
                            C849850XVn.LIZIZ.LIZJ().LJIJI("93", "positive", true);
                        }
                        break;
                    case 269960418:
                        if (str3.equals("email_binding")) {
                            C1237780iJc c1237780iJc8 = C1237780iJc.LIZ;
                            String str32 = firstButtonActionType;
                            String str33 = str;
                            String str34 = str2;
                            IForceBindingAccountService.BindPromptConfig bindPromptConfig8 = bindPromptConfig;
                            int i8 = bindPromptConfig8.groupId;
                            EnumC1237790iJd enumC1237790iJd8 = EnumC1237790iJd.LINK_EMAIL;
                            Integer num7 = bindPromptConfig8.non1PBindingType;
                            String str35 = pageValue;
                            c1237780iJc8.getClass();
                            C1237780iJc.LIZ(str32, str33, str34, i8, enumC1237790iJd8, num7, null, null, str35);
                            C849850XVn.LIZIZ.LIZJ().LJIJI("93", "negative", false);
                        }
                        break;
                    case 271137200:
                        if (str3.equals("email_changing")) {
                            C1237780iJc c1237780iJc9 = C1237780iJc.LIZ;
                            String str36 = firstButtonActionType;
                            String str37 = str;
                            String str38 = str2;
                            IForceBindingAccountService.BindPromptConfig bindPromptConfig9 = bindPromptConfig;
                            int i9 = bindPromptConfig9.groupId;
                            EnumC1237790iJd enumC1237790iJd9 = EnumC1237790iJd.CHANGE_EMAIL;
                            Integer num8 = bindPromptConfig9.non1PBindingType;
                            String str39 = pageValue;
                            c1237780iJc9.getClass();
                            C1237780iJc.LIZ(str36, str37, str38, i9, enumC1237790iJd9, num8, null, null, str39);
                            C849850XVn.LIZIZ.LIZJ().LJIJI("93", "negative", false);
                        }
                        break;
                    case 393727164:
                        if (str3.equals("email_changing_safe")) {
                            C1237780iJc c1237780iJc10 = C1237780iJc.LIZ;
                            String str40 = firstButtonActionType;
                            String str41 = str;
                            String str42 = str2;
                            IForceBindingAccountService.BindPromptConfig bindPromptConfig10 = bindPromptConfig;
                            int i10 = bindPromptConfig10.groupId;
                            EnumC1237790iJd enumC1237790iJd10 = EnumC1237790iJd.CHANGE_EMAIL;
                            Integer num9 = bindPromptConfig10.non1PBindingType;
                            Integer numValueOf4 = Integer.valueOf(this.getPopupFreq(bindPromptConfig10.projectId));
                            EnumC1237800iJe enumC1237800iJe3 = this.safeEnvCheckButtonStatus;
                            String str43 = pageValue;
                            c1237780iJc10.getClass();
                            C1237780iJc.LIZ(str40, str41, str42, i10, enumC1237790iJd10, num9, numValueOf4, enumC1237800iJe3, str43);
                            C849850XVn.LIZIZ.LIZJ().LJIJI("93", "positive", true);
                        }
                        break;
                    case 1671672458:
                        if (str3.equals("dismiss")) {
                            C1237780iJc c1237780iJc11 = C1237780iJc.LIZ;
                            String str44 = firstButtonActionType;
                            String str45 = str;
                            String str46 = str2;
                            int i11 = bindPromptConfig.groupId;
                            EnumC1237790iJd enumC1237790iJd11 = EnumC1237790iJd.DISMISS;
                            String str47 = pageValue;
                            c1237780iJc11.getClass();
                            C1237780iJc.LIZ(str44, str45, str46, i11, enumC1237790iJd11, null, null, null, str47);
                            C849850XVn.LIZIZ.LIZJ().LJIJI("93", "negative", false);
                        }
                        break;
                }
            }

            @Override // X.InterfaceC1237760iJa
            public void onDialogShow(boolean z) {
                if (z) {
                    C1237780iJc c1237780iJc = C1237780iJc.LIZ;
                    String str3 = firstButtonActionType;
                    String str4 = str;
                    String str5 = str2;
                    IForceBindingAccountService.BindPromptConfig bindPromptConfig2 = bindPromptConfig;
                    int i = bindPromptConfig2.groupId;
                    Integer num = bindPromptConfig2.non1PBindingType;
                    Integer numValueOf = Integer.valueOf(this.getPopupFreq(bindPromptConfig2.projectId) + 1);
                    String str6 = pageValue;
                    c1237780iJc.getClass();
                    C1237780iJc.LIZJ(i, num, numValueOf, str3, str4, str5, str6);
                }
            }
        };
    }

    private final boolean shouldShowBasedOnConfig(IForceBindingAccountService.BindPromptConfig bindPromptConfig, IForceBindingAccountService.FrequencyConfigCache frequencyConfigCache, String str, Activity activity) {
        List<String> list;
        List<String> list2;
        List<String> list3;
        int iHashCode = str.hashCode();
        if (iHashCode != -1701539319) {
            if (iHashCode != 849015964) {
                if (iHashCode == 1806156518 && str.equals("3p_bind_inbox") && ((list3 = bindPromptConfig.pages) == null || !list3.contains("inbox"))) {
                    return false;
                }
            } else if (str.equals("3p_bind_fyp_coldstart") && (list2 = bindPromptConfig.pages) != null && !list2.contains("fyp")) {
                return false;
            }
        } else if (str.equals("3p_bind_profile") && ((list = bindPromptConfig.pages) == null || !list.contains("profile"))) {
            return false;
        }
        if (!bindPromptConfig.isSkippable) {
            return true;
        }
        IForceBindingAccountService.FrequencyGroup frequencyGroup = bindPromptConfig.frequencyGroup;
        if (frequencyGroup != null) {
            String string = a0.LJLIIIL(frequencyGroup.id).toString();
            if (string.length() > 0) {
                if (System.currentTimeMillis() - getLocalFrequencyCacheConfig(getFrequencyGroupCacheKey(string)).lastShowTime < ((long) frequencyGroup.interval) * 86400000) {
                    return false;
                }
            }
        }
        IForceBindingAccountService.FrequencyControl frequencyControl = bindPromptConfig.frequencyControl;
        if (frequencyControl == null) {
            return true;
        }
        int i = frequencyControl.interval;
        int i2 = frequencyControl.maxCount;
        if (System.currentTimeMillis() - frequencyConfigCache.lastShowTime < ((long) i) * 86400000) {
            return false;
        }
        if (frequencyConfigCache.showCount + 1 <= i2) {
            return true;
        }
        performMaxCountBehavior(activity, bindPromptConfig);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IForceBindingAccountService
    public void showDialogAsPopupTask(final C19EG c19eg, final String str, final String str2, final IForceBindingAccountService.BindPromptConfig bindPromptConfig) {
        c19eg.runOnUiThread(new Runnable() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService.showDialogAsPopupTask.1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("ForceBindingAccountService@57d.showDialogAsPopupTask$1");
                com_ss_android_ugc_aweme_services_ForceBindingAccountService$showDialogAsPopupTask$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("ForceBindingAccountService@57d.showDialogAsPopupTask$1");
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void com_ss_android_ugc_aweme_services_ForceBindingAccountService$showDialogAsPopupTask$1__run$___twin___() {
                /*
                    r13 = this;
                    X.0iJi r2 = new X.0iJi
                    java.lang.String r8 = r1
                    X.19EG r6 = r2
                    com.ss.android.ugc.aweme.services.ForceBindingAccountService$showDialogAsPopupTask$1$1 r3 = new com.ss.android.ugc.aweme.services.ForceBindingAccountService$showDialogAsPopupTask$1$1
                    com.ss.android.ugc.aweme.IForceBindingAccountService$BindPromptConfig r4 = r4
                    com.ss.android.ugc.aweme.services.ForceBindingAccountService r5 = r3
                    java.lang.String r7 = r5
                    r3.<init>(r4, r5, r6, r7, r8)
                    r2.<init>(r6, r8, r3)
                    com.ss.android.ugc.aweme.services.ForceBindingAccountService r1 = r3
                    com.ss.android.ugc.aweme.IForceBindingAccountService$BindPromptConfig r0 = r4
                    if (r0 != 0) goto L20
                    X.19EG r0 = r2
                    com.ss.android.ugc.aweme.IForceBindingAccountService$BindPromptConfig r0 = r1.getCacheOrDefaultConfig(r0)
                L20:
                    boolean r0 = r1.is1PSheet(r0)
                    if (r0 == 0) goto Lb5
                    java.lang.String r4 = "101"
                L28:
                    com.ss.android.ugc.aweme.services.ForceBindingAccountService r1 = r3
                    com.ss.android.ugc.aweme.IForceBindingAccountService$BindPromptConfig r0 = r4
                    if (r0 != 0) goto L34
                    X.19EG r0 = r2
                    com.ss.android.ugc.aweme.IForceBindingAccountService$BindPromptConfig r0 = r1.getCacheOrDefaultConfig(r0)
                L34:
                    boolean r0 = r1.is1PSheet(r0)
                    java.lang.String r10 = "account_101_inbox3p"
                    java.lang.String r12 = "3p_bind_inbox"
                    java.lang.String r11 = "3p_bind_fyp_coldstart"
                    java.lang.String r9 = "3p_bind_profile"
                    java.lang.String r6 = "unknown"
                    r8 = 1806156518(0x6ba7c2e6, float:4.05622E26)
                    r7 = 849015964(0x329af49c, float:1.8039195E-8)
                    r5 = -1701539319(0xffffffff9a949209, float:-6.14473E-23)
                    if (r0 == 0) goto L7b
                    X.06g5 r3 = new X.06g5
                    java.lang.String r1 = r1
                    int r0 = r1.hashCode()
                    if (r0 == r5) goto L72
                    if (r0 == r7) goto L69
                    if (r0 != r8) goto L61
                    boolean r0 = r1.equals(r12)
                    if (r0 != 0) goto L62
                L61:
                    r10 = r6
                L62:
                    r3.<init>(r10)
                L65:
                    com.bytedance.poplayer.core.PopupManager.LJIJ(r2, r4, r3)
                    return
                L69:
                    boolean r0 = r1.equals(r11)
                    if (r0 == 0) goto L61
                    java.lang.String r10 = "account_101_feed1pbind"
                    goto L62
                L72:
                    boolean r0 = r1.equals(r9)
                    if (r0 == 0) goto L61
                    java.lang.String r10 = "account_93_profile"
                    goto L62
                L7b:
                    java.lang.String r1 = r1
                    int r0 = r1.hashCode()
                    if (r0 == r5) goto La1
                    if (r0 == r7) goto L93
                    if (r0 != r8) goto Laf
                    boolean r0 = r1.equals(r12)
                    if (r0 == 0) goto Laf
                    X.06g5 r3 = new X.06g5
                    r3.<init>(r10)
                    goto L65
                L93:
                    boolean r0 = r1.equals(r11)
                    if (r0 == 0) goto Laf
                    X.06g5 r3 = new X.06g5
                    java.lang.String r0 = "account_93_feed3pbind"
                    r3.<init>(r0)
                    goto L65
                La1:
                    boolean r0 = r1.equals(r9)
                    if (r0 == 0) goto Laf
                    X.06g5 r3 = new X.06g5
                    java.lang.String r0 = "account_101_profile3p"
                    r3.<init>(r0)
                    goto L65
                Laf:
                    X.06g5 r3 = new X.06g5
                    r3.<init>(r6)
                    goto L65
                Lb5:
                    java.lang.String r4 = "93"
                    goto L28
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.ForceBindingAccountService.AnonymousClass1.com_ss_android_ugc_aweme_services_ForceBindingAccountService$showDialogAsPopupTask$1__run$___twin___():void");
            }

            /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.ForceBindingAccountService$showDialogAsPopupTask$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00201 extends C09AY implements Function1<C20656615sK, Unit> {
                public final /* synthetic */ C19EG $activity;
                public final /* synthetic */ IForceBindingAccountService.BindPromptConfig $bindPromptConfig;
                public final /* synthetic */ String $enterFrom;
                public final /* synthetic */ String $enterMethod;
                public final /* synthetic */ ForceBindingAccountService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00201(IForceBindingAccountService.BindPromptConfig bindPromptConfig, ForceBindingAccountService forceBindingAccountService, C19EG c19eg, String str, String str2) {
                    super(1);
                    this.$bindPromptConfig = bindPromptConfig;
                    this.this$0 = forceBindingAccountService;
                    this.$activity = c19eg;
                    this.$enterFrom = str;
                    this.$enterMethod = str2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C20656615sK c20656615sK) {
                    C20656615sK c20656615sK2 = c20656615sK;
                    IForceBindingAccountService.BindPromptConfig cacheOrDefaultConfig = this.$bindPromptConfig;
                    if (cacheOrDefaultConfig == null) {
                        cacheOrDefaultConfig = this.this$0.getCacheOrDefaultConfig(this.$activity);
                    }
                    ForceBindingAccountService forceBindingAccountService = this.this$0;
                    C19EG c19eg = this.$activity;
                    String str = this.$enterFrom;
                    String str2 = this.$enterMethod;
                    if (cacheOrDefaultConfig.showCloseBtn) {
                        forceBindingAccountService.closeBtnScene = EnumC589810NBj.IS_VISIBLE;
                    }
                    ForceBindingAccountService.showDialogInner$default(forceBindingAccountService, c19eg, cacheOrDefaultConfig.titleString, cacheOrDefaultConfig.descriptionString, cacheOrDefaultConfig.isSkippable, cacheOrDefaultConfig.buttons, cacheOrDefaultConfig.textFields, str, str2, cacheOrDefaultConfig.groupId, cacheOrDefaultConfig.showCloseBtn, null, cacheOrDefaultConfig.maskedAccount, cacheOrDefaultConfig.non1PBindingType, cacheOrDefaultConfig.projectId, cacheOrDefaultConfig.style, cacheOrDefaultConfig.shouldShowLearnMore, cacheOrDefaultConfig.nextPrompt, new AwS15S2300000_19(forceBindingAccountService, cacheOrDefaultConfig, str, str2, c20656615sK2, 0), forceBindingAccountService.getShowDialogCallback(str, str2, cacheOrDefaultConfig), cacheOrDefaultConfig.projectTag, 1024, null);
                    if (cacheOrDefaultConfig.isSkippable) {
                        forceBindingAccountService.updateSkippableFrequencyCachesAfterShow(cacheOrDefaultConfig, forceBindingAccountService.getFrequencyCacheKey(cacheOrDefaultConfig.projectId));
                    }
                    return Unit.LIZ;
                }
            }

            public static void com_ss_android_ugc_aweme_services_ForceBindingAccountService$showDialogAsPopupTask$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_ss_android_ugc_aweme_services_ForceBindingAccountService$showDialogAsPopupTask$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    private final Bundle getCommonBundle(String str, String str2, boolean z, int i, String str3) {
        String strName;
        Bundle bundle = new Bundle();
        bundle.putInt("phone_number_source", getMobileBindSource(str2, z, str3));
        bundle.putInt("email_source", getEmailBindSource(str2, z, str3));
        EnumC1237860iJk currentLoginUser3pPlatform = getCurrentLoginUser3pPlatform();
        if (currentLoginUser3pPlatform != null) {
            strName = currentLoginUser3pPlatform.name();
        } else {
            strName = null;
        }
        C786410Ut5.LJJJI("3p_platform", strName, bundle);
        bundle.putInt("config_key", i);
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIILL(bundle, str);
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.IForceBindingAccountService
    public boolean shouldShow3PDialog(C19EG c19eg, String str, String str2, IForceBindingAccountService.BindPromptConfig bindPromptConfig, boolean z) {
        String frequencyCacheKey;
        if (c19eg == null) {
            return false;
        }
        if (bindPromptConfig == null) {
            bindPromptConfig = getCacheOrDefaultConfig(c19eg);
        }
        if (z) {
            frequencyCacheKey = getFrequencyCacheKey(bindPromptConfig.projectId);
        } else {
            frequencyCacheKey = getFrequencyCacheKey(str, str2);
        }
        return shouldShowBasedOnConfig(bindPromptConfig, getLocalFrequencyCacheConfig(frequencyCacheKey), str2, c19eg);
    }

    @Override // com.ss.android.ugc.aweme.IForceBindingAccountService
    public void showDialog(Activity activity, IForceBindingAccountService.BindPromptConfig bindPromptConfig, String str, String str2, Integer num, Function0<Unit> function0, InterfaceC1237760iJa interfaceC1237760iJa) {
        String frequencyCacheKey = getFrequencyCacheKey(str, str2);
        if (!shouldShowBasedOnConfig(bindPromptConfig, getLocalFrequencyCacheConfig(frequencyCacheKey), str2, activity)) {
            if (interfaceC1237760iJa != null) {
                interfaceC1237760iJa.onDialogShow(false);
            }
        } else {
            showDialogInner$default(this, activity, bindPromptConfig.titleString, bindPromptConfig.descriptionString, bindPromptConfig.isSkippable, bindPromptConfig.buttons, bindPromptConfig.textFields, str, str2, bindPromptConfig.groupId, bindPromptConfig.showCloseBtn, num, null, null, null, bindPromptConfig.style, bindPromptConfig.shouldShowLearnMore, bindPromptConfig.nextPrompt, function0, interfaceC1237760iJa, bindPromptConfig.projectTag, 14336, null);
            if (bindPromptConfig.isSkippable) {
                updateSkippableFrequencyCachesAfterShow(bindPromptConfig, frequencyCacheKey);
            }
        }
    }

    public final void getAction(C1397620mTQ c1397620mTQ, Activity activity, boolean z, IForceBindingAccountService.BindPromptButtonConfig bindPromptButtonConfig, String str, String str2, int i, InterfaceC1237760iJa interfaceC1237760iJa, String str3) {
        String str4 = bindPromptButtonConfig.textType;
        int iHashCode = str4.hashCode();
        if (iHashCode != -1829997182) {
            if (iHashCode != -817598092) {
                if (iHashCode == -314765822 && str4.equals("primary")) {
                    c1397620mTQ.LIZJ(0, bindPromptButtonConfig.btnString, getActionClickListenerBasedOnActionType(activity, z, bindPromptButtonConfig, str, str2, i, null, null, interfaceC1237760iJa, str3));
                    return;
                }
                return;
            }
            if (!str4.equals("secondary")) {
                return;
            }
            c1397620mTQ.LIZJ(1, bindPromptButtonConfig.btnString, getActionClickListenerBasedOnActionType(activity, z, bindPromptButtonConfig, str, str2, i, null, null, interfaceC1237760iJa, str3));
            return;
        }
        if (!str4.equals("destructive")) {
            return;
        }
        c1397620mTQ.LIZJ(2, bindPromptButtonConfig.btnString, getActionClickListenerBasedOnActionType(activity, z, bindPromptButtonConfig, str, str2, i, null, null, interfaceC1237760iJa, str3));
    }

    private final Function1<C1397660mTU, Unit> getActionClickListenerBasedOnActionType(Activity activity, boolean z, IForceBindingAccountService.BindPromptButtonConfig bindPromptButtonConfig, String str, String str2, int i, String str3, Integer num, InterfaceC1237760iJa interfaceC1237760iJa, String str4) {
        return new AwS0S4511000_19(this, activity, z, bindPromptButtonConfig, str, str2, i, str3, num, interfaceC1237760iJa, str4, 0);
    }

    public final void showUnSafeOption(final Activity activity, final C197039127h c197039127h, final DialogInterface dialogInterface, final boolean z, final String str, final String str2, final int i, final String str3, final InterfaceC1237760iJa interfaceC1237760iJa, final String str4) {
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService.showUnSafeOption.1
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("ForceBindingAccountService@57d.showUnSafeOption$1");
                    com_ss_android_ugc_aweme_services_ForceBindingAccountService$showUnSafeOption$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("ForceBindingAccountService@57d.showUnSafeOption$1");
                }

                public final void com_ss_android_ugc_aweme_services_ForceBindingAccountService$showUnSafeOption$1__run$___twin___() {
                    User userLIZJ = C0XQ5.LIZJ();
                    if (userLIZJ != null && userLIZJ.isPhoneBinded()) {
                        ForceBindingAccountService.this.safeEnvCheckButtonStatus = EnumC1237800iJe.HIDDEN;
                        C197039127h c197039127h2 = c197039127h;
                        if (c197039127h2 != null) {
                            C786410Ut5.LLLLLLJ(c197039127h2, 8);
                            return;
                        }
                        return;
                    }
                    ForceBindingAccountService.this.safeEnvCheckButtonStatus = EnumC1237800iJe.ADD_PHONE;
                    C197039127h c197039127h3 = c197039127h;
                    if (c197039127h3 != null) {
                        c197039127h3.setText(activity.getString(2131850227));
                    }
                    C197039127h c197039127h4 = c197039127h;
                    if (c197039127h4 != null) {
                        c197039127h4.setLoading(false);
                    }
                    C197039127h c197039127h5 = c197039127h;
                    if (c197039127h5 != null) {
                        final ForceBindingAccountService forceBindingAccountService = ForceBindingAccountService.this;
                        final Activity activity2 = activity;
                        final DialogInterface dialogInterface2 = dialogInterface;
                        final boolean z2 = z;
                        final String str5 = str;
                        final String str6 = str2;
                        final int i2 = i;
                        final String str7 = str3;
                        final InterfaceC1237760iJa interfaceC1237760iJa2 = interfaceC1237760iJa;
                        final String str8 = str4;
                        C786410Ut5.U8(c197039127h5, new View.OnClickListener() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService.showUnSafeOption.1.1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ForceBindingAccountService.buttonOnClickBasedOnActionType$default(forceBindingAccountService, activity2, dialogInterface2, z2, new IForceBindingAccountService.BindPromptButtonConfig("", "phone_binding_unsafe", "", "", null), str5, str6, i2, str7, null, interfaceC1237760iJa2, null, str8, 1280, null);
                            }
                        });
                    }
                }

                public static void com_ss_android_ugc_aweme_services_ForceBindingAccountService$showUnSafeOption$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC2325791 runnableC2325791) {
                    try {
                        runnableC2325791.com_ss_android_ugc_aweme_services_ForceBindingAccountService$showUnSafeOption$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0cJQ, android.view.View] */
    private final void buildCustomDialogWithSafeEnvCheck(C1397580mTM c1397580mTM, final Activity activity, final IForceBindingAccountService.BindPromptButtonConfig bindPromptButtonConfig, final boolean z, List<IForceBindingAccountService.BindPromptButtonConfig> list, final String str, final String str2, final int i, final String str3, final InterfaceC1237760iJa interfaceC1237760iJa, final String str4) {
        final C1397510mTF c1397510mTF;
        C197039127h btn1;
        ?? r3 = new LinearLayout(activity) { // from class: X.0cJQ
            public final View LL;
            public final TuxTextView LLILLJJLI;
            public final C197039127h LLILLL;
            public final C197039127h LLILZ;

            public final C197039127h getBtn1() {
                return this.LLILLL;
            }

            public final C197039127h getBtn2() {
                return this.LLILZ;
            }

            public final TuxTextView getEmail() {
                return this.LLILLJJLI;
            }

            public final View getView() {
                return this.LL;
            }

            {
                super(activity, null, 0);
                View viewLJLLJ = C786410Ut5.LJLLJ(activity, R.layout.xt, this);
                this.LL = viewLJLLJ;
                this.LLILLJJLI = (TuxTextView) viewLJLLJ.findViewById(R.id.xsr);
                C197039127h c197039127h = (C197039127h) viewLJLLJ.findViewById(R.id.xsp);
                this.LLILLL = c197039127h;
                C197039127h c197039127h2 = (C197039127h) viewLJLLJ.findViewById(R.id.xsq);
                this.LLILZ = c197039127h2;
                c197039127h.LJJJJLI(true);
                c197039127h2.setTuxFont(101);
                c197039127h2.setTextColorRes(R.attr.a1j);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, activity);
                c197039127h2.setBackgroundColor(numLIZJ != null ? numLIZJ.intValue() : 0);
                c197039127h2.LJJJJLI(true);
            }
        };
        TuxTextView email = r3.getEmail();
        if (email != null) {
            email.setText(str3);
        }
        if ((!list.isEmpty()) && (btn1 = r3.getBtn1()) != null) {
            btn1.setText(((IForceBindingAccountService.BindPromptButtonConfig) ListProtector.get(list, 0)).btnString);
        }
        C197039127h btn2 = r3.getBtn2();
        if (btn2 != null) {
            btn2.setLoading(true);
        }
        C384000F3u.LIZ(c1397580mTM, r3);
        final C1397510mTF c1397510mTF2 = new C1397510mTF(c1397580mTM);
        C1391850mK7.LIZIZ(c1397510mTF2, "93");
        c1397510mTF2.LJ();
        C197039127h btn12 = r3.getBtn1();
        if (btn12 != null) {
            c1397510mTF = c1397510mTF2;
            C786410Ut5.U8(btn12, new View.OnClickListener() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService.buildCustomDialogWithSafeEnvCheck.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ForceBindingAccountService.buttonOnClickBasedOnActionType$default(ForceBindingAccountService.this, activity, c1397510mTF2, z, bindPromptButtonConfig, str, str2, i, str3, null, interfaceC1237760iJa, null, str4, 1280, null);
                }
            });
        } else {
            c1397510mTF = c1397510mTF2;
        }
        final C197039127h btn22 = r3.getBtn2();
        if (btn22 != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.safeEnvCheckButtonStatus = EnumC1237800iJe.LOADING;
            C852610XcZ c852610XcZ = InterfaceC852600XcY.LIZ;
            EnumC852630Xcb enumC852630Xcb = EnumC852630Xcb.ONE_P_POPUP;
            c852610XcZ.getClass();
            C852610XcZ.LIZ(enumC852630Xcb).LIZLLL(new InterfaceC2385309Wh() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$buildCustomDialogWithSafeEnvCheck$3$1
                /* JADX INFO: renamed from: then, reason: collision with other method in class */
                public final void m314then(C15O7<SafeEnvV2Response> c15o7) {
                    SafeEnvData safeEnvData;
                    int i2;
                    int i3 = 0;
                    if (!C09UZ.LIZLLL(c15o7) || (safeEnvData = c15o7.LJIIL().data) == null) {
                        this.this$0.showUnSafeOption(activity, btn22, c1397510mTF, z, str, str2, i, str3, interfaceC1237760iJa, str4);
                        i2 = -1;
                        C0XGR c0xgr = new C0XGR();
                        c0xgr.LIZ(i2, "error_code");
                        c0xgr.LIZ(i3, "is_safe");
                        c0xgr.LIZLLL("page", this.this$0.getPageValue("popup_change_1p_email", str4));
                        c0xgr.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "duration");
                        C20684815ws.LJIILLIIL("client_safe_env_check_result", c0xgr.LIZ);
                    }
                    i2 = safeEnvData.errorCode;
                    if (i2 == 0 && safeEnvData.safe) {
                        this.this$0.showSafeOption(activity, btn22, c1397510mTF, z, str, str2, i, str3, safeEnvData.passportTicket, interfaceC1237760iJa, str4);
                        i3 = 1;
                    } else {
                        this.this$0.showUnSafeOption(activity, btn22, c1397510mTF, z, str, str2, i, str3, interfaceC1237760iJa, str4);
                    }
                    C0XGR c0xgr2 = new C0XGR();
                    c0xgr2.LIZ(i2, "error_code");
                    c0xgr2.LIZ(i3, "is_safe");
                    c0xgr2.LIZLLL("page", this.this$0.getPageValue("popup_change_1p_email", str4));
                    c0xgr2.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "duration");
                    C20684815ws.LJIILLIIL("client_safe_env_check_result", c0xgr2.LIZ);
                }

                @Override // X.InterfaceC2385309Wh
                public /* bridge */ /* synthetic */ Object then(C15O7 c15o7) {
                    C1C7U.LIZ("ForceBindingAccountService@57d.buildCustomDialogWithSafeEnvCheck$3$1");
                    m314then((C15O7<SafeEnvV2Response>) c15o7);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ForceBindingAccountService@57d.buildCustomDialogWithSafeEnvCheck$3$1");
                    return unit;
                }
            });
        }
    }

    public final void getAction(C1397630mTR c1397630mTR, Activity activity, boolean z, IForceBindingAccountService.BindPromptButtonConfig bindPromptButtonConfig, String str, String str2, int i, String str3, Integer num, InterfaceC1237760iJa interfaceC1237760iJa, String str4) {
        String str5 = bindPromptButtonConfig.textType;
        if (Intrinsics.LJFF(str5, "primary")) {
            c1397630mTR.LIZJ(0, bindPromptButtonConfig.btnString, getActionClickListenerBasedOnActionType(activity, z, bindPromptButtonConfig, str, str2, i, str3, num, interfaceC1237760iJa, str4));
        } else {
            if (!Intrinsics.LJFF(str5, "secondary")) {
                return;
            }
            c1397630mTR.LIZJ(1, bindPromptButtonConfig.btnString, getActionClickListenerBasedOnActionType(activity, z, bindPromptButtonConfig, str, str2, i, str3, num, interfaceC1237760iJa, str4));
        }
    }

    public final void showSafeOption(final Activity activity, final C197039127h c197039127h, final DialogInterface dialogInterface, final boolean z, final String str, final String str2, final int i, final String str3, final String str4, final InterfaceC1237760iJa interfaceC1237760iJa, final String str5) {
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService.showSafeOption.1
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("ForceBindingAccountService@57d.showSafeOption$1");
                    com_ss_android_ugc_aweme_services_ForceBindingAccountService$showSafeOption$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("ForceBindingAccountService@57d.showSafeOption$1");
                }

                public final void com_ss_android_ugc_aweme_services_ForceBindingAccountService$showSafeOption$1__run$___twin___() {
                    ForceBindingAccountService.this.safeEnvCheckButtonStatus = EnumC1237800iJe.CHANGE_EMAIL;
                    C197039127h c197039127h2 = c197039127h;
                    if (c197039127h2 != null) {
                        c197039127h2.setText(activity.getString(2131857864));
                    }
                    C197039127h c197039127h3 = c197039127h;
                    if (c197039127h3 != null) {
                        c197039127h3.setLoading(false);
                    }
                    C197039127h c197039127h4 = c197039127h;
                    if (c197039127h4 != null) {
                        final ForceBindingAccountService forceBindingAccountService = ForceBindingAccountService.this;
                        final Activity activity2 = activity;
                        final DialogInterface dialogInterface2 = dialogInterface;
                        final boolean z2 = z;
                        final String str6 = str;
                        final String str7 = str2;
                        final int i2 = i;
                        final String str8 = str3;
                        final InterfaceC1237760iJa interfaceC1237760iJa2 = interfaceC1237760iJa;
                        final String str9 = str4;
                        final String str10 = str5;
                        C786410Ut5.U8(c197039127h4, new View.OnClickListener() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService.showSafeOption.1.1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ForceBindingAccountService.buttonOnClickBasedOnActionType$default(forceBindingAccountService, activity2, dialogInterface2, z2, new IForceBindingAccountService.BindPromptButtonConfig("", "email_changing_safe", "", "", null), str6, str7, i2, str8, null, interfaceC1237760iJa2, str9, str10, 256, null);
                            }
                        });
                    }
                }

                public static void com_ss_android_ugc_aweme_services_ForceBindingAccountService$showSafeOption$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC2325781 runnableC2325781) {
                    try {
                        runnableC2325781.com_ss_android_ugc_aweme_services_ForceBindingAccountService$showSafeOption$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void buttonOnClickBasedOnActionType(Activity activity, DialogInterface dialogInterface, boolean z, IForceBindingAccountService.BindPromptButtonConfig bindPromptButtonConfig, String str, String str2, int i, String str3, Integer num, InterfaceC1237760iJa interfaceC1237760iJa, String str4, String str5) {
        boolean z2;
        final ForceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1 forceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1 = new ForceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1(this, str, str2, interfaceC1237760iJa, dialogInterface);
        C0XUD.LIZ.getClass();
        C0XUD.LJIIJJI = false;
        String str6 = bindPromptButtonConfig.actionType;
        IBindService iBindServiceLJII = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJII();
        Bundle commonBundle = getCommonBundle(str, str2, z, i, str6);
        switch (str6.hashCode()) {
            case -1761707103:
                if (str6.equals("non1p_phone_binding")) {
                    this.closeBtnScene = EnumC589810NBj.IS_NOT_CLICKED;
                    if (interfaceC1237760iJa != null) {
                        interfaceC1237760iJa.onButtonClick("non1p_phone_binding");
                    }
                    if (str3 != null) {
                        C852810Xct.LIZ.getClass();
                        C852810Xct.LJIJI(commonBundle, str3);
                    }
                    if (num != null) {
                        commonBundle.putInt("non1p_binding_type", num.intValue());
                    }
                    C786410Ut5.LJJJI("page", getPageValue("popup_binding_verification", str5), commonBundle);
                    iBindServiceLJII.verifyNon1pMobile(activity, str, "click_link_existing", commonBundle, new C0XTR() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$sam$com_ss_android_ugc_aweme_IAccountService_OnLoginAndLogoutResult$0
                        @Override // X.C0XTR
                        public final /* synthetic */ void onResult(int i2, int i3, Object obj) {
                            forceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1.invoke(Integer.valueOf(i2), Integer.valueOf(i3), obj);
                        }
                    });
                }
                break;
            case -1581024305:
                if (str6.equals("non1p_email_binding")) {
                    this.closeBtnScene = EnumC589810NBj.IS_NOT_CLICKED;
                    if (interfaceC1237760iJa != null) {
                        interfaceC1237760iJa.onButtonClick("non1p_email_binding");
                    }
                    if (str3 != null) {
                        C852810Xct.LIZ.getClass();
                        C852810Xct.LJIILLIIL(commonBundle, str3);
                    }
                    if (num != null) {
                        commonBundle.putInt("non1p_binding_type", num.intValue());
                    }
                    C786410Ut5.LJJJI("page", getPageValue("popup_binding_verification", str5), commonBundle);
                    iBindServiceLJII.bindEmailFor3PWithCode(activity, str, "click_link_existing", commonBundle, new C0XTR() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$sam$com_ss_android_ugc_aweme_IAccountService_OnLoginAndLogoutResult$0
                        @Override // X.C0XTR
                        public final /* synthetic */ void onResult(int i2, int i3, Object obj) {
                            forceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1.invoke(Integer.valueOf(i2), Integer.valueOf(i3), obj);
                        }
                    });
                }
                break;
            case -1097329270:
                if (str6.equals("logout")) {
                    if (interfaceC1237760iJa != null) {
                        interfaceC1237760iJa.onButtonClick("logout");
                    }
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                }
                break;
            case -1035062242:
                if (str6.equals("phone_changing")) {
                    this.closeBtnScene = EnumC589810NBj.IS_NOT_CLICKED;
                    if (interfaceC1237760iJa != null) {
                        interfaceC1237760iJa.onButtonClick("phone_changing");
                    }
                    C786410Ut5.LJJJI("page", getPageValue("popup_binding_verification", str5), commonBundle);
                    iBindServiceLJII.bindMobileOrEmail(activity, str, "click_change", commonBundle, false, new C0XTR() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$sam$com_ss_android_ugc_aweme_IAccountService_OnLoginAndLogoutResult$0
                        @Override // X.C0XTR
                        public final /* synthetic */ void onResult(int i2, int i3, Object obj) {
                            forceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1.invoke(Integer.valueOf(i2), Integer.valueOf(i3), obj);
                        }
                    });
                }
                break;
            case -495824123:
                if (str6.equals("verify_email_v2")) {
                    this.closeBtnScene = EnumC589810NBj.IS_NOT_CLICKED;
                    if (interfaceC1237760iJa != null) {
                        interfaceC1237760iJa.onButtonClick("verify_email_v2");
                    }
                    if (str3 != null) {
                        C852810Xct.LIZ.getClass();
                        C852810Xct.LJIILLIIL(commonBundle, str3);
                    }
                    commonBundle.putBoolean("do_safe_env_check", false);
                    C852810Xct c852810Xct = C852810Xct.LIZ;
                    String pageValue = getPageValue("popup_verify_1p_email", str5);
                    c852810Xct.getClass();
                    C786410Ut5.LJJJI("page", pageValue, commonBundle);
                    iBindServiceLJII.verifyEmailFor3P(activity, str, "click_verify_existing", commonBundle, new C0XTR() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$sam$com_ss_android_ugc_aweme_IAccountService_OnLoginAndLogoutResult$0
                        @Override // X.C0XTR
                        public final /* synthetic */ void onResult(int i2, int i3, Object obj) {
                            forceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1.invoke(Integer.valueOf(i2), Integer.valueOf(i3), obj);
                        }
                    });
                }
                break;
            case -280283050:
                if (str6.equals("verify_email")) {
                    if (str3 != null) {
                        C852810Xct.LIZ.getClass();
                        C852810Xct.LJIILLIIL(commonBundle, str3);
                    }
                    if (interfaceC1237760iJa != null) {
                        interfaceC1237760iJa.onButtonClick("verify_email");
                    }
                    C852810Xct c852810Xct2 = C852810Xct.LIZ;
                    String pageValue2 = getPageValue("popup_verify_1p_email", str5);
                    c852810Xct2.getClass();
                    C786410Ut5.LJJJI("page", pageValue2, commonBundle);
                    commonBundle.putBoolean("do_safe_env_check", true);
                    iBindServiceLJII.verifyEmailFor3P(activity, str, "click_verify_existing", commonBundle, new C0XTR() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$sam$com_ss_android_ugc_aweme_IAccountService_OnLoginAndLogoutResult$0
                        @Override // X.C0XTR
                        public final /* synthetic */ void onResult(int i2, int i3, Object obj) {
                            forceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1.invoke(Integer.valueOf(i2), Integer.valueOf(i3), obj);
                        }
                    });
                }
                break;
            case 67608465:
                if (str6.equals("phone_binding_unsafe")) {
                    this.closeBtnScene = EnumC589810NBj.IS_NOT_CLICKED;
                    if (interfaceC1237760iJa != null) {
                        interfaceC1237760iJa.onButtonClick("phone_binding_unsafe");
                    }
                    C852810Xct.LIZ.getClass();
                    C786410Ut5.LJJJI("page", "popup_add_phone_1p_email", commonBundle);
                    iBindServiceLJII.bindMobile(activity, str, "click_try_phone", commonBundle, false, new C0XTR() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$sam$com_ss_android_ugc_aweme_IAccountService_OnLoginAndLogoutResult$0
                        @Override // X.C0XTR
                        public final /* synthetic */ void onResult(int i2, int i3, Object obj) {
                            forceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1.invoke(Integer.valueOf(i2), Integer.valueOf(i3), obj);
                        }
                    });
                }
                break;
            case 89277620:
                if (str6.equals("phone_binding")) {
                    this.closeBtnScene = EnumC589810NBj.IS_NOT_CLICKED;
                    if (interfaceC1237760iJa != null) {
                        interfaceC1237760iJa.onButtonClick("phone_binding");
                    }
                    C786410Ut5.LJJJI("page", getPageValue("popup_binding_verification", str5), commonBundle);
                    commonBundle.putBoolean("is_skippable", z);
                    if (C0XQ5.LIZJ().isHasEmail()) {
                        iBindServiceLJII.bindMobile(activity, str, str2, commonBundle, false, new C0XTR() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$sam$com_ss_android_ugc_aweme_IAccountService_OnLoginAndLogoutResult$0
                            @Override // X.C0XTR
                            public final /* synthetic */ void onResult(int i2, int i3, Object obj) {
                                forceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1.invoke(Integer.valueOf(i2), Integer.valueOf(i3), obj);
                            }
                        });
                    } else {
                        iBindServiceLJII.bindMobileOrEmail(activity, str, str2, commonBundle, false, new C0XTR() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$sam$com_ss_android_ugc_aweme_IAccountService_OnLoginAndLogoutResult$0
                            @Override // X.C0XTR
                            public final /* synthetic */ void onResult(int i2, int i3, Object obj) {
                                forceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1.invoke(Integer.valueOf(i2), Integer.valueOf(i3), obj);
                            }
                        });
                    }
                }
                break;
            case 269960418:
                if (str6.equals("email_binding")) {
                    this.closeBtnScene = EnumC589810NBj.IS_NOT_CLICKED;
                    if (interfaceC1237760iJa != null) {
                        interfaceC1237760iJa.onButtonClick("email_binding");
                    }
                    C786410Ut5.LJJJI("page", getPageValue("popup_binding_verification", str5), commonBundle);
                    commonBundle.putBoolean("is_skippable", z);
                    iBindServiceLJII.bindEmailOrMobile(activity, str, str2, commonBundle, new C0XTR() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$sam$com_ss_android_ugc_aweme_IAccountService_OnLoginAndLogoutResult$0
                        @Override // X.C0XTR
                        public final /* synthetic */ void onResult(int i2, int i3, Object obj) {
                            forceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1.invoke(Integer.valueOf(i2), Integer.valueOf(i3), obj);
                        }
                    });
                }
                break;
            case 271137200:
                if (str6.equals("email_changing")) {
                    this.closeBtnScene = EnumC589810NBj.IS_NOT_CLICKED;
                    if (interfaceC1237760iJa != null) {
                        interfaceC1237760iJa.onButtonClick("email_changing");
                    }
                    C786410Ut5.LJJJI("page", getPageValue("popup_binding_verification", str5), commonBundle);
                    iBindServiceLJII.bindEmailOrMobile(activity, str, "click_change", commonBundle, new C0XTR() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$sam$com_ss_android_ugc_aweme_IAccountService_OnLoginAndLogoutResult$0
                        @Override // X.C0XTR
                        public final /* synthetic */ void onResult(int i2, int i3, Object obj) {
                            forceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1.invoke(Integer.valueOf(i2), Integer.valueOf(i3), obj);
                        }
                    });
                }
                break;
            case 393727164:
                if (str6.equals("email_changing_safe")) {
                    this.closeBtnScene = EnumC589810NBj.IS_NOT_CLICKED;
                    if (interfaceC1237760iJa != null) {
                        interfaceC1237760iJa.onButtonClick("email_changing_safe");
                    }
                    C786410Ut5.LJJJI("passport_ticket", str4, commonBundle);
                    if (!C0XQ5.LIZJ().isPhoneBinded()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    commonBundle.putBoolean("use_phone", z2);
                    C852810Xct c852810Xct3 = C852810Xct.LIZ;
                    String pageValue3 = getPageValue("popup_change_1p_email", str5);
                    c852810Xct3.getClass();
                    C786410Ut5.LJJJI("page", pageValue3, commonBundle);
                    iBindServiceLJII.changeUnverifiedEmail(activity, str, "click_change", commonBundle, false, new C0XTR() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$sam$com_ss_android_ugc_aweme_IAccountService_OnLoginAndLogoutResult$0
                        @Override // X.C0XTR
                        public final /* synthetic */ void onResult(int i2, int i3, Object obj) {
                            forceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1.invoke(Integer.valueOf(i2), Integer.valueOf(i3), obj);
                        }
                    });
                }
                break;
            case 629233382:
                if (str6.equals("deeplink")) {
                    SmartRouter.buildRoute(activity, bindPromptButtonConfig.deeplinkUrl).open();
                    if (interfaceC1237760iJa != null) {
                        interfaceC1237760iJa.onButtonClick("deeplink");
                    }
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                }
                break;
            case 1671672458:
                if (str6.equals("dismiss")) {
                    if (interfaceC1237760iJa != null) {
                        interfaceC1237760iJa.onButtonClick("dismiss");
                    }
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                }
                break;
        }
    }

    private final void buildSheet(C19EG c19eg, Integer num, String str, String str2, IForceBindingAccountService.BindPromptButtonConfig bindPromptButtonConfig, List<IForceBindingAccountService.TextFieldData> list, final String str3, int i, boolean z, boolean z2, boolean z3, IForceBindingAccountService.NextPrompt nextPrompt, final Function0<Unit> function0, final String str4) {
        boolean z4;
        final Fragment phoneBindSheetFragment;
        boolean z5;
        IForceBindingAccountService.TextFieldData textFieldData;
        C0XUD.LIZ.getClass();
        C0XUD.LJIIJJI = false;
        String str5 = bindPromptButtonConfig.actionType;
        if (!Intrinsics.LJFF(str5, "email_binding_in_sheet_full_screen") && !Intrinsics.LJFF(str5, "phone_binding_in_sheet_full_screen")) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean zLJFF = Intrinsics.LJFF(str5, "email_binding_in_sheet_full_screen");
        if (zLJFF) {
            phoneBindSheetFragment = new EmailBindSheetFragment();
        } else {
            phoneBindSheetFragment = new PhoneBindSheetFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_full_screen_otp", z4);
        if (zLJFF) {
            C786410Ut5.LJJJI("email_sheet_title", str, bundle);
            C786410Ut5.LJJJI("email_sheet_desc", str2, bundle);
            C786410Ut5.LJJJI("email_sheet_action_type", str5, bundle);
            bundle.putInt("current_page", EnumC852910Xd3.EMAIL_BIND_SHEET.getValue());
            bundle.putInt("current_scene", EnumC852660Xce.BIND_EMAIL.getValue());
        } else {
            C786410Ut5.LJJJI("phone_sheet_title", str, bundle);
            C786410Ut5.LJJJI("phone_sheet_desc", str2, bundle);
            C786410Ut5.LJJJI("phone_sheet_action_type", str5, bundle);
            bundle.putInt("current_page", EnumC852910Xd3.PHONE_BIND_SHEET.getValue());
            bundle.putInt("current_scene", EnumC852660Xce.BIND_PHONE.getValue());
        }
        bundle.putBoolean("should_show_learn_more", z3);
        C786410Ut5.LJJIZ(bundle, "next_prompt", nextPrompt);
        bundle.putInt("phone_number_source", getMobileBindSource("3p_bind_combined_popup", z, str5));
        bundle.putInt("email_source", getEmailBindSource("3p_bind_combined_popup", z, str5));
        C786410Ut5.LJJJI("enter_from", str3, bundle);
        C786410Ut5.LJJJI("enter_method", "3p_bind_combined_popup", bundle);
        if (list != null && (textFieldData = (IForceBindingAccountService.TextFieldData) C13LP.LJJJLL(list)) != null) {
            z5 = textFieldData.keyBoardAutoRaise;
        } else {
            z5 = false;
        }
        bundle.putBoolean("keyboard_auto_raise", z5);
        C786410Ut5.LJJJI("page", getPageValue("popup_simplified_binding", str4), bundle);
        C786410Ut5.LJJJI("popup_freq", String.valueOf(getPopupFreq(num) + 1), bundle);
        bundle.putBoolean("show_close_button", z2);
        bundle.putInt("config_key", i);
        phoneBindSheetFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = phoneBindSheetFragment;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLILLL = false;
        tuxSheet.LLJLLIL = z;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLILZIL = true;
        c1390920mIc.LJI(16);
        c1390920mIc.LIZ.LL = new DialogInterface.OnCancelListener() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$buildSheet$tuxSheet$1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                String str6;
                C854460XfY.LIZ.getClass();
                String str7 = "";
                if (Intrinsics.LJFF(C854460XfY.LJI().get("is_success"), "bind_success")) {
                    str6 = "success";
                } else {
                    String str8 = TuxSheet._pnsPageId;
                    AbstractC343940De4 abstractC343940De4LJIIJ = C1391190mJ3.LJIIJ(dialogInterface);
                    if (Intrinsics.LJFF(abstractC343940De4LJIIJ, C343980De8.LIZ)) {
                        str6 = "click_x";
                    } else if (Intrinsics.LJFF(abstractC343940De4LJIIJ, C343960De6.LIZ)) {
                        str6 = "click_go_back";
                    } else if (!Intrinsics.LJFF(abstractC343940De4LJIIJ, C343970De7.LIZ)) {
                        str6 = "";
                    } else {
                        str6 = "click_outside";
                    }
                }
                String str9 = (String) C854460XfY.LJI().get("current_page");
                if (str9 != null) {
                    int iHashCode = str9.hashCode();
                    if (iHashCode != 325998158) {
                        if (iHashCode != 466457662) {
                            if (iHashCode == 1453211488 && str9.equals("EMAIL_BIND_SHEET")) {
                                CloseEmailBindingShowEvent closeEmailBindingShowEvent = new CloseEmailBindingShowEvent();
                                Object obj = C854460XfY.LJI().get("enter_from");
                                if (obj == null) {
                                    obj = "";
                                }
                                closeEmailBindingShowEvent.LJI(obj, "enter_from");
                                Object obj2 = C854460XfY.LJI().get("enter_method");
                                if (obj2 == null) {
                                    obj2 = "";
                                }
                                closeEmailBindingShowEvent.LJI(obj2, "enter_method");
                                closeEmailBindingShowEvent.LJI(this.this$0.getPageValue("popup_simplified_binding", str4), "page");
                                closeEmailBindingShowEvent.LJI(str6, "exit_method");
                                Object obj3 = C854460XfY.LJI().get("exit_page");
                                Object obj4 = str7;
                                if (obj3 != null) {
                                    obj4 = obj3;
                                }
                                closeEmailBindingShowEvent.LJI(obj4, "exit_page");
                                closeEmailBindingShowEvent.LJIIIIZZ();
                                C849850XVn.LIZIZ.LIZJ().LJIJI("101", "popup_close", false);
                                return;
                            }
                            return;
                        }
                        if (!str9.equals("CREATE_PASSWORD_SHEET")) {
                            return;
                        }
                        C0XGR c0xgr = new C0XGR();
                        String str10 = (String) C854460XfY.LJI().get("enter_from");
                        if (str10 == null) {
                            str10 = "";
                        }
                        c0xgr.LIZLLL("enter_from", str10);
                        String str11 = (String) C854460XfY.LJI().get("enter_method");
                        String str12 = str7;
                        if (str11 != null) {
                            str12 = str11;
                        }
                        c0xgr.LIZLLL("enter_method", str12);
                        c0xgr.LIZLLL("page", this.this$0.getPageValue("popup_simplified_binding", str4));
                        c0xgr.LIZLLL("exit_method", str6);
                        C20684815ws.LJIILLIIL("close_password_creation_show", c0xgr.LIZ);
                        C849850XVn.LIZIZ.LIZJ().LJIJI("101", "popup_close", false);
                        return;
                    }
                    if (!str9.equals("PHONE_BIND_SHEET")) {
                        return;
                    }
                    ClosePhoneBindingShowEvent closePhoneBindingShowEvent = new ClosePhoneBindingShowEvent();
                    Object obj5 = C854460XfY.LJI().get("enter_from");
                    if (obj5 == null) {
                        obj5 = "";
                    }
                    closePhoneBindingShowEvent.LJI(obj5, "enter_from");
                    Object obj6 = C854460XfY.LJI().get("enter_method");
                    if (obj6 == null) {
                        obj6 = "";
                    }
                    closePhoneBindingShowEvent.LJI(obj6, "enter_method");
                    closePhoneBindingShowEvent.LJI(this.this$0.getPageValue("popup_simplified_binding", str4), "page");
                    closePhoneBindingShowEvent.LJI(str6, "exit_method");
                    Object obj7 = C854460XfY.LJI().get("exit_page");
                    Object obj8 = str7;
                    if (obj7 != null) {
                        obj8 = obj7;
                    }
                    closePhoneBindingShowEvent.LJI(obj8, "exit_page");
                    closePhoneBindingShowEvent.LJIIIIZZ();
                    C849850XVn.LIZIZ.LIZJ().LJIJI("101", "popup_close", false);
                }
            }
        };
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$buildSheet$tuxSheet$2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                IOneClickLoginService iOneClickLoginService;
                CommonInputEmailFragment commonInputEmailFragment;
                C0I7D c0i7d;
                PhoneBindSheetFragment phoneBindSheetFragment2;
                InputMethodManager inputMethodManager;
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("fix_account_keyboard_dismiss", true)) {
                    Object obj = phoneBindSheetFragment;
                    if ((obj instanceof PhoneBindSheetFragment) && (phoneBindSheetFragment2 = (PhoneBindSheetFragment) obj) != null) {
                        C1238240iKM c1238240iKMQS = phoneBindSheetFragment2.QS();
                        if (c1238240iKMQS != null) {
                            KeyboardUtils.LIZIZ(c1238240iKMQS.getEditText());
                        }
                        if (PhoneBindSheetFragment.LLLL != null) {
                            Object objH2 = C786410Ut5.H2(C1948707kD.LIZ().getApplicationContext(), "input_method");
                            if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
                                inputMethodManager.hideSoftInputFromWindow(PhoneBindSheetFragment.LLLL, 0);
                            }
                        }
                    } else if ((obj instanceof EmailBindSheetFragment) && (commonInputEmailFragment = (CommonInputEmailFragment) obj) != null && (c0i7d = commonInputEmailFragment.LLLJIL) != null) {
                        KeyboardUtils.LIZIZ(c0i7d);
                    }
                }
                C854460XfY.LIZ.getClass();
                if (Intrinsics.LJFF(C854460XfY.LJI().get("is_success"), "bind_success")) {
                    this.clearCurrentCacheConfig();
                    if (Intrinsics.LJFF(C854460XfY.LJI().get("ocl_checkbox_checked"), "is_checked") && (iOneClickLoginService = (IOneClickLoginService) PluggableExtentionKt.pluggableSpi$default(IOneClickLoginService.class, false, false, false, 14, null)) != null) {
                        iOneClickLoginService.LJIIL(C0XWD.FYP_POP_UP, str3, "3p_bind_combined_popup", null, null);
                    }
                }
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        };
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLILLJJLI = onDismissListener;
        C1391850mK7.LIZIZ(tuxSheet2, "101");
        tuxSheet2.show(c19eg.getSupportFragmentManager(), "ForceBindingAccService");
    }

    public static /* synthetic */ void buttonOnClickBasedOnActionType$default(ForceBindingAccountService forceBindingAccountService, Activity activity, DialogInterface dialogInterface, boolean z, IForceBindingAccountService.BindPromptButtonConfig bindPromptButtonConfig, String str, String str2, int i, String str3, Integer num, InterfaceC1237760iJa interfaceC1237760iJa, String str4, String str5, int i2, Object obj) {
        DialogInterface dialogInterface2 = dialogInterface;
        String str6 = str5;
        Integer num2 = num;
        String str7 = str3;
        String str8 = null;
        if ((i2 & 2) != 0) {
            dialogInterface2 = null;
        }
        if ((i2 & 128) != 0) {
            str7 = null;
        }
        if ((i2 & 256) != 0) {
            num2 = null;
        }
        if ((i2 & 1024) == 0) {
            str8 = str4;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str6 = "";
        }
        forceBindingAccountService.buttonOnClickBasedOnActionType(activity, dialogInterface2, z, bindPromptButtonConfig, str, str2, i, str7, num2, interfaceC1237760iJa, str8, str6);
    }

    private final void showDialogInner(Activity activity, String str, String str2, boolean z, List<IForceBindingAccountService.BindPromptButtonConfig> list, List<IForceBindingAccountService.TextFieldData> list2, String str3, String str4, int i, boolean z2, Integer num, String str5, Integer num2, Integer num3, String str6, boolean z3, IForceBindingAccountService.NextPrompt nextPrompt, Function0<Unit> function0, InterfaceC1237760iJa interfaceC1237760iJa, String str7) {
        C19EG c19eg;
        String str8 = str2;
        IForceBindingAccountService.BindPromptButtonConfig firstButtonConfig = getFirstButtonConfig(list);
        CharSequence charSequenceLIZIZ = str8;
        if (Intrinsics.LJFF(str6, "half_sheet")) {
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
                buildSheet(c19eg, num3, str, str8, firstButtonConfig, list2, str3, i, z, z2, z3, nextPrompt, function0, str7);
                return;
            }
            return;
        }
        if (z3) {
            charSequenceLIZIZ = C1239020iLc.LIZIZ(activity, str8, 31, null, 24);
        }
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        c1397580mTM.LJI(str);
        c1397580mTM.LIZIZ(charSequenceLIZIZ);
        c1397580mTM.LJII = false;
        c1397580mTM.LJIIIIZZ = z2;
        c1397580mTM.LIZLLL(new AwS106S0110000_19((Function0) function0, (Function0<Unit>) z2, true));
        if (num != null) {
            C1235760iGM.LIZ(c1397580mTM, num.intValue(), null, 6);
        }
        if (list.size() >= 2 && (Intrinsics.LJFF(((IForceBindingAccountService.BindPromptButtonConfig) ListProtector.get(list, 1)).actionType, "change_email_bind_mobile_by_safe_env") || Intrinsics.LJFF(((IForceBindingAccountService.BindPromptButtonConfig) ListProtector.get(list, 1)).actionType, "change_email_only_by_safe_env"))) {
            buildCustomDialogWithSafeEnvCheck(c1397580mTM, activity, firstButtonConfig, z, list, str3, str4, i, str5, interfaceC1237760iJa, str7);
        } else {
            if (str5 != null) {
                final TuxTextView tuxTextView = new TuxTextView(activity, null, 6, 0);
                tuxTextView.setText(str5);
                tuxTextView.setTuxFont(22);
                tuxTextView.setGravity(1);
                tuxTextView.setMinTextSize(17.0f);
                tuxTextView.setMaxLines(1);
                if (Build.VERSION.SDK_INT >= 29) {
                    tuxTextView.setBreakStrategy(0);
                }
                C384000F3u.LIZ(c1397580mTM, tuxTextView);
                HandlerHook.viewPost(tuxTextView, new Runnable() { // from class: com.ss.android.ugc.aweme.services.ForceBindingAccountService$showDialogInner$3$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("ForceBindingAccountService@57d.showDialogInner$3$1");
                        com_ss_android_ugc_aweme_services_ForceBindingAccountService$showDialogInner$3$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        C1C7U.LIZIZ("ForceBindingAccountService@57d.showDialogInner$3$1");
                    }

                    public final void com_ss_android_ugc_aweme_services_ForceBindingAccountService$showDialogInner$3$1__run$___twin___() {
                        if (tuxTextView.getLineCount() > 1) {
                            TuxTextView tuxTextView2 = tuxTextView;
                            tuxTextView2.setMaxLines(2);
                            tuxTextView2.setMinTextSize(12.0f);
                            tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }

                    public static void com_ss_android_ugc_aweme_services_ForceBindingAccountService$showDialogInner$3$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(ForceBindingAccountService$showDialogInner$3$1 forceBindingAccountService$showDialogInner$3$1) {
                        try {
                            forceBindingAccountService$showDialogInner$3$1.com_ss_android_ugc_aweme_services_ForceBindingAccountService$showDialogInner$3$1__run$___twin___();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }
                });
            }
            if (Intrinsics.LJFF(((IForceBindingAccountService.BindPromptButtonConfig) ListProtector.get(list, 0)).styleType, "button")) {
                C1238130iKB.LIZ(c1397580mTM, new AwS0S4511000_19((List) list, (List<IForceBindingAccountService.BindPromptButtonConfig>) this, (ForceBindingAccountService) activity, (Activity) z, (boolean) str3, str4, (String) i, (int) str5, (String) num2, (Integer) interfaceC1237760iJa, (InterfaceC1237760iJa) str7, (String) 1));
            } else {
                C985403tE.LIZ(c1397580mTM, new AnonymousClass5(list, this, activity, z, str3, str4, i, interfaceC1237760iJa, str7));
            }
            C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
            C1391850mK7.LIZIZ(c1397510mTF, "93");
            c1397510mTF.LIZLLL();
        }
        if (interfaceC1237760iJa != null) {
            interfaceC1237760iJa.onDialogShow(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showDialogInner$default(ForceBindingAccountService forceBindingAccountService, Activity activity, String str, String str2, boolean z, List list, List list2, String str3, String str4, int i, boolean z2, Integer num, String str5, Integer num2, Integer num3, String str6, boolean z3, IForceBindingAccountService.NextPrompt nextPrompt, Function0 function0, InterfaceC1237760iJa interfaceC1237760iJa, String str7, int i2, Object obj) {
        Integer num4 = num3;
        String str8 = str7;
        Integer num5 = num2;
        String str9 = str5;
        Integer num6 = num;
        Function0 function02 = null;
        if ((i2 & 1024) != 0) {
            num6 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str9 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num5 = null;
        }
        if ((i2 & 8192) != 0) {
            num4 = null;
        }
        if ((131072 & i2) == 0) {
            function02 = function0;
        }
        if ((i2 & 524288) != 0) {
            str8 = "";
        }
        forceBindingAccountService.showDialogInner(activity, str, str2, z, list, list2, str3, str4, i, z2, num6, str9, num5, num4, str6, z3, nextPrompt, function02, interfaceC1237760iJa, str8);
    }
}
