package com.ss.android.ugc.aweme.biz.wallet.biz.processpage;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.biz.wallet.biz.processpage.ProcessPageRouteArg;
import com.ss.android.ugc.aweme.biz.wallet.network.model.ProcessItemList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ProcessPageRouteArg implements IRouteArg {
    public static final Parcelable.Creator<ProcessPageRouteArg> CREATOR = new Parcelable.Creator<ProcessPageRouteArg>() { // from class: X.0upo
        @Override // android.os.Parcelable.Creator
        public final ProcessPageRouteArg createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new ProcessPageRouteArg(string, string2, z, z2, parcel.readString(), parcel.readString(), (ProcessItemList) parcel.readParcelable(ProcessPageRouteArg.class.getClassLoader()), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ProcessPageRouteArg[] newArray(int i) {
            return new ProcessPageRouteArg[i];
        }
    };
    public final boolean autoClose;
    public final String enterFrom;
    public final String eventParam;
    public final String hashId;
    public final int index;
    public final boolean noAnimation;
    public final String previousPageId;
    public final ProcessItemList processItemList;
    public final String scene;

    public ProcessPageRouteArg() {
        this("", "", false, false, "", "", new ProcessItemList(null, null, null), "", 0);
    }

    public final ProcessPageRouteArg copy(String str, String str2, boolean z, boolean z2, String str3, String str4, ProcessItemList processItemList, String str5, int i) {
        return new ProcessPageRouteArg(str, str2, z, z2, str3, str4, processItemList, str5, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessPageRouteArg)) {
            return false;
        }
        ProcessPageRouteArg processPageRouteArg = (ProcessPageRouteArg) obj;
        return Intrinsics.LJFF(this.scene, processPageRouteArg.scene) && Intrinsics.LJFF(this.previousPageId, processPageRouteArg.previousPageId) && this.autoClose == processPageRouteArg.autoClose && this.noAnimation == processPageRouteArg.noAnimation && Intrinsics.LJFF(this.eventParam, processPageRouteArg.eventParam) && Intrinsics.LJFF(this.enterFrom, processPageRouteArg.enterFrom) && Intrinsics.LJFF(this.processItemList, processPageRouteArg.processItemList) && Intrinsics.LJFF(this.hashId, processPageRouteArg.hashId) && this.index == processPageRouteArg.index;
    }

    public int hashCode() {
        return (((((((((((((((this.scene.hashCode() * 31) + this.previousPageId.hashCode()) * 31) + C786410Ut5.Z2(this.autoClose)) * 31) + C786410Ut5.Z2(this.noAnimation)) * 31) + this.eventParam.hashCode()) * 31) + this.enterFrom.hashCode()) * 31) + this.processItemList.hashCode()) * 31) + this.hashId.hashCode()) * 31) + this.index;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcessPageRouteArg(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", previousPageId=");
        sbLIZ.append(this.previousPageId);
        sbLIZ.append(", autoClose=");
        sbLIZ.append(this.autoClose);
        sbLIZ.append(", noAnimation=");
        sbLIZ.append(this.noAnimation);
        sbLIZ.append(", eventParam=");
        sbLIZ.append(this.eventParam);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", processItemList=");
        sbLIZ.append(this.processItemList);
        sbLIZ.append(", hashId=");
        sbLIZ.append(this.hashId);
        sbLIZ.append(", index=");
        sbLIZ.append(this.index);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.scene);
        parcel.writeString(this.previousPageId);
        parcel.writeInt(this.autoClose ? 1 : 0);
        parcel.writeInt(this.noAnimation ? 1 : 0);
        parcel.writeString(this.eventParam);
        parcel.writeString(this.enterFrom);
        parcel.writeParcelable(this.processItemList, i);
        parcel.writeString(this.hashId);
        parcel.writeInt(this.index);
    }

    public final boolean getAutoClose() {
        return this.autoClose;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEventParam() {
        return this.eventParam;
    }

    public final String getHashId() {
        return this.hashId;
    }

    public final int getIndex() {
        return this.index;
    }

    public final boolean getNoAnimation() {
        return this.noAnimation;
    }

    public final String getPreviousPageId() {
        return this.previousPageId;
    }

    public final ProcessItemList getProcessItemList() {
        return this.processItemList;
    }

    public final String getScene() {
        return this.scene;
    }

    public ProcessPageRouteArg(String str) {
        this(str, "", false, false, "", "", new ProcessItemList(null, null, null), "", 0);
    }

    public static ProcessPageRouteArg __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        String str3;
        String str4;
        ProcessItemList processItemList;
        String str5;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Integer num = null;
        if (bundle == null) {
            return null;
        }
        int iIntValue = 0;
        if (bundle.containsKey("KEY_SCENE")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("KEY_SCENE"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("previous_page_id")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("previous_page_id"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("auto_close")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("auto_close"), Boolean.class);
            if (bool == null) {
                i += 4;
            }
        } else {
            i += 4;
            bool = null;
        }
        if (bundle.containsKey("no_animation")) {
            bool2 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("no_animation"), Boolean.class);
            if (bool2 == null) {
                i += 8;
            }
        } else {
            i += 8;
            bool2 = null;
        }
        if (bundle.containsKey("KEY_EVENT_PARAM")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("KEY_EVENT_PARAM"), String.class);
        } else {
            i += 16;
            str3 = null;
        }
        if (bundle.containsKey("enter_from")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 32;
            str4 = null;
        }
        if (bundle.containsKey("process_list")) {
            processItemList = (ProcessItemList) RouteParser.INSTANCE.parse(bundle.get("process_list"), ProcessItemList.class);
        } else {
            i += 64;
            processItemList = null;
        }
        if (bundle.containsKey("KEY_HASH_ID")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("KEY_HASH_ID"), String.class);
        } else {
            i += 128;
            str5 = null;
        }
        if (!bundle.containsKey("KEY_INDEX") || (num = (Integer) RouteParser.INSTANCE.parse(bundle.get("KEY_INDEX"), Integer.class)) == null) {
            i += 256;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        if (num != null) {
            iIntValue = num.intValue();
        }
        String str6 = "";
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        int i2 = 0;
        if ((i & 4) != 0) {
            zBooleanValue = false;
        }
        if ((i & 8) != 0) {
            zBooleanValue2 = false;
        }
        if ((i & 16) != 0) {
            str3 = "";
        }
        if ((i & 32) != 0) {
            str4 = "";
        }
        if ((i & 64) != 0) {
            processItemList = new ProcessItemList(null, null, null);
        }
        if ((i & 128) == 0) {
            str6 = str5;
        }
        if ((i & 256) == 0) {
            i2 = iIntValue;
        }
        return new ProcessPageRouteArg(str, str2, zBooleanValue, zBooleanValue2, str3, str4, processItemList, str6, i2);
    }

    public ProcessPageRouteArg(String str, String str2) {
        this(str, str2, false, false, "", "", new ProcessItemList(null, null, null), "", 0);
    }

    public ProcessPageRouteArg(String str, String str2, boolean z) {
        this(str, str2, z, false, "", "", new ProcessItemList(null, null, null), "", 0);
    }

    public ProcessPageRouteArg(String str, String str2, boolean z, boolean z2) {
        this(str, str2, z, z2, "", "", new ProcessItemList(null, null, null), "", 0);
    }

    public ProcessPageRouteArg(String str, String str2, boolean z, boolean z2, String str3) {
        this(str, str2, z, z2, str3, "", new ProcessItemList(null, null, null), "", 0);
    }

    public ProcessPageRouteArg(String str, String str2, boolean z, boolean z2, String str3, String str4) {
        this(str, str2, z, z2, str3, str4, new ProcessItemList(null, null, null), "", 0);
    }

    public ProcessPageRouteArg(String str, String str2, boolean z, boolean z2, String str3, String str4, ProcessItemList processItemList) {
        this(str, str2, z, z2, str3, str4, processItemList, "", 0);
    }

    public ProcessPageRouteArg(String str, String str2, boolean z, boolean z2, String str3, String str4, ProcessItemList processItemList, String str5) {
        this(str, str2, z, z2, str3, str4, processItemList, str5, 0);
    }

    public ProcessPageRouteArg(String str, String str2, boolean z, boolean z2, String str3, String str4, ProcessItemList processItemList, String str5, int i) {
        this.scene = str;
        this.previousPageId = str2;
        this.autoClose = z;
        this.noAnimation = z2;
        this.eventParam = str3;
        this.enterFrom = str4;
        this.processItemList = processItemList;
        this.hashId = str5;
        this.index = i;
    }
}
