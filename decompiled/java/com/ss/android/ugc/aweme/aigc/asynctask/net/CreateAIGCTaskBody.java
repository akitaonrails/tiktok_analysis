package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.InputContent;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class CreateAIGCTaskBody {

    @C09CT("algo_raw")
    public final AlgoRaw algoRaw;

    @C09CT("algo_type")
    public final int algoType;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("from_asset_id")
    public final String fromAssetId;

    @C09CT("from_asset_type")
    public final int fromAssetType;

    @C09CT("input_content_list")
    public final List<InputContent> inputContentList;

    @C09CT("style_conf")
    public final StyleConfig styleConfig;

    public CreateAIGCTaskBody() {
        this(0, null, null, null, 0, null, null, 127, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateAIGCTaskBody(fromAssetType=");
        sbLIZ.append(this.fromAssetType);
        sbLIZ.append(", fromAssetId=");
        sbLIZ.append(this.fromAssetId);
        sbLIZ.append(", inputContentList=");
        sbLIZ.append(this.inputContentList);
        sbLIZ.append(", algoRaw=");
        sbLIZ.append(this.algoRaw);
        sbLIZ.append(", algoType=");
        sbLIZ.append(this.algoType);
        sbLIZ.append(", styleConfig=");
        sbLIZ.append(this.styleConfig);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreateAIGCTaskBody(int i, String str, List<InputContent> list, AlgoRaw algoRaw, int i2, StyleConfig styleConfig, String str2) {
        this.fromAssetType = i;
        this.fromAssetId = str;
        this.inputContentList = list;
        this.algoRaw = algoRaw;
        this.algoType = i2;
        this.styleConfig = styleConfig;
        this.creationId = str2;
    }

    public CreateAIGCTaskBody(int i, String str, List list, AlgoRaw algoRaw, int i2, StyleConfig styleConfig, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 18 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? C13BV.INSTANCE : list, (i3 & 8) != 0 ? new AlgoRaw("", "", "") : algoRaw, (i3 & 16) != 0 ? 3 : i2, (i3 & 32) != 0 ? new StyleConfig(0L, 0) : styleConfig, (i3 & 64) == 0 ? str2 : "");
    }
}
