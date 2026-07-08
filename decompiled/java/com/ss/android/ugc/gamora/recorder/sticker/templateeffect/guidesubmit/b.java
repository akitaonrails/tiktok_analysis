package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.guidesubmit;

import X.AbstractC23051091l;
import X.C01GW;
import X.C05YF;
import X.C094000Xa;
import X.C13LE;
import X.C13LP;
import X.C1415090mvb;
import X.C1419760n38;
import X.C1448890no7;
import X.C1448900no8;
import X.C1664770tQJ;
import X.C19A3;
import X.C1DRG;
import X.C201955140j;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C342540Dbo;
import X.C452501pT;
import X.C991050btf;
import X.InterfaceC1448860no4;
import X.InterfaceC1625000sOA;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import Y.AObserverS225S0100000_22;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import ge.i;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class b extends i<InterfaceC1448860no4, h, C1415090mvb, C1448890no7> implements InterfaceC1448860no4, InterfaceC379610EuV {
    public static final C1448900no8 LLJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final int LLJJJJ;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final C01GW LLJJI;
    public final MutableLiveData<C991050btf> LLJJIII;
    public Map<String, Boolean> LLJJIJI;
    public final InterfaceC1448860no4 LLJJIJIIJIL;
    public final LiveData<C991050btf> LLJJIJIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0no8] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};
        LLJJJ = new Object() { // from class: X.0no8
        };
        LLJJJJ = 8;
    }

    private final Keva H4() {
        return (Keva) this.LLJJI.getValue();
    }

    private final InterfaceC1625000sOA nq() {
        return (InterfaceC1625000sOA) this.LLJILLL.getValue(this, LLJJJIL[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJJ.getValue(this, LLJJJIL[1]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1415090mvb> o2() {
        return new AwS566S0100000_22(this, 800);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1448890no7> w2() {
        return AFwS210S0000000_22.get$arr$(281);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C094000Xa c094000XaLIZJ = nq().C0().getStickerRepository().LIZ().LIZJ();
        c094000XaLIZJ.LIZLLL(AFwS261S0000000_22.get$arr$(240));
        c094000XaLIZJ.LIZ(new AbstractC23051091l() { // from class: X.0no5
            @Override // X.AbstractC23051091l
            public final boolean LIZ(Effect effect, String str) {
                return C342540Dbo.LIZIZ(effect);
            }
        });
        c094000XaLIZJ.LIZIZ();
        nq().C0().LJII().LJIJJLI().observe(this, new AObserverS225S0100000_22(this, 144));
    }

    public InterfaceC1448860no4 F4() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1448860no4
    public LiveData<C991050btf> QR1() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    public final void K4(Effect effect) {
        StringBuilder sb = new StringBuilder("onEffectChanged(), ");
        if (effect != null && C342540Dbo.LIZIZ(effect)) {
            String str = (String) C13LP.LJJJLL(effect.getIconUrl().getUrlList());
            if (str != null && str.length() != 0) {
                int i = H4().getInt("key_submit_times", 0);
                Boolean bool = this.LLJJIJI.get(effect.getEffectId());
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
                if (bool.booleanValue()) {
                    sb.append("early return because had shown before.");
                } else {
                    H4().storeInt("key_submit_times", i + 1);
                    this.LLJJIJI.put(effect.getEffectId(), Boolean.TRUE);
                    C1419760n38 c1419760n38 = new C1419760n38(effect.getEffectId(), str);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sheetData = ");
                    sbLIZ.append(c1419760n38);
                    sbLIZ.append(", ");
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                    i3(new AwS601S0100000_22(c1419760n38, 620));
                }
            }
        } else {
            sb.append("early return because effect, ");
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("effect = ");
        sbLIZ2.append(effect);
        sbLIZ2.append(", ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        C201955140j.LIZIZ("MobileEffectGuideSubmitComponent", sb.toString());
    }

    @Override // X.InterfaceC1448860no4
    public void ZV1(C991050btf c991050btf) {
        this.LLJJIII.setValue(c991050btf);
    }

    public b(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1625000sOA.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(280));
        MutableLiveData<C991050btf> mutableLiveData = new MutableLiveData<>();
        this.LLJJIII = mutableLiveData;
        this.LLJJIJI = new LinkedHashMap();
        this.LLJJIJIIJIL = this;
        this.LLJJIJIL = mutableLiveData;
    }
}
