package kotlin.jvm.internal;

import X.C00YV;
import X.C0253006p;
import X.C07TU;
import X.C09AY;
import X.C09K7;
import X.C0ET4;
import X.C0FIG;
import X.C0MKI;
import X.C1435540nSa;
import X.C1435560nSc;
import X.C1443990ngD;
import X.C1444000ngE;
import X.C1444600nhC;
import X.C1444740nhQ;
import X.C1449230nof;
import X.C1660680tJi;
import X.C1697810uHb;
import X.C19684011zq;
import X.C19EG;
import X.C1DRG;
import X.C259800zU;
import X.C545820Lau;
import X.C559610Lx9;
import X.C570750Ma1;
import X.InterfaceC1452170ntP;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.image.sticker.newengine.ImageGlobalEditStickerNewEngineComponent;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS118S0400000_22 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS118S0400000_22 awS118S0400000_22, Object obj) {
        Integer avatarColor;
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        Iterator<StickerItemModel> it2;
        if (((Boolean) obj).booleanValue()) {
            C19EG c19eg = (C19EG) awS118S0400000_22.l0;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS118S0400000_22.l1;
            Bundle bundle = (Bundle) awS118S0400000_22.l2;
            Function1 function1 = (Function1) awS118S0400000_22.l3;
            videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar = true;
            String string = bundle.getString("origin_avatar_uri", "");
            String string2 = bundle.getString("origin_no_crop_avatar_path", "");
            String string3 = bundle.getString("realEnterMethod", "");
            boolean z = bundle.getBoolean("is_aivatar", false);
            boolean z2 = bundle.getBoolean("is_social_avatar", false);
            String string4 = bundle.getString("path_mode", "");
            int i = bundle.getInt("background_selection", 0);
            int i2 = bundle.getInt("expression_selection", 0);
            long j = bundle.getLong("avatar_id", 0L);
            String string5 = bundle.getString("dynamic_social_avatar", "");
            String string6 = bundle.getString("static_social_avatar_gif", "");
            String string7 = bundle.getString("static_social_avatar", "");
            String string8 = bundle.getString("compiled_social_avatar", "");
            int i3 = bundle.getInt("social_avatar_text_color", 0);
            String string9 = bundle.getString("social_avatar_enter_method", "");
            String string10 = bundle.getString("social_avatar_enter_from", "");
            boolean z3 = bundle.getBoolean("social_avatar_is_first_avatar", false);
            boolean z4 = bundle.getBoolean("social_avatar_is_using_user_bucket", false);
            long j2 = bundle.getLong("social_avatar_download_time_in_ms", -1L);
            int i4 = bundle.getInt("social_avatar_count", 0);
            boolean z5 = bundle.getBoolean("social_avatar_need_update", true);
            ChangeAvatarModel changeAvatarModel = videoPublishEditModel.creativeModel.changeAvatarModel;
            changeAvatarModel.isFromAiVatar = z;
            changeAvatarModel.isFromSocialAvatar = z2;
            changeAvatarModel.aiVatarMode = string4;
            changeAvatarModel.originPath = string2;
            changeAvatarModel.avatarStruct.setOriginAvatarUri(string);
            ChangeAvatarModel changeAvatarModel2 = videoPublishEditModel.creativeModel.changeAvatarModel;
            changeAvatarModel2.isSingletonRecover = true;
            changeAvatarModel2.firstEnterEdit = false;
            changeAvatarModel2.realEnterMethod = string3;
            changeAvatarModel2.skipDecorativeInfoStickers = bundle.getBoolean("skip_decorative_info_stickers", false);
            videoPublishEditModel.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setStyleSelection(Integer.valueOf(i));
            videoPublishEditModel.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setExpressionSelection(Integer.valueOf(i2));
            videoPublishEditModel.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setAvatarId(Long.valueOf(j));
            videoPublishEditModel.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setDynamicAvatarUri(string5);
            videoPublishEditModel.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setDynamicAvatarGifUri(string6);
            videoPublishEditModel.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setStaticAvatarUri(string7);
            videoPublishEditModel.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setCompiledAvatarUri(string8);
            videoPublishEditModel.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setEnterMethod(string9);
            videoPublishEditModel.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setEnterFrom(string10);
            videoPublishEditModel.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setFirstAvatar(Boolean.valueOf(z3));
            videoPublishEditModel.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setUsingUserBucket(Boolean.valueOf(z4));
            videoPublishEditModel.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setDownloadTimeInMs(Long.valueOf(j2));
            videoPublishEditModel.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setAvatarCount(Integer.valueOf(i4));
            videoPublishEditModel.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setNeedUpdate(Boolean.valueOf(z5));
            ChangeAvatarModel changeAvatarModel3 = videoPublishEditModel.creativeModel.changeAvatarModel;
            if (changeAvatarModel3.isFromSocialAvatar && (((avatarColor = changeAvatarModel3.socialAvatarUpdateInfoStruct.getAvatarColor()) == null || avatarColor.intValue() != i3) && (infoStickerModel = videoPublishEditModel.creativeModel.infoStickerModel) != null && (list = infoStickerModel.stickers) != null && (it2 = list.iterator()) != null)) {
                while (it2.hasNext()) {
                    if (it2.next().isTextSticker()) {
                        it2.remove();
                    }
                }
            }
            videoPublishEditModel.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setAvatarColor(Integer.valueOf(i3));
            videoPublishEditModel.mShootWay = "profile_photo";
            C570750Ma1.LIZ.getClass();
            Intent intentLIZJ = C570750Ma1.LIZJ(1, videoPublishEditModel);
            intentLIZJ.putExtra("shoot_way", videoPublishEditModel.mShootWay);
            intentLIZJ.putExtra("fromDraft", 1);
            intentLIZJ.putExtra("edit_publish_session_end_together", true);
            intentLIZJ.putExtra("open_platform_extra", videoPublishEditModel.getOpenPlatformExtra());
            intentLIZJ.putExtra("open_platform_client_key", videoPublishEditModel.getOpenPlatformClientKey());
            intentLIZJ.addFlags(603979776);
            function1.invoke(Boolean.TRUE);
            if (C0MKI.LIZ()) {
                C1660680tJi.LIZ().LJIIZILJ(c19eg, intentLIZJ, true);
            } else {
                C1660680tJi.LIZ().LJIIL(c19eg, intentLIZJ);
            }
        } else {
            ((Function1) awS118S0400000_22.l3).invoke(Boolean.FALSE);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS118S0400000_22 awS118S0400000_22, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        Context contextLIZIZ = C545820Lau.LIZIZ((ImageEditRootScene) awS118S0400000_22.l1);
        FrameLayout frameLayout = (FrameLayout) awS118S0400000_22.l2;
        FrameLayout frameLayout2 = (FrameLayout) awS118S0400000_22.l3;
        ((ImageEditRootScene) awS118S0400000_22.l1).requireSceneContext();
        C19684011zq c19684011zq = new C19684011zq(contextLIZIZ, frameLayout, frameLayout2, new C0FIG(), (ImageEditRootScene) awS118S0400000_22.l1, (C1DRG) obj);
        ((C559610Lx9) awS118S0400000_22.l0).getClass();
        c19684011zq.afterInit$als_release(jUptimeMillis);
        return c19684011zq;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS118S0400000_22 awS118S0400000_22, Object obj) {
        C1DRG c1drg = (C1DRG) obj;
        long jUptimeMillis = SystemClock.uptimeMillis();
        FrameLayout frameLayout = (FrameLayout) awS118S0400000_22.l1;
        FrameLayout frameLayout2 = (FrameLayout) awS118S0400000_22.l2;
        ImageEditRootScene imageEditRootScene = (ImageEditRootScene) awS118S0400000_22.l3;
        VideoPublishEditModel videoPublishEditModel = imageEditRootScene.LLJL;
        ImageAlbumData imageAlbumData = null;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        ImageAlbumData imageAlbumData2 = imageEditRootScene.LLJJL;
        if (imageAlbumData2 != null) {
            imageAlbumData = imageAlbumData2;
        }
        ImageGlobalEditStickerNewEngineComponent imageGlobalEditStickerNewEngineComponent = new ImageGlobalEditStickerNewEngineComponent(c1drg, frameLayout, frameLayout2, videoPublishEditModel, imageAlbumData, imageEditRootScene);
        ((C559610Lx9) awS118S0400000_22.l0).getClass();
        C559610Lx9.LIZ(imageGlobalEditStickerNewEngineComponent);
        imageGlobalEditStickerNewEngineComponent.afterInit$als_release(jUptimeMillis);
        return imageGlobalEditStickerNewEngineComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS118S0400000_22 awS118S0400000_22, Object obj) {
        TuxSheet tuxSheet;
        int iIntValue = ((Number) obj).intValue();
        ((Function1) awS118S0400000_22.l0).invoke(Integer.valueOf(iIntValue));
        if (((Function0) awS118S0400000_22.l1) == null) {
            try {
                if (!C1444740nhQ.LIZ(((PermissionConfigure) awS118S0400000_22.l2).getVideoPublishEditModel(), iIntValue)) {
                    C1444600nhC.LIZ.getClass();
                    if (!C1444600nhC.LIZ() && (tuxSheet = (TuxSheet) ((C259800zU) awS118S0400000_22.l3).element) != null) {
                        tuxSheet.WR();
                    }
                }
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS118S0400000_22 awS118S0400000_22, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C09K7 c09k7 = (C09K7) awS118S0400000_22.l0;
            if (c09k7 != null) {
                c09k7.LJJLIIIJLLLLLLLZ(bitmap);
            }
            C1443990ngD c1443990ngD = C1443990ngD.LIZ;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS118S0400000_22.l1;
            C1444000ngE c1444000ngE = (C1444000ngE) awS118S0400000_22.l2;
            C19EG c19eg = (C19EG) awS118S0400000_22.l3;
            c1443990ngD.getClass();
            C1443990ngD.LIZLLL(bitmap, videoPublishEditModel, c1444000ngE, c19eg, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS118S0400000_22 awS118S0400000_22, Object obj) {
        C09K7 c09k7;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C09K7 c09k72 = (C09K7) awS118S0400000_22.l0;
            if (c09k72 != null) {
                c09k72.LJJLIIIJLLLLLLLZ(bitmap);
            }
            C1443990ngD c1443990ngD = C1443990ngD.LIZ;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS118S0400000_22.l1;
            C1444000ngE c1444000ngE = (C1444000ngE) awS118S0400000_22.l2;
            C19EG c19eg = (C19EG) awS118S0400000_22.l3;
            c1443990ngD.getClass();
            Bitmap bitmapLIZLLL = C1443990ngD.LIZLLL(bitmap, videoPublishEditModel, c1444000ngE, c19eg, true);
            if (((VideoPublishEditModel) awS118S0400000_22.l1).isPcsPaidVideo() && (c09k7 = (C09K7) awS118S0400000_22.l0) != null) {
                c09k7.LJJLIIIJLLLLLLLZ(bitmapLIZLLL);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS118S0400000_22 awS118S0400000_22, Object obj) {
        C1449230nof c1449230nof = (C1449230nof) obj;
        c1449230nof.LJ = (Effect) awS118S0400000_22.l0;
        c1449230nof.LJFF = false;
        c1449230nof.LJII = C1697810uHb.LJIIJJI((C07TU) awS118S0400000_22.l1, (C00YV) awS118S0400000_22.l2, (C0253006p) awS118S0400000_22.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS118S0400000_22 awS118S0400000_22, Object obj) {
        C1435560nSc.LIZ((InterfaceC1452170ntP) awS118S0400000_22.l0, (SynthetiseResult) awS118S0400000_22.l1, (C1435560nSc) awS118S0400000_22.l2, (C1435540nSa) awS118S0400000_22.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0400000_22(C09K7 c09k7, VideoPublishEditModel videoPublishEditModel, C1444000ngE c1444000ngE, C19EG c19eg, int i) {
        super(1);
        this.$t = i;
        this.l0 = c09k7;
        this.l1 = videoPublishEditModel;
        this.l2 = c1444000ngE;
        this.l3 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0400000_22(InterfaceC1452170ntP interfaceC1452170ntP, SynthetiseResult synthetiseResult, C1435560nSc c1435560nSc, C1435540nSa c1435540nSa, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1452170ntP;
        this.l1 = synthetiseResult;
        this.l2 = c1435560nSc;
        this.l3 = c1435540nSa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS118S0400000_22(C19EG c19eg, C19EG c19eg2, VideoPublishEditModel videoPublishEditModel, Bundle bundle, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c19eg;
        this.l1 = c19eg2;
        this.l2 = videoPublishEditModel;
        this.l3 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0400000_22(Effect effect, C07TU c07tu, C00YV c00yv, C0253006p c0253006p, int i) {
        super(1);
        this.$t = i;
        this.l0 = effect;
        this.l1 = c07tu;
        this.l2 = c00yv;
        this.l3 = c0253006p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS118S0400000_22(Function1 function1, Function1<? super Integer, Unit> function12, Function0<Unit> function0, PermissionConfigure permissionConfigure, C259800zU<TuxSheet> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = function0;
        this.l3 = permissionConfigure;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0400000_22(C0ET4 c0et4, C559610Lx9 c559610Lx9, FrameLayout frameLayout, FrameLayout frameLayout2, ImageEditRootScene imageEditRootScene, int i) {
        super(1);
        this.$t = i;
        this.l0 = c559610Lx9;
        this.l1 = frameLayout;
        this.l2 = frameLayout2;
        this.l3 = imageEditRootScene;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0400000_22(C0ET4 c0et4, C559610Lx9 c559610Lx9, ImageEditRootScene imageEditRootScene, FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c559610Lx9;
        this.l1 = imageEditRootScene;
        this.l2 = frameLayout;
        this.l3 = frameLayout2;
    }
}
