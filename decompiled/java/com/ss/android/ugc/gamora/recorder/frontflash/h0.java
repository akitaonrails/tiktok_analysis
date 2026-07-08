package com.ss.android.ugc.gamora.recorder.frontflash;

import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C1646690sx9;
import X.C1647860sz2;
import X.C1664770tQJ;
import X.C19A3;
import X.C19EG;
import X.C1DRG;
import X.C21592619eu;
import X.C2217381BqS;
import X.C363500EMy;
import X.C385670FAf;
import X.C452501pT;
import X.EnumC1159880gHy;
import X.InterfaceC1635700sfQ;
import X.InterfaceC1647420syK;
import X.InterfaceC1648020szI;
import X.InterfaceC1651180t4O;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC561050LzT;
import X.InterfaceC578600Mmg;
import Y.AObjectS246S0100000_25;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class h0 extends C1647860sz2 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public static final int LLLIIIL;
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final InterfaceC1731706qJ LLLFFI;
    public final InterfaceC1731706qJ LLLFZ;
    public final InterfaceC1731706qJ LLLI;
    public final InterfaceC1731706qJ LLLII;
    public final C01GW LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(h0.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(h0.class, "duetApi", "getDuetApi()Lcom/ss/android/ugc/aweme/shortvideo/duet/DuetLayoutApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(h0.class, "ugcTemplatePreviewApi", "getUgcTemplatePreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/ugctemplate/UgcTemplatePreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(h0.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(h0.class, "countDownApi", "getCountDownApi()Lcom/ss/android/ugc/aweme/shortvideo/countdown/CountDownApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(h0.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLLIIIL = 8;
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLLF.getValue(this, LLLIIIIL[0]);
    }

    private final InterfaceC578600Mmg T6() {
        return (InterfaceC578600Mmg) this.LLLI.getValue(this, LLLIIIIL[4]);
    }

    private final InterfaceC1651180t4O W6() {
        return (InterfaceC1651180t4O) this.LLLFF.getValue(this, LLLIIIIL[1]);
    }

    private final FrameLayout.LayoutParams d7() {
        return (FrameLayout.LayoutParams) this.LLLIIII.getValue();
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLLFZ.getValue(this, LLLIIIIL[3]);
    }

    private final InterfaceC561050LzT k7() {
        return (InterfaceC561050LzT) this.LLLFFI.getValue(this, LLLIIIIL[2]);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLLII.getValue(this, LLLIIIIL[5]);
    }

    @Override // X.C1647860sz2
    public boolean n5() {
        return C1646690sx9.LIZIZ.contains(Op().getCurrentBottomTag());
    }

    @Override // X.C1647860sz2
    public boolean M5() {
        LiveData<EnumC1159880gHy> liveDataP4;
        InterfaceC578600Mmg interfaceC578600MmgT6 = T6();
        EnumC1159880gHy value = (interfaceC578600MmgT6 == null || (liveDataP4 = interfaceC578600MmgT6.p4()) == null) ? null : liveDataP4.getValue();
        return super.M5() || value == EnumC1159880gHy.PRE_SHOW || value == EnumC1159880gHy.SHOWN;
    }

    @Override // X.C1647860sz2
    public void S5() {
        super.S5();
        int i = getShortVideoContext().shootMode;
        if (i == 20 || i == 15 || i == 23 || i == 29 || ag1() == 0) {
            return;
        }
        i3(AFwS266S0000000_25.get$arr$(286));
    }

    @Override // X.C1647860sz2
    public void U5() {
        Op().setBottomSelectedTextColor(R.attr.a1h, R.attr.a1j);
        Op().updateBottomDotRes(R.drawable.d1f);
    }

    @Override // X.C1647860sz2
    public void d6() {
        if (Op().isBottomTabThemeDarkMode()) {
            Op().setBottomSelectedTextColor(R.attr.ee, R.attr.eh);
        }
        Op().updateBottomDotRes(R.drawable.d1e);
    }

    @Override // X.C1647860sz2, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Boolean> liveEventZC;
        C385670FAf<Integer> c385670FAfKd1;
        super.onCreate();
        getRecordAdapterApi().hO2(this);
        Op().getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 445));
        InterfaceC1651180t4O interfaceC1651180t4OW6 = W6();
        if (interfaceC1651180t4OW6 != null && (c385670FAfKd1 = interfaceC1651180t4OW6.Kd1()) != null) {
            c385670FAfKd1.LIZ(this, new AObjectS246S0100000_25(this, 446));
        }
        InterfaceC561050LzT interfaceC561050LzTK7 = k7();
        if (interfaceC561050LzTK7 != null && (liveEventZC = interfaceC561050LzTK7.ZC()) != null) {
            liveEventZC.LIZ(this, new AObjectS246S0100000_25(this, 447));
        }
        if (getDiContainer().LIZJ(InterfaceC1635700sfQ.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1635700sfQ.class, new AwS604S0100000_25(this, 358));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        C363500EMy.LIZ.getClass();
        int i = this.LLJLIL;
        if (i != 0) {
            qh(i);
        }
    }

    @Override // X.C1647860sz2
    public C21592619eu v5(boolean z) {
        if (d4.LJJIII(getShortVideoContext())) {
            return new C21592619eu(d7().width, d7().height, d7().topMargin);
        }
        return super.v5(z);
    }

    public h0(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLLF = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
        this.LLLFF = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1651180t4O.class, null);
        this.LLLFFI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC561050LzT.class, null);
        this.LLLFZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.LLLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC578600Mmg.class, null);
        this.LLLII = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLLIIII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 574));
    }
}
