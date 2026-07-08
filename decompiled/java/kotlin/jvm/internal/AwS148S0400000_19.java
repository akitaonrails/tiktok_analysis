package kotlin.jvm.internal;

import X.C013C;
import X.C01XQ;
import X.C05P0;
import X.C09AY;
import X.C09YG;
import X.C0TN5;
import X.C0TVK;
import X.C0XTR;
import X.C1251810igF;
import X.C13LQ;
import X.C20303114cP;
import X.C2097608Jq;
import X.C23250099c;
import X.C2344009Gk;
import X.C660220Pv2;
import X.EnumC1237810iJf;
import X.EnumC1237820iJg;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.account.security.EmailData;
import com.ss.android.ugc.aweme.account.security.PhoneData;
import com.ss.android.ugc.aweme.account.security.SecurityCheckUpViewModel;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment;
import com.ss.android.ugc.profile.business.ur.editprofile.namesync.ProfileNameSyncServiceImpl;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS148S0400000_19 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS148S0400000_19 awS148S0400000_19) {
        ((C05P0) awS148S0400000_19.l0).setValue(Boolean.valueOf(C20303114cP.LJII((PowerManager) awS148S0400000_19.l1)));
        if (C13LQ.LJIILLIIL(Build.BRAND.toLowerCase(Locale.ROOT), C20303114cP.LIZIZ)) {
            C23250099c.LIZLLL((InterfaceC497601wk) awS148S0400000_19.l2, null, null, new C1251810igF((Context) awS148S0400000_19.l3, (C05P0) awS148S0400000_19.l0, (PowerManager) awS148S0400000_19.l1, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS148S0400000_19 awS148S0400000_19) {
        ProfileNameSyncServiceImpl profileNameSyncServiceImpl = (ProfileNameSyncServiceImpl) awS148S0400000_19.l0;
        Fragment fragment = (Fragment) awS148S0400000_19.l1;
        Pair pair = (Pair) awS148S0400000_19.l2;
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19((Function0) awS148S0400000_19.l3, (Function0<Unit>) 2245);
        profileNameSyncServiceImpl.getClass();
        ProfileNameSyncServiceImpl.LJIIIIZZ(fragment, pair, 1500L, awS563S0100000_19);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS148S0400000_19 awS148S0400000_19) {
        SecurityCheckUpViewModel securityCheckUpViewModel = (SecurityCheckUpViewModel) awS148S0400000_19.l0;
        C0TVK c0tvk = C0TVK.PHONE;
        securityCheckUpViewModel.LLILZIL = c0tvk;
        C0TN5 c0tn5 = C0TN5.LIZ;
        String str = securityCheckUpViewModel.vQ2().LLILLJJLI;
        boolean z = !((C013C) awS148S0400000_19.l1).element;
        c0tn5.getClass();
        C0TN5.LIZ(c0tvk, str, z);
        Activity activity = ((SecurityCheckUpViewModel) awS148S0400000_19.l0).vQ2().LL.get();
        if (activity != null) {
            Bundle bundle = (Bundle) awS148S0400000_19.l2;
            SecurityCheckUpViewModel securityCheckUpViewModel2 = (SecurityCheckUpViewModel) awS148S0400000_19.l0;
            PhoneData phoneData = (PhoneData) awS148S0400000_19.l3;
            bundle.putInt("phone_number_source", EnumC1237820iJg.VERIFY_NON_1P_MOBILE.getValue());
            securityCheckUpViewModel2.LLILLL.bindPhoneFromSource(activity, phoneData.bindNumber, phoneData.bindSource, bundle, new C0XTR() { // from class: X.0iFs
                @Override // X.C0XTR
                public final void onResult(int i, int i2, Object obj) {
                }
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS148S0400000_19 awS148S0400000_19) {
        SecurityCheckUpViewModel securityCheckUpViewModel = (SecurityCheckUpViewModel) awS148S0400000_19.l0;
        C0TVK c0tvk = C0TVK.EMAIL;
        securityCheckUpViewModel.LLILZIL = c0tvk;
        C0TN5 c0tn5 = C0TN5.LIZ;
        String str = securityCheckUpViewModel.vQ2().LLILLJJLI;
        boolean z = !((C013C) awS148S0400000_19.l1).element;
        c0tn5.getClass();
        C0TN5.LIZ(c0tvk, str, z);
        Activity activity = ((SecurityCheckUpViewModel) awS148S0400000_19.l0).vQ2().LL.get();
        if (activity != null) {
            Bundle bundle = (Bundle) awS148S0400000_19.l2;
            SecurityCheckUpViewModel securityCheckUpViewModel2 = (SecurityCheckUpViewModel) awS148S0400000_19.l0;
            EmailData emailData = (EmailData) awS148S0400000_19.l3;
            bundle.putInt("email_source", EnumC1237810iJf.VERIFY_NON_1P_EMAIL.getValue());
            securityCheckUpViewModel2.LLILLL.bindEmailFromSource(activity, emailData.email, "", bundle, new C0XTR() { // from class: X.0iFm
                @Override // X.C0XTR
                public final void onResult(int i, int i2, Object obj) {
                }
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS148S0400000_19 awS148S0400000_19) {
        SecurityCheckUpViewModel securityCheckUpViewModel = (SecurityCheckUpViewModel) awS148S0400000_19.l0;
        C0TVK c0tvk = C0TVK.EMAIL;
        securityCheckUpViewModel.LLILZIL = c0tvk;
        C0TN5 c0tn5 = C0TN5.LIZ;
        String str = securityCheckUpViewModel.vQ2().LLILLJJLI;
        boolean z = !((C013C) awS148S0400000_19.l1).element;
        c0tn5.getClass();
        C0TN5.LIZ(c0tvk, str, z);
        Activity activity = ((SecurityCheckUpViewModel) awS148S0400000_19.l0).vQ2().LL.get();
        if (activity != null) {
            Bundle bundle = (Bundle) awS148S0400000_19.l2;
            SecurityCheckUpViewModel securityCheckUpViewModel2 = (SecurityCheckUpViewModel) awS148S0400000_19.l0;
            EmailData emailData = (EmailData) awS148S0400000_19.l3;
            bundle.putInt("email_source", EnumC1237810iJf.VERIFY_NON_1P_EMAIL.getValue());
            securityCheckUpViewModel2.LLILLL.bindEmailFromSource(activity, emailData.bindEmail, emailData.bindSource, bundle, new C0XTR() { // from class: X.0iFn
                @Override // X.C0XTR
                public final void onResult(int i, int i2, Object obj) {
                }
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS148S0400000_19 awS148S0400000_19) {
        View viewFindViewById;
        String url;
        TuxNavBar tuxNavBar = ((ProfileIdentifierFragment) awS148S0400000_19.l0).LLILZLL;
        EventParams eventParams = null;
        if (tuxNavBar != null) {
            viewFindViewById = tuxNavBar.findViewById(R.id.p1u);
        } else {
            viewFindViewById = null;
        }
        if (!C660220Pv2.LIZ(viewFindViewById)) {
            Context context = (Context) awS148S0400000_19.l1;
            Action.RouterInfo router = ((Action) awS148S0400000_19.l2).getRouter();
            if (router != null) {
                url = router.getUrl();
            } else {
                url = null;
            }
            SmartRouter.buildRoute(context, url).open();
            List<EventParams> list = ((ProfileComponents) awS148S0400000_19.l3).eventParams;
            if (list != null) {
                Iterator<EventParams> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    EventParams next = it2.next();
                    EventParams eventParams2 = next;
                    if (eventParams2 != null) {
                        Integer num = eventParams2.type;
                        int type = C09YG.TYPE_CLICK.getType();
                        if (num != null && num.intValue() == type) {
                            eventParams = next;
                            break;
                        }
                    }
                }
                EventParams eventParams3 = eventParams;
                if (eventParams3 != null) {
                    String str = eventParams3.event;
                    Map mapLIZ = C01XQ.LIZ(eventParams3.bizParams);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "org_account_info_page");
                    if (mapLIZ == null) {
                        mapLIZ = C2097608Jq.LJ();
                    }
                    c2344009Gk.LJII(mapLIZ);
                    C01XQ.LIZJ(c2344009Gk, str);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS148S0400000_19(C05P0 c05p0, C05P0<Boolean> c05p02, PowerManager powerManager, InterfaceC497601wk interfaceC497601wk, Context context) {
        super(0);
        this.$t = context;
        this.l0 = c05p0;
        this.l1 = c05p02;
        this.l2 = powerManager;
        this.l3 = interfaceC497601wk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0400000_19(SecurityCheckUpViewModel securityCheckUpViewModel, C013C c013c, Bundle bundle, EmailData emailData, int i) {
        super(0);
        this.$t = i;
        this.l0 = securityCheckUpViewModel;
        this.l1 = c013c;
        this.l2 = bundle;
        this.l3 = emailData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0400000_19(SecurityCheckUpViewModel securityCheckUpViewModel, C013C c013c, Bundle bundle, PhoneData phoneData, int i) {
        super(0);
        this.$t = i;
        this.l0 = securityCheckUpViewModel;
        this.l1 = c013c;
        this.l2 = bundle;
        this.l3 = phoneData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0400000_19(ProfileIdentifierFragment profileIdentifierFragment, Context context, Action action, ProfileComponents profileComponents, int i) {
        super(0);
        this.$t = i;
        this.l0 = profileIdentifierFragment;
        this.l1 = context;
        this.l2 = action;
        this.l3 = profileComponents;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS148S0400000_19(ProfileNameSyncServiceImpl profileNameSyncServiceImpl, ProfileNameSyncServiceImpl profileNameSyncServiceImpl2, Fragment fragment, Pair<String, Boolean> pair, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = profileNameSyncServiceImpl;
        this.l1 = profileNameSyncServiceImpl2;
        this.l2 = fragment;
        this.l3 = pair;
    }
}
