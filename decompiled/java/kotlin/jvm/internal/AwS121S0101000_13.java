package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS121S0101000_13 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS121S0101000_13 awS121S0101000_13, Object obj) {
        BeginSignInResult beginSignInResult = (BeginSignInResult) obj;
        try {
            HiddenActivity hiddenActivity = (HiddenActivity) awS121S0101000_13.l0;
            hiddenActivity.mWaitingForActivityResult = true;
            hiddenActivity.startIntentSenderForResult(beginSignInResult.zba.getIntentSender(), awS121S0101000_13.i1, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            TryCatchGuardChecker.doCheck(e);
            HiddenActivity hiddenActivity2 = (HiddenActivity) awS121S0101000_13.l0;
            ResultReceiver resultReceiver = hiddenActivity2.resultReceiver;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("During begin sign in, one tap ui intent sender failure: ");
            sbLIZ.append(e.getMessage());
            hiddenActivity2.setupFailure(resultReceiver, "GET_UNKNOWN", C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS121S0101000_13 awS121S0101000_13, Object obj) {
        SavePasswordResult savePasswordResult = (SavePasswordResult) obj;
        try {
            HiddenActivity hiddenActivity = (HiddenActivity) awS121S0101000_13.l0;
            hiddenActivity.mWaitingForActivityResult = true;
            hiddenActivity.startIntentSenderForResult(savePasswordResult.zba.getIntentSender(), awS121S0101000_13.i1, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            TryCatchGuardChecker.doCheck(e);
            HiddenActivity hiddenActivity2 = (HiddenActivity) awS121S0101000_13.l0;
            ResultReceiver resultReceiver = hiddenActivity2.resultReceiver;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("During save password, found UI intent sender failure: ");
            sbLIZ.append(e.getMessage());
            hiddenActivity2.setupFailure(resultReceiver, "CREATE_UNKNOWN", C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS121S0101000_13 awS121S0101000_13, Object obj) {
        PendingIntent pendingIntent = (PendingIntent) obj;
        try {
            HiddenActivity hiddenActivity = (HiddenActivity) awS121S0101000_13.l0;
            hiddenActivity.mWaitingForActivityResult = true;
            hiddenActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), awS121S0101000_13.i1, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            TryCatchGuardChecker.doCheck(e);
            HiddenActivity hiddenActivity2 = (HiddenActivity) awS121S0101000_13.l0;
            ResultReceiver resultReceiver = hiddenActivity2.resultReceiver;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("During public key credential, found IntentSender failure on public key creation: ");
            sbLIZ.append(e.getMessage());
            hiddenActivity2.setupFailure(resultReceiver, "CREATE_UNKNOWN", C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS121S0101000_13 awS121S0101000_13, Object obj) {
        PendingIntent pendingIntent = (PendingIntent) obj;
        try {
            HiddenActivity hiddenActivity = (HiddenActivity) awS121S0101000_13.l0;
            hiddenActivity.mWaitingForActivityResult = true;
            hiddenActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), awS121S0101000_13.i1, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            TryCatchGuardChecker.doCheck(e);
            HiddenActivity hiddenActivity2 = (HiddenActivity) awS121S0101000_13.l0;
            ResultReceiver resultReceiver = hiddenActivity2.resultReceiver;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("During get sign-in intent, one tap ui intent sender failure: ");
            sbLIZ.append(e.getMessage());
            hiddenActivity2.setupFailure(resultReceiver, "GET_UNKNOWN", C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS121S0101000_13(HiddenActivity hiddenActivity, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = hiddenActivity;
        this.i1 = i;
    }
}
