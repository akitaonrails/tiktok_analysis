package com.ss.android.ugc.aweme.shortvideo;

import X.C04TD;
import X.C0L1B;
import X.C0L1E;
import X.C0L2T;
import X.C0L4P;
import X.C0MP7;
import X.C19EG;
import X.C1DRG;
import X.C525640KjS;
import X.C531590Kt3;
import X.C533830Kwf;
import X.C535980L0i;
import X.C536010L0l;
import X.C536060L0q;
import X.C536080L0s;
import X.C536160L1a;
import X.C536540L2m;
import X.C536550L2n;
import X.C537330L5n;
import X.C558490LvL;
import X.InterfaceC522520KeQ;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NewBackgroundVideoPipelineModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.cut.DiyPropVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import com.ss.android.ugc.aweme.sticker.ab.ChangeImagePickerUIExperiment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;
import com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.AIPlaygroundAIGCChooseResultImpl;
import com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.EditorProAIGCChooseResultImpl;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.entry.anchor.AiChatAnchorChosenResultImpl;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import dmt.av.video.SingleImageCoverBitmapData;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS7S0100200_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MediaChosenResultProcessFactory implements IMediaChosenResultProcessFactory {
    public static IMediaChosenResultProcessFactory LIZJ() {
        Object objLIZ = C04TD.LIZ(IMediaChosenResultProcessFactory.class, false);
        if (objLIZ != null) {
            return (IMediaChosenResultProcessFactory) objLIZ;
        }
        if (C04TD.d5 == null) {
            synchronized (IMediaChosenResultProcessFactory.class) {
                if (C04TD.d5 == null) {
                    C04TD.d5 = new MediaChosenResultProcessFactory();
                }
            }
        }
        return C04TD.d5;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory
    public final C536060L0q LIZIZ(Activity activity) {
        return new C536060L0q(activity);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory
    public final InterfaceC522520KeQ LIZ(final C19EG c19eg, C1DRG c1drg, int i, final long j, final long j2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 7) {
                    if (i != 8) {
                        if (i != 17) {
                            if (i != 18) {
                                if (i != 28) {
                                    if (i != 29) {
                                        if (i != 54) {
                                            if (i != 55) {
                                                if (i != 68) {
                                                    if (i != 69) {
                                                        if (i != -65) {
                                                            if (i != 15) {
                                                                if (i != 51) {
                                                                    if (i != 59) {
                                                                        switch (i) {
                                                                            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                                                                return new InterfaceC522520KeQ(c19eg) { // from class: X.0KhC
                                                                                    public final C19EG LL;

                                                                                    @Override // X.InterfaceC522520KeQ
                                                                                    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
                                                                                    }

                                                                                    @Override // X.InterfaceC522520KeQ
                                                                                    public final void LJJLIIIJJIZ() {
                                                                                    }

                                                                                    {
                                                                                        this.LL = c19eg;
                                                                                    }

                                                                                    @Override // X.InterfaceC522520KeQ
                                                                                    public final void LIZ(int i2, int i3, Intent intent) throws Throwable {
                                                                                        boolean z;
                                                                                        ArrayList<MediaModel> parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
                                                                                        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                                                                                            z = false;
                                                                                        } else {
                                                                                            z = true;
                                                                                        }
                                                                                        if (z) {
                                                                                            C19EG c19eg2 = this.LL;
                                                                                            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                                                                                            creativeToastBuilder.messageRes(R.string.nfi);
                                                                                            creativeToastBuilder.isTuxToast(true);
                                                                                            C1390380mHk.LIZ(c19eg2, 3076, creativeToastBuilder);
                                                                                            return;
                                                                                        }
                                                                                        for (MediaModel mediaModel : parcelableArrayListExtra) {
                                                                                            if (mediaModel.width <= 0 || mediaModel.height <= 0) {
                                                                                                C19EG c19eg3 = this.LL;
                                                                                                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                                                                                                creativeToastBuilder2.messageRes(2131840047);
                                                                                                creativeToastBuilder2.isTuxToast(true);
                                                                                                C1390380mHk.LIZ(c19eg3, 3076, creativeToastBuilder2);
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        C2204961BRm.LLJJIJIL(100, intent, this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkj9dPSVF/XyG/+XDBbwJ/OleZzFPj3ST1PeehAgxI+i0P/BAkBK5JYS3vnbOyvcKZlwUKg==", null));
                                                                                        this.LL.finish();
                                                                                    }
                                                                                };
                                                                            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                                                                return new InterfaceC522520KeQ(c19eg) { // from class: X.0L34
                                                                                    public final Activity LL;

                                                                                    @Override // X.InterfaceC522520KeQ
                                                                                    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
                                                                                    }

                                                                                    @Override // X.InterfaceC522520KeQ
                                                                                    public final void LJJLIIIJJIZ() {
                                                                                    }

                                                                                    {
                                                                                        this.LL = c19eg;
                                                                                    }

                                                                                    @Override // X.InterfaceC522520KeQ
                                                                                    public final void LIZ(int i2, int i3, Intent intent) {
                                                                                        ArrayList parcelableArrayListExtra;
                                                                                        ShortVideoContext shortVideoContext;
                                                                                        DiyPropVideoCompileConfigure diyPropVideoCompileConfigureLIZIZ;
                                                                                        long maxShootingDuration;
                                                                                        long j3;
                                                                                        Intent intent2;
                                                                                        if (i3 == -1 && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) != null && (shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context")) != null && !parcelableArrayListExtra.isEmpty() && !C2105908Mv.LIZ(((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).LJFF())) {
                                                                                            C530750Krh.LJFF.LIZ();
                                                                                            Intent intent3 = new Intent();
                                                                                            intent3.putExtra("file_path", ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).LJFF());
                                                                                            intent3.putExtra("from_diy_prop_video", true);
                                                                                            intent3.putExtra("enter_method", shortVideoContext.enterMethod);
                                                                                            C537520L6g.LIZLLL(intent3, shortVideoContext.creativeInfo);
                                                                                            Workspace workspace = shortVideoContext.cameraComponentModel.mWorkspace;
                                                                                            DiyPropUploadVideoAutoCutConfigure diyPropUploadVideoAutoCutConfigure = null;
                                                                                            if (workspace != null) {
                                                                                                diyPropVideoCompileConfigureLIZIZ = C0L35.LIZIZ(workspace);
                                                                                            } else {
                                                                                                diyPropVideoCompileConfigureLIZIZ = null;
                                                                                            }
                                                                                            intent3.putExtra("diy_prop_video_compile_configure", diyPropVideoCompileConfigureLIZIZ);
                                                                                            Activity activity = this.LL;
                                                                                            if (activity != null && (intent2 = activity.getIntent()) != null) {
                                                                                                diyPropUploadVideoAutoCutConfigure = (DiyPropUploadVideoAutoCutConfigure) intent2.getParcelableExtra("diy_prop_upload_video_configure");
                                                                                            }
                                                                                            if (shortVideoContext.cameraComponentModel.mCurrentDurationMode) {
                                                                                                maxShootingDuration = C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration(shortVideoContext.shootMode);
                                                                                            } else {
                                                                                                maxShootingDuration = 15000;
                                                                                            }
                                                                                            if (diyPropUploadVideoAutoCutConfigure != null) {
                                                                                                j3 = diyPropUploadVideoAutoCutConfigure.maxDuration;
                                                                                            } else {
                                                                                                j3 = maxShootingDuration;
                                                                                            }
                                                                                            intent3.putExtra("cut_video_max_length", Math.min(maxShootingDuration, j3));
                                                                                            intent3.putExtra("diy_prop_upload_video_configure", diyPropUploadVideoAutoCutConfigure);
                                                                                            Activity activity2 = this.LL;
                                                                                            if (activity2 != null) {
                                                                                                C1660680tJi.LIZ().LJIILJJIL(activity2, i2, intent3);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                };
                                                                            case 35:
                                                                                return new C0L1B(c19eg);
                                                                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                                                                return new C0L1E(c19eg);
                                                                            case 37:
                                                                                return new InterfaceC522520KeQ(c19eg) { // from class: X.0Kwh
                                                                                    public final C19EG LL;

                                                                                    @Override // X.InterfaceC522520KeQ
                                                                                    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
                                                                                    }

                                                                                    @Override // X.InterfaceC522520KeQ
                                                                                    public final void LJJLIIIJJIZ() {
                                                                                    }

                                                                                    {
                                                                                        this.LL = c19eg;
                                                                                    }

                                                                                    @Override // X.InterfaceC522520KeQ
                                                                                    public final void LIZ(int i2, int i3, Intent intent) {
                                                                                        ArrayList arrayList;
                                                                                        int i4;
                                                                                        CreativeModel creativeModel;
                                                                                        C198H c198hLC;
                                                                                        String str;
                                                                                        ArrayList<MediaModel> parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
                                                                                        CreativeModel creativeModel2 = null;
                                                                                        int i5 = 0;
                                                                                        if (parcelableArrayListExtra != null) {
                                                                                            arrayList = new ArrayList(C15438062q.LJIJJ(parcelableArrayListExtra, 10));
                                                                                            i4 = 0;
                                                                                            for (MediaModel mediaModel : parcelableArrayListExtra) {
                                                                                                i5++;
                                                                                                if (mediaModel.LJIILJJIL()) {
                                                                                                    i4++;
                                                                                                }
                                                                                                OnThisDayTiktokMediaModel onThisDayTiktokMediaModel = new OnThisDayTiktokMediaModel(mediaModel.id, EnumC538220L8y.PHOTO_PICKER, (String) null, 12);
                                                                                                onThisDayTiktokMediaModel.date = mediaModel.date;
                                                                                                onThisDayTiktokMediaModel.height = mediaModel.height;
                                                                                                onThisDayTiktokMediaModel.width = mediaModel.width;
                                                                                                onThisDayTiktokMediaModel.duration = mediaModel.duration;
                                                                                                onThisDayTiktokMediaModel.LJIILL(mediaModel.LJFF());
                                                                                                if (mediaModel instanceof TikTokMediaModel) {
                                                                                                    str = mediaModel.mediaPickerAbsolutePath;
                                                                                                } else {
                                                                                                    str = null;
                                                                                                }
                                                                                                onThisDayTiktokMediaModel.mediaPickerAbsolutePath = str;
                                                                                                onThisDayTiktokMediaModel.type = mediaModel.type;
                                                                                                onThisDayTiktokMediaModel.modify = mediaModel.modify;
                                                                                                arrayList.add(onThisDayTiktokMediaModel);
                                                                                            }
                                                                                        } else {
                                                                                            arrayList = null;
                                                                                            i4 = 0;
                                                                                        }
                                                                                        intent.putExtra("key_choose_media_data", C09HN.LIZ(arrayList));
                                                                                        ShortVideoContext shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
                                                                                        int i6 = i5 - i4;
                                                                                        C0ML8.LIZ.getClass();
                                                                                        C0LAB c0lab = new C0LAB();
                                                                                        C0ML7 c0ml7 = C0ML7.LIZ;
                                                                                        if (shortVideoContext != null) {
                                                                                            creativeModel = shortVideoContext.creativeModel;
                                                                                        } else {
                                                                                            creativeModel = null;
                                                                                        }
                                                                                        c0ml7.getClass();
                                                                                        C0ML7.LIZ(creativeModel, c0lab);
                                                                                        C0ML9.LIZLLL(c0lab, shortVideoContext);
                                                                                        if (shortVideoContext != null) {
                                                                                            creativeModel2 = shortVideoContext.creativeModel;
                                                                                        }
                                                                                        C0ML9.LIZIZ(creativeModel2, c0lab);
                                                                                        c0lab.LIZ(i5, "local_cnt");
                                                                                        c0lab.LIZ(i6, "pic_cnt");
                                                                                        c0lab.LIZ(i4, "video_cnt");
                                                                                        C20684815ws.LJIILLIIL("on_this_day_select_local_content_next", c0lab.LIZ);
                                                                                        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(this.LL);
                                                                                        if (interfaceC20597015iiLIZJ != null && (c198hLC = interfaceC20597015iiLIZJ.LC()) != null) {
                                                                                            c198hLC.setResult(-1, intent);
                                                                                            c198hLC.finish();
                                                                                        }
                                                                                    }
                                                                                };
                                                                            case 38:
                                                                                return new EditorProAIGCChooseResultImpl(c19eg);
                                                                            case 39:
                                                                                return new AIPlaygroundAIGCChooseResultImpl(c19eg);
                                                                            default:
                                                                                switch (i) {
                                                                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                                                        return new InterfaceC522520KeQ(c19eg) { // from class: X.0L3l
                                                                                            public final C19EG LL;
                                                                                            public ShortVideoContext LLILLJJLI;
                                                                                            public C537830L7l LLILLL;

                                                                                            @Override // X.InterfaceC522520KeQ
                                                                                            public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
                                                                                            }

                                                                                            @Override // X.InterfaceC522520KeQ
                                                                                            public final void LJJLIIIJJIZ() {
                                                                                                C0L4A c0l4a;
                                                                                                C537830L7l c537830L7l = this.LLILLL;
                                                                                                if (c537830L7l == null || (c0l4a = c537830L7l.LJ) == null) {
                                                                                                    return;
                                                                                                }
                                                                                                CreativeDialogWrapper creativeDialogWrapper = c0l4a.LIZ;
                                                                                                if (creativeDialogWrapper != null) {
                                                                                                    creativeDialogWrapper.dismiss();
                                                                                                }
                                                                                                InterfaceC354490Dv5 interfaceC354490Dv5 = c0l4a.LIZIZ;
                                                                                                if (interfaceC354490Dv5 != null) {
                                                                                                    interfaceC354490Dv5.cancel();
                                                                                                }
                                                                                                ((Handler) C536830L3p.LIZ.getValue()).removeCallbacks(c0l4a.LJ);
                                                                                            }

                                                                                            {
                                                                                                this.LL = c19eg;
                                                                                            }

                                                                                            /* JADX WARN: Removed duplicated region for block: B:160:0x03d8  */
                                                                                            @Override // X.InterfaceC522520KeQ
                                                                                            /*
                                                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                                                                To view partially-correct add '--show-bad-code' argument
                                                                                            */
                                                                                            public final void LIZ(int r74, int r75, android.content.Intent r76) {
                                                                                                /*
                                                                                                    Method dump skipped, instruction units count: 988
                                                                                                    To view this dump add '--comments-level debug' option
                                                                                                */
                                                                                                throw new UnsupportedOperationException("Method not decompiled: X.C536790L3l.LIZ(int, int, android.content.Intent):void");
                                                                                            }
                                                                                        };
                                                                                    case BdTuring.TYPE_EMAIL /* 11 */:
                                                                                        return new C535980L0i(c19eg, c1drg);
                                                                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                                                        return new C536080L0s(c19eg, j, j2);
                                                                                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                                                        break;
                                                                                    default:
                                                                                        switch (i) {
                                                                                            case 21:
                                                                                                return new C536160L1a(c19eg);
                                                                                            case 22:
                                                                                                return new C558490LvL(c19eg);
                                                                                            case 23:
                                                                                                break;
                                                                                            default:
                                                                                                switch (i) {
                                                                                                    case BaseNotice.CREATOR /* 62 */:
                                                                                                        return new C536010L0l(c19eg);
                                                                                                    case 63:
                                                                                                        return new C537330L5n(c19eg);
                                                                                                    case 64:
                                                                                                        if (c1drg != null) {
                                                                                                            return new C525640KjS(c19eg, c1drg);
                                                                                                        }
                                                                                                        "diContainer should not be null when use OpenAPI".toString();
                                                                                                        throw new IllegalArgumentException("diContainer should not be null when use OpenAPI");
                                                                                                    default:
                                                                                                        return new C0MP7(c19eg);
                                                                                                }
                                                                                        }
                                                                                        break;
                                                                                }
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        return new C536010L0l(c19eg);
                                                                    }
                                                                } else {
                                                                    return new C536550L2n(j, j2, c19eg, c1drg);
                                                                }
                                                            } else {
                                                                return new InterfaceC522520KeQ(c19eg) { // from class: X.0Kql
                                                                    public final C19EG LL;

                                                                    @Override // X.InterfaceC522520KeQ
                                                                    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
                                                                    }

                                                                    @Override // X.InterfaceC522520KeQ
                                                                    public final void LJJLIIIJJIZ() {
                                                                    }

                                                                    {
                                                                        this.LL = c19eg;
                                                                    }

                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    @Override // X.InterfaceC522520KeQ
                                                                    public final void LIZ(int i2, int i3, Intent intent) {
                                                                        ArrayList parcelableArrayListExtra;
                                                                        String stringExtra;
                                                                        String stringExtra2;
                                                                        String str;
                                                                        boolean z;
                                                                        if (i3 == -1 && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) != null && !parcelableArrayListExtra.isEmpty() && !TextUtils.isEmpty(((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).LJFF())) {
                                                                            C530750Krh.LJFF.LIZ();
                                                                            MediaModel mediaModel = (MediaModel) ListProtector.get(parcelableArrayListExtra, 0);
                                                                            Effect effect = (Effect) intent.getParcelableExtra("key_custom_effect_sticker");
                                                                            String stringExtra3 = null;
                                                                            try {
                                                                                stringExtra3 = intent.getStringExtra("shoot_way");
                                                                            } catch (Exception e) {
                                                                                TryCatchGuardChecker.doCheck(e);
                                                                            }
                                                                            if (stringExtra3 == null) {
                                                                                stringExtra3 = "";
                                                                            }
                                                                            try {
                                                                                stringExtra = intent.getStringExtra("content_source");
                                                                            } catch (Exception e2) {
                                                                                TryCatchGuardChecker.doCheck(e2);
                                                                            }
                                                                            if (stringExtra == null) {
                                                                                stringExtra = "";
                                                                            }
                                                                            try {
                                                                                stringExtra2 = intent.getStringExtra("content_type");
                                                                            } catch (Exception e3) {
                                                                                TryCatchGuardChecker.doCheck(e3);
                                                                            }
                                                                            if (stringExtra2 == null) {
                                                                                stringExtra2 = "";
                                                                            }
                                                                            CreativeInfo creativeInfoLIZ = C537520L6g.LIZ(intent);
                                                                            C522360KeA.LIZ(C523870Kgb.LIZIZ(intent, C0L92.SUCCESS, ""));
                                                                            ShortVideoContext shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
                                                                            String str2 = "photo";
                                                                            int i4 = 1;
                                                                            if (parcelableArrayListExtra.size() > 1) {
                                                                                str = "multiple_content";
                                                                            } else {
                                                                                str = "single_content";
                                                                            }
                                                                            String strLIZ = C560460LyW.LIZ(0, 1);
                                                                            if (parcelableArrayListExtra.size() > 1) {
                                                                                z = true;
                                                                            } else {
                                                                                z = false;
                                                                            }
                                                                            new C528210Knb(shortVideoContext, str2, str, 0, i4, strLIZ, z, C525670KjV.LIZ(parcelableArrayListExtra), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, C530690Krb.LIZ(parcelableArrayListExtra), parcelableArrayListExtra, C523870Kgb.LIZ(intent), 1792).LIZ();
                                                                            C1660680tJi.LIZ().LJ(this.LL, mediaModel, creativeInfoLIZ, effect, new ShortVideoCommonParams(stringExtra3, stringExtra, stringExtra2, creativeInfoLIZ.getCreationId(), 0, 0, 0, 0, null, null, null, null, null, 8176, null));
                                                                        }
                                                                    }
                                                                };
                                                            }
                                                        } else {
                                                            return new C536540L2m(c19eg, j, j2) { // from class: X.0L0n
                                                                public final C01GW LLILZLL;

                                                                @Override // X.C536540L2m
                                                                public final InterfaceC533910Kwn LJ() {
                                                                    return (InterfaceC533910Kwn) this.LLILZLL.getValue();
                                                                }

                                                                {
                                                                    super(c19eg, j, j2);
                                                                    this.LLILZLL = C452501pT.LIZIZ(new AwS7S0100200_8(c19eg, j, j2, 0));
                                                                }
                                                            };
                                                        }
                                                    } else {
                                                        return new InterfaceC522520KeQ(c19eg) { // from class: X.0L0k
                                                            public final C19EG LL;

                                                            @Override // X.InterfaceC522520KeQ
                                                            public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
                                                            }

                                                            @Override // X.InterfaceC522520KeQ
                                                            public final void LJJLIIIJJIZ() {
                                                            }

                                                            {
                                                                this.LL = c19eg;
                                                            }

                                                            @Override // X.InterfaceC522520KeQ
                                                            public final void LIZ(int i2, int i3, Intent intent) {
                                                                ICreativeSAAService iCreativeSAAService;
                                                                if (i3 == -1 && (iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null)) != null) {
                                                                    iCreativeSAAService.setResult(this.LL, i3, intent);
                                                                    iCreativeSAAService.finishCurrentPage(this.LL);
                                                                }
                                                            }
                                                        };
                                                    }
                                                } else {
                                                    return new AiChatAnchorChosenResultImpl(c19eg);
                                                }
                                            } else {
                                                return new C0L2T(c19eg, c1drg, j, j2);
                                            }
                                        } else {
                                            return new C533830Kwf(c19eg, j, j2);
                                        }
                                    } else {
                                        return new C0L4P(c1drg, c19eg);
                                    }
                                } else {
                                    return new InterfaceC522520KeQ(c19eg) { // from class: X.0L0m
                                        public final C19EG LL;

                                        @Override // X.InterfaceC522520KeQ
                                        public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
                                        }

                                        @Override // X.InterfaceC522520KeQ
                                        public final void LJJLIIIJJIZ() {
                                        }

                                        {
                                            this.LL = c19eg;
                                        }

                                        @Override // X.InterfaceC522520KeQ
                                        public final void LIZ(int i2, int i3, Intent intent) {
                                            Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
                                            if (parcelableExtra != null) {
                                                ShortVideoContext shortVideoContext = (ShortVideoContext) parcelableExtra;
                                                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
                                                if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                                                    shortVideoContext.singleImageCoverBitmapData = new SingleImageCoverBitmapData(((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).LJFF(), intent.getIntExtra("key_choose_media_item_size", 0), ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).date, ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).type, ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).width, ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).height, null, false);
                                                    C0L14 c0l14 = C0L14.LIZ;
                                                    C0L13 c0l13 = new C0L13(this.LL, shortVideoContext, parcelableArrayListExtra, false, AFwS194S0000000_8.get$arr$(371), AFwS194S0000000_8.get$arr$(372), null, null, false, 960);
                                                    c0l14.getClass();
                                                    C0L14.LIZ(c0l13);
                                                    return;
                                                }
                                                C201955140j.LJIIZILJ("selectedMediaData is invalid when onChosenResult invoked in NowChosenResultImpl");
                                                return;
                                            }
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    };
                                }
                            } else {
                                return new C531590Kt3(c19eg, j, j2);
                            }
                        }
                    } else {
                        return new InterfaceC522520KeQ(c19eg) { // from class: X.0L33
                            public final Activity LL;

                            @Override // X.InterfaceC522520KeQ
                            public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
                            }

                            @Override // X.InterfaceC522520KeQ
                            public final void LJJLIIIJJIZ() {
                            }

                            {
                                this.LL = c19eg;
                            }

                            public static String LIZJ(Intent intent, String str) {
                                try {
                                    return intent.getStringExtra(str);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return null;
                                }
                            }

                            @Override // X.InterfaceC522520KeQ
                            public final void LIZ(int i2, int i3, Intent intent) throws Throwable {
                                ArrayList parcelableArrayListExtra;
                                ShortVideoContext shortVideoContext;
                                long maxShootingDuration;
                                String str;
                                if (i3 == -1 && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) != null && (shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context")) != null && !parcelableArrayListExtra.isEmpty() && !C2105908Mv.LIZ(((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).LJFF())) {
                                    Activity activity = this.LL;
                                    if (activity != null) {
                                        C443120HZe c443120HZeLIZ = C530180Kqm.LIZ(activity, parcelableArrayListExtra, 0L, C530180Kqm.LIZ);
                                        ((Boolean) c443120HZeLIZ.getFirst()).booleanValue();
                                        int iIntValue = ((Number) c443120HZeLIZ.getSecond()).intValue();
                                        long jLongValue = ((Number) c443120HZeLIZ.getThird()).longValue();
                                        C526770KlH c526770KlH = C526770KlH.LIZ;
                                        C528230Knd c528230KndLIZ = C523870Kgb.LIZ(intent);
                                        c526770KlH.getClass();
                                        C526770KlH.LIZ(shortVideoContext, parcelableArrayListExtra, iIntValue, (int) jLongValue, "", "", "", c528230KndLIZ, null);
                                    }
                                    String strLIZJ = LIZJ(intent, "camera_green_screen_enter_from");
                                    if (strLIZJ == null) {
                                        strLIZJ = shortVideoContext.enterFrom;
                                    }
                                    boolean booleanExtra = intent.getBooleanExtra("key_is_camera_green_screen_pick_material", false);
                                    boolean booleanExtra2 = intent.getBooleanExtra("extra_is_effect_aigc_v2v", false);
                                    String strLIZJ2 = LIZJ(intent, "prop_id");
                                    String strLIZJ3 = LIZJ(intent, "prop_resource_id");
                                    String strLIZJ4 = LIZJ(intent, "effect_source");
                                    String strLIZJ5 = LIZJ(intent, "is_ai_prop");
                                    String strLIZJ6 = LIZJ(intent, "is_async");
                                    String strLIZJ7 = LIZJ(intent, "ai_prop_type");
                                    String strLIZJ8 = LIZJ(intent, "sub_ai_prop_type");
                                    String strLIZJ9 = LIZJ(intent, "ai_prop_model_name");
                                    String strLIZJ10 = LIZJ(intent, "tab_key");
                                    if (strLIZJ10 == null) {
                                        strLIZJ10 = "";
                                    }
                                    String strLIZJ11 = LIZJ(intent, "prop_selected_from");
                                    if (strLIZJ11 == null) {
                                        strLIZJ11 = "";
                                    }
                                    C530750Krh.LJFF.LIZ();
                                    if (parcelableArrayListExtra.size() == 1) {
                                        MediaModel mediaModel = (MediaModel) C13LP.LJJJJZI(parcelableArrayListExtra);
                                        if (booleanExtra) {
                                            String strLIZJ12 = LIZJ(intent, "key_choose_last_media_in_tab_name");
                                            if (strLIZJ12 == null) {
                                                strLIZJ12 = "";
                                            }
                                            if (mediaModel.LJIIJJI()) {
                                                str = "live";
                                            } else if (mediaModel.LJIILJJIL()) {
                                                str = "video";
                                            } else {
                                                str = "photo";
                                            }
                                            C1403460mcq c1403460mcq = C1403460mcq.LIZ;
                                            int i4 = (int) mediaModel.duration;
                                            c1403460mcq.getClass();
                                            if (C296510Bjl.LIZ()) {
                                                C0LAB c0labLIZLLL = C1403460mcq.LIZLLL(shortVideoContext);
                                                c0labLIZLLL.LJ("material_type", str);
                                                if (i4 > 0) {
                                                    c0labLIZLLL.LIZ(i4, "video_duration");
                                                }
                                                if (Intrinsics.LJFF(strLIZJ12, "video")) {
                                                    strLIZJ12 = "videos";
                                                } else if (Intrinsics.LJFF(strLIZJ12, "photo")) {
                                                    strLIZJ12 = "photos";
                                                }
                                                c0labLIZLLL.LJ("tab_name", strLIZJ12);
                                                C20684815ws.LJIILLIIL("green_screen_album_material_select", c0labLIZLLL.LIZ);
                                            }
                                        }
                                        int i5 = mediaModel.type;
                                        BackgroundVideoCompileConfigure backgroundVideoCompileConfigureLIZ = null;
                                        if (i5 != 1) {
                                            if (i5 == 4) {
                                                Intent intent2 = new Intent();
                                                intent2.putExtra("key_is_camera_green_screen_pick_material", booleanExtra);
                                                intent2.putExtra("extra_is_effect_aigc_v2v", booleanExtra2);
                                                intent2.putExtra("is_from_album", true);
                                                intent2.putExtra("shoot_way", shortVideoContext.shootWay);
                                                intent2.putExtra("shoot_tab_name", shortVideoContext.LJIJJLI());
                                                intent2.putExtra("enter_from", strLIZJ);
                                                intent2.putExtra("creation_id", shortVideoContext.getCreationId());
                                                intent2.putExtra("file_path", ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).LJFF());
                                                intent2.putExtra("from_background_video", true);
                                                intent2.putExtra("prop_id", strLIZJ2);
                                                intent2.putExtra("prop_resource_id", strLIZJ3);
                                                intent2.putExtra("effect_source", strLIZJ4);
                                                intent2.putExtra("is_ai_prop", strLIZJ5);
                                                intent2.putExtra("ai_prop_type", strLIZJ7);
                                                intent2.putExtra("sub_ai_prop_type", strLIZJ8);
                                                intent2.putExtra("is_async", strLIZJ6);
                                                intent2.putExtra("tab_key", strLIZJ10);
                                                intent2.putExtra("prop_selected_from", strLIZJ11);
                                                intent2.putExtra("ai_prop_model_name", strLIZJ9);
                                                if (shortVideoContext.LJJJJZ()) {
                                                    maxShootingDuration = shortVideoContext.cameraComponentModel.mMaxDuration;
                                                } else {
                                                    maxShootingDuration = 15000;
                                                    if (booleanExtra2) {
                                                        if (shortVideoContext.cameraComponentModel.mCurrentDurationMode) {
                                                            maxShootingDuration = C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration(shortVideoContext.shootMode);
                                                        }
                                                        maxShootingDuration = intent.getLongExtra("cut_video_max_length", maxShootingDuration);
                                                    } else if (shortVideoContext.cameraComponentModel.mCurrentDurationMode) {
                                                        maxShootingDuration = C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration(shortVideoContext.shootMode);
                                                    }
                                                }
                                                intent2.putExtra("cut_video_max_length", maxShootingDuration);
                                                intent2.putExtra("enter_method", shortVideoContext.enterMethod);
                                                C537520L6g.LIZLLL(intent2, shortVideoContext.creativeInfo);
                                                NewBackgroundVideoPipelineModel newBackgroundVideoPipelineModel = shortVideoContext.creativeModel.newVideoPipelineExtraModel;
                                                if (newBackgroundVideoPipelineModel.isNewVideoPipelineEnabled) {
                                                    Workspace workspace = shortVideoContext.cameraComponentModel.mWorkspace;
                                                    if (workspace != null) {
                                                        backgroundVideoCompileConfigureLIZ = new BackgroundVideoCompileConfigure(workspace.LL.Af(newBackgroundVideoPipelineModel.outputPath, newBackgroundVideoPipelineModel.videoName).getPath(), workspace.LL.oy().getPath());
                                                    }
                                                    intent2.putExtra("background_video_compile_configure", backgroundVideoCompileConfigureLIZ);
                                                    intent2.putExtra("is_new_background_video_pipeline", shortVideoContext.creativeModel.newVideoPipelineExtraModel.isNewVideoPipelineEnabled);
                                                } else {
                                                    Workspace workspace2 = shortVideoContext.cameraComponentModel.mWorkspace;
                                                    if (workspace2 != null) {
                                                        backgroundVideoCompileConfigureLIZ = C0L35.LIZ(workspace2);
                                                    }
                                                    intent2.putExtra("background_video_compile_configure", backgroundVideoCompileConfigureLIZ);
                                                }
                                                Activity activity2 = this.LL;
                                                if (activity2 != null) {
                                                    C1660680tJi.LIZ().LJIILJJIL(activity2, i2, intent2);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        Activity activity3 = this.LL;
                                        if (activity3 != null) {
                                            C2204961BRm.LJIIL(-1, activity3, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT85rrg3SYhCtcQRoUahUtPeDnSt3OObg9qaoVi0pk8UqsfjorMjnFIU+AXJ/oFHYv7366PH/tiM0=", null));
                                            activity3.finish();
                                            C20622515mp.LIZ(activity3, R.anim.a8);
                                        }
                                    }
                                }
                            }
                        };
                    }
                }
                return new InterfaceC522520KeQ(c19eg) { // from class: X.0Kga
                    public final Activity LL;

                    @Override // X.InterfaceC522520KeQ
                    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
                    }

                    @Override // X.InterfaceC522520KeQ
                    public final void LJJLIIIJJIZ() {
                    }

                    {
                        this.LL = c19eg;
                    }

                    @Override // X.InterfaceC522520KeQ
                    public final void LIZ(int i2, int i3, Intent intent) throws Throwable {
                        if (this.LL != null) {
                            C522360KeA.LIZ(C523870Kgb.LIZIZ(intent, C0L92.SUCCESS, ""));
                            ShortVideoContext shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
                            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
                            if (parcelableArrayListExtra == null) {
                                return;
                            }
                            if (ChangeImagePickerUIExperiment.isEnabled()) {
                                int i4 = C530180Kqm.LIZIZ;
                                C443120HZe c443120HZeLIZ = C530180Kqm.LIZ(this.LL, parcelableArrayListExtra, 0L, C530180Kqm.LIZ);
                                ((Boolean) c443120HZeLIZ.getFirst()).booleanValue();
                                int iIntValue = ((Number) c443120HZeLIZ.getSecond()).intValue();
                                long jLongValue = ((Number) c443120HZeLIZ.getThird()).longValue();
                                C526770KlH c526770KlH = C526770KlH.LIZ;
                                C528230Knd c528230KndLIZ = C523870Kgb.LIZ(intent);
                                C524800Ki6 c524800Ki6 = new C524800Ki6(C522280Ke2.LIZ(parcelableArrayListExtra), Integer.valueOf(C522280Ke2.LIZIZ(parcelableArrayListExtra)));
                                c526770KlH.getClass();
                                C526770KlH.LIZ(shortVideoContext, parcelableArrayListExtra, iIntValue, (int) jLongValue, "", "", "", c528230KndLIZ, c524800Ki6);
                            }
                            C2204961BRm.LJIIL(-1, this.LL, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT85rrg3SYhCtcVgsbbhM7rH438oTPGqgbUGuU9FtRaG0kJWp4gbACnjlbHjuWX/eGJCSNXW+SVfPNWA==", null));
                            this.LL.finish();
                            C20622515mp.LIZ(this.LL, R.anim.a8);
                            return;
                        }
                        C522360KeA.LIZ(C523870Kgb.LIZIZ(intent, C0L92.FAILED, "activity is null"));
                    }
                };
            }
            return new C536540L2m(j, j2, c19eg, c1drg);
        }
        return new C0MP7(c19eg);
    }
}
