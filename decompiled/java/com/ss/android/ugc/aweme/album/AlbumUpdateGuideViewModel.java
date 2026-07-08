package com.ss.android.ugc.aweme.album;

import X.AbstractC440540HPg;
import X.C01GW;
import X.C05YD;
import X.C09JN;
import X.C0CHQ;
import X.C0I0B;
import X.C0IBF;
import X.C0W8I;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZLD;
import X.C1017903yT;
import X.C11NJ;
import X.C1449540npA;
import X.C1BNE;
import X.C21512319Gv;
import X.C2252321DDq;
import X.C2272701DxU;
import X.C2272711DxV;
import X.C441120HRm;
import X.C452501pT;
import X.C461720I8s;
import X.C530380Kr6;
import X.C530750Krh;
import X.C530760Kri;
import X.C535280Kz0;
import X.C786410Ut5;
import X.C894660Z7w;
import X.C913380ZsO;
import X.InterfaceC0148002o;
import X.InterfaceC1411705fn;
import X.InterfaceC876950Yaj;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.analytics.IIMAlbumUpdateGuideAnalytics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMCameraModelMirror;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMMediaModelMirror;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeCommonModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeRecordModel;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS223S0000000_32;
import okio.ByteString;

/* JADX INFO: loaded from: classes33.dex */
public final class AlbumUpdateGuideViewModel extends IAlbumUpdateGuideViewModel {
    public MediaModel LL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final C2252321DDq LLJI;
    public final C2252321DDq LLJIJIL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(59));
    public final String LLILLL = C461720I8s.LIZIZ();
    public final AlbumGuideFrequencyControlSDKHelper LLILZ = new AlbumGuideFrequencyControlSDKHelper();
    public final C11NJ LLILZIL = new C11NJ();
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(37));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.19Gu
        };
    }

    @Override // com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel
    public final void dismiss() {
        InterfaceC1411705fn interfaceC1411705fn;
        if (this.LLILZLL) {
            this.LLILZLL = false;
            this.LLIZLLLIL = false;
            this.LL = null;
            if (this.LLIZ) {
                return;
            }
            AlbumGuideFrequencyControlSDKHelper albumGuideFrequencyControlSDKHelper = this.LLILZ;
            InterfaceC1411705fn interfaceC1411705fn2 = (InterfaceC1411705fn) albumGuideFrequencyControlSDKHelper.LIZIZ.getValue();
            if (interfaceC1411705fn2 != null) {
                IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                boolean z = !interfaceC1411705fn2.LIZIZ(iMHostApi != null ? iMHostApi.LIZIZ() : System.currentTimeMillis(), "");
                IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                long jLIZIZ = iMHostApi2 != null ? iMHostApi2.LIZIZ() : System.currentTimeMillis();
                IMHostApi iMHostApi3 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                interfaceC1411705fn2.LIZLLL(jLIZIZ, iMHostApi3 != null ? iMHostApi3.LIZIZ() : System.currentTimeMillis(), "");
                IMHostApi iMHostApi4 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                boolean z2 = !interfaceC1411705fn2.LIZIZ(iMHostApi4 != null ? iMHostApi4.LIZIZ() : System.currentTimeMillis(), "");
                if (!z || z2 || (interfaceC1411705fn = (InterfaceC1411705fn) albumGuideFrequencyControlSDKHelper.LIZJ.getValue()) == null) {
                    return;
                }
                IMHostApi iMHostApi5 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                long jLIZIZ2 = iMHostApi5 != null ? iMHostApi5.LIZIZ() : System.currentTimeMillis();
                IMHostApi iMHostApi6 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                interfaceC1411705fn.LIZLLL(jLIZIZ2, iMHostApi6 != null ? iMHostApi6.LIZIZ() : System.currentTimeMillis(), "");
            }
        }
    }

    public AlbumUpdateGuideViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LLJI = c2252321DDqLIZ;
        this.LLJIJIL = c2252321DDqLIZ;
    }

    @Override // com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel
    public final C2252321DDq wQ2() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel
    public final boolean xQ2() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel
    public final void yQ2(SessionInfo sessionInfo) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        this.LLILZLL = true;
        this.LLIZ = false;
        InterfaceC1411705fn interfaceC1411705fn = (InterfaceC1411705fn) this.LLILZ.LIZ.getValue();
        if (interfaceC1411705fn != null) {
            IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            if (iMHostApi != null) {
                jCurrentTimeMillis = iMHostApi.LIZIZ();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            if (iMHostApi2 != null) {
                jCurrentTimeMillis2 = iMHostApi2.LIZIZ();
            } else {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            interfaceC1411705fn.LIZLLL(jCurrentTimeMillis, jCurrentTimeMillis2, "");
        }
        IIMAlbumUpdateGuideAnalytics.LIZ.getClass();
        IIMAlbumUpdateGuideAnalytics value = C1449540npA.LIZIZ.getValue();
        if (value != null) {
            value.LIZIZ(sessionInfo);
        }
        MediaModel mediaModel = this.LL;
        if (mediaModel != null) {
            ((Keva) C21512319Gv.LIZ.getValue()).storeLong("last_media_time", mediaModel.date + (mediaModel.duration / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        }
    }

    public final void CQ2(Context context, String str) {
        C0W8I.LIZ.getClass();
        if (!C0W8I.LIZIZ() && !C0W8I.LIZJ()) {
            C0I0B.LJFF.LIZJ();
            if (!C894660Z7w.LJ()) {
                return;
            }
        }
        C0ZLD c0zld = (C0ZLD) this.LLJ.getValue();
        if (c0zld != null && c0zld.LIZ()) {
            C786410Ut5.re(Toast.makeText(context, str, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel
    public final void vQ2(final Context context, String str) {
        IMContact iMContactLJI;
        C2272701DxU c2272701DxUBuild;
        long jCurrentTimeMillis;
        InterfaceC1411705fn interfaceC1411705fn;
        long jCurrentTimeMillis2;
        InterfaceC1411705fn interfaceC1411705fn2;
        long jCurrentTimeMillis3;
        C05YD<AbstractC440540HPg> taskStatus;
        this.LLILZIL.LJ();
        AbstractC440540HPg value = null;
        this.LL = null;
        C2252321DDq c2252321DDq = this.LLJI;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), null)) {
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ == null) {
            CQ2(context, "missing conversation");
            return;
        }
        IIMContactUtilService.LIZ.getClass();
        IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
        if (iIMContactUtilServiceLIZ != null) {
            iMContactLJI = iIMContactUtilServiceLIZ.LJI(c0y8tLIZ);
        } else {
            iMContactLJI = null;
        }
        if ((iMContactLJI instanceof IMUser) && ((IMUser) iMContactLJI).getShareStatus() != 1) {
            CQ2(context, "cannot send");
            return;
        }
        if (c0y8tLIZ.isGroupChat() && (!c0y8tLIZ.isMember() || c0y8tLIZ.isDissolved())) {
            CQ2(context, "cannot send");
            return;
        }
        ByteString bizExt = c0y8tLIZ.getBizExt();
        if (bizExt == null || (c2272701DxUBuild = C2272701DxU.ADAPTER.decode(bizExt)) == null) {
            C2272711DxV c2272711DxV = new C2272711DxV();
            c2272711DxV.LIZLLL = C0IBF.FEATURE_STATUS_UNKNOWN;
            c2272701DxUBuild = c2272711DxV.build();
        }
        if (c2272701DxUBuild.camera_status != C0IBF.FEATURE_STATUS_SHOW) {
            CQ2(context, "camera disabled");
            return;
        }
        if (!C0CHQ.LIZ().LJJJI().checkImageAndVideoReadStoragePermissionGranted()) {
            CQ2(context, "no permission");
            return;
        }
        MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) PluggableExtentionKt.pluggableSpi$default(MixStudioStatusRepository.class, false, false, false, 14, null);
        if (mixStudioStatusRepository != null && (taskStatus = mixStudioStatusRepository.getTaskStatus()) != null) {
            value = taskStatus.getValue();
        }
        if (value instanceof C441120HRm) {
            CQ2(context, "generating mix studio");
            return;
        }
        AlbumGuideFrequencyControlSDKHelper albumGuideFrequencyControlSDKHelper = this.LLILZ;
        InterfaceC1411705fn interfaceC1411705fn3 = (InterfaceC1411705fn) albumGuideFrequencyControlSDKHelper.LIZ.getValue();
        if (interfaceC1411705fn3 != null) {
            IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            if (iMHostApi != null) {
                jCurrentTimeMillis = iMHostApi.LIZIZ();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            if (!interfaceC1411705fn3.LIZIZ(jCurrentTimeMillis, "") && (interfaceC1411705fn = (InterfaceC1411705fn) albumGuideFrequencyControlSDKHelper.LIZIZ.getValue()) != null) {
                IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                if (iMHostApi2 != null) {
                    jCurrentTimeMillis2 = iMHostApi2.LIZIZ();
                } else {
                    jCurrentTimeMillis2 = System.currentTimeMillis();
                }
                if (!interfaceC1411705fn.LIZIZ(jCurrentTimeMillis2, "") && (interfaceC1411705fn2 = (InterfaceC1411705fn) albumGuideFrequencyControlSDKHelper.LIZJ.getValue()) != null) {
                    IMHostApi iMHostApi3 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                    if (iMHostApi3 != null) {
                        jCurrentTimeMillis3 = iMHostApi3.LIZIZ();
                    } else {
                        jCurrentTimeMillis3 = System.currentTimeMillis();
                    }
                    if (!interfaceC1411705fn2.LIZIZ(jCurrentTimeMillis3, "")) {
                        C530750Krh.LIZIZ(C0CHQ.LIZ);
                        this.LLILZIL.LIZ(C530760Kri.LIZ().LJJIJL(new C535280Kz0(0, 1, 0, false), C530380Kr6.LIZ).LJJLJLI(new C09JN() { // from class: X.19Gt
                            /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                            /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
                            @Override // X.C09JN
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void accept(java.lang.Object r14) {
                                /*
                                    Method dump skipped, instruction units count: 204
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C21512119Gt.accept(java.lang.Object):void");
                            }
                        }));
                        return;
                    }
                }
            }
        }
        CQ2(context, "frequency control hit");
    }

    @Override // com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel
    public final void zQ2(Activity activity, SessionInfo sessionInfo) {
        MediaModel mediaModel = this.LL;
        if (mediaModel == null) {
            return;
        }
        this.LLIZ = true;
        this.LLIZLLLIL = true;
        AlbumGuideFrequencyControlSDKHelper albumGuideFrequencyControlSDKHelper = this.LLILZ;
        InterfaceC1411705fn interfaceC1411705fn = (InterfaceC1411705fn) albumGuideFrequencyControlSDKHelper.LIZIZ.getValue();
        if (interfaceC1411705fn != null) {
            interfaceC1411705fn.LIZJ("");
        }
        InterfaceC1411705fn interfaceC1411705fn2 = (InterfaceC1411705fn) albumGuideFrequencyControlSDKHelper.LIZJ.getValue();
        if (interfaceC1411705fn2 != null) {
            interfaceC1411705fn2.LIZJ("");
        }
        IIMAlbumUpdateGuideAnalytics.LIZ.getClass();
        IIMAlbumUpdateGuideAnalytics value = C1449540npA.LIZIZ.getValue();
        if (value != null) {
            value.LIZJ(sessionInfo);
        }
        BQ2(activity, UriProtector.parse(mediaModel.LJFF()), mediaModel.LJIIJ(), "album_floating_layer", sessionInfo, mediaModel, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    @Override // com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(android.app.Activity r16, android.net.Uri r17, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r18, com.ss.android.ugc.aweme.im.message.template.data.QuoteMode r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) throws java.lang.Throwable {
        /*
            r15 = this;
            r3 = r20
            r9 = r16
            r11 = r18
            r13 = r19
            boolean r0 = r3 instanceof X.C09MU
            r8 = r15
            if (r0 == 0) goto Lad
            r4 = r3
            X.09MU r4 = (X.C09MU) r4
            int r2 = r4.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lad
            int r2 = r2 - r1
            r4.LLIZ = r2
        L1b:
            java.lang.Object r12 = r4.LLILZIL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLIZ
            r2 = 3
            r6 = 2
            r0 = 1
            r14 = 0
            if (r1 == 0) goto L35
            if (r1 == r0) goto L52
            if (r1 == r6) goto L7f
            if (r1 != r2) goto Lb4
            X.C155000ia.LIZIZ(r12)
        L32:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L35:
            X.C155000ia.LIZIZ(r12)
            r4.LL = r9
            r4.LLILLJJLI = r11
            r4.LLILLL = r13
            r4.LLIZ = r0
            X.1DFB r5 = X.C0PEM.LIZJ
            X.08ZN r1 = new X.08ZN
            java.lang.String r0 = "clipboard"
            r7 = r17
            r1.<init>(r9, r7, r0, r14)
            java.lang.Object r12 = X.C23250099c.LJI(r4, r5, r1)
            if (r12 != r3) goto L5d
            return r3
        L52:
            com.ss.android.ugc.aweme.im.message.template.data.QuoteMode r13 = r4.LLILLL
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r11 = r4.LLILLJJLI
            java.lang.Object r9 = r4.LL
            android.app.Activity r9 = (android.app.Activity) r9
            X.C155000ia.LIZIZ(r12)
        L5d:
            X.07WI r12 = (X.C07WI) r12
            if (r12 != 0) goto L64
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L64:
            X.1DFB r1 = X.C0PEM.LIZJ
            X.09Lb r0 = new X.09Lb
            r0.<init>(r9, r12, r8, r14)
            r4.LL = r9
            r4.LLILLJJLI = r11
            r4.LLILLL = r13
            r4.LLILZ = r12
            r4.LLIZ = r6
            java.lang.Object r0 = X.C23250099c.LJI(r4, r1, r0)
            if (r0 != r3) goto L7c
            return r3
        L7c:
            r10 = r12
            r12 = r0
            goto L8c
        L7f:
            X.07WI r10 = r4.LLILZ
            com.ss.android.ugc.aweme.im.message.template.data.QuoteMode r13 = r4.LLILLL
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r11 = r4.LLILLJJLI
            java.lang.Object r9 = r4.LL
            android.app.Activity r9 = (android.app.Activity) r9
            X.C155000ia.LIZIZ(r12)
        L8c:
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r12 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r12
            if (r12 != 0) goto L93
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L93:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0989 r7 = new X.0989
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r4.LL = r14
            r4.LLILLJJLI = r14
            r4.LLILLL = r14
            r4.LLILZ = r14
            r4.LLIZ = r2
            java.lang.Object r0 = X.C23250099c.LJI(r4, r0, r7)
            if (r0 != r3) goto L32
            return r3
        Lad:
            X.09MU r4 = new X.09MU
            r4.<init>(r8, r3)
            goto L1b
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.album.AlbumUpdateGuideViewModel.AQ2(android.app.Activity, android.net.Uri, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo, com.ss.android.ugc.aweme.im.message.template.data.QuoteMode, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void BQ2(Activity activity, Uri uri, boolean z, String str, SessionInfo sessionInfo, MediaModel mediaModel, QuoteMode quoteMode) {
        int i = 0;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            boolean z2 = true;
            if (creativeToolsPluginService.LIZJ(activity, "dm_camera_album", true)) {
                IMCreativeEditModel iMCreativeEditModel = new IMCreativeEditModel(C1017903yT.LIZ(), uri, z, new IMCreativeCommonModel(null, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383), new DMMediaModelMirror(!z ? 1 : 0, uri.toString(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 508), new DMCameraModelMirror(z2, str, sessionInfo.getConversationId(), sessionInfo.getChatType(), quoteMode, -6148, 15), null, null, null, null, mediaModel, false, 3008);
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//im/creative/camera");
                smartRouteBuildRoute.withNavArg(new IMCreativeModel((IMCreativeRecordModel) null, iMCreativeEditModel));
                smartRouteBuildRoute.withAnimation(R.anim.an, -1);
                smartRouteBuildRoute.open();
            }
        }
    }
}
