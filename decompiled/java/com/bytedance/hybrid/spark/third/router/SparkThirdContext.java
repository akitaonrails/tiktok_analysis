package com.bytedance.hybrid.spark.third.router;

import X.AbstractC1911210zpn;
import X.C1051990dTx;
import X.C12O0;
import X.C1BHH;
import X.C1BHK;
import X.C1BHP;
import X.C1BHQ;
import X.C1BHT;
import X.C2188811AlT;
import X.C2202271BHd;
import X.InterfaceC1052610dUx;
import X.InterfaceC1059280dfi;
import X.InterfaceC1163110gNB;
import X.InterfaceC1542250qEh;
import X.InterfaceC2202301BHg;
import X.InterfaceC2202321BHi;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;

/* JADX INFO: loaded from: classes35.dex */
public final class SparkThirdContext implements Parcelable {
    public List<C12O0> actions;
    public C1BHP activityCallback;
    public InterfaceC2202321BHi antiJump;
    public ThirdPartyBizCert bizCert;
    public InterfaceC2202301BHg callback;
    public InterfaceC1059280dfi container;
    public String containerId;
    public boolean disableOpenInSystem;
    public C1BHK fallback;
    public final C1BHT performanceState;
    public AbstractC1911210zpn popupAnimator;
    public SparkPopupSchemaParam popupSchemaParam;
    public InterfaceC1542250qEh progressBar;
    public InterfaceC1052610dUx redirect;
    public SeclinkConfig seclinkConfig;
    public InterfaceC1163110gNB statusView;
    public C1BHQ titleBar;
    public String url = "";
    public C1BHH webView;
    public C2202271BHd webViewClient;
    public static final C1051990dTx Companion = new Object() { // from class: X.0dTx
    };
    public static final Parcelable.Creator<SparkThirdContext> CREATOR = new Parcelable.Creator<SparkThirdContext>() { // from class: X.0dch
        @Override // android.os.Parcelable.Creator
        public final SparkThirdContext createFromParcel(Parcel parcel) {
            SparkThirdContext sparkThirdContext = new SparkThirdContext();
            try {
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                sparkThirdContext.url = string;
                sparkThirdContext.bizCert = (ThirdPartyBizCert) parcel.readParcelable(ThirdPartyBizCert.class.getClassLoader());
                C189200o6.m2constructorimpl(Unit.LIZ);
                return sparkThirdContext;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return sparkThirdContext;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final SparkThirdContext[] newArray(int i) {
            return new SparkThirdContext[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SparkThirdContext() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('-');
        sbLIZ.append(UUID.randomUUID());
        this.containerId = C2188811AlT.LIZIZ(sbLIZ);
        this.performanceState = new C1BHT();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeParcelable(this.bizCert, i);
    }
}
