package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C09CT;
import X.C677502kf;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.InputBoxHintContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.RedirectContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.ScreenContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ExceptionUX implements Parcelable {

    @C09CT("anchor_module")
    public String anchorModule;

    @C09CT("dialog_content")
    public DialogContent dialogContent;

    @C09CT("exception_info")
    public ExceptionInfo exceptionInfo;

    @C09CT("exception_ux_type")
    public Integer exceptionUXType;

    @C09CT("input_box_hint_content_list")
    public List<InputBoxHintContent> inputBoxHintContentList;

    @C09CT("redirect_content")
    public RedirectContent redirectContent;

    @C09CT("render_page")
    public Boolean renderPage;

    @C09CT("screen_content")
    public ScreenContent screenContent;

    @C09CT("toast_content")
    public ToastContent toastContent;

    @C09CT("trigger_type")
    public Integer triggerType;

    @C09CT("verification_content")
    public String verificationContent;
    public static final C677502kf Companion = new Object() { // from class: X.02kf
    };
    public static final Parcelable.Creator<ExceptionUX> CREATOR = new Parcelable.Creator<ExceptionUX>() { // from class: X.02kX
        @Override // android.os.Parcelable.Creator
        public final ExceptionUX createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            DialogContent dialogContentCreateFromParcel;
            ToastContent toastContentCreateFromParcel;
            RedirectContent redirectContentCreateFromParcel;
            ArrayList arrayList;
            ScreenContent screenContentCreateFromParcel;
            ExceptionInfo exceptionInfoCreateFromParcel;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                dialogContentCreateFromParcel = null;
            } else {
                dialogContentCreateFromParcel = DialogContent.CREATOR.createFromParcel(parcel);
            }
            DialogContent dialogContent = dialogContentCreateFromParcel;
            if (parcel.readInt() == 0) {
                toastContentCreateFromParcel = null;
            } else {
                toastContentCreateFromParcel = ToastContent.CREATOR.createFromParcel(parcel);
            }
            ToastContent toastContent = toastContentCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                redirectContentCreateFromParcel = null;
            } else {
                redirectContentCreateFromParcel = RedirectContent.CREATOR.createFromParcel(parcel);
            }
            RedirectContent redirectContent = redirectContentCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InputBoxHintContent.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                screenContentCreateFromParcel = null;
            } else {
                screenContentCreateFromParcel = ScreenContent.CREATOR.createFromParcel(parcel);
            }
            ScreenContent screenContent = screenContentCreateFromParcel;
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                exceptionInfoCreateFromParcel = null;
            } else {
                exceptionInfoCreateFromParcel = ExceptionInfo.CREATOR.createFromParcel(parcel);
            }
            ExceptionInfo exceptionInfo = exceptionInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new ExceptionUX(numValueOf, boolValueOf, dialogContent, toastContent, string, redirectContent, arrayList, screenContent, string2, exceptionInfo, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final ExceptionUX[] newArray(int i) {
            return new ExceptionUX[i];
        }
    };

    public ExceptionUX() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExceptionUX)) {
            return false;
        }
        ExceptionUX exceptionUX = (ExceptionUX) obj;
        return Intrinsics.LJFF(this.exceptionUXType, exceptionUX.exceptionUXType) && Intrinsics.LJFF(this.renderPage, exceptionUX.renderPage) && Intrinsics.LJFF(this.dialogContent, exceptionUX.dialogContent) && Intrinsics.LJFF(this.toastContent, exceptionUX.toastContent) && Intrinsics.LJFF(this.verificationContent, exceptionUX.verificationContent) && Intrinsics.LJFF(this.redirectContent, exceptionUX.redirectContent) && Intrinsics.LJFF(this.inputBoxHintContentList, exceptionUX.inputBoxHintContentList) && Intrinsics.LJFF(this.screenContent, exceptionUX.screenContent) && Intrinsics.LJFF(this.anchorModule, exceptionUX.anchorModule) && Intrinsics.LJFF(this.exceptionInfo, exceptionUX.exceptionInfo) && Intrinsics.LJFF(this.triggerType, exceptionUX.triggerType);
    }

    public final int hashCode() {
        Integer num = this.exceptionUXType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.renderPage;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        DialogContent dialogContent = this.dialogContent;
        int iHashCode3 = (iHashCode2 + (dialogContent == null ? 0 : dialogContent.hashCode())) * 31;
        ToastContent toastContent = this.toastContent;
        int iHashCode4 = (iHashCode3 + (toastContent == null ? 0 : toastContent.hashCode())) * 31;
        String str = this.verificationContent;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        RedirectContent redirectContent = this.redirectContent;
        int iHashCode6 = (iHashCode5 + (redirectContent == null ? 0 : redirectContent.hashCode())) * 31;
        List<InputBoxHintContent> list = this.inputBoxHintContentList;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        ScreenContent screenContent = this.screenContent;
        int iHashCode8 = (iHashCode7 + (screenContent == null ? 0 : screenContent.hashCode())) * 31;
        String str2 = this.anchorModule;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ExceptionInfo exceptionInfo = this.exceptionInfo;
        int iHashCode10 = (iHashCode9 + (exceptionInfo == null ? 0 : exceptionInfo.hashCode())) * 31;
        Integer num2 = this.triggerType;
        return iHashCode10 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ExceptionUX(exceptionUXType=" + this.exceptionUXType + ", renderPage=" + this.renderPage + ", dialogContent=" + this.dialogContent + ", toastContent=" + this.toastContent + ", verificationContent=" + this.verificationContent + ", redirectContent=" + this.redirectContent + ", inputBoxHintContentList=" + this.inputBoxHintContentList + ", screenContent=" + this.screenContent + ", anchorModule=" + this.anchorModule + ", exceptionInfo=" + this.exceptionInfo + ", triggerType=" + this.triggerType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.exceptionUXType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.renderPage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        DialogContent dialogContent = this.dialogContent;
        if (dialogContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dialogContent.writeToParcel(parcel, i);
        }
        ToastContent toastContent = this.toastContent;
        if (toastContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            toastContent.writeToParcel(parcel, i);
        }
        parcel.writeString(this.verificationContent);
        RedirectContent redirectContent = this.redirectContent;
        if (redirectContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            redirectContent.writeToParcel(parcel, i);
        }
        List<InputBoxHintContent> list = this.inputBoxHintContentList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InputBoxHintContent> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        ScreenContent screenContent = this.screenContent;
        if (screenContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            screenContent.writeToParcel(parcel, i);
        }
        parcel.writeString(this.anchorModule);
        ExceptionInfo exceptionInfo = this.exceptionInfo;
        if (exceptionInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exceptionInfo.writeToParcel(parcel, i);
        }
        Integer num2 = this.triggerType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public ExceptionUX(Integer num, Boolean bool, DialogContent dialogContent, ToastContent toastContent, String str, RedirectContent redirectContent, List<InputBoxHintContent> list, ScreenContent screenContent, String str2, ExceptionInfo exceptionInfo, Integer num2) {
        this.exceptionUXType = num;
        this.renderPage = bool;
        this.dialogContent = dialogContent;
        this.toastContent = toastContent;
        this.verificationContent = str;
        this.redirectContent = redirectContent;
        this.inputBoxHintContentList = list;
        this.screenContent = screenContent;
        this.anchorModule = str2;
        this.exceptionInfo = exceptionInfo;
        this.triggerType = num2;
    }
}
