package com.ss.android.ugc.aweme.im.message.template.card.infocard;

import X.C13BV;
import X.C2188811AlT;
import X.C2243331CrD;
import X.C2243491CrT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardContentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class InfoCardContentComponent implements BaseComponent<C2243331CrD> {
    public static final Parcelable.Creator<InfoCardContentComponent> CREATOR = new Parcelable.Creator<InfoCardContentComponent>() { // from class: X.1CrO
        @Override // android.os.Parcelable.Creator
        public final InfoCardContentComponent createFromParcel(Parcel parcel) {
            TextComponent textComponentCreateFromParcel = TextComponent.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TextComponent.CREATOR.createFromParcel(parcel));
            }
            return new InfoCardContentComponent(textComponentCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final InfoCardContentComponent[] newArray(int i) {
            return new InfoCardContentComponent[i];
        }
    };
    public final List<TextComponent> contentList;
    public final TextComponent description;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoCardContentComponent)) {
            return false;
        }
        InfoCardContentComponent infoCardContentComponent = (InfoCardContentComponent) obj;
        return Intrinsics.LJFF(this.description, infoCardContentComponent.description) && Intrinsics.LJFF(this.contentList, infoCardContentComponent.contentList);
    }

    public final int hashCode() {
        return (this.description.hashCode() * 31) + this.contentList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InfoCardContentComponent(description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", contentList=");
        sbLIZ.append(this.contentList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.description.writeToParcel(parcel, i);
        List<TextComponent> list = this.contentList;
        parcel.writeInt(list.size());
        Iterator<TextComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfoCardContentComponent() {
        this(C2243491CrT.LIZ(), C13BV.INSTANCE);
        TextComponent.Companion.getClass();
    }

    public InfoCardContentComponent(TextComponent textComponent, List<TextComponent> list) {
        this.description = textComponent;
        this.contentList = list;
    }
}
