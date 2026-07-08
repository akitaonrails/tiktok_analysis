package com.ss.android.ugc.airemix.model;

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
import com.ss.android.ugc.airemix.model.AIRemixCreationModel;
import com.ss.android.ugc.airemix.model.AIRemixGenerationModel;
import com.ss.android.ugc.airemix.model.AIRemixSessionModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSessionModel;
import com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel;
import java.lang.reflect.Type;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixCreationModel implements AIGCCreationModel, Parcelable {

    @C09CT("generation_model")
    public final AIRemixGenerationModel generationModel;

    @C09CT("session_model")
    public final AIRemixSessionModel sessionModel;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<AIRemixCreationModel> CREATOR = new Parcelable.Creator<AIRemixCreationModel>() { // from class: X.0Lek
        @Override // android.os.Parcelable.Creator
        public final AIRemixCreationModel createFromParcel(Parcel parcel) {
            return new AIRemixCreationModel(AIRemixSessionModel.CREATOR.createFromParcel(parcel), (AIRemixGenerationModel) parcel.readParcelable(AIRemixCreationModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AIRemixCreationModel[] newArray(int i) {
            return new AIRemixCreationModel[i];
        }
    };

    public AIRemixCreationModel() {
        this(new AIRemixSessionModel(UUID.randomUUID().toString(), "", 0, ""), new WritableAIRemixGenerationModel(null, null, null, null, null, null, null, null, null, null, null, 0, 0L, 0L, null, null, 0L, 0, null, null, null, null, 4194303, null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixCreationModel)) {
            return false;
        }
        AIRemixCreationModel aIRemixCreationModel = (AIRemixCreationModel) obj;
        return Intrinsics.LJFF(this.sessionModel, aIRemixCreationModel.sessionModel) && Intrinsics.LJFF(this.generationModel, aIRemixCreationModel.generationModel);
    }

    public final int hashCode() {
        return (this.sessionModel.hashCode() * 31) + this.generationModel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixCreationModel(sessionModel=");
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

    public AIRemixCreationModel(AIRemixSessionModel aIRemixSessionModel, AIRemixGenerationModel aIRemixGenerationModel) {
        this.sessionModel = aIRemixSessionModel;
        this.generationModel = aIRemixGenerationModel;
    }

    public static final class Companion {

        /* JADX INFO: loaded from: classes35.dex */
        public static final class AIRemixGenerationModelDeserializer implements j<AIRemixGenerationModel> {
            /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.airemix.model.AIRemixGenerationModel, java.lang.Object] */
            @Override // com.google.gson.j
            public final AIRemixGenerationModel deserialize(k kVar, Type type, i iVar) {
                if (iVar == null) {
                    return null;
                }
                return ((TreeTypeAdapter.a) iVar).LIZ(kVar, WritableAIRemixGenerationModel.class);
            }
        }

        /* JADX INFO: loaded from: classes35.dex */
        public static final class AIRemixGenerationModelSerializer implements r<AIRemixGenerationModel> {
            @Override // com.google.gson.r
            public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
                AIRemixGenerationModel aIRemixGenerationModel = (AIRemixGenerationModel) obj;
                if (!(aIRemixGenerationModel instanceof WritableAIRemixGenerationModel)) {
                    aIRemixGenerationModel = null;
                }
                if (aVar == null) {
                    return null;
                }
                return aVar.LIZIZ(aIRemixGenerationModel);
            }
        }
    }
}
