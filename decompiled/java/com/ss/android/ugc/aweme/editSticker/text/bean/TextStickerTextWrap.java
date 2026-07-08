package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C15438062q;
import X.C1632480saE;
import X.C201955140j;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
public final class TextStickerTextWrap implements Parcelable, Cloneable {
    public static final Parcelable.Creator<TextStickerTextWrap> CREATOR = new Parcelable.Creator<TextStickerTextWrap>() { // from class: X.123Q
        @Override // android.os.Parcelable.Creator
        public final TextStickerTextWrap createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                TextStickerString textStickerStringCreateFromParcel = TextStickerString.CREATOR.createFromParcel(parcel);
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(InteractTextStructWrap.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap.put(textStickerStringCreateFromParcel, arrayList);
            }
            TextStickerTextPair textStickerTextPairCreateFromParcel = TextStickerTextPair.CREATOR.createFromParcel(parcel);
            int i5 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new TextStickerTextWrap(linkedHashMap, textStickerTextPairCreateFromParcel, i5, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerTextWrap[] newArray(int i) {
            return new TextStickerTextWrap[i];
        }
    };
    public final boolean hasFocus;
    public final boolean isReplaceString;
    public final int selectionStart;
    public final Map<TextStickerString, List<InteractTextStructWrap>> strMap;
    public final TextStickerTextPair strPair;

    private final TextStickerTextPair component2() {
        return this.strPair;
    }

    public final TextStickerTextWrap copy(Map<TextStickerString, ? extends List<InteractTextStructWrap>> map, TextStickerTextPair textStickerTextPair, int i, boolean z, boolean z2) {
        return new TextStickerTextWrap(map, textStickerTextPair, i, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStickerTextWrap)) {
            return false;
        }
        TextStickerTextWrap textStickerTextWrap = (TextStickerTextWrap) obj;
        return Intrinsics.LJFF(this.strMap, textStickerTextWrap.strMap) && Intrinsics.LJFF(this.strPair, textStickerTextWrap.strPair) && this.selectionStart == textStickerTextWrap.selectionStart && this.hasFocus == textStickerTextWrap.hasFocus && this.isReplaceString == textStickerTextWrap.isReplaceString;
    }

    public int hashCode() {
        return (((((((this.strMap.hashCode() * 31) + this.strPair.hashCode()) * 31) + this.selectionStart) * 31) + C786410Ut5.Z2(this.hasFocus)) * 31) + C786410Ut5.Z2(this.isReplaceString);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextStickerTextWrap(strMap=");
        sbLIZ.append(this.strMap);
        sbLIZ.append(", strPair=");
        sbLIZ.append(this.strPair);
        sbLIZ.append(", selectionStart=");
        sbLIZ.append(this.selectionStart);
        sbLIZ.append(", hasFocus=");
        sbLIZ.append(this.hasFocus);
        sbLIZ.append(", isReplaceString=");
        sbLIZ.append(this.isReplaceString);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map<TextStickerString, List<InteractTextStructWrap>> map = this.strMap;
        parcel.writeInt(map.size());
        for (Map.Entry<TextStickerString, List<InteractTextStructWrap>> entry : map.entrySet()) {
            entry.getKey().writeToParcel(parcel, i);
            List<InteractTextStructWrap> value = entry.getValue();
            parcel.writeInt(value.size());
            Iterator<InteractTextStructWrap> it2 = value.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        this.strPair.writeToParcel(parcel, i);
        parcel.writeInt(this.selectionStart);
        parcel.writeInt(this.hasFocus ? 1 : 0);
        parcel.writeInt(this.isReplaceString ? 1 : 0);
    }

    public TextStickerTextWrap() {
        HashMap map = new HashMap();
        TextStickerTextPair textStickerTextPair = new TextStickerTextPair("", new ArrayList());
        this(map, textStickerTextPair, textStickerTextPair.first.length(), false, false);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TextStickerTextWrap m189clone() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<TextStickerString, List<InteractTextStructWrap>> entry : this.strMap.entrySet()) {
            ArrayList arrayList = new ArrayList();
            for (InteractTextStructWrap interactTextStructWrap : entry.getValue()) {
                arrayList.add(interactTextStructWrap.copy(interactTextStructWrap.range, interactTextStructWrap.struct));
            }
            linkedHashMap.put(new TextStickerString(entry.getKey().getStr()), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (InteractTextStructWrap interactTextStructWrap2 : this.strPair.second) {
            arrayList2.add(interactTextStructWrap2.copy(interactTextStructWrap2.range, interactTextStructWrap2.struct));
        }
        return new TextStickerTextWrap(linkedHashMap, new TextStickerTextPair(this.strPair.first, arrayList2), this.selectionStart, false, false);
    }

    public final List<CreateAnchorInfo> getAnchorInfoList() {
        List<InteractTextStructWrap> list = this.strPair.second;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<InteractTextStructWrap> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getStruct());
        }
        return arrayList;
    }

    public final TextStickerString[] getStickerStringArray() {
        return (TextStickerString[]) this.strMap.keySet().toArray(new TextStickerString[0]);
    }

    public final String[] getStrArray() {
        Set<TextStickerString> setKeySet = this.strMap.keySet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
        Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((TextStickerString) it2.next()).getStr());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final String getText() {
        return this.strPair.first;
    }

    public final boolean isValid() {
        TextStickerString[] stickerStringArray;
        if (this.strMap.isEmpty() || this.isReplaceString || (stickerStringArray = getStickerStringArray()) == null) {
            return false;
        }
        for (TextStickerString textStickerString : stickerStringArray) {
            if (textStickerString.getStr().length() > 0 && a0.LJLIIIL(textStickerString.getStr()).toString().length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final TextStickerTextPair safeStrPair() {
        if (this.strPair.second == null) {
            try {
                Field field = Pair.class.getField("LLILLJJLI");
                field.setAccessible(true);
                field.set(this.strPair, new ArrayList());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJIIJ(C1632480saE.LIZIZ, "TextStickerTextWrap.safeStrPair", e);
            }
        }
        return this.strPair;
    }

    public final boolean getHasFocus() {
        return this.hasFocus;
    }

    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final Map<TextStickerString, List<InteractTextStructWrap>> getStrMap() {
        return this.strMap;
    }

    public final boolean isReplaceString() {
        return this.isReplaceString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextStickerTextWrap(Map<TextStickerString, ? extends List<InteractTextStructWrap>> map, TextStickerTextPair textStickerTextPair, int i, boolean z, boolean z2) {
        this.strMap = map;
        this.strPair = textStickerTextPair;
        this.selectionStart = i;
        this.hasFocus = z;
        this.isReplaceString = z2;
    }
}
