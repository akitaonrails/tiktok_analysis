package com.ss.android.ugc.gamora.editor.lightening.canvas.forward;

import X.C036E;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0CHG;
import X.C0CHH;
import X.C0CHK;
import X.C0DMI;
import X.C0FI2;
import X.C0LAB;
import X.C0MK4;
import X.C0MK7;
import X.C0MK8;
import X.C0MK9;
import X.C0MKJ;
import X.C0ML2;
import X.C0ML5;
import X.C0ML6;
import X.C0ML8;
import X.C0ML9;
import X.C0MLA;
import X.C0MLC;
import X.C0MLE;
import X.C0MM5;
import X.C0MMK;
import X.C0MML;
import X.C0MN3;
import X.C0MN4;
import X.C0MO4;
import X.C0MRE;
import X.C0MWH;
import X.C0PEM;
import X.C122T;
import X.C1443560nfW;
import X.C1449410nox;
import X.C1449430noz;
import X.C1599190riX;
import X.C15O7;
import X.C1954807lC;
import X.C19565911gn;
import X.C201955140j;
import X.C2108108Nr;
import X.C2188811AlT;
import X.C2286608xc;
import X.C2296808zG;
import X.C23215097t;
import X.C23216097u;
import X.C23250099c;
import X.C23260099m;
import X.C272750AmX;
import X.C298130BmN;
import X.C418440Gaw;
import X.C533890Kwl;
import X.C534210KxH;
import X.C537520L6g;
import X.C566780MKu;
import X.C566800MKw;
import X.C566810MKx;
import X.C566830MKz;
import X.C567570MNv;
import X.C572350Mcb;
import X.C572370Mcd;
import X.C786410Ut5;
import X.C830690WiJ;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import X.InterfaceC567940MPg;
import Y.ACallableS175S0300000_5;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Size;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class DefaultCreativeForwardServiceImpl implements ICreativeForwardService {
    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean needJumpToOnThisDayPreviewPage() {
        return C566780MKu.LIZ(null);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final int getAlbumSkylightMinDisplayIntervalDays() {
        return ((Number) C272750AmX.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean isOnThisDayPublishedToday() {
        C0ML6.LIZ.getClass();
        return C0ML6.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean onThisDayCanScanAlbum() {
        C0ML5.LIZ.getClass();
        return C0ML5.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean onThisDaySupportLowActivity() {
        return ((Boolean) C0CHG.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean onThisDaySupportNonLowActivity() {
        return ((Boolean) C0CHH.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean onThisDaySupportRecallMultiStory() {
        return ((Boolean) C566800MKw.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean onThisDaySupportRecallLocalMedias() {
        return C0CHK.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean onThisDaySupportRecallMultiPost() {
        return C534210KxH.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final void preDownloadOnThisDayFontList() {
        C19565911gn.LIZ();
        C122T.LIZ();
        C122T.LIZIZ();
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            creativeToolsPluginService.LIZ();
        }
        C15O7.LIZJ(new ACallableS175S0300000_5(C0FI2.LJIJJLI("textfont"), Boolean.valueOf(!C298130BmN.LIZ()), new IFetchEffectChannelListener() { // from class: X.0MKv
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* bridge */ /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            }
        }, 1));
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final boolean shouldAddOnThisDayLocalMediaEntry() {
        if (C0CHK.LIZ()) {
            return ((Boolean) C1599190riX.LIZ.getValue()).booleanValue() || !isOnThisDayPublishedToday();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final List<MediaModel> getOnThisDayLocalMedias(boolean z, String str) {
        C0ML5.LIZ.getClass();
        return C0ML5.LJ(str, z);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final void forwardOnThisDay(Context context, ForwardMedia forwardMedia, C0MMK c0mmk, Function0<Unit> function0) {
        Pair pair;
        C0MKJ.LIZ.getClass();
        C0MKJ.LJIJ("prepareForwardData");
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(context, "on_this_day", true)) {
            String musicId = null;
            C0MKJ.LJ = C0DMI.LIZIZ(null);
            C0MKJ.LIZLLL.LIZIZ();
            ForwardMusic forwardMusic = forwardMedia.forwardMusic;
            if (forwardMusic != null) {
                musicId = forwardMusic.getMusicId();
            }
            C0MKJ.LJIJJLI(musicId, 0, null, Collections.singletonList(forwardMedia), null, null);
            C0MKJ.LJIJJ(0, AFwS239S0000000_8.get$arr$(1));
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (C036E.LIZ.LIZIZ()) {
                pair = C0MKJ.LJIL(forwardMedia);
                if (pair == null) {
                    C0MKJ.LJJII(context, forwardMedia, c0mmk, function0, null, false);
                    return;
                }
            } else {
                C0MKJ.LJJIFFI(R.string.m25, context);
                pair = new Pair(-4000, "error for network invalid");
            }
            C0MKJ.LJIJJ(-1, new AwS581S0100000_2(pair, (Pair<Integer, String>) 2));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final void loadThumbnail(ImageView imageView, MediaModel mediaModel, Size size, Function1<? super Bitmap, Unit> function1) {
        imageView.setOutlineProvider(new C0MRE(size.getWidth() / 2));
        imageView.setClipToOutline(true);
        if (function1 == null) {
            function1 = AFwS239S0000000_8.get$arr$(201);
        }
        C23216097u c23216097u = C23215097t.LIZ;
        C23215097t.LIZLLL(imageView, mediaModel, size, new AwS622S0100000_8(function1, 27));
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final C0ML2 startForward(Context context, ForwardMedia forwardMedia, C0MMK c0mmk, Function1<? super C0ML2, Unit> function1) {
        C572350Mcb c572350McbLJJII;
        C0ML2 c0ml2LJIIIIZZ;
        if (c0mmk instanceof C0MML) {
            C0MML c0mml = (C0MML) c0mmk;
            C0MM5.LIZ.getClass();
            C0MK9 c0mk9 = new C0MK9(C0MM5.LIZIZ);
            try {
                try {
                    c0mk9.LJFF = new C0MK7();
                    C566810MKx c566810MKxLJI = C0MM5.LJI(context, forwardMedia, c0mml.getUseStreamingEntry());
                    if (!c566810MKxLJI.LIZ) {
                        c0mk9.LIZIZ.LIZIZ(Integer.valueOf(c566810MKxLJI.LIZIZ), c566810MKxLJI.LIZJ);
                    } else {
                        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(context, "share_to_story", true)) {
                            c0mk9.LIZIZ(forwardMedia);
                            C0DMI.LIZIZ(null);
                            c0mk9.LIZJ = C23250099c.LIZLLL(C2296808zG.LIZ(C2108108Nr.LIZ), null, null, new C533890Kwl(c0mk9, new C0MK4(c0mk9, context, new C0MK8(context, forwardMedia, c0mml), null), null), 3);
                        }
                    }
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c0mk9.LIZ(e);
                }
                c0mk9.LJFF = null;
                c0ml2LJIIIIZZ = new C0ML2() { // from class: X.0MKy
                };
                if (function1 != null) {
                    function1.invoke(c0ml2LJIIIIZZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c0mk9.LJFF = null;
                throw th;
            }
        } else if (c0mmk instanceof C0MN4) {
            C0MO4.LIZ.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            CreativeInfo creativeInfoLIZIZ = C0DMI.LIZIZ(null);
            C23250099c.LIZLLL((InterfaceC497601wk) C0MO4.LJFF.getValue(), null, null, new C0MN3(forwardMedia, creativeInfoLIZIZ, (C0MN4) c0mmk, context, jCurrentTimeMillis, null), 3);
            c0ml2LJIIIIZZ = new C566830MKz(creativeInfoLIZIZ.getCreationId());
            if (function1 != null) {
                function1.invoke(c0ml2LJIIIIZZ);
                return c0ml2LJIIIIZZ;
            }
        } else if (c0mmk instanceof C572370Mcd) {
            ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
            if (iTextToImageService != null && (c572350McbLJJII = iTextToImageService.LJJII()) != null) {
                c0ml2LJIIIIZZ = c572350McbLJJII.LJIIIIZZ(context, forwardMedia, (C572370Mcd) c0mmk);
                if (function1 != null) {
                    function1.invoke(c0ml2LJIIIIZZ);
                    return c0ml2LJIIIIZZ;
                }
            } else {
                return new C0ML2() { // from class: X.0MKy
                };
            }
        } else {
            throw new C1954807lC();
        }
        return c0ml2LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final Object generateCommentNoticePreviewCover(Context context, Comment comment, ForwardMedia forwardMedia, boolean z, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C567570MNv(context, c23260099m, z, comment, forwardMedia, C418440Gaw.LIZIZ(C2286608xc.LJ(8)), null), 3);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    public final void forwardOnThisDay(Context context, String str, C0MMK c0mmk, int i, String str2, String str3, String str4, String str5, String str6) {
        CreativeInfo creativeInfo;
        boolean z;
        String str7;
        int size;
        boolean zLIZJ;
        String str8 = str5;
        C0MLE.LIZ.getClass();
        if (str4.length() > 0) {
            creativeInfo = new CreativeInfo(str4, 0, null, 6, null);
        } else {
            creativeInfo = new CreativeInfo(null, 0, null, 7, null);
        }
        if (str8.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str9 = "";
        if (!z) {
            C0ML8.LIZ.getClass();
            if (i != 2) {
                str8 = "";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("inbox_top_cell_");
                sbLIZ.append(i);
                if (Intrinsics.LJFF(str, C2188811AlT.LIZIZ(sbLIZ))) {
                    str8 = "inbox_skylight";
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("insert_card_");
                    sbLIZ2.append(i);
                    if (Intrinsics.LJFF(str, C2188811AlT.LIZIZ(sbLIZ2))) {
                        str8 = "feed_card";
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("profile_");
                        sbLIZ3.append(i);
                        if (Intrinsics.LJFF(str, C2188811AlT.LIZIZ(sbLIZ3))) {
                            str8 = "personal_homepage";
                        } else {
                            str8 = str;
                        }
                    }
                }
            }
        }
        C0ML8.LIZ.getClass();
        IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
        String creationId = creativeInfo.getCreationId();
        if (creationId == null) {
            creationId = "";
        }
        if (str3.length() == 0) {
            if (i == 2) {
                str7 = "end_of_year";
            } else {
                str7 = "on_this_day";
            }
        } else {
            str7 = str3;
        }
        String str10 = C1443560nfW.LJFF;
        if (str10 != null) {
            str9 = str10;
        }
        C1449410nox c1449410nox = new C1449410nox(creationId, str7, "notification_page", null, null, new C1449430noz(str9, "others"), null, null, 216);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("last_group_id", C1443560nfW.LIZIZ);
        c0lab.LJ("last_gid_from", C1443560nfW.LIZJ);
        c0lab.LIZ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
        c0lab.LJ("eoy_entrance_type", str8);
        List<ForwardMedia> listLIZIZ = C0MLC.LIZ.LIZIZ(i);
        if (listLIZIZ != null) {
            size = listLIZIZ.size();
        } else {
            size = 0;
        }
        InterfaceC567940MPg interfaceC567940MPg = C0MLA.LIZ;
        if (interfaceC567940MPg != null) {
            zLIZJ = interfaceC567940MPg.LIZJ(i, Integer.valueOf(size));
        } else {
            zLIZJ = false;
        }
        C0ML9.LIZJ(c0lab, i, zLIZJ, str);
        iRecordMobService.LIZIZ(c1449410nox, c0lab, null);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "forward_config", c0mmk);
        bundle.putInt("celebration_type", i);
        C786410Ut5.LJJJI("unique_id", str2, bundle);
        C786410Ut5.LJJJI("enter_method", str, bundle);
        C786410Ut5.LJJJI("shoot_way", str3, bundle);
        C786410Ut5.LJJJI("entrance_type", str8, bundle);
        C786410Ut5.LJJJI("search_extra", str6, bundle);
        C537520L6g.LJFF(bundle, creativeInfo);
        try {
            C0MWH.LJIILJJIL(context, bundle, false, 8);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIZ(C830690WiJ.LIZIZ, "OnThisDayVideoPreviewScene", "startCelebrationVideoTemplatePreviewPage: start activity npe", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r3 != null) goto L14;
     */
    @Override // com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void forwardOnThisDay(android.content.Context r14, java.util.List<com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia> r15, X.C0MMK r16, int r17, java.lang.String r18, java.lang.String r19, boolean r20, java.lang.String r21, java.lang.String r22, kotlin.jvm.functions.Function0<kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lightening.canvas.forward.DefaultCreativeForwardServiceImpl.forwardOnThisDay(android.content.Context, java.util.List, X.0MMK, int, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0):void");
    }
}
