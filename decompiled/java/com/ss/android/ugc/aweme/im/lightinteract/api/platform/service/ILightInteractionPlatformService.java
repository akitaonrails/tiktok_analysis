package com.ss.android.ugc.aweme.im.lightinteract.api.platform.service;

import X.C0YTK;
import X.C0Z9J;
import X.C0Z9X;
import X.C0Z9Y;
import X.C0ZEG;
import X.C869590Y9l;
import X.InterfaceC1357440lQc;
import X.InterfaceC1364105Vn;
import X.InterfaceC1513605wE;
import X.InterfaceC1513805wG;
import X.InterfaceC1707406mO;
import X.InterfaceC894800Z8k;
import X.InterfaceC894810Z8l;
import X.InterfaceC896150ZDp;
import X.InterfaceC912670ZrF;
import X.InterfaceC913290ZsF;
import android.content.Context;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.strategybridge.LightInteractionMetaData;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.LightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes15.dex */
public interface ILightInteractionPlatformService extends C0Z9Y, InterfaceC1513805wG, InterfaceC913290ZsF, C0Z9J, C0ZEG, InterfaceC912670ZrF, C0Z9X, InterfaceC894810Z8l, InterfaceC894800Z8k, InterfaceC1513605wE, InterfaceC896150ZDp, InterfaceC1357440lQc {
    InterfaceC1707406mO LJ();

    String LJI(C869590Y9l c869590Y9l);

    void LJIILLIIL(Context context);

    boolean LJIJJLI();

    long LJJIIJ(User user);

    LightInteractionCommonResource LJJIIZI(String str);

    Pair<LightInteractionEntryConf, Integer> LJJIJIIJI(LightInteractionMetaData lightInteractionMetaData, InterfaceC1707406mO interfaceC1707406mO);

    boolean LJJJJJL(C869590Y9l c869590Y9l);

    LightInteractionCommonResource LJJJLZIJ(C869590Y9l c869590Y9l);

    Object LJJLI(String str, String str2, String str3, Map<String, String> map, ReferenceInfo referenceInfo, AttachmentComponent attachmentComponent, Serializable serializable, Integer num, C0YTK c0ytk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LJJLIIIJILLIZJL(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, ReferenceInfo referenceInfo, AttachmentComponent attachmentComponent, Serializable serializable, Integer num, C0YTK c0ytk, BaseHeaderComponent baseHeaderComponent);

    void LJJLIIJ(long j, String str);

    long LJJLIL(String str);

    String LJJLJLI(Long l, Long l2);
}
