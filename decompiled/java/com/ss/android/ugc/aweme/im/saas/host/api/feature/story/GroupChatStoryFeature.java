package com.ss.android.ugc.aweme.im.saas.host.api.feature.story;

import X.C06QT;
import X.C0ZPB;
import X.C19EG;
import X.EnumC1606080rte;
import X.EnumC1615506Uf;
import X.InterfaceC1364105Vn;
import X.InterfaceC2135708Yh;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.annotation.Feature;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Feature(id = "group_chat_story", name = "Group Chat Story", parents = {StoryFeature.class})
public interface GroupChatStoryFeature {
    public static final C06QT LIZ = C06QT.LIZ;

    InterfaceC2135708Yh LIZIZ(LifecycleOwner lifecycleOwner);

    C0ZPB LIZJ(C19EG c19eg, LifecycleOwner lifecycleOwner, EnumC1615506Uf enumC1615506Uf, EnumC1606080rte enumC1606080rte, String str);

    Object LIZLLL(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn);

    void LJ(SmartRoute smartRoute, boolean z);
}
