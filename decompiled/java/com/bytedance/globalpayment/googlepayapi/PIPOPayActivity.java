package com.bytedance.globalpayment.googlepayapi;

import X.C03YA;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C817700W5w;
import X.C832510WlF;
import X.C833640Wn4;
import X.C833960Wna;
import X.C834270Wo5;
import X.C834300Wo8;
import X.C834350WoD;
import X.C835350Wpp;
import X.EnumC834230Wo1;
import X.InterfaceC831290WjH;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class PIPOPayActivity extends Activity {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWsrJSAxKSk8KDY+LSs4ZyHELIOSg8JyIgLD8yMSQ8IGEDARUDGS4qCSY4IDk6PDw=";
    public boolean LL;

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (this.LL) {
            return;
        }
        C834270Wo5.LIZ();
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextActivity: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, true);
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String string;
        super.onCreate(bundle);
        try {
            stringExtra = getIntent().getStringExtra("requestJSONStr");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("PIPO_PAY_ACTIVITY_INTENT_CONTENT");
        }
        if (stringExtra == null) {
            stringExtra = string;
        }
        if (stringExtra == null) {
            this.LL = true;
            EnumC834230Wo1 enumC834230Wo1 = EnumC834230Wo1.LaunchActivityEmptyContent;
            C834300Wo8 c834300Wo8 = new C834300Wo8(C03YA.LaunchActivityError, enumC834230Wo1.getValue(), null);
            C834270Wo5.LIZLLL.LIZ(c834300Wo8);
            C834350WoD c834350WoD = C834270Wo5.LJFF;
            if (c834350WoD != null) {
                c834350WoD.LIZ(c834300Wo8);
            }
            System.out.println((Object) Intrinsics.LJIIJJI(Integer.valueOf(enumC834230Wo1.getValue()), "ooookk "));
            finish();
            return;
        }
        try {
            final PaymentDataRequest paymentDataRequestLJLZ = PaymentDataRequest.LJLZ(stringExtra);
            C833960Wna c833960Wna = C834270Wo5.LIZIZ;
            if (c833960Wna == null) {
                c833960Wna = null;
            }
            c833960Wna.getClass();
            C832510WlF c832510WlF = new C832510WlF();
            c832510WlF.LIZ = new InterfaceC831290WjH() { // from class: X.0WnF
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC831290WjH
                public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
                    PaymentDataRequest paymentDataRequest = paymentDataRequestLJLZ;
                    C833630Wn3 c833630Wn3 = (C833630Wn3) interfaceC831160Wj4;
                    Bundle bundleLJ = c833630Wn3.LJ();
                    bundleLJ.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                    BinderC833790WnJ binderC833790WnJ = new BinderC833790WnJ((C835520Wq6) obj) { // from class: X.0WnE
                        public final C835520Wq6 LL;

                        {
                            this.LL = c835520Wq6;
                        }

                        @Override // X.BinderC833790WnJ, X.InterfaceC834870Wp3
                        public final void LLFZ(Status status, PaymentData paymentData) {
                            C835520Wq6 c835520Wq6 = this.LL;
                            int i = C835350Wpp.LIZJ;
                            if (status.LJLZ()) {
                                c835520Wq6.LIZIZ(paymentData);
                            } else {
                                c835520Wq6.LIZ(C0WY0.LIZ(status));
                            }
                        }
                    };
                    try {
                        C833660Wn6 c833660Wn6 = (C833660Wn6) c833630Wn3.getService();
                        c833660Wn6.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                        C833770WnH.LIZIZ(parcelObtain, paymentDataRequest);
                        C833770WnH.LIZIZ(parcelObtain, bundleLJ);
                        parcelObtain.writeStrongBinder(binderC833790WnJ);
                        try {
                            c833660Wn6.LL.transact(19, parcelObtain, null, 1);
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain.recycle();
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        binderC833790WnJ.LLFZ(Status.RESULT_INTERNAL_ERROR, null);
                    }
                }
            };
            c832510WlF.LIZJ = new Feature[]{C833640Wn4.LIZ};
            c832510WlF.LIZIZ = true;
            c832510WlF.LIZLLL = 23707;
            C835350Wpp.LIZ(this, c833960Wna.doWrite(c832510WlF.LIZ()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C834300Wo8 c834300Wo82 = new C834300Wo8(C03YA.LaunchActivityError, EnumC834230Wo1.LaunchActivityParseContentError.getValue(), null);
            C834270Wo5.LIZLLL.LIZ(c834300Wo82);
            C834350WoD c834350WoD2 = C834270Wo5.LJFF;
            if (c834350WoD2 != null) {
                c834350WoD2.LIZ(c834300Wo82);
            }
            this.LL = true;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        String stringExtra;
        try {
            stringExtra = getIntent().getStringExtra("requestJSONStr");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        C786410Ut5.LJJJI("PIPO_PAY_ACTIVITY_INTENT_CONTENT", stringExtra, bundle);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r6 != r0) goto L29
            r2 = 0
            r0 = -1
            r3 = 1
            r4 = 0
            if (r7 == r0) goto L52
            if (r7 == 0) goto L4e
            if (r7 == r3) goto L2a
            X.0Wo8 r1 = new X.0Wo8
            X.03YA r0 = X.C03YA.GoogleAPIError
            r1.<init>(r0, r4, r2)
            X.0Wo2 r0 = X.C834270Wo5.LIZLLL
            r0.LIZ(r1)
            X.0WoD r0 = X.C834270Wo5.LJFF
            if (r0 == 0) goto L24
            r0.LIZ(r1)
        L24:
            r5.LL = r3
            r5.finish()
        L29:
            return
        L2a:
            int r0 = X.C835350Wpp.LIZJ
            if (r8 == 0) goto L3a
            java.lang.String r0 = "com.google.android.gms.common.api.AutoResolveHelper.status"
            android.os.Parcelable r0 = r8.getParcelableExtra(r0)
            com.google.android.gms.common.api.Status r0 = (com.google.android.gms.common.api.Status) r0
            if (r0 == 0) goto L3a
            int r4 = r0.zzd
        L3a:
            X.0Wo8 r1 = new X.0Wo8
            X.03YA r0 = X.C03YA.GoogleAPIError
            r1.<init>(r0, r4, r2)
            X.0Wo2 r0 = X.C834270Wo5.LIZLLL
            r0.LIZ(r1)
            X.0WoD r0 = X.C834270Wo5.LJFF
            if (r0 == 0) goto L24
            r0.LIZ(r1)
            goto L24
        L4e:
            X.C834270Wo5.LIZ()
            goto L24
        L52:
            if (r8 == 0) goto L77
            java.lang.String r1 = "com.google.android.gms.wallet.PaymentData"
            android.os.Parcelable$Creator<com.google.android.gms.wallet.PaymentData> r0 = com.google.android.gms.wallet.PaymentData.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r2 = X.C0W0J.LIZIZ(r8, r1, r0)
            com.google.android.gms.wallet.PaymentData r2 = (com.google.android.gms.wallet.PaymentData) r2
            if (r2 == 0) goto L77
            X.0Wo8 r1 = new X.0Wo8
            X.03YA r0 = X.C03YA.Success
            r1.<init>(r0, r4, r2)
            X.0WoD r0 = X.C834270Wo5.LJFF
            if (r0 == 0) goto L6e
            r0.LIZ(r1)
        L6e:
            X.0Wo2 r0 = X.C834270Wo5.LIZLLL
            r0.LIZ(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L24
        L77:
            X.C834270Wo5.LIZ()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.globalpayment.googlepayapi.PIPOPayActivity.onActivityResult(int, int, android.content.Intent):void");
    }
}
