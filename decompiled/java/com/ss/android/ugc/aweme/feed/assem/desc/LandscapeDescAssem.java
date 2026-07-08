package com.ss.android.ugc.aweme.feed.assem.desc;

import X.C01GW;
import X.C0SIL;
import X.C0SIV;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C487280J9a;
import X.C717590SCv;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC487330J9f;
import Y.ACListenerS146S0100000_11;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class LandscapeDescAssem extends FeedBaseAssem<LandscapeDescAssem> implements InterfaceC487330J9f {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public C0SIV LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public C0SIL LLJLLL;
    public final int LLJZ;
    public final int LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LandscapeDescAssem.class, "videoDescVM", "getVideoDescVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/LandscapeVideoDescVM;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LandscapeDescAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LandscapeVideoDescVM.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 220), null, AFwS243S0000000_11.get$arr$(61));
        this.LLJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(62));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 218));
        this.LLJLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 219));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 217));
        this.LLJZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLJZIJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.d0f;
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
    }

    public final TuxTextView tp() {
        return (TuxTextView) this.LLJLILLLLZIIL.getValue();
    }

    public final LandscapeVideoDescVM up() {
        return (LandscapeVideoDescVM) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLL[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem, X.InterfaceC712990Rxx
    public final void wr() {
        C717590SCv c717590SCv = up().LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LandscapeVideoDescVM.LLJ;
        c717590SCv.LIZIZ(null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C0SIL c0sil = new C0SIL(up(), tp(), getContext());
        this.LLJLLL = c0sil;
        c0sil.LIZ(view);
        C0SIL c0sil2 = this.LLJLLL;
        if (c0sil2 != null) {
            c0sil2.LIZJ();
        }
        up().getClass();
        C786410Ut5.h9(tp(), new ACListenerS146S0100000_11(this, 9));
        if (((Boolean) up().LLILLJJLI.getValue()).booleanValue()) {
            tp().setTuxFont(82);
        }
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.0SD7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SD8) obj).LL;
            }
        }, C736820SvI.LIZJ(), AFwS294S0000000_11.get$arr$(233), 4);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.0SD9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SD8) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZJ(), AFwS294S0000000_11.get$arr$(234), 4);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C487280J9a.LIZ(c19egLIZ.hashCode(), this);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem
    /* JADX INFO: renamed from: sp */
    public final void vr(VideoItemParams videoItemParams) {
        LandscapeVideoDescVM landscapeVideoDescVMUp = up();
        Context context = getContext();
        C717590SCv c717590SCv = landscapeVideoDescVMUp.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LandscapeVideoDescVM.LLJ;
        c717590SCv.LIZIZ(context);
        this.LLJLIL = videoItemParams.videoCellDescAbility;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(VideoItemParams videoItemParams) {
        vr(videoItemParams);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(VideoItemParams videoItemParams) {
    }
}
