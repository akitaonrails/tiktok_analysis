package com.ss.android.ugc.gamora.recorder.sticker.aigc;

import X.C01GW;
import X.C01S9;
import X.C05YC;
import X.C05YF;
import X.C09AE;
import X.C0C64;
import X.C0LY4;
import X.C0LY6;
import X.C0LY8;
import X.C0LYE;
import X.C0LYJ;
import X.C0LYQ;
import X.C0LYR;
import X.C0LYX;
import X.C0LYY;
import X.C0LYZ;
import X.C0LZ1;
import X.C0LZ2;
import X.C0LZ3;
import X.C0LZ4;
import X.C0LZ5;
import X.C0LZB;
import X.C0MGL;
import X.C0MUK;
import X.C0MZV;
import X.C0PEM;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C1660680tJi;
import X.C1664770tQJ;
import X.C19A3;
import X.C1DRG;
import X.C2217381BqS;
import X.C23250099c;
import X.C375830EoP;
import X.C452501pT;
import X.C537520L6g;
import X.C539900LFk;
import X.C544740LYa;
import X.C544760LYc;
import X.C544840LYk;
import X.C544850LYl;
import X.C544870LYn;
import X.C578910MnB;
import X.EnumC544880LYo;
import X.InterfaceC1647420syK;
import X.InterfaceC1648570t0B;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.InterfaceC560310LyH;
import X.InterfaceC579060MnQ;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import ge.i;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import mn3.e0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCGenerationComponent extends i<InterfaceC560310LyH, a1, C544870LYn, C544740LYa> implements InterfaceC560310LyH, InterfaceC379610EuV {
    public static final C0LZ1 LLJLILLLLZIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public static final int LLJLLIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public C09AE LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final Function0<C544870LYn> LLJJL;
    public final Function0<C544740LYa> LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0LZ1] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AIGCGenerationComponent.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(AIGCGenerationComponent.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(AIGCGenerationComponent.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C2217381BqS(AIGCGenerationComponent.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(AIGCGenerationComponent.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0), new C2217381BqS(AIGCGenerationComponent.class, "recordApiComponent", "getRecordApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordApiComponent;", 0), new C2217381BqS(AIGCGenerationComponent.class, "recordExitApi", "getRecordExitApi()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0)};
        LLJLILLLLZIIL = new Object() { // from class: X.0LZ1
        };
        LLJLLIL = 8;
    }

    public InterfaceC560310LyH P4() {
        return this;
    }

    @Override // X.InterfaceC560310LyH
    public C01S9<Object> Fc() {
        return (C01S9) this.LLJLIL.getValue();
    }

    public final C0LZB K4() {
        return (C0LZB) this.LLJJJIL.getValue();
    }

    public final C578910MnB O4() {
        return (C578910MnB) this.LLJJJJLIIL.getValue();
    }

    public final InterfaceC579060MnQ T4() {
        return (InterfaceC579060MnQ) this.LLJJIJIL.getValue(this, LLJLL[5]);
    }

    public final C0MGL Z4() {
        return (C0MGL) this.LLJJJ.getValue(this, LLJLL[6]);
    }

    public final AIGCOfflineProcessingViewModel d5() {
        return (AIGCOfflineProcessingViewModel) this.LLJJJJ.getValue();
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLJJIII.getValue(this, LLJLL[2]);
    }

    public final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJJIJIIJIL.getValue(this, LLJLL[4]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLJJIJI.getValue(this, LLJLL[3]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJJI.getValue(this, LLJLL[1]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLJJ.getValue(this, LLJLL[0]);
    }

    public final C05YC<Object> k5() {
        return (C05YC) this.LLJL.getValue();
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        k5().LIZJ(C0LZ4.LIZ);
        super.hide();
        k5().LIZJ(C0LZ2.LIZ);
    }

    @Override // X.InterfaceC560310LyH
    public boolean onBackPressed() {
        C375830EoP<Boolean> c375830EoP;
        if (!isShowing()) {
            return false;
        }
        C375830EoP<Boolean> c375830EoP2 = T2().LIZLLL;
        if (c375830EoP2 != null && c375830EoP2.LIZ.booleanValue()) {
            d5().AQ2(C0LYY.LIZ);
            return true;
        }
        C375830EoP<String> c375830EoP3 = T2().LIZIZ;
        if (Intrinsics.LJFF(c375830EoP3 != null ? c375830EoP3.LIZ : null, "FAILED") || !((c375830EoP = T2().LJIIJJI) == null || c375830EoP.LIZ.booleanValue())) {
            d5().AQ2(C0LYZ.LIZ);
            return true;
        }
        if (!T2().LJIILJJIL) {
            i3(AFwS239S0000000_8.get$arr$(222));
            return true;
        }
        i3(AFwS239S0000000_8.get$arr$(221));
        d5().AQ2(new C0LYE(getShortVideoContext(), EnumC544880LYo.EXIT_BUTTON.getType()));
        return true;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "remove_aigc_offline_handler_on_destroy", true, true)) {
            this.LLJILJILJ.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationComponent.onCreate.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    q stickerApiComponent;
                    if (event == Lifecycle.Event.ON_START) {
                        q stickerApiComponent2 = AIGCGenerationComponent.this.getStickerApiComponent();
                        if (stickerApiComponent2 != null) {
                            stickerApiComponent2.vY(AIGCGenerationComponent.this.O4());
                            return;
                        }
                        return;
                    }
                    if (event != Lifecycle.Event.ON_STOP || (stickerApiComponent = AIGCGenerationComponent.this.getStickerApiComponent()) == null) {
                        return;
                    }
                    stickerApiComponent.sb(AIGCGenerationComponent.this.O4());
                }
            });
        } else {
            q stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null) {
                stickerApiComponent.vY(O4());
            }
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C544850LYl(this, null), 3);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C0LYR(this, null), 3);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C0LYQ(this, null), 3);
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        d5().AQ2(C0LYX.LIZ);
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        d5().AQ2(C544760LYc.LIZ);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        k5().LIZJ(C0LZ5.LIZ);
        super.show();
        k5().LIZJ(C0LZ3.LIZ);
    }

    @Override // X.InterfaceC560310LyH
    public C01S9<Pair<Boolean, Boolean>> yh1() {
        return d5().LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        P4();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C544870LYn> o2() {
        return this.LLJJL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C544740LYa> w2() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    private final String t5(String str) {
        String str2;
        String strOptString;
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("downloadResults");
            str2 = null;
            if (jSONArrayOptJSONArray != null) {
                boolean z = false;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("localFilePath", "")) != null) {
                    if (strOptString.length() > 0) {
                        z = true;
                    }
                    if (z) {
                        str2 = strOptString;
                    }
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    @Override // X.InterfaceC560310LyH
    public void CE2(C0MZV c0mzv) {
        O4().LJJIJLIJ(c0mzv);
    }

    @Override // X.InterfaceC560310LyH
    public void hK1(AIGCOfflineModel aIGCOfflineModel) {
        d5().AQ2(new C0LYJ(aIGCOfflineModel));
    }

    public AIGCGenerationComponent(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), e0.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC579060MnQ.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), C0MGL.class, null);
        this.LLJJJIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(317));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 774));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 770));
        this.LLJJL = AFwS194S0000000_8.get$arr$(318);
        this.LLJJLIIIJLLLLLLLZ = new AwS552S0100000_8(this, 773);
        this.LLJL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(316));
        this.LLJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 771));
    }

    private final Intent F4(String str, String str2) {
        String strT5 = t5(str);
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (shortVideoContext != null) {
            Intent intent = new Intent();
            C537520L6g.LIZLLL(intent, shortVideoContext.creativeInfo);
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            C0MUK.LJIIIZ(intent, CreativeModel.LIZIZ(creativeModel, null, null, null, AIGCOfflineModel.LIZ(creativeModel.aigcOfflineModel, false, false, true, null, null, null, null, 0, 0, null, null, null, null, null, null, str2, false, false, null, false, null, -5, 262142), -1, -1, -1, 2097023));
            intent.putExtra("shoot_way", shortVideoContext.shootWay);
            intent.putExtra("enter_from", "ai_generate_page");
            intent.putExtra("file_path", strT5);
            intent.putExtra("workspace", shortVideoContext.cameraComponentModel.mWorkspace);
            return intent;
        }
        return null;
    }

    public final boolean H4(C0LY8 c0ly8, boolean z) {
        if (Intrinsics.LJFF(c0ly8.LIZJ, "FAILED")) {
            return true;
        }
        if (C13LP.LJJJJ(c0ly8.LJIIL, C13LQ.LJLIIL(new String[]{"POST_PROCESSING", "DOWNLOAD"}))) {
            return false;
        }
        return !z;
    }

    public final void n5(String str, String str2) {
        ShortVideoContext shortVideoContext;
        String strT5 = t5(str);
        AIGCOfflineModel aIGCOfflineModel = ((C0LY8) d5().LLJJIJIL.getValue()).LJIIJJI;
        if (aIGCOfflineModel != null && aIGCOfflineModel.isAttachCountdownEffect && (shortVideoContext = getShortVideoContext()) != null && C539900LFk.LJFF(shortVideoContext)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C544840LYk(strT5, this, str2, null), 2);
            return;
        }
        Intent intentF4 = F4(str, str2);
        if (intentF4 == null) {
            return;
        }
        C1660680tJi.LIZ().LJIJ(this.LLJILJILJ.requireSceneContext(), intentF4, new AwS552S0100000_8(this, 772));
    }

    @Override // X.InterfaceC560310LyH
    public void XM2(AIGCOfflineModel aIGCOfflineModel, CreativeInfo creativeInfo, boolean z) {
        CreativeInfo creativeInfo2;
        long j;
        AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModelD5 = d5();
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (shortVideoContext != null) {
            creativeInfo2 = shortVideoContext.creativeInfo;
        } else {
            creativeInfo2 = null;
        }
        if (z) {
            j = 15000;
        } else {
            j = 0;
        }
        aIGCOfflineProcessingViewModelD5.AQ2(new C0LY4(aIGCOfflineModel, creativeInfo2, this, j, z));
    }

    @Override // X.InterfaceC560310LyH
    public void In2(String str, long j, AIGCOfflineModel aIGCOfflineModel, CreativeInfo creativeInfo) {
        d5().AQ2(new C0LY6(str, j, aIGCOfflineModel, creativeInfo, this));
    }
}
