package com.ss.android.ugc.aweme.account.login.v2.base;

import X.C09CT;
import X.C0XGR;
import X.C118300cf;
import X.C1227904rF;
import X.C1234880iEw;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23250099c;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.v2.base.AvailableWaysViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AvailableWaysViewModel extends ViewModel {
    public static final Keva LLILLL = Keva.getRepo("available_ways_repo");
    public final MutableLiveData<Map<String, AvailableWays>> LL;
    public final MutableLiveData LLILLJJLI;

    public AvailableWaysViewModel() {
        MutableLiveData<Map<String, AvailableWays>> mutableLiveData = new MutableLiveData<>();
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
    }

    public final void vQ2(String str) {
        String string;
        Map<String, AvailableWays> value = this.LL.getValue();
        if (value == null) {
            value = new LinkedHashMap<>();
        }
        if (value.get(str) == null && (string = LLILLL.getString(str, "")) != null && string.length() != 0) {
            try {
                C1227904rF.LIZ.getClass();
                value.put(str, (AvailableWays) C1227904rF.LIZIZ(string, AvailableWays.class));
                this.LL.postValue(value);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final class GetAvailableWayType implements Parcelable {

        @C09CT("should_fetch_available_ways_on_create")
        public final boolean shouldFetchAvailableWaysOnCreate;

        @C09CT("should_get_available_ways")
        public final boolean shouldGetAvailableWays;
        public static final Parcelable.Creator<GetAvailableWayType> CREATOR = new Parcelable.Creator<GetAvailableWayType>() { // from class: X.0iF3
            @Override // android.os.Parcelable.Creator
            public final AvailableWaysViewModel.GetAvailableWayType createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new AvailableWaysViewModel.GetAvailableWayType(z, z2);
            }

            @Override // android.os.Parcelable.Creator
            public final AvailableWaysViewModel.GetAvailableWayType[] newArray(int i) {
                return new AvailableWaysViewModel.GetAvailableWayType[i];
            }
        };
        public static final int $stable = 8;

        public GetAvailableWayType() {
            this(true, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetAvailableWayType)) {
                return false;
            }
            GetAvailableWayType getAvailableWayType = (GetAvailableWayType) obj;
            return this.shouldGetAvailableWays == getAvailableWayType.shouldGetAvailableWays && this.shouldFetchAvailableWaysOnCreate == getAvailableWayType.shouldFetchAvailableWaysOnCreate;
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.shouldGetAvailableWays) * 31) + C786410Ut5.Z2(this.shouldFetchAvailableWaysOnCreate);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GetAvailableWayType(shouldGetAvailableWays=");
            sbLIZ.append(this.shouldGetAvailableWays);
            sbLIZ.append(", shouldFetchAvailableWaysOnCreate=");
            sbLIZ.append(this.shouldFetchAvailableWaysOnCreate);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.shouldGetAvailableWays ? 1 : 0);
            parcel.writeInt(this.shouldFetchAvailableWaysOnCreate ? 1 : 0);
        }

        public GetAvailableWayType(boolean z, boolean z2) {
            this.shouldGetAvailableWays = z;
            this.shouldFetchAvailableWaysOnCreate = z2;
        }
    }

    public static final class AvailableWays {
        public static final /* synthetic */ int LIZ = 0;

        @C09CT("has_mobile")
        public final boolean hasMobile;

        @C09CT("has_pwd")
        public final boolean hasPWD;

        @C09CT("mobile")
        public final String mobile;

        @C09CT("safe")
        public final boolean safe;

        public AvailableWays() {
            this(false, null, true, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvailableWays)) {
                return false;
            }
            AvailableWays availableWays = (AvailableWays) obj;
            return this.hasMobile == availableWays.hasMobile && Intrinsics.LJFF(this.mobile, availableWays.mobile) && this.hasPWD == availableWays.hasPWD && this.safe == availableWays.safe;
        }

        public AvailableWays(boolean z, String str, boolean z2, boolean z3) {
            this.hasMobile = z;
            this.mobile = str;
            this.hasPWD = z2;
            this.safe = z3;
        }
    }

    public static void xQ2(int i, int i2, String str, String str2, String str3, String str4) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("login_panel_type", str3);
        c0xgr.LIZLLL("page", str4);
        c0xgr.LIZLLL("platform", "email");
        c0xgr.LIZ(i, "result");
        c0xgr.LIZ(i2, "is_safe");
        C20684815ws.LJIILLIIL("other_login_method_check_response", c0xgr.LIZ);
    }

    public final void wQ2(String str, String str2, String str3, String str4, String str5, String str6) {
        vQ2(str);
        Map<String, AvailableWays> value = this.LL.getValue();
        if (value == null) {
            value = new LinkedHashMap<>();
        }
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        C118300cf c118300cf2 = new C118300cf();
        c118300cf2.element = -1;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1234880iEw(c118300cf, value, str, this, c118300cf2, str3, str4, str5, str6, str2, null), 3);
    }
}
