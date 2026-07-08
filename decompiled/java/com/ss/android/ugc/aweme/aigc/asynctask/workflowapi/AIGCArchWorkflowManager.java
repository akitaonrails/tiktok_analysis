package com.ss.android.ugc.aweme.aigc.asynctask.workflowapi;

import X.C0LU9;
import X.C0LUH;
import X.C542800LQo;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.AIGCArchWorkflowInput;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface AIGCArchWorkflowManager {
    C542800LQo<Boolean> A1(String str);

    InterfaceC346201Wa<C0LU9> B1(String str, C0LUH c0luh);

    C542800LQo<String> C1(AIGCArchWorkflowInput aIGCArchWorkflowInput);

    Object D1(List<String> list, InterfaceC1364105Vn<? super C542800LQo<Boolean>> interfaceC1364105Vn);

    void z1(String str);
}
