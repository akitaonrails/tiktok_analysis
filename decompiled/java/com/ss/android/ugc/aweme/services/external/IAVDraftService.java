package com.ss.android.ugc.aweme.services.external;

import X.C0M4J;
import X.C0M4M;
import X.C553680Lna;
import X.C561420M0e;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public interface IAVDraftService {
    public static final Companion Companion = Companion.$$INSTANCE;

    void deletePostedDraft(AwemeDraft awemeDraft);

    ExecutorService draftEntranceShowAndUpdateExecutor();

    void editPostedDraft(Context context, AwemeDraft awemeDraft);

    boolean enableAddDraftLossMonitor();

    boolean enableDraftEntranceShowOpt();

    ExecutorService executor();

    List<String> genCreationIdsOfVisibleDraft();

    Fragment genKidDraftDetailFragment(AwemeDraft awemeDraft);

    IAVDraftFeedbackService getFeedbackService();

    String getSaveDate(AwemeDraft awemeDraft);

    void loadThumbCover(AwemeDraft awemeDraft, VideoCoverConfig videoCoverConfig, IEffectService.OnVideoCoverCallback onVideoCoverCallback);

    void openDraftActivity(Context context, Bundle bundle);

    List<String> queryAllDraftsCreationIdFromDB(C0M4M c0m4m);

    int queryDraftCount(C0M4M c0m4m);

    List<AwemeDraft> queryDraftList(C0M4J c0m4j);

    List<C561420M0e> queryDraftMetaList(C0M4J c0m4j);

    C553680Lna queryDraftsInfo(C0M4M c0m4m);

    List<AwemeDraft> queryDraftsInfoWithLimited(C0M4M c0m4m, int i);

    Object queryPostedDraftByAwemeId(String str, InterfaceC1364105Vn<? super AwemeDraft> interfaceC1364105Vn);

    void registerListener(IDraftListener iDraftListener);

    void reportDraftLostException(List<String> list);

    void saveDraft(SaveDraftByPathParam saveDraftByPathParam);

    void unregisterListener(IDraftListener iDraftListener);

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final IAVDraftService get() {
            IExternalService iExternalService;
            ServiceManager serviceManager = ServiceManager.get();
            if (serviceManager == null || (iExternalService = (IExternalService) serviceManager.getService(IExternalService.class)) == null) {
                return null;
            }
            return iExternalService.draftService();
        }
    }

    public static final class DefaultImpls {
        public static /* synthetic */ void openDraftActivity$default(IAVDraftService iAVDraftService, Context context, Bundle bundle, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    bundle = null;
                }
                iAVDraftService.openDraftActivity(context, bundle);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openDraftActivity");
        }

        public static /* synthetic */ List queryDraftsInfoWithLimited$default(IAVDraftService iAVDraftService, C0M4M c0m4m, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = 2;
                }
                return iAVDraftService.queryDraftsInfoWithLimited(c0m4m, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryDraftsInfoWithLimited");
        }
    }

    public static final class SaveDraftByPathParam {
        public final AIGCOfflineModel aigcOfflineModel;
        public final String coverPath;
        public final String creationId;
        public final CreativeModel creativeModel;
        public final ISaveVideoToDraftListener listener;
        public final Integer saveFrom;
        public final String saveScene;
        public final String shootWay;
        public final boolean skipSaveDraftMobLogging;
        public final boolean skipVideoCompress;
        public final ArrayList<String> urls;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public SaveDraftByPathParam(ArrayList<String> arrayList, String str, String str2, ISaveVideoToDraftListener iSaveVideoToDraftListener) {
            boolean z = false;
            this(arrayList, str, str2, iSaveVideoToDraftListener, null, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 2032, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public SaveDraftByPathParam(ArrayList<String> arrayList, String str, String str2, ISaveVideoToDraftListener iSaveVideoToDraftListener, AIGCOfflineModel aIGCOfflineModel) {
            boolean z = false;
            this(arrayList, str, str2, iSaveVideoToDraftListener, aIGCOfflineModel, null, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 2016, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public SaveDraftByPathParam(ArrayList<String> arrayList, String str, String str2, ISaveVideoToDraftListener iSaveVideoToDraftListener, AIGCOfflineModel aIGCOfflineModel, CreativeModel creativeModel) {
            boolean z = false;
            this(arrayList, str, str2, iSaveVideoToDraftListener, aIGCOfflineModel, creativeModel, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 1984, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SaveDraftByPathParam(ArrayList<String> arrayList, String str, String str2, ISaveVideoToDraftListener iSaveVideoToDraftListener, AIGCOfflineModel aIGCOfflineModel, CreativeModel creativeModel, boolean z) {
            this(arrayList, str, str2, iSaveVideoToDraftListener, aIGCOfflineModel, creativeModel, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 1920, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SaveDraftByPathParam(ArrayList<String> arrayList, String str, String str2, ISaveVideoToDraftListener iSaveVideoToDraftListener, AIGCOfflineModel aIGCOfflineModel, CreativeModel creativeModel, boolean z, String str3) {
            this(arrayList, str, str2, iSaveVideoToDraftListener, aIGCOfflineModel, creativeModel, z, str3, null, 0 == true ? 1 : 0, false, 1792, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SaveDraftByPathParam(ArrayList<String> arrayList, String str, String str2, ISaveVideoToDraftListener iSaveVideoToDraftListener, AIGCOfflineModel aIGCOfflineModel, CreativeModel creativeModel, boolean z, String str3, String str4) {
            this(arrayList, str, str2, iSaveVideoToDraftListener, aIGCOfflineModel, creativeModel, z, str3, str4, null, false, 1536, 0 == true ? 1 : 0);
        }

        public SaveDraftByPathParam(ArrayList<String> arrayList, String str, String str2, ISaveVideoToDraftListener iSaveVideoToDraftListener, AIGCOfflineModel aIGCOfflineModel, CreativeModel creativeModel, boolean z, String str3, String str4, Integer num) {
            this(arrayList, str, str2, iSaveVideoToDraftListener, aIGCOfflineModel, creativeModel, z, str3, str4, num, false, 1024, null);
        }

        public SaveDraftByPathParam(ArrayList<String> arrayList, String str, String str2, ISaveVideoToDraftListener iSaveVideoToDraftListener, AIGCOfflineModel aIGCOfflineModel, CreativeModel creativeModel, boolean z, String str3, String str4, Integer num, boolean z2) {
            this.urls = arrayList;
            this.creationId = str;
            this.shootWay = str2;
            this.listener = iSaveVideoToDraftListener;
            this.aigcOfflineModel = aIGCOfflineModel;
            this.creativeModel = creativeModel;
            this.skipVideoCompress = z;
            this.coverPath = str3;
            this.saveScene = str4;
            this.saveFrom = num;
            this.skipSaveDraftMobLogging = z2;
        }

        public /* synthetic */ SaveDraftByPathParam(ArrayList arrayList, String str, String str2, ISaveVideoToDraftListener iSaveVideoToDraftListener, AIGCOfflineModel aIGCOfflineModel, CreativeModel creativeModel, boolean z, String str3, String str4, Integer num, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(arrayList, str, str2, iSaveVideoToDraftListener, (i & 16) != 0 ? null : aIGCOfflineModel, (i & 32) != 0 ? null : creativeModel, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) == 0 ? num : null, (i & 1024) != 0 ? false : z2);
        }
    }
}
