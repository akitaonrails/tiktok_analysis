package com.ss.android.ugc.aweme.theater.model;

import X.C09CT;
import X.C2188811AlT;
import X.C546900Lce;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.r;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSessionModel;
import com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterSessionModel;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterCreationModel implements AIGCCreationModel, Parcelable {

    @C09CT("generation_model")
    public final AITheaterGenerationModel generationModel;

    @C09CT("session_model")
    public final AITheaterSessionModel sessionModel;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<AITheaterCreationModel> CREATOR = new Parcelable.Creator<AITheaterCreationModel>() { // from class: X.0Leh
        @Override // android.os.Parcelable.Creator
        public final AITheaterCreationModel createFromParcel(Parcel parcel) {
            return new AITheaterCreationModel(AITheaterSessionModel.CREATOR.createFromParcel(parcel), (AITheaterGenerationModel) parcel.readParcelable(AITheaterCreationModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AITheaterCreationModel[] newArray(int i) {
            return new AITheaterCreationModel[i];
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public AITheaterCreationModel() {
        this(new AITheaterSessionModel(null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0), new WritableAITheaterGenerationModel(null, null, null, null, null, null, null, null, null, null, null, 0, 0L, 0L, null, null, 0L, 0, null, null, null, null, 4194303, null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITheaterCreationModel)) {
            return false;
        }
        AITheaterCreationModel aITheaterCreationModel = (AITheaterCreationModel) obj;
        return Intrinsics.LJFF(this.sessionModel, aITheaterCreationModel.sessionModel) && Intrinsics.LJFF(this.generationModel, aITheaterCreationModel.generationModel);
    }

    public final int hashCode() {
        return (this.sessionModel.hashCode() * 31) + this.generationModel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterCreationModel(sessionModel=");
        sbLIZ.append(this.sessionModel);
        sbLIZ.append(", generationModel=");
        sbLIZ.append(this.generationModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.sessionModel.writeToParcel(parcel, i);
        parcel.writeParcelable(this.generationModel, i);
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel
    public final /* bridge */ /* synthetic */ AIGCSessionModel SN() {
        return this.sessionModel;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel
    public final /* bridge */ /* synthetic */ AIGCGenerationModel ZG() {
        return this.generationModel;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel
    public final <T> T kx(Function1<? super WritableAIGCGenerationModel, ? extends T> function1) {
        return (T) C546900Lce.LIZ(this, function1);
    }

    public AITheaterCreationModel(AITheaterSessionModel aITheaterSessionModel, AITheaterGenerationModel aITheaterGenerationModel) {
        this.sessionModel = aITheaterSessionModel;
        this.generationModel = aITheaterGenerationModel;
    }

    public static final class Companion {

        /* JADX INFO: loaded from: classes35.dex */
        public static final class AITheaterGenerationModelDeserializer implements j<AITheaterGenerationModel> {
            /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel, java.lang.Object] */
            @Override // com.google.gson.j
            public final AITheaterGenerationModel deserialize(k kVar, Type type, i iVar) {
                if (iVar == null) {
                    return null;
                }
                return ((TreeTypeAdapter.a) iVar).LIZ(kVar, WritableAITheaterGenerationModel.class);
            }
        }

        /* JADX INFO: loaded from: classes35.dex */
        public static final class AITheaterGenerationModelSerializer implements r<AITheaterGenerationModel> {
            @Override // com.google.gson.r
            public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
                AITheaterGenerationModel aITheaterGenerationModel = (AITheaterGenerationModel) obj;
                if (!(aITheaterGenerationModel instanceof WritableAITheaterGenerationModel)) {
                    aITheaterGenerationModel = null;
                }
                if (aVar == null) {
                    return null;
                }
                return aVar.LIZIZ(aITheaterGenerationModel);
            }
        }
    }
}
