package com.ss.android.ugc.aweme.creation.sender;

import X.AbstractC873650YPb;
import X.C01GW;
import X.C09N1;
import X.C0I0B;
import X.C0IC5;
import X.C0W7J;
import X.C0WZX;
import X.C0Y3I;
import X.C0YC6;
import X.C0YHT;
import X.C0YHX;
import X.C0YM2;
import X.C0YNP;
import X.C0YOY;
import X.C0YOZ;
import X.C0YPU;
import X.C0YS1;
import X.C0YTK;
import X.C1336205Ku;
import X.C13LQ;
import X.C14EU;
import X.C1668706g9;
import X.C1777570wMF;
import X.C1DUQ;
import X.C1DUR;
import X.C1DUU;
import X.C1DUZ;
import X.C1DV4;
import X.C1DV5;
import X.C1DV8;
import X.C1DV9;
import X.C1DVG;
import X.C1DVI;
import X.C1DVK;
import X.C1DVL;
import X.C1DVS;
import X.C1DVY;
import X.C20478080m;
import X.C21682519tP;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2241941Coy;
import X.C2242321Cpa;
import X.C2242351Cpd;
import X.C2242771CqJ;
import X.C2242791CqL;
import X.C2256581DUa;
import X.C2256591DUb;
import X.C2256621DUe;
import X.C2256701DUm;
import X.C2256741DUq;
import X.C2256751DUr;
import X.C2256771DUt;
import X.C2256791DUv;
import X.C2256801DUw;
import X.C2256841DVa;
import X.C2256871DVd;
import X.C2260008tK;
import X.C452501pT;
import X.C455040Hss;
import X.C461720I8s;
import X.C622680Oba;
import X.C869590Y9l;
import X.C873450YOh;
import X.C873500YOm;
import X.C874390YRx;
import X.C874410YRz;
import X.C875420YVw;
import X.C882760Yk6;
import X.C888360Yt8;
import X.C894660Z7w;
import X.C896400ZEo;
import X.EnumC1446110njd;
import X.EnumC2249731D3r;
import X.EnumC2249741D3s;
import X.InterfaceC1383710m6z;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.dm.DMPublishService;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes36.dex */
public final class MediaMsgSendManager implements IMediaMsgSendManager {
    public static final MediaMsgSendManager LIZ = new MediaMsgSendManager();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0W7J());

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Service implements IMediaMsgSendManager {
        public final /* synthetic */ MediaMsgSendManager LIZ = MediaMsgSendManager.LIZ;

        @Override // com.ss.android.ugc.aweme.creation.sender.IMediaMsgSendManager
        public final void LIZ(C0Y3I c0y3i, C869590Y9l c869590Y9l) {
            this.LIZ.LIZ(c0y3i, c869590Y9l);
        }

        @Override // com.ss.android.ugc.aweme.creation.sender.IMediaMsgSendManager
        public final void LIZIZ(String str, List<? extends MediaModel> list, String str2, C0YTK c0ytk, Map<String, String> map, Map<String, String> map2, QuoteMode quoteMode, BaseHeaderComponent baseHeaderComponent, FeatureAttachmentData featureAttachmentData) {
            this.LIZ.LIZIZ(str, list, str2, c0ytk, map, map2, quoteMode, baseHeaderComponent, featureAttachmentData);
        }

        @Override // com.ss.android.ugc.aweme.creation.sender.IMediaMsgSendManager
        public final void LIZJ(C0Y3I c0y3i, C869590Y9l c869590Y9l) {
            this.LIZ.LIZJ(c0y3i, c869590Y9l);
        }

        @Override // com.ss.android.ugc.aweme.creation.sender.IMediaMsgSendManager
        public final void init() {
            this.LIZ.init();
        }
    }

    @Override // com.ss.android.ugc.aweme.creation.sender.IMediaMsgSendManager
    public final synchronized void init() {
        if (C622680Oba.LIZ(this)) {
            return;
        }
        C622680Oba.LIZJ(this);
    }

    public static FeatureAttachmentData LIZLLL(QuoteMode.Thought thought) {
        AttachmentTypeComponent attachmentTypeComponent = AttachmentTypeComponent.ATTACHMENT_TYPE_THOUGHT;
        String str = thought.id;
        long j = thought.uid;
        long j2 = thought.originalCreateTime;
        String str2 = thought.content;
        if (str2 == null) {
            str2 = "";
        }
        return new FeatureAttachmentData(attachmentTypeComponent, str, j, j2, new TextComponent(str2, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public static void LJFF(MediaModel mediaModel) {
        InputStream inputStreamLJFF;
        ?? r3;
        ExifInterface exifInterface;
        C0I0B c0i0b;
        ?? r32;
        ?? LJFF = "init exif fail: ";
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(43));
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = true;
        options.inJustDecodeBounds = true;
        ?? r4 = 0;
        try {
            if (((InterfaceC1383710m6z) c01gwLIZIZ.getValue()).LJI(mediaModel.LJFF())) {
                BitmapFactory.decodeFile(mediaModel.LJFF(), options);
                exifInterface = new ExifInterface(mediaModel.LJFF());
                r32 = 0;
            } else {
                try {
                    c0i0b = C0I0B.LJFF;
                    inputStreamLJFF = C09N1.LJFF(C894660Z7w.LIZ(), Uri.parse(mediaModel.LJFF()));
                } catch (Exception e) {
                    e = e;
                    inputStreamLJFF = null;
                }
                try {
                    LJFF = C09N1.LJFF(C894660Z7w.LIZ(), Uri.parse(mediaModel.LJFF()));
                    r3 = LJFF;
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    C0YS1.LIZJ("MediaMsgSendManager", ((String) LJFF) + e);
                    r3 = 0;
                }
                try {
                    BitmapFactory.decodeStream(inputStreamLJFF, null, options);
                    if (r3 != 0 && Build.VERSION.SDK_INT >= 24) {
                        exifInterface = new ExifInterface((InputStream) r3);
                        r32 = r3;
                    } else {
                        InterfaceC1383710m6z interfaceC1383710m6z = (InterfaceC1383710m6z) c01gwLIZIZ.getValue();
                        String strLIZ = interfaceC1383710m6z.LIZ(C894660Z7w.LIZ(), mediaModel.LJFF());
                        if (strLIZ != null) {
                            exifInterface = new ExifInterface(strLIZ);
                            r32 = r3;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    r4 = r3;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C0YS1.LIZJ("MediaMsgSendManager", th.toString());
                        C2260008tK.LIZ(r4);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C2260008tK.LIZ(r4);
                        throw th2;
                    }
                }
            }
            try {
                int iLJLILLLLZI = C2204961BRm.LJLILLLLZI(exifInterface, 0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOm6Zp7a1T29NQkzjM0+Q9vwPFHP3D0BibKgwMjO2EPvYgRy", null));
                if (iLJLILLLLZI != 6 && iLJLILLLLZI != 8) {
                    z = false;
                }
                C2260008tK.LIZ(r32);
                if (z) {
                    int i = mediaModel.width;
                    mediaModel.width = mediaModel.height;
                    mediaModel.height = i;
                }
            } catch (Throwable th3) {
                th = th3;
                r4 = r32;
                TryCatchGuardChecker.doCheck(th);
                C0YS1.LIZJ("MediaMsgSendManager", th.toString());
                C2260008tK.LIZ(r4);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x018f  */
    @X.C14EU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAIGroupShotPublish(com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent.AIGroupShotPhotoPublishEvent r32) {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creation.sender.MediaMsgSendManager.onAIGroupShotPublish(com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent$AIGroupShotPhotoPublishEvent):void");
    }

    @C14EU
    public final void onAlbumSelected(IMMediaPublishEvent.DMAlbumMediaPublishEvent dMAlbumMediaPublishEvent) {
        LinkedHashMap linkedHashMap;
        final String string;
        if (dMAlbumMediaPublishEvent.getSessionId().length() == 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaMsgSendManager onAlbumSelected size=");
        sbLIZ.append(dMAlbumMediaPublishEvent.getMediaModelList().size());
        C21682519tP.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(dMAlbumMediaPublishEvent.getMobMap());
        Map<String, String> mobMapV2 = dMAlbumMediaPublishEvent.getMobMapV2();
        C0YTK c0ytk = null;
        if (mobMapV2 != null) {
            linkedHashMap = new LinkedHashMap(mobMapV2);
        } else {
            linkedHashMap = null;
        }
        String messageScene = dMAlbumMediaPublishEvent.getMessageScene();
        if (messageScene != null) {
            linkedHashMap2.put("__message_scene", messageScene);
            if (linkedHashMap != null) {
                linkedHashMap.put("__message_scene", messageScene);
            }
        }
        String sessionId = dMAlbumMediaPublishEvent.getSessionId();
        List<? extends MediaModel> mediaModelList = dMAlbumMediaPublishEvent.getMediaModelList();
        QuoteMode quoteMode = dMAlbumMediaPublishEvent.getQuoteMode();
        BaseHeaderComponent baseHeaderComponent = dMAlbumMediaPublishEvent.getBaseHeaderComponent();
        FeatureAttachmentData featureAttachmentData = dMAlbumMediaPublishEvent.getFeatureAttachmentData();
        final String sessionId2 = dMAlbumMediaPublishEvent.getSessionId();
        String appendText = dMAlbumMediaPublishEvent.getAppendText();
        final int size = dMAlbumMediaPublishEvent.getMediaModelList().size();
        if (appendText == null || (string = a0.LJLIIIL(appendText).toString()) == null) {
            string = "";
        }
        if (string.length() != 0 && size > 0) {
            c0ytk = new C0YTK() { // from class: X.06th
                public final AtomicInteger LIZ = new AtomicInteger(0);
                public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

                @Override // X.C0YTK
                public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list, Map<C869590Y9l, C0YMW> map) {
                }

                @Override // X.C0YTY
                public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list) {
                }

                @Override // X.C0YTK
                public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                }

                @Override // X.C0YTK
                public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                }

                @Override // X.C0YTK
                public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
                }

                @Override // X.C0YTY
                public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                    if (this.LIZ.incrementAndGet() >= size && this.LIZIZ.compareAndSet(false, true)) {
                        CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
                        C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
                        c874730YTfLIZ.LIZIZ.LJFF = sessionId2;
                        c874730YTfLIZ.LIZIZ(TextContent.Companion.obtain(string, null, null, null, null, null));
                        c874730YTfLIZ.LJ();
                    }
                }
            };
        }
        LIZIZ(sessionId, mediaModelList, null, c0ytk, linkedHashMap2, linkedHashMap, quoteMode, baseHeaderComponent, featureAttachmentData);
    }

    @C14EU
    public final void onSendMsgFromRecordPage(IMMediaPublishEvent.DMRecordMediaPublishEvent dMRecordMediaPublishEvent) {
        if (dMRecordMediaPublishEvent.getSessionId().length() == 0) {
            return;
        }
        C21682519tP.LIZ("MediaMsgSendManager onSendMsgFromRecordPage");
        LinkedHashMap linkedHashMap = new LinkedHashMap(dMRecordMediaPublishEvent.getMobMap());
        C1668706g9 c1668706g9 = IIMBusinessChatService.LIZ;
        linkedHashMap.put("account_type", C1668706g9.LIZ(c1668706g9).LJIILJJIL().LIZIZ(C461720I8s.LIZJ()));
        linkedHashMap.put("other_user_account_type", C1668706g9.LIZ(c1668706g9).LJIILJJIL().LIZIZ(C0YNP.LJII(dMRecordMediaPublishEvent.getSessionId())));
        C0Y3I c0y3i = new C0Y3I("subscribing to DMRecordMediaPublishEvent");
        String sessionId = dMRecordMediaPublishEvent.getSessionId();
        BaseShortVideoContext editModel = dMRecordMediaPublishEvent.getEditModel();
        boolean zIsFromMainPost = dMRecordMediaPublishEvent.isFromMainPost();
        boolean skipExtractVideoCover = dMRecordMediaPublishEvent.getSkipExtractVideoCover();
        String videoCoverPath = dMRecordMediaPublishEvent.getVideoCoverPath();
        Pair<Integer, Integer> videoCoverSize = dMRecordMediaPublishEvent.getVideoCoverSize();
        boolean zIsFromDMTextIcon = dMRecordMediaPublishEvent.isFromDMTextIcon();
        boolean hasText = dMRecordMediaPublishEvent.getHasText();
        String photoSwapScene = dMRecordMediaPublishEvent.getPhotoSwapScene();
        String photoSwapPairedMsgId = dMRecordMediaPublishEvent.getPhotoSwapPairedMsgId();
        String systemShareFrom = dMRecordMediaPublishEvent.getSystemShareFrom();
        boolean zIsHighLightVideo = dMRecordMediaPublishEvent.isHighLightVideo();
        boolean zIsFromQuickLiveReact = dMRecordMediaPublishEvent.isFromQuickLiveReact();
        DMPublishService dMPublishService = DMPublishService.INSTANCE;
        LJ(this, c0y3i, sessionId, editModel, zIsFromMainPost, skipExtractVideoCover, videoCoverPath, videoCoverSize, zIsFromDMTextIcon, hasText, photoSwapScene, photoSwapPairedMsgId, linkedHashMap, systemShareFrom, zIsHighLightVideo, false, zIsFromQuickLiveReact, dMPublishService.getQuoteMode(dMRecordMediaPublishEvent.getEditModel()), dMPublishService.getBaseHeaderComponent(dMRecordMediaPublishEvent.getEditModel()), dMPublishService.getFeatureAttachmentData(dMRecordMediaPublishEvent.getEditModel()), 16384);
        String enterDM = dMPublishService.getEnterDM(dMRecordMediaPublishEvent.getEditModel());
        if (Intrinsics.LJFF(enterDM, "video_detail_camera_icon")) {
            C1336205Ku.LIZ(false).getCameraEffectService().LIZ(dMRecordMediaPublishEvent.getSessionId());
        } else {
            if (!Intrinsics.LJFF(enterDM, "inbox_camera_icon")) {
                return;
            }
            C888360Yt8.LIZ(dMRecordMediaPublishEvent.getSessionId());
        }
    }

    @C14EU
    public final void onSendMultiMsgFromRecordPage(IMMediaPublishEvent.DMRecordMultiMediaPublishEvent dMRecordMultiMediaPublishEvent) {
        if (dMRecordMultiMediaPublishEvent.getSessionId().length() == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(dMRecordMultiMediaPublishEvent.getMobMap());
        C1668706g9 c1668706g9 = IIMBusinessChatService.LIZ;
        linkedHashMap.put("account_type", C1668706g9.LIZ(c1668706g9).LJIILJJIL().LIZIZ(C461720I8s.LIZJ()));
        linkedHashMap.put("other_user_account_type", C1668706g9.LIZ(c1668706g9).LJIILJJIL().LIZIZ(C0YNP.LJII(dMRecordMultiMediaPublishEvent.getSessionId())));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaMsgSendManager onSendMultiMsgFromRecordPage size=");
        sbLIZ.append(dMRecordMultiMediaPublishEvent.getEditModels().size());
        C21682519tP.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        for (IMMediaPublishEvent.MultiEditModel multiEditModel : dMRecordMultiMediaPublishEvent.getEditModels()) {
            MediaMsgSendManager mediaMsgSendManager = LIZ;
            C0Y3I c0y3i = new C0Y3I("subscribing to DMRecordMediaPublishEvent");
            String sessionId = dMRecordMultiMediaPublishEvent.getSessionId();
            BaseShortVideoContext baseShortVideoContext = multiEditModel.editModel;
            boolean zIsFromMainPost = dMRecordMultiMediaPublishEvent.isFromMainPost();
            boolean z = multiEditModel.skipExtractVideoCover;
            String str = multiEditModel.videoCoverPath;
            Pair<Integer, Integer> pair = multiEditModel.videoCoverSize;
            boolean zIsFromDMTextIcon = dMRecordMultiMediaPublishEvent.isFromDMTextIcon();
            boolean hasText = dMRecordMultiMediaPublishEvent.getHasText();
            String systemShareFrom = dMRecordMultiMediaPublishEvent.getSystemShareFrom();
            DMPublishService dMPublishService = DMPublishService.INSTANCE;
            LJ(mediaMsgSendManager, c0y3i, sessionId, baseShortVideoContext, zIsFromMainPost, z, str, pair, zIsFromDMTextIcon, hasText, null, null, linkedHashMap, systemShareFrom, false, dMPublishService.getIsStoryImmersiveReply(multiEditModel.editModel), false, dMPublishService.getQuoteMode(multiEditModel.editModel), dMPublishService.getBaseHeaderComponent(multiEditModel.editModel), dMPublishService.getFeatureAttachmentData(multiEditModel.editModel), 32768);
            String enterDM = dMPublishService.getEnterDM(multiEditModel.editModel);
            if (Intrinsics.LJFF(enterDM, "video_detail_camera_icon")) {
                C1336205Ku.LIZ(false).getCameraEffectService().LIZ(dMRecordMultiMediaPublishEvent.getSessionId());
            } else if (Intrinsics.LJFF(enterDM, "inbox_camera_icon")) {
                C888360Yt8.LIZ(dMRecordMultiMediaPublishEvent.getSessionId());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.creation.sender.IMediaMsgSendManager
    public final void LIZ(final C0Y3I c0y3i, final C869590Y9l c869590Y9l) {
        C0YC6 next;
        C0YHX c0yhxLIZ;
        C0YOZ c0yozLJFF;
        C0YHX c0yhxLIZ2;
        C0YOZ c0yozLJFF2;
        C0YC6 next2;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        C0YHX c0yhxLIZ3;
        C0YOZ c0yozLJFF3;
        C2242321Cpa c2242321Cpa;
        C2242771CqJ c2242771CqJ;
        C21682519tP.LIZ("MediaMsgSendManager retrySendPhotoMessage");
        C2256591DUb.LIZ.getClass();
        boolean z = false;
        final C2256701DUm c2256701DUm = new C2256701DUm(System.currentTimeMillis(), z, z, EnumC1446110njd.PHOTO, 1, (boolean) (1 == true ? 1 : 0), c869590Y9l.getUuid(), z, (Long) null, c869590Y9l.getLocalExt().get("enter_method"), 776);
        List<C0YC6> attachments = c869590Y9l.getAttachments();
        if (attachments != null) {
            Iterator<C0YC6> it2 = attachments.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.index == 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0YC6 c0yc6 = next;
            if (c0yc6 != null) {
                C2256591DUb c2256591DUb = C2256591DUb.LIZ;
                c2256591DUb.getClass();
                int uploadState = c0yc6.getUploadState();
                if (uploadState == EnumC2249741D3s.UPLOADED.getState()) {
                    List<C0YC6> attachments2 = c869590Y9l.getAttachments();
                    if (attachments2 != null) {
                        Iterator<C0YC6> it3 = attachments2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                                if (next2.index == 1) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        C0YC6 c0yc62 = next2;
                        if (c0yc62 != null && c0yc62.getUri() != null) {
                            c0yc62.getOriginalWidth();
                            c0yc62.getOriginalHeight();
                            if (c0yc62.getSecretKey() != null) {
                                C2256591DUb c2256591DUb2 = C2256591DUb.LIZ;
                                String scene = c869590Y9l.getScene();
                                if (scene == null) {
                                    scene = "";
                                }
                                String str = c869590Y9l.getExt().get("effect_id");
                                boolean zLJFF = Intrinsics.LJFF(c869590Y9l.getLocalExt().get("is_dm_text_icon"), "1");
                                boolean zLJFF2 = Intrinsics.LJFF(c869590Y9l.getLocalExt().get("has_text"), "1");
                                String strLIZLLL = C896400ZEo.LIZLLL(c869590Y9l);
                                ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
                                C2241941Coy c2241941CoyDecode = protoAdapter.decode(c869590Y9l.getContentPB());
                                if (c2241941CoyDecode != null && (c2242771CqJ = c2241941CoyDecode.attachment) != null) {
                                    attachmentComponentLIZ = C2242791CqL.LIZ(c2242771CqJ);
                                } else {
                                    attachmentComponentLIZ = null;
                                }
                                C2241941Coy c2241941CoyDecode2 = protoAdapter.decode(c869590Y9l.getContentPB());
                                if (c2241941CoyDecode2 != null && (c2242321Cpa = c2241941CoyDecode2.header) != null) {
                                    baseHeaderComponentLIZIZ = C2242351Cpd.LIZIZ(c2242321Cpa);
                                } else {
                                    baseHeaderComponentLIZIZ = null;
                                }
                                c2256591DUb2.getClass();
                                c869590Y9l.setContentPB(C2256591DUb.LIZ(scene, str, zLJFF, zLJFF2, strLIZLLL, attachmentComponentLIZ, baseHeaderComponentLIZIZ).encode());
                                if (C455040Hss.LIZ()) {
                                    C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
                                    IIMCoreProxyService.LIZ.getClass();
                                    IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
                                    if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ3 = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) != null && (c0yozLJFF3 = c0yhxLIZ3.LJFF()) != null) {
                                        c0yozLJFF3.LIZ(new C873450YOh(c869590Y9l.getUuid(), null, c0y3i.LIZ()), new C0IC5(null, 3), new C0YOY() { // from class: X.1DVm
                                            @Override // X.C0YOY
                                            public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                                                if (interfaceC873750YPl instanceof C0YPL) {
                                                    C2256591DUb c2256591DUb3 = C2256591DUb.LIZ;
                                                    C2256701DUm c2256701DUmLIZ = C2256701DUm.LIZ(c2256701DUm, EnumC2249731D3r.UPLOADED, null, false, 2039);
                                                    C0Y3I c0y3i2 = c0y3i;
                                                    C869590Y9l c869590Y9l2 = ((C0YPL) interfaceC873750YPl).LIZIZ;
                                                    c2256591DUb3.getClass();
                                                    C2256591DUb.LJFF(c2256701DUmLIZ, c0y3i2, c869590Y9l2);
                                                    return;
                                                }
                                                if (!(interfaceC873750YPl instanceof C0YQ0)) {
                                                    return;
                                                }
                                                C2256591DUb c2256591DUb4 = C2256591DUb.LIZ;
                                                C2256701DUm c2256701DUmLIZ2 = C2256701DUm.LIZ(c2256701DUm, EnumC2249731D3r.UPLOADED, null, false, 2039);
                                                C0Y3I c0y3i3 = c0y3i;
                                                C0YQ0 c0yq0 = (C0YQ0) interfaceC873750YPl;
                                                C869590Y9l c869590Y9l3 = c0yq0.LIZIZ;
                                                if (c869590Y9l3 == null) {
                                                    c869590Y9l3 = c869590Y9l;
                                                }
                                                C0YMW iMError = c0yq0.LIZJ.toIMError();
                                                c2256591DUb4.getClass();
                                                C2256591DUb.LJ(c2256701DUmLIZ2, c0y3i3, c869590Y9l3, iMError, "retry_from_uploaded_sdk_fail");
                                            }
                                        });
                                        return;
                                    } else {
                                        C2256591DUb.LJ(C2256701DUm.LIZ(c2256701DUm, EnumC2249731D3r.UPLOADED, null, false, 2039), c0y3i, null, null, "message_manager_unavail");
                                        return;
                                    }
                                }
                                C882760Yk6.LIZ(C882760Yk6.LIZ).LIZJ(new C873500YOm((C0YHT) new C0YPU(c869590Y9l), (List) null, new C0YOY() { // from class: X.1DVn
                                    @Override // X.C0YOY
                                    public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                                        if (interfaceC873750YPl instanceof C0YPL) {
                                            C2256591DUb c2256591DUb3 = C2256591DUb.LIZ;
                                            C2256701DUm c2256701DUmLIZ = C2256701DUm.LIZ(c2256701DUm, EnumC2249731D3r.UPLOADED, null, false, 2039);
                                            C0Y3I c0y3i2 = c0y3i;
                                            C869590Y9l c869590Y9l2 = ((C0YPL) interfaceC873750YPl).LIZIZ;
                                            c2256591DUb3.getClass();
                                            C2256591DUb.LJFF(c2256701DUmLIZ, c0y3i2, c869590Y9l2);
                                            return;
                                        }
                                        if (!(interfaceC873750YPl instanceof C0YQ0)) {
                                            return;
                                        }
                                        C2256591DUb c2256591DUb4 = C2256591DUb.LIZ;
                                        C2256701DUm c2256701DUmLIZ2 = C2256701DUm.LIZ(c2256701DUm, EnumC2249731D3r.UPLOADED, null, false, 2039);
                                        C0Y3I c0y3i3 = c0y3i;
                                        C0YQ0 c0yq0 = (C0YQ0) interfaceC873750YPl;
                                        C869590Y9l c869590Y9l3 = c0yq0.LIZIZ;
                                        C0YMW iMError = c0yq0.LIZJ.toIMError();
                                        c2256591DUb4.getClass();
                                        C2256591DUb.LJ(c2256701DUmLIZ2, c0y3i3, c869590Y9l3, iMError, "retry_from_uploaded_sdk_fail");
                                    }
                                }, c0y3i.LIZ(), false, 38));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (uploadState == EnumC2249741D3s.SYNTHESISED.getState()) {
                    if (C455040Hss.LIZ()) {
                        C0YM2 c0ym22 = C0YM2.TIKTOK_SOCIAL_IM;
                        IIMCoreProxyService.LIZ.getClass();
                        IIMCoreProxyService iIMCoreProxyServiceLIZ2 = C875420YVw.LIZ();
                        if (iIMCoreProxyServiceLIZ2 != null && (c0yhxLIZ2 = iIMCoreProxyServiceLIZ2.LIZ(c0ym22)) != null && (c0yozLJFF2 = c0yhxLIZ2.LJFF()) != null) {
                            c0yozLJFF2.LIZ(new C873450YOh(c869590Y9l.getUuid(), C13LQ.LJIJI(new AbstractC873650YPb[]{new C874390YRx(), new C2256621DUe(c869590Y9l, c0yc6, c2256701DUm, c0y3i.LIZ(), new C2256741DUq(new C1DVL(c2256591DUb), new C1DV4(c2256591DUb), new C2256751DUr(c2256591DUb), new C1DVS(c2256591DUb)), true), C2256591DUb.LIZIZ(c0y3i), new C874410YRz()}), c0y3i.LIZ()), new C0IC5(null, 3), new C0YOY() { // from class: X.1DVz
                                @Override // X.C0YOY
                                public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                                    if (interfaceC873750YPl instanceof C0YPL) {
                                        C2256591DUb c2256591DUb3 = C2256591DUb.LIZ;
                                        C2256701DUm c2256701DUm2 = c2256701DUm;
                                        C0Y3I c0y3i2 = c0y3i;
                                        C869590Y9l c869590Y9l2 = ((C0YPL) interfaceC873750YPl).LIZIZ;
                                        c2256591DUb3.getClass();
                                        C2256591DUb.LJFF(c2256701DUm2, c0y3i2, c869590Y9l2);
                                        return;
                                    }
                                    if (!(interfaceC873750YPl instanceof C0YQ0)) {
                                        return;
                                    }
                                    C2256591DUb c2256591DUb4 = C2256591DUb.LIZ;
                                    C2256701DUm c2256701DUm3 = c2256701DUm;
                                    C0Y3I c0y3i3 = c0y3i;
                                    C0YQ0 c0yq0 = (C0YQ0) interfaceC873750YPl;
                                    C869590Y9l c869590Y9l3 = c0yq0.LIZIZ;
                                    C0YMW iMError = c0yq0.LIZJ.toIMError();
                                    c2256591DUb4.getClass();
                                    C2256591DUb.LJ(c2256701DUm3, c0y3i3, c869590Y9l3, iMError, "retry_from_synthesised_sdk_fail");
                                }
                            });
                            return;
                        } else {
                            C2256591DUb.LJ(c2256701DUm, c0y3i, null, null, "message_manager_unavail");
                            return;
                        }
                    }
                    C882760Yk6.LIZ(C882760Yk6.LIZ).LIZJ(new C873500YOm((C0YHT) new C0YPU(c869590Y9l), C13LQ.LJIJI(new AbstractC873650YPb[]{new C874390YRx(), new C2256621DUe(c869590Y9l, c0yc6, c2256701DUm, c0y3i.LIZ(), new C2256741DUq(new C1DVG(c2256591DUb), new C1DV5(c2256591DUb), new C2256771DUt(c2256591DUb), new C1DVY(c2256591DUb)), true), C2256591DUb.LIZIZ(c0y3i), new C874410YRz()}), new C0YOY() { // from class: X.1DW1
                        @Override // X.C0YOY
                        public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                            if (interfaceC873750YPl instanceof C0YPL) {
                                C2256591DUb c2256591DUb3 = C2256591DUb.LIZ;
                                C2256701DUm c2256701DUm2 = c2256701DUm;
                                C0Y3I c0y3i2 = c0y3i;
                                C869590Y9l c869590Y9l2 = ((C0YPL) interfaceC873750YPl).LIZIZ;
                                c2256591DUb3.getClass();
                                C2256591DUb.LJFF(c2256701DUm2, c0y3i2, c869590Y9l2);
                                return;
                            }
                            if (!(interfaceC873750YPl instanceof C0YQ0)) {
                                return;
                            }
                            C2256591DUb c2256591DUb4 = C2256591DUb.LIZ;
                            C2256701DUm c2256701DUm3 = c2256701DUm;
                            C0Y3I c0y3i3 = c0y3i;
                            C0YQ0 c0yq0 = (C0YQ0) interfaceC873750YPl;
                            C869590Y9l c869590Y9l3 = c0yq0.LIZIZ;
                            C0YMW iMError = c0yq0.LIZJ.toIMError();
                            c2256591DUb4.getClass();
                            C2256591DUb.LJ(c2256701DUm3, c0y3i3, c869590Y9l3, iMError, "retry_from_synthesised_sdk_fail");
                        }
                    }, c0y3i.LIZ(), false, 36));
                    return;
                }
                if (C455040Hss.LIZ()) {
                    C0YM2 c0ym23 = C0YM2.TIKTOK_SOCIAL_IM;
                    IIMCoreProxyService.LIZ.getClass();
                    IIMCoreProxyService iIMCoreProxyServiceLIZ3 = C875420YVw.LIZ();
                    if (iIMCoreProxyServiceLIZ3 != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ3.LIZ(c0ym23)) != null && (c0yozLJFF = c0yhxLIZ.LJFF()) != null) {
                        c0yozLJFF.LIZ(new C873450YOh(c869590Y9l.getUuid(), C13LQ.LJIJI(new AbstractC873650YPb[]{new C874390YRx(), new C2256621DUe(c869590Y9l, c0yc6, c2256701DUm, c0y3i.LIZ(), new C2256741DUq(new C1DVI(c2256591DUb), new C1DV8(c2256591DUb), new C2256791DUv(c2256591DUb), new C2256841DVa(c2256591DUb))), C2256591DUb.LIZIZ(c0y3i), new C874410YRz()}), c0y3i.LIZ()), new C0IC5(null, 3), new C0YOY() { // from class: X.1DW2
                            @Override // X.C0YOY
                            public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                                if (interfaceC873750YPl instanceof C0YPL) {
                                    C2256591DUb c2256591DUb3 = C2256591DUb.LIZ;
                                    C2256701DUm c2256701DUm2 = c2256701DUm;
                                    C0Y3I c0y3i2 = c0y3i;
                                    C869590Y9l c869590Y9l2 = ((C0YPL) interfaceC873750YPl).LIZIZ;
                                    c2256591DUb3.getClass();
                                    C2256591DUb.LJFF(c2256701DUm2, c0y3i2, c869590Y9l2);
                                    return;
                                }
                                if (!(interfaceC873750YPl instanceof C0YQ0)) {
                                    return;
                                }
                                C2256591DUb c2256591DUb4 = C2256591DUb.LIZ;
                                C2256701DUm c2256701DUm3 = c2256701DUm;
                                C0Y3I c0y3i3 = c0y3i;
                                C0YQ0 c0yq0 = (C0YQ0) interfaceC873750YPl;
                                C869590Y9l c869590Y9l3 = c0yq0.LIZIZ;
                                C0YMW iMError = c0yq0.LIZJ.toIMError();
                                c2256591DUb4.getClass();
                                C2256591DUb.LJ(c2256701DUm3, c0y3i3, c869590Y9l3, iMError, "retry_other_sdk_fail");
                            }
                        });
                        return;
                    } else {
                        C2256591DUb.LJ(c2256701DUm, c0y3i, null, null, "message_manager_unavail");
                        return;
                    }
                }
                C882760Yk6.LIZ(C882760Yk6.LIZ).LIZJ(new C873500YOm((C0YHT) new C0YPU(c869590Y9l), C13LQ.LJIJI(new AbstractC873650YPb[]{new C874390YRx(), new C2256621DUe(c869590Y9l, c0yc6, c2256701DUm, c0y3i.LIZ(), new C2256741DUq(new C1DVK(c2256591DUb), new C1DV9(c2256591DUb), new C2256801DUw(c2256591DUb), new C2256871DVd(c2256591DUb))), C2256591DUb.LIZIZ(c0y3i), new C874410YRz()}), new C0YOY() { // from class: X.1DW3
                    @Override // X.C0YOY
                    public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                        if (interfaceC873750YPl instanceof C0YPL) {
                            C2256591DUb c2256591DUb3 = C2256591DUb.LIZ;
                            C2256701DUm c2256701DUm2 = c2256701DUm;
                            C0Y3I c0y3i2 = c0y3i;
                            C869590Y9l c869590Y9l2 = ((C0YPL) interfaceC873750YPl).LIZIZ;
                            c2256591DUb3.getClass();
                            C2256591DUb.LJFF(c2256701DUm2, c0y3i2, c869590Y9l2);
                            return;
                        }
                        if (!(interfaceC873750YPl instanceof C0YQ0)) {
                            return;
                        }
                        C2256591DUb c2256591DUb4 = C2256591DUb.LIZ;
                        C2256701DUm c2256701DUm3 = c2256701DUm;
                        C0Y3I c0y3i3 = c0y3i;
                        C0YQ0 c0yq0 = (C0YQ0) interfaceC873750YPl;
                        C869590Y9l c869590Y9l3 = c0yq0.LIZIZ;
                        C0YMW iMError = c0yq0.LIZJ.toIMError();
                        c2256591DUb4.getClass();
                        C2256591DUb.LJ(c2256701DUm3, c0y3i3, c869590Y9l3, iMError, "retry_other_sdk_fail");
                    }
                }, c0y3i.LIZ(), false, 36));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.creation.sender.IMediaMsgSendManager
    public final void LIZJ(C0Y3I c0y3i, C869590Y9l c869590Y9l) {
        C21682519tP.LIZ("MediaMsgSendManager retrySendVideoMessage");
        C2256581DUa.LIZ.getClass();
        C20478080m.LIZ(new C1DUZ(c869590Y9l, c0y3i, null));
    }

    @Override // com.ss.android.ugc.aweme.creation.sender.IMediaMsgSendManager
    public final void LIZIZ(String str, List<? extends MediaModel> list, String str2, C0YTK c0ytk, Map<String, String> map, Map<String, String> map2, QuoteMode quoteMode, BaseHeaderComponent baseHeaderComponent, FeatureAttachmentData featureAttachmentData) {
        ArrayList arrayList = new ArrayList(list);
        C20478080m.LIZ(new C1DUU(map, str, arrayList, map2, quoteMode, featureAttachmentData, arrayList.size(), str2, c0ytk, baseHeaderComponent, null));
    }

    public static void LJ(MediaMsgSendManager mediaMsgSendManager, C0Y3I c0y3i, String str, BaseShortVideoContext baseShortVideoContext, boolean z, boolean z2, String str2, Pair pair, boolean z3, boolean z4, String str3, String str4, Map map, String str5, boolean z5, boolean z6, boolean z7, QuoteMode quoteMode, BaseHeaderComponent baseHeaderComponent, FeatureAttachmentData featureAttachmentData, int i) {
        Map map2;
        int iIntValue;
        Integer numLJJIIJ;
        Integer numLJJIIJ2;
        QuoteMode.Thought thought;
        String str6;
        String enterFrom;
        FeatureAttachmentData featureAttachmentDataLIZLLL = featureAttachmentData;
        BaseHeaderComponent baseHeaderComponent2 = baseHeaderComponent;
        QuoteMode quoteMode2 = quoteMode;
        boolean z8 = z7;
        int iIntValue2 = 0;
        if ((i & 16384) != 0) {
            z6 = false;
        }
        if ((32768 & i) != 0) {
            z8 = false;
        }
        if ((65536 & i) != 0) {
            quoteMode2 = QuoteMode.None.INSTANCE;
        }
        C1777570wMF c1777570wMF = null;
        boolean z9 = false;
        boolean z10 = false;
        if ((131072 & i) != 0) {
            baseHeaderComponent2 = null;
        }
        if ((i & 262144) != 0) {
            featureAttachmentDataLIZLLL = null;
        }
        mediaMsgSendManager.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        DMPublishService dMPublishService = DMPublishService.INSTANCE;
        String enterDM = dMPublishService.getEnterDM(baseShortVideoContext);
        String enterMethodType = dMPublishService.getEnterMethodType(baseShortVideoContext);
        if (enterDM != null && enterDM.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            if (Intrinsics.LJFF(enterDM, "chat_page_camera")) {
                str6 = "chat";
            } else {
                str6 = "notification_page";
            }
            linkedHashMap.put("enter_from", str6);
            if (!z6 && (enterFrom = dMPublishService.getEnterFrom(baseShortVideoContext)) != null) {
                linkedHashMap.put("enter_from", enterFrom);
            }
            linkedHashMap.put("enter_method", enterDM);
            map2 = linkedHashMap;
        } else {
            map2 = map;
        }
        Integer mediaType = dMPublishService.getMediaType(baseShortVideoContext);
        if (mediaType != null) {
            int iIntValue3 = mediaType.intValue();
            int[] outputMediaSize = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getOutputMediaSize(baseShortVideoContext);
            if (pair != null) {
                iIntValue = ((Number) pair.getFirst()).intValue();
                iIntValue2 = ((Number) pair.getSecond()).intValue();
            } else {
                if (outputMediaSize != null && (numLJJIIJ2 = C13LQ.LJJIIJ(0, outputMediaSize)) != null) {
                    iIntValue = numLJJIIJ2.intValue();
                } else {
                    iIntValue = 0;
                }
                if (outputMediaSize != null && (numLJJIIJ = C13LQ.LJJIIJ(1, outputMediaSize)) != null) {
                    iIntValue2 = numLJJIIJ.intValue();
                }
            }
            if ((quoteMode2 instanceof QuoteMode.Thought) && (thought = (QuoteMode.Thought) quoteMode2) != null) {
                LIZ.getClass();
                featureAttachmentDataLIZLLL = LIZLLL(thought);
            }
            if (iIntValue3 != 2) {
                if (iIntValue3 == 3) {
                    if (Intrinsics.LJFF(enterMethodType, "game_center_effect")) {
                        String str7 = (String) map2.get("prop_id");
                        String str8 = "";
                        if (str7 == null) {
                            str7 = "";
                        }
                        String effectName = dMPublishService.getEffectName(baseShortVideoContext);
                        if (effectName == null) {
                            effectName = "";
                        }
                        String effectIconUrl = dMPublishService.getEffectIconUrl(baseShortVideoContext);
                        if (effectIconUrl != null) {
                            str8 = effectIconUrl;
                        }
                        c1777570wMF = new C1777570wMF(str7, effectName, str8);
                    }
                    boolean z11 = true;
                    C2256581DUa.LJI(C2256581DUa.LIZ, c0y3i, str, new C1DUR(dMPublishService.getVideoPath(baseShortVideoContext), null, str2, iIntValue, iIntValue2, 0L, (String) map2.get("prop_id"), (String) map2.get("remix_item_ids"), false ? 1 : 0, z, z2, z3, z4, z11, Long.valueOf(baseShortVideoContext.getVideoLength()), z5, c1777570wMF, false ? 1 : 0, 525898), false, true, baseShortVideoContext, new C2256701DUm(jCurrentTimeMillis, false, z11, EnumC1446110njd.VIDEO, (int) (false ? 1 : 0), false ? 1 : 0, baseShortVideoContext.getCreationId(), false ? 1 : 0, Long.valueOf(baseShortVideoContext.getVideoLength()), enterDM, 360), map2, null, str5, null, quoteMode2.T3(), z5, z8, quoteMode2.jK(), baseHeaderComponent2, featureAttachmentDataLIZLLL, null, 132360);
                    return;
                }
                return;
            }
            Map map3 = map2;
            C2256591DUb.LJIIIIZZ(C2256591DUb.LIZ, c0y3i, str, new C1DUQ(str2, z10 ? 1 : 0, iIntValue, iIntValue2, 0L, (String) map2.get("prop_id"), z, z3, z4, str4, 370), false, true, baseShortVideoContext, new C2256701DUm(jCurrentTimeMillis, false, true, EnumC1446110njd.PHOTO, (int) (false ? 1 : 0), false ? 1 : 0, baseShortVideoContext.getCreationId(), false ? 1 : 0, (Long) (z9 ? 1 : 0), enterDM, 872), str3, map3, null, str5, null, quoteMode2.T3(), quoteMode2.jK(), baseHeaderComponent2, featureAttachmentDataLIZLLL, null, 68104);
        }
    }
}
