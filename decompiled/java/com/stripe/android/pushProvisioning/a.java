package com.stripe.android.pushProvisioning;

import X.C19EG;
import android.app.Activity;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.bytedance.pipo.googlepay.pushprovisioning.TokenizeGooglePayFragment;
import com.stripe.android.pushProvisioning.a.InterfaceC0033a;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a<TargetActivityType extends Activity, ArgsType extends InterfaceC0033a> {
    public final C19EG LIZ;
    public final Fragment LIZIZ;
    public final Class<TargetActivityType> LIZJ;
    public final ArgsType LIZLLL;
    public final int LJ = 8000;

    /* JADX INFO: renamed from: com.stripe.android.pushProvisioning.a$a, reason: collision with other inner class name */
    public interface InterfaceC0033a extends Parcelable {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(TokenizeGooglePayFragment tokenizeGooglePayFragment, Class cls, InterfaceC0033a interfaceC0033a) {
        this.LIZ = tokenizeGooglePayFragment.requireActivity();
        this.LIZIZ = tokenizeGooglePayFragment;
        this.LIZJ = cls;
        this.LIZLLL = interfaceC0033a;
    }
}
