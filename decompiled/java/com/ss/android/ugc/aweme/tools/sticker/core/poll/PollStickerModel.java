package com.ss.android.ugc.aweme.tools.sticker.core.poll;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C1440500naa;
import X.C1466410oGN;
import X.C15438062q;
import X.C1697810uHb;
import X.C19591311kt;
import X.C19598511m3;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.l;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.poll.PollStickerModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PollStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("clickable")
    public final boolean clickable;

    @C09CT("editable")
    public final boolean editable;

    @C09CT("option_1")
    public String option1;

    @C09CT("option_2")
    public String option2;

    @C09CT("poll_sticker_id")
    public String pollStickerId;

    @C09CT("question")
    public String question;

    @C09CT("visible")
    public final boolean visible;
    public static final C1466410oGN Companion = new Object() { // from class: X.0oGN
    };
    public static final Parcelable.Creator<PollStickerModel> CREATOR = new Parcelable.Creator<PollStickerModel>() { // from class: X.0oGJ
        @Override // android.os.Parcelable.Creator
        public final PollStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
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
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new PollStickerModel(baseStickerModelCreateFromParcel, z, z2, z3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PollStickerModel[] newArray(int i) {
            return new PollStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public final PollStickerModel copy(BaseStickerModel baseStickerModel, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4) {
        return new PollStickerModel(baseStickerModel, z, z2, z3, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollStickerModel)) {
            return false;
        }
        PollStickerModel pollStickerModel = (PollStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, pollStickerModel.baseStickerModel) && this.visible == pollStickerModel.visible && this.editable == pollStickerModel.editable && this.clickable == pollStickerModel.clickable && Intrinsics.LJFF(this.question, pollStickerModel.question) && Intrinsics.LJFF(this.option1, pollStickerModel.option1) && Intrinsics.LJFF(this.option2, pollStickerModel.option2) && Intrinsics.LJFF(this.pollStickerId, pollStickerModel.pollStickerId);
    }

    public int hashCode() {
        return (((((((((((((this.baseStickerModel.hashCode() * 31) + C786410Ut5.Z2(this.visible)) * 31) + C786410Ut5.Z2(this.editable)) * 31) + C786410Ut5.Z2(this.clickable)) * 31) + this.question.hashCode()) * 31) + this.option1.hashCode()) * 31) + this.option2.hashCode()) * 31) + this.pollStickerId.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isVERenderSticker() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean needCompile() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(Context context, String str, C1440500naa c1440500naa, C0FKI c0fki, String str2) {
        return null;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.visible);
        sbLIZ.append(", editable=");
        sbLIZ.append(this.editable);
        sbLIZ.append(", clickable=");
        sbLIZ.append(this.clickable);
        sbLIZ.append(", question=");
        sbLIZ.append(this.question);
        sbLIZ.append(", option1=");
        sbLIZ.append(this.option1);
        sbLIZ.append(", option2=");
        sbLIZ.append(this.option2);
        sbLIZ.append(", pollStickerId=");
        sbLIZ.append(this.pollStickerId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeInt(this.editable ? 1 : 0);
        parcel.writeInt(this.clickable ? 1 : 0);
        parcel.writeString(this.question);
        parcel.writeString(this.option1);
        parcel.writeString(this.option2);
        parcel.writeString(this.pollStickerId);
    }

    public PollStickerModel() {
        this(new BaseStickerModel(0, 0, EnumC1466150oFx.POLL, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), true, false, false, "", "", "", "");
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        PollStruct pollStruct = new PollStruct();
        pollStruct.setQuestion(this.question);
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI(this.option1, this.option2);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        for (String str : listLJIIJJI) {
            PollStruct.OptionsBean optionsBean = new PollStruct.OptionsBean();
            optionsBean.setOptionText(str);
            optionsBean.setPostOption(str);
            arrayList.add(optionsBean);
        }
        pollStruct.setOptions(arrayList);
        interactStickerStructLIZLLL.setPollStruct(pollStruct);
        try {
            HashMap map = new HashMap();
            map.put("poll_sticker_id", this.pollStickerId);
            interactStickerStructLIZLLL.setAttr(GsonProtectorUtils.toJson(C19598511m3.LIZ(), map));
        } catch (l e) {
            TryCatchGuardChecker.doCheck(e);
        }
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return this.question.length() > 0 || this.option1.length() > 0 || this.option2.length() > 0;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final String getOption1() {
        return this.option1;
    }

    public final String getOption2() {
        return this.option2;
    }

    public final String getPollStickerId() {
        return this.pollStickerId;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final void setOption1(String str) {
        this.option1 = str;
    }

    public final void setOption2(String str) {
        this.option2 = str;
    }

    public final void setPollStickerId(String str) {
        this.pollStickerId = str;
    }

    public final void setQuestion(String str) {
        this.question = str;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy(BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), this.visible, this.editable, this.clickable, this.question, this.option1, this.option2, this.pollStickerId);
    }

    public PollStickerModel(BaseStickerModel baseStickerModel, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4) {
        this.baseStickerModel = baseStickerModel;
        this.visible = z;
        this.editable = z2;
        this.clickable = z3;
        this.question = str;
        this.option1 = str2;
        this.option2 = str3;
        this.pollStickerId = str4;
    }
}
