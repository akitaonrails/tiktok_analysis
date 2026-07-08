package com.ss.android.ugc.aweme.aikit.api.create;

import X.AbstractC23140094w;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.mention.MentionCheckResult;
import com.ss.android.ugc.aweme.creative.model.mention.MentionResponse;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface MentionService {
    Object LIZ(List<MentionDataItem> list, InterfaceC1364105Vn<? super List<MentionDataItem>> interfaceC1364105Vn);

    boolean LIZIZ(String str);

    Object LIZJ(List<String> list, InterfaceC1364105Vn<? super MentionCheckResult> interfaceC1364105Vn);

    Object LIZLLL(int i, int i2, String str, List list, InterfaceC1364105Vn interfaceC1364105Vn);

    Object LJ(InterfaceC1364105Vn<? super List<MentionDataItem>> interfaceC1364105Vn);

    Object LJFF(int i, String str, String str2, String str3, AbstractC23140094w abstractC23140094w, boolean z);

    Object LJI(InterfaceC1364105Vn interfaceC1364105Vn);

    Object LJII(List<String> list, List<Long> list2, Boolean bool, InterfaceC1364105Vn<? super List<MentionDataItem>> interfaceC1364105Vn);

    Object LJIIIIZZ(InterfaceC1364105Vn<? super MentionResponse> interfaceC1364105Vn);
}
