package com.ss.android.ugc.aweme.feed.landscape.component.profile;

import X.C1CSU;
import X.C20600215jE;
import X.C341910Dan;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;

/* JADX INFO: loaded from: classes32.dex */
public interface LandscapeProfileListApi {
    public static final C20600215jE LIZ = C20600215jE.LIZ;

    @InterfaceC1501160pAQ("/tiktok/feed/landscape/post")
    Object getLandscapeProfileList(@InterfaceC1501070pAH("sec_user_id") String str, @InterfaceC1501070pAH("current_id") String str2, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("forward_count") int i, @InterfaceC1501070pAH("reverse_count") int i2, @InterfaceC1501070pAH("type") int i3, @InterfaceC1501070pAH("fake_landscape_type_list") String str3, @InterfaceC1501070pAH("sort_type") Integer num, InterfaceC1364105Vn<? super ComposePbAndJson<C1CSU, C341910Dan>> interfaceC1364105Vn);
}
