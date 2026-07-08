package kotlin.jvm.internal;

import X.AbstractC848400XPy;
import X.C013C;
import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C0N1L;
import X.C0XQ7;
import X.C1215770hk7;
import X.C1228470i4b;
import X.C1231860iA4;
import X.C1231880iA6;
import X.C1238240iKM;
import X.C1248430ian;
import X.C1251930igR;
import X.C1252230igv;
import X.C1397620mTQ;
import X.C1558420qem;
import X.C1558520qew;
import X.C2188811AlT;
import X.C459080HzO;
import X.EnumC1248480ias;
import X.InterfaceC1231870iA5;
import X.ViewOnFocusChangeListenerC1265950j33;
import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAExperiment;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAPhase2Experiment;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SmsInputViewModel;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.AlternativeNetworkService;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.business.ug.ProfileNavbarMoreProtocol;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.business.header.base.IHeaderBaseAbility;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.redpoint.UserProfileBlockVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS25S2200000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS25S2200000_19 awS25S2200000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, awS25S2200000_19.s0, new AwS385S0200000_19((SystemShareActivity) awS25S2200000_19.l2, (String[]) awS25S2200000_19.l3, 7));
        c1397620mTQ.LIZJ(1, awS25S2200000_19.s1, new AwS598S0100000_19((SystemShareActivity) awS25S2200000_19.l2, 13));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS25S2200000_19 awS25S2200000_19, Object obj) {
        if (!((C013C) awS25S2200000_19.l2).element) {
            C1215770hk7.LIZ.getClass();
            Keva kevaLIZ = C1215770hk7.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("nickname_to_username_pop_up_shown_count");
            sbLIZ.append('_');
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            int i = kevaLIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
            Keva kevaLIZ2 = C1215770hk7.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("nickname_to_username_pop_up_shown_count");
            sbLIZ2.append('_');
            sbLIZ2.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            kevaLIZ2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i + 1);
        }
        ((InterfaceC1231870iA5) awS25S2200000_19.l3).LIZ(awS25S2200000_19.s0, ((C013C) awS25S2200000_19.l2).element);
        C1231880iA6 c1231880iA6 = C1231880iA6.LIZ;
        boolean z = ((C013C) awS25S2200000_19.l2).element;
        String str = awS25S2200000_19.s1;
        c1231880iA6.getClass();
        C1231880iA6.LIZ(str, true, z);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS25S2200000_19 awS25S2200000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131845401, new AwS25S2200000_19((C013C) awS25S2200000_19.l2, (InterfaceC1231870iA5) awS25S2200000_19.l3, awS25S2200000_19.s0, awS25S2200000_19.s1, 1));
        c1397620mTQ.LJII(2131845402, new AwS103S1200000_19((InterfaceC1231870iA5) awS25S2200000_19.l3, awS25S2200000_19.s1, (C013C) awS25S2200000_19.l2, 6));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS25S2200000_19 awS25S2200000_19, Object obj) {
        int i;
        String str;
        UserRelationInfo userRelationInfo;
        UserRelationInfo userRelationInfo2;
        Integer followStatus;
        C1252230igv c1252230igvCA1;
        Boolean bool = (Boolean) obj;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            i = 4;
        } else {
            i = 0;
        }
        UserProfileBlockVM userProfileBlockVMLJLI = ((ProfileNavbarMoreProtocol) awS25S2200000_19.l2).LJLI();
        if (userProfileBlockVMLJLI != null) {
            userProfileBlockVMLJLI.vQ2(((ProfileNavbarMoreProtocol) awS25S2200000_19.l2).getContext(), 1, awS25S2200000_19.s0, i, awS25S2200000_19.s1);
        }
        C0N1L.LIZ("success", awS25S2200000_19.s0, "others_homepage");
        C1251930igR.LIZ(bool, "confirm");
        ProfileNavbarMoreProtocol profileNavbarMoreProtocol = (ProfileNavbarMoreProtocol) awS25S2200000_19.l2;
        profileNavbarMoreProtocol.getClass();
        User user = null;
        IHeaderBaseAbility iHeaderBaseAbility = (IHeaderBaseAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(profileNavbarMoreProtocol), IHeaderBaseAbility.class, null);
        if (iHeaderBaseAbility != null && (c1252230igvCA1 = iHeaderBaseAbility.cA1()) != null) {
            str = c1252230igvCA1.LLILZLL;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, "chat")) {
            C0N1L.LIZ("chat", awS25S2200000_19.s0, "");
        }
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ((ProfileNavbarMoreProtocol) awS25S2200000_19.l2), UserProfileAbility.class, null);
        if (userProfileAbility != null) {
            user = userProfileAbility.getUser();
        }
        ProfileCommonInfo profileCommonInfo = (ProfileCommonInfo) awS25S2200000_19.l3;
        if (profileCommonInfo == null || (userRelationInfo2 = profileCommonInfo.getUserRelationInfo()) == null || (followStatus = userRelationInfo2.getFollowStatus()) == null || followStatus.intValue() != 0) {
            ProfileCommonInfo profileCommonInfo2 = (ProfileCommonInfo) awS25S2200000_19.l3;
            if (profileCommonInfo2 != null && (userRelationInfo = profileCommonInfo2.getUserRelationInfo()) != null) {
                userRelationInfo.setFollowStatus(0);
            }
            if (user != null) {
                user.setFollowStatus(0);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS25S2200000_19 awS25S2200000_19, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((TranslationResult) awS25S2200000_19.l2).translatedContent);
        sbLIZ.append(awS25S2200000_19.s0);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        return C1248430ian.LIZ((C1248430ian) obj, null, null, (List) awS25S2200000_19.l3, ((TranslationResult) awS25S2200000_19.l2).srcLang, strLIZIZ, awS25S2200000_19.s1, EnumC1248480ias.TRANSLATED, false, 131);
    }

    public static final Object invoke$5(AwS25S2200000_19 awS25S2200000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, C459080HzO.LJ().getString(2131831850), new AwS385S0200000_19((C1228470i4b) awS25S2200000_19.l2, (Dialog[]) awS25S2200000_19.l3, 141));
        if (!((C1228470i4b) awS25S2200000_19.l2).LIZ.LJI) {
            c1397620mTQ.LIZJ(1, C459080HzO.LJ().getString(2131831852), new AwS42S2100000_19((C1228470i4b) awS25S2200000_19.l2, awS25S2200000_19.s0, awS25S2200000_19.s1, 5));
        }
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS25S2200000_19 awS25S2200000_19, Object obj) {
        final C1238240iKM c1238240iKM = new C1238240iKM((Context) obj, null, 0);
        c1238240iKM.setImeOptionForEditText(6);
        c1238240iKM.LLILZIL = "signup";
        c1238240iKM.LLILZLL = "signup_prioritize_panel";
        c1238240iKM.LIZIZ();
        c1238240iKM.setOnCountryCodeChanged(new AwS420S0200000_19(c1238240iKM, (SmsInputViewModel) awS25S2200000_19.l2, 222));
        EditText editText = c1238240iKM.getEditText();
        final SmsInputViewModel smsInputViewModel = (SmsInputViewModel) awS25S2200000_19.l2;
        final String str = awS25S2200000_19.s1;
        final String str2 = awS25S2200000_19.s0;
        final String str3 = "signup";
        final C05P1 c05p1 = (C05P1) awS25S2200000_19.l3;
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1265950j33(smsInputViewModel, 6));
        editText.addTextChangedListener(new TextWatcher() { // from class: X.0iLW
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object value;
                if (C1669520tXy.LIZJ(c05p1).LIZIZ) {
                    C853660XeG c853660XeG = C853660XeG.LIZ;
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    c853660XeG.getClass();
                    C853660XeG.LIZIZ(str4, str5, str6, "signup_prioritize_panel", true);
                    AccountGSMAExperiment.LIZ.getClass();
                    if (AccountGSMAExperiment.LIZJ() || AccountGSMAPhase2Experiment.LIZJ()) {
                        AlternativeNetworkService.INSTANCE.preconnect(C1238990iLZ.LIZ);
                    }
                }
                SmsInputViewModel smsInputViewModel2 = smsInputViewModel;
                String fullPhoneNumber = c1238240iKM.getFullPhoneNumber();
                C2252321DDq c2252321DDq = smsInputViewModel2.LL;
                do {
                    value = c2252321DDq.getValue();
                } while (!c2252321DDq.compareAndSet(value, C1238980iLY.LIZ((C1238980iLY) value, false, "", false, fullPhoneNumber, false, 41)));
            }
        });
        return c1238240iKM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S2200000_19(C013C c013c, C1231860iA4 c1231860iA4, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c013c;
        this.l3 = c1231860iA4;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S2200000_19(C013C c013c, InterfaceC1231870iA5 interfaceC1231870iA5, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c013c;
        this.l3 = interfaceC1231870iA5;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S2200000_19(C1228470i4b c1228470i4b, Dialog[] dialogArr, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1228470i4b;
        this.l3 = dialogArr;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS25S2200000_19(TranslationResult translationResult, TranslationResult translationResult2, String str, List<SignatureExtraInfo> list, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = translationResult;
        this.s0 = translationResult2;
        this.l3 = str;
        this.s1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S2200000_19(ProfileNavbarMoreProtocol profileNavbarMoreProtocol, String str, String str2, ProfileCommonInfo profileCommonInfo, int i) {
        super(1);
        this.$t = i;
        this.l2 = profileNavbarMoreProtocol;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = profileCommonInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S2200000_19(String str, SmsInputViewModel smsInputViewModel, String str2, C05P0 c05p0, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = smsInputViewModel;
        this.s1 = str2;
        this.l3 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S2200000_19(String str, String str2, SystemShareActivity systemShareActivity, String[] strArr, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = systemShareActivity;
        this.l3 = strArr;
    }
}
