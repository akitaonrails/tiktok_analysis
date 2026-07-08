package com.ss.android.ugc.aweme.creative.model.photomode.airewrite;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.AIRewriteModel;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.CachePoweredTexts;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.RequestContent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AIRewriteModel implements Parcelable {
    public static final Parcelable.Creator<AIRewriteModel> CREATOR = new Parcelable.Creator<AIRewriteModel>() { // from class: X.0mh3
        @Override // android.os.Parcelable.Creator
        public final AIRewriteModel createFromParcel(Parcel parcel) {
            RequestContent requestContentCreateFromParcel;
            boolean z;
            boolean z2;
            boolean z3;
            if (parcel.readInt() == 0) {
                requestContentCreateFromParcel = null;
            } else {
                requestContentCreateFromParcel = RequestContent.CREATOR.createFromParcel(parcel);
            }
            RequestContent requestContent = requestContentCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(Integer.valueOf(parcel.readInt()), CachePoweredTexts.CREATOR.createFromParcel(parcel));
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
            return new AIRewriteModel(requestContent, z, linkedHashMap, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final AIRewriteModel[] newArray(int i) {
            return new AIRewriteModel[i];
        }
    };

    @C040H
    public boolean isAIRewriteLoading;

    @C09CT("is_cur_used_ai_rewrite")
    public boolean isCurUsedAIRewrite;

    @C09CT("is_last_used_ai_rewrite")
    public boolean isLastUsedAIRewrite;

    @C040H
    public RequestContent lastAIRewriteRequestContent;

    @C040H
    public Map<Integer, CachePoweredTexts> lastGenerateAIRewriting;

    public AIRewriteModel() {
        this(null, false, new LinkedHashMap(), false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRewriteModel)) {
            return false;
        }
        AIRewriteModel aIRewriteModel = (AIRewriteModel) obj;
        return Intrinsics.LJFF(this.lastAIRewriteRequestContent, aIRewriteModel.lastAIRewriteRequestContent) && this.isAIRewriteLoading == aIRewriteModel.isAIRewriteLoading && Intrinsics.LJFF(this.lastGenerateAIRewriting, aIRewriteModel.lastGenerateAIRewriting) && this.isCurUsedAIRewrite == aIRewriteModel.isCurUsedAIRewrite && this.isLastUsedAIRewrite == aIRewriteModel.isLastUsedAIRewrite;
    }

    public final int hashCode() {
        RequestContent requestContent = this.lastAIRewriteRequestContent;
        return ((((((((requestContent == null ? 0 : requestContent.hashCode()) * 31) + C786410Ut5.Z2(this.isAIRewriteLoading)) * 31) + this.lastGenerateAIRewriting.hashCode()) * 31) + C786410Ut5.Z2(this.isCurUsedAIRewrite)) * 31) + C786410Ut5.Z2(this.isLastUsedAIRewrite);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRewriteModel(lastAIRewriteRequestContent=");
        sbLIZ.append(this.lastAIRewriteRequestContent);
        sbLIZ.append(", isAIRewriteLoading=");
        sbLIZ.append(this.isAIRewriteLoading);
        sbLIZ.append(", lastGenerateAIRewriting=");
        sbLIZ.append(this.lastGenerateAIRewriting);
        sbLIZ.append(", isCurUsedAIRewrite=");
        sbLIZ.append(this.isCurUsedAIRewrite);
        sbLIZ.append(", isLastUsedAIRewrite=");
        sbLIZ.append(this.isLastUsedAIRewrite);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RequestContent requestContent = this.lastAIRewriteRequestContent;
        if (requestContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            requestContent.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isAIRewriteLoading ? 1 : 0);
        Map<Integer, CachePoweredTexts> map = this.lastGenerateAIRewriting;
        parcel.writeInt(map.size());
        for (Map.Entry<Integer, CachePoweredTexts> entry : map.entrySet()) {
            parcel.writeInt(entry.getKey().intValue());
            entry.getValue().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isCurUsedAIRewrite ? 1 : 0);
        parcel.writeInt(this.isLastUsedAIRewrite ? 1 : 0);
    }

    public AIRewriteModel(RequestContent requestContent, boolean z, Map<Integer, CachePoweredTexts> map, boolean z2, boolean z3) {
        this.lastAIRewriteRequestContent = requestContent;
        this.isAIRewriteLoading = z;
        this.lastGenerateAIRewriting = map;
        this.isCurUsedAIRewrite = z2;
        this.isLastUsedAIRewrite = z3;
    }
}
