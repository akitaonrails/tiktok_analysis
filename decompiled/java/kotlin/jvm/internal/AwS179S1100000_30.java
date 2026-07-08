package kotlin.jvm.internal;

import X.AbstractC20187113yn;
import X.C01TQ;
import X.C08QA;
import X.C098200Yq;
import X.C09AY;
import X.C0VSJ;
import X.C11KT;
import X.C13SS;
import X.C143V;
import X.C14NX;
import X.C1720106oR;
import X.C1862700yZY;
import X.C189200o6;
import X.C19998913Mt;
import X.C20441214yg;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2257631DYb;
import X.C2354709Kn;
import X.C953370aut;
import X.InterfaceC2329309At;
import com.bytedance.android.live.liveinteract.multilive.model.GetUploadAuthResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUploadFileManagerConfigSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.starlight.nodes.StarlightNode;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderListener;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public class AwS179S1100000_30 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS179S1100000_30 awS179S1100000_30) {
        ((AbstractC20187113yn) awS179S1100000_30.l1).LIZ(awS179S1100000_30.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS179S1100000_30 awS179S1100000_30) {
        C20684815ws.LJIILLIIL(awS179S1100000_30.s0, (Map) awS179S1100000_30.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS179S1100000_30 awS179S1100000_30) {
        C2354709Kn.LJIJJLI(awS179S1100000_30.s0);
        if (((BaseException) awS179S1100000_30.l1) != null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Load Fail: ");
            sbLIZ.append(((BaseException) awS179S1100000_30.l1).getMessage());
            C1720106oR.LIZIZ("minis-GuidanceLottie", C2188811AlT.LIZIZ(sbLIZ), (BaseException) awS179S1100000_30.l1);
        } else {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZ("minis-GuidanceLottie", "Load Fail: Unknown error");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS179S1100000_30 awS179S1100000_30) {
        C14NX c14nx = (C14NX) awS179S1100000_30.l1;
        String str = awS179S1100000_30.s0;
        StarlightNode starlightNode = c14nx.LJFF().LIZ;
        starlightNode.nativeSetMarginAuto(starlightNode.LIZ, C2257631DYb.LIZ(str).ordinal());
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS179S1100000_30 awS179S1100000_30) {
        ((C143V) awS179S1100000_30.l1).onError(awS179S1100000_30.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS179S1100000_30 awS179S1100000_30) {
        ((C143V) awS179S1100000_30.l1).onSuccess(awS179S1100000_30.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS179S1100000_30 awS179S1100000_30) {
        Object c098200Yq;
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start upload: local path: ");
        sbLIZ.append(awS179S1100000_30.s0);
        C20441214yg.LIZIZ("NoticeBoardImageUploadManager", C2188811AlT.LIZIZ(sbLIZ));
        String str5 = awS179S1100000_30.s0;
        final InterfaceC2329309At interfaceC2329309At = (InterfaceC2329309At) awS179S1100000_30.l1;
        try {
            final BDImageXUploader bDImageXUploader = new BDImageXUploader();
            GetUploadAuthResponse.ResponseData responseData = C953370aut.LIZ;
            String str6 = null;
            if (responseData != null) {
                str = responseData.uploadDomain;
            } else {
                str = null;
            }
            bDImageXUploader.setUploadDomain(str);
            GetUploadAuthResponse.ResponseData responseData2 = C953370aut.LIZ;
            if (responseData2 != null) {
                str2 = responseData2.accessKey;
            } else {
                str2 = null;
            }
            bDImageXUploader.setTopAccessKey(str2);
            GetUploadAuthResponse.ResponseData responseData3 = C953370aut.LIZ;
            if (responseData3 != null) {
                str3 = responseData3.secretKey;
            } else {
                str3 = null;
            }
            bDImageXUploader.setTopSecretKey(str3);
            GetUploadAuthResponse.ResponseData responseData4 = C953370aut.LIZ;
            if (responseData4 != null) {
                str4 = responseData4.sessionToken;
            } else {
                str4 = null;
            }
            bDImageXUploader.setTopSessionToken(str4);
            GetUploadAuthResponse.ResponseData responseData5 = C953370aut.LIZ;
            if (responseData5 != null) {
                str6 = responseData5.serviceId;
            }
            bDImageXUploader.setServiceID(str6);
            bDImageXUploader.setFilePath(1, new String[]{str5});
            bDImageXUploader.setNetworkType(403, 1);
            bDImageXUploader.setNetworkType(404, 404);
            MultiGuestUploadFileManagerConfigSetting multiGuestUploadFileManagerConfigSetting = MultiGuestUploadFileManagerConfigSetting.INSTANCE;
            bDImageXUploader.setFileRetryCount(multiGuestUploadFileManagerConfigSetting.getValue().fileRetryCount);
            bDImageXUploader.setSocketNum(multiGuestUploadFileManagerConfigSetting.getValue().socketNum);
            bDImageXUploader.setRWTimeout(multiGuestUploadFileManagerConfigSetting.getValue().rwTimeout);
            bDImageXUploader.setMaxFailTime(multiGuestUploadFileManagerConfigSetting.getValue().maxFailTime);
            bDImageXUploader.setEnableHttps(1);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('.');
            sbLIZ2.append(C08QA.LJIJ(new C0VSJ(str5)));
            bDImageXUploader.setFileExtension(C2188811AlT.LIZIZ(sbLIZ2));
            bDImageXUploader.setListener(new BDImageXUploaderListener() { // from class: X.0avs
                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final int imageXUploadCheckNetState(int i, int i2) {
                    C915980Zwa.LIZJ().context();
                    try {
                        return C036E.LIZ.LIZIZ() ? 1 : 0;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return 0;
                    }
                }

                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final void onLog(int i, int i2, String str7) {
                    if (C915980Zwa.LIZJ().isLocalTest()) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onLog what=");
                        sbLIZ3.append(i);
                        sbLIZ3.append(" code=");
                        sbLIZ3.append(i2);
                        sbLIZ3.append(" info=");
                        sbLIZ3.append(str7);
                        C20441214yg.LJIIIZ("NoticeBoardImageUploadManager", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }

                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final void onNotify(int i, long j, BDImageXInfo bDImageXInfo) {
                    String str7;
                    Long lValueOf;
                    if (i != 1) {
                        String str8 = null;
                        Long lValueOf2 = null;
                        if (i != 6) {
                            if (i == 7) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("upload onError: ");
                                if (bDImageXInfo != null) {
                                    lValueOf = Long.valueOf(bDImageXInfo.mErrorCode);
                                } else {
                                    lValueOf = null;
                                }
                                sbLIZ3.append(lValueOf);
                                C20441214yg.LJ("NoticeBoardImageUploadManager", C2188811AlT.LIZIZ(sbLIZ3));
                                bDImageXUploader.close();
                                InterfaceC2329309At<String> interfaceC2329309At2 = interfaceC2329309At;
                                if (bDImageXInfo != null) {
                                    lValueOf2 = Long.valueOf(bDImageXInfo.mErrorCode);
                                }
                                interfaceC2329309At2.onError(new C294201Ca(String.valueOf(lValueOf2)) { // from class: X.00nr
                                    public static final int $stable = 8;
                                    public final String LLILLJJLI;

                                    public final String getErrorCode() {
                                        return this.LLILLJJLI;
                                    }

                                    /* JADX WARN: Illegal instructions before constructor call */
                                    {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("File upload exception errorCode=");
                                        sbLIZ4.append(str);
                                        super(C2188811AlT.LIZIZ(sbLIZ4));
                                        this.LLILLJJLI = str;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("upload onComplete: ");
                        if (bDImageXInfo != null) {
                            str8 = bDImageXInfo.mImageTosKey;
                        }
                        sbLIZ4.append(str8);
                        C20441214yg.LJIIIZ("NoticeBoardImageUploadManager", C2188811AlT.LIZIZ(sbLIZ4));
                        bDImageXUploader.close();
                        if (bDImageXInfo == null || (str7 = bDImageXInfo.mImageTosKey) == null) {
                            return;
                        }
                        interfaceC2329309At.onSuccess(str7);
                        return;
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("upload onProgress: ");
                    sbLIZ5.append(j);
                    C20441214yg.LJIIIZ("NoticeBoardImageUploadManager", C2188811AlT.LIZIZ(sbLIZ5));
                }
            });
            bDImageXUploader.start();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return C189200o6.m1boximpl(c098200Yq);
    }

    public static final Object invoke$7(AwS179S1100000_30 awS179S1100000_30) {
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Effect][WaitForLock][");
        sbLIZ.append(awS179S1100000_30.s0);
        sbLIZ.append("][WaitForModelDownload][");
        sbLIZ.append(((C19998913Mt) awS179S1100000_30.l1).LJIIL.getName());
        sbLIZ.append(']');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LJ("JKL", strLIZIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS179S1100000_30 awS179S1100000_30) {
        AbstractC20187113yn abstractC20187113yn = (AbstractC20187113yn) awS179S1100000_30.l1;
        if (abstractC20187113yn != null) {
            abstractC20187113yn.LIZ(awS179S1100000_30.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS179S1100000_30 awS179S1100000_30) {
        C01TQ.LIZ(awS179S1100000_30.s0, C1862700yZY.LIZ((Map) awS179S1100000_30.l1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S1100000_30(C11KT c11kt, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c11kt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S1100000_30(AbstractC20187113yn abstractC20187113yn, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC20187113yn;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S1100000_30(C143V c143v, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c143v;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S1100000_30(C14NX c14nx, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c14nx;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S1100000_30(String str, C19998913Mt c19998913Mt, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c19998913Mt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S1100000_30(String str, BaseException baseException, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = baseException;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS179S1100000_30(String str, String str2, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS179S1100000_30(Map map, Map<String, String> map2, String str) {
        super(0);
        this.$t = str;
        this.l1 = map;
        this.s0 = map2;
    }
}
