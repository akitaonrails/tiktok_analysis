package kotlin.jvm.internal;

import X.C01TT;
import X.C05P0;
import X.C05XL;
import X.C09AY;
import X.C0E48;
import X.C0E6P;
import X.C0L21;
import X.C0L6K;
import X.C0LJ5;
import X.C0LJP;
import X.C0ML7;
import X.C0MRJ;
import X.C0MVR;
import X.C0MVT;
import X.C0PEM;
import X.C0ZDN;
import X.C1322110kVd;
import X.C1378605aS;
import X.C1390380mHk;
import X.C13LQ;
import X.C15O7;
import X.C1697810uHb;
import X.C19EG;
import X.C201955140j;
import X.C2188811AlT;
import X.C2286708xd;
import X.C2296808zG;
import X.C23250099c;
import X.C2471909mP;
import X.C259800zU;
import X.C433800Gzi;
import X.C534440Kxe;
import X.C534470Kxh;
import X.C534490Kxj;
import X.C534580Kxs;
import X.C540290LGx;
import X.C563720M9a;
import X.C563760M9e;
import X.C575330MhP;
import X.C576130Mih;
import X.InterfaceC2329309At;
import X.InterfaceC529900KqK;
import Y.ACallableS47S0210000_8;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveBusinessGiftHighlight;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.v2.assem.MusicCreateSongAssem;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRoomDatabase;
import com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;

