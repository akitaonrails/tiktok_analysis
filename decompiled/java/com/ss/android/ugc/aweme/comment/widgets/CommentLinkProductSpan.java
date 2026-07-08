package com.ss.android.ugc.aweme.comment.widgets;

import X.C1353450lKB;
import X.C1402020maW;
import X.InterfaceC1340320kz0;
import X.InterfaceC1353590lKP;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentLinkProductSpan extends ForegroundColorSpan implements Parcelable, InterfaceC1353590lKP {
    public String awemeId;
    public InterfaceC1340320kz0 clickListener;
    public int color;
    public boolean isPressed;
    public String schema;
    public String secId;
    public TextExtraStruct struct;
    public String text;
    public Typeface tf;
    public int type;
    public String uid;
    public static final C1353450lKB Companion = new Object() { // from class: X.0lKB
    };
    public static final Parcelable.Creator<CommentLinkProductSpan> CREATOR = new C1402020maW(2);

    @Override // android.text.style.ForegroundColorSpan, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void LIZJ() {
        InterfaceC1340320kz0 interfaceC1340320kz0 = this.clickListener;
        if (interfaceC1340320kz0 != null) {
            interfaceC1340320kz0.LIZ(this.struct);
        }
    }

    public final int hashCode() {
        String str = this.uid;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.type) * 31;
        TextExtraStruct textExtraStruct = this.struct;
        int iHashCode3 = (iHashCode2 + (textExtraStruct != null ? textExtraStruct.hashCode() : 0)) * 31;
        String str3 = this.awemeId;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.secId;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // X.InterfaceC1353590lKP
    public final TextExtraStruct LIZ() {
        return this.struct;
    }

    public final String LIZIZ() {
        return this.text;
    }

    @Override // X.InterfaceC1353590lKP
    public final int getType() {
        return this.type;
    }

    public final void LIZLLL(boolean z) {
        String productSchema;
        TextExtraStruct textExtraStruct = this.struct;
        if (textExtraStruct != null) {
            productSchema = textExtraStruct.getProductSchema();
        } else {
            productSchema = null;
        }
        if (!TextUtils.isEmpty(productSchema)) {
            this.isPressed = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(CommentLinkProductSpan.class, obj.getClass())) {
            return false;
        }
        CommentLinkProductSpan commentLinkProductSpan = (CommentLinkProductSpan) obj;
        if (this.type != commentLinkProductSpan.type) {
            return false;
        }
        String str = this.uid;
        if (str != null) {
            if (!Intrinsics.LJFF(str, commentLinkProductSpan.uid)) {
                return false;
            }
        } else if (commentLinkProductSpan.uid != null) {
            return false;
        }
        String str2 = this.text;
        if (str2 != null) {
            if (!Intrinsics.LJFF(str2, commentLinkProductSpan.text)) {
                return false;
            }
        } else if (commentLinkProductSpan.text != null) {
            return false;
        }
        TextExtraStruct textExtraStruct = this.struct;
        if (textExtraStruct != null) {
            if (!Intrinsics.LJFF(textExtraStruct, commentLinkProductSpan.struct)) {
                return false;
            }
        } else if (commentLinkProductSpan.struct != null) {
            return false;
        }
        String str3 = this.awemeId;
        if (str3 != null) {
            if (!Intrinsics.LJFF(str3, commentLinkProductSpan.awemeId)) {
                return false;
            }
        } else if (commentLinkProductSpan.awemeId != null) {
            return false;
        }
        String str4 = this.secId;
        if (str4 != null) {
            return Intrinsics.LJFF(str4, commentLinkProductSpan.secId);
        }
        if (commentLinkProductSpan.secId == null) {
            return true;
        }
        return false;
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int iArgb = this.color;
        if (this.isPressed) {
            iArgb = Color.argb(Math.round(Color.alpha(iArgb) * 0.4f), Color.red(iArgb), Color.green(iArgb), Color.blue(iArgb));
        }
        textPaint.setColor(iArgb);
        Typeface typeface = textPaint.getTypeface();
        Typeface typeface2 = this.tf;
        if (typeface2 != null && !Intrinsics.LJFF(typeface, typeface2)) {
            textPaint.setTypeface(this.tf);
        }
        textPaint.setUnderlineText(false);
    }

    public CommentLinkProductSpan(int i, Parcel parcel) {
        super(i);
        this.secId = "";
        this.awemeId = "";
        String string = parcel.readString();
        this.uid = string;
        TextExtraStruct textExtraStruct = this.struct;
        if (textExtraStruct != null) {
            textExtraStruct.setUserId(string);
        }
        this.text = parcel.readString();
        this.type = parcel.readInt();
        this.struct = (TextExtraStruct) parcel.readParcelable(TextExtraStruct.class.getClassLoader());
        String string2 = parcel.readString();
        this.secId = string2;
        TextExtraStruct textExtraStruct2 = this.struct;
        if (textExtraStruct2 != null) {
            textExtraStruct2.setSecUid(string2);
        }
    }

    @Override // android.text.style.ForegroundColorSpan, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.text);
        parcel.writeInt(this.type);
        parcel.writeParcelable(this.struct, i);
        parcel.writeString(this.secId);
    }

    public CommentLinkProductSpan(int i, TextExtraStruct textExtraStruct) {
        super(i);
        this.secId = "";
        this.awemeId = "";
        this.color = i;
        this.struct = textExtraStruct;
    }

    public CommentLinkProductSpan(String str, int i, InterfaceC1340320kz0 interfaceC1340320kz0, long j, String str2, String str3) {
        super(i);
        this.secId = "";
        this.awemeId = "";
        this.uid = "";
        TextExtraStruct textExtraStruct = this.struct;
        if (textExtraStruct != null) {
            textExtraStruct.setUserId("");
        }
        this.text = str;
        this.type = 8;
        this.secId = null;
        TextExtraStruct textExtraStruct2 = this.struct;
        if (textExtraStruct2 != null) {
            textExtraStruct2.setSecUid(null);
        }
        this.color = i;
        this.clickListener = interfaceC1340320kz0;
        TextExtraStruct textExtraStruct3 = new TextExtraStruct();
        this.struct = textExtraStruct3;
        textExtraStruct3.setUserId("");
        TextExtraStruct textExtraStruct4 = this.struct;
        if (textExtraStruct4 != null) {
            textExtraStruct4.setType(8);
        }
        TextExtraStruct textExtraStruct5 = this.struct;
        if (textExtraStruct5 != null) {
            textExtraStruct5.setSecUid(null);
        }
        TextExtraStruct textExtraStruct6 = this.struct;
        if (textExtraStruct6 != null) {
            textExtraStruct6.setProductId(j);
        }
        TextExtraStruct textExtraStruct7 = this.struct;
        if (textExtraStruct7 != null) {
            textExtraStruct7.setProductTitle(str2);
        }
        TextExtraStruct textExtraStruct8 = this.struct;
        if (textExtraStruct8 != null) {
            textExtraStruct8.setProductSchema(str3);
        }
    }
}
