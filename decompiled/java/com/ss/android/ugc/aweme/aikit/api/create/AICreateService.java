package com.ss.android.ugc.aweme.aikit.api.create;

import X.C0LUH;
import X.C539960LFq;
import X.C546750LcP;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface AICreateService {
    String iw(C546750LcP c546750LcP);

    Object jw(String str, AIGCCreationModel aIGCCreationModel, C0LUH c0luh);

    Object kw(String str, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn);

    Object lw(String str, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends CreateState>> interfaceC1364105Vn);

    void mw(C539960LFq c539960LFq, AITheaterCreationModel aITheaterCreationModel);

    void nw(String str, AIGCCreationModel aIGCCreationModel);

    void z1(String str);
}
