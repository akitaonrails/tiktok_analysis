package com.bytedance.pipo.googlepay.pushprovisioning;

import X.C01GW;
import X.C0WZX;
import X.C19EG;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C833200WmM;
import X.C836610Wrr;
import X.C836740Ws4;
import X.EnumC836640Wru;
import X.InterfaceC1294060jmO;
import X.InterfaceC1670800ta2;
import X.InterfaceC342470Dbh;
import X.InterfaceC834580Woa;
import X.InterfaceC836750Ws5;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.pipo.googlepay.pushprovisioning.EphemeralKeyProvider;
import com.bytedance.pipo.googlepay.pushprovisioning.TokenizeGooglePayFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.ss.android.ugc.aweme.component.base.ui.PipoTransparentActivity;
import com.stripe.android.pushProvisioning.PushProvisioningActivityStarter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
@InterfaceC836760Ws6(attachActivity = PipoTransparentActivity.class)
public final class TokenizeGooglePayFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs8ID88ZiIjJig/LTUtMGEjPTYkOT08HELIOSPiw/ICA9ISsrZxs8IyAiIDU2DyojLiM2GCQ1Dz0yLygpJzs=";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS200S0000000_13.get$arr$(42), "KEY_SESSION_ID", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS200S0000000_13.get$arr$(36), "KEY_CARD_LAST_4", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS200S0000000_13.get$arr$(37), "KEY_CARD_NAME", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS200S0000000_13.get$arr$(35), "KEY_CARD_ID", String.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS200S0000000_13.get$arr$(43), "KEY_TOKEN_SERVICE_PROVIDER", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS200S0000000_13.get$arr$(38), "KEY_CARD_NETWORK", String.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS200S0000000_13.get$arr$(39), "KEY_HOST", String.class);
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS200S0000000_13.get$arr$(44), "KEY_WUID", String.class);
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS200S0000000_13.get$arr$(41), "KEY_ONE_TIME_TOKEN", String.class);
    public final C01GW LLJJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS200S0000000_13.get$arr$(40), "KEY_MERCHANT_ID", String.class);
    public final C836740Ws4 LLJJIII = new InterfaceC342470Dbh() { // from class: X.0Ws4
        @Override // X.InterfaceC342470Dbh
        public final boolean onActivityResult(int i, int i2, Intent intent) {
            this.LL.onActivityResult(i, i2, intent);
            return true;
        }
    };

    public final void UR() {
        C19EG activity = getActivity();
        if (activity != null) {
            C2204961BRm.LLJJJ(activity, -1, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxAVQyotKAZW1VH2U+MA17vlCtB/LY9kKdq7gpSeaAXWrEQU1UGl4ka8co41gTCGMD8Tz4A=", null));
        }
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final void SR(String str) throws Throwable {
        Intent intent = new Intent();
        intent.putExtra("KEY_TOKENIZE_MSG", str);
        C19EG activity = getActivity();
        if (activity != null) {
            C2204961BRm.LLJJIJIL(101, intent, activity, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxAVQyotKAZW1VH2U+MA17vlCtB/LY9kKdq7gpSeaAXWrEQU1UGl4ka8co41gTCGMD8Tz4A=", null));
        }
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        InterfaceC836750Ws5 interfaceC836750Ws5;
        super.onCreate(bundle);
        InterfaceC1670800ta2 activity = getActivity();
        if ((activity instanceof InterfaceC836750Ws5) && (interfaceC836750Ws5 = (InterfaceC836750Ws5) activity) != null) {
            interfaceC836750Ws5.setActivityResultListener(this.LLJJIII);
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                new C833200WmM((Activity) activity2).LIZLLL().LIZIZ(new InterfaceC834580Woa() { // from class: X.0WoX
                    @Override // X.InterfaceC834580Woa
                    public final void LIZ(AbstractC835450Wpz<List<TokenInfo>> abstractC835450Wpz) throws Throwable {
                        TokenInfo next;
                        String lowerCase;
                        final int i;
                        final int i2;
                        String message = null;
                        if (abstractC835450Wpz.LJIILJJIL() && !abstractC835450Wpz.LJIIL()) {
                            List<TokenInfo> listLJIIJ = abstractC835450Wpz.LJIIJ();
                            if (listLJIIJ == null) {
                                listLJIIJ = C13BV.INSTANCE;
                            }
                            TokenizeGooglePayFragment tokenizeGooglePayFragment = this.LL;
                            Iterator<TokenInfo> it2 = listLJIIJ.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (Intrinsics.LJFF(next.zzc, tokenizeGooglePayFragment.LLIZLLLIL.getValue())) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            TokenInfo tokenInfo = next;
                            if (tokenInfo == null) {
                                TokenizeGooglePayFragment tokenizeGooglePayFragment2 = this.LL;
                                tokenizeGooglePayFragment2.getClass();
                                PushProvisioningActivityStarter pushProvisioningActivityStarter = new PushProvisioningActivityStarter(tokenizeGooglePayFragment2, new PushProvisioningActivityStarter.Args((String) tokenizeGooglePayFragment2.LLJ.getValue(), new EphemeralKeyProvider((String) tokenizeGooglePayFragment2.LLJI.getValue(), (String) tokenizeGooglePayFragment2.LLIZ.getValue(), (String) tokenizeGooglePayFragment2.LLJILLL.getValue(), (String) tokenizeGooglePayFragment2.LLJJ.getValue(), (String) tokenizeGooglePayFragment2.LLJILJILJ.getValue(), (String) tokenizeGooglePayFragment2.LLJJI.getValue())));
                                Intent intentPutExtra = new Intent((Context) pushProvisioningActivityStarter.LIZ, (Class<?>) pushProvisioningActivityStarter.LIZJ).putExtra("extra_activity_args", pushProvisioningActivityStarter.LIZLLL);
                                Fragment fragment = pushProvisioningActivityStarter.LIZIZ;
                                if (fragment != null) {
                                    int i3 = pushProvisioningActivityStarter.LJ;
                                    C1701330uNH.LIZ(intentPutExtra, fragment);
                                    C2204961BRm.LLJL(fragment, intentPutExtra, i3, new C0WZX("dzBzEhEuTcPMUBkgSxaWaWVa6kxtPtu1IJrsJoXuv+eVM69+Og==", null));
                                    return;
                                } else {
                                    C19EG c19eg = pushProvisioningActivityStarter.LIZ;
                                    int i4 = pushProvisioningActivityStarter.LJ;
                                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intentPutExtra, "Activity_startActivityForResult_2");
                                    C1701330uNH.LIZ(intentPutExtra, c19eg);
                                    C2204961BRm.LJIIZILJ(i4, c19eg, intentPutExtra, new C0WZX("dzBzEhEuTcPMUBkgSxaWaWVa6kxtPtu1IJrsJoXuv+eVM69+Og==", null));
                                    return;
                                }
                            }
                            if (tokenInfo.zzg == 3) {
                                TokenizeGooglePayFragment tokenizeGooglePayFragment3 = this.LL;
                                final String str = tokenInfo.zza;
                                String str2 = (String) tokenizeGooglePayFragment3.LLJILJIL.getValue();
                                if (str2 != null) {
                                    lowerCase = str2.toLowerCase(Locale.ROOT);
                                } else {
                                    lowerCase = null;
                                }
                                if (Intrinsics.LJFF(lowerCase, "mastercard")) {
                                    i = 3;
                                } else {
                                    Intrinsics.LJFF(lowerCase, "visa");
                                    i = 4;
                                }
                                String str3 = (String) tokenizeGooglePayFragment3.LLJIJIL.getValue();
                                if (str3 != null) {
                                    message = str3.toLowerCase(Locale.ROOT);
                                }
                                if (Intrinsics.LJFF(message, "mastercard")) {
                                    i2 = 3;
                                } else {
                                    Intrinsics.LJFF(message, "visa");
                                    i2 = 4;
                                }
                                final C19EG activity3 = tokenizeGooglePayFragment3.getActivity();
                                if (activity3 != null) {
                                    C833200WmM c833200WmM = new C833200WmM((Activity) activity3);
                                    final String str4 = (String) tokenizeGooglePayFragment3.LLJ.getValue();
                                    C832510WlF c832510WlF = new C832510WlF();
                                    c832510WlF.LIZ = new InterfaceC831290WjH() { // from class: X.0WmO
                                        public final /* synthetic */ int LJFF = 9000;

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // X.InterfaceC831290WjH
                                        public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
                                            int i5 = i2;
                                            String str5 = str;
                                            String str6 = str4;
                                            int i6 = i;
                                            Activity activity4 = activity3;
                                            int i7 = this.LJFF;
                                            C833260WmS c833260WmS = (C833260WmS) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                                            C0WY1 c0wy1 = new C0WY1(activity4, i7);
                                            Parcel parcelLJJJZ = c833260WmS.LJJJZ();
                                            parcelLJJJZ.writeInt(i5);
                                            parcelLJJJZ.writeString(str5);
                                            parcelLJJJZ.writeString(str6);
                                            parcelLJJJZ.writeInt(i6);
                                            parcelLJJJZ.writeStrongBinder(c0wy1);
                                            c833260WmS.LLILLIZIL(23, parcelLJJJZ);
                                        }
                                    };
                                    c832510WlF.LIZLLL = 2101;
                                    c833200WmM.doRead(c832510WlF.LIZ());
                                    return;
                                }
                                return;
                            }
                            this.LL.UR();
                            return;
                        }
                        Exception excLJIIIZ = abstractC835450Wpz.LJIIIZ();
                        if (excLJIIIZ != null) {
                            message = excLJIIIZ.getMessage();
                        }
                        TokenizeGooglePayFragment tokenizeGooglePayFragment4 = this.LL;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SDK error when checking tokenization status: ");
                        sbLIZ.append(message);
                        tokenizeGooglePayFragment4.SR(a0.LJLIIIL(C2188811AlT.LIZIZ(sbLIZ)).toString());
                    }
                });
                return;
            }
            return;
        }
        SR("Require activity to handle onActivityResult");
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC1294060jmO
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        Bundle extras;
        C836610Wrr c836610Wrr;
        Object obj;
        EnumC836640Wru enumC836640Wru;
        String str;
        String str2 = null;
        if (i != 8000) {
            if (i == 9000) {
                if (i2 != -1) {
                    if (i2 != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Error from resume tokenization: ");
                        sbLIZ.append(i2);
                        SR(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    C19EG activity = getActivity();
                    if (activity != null) {
                        C2204961BRm.LLJJJ(activity, 0, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxAVQyotKAZW1VH2U+MA17vlCtB/LY9kKdq7gpSeaAXWrEQU1UGl4ka8co41gTCGMD8Tz4A=", null));
                    }
                    C19EG activity2 = getActivity();
                    if (activity2 == null) {
                        return;
                    }
                    activity2.finish();
                    return;
                }
                UR();
                return;
            }
            return;
        }
        if (i2 == -1) {
            UR();
            return;
        }
        if (intent != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            try {
                obj = extras.get("errorCode");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            } catch (OutOfMemoryError e3) {
                TryCatchGuardChecker.doCheck(e3);
                obj = null;
            }
            c836610Wrr = new C836610Wrr((EnumC836640Wru) obj, extras.getString("errorMessage"));
            enumC836640Wru = c836610Wrr.LIZ;
        } else {
            c836610Wrr = null;
            enumC836640Wru = null;
        }
        if (!Intrinsics.LJFF(String.valueOf(enumC836640Wru), "USER_CANCELED")) {
            if (c836610Wrr != null) {
                str = c836610Wrr.LIZIZ;
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(str, "User canceled the tokenization")) {
                if (c836610Wrr != null) {
                    str2 = c836610Wrr.LIZIZ;
                }
                SR(str2);
                return;
            }
        }
        C19EG activity3 = getActivity();
        if (activity3 != null) {
            C2204961BRm.LLJJJ(activity3, 0, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxAVQyotKAZW1VH2U+MA17vlCtB/LY9kKdq7gpSeaAXWrEQU1UGl4ka8co41gTCGMD8Tz4A=", null));
        }
        C19EG activity4 = getActivity();
        if (activity4 != null) {
            activity4.finish();
        }
    }
}
