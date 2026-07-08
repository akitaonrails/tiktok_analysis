package com.bytedance.byted_bach_sdk.input;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class BachMultiInput implements BachAlgorithmInput {
    public HashMap<String, BachAlgorithmInput> m_mapInput;

    @Override // com.bytedance.byted_bach_sdk.input.BachAlgorithmInput
    public int getInputType() {
        return 3;
    }

    @Override // com.bytedance.byted_bach_sdk.input.BachAlgorithmInput
    public HashMap getInput() {
        return this.m_mapInput;
    }

    public BachMultiInput(HashMap<String, BachAlgorithmInput> map) {
        this.m_mapInput = map;
    }
}
