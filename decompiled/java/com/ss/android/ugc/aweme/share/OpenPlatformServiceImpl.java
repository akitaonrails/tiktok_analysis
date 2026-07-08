package com.ss.android.ugc.aweme.share;

import X.AbstractC20656215sG;
import X.AbstractC20660015ss;
import X.C086I;
import X.C0WZX;
import X.C0XKJ;
import X.C0XQ7;
import X.C11JL;
import X.C11S5;
import X.C11VZ;
import X.C1236610iHj;
import X.C12ES;
import X.C1388190mED;
import X.C1390920mIc;
import X.C14EU;
import X.C1701330uNH;
import X.C1701940uOG;
import X.C19EG;
import X.C1B31;
import X.C1B38;
import X.C1B3H;
import X.C1B4M;
import X.C2197221Az2;
import X.C2204961BRm;
import X.C786410Ut5;
import X.DialogC19267910Zp;
import X.EnumC19415410xc;
import X.EnumC21632119lH;
import X.InterfaceC586170Myt;
import Y.ARunnableS9S1300000_9;
import Y.AfS148S0200000_12;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage;
import com.ss.android.ugc.aweme.openauthorize.entity.WebAuthV2Response;
import com.ss.android.ugc.aweme.opensdkservice.HandleMediaListener;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.serviceplugin.ServicePluginPlatformManager;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes35.dex */
public class OpenPlatformServiceImpl implements IOpenPlatformService, InterfaceC586170Myt {
    public C11JL LL;
    public TuxSheet LLILLJJLI;
    public Function2<? super Boolean, ? super Boolean, Unit> LLILLL;
    public boolean LLILZ;

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public Intent LIZ(Context context) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final Pair<Boolean, Boolean> LJFF() {
        if (C0XQ7.LJFF() != null && C0XQ7.LJFF().isLogin()) {
            return new Pair<>(Boolean.TRUE, Boolean.valueOf(C0XQ7.LJFF().LIZ()));
        }
        Boolean bool = Boolean.FALSE;
        return new Pair<>(bool, bool);
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void LIZIZ(C11VZ c11vz) {
        this.LL = (C11JL) new ServicePluginPlatformManager().LIZ().LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS148S0200000_12(c11vz, this, 11), new AfS148S0200000_12(c11vz, this, 12));
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final boolean LIZJ(Intent intent) {
        String stringExtra;
        try {
            stringExtra = intent.getStringExtra("_aweme_open_sdk_params_client_key");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        return !TextUtils.isEmpty(stringExtra);
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void LIZLLL(String str) {
        C1236610iHj.LIZIZ(str, "auth_success", CardStruct.IStatusCode.DEFAULT, C1236610iHj.LIZ(str, true, false), EnumC21632119lH.TTOP, EnumC19415410xc.MOBILE);
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void LJIIL(String str) {
        C1236610iHj.LIZIZ(str, "auth_js_start", "20000", C1236610iHj.LIZ(str, true, false), EnumC21632119lH.TTOP, EnumC19415410xc.MOBILE);
    }

    @C14EU
    public final void onUserBannedEvent(C0XKJ c0xkj) {
        Function2<? super Boolean, ? super Boolean, Unit> function2 = this.LLILLL;
        if (function2 != null) {
            Boolean bool = Boolean.FALSE;
            function2.invoke(bool, bool);
        }
        this.LLILLL = null;
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final AbstractC20656215sG LJII(final Activity activity, final DialogC19267910Zp dialogC19267910Zp) {
        return new AbstractC20660015ss<Dialog>(activity, dialogC19267910Zp) { // from class: X.0TSD
            public final Dialog LL;
            public final Activity LLILLJJLI;

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return 0;
            }

            @Override // X.InterfaceC20660415sw
            public final C688120Qyw i2() {
                C19FO c19fo;
                Activity activity2 = this.LLILLJJLI;
                if (!(activity2 instanceof C19EG) || (c19fo = (C19FO) activity2) == null) {
                    return null;
                }
                return new C688120Qyw(activity2, c19fo, null);
            }

            @Override // com.bytedance.poplayer.IPopupTask
            public final Object showPopup(C688120Qyw c688120Qyw) {
                C786410Ut5.B4(this.LL);
                return this.LL;
            }

            {
                this.LL = dialogC19267910Zp;
                this.LLILLJJLI = activity;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1B2y] */
    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void LJIIIZ(Intent intent, final C1B4M c1b4m) {
        ?? r3 = new Object() { // from class: X.1B2y
            public final void LIZ() {
                HandleMediaListener handleMediaListener = c1b4m;
                if (handleMediaListener != null) {
                    handleMediaListener.onArgsError();
                }
            }

            public final void LIZIZ(ArrayList<String> arrayList) {
                HandleMediaListener handleMediaListener = c1b4m;
                if (handleMediaListener != null) {
                    handleMediaListener.onGetImagePath(arrayList);
                }
            }

            public final void LIZJ(ArrayList<String> arrayList) {
                HandleMediaListener handleMediaListener = c1b4m;
                if (handleMediaListener != null) {
                    handleMediaListener.onGetVideoPath(arrayList);
                }
            }
        };
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                ArrayList<String> stringArrayList = extras.getStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH");
                ArrayList<String> stringArrayList2 = extras.getStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH");
                if (!C086I.LIZIZ(stringArrayList)) {
                    r3.LIZIZ(stringArrayList);
                } else if (!C086I.LIZIZ(stringArrayList2)) {
                    r3.LIZJ(stringArrayList2);
                } else {
                    r3.LIZ();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void LJ(Activity activity, ArrayList arrayList, String str, Bundle bundle) throws Throwable {
        String str2 = AwemeAuthorizeLoginActivity._pnsPageId;
        Intent intent = new Intent(activity, (Class<?>) AwemeAuthorizeLoginActivity.class);
        intent.putStringArrayListExtra("authorize_hide_platforms", arrayList);
        if (str != null) {
            intent.putExtra("auth_from_app", str);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIIZILJ(2001, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOW4ZpHPySYmE3cSt9He73So2Bd5MmMYdOyFoqLq8cUHlHW7KNRMTJlr", null));
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void LJIIIIZZ(Activity activity, String str, Bundle bundle, Function2<? super Boolean, ? super Boolean, Unit> function2) {
        this.LLILLL = function2;
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(this);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("need_skip_restart", true);
        C786410Ut5.LJJIIJZLJL(bundle2, bundle);
        C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS9S1300000_9(this, activity, bundle2, str, 0));
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        Pair<Boolean, Boolean> pairLJFF = LJFF();
        boolean zBooleanValue = pairLJFF.getFirst().booleanValue();
        boolean zBooleanValue2 = pairLJFF.getSecond().booleanValue();
        Function2<? super Boolean, ? super Boolean, Unit> function2 = this.LLILLL;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2));
        }
        this.LLILLL = null;
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void LJIIJJI(final Context context, Bundle bundle, final Function1<? super String, Unit> function1, final Function0<Unit> function0, String str) {
        int i;
        FragmentManager supportFragmentManager;
        BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = new BaseI18nAuthorizedFragment();
        baseI18nAuthorizedFragment.LLJJLIIIJLLLLLLLZ = true;
        baseI18nAuthorizedFragment.LLJL = true;
        baseI18nAuthorizedFragment.LLJJL = new AwS588S0100000_9(this, 378);
        int iLJIIIIZZ = (int) (((double) C12ES.LJIIIIZZ(C1388190mED.LIZIZ(context))) * 0.77d);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = baseI18nAuthorizedFragment;
        if (C2197221Az2.LIZ(str)) {
            i = 4;
        } else {
            i = 1;
        }
        c1390920mIc.LJIIIIZZ(i);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLILLL = false;
        tuxSheet.LLJLLIL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0O8e
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Function1<String, Unit> function12;
                if (this.LL.LLILZ && (function12 = function1) != null) {
                    function12.invoke(context.getString(2131826791));
                }
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
                C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), null, "auth_sdk_sheet_dismiss"));
            }
        };
        if (!C2197221Az2.LIZ(str)) {
            c1390920mIc.LIZ.LLJJL = iLJIIIIZZ;
        }
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        this.LLILLJJLI = tuxSheet2;
        baseI18nAuthorizedFragment.setArguments(bundle);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            tuxSheet2.show(supportFragmentManager, "TTOP_Debug_AuthPage");
            this.LLILZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void LJIIJ(String str, String str2, String str3, String str4, String str5, boolean z, final Function1 function1) {
        C1B38.LIZIZ(str, str2, "jsb", str3, str4, str5, z, new C1B31() { // from class: X.1B2z
            @Override // X.C1B31
            public final void LIZ(WebAuthV2Response webAuthV2Response) {
                function1.invoke(webAuthV2Response);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void LJI(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, final Function1 function1) {
        String str7 = str4;
        if (str7 == null) {
            str7 = "";
        }
        C1B38.LIZ(str, str2, str3, null, "", "", "", "jsb", str7, Boolean.valueOf(z), "", "", str5, str6, z2, new C1B3H() { // from class: X.1B30
            @Override // X.C1B3H
            public final void LIZ(OAuthPage oAuthPage) {
                function1.invoke(oAuthPage);
            }

            @Override // X.C1B3H
            public final void LIZIZ(OAuthPage oAuthPage) {
                function1.invoke(oAuthPage);
            }
        });
    }
}
