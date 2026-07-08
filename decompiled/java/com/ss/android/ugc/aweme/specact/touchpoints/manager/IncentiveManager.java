package com.ss.android.ugc.aweme.specact.touchpoints.manager;

import X.AbstractC1896090zRP;
import X.C01GW;
import X.C01U6;
import X.C0BIS;
import X.C1009500cNQ;
import X.C1619720sFe;
import X.C1619750sFh;
import X.C1849780yEi;
import X.C1879340z0O;
import X.C1893370zN1;
import X.C1895250zQ3;
import X.C1895370zQF;
import X.C1895800zQw;
import X.C1896290zRj;
import X.C1896300zRk;
import X.C1896510zS5;
import X.C1896890zSh;
import X.C1897000zSs;
import X.C1897570zTn;
import X.C1897650zTv;
import X.C1897700zU0;
import X.C1897720zU2;
import X.C1897770zU7;
import X.C1898590zVR;
import X.C1898650zVX;
import X.C1908480zlO;
import X.C19207010Ce;
import X.C20554315bp;
import X.C274800Apq;
import X.C305700Bya;
import X.C622680Oba;
import X.C718220SFg;
import X.EnumC1895270zQ5;
import X.EnumC20654715s1;
import X.InterfaceC1273504yb;
import X.InterfaceC1897260zTI;
import X.InterfaceC2210981Bg8;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS128S0100000_28;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hox.Hox;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.touchpoint.api.config.IIncentiveManager;
import com.bytedance.touchpoint.api.interfaces.IConfigService;
import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.BottomTabBubble;
import com.bytedance.touchpoint.api.model.Button;
import com.bytedance.touchpoint.api.model.Content;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import com.bytedance.touchpoint.api.model.InAppPush;
import com.bytedance.touchpoint.api.model.NormalPendant;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.bytedance.touchpoint.core.pendant.ad.AdFeedTimerPendantManager;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.bytedance.touchpoint.data.datasource.bytesync.ByteSyncEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.app.IAwemeApplicationService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.guide.publish.IProGuidePublishService;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.settings.SparkWebViewOptimizeExperiment;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.specact.touchpoints.rules.PendantRule$getPendantHandGesture$1;
import com.ss.android.ugc.aweme.spi.HomePageCommonService;
import com.ss.android.ugc.aweme.tablet.api.IDeviceCapability;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.PitayaUtils$initAntiCheatListener$1;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS112S1000000_28;
import kotlin.jvm.internal.AwS143S1200000_28;
import kotlin.jvm.internal.AwS144S0110000_28;
import kotlin.jvm.internal.AwS177S1100000_28;
import kotlin.jvm.internal.AwS404S0200000_3;
import kotlin.jvm.internal.AwS41S1400000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS60S0500000_27;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.AwS90S1300000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class IncentiveManager implements IIncentiveManager {
    public C1897650zTv LIZ = new InterfaceC2210981Bg8() { // from class: X.0zTv
        @Override // X.InterfaceC2210981Bg8
        public final void LIZ(boolean z) {
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZJ(boolean z) {
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZIZ(String str, String str2) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS128S0100000_28(this.LL, 54));
        }
    };

    @Override // com.bytedance.touchpoint.api.config.IIncentiveManager
    public final void LIZ() {
        C1895370zQF.LIZ.getClass();
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(457));
        C1897000zSs c1897000zSs = C1897000zSs.LIZ;
        if (((Boolean) C274800Apq.LIZ.getValue()).booleanValue()) {
            C622680Oba.LIZLLL(c1897000zSs);
        }
        C1897000zSs.LIZIZ = false;
        C1897000zSs.LIZLLL.clear();
        C1897000zSs.LJ.clear();
    }

    @Override // com.bytedance.touchpoint.api.config.IIncentiveManager
    public final void LIZIZ() {
        C01U6.LIZIZ(AFwS195S0000000_9.get$arr$(311));
    }

    @Override // com.bytedance.touchpoint.api.config.IIncentiveManager
    public final void LIZLLL() {
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        c1619720sFe.getClass();
        AtomicBoolean atomicBoolean = C1619720sFe.LJ;
        if (atomicBoolean.get()) {
            return;
        }
        InterfaceC1897260zTI interfaceC1897260zTI = new InterfaceC1897260zTI() { // from class: X.0zXn
            @Override // X.InterfaceC1897260zTI
            public final INetworkApi LIZJ() {
                return (INetworkApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ).build().retrofit.LIZ(INetworkApi.class);
            }

            @Override // X.InterfaceC1897260zTI
            public final void LIZ(String str, Map<String, String> map) {
                C20684815ws.LJIILLIIL(str, map);
            }

            @Override // X.InterfaceC1897260zTI
            public final void LIZIZ(String str, JSONObject jSONObject) {
                C01U6.LIZIZ(new C1900060zXo(str, jSONObject));
            }

            @Override // X.InterfaceC1897260zTI
            public final void LJ(String str, InterfaceC2281081EQg interfaceC2281081EQg) {
                C01U6.LIZIZ(new AwS177S1100000_28(str, interfaceC2281081EQg, 7));
            }

            @Override // X.InterfaceC1897260zTI
            public final void LJFF(boolean z, Map map) {
                Object obj;
                if (z) {
                    C1908480zlO.LIZIZ.LJIIL(true, false);
                    return;
                }
                if (map != null) {
                    obj = ((LinkedHashMap) map).get("isManual");
                } else {
                    obj = null;
                }
                C1908480zlO.LIZIZ.LJIIL(false, Intrinsics.LJFF(obj, "true"));
            }

            @Override // X.InterfaceC1897260zTI
            public final void LJII(String str, ImageView imageView, InterfaceC1910160zo6 interfaceC1910160zo6) {
                C01U6.LIZIZ(new AwS143S1200000_28(str, imageView, interfaceC1910160zo6, 2));
            }

            @Override // X.InterfaceC1897260zTI
            public final void LIZLLL(C0VSJ c0vsj, ImageView imageView, String str, InterfaceC1910160zo6 interfaceC1910160zo6) {
                C01U6.LIZIZ(new AwS90S1300000_28(c0vsj, imageView, str, interfaceC1910160zo6, 1));
            }

            @Override // X.InterfaceC1897260zTI
            public final void LJI(Uri uri, Activity activity, Bitmap.Config config, C1897950zUP c1897950zUP) {
                C01U6.LIZIZ(new AwS41S1400000_28(uri, activity, config, c1897950zUP, 0));
            }

            @Override // X.InterfaceC1897260zTI
            public final void LJIIIIZZ(int i, C1B8G c1b8g, String str, String str2, String str3, String str4, boolean z) {
                C01U6.LIZIZ(new C1912260zrU(i, c1b8g, str, str2, str3, str4, z));
            }
        };
        if (((Boolean) C1619720sFe.LIZLLL.getValue()).booleanValue()) {
            synchronized (c1619720sFe) {
                try {
                    atomicBoolean.set(true);
                    C1619720sFe.LIZIZ = interfaceC1897260zTI;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            atomicBoolean.set(true);
            C1619720sFe.LIZIZ = interfaceC1897260zTI;
        }
        IConfigService iConfigService = (IConfigService) PluggableExtentionKt.pluggableSpi$default(IConfigService.class, false, false, false, 14, null);
        if (iConfigService != null) {
            iConfigService.LJ();
        }
        HashMap<Integer, C1879340z0O> map = new HashMap<>();
        map.put(0, new AbstractC1896090zRP() { // from class: X.0zeB
            @Override // X.AbstractC1896090zRP
            public final void LJFF() {
            }

            @Override // X.AbstractC1896090zRP
            public final void LJI() {
            }

            @Override // X.AbstractC1896090zRP
            public final void LJII() {
            }

            @Override // X.AbstractC1896090zRP
            public final List<Integer> LJIJ() {
                return C1697810uHb.LJIIJJI(8, 12, 17, 27, 32, 33);
            }

            @Override // X.AbstractC1896090zRP
            public final void LJJJ() {
            }

            @Override // X.AbstractC1896090zRP
            public final int LIZLLL() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LJIIJ;
            }

            @Override // X.AbstractC1896090zRP
            public final Context LJIIJJI() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LIZ();
            }

            @Override // X.AbstractC1896090zRP
            public final long LJIIZILJ() {
                return ((Keva) C1896790zSX.LIZ.getValue()).getLong("key_first_launch_time", 0L);
            }

            @Override // X.AbstractC1896090zRP
            public final String LJIJI() {
                C1618290sDL.LIZ.getClass();
                return C1618290sDL.LIZ();
            }

            @Override // X.AbstractC1896090zRP
            public final int LJIL() {
                return ((Keva) C1906000zhO.LIZIZ.getValue().LIZ.getValue()).getBoolean("use_local_time", false) ? (int) (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) : C0XK4.LIZ();
            }

            @Override // X.AbstractC1896090zRP
            public final long LJJ() {
                return ((Keva) C1906000zhO.LIZIZ.getValue().LIZ.getValue()).getBoolean("use_local_time", false) ? System.currentTimeMillis() : NetworkUtils.getServerTimeMills();
            }

            @Override // X.AbstractC1896090zRP
            public final int LJJIFFI() {
                HomePageCommonService homePageCommonService = (HomePageCommonService) PluggableExtentionKt.pluggableSpi$default(HomePageCommonService.class, false, false, false, 14, null);
                if (homePageCommonService != null) {
                    return homePageCommonService.LIZ();
                }
                return 0;
            }

            @Override // X.AbstractC1896090zRP
            public final boolean LJJIIJZLJL() {
                IAwemeApplicationService iAwemeApplicationService = (IAwemeApplicationService) PluggableExtentionKt.pluggableSpi$default(IAwemeApplicationService.class, false, false, false, 14, null);
                if (iAwemeApplicationService != null) {
                    return iAwemeApplicationService.isAppHot();
                }
                return false;
            }

            @Override // X.AbstractC1896090zRP
            public final boolean LJJIJIIJI() {
                C1618290sDL.LIZ.getClass();
                Object objLIZIZ = C1618290sDL.LIZIZ();
                if (objLIZIZ instanceof InterfaceC1603190roz) {
                    return ((InterfaceC1603190roz) objLIZIZ).getCurFragment() instanceof InterfaceC1593630rZZ;
                }
                return false;
            }

            @Override // X.AbstractC1896090zRP
            public final void LJJIJIIJIL() {
                C1618290sDL.LIZ.getClass();
            }

            @Override // X.AbstractC1896090zRP
            public final void LJJIZ() {
                C596970NbD.LIZIZ.LIZ(EnumC1733330vCt.TOUCH_POINT_SYNC, new InterfaceC596980NbE() { // from class: X.0zOb
                    @Override // X.InterfaceC596980NbE
                    public final void LJ(C1525630pnt c1525630pnt) {
                        String string;
                        boolean zLJJIFFI;
                        int iIntValue;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("touch point onDataUpdate..");
                        byte[] bArr = c1525630pnt.LIZ;
                        if (bArr != null) {
                            string = bArr.toString();
                        } else {
                            string = null;
                        }
                        sbLIZ.append(string);
                        C2188811AlT.LIZIZ(sbLIZ);
                        StringBuilder sb = new StringBuilder("receive");
                        boolean zBooleanValue = ((Boolean) C0A40.LIZ.getValue()).booleanValue();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("enable byte sync:");
                        boolean z = !zBooleanValue;
                        sbLIZ2.append(z);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(',');
                        sbLIZ3.append(z);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                        if (zBooleanValue) {
                            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                            String string2 = sb.toString();
                            c1894320zOY.getClass();
                            C1894320zOY.LJ(string2);
                            return;
                        }
                        byte[] bArr2 = c1525630pnt.LIZ;
                        if (bArr2 != null) {
                            try {
                                boolean z2 = false;
                                ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                                boolean z3 = false;
                                if (iTouchPointModuleService != null) {
                                    zLJJIFFI = iTouchPointModuleService.LJJIFFI();
                                } else {
                                    zLJJIFFI = false;
                                }
                                ByteSyncEvent byteSyncEvent = (ByteSyncEvent) C20484080s.LIZ(new String(bArr2, Charsets.UTF_8), ByteSyncEvent.class);
                                C1894320zOY c1894320zOY2 = C1894320zOY.LIZ;
                                if (!zLJJIFFI) {
                                    z2 = true;
                                }
                                c1894320zOY2.getClass();
                                C01U6.LIZJ(new AwS144S0110000_28(byteSyncEvent, z2, 5));
                                if (zLJJIFFI) {
                                    sb.append(",appForeground");
                                    if (byteSyncEvent != null) {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append(',');
                                        sbLIZ4.append(byteSyncEvent);
                                        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
                                        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                                        Integer num = byteSyncEvent.expireTimeStamp;
                                        if (num == null || (iIntValue = num.intValue()) == 0 || jCurrentTimeMillis < iIntValue) {
                                            z3 = true;
                                        }
                                        Integer num2 = byteSyncEvent.actionType;
                                        if (num2 != null) {
                                            if (num2.intValue() == 1 && z3) {
                                                sb.append(",meet condition");
                                                IIncentiveManager iIncentiveManager = (IIncentiveManager) PluggableExtentionKt.pluggableSpi$default(IIncentiveManager.class, false, false, false, 14, null);
                                                if (iIncentiveManager != null) {
                                                    iIncentiveManager.LJ(EnumC1895270zQ5.TYPE_BYTESYNC);
                                                }
                                                C1894320zOY.LJ(sb.toString());
                                                return;
                                            }
                                            if (num2.intValue() == 2 && z3) {
                                                sb.append(",meet condition");
                                                List<TouchPoint> list = byteSyncEvent.touchPoints;
                                                if (list != null) {
                                                    ARunnableS128S0100000_28 aRunnableS128S0100000_28 = new ARunnableS128S0100000_28(list, 73);
                                                    if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                                                        aRunnableS128S0100000_28.run();
                                                    } else {
                                                        C1701940uOG.LIZIZ().LIZIZ(new ARunnableS103S0100000_3((Object) aRunnableS128S0100000_28, 9));
                                                    }
                                                }
                                                C1894320zOY.LJ(sb.toString());
                                                return;
                                            }
                                            if (num2.intValue() == 3 && z3) {
                                                sb.append(",meet condition");
                                                String str = byteSyncEvent.deepLink;
                                                if (str != null) {
                                                    C1893790zNh c1893790zNh = C1893790zNh.LIZ;
                                                    C1893840zNm c1893840zNm = new C1893840zNm();
                                                    c1893790zNh.getClass();
                                                    C1893790zNh.LJIIL(str, c1893840zNm);
                                                }
                                                C1894320zOY.LJ(sb.toString());
                                                return;
                                            }
                                        }
                                        sb.append(",not meet condition");
                                        C1894320zOY.LJ(sb.toString());
                                        return;
                                    }
                                    sb.append(",event null");
                                    C1894320zOY.LJ(sb.toString());
                                    return;
                                }
                                sb.append(",appBackground");
                                C1894320zOY.LJ(sb.toString());
                                C1894360zOc.LIZ.getClass();
                                C1894360zOc.LIZIZ = true;
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                sb.append(",exception");
                                C1894320zOY c1894320zOY3 = C1894320zOY.LIZ;
                                String string3 = sb.toString();
                                c1894320zOY3.getClass();
                                C1894320zOY.LJ(string3);
                            }
                        }
                    }
                });
            }

            @Override // X.AbstractC1896090zRP
            public final C19EG LJIIIIZZ() {
                C089E c089e = new C089E(ActivityStack.getActivityStack());
                while (c089e.hasNext()) {
                    Activity activity = (Activity) c089e.next();
                    if (activity instanceof InterfaceC1603190roz) {
                        if (activity instanceof C19EG) {
                            return (C19EG) activity;
                        }
                        return null;
                    }
                }
                return null;
            }

            @Override // X.AbstractC1896090zRP
            public final Activity LJIIIZ() {
                AbstractC1387200mCc abstractC1387200mCcLIZLLL = C1906580ziK.LIZLLL();
                Activity activityLIZIZ = abstractC1387200mCcLIZLLL != null ? abstractC1387200mCcLIZLLL.LIZIZ() : null;
                if (activityLIZIZ instanceof Activity) {
                    return activityLIZIZ;
                }
                return null;
            }

            @Override // X.AbstractC1896090zRP
            public final String LJIILJJIL() {
                return C2222691Bz1.LJ();
            }

            @Override // X.AbstractC1896090zRP
            public final Activity LJIILL() {
                return C2214201BlK.LJFF();
            }

            @Override // X.AbstractC1896090zRP
            public final String LJIILLIIL() {
                return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            }

            @Override // X.AbstractC1896090zRP
            public final String LJIJJ() {
                return C2222691Bz1.LIZ().toLowerCase(Locale.ROOT);
            }

            @Override // X.AbstractC1896090zRP
            public final String LJJI() {
                return C20301014c4.LIZIZ();
            }

            @Override // X.AbstractC1896090zRP
            public final String LJJII() {
                return C0XQ7.LJFF().getCurUserId();
            }

            @Override // X.AbstractC1896090zRP
            public final double LJJIII() {
                return C2179771ASp.LJIIIIZZ();
            }

            @Override // X.AbstractC1896090zRP
            public final boolean LJJIIJ() {
                C19EG c19eg;
                MainActivityScope mainActivityScopeLIZJ;
                HomeTabAbility homeTabAbilityLIZ;
                List listL32;
                Activity activityLIZ = C2421209eE.LIZ();
                if (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null || (listL32 = homeTabAbilityLIZ.l32()) == null) {
                    return false;
                }
                Iterator it2 = listL32.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (Intrinsics.LJFF(((InterfaceC1583870rJp) next).tag(), "Drama")) {
                        return next != null;
                    }
                }
                return false;
            }

            @Override // X.AbstractC1896090zRP
            public final boolean LJJIIZ() {
                return Intrinsics.LJFF(((FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class)).LJI(), "auto");
            }

            @Override // X.AbstractC1896090zRP
            public final boolean LJJIJ() {
                return C10EU.LJIILIIL();
            }

            @Override // X.AbstractC1896090zRP
            public final boolean LJJIJIL() {
                return C0XQ7.LJFF().isLogin();
            }

            @Override // X.AbstractC1896090zRP
            public final void LJ(View view) {
                Integer numValueOf;
                C1A5L c1a5l;
                if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
                    if (numValueOf.intValue() == R.id.q8b) {
                        c1a5l = (C1A5L) C2271381DvM.LLLJL.getValue();
                    } else if (numValueOf.intValue() == R.id.xy1) {
                        c1a5l = (C1A5L) C2271381DvM.LLLLIILL.getValue();
                    } else if (numValueOf.intValue() == R.id.yge) {
                        c1a5l = (C1A5L) C2271381DvM.LLLL.getValue();
                    } else if (numValueOf.intValue() == R.id.ygg) {
                        c1a5l = (C1A5L) C2271381DvM.LLLLII.getValue();
                    } else if (numValueOf.intValue() == R.id.ygc) {
                        c1a5l = (C1A5L) C2271381DvM.LLLLIIIILLL.getValue();
                    } else if (numValueOf.intValue() == R.id.ygp) {
                        c1a5l = (C1A5L) C2271381DvM.LLLLIIL.getValue();
                    } else if (numValueOf.intValue() == R.id.nq3) {
                        c1a5l = (C1A5L) C2271381DvM.LLLLIL.getValue();
                    } else if (numValueOf.intValue() == R.id.uy5) {
                        c1a5l = (C1A5L) C2271381DvM.LLLLILI.getValue();
                    } else if (numValueOf.intValue() == R.id.crt) {
                        c1a5l = (C1A5L) C2271381DvM.LLLLJ.getValue();
                    } else if (numValueOf.intValue() == R.id.csh) {
                        c1a5l = (C1A5L) C2271381DvM.LLLLJI.getValue();
                    } else if (numValueOf.intValue() == R.id.vtc) {
                        c1a5l = (C1A5L) C2271381DvM.LLLLL.getValue();
                    } else if (numValueOf.intValue() == R.id.vtd) {
                        c1a5l = (C1A5L) C2271381DvM.LLLLLIL.getValue();
                    } else if (numValueOf.intValue() == R.id.ygo) {
                        c1a5l = C2271381DvM.LLLLLJLJLL;
                    } else if (numValueOf.intValue() == R.id.kd3) {
                        c1a5l = (C1A5L) C2271381DvM.LLLLLJIL.getValue();
                    } else if (numValueOf.intValue() != R.id.vm0) {
                        return;
                    } else {
                        c1a5l = (C1A5L) C2271381DvM.LLLLLILLIL.getValue();
                    }
                    C2271391DvN.LIZ(view, c1a5l);
                }
            }

            @Override // X.AbstractC1896090zRP
            public final LifecycleOwner LJIIJ(View view) {
                AbstractC1387200mCc abstractC1387200mCcLIZ = C520040KaQ.LIZ(view);
                if (abstractC1387200mCcLIZ != null) {
                    return abstractC1387200mCcLIZ.LJFF();
                }
                return null;
            }

            @Override // X.AbstractC1896090zRP
            public final int LJIILIIL(int i) {
                InterfaceC1603190roz interfaceC1603190roz;
                Fragment curFragment;
                C19EG activity;
                IHomePageService iHomePageService;
                InterfaceC1570600qyQ interfaceC1570600qyQLJIILL;
                int height;
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                Object obj = null;
                if (abstractC1387200mCcLJ != null) {
                    obj = abstractC1387200mCcLJ.LIZ;
                }
                if ((obj instanceof InterfaceC1603190roz) && (interfaceC1603190roz = (InterfaceC1603190roz) obj) != null && (curFragment = interfaceC1603190roz.getCurFragment()) != null && (activity = curFragment.getActivity()) != null && (iHomePageService = (IHomePageService) PluggableExtentionKt.pluggableSpi$default(IHomePageService.class, false, false, false, 14, null)) != null && (interfaceC1570600qyQLJIILL = iHomePageService.LJIILL(activity)) != null) {
                    View viewZn2 = interfaceC1570600qyQLJIILL.Zn2();
                    if (viewZn2 != null) {
                        height = viewZn2.getHeight();
                    } else {
                        View viewGA = interfaceC1570600qyQLJIILL.GA();
                        if (viewGA == null) {
                            return i;
                        }
                        height = viewGA.getHeight();
                    }
                    Integer numValueOf = Integer.valueOf(height);
                    if (numValueOf != null) {
                        return numValueOf.intValue();
                    }
                    return i;
                }
                return i;
            }

            @Override // X.AbstractC1896090zRP
            public final boolean LJJIIZI(Context context) {
                return C960203pA.LIZIZ(context);
            }

            @Override // X.AbstractC1896090zRP
            public final void LJJJI(BottomTabBubble bottomTabBubble) {
                IProGuidePublishService iProGuidePublishService = (IProGuidePublishService) PluggableExtentionKt.pluggableSpi$default(IProGuidePublishService.class, false, false, false, 14, null);
                if (iProGuidePublishService != null) {
                    iProGuidePublishService.LJFF(bottomTabBubble);
                }
            }

            @Override // X.AbstractC1896090zRP
            public final void LJJJIL(ViewOnTouchListenerC1899510zWv viewOnTouchListenerC1899510zWv) {
                if (viewOnTouchListenerC1899510zWv != null && ((Boolean) C274800Apq.LIZ.getValue()).booleanValue()) {
                    C786410Ut5.LJJZZIII(C724640Sbe.LIZ(), new ARunnableS124S0100000_24(viewOnTouchListenerC1899510zWv, 135));
                }
            }

            @Override // X.AbstractC1896090zRP
            public final void LIZIZ(final AFwS217S0000000_28 aFwS217S0000000_28, final AFwS217S0000000_28 aFwS217S0000000_282) {
                C19EG c19egLJIIIIZZ = LJIIIIZZ();
                if (c19egLJIIIIZZ == null) {
                    return;
                }
                Hox.LLJILJIL.LIZ(c19egLJIIIIZZ).wQ2("USER", new InterfaceC1055110dYz() { // from class: X.0ze5
                    @Override // X.InterfaceC1583780rJg
                    public final String getHoxNodeTag() {
                        return "";
                    }

                    @Override // X.InterfaceC1055110dYz
                    public final void onNodeHide(Bundle bundle) {
                        aFwS217S0000000_282.invoke();
                    }

                    @Override // X.InterfaceC1055110dYz
                    public final void onNodeShow(Bundle bundle) {
                        aFwS217S0000000_28.invoke();
                    }
                });
            }

            @Override // X.AbstractC1896090zRP
            public final void LIZJ(List list, AwS60S0500000_27 awS60S0500000_27) {
                C2042007zG.LIZ.getClass();
                if (list.isEmpty()) {
                    C2042007zG.LIZ(awS60S0500000_27, false);
                } else {
                    C01U6.LIZJ(new AwS404S0200000_3(list, awS60S0500000_27, 59));
                }
            }

            @Override // X.AbstractC1896090zRP
            public final int LJIIL(int i, C1361400lX0 c1361400lX0) {
                Integer numLIZJ = C1308910kAL.LIZJ(i, c1361400lX0);
                if (numLIZJ != null) {
                    return numLIZJ.intValue();
                }
                return -1;
            }

            @Override // X.AbstractC1896090zRP
            public final int LJIJJLI(Context context, String str) {
                C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(context, str);
                if (c698190Ra5LJFF != null) {
                    return c698190Ra5LJFF.LIZ;
                }
                return 0;
            }

            @Override // X.AbstractC1896090zRP
            public final void LJJIJL(String str, String str2) {
                ISeriesFeedService iSeriesFeedServiceLIZIZ;
                InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
                InterfaceC1577520r9a interfaceC1577520r9aLIZIZ2;
                if (Intrinsics.LJFF(str, "tab")) {
                    ISeriesFeedService iSeriesFeedServiceLIZIZ2 = C0RRR.LIZIZ();
                    if (iSeriesFeedServiceLIZIZ2 != null && (interfaceC1577520r9aLIZIZ2 = iSeriesFeedServiceLIZIZ2.LIZIZ()) != null) {
                        interfaceC1577520r9aLIZIZ2.LJIIIZ("task_page", "click_watch_icon");
                    }
                    if (((Number) C274750Apl.LIZ.getValue()).intValue() == 1 && (iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ()) != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) != null) {
                        interfaceC1577520r9aLIZIZ.LJIIJ(null, true);
                    }
                    C844470XAv.LIZ.getClass();
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "//main");
                    smartRouteBuildRoute.addFlags(67108864);
                    smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "Drama");
                    smartRouteBuildRoute.withParam("tab", EnumC1570580qyO.DRAMA_TAB.getValue());
                    smartRouteBuildRoute.open();
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://paidcontent/innerfeed?enter_from=task_page&collection_id=");
                sbLIZ.append(str2);
                sbLIZ.append("&category=1");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C844470XAv.LIZ.getClass();
                SmartRouter.buildRoute(C844470XAv.LIZ(), strLIZIZ).open();
            }

            @Override // X.AbstractC1896090zRP
            public final void LJJIJLIJ(Integer num, Function1<? super Boolean, Unit> function1) {
                int iIntValue;
                TouchPoint touchPointLIZJ;
                String strLJJJZ;
                Integer num2;
                Bundle bundleLJJLIIIJLLLLLLLZ;
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                int iIntValue2 = 0;
                bundle.putBoolean("is_fullscreen_dialog", false);
                bundle.putBoolean("is_skippable_dialog", true);
                bundle.putBoolean("show_login_page_first", true);
                ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
                if (iSpecActService != null && (bundleLJJLIIIJLLLLLLLZ = iSpecActService.LJJLIIIJLLLLLLLZ()) != null) {
                    C786410Ut5.LJJIIJZLJL(bundle, bundleLJJLIIIJLLLLLLLZ);
                }
                C0XQS c0xqs = new C0XQS();
                c0xqs.LIZ = activityLJFF;
                StringBuilder sb = new StringBuilder();
                sb.append(num);
                sb.append('_');
                C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                c1894320zOY.getClass();
                if (iIntValue == 29) {
                    touchPointLIZJ = C1894320zOY.LIZ(iIntValue);
                } else {
                    C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
                    touchPointLIZJ = C2178808gE.LIZ().LIZJ(iIntValue, null);
                }
                if (touchPointLIZJ != null && (num2 = touchPointLIZJ.launchPlanId) != null) {
                    iIntValue2 = num2.intValue();
                }
                sb.append(iIntValue2);
                c0xqs.LIZIZ = sb.toString();
                ISpecActService iSpecActService2 = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
                if (iSpecActService2 == null || (strLJJJZ = iSpecActService2.LJJJZ()) == null) {
                    strLJJJZ = "";
                }
                c0xqs.LIZJ = strLJJJZ;
                c0xqs.LIZLLL = bundle;
                c0xqs.LJ = new C19334810kc(function1, 0);
                ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LIZJ().showLoginAndRegisterView(new C0XQT(c0xqs));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [X.0zeC] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.AbstractC1896090zRP
            public final void LJJIL(Context context, int i, final InterfaceC1904030zeD interfaceC1904030zeD) {
                C19286910ct c19286910ct = C19286910ct.LIZIZ;
                if (i == -1) {
                    i = 8;
                }
                c19286910ct.LJ(context, i, new C10ZE() { // from class: X.0zeC
                    @Override // X.C10ZE
                    public final void v() {
                        InterfaceC1904030zeD interfaceC1904030zeD2 = interfaceC1904030zeD;
                        if (interfaceC1904030zeD2 != null) {
                            interfaceC1904030zeD2.v();
                        }
                    }

                    @Override // X.C10ZE
                    public final void LIZ(Uri uri) {
                        InterfaceC1904030zeD interfaceC1904030zeD2 = interfaceC1904030zeD;
                        if (interfaceC1904030zeD2 != null) {
                            interfaceC1904030zeD2.LIZ(uri);
                        }
                    }
                });
            }
        });
        map.put(1, new C1896890zSh() { // from class: X.0zU5
            @Override // X.C1896890zSh
            public final void LJI() {
            }

            @Override // X.C1896890zSh
            public final boolean LIZIZ() {
                C01GW c01gw = C0BSA.LIZ;
                return Intrinsics.LJFF(c01gw.getValue(), "user") || Intrinsics.LJFF(c01gw.getValue(), "dai_user");
            }

            @Override // X.C1896890zSh
            public final boolean LIZJ() {
                C01GW c01gw = C0BSA.LIZ;
                return Intrinsics.LJFF(c01gw.getValue(), "dai") || Intrinsics.LJFF(c01gw.getValue(), "dai_user");
            }

            @Override // X.C1896890zSh
            public final String LIZLLL() {
                String aid;
                C1619790sFl.LIZ.getClass();
                Aweme awemeLIZ = C1619790sFl.LIZ();
                return (awemeLIZ == null || (aid = awemeLIZ.getAid()) == null) ? "" : aid;
            }

            @Override // X.C1896890zSh
            public final String LJ() {
                C1619790sFl.LIZ.getClass();
                Aweme awemeLIZ = C1619790sFl.LIZ();
                return String.valueOf(awemeLIZ != null ? Integer.valueOf(awemeLIZ.getAwemeType()) : null);
            }

            @Override // X.C1896890zSh
            public final int LJFF() {
                Video video;
                C1619790sFl.LIZ.getClass();
                Aweme awemeLIZ = C1619790sFl.LIZ();
                if (awemeLIZ == null || (video = awemeLIZ.getVideo()) == null) {
                    return -1;
                }
                return video.getDuration();
            }

            @Override // X.C1896890zSh
            public final boolean LJIIIIZZ() {
                C1619790sFl.LIZ.getClass();
                Aweme awemeLIZ = C1619790sFl.LIZ();
                if (awemeLIZ != null) {
                    return AwemeBizExtKt.isReferralFakeAweme(awemeLIZ);
                }
                return false;
            }

            @Override // X.C1896890zSh
            public final boolean LJIIIZ() {
                List arrayList;
                NormalPendant normalPendant;
                C1619790sFl.LIZ.getClass();
                Aweme awemeLIZ = C1619790sFl.LIZ();
                if (awemeLIZ != null && awemeLIZ.getTextExtra() != null && !awemeLIZ.getTextExtra().isEmpty()) {
                    C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
                    C1894690zP9 c1894690zP9 = C2178808gE.LIZ().LJII;
                    if (c1894690zP9 == null || (normalPendant = c1894690zP9.LIZ) == null || (arrayList = normalPendant.promotionIds) == null) {
                        arrayList = new ArrayList();
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator<TextExtraStruct> it2 = awemeLIZ.getTextExtra().iterator();
                        while (it2.hasNext()) {
                            if (arrayList.contains(it2.next().getCid())) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
            @Override // X.C1896890zSh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJIIJ() {
                /*
                    r4 = this;
                    X.0sFl r0 = X.C1619790sFl.LIZ
                    r0.getClass()
                    com.ss.android.ugc.aweme.feed.model.Aweme r3 = X.C1619790sFl.LIZ()
                    r2 = 0
                    if (r3 == 0) goto L30
                    boolean r0 = r3.isAd()
                    if (r0 != 0) goto L2f
                    if (r3 == 0) goto L30
                    int r1 = r3.getAwemeType()
                    r0 = 101(0x65, float:1.42E-43)
                    if (r1 != r0) goto L29
                    X.0BsY r0 = X.C301960BsY.LIZ
                    r0.getClass()
                    boolean r0 = X.C301960BsY.LIZ()
                    if (r0 == 0) goto L2f
                    if (r3 == 0) goto L30
                L29:
                    boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.isReferralFakeAweme(r3)
                    if (r0 == 0) goto L30
                L2f:
                    r2 = 1
                L30:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1897750zU5.LJIIJ():boolean");
            }

            @Override // X.C1896890zSh
            public final void LJII(AwS607S0100000_28 awS607S0100000_28) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new PendantRule$getPendantHandGesture$1(awS607S0100000_28, null), 3);
            }

            @Override // X.C1896890zSh
            public final void LJIIJJI(ViewOnTouchListenerC1899510zWv viewOnTouchListenerC1899510zWv, final String str, final AbstractC1899790zXN abstractC1899790zXN) {
                C2211631BhB.LIZJ(viewOnTouchListenerC1899510zWv, new AbstractC2211791BhR(str, abstractC1899790zXN) { // from class: X.0zXx
                    public Function0<String> LJ;
                    public final C1900140zXw LJFF;
                    public final C1900130zXv LJI;

                    @Override // X.AbstractC2211791BhR
                    public final boolean LJIIIIZZ() {
                        return true;
                    }

                    @Override // X.AbstractC2211791BhR
                    public final Function0<String> LIZLLL() {
                        return this.LJ;
                    }

                    @Override // X.AbstractC2211791BhR
                    public final /* bridge */ /* synthetic */ InterfaceC2211921Bhe LJ() {
                        return this.LJI;
                    }

                    @Override // X.AbstractC2211791BhR
                    public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                        return this.LJFF;
                    }

                    @Override // X.AbstractC2211791BhR
                    public final void LJIILL(Function0<String> function0) {
                        this.LJ = function0;
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [X.0zXw] */
                    /* JADX WARN: Type inference failed for: r0v2, types: [X.0zXv] */
                    {
                        this.LJ = new AwS112S1000000_28(str, 4);
                        this.LJFF = new InterfaceC2211931Bhf() { // from class: X.0zXw
                            @Override // X.InterfaceC2211931Bhf
                            public final void LIZ(View view, String str2) {
                                abstractC1899790zXN.onExpose(view, str2);
                            }
                        };
                        this.LJI = new InterfaceC2211921Bhe() { // from class: X.0zXv
                            @Override // X.InterfaceC2211921Bhe
                            public final void LIZ(long j) {
                                abstractC1899790zXN.onDismiss(j);
                            }
                        };
                    }
                });
            }
        });
        map.put(4, new C1897770zU7() { // from class: X.0zU6
            @Override // X.C1897770zU7
            public final boolean LIZJ() {
                C1619790sFl.LIZ.getClass();
                Aweme awemeLIZ = C1619790sFl.LIZ();
                return awemeLIZ == null || awemeLIZ.isAd() || awemeLIZ.getAwemeType() == 101;
            }

            @Override // X.C1897770zU7
            public final void LIZLLL() {
                C1618290sDL.LIZ.getClass();
            }

            @Override // X.C1897770zU7
            public final boolean LJFF() {
                C1619790sFl.LIZ.getClass();
                Aweme awemeLIZ = C1619790sFl.LIZ();
                if (awemeLIZ == null) {
                    return false;
                }
                return AwemeBizExtKt.isReferralFakeAweme(awemeLIZ);
            }

            @Override // X.C1897770zU7
            public final boolean LJIIIIZZ() {
                C1619790sFl.LIZ.getClass();
                Aweme awemeLIZ = C1619790sFl.LIZ();
                if (awemeLIZ == null || !C621180OYa.LIZIZ.LJJJI(awemeLIZ.getShareOperationInfo(), false)) {
                    return false;
                }
                C1618290sDL.LIZ.getClass();
                if (!C1618290sDL.LIZLLL() || C621180OYa.LIZIZ.LJIIL()) {
                    return false;
                }
                C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
                return C2178808gE.LIZ().LJ(38) != null;
            }

            @Override // X.C1897770zU7
            public final boolean LJI() {
                return C1896740zSS.LIZLLL;
            }

            @Override // X.C1897770zU7
            public final boolean LJ(DynamicDialog dynamicDialog) {
                List<String> list;
                if (dynamicDialog != null) {
                    list = dynamicDialog.validPages;
                } else {
                    list = null;
                }
                if (C695930RRn.LIZLLL(list)) {
                    if (list != null) {
                        C1618290sDL.LIZ.getClass();
                        if (list.contains(C1618290sDL.LIZ())) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                C1618290sDL.LIZ.getClass();
                return C1618290sDL.LIZLLL();
            }

            @Override // X.C1897770zU7
            public final boolean LIZIZ(Integer num, DynamicDialog dynamicDialog) {
                Aweme awemeLIZ;
                if (num != null) {
                    if (num.intValue() == 67) {
                        C1618290sDL.LIZ.getClass();
                        Object objLIZIZ = C1618290sDL.LIZIZ();
                        if (!(objLIZIZ instanceof InterfaceC1603190roz)) {
                            return false;
                        }
                        return ((InterfaceC1603190roz) objLIZIZ).getCurFragment() instanceof C0SSZ;
                    }
                    if (num.intValue() == 86) {
                        return ((Boolean) C01U6.LJ(AFwS216S0000000_27.get$arr$(163), Boolean.FALSE)).booleanValue();
                    }
                }
                if (LJ(dynamicDialog)) {
                    C1619790sFl.LIZ.getClass();
                    Aweme awemeLIZ2 = C1619790sFl.LIZ();
                    if ((awemeLIZ2 == null || !awemeLIZ2.isAd()) && ((awemeLIZ = C1619790sFl.LIZ()) == null || !AwemeBizExtKt.isReferralFakeAweme(awemeLIZ))) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.C1897770zU7
            public final boolean LJII(int i, List<String> list) {
                if (list != null && !list.isEmpty()) {
                    C1618290sDL.LIZ.getClass();
                    String strLIZ = C1618290sDL.LIZ();
                    C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
                    int iLJIILJJIL = C1894330zOZ.LIZ().LJIILJJIL();
                    int iHashCode = strLIZ.hashCode();
                    if (iHashCode != 101885) {
                        if (iHashCode != 95844967) {
                            if (iHashCode == 237798014 && strLIZ.equals("drama_inner")) {
                            }
                        } else if (!strLIZ.equals("drama")) {
                            return false;
                        }
                        if (iLJIILJJIL >= i) {
                            return true;
                        }
                    } else if (strLIZ.equals("fyp") && C1895930zR9.LIZLLL >= i) {
                        return true;
                    }
                    return false;
                }
                if (C1895930zR9.LIZLLL < i) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
            @Override // X.C1897770zU7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJIIIZ(android.app.Activity r4, java.lang.String r5, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> r6) {
                /*
                    r3 = this;
                    X.0sDL r0 = X.C1618290sDL.LIZ
                    r0.getClass()
                    java.lang.Object r2 = X.C1618290sDL.LIZIZ()
                    boolean r0 = r2 instanceof X.InterfaceC1603190roz
                    r1 = 0
                    if (r0 == 0) goto L2d
                    X.0roz r2 = (X.InterfaceC1603190roz) r2
                    androidx.fragment.app.Fragment r2 = r2.getCurFragment()
                    boolean r0 = r2 instanceof X.InterfaceC1593630rZZ
                    if (r0 == 0) goto L2d
                    X.0rZZ r2 = (X.InterfaceC1593630rZZ) r2
                L1a:
                    boolean r0 = r2 instanceof X.InterfaceC20658015sY
                    if (r0 == 0) goto L2f
                    X.15sY r2 = (X.InterfaceC20658015sY) r2
                    if (r2 == 0) goto L2f
                    kotlin.jvm.internal.AwS642S0100000_28 r1 = new kotlin.jvm.internal.AwS642S0100000_28
                    r0 = 38
                    r1.<init>(r6, r0)
                    X.C0T85.LIZ(r2, r5, r1)
                    return
                L2d:
                    r2 = r1
                    goto L1a
                L2f:
                    r6.invoke(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1897760zU6.LJIIIZ(android.app.Activity, java.lang.String, kotlin.jvm.functions.Function1):void");
            }

            @Override // X.C1897770zU7
            public final void LJIIJ(Activity activity, String str, AwS607S0100000_28 awS607S0100000_28) {
                Fragment curFragment;
                C19EG activity2;
                InterfaceC20658015sY interfaceC20658015sY;
                C1618290sDL.LIZ.getClass();
                Object objLIZIZ = C1618290sDL.LIZIZ();
                if ((objLIZIZ instanceof InterfaceC1603190roz) && (curFragment = ((InterfaceC1603190roz) objLIZIZ).getCurFragment()) != null && (activity2 = curFragment.getActivity()) != null) {
                    C128Y c128yKi = Hox.LLJILJIL.LIZ(activity2).Ki("USER");
                    if ((c128yKi instanceof InterfaceC20658015sY) && (interfaceC20658015sY = (InterfaceC20658015sY) c128yKi) != null) {
                        C0T85.LIZ(interfaceC20658015sY, str, new AwS642S0100000_28(awS607S0100000_28, 39));
                        return;
                    }
                }
                awS607S0100000_28.invoke(null);
            }
        });
        map.put(6, new C1898650zVX() { // from class: X.0zVT
            @Override // X.C1898650zVX
            public final boolean LIZIZ() {
                return ((Boolean) C305700Bya.LIZIZ.getValue()).booleanValue();
            }

            @Override // X.C1898650zVX
            public final boolean LIZJ() {
                return ((Boolean) C305700Bya.LIZJ.getValue()).booleanValue();
            }

            @Override // X.C1879340z0O
            public final boolean LIZ() {
                if (LIZIZ()) {
                    return true;
                }
                if (C1908480zlO.LIZIZ.LJIIIZ(true)) {
                    return false;
                }
                Activity activityLJFF = C2214201BlK.LJFF();
                return activityLJFF == null || !C0SXF.LJIL(activityLJFF);
            }

            @Override // X.C1898650zVX
            public final void LIZLLL(InAppPush inAppPush) {
                int i;
                String str;
                Content content;
                Content content2;
                String str2;
                C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
                String str3 = inAppPush.icon;
                if (str3 == null) {
                    str3 = "";
                }
                List listSingletonList = Collections.singletonList(str3);
                Button button = inAppPush.button;
                String str4 = null;
                if (button != null && (content2 = button.content) != null && (str2 = content2.text) != null && str2.length() != 0) {
                    i = 4;
                } else {
                    i = 0;
                }
                Button button2 = inAppPush.button;
                if (button2 != null && (content = button2.content) != null) {
                    str = content.text;
                } else {
                    str = null;
                }
                Content content3 = inAppPush.content;
                if (content3 != null) {
                    str4 = content3.text;
                }
                c1908480zlO.LIZLLL(new C19323510in(23, "click_push_ug_fission", new InnerPushConfig(0L, null, 10000, null, 5), new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, listSingletonList, null, null, null, null, null, null, null, 32, 32, 0.0f, 0.0f, null, 20, 20, null, false, -3, 3, null, 0, 0, 0, Boolean.FALSE, 0, 0, 0, 0, 0, null, null, str4, null, 2, null, i, str, null, 36, 48, 4, 0, null, null, 0.5f, null, true, 0, null, null, null, 12, null, null, null, null, null, 0), null, C2097908Jt.LIZJ(new Pair("UGPushHandler", inAppPush)), 332));
            }
        });
        map.put(23, new C1897720zU2() { // from class: X.0zU1
        });
        map.put(11, new C1896510zS5() { // from class: X.0sFn
            @Override // X.C1879340z0O
            public final boolean LIZ() {
                Aweme awemeLJ;
                C1619790sFl.LIZ.getClass();
                Aweme awemeLIZ = C1619790sFl.LIZ();
                if (awemeLIZ != null && awemeLIZ.getAwemeType() == 101) {
                    C301960BsY.LIZ.getClass();
                    if (C301960BsY.LIZ()) {
                        return true;
                    }
                }
                C1895700zQm.LIZ.getClass();
                if (!C1483410ohn.LJLJJI().isPlaying() || (awemeLJ = C740740T3w.LJ()) == null) {
                    return false;
                }
                String aid = awemeLJ.getAid();
                Aweme aweme = C1895700zQm.LIZIZ;
                return !TextUtils.equals(aid, aweme != null ? aweme.getAid() : null);
            }

            @Override // X.C1896510zS5
            public final boolean LIZJ() {
                return ((Number) C0AUO.LIZ.getValue()).intValue() == 1;
            }

            @Override // X.C1896510zS5
            public final boolean LIZLLL() {
                ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
                if (iSpecActService == null) {
                    return false;
                }
                iSpecActService.LJJLIIIJ();
                return true;
            }

            @Override // X.C1896510zS5
            public final boolean LJ() {
                IProtectionService iProtectionService = (IProtectionService) PluggableExtentionKt.pluggableSpi$default(IProtectionService.class, false, false, false, 14, null);
                if (iProtectionService != null && iProtectionService.LIZIZ()) {
                    return false;
                }
                C1895700zQm.LIZ.getClass();
                if (!C1483410ohn.LJLJJI().isPlaying()) {
                    return false;
                }
                C1618290sDL.LIZ.getClass();
                return C1618290sDL.LIZLLL();
            }

            @Override // X.C1896510zS5
            public final void LJFF() {
                if (C1619800sFm.LIZIZ.LJFF()) {
                    C1895550zQX.LL.getClass();
                }
            }

            @Override // X.C1896510zS5
            public final boolean LJII() {
                return C1619800sFm.LIZIZ.LJJIII();
            }

            @Override // X.C1896510zS5
            public final boolean LJI(boolean z) {
                C1619790sFl.LIZ.getClass();
                Aweme awemeLIZ = C1619790sFl.LIZ();
                if (awemeLIZ == null || AwemeBizExtKt.isReferralFakeAweme(awemeLIZ) || awemeLIZ.isAd()) {
                    return false;
                }
                if (awemeLIZ.getAwemeType() == 101) {
                    C301960BsY.LIZ.getClass();
                    if (!C301960BsY.LIZ()) {
                        return false;
                    }
                }
                if (ComplianceServiceProvider.LJIL().LJJJJZI()) {
                    return false;
                }
                C1619820sFo.LIZ.getClass();
                if (!C1619820sFo.LIZIZ) {
                    return false;
                }
                if (!C848230XPh.LL.LJI() && z) {
                    return false;
                }
                C1618290sDL.LIZ.getClass();
                if (!C1618290sDL.LIZLLL() && !C1618290sDL.LIZJ() && !C1618290sDL.LJFF() && !C1618290sDL.LJ()) {
                    return false;
                }
                if (C1618290sDL.LIZJ() && ((Number) C0AUO.LIZ.getValue()).intValue() == 1) {
                    return false;
                }
                return true;
            }

            @Override // X.C1896510zS5
            public final void LIZIZ(String str, String str2, Function1<? super JSONObject, Unit> function1) {
                if (str2.length() == 0) {
                    str2 = "mt_cheat_block_result";
                }
                Map<String, Function1<JSONObject, Unit>> map2 = C13041058l.LIZJ;
                if (!map2.containsKey(str)) {
                    map2.put(str, function1);
                }
                if (C13041058l.LIZIZ) {
                    C13041058l.LIZIZ = true;
                } else {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new PitayaUtils$initAntiCheatListener$1(str2, null), 3);
                }
            }
        });
        map.put(8, new C1896300zRk() { // from class: X.0sCw
            @Override // X.C1896300zRk
            public final int LIZIZ() {
                return R.raw.icon_color_tiktok_logo_light;
            }

            @Override // X.C1896300zRk
            public final int LIZJ() {
                return R.raw.icon_tiktok_text_logo;
            }

            @Override // X.C1896300zRk
            public final int LIZLLL() {
                boolean z = C14LC.LJIIIZ;
                if (C309690CBz.LIZ.LJFF) {
                    return 0;
                }
                return C14LC.LIZIZ();
            }

            @Override // X.C1896300zRk
            public final boolean LJI() {
                return C19252910Tv.LIZIZ.LIZLLL().LIZJ();
            }

            @Override // X.C1896300zRk
            public final void LJ() {
                ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJIJ();
            }

            @Override // X.C1896300zRk
            public final void LJFF() {
                ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJIIJ();
            }
        });
        map.put(13, new C1897700zU0() { // from class: X.0zTz
        });
        map.put(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT), new C1849780yEi() { // from class: X.0yEd
            public int LIZ = LSPassThroughRecordSizeConfig.DEFAULT;

            @Override // X.C1849780yEi
            public final boolean LJ() {
                UgAwemeActivitySetting awemeActivitySetting = C0CLW.LIZIZ.LIZ.getAwemeActivitySetting();
                if (awemeActivitySetting != null) {
                    return awemeActivitySetting.isUseTouchPointWidget();
                }
                return false;
            }

            @Override // X.C1849780yEi
            public final C11NZ<Boolean> LIZLLL() {
                return C2214201BlK.LIZLLL();
            }

            @Override // X.C1849780yEi
            public final PendingIntent LIZIZ(Context context, String str) {
                Intent intentLJIIIZ = ((IAppWidgetService) ServiceManager.get().getService(IAppWidgetService.class)).LJIIIZ(context, str);
                intentLJIIIZ.putExtra("extra_jump_type", 0);
                int i = this.LIZ + 1;
                this.LIZ = i;
                return LJFF(i, context, intentLJIIIZ);
            }

            public static PendingIntent LJFF(int i, Context context, Intent intent) {
                IDeviceCapability iDeviceCapability;
                if (Build.VERSION.SDK_INT >= 26 && (iDeviceCapability = (IDeviceCapability) PluggableExtentionKt.pluggableSpi$default(IDeviceCapability.class, false, false, false, 14, null)) != null && iDeviceCapability.l()) {
                    ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                    activityOptionsMakeBasic.setLaunchDisplayId(0);
                    return PendingIntent.getActivity(context, i, intent, 201326592, activityOptionsMakeBasic.toBundle());
                }
                return PendingIntent.getActivity(context, i, intent, 201326592);
            }

            @Override // X.C1849780yEi
            public final PendingIntent LIZJ(Context context, String str, String str2) {
                Intent intentLJIIIZ = ((IAppWidgetService) ServiceManager.get().getService(IAppWidgetService.class)).LJIIIZ(context, str);
                intentLJIIIZ.putExtra("extra_jump_type", 9);
                intentLJIIIZ.putExtra("extra_jump_link", str2);
                int i = this.LIZ + 1;
                this.LIZ = i;
                return LJFF(i, context, intentLJIIIZ);
            }
        });
        map.put(29, new C1619750sFh() { // from class: X.0sFi
            @Override // X.C1619750sFh
            public final void LIZJ() {
                C1619800sFm.LIZIZ.LJIL();
            }

            @Override // X.C1619750sFh
            public final void LJ() {
                C1619800sFm.LIZIZ.LJIILL();
            }

            public static C19EG LJFF() {
                C089E c089e = new C089E(ActivityStack.getActivityStack());
                while (c089e.hasNext()) {
                    Activity activity = (Activity) c089e.next();
                    if (activity instanceof InterfaceC1603190roz) {
                        if (activity instanceof C19EG) {
                            return (C19EG) activity;
                        }
                        return null;
                    }
                }
                return null;
            }

            @Override // X.C1619750sFh
            public final void LIZIZ() {
                MainActivityScope mainActivityScopeLIZJ;
                HomeTabAbility homeTabAbilityLIZ;
                C19EG c19egLJFF = LJFF();
                if (c19egLJFF == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLJFF)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
                    return;
                }
                try {
                    homeTabAbilityLIZ.Gx0(EnumC1585090rLn.COIN_TOUCH_POINT_UPDATE);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }

            @Override // X.C1619750sFh
            public final void LIZLLL() {
                MainActivityScope mainActivityScopeLIZJ;
                HomeTabAbility homeTabAbilityLIZ;
                AbstractC1591090rVT abstractC1591090rVTHQ1;
                C19EG c19egLJFF = LJFF();
                if (c19egLJFF == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLJFF)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null || (abstractC1591090rVTHQ1 = homeTabAbilityLIZ.hQ1(c19egLJFF)) == null) {
                    return;
                }
                abstractC1591090rVTHQ1.LJJIJLIJ();
            }
        });
        map.put(1003, new C1893370zN1() { // from class: X.0e4H
            @Override // X.C1893370zN1
            public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJI() {
                return C1697810uHb.LJIIJJI(C1798750wuP.class, C1902280zbO.class);
            }

            @Override // X.C1893370zN1
            public final boolean LIZJ() {
                return ((SparkWebViewOptimizeExperiment.WebViewOptimizeModel) SparkWebViewOptimizeExperiment.LIZIZ.getValue()).enableWarmupSpark;
            }

            @Override // X.C1893370zN1
            public final boolean LIZLLL() {
                return ((SparkWebViewOptimizeExperiment.WebViewOptimizeModel) SparkWebViewOptimizeExperiment.LIZIZ.getValue()).enableWarmupWebView;
            }

            @Override // X.C1893370zN1
            public final JSONObject LJ() {
                C1063440dmQ.LIZ.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    for (Map.Entry entry : ((HashMap) C1059370dfr.LIZ(null)).entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    jSONObject.put("code", 1);
                    return jSONObject;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return jSONObject;
                }
            }

            @Override // X.C1893370zN1
            public final String LJFF() {
                IUgCommonService iUgCommonService = (IUgCommonService) PluggableExtentionKt.pluggableSpi$default(IUgCommonService.class, false, false, false, 14, null);
                if (iUgCommonService == null) {
                    return null;
                }
                iUgCommonService.LJIILLIIL();
                C19259610Wk c19259610Wk = C19259610Wk.LIZ;
                return C19259610Wk.LJ();
            }

            @Override // X.C1893370zN1
            public final Map<String, Boolean> LJII() {
                Map<String, Boolean> map2 = C0XMU.LIZ;
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                Map<String, Boolean> map3 = C0XMU.LIZ;
                Map<String, Boolean> map4 = (Map) settingsManagerLIZLLL.LJIIIIZZ("incentive_nsr_scene", Map.class, map3);
                return map4 != null ? map4 : map3;
            }

            @Override // X.C1893370zN1
            public final JSONObject LJIIIIZZ() {
                C1063440dmQ.LIZ.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    C1063440dmQ.LIZIZ.LIZ(jSONObject);
                    return jSONObject;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return jSONObject;
                }
            }

            @Override // X.C1893370zN1
            public final boolean LJIIJ() {
                return C1BX5.LIZIZ.LJIILLIIL();
            }

            @Override // X.C1893370zN1
            public final boolean LJIIJJI() {
                return C1BX5.LIZIZ.LJ();
            }

            @Override // X.C1893370zN1
            public final void LJIILIIL() {
                C01U6.LIZJ(AFwS204S0000000_16.get$arr$(276));
            }

            @Override // X.C1893370zN1
            public final void LJIILL() {
                ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
                if (iSpecActService != null) {
                    iSpecActService.LJJLIIIJL();
                }
            }

            @Override // X.C1893370zN1
            public final boolean LJIIZILJ() {
                return ((SparkWebViewOptimizeExperiment.WebViewOptimizeModel) SparkWebViewOptimizeExperiment.LIZIZ.getValue()).warmupWebviewInIdle;
            }

            @Override // X.C1893370zN1
            public final void LJIILJJIL() {
                ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJI();
            }

            @Override // X.C1893370zN1
            public final void LIZIZ(C19EG c19eg) {
                MainBusinessAbility mainBusinessAbilityLIZIZ;
                if (C296200BjG.LIZ()) {
                    mainBusinessAbilityLIZIZ = C1058560deY.LIZ(c19eg);
                } else {
                    MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
                    if (mainActivityScopeLIZJ == null) {
                        return;
                    } else {
                        mainBusinessAbilityLIZIZ = C1058560deY.LIZIZ(mainActivityScopeLIZJ);
                    }
                }
                if (mainBusinessAbilityLIZIZ != null) {
                    mainBusinessAbilityLIZIZ.allowSwipeLeft(false);
                }
            }

            @Override // X.C1893370zN1
            public final void LJIIIZ(C19EG c19eg) {
                Hox.LLJILJIL.LIZ(c19eg).TQ2(new Bundle(0), "HOME", false);
            }

            @Override // X.C1893370zN1
            public final InterfaceC1163130gND LJIILLIIL(SparkSchemaParam sparkSchemaParam, SparkContext sparkContext) {
                try {
                    Set<C1BP1<?, ?>> set = C1542450qF1.LIZ;
                    return C1542450qF1.LIZIZ(sparkSchemaParam, sparkContext);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }

            @Override // X.C1893370zN1
            public final void LJIIL(Context context, String str, boolean z) {
                C01U6.LIZIZ(new C1951607kg(context, str, z));
            }
        });
        map.put(1004, new C19207010Ce());
        map.put(2000, new C1897570zTn() { // from class: X.0zTo
            @Override // X.C1897570zTn
            public final int LIZIZ() {
                return R.raw.icon_popover_caret;
            }

            @Override // X.C1897570zTn
            public final int LIZJ() {
                return R.style.y0;
            }

            @Override // X.C1897570zTn
            public final int LIZLLL() {
                return R.style.xm;
            }
        });
        map.put(1005, C1896290zRj.LIZ);
        map.put(76, new C1009500cNQ() { // from class: X.0zUx
            @Override // X.C1009500cNQ
            public final boolean LIZJ() {
                return AdFeedTimerPendantManager.LLJJLIIIJLLLLLLLZ.get();
            }

            @Override // X.C1009500cNQ
            public final Map<String, String> LIZIZ(C1898420zVA c1898420zVA) {
                if (c1898420zVA == null) {
                    return null;
                }
                ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJLIIIJLJLI();
                return C1898260zUu.LIZ(c1898420zVA);
            }

            @Override // X.C1009500cNQ
            public final boolean LIZLLL(C1898420zVA c1898420zVA) {
                if (LIZJ() || c1898420zVA == null || !c1898420zVA.LIZ()) {
                    return false;
                }
                ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJLIIIJLJLI();
                return C1898260zUu.LIZIZ(c1898420zVA);
            }

            @Override // X.C1009500cNQ
            public final void LJFF(C1898420zVA c1898420zVA) {
                if (!LIZJ() && c1898420zVA != null && c1898420zVA.LIZ()) {
                    ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJLIIIJLJLI();
                    C1898260zUu.LIZLLL(c1898420zVA);
                }
            }

            @Override // X.C1009500cNQ
            public final void LJI(C1898420zVA c1898420zVA) {
                if (!LIZJ() && c1898420zVA != null && c1898420zVA.LIZ()) {
                    ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJLIIIJLJLI();
                    C1898260zUu.LJ(c1898420zVA);
                }
            }

            @Override // X.C1009500cNQ
            public final void LJ(ViewGroup viewGroup, LifecycleOwner lifecycleOwner, C1008900cMS c1008900cMS, C1898420zVA c1898420zVA) {
                if (!LIZJ() && c1898420zVA != null && c1898420zVA.LIZ()) {
                    ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJLIIIJLJLI();
                    C1898260zUu.LIZJ(viewGroup, lifecycleOwner, c1008900cMS, c1898420zVA);
                }
            }
        });
        C1619720sFe.LIZJ = map;
        IConfigService iConfigService2 = (IConfigService) PluggableExtentionKt.pluggableSpi$default(IConfigService.class, false, false, false, 14, null);
        if (iConfigService2 != null) {
            iConfigService2.LIZIZ();
        }
        if (((Boolean) C305700Bya.LIZIZ.getValue()).booleanValue()) {
            C1898590zVR c1898590zVR = C1898590zVR.LL;
            c1898590zVR.getClass();
            C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
            c1908480zlO.LJ(c1898590zVR);
            c1908480zlO.LJIILL(c1898590zVR, new int[]{23});
        }
    }

    @Override // com.bytedance.touchpoint.api.config.IIncentiveManager
    public final void LIZJ(Integer num) {
        boolean zLJI = MethodIDManager.LJI(71757);
        System.currentTimeMillis();
        LIZLLL();
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId != null && strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() != 0 && !Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
            C1895370zQF.LIZIZ(C1895370zQF.LIZ, num);
        } else {
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(this.LIZ);
        }
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null) {
            abstractC1896090zRP.LJJIZ();
        }
        Integer num2 = 1;
        C1896290zRj.LIZ.getClass();
        if (((Boolean) C0BIS.LIZ.getValue()).booleanValue()) {
            num2.intValue();
            C20554315bp.LIZIZ.LIZ(EnumC20654715s1.FEED_WIDGET, new InterfaceC1273504yb() { // from class: X.0zRO
                @Override // X.InterfaceC1273504yb
                public final void ac(String str, Map<String, Object> map) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - C1896290zRj.LIZIZ < ((Number) C0A4G.LIZ.getValue()).intValue() * LSPassThroughRecordSizeConfig.DEFAULT) {
                        return;
                    }
                    C1896290zRj.LIZIZ = jCurrentTimeMillis;
                    C1896290zRj.LIZJ = new C1896070zRN(str, C20484080s.LIZJ(map));
                    C1895370zQF.LIZ.getClass();
                    C01U6.LIZIZ(new AwS429S0200000_28(16, 69));
                }
            });
        }
        C1897000zSs c1897000zSs = C1897000zSs.LIZ;
        C01GW c01gw = C274800Apq.LIZ;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            C622680Oba.LIZLLL(c1897000zSs);
        }
        C1897000zSs.LIZIZ = false;
        C1897000zSs.LIZLLL.clear();
        C1897000zSs.LJ.clear();
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            C622680Oba.LIZJ(c1897000zSs);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.touchpoint.api.config.IIncentiveManager
    public final void LJ(EnumC1895270zQ5 enumC1895270zQ5) {
        C1895370zQF.LIZ.getClass();
        C01U6.LIZ(0L, new C1895250zQ3(enumC1895270zQ5));
        C1895800zQw.LIZIZ = false;
        C718220SFg.LIZIZ = 0;
    }
}
