package com.ss.android.ugc.aweme.component.phone;

import X.C1389600mGU;
import X.C1528650psl;
import X.C168Q;
import X.C19F0;
import X.C21505219Ec;
import X.C786410Ut5;
import X.C834010Wnf;
import X.InterfaceC1631620sYq;
import X.InterfaceC835710WqP;
import X.InterfaceC835730WqR;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.ss.android.ugc.aweme.component.phone.GetPhoneNumberFragment;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class GetPhoneNumberFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD88JiHELIOSAiPWEjICoiLGEULTEcISA9LQs5JC02OgM+KCg+LSs4";
    public Context LL;
    public final InterfaceC1631620sYq<? super String, ? super Integer, ? super String, Unit> LLILLJJLI;
    public final C19F0<IntentSenderRequest> LLILLL = registerForActivityResult(new C21505219Ec(), new C168Q() { // from class: X.0uoD
        @Override // X.C168Q
        public final void LIZ(Object obj) {
            InterfaceC1631620sYq<? super String, ? super Integer, ? super String, Unit> interfaceC1631620sYq;
            Context context;
            ActivityResult activityResult = (ActivityResult) obj;
            GetPhoneNumberFragment getPhoneNumberFragment = this.LIZ;
            Context contextN3 = getPhoneNumberFragment.LL;
            String strLIZLLL = null;
            if ((contextN3 == null && ((context = getPhoneNumberFragment.getContext()) == null || (contextN3 = C786410Ut5.N3(context)) == null)) || (interfaceC1631620sYq = this.LIZ.LLILLJJLI) == null) {
                return;
            }
            if (activityResult.resultCode == -1) {
                try {
                    C834010Wnf.LIZIZ(contextN3);
                    strLIZLLL = C833870WnR.LIZLLL(activityResult.data);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (strLIZLLL != null) {
                    interfaceC1631620sYq.invoke(strLIZLLL, 0, "");
                    this.LIZ.MR();
                    return;
                }
                C1716310ulR c1716310ulR = C1716310ulR.LIZ;
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("result", "number_null"));
                c1716310ulR.getClass();
                C1716310ulR.LIZLLL("rd_pipo_phone_hint_response", mapLIZJ);
                interfaceC1631620sYq.invoke("", 0, "");
                this.LIZ.MR();
                return;
            }
            C1716310ulR c1716310ulR2 = C1716310ulR.LIZ;
            Map mapLIZJ2 = C2097908Jt.LIZJ(new Pair("result", "cancel"));
            c1716310ulR2.getClass();
            C1716310ulR.LIZLLL("rd_pipo_phone_hint_response", mapLIZJ2);
            interfaceC1631620sYq.invoke("", -7, "cancel");
            this.LIZ.MR();
        }
    });

    public GetPhoneNumberFragment() {
    }

    public final void MR() {
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        InterfaceC1631620sYq<? super String, ? super Integer, ? super String, Unit> interfaceC1631620sYq = this.LLILLJJLI;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke("", -7, "cancel");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context contextN3 = this.LL;
        if (contextN3 == null) {
            Context context = getContext();
            if (context != null) {
                contextN3 = C786410Ut5.N3(context);
            } else {
                contextN3 = null;
            }
        }
        final InterfaceC1631620sYq<? super String, ? super Integer, ? super String, Unit> interfaceC1631620sYq = this.LLILLJJLI;
        if (contextN3 != null && interfaceC1631620sYq != null) {
            this.LL = contextN3;
            C834010Wnf.LIZIZ(contextN3).LJ(new GetPhoneNumberHintIntentRequest(0)).LJFF(new InterfaceC835710WqP() { // from class: X.0uoF
                @Override // X.InterfaceC835710WqP
                public final void onSuccess(Object obj) {
                    try {
                        this.LIZ.LLILLL.LIZ(new C1719660uqq(((PendingIntent) obj).getIntentSender()).LIZ());
                        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
                        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("result", "success"));
                        c1716310ulR.getClass();
                        C1716310ulR.LIZLLL("rd_pipo_phone_hint_request", mapLIZJ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1716310ulR c1716310ulR2 = C1716310ulR.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("launch_fail_");
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        sbLIZ.append(message);
                        Map mapLIZJ2 = C2097908Jt.LIZJ(new Pair("result", C2188811AlT.LIZIZ(sbLIZ)));
                        c1716310ulR2.getClass();
                        C1716310ulR.LIZLLL("rd_pipo_phone_hint_request", mapLIZJ2);
                        InterfaceC1631620sYq<String, Integer, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("launch_fail_");
                        String message2 = e.getMessage();
                        if (message2 == null) {
                            message2 = "";
                        }
                        sbLIZ2.append(message2);
                        interfaceC1631620sYq2.invoke("", -5, C2188811AlT.LIZIZ(sbLIZ2));
                        this.LIZ.MR();
                    }
                }
            }).LIZLLL(new InterfaceC835730WqR(this) { // from class: X.0gNz
                public final /* synthetic */ GetPhoneNumberFragment LIZIZ;

                {
                    this.LIZIZ = this;
                }

                @Override // X.InterfaceC835730WqR
                public final void onFailure(Exception exc) {
                    C1716310ulR c1716310ulR = C1716310ulR.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("request_fail_");
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    sbLIZ.append(message);
                    Map mapLIZJ = C2097908Jt.LIZJ(new Pair("result", C2188811AlT.LIZIZ(sbLIZ)));
                    c1716310ulR.getClass();
                    C1716310ulR.LIZLLL("rd_pipo_phone_hint_request", mapLIZJ);
                    InterfaceC1631620sYq<String, Integer, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("request_fail_");
                    String message2 = exc.getMessage();
                    if (message2 == null) {
                        message2 = "";
                    }
                    sbLIZ2.append(message2);
                    interfaceC1631620sYq2.invoke("", -6, C2188811AlT.LIZIZ(sbLIZ2));
                    this.LIZIZ.MR();
                }
            });
        } else {
            this.mShowsDialog = false;
            MR();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.0f);
        }
        Window window2 = dialogOnCreateDialog.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    public GetPhoneNumberFragment(Context context, C1528650psl c1528650psl) {
        this.LL = context;
        this.LLILLJJLI = c1528650psl;
    }
}