/* JADX INFO: loaded from: classes9.dex */
public class AwS286S0300000_8 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS286S0300000_8 awS286S0300000_8, Object obj, Object obj2) {
        C0LJP c0ljp = C0LJP.LIZ;
        C19EG c19eg = (C19EG) awS286S0300000_8.l0;
        String string = c19eg.getString(2131858353);
        Function0 function0 = (Function0) awS286S0300000_8.l1;
        Function0 function02 = (Function0) awS286S0300000_8.l2;
        c0ljp.getClass();
        C0LJP.LIZIZ(c19eg, null, string, function0, function02);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS286S0300000_8 awS286S0300000_8, Object obj, Object obj2) {
        C540290LGx c540290LGx = C540290LGx.LIZ;
        C19EG c19eg = (C19EG) awS286S0300000_8.l0;
        Function0 function0 = (Function0) awS286S0300000_8.l1;
        Function0 function02 = (Function0) awS286S0300000_8.l2;
        AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(190);
        c540290LGx.getClass();
        C540290LGx.LJII(c19eg, function0, function02, aFwS194S0000000_8);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AwS286S0300000_8 r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r7 = r12
            X.0tpg r7 = (X.InterfaceC1680500tpg) r7
            java.lang.Number r13 = (java.lang.Number) r13
            int r0 = r13.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r7.LIZ()
            if (r0 == 0) goto L1a
            r7.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131834177(0x7f113541, float:1.9301457E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r0, r7)
            r10 = 1
            r4 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r7.LJJIIJZLJL(r4)
            java.lang.Object r0 = r11.l0
            X.0E6P r0 = (X.C0E6P) r0
            boolean r5 = r7.LJII(r0)
            java.lang.Object r0 = r11.l1
            X.0E48 r0 = (X.C0E48) r0
            boolean r0 = r7.LJII(r0)
            r5 = r5 | r0
            java.lang.Object r0 = r11.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r7.LJJIIJ(r0)
            r5 = r5 | r0
            java.lang.Object r3 = r11.l0
            X.0E6P r3 = (X.C0E6P) r3
            java.lang.Object r2 = r11.l2
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r11.l1
            X.0E48 r1 = (X.C0E48) r1
            java.lang.Object r9 = r7.LJJ()
            if (r5 != 0) goto L5d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r9 != r0) goto L67
        L5d:
            kotlin.jvm.internal.AwS249S0300000_5 r9 = new kotlin.jvm.internal.AwS249S0300000_5
            r0 = 30
            r9.<init>(r3, r1, r2, r0)
            r7.LJJIJIIJI(r9)
        L67:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r7.LJ()
            r5 = 48
            r6 = 0
            X.C1668330tW3.LJIIIIZZ(r5, r6, r7, r8, r9, r10)
            r0 = 2131834176(0x7f113540, float:1.9301455E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r0, r7)
            r7.LJJIIJZLJL(r4)
            java.lang.Object r0 = r11.l0
            X.0E6P r0 = (X.C0E6P) r0
            boolean r4 = r7.LJII(r0)
            java.lang.Object r0 = r11.l1
            X.0E48 r0 = (X.C0E48) r0
            boolean r0 = r7.LJII(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r11.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r7.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r11.l0
            X.0E6P r3 = (X.C0E6P) r3
            java.lang.Object r2 = r11.l2
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r11.l1
            X.0E48 r1 = (X.C0E48) r1
            java.lang.Object r9 = r7.LJJ()
            if (r4 != 0) goto Lb1
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r9 != r0) goto Lbb
        Lb1:
            kotlin.jvm.internal.AwS249S0300000_5 r9 = new kotlin.jvm.internal.AwS249S0300000_5
            r0 = 31
            r9.<init>(r3, r1, r2, r0)
            r7.LJJIJIIJI(r9)
        Lbb:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r7.LJ()
            r5 = 48
            r6 = 0
            X.C1668330tW3.LJIIIZ(r5, r6, r7, r8, r9, r10)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS286S0300000_8.invoke$10(kotlin.jvm.internal.AwS286S0300000_8, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$11(AwS286S0300000_8 awS286S0300000_8, Object obj, Object obj2) {
        String message;
        ((Boolean) obj).booleanValue();
        Throwable th = (Throwable) obj2;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        if (u.LJIJI(message, "MusicResModelParser Failed", false)) {
            Context context = (Context) awS286S0300000_8.l0;
            EditConfig editConfig = (EditConfig) awS286S0300000_8.l1;
            LiveBusinessGiftHighlight liveBusinessGiftHighlight = (LiveBusinessGiftHighlight) awS286S0300000_8.l2;
            PublishPageParams publishPageParams = liveBusinessGiftHighlight.getPublishPageParams();
            if (publishPageParams != null) {
                publishPageParams.musicId = "";
            }
            C575330MhP.LIZ(context, editConfig, liveBusinessGiftHighlight);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS286S0300000_8 awS286S0300000_8, Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (bitmap != null && !bitmap.isRecycled()) {
            ((C1322110kVd) awS286S0300000_8.l0).setImageBitmap(bitmap);
            Function0 function0 = (Function0) awS286S0300000_8.l1;
            if (function0 != null) {
                function0.invoke();
            }
            C15O7.LIZJ(new ACallableS47S0210000_8(bitmap, (VideoPublishEditModel) awS286S0300000_8.l2, zBooleanValue, 2));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    public static final Object invoke$13(AwS286S0300000_8 awS286S0300000_8, Object obj, Object obj2) throws Throwable {
        ((Number) obj).intValue();
        C259800zU c259800zU = (C259800zU) awS286S0300000_8.l0;
        String str = ((AwemeDraft) awS286S0300000_8.l1).LIZ.editorProDraftModel.canvasCoverPath;
        ?? r0 = str;
        if (str == null) {
            r0 = "";
        }
        c259800zU.element = r0;
        if (r0.length() > 0 && C2286708xd.LIZJ((String) ((C259800zU) awS286S0300000_8.l0).element)) {
            String str2 = (String) ((C259800zU) awS286S0300000_8.l0).element;
            str2.toString();
            Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(str2, null);
            if (bitmapLIZLLL != null) {
                ((InterfaceC2329309At) awS286S0300000_8.l2).onSuccess(C0MVT.LIZ(bitmapLIZLLL));
            }
        } else {
            ((InterfaceC2329309At) awS286S0300000_8.l2).tryOnError(new NullPointerException());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS286S0300000_8 awS286S0300000_8, Object obj, Object obj2) {
        long j = ((C1378605aS) obj).LIZ;
        SocMediaResource socMediaResource = (SocMediaResource) obj2;
        if (((SocialMediaPickerViewModel) awS286S0300000_8.l0).LL.getMediaAreaUIConfig().getSupportLongPress() && !((SocialMediaPickerViewModel) awS286S0300000_8.l0).wQ2()) {
            ((C0ZDN) ((C05P0) awS286S0300000_8.l1).getValue()).LIZ(0);
            ((C05P0) awS286S0300000_8.l2).setValue(socMediaResource);
            ((SocialMediaPickerViewModel) awS286S0300000_8.l0).onEvent$social_creation_mediapicker_release(new C563720M9a(j, socMediaResource));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS286S0300000_8 awS286S0300000_8, Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            if (C0L21.LIZIZ((SocMediaResource) awS286S0300000_8.l0, bitmap) != null) {
                ((C433800Gzi) awS286S0300000_8.l1).LJIIIZ(((SocMediaResource) awS286S0300000_8.l0).tiktokMediaModel, bitmap);
            }
            ((InterfaceC529900KqK) awS286S0300000_8.l2).LIZ();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS286S0300000_8 awS286S0300000_8, Object obj, Object obj2) {
        MediaModel mediaModel;
        C01TT.LIZLLL(new AwS409S0200000_8((C0MRJ) awS286S0300000_8.l1, (SmartImageView) awS286S0300000_8.l2, 92));
        if (obj == null && (mediaModel = ((ForwardMedia) awS286S0300000_8.l0).localMedia) != null) {
            C0ML7.LIZ.getClass();
            C0ML7.LJIILIIL("load_local_video_cover", "", C1697810uHb.LJ(mediaModel.mimeType));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS286S0300000_8 awS286S0300000_8, Object obj, Object obj2) {
        Object next;
        String localSongPath;
        List list = (List) obj;
        String str = (String) obj2;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((MemeSongModel) next).isSelected()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        MemeSongModel memeSongModel = (MemeSongModel) next;
        if (memeSongModel != null && (localSongPath = memeSongModel.getLocalSongPath()) != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C576130Mih((MusicCreateSongAssem) awS286S0300000_8.l0, memeSongModel, str, (AsyncAVService) awS286S0300000_8.l1, (C19EG) awS286S0300000_8.l2, list, localSongPath, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS286S0300000_8 awS286S0300000_8, Object obj, Object obj2) {
        ShortVideoContext shortVideoContext = (ShortVideoContext) obj;
        ((Function1) awS286S0300000_8.l0).invoke(obj2);
        C563760M9e c563760M9e = (C563760M9e) awS286S0300000_8.l1;
        EnterStoryParam enterStoryParam = (EnterStoryParam) awS286S0300000_8.l2;
        c563760M9e.getClass();
        if (!enterStoryParam.isFromSocialCameraEntrance()) {
            if (C0LJ5.LIZIZ() && C0LJ5.LIZ().enableAsyncMobShootForAlbum) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0L6K(c563760M9e, enterStoryParam, shortVideoContext, null), 3);
            } else {
                C563760M9e.LIZJ(enterStoryParam, shortVideoContext);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS286S0300000_8 awS286S0300000_8, Object obj, Object obj2) {
        Integer numValueOf;
        BaseException failedException;
        BaseException failedException2;
        BaseException failedException3;
        BaseException failedException4;
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        C534490Kxj c534490Kxj = (C534490Kxj) obj2;
        CreativeLoadingDialog creativeLoadingDialog = (CreativeLoadingDialog) ((C259800zU) awS286S0300000_8.l0).element;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
        }
        C05XL c05xl = (C05XL) awS286S0300000_8.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String errorMessage = null;
        if (downloadInfo != null && (failedException4 = downloadInfo.getFailedException()) != null) {
            numValueOf = Integer.valueOf(failedException4.getErrorCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" - ");
        if (downloadInfo != null && (failedException3 = downloadInfo.getFailedException()) != null) {
            errorMessage = failedException3.getErrorMessage();
        }
        sbLIZ.append(errorMessage);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ == null) {
            strLIZIZ = "-1 - onFailed(null)";
        }
        c05xl.LJIIZILJ(strLIZIZ);
        C534580Kxs c534580Kxs = C534580Kxs.LIZIZ;
        ((C534440Kxe) awS286S0300000_8.l2).getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("DownloadAllOnlineVideoTask, onfailed: ");
        sbLIZ2.append(downloadInfo);
        C201955140j.LIZLLL(c534580Kxs, "download_all_online_video_task", C2188811AlT.LIZIZ(sbLIZ2));
        if (downloadInfo == null || (((failedException = downloadInfo.getFailedException()) == null || failedException.getErrorCode() != -999) && ((failedException2 = downloadInfo.getFailedException()) == null || failedException2.getErrorCode() != -9999))) {
            Context context = ((C534440Kxe) awS286S0300000_8.l2).LIZ;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131853551);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZJ(context, 3047, creativeToastBuilder);
        }
        ((C534440Kxe) awS286S0300000_8.l2).getClass();
        C534440Kxe.LIZLLL(c534490Kxj, false, downloadInfo);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS286S0300000_8 awS286S0300000_8, Object obj, Object obj2) {
        Object next;
        C534490Kxj c534490Kxj = (C534490Kxj) obj;
        DownloadInfo downloadInfo = (DownloadInfo) obj2;
        Iterator it2 = ((List) awS286S0300000_8.l0).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((MediaModel) next).id, String.valueOf(c534490Kxj.LIZ))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        MediaModel mediaModel = (MediaModel) next;
        if (mediaModel != null) {
            mediaModel.LJIILL(c534490Kxj.LIZIZ());
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(((C534440Kxe) awS286S0300000_8.l1).LIZIZ), C0PEM.LIZJ, null, new C534470Kxh((C534440Kxe) awS286S0300000_8.l1, c534490Kxj, downloadInfo, (LiveRecordingsRoomDatabase) awS286S0300000_8.l2, null), 2);
        return null;
    }

    public static final Object invoke$9(AwS286S0300000_8 awS286S0300000_8, Object obj, Object obj2) {
        Integer numLJJIIJ;
        Object[] objArr = (Object[]) obj;
        int[] iArr = (int[]) obj2;
        String[] strArr = (String[]) awS286S0300000_8.l0;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str = strArr[i];
                if (objArr == null || C13LQ.LJJIJIIJI(str, objArr) < 0) {
                    break;
                }
                int iLJJIJIIJI = C13LQ.LJJIJIIJI(str, objArr);
                if (iArr == null || (numLJJIIJ = C13LQ.LJJIIJ(iLJJIJIIJI, iArr)) == null || numLJJIIJ.intValue() != 0) {
                    break;
                }
                i++;
            } else {
                ((Function0) awS286S0300000_8.l2).invoke();
                break;
            }
        }
        Function0 function0 = (Function0) awS286S0300000_8.l1;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS286S0300000_8(C259800zU c259800zU, C259800zU<CreativeLoadingDialog> c259800zU2, C05XL<String> c05xl, C534440Kxe c534440Kxe) {
        super(2);
        this.$t = c534440Kxe;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c05xl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS286S0300000_8(C259800zU c259800zU, C259800zU<String> c259800zU2, AwemeDraft awemeDraft, InterfaceC2329309At<C0MVR> interfaceC2329309At) {
        super(2);
        this.$t = interfaceC2329309At;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = awemeDraft;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS286S0300000_8(C0E6P c0e6p, C0E6P c0e6p2, C0E48 c0e48, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c0e6p;
        this.l1 = c0e6p2;
        this.l2 = c0e48;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS286S0300000_8(C1322110kVd c1322110kVd, VideoPublishEditModel videoPublishEditModel, AwS552S0100000_8 awS552S0100000_8, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1322110kVd;
        this.l1 = awS552S0100000_8;
        this.l2 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS286S0300000_8(C19EG c19eg, C19EG c19eg2, Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.$t = function02;
        this.l0 = c19eg;
        this.l1 = c19eg2;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS286S0300000_8(C19EG c19eg, AFwS194S0000000_8 aFwS194S0000000_8, AwS137S0400000_8 awS137S0400000_8, int i) {
        super(2);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = aFwS194S0000000_8;
        this.l2 = awS137S0400000_8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS286S0300000_8(Context context, EditConfig editConfig, LiveBusinessGiftHighlight liveBusinessGiftHighlight, int i) {
        super(2);
        this.$t = i;
        this.l0 = context;
        this.l1 = editConfig;
        this.l2 = liveBusinessGiftHighlight;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS286S0300000_8(ForwardMedia forwardMedia, C0MRJ c0mrj, SmartImageView smartImageView, int i) {
        super(2);
        this.$t = i;
        this.l0 = forwardMedia;
        this.l1 = c0mrj;
        this.l2 = smartImageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS286S0300000_8(MusicCreateSongAssem musicCreateSongAssem, AsyncAVService asyncAVService, C19EG c19eg, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicCreateSongAssem;
        this.l1 = asyncAVService;
        this.l2 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS286S0300000_8(SocMediaResource socMediaResource, C433800Gzi c433800Gzi, InterfaceC529900KqK interfaceC529900KqK, int i) {
        super(2);
        this.$t = i;
        this.l0 = socMediaResource;
        this.l1 = c433800Gzi;
        this.l2 = interfaceC529900KqK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS286S0300000_8(SocialMediaPickerViewModel socialMediaPickerViewModel, SocialMediaPickerViewModel socialMediaPickerViewModel2, C05P0<C0ZDN> c05p0, C05P0<SocMediaResource> c05p02) {
        super(2);
        this.$t = c05p02;
        this.l0 = socialMediaPickerViewModel;
        this.l1 = socialMediaPickerViewModel2;
        this.l2 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS286S0300000_8(List list, List<? extends MediaModel> list2, C534440Kxe c534440Kxe, LiveRecordingsRoomDatabase liveRecordingsRoomDatabase) {
        super(2);
        this.$t = liveRecordingsRoomDatabase;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c534440Kxe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS286S0300000_8(Function1 function1, Function1<? super Bundle, Unit> function12, C563760M9e c563760M9e, EnterStoryParam enterStoryParam) {
        super(2);
        this.$t = enterStoryParam;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = c563760M9e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS286S0300000_8(String[] strArr, String[] strArr2, Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.$t = function02;
        this.l0 = strArr;
        this.l1 = strArr2;
        this.l2 = function0;
    }
}
