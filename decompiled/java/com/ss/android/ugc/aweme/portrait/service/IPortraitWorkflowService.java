package com.ss.android.ugc.aweme.portrait.service;

import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitResultItem;
import com.ss.android.ugc.aweme.portrait.model.GenerateFailedInfo;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public interface IPortraitWorkflowService {
    Object LIZ(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object LIZIZ(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object LIZJ(String str, InterfaceC1364105Vn<? super GenerateFailedInfo> interfaceC1364105Vn);

    Object LIZLLL(String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    Object LJ(AIPortraitModel aIPortraitModel, CreativeInfo creativeInfo, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    Object LJFF(String str, InterfaceC1364105Vn<? super List<AIPortraitResultItem>> interfaceC1364105Vn);

    Object LJI(String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);
}
