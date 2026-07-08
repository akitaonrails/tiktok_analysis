package kotlin.jvm.internal;

import X.AbstractC1136060ffY;
import X.AbstractC2213871Bkn;
import X.AbstractC830880Wic;
import X.C09AY;
import X.C118300cf;
import X.C1494600ozq;
import X.C1515820pY4;
import X.C1720106oR;
import X.C1B4F;
import X.C1B8O;
import X.C1B8Q;
import X.C20340414iQ;
import X.C2188811AlT;
import X.C2191401Ape;
import X.C2199721B7i;
import X.C2208181Bbc;
import X.C2213641BkQ;
import X.C2213681BkU;
import X.C2213691BkV;
import X.C259800zU;
import X.C830870Wib;
import X.EnumC1910390zoT;
import X.EnumC2213801Bkg;
import X.InterfaceC2207911BbB;
import X.InterfaceC2247741CyK;
import X.InterfaceC2329409Au;
import com.bytedance.effectcreatormobile.infrastructure.ve.impl.CameraRenderImpl;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareMainActivity;
import com.ss.android.ugc.aweme.share.linkshare.model.DspMusicListResponse;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.data.BaseNode;
import com.ss.ugc.live.sdk.message.data.DecodeNode;
import com.ss.ugc.live.sdk.message.data.FullLinkTrack;
import com.ss.ugc.live.sdk.message.data.NodeStatus;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.ss.ugc.live.sdk.message.data.warlock.WLDataModel;
import com.ss.ugc.live.sdk.message.data.warlock.WLType;
import com.tiktok.ttm.action.TTMAppLog;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class AwS278S0300000_34 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS278S0300000_34 awS278S0300000_34) {
        JSONObject jSONObject;
        try {
            C2213641BkQ c2213641BkQ = (C2213641BkQ) awS278S0300000_34.l0;
            EnumC1910390zoT enumC1910390zoT = c2213641BkQ.LIZ;
            if (enumC1910390zoT == EnumC1910390zoT.CelResult) {
                if (!(c2213641BkQ.LIZIZ instanceof Map)) {
                    jSONObject = new JSONObject();
                    jSONObject.put("error_message", "result value is not map");
                } else {
                    jSONObject = new JSONObject((Map) ((C2213641BkQ) awS278S0300000_34.l0).LIZIZ);
                }
                JSONObject jSONObject2 = ((C2213691BkV) awS278S0300000_34.l1).LIZJ;
                if (jSONObject2 != null) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObject2.get(next));
                    }
                }
                jSONObject.put("strategy_key", ((C2213641BkQ) awS278S0300000_34.l0).LIZJ.LIZIZ);
                C2213691BkV c2213691BkV = (C2213691BkV) awS278S0300000_34.l1;
                Object[] objArr = ((C2213641BkQ) awS278S0300000_34.l0).LJ;
                c2213691BkV.getClass();
                jSONObject.put("match_events_name", C2213691BkV.LIZIZ(objArr));
                Iterator it2 = ((ArrayList) ((C2213641BkQ) awS278S0300000_34.l0).LIZJ.LJII).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC2213871Bkn abstractC2213871Bkn = (AbstractC2213871Bkn) it2.next();
                    if (abstractC2213871Bkn.LIZ == EnumC2213801Bkg.CAI_ACTION_TYPE_NATIVE_HARDCODE_CALLBACK) {
                        AbstractC830880Wic abstractC830880Wic = ((C2213681BkU) abstractC2213871Bkn).LIZIZ;
                        break;
                    }
                }
                TTMAppLog.sendAppLog(((C2213691BkV) awS278S0300000_34.l1).LIZIZ, jSONObject);
            } else if (enumC1910390zoT == EnumC1910390zoT.CepResult && Intrinsics.LJFF(c2213641BkQ.LIZIZ, Boolean.TRUE)) {
                JSONObject jSONObject3 = new JSONObject();
                C2213641BkQ c2213641BkQ2 = (C2213641BkQ) awS278S0300000_34.l0;
                C2213691BkV c2213691BkV2 = (C2213691BkV) awS278S0300000_34.l1;
                jSONObject3.put("strategy_key", c2213641BkQ2.LIZJ.LIZIZ);
                Object[] objArr2 = c2213641BkQ2.LJ;
                c2213691BkV2.getClass();
                jSONObject3.put("match_events_name", C2213691BkV.LIZIZ(objArr2));
                JSONObject jSONObject4 = ((C2213691BkV) awS278S0300000_34.l1).LIZJ;
                if (jSONObject4 != null) {
                    Iterator<String> itKeys2 = jSONObject4.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        jSONObject3.put(next2, jSONObject4.get(next2));
                    }
                }
                Iterator it3 = ((ArrayList) ((C2213641BkQ) awS278S0300000_34.l0).LIZJ.LJII).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    AbstractC2213871Bkn abstractC2213871Bkn2 = (AbstractC2213871Bkn) it3.next();
                    if (abstractC2213871Bkn2.LIZ == EnumC2213801Bkg.CAI_ACTION_TYPE_NATIVE_HARDCODE_CALLBACK) {
                        AbstractC830880Wic abstractC830880Wic2 = ((C2213681BkU) abstractC2213871Bkn2).LIZIZ;
                        break;
                    }
                }
                TTMAppLog.sendAppLog(((C2213691BkV) awS278S0300000_34.l1).LIZIZ, jSONObject3);
            } else if (((C2213641BkQ) awS278S0300000_34.l0).LIZ == EnumC1910390zoT.RunError) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("error_code", ((C2213641BkQ) awS278S0300000_34.l0).LIZIZ);
                TTMAppLog.sendAppLog(((C2213691BkV) awS278S0300000_34.l1).LIZIZ, jSONObject5);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS278S0300000_34 awS278S0300000_34) {
        C118300cf c118300cf = (C118300cf) awS278S0300000_34.l0;
        int i = c118300cf.element - 1;
        c118300cf.element = i;
        if (i <= 0) {
            ((CameraRenderImpl) awS278S0300000_34.l1).LJIJI((InterfaceC2247741CyK) awS278S0300000_34.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS278S0300000_34 awS278S0300000_34) {
        C2208181Bbc.LIZLLL((C2208181Bbc) awS278S0300000_34.l0, (CommentImageModel) awS278S0300000_34.l1, (InterfaceC2207911BbB) awS278S0300000_34.l2, -1L, "live photo image upload timeout", null, 48);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS278S0300000_34 awS278S0300000_34) {
        C2208181Bbc.LIZLLL((C2208181Bbc) awS278S0300000_34.l0, (CommentImageModel) awS278S0300000_34.l1, (InterfaceC2207911BbB) awS278S0300000_34.l2, -1L, "live photo video upload timeout", null, 48);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS278S0300000_34 awS278S0300000_34) {
        C2208181Bbc.LIZLLL((C2208181Bbc) awS278S0300000_34.l0, (CommentImageModel) awS278S0300000_34.l1, (InterfaceC2207911BbB) awS278S0300000_34.l2, -1L, "live photo image upload timeout", null, 48);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS278S0300000_34 awS278S0300000_34) {
        ((DownloadTask) awS278S0300000_34.l0).asyncDownload((InterfaceC2329409Au) awS278S0300000_34.l1);
        C2199721B7i c2199721B7i = (C2199721B7i) awS278S0300000_34.l2;
        Downloader downloaderCom_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance = Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(c2199721B7i.LIZ);
        C2199721B7i c2199721B7i2 = (C2199721B7i) awS278S0300000_34.l2;
        c2199721B7i.LIZIZ = downloaderCom_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance.getDownloadId(c2199721B7i2.LIZLLL, c2199721B7i2.LJ);
        C1B8Q c1b8qLIZ = C1B8O.LIZ();
        if (c1b8qLIZ != null) {
            C2199721B7i c2199721B7i3 = (C2199721B7i) awS278S0300000_34.l2;
            c1b8qLIZ.LIZ.put(c2199721B7i3.LIZIZ, c2199721B7i3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS278S0300000_34 awS278S0300000_34) {
        AbstractC1136060ffY abstractC1136060ffY = (AbstractC1136060ffY) ((C259800zU) awS278S0300000_34.l0).element;
        FullLinkTrack fullLinkTrack = new FullLinkTrack();
        ProtoApiResult protoApiResult = (ProtoApiResult) awS278S0300000_34.l1;
        ProtoApiResult.ProtoMessage protoMessage = (ProtoApiResult.ProtoMessage) awS278S0300000_34.l2;
        FullLinkTrack fullLinkTrack2 = protoApiResult.fullLinkTrack;
        if (fullLinkTrack2 != null) {
            fullLinkTrack.getNodes().addAll(fullLinkTrack2.getNodes());
        }
        List<BaseNode> nodes = fullLinkTrack.getNodes();
        DecodeNode decodeNode = new DecodeNode(NodeStatus.SUCCESS);
        decodeNode.setDetail(GsonProtectorUtils.toJson(C20340414iQ.LIZ(), protoMessage));
        nodes.add(decodeNode);
        abstractC1136060ffY.fullLinkTrack = fullLinkTrack;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS278S0300000_34 awS278S0300000_34) {
        String strJsonString;
        WLDataModel wLDataModel = new WLDataModel();
        ProtoApiResult.ProtoMessage protoMessage = (ProtoApiResult.ProtoMessage) awS278S0300000_34.l0;
        Throwable th = (Throwable) awS278S0300000_34.l1;
        ProtoApiResult protoApiResult = (ProtoApiResult) awS278S0300000_34.l2;
        wLDataModel.setType(WLType.COMMON);
        wLDataModel.setSubType("im_full_link");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[decode-fail] ");
        sbLIZ.append(protoMessage.method);
        sbLIZ.append(" : exception ");
        sbLIZ.append(th.getMessage());
        wLDataModel.setName(C2188811AlT.LIZIZ(sbLIZ));
        FullLinkTrack fullLinkTrack = protoApiResult.fullLinkTrack;
        if (fullLinkTrack != null) {
            List<BaseNode> nodes = fullLinkTrack.getNodes();
            DecodeNode decodeNode = new DecodeNode(NodeStatus.ERROR);
            decodeNode.setDetail(GsonProtectorUtils.toJson(C20340414iQ.LIZ(), protoMessage));
            nodes.add(decodeNode);
            strJsonString = fullLinkTrack.jsonString();
        } else {
            strJsonString = null;
        }
        wLDataModel.setResult(strJsonString);
        return wLDataModel;
    }

    public static final Object invoke$5(AwS278S0300000_34 awS278S0300000_34) {
        C2191401Ape c2191401Ape = (C2191401Ape) awS278S0300000_34.l0;
        Map map = (Map) awS278S0300000_34.l1;
        n nVar = (n) awS278S0300000_34.l2;
        c2191401Ape.getClass();
        return C2191401Ape.LIZLLL(map, nVar);
    }

    public static final Object invoke$6(AwS278S0300000_34 awS278S0300000_34) {
        boolean z;
        int length;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WRAP_REQINFO_READY fromStream=");
        sbLIZ.append(System.identityHashCode((C1515820pY4) awS278S0300000_34.l0));
        sbLIZ.append(" wrappedStream=");
        sbLIZ.append(System.identityHashCode((C1515820pY4) awS278S0300000_34.l1));
        sbLIZ.append(" reqInfoNull=");
        boolean z2 = true;
        if (((C1494600ozq) awS278S0300000_34.l2) == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" urlPresent=");
        C1494600ozq c1494600ozq = (C1494600ozq) awS278S0300000_34.l2;
        if (c1494600ozq == null || c1494600ozq.LJIIZILJ == null) {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(" reqLogLen=");
        C1494600ozq c1494600ozq2 = (C1494600ozq) awS278S0300000_34.l2;
        if (c1494600ozq2 != null && (str = c1494600ozq2.LJJIIJ) != null) {
            length = str.length();
        } else {
            length = -1;
        }
        sbLIZ.append(length);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS278S0300000_34 awS278S0300000_34) {
        C2191401Ape c2191401Ape = (C2191401Ape) awS278S0300000_34.l0;
        Map map = (Map) awS278S0300000_34.l1;
        n nVar = (n) awS278S0300000_34.l2;
        c2191401Ape.getClass();
        return C2191401Ape.LIZLLL(map, nVar);
    }

    public static final Object invoke$8(AwS278S0300000_34 awS278S0300000_34) {
        boolean z;
        int length;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WRAP_REQINFO_READY fromStream=");
        sbLIZ.append(System.identityHashCode((C1515820pY4) awS278S0300000_34.l0));
        sbLIZ.append(" wrappedStream=");
        sbLIZ.append(System.identityHashCode((C1515820pY4) awS278S0300000_34.l1));
        sbLIZ.append(" reqInfoNull=");
        boolean z2 = true;
        if (((C1494600ozq) awS278S0300000_34.l2) == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" urlPresent=");
        C1494600ozq c1494600ozq = (C1494600ozq) awS278S0300000_34.l2;
        if (c1494600ozq == null || c1494600ozq.LJIIZILJ == null) {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(" reqLogLen=");
        C1494600ozq c1494600ozq2 = (C1494600ozq) awS278S0300000_34.l2;
        if (c1494600ozq2 != null && (str = c1494600ozq2.LJJIIJ) != null) {
            length = str.length();
        } else {
            length = -1;
        }
        sbLIZ.append(length);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS278S0300000_34 awS278S0300000_34) {
        DspMusicListResponse dspMusicListResponse;
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchMusic error: ");
        Throwable th = (Throwable) awS278S0300000_34.l0;
        String message2 = null;
        if (th != null) {
            message2 = th.getMessage();
        }
        sbLIZ.append(message2);
        C1720106oR.LIZ("OpenLinkShareMainActivity", C2188811AlT.LIZIZ(sbLIZ));
        Throwable th2 = (Throwable) awS278S0300000_34.l0;
        if ((th2 == null || (message = th2.getMessage()) == null) && ((dspMusicListResponse = (DspMusicListResponse) awS278S0300000_34.l1) == null || (message = dspMusicListResponse.message) == null)) {
            message = "Unknown error";
        }
        ((OpenLinkShareMainActivity) awS278S0300000_34.l2).LLLLZI(new C1B4F(-1, -1, message));
        ((OpenLinkShareMainActivity) awS278S0300000_34.l2).close();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS278S0300000_34(C118300cf c118300cf, CameraRenderImpl cameraRenderImpl, InterfaceC2247741CyK interfaceC2247741CyK, int i) {
        super(0);
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = cameraRenderImpl;
        this.l2 = interfaceC2247741CyK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS278S0300000_34(C259800zU c259800zU, C259800zU<AbstractC1136060ffY> c259800zU2, ProtoApiResult protoApiResult, ProtoApiResult.ProtoMessage protoMessage) {
        super(0);
        this.$t = protoMessage;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = protoApiResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS278S0300000_34(C1515820pY4 c1515820pY4, C1515820pY4<Object> c1515820pY42, C1515820pY4<Object> c1515820pY43, C1494600ozq c1494600ozq) {
        super(0);
        this.$t = c1494600ozq;
        this.l0 = c1515820pY4;
        this.l1 = c1515820pY42;
        this.l2 = c1515820pY43;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS278S0300000_34(C2213641BkQ c2213641BkQ, C2213691BkV c2213691BkV, C830870Wib c830870Wib, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2213641BkQ;
        this.l1 = c2213691BkV;
        this.l2 = c830870Wib;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS278S0300000_34(n nVar, C2191401Ape c2191401Ape, Map map, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2191401Ape;
        this.l1 = map;
        this.l2 = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS278S0300000_34(DownloadTask downloadTask, InterfaceC2329409Au interfaceC2329409Au, C2199721B7i c2199721B7i, int i) {
        super(0);
        this.$t = i;
        this.l0 = downloadTask;
        this.l1 = interfaceC2329409Au;
        this.l2 = c2199721B7i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS278S0300000_34(CommentImageModel commentImageModel, C2208181Bbc c2208181Bbc, InterfaceC2207911BbB interfaceC2207911BbB, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2208181Bbc;
        this.l1 = commentImageModel;
        this.l2 = interfaceC2207911BbB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS278S0300000_34(ProtoApiResult.ProtoMessage protoMessage, Throwable th, ProtoApiResult protoApiResult, int i) {
        super(0);
        this.$t = i;
        this.l0 = protoMessage;
        this.l1 = th;
        this.l2 = protoApiResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS278S0300000_34(Throwable th, DspMusicListResponse dspMusicListResponse, OpenLinkShareMainActivity openLinkShareMainActivity, int i) {
        super(0);
        this.$t = i;
        this.l0 = th;
        this.l1 = dspMusicListResponse;
        this.l2 = openLinkShareMainActivity;
    }
}
