package com.ss.android.ugc.aweme.aigc.asynctask.models;

import X.C09CT;
import X.C09JG;
import X.C2188811AlT;
import X.C382320Eys;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PublicTaskInput extends C09JG {
    public final transient C382320Eys LIZ;

    @C09CT("childTaskOutPut")
    public final ChildTaskOutput childTaskOutPut;

    @C09CT("icon")
    public final String iconPath;

    @C09CT("name")
    public final String name;

    @C09CT("parentTaskInput")
    public final ParentTaskInput parentTaskInput;

    @C09CT("publicInputType")
    public PublicInputType publicInputType;

    @C09CT("source")
    public final Source source;

    /* JADX WARN: Multi-variable type inference failed */
    public PublicTaskInput() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicTaskInput)) {
            return false;
        }
        PublicTaskInput publicTaskInput = (PublicTaskInput) obj;
        return Intrinsics.LJFF(this.LIZ, publicTaskInput.LIZ) && this.source == publicTaskInput.source && Intrinsics.LJFF(this.name, publicTaskInput.name) && Intrinsics.LJFF(this.iconPath, publicTaskInput.iconPath) && this.publicInputType == publicTaskInput.publicInputType && Intrinsics.LJFF(this.childTaskOutPut, publicTaskInput.childTaskOutPut) && Intrinsics.LJFF(this.parentTaskInput, publicTaskInput.parentTaskInput);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Source source = this.source;
        int iHashCode2 = (((((iHashCode + (source == null ? 0 : source.hashCode())) * 31) + this.name.hashCode()) * 31) + this.iconPath.hashCode()) * 31;
        PublicInputType publicInputType = this.publicInputType;
        return ((((iHashCode2 + (publicInputType != null ? publicInputType.hashCode() : 0)) * 31) + this.childTaskOutPut.hashCode()) * 31) + this.parentTaskInput.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublicTaskInput(publicTaskInputContext=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", iconPath=");
        sbLIZ.append(this.iconPath);
        sbLIZ.append(", publicInputType=");
        sbLIZ.append(this.publicInputType);
        sbLIZ.append(", childTaskOutPut=");
        sbLIZ.append(this.childTaskOutPut);
        sbLIZ.append(", parentTaskInput=");
        sbLIZ.append(this.parentTaskInput);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PublicTaskInput(C382320Eys c382320Eys, Source source, String str, String str2, PublicInputType publicInputType, ChildTaskOutput childTaskOutput, ParentTaskInput parentTaskInput) {
        this.LIZ = c382320Eys;
        this.source = source;
        this.name = str;
        this.iconPath = str2;
        this.publicInputType = publicInputType;
        this.childTaskOutPut = childTaskOutput;
        this.parentTaskInput = parentTaskInput;
    }

    public /* synthetic */ PublicTaskInput(C382320Eys c382320Eys, Source source, String str, String str2, PublicInputType publicInputType, ChildTaskOutput childTaskOutput, ParentTaskInput parentTaskInput, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C382320Eys() : c382320Eys, (i & 2) != 0 ? null : source, (i & 4) != 0 ? "" : str, (i & 8) == 0 ? str2 : "", (i & 16) != 0 ? PublicInputType.NORMAL : publicInputType, (i & 32) != 0 ? new ChildTaskOutput(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null) : childTaskOutput, (i & 64) != 0 ? new ParentTaskInput(null, null) : parentTaskInput);
    }
}
