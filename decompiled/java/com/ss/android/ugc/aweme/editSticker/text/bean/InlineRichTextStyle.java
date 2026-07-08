package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C09CS;
import X.C09CT;
import X.C197002125w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.r;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
@C09CS(InlineRichStyleTypeAdapter.class)
public class InlineRichTextStyle implements Parcelable {

    @C09CT("type")
    public final String type;
    public static final C197002125w Companion = new Object() { // from class: X.125w
    };
    public static final Parcelable.Creator<InlineRichTextStyle> CREATOR = new Parcelable.Creator<InlineRichTextStyle>() { // from class: X.125v
        @Override // android.os.Parcelable.Creator
        public final InlineRichTextStyle createFromParcel(Parcel parcel) {
            return new InlineRichTextStyle(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InlineRichTextStyle[] newArray(int i) {
            return new InlineRichTextStyle[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
    }

    public InlineRichTextStyle(String str) {
        this.type = str;
    }

    public static final class InlineRichStyleTypeAdapter implements j<InlineRichTextStyle>, r<InlineRichTextStyle> {
        @Override // com.google.gson.r
        public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
            if (obj != null && aVar != null) {
                if (obj instanceof ForegroundColorStyle) {
                    return aVar.LIZJ(obj, ForegroundColorStyle.class);
                }
                if (obj instanceof TypefaceStyle) {
                    return aVar.LIZJ(obj, TypefaceStyle.class);
                }
                return null;
            }
            return null;
        }

        /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle, java.lang.Object] */
        @Override // com.google.gson.j
        public final InlineRichTextStyle deserialize(k kVar, Type type, i iVar) {
            String strLJIL = kVar.LJIILIIL().LJJIIZ("type").LJIL();
            if (Intrinsics.LJFF(strLJIL, "ForegroundColorStyle")) {
                if (iVar != null) {
                    return ((TreeTypeAdapter.a) iVar).LIZ(kVar, ForegroundColorStyle.class);
                }
                return null;
            }
            if (Intrinsics.LJFF(strLJIL, "TypefaceStyle") && iVar != null) {
                return ((TreeTypeAdapter.a) iVar).LIZ(kVar, TypefaceStyle.class);
            }
            return null;
        }
    }
}
