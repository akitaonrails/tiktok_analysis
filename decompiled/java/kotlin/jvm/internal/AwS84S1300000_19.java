package kotlin.jvm.internal;

import X.AbstractC848400XPy;
import X.C09AY;
import X.C0XQ7;
import X.C1262850iy3;
import X.C1365110lcz;
import X.C19252910Tv;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C296530Bjn;
import X.C487280J9a;
import X.EnumC1073720e30;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService;
import com.ss.android.ugc.aweme.relation.base.CustomDialogFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS33S0001000_19;

/* JADX INFO: loaded from: classes20.dex */
public class AwS84S1300000_19 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS84S1300000_19 awS84S1300000_19) {
        Dialog dialog;
        String str;
        C1262850iy3 c1262850iy3 = (C1262850iy3) awS84S1300000_19.l1;
        CustomDialogFragment customDialogFragment = c1262850iy3.LLJILJIL;
        if (customDialogFragment != null) {
            customDialogFragment.LLILZLL = new AwS382S0200000_16(c1262850iy3, (C1262850iy3) awS84S1300000_19.l3, (Function1<? super EnumC1073720e30, Unit>) 75);
            C19EG c19eg = ((C1262850iy3) awS84S1300000_19.l1).LLILZLL;
            C19EG c19eg2 = null;
            if (c19eg != null && c19eg != null && !c19eg.isFinishing() && ((dialog = customDialogFragment.getDialog()) == null || !dialog.isShowing())) {
                customDialogFragment.show((FragmentManager) awS84S1300000_19.l2, awS84S1300000_19.s0);
                if (C296530Bjn.LIZ() && ((C1262850iy3) awS84S1300000_19.l1).LLJJIJI) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C1262850iy3 c1262850iy32 = (C1262850iy3) awS84S1300000_19.l1;
                    String str2 = awS84S1300000_19.s0;
                    c1262850iy32.getClass();
                    if (str2 != null && str2.length() != 0 && Intrinsics.LJFF(str2, "homepage_hot_RecUserPopup")) {
                        str = "feed_pop_up";
                    } else {
                        str = "pop_up";
                    }
                    c2344009Gk.LJIIIIZZ("source", str);
                    c2344009Gk.LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() ? 1 : 0, "login_type");
                    C20684815ws.LJIILLIIL("show_suggested_accounts_info", c2344009Gk.LIZ);
                }
                final C1262850iy3 c1262850iy33 = (C1262850iy3) awS84S1300000_19.l1;
                c1262850iy33.getClass();
                if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1) {
                    C19EG c19eg3 = c1262850iy33.LLILZLL;
                    if (c19eg3 != null) {
                        c19eg2 = c19eg3;
                    }
                    C487280J9a.LIZIZ(c19eg2, new InterfaceC487330J9f() { // from class: X.0iy5
                        @Override // X.InterfaceC487330J9f
                        public final void onConfigurationChanged(Activity activity, Configuration configuration) {
                            CustomDialogFragment customDialogFragment2;
                            Dialog dialog2;
                            C1262850iy3 c1262850iy34;
                            CustomDialogFragment customDialogFragment3;
                            Dialog dialog3;
                            Window window;
                            WindowManager.LayoutParams attributes;
                            if (activity != null && (customDialogFragment2 = c1262850iy33.LLJILJIL) != null && (dialog2 = customDialogFragment2.getDialog()) != null && dialog2.isShowing() && (customDialogFragment3 = (c1262850iy34 = c1262850iy33).LLJILJIL) != null && (dialog3 = customDialogFragment3.getDialog()) != null && (window = dialog3.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                                int i = attributes.height;
                                int iLIZ = C0IO3.LIZ(activity);
                                if (i > iLIZ) {
                                    CustomDialogFragment customDialogFragment4 = c1262850iy34.LLJILJIL;
                                    if (customDialogFragment4 != null) {
                                        customDialogFragment4.MR(new AwS33S0001000_19(iLIZ, 16));
                                    }
                                    C1262850iy3.LJIILJJIL(c1262850iy34, c1262850iy34.LIZIZ().getPowerList(), iLIZ, 0, null, 12);
                                }
                                c1262850iy34.LLJJI = iLIZ;
                            }
                        }
                    });
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS84S1300000_19 awS84S1300000_19) {
        String str;
        MutableLiveData mutableLiveData = (MutableLiveData) awS84S1300000_19.l1;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(Boolean.TRUE);
        }
        ((C1365110lcz) awS84S1300000_19.l2).getClass();
        List list = (List) awS84S1300000_19.l3;
        C1365110lcz c1365110lcz = (C1365110lcz) awS84S1300000_19.l2;
        String str2 = awS84S1300000_19.s0;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            ILiveEventOuterService iLiveEventOuterServiceK5 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).K5();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("action_type", "invite");
            String string = c1365110lcz.LIZJ.extras.getString("live_event_author_id");
            String str3 = CardStruct.IStatusCode.DEFAULT;
            if (string == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("anchor_id", string);
            linkedHashMap.put("guest_id", String.valueOf(jLongValue));
            if (c1365110lcz.LIZJ.extras.getBoolean("key_is_from_live_event_search")) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_search", str);
            if (str2 != null) {
                str3 = str2;
            }
            linkedHashMap.put("live_event_id", str3);
            iLiveEventOuterServiceK5.reportLinkMicRelatedEvent("livesdk_multi_live_event_invite_guest", linkedHashMap);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS84S1300000_19(C1262850iy3 c1262850iy3, C1262850iy3 c1262850iy32, FragmentManager fragmentManager, String str, Function1<? super EnumC1073720e30, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l1 = c1262850iy3;
        this.l2 = c1262850iy32;
        this.s0 = fragmentManager;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS84S1300000_19(MutableLiveData mutableLiveData, MutableLiveData<Boolean> mutableLiveData2, C1365110lcz c1365110lcz, List<Long> list, String str) {
        super(0);
        this.$t = str;
        this.l1 = mutableLiveData;
        this.l2 = mutableLiveData2;
        this.l3 = c1365110lcz;
        this.s0 = list;
    }
}
