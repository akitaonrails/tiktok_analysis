package com.ss.android.ugc.aweme.im.message.template.component.interactive.task;

import X.C13BV;
import X.C1516540pZE;
import X.C15438062q;
import X.C1954807lC;
import X.C2188811AlT;
import X.C2230151CQj;
import X.C2230171CQl;
import X.C2230211CQp;
import X.C2230221CQq;
import X.EnumC1710806mw;
import X.EnumC2230231CQr;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.InlineMessageKeyComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.InlineMessageTipComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class InlineMessageTipComponent implements BaseComponent<C2230151CQj> {
    public static final Parcelable.Creator<InlineMessageTipComponent> CREATOR = new Parcelable.Creator<InlineMessageTipComponent>() { // from class: X.0Zi6
        @Override // android.os.Parcelable.Creator
        public final InlineMessageTipComponent createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InlineMessageKeyComponent.CREATOR.createFromParcel(parcel));
            }
            return new InlineMessageTipComponent(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final InlineMessageTipComponent[] newArray(int i) {
            return new InlineMessageTipComponent[i];
        }
    };
    public final List<InlineMessageKeyComponent> template;
    public final String tips;

    public InlineMessageTipComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineMessageTipComponent)) {
            return false;
        }
        InlineMessageTipComponent inlineMessageTipComponent = (InlineMessageTipComponent) obj;
        return Intrinsics.LJFF(this.tips, inlineMessageTipComponent.tips) && Intrinsics.LJFF(this.template, inlineMessageTipComponent.template);
    }

    public final int hashCode() {
        return (this.tips.hashCode() * 31) + this.template.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InlineMessageTipComponent(tips=");
        sbLIZ.append(this.tips);
        sbLIZ.append(", template=");
        sbLIZ.append(this.template);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tips);
        List<InlineMessageKeyComponent> list = this.template;
        parcel.writeInt(list.size());
        Iterator<InlineMessageKeyComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public final C2230151CQj LIZ() {
        EnumC2230231CQr enumC2230231CQr;
        C2230171CQl c2230171CQl = new C2230171CQl();
        c2230171CQl.LIZLLL = this.tips;
        List<InlineMessageKeyComponent> list = this.template;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (InlineMessageKeyComponent inlineMessageKeyComponent : list) {
            inlineMessageKeyComponent.getClass();
            C2230211CQp c2230211CQp = new C2230211CQp();
            c2230211CQp.LIZLLL = inlineMessageKeyComponent.key;
            c2230211CQp.LJ = inlineMessageKeyComponent.name;
            c2230211CQp.LJFF = inlineMessageKeyComponent.link;
            EnumC1710806mw enumC1710806mw = inlineMessageKeyComponent.action;
            if (enumC1710806mw == null) {
                enumC2230231CQr = EnumC2230231CQr.GroupShotRetry;
            } else {
                int i = C2230221CQq.LIZ[enumC1710806mw.ordinal()];
                if (i == 1) {
                    enumC2230231CQr = EnumC2230231CQr.Schema;
                } else {
                    if (i != 2) {
                        throw new C1954807lC();
                    }
                    enumC2230231CQr = EnumC2230231CQr.GroupShotRetry;
                }
            }
            c2230211CQp.LJI = enumC2230231CQr;
            arrayList.add(c2230211CQp.build());
        }
        C1516540pZE.LIZ(arrayList);
        c2230171CQl.LJ = arrayList;
        return c2230171CQl.build();
    }

    public InlineMessageTipComponent(int i) {
        this("", C13BV.INSTANCE);
    }

    public InlineMessageTipComponent(String str, List<InlineMessageKeyComponent> list) {
        this.tips = str;
        this.template = list;
    }
}
