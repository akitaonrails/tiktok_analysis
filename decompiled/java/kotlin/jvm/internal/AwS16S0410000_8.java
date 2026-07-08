package kotlin.jvm.internal;

import X.C09AY;
import X.C0CHQ;
import X.C0XF1;
import X.C1431730nMR;
import X.C1434650nR9;
import X.C201955140j;
import X.C259800zU;
import X.C527600Kmc;
import X.C844470XAv;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.services.sparrow.DmtSparrowServiceImplKt;
import com.ss.android.ugc.aweme.services.sparrow.PublishXServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS16S0410000_8 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS16S0410000_8 awS16S0410000_8) {
        String vESDKVersion;
        String effectVersion;
        ((PublishXServiceImpl) awS16S0410000_8.l3).printPublishModelInOfflineStorage((PublishModel) awS16S0410000_8.l1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C259800zU c259800zU = (C259800zU) awS16S0410000_8.l2;
        PublishModel publishModel = (PublishModel) awS16S0410000_8.l1;
        C1434650nR9 c1434650nR9 = (C1434650nR9) awS16S0410000_8.l0;
        boolean z = awS16S0410000_8.z4;
        linkedHashMap.put("publish_id", c259800zU.element);
        linkedHashMap.put("publish_type", Integer.valueOf(publishModel.publishType));
        linkedHashMap.put("stacktrace", C201955140j.LJIIJJI(c1434650nR9));
        linkedHashMap.put("is_by_design", Boolean.valueOf(z));
        linkedHashMap.put("publish_duration", Integer.valueOf(c1434650nR9.getPublishDuration()));
        linkedHashMap.put("authkey", "");
        linkedHashMap.put("create_aweme", "");
        String serverLogId = c1434650nR9.getServerLogId();
        if (serverLogId == null) {
            serverLogId = "";
        }
        linkedHashMap.put("log_id", serverLogId);
        linkedHashMap.put("error_code", Integer.valueOf(c1434650nR9.getErrorCode()));
        Object failedTaskTag = c1434650nR9.getFailedTaskTag();
        String str = "unknown";
        if (failedTaskTag == null) {
            failedTaskTag = "unknown";
        }
        linkedHashMap.put("failed_task", failedTaskTag);
        C0CHQ.LIZ().getPublishService().LJJIIZI();
        C1431730nMR.LIZ();
        linkedHashMap.put("build_info", "unknown");
        linkedHashMap.put("uid", C0CHQ.LIZ().getAccountService().getCurrentUserID());
        C0CHQ.LIZ().getApplicationService().getClass();
        linkedHashMap.put("did", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        C844470XAv.LIZ.getClass();
        linkedHashMap.put("version_name", C844470XAv.LJFF());
        linkedHashMap.put("version_code", Long.valueOf(C844470XAv.LJ()));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("app_id", Integer.valueOf(C844470XAv.LJIIJ));
        C0CHQ.LIZ().LJIJI();
        linkedHashMap2.put("is_debug", Boolean.FALSE);
        linkedHashMap2.put("is_login_in", Boolean.valueOf(C0CHQ.LIZ().getAccountService().isLogin()));
        linkedHashMap2.put("channel", C844470XAv.LJIILL);
        linkedHashMap2.put("network_type", C0XF1.LIZ(C0CHQ.LIZ).toString());
        IAVSettingsService iAVSettingsServiceAvSettingsService = ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).avSettingsService();
        if (iAVSettingsServiceAvSettingsService == null || (vESDKVersion = iAVSettingsServiceAvSettingsService.getVESDKVersion()) == null) {
            vESDKVersion = "unknown";
        }
        linkedHashMap2.put("vesdk_version", vESDKVersion);
        IAVSettingsService iAVSettingsServiceAvSettingsService2 = ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).avSettingsService();
        if (iAVSettingsServiceAvSettingsService2 != null && (effectVersion = iAVSettingsServiceAvSettingsService2.getEffectVersion()) != null) {
            str = effectVersion;
        }
        linkedHashMap2.put("effectsdk_version", str);
        linkedHashMap.put("device_info", GsonProtectorUtils.toJson(DmtSparrowServiceImplKt.getGson(), linkedHashMap2));
        linkedHashMap.put("qiaofu_report_url", "");
        linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
        linkedHashMap.put("comment", "to be implemented");
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS16S0410000_8 awS16S0410000_8) {
        ((MvChoosePhotoScene) awS16S0410000_8.l0).dismissEnterRecordLoading();
        if (awS16S0410000_8.z4) {
            ((RecordConfig.Builder) awS16S0410000_8.l1).musicStart(Integer.valueOf(((C527600Kmc) awS16S0410000_8.l2).LIZIZ));
            ((RecordConfig.Builder) awS16S0410000_8.l1).musicOrigin((String) ((C259800zU) awS16S0410000_8.l3).element);
            ((MvChoosePhotoScene) awS16S0410000_8.l0).enterRecordAfterCcMusicPrepared((RecordConfig.Builder) awS16S0410000_8.l1, ((C527600Kmc) awS16S0410000_8.l2).LIZ);
        } else {
            ((MvChoosePhotoScene) awS16S0410000_8.l0).enterRecordWithoutMusic((RecordConfig.Builder) awS16S0410000_8.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS16S0410000_8(PublishXServiceImpl publishXServiceImpl, PublishXServiceImpl publishXServiceImpl2, PublishModel publishModel, C259800zU<String> c259800zU, C1434650nR9 c1434650nR9, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l3 = publishXServiceImpl;
        this.l1 = publishXServiceImpl2;
        this.l2 = publishModel;
        this.l0 = c259800zU;
        this.z4 = c1434650nR9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS16S0410000_8(MvChoosePhotoScene mvChoosePhotoScene, MvChoosePhotoScene mvChoosePhotoScene2, boolean z, RecordConfig.Builder builder, C527600Kmc c527600Kmc, C259800zU<String> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = mvChoosePhotoScene;
        this.z4 = mvChoosePhotoScene2;
        this.l1 = z;
        this.l2 = builder;
        this.l3 = c527600Kmc;
    }
}
