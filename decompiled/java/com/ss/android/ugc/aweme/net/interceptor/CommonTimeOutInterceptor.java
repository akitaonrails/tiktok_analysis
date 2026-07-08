package com.ss.android.ugc.aweme.net.interceptor;

import X.C01GW;
import X.C0X52;
import X.C1493620oyG;
import X.C1494160oz8;
import X.C1494590ozp;
import X.EnumC325100Com;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.experiment.CommentNetTimeOutExperiment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.net.experiment.EcomNetTimeOutExperiment;
import com.ss.android.ugc.aweme.net.experiment.NetTimeOutExperiment;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class CommonTimeOutInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494160oz8 c1494160oz8;
        String path;
        C1494160oz8 c1494160oz82;
        C1494160oz8 c1494160oz83;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        NetTimeOutExperiment.NetTimeOutConfig netTimeOutConfig = NetTimeOutExperiment.LIZ;
        EnumC325100Com networkStatus = null;
        if (netTimeOutConfig.pathList.contains(request.getPath())) {
            Object extraInfo = request.getExtraInfo();
            if (extraInfo == null) {
                extraInfo = new C1493620oyG();
                request.setExtraInfo(extraInfo);
            }
            if ((extraInfo instanceof C1494160oz8) && (c1494160oz83 = (C1494160oz8) extraInfo) != null) {
                c1494160oz83.LJIIIIZZ = netTimeOutConfig.protectLimit;
                c1494160oz83.LJFF = netTimeOutConfig.connectLimit;
                c1494160oz83.LJII = netTimeOutConfig.readLimit;
                c1494160oz83.LJI = netTimeOutConfig.writeLimit;
            }
        }
        C01GW c01gw = EcomNetTimeOutExperiment.LIZIZ;
        if (((EcomNetTimeOutExperiment.EcomNetTimeoutConfigModel[]) c01gw.getValue()).length != 0 && (path = request.getPath()) != null) {
            EcomNetTimeOutExperiment.EcomNetTimeoutConfigModel[] ecomNetTimeoutConfigModelArr = (EcomNetTimeOutExperiment.EcomNetTimeoutConfigModel[]) c01gw.getValue();
            int length = ecomNetTimeoutConfigModelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                EcomNetTimeOutExperiment.EcomNetTimeoutConfigModel ecomNetTimeoutConfigModel = ecomNetTimeoutConfigModelArr[i];
                if (ecomNetTimeoutConfigModel.pathSet.contains(path)) {
                    Object extraInfo2 = request.getExtraInfo();
                    if (extraInfo2 == null) {
                        extraInfo2 = new C1493620oyG();
                        request.setExtraInfo(extraInfo2);
                    }
                    if ((extraInfo2 instanceof C1494160oz8) && (c1494160oz82 = (C1494160oz8) extraInfo2) != null) {
                        c1494160oz82.LJIIIIZZ = ecomNetTimeoutConfigModel.protectLimit;
                        c1494160oz82.LJFF = ecomNetTimeoutConfigModel.connectLimit;
                        c1494160oz82.LJII = ecomNetTimeoutConfigModel.readLimit;
                        c1494160oz82.LJI = ecomNetTimeoutConfigModel.writeLimit;
                    }
                } else {
                    i++;
                }
            }
        }
        CommentNetTimeOutExperiment commentNetTimeOutExperiment = CommentNetTimeOutExperiment.LIZ;
        String path2 = request.getPath();
        commentNetTimeOutExperiment.getClass();
        if (Intrinsics.LJFF("/aweme/v2/comment/list/", path2) && CommentNetTimeOutExperiment.LIZIZ.enable) {
            INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
            if (iNetworkStateService != null) {
                networkStatus = iNetworkStateService.getNetworkStatus();
            }
            if (networkStatus == EnumC325100Com.STRONG) {
                CommentNetTimeOutExperiment.NetTimeOutConfig netTimeOutConfig2 = CommentNetTimeOutExperiment.LIZIZ;
                Object extraInfo3 = request.getExtraInfo();
                if (extraInfo3 == null) {
                    extraInfo3 = new C1493620oyG();
                    request.setExtraInfo(extraInfo3);
                }
                if ((extraInfo3 instanceof C1494160oz8) && (c1494160oz8 = (C1494160oz8) extraInfo3) != null) {
                    c1494160oz8.LJIIIIZZ = netTimeOutConfig2.protectLimit;
                    c1494160oz8.LJFF = netTimeOutConfig2.connectLimit;
                    c1494160oz8.LJII = netTimeOutConfig2.readLimit;
                    c1494160oz8.LJI = netTimeOutConfig2.writeLimit;
                }
            }
        }
        return c1494590ozp.LIZ(request);
    }
}
