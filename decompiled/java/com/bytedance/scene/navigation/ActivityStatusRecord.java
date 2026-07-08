package com.bytedance.scene.navigation;

import X.C21504719Dx;
import X.C21523519Ld;
import android.app.Activity;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes33.dex */
public class ActivityStatusRecord implements Parcelable {
    public static final Parcelable.Creator<ActivityStatusRecord> CREATOR = new C21523519Ld(7);
    public int mNavigationBarColor;
    public int mRequestedOrientation;
    public int mSoftInputMode;
    public int mStatusBarColor;
    public int mSystemBarsAppearance;
    public int mSystemUiVisibility;
    public int mWindowFlags;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ActivityStatusRecord() {
    }

    public ActivityStatusRecord(Parcel parcel) {
        this.mStatusBarColor = parcel.readInt();
        this.mNavigationBarColor = parcel.readInt();
        this.mSystemUiVisibility = parcel.readInt();
        this.mSoftInputMode = parcel.readInt();
        this.mWindowFlags = parcel.readInt();
        this.mRequestedOrientation = parcel.readInt();
        this.mSystemBarsAppearance = parcel.readInt();
    }

    public static ActivityStatusRecord LIZ(Activity activity) {
        ActivityStatusRecord activityStatusRecord = new ActivityStatusRecord();
        Window window = activity.getWindow();
        View decorView = window.getDecorView();
        activityStatusRecord.mStatusBarColor = window.getStatusBarColor();
        activityStatusRecord.mNavigationBarColor = window.getNavigationBarColor();
        activityStatusRecord.mSystemUiVisibility = decorView.getSystemUiVisibility();
        activityStatusRecord.mSoftInputMode = window.getAttributes().softInputMode;
        activityStatusRecord.mWindowFlags = window.getAttributes().flags;
        activityStatusRecord.mRequestedOrientation = activity.getRequestedOrientation();
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                activityStatusRecord.mSystemBarsAppearance = insetsController.getSystemBarsAppearance();
            } else {
                activityStatusRecord.mSystemBarsAppearance = -1;
                return activityStatusRecord;
            }
        }
        return activityStatusRecord;
    }

    public final void LIZIZ(Activity activity) {
        Window window = activity.getWindow();
        window.setStatusBarColor(this.mStatusBarColor);
        window.setNavigationBarColor(this.mNavigationBarColor);
        window.getDecorView().setSystemUiVisibility(this.mSystemUiVisibility);
        window.setSoftInputMode(this.mSoftInputMode);
        int i = window.getAttributes().flags;
        int i2 = this.mWindowFlags;
        int i3 = ~(i & i2);
        window.addFlags(i2 & i3);
        window.clearFlags(i & i3);
        activity.setRequestedOrientation(this.mRequestedOrientation);
        LJ(window);
    }

    public final void LIZJ(Activity activity) {
        Window window = activity.getWindow();
        window.setSoftInputMode(this.mSoftInputMode);
        activity.setRequestedOrientation(this.mRequestedOrientation);
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        int i = this.mSystemUiVisibility;
        if (systemUiVisibility != i) {
            int iLIZ = C21504719Dx.LIZ(i, systemUiVisibility, 8192);
            if (Build.VERSION.SDK_INT >= 26) {
                iLIZ = C21504719Dx.LIZ(iLIZ, systemUiVisibility, 16);
            }
            window.getDecorView().setSystemUiVisibility(iLIZ);
        }
        int i2 = window.getAttributes().flags;
        int i3 = this.mWindowFlags;
        if (i2 != i3) {
            int iLIZ2 = C21504719Dx.LIZ(C21504719Dx.LIZ(C21504719Dx.LIZ(i3, i2, 67108864), i2, 134217728), i2, Integer.MIN_VALUE);
            int i4 = ~(i2 & iLIZ2);
            window.addFlags(iLIZ2 & i4);
            window.clearFlags(i2 & i4);
        }
    }

    public final void LIZLLL(Activity activity) {
        Window window = activity.getWindow();
        window.setStatusBarColor(this.mStatusBarColor);
        window.setNavigationBarColor(this.mNavigationBarColor);
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i = this.mSystemUiVisibility;
        if (systemUiVisibility != i) {
            int i2 = systemUiVisibility & 8192;
            if (i2 != (i & 8192)) {
                if (i2 != 0) {
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
                } else {
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
            }
            int i3 = systemUiVisibility & 16;
            if (i3 != (i & 16)) {
                if (i3 != 0) {
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
                } else {
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
            }
        }
        int i4 = window.getAttributes().flags;
        int i5 = this.mWindowFlags;
        if (i4 != i5) {
            int i6 = i4 & 67108864;
            if (i6 != (i5 & 67108864)) {
                if (i6 == 67108864) {
                    window.clearFlags(67108864);
                } else {
                    window.addFlags(67108864);
                }
            }
            int i7 = i4 & 134217728;
            if (i7 != (i5 & 134217728)) {
                if (i7 == 134217728) {
                    window.clearFlags(134217728);
                } else {
                    window.addFlags(134217728);
                }
            }
            int i8 = i4 & Integer.MIN_VALUE;
            if (i8 != (i5 & Integer.MIN_VALUE)) {
                if (i8 == Integer.MIN_VALUE) {
                    window.clearFlags(Integer.MIN_VALUE);
                } else {
                    window.addFlags(Integer.MIN_VALUE);
                }
            }
        }
        LJ(window);
    }

    public final void LJ(Window window) {
        int i;
        WindowInsetsController insetsController;
        int systemBarsAppearance;
        if (Build.VERSION.SDK_INT >= 30 && (i = this.mSystemBarsAppearance) != -1 && (insetsController = window.getInsetsController()) != null && (systemBarsAppearance = insetsController.getSystemBarsAppearance()) != i) {
            int i2 = i & 8;
            if ((systemBarsAppearance & 8) != i2) {
                if (i2 != 0) {
                    insetsController.setSystemBarsAppearance(8, 8);
                } else {
                    insetsController.setSystemBarsAppearance(0, 8);
                }
            }
            int i3 = i & 16;
            if ((systemBarsAppearance & 16) != i3) {
                if (i3 != 0) {
                    insetsController.setSystemBarsAppearance(16, 16);
                } else {
                    insetsController.setSystemBarsAppearance(0, 16);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mStatusBarColor);
        parcel.writeInt(this.mNavigationBarColor);
        parcel.writeInt(this.mSystemUiVisibility);
        parcel.writeInt(this.mSoftInputMode);
        parcel.writeInt(this.mWindowFlags);
        parcel.writeInt(this.mRequestedOrientation);
        parcel.writeInt(this.mSystemBarsAppearance);
    }
}
