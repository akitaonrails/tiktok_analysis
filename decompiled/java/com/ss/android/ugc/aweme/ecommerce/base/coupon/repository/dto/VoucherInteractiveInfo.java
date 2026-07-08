package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InteractiveUserTask;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInteractiveInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class VoucherInteractiveInfo implements Parcelable, Serializable {

    @C09CT("author_nick_name")
    public String authorNickName;

    @C09CT("author_photo")
    public Image authorPhoto;

    @C09CT("seller_guide_interactive_text")
    public String interactiveText;

    @C09CT("interactive_voucher_task_info")
    public InteractiveUserTask taskInfo;

    @C09CT("waiting_time_for_claim_voucher")
    public String timeForClaimVoucher;
    public static final Parcelable.Creator<VoucherInteractiveInfo> CREATOR = new Parcelable.Creator<VoucherInteractiveInfo>() { // from class: X.0wPk
        @Override // android.os.Parcelable.Creator
        public final VoucherInteractiveInfo createFromParcel(Parcel parcel) {
            InteractiveUserTask interactiveUserTaskCreateFromParcel;
            Image image = (Image) parcel.readParcelable(VoucherInteractiveInfo.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                interactiveUserTaskCreateFromParcel = null;
            } else {
                interactiveUserTaskCreateFromParcel = InteractiveUserTask.CREATOR.createFromParcel(parcel);
            }
            return new VoucherInteractiveInfo(image, string, string2, string3, interactiveUserTaskCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VoucherInteractiveInfo[] newArray(int i) {
            return new VoucherInteractiveInfo[i];
        }
    };
    public static final int $stable = 8;

    public VoucherInteractiveInfo() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.authorPhoto, i);
        parcel.writeString(this.authorNickName);
        parcel.writeString(this.interactiveText);
        parcel.writeString(this.timeForClaimVoucher);
        InteractiveUserTask interactiveUserTask = this.taskInfo;
        if (interactiveUserTask == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            interactiveUserTask.writeToParcel(parcel, i);
        }
    }

    public final String getAuthorNickName() {
        return this.authorNickName;
    }

    public final Image getAuthorPhoto() {
        return this.authorPhoto;
    }

    public final String getInteractiveText() {
        return this.interactiveText;
    }

    public final InteractiveUserTask getTaskInfo() {
        return this.taskInfo;
    }

    public final String getTimeForClaimVoucher() {
        return this.timeForClaimVoucher;
    }

    public final void setAuthorNickName(String str) {
        this.authorNickName = str;
    }

    public final void setAuthorPhoto(Image image) {
        this.authorPhoto = image;
    }

    public final void setInteractiveText(String str) {
        this.interactiveText = str;
    }

    public final void setTaskInfo(InteractiveUserTask interactiveUserTask) {
        this.taskInfo = interactiveUserTask;
    }

    public final void setTimeForClaimVoucher(String str) {
        this.timeForClaimVoucher = str;
    }

    public VoucherInteractiveInfo(Image image, String str, String str2, String str3, InteractiveUserTask interactiveUserTask) {
        this.authorPhoto = image;
        this.authorNickName = str;
        this.interactiveText = str2;
        this.timeForClaimVoucher = str3;
        this.taskInfo = interactiveUserTask;
    }
}
