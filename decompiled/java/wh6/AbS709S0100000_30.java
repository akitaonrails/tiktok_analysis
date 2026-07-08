package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0IJT;
import X.C1391190mJ3;
import X.C147Y;
import X.C1863460yam;
import X.C201996141y;
import X.C20296814bO;
import X.C343950De5;
import X.C474500IjA;
import X.C786410Ut5;
import X.EnumC429110Gs9;
import Y.ACListenerS164S0100000_30;
import Y.ARunnableS130S0100000_30;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.view.View;
import com.bytedance.android.live.kyc.KYCCameraActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.multiconversation.TakoSubConversationGroupItemAssem;
import com.ss.android.ugc.aweme.tako.otherpage.memory.ui.TakoMemoryGuideSheetFragment;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class AbS709S0100000_30 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) throws Throwable {
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
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS709S0100000_30(ACListenerS164S0100000_30 aCListenerS164S0100000_30, int i) {
        super(1500L);
        this.$t = i;
        this.l0 = aCListenerS164S0100000_30;
    }

    public static final void LIZ$0(AbS709S0100000_30 abS709S0100000_30, View view) {
        C1863460yam c1863460yam;
        Function2<EnumC429110Gs9, Boolean, Unit> function2;
        if (view != null && (c1863460yam = ((TakoSubConversationGroupItemAssem) abS709S0100000_30.l0).LLJJLIIIJLLLLLLLZ) != null && (function2 = c1863460yam.LLILZ) != null) {
            function2.invoke(c1863460yam.LLILLJJLI, Boolean.valueOf(!c1863460yam.LLILLL));
        }
    }

    public static final void LIZ$1(AbS709S0100000_30 abS709S0100000_30, View view) throws JSONException {
        TakoMemoryGuideSheetFragment takoMemoryGuideSheetFragment = (TakoMemoryGuideSheetFragment) abS709S0100000_30.l0;
        takoMemoryGuideSheetFragment.getClass();
        C201996141y c201996141y = C201996141y.LIZ;
        TakoEnterParams takoEnterParams = takoMemoryGuideSheetFragment.LL;
        String str = takoMemoryGuideSheetFragment.LLILLL;
        String str2 = takoMemoryGuideSheetFragment.LLILZ;
        c201996141y.getClass();
        C201996141y.LJFF("click_continue", takoEnterParams, str, str2);
        String str3 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(takoMemoryGuideSheetFragment, new C343950De5());
    }

    public static final void LIZ$2(AbS709S0100000_30 abS709S0100000_30, View view) throws JSONException {
        TakoMemoryGuideSheetFragment takoMemoryGuideSheetFragment = (TakoMemoryGuideSheetFragment) abS709S0100000_30.l0;
        Iterator it2 = ((ArrayList) takoMemoryGuideSheetFragment.LLILZIL).iterator();
        while (it2.hasNext()) {
            ((C147Y) it2.next()).LIZ(false);
        }
        C201996141y c201996141y = C201996141y.LIZ;
        TakoEnterParams takoEnterParams = takoMemoryGuideSheetFragment.LL;
        String str = takoMemoryGuideSheetFragment.LLILLL;
        String str2 = takoMemoryGuideSheetFragment.LLILZ;
        c201996141y.getClass();
        C201996141y.LJFF("turn_memory_off", takoEnterParams, str, str2);
        String str3 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(takoMemoryGuideSheetFragment, new C343950De5());
    }

    public static final void LIZ$3(AbS709S0100000_30 abS709S0100000_30, View view) throws JSONException {
        TakoMemoryGuideSheetFragment takoMemoryGuideSheetFragment = (TakoMemoryGuideSheetFragment) abS709S0100000_30.l0;
        Iterator it2 = ((ArrayList) takoMemoryGuideSheetFragment.LLILZIL).iterator();
        while (it2.hasNext()) {
            ((C147Y) it2.next()).LIZ(true);
        }
        C201996141y c201996141y = C201996141y.LIZ;
        TakoEnterParams takoEnterParams = takoMemoryGuideSheetFragment.LL;
        String str = takoMemoryGuideSheetFragment.LLILLL;
        String str2 = takoMemoryGuideSheetFragment.LLILZ;
        c201996141y.getClass();
        C201996141y.LJFF("turn_memory_on", takoEnterParams, str, str2);
        String str3 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(takoMemoryGuideSheetFragment, new C343950De5());
    }

    public static final void LIZ$4(AbS709S0100000_30 abS709S0100000_30, View view) throws JSONException {
        TakoMemoryGuideSheetFragment takoMemoryGuideSheetFragment = (TakoMemoryGuideSheetFragment) abS709S0100000_30.l0;
        takoMemoryGuideSheetFragment.getClass();
        C201996141y c201996141y = C201996141y.LIZ;
        TakoEnterParams takoEnterParams = takoMemoryGuideSheetFragment.LL;
        String str = takoMemoryGuideSheetFragment.LLILLL;
        String str2 = takoMemoryGuideSheetFragment.LLILZ;
        c201996141y.getClass();
        C201996141y.LJFF("click_not_now", takoEnterParams, str, str2);
        String str3 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(takoMemoryGuideSheetFragment, new C343950De5());
    }

    public static final void LIZ$5(AbS709S0100000_30 abS709S0100000_30, View view) {
        int iIntValue;
        KYCCameraActivity kYCCameraActivity = (KYCCameraActivity) abS709S0100000_30.l0;
        final C20296814bO c20296814bO = kYCCameraActivity.LLILZ;
        if (c20296814bO != null) {
            CameraDevice cameraDevice = c20296814bO.LJIIJJI;
            if (cameraDevice != null) {
                try {
                    CameraCaptureSession cameraCaptureSession = c20296814bO.LJIIL;
                    if (cameraCaptureSession != null) {
                        cameraCaptureSession.stopRepeating();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C786410Ut5.L4(c20296814bO.LJIJ);
                try {
                    ImageReader imageReader = c20296814bO.LJIILJJIL;
                    if (imageReader != null) {
                        final CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(2);
                        builderCreateCaptureRequest.addTarget(imageReader.getSurface());
                        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
                        builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, (byte) 15);
                        Integer num = (Integer) ((CameraManager) C786410Ut5.H2(C786410Ut5.L3(c20296814bO.LIZ), "camera")).getCameraCharacteristics(cameraDevice.getId()).get(CameraCharacteristics.SENSOR_ORIENTATION);
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf((iIntValue + c20296814bO.LJIIIIZZ) % 360));
                        cameraDevice.createCaptureSession(Collections.singletonList(imageReader.getSurface()), new CameraCaptureSession.StateCallback() { // from class: X.14bN
                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                            public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession2) {
                                C20296814bO c20296814bO2 = c20296814bO;
                                C786410Ut5.LJJZZIII(c20296814bO2.LJIILLIIL, new ARunnableS130S0100000_30(c20296814bO2, 46));
                            }

                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                            public final void onConfigured(CameraCaptureSession cameraCaptureSession2) {
                                try {
                                    cameraCaptureSession2.capture(builderCreateCaptureRequest.build(), null, c20296814bO.LJIIZILJ);
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            }
                        }, c20296814bO.LJIIZILJ);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            String strLLLLLZL = kYCCameraActivity.LLLLLZL();
            String pageName = kYCCameraActivity.getPageName();
            JSONObject jSONObject = kYCCameraActivity.LLJ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_kyc_form_camera_shoot");
            c474500IjALIZ.LJJII(strLLLLLZL, "shoot_type");
            c474500IjALIZ.LJJII(pageName, "page_name");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            c474500IjALIZ.LJJIIJZLJL(jSONObject);
            c474500IjALIZ.LIZ();
        }
    }

    public static final void LIZ$6(AbS709S0100000_30 abS709S0100000_30, View view) throws Throwable {
        if (view != null) {
            ((ACListenerS164S0100000_30) abS709S0100000_30.l0).onClick(view);
        }
    }

    public static final void LIZ$7(AbS709S0100000_30 abS709S0100000_30, View view) throws Throwable {
        if (view != null) {
            ((ACListenerS164S0100000_30) abS709S0100000_30.l0).onClick(view);
        }
    }

    public static final void LIZ$8(AbS709S0100000_30 abS709S0100000_30, View view) throws Throwable {
        if (view != null) {
            ((ACListenerS164S0100000_30) abS709S0100000_30.l0).onClick(view);
        }
    }

    public static final void LIZ$9(AbS709S0100000_30 abS709S0100000_30, View view) throws Throwable {
        if (view != null) {
            ((ACListenerS164S0100000_30) abS709S0100000_30.l0).onClick(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS709S0100000_30(Object obj, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = obj;
    }

    public AbS709S0100000_30(TakoMemoryGuideSheetFragment takoMemoryGuideSheetFragment, int i) {
        this.$t = i;
        this.l0 = takoMemoryGuideSheetFragment;
    }
}
