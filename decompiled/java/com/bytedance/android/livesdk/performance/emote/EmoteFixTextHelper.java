package com.bytedance.android.livesdk.performance.emote;

import X.C0WZX;
import X.C1110390f09;
import X.C1115050f7f;
import X.C1115100f7k;
import X.C1115120f7m;
import X.C1115360f8A;
import X.C1115380f8C;
import X.C13BV;
import X.C13LP;
import X.C19719612Di;
import X.C20586215gy;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C416610GVf;
import X.EnumC1110450f0F;
import X.EnumC584890Mwp;
import Y.AComparatorS36S0000000_17;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCommentDrawableEmojiSetting;
import com.bytedance.android.livesdk.performance.emote.EmoteFixTextHelper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class EmoteFixTextHelper implements Parcelable {
    public static final C1115120f7m CREATOR = new Parcelable.Creator<EmoteFixTextHelper>() { // from class: X.0f7m
        @Override // android.os.Parcelable.Creator
        public final EmoteFixTextHelper createFromParcel(Parcel parcel) {
            EmoteFixTextHelper emoteFixTextHelper = new EmoteFixTextHelper();
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(EmoteFixTextHelper.EmoteText.CREATOR);
            if ((arrayListCreateTypedArrayList instanceof ArrayList) && arrayListCreateTypedArrayList != null) {
                emoteFixTextHelper.textList.addAll(arrayListCreateTypedArrayList);
            }
            emoteFixTextHelper.recordInputIndex = parcel.readInt();
            emoteFixTextHelper.recordLength = parcel.readInt();
            return emoteFixTextHelper;
        }

        @Override // android.os.Parcelable.Creator
        public final EmoteFixTextHelper[] newArray(int i) {
            return new EmoteFixTextHelper[i];
        }
    };
    public int recordInputIndex;
    public int recordLength;
    public EnumC584890Mwp inputScene = EnumC584890Mwp.COMMENT;
    public ArrayList<EmoteText> textList = new ArrayList<>();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static final class EmoteText implements Parcelable {
        public static final C1115100f7k CREATOR = new Parcelable.Creator<EmoteText>() { // from class: X.0f7k
            @Override // android.os.Parcelable.Creator
            public final EmoteFixTextHelper.EmoteText createFromParcel(Parcel parcel) {
                EmoteFixTextHelper.EmoteText emoteText = new EmoteFixTextHelper.EmoteText();
                emoteText.state = parcel.readInt();
                emoteText.emote = (EmoteModel) parcel.readParcelable(EmoteModel.class.getClassLoader());
                emoteText.text = parcel.readString();
                emoteText.emoji = parcel.readString();
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                emoteText.onlineEmojiName = string;
                return emoteText;
            }

            @Override // android.os.Parcelable.Creator
            public final EmoteFixTextHelper.EmoteText[] newArray(int i) {
                return new EmoteFixTextHelper.EmoteText[i];
            }
        };
        public String emoji;
        public EmoteModel emote;
        public String onlineEmojiName;
        public int state;
        public CharSequence text;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public EmoteText() {
            this.emoji = "";
            this.onlineEmojiName = "";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String string;
            parcel.writeInt(this.state);
            parcel.writeParcelable(this.emote, i);
            CharSequence charSequence = this.text;
            if (charSequence != null) {
                string = charSequence.toString();
            } else {
                string = null;
            }
            parcel.writeString(string);
            parcel.writeString(this.emoji);
            parcel.writeString(this.onlineEmojiName);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public EmoteText(int i, EmoteModel emoteModel, CharSequence charSequence, int i2) {
            String str;
            this();
            emoteModel = (i2 & 2) != 0 ? new EmoteModel() : emoteModel;
            charSequence = (i2 & 4) != 0 ? "" : charSequence;
            if ((i2 & 8) != 0) {
                str = "";
            } else {
                str = null;
            }
            String str2 = (i2 & 16) == 0 ? null : "";
            this.state = i;
            this.emote = emoteModel;
            this.text = charSequence;
            this.emoji = str;
            this.onlineEmojiName = str2;
        }
    }

    public final int LJ() {
        Iterator<EmoteText> it2 = this.textList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().state == 1) {
                i++;
            }
        }
        return i;
    }

    public final List<EmoteWithIndex> LJFF() {
        EmoteModel emoteModel;
        if (this.textList.isEmpty()) {
            return C13BV.INSTANCE;
        }
        StringBuilder sb = new StringBuilder();
        int size = this.textList.size();
        for (int i = 0; i < size; i++) {
            EmoteText emoteText = (EmoteText) ListProtector.get(this.textList, i);
            int i2 = emoteText.state;
            if (i2 == 1) {
                sb.append((char) 65532);
            } else if (i2 == 0) {
                sb.append(emoteText.text);
            }
        }
        ArrayList arrayList = new ArrayList();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        String string = sb.toString();
        characterInstance.setText(sb.toString());
        int iFirst = characterInstance.first();
        int next = characterInstance.next();
        while (true) {
            int i3 = iFirst;
            iFirst = next;
            if (next == -1) {
                break;
            }
            arrayList.add(string.substring(i3, next));
            next = characterInstance.next();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size2 = this.textList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (((EmoteText) ListProtector.get(this.textList, i4)).state == 1 && (emoteModel = ((EmoteText) ListProtector.get(this.textList, i4)).emote) != null) {
                arrayList3.add(emoteModel);
            }
        }
        int size3 = arrayList.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size3; i6++) {
            if (((String) ListProtector.get(arrayList, i6)).charAt(0) == 65532) {
                if (i5 >= arrayList3.size()) {
                    break;
                }
                EmoteModel emoteModel2 = (EmoteModel) ListProtector.get(arrayList3, i5);
                EmoteWithIndex emoteWithIndex = new EmoteWithIndex();
                emoteWithIndex.index = i6;
                emoteWithIndex.emoteModel = emoteModel2;
                arrayList2.add(emoteWithIndex);
                i5++;
            }
        }
        return arrayList2;
    }

    public final String LJII() {
        if (this.textList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = this.textList.size();
        for (int i = 0; i < size; i++) {
            EmoteText emoteText = (EmoteText) ListProtector.get(this.textList, i);
            if (emoteText.state == 0) {
                sb.append(String.valueOf(emoteText.text));
            }
        }
        return sb.toString();
    }

    public static String LJIIJ(List list) {
        boolean z;
        String str;
        String str2;
        String str3;
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            EmoteWithIndex emoteWithIndex = (EmoteWithIndex) it2.next();
            if (sb.length() > 0) {
                sb.append(",");
            }
            EmoteModel emoteModel = emoteWithIndex.emoteModel;
            if (emoteModel != null && emoteModel.emoteScene == 1) {
                z = true;
            } else {
                z = false;
            }
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            Integer numValueOf3 = null;
            String str4 = null;
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(emoteWithIndex.index);
                sbLIZ.append(':');
                EmoteModel emoteModel2 = emoteWithIndex.emoteModel;
                if (emoteModel2 != null) {
                    str = emoteModel2.emoteId;
                } else {
                    str = null;
                }
                sbLIZ.append(str);
                sbLIZ.append(':');
                EmoteModel emoteModel3 = emoteWithIndex.emoteModel;
                if (emoteModel3 != null) {
                    numValueOf = Integer.valueOf(emoteModel3.emoteScene);
                }
                sbLIZ.append(numValueOf);
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                if (emoteModel != null) {
                    if (emoteModel.emoteScene == 2) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(emoteWithIndex.index);
                        sbLIZ2.append(':');
                        EmoteModel emoteModel4 = emoteWithIndex.emoteModel;
                        if (emoteModel4 != null) {
                            str2 = emoteModel4.emoteId;
                        } else {
                            str2 = null;
                        }
                        sbLIZ2.append(str2);
                        sbLIZ2.append(':');
                        EmoteModel emoteModel5 = emoteWithIndex.emoteModel;
                        if (emoteModel5 != null) {
                            numValueOf3 = Integer.valueOf(emoteModel5.emoteScene);
                        }
                        sbLIZ2.append(numValueOf3);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                    } else if (emoteModel.emoteScene == 3) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(emoteWithIndex.index);
                        sbLIZ3.append(':');
                        EmoteModel emoteModel6 = emoteWithIndex.emoteModel;
                        if (emoteModel6 != null) {
                            str3 = emoteModel6.emoteId;
                        } else {
                            str3 = null;
                        }
                        sbLIZ3.append(str3);
                        sbLIZ3.append(':');
                        EmoteModel emoteModel7 = emoteWithIndex.emoteModel;
                        if (emoteModel7 != null) {
                            numValueOf2 = Integer.valueOf(emoteModel7.emoteScene);
                        }
                        sbLIZ3.append(numValueOf2);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(emoteWithIndex.index);
                sbLIZ4.append(':');
                EmoteModel emoteModel8 = emoteWithIndex.emoteModel;
                if (emoteModel8 != null) {
                    str4 = emoteModel8.emoteId;
                }
                sbLIZ4.append(str4);
                sb.append(C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
        return sb.toString();
    }

    public final void LIZ(int i, String str) {
        if (i <= this.textList.size() && i >= 0) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                ListProtector.add(this.textList, i + i2, new EmoteText(0, null, String.valueOf(str.charAt(i2)), 26));
            }
        }
    }

    public final void LIZIZ(int i, EmoteModel emoteModel) {
        if (i <= this.textList.size() && i >= 0) {
            ListProtector.add(this.textList, i, new EmoteText(1, emoteModel, null, 28));
        }
    }

    public final void LIZJ(int i, CharSequence charSequence) {
        if (i <= this.textList.size() && i >= 0) {
            ListProtector.add(this.textList, i, new EmoteText(0, null, charSequence, 26));
        }
    }

    public final void LIZLLL(int i, int i2) {
        if (i >= 0 && i < i2 && i2 <= this.textList.size()) {
            this.textList.subList(i, i2).clear();
        }
    }

    public final int LJI(Spannable spannable, List<C416610GVf> list) {
        Iterator<EmoteText> it2 = this.textList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().state == 1) {
                i += 4;
            } else {
                i++;
            }
        }
        if (this.inputScene != EnumC584890Mwp.COMMENT) {
            return i;
        }
        C416610GVf[] c416610GVfArr = (C416610GVf[]) spannable.getSpans(0, spannable.length(), C416610GVf.class);
        for (C416610GVf c416610GVf : c416610GVfArr) {
            i += c416610GVf.LLILZIL;
        }
        if (list != null) {
            C19719612Di.LJJII(list, c416610GVfArr);
        }
        return i;
    }

    public final boolean LJIIIIZZ(C20586215gy c20586215gy, int i) throws Throwable {
        EmoteModel emoteModel;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Editable editableLLJILJILJ = C2204961BRm.LLJILJILJ(c20586215gy, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+y92D02EruZYmZej4bCYkQomM84yGcWQTpbvoN+DknKpuF8W", null));
        for (EmoteText emoteText : this.textList) {
            int i2 = emoteText.state;
            if (i2 != 0) {
                if (i2 == 1 && (emoteModel = emoteText.emote) != null) {
                    C1110390f09 c1110390f09 = C1110390f09.LIZ;
                    C1110390f09.LIZJ(emoteModel, EnumC1110450f0F.INPUT_PANNEL, null, new AwS596S0100000_17(spannableStringBuilder, 686));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("type 1, ");
                    EmoteModel emoteModel2 = emoteText.emote;
                    if (emoteModel2 != null) {
                        str = emoteModel2.emoteId;
                    } else {
                        str = null;
                    }
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                spannableStringBuilder.append(emoteText.text);
            }
        }
        editableLLJILJILJ.append((CharSequence) spannableStringBuilder);
        if (this.inputScene == EnumC584890Mwp.COMMENT && (editableLLJILJILJ instanceof SpannableStringBuilder) && LiveCommentDrawableEmojiSetting.INSTANCE.getValue()) {
            C1115360f8A c1115360f8A = C1115380f8C.LIZ;
            SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) editableLLJILJILJ;
            C1115380f8C.LIZLLL(spannableStringBuilder2, c20586215gy.getResources(), null, new C1115050f7f(c20586215gy, i));
            if (spannableStringBuilder2.length() != C2204961BRm.LLJILJILJ(c20586215gy, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+y92D02EruZYmZej4bCYkQomM84yGcWQTpbvoN+DknKpuF8W", null)).length()) {
                LIZLLL(C2204961BRm.LLJILJILJ(c20586215gy, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+y92D02EruZYmZej4bCYkQomM84yGcWQTpbvoN+DknKpuF8W", null)).length() - 1, spannableStringBuilder2.length() - 1);
                return true;
            }
        }
        return false;
    }

    public final void LJIIIZ(String str, List<? extends EmoteWithIndex> list) {
        this.textList.clear();
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                ArrayList<EmoteText> arrayList = this.textList;
                EmoteText emoteText = new EmoteText();
                emoteText.state = 0;
                int i2 = i + 1;
                emoteText.text = str.subSequence(i, i2);
                arrayList.add(emoteText);
                i = i2;
            }
        }
        if (list != null) {
            for (EmoteWithIndex emoteWithIndex : C13LP.LJLLLL(new AComparatorS36S0000000_17(8), list)) {
                int i3 = emoteWithIndex.index;
                if (i3 >= 0 && i3 <= this.textList.size()) {
                    ArrayList<EmoteText> arrayList2 = this.textList;
                    int i4 = emoteWithIndex.index;
                    EmoteText emoteText2 = new EmoteText();
                    emoteText2.state = 1;
                    emoteText2.emote = emoteWithIndex.emoteModel;
                    ListProtector.add(arrayList2, i4, emoteText2);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.textList);
        parcel.writeInt(this.recordInputIndex);
        parcel.writeInt(this.recordLength);
    }
}
