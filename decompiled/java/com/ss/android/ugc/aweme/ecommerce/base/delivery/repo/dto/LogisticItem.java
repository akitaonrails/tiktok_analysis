package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C03CG;
import X.C03CH;
import X.C03IN;
import X.C03IP;
import X.C093Y;
import X.C09CT;
import X.C418440Gaw;
import X.C430750Gun;
import X.C786410Ut5;
import X.C812103Ff;
import X.C814420VxA;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticItem implements Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("promotion_icon")
    public Icon icon;

    @C09CT("promotion_threshold_text")
    public String thresholdText;

    @C09CT("promotion_title")
    public String title;

    @C09CT("promotion_type")
    public Integer type;
    public static final C03CG Companion = new Object() { // from class: X.03CG
    };
    public static final Parcelable.Creator<LogisticItem> CREATOR = new Parcelable.Creator<LogisticItem>() { // from class: X.02nk
        @Override // android.os.Parcelable.Creator
        public final LogisticItem createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new LogisticItem(numValueOf, parcel.readString(), parcel.readString(), (Icon) parcel.readParcelable(LogisticItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LogisticItem[] newArray(int i) {
            return new LogisticItem[i];
        }
    };
    public static final int $stable = 8;

    public LogisticItem() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.type;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.title);
        parcel.writeString(this.thresholdText);
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.daInfo);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iIntValue = (num != null ? num.intValue() : 131) * 31;
        String str = this.title;
        int iHashCode = (iIntValue + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.thresholdText;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableStringBuilder LIZ(android.content.Context r23) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticItem.LIZ(android.content.Context):android.text.SpannableStringBuilder");
    }

    public final SpannableStringBuilder LIZIZ(Context context) {
        String str = this.title;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Integer num = this.type;
        if (num != null && (num.intValue() == 3 || num.intValue() == 1 || num.intValue() == 2)) {
            C03IN c03in = new C03IN(context, null, 0);
            c03in.setTextFont(82);
            c03in.setTagLayoutParams(C093Y.LJ(new C03IP(19, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, 2174)));
            C430750Gun c430750Gun = new C430750Gun(c03in);
            c430750Gun.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            c03in.setTagUi(new C03CH(null, new C812103Ff(19, null, null, null, 14), new C812103Ff(12, this.title, null, null, 12)));
            C786410Ut5.q2(spannableStringBuilder, c430750Gun, 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append(' ');
        }
        String str3 = this.thresholdText;
        if (str3 != null) {
            str2 = str3;
        }
        return spannableStringBuilder.append((CharSequence) str2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LogisticItem) {
            LogisticItem logisticItem = (LogisticItem) obj;
            if (Intrinsics.LJFF(this.type, logisticItem.type) && Intrinsics.LJFF(this.title, logisticItem.title) && Intrinsics.LJFF(this.thresholdText, logisticItem.thresholdText)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public LogisticItem(Integer num, String str, String str2, Icon icon, String str3) {
        this.type = num;
        this.title = str;
        this.thresholdText = str2;
        this.icon = icon;
        this.daInfo = str3;
    }
}
