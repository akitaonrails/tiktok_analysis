package com.ss.android.ugc.aweme.account.model;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.account.model.AccountSelectionOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AccountSelectionOption implements Parcelable {
    public static final int $stable = 0;

    public static final class IncludeOrgAccounts extends AccountSelectionOption {
        public static final IncludeOrgAccounts INSTANCE = new IncludeOrgAccounts();
        public static final Parcelable.Creator<IncludeOrgAccounts> CREATOR = new Parcelable.Creator<IncludeOrgAccounts>() { // from class: X.0Xau
            @Override // android.os.Parcelable.Creator
            public final AccountSelectionOption.IncludeOrgAccounts createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AccountSelectionOption.IncludeOrgAccounts.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final AccountSelectionOption.IncludeOrgAccounts[] newArray(int i) {
                return new AccountSelectionOption.IncludeOrgAccounts[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public static final class TargetAccount extends AccountSelectionOption {
        public final boolean isOrgAccount;
        public final String uid;
        public static final Parcelable.Creator<TargetAccount> CREATOR = new Parcelable.Creator<TargetAccount>() { // from class: X.0Xat
            @Override // android.os.Parcelable.Creator
            public final AccountSelectionOption.TargetAccount createFromParcel(Parcel parcel) {
                boolean z;
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new AccountSelectionOption.TargetAccount(string, z);
            }

            @Override // android.os.Parcelable.Creator
            public final AccountSelectionOption.TargetAccount[] newArray(int i) {
                return new AccountSelectionOption.TargetAccount[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TargetAccount)) {
                return false;
            }
            TargetAccount targetAccount = (TargetAccount) obj;
            return Intrinsics.LJFF(this.uid, targetAccount.uid) && this.isOrgAccount == targetAccount.isOrgAccount;
        }

        public final int hashCode() {
            return (this.uid.hashCode() * 31) + C786410Ut5.Z2(this.isOrgAccount);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TargetAccount(uid=");
            sbLIZ.append(this.uid);
            sbLIZ.append(", isOrgAccount=");
            sbLIZ.append(this.isOrgAccount);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.uid);
            parcel.writeInt(this.isOrgAccount ? 1 : 0);
        }

        public TargetAccount(String str, boolean z) {
            this.uid = str;
            this.isOrgAccount = z;
        }
    }
}
