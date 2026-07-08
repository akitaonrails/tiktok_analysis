package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C1558520qew;
import X.C1643440sru;
import X.C1A3B;
import X.C1A3X;
import X.C1A5Q;
import X.C1A5R;
import X.C1A5S;
import X.C1AO5;
import X.C418440Gaw;
import X.C675940QfI;
import X.C736680Sv4;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC2189651Amp;
import X.InterfaceC2173471A4j;
import Y.ARunnableS21S0200100_33;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ttve.nativePort.TEJpegUtils;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.summary.PaymentSummaryPanelDialog;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.HistoryRecordFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.permission.IEcPermissionAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.permission.PermissionGuideAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.interaction.ui.SearchTop1InteractionAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.interaction.vm.SearchInteractionViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.PageType;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public class AjS73S0100000_33 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS73S0100000_33(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AjS73S0100000_33 ajS73S0100000_33, View view) {
        if (view != null) {
            ((EcTakePhotoActivity) ajS73S0100000_33.l0).u();
            C1A3B c1a3bLIZ = C1A3B.LIZ();
            if (c1a3bLIZ.LIZ) {
                c1a3bLIZ.LIZ = false;
            }
            EcTakePhotoActivity ecTakePhotoActivity = (EcTakePhotoActivity) ajS73S0100000_33.l0;
            ecTakePhotoActivity.LLLI = 1;
            ecTakePhotoActivity.finish();
        }
    }

    public static final void LIZ$1(AjS73S0100000_33 ajS73S0100000_33, View view) {
        if (view != null) {
            EcTakePhotoActivity ecTakePhotoActivity = (EcTakePhotoActivity) ajS73S0100000_33.l0;
            ecTakePhotoActivity.r("photo_search_upload_button_click", new AwS612S0100000_33(ecTakePhotoActivity, 51));
            C1A3X c1a3x = C1A3X.LIZ;
            EcTakePhotoActivity ecTakePhotoActivity2 = (EcTakePhotoActivity) ajS73S0100000_33.l0;
            String[] strArrLLLLZIL = ecTakePhotoActivity2.LLLLZIL();
            c1a3x.getClass();
            if (!C1A3X.LIZLLL(ecTakePhotoActivity2, strArrLLLLZIL)) {
                EcTakePhotoActivity ecTakePhotoActivity3 = (EcTakePhotoActivity) ajS73S0100000_33.l0;
                if (ecTakePhotoActivity3.LLLILZLLLI.LLILLL && C1A3X.LIZ(ecTakePhotoActivity3)) {
                    ((EcTakePhotoActivity) ajS73S0100000_33.l0).t("icon_album");
                    return;
                }
                EcTakePhotoActivity ecTakePhotoActivity4 = (EcTakePhotoActivity) ajS73S0100000_33.l0;
                String[] strArrLLLLZIL2 = ecTakePhotoActivity4.LLLLZIL();
                TokenCert tokenCertWith = TokenCert.Companion.with("bpea-photo_search_only_reuqest_storage_permission_record_reconstruct");
                AwS647S0100000_33 awS647S0100000_33 = new AwS647S0100000_33((EcTakePhotoActivity) ajS73S0100000_33.l0, 6);
                c1a3x.getClass();
                C1A3X.LJ(ecTakePhotoActivity4, strArrLLLLZIL2, tokenCertWith, awS647S0100000_33);
                return;
            }
            ((EcTakePhotoActivity) ajS73S0100000_33.l0).t("icon_album");
        }
    }

    public static final void LIZ$10(AjS73S0100000_33 ajS73S0100000_33, View view) {
        if (view != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final EcTakePhotoActivity ecTakePhotoActivity = (EcTakePhotoActivity) ajS73S0100000_33.l0;
            ecTakePhotoActivity.getClass();
            if (!NetworkUtils.isNetworkAvailable(ecTakePhotoActivity)) {
                C1389890mGx c1389890mGx = new C1389890mGx(ecTakePhotoActivity);
                c1389890mGx.LJIIIZ(2131835933);
                c1389890mGx.LJIIJJI();
                return;
            }
            C1643440sru c1643440sru = new C1643440sru();
            C1AO5 c1ao5 = c1643440sru.LIZ;
            c1ao5.LIZLLL = false;
            c1ao5.LJIIIIZZ = new InterfaceC2173471A4j() { // from class: X.1A38
                @Override // X.InterfaceC2173471A4j
                public final void LIZ(int i, Bitmap bitmap) {
                    if (i == 0) {
                        EcTakePhotoActivity ecTakePhotoActivity2 = ecTakePhotoActivity;
                        ecTakePhotoActivity2.LLLIZZ = 1;
                        if (ecTakePhotoActivity2.o()) {
                            EcTakePhotoActivity ecTakePhotoActivity3 = ecTakePhotoActivity;
                            ecTakePhotoActivity3.runOnUiThread(new ARunnableS21S0200100_33(ecTakePhotoActivity3, bitmap, jCurrentTimeMillis, 0));
                            return;
                        }
                        if (C1205704nf.LIZ()) {
                            EcTakePhotoActivity ecTakePhotoActivity4 = ecTakePhotoActivity;
                            ecTakePhotoActivity4.runOnUiThread(new ARunnableS21S0200100_33(ecTakePhotoActivity4, bitmap, jCurrentTimeMillis, 1));
                            return;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(ecTakePhotoActivity.getFilesDir().getAbsolutePath());
                        sbLIZ.append("/ve_test");
                        sbLIZ.append(File.separator);
                        sbLIZ.append("picture_");
                        sbLIZ.append(System.currentTimeMillis());
                        sbLIZ.append(".png");
                        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        if (bitmap.isRecycled()) {
                            C2484209oO.LIZJ("VEImageUtils", "Can't compress a recycled bitmap");
                        } else {
                            TEJpegUtils.compressToJPEG(bitmap, 80, strLIZIZ);
                        }
                        EcTakePhotoActivity ecTakePhotoActivity5 = ecTakePhotoActivity;
                        if (ecTakePhotoActivity5.LLLFZ == null) {
                            ecTakePhotoActivity5.LLLFZ = new ArrayList<>();
                        }
                        ArrayList<File> arrayList = ecTakePhotoActivity.LLLFZ;
                        if (arrayList != null) {
                            arrayList.add(new C0VSJ(strLIZIZ));
                        }
                        final EcTakePhotoActivity ecTakePhotoActivity6 = ecTakePhotoActivity;
                        final long j = jCurrentTimeMillis;
                        ecTakePhotoActivity6.runOnUiThread(new Runnable() { // from class: X.1A39
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("EcTakePhotoActivity@354a.shotScreen$shotScreenSettings$1$3");
                                try {
                                    VERecorder vERecorder = ecTakePhotoActivity6.LLJJJJJIL;
                                    if (vERecorder != null) {
                                        vERecorder.LJJJJ();
                                    }
                                    ecTakePhotoActivity6.p(strLIZIZ, PageType.TAKE_PHOTO, null, null, null, Long.valueOf(j));
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("EcTakePhotoActivity@354a.shotScreen$shotScreenSettings$1$3");
                            }
                        });
                        if (!bitmap.isRecycled()) {
                            bitmap.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                        }
                    }
                }
            };
            VESize vESize = new VESize(((Number) ecTakePhotoActivity.LLJL.getValue()).intValue(), ((Number) ecTakePhotoActivity.LLJLIL.getValue()).intValue());
            C1AO5 c1ao52 = c1643440sru.LIZ;
            c1ao52.LIZ = vESize;
            VERecorder vERecorder = ecTakePhotoActivity.LLJJJJJIL;
            if (vERecorder == null) {
                return;
            }
            vERecorder.LJJIJIIJIL(c1ao52);
        }
    }

    public static final void LIZ$11(AjS73S0100000_33 ajS73S0100000_33, View view) {
        PhotoSearchEnterParams photoSearchEnterParamsCopy;
        if (view != null) {
            if (!NetworkUtils.isNetworkAvailable(((EcTakePhotoActivity) ajS73S0100000_33.l0).getBaseContext())) {
                C1389890mGx c1389890mGx = new C1389890mGx((EcTakePhotoActivity) ajS73S0100000_33.l0);
                c1389890mGx.LJIIIZ(2131835933);
                c1389890mGx.LJIIJJI();
                return;
            }
            Bundle bundle = new Bundle();
            PhotoSearchEnterParams photoSearchEnterParams = ((EcTakePhotoActivity) ajS73S0100000_33.l0).LLJJL;
            if (photoSearchEnterParams != null) {
                photoSearchEnterParamsCopy = photoSearchEnterParams.copy();
            } else {
                photoSearchEnterParamsCopy = null;
            }
            C786410Ut5.LJJIZ(bundle, "photo_search_enter_param", photoSearchEnterParamsCopy);
            bundle.putLong("intent_value_time_open_history_page", System.currentTimeMillis());
            HistoryRecordFragment historyRecordFragment = new HistoryRecordFragment();
            historyRecordFragment.setArguments(bundle);
            int iLIZJ = C418440Gaw.LIZJ((EcTakePhotoActivity) ajS73S0100000_33.l0);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = historyRecordFragment;
            tuxSheet.LLJLL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJJIJIIJIL = false;
            c1390920mIc.LIZIZ(iLIZJ, iLIZJ);
            c1390920mIc.LJIIIIZZ(2);
            EcTakePhotoActivity ecTakePhotoActivity = (EcTakePhotoActivity) ajS73S0100000_33.l0;
            DialogInterfaceOnDismissListenerC2189651Amp dialogInterfaceOnDismissListenerC2189651Amp = new DialogInterfaceOnDismissListenerC2189651Amp(ecTakePhotoActivity, 5);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLILLJJLI = dialogInterfaceOnDismissListenerC2189651Amp;
            ecTakePhotoActivity.LLLII = false;
            ecTakePhotoActivity.T();
            tuxSheet2.show(((EcTakePhotoActivity) ajS73S0100000_33.l0).getSupportFragmentManager(), "HistoryRecordFragment");
        }
    }

    public static final void LIZ$12(AjS73S0100000_33 ajS73S0100000_33, View view) {
        C1A5S c1a5s;
        if (view != null) {
            if (C1A5R.LIZ[((C1A5Q) ajS73S0100000_33.l0).LLIZ.ordinal()] == 1) {
                c1a5s = C1A5S.DEFAULT;
            } else {
                c1a5s = C1A5S.LIKE;
            }
            ((C1A5Q) ajS73S0100000_33.l0).LIZ(c1a5s);
            Function1<? super C1A5S, Unit> function1 = ((C1A5Q) ajS73S0100000_33.l0).LLJI;
            if (function1 != null) {
                function1.invoke(c1a5s);
            }
        }
    }

    public static final void LIZ$13(AjS73S0100000_33 ajS73S0100000_33, View view) {
        C1A5S c1a5s;
        if (view != null) {
            if (C1A5R.LIZ[((C1A5Q) ajS73S0100000_33.l0).LLIZ.ordinal()] == 2) {
                c1a5s = C1A5S.DEFAULT;
            } else {
                c1a5s = C1A5S.DISLIKE;
            }
            ((C1A5Q) ajS73S0100000_33.l0).LIZ(c1a5s);
            Function1<? super C1A5S, Unit> function1 = ((C1A5Q) ajS73S0100000_33.l0).LLJIJIL;
            if (function1 != null) {
                function1.invoke(c1a5s);
            }
        }
    }

    public static final void LIZ$2(AjS73S0100000_33 ajS73S0100000_33, View view) {
        if (view != null) {
            C675940QfI.LIZJ("rd_photo_search_button_click", null, AFwS279S0000000_33.get$arr$(98));
            IEcPermissionAbility iEcPermissionAbility = (IEcPermissionAbility) C1558520qew.LIZ(C1558520qew.LJIIL((PermissionGuideAssem) ajS73S0100000_33.l0), IEcPermissionAbility.class, null);
            if (iEcPermissionAbility != null) {
                iEcPermissionAbility.Pr();
            }
        }
    }

    public static final void LIZ$3(AjS73S0100000_33 ajS73S0100000_33, View view) {
        if (view != null) {
            SearchTop1InteractionAssem searchTop1InteractionAssem = (SearchTop1InteractionAssem) ajS73S0100000_33.l0;
            SearchInteractionViewModel searchInteractionViewModelUp = searchTop1InteractionAssem.up();
            C736680Sv4.LJIJJ(searchInteractionViewModelUp, new AwS399S0200000_33(searchTop1InteractionAssem, searchInteractionViewModelUp, 48));
        }
    }

    public static final void LIZ$4(AjS73S0100000_33 ajS73S0100000_33, View view) {
        if (view != null) {
            SearchTop1InteractionAssem searchTop1InteractionAssem = (SearchTop1InteractionAssem) ajS73S0100000_33.l0;
            SearchInteractionViewModel searchInteractionViewModelUp = searchTop1InteractionAssem.up();
            C736680Sv4.LJIJJ(searchInteractionViewModelUp, new AwS399S0200000_33(searchTop1InteractionAssem, searchInteractionViewModelUp, 47));
        }
    }

    public static final void LIZ$5(AjS73S0100000_33 ajS73S0100000_33, View view) {
        if (view != null) {
            C675940QfI.LIZJ("rd_photo_search_button_click", null, AFwS279S0000000_33.get$arr$(268));
            IEcPermissionAbility iEcPermissionAbility = (IEcPermissionAbility) C1558520qew.LIZ(C1558520qew.LJIIL((PermissionGuideAssem) ajS73S0100000_33.l0), IEcPermissionAbility.class, null);
            if (iEcPermissionAbility != null) {
                iEcPermissionAbility.Pr();
            }
        }
    }

    public static final void LIZ$6(AjS73S0100000_33 ajS73S0100000_33, View view) {
        if (view != null) {
            C675940QfI.LIZJ("rd_photo_search_button_click", null, AFwS279S0000000_33.get$arr$(269));
            IEcPermissionAbility iEcPermissionAbility = (IEcPermissionAbility) C1558520qew.LIZ(C1558520qew.LJIIL((PermissionGuideAssem) ajS73S0100000_33.l0), IEcPermissionAbility.class, null);
            if (iEcPermissionAbility != null) {
                iEcPermissionAbility.Pr();
            }
        }
    }

    public static final void LIZ$7(AjS73S0100000_33 ajS73S0100000_33, View view) {
        if (view != null) {
            ((Function0) ajS73S0100000_33.l0).invoke();
        }
    }

    public static final void LIZ$8(AjS73S0100000_33 ajS73S0100000_33, View view) {
        if (view != null) {
            ((PaymentSummaryPanelDialog) ajS73S0100000_33.l0).closePanel();
        }
    }

    public static final void LIZ$9(AjS73S0100000_33 ajS73S0100000_33, View view) {
        if (view != null) {
            ((PaymentSummaryPanelDialog) ajS73S0100000_33.l0).closePanel();
        }
    }
}
