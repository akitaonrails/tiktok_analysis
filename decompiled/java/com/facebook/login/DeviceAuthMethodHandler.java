package com.facebook.login;

import X.C19EG;
import X.C1BKE;
import X.C1D13;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.LoginClient;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes35.dex */
public class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static ScheduledThreadPoolExecutor backgroundExecutor;
    public final String nameForLogging;
    public static final C1BKE Companion = new Object() { // from class: X.1BKE
    };
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new C1D13(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String LIZLLL() {
        return this.nameForLogging;
    }

    public DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
        this.nameForLogging = "device_auth";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int LJIIIZ(LoginClient.Request request) {
        LoginClient loginClient = this.loginClient;
        loginClient.getClass();
        C19EG c19egLJFF = loginClient.LJFF();
        if (c19egLJFF != null && !c19egLJFF.isFinishing()) {
            DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
            deviceAuthDialog.show(c19egLJFF.getSupportFragmentManager(), "login_with_facebook");
            deviceAuthDialog.ZR(request);
            return 1;
        }
        return 1;
    }

    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.nameForLogging = "device_auth";
    }
}
