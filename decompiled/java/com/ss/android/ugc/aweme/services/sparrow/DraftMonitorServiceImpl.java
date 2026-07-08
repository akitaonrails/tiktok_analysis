package com.ss.android.ugc.aweme.services.sparrow;

import X.AbstractC23140094w;
import X.C01GW;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0CH1;
import X.C0CHQ;
import X.C0XF1;
import X.C13LP;
import X.C1431730nMR;
import X.C15438062q;
import X.C155000ia;
import X.C1697810uHb;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C546230LbZ;
import X.C546300Lbg;
import X.C570260MYe;
import X.C844470XAv;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import X.InterfaceC570360MYo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.DraftFileCheckResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftSavePreProcessException;
import com.ss.android.ugc.aweme.draft.model.DraftSavePreProcessResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ISparrowService;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import njp.a;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftMonitorServiceImpl implements InterfaceC570360MYo {
    public static final Companion Companion = new Companion();
    public final C01GW scope$delegate = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(117));

    public static final class Companion {
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$getDraftLogFilePath$1, reason: invalid class name */
    @C09DV(c = "com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl", f = "DmtSparrowServiceImpl.kt", l = {331}, m = "getDraftLogFilePath")
    public final class AnonymousClass1 extends AbstractC23140094w {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("DraftMonitorServiceImpl@8af7.getDraftLogFilePath$1");
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object draftLogFilePath = DraftMonitorServiceImpl.this.getDraftLogFilePath(null, this);
            C1C7U.LIZIZ("DraftMonitorServiceImpl@8af7.getDraftLogFilePath$1");
            return draftLogFilePath;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$reportDraftRestoreFailureToNeo$1, reason: invalid class name and case insensitive filesystem */
    @C09DV(c = "com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl", f = "DmtSparrowServiceImpl.kt", l = {272}, m = "reportDraftRestoreFailureToNeo")
    public final class C2325971 extends AbstractC23140094w {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C2325971(InterfaceC1364105Vn<? super C2325971> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("DraftMonitorServiceImpl@8af7.reportDraftRestoreFailureToNeo$1");
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objReportDraftRestoreFailureToNeo = DraftMonitorServiceImpl.this.reportDraftRestoreFailureToNeo(null, this);
            C1C7U.LIZIZ("DraftMonitorServiceImpl@8af7.reportDraftRestoreFailureToNeo$1");
            return objReportDraftRestoreFailureToNeo;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$reportDraftSaveFailureToNeo$1, reason: invalid class name and case insensitive filesystem */
    @C09DV(c = "com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl", f = "DmtSparrowServiceImpl.kt", l = {227}, m = "reportDraftSaveFailureToNeo")
    public final class C2325991 extends AbstractC23140094w {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C2325991(InterfaceC1364105Vn<? super C2325991> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("DraftMonitorServiceImpl@8af7.reportDraftSaveFailureToNeo$1");
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objReportDraftSaveFailureToNeo = DraftMonitorServiceImpl.this.reportDraftSaveFailureToNeo(null, this);
            C1C7U.LIZIZ("DraftMonitorServiceImpl@8af7.reportDraftSaveFailureToNeo$1");
            return objReportDraftSaveFailureToNeo;
        }
    }

    private final InterfaceC497601wk getScope() {
        return (InterfaceC497601wk) this.scope$delegate.getValue();
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$reportDraftRestoreFailure$1, reason: invalid class name and case insensitive filesystem */
    @C09DV(c = "com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$reportDraftRestoreFailure$1", f = "DmtSparrowServiceImpl.kt", l = {208}, m = "invokeSuspend")
    public final class C2325961 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ DraftRestoreResult $restoreResult;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2325961(DraftRestoreResult draftRestoreResult, InterfaceC1364105Vn<? super C2325961> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$restoreResult = draftRestoreResult;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return DraftMonitorServiceImpl.this.new C2325961(this.$restoreResult, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("DraftMonitorServiceImpl@8af7.reportDraftRestoreFailure$1");
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                DraftMonitorServiceImpl draftMonitorServiceImpl = DraftMonitorServiceImpl.this;
                DraftRestoreResult draftRestoreResult = this.$restoreResult;
                this.label = 1;
                if (draftMonitorServiceImpl.reportDraftRestoreFailureToNeo(draftRestoreResult, this) == objLJFF) {
                    C1C7U.LIZIZ("DraftMonitorServiceImpl@8af7.reportDraftRestoreFailure$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftMonitorServiceImpl@8af7.reportDraftRestoreFailure$1");
            return unit;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$reportDraftSaveFailure$1, reason: invalid class name and case insensitive filesystem */
    @C09DV(c = "com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$reportDraftSaveFailure$1", f = "DmtSparrowServiceImpl.kt", l = {196}, m = "invokeSuspend")
    public final class C2325981 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ DraftSaveResult $saveResult;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2325981(DraftSaveResult draftSaveResult, InterfaceC1364105Vn<? super C2325981> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$saveResult = draftSaveResult;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return DraftMonitorServiceImpl.this.new C2325981(this.$saveResult, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("DraftMonitorServiceImpl@8af7.reportDraftSaveFailure$1");
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                DraftMonitorServiceImpl draftMonitorServiceImpl = DraftMonitorServiceImpl.this;
                DraftSaveResult draftSaveResult = this.$saveResult;
                this.label = 1;
                if (draftMonitorServiceImpl.reportDraftSaveFailureToNeo(draftSaveResult, this) == objLJFF) {
                    C1C7U.LIZIZ("DraftMonitorServiceImpl@8af7.reportDraftSaveFailure$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftMonitorServiceImpl@8af7.reportDraftSaveFailure$1");
            return unit;
        }
    }

    private final String buildRestoreErrorMessage(DraftRestoreResult draftRestoreResult) {
        DraftFileRestoreException draftFileRestoreException;
        Throwable th;
        String message;
        String str;
        String str2 = "unknown";
        if (!draftRestoreResult.checkResult.isSuc()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FileCheck failed: ");
            DraftFileCheckResult draftFileCheckResult = (DraftFileCheckResult) C13LP.LJJJLL(draftRestoreResult.checkResult.fileCheckResults.blockCreativeList);
            if (draftFileCheckResult != null && (str = draftFileCheckResult.fileName) != null) {
                str2 = str;
            }
            sbLIZ.append(str2);
            sbLIZ.append(", errorCode: ");
            sbLIZ.append(draftRestoreResult.getErrorCode());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!draftRestoreResult.restoreFileResults.isSuc()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("FileRestore failed: ");
            DraftFileRestoreResult draftFileRestoreResult = (DraftFileRestoreResult) C13LP.LJJJLL(draftRestoreResult.restoreFileResults.blockCreativeList);
            if (draftFileRestoreResult != null && (draftFileRestoreException = draftFileRestoreResult.restoreException) != null && (th = draftFileRestoreException.throwable) != null && (message = th.getMessage()) != null) {
                str2 = message;
            }
            sbLIZ2.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Draft restore failed with error code: ");
        sbLIZ3.append(draftRestoreResult.getErrorCode());
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    private final String buildSaveErrorMessage(DraftSaveResult draftSaveResult) {
        String message;
        DraftFileSaveException draftFileSaveException;
        Throwable th;
        String message2;
        String str;
        DraftSavePreProcessException draftSavePreProcessException;
        Throwable th2;
        String message3;
        String str2 = "unknown";
        if (!draftSaveResult.preProcessResults.isSuc()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PreProcess failed: ");
            DraftSavePreProcessResult draftSavePreProcessResult = (DraftSavePreProcessResult) C13LP.LJJJLL(draftSaveResult.preProcessResults.blockCreativeList);
            if (draftSavePreProcessResult != null && (draftSavePreProcessException = draftSavePreProcessResult.preProcessException) != null && (th2 = draftSavePreProcessException.throwable) != null && (message3 = th2.getMessage()) != null) {
                str2 = message3;
            }
            sbLIZ.append(str2);
            sbLIZ.append(", errorCode: ");
            sbLIZ.append(draftSaveResult.getErrorCode());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!draftSaveResult.checkResult.isSuc()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("FileCheck failed: ");
            DraftFileCheckResult draftFileCheckResult = (DraftFileCheckResult) C13LP.LJJJLL(draftSaveResult.checkResult.fileCheckResults.blockCreativeList);
            if (draftFileCheckResult != null && (str = draftFileCheckResult.fileName) != null) {
                str2 = str;
            }
            sbLIZ2.append(str2);
            sbLIZ2.append(", errorCode: ");
            sbLIZ2.append(draftSaveResult.getErrorCode());
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (!draftSaveResult.saveFileResults.isSuc()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("FileSave failed: ");
            DraftFileSaveResult draftFileSaveResult = (DraftFileSaveResult) C13LP.LJJJLL(draftSaveResult.saveFileResults.blockCreativeList);
            if (draftFileSaveResult != null && (draftFileSaveException = draftFileSaveResult.saveException) != null && (th = draftFileSaveException.throwable) != null && (message2 = th.getMessage()) != null) {
                str2 = message2;
            }
            sbLIZ3.append(str2);
            sbLIZ3.append(", errorCode: ");
            sbLIZ3.append(draftSaveResult.getErrorCode());
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (!draftSaveResult.saveDBResult.isSuc()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("DBSave failed: ");
            Throwable th3 = draftSaveResult.saveDBResult.saveException.throwable;
            if (th3 != null && (message = th3.getMessage()) != null) {
                str2 = message;
            }
            sbLIZ4.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ4);
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("Draft save failed with error code: ");
        sbLIZ5.append(draftSaveResult.getErrorCode());
        return C2188811AlT.LIZIZ(sbLIZ5);
    }

    public final Map<String, Object> buildRestoreFailureParams(DraftRestoreResult draftRestoreResult) {
        String effectVersion;
        String vESDKVersion;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("operation_type", 2);
        linkedHashMap.put("creation_id", draftRestoreResult.creationId);
        linkedHashMap.put("draft_version", Integer.valueOf(draftRestoreResult.draftVersion));
        linkedHashMap.put("draft_aweme_type", Integer.valueOf(draftRestoreResult.draftAwemeType));
        linkedHashMap.put("error_code", Integer.valueOf(draftRestoreResult.getErrorCode()));
        linkedHashMap.put("file_tree_info", draftRestoreResult.fileTreeInfo);
        linkedHashMap.put("check_duration", Long.valueOf(draftRestoreResult.checkResult.checkDuration));
        if (!draftRestoreResult.checkResult.isSuc() || (!draftRestoreResult.checkResult.fileCheckResults.notBlockCreativeList.isEmpty())) {
            linkedHashMap.put("check_result", C570260MYe.LIZLLL(draftRestoreResult.checkResult, 6));
        }
        linkedHashMap.put("restore_file_duration", Long.valueOf(draftRestoreResult.restoreFileResults.fileRestoreDuration));
        if (!draftRestoreResult.restoreFileResults.isSuc()) {
            linkedHashMap.put("save_db_result", C570260MYe.LIZLLL(draftRestoreResult.restoreFileResults, 6));
        }
        Throwable th = draftRestoreResult.codeException;
        if (th != null) {
            linkedHashMap.put("code_exception", C201955140j.LJIIJJI(th));
        }
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
        if (iAVSettingsServiceAvSettingsService != null && (vESDKVersion = iAVSettingsServiceAvSettingsService.getVESDKVersion()) != null) {
            linkedHashMap2.put("vesdk_version", vESDKVersion);
        }
        IAVSettingsService iAVSettingsServiceAvSettingsService2 = ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).avSettingsService();
        if (iAVSettingsServiceAvSettingsService2 != null && (effectVersion = iAVSettingsServiceAvSettingsService2.getEffectVersion()) != null) {
            linkedHashMap2.put("effectsdk_version", effectVersion);
        }
        linkedHashMap.put("device_info", GsonProtectorUtils.toJson(DmtSparrowServiceImplKt.getGson(), linkedHashMap2));
        return linkedHashMap;
    }

    public final Map<String, Object> buildSaveFailureParams(DraftSaveResult draftSaveResult) {
        String effectVersion;
        String vESDKVersion;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("operation_type", 1);
        linkedHashMap.put("creation_id", draftSaveResult.creationId);
        linkedHashMap.put("draft_version", Integer.valueOf(draftSaveResult.draftVersion));
        linkedHashMap.put("draft_aweme_type", Integer.valueOf(draftSaveResult.draftAwemeType));
        linkedHashMap.put("save_scene", draftSaveResult.draftScene);
        linkedHashMap.put("error_code", Integer.valueOf(draftSaveResult.getErrorCode()));
        linkedHashMap.put("save_draft_time", draftSaveResult.saveDraftTime);
        linkedHashMap.put("file_tree_info", draftSaveResult.fileTreeInfo);
        linkedHashMap.put("save_pre_process_duration", Long.valueOf(draftSaveResult.preProcessResults.preProcessDuration));
        if (!draftSaveResult.preProcessResults.isSuc() || (!draftSaveResult.preProcessResults.notBlockCreativeList.isEmpty())) {
            linkedHashMap.put("pre_Process_results", C570260MYe.LIZLLL(draftSaveResult.preProcessResults, 6));
        }
        linkedHashMap.put("check_duration", Long.valueOf(draftSaveResult.checkResult.checkDuration));
        if (!draftSaveResult.checkResult.isSuc() || (!draftSaveResult.checkResult.fileCheckResults.notBlockCreativeList.isEmpty())) {
            linkedHashMap.put("check_result", C570260MYe.LIZLLL(draftSaveResult.checkResult, 6));
        }
        linkedHashMap.put("save_file_duration", Long.valueOf(draftSaveResult.saveFileResults.fileSaveDuration));
        if (!draftSaveResult.saveFileResults.isSuc() || (true ^ draftSaveResult.saveFileResults.notBlockCreativeList.isEmpty())) {
            linkedHashMap.put("save_file_result", C570260MYe.LIZLLL(draftSaveResult.saveFileResults, 6));
        }
        linkedHashMap.put("save_db_duration", Long.valueOf(draftSaveResult.saveDBResult.dbSaveDuration));
        if (!draftSaveResult.saveDBResult.isSuc()) {
            linkedHashMap.put("save_db_result", C570260MYe.LIZLLL(draftSaveResult.saveDBResult, 6));
        }
        Throwable th = draftSaveResult.codeException;
        if (th != null) {
            linkedHashMap.put("code_exception", C201955140j.LJIIJJI(th));
        }
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
        if (iAVSettingsServiceAvSettingsService != null && (vESDKVersion = iAVSettingsServiceAvSettingsService.getVESDKVersion()) != null) {
            linkedHashMap2.put("vesdk_version", vESDKVersion);
        }
        IAVSettingsService iAVSettingsServiceAvSettingsService2 = ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).avSettingsService();
        if (iAVSettingsServiceAvSettingsService2 != null && (effectVersion = iAVSettingsServiceAvSettingsService2.getEffectVersion()) != null) {
            linkedHashMap2.put("effectsdk_version", effectVersion);
        }
        linkedHashMap.put("device_info", GsonProtectorUtils.toJson(DmtSparrowServiceImplKt.getGson(), linkedHashMap2));
        return linkedHashMap;
    }

    @Override // X.InterfaceC570360MYo
    public void reportDraftRestoreFailure(DraftRestoreResult draftRestoreResult) {
        if (C0CH1.LIZJ()) {
            C23250099c.LIZLLL(getScope(), null, null, new C2325961(draftRestoreResult, null), 3);
            return;
        }
        ISparrowService iSparrowService = (ISparrowService) PluggableExtentionKt.pluggableSpi$default(ISparrowService.class, false, false, false, 14, null);
        if (iSparrowService == null || iSparrowService.getDraftMonitorService() == null) {
            return;
        }
        new AwS409S0200000_8(this, draftRestoreResult, 18);
    }

    @Override // X.InterfaceC570360MYo
    public void reportDraftSaveFailure(DraftSaveResult draftSaveResult) {
        if (C0CH1.LIZJ()) {
            C23250099c.LIZLLL(getScope(), null, null, new C2325981(draftSaveResult, null), 3);
            return;
        }
        ISparrowService iSparrowService = (ISparrowService) PluggableExtentionKt.pluggableSpi$default(ISparrowService.class, false, false, false, 14, null);
        if (iSparrowService == null || iSparrowService.getDraftMonitorService() == null) {
            return;
        }
        new AwS409S0200000_8(this, draftSaveResult, 21);
    }

    private final List<String> genDraftBusinessTags(String str, CreativeModel creativeModel) {
        List<String> listLJIILJJIL = C1697810uHb.LJIILJJIL(str);
        List<C546230LbZ> listLIZIZ = C546300Lbg.LIZIZ(creativeModel, true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator<C546230LbZ> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ.getTag());
        }
        listLJIILJJIL.addAll(arrayList);
        return listLJIILJJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getDraftLogFilePath(java.lang.String r12, X.InterfaceC1364105Vn<? super java.lang.String> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl.AnonymousClass1
            if (r0 == 0) goto L4d
            r4 = r13
            com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$getDraftLogFilePath$1 r4 = (com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L53
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L5b
            int r0 = r3.length()
            if (r0 <= 0) goto L5b
            return r3
        L2d:
            X.C155000ia.LIZIZ(r3)
            java.lang.Class<com.ss.android.ugc.aweme.service.IDraftFeedbackService> r5 = com.ss.android.ugc.aweme.service.IDraftFeedbackService.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.service.IDraftFeedbackService r0 = (com.ss.android.ugc.aweme.service.IDraftFeedbackService) r0
            if (r0 == 0) goto L5b
            X.C1BWL.LIZ()
            r4.label = r1
            r0.LIZIZ()
            java.lang.String r3 = ""
            if (r3 != r2) goto L22
            return r2
        L4d:
            com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$getDraftLogFilePath$1 r4 = new com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$getDraftLogFilePath$1
            r4.<init>(r13)
            goto L12
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl.getDraftLogFilePath(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reportDraftRestoreFailureToNeo(com.ss.android.ugc.aweme.draft.model.DraftRestoreResult r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl.C2325971
            if (r0 == 0) goto L8d
            r6 = r15
            com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$reportDraftRestoreFailureToNeo$1 r6 = (com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl.C2325971) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8d
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L59
            if (r0 != r4) goto L93
            java.lang.Object r3 = r6.L$1
            com.ss.android.ugc.aweme.service.INeoService r3 = (com.ss.android.ugc.aweme.service.INeoService) r3
            java.lang.Object r14 = r6.L$0
            com.ss.android.ugc.aweme.draft.model.DraftRestoreResult r14 = (com.ss.android.ugc.aweme.draft.model.DraftRestoreResult) r14
            X.C155000ia.LIZIZ(r2)
        L2a:
            java.lang.String r2 = (java.lang.String) r2
            com.ss.android.ugc.aweme.creative.model.CreativeModel r1 = r14.creativeModel
            java.lang.String r0 = "draft_restore_failure"
            r13.genDraftBusinessTags(r0, r1)
            if (r2 == 0) goto L48
            int r0 = r14.getErrorCode()
            java.lang.String.valueOf(r0)
            kotlin.jvm.internal.AwS152S1200000_8 r1 = new kotlin.jvm.internal.AwS152S1200000_8
            r0 = 0
            r1.<init>(r2, r13, r14, r0)
            r3.LIZ()
        L45:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L48:
            int r0 = r14.getErrorCode()
            java.lang.String.valueOf(r0)
            kotlin.jvm.internal.AwS444S0200000_8 r1 = new kotlin.jvm.internal.AwS444S0200000_8
            r0 = 0
            r1.<init>(r13, r14, r0)
            r3.LIZIZ()
            goto L45
        L59:
            X.C155000ia.LIZIZ(r2)
            java.lang.Class<com.ss.android.ugc.aweme.service.ISparrowService> r7 = com.ss.android.ugc.aweme.service.ISparrowService.class
            r8 = 0
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.service.ISparrowService r0 = (com.ss.android.ugc.aweme.service.ISparrowService) r0
            if (r0 == 0) goto L9b
            X.0MYr r3 = r0.LIZ()
            if (r3 == 0) goto L9b
            java.lang.String r2 = r13.buildRestoreErrorMessage(r14)
            java.util.Map r1 = r13.buildRestoreFailureParams(r14)
            java.lang.String r0 = r14.creationId
            r6.L$0 = r14
            r6.L$1 = r3
            r6.L$2 = r2
            r6.L$3 = r1
            r6.label = r4
            java.lang.Object r2 = r13.getDraftLogFilePath(r0, r6)
            if (r2 != r5) goto L2a
            return r5
        L8d:
            com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$reportDraftRestoreFailureToNeo$1 r6 = new com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$reportDraftRestoreFailureToNeo$1
            r6.<init>(r15)
            goto L12
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl.reportDraftRestoreFailureToNeo(com.ss.android.ugc.aweme.draft.model.DraftRestoreResult, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reportDraftSaveFailureToNeo(com.ss.android.ugc.aweme.draft.model.DraftSaveResult r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl.C2325991
            if (r0 == 0) goto L8d
            r6 = r15
            com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$reportDraftSaveFailureToNeo$1 r6 = (com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl.C2325991) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8d
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L59
            if (r0 != r4) goto L93
            java.lang.Object r3 = r6.L$1
            com.ss.android.ugc.aweme.service.INeoService r3 = (com.ss.android.ugc.aweme.service.INeoService) r3
            java.lang.Object r14 = r6.L$0
            com.ss.android.ugc.aweme.draft.model.DraftSaveResult r14 = (com.ss.android.ugc.aweme.draft.model.DraftSaveResult) r14
            X.C155000ia.LIZIZ(r2)
        L2a:
            java.lang.String r2 = (java.lang.String) r2
            com.ss.android.ugc.aweme.creative.model.CreativeModel r1 = r14.creativeModel
            java.lang.String r0 = "draft_save_failure"
            r13.genDraftBusinessTags(r0, r1)
            if (r2 == 0) goto L48
            int r0 = r14.getErrorCode()
            java.lang.String.valueOf(r0)
            kotlin.jvm.internal.AwS152S1200000_8 r1 = new kotlin.jvm.internal.AwS152S1200000_8
            r0 = 1
            r1.<init>(r2, r13, r14, r0)
            r3.LIZ()
        L45:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L48:
            int r0 = r14.getErrorCode()
            java.lang.String.valueOf(r0)
            r0 = 8
            kotlin.jvm.internal.AFwS291S0000000_8 r0 = kotlin.jvm.internal.AFwS291S0000000_8.get$arr$(r0)
            r3.LIZIZ()
            goto L45
        L59:
            X.C155000ia.LIZIZ(r2)
            java.lang.Class<com.ss.android.ugc.aweme.service.ISparrowService> r7 = com.ss.android.ugc.aweme.service.ISparrowService.class
            r8 = 0
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.service.ISparrowService r0 = (com.ss.android.ugc.aweme.service.ISparrowService) r0
            if (r0 == 0) goto L9b
            X.0MYr r3 = r0.LIZ()
            if (r3 == 0) goto L9b
            java.lang.String r2 = r13.buildSaveErrorMessage(r14)
            java.util.Map r1 = r13.buildSaveFailureParams(r14)
            java.lang.String r0 = r14.creationId
            r6.L$0 = r14
            r6.L$1 = r3
            r6.L$2 = r2
            r6.L$3 = r1
            r6.label = r4
            java.lang.Object r2 = r13.getDraftLogFilePath(r0, r6)
            if (r2 != r5) goto L2a
            return r5
        L8d:
            com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$reportDraftSaveFailureToNeo$1 r6 = new com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl$reportDraftSaveFailureToNeo$1
            r6.<init>(r15)
            goto L12
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl.reportDraftSaveFailureToNeo(com.ss.android.ugc.aweme.draft.model.DraftSaveResult, X.05Vn):java.lang.Object");
    }
}
