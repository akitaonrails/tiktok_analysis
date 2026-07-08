package com.ss.android.ml.process.bl;

import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class MLConfigModel {
    public String bytenn_forward_type;
    public boolean enable_gpu;
    public boolean enable_nn_api;
    public List<String> feature_list;
    public List<PreOPModel> input;
    public String input_type;
    public List<PreOPModel> intput;
    public String model_type;
    public NormalizeConfig normalize_config;
    public int num_threads;
    public AfOPModel output;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MLConfigModel{model_type='");
        sbLIZ.append(this.model_type);
        sbLIZ.append('\'');
        sbLIZ.append(", input_type='");
        sbLIZ.append(this.input_type);
        sbLIZ.append('\'');
        sbLIZ.append(", intput=");
        sbLIZ.append(this.intput);
        sbLIZ.append(", input=");
        sbLIZ.append(this.input);
        sbLIZ.append(", output=");
        sbLIZ.append(this.output);
        sbLIZ.append(", normalize_config=");
        sbLIZ.append(this.normalize_config);
        sbLIZ.append(", feature_list=");
        sbLIZ.append(this.feature_list);
        sbLIZ.append(", enable_nn_api=");
        sbLIZ.append(this.enable_nn_api);
        sbLIZ.append(", enable_gpu=");
        sbLIZ.append(this.enable_gpu);
        sbLIZ.append(", bytenn_forward_type=");
        sbLIZ.append(this.bytenn_forward_type);
        sbLIZ.append(", num_threads=");
        sbLIZ.append(this.num_threads);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
