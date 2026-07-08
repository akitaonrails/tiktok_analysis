package com.facebook.login;

import X.C098200Yq;
import X.C0W7Q;
import X.C0WV6;
import X.C0WV8;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1BJ0;
import X.C1BJ8;
import X.C1BJA;
import X.C1BJO;
import X.C1BKD;
import X.C1D13;
import X.C21621919jd;
import X.C21626019kI;
import X.C2188811AlT;
import X.C2202621BIm;
import X.C2202641BIo;
import X.C785410UrT;
import X.C786410Ut5;
import X.C807660VmG;
import X.C822660WOy;
import X.C827990Wdx;
import X.DialogC19728412Gs;
import X.EnumC21623519jt;
import X.EnumC21624519k3;
import X.EnumC2202671BIr;
import X.InterfaceC21622519jj;
import Y.ACListenerS168S0100000_34;
import Y.ARunnableS134S0100000_34;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class DeviceAuthDialog extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZykyKyAuJiA4ZikjLiY9HELIOSZgEpPyYwLQQ5PScXISQgJig=";
    public View LL;
    public TextView LLILLJJLI;
    public TextView LLILLL;
    public DeviceAuthMethodHandler LLILZ;
    public final AtomicBoolean LLILZIL = new AtomicBoolean();
    public volatile C1BJ8 LLILZLL;
    public volatile ScheduledFuture<?> LLIZ;
    public volatile RequestState LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public LoginClient.Request LLJIJIL;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLJ = true;
        this.LLILZIL.set(true);
        super.onDestroyView();
        C1BJ8 c1bj8 = this.LLILZLL;
        if (c1bj8 != null) {
            c1bj8.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.LLIZ;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void PR() {
        if (this.LLILZIL.compareAndSet(false, true)) {
            RequestState requestState = this.LLIZLLLIL;
            if (requestState != null) {
                C2202641BIo.LIZ(requestState.userCode);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.LLILZ;
            if (deviceAuthMethodHandler != null) {
                C2202621BIm c2202621BIm = LoginClient.Result.Companion;
                LoginClient loginClient = deviceAuthMethodHandler.loginClient;
                loginClient.getClass();
                LoginClient.Request request = loginClient.pendingRequest;
                c2202621BIm.getClass();
                LoginClient.Result resultLIZ = C2202621BIm.LIZ(request, "User canceled log in.");
                LoginClient loginClient2 = deviceAuthMethodHandler.loginClient;
                loginClient2.getClass();
                loginClient2.LJ(resultLIZ);
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
                C785410UrT.LIZ(dialog);
            }
        }
    }

    public final void UR() {
        RequestState requestState = this.LLIZLLLIL;
        if (requestState != null) {
            requestState.lastPoll = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        RequestState requestState2 = this.LLIZLLLIL;
        C786410Ut5.LJJJI("code", requestState2 == null ? null : requestState2.requestCode, bundle);
        C786410Ut5.LJJJI("access_token", NR(), bundle);
        this.LLILZLL = new GraphRequest(null, "device/login_status", bundle, C0WV6.POST, new C0WV8() { // from class: X.1BIp
            @Override // X.C0WV8
            public final void LIZIZ(C0WVK c0wvk) {
                DeviceAuthDialog deviceAuthDialog = this.LIZ;
                if (!deviceAuthDialog.LLILZIL.get()) {
                    FacebookRequestError facebookRequestError = c0wvk.LIZJ;
                    if (facebookRequestError != null) {
                        int i = facebookRequestError.subErrorCode;
                        if (i != 1349174 && i != 1349172) {
                            if (i == 1349152) {
                                DeviceAuthDialog.RequestState requestState3 = deviceAuthDialog.LLIZLLLIL;
                                if (requestState3 != null) {
                                    C2202641BIo.LIZ(requestState3.userCode);
                                }
                                LoginClient.Request request = deviceAuthDialog.LLJIJIL;
                                if (request != null) {
                                    deviceAuthDialog.ZR(request);
                                    return;
                                } else {
                                    deviceAuthDialog.PR();
                                    return;
                                }
                            }
                            if (i == 1349173) {
                                deviceAuthDialog.PR();
                                return;
                            }
                            C1BJO c1bjo = facebookRequestError.exception;
                            if (c1bjo == null) {
                                c1bjo = new C1BJO();
                            }
                            deviceAuthDialog.RR(c1bjo);
                            return;
                        }
                        deviceAuthDialog.VR();
                        return;
                    }
                    try {
                        JSONObject jSONObject = c0wvk.LIZIZ;
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        deviceAuthDialog.SR(jSONObject.getLong("expires_in"), jSONObject.getString("access_token"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        deviceAuthDialog.RR(new C1BJO(e));
                    }
                }
            }
        }, 32).LIZLLL();
    }

    public final void VR() {
        Long lValueOf;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        RequestState requestState = this.LLIZLLLIL;
        if (requestState == null || (lValueOf = Long.valueOf(requestState.interval)) == null) {
            return;
        }
        synchronized (DeviceAuthMethodHandler.Companion) {
            if (DeviceAuthMethodHandler.backgroundExecutor == null) {
                DeviceAuthMethodHandler.backgroundExecutor = new C822660WOy(1);
            }
            scheduledThreadPoolExecutor = DeviceAuthMethodHandler.backgroundExecutor;
            if (scheduledThreadPoolExecutor == null) {
                throw null;
            }
        }
        this.LLIZ = scheduledThreadPoolExecutor.schedule(new ARunnableS134S0100000_34(this, 88), lValueOf.longValue(), TimeUnit.SECONDS);
    }

    public static String NR() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(FacebookSdk.LIZLLL());
        sbLIZ.append('|');
        sbLIZ.append(C786410Ut5.C2());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class RequestState implements Parcelable {
        public String authorizationUri;
        public long interval;
        public long lastPoll;
        public String requestCode;
        public String userCode;
        public static final C1BKD Companion = new Object() { // from class: X.1BKD
        };
        public static final Parcelable.Creator<RequestState> CREATOR = new C1D13(5);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public RequestState() {
        }

        public RequestState(Parcel parcel) {
            this.authorizationUri = parcel.readString();
            this.userCode = parcel.readString();
            this.requestCode = parcel.readString();
            this.interval = parcel.readLong();
            this.lastPoll = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.authorizationUri);
            parcel.writeString(this.userCode);
            parcel.writeString(this.requestCode);
            parcel.writeLong(this.interval);
            parcel.writeLong(this.lastPoll);
        }
    }

    public final View OR(boolean z) {
        int i;
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        if (z) {
            i = R.layout.agn;
        } else {
            i = R.layout.agl;
        }
        View viewSd = C786410Ut5.Sd(i, layoutInflater, null);
        this.LL = viewSd.findViewById(R.id.s8q);
        View viewFindViewById = viewSd.findViewById(R.id.ep1);
        if (viewFindViewById != null) {
            this.LLILLJJLI = (TextView) viewFindViewById;
            View viewFindViewById2 = viewSd.findViewById(R.id.db1);
            if (viewFindViewById2 != null) {
                C786410Ut5.L7((Button) viewFindViewById2, new ACListenerS168S0100000_34(this, 52));
                View viewFindViewById3 = viewSd.findViewById(R.id.e8z);
                if (viewFindViewById3 != null) {
                    TextView textView = (TextView) viewFindViewById3;
                    this.LLILLL = textView;
                    textView.setText(Html.fromHtml(getString(2131828971)));
                    return viewSd;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public final void RR(C1BJO c1bjo) {
        if (!this.LLILZIL.compareAndSet(false, true)) {
            return;
        }
        RequestState requestState = this.LLIZLLLIL;
        if (requestState != null) {
            C2202641BIo.LIZ(requestState.userCode);
        }
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.LLILZ;
        if (deviceAuthMethodHandler != null) {
            C2202621BIm c2202621BIm = LoginClient.Result.Companion;
            LoginClient loginClient = deviceAuthMethodHandler.loginClient;
            loginClient.getClass();
            LoginClient.Request request = loginClient.pendingRequest;
            String message = c1bjo.getMessage();
            c2202621BIm.getClass();
            LoginClient.Result resultLIZJ = C2202621BIm.LIZJ(request, null, message, null);
            LoginClient loginClient2 = deviceAuthMethodHandler.loginClient;
            loginClient2.getClass();
            loginClient2.LJ(resultLIZJ);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
            C785410UrT.LIZ(dialog);
        }
    }

    public final void WR(RequestState requestState) {
        Bitmap bitmapCreateBitmap;
        int i;
        this.LLIZLLLIL = requestState;
        TextView textView = this.LLILLJJLI;
        textView.getClass();
        textView.setText(requestState.userCode);
        String str = requestState.authorizationUri;
        if (!C807660VmG.LIZ(C2202641BIo.class)) {
            try {
                EnumMap enumMap = new EnumMap(EnumC21624519k3.class);
                enumMap.put(EnumC21624519k3.MARGIN, 2);
                try {
                    C21621919jd c21621919jdLIZ = new InterfaceC21622519jj() { // from class: X.19jq
                        @Override // X.InterfaceC21622519jj
                        public final C21621919jd LIZ(String str2, EnumC21623519jt enumC21623519jt, int i2, int i3, Map<EnumC21624519k3, ?> map) {
                            InterfaceC21622519jj c21625319kB;
                            switch (C21623419js.LIZ[enumC21623519jt.ordinal()]) {
                                case 1:
                                    c21625319kB = new AbstractC21624319k1() { // from class: X.19jz
                                        @Override // X.AbstractC21622619jk
                                        public final boolean[] LIZJ(String str3) {
                                            int length = str3.length();
                                            if (length != 7) {
                                                if (length == 8) {
                                                    try {
                                                        if (!AbstractC21624219k0.LIZ(str3)) {
                                                            throw new IllegalArgumentException("Contents do not pass checksum");
                                                        }
                                                    } catch (C21628719kj e) {
                                                        TryCatchGuardChecker.doCheck(e);
                                                        throw new IllegalArgumentException("Illegal contents");
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
                                                }
                                            } else {
                                                try {
                                                    int iLIZIZ = AbstractC21624219k0.LIZIZ(str3);
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append(str3);
                                                    sbLIZ.append(iLIZIZ);
                                                    str3 = C2188811AlT.LIZIZ(sbLIZ);
                                                } catch (C21628719kj e2) {
                                                    TryCatchGuardChecker.doCheck(e2);
                                                    throw new IllegalArgumentException(e2);
                                                }
                                            }
                                            boolean[] zArr = new boolean[67];
                                            int iLIZIZ2 = AbstractC21622619jk.LIZIZ(zArr, 0, AbstractC21624219k0.LIZ, true);
                                            for (int i4 = 0; i4 <= 3; i4++) {
                                                iLIZIZ2 += AbstractC21622619jk.LIZIZ(zArr, iLIZIZ2, AbstractC21624219k0.LIZLLL[Character.digit(str3.charAt(i4), 10)], false);
                                            }
                                            int iLIZIZ3 = iLIZIZ2 + AbstractC21622619jk.LIZIZ(zArr, iLIZIZ2, AbstractC21624219k0.LIZIZ, false);
                                            for (int i5 = 4; i5 <= 7; i5++) {
                                                iLIZIZ3 += AbstractC21622619jk.LIZIZ(zArr, iLIZIZ3, AbstractC21624219k0.LIZLLL[Character.digit(str3.charAt(i5), 10)], true);
                                            }
                                            AbstractC21622619jk.LIZIZ(zArr, iLIZIZ3, AbstractC21624219k0.LIZ, true);
                                            return zArr;
                                        }

                                        @Override // X.AbstractC21622619jk, X.InterfaceC21622519jj
                                        public final C21621919jd LIZ(String str3, EnumC21623519jt enumC21623519jt2, int i4, int i5, Map<EnumC21624519k3, ?> map2) {
                                            if (enumC21623519jt2 == EnumC21623519jt.EAN_8) {
                                                return super.LIZ(str3, enumC21623519jt2, 200, 200, map2);
                                            }
                                            throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(enumC21623519jt2)));
                                        }
                                    };
                                    break;
                                case 2:
                                    c21625319kB = new AbstractC21624319k1() { // from class: X.19jx
                                        @Override // X.AbstractC21622619jk
                                        public final boolean[] LIZJ(String str3) {
                                            int length = str3.length();
                                            if (length != 7) {
                                                if (length == 8) {
                                                    try {
                                                        if (!AbstractC21624219k0.LIZ(str3)) {
                                                            throw new IllegalArgumentException("Contents do not pass checksum");
                                                        }
                                                    } catch (C21628719kj e) {
                                                        TryCatchGuardChecker.doCheck(e);
                                                        throw new IllegalArgumentException("Illegal contents");
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
                                                }
                                            } else {
                                                try {
                                                    int iLIZIZ = AbstractC21624219k0.LIZIZ(C14M1.LIZJ(str3));
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append(str3);
                                                    sbLIZ.append(iLIZIZ);
                                                    str3 = C2188811AlT.LIZIZ(sbLIZ);
                                                } catch (C21628719kj e2) {
                                                    TryCatchGuardChecker.doCheck(e2);
                                                    throw new IllegalArgumentException(e2);
                                                }
                                            }
                                            int iDigit = Character.digit(str3.charAt(0), 10);
                                            if (iDigit != 0 && iDigit != 1) {
                                                throw new IllegalArgumentException("Number system must be 0 or 1");
                                            }
                                            int i4 = C14M1.LJFF[iDigit][Character.digit(str3.charAt(7), 10)];
                                            boolean[] zArr = new boolean[51];
                                            int iLIZIZ2 = AbstractC21622619jk.LIZIZ(zArr, 0, AbstractC21624219k0.LIZ, true);
                                            for (int i5 = 1; i5 <= 6; i5++) {
                                                int iDigit2 = Character.digit(str3.charAt(i5), 10);
                                                if (((i4 >> (6 - i5)) & 1) == 1) {
                                                    iDigit2 += 10;
                                                }
                                                iLIZIZ2 += AbstractC21622619jk.LIZIZ(zArr, iLIZIZ2, AbstractC21624219k0.LJ[iDigit2], false);
                                            }
                                            AbstractC21622619jk.LIZIZ(zArr, iLIZIZ2, AbstractC21624219k0.LIZJ, false);
                                            return zArr;
                                        }

                                        @Override // X.AbstractC21622619jk, X.InterfaceC21622519jj
                                        public final C21621919jd LIZ(String str3, EnumC21623519jt enumC21623519jt2, int i4, int i5, Map<EnumC21624519k3, ?> map2) {
                                            if (enumC21623519jt2 == EnumC21623519jt.UPC_E) {
                                                return super.LIZ(str3, enumC21623519jt2, 200, 200, map2);
                                            }
                                            throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(enumC21623519jt2)));
                                        }
                                    };
                                    break;
                                case 3:
                                    c21625319kB = new C21624019jy();
                                    break;
                                case 4:
                                    c21625319kB = new InterfaceC21622519jj() { // from class: X.19jr
                                        public final C21624019jy LIZ = new C21624019jy();

                                        @Override // X.InterfaceC21622519jj
                                        public final C21621919jd LIZ(String str3, EnumC21623519jt enumC21623519jt2, int i4, int i5, Map<EnumC21624519k3, ?> map2) {
                                            if (enumC21623519jt2 == EnumC21623519jt.UPC_A) {
                                                return this.LIZ.LIZ(CardStruct.IStatusCode.DEFAULT.concat(String.valueOf(str3)), EnumC21623519jt.EAN_13, 200, 200, map2);
                                            }
                                            throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(enumC21623519jt2)));
                                        }
                                    };
                                    break;
                                case 5:
                                    c21625319kB = new C21625319kB();
                                    break;
                                case 6:
                                    c21625319kB = new AbstractC21622619jk() { // from class: X.19jm
                                        /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
                                        @Override // X.AbstractC21622619jk
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final boolean[] LIZJ(java.lang.String r13) {
                                            /*
                                                Method dump skipped, instruction units count: 415
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.C21622819jm.LIZJ(java.lang.String):boolean[]");
                                        }

                                        public static void LJ(int i4, int[] iArr) {
                                            int i5 = 0;
                                            do {
                                                int i6 = 1;
                                                if (((1 << (8 - i5)) & i4) != 0) {
                                                    i6 = 2;
                                                }
                                                iArr[i5] = i6;
                                                i5++;
                                            } while (i5 < 9);
                                        }

                                        @Override // X.AbstractC21622619jk, X.InterfaceC21622519jj
                                        public final C21621919jd LIZ(String str3, EnumC21623519jt enumC21623519jt2, int i4, int i5, Map<EnumC21624519k3, ?> map2) {
                                            if (enumC21623519jt2 == EnumC21623519jt.CODE_39) {
                                                return super.LIZ(str3, enumC21623519jt2, 200, 200, map2);
                                            }
                                            throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(enumC21623519jt2)));
                                        }
                                    };
                                    break;
                                case 7:
                                    c21625319kB = new AbstractC21622619jk() { // from class: X.19jo
                                        @Override // X.AbstractC21622619jk
                                        public final boolean[] LIZJ(String str3) {
                                            int length = str3.length();
                                            if (length <= 80) {
                                                int[] iArr = new int[9];
                                                int length2 = ((str3.length() + 2 + 2) * 9) + 1;
                                                LJI(C21623119jp.LIZ[47], iArr);
                                                boolean[] zArr = new boolean[length2];
                                                LJ(zArr, 0, iArr);
                                                int i4 = 9;
                                                for (int i5 = 0; i5 < length; i5++) {
                                                    LJI(C21623119jp.LIZ["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str3.charAt(i5))], iArr);
                                                    LJ(zArr, i4, iArr);
                                                    i4 += 9;
                                                }
                                                int iLJFF = LJFF(20, str3);
                                                int[] iArr2 = C21623119jp.LIZ;
                                                LJI(iArr2[iLJFF], iArr);
                                                LJ(zArr, i4, iArr);
                                                int i6 = i4 + 9;
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append(str3);
                                                sbLIZ.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iLJFF));
                                                LJI(iArr2[LJFF(15, C2188811AlT.LIZIZ(sbLIZ))], iArr);
                                                LJ(zArr, i6, iArr);
                                                int i7 = i6 + 9;
                                                LJI(iArr2[47], iArr);
                                                LJ(zArr, i7, iArr);
                                                zArr[i7 + 9] = true;
                                                return zArr;
                                            }
                                            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
                                        }

                                        public static int LJFF(int i4, String str3) {
                                            int iIndexOf = 0;
                                            int i5 = 1;
                                            for (int length = str3.length() - 1; length >= 0; length--) {
                                                iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str3.charAt(length)) * i5;
                                                i5++;
                                                if (i5 > i4) {
                                                    i5 = 1;
                                                }
                                            }
                                            return iIndexOf % 47;
                                        }

                                        public static void LJI(int i4, int[] iArr) {
                                            int i5 = 0;
                                            do {
                                                int i6 = 1;
                                                if (((1 << (8 - i5)) & i4) == 0) {
                                                    i6 = 0;
                                                }
                                                iArr[i5] = i6;
                                                i5++;
                                            } while (i5 < 9);
                                        }

                                        public static void LJ(boolean[] zArr, int i4, int[] iArr) {
                                            boolean z;
                                            int length = iArr.length;
                                            int i5 = 0;
                                            while (i5 < length) {
                                                int i6 = i4 + 1;
                                                if (iArr[i5] != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                zArr[i4] = z;
                                                i5++;
                                                i4 = i6;
                                            }
                                        }

                                        @Override // X.AbstractC21622619jk, X.InterfaceC21622519jj
                                        public final C21621919jd LIZ(String str3, EnumC21623519jt enumC21623519jt2, int i4, int i5, Map<EnumC21624519k3, ?> map2) {
                                            if (enumC21623519jt2 == EnumC21623519jt.CODE_93) {
                                                return super.LIZ(str3, enumC21623519jt2, 200, 200, map2);
                                            }
                                            throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(enumC21623519jt2)));
                                        }
                                    };
                                    break;
                                case 8:
                                    c21625319kB = new AbstractC21622619jk() { // from class: X.19ju
                                        /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
                                        
                                            if (r0 < '`') goto L28;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
                                        
                                            if (LJ(r9 + 3, r18) == X.EnumC21623719jv.TWO_DIGITS) goto L58;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:64:0x00da, code lost:
                                        
                                            if (r1 == X.EnumC21623719jv.ONE_DIGIT) goto L28;
                                         */
                                        /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
                                        /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
                                        /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
                                        /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
                                        /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
                                        /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
                                        /* JADX WARN: Removed duplicated region for block: B:72:0x00ec  */
                                        /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
                                        @Override // X.AbstractC21622619jk
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final boolean[] LIZJ(java.lang.String r18) {
                                            /*
                                                Method dump skipped, instruction units count: 370
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.C21623619ju.LIZJ(java.lang.String):boolean[]");
                                        }

                                        public static EnumC21623719jv LJ(int i4, CharSequence charSequence) {
                                            int length = charSequence.length();
                                            if (i4 >= length) {
                                                return EnumC21623719jv.UNCODABLE;
                                            }
                                            char cCharAt = charSequence.charAt(i4);
                                            if (cCharAt == 241) {
                                                return EnumC21623719jv.FNC_1;
                                            }
                                            if (cCharAt >= '0' && cCharAt <= '9') {
                                                int i5 = i4 + 1;
                                                if (i5 >= length) {
                                                    return EnumC21623719jv.ONE_DIGIT;
                                                }
                                                char cCharAt2 = charSequence.charAt(i5);
                                                if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                                                    return EnumC21623719jv.TWO_DIGITS;
                                                }
                                                return EnumC21623719jv.ONE_DIGIT;
                                            }
                                            return EnumC21623719jv.UNCODABLE;
                                        }

                                        @Override // X.AbstractC21622619jk, X.InterfaceC21622519jj
                                        public final C21621919jd LIZ(String str3, EnumC21623519jt enumC21623519jt2, int i4, int i5, Map<EnumC21624519k3, ?> map2) {
                                            if (enumC21623519jt2 == EnumC21623519jt.CODE_128) {
                                                return super.LIZ(str3, enumC21623519jt2, 200, 200, map2);
                                            }
                                            throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(enumC21623519jt2)));
                                        }
                                    };
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    c21625319kB = new AbstractC21622619jk() { // from class: X.19jl
                                        public static final int[] LIZ = {1, 1, 1, 1};
                                        public static final int[] LIZIZ = {3, 1, 1};
                                        public static final int[][] LIZJ = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

                                        @Override // X.AbstractC21622619jk
                                        public final boolean[] LIZJ(String str3) {
                                            int length = str3.length();
                                            if (length % 2 == 0) {
                                                if (length <= 80) {
                                                    boolean[] zArr = new boolean[(length * 9) + 9];
                                                    int iLIZIZ = AbstractC21622619jk.LIZIZ(zArr, 0, LIZ, true);
                                                    for (int i4 = 0; i4 < length; i4 += 2) {
                                                        int iDigit = Character.digit(str3.charAt(i4), 10);
                                                        int iDigit2 = Character.digit(str3.charAt(i4 + 1), 10);
                                                        int[] iArr = new int[10];
                                                        int i5 = 0;
                                                        do {
                                                            int i6 = i5 * 2;
                                                            int[][] iArr2 = LIZJ;
                                                            iArr[i6] = iArr2[iDigit][i5];
                                                            iArr[i6 + 1] = iArr2[iDigit2][i5];
                                                            i5++;
                                                        } while (i5 < 5);
                                                        iLIZIZ += AbstractC21622619jk.LIZIZ(zArr, iLIZIZ, iArr, true);
                                                    }
                                                    AbstractC21622619jk.LIZIZ(zArr, iLIZIZ, LIZIZ, true);
                                                    return zArr;
                                                }
                                                throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
                                            }
                                            throw new IllegalArgumentException("The length of the input should be even");
                                        }

                                        @Override // X.AbstractC21622619jk, X.InterfaceC21622519jj
                                        public final C21621919jd LIZ(String str3, EnumC21623519jt enumC21623519jt2, int i4, int i5, Map<EnumC21624519k3, ?> map2) {
                                            if (enumC21623519jt2 == EnumC21623519jt.ITF) {
                                                return super.LIZ(str3, enumC21623519jt2, 200, 200, map2);
                                            }
                                            throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(enumC21623519jt2)));
                                        }
                                    };
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    c21625319kB = new InterfaceC21622519jj() { // from class: X.19k4
                                        public static byte[][] LIZJ(byte[][] bArr) {
                                            byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
                                            for (int i4 = 0; i4 < bArr.length; i4++) {
                                                int length = (bArr.length - i4) - 1;
                                                for (int i5 = 0; i5 < bArr[0].length; i5++) {
                                                    bArr2[i5][length] = bArr[i4][i5];
                                                }
                                            }
                                            return bArr2;
                                        }

                                        public static C21621919jd LIZIZ(byte[][] bArr, int i4) {
                                            int length = bArr[0].length;
                                            int i5 = i4 * 2;
                                            int length2 = bArr.length + i5;
                                            C21621919jd c21621919jd = new C21621919jd(length + i5, length2);
                                            int length3 = c21621919jd.LLILZ.length;
                                            for (int i6 = 0; i6 < length3; i6++) {
                                                c21621919jd.LLILZ[i6] = 0;
                                            }
                                            int i7 = (length2 - i4) - 1;
                                            int i8 = 0;
                                            while (i8 < bArr.length) {
                                                byte[] bArr2 = bArr[i8];
                                                for (int i9 = 0; i9 < bArr[0].length; i9++) {
                                                    if (bArr2[i9] == 1) {
                                                        c21621919jd.LIZIZ(i9 + i4, i7);
                                                    }
                                                }
                                                i8++;
                                                i7--;
                                            }
                                            return c21621919jd;
                                        }

                                        /* JADX WARN: Code restructure failed: missing block: B:126:0x0235, code lost:
                                        
                                            throw new X.C21626019kI("Non-encodable character detected: " + r3 + " (Unicode: " + ((int) r3) + ')');
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:163:0x02f3, code lost:
                                        
                                            if (r5 != null) goto L153;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:89:0x0180, code lost:
                                        
                                            r3 = r18.charAt(r1);
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:90:0x0189, code lost:
                                        
                                            if (r15.canEncode(r3) == false) goto L227;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:91:0x018b, code lost:
                                        
                                            r1 = r1 + 1;
                                         */
                                        /* JADX WARN: Removed duplicated region for block: B:122:0x01fa  */
                                        @Override // X.InterfaceC21622519jj
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final X.C21621919jd LIZ(java.lang.String r18, X.EnumC21623519jt r19, int r20, int r21, java.util.Map<X.EnumC21624519k3, ?> r22) throws X.C21626019kI {
                                            /*
                                                Method dump skipped, instruction units count: 1157
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.C21624619k4.LIZ(java.lang.String, X.19jt, int, int, java.util.Map):X.19jd");
                                        }
                                    };
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    c21625319kB = new AbstractC21622619jk() { // from class: X.139o
                                        public static final char[] LIZ;
                                        public static final char[] LIZIZ = {'T', 'N', '*', 'E'};
                                        public static final char[] LIZJ = {'/', ':', '+', '.'};
                                        public static final char LIZLLL;

                                        static {
                                            char[] cArr = {'A', 'B', 'C', 'D'};
                                            LIZ = cArr;
                                            LIZLLL = cArr[0];
                                        }

                                        @Override // X.AbstractC21622619jk
                                        public final boolean[] LIZJ(String str3) {
                                            int i4;
                                            int length = str3.length();
                                            char c = LIZLLL;
                                            if (length < 2) {
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append(c);
                                                sbLIZ.append(str3);
                                                sbLIZ.append(c);
                                                str3 = C2188811AlT.LIZIZ(sbLIZ);
                                            } else {
                                                char upperCase = Character.toUpperCase(str3.charAt(0));
                                                char upperCase2 = Character.toUpperCase(str3.charAt(str3.length() - 1));
                                                char[] cArr = LIZ;
                                                boolean zLIZ = C199647139p.LIZ(upperCase, cArr);
                                                boolean zLIZ2 = C199647139p.LIZ(upperCase2, cArr);
                                                char[] cArr2 = LIZIZ;
                                                boolean zLIZ3 = C199647139p.LIZ(upperCase, cArr2);
                                                boolean zLIZ4 = C199647139p.LIZ(upperCase2, cArr2);
                                                if (zLIZ) {
                                                    if (!zLIZ2) {
                                                        throw new IllegalArgumentException("Invalid start/end guards: ".concat(str3));
                                                    }
                                                } else if (zLIZ3) {
                                                    if (!zLIZ4) {
                                                        throw new IllegalArgumentException("Invalid start/end guards: ".concat(str3));
                                                    }
                                                } else if (!zLIZ2 && !zLIZ4) {
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append(c);
                                                    sbLIZ2.append(str3);
                                                    sbLIZ2.append(c);
                                                    str3 = C2188811AlT.LIZIZ(sbLIZ2);
                                                } else {
                                                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str3));
                                                }
                                            }
                                            int i5 = 20;
                                            for (int i6 = 1; i6 < str3.length() - 1; i6++) {
                                                if (!Character.isDigit(str3.charAt(i6)) && str3.charAt(i6) != '-' && str3.charAt(i6) != '$') {
                                                    if (C199647139p.LIZ(str3.charAt(i6), LIZJ)) {
                                                        i5 += 10;
                                                    } else {
                                                        throw new IllegalArgumentException("Cannot encode : '" + str3.charAt(i6) + '\'');
                                                    }
                                                } else {
                                                    i5 += 9;
                                                }
                                            }
                                            boolean[] zArr = new boolean[i5 + (str3.length() - 1)];
                                            int i7 = 0;
                                            for (int i8 = 0; i8 < str3.length(); i8++) {
                                                char upperCase3 = Character.toUpperCase(str3.charAt(i8));
                                                if (i8 == 0 || i8 == str3.length() - 1) {
                                                    if (upperCase3 != '*') {
                                                        if (upperCase3 != 'E') {
                                                            if (upperCase3 != 'N') {
                                                                if (upperCase3 == 'T') {
                                                                    upperCase3 = 'A';
                                                                }
                                                            } else {
                                                                upperCase3 = 'B';
                                                            }
                                                        } else {
                                                            upperCase3 = 'D';
                                                        }
                                                    } else {
                                                        upperCase3 = 'C';
                                                    }
                                                }
                                                int i9 = 0;
                                                while (true) {
                                                    char[] cArr3 = C199647139p.LIZ;
                                                    if (i9 < cArr3.length) {
                                                        if (upperCase3 == cArr3[i9]) {
                                                            i4 = C199647139p.LIZIZ[i9];
                                                            break;
                                                        }
                                                        i9++;
                                                    } else {
                                                        i4 = 0;
                                                        break;
                                                    }
                                                }
                                                int i10 = 0;
                                                boolean z = false;
                                                boolean z2 = true;
                                                while (true) {
                                                    zArr[i7] = z2;
                                                    i7++;
                                                    if (((i4 >> (6 - i10)) & 1) != 0 && !z) {
                                                        z = true;
                                                    } else {
                                                        z2 = !z2;
                                                        i10++;
                                                        z = false;
                                                        if (i10 >= 7) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                if (i8 < str3.length() - 1) {
                                                    zArr[i7] = false;
                                                    i7++;
                                                }
                                            }
                                            return zArr;
                                        }
                                    };
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    c21625319kB = new InterfaceC21622519jj() { // from class: X.19kX
                                        @Override // X.InterfaceC21622519jj
                                        public final C21621919jd LIZ(String str3, EnumC21623519jt enumC21623519jt2, int i4, int i5, Map<EnumC21624519k3, ?> map2) {
                                            int i6;
                                            int i7;
                                            C21621919jd c21621919jd;
                                            boolean z;
                                            boolean z2;
                                            boolean z3;
                                            if (!str3.isEmpty()) {
                                                if (enumC21623519jt2 == EnumC21623519jt.DATA_MATRIX) {
                                                    EnumC1700580uM4 enumC1700580uM4 = EnumC1700580uM4.FORCE_NONE;
                                                    EnumMap enumMap2 = (EnumMap) map2;
                                                    EnumC1700580uM4 enumC1700580uM42 = (EnumC1700580uM4) enumMap2.get(EnumC21624519k3.DATA_MATRIX_SHAPE);
                                                    if (enumC1700580uM42 != null) {
                                                        enumC1700580uM4 = enumC1700580uM42;
                                                    }
                                                    C006K c006k = (C006K) enumMap2.get(EnumC21624519k3.MIN_SIZE);
                                                    C006K c006k2 = null;
                                                    if (c006k == null) {
                                                        c006k = null;
                                                    }
                                                    C006K c006k3 = (C006K) enumMap2.get(EnumC21624519k3.MAX_SIZE);
                                                    if (c006k3 != null) {
                                                        c006k2 = c006k3;
                                                    }
                                                    InterfaceC21628619ki[] interfaceC21628619kiArr = {new InterfaceC21628619ki() { // from class: X.19ke
                                                        @Override // X.InterfaceC21628619ki
                                                        public final void LIZ(C21627619kY c21627619kY) {
                                                            int i8;
                                                            String str4 = c21627619kY.LIZ;
                                                            int i9 = c21627619kY.LJFF;
                                                            int length = str4.length();
                                                            if (i9 < length) {
                                                                char cCharAt = str4.charAt(i9);
                                                                i8 = 0;
                                                                while (cCharAt >= '0' && cCharAt <= '9' && i9 < length) {
                                                                    i8++;
                                                                    i9++;
                                                                    if (i9 < length) {
                                                                        cCharAt = str4.charAt(i9);
                                                                    }
                                                                }
                                                            } else {
                                                                i8 = 0;
                                                            }
                                                            if (i8 >= 2) {
                                                                char cCharAt2 = c21627619kY.LIZ.charAt(c21627619kY.LJFF);
                                                                char cCharAt3 = c21627619kY.LIZ.charAt(c21627619kY.LJFF + 1);
                                                                if (cCharAt2 >= '0' && cCharAt2 <= '9' && cCharAt3 >= '0' && cCharAt3 <= '9') {
                                                                    c21627619kY.LJ((char) (((cCharAt2 - '0') * 10) + (cCharAt3 - '0') + 130));
                                                                    c21627619kY.LJFF += 2;
                                                                    return;
                                                                } else {
                                                                    throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
                                                                }
                                                            }
                                                            char cLIZIZ = c21627619kY.LIZIZ();
                                                            int iLJ = C1284310jWf.LJ(c21627619kY.LJFF, 0, c21627619kY.LIZ);
                                                            if (iLJ != 0) {
                                                                if (iLJ != 1) {
                                                                    if (iLJ != 2) {
                                                                        if (iLJ != 3) {
                                                                            if (iLJ != 4) {
                                                                                if (iLJ == 5) {
                                                                                    c21627619kY.LJ((char) 231);
                                                                                    c21627619kY.LJI = 5;
                                                                                    return;
                                                                                }
                                                                                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iLJ)));
                                                                            }
                                                                            c21627619kY.LJ((char) 240);
                                                                            c21627619kY.LJI = 4;
                                                                            return;
                                                                        }
                                                                        c21627619kY.LJ((char) 238);
                                                                        c21627619kY.LJI = 3;
                                                                        return;
                                                                    }
                                                                    c21627619kY.LJ((char) 239);
                                                                    c21627619kY.LJI = 2;
                                                                    return;
                                                                }
                                                                c21627619kY.LJ((char) 230);
                                                                c21627619kY.LJI = 1;
                                                                return;
                                                            }
                                                            if (C1284310jWf.LIZJ(cLIZIZ)) {
                                                                c21627619kY.LJ((char) 235);
                                                                c21627619kY.LJ((char) ((cLIZIZ - 128) + 1));
                                                                c21627619kY.LJFF++;
                                                            } else {
                                                                c21627619kY.LJ((char) (cLIZIZ + 1));
                                                                c21627619kY.LJFF++;
                                                            }
                                                        }
                                                    }, new C21627819ka(), new C21627819ka() { // from class: X.19kg
                                                        @Override // X.C21627819ka
                                                        public final int LIZJ() {
                                                            return 2;
                                                        }

                                                        @Override // X.C21627819ka
                                                        public final int LIZIZ(char c, StringBuilder sb) {
                                                            if (c == ' ') {
                                                                sb.append((char) 3);
                                                                return 1;
                                                            }
                                                            if (c >= '0') {
                                                                if (c <= '9') {
                                                                    sb.append((char) ((c - '0') + 4));
                                                                    return 1;
                                                                }
                                                                if (c >= 'a' && c <= 'z') {
                                                                    sb.append((char) ((c - 'a') + 14));
                                                                    return 1;
                                                                }
                                                            }
                                                            if (c < ' ') {
                                                                sb.append((char) 0);
                                                                sb.append(c);
                                                                return 2;
                                                            }
                                                            if (c >= '!') {
                                                                if (c <= '/') {
                                                                    sb.append((char) 1);
                                                                    sb.append((char) (c - '!'));
                                                                    return 2;
                                                                }
                                                                if (c >= ':') {
                                                                    if (c <= '@') {
                                                                        sb.append((char) 1);
                                                                        sb.append((char) ((c - ':') + 15));
                                                                        return 2;
                                                                    }
                                                                    if (c >= '[') {
                                                                        if (c <= '_') {
                                                                            sb.append((char) 1);
                                                                            sb.append((char) ((c - '[') + 22));
                                                                            return 2;
                                                                        }
                                                                        if (c == '`') {
                                                                            sb.append((char) 2);
                                                                            sb.append((char) 0);
                                                                            return 2;
                                                                        }
                                                                    }
                                                                    if (c >= 'A') {
                                                                        if (c <= 'Z') {
                                                                            sb.append((char) 2);
                                                                            sb.append((char) ((c - 'A') + 1));
                                                                            return 2;
                                                                        }
                                                                        if (c >= '{' && c <= 127) {
                                                                            sb.append((char) 2);
                                                                            sb.append((char) ((c - '{') + 27));
                                                                            return 2;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            sb.append("\u0001\u001e");
                                                            return LIZIZ((char) (c - 128), sb) + 2;
                                                        }
                                                    }, new C21627819ka() { // from class: X.19kb
                                                        @Override // X.C21627819ka
                                                        public final int LIZJ() {
                                                            return 3;
                                                        }

                                                        @Override // X.C21627819ka, X.InterfaceC21628619ki
                                                        public final void LIZ(C21627619kY c21627619kY) {
                                                            StringBuilder sb = new StringBuilder();
                                                            while (true) {
                                                                if (!c21627619kY.LIZJ()) {
                                                                    break;
                                                                }
                                                                char cLIZIZ = c21627619kY.LIZIZ();
                                                                c21627619kY.LJFF++;
                                                                LIZIZ(cLIZIZ, sb);
                                                                if (sb.length() % 3 == 0) {
                                                                    C21627819ka.LJ(c21627619kY, sb);
                                                                    if (C1284310jWf.LJ(c21627619kY.LJFF, 3, c21627619kY.LIZ) != 3) {
                                                                        c21627619kY.LJI = 0;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            LIZLLL(c21627619kY, sb);
                                                        }

                                                        @Override // X.C21627819ka
                                                        public final int LIZIZ(char c, StringBuilder sb) {
                                                            if (c != '\r') {
                                                                if (c != ' ') {
                                                                    if (c != '*') {
                                                                        if (c != '>') {
                                                                            if (c >= '0') {
                                                                                if (c <= '9') {
                                                                                    sb.append((char) ((c - '0') + 4));
                                                                                    return 1;
                                                                                }
                                                                                if (c >= 'A' && c <= 'Z') {
                                                                                    sb.append((char) ((c - 'A') + 14));
                                                                                    return 1;
                                                                                }
                                                                            }
                                                                            C1284310jWf.LIZIZ(c);
                                                                            throw null;
                                                                        }
                                                                        sb.append((char) 2);
                                                                        return 1;
                                                                    }
                                                                    sb.append((char) 1);
                                                                    return 1;
                                                                }
                                                                sb.append((char) 3);
                                                                return 1;
                                                            }
                                                            sb.append((char) 0);
                                                            return 1;
                                                        }

                                                        @Override // X.C21627819ka
                                                        public final void LIZLLL(C21627619kY c21627619kY, StringBuilder sb) {
                                                            c21627619kY.LIZLLL(c21627619kY.LIZ());
                                                            int iLIZ = c21627619kY.LJII.LIZIZ - c21627619kY.LIZ();
                                                            c21627619kY.LJFF -= sb.length();
                                                            if ((c21627619kY.LIZ.length() - c21627619kY.LJIIIIZZ) - c21627619kY.LJFF > 1 || iLIZ > 1 || (c21627619kY.LIZ.length() - c21627619kY.LJIIIIZZ) - c21627619kY.LJFF != iLIZ) {
                                                                c21627619kY.LJ((char) 254);
                                                            }
                                                            if (c21627619kY.LJI < 0) {
                                                                c21627619kY.LJI = 0;
                                                            }
                                                        }
                                                    }, new InterfaceC21628619ki() { // from class: X.19kZ
                                                        public static String LIZIZ(CharSequence charSequence) {
                                                            char cCharAt;
                                                            char cCharAt2;
                                                            StringBuilder sb = (StringBuilder) charSequence;
                                                            int length = sb.length();
                                                            char cCharAt3 = 0;
                                                            if (length != 0) {
                                                                char cCharAt4 = sb.charAt(0);
                                                                if (length >= 2) {
                                                                    cCharAt = sb.charAt(1);
                                                                } else {
                                                                    cCharAt = 0;
                                                                }
                                                                if (length >= 3) {
                                                                    cCharAt2 = sb.charAt(2);
                                                                    if (length >= 4) {
                                                                        cCharAt3 = sb.charAt(3);
                                                                    }
                                                                } else {
                                                                    cCharAt2 = 0;
                                                                }
                                                                int i8 = (cCharAt4 << 18) + (cCharAt << '\f') + (cCharAt2 << 6) + cCharAt3;
                                                                char c = (char) ((i8 >> 16) & 255);
                                                                char c2 = (char) ((i8 >> 8) & 255);
                                                                char c3 = (char) (i8 & 255);
                                                                StringBuilder sb2 = new StringBuilder(3);
                                                                sb2.append(c);
                                                                if (length >= 2) {
                                                                    sb2.append(c2);
                                                                    if (length >= 3) {
                                                                        sb2.append(c3);
                                                                    }
                                                                }
                                                                return sb2.toString();
                                                            }
                                                            throw new IllegalStateException("StringBuilder must not be empty");
                                                        }

                                                        /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
                                                        
                                                            r3.append((char) 31);
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
                                                        
                                                            r4 = r3.length();
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
                                                        
                                                            if (r4 == 0) goto L31;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
                                                        
                                                            if (r4 != 1) goto L26;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
                                                        
                                                            r10.LIZLLL(r10.LIZ());
                                                            r8 = r10.LJII.LIZIZ - r10.LIZ();
                                                            r1 = (r10.LIZ.length() - r10.LJIIIIZZ) - r10.LJFF;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
                                                        
                                                            if (r1 <= r8) goto L29;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
                                                        
                                                            r10.LIZLLL(r10.LIZ() + 1);
                                                            r8 = r10.LJII.LIZIZ - r10.LIZ();
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
                                                        
                                                            if (r4 <= 4) goto L33;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
                                                        
                                                            throw new java.lang.IllegalStateException("Count must not exceed 4");
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
                                                        
                                                            if (r1 > r8) goto L33;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
                                                        
                                                            if (r8 > 2) goto L33;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
                                                        
                                                            r10.LJI = 0;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
                                                        
                                                            return;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
                                                        
                                                            r4 = r4 - 1;
                                                            r3 = LIZIZ(r3);
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
                                                        
                                                            if ((!r10.LIZJ()) == false) goto L37;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
                                                        
                                                            if (r4 > 2) goto L45;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
                                                        
                                                            r5 = false;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
                                                        
                                                            if (r4 > 2) goto L40;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
                                                        
                                                            if (r5 == false) goto L45;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
                                                        
                                                            r10.LIZLLL(r10.LIZ() + r4);
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
                                                        
                                                            if ((r10.LJII.LIZIZ - r10.LIZ()) < 3) goto L40;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
                                                        
                                                            r10.LIZLLL(r10.LIZ() + r3.length());
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:45:0x00d5, code lost:
                                                        
                                                            r10.LJ.append(r3);
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:46:0x00db, code lost:
                                                        
                                                            r10.LJII = null;
                                                            r10.LJFF -= r4;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:47:0x00e3, code lost:
                                                        
                                                            r0 = move-exception;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:48:0x00e4, code lost:
                                                        
                                                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
                                                            r10.LJI = 0;
                                                         */
                                                        /* JADX WARN: Code restructure failed: missing block: B:49:0x00e9, code lost:
                                                        
                                                            throw r0;
                                                         */
                                                        @Override // X.InterfaceC21628619ki
                                                        /*
                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                            To view partially-correct add '--show-bad-code' argument
                                                        */
                                                        public final void LIZ(X.C21627619kY r10) {
                                                            /*
                                                                Method dump skipped, instruction units count: 238
                                                                To view this dump add '--comments-level debug' option
                                                            */
                                                            throw new UnsupportedOperationException("Method not decompiled: X.C21627719kZ.LIZ(X.19kY):void");
                                                        }
                                                    }, new InterfaceC21628619ki() { // from class: X.19kc
                                                        @Override // X.InterfaceC21628619ki
                                                        public final void LIZ(C21627619kY c21627619kY) {
                                                            boolean z4;
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append((char) 0);
                                                            while (true) {
                                                                if (!c21627619kY.LIZJ()) {
                                                                    break;
                                                                }
                                                                sb.append(c21627619kY.LIZIZ());
                                                                int i8 = c21627619kY.LJFF + 1;
                                                                c21627619kY.LJFF = i8;
                                                                if (C1284310jWf.LJ(i8, 5, c21627619kY.LIZ) != 5) {
                                                                    c21627619kY.LJI = 0;
                                                                    break;
                                                                }
                                                            }
                                                            int length = sb.length() - 1;
                                                            int iLIZ = c21627619kY.LIZ() + length + 1;
                                                            c21627619kY.LIZLLL(iLIZ);
                                                            if (c21627619kY.LJII.LIZIZ - iLIZ > 0) {
                                                                z4 = true;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                            if (c21627619kY.LIZJ() || z4) {
                                                                if (length <= 249) {
                                                                    sb.setCharAt(0, (char) length);
                                                                } else if (length <= 1555) {
                                                                    sb.setCharAt(0, (char) ((length / 250) + 249));
                                                                    sb.insert(1, (char) (length % 250));
                                                                } else {
                                                                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                                                                }
                                                            }
                                                            int length2 = sb.length();
                                                            for (int i9 = 0; i9 < length2; i9++) {
                                                                int iCharAt = sb.charAt(i9) + (((c21627619kY.LIZ() + 1) * 149) % 255) + 1;
                                                                if (iCharAt > 255) {
                                                                    iCharAt -= 256;
                                                                }
                                                                c21627619kY.LJ((char) iCharAt);
                                                            }
                                                        }
                                                    }};
                                                    C21627619kY c21627619kY = new C21627619kY(str3);
                                                    c21627619kY.LIZIZ = enumC1700580uM4;
                                                    c21627619kY.LIZJ = c006k;
                                                    c21627619kY.LIZLLL = c006k2;
                                                    if (str3.startsWith("[)>\u001e05\u001d") && str3.endsWith("\u001e\u0004")) {
                                                        c21627619kY.LJ((char) 236);
                                                        c21627619kY.LJIIIIZZ = 2;
                                                        c21627619kY.LJFF += 7;
                                                    } else if (str3.startsWith("[)>\u001e06\u001d") && str3.endsWith("\u001e\u0004")) {
                                                        c21627619kY.LJ((char) 237);
                                                        c21627619kY.LJIIIIZZ = 2;
                                                        c21627619kY.LJFF += 7;
                                                    }
                                                    int i8 = 0;
                                                    while (c21627619kY.LIZJ()) {
                                                        interfaceC21628619kiArr[i8].LIZ(c21627619kY);
                                                        int i9 = c21627619kY.LJI;
                                                        if (i9 >= 0) {
                                                            c21627619kY.LJI = -1;
                                                            i8 = i9;
                                                        }
                                                    }
                                                    int iLIZ = c21627619kY.LIZ();
                                                    c21627619kY.LIZLLL(c21627619kY.LIZ());
                                                    int i10 = c21627619kY.LJII.LIZIZ;
                                                    if (iLIZ < i10 && i8 != 0 && i8 != 5 && i8 != 4) {
                                                        c21627619kY.LJ((char) 254);
                                                    }
                                                    StringBuilder sb = c21627619kY.LJ;
                                                    if (sb.length() < i10) {
                                                        sb.append((char) 129);
                                                    }
                                                    while (sb.length() < i10) {
                                                        int length = (((sb.length() + 1) * 149) % 253) + 1 + 129;
                                                        if (length > 254) {
                                                            length -= 254;
                                                        }
                                                        sb.append((char) length);
                                                    }
                                                    String string = c21627619kY.LJ.toString();
                                                    C21628119kd c21628119kdLJFF = C21628119kd.LJFF(string.length(), enumC1700580uM4, c006k, c006k2);
                                                    int length2 = string.length();
                                                    int i11 = c21628119kdLJFF.LIZIZ;
                                                    if (length2 == i11) {
                                                        StringBuilder sb2 = new StringBuilder(i11 + c21628119kdLJFF.LIZJ);
                                                        sb2.append(string);
                                                        int iLIZJ = c21628119kdLJFF.LIZJ();
                                                        if (iLIZJ == 1) {
                                                            sb2.append(C1283400jVC.LIZ(c21628119kdLJFF.LIZJ, string));
                                                        } else {
                                                            sb2.setLength(sb2.capacity());
                                                            int[] iArr = new int[iLIZJ];
                                                            int[] iArr2 = new int[iLIZJ];
                                                            int i12 = 0;
                                                            while (i12 < iLIZJ) {
                                                                int i13 = i12 + 1;
                                                                iArr[i12] = c21628119kdLJFF.LIZ(i13);
                                                                iArr2[i12] = c21628119kdLJFF.LJII;
                                                                i12 = i13;
                                                            }
                                                            for (int i14 = 0; i14 < iLIZJ; i14++) {
                                                                StringBuilder sb3 = new StringBuilder(iArr[i14]);
                                                                for (int i15 = i14; i15 < c21628119kdLJFF.LIZIZ; i15 += iLIZJ) {
                                                                    sb3.append(string.charAt(i15));
                                                                }
                                                                String strLIZ = C1283400jVC.LIZ(iArr2[i14], sb3.toString());
                                                                int i16 = i14;
                                                                int i17 = 0;
                                                                while (i16 < iArr2[i14] * iLIZJ) {
                                                                    sb2.setCharAt(c21628119kdLJFF.LIZIZ + i16, strLIZ.charAt(i17));
                                                                    i16 += iLIZJ;
                                                                    i17++;
                                                                }
                                                            }
                                                        }
                                                        C21628319kf c21628319kf = new C21628319kf(c21628119kdLJFF.LIZIZ() * c21628119kdLJFF.LIZLLL, c21628119kdLJFF.LJ() * c21628119kdLJFF.LJ, sb2.toString());
                                                        int i18 = 0;
                                                        int i19 = 0;
                                                        int i20 = 4;
                                                        while (true) {
                                                            int i21 = c21628319kf.LIZIZ;
                                                            if (i20 == i21 && i18 == 0) {
                                                                c21628319kf.LIZ(i21 - 1, 0, i19, 1);
                                                                c21628319kf.LIZ(c21628319kf.LIZIZ - 1, 1, i19, 2);
                                                                c21628319kf.LIZ(c21628319kf.LIZIZ - 1, 2, i19, 3);
                                                                c21628319kf.LIZ(0, c21628319kf.LIZJ - 2, i19, 4);
                                                                c21628319kf.LIZ(0, c21628319kf.LIZJ - 1, i19, 5);
                                                                c21628319kf.LIZ(1, c21628319kf.LIZJ - 1, i19, 6);
                                                                c21628319kf.LIZ(2, c21628319kf.LIZJ - 1, i19, 7);
                                                                c21628319kf.LIZ(3, c21628319kf.LIZJ - 1, i19, 8);
                                                                i19++;
                                                            }
                                                            int i22 = c21628319kf.LIZIZ;
                                                            if (i20 == i22 - 2 && i18 == 0 && c21628319kf.LIZJ % 4 != 0) {
                                                                c21628319kf.LIZ(i22 - 3, 0, i19, 1);
                                                                c21628319kf.LIZ(c21628319kf.LIZIZ - 2, 0, i19, 2);
                                                                c21628319kf.LIZ(c21628319kf.LIZIZ - 1, 0, i19, 3);
                                                                c21628319kf.LIZ(0, c21628319kf.LIZJ - 4, i19, 4);
                                                                c21628319kf.LIZ(0, c21628319kf.LIZJ - 3, i19, 5);
                                                                c21628319kf.LIZ(0, c21628319kf.LIZJ - 2, i19, 6);
                                                                c21628319kf.LIZ(0, c21628319kf.LIZJ - 1, i19, 7);
                                                                c21628319kf.LIZ(1, c21628319kf.LIZJ - 1, i19, 8);
                                                                i19++;
                                                            }
                                                            int i23 = c21628319kf.LIZIZ;
                                                            if (i20 == i23 - 2 && i18 == 0 && c21628319kf.LIZJ % 8 == 4) {
                                                                c21628319kf.LIZ(i23 - 3, 0, i19, 1);
                                                                c21628319kf.LIZ(c21628319kf.LIZIZ - 2, 0, i19, 2);
                                                                c21628319kf.LIZ(c21628319kf.LIZIZ - 1, 0, i19, 3);
                                                                c21628319kf.LIZ(0, c21628319kf.LIZJ - 2, i19, 4);
                                                                c21628319kf.LIZ(0, c21628319kf.LIZJ - 1, i19, 5);
                                                                c21628319kf.LIZ(1, c21628319kf.LIZJ - 1, i19, 6);
                                                                c21628319kf.LIZ(2, c21628319kf.LIZJ - 1, i19, 7);
                                                                c21628319kf.LIZ(3, c21628319kf.LIZJ - 1, i19, 8);
                                                                i19++;
                                                            }
                                                            int i24 = c21628319kf.LIZIZ;
                                                            if (i20 == i24 + 4 && i18 == 2 && c21628319kf.LIZJ % 8 == 0) {
                                                                c21628319kf.LIZ(i24 - 1, 0, i19, 1);
                                                                c21628319kf.LIZ(c21628319kf.LIZIZ - 1, c21628319kf.LIZJ - 1, i19, 2);
                                                                c21628319kf.LIZ(0, c21628319kf.LIZJ - 3, i19, 3);
                                                                c21628319kf.LIZ(0, c21628319kf.LIZJ - 2, i19, 4);
                                                                c21628319kf.LIZ(0, c21628319kf.LIZJ - 1, i19, 5);
                                                                c21628319kf.LIZ(1, c21628319kf.LIZJ - 3, i19, 6);
                                                                c21628319kf.LIZ(1, c21628319kf.LIZJ - 2, i19, 7);
                                                                c21628319kf.LIZ(1, c21628319kf.LIZJ - 1, i19, 8);
                                                                i19++;
                                                            }
                                                            do {
                                                                if (i20 < c21628319kf.LIZIZ && i18 >= 0 && c21628319kf.LIZLLL[(c21628319kf.LIZJ * i20) + i18] < 0) {
                                                                    c21628319kf.LIZIZ(i20, i18, i19);
                                                                    i19++;
                                                                }
                                                                i20 -= 2;
                                                                i18 += 2;
                                                                if (i20 < 0) {
                                                                    break;
                                                                }
                                                            } while (i18 < c21628319kf.LIZJ);
                                                            int i25 = i20 + 1;
                                                            int i26 = i18 + 3;
                                                            do {
                                                                if (i25 >= 0) {
                                                                    int i27 = c21628319kf.LIZJ;
                                                                    if (i26 < i27 && c21628319kf.LIZLLL[(i27 * i25) + i26] < 0) {
                                                                        c21628319kf.LIZIZ(i25, i26, i19);
                                                                        i19++;
                                                                    }
                                                                }
                                                                i25 += 2;
                                                                i26 -= 2;
                                                                i6 = c21628319kf.LIZIZ;
                                                                if (i25 >= i6) {
                                                                    break;
                                                                }
                                                            } while (i26 >= 0);
                                                            i20 = i25 + 3;
                                                            i18 = i26 + 1;
                                                            if (i20 >= i6 && i18 >= (i7 = c21628319kf.LIZJ)) {
                                                                break;
                                                            }
                                                        }
                                                        byte[] bArr = c21628319kf.LIZLLL;
                                                        if (bArr[((i6 - 1) * i7) + (i7 - 1)] < 0) {
                                                            byte b = (byte) 1;
                                                            bArr[((i6 - 1) * i7) + (i7 - 1)] = b;
                                                            bArr[((i6 - 2) * i7) + (i7 - 2)] = b;
                                                        }
                                                        int iLIZIZ = c21628119kdLJFF.LIZIZ() * c21628119kdLJFF.LIZLLL;
                                                        int iLJ = c21628119kdLJFF.LJ() * c21628119kdLJFF.LJ;
                                                        C21625619kE c21625619kE = new C21625619kE(c21628119kdLJFF.LIZLLL(), (c21628119kdLJFF.LJ() * c21628119kdLJFF.LJ) + (c21628119kdLJFF.LJ() << 1));
                                                        int i28 = 0;
                                                        for (int i29 = 0; i29 < iLJ; i29++) {
                                                            if (i29 % c21628119kdLJFF.LJ == 0) {
                                                                int i30 = 0;
                                                                for (int i31 = 0; i31 < c21628119kdLJFF.LIZLLL(); i31++) {
                                                                    if (i31 % 2 == 0) {
                                                                        z3 = true;
                                                                    } else {
                                                                        z3 = false;
                                                                    }
                                                                    c21625619kE.LIZJ(i30, i28, z3);
                                                                    i30++;
                                                                }
                                                                i28++;
                                                            }
                                                            int i32 = 0;
                                                            for (int i33 = 0; i33 < iLIZIZ; i33++) {
                                                                if (i33 % c21628119kdLJFF.LIZLLL == 0) {
                                                                    c21625619kE.LIZJ(i32, i28, true);
                                                                    i32++;
                                                                }
                                                                if (c21628319kf.LIZLLL[(c21628319kf.LIZJ * i29) + i33] == 1) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                c21625619kE.LIZJ(i32, i28, z);
                                                                i32++;
                                                                int i34 = c21628119kdLJFF.LIZLLL;
                                                                if (i33 % i34 == i34 - 1) {
                                                                    if (i29 % 2 == 0) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    c21625619kE.LIZJ(i32, i28, z2);
                                                                    i32++;
                                                                }
                                                            }
                                                            i28++;
                                                            int i35 = c21628119kdLJFF.LJ;
                                                            if (i29 % i35 == i35 - 1) {
                                                                int i36 = 0;
                                                                for (int i37 = 0; i37 < c21628119kdLJFF.LIZLLL(); i37++) {
                                                                    c21625619kE.LIZJ(i36, i28, true);
                                                                    i36++;
                                                                }
                                                                i28++;
                                                            }
                                                        }
                                                        int i38 = c21625619kE.LIZIZ;
                                                        int i39 = c21625619kE.LIZJ;
                                                        int iMax = Math.max(200, i38);
                                                        int iMax2 = Math.max(200, i39);
                                                        int iMin = Math.min(iMax / i38, iMax2 / i39);
                                                        int i40 = (iMax - (i38 * iMin)) / 2;
                                                        int i41 = (iMax2 - (i39 * iMin)) / 2;
                                                        if (200 >= i39 && 200 >= i38) {
                                                            c21621919jd = new C21621919jd(200, 200);
                                                        } else {
                                                            c21621919jd = new C21621919jd(i38, i39);
                                                            i40 = 0;
                                                            i41 = 0;
                                                        }
                                                        int length3 = c21621919jd.LLILZ.length;
                                                        for (int i42 = 0; i42 < length3; i42++) {
                                                            c21621919jd.LLILZ[i42] = 0;
                                                        }
                                                        int i43 = 0;
                                                        while (i43 < i39) {
                                                            int i44 = i40;
                                                            int i45 = 0;
                                                            while (i45 < i38) {
                                                                if (c21625619kE.LIZ(i45, i43) == 1) {
                                                                    c21621919jd.LIZJ(i44, i41, iMin, iMin);
                                                                }
                                                                i45++;
                                                                i44 += iMin;
                                                            }
                                                            i43++;
                                                            i41 += iMin;
                                                        }
                                                        return c21621919jd;
                                                    }
                                                    throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
                                                }
                                                throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(enumC21623519jt2)));
                                            }
                                            throw new IllegalArgumentException("Found empty contents");
                                        }
                                    };
                                    break;
                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                    c21625319kB = new InterfaceC21622519jj() { // from class: X.19jc
                                        /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
                                        /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
                                        @Override // X.InterfaceC21622519jj
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final X.C21621919jd LIZ(java.lang.String r18, X.EnumC21623519jt r19, int r20, int r21, java.util.Map<X.EnumC21624519k3, ?> r22) {
                                            /*
                                                Method dump skipped, instruction units count: 1080
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.C21621819jc.LIZ(java.lang.String, X.19jt, int, int, java.util.Map):X.19jd");
                                        }
                                    };
                                    break;
                                default:
                                    throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(enumC21623519jt)));
                            }
                            return c21625319kB.LIZ(str2, enumC21623519jt, 200, 200, map);
                        }
                    }.LIZ(str, EnumC21623519jt.QR_CODE, 200, 200, enumMap);
                    int i2 = c21621919jdLIZ.LLILLJJLI;
                    int i3 = c21621919jdLIZ.LL;
                    int[] iArr = new int[i2 * i3];
                    if (i2 > 0) {
                        int i4 = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            int i6 = i4 * i3;
                            if (i3 > 0) {
                                int i7 = 0;
                                while (true) {
                                    int i8 = i7 + 1;
                                    int i9 = i6 + i7;
                                    if (c21621919jdLIZ.LIZ(i7, i4)) {
                                        i = -16777216;
                                    } else {
                                        i = -1;
                                    }
                                    iArr[i9] = i;
                                    if (i8 >= i3) {
                                        break;
                                    } else {
                                        i7 = i8;
                                    }
                                }
                            }
                            if (i5 >= i2) {
                                break;
                            } else {
                                i4 = i5;
                            }
                        }
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                    try {
                        bitmapCreateBitmap.setPixels(iArr, 0, i3, 0, 0, i3, i2);
                    } catch (C21626019kI e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (C21626019kI e2) {
                    e = e2;
                    bitmapCreateBitmap = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                bitmapCreateBitmap = null;
            }
        } else {
            bitmapCreateBitmap = null;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmapCreateBitmap);
        TextView textView2 = this.LLILLL;
        textView2.getClass();
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.LLILLJJLI;
        textView3.getClass();
        C786410Ut5.LLIL(textView3, 0);
        View view = this.LL;
        view.getClass();
        C786410Ut5.LJLLLLLL(8, view);
        if (!this.LLJI) {
            String str2 = requestState.userCode;
            if (!C807660VmG.LIZ(C2202641BIo.class)) {
                try {
                    if (C2202641BIo.LIZJ()) {
                        if (C2202641BIo.LIZ.LIZLLL(str2)) {
                            getContext();
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
        if (requestState.lastPoll != 0 && (new Date().getTime() - requestState.lastPoll) - (requestState.interval * 1000) < 0) {
            VR();
        } else {
            UR();
        }
    }

    public final void ZR(LoginClient.Request request) {
        String strJ3;
        this.LLJIJIL = request;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("scope", TextUtils.join(",", request.permissions), bundle);
        String str = request.deviceRedirectUriString;
        if (!C0W7Q.LJIILL(str)) {
            C786410Ut5.LJJJI("redirect_uri", str, bundle);
        }
        String str2 = request.deviceAuthTargetUserId;
        if (!C0W7Q.LJIILL(str2)) {
            C786410Ut5.LJJJI("target_user_id", str2, bundle);
        }
        C786410Ut5.LJJJI("access_token", NR(), bundle);
        if (!C807660VmG.LIZ(C2202641BIo.class)) {
            try {
                HashMap map = new HashMap();
                map.put("device", Build.DEVICE);
                map.put("model", Build.MODEL);
                strJ3 = C786410Ut5.J3(new JSONObject(map));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                strJ3 = null;
            }
        } else {
            strJ3 = null;
        }
        C786410Ut5.LJJJI("device_info", strJ3, bundle);
        new GraphRequest(null, "device/login", bundle, C0WV6.POST, new C0WV8() { // from class: X.1BIq
            @Override // X.C0WV8
            public final void LIZIZ(C0WVK c0wvk) {
                DeviceAuthDialog deviceAuthDialog = this.LIZ;
                if (!deviceAuthDialog.LLJ) {
                    FacebookRequestError facebookRequestError = c0wvk.LIZJ;
                    if (facebookRequestError != null) {
                        C1BJO c1bjo = facebookRequestError.exception;
                        if (c1bjo == null) {
                            c1bjo = new C1BJO();
                        }
                        deviceAuthDialog.RR(c1bjo);
                        return;
                    }
                    JSONObject jSONObject = c0wvk.LIZIZ;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    DeviceAuthDialog.RequestState requestState = new DeviceAuthDialog.RequestState();
                    try {
                        String string = jSONObject.getString("user_code");
                        requestState.userCode = string;
                        requestState.authorizationUri = C786410Ut5.k4(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string}, 1));
                        requestState.requestCode = jSONObject.getString("code");
                        requestState.interval = jSONObject.getLong("interval");
                        deviceAuthDialog.WR(requestState);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        deviceAuthDialog.RR(new C1BJO(e));
                    }
                }
            }
        }, 32).LIZLLL();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        View decorView;
        final C19EG c19egRequireActivity = requireActivity();
        DialogC19728412Gs dialogC19728412Gs = new DialogC19728412Gs(c19egRequireActivity) { // from class: X.19GF
            @Override // android.app.Dialog
            public final void onBackPressed() {
                this.LL.getClass();
                super.onBackPressed();
            }
        };
        if (C2202641BIo.LIZJ() && !this.LLJI) {
            z = true;
        } else {
            z = false;
        }
        dialogC19728412Gs.setContentView(OR(z));
        Window window = dialogC19728412Gs.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogC19728412Gs);
        return dialogC19728412Gs;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.LLJ) {
            PR();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.LLIZLLLIL != null) {
            C786410Ut5.LJJIJL(bundle, "request_state", this.LLIZLLLIL);
        }
    }

    public final void SR(long j, final String str, Long l) {
        final Date date;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("fields", "id,permissions,name", bundle);
        final Date date2 = null;
        if (j != 0) {
            date = new Date(new Date().getTime() + (j * 1000));
        } else {
            date = null;
        }
        if (l != null && l.longValue() != 0) {
            date2 = new Date(l.longValue() * 1000);
        }
        AccessToken accessToken = new AccessToken(str, FacebookSdk.LIZLLL(), CardStruct.IStatusCode.DEFAULT, null, null, null, null, date, null, date2);
        String str2 = GraphRequest.LJIIIIZZ;
        GraphRequest graphRequestLJFF = C1BJA.LJFF(accessToken, "me", new C0WV8() { // from class: X.1BIn
            @Override // X.C0WV8
            public final void LIZIZ(C0WVK c0wvk) {
                Boolean boolValueOf;
                EnumSet<C1BJP> enumSet;
                final DeviceAuthDialog deviceAuthDialog = this.LIZ;
                final String str3 = str;
                final Date date3 = date;
                final Date date4 = date2;
                if (!deviceAuthDialog.LLILZIL.get()) {
                    FacebookRequestError facebookRequestError = c0wvk.LIZJ;
                    if (facebookRequestError != null) {
                        C1BJO c1bjo = facebookRequestError.exception;
                        if (c1bjo == null) {
                            c1bjo = new C1BJO();
                        }
                        deviceAuthDialog.RR(c1bjo);
                        return;
                    }
                    try {
                        JSONObject jSONObject = c0wvk.LIZIZ;
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        final String string = jSONObject.getString(FollowStatusChangeMethod.PARAM_UID);
                        final C827990Wdx c827990WdxLIZ = C827980Wdw.LIZ(jSONObject);
                        String string2 = jSONObject.getString("name");
                        DeviceAuthDialog.RequestState requestState = deviceAuthDialog.LLIZLLLIL;
                        if (requestState != null) {
                            C2202641BIo.LIZ(requestState.userCode);
                        }
                        C1BJK c1bjk = (C1BJK) ((ConcurrentHashMap) C1BJL.LIZJ).get(FacebookSdk.LIZLLL());
                        if (c1bjk != null && (enumSet = c1bjk.LIZJ) != null) {
                            boolValueOf = Boolean.valueOf(enumSet.contains(C1BJP.RequireConfirm));
                        } else {
                            boolValueOf = null;
                        }
                        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && !deviceAuthDialog.LLJI) {
                            deviceAuthDialog.LLJI = true;
                            String string3 = deviceAuthDialog.getResources().getString(2131828992);
                            String string4 = deviceAuthDialog.getResources().getString(2131828991);
                            String string5 = deviceAuthDialog.getResources().getString(2131828990);
                            String strJ4 = C786410Ut5.j4(string4, Arrays.copyOf(new Object[]{string2}, 1));
                            AlertDialog.Builder builder = new AlertDialog.Builder(deviceAuthDialog.getContext());
                            builder.setMessage(string3).setCancelable(true).setNegativeButton(strJ4, new DialogInterface.OnClickListener() { // from class: X.1BJh
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    deviceAuthDialog.MR(string, c827990WdxLIZ, str3, date3, date4);
                                }
                            }).setPositiveButton(string5, new C1D10(deviceAuthDialog, 3));
                            C786410Ut5.A4(builder.create());
                            return;
                        }
                        deviceAuthDialog.MR(string, c827990WdxLIZ, str3, date3, date4);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        deviceAuthDialog.RR(new C1BJO(e));
                    }
                }
            }
        });
        graphRequestLJFF.LJIIIZ(C0WV6.GET);
        graphRequestLJFF.LIZLLL = bundle;
        graphRequestLJFF.LIZLLL();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LoginMethodHandler loginMethodHandlerLJI;
        RequestState requestState;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        LoginFragment loginFragment = (LoginFragment) ((FacebookActivity) requireActivity()).LL;
        C19GS c19gs = null;
        if (loginFragment == null) {
            loginMethodHandlerLJI = null;
        } else {
            LoginClient loginClient = loginFragment.LLILLL;
            loginClient.getClass();
            loginMethodHandlerLJI = loginClient.LJI();
        }
        this.LLILZ = (DeviceAuthMethodHandler) loginMethodHandlerLJI;
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            WR(requestState);
        }
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }

    public final void MR(String str, C827990Wdx c827990Wdx, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.LLILZ;
        if (deviceAuthMethodHandler != null) {
            AccessToken accessToken = new AccessToken(str2, FacebookSdk.LIZLLL(), str, c827990Wdx.LIZ, c827990Wdx.LIZIZ, c827990Wdx.LIZJ, C1BJ0.DEVICE_AUTH, date, null, date2);
            C2202621BIm c2202621BIm = LoginClient.Result.Companion;
            LoginClient loginClient = deviceAuthMethodHandler.loginClient;
            loginClient.getClass();
            LoginClient.Request request = loginClient.pendingRequest;
            c2202621BIm.getClass();
            LoginClient.Result result = new LoginClient.Result(request, EnumC2202671BIr.SUCCESS, accessToken, null, null);
            LoginClient loginClient2 = deviceAuthMethodHandler.loginClient;
            loginClient2.getClass();
            loginClient2.LJ(result);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
            C785410UrT.LIZ(dialog);
        }
    }
}
